package org.telegram.ui.Stories.recorder;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPagePreview;
import org.telegram.tgnet.TLRPC$TL_webPagePending;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public class StoryLinkSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private UniversalAdapter adapter;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private boolean captionAbove;
    private boolean ignoreUrlEdit;
    private boolean loading;
    private EditTextCell nameEditText;
    private boolean nameOpen;
    private boolean photoLarge;
    private int reqId;
    private final Runnable requestPreview;
    private EditTextCell urlEditText;
    private Pattern urlPattern;
    private TLRPC$WebPage webpage;
    private long webpageId;
    private Utilities.Callback<LinkPreview.WebPagePreview> whenDone;

    public StoryLinkSheet(final Context context, Theme.ResourcesProvider resourcesProvider, final PreviewView previewView, Utilities.Callback<LinkPreview.WebPagePreview> callback) {
        super(context, null, true, false, false, true, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.requestPreview = new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.lambda$new$7();
            }
        };
        this.whenDone = callback;
        fixNavigationBar();
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-15.0f);
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, -1, resourcesProvider);
        this.urlEditText = editTextCell;
        editTextCell.whenHitEnter(new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.processDone();
            }
        });
        this.urlEditText.editText.setHandlesColor(-12476440);
        this.urlEditText.editText.setCursorColor(-11230757);
        final String str = "https://";
        this.urlEditText.editText.setText("https://");
        this.urlEditText.editText.setSelection(8);
        final TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Paste));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhiteBlueText2);
        textView.setTextColor(themedColor);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(themedColor, 0.12f), Theme.multAlpha(themedColor, 0.15f)));
        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
        this.urlEditText.addView(textView, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.lambda$new$0(str, textView);
            }
        };
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryLinkSheet.this.lambda$new$1(runnable, view);
            }
        });
        runnable.run();
        this.urlEditText.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                runnable.run();
                if (StoryLinkSheet.this.ignoreUrlEdit) {
                    return;
                }
                StoryLinkSheet.this.checkEditURL(editable == null ? null : editable.toString());
            }
        });
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, -1, resourcesProvider);
        this.nameEditText = editTextCell2;
        editTextCell2.whenHitEnter(new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.processDone();
            }
        });
        this.buttonContainer = new FrameLayout(context);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoryLinkAdd), false);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryLinkSheet.this.lambda$new$2(view);
            }
        });
        this.button.setEnabled(containsURL(this.urlEditText.getText().toString()));
        this.buttonContainer.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.topPadding = 0.2f;
        this.takeTranslationIntoAccount = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                ((BottomSheet) StoryLinkSheet.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, 0);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                StoryLinkSheet.this.lambda$new$4(context, previewView, view, i2);
            }
        });
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
    }

    public void lambda$new$0(String str, TextView textView) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        boolean z = (TextUtils.isEmpty(this.urlEditText.editText.getText()) || TextUtils.equals(this.urlEditText.editText.getText(), str) || TextUtils.isEmpty(this.urlEditText.editText.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
        textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(300L).start();
    }

    public void lambda$new$1(Runnable runnable, View view) {
        CharSequence charSequence;
        try {
            charSequence = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(getContext());
        } catch (Exception e) {
            FileLog.e(e);
            charSequence = null;
        }
        if (charSequence != null) {
            this.urlEditText.editText.setText(charSequence.toString());
            EditTextBoldCursor editTextBoldCursor = this.urlEditText.editText;
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }
        runnable.run();
    }

    public void lambda$new$2(View view) {
        processDone();
    }

    public void lambda$new$4(Context context, PreviewView previewView, View view, int i) {
        TLRPC$WebPage tLRPC$WebPage;
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        if (item.instanceOf(WebpagePreviewView.Factory.class) && (tLRPC$WebPage = this.webpage) != null && !isPreviewEmpty(tLRPC$WebPage)) {
            StoryLinkPreviewDialog storyLinkPreviewDialog = new StoryLinkPreviewDialog(context, this.currentAccount);
            LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
            webPagePreview.url = this.urlEditText.editText.getText().toString();
            webPagePreview.name = this.nameOpen ? this.nameEditText.editText.getText().toString() : null;
            webPagePreview.webpage = this.webpage;
            webPagePreview.largePhoto = this.photoLarge;
            webPagePreview.captionAbove = this.captionAbove;
            storyLinkPreviewDialog.set(webPagePreview, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StoryLinkSheet.this.lambda$new$3((LinkPreview.WebPagePreview) obj);
                }
            });
            storyLinkPreviewDialog.setStoryPreviewView(previewView);
            storyLinkPreviewDialog.show();
            return;
        }
        if (item.id == 2 && (view instanceof TextCheckCell)) {
            boolean z = !this.nameOpen;
            this.nameOpen = z;
            ((TextCheckCell) view).setChecked(z);
            this.adapter.update(true);
            if (this.nameOpen) {
                this.nameEditText.requestFocus();
            } else {
                this.urlEditText.requestFocus();
            }
        }
    }

    public void lambda$new$3(LinkPreview.WebPagePreview webPagePreview) {
        if (webPagePreview == null) {
            closePreview(null);
        } else {
            this.photoLarge = webPagePreview.largePhoto;
            this.captionAbove = webPagePreview.captionAbove;
        }
    }

    public void processDone() {
        if (this.button.isEnabled()) {
            if (this.whenDone != null) {
                LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
                webPagePreview.url = this.urlEditText.editText.getText().toString();
                webPagePreview.name = this.nameOpen ? this.nameEditText.editText.getText().toString() : null;
                webPagePreview.webpage = this.webpage;
                webPagePreview.largePhoto = this.photoLarge;
                webPagePreview.captionAbove = this.captionAbove;
                this.whenDone.run(webPagePreview);
                this.whenDone = null;
            }
            dismiss();
        }
    }

    public void set(LinkPreview.WebPagePreview webPagePreview) {
        this.ignoreUrlEdit = true;
        if (webPagePreview != null) {
            this.webpage = webPagePreview.webpage;
            this.loading = false;
            this.urlEditText.setText(webPagePreview.url);
            this.nameEditText.setText(webPagePreview.name);
            this.nameOpen = true ^ TextUtils.isEmpty(webPagePreview.name);
            this.captionAbove = webPagePreview.captionAbove;
            this.photoLarge = webPagePreview.largePhoto;
        } else {
            this.urlEditText.setText("");
            this.nameEditText.setText("");
            this.captionAbove = true;
            this.photoLarge = false;
        }
        this.button.setText(LocaleController.getString(R.string.StoryLinkEdit), false);
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
        this.button.setEnabled(containsURL(this.urlEditText.getText().toString()));
        this.ignoreUrlEdit = false;
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this, this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StoryLinkSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider) {
            @Override
            public int getThemedColor(int i) {
                if (i == Theme.key_dialogBackgroundGray) {
                    return -15921907;
                }
                return super.getThemedColor(i);
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didReceivedWebpagesInUpdates && this.webpageId == 0) {
            LongSparseArray longSparseArray = (LongSparseArray) objArr[0];
            for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                TLRPC$WebPage tLRPC$WebPage = (TLRPC$WebPage) longSparseArray.valueAt(i3);
                if (tLRPC$WebPage != null && this.webpageId == tLRPC$WebPage.id) {
                    if (isPreviewEmpty(tLRPC$WebPage)) {
                        tLRPC$WebPage = null;
                    }
                    this.webpage = tLRPC$WebPage;
                    this.loading = false;
                    this.webpageId = 0L;
                    UniversalAdapter universalAdapter = this.adapter;
                    if (universalAdapter != null) {
                        universalAdapter.update(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void checkEditURL(String str) {
        if (str == null) {
            return;
        }
        boolean containsURL = containsURL(str);
        AndroidUtilities.cancelRunOnUIThread(this.requestPreview);
        if (containsURL) {
            if (!this.loading || this.webpage != null) {
                this.loading = true;
                this.webpage = null;
                UniversalAdapter universalAdapter = this.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
            }
            AndroidUtilities.runOnUIThread(this.requestPreview, 1000L);
        } else if (this.loading || this.webpage != null) {
            this.loading = false;
            this.webpage = null;
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            UniversalAdapter universalAdapter2 = this.adapter;
            if (universalAdapter2 != null) {
                universalAdapter2.update(true);
            }
        }
        this.button.setEnabled(containsURL);
    }

    public void lambda$new$7() {
        TLRPC$TL_messages_getWebPagePreview tLRPC$TL_messages_getWebPagePreview = new TLRPC$TL_messages_getWebPagePreview();
        tLRPC$TL_messages_getWebPagePreview.message = this.urlEditText.editText.getText().toString();
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getWebPagePreview, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoryLinkSheet.this.lambda$new$6(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$6(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.lambda$new$5(tLObject);
            }
        });
    }

    public void lambda$new$5(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messageMediaWebPage) {
            TLRPC$WebPage tLRPC$WebPage = ((TLRPC$TL_messageMediaWebPage) tLObject).webpage;
            this.webpage = tLRPC$WebPage;
            if (isPreviewEmpty(tLRPC$WebPage)) {
                TLRPC$WebPage tLRPC$WebPage2 = this.webpage;
                this.webpageId = tLRPC$WebPage2 == null ? 0L : tLRPC$WebPage2.id;
                this.webpage = null;
            } else {
                this.webpageId = 0L;
            }
        } else {
            this.webpage = null;
            this.webpageId = 0L;
        }
        this.loading = this.webpageId != 0;
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    public void closePreview(View view) {
        this.loading = false;
        this.webpage = null;
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    private boolean containsURL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.urlPattern == null) {
            this.urlPattern = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.urlPattern.matcher(str).find();
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (this.loading || this.webpage != null) {
            arrayList.add(WebpagePreviewView.Factory.item(this.webpage, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryLinkSheet.this.closePreview(view);
                }
            }));
        }
        arrayList.add(UItem.asCustom(this.urlEditText));
        arrayList.add(UItem.asShadow(1, null));
        arrayList.add(UItem.asCheck(2, LocaleController.getString(R.string.StoryLinkNameHeader)).setChecked(this.nameOpen));
        if (this.nameOpen) {
            arrayList.add(UItem.asCustom(this.nameEditText));
        }
        arrayList.add(UItem.asShadow(3, null));
        arrayList.add(UItem.asCustom(this.buttonContainer));
    }

    public static class WebpagePreviewView extends FrameLayout {
        private final ImageView closeView;
        private final ImageView imageView;
        private final ImageView loadingView;
        private final SpannableString messageLoading;
        private final AnimatedTextView messageView;
        private final Paint separatorPaint;
        private final SpannableString titleLoading;
        private final AnimatedTextView titleView;

        public WebpagePreviewView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.separatorPaint = paint;
            setWillNotDraw(false);
            paint.setColor(-16777216);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.filled_link);
            imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.loadingView = imageView2;
            imageView2.setBackground(new CircularProgressDrawable(this, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089) {
                @Override
                public int getIntrinsicHeight() {
                    return AndroidUtilities.dp(26.0f);
                }

                @Override
                public int getIntrinsicWidth() {
                    return AndroidUtilities.dp(26.0f);
                }
            });
            addView(imageView2, LayoutHelper.createFrame(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.titleView = animatedTextView;
            animatedTextView.setTextColor(-15033089);
            animatedTextView.setTextSize(AndroidUtilities.dp(14.21f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setEllipsizeByGradient(true);
            animatedTextView.getDrawable().setOverrideFullWidth(AndroidUtilities.displaySize.x);
            addView(animatedTextView, LayoutHelper.createFrame(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.messageView = animatedTextView2;
            animatedTextView2.setTextColor(-8355712);
            animatedTextView2.setTextSize(AndroidUtilities.dp(14.21f));
            animatedTextView2.setEllipsizeByGradient(true);
            animatedTextView2.getDrawable().setOverrideFullWidth(AndroidUtilities.displaySize.x);
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
            int textColor = animatedTextView.getTextColor();
            SpannableString spannableString = new SpannableString("x");
            this.titleLoading = spannableString;
            LoadingSpan loadingSpan = new LoadingSpan(animatedTextView, AndroidUtilities.dp(200.0f));
            loadingSpan.setScaleY(0.8f);
            loadingSpan.setColors(Theme.multAlpha(textColor, 0.4f), Theme.multAlpha(textColor, 0.08f));
            spannableString.setSpan(loadingSpan, 0, spannableString.length(), 33);
            int textColor2 = animatedTextView2.getTextColor();
            SpannableString spannableString2 = new SpannableString("x");
            this.messageLoading = spannableString2;
            LoadingSpan loadingSpan2 = new LoadingSpan(animatedTextView2, AndroidUtilities.dp(140.0f));
            loadingSpan2.setScaleY(0.8f);
            loadingSpan2.setColors(Theme.multAlpha(textColor2, 0.4f), Theme.multAlpha(textColor2, 0.08f));
            spannableString2.setSpan(loadingSpan2, 0, spannableString2.length(), 33);
            ImageView imageView3 = new ImageView(context);
            this.closeView = imageView3;
            imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
            imageView3.setImageResource(R.drawable.input_clear);
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setBackground(Theme.createSelectorDrawable(436207615, 1, AndroidUtilities.dp(18.0f)));
            addView(imageView3, LayoutHelper.createFrame(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), this.separatorPaint);
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), this.separatorPaint);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void set(TLRPC$WebPage tLRPC$WebPage, View.OnClickListener onClickListener, boolean z) {
            boolean z2 = (tLRPC$WebPage == null || (tLRPC$WebPage instanceof TLRPC$TL_webPagePending)) ? false : true;
            if (z) {
                ViewPropertyAnimator duration = this.imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.4f).scaleY(z2 ? 1.0f : 0.4f).setDuration(320L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                this.loadingView.animate().alpha(z2 ? 0.0f : 1.0f).scaleX(z2 ? 0.4f : 1.0f).scaleY(z2 ? 0.4f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            } else {
                this.imageView.setAlpha(z2 ? 1.0f : 0.0f);
                this.imageView.setScaleX(z2 ? 1.0f : 0.4f);
                this.imageView.setScaleY(z2 ? 1.0f : 0.4f);
                this.loadingView.setAlpha(z2 ? 0.0f : 1.0f);
                this.loadingView.setScaleX(z2 ? 0.4f : 1.0f);
                this.loadingView.setScaleY(z2 ? 0.4f : 1.0f);
            }
            if (z2) {
                this.titleView.setText(TextUtils.isEmpty(tLRPC$WebPage.site_name) ? tLRPC$WebPage.title : tLRPC$WebPage.site_name, z);
                this.messageView.setText(tLRPC$WebPage.description, z);
            } else {
                this.titleView.setText(this.titleLoading, z);
                this.messageView.setText(this.messageLoading, z);
            }
            this.closeView.setOnClickListener(onClickListener);
        }

        public static class Factory extends UItem.UItemFactory<WebpagePreviewView> {
            @Override
            public WebpagePreviewView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new WebpagePreviewView(context);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                WebpagePreviewView webpagePreviewView = (WebpagePreviewView) view;
                Object obj = uItem.object;
                webpagePreviewView.set(obj instanceof TLRPC$WebPage ? (TLRPC$WebPage) obj : null, uItem.clickCallback, false);
            }

            public static UItem item(TLRPC$WebPage tLRPC$WebPage, View.OnClickListener onClickListener) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = tLRPC$WebPage;
                ofFactory.clickCallback = onClickListener;
                return ofFactory;
            }
        }
    }

    public static boolean isPreviewEmpty(TLRPC$WebPage tLRPC$WebPage) {
        return (tLRPC$WebPage instanceof TLRPC$TL_webPagePending) || (TextUtils.isEmpty(tLRPC$WebPage.title) && TextUtils.isEmpty(tLRPC$WebPage.description));
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryLinkSheet.this.lambda$show$8();
            }
        }, 150L);
    }

    public void lambda$show$8() {
        if (isShowing()) {
            this.urlEditText.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.urlEditText.editText);
        }
    }

    @Override
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.urlEditText.editText);
        AndroidUtilities.hideKeyboard(this.nameEditText.editText);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }
}
