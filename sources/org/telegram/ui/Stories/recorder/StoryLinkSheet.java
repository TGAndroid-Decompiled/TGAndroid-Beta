package org.telegram.ui.Stories.recorder;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda6;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class StoryLinkSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass3 adapter;
    public final ButtonWithCounterView button;
    public final FrameLayout buttonContainer;
    public boolean captionAbove;
    public boolean ignoreUrlEdit;
    public String lastCheckedStr;
    public boolean loading;
    public final EditTextCell nameEditText;
    public boolean nameOpen;
    public boolean needRemoveDefPrefix;
    public boolean photoLarge;
    public int reqId;
    public final StoryLinkSheet$$ExternalSyntheticLambda1 requestPreview;
    public final EditTextCell urlEditText;
    public Pattern urlPattern;
    public TLRPC.WebPage webpage;
    public long webpageId;
    public ThemeActivity$$ExternalSyntheticLambda19 whenDone;

    public final class AnonymousClass3 extends UniversalAdapter {
        @Override
        public final int getThemedColor(int i) {
            if (i == Theme.key_dialogBackgroundGray) {
                return -15921907;
            }
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    public final class WebpagePreviewView extends FrameLayout {
        public final ImageView closeView;
        public final ImageView imageView;
        public final ImageView loadingView;
        public final SpannableString messageLoading;
        public final AnimatedTextView messageView;
        public final Paint separatorPaint;
        public final SpannableString titleLoading;
        public final AnimatedTextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                boolean z2;
                WebpagePreviewView webpagePreviewView = (WebpagePreviewView) view;
                Object obj = uItem.object;
                TLRPC.WebPage webPage = obj instanceof TLRPC.WebPage ? (TLRPC.WebPage) obj : null;
                View.OnClickListener onClickListener = uItem.clickCallback;
                if (webPage != null) {
                    webpagePreviewView.getClass();
                    if (webPage instanceof TLRPC.TL_webPagePending) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                ImageView imageView = webpagePreviewView.imageView;
                imageView.setAlpha(z2 ? 1.0f : 0.0f);
                imageView.setScaleX(z2 ? 1.0f : 0.4f);
                imageView.setScaleY(z2 ? 1.0f : 0.4f);
                ImageView imageView2 = webpagePreviewView.loadingView;
                imageView2.setAlpha(z2 ? 0.0f : 1.0f);
                imageView2.setScaleX(z2 ? 0.4f : 1.0f);
                imageView2.setScaleY(z2 ? 0.4f : 1.0f);
                AnimatedTextView animatedTextView = webpagePreviewView.messageView;
                AnimatedTextView animatedTextView2 = webpagePreviewView.titleView;
                if (z2) {
                    animatedTextView2.setText(TextUtils.isEmpty(webPage.site_name) ? webPage.title : webPage.site_name, false, true);
                    animatedTextView.setText(webPage.description, false, true);
                } else {
                    animatedTextView2.setText(webpagePreviewView.titleLoading, false, true);
                    animatedTextView.setText(webpagePreviewView.messageLoading, false, true);
                }
                webpagePreviewView.closeView.setOnClickListener(onClickListener);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new WebpagePreviewView(context);
            }
        }

        public WebpagePreviewView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.separatorPaint = paint;
            setWillNotDraw(false);
            paint.setColor(-16777216);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.filled_link);
            imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.loadingView = imageView2;
            imageView2.setBackground(new ChatbotsActivity.AnonymousClass4(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
            addView(imageView2, LayoutHelper.createFrame(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.titleView = animatedTextView;
            animatedTextView.setTextColor(-15033089);
            animatedTextView.setTextSize(AndroidUtilities.dp(14.21f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setEllipsizeByGradient(true);
            animatedTextView.getDrawable().overrideFullWidth = AndroidUtilities.displaySize.x;
            addView(animatedTextView, LayoutHelper.createFrame(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
            this.messageView = animatedTextView2;
            animatedTextView2.setTextColor(-8355712);
            animatedTextView2.setTextSize(AndroidUtilities.dp(14.21f));
            animatedTextView2.setEllipsizeByGradient(true);
            animatedTextView2.getDrawable().overrideFullWidth = AndroidUtilities.displaySize.x;
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
            int textColor = animatedTextView.getTextColor();
            SpannableString spannableString = new SpannableString("x");
            this.titleLoading = spannableString;
            LoadingSpan loadingSpan = new LoadingSpan(AndroidUtilities.dp(200.0f), animatedTextView);
            loadingSpan.scaleY = 0.8f;
            loadingSpan.setColors(Theme.multAlpha(0.4f, textColor), Theme.multAlpha(0.08f, textColor));
            spannableString.setSpan(loadingSpan, 0, spannableString.length(), 33);
            int textColor2 = animatedTextView2.getTextColor();
            SpannableString spannableString2 = new SpannableString("x");
            this.messageLoading = spannableString2;
            LoadingSpan loadingSpan2 = new LoadingSpan(AndroidUtilities.dp(140.0f), animatedTextView2);
            loadingSpan2.scaleY = 0.8f;
            loadingSpan2.setColors(Theme.multAlpha(0.4f, textColor2), Theme.multAlpha(0.08f, textColor2));
            spannableString2.setSpan(loadingSpan2, 0, spannableString2.length(), 33);
            ImageView imageView3 = new ImageView(context);
            this.closeView = imageView3;
            imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
            imageView3.setImageResource(R.drawable.input_clear);
            imageView3.setScaleType(scaleType);
            imageView3.setBackground(Theme.createSelectorDrawable(436207615, 1, AndroidUtilities.dp(18.0f)));
            addView(imageView3, LayoutHelper.createFrame(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float width = getWidth();
            float shadowHeight = AndroidUtilities.getShadowHeight();
            Paint paint = this.separatorPaint;
            canvas.drawRect(0.0f, 0.0f, width, shadowHeight, paint);
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    public StoryLinkSheet(Context context, PaintView.AnonymousClass2 anonymousClass2, StoryRecorder.AnonymousClass7 anonymousClass7, ThemeActivity$$ExternalSyntheticLambda19 themeActivity$$ExternalSyntheticLambda19) {
        boolean zFind;
        super(context, null, true, false, false, false, true, 2, anonymousClass2);
        this.requestPreview = new StoryLinkSheet$$ExternalSyntheticLambda1(this, 0);
        this.whenDone = themeActivity$$ExternalSyntheticLambda19;
        fixNavigationBar();
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-15.0f);
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, anonymousClass2);
        this.urlEditText = editTextCell;
        StoryLinkSheet$$ExternalSyntheticLambda1 storyLinkSheet$$ExternalSyntheticLambda1 = new StoryLinkSheet$$ExternalSyntheticLambda1(this, 1);
        EditTextCell.AnonymousClass2 anonymousClass3 = editTextCell.editText;
        anonymousClass3.setImeOptions(6);
        anonymousClass3.setOnEditorActionListener(new EditTextCell.AnonymousClass1(storyLinkSheet$$ExternalSyntheticLambda1, 0));
        anonymousClass3.setHandlesColor(-12476440);
        anonymousClass3.setCursorColor(-11230757);
        anonymousClass3.setText("https://");
        anonymousClass3.setSelection(8);
        TextView textView = new TextView(getContext());
        zzkk.m(12.0f, 1, textView);
        textView.setPadding(zzlm.m(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhiteBlueText2);
        textView.setTextColor(themedColor);
        int iDp = AndroidUtilities.dp(6.0f);
        int iMultAlpha = Theme.multAlpha(0.12f, themedColor);
        int iMultAlpha2 = Theme.multAlpha(0.15f, themedColor);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
        editTextCell.addView(textView, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        final TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = new TodoItemMenu$$ExternalSyntheticLambda9(1, this, textView);
        textView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(28, this, todoItemMenu$$ExternalSyntheticLambda9));
        todoItemMenu$$ExternalSyntheticLambda9.run();
        anonymousClass3.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                todoItemMenu$$ExternalSyntheticLambda9.run();
                StoryLinkSheet storyLinkSheet = StoryLinkSheet.this;
                if (storyLinkSheet.ignoreUrlEdit) {
                    return;
                }
                if (!storyLinkSheet.needRemoveDefPrefix || editable == null) {
                    StoryLinkSheet.access$300(storyLinkSheet, editable == null ? null : editable.toString());
                    return;
                }
                String strSubstring = editable.toString().substring(8);
                storyLinkSheet.ignoreUrlEdit = true;
                EditTextCell editTextCell2 = storyLinkSheet.urlEditText;
                editTextCell2.editText.setText(strSubstring);
                EditTextCell.AnonymousClass2 anonymousClass4 = editTextCell2.editText;
                anonymousClass4.setSelection(0, anonymousClass4.getText().length());
                storyLinkSheet.ignoreUrlEdit = false;
                storyLinkSheet.needRemoveDefPrefix = false;
                StoryLinkSheet.access$300(storyLinkSheet, strSubstring);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4;
                StoryLinkSheet storyLinkSheet = StoryLinkSheet.this;
                if (storyLinkSheet.ignoreUrlEdit) {
                    return;
                }
                boolean z = false;
                if (charSequence != null && i == 8 && charSequence.subSequence(0, i).toString().equals("https://") && charSequence.length() >= (i4 = i3 + i) && charSequence.subSequence(i, i4).toString().startsWith("https://")) {
                    z = true;
                }
                storyLinkSheet.needRemoveDefPrefix = z;
            }
        });
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, anonymousClass2);
        this.nameEditText = editTextCell2;
        StoryLinkSheet$$ExternalSyntheticLambda1 storyLinkSheet$$ExternalSyntheticLambda2 = new StoryLinkSheet$$ExternalSyntheticLambda1(this, 1);
        EditTextCell.AnonymousClass2 anonymousClass4 = editTextCell2.editText;
        anonymousClass4.setImeOptions(6);
        anonymousClass4.setOnEditorActionListener(new EditTextCell.AnonymousClass1(storyLinkSheet$$ExternalSyntheticLambda2, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, anonymousClass2, true);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        buttonWithCounterView.setOnClickListener(new StoryLinkSheet$$ExternalSyntheticLambda5(this, 0));
        String string = editTextCell.getText().toString();
        if (TextUtils.isEmpty(string)) {
            zFind = false;
        } else {
            if (this.urlPattern == null) {
                this.urlPattern = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
            }
            zFind = this.urlPattern.matcher(string).find();
        }
        buttonWithCounterView.setEnabled(zFind);
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.topPadding = 0.2f;
        this.takeTranslationIntoAccount = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) StoryLinkSheet.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, 0);
        this.recyclerListView.setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(this, context, anonymousClass7, 4));
        AnonymousClass3 anonymousClass5 = this.adapter;
        if (anonymousClass5 != null) {
            anonymousClass5.update(false);
        }
    }

    public static void access$300(StoryLinkSheet storyLinkSheet, String str) {
        boolean zFind;
        if (str == null) {
            storyLinkSheet.getClass();
            return;
        }
        if (TextUtils.equals(str, storyLinkSheet.lastCheckedStr)) {
            return;
        }
        storyLinkSheet.lastCheckedStr = str;
        if (TextUtils.isEmpty(str)) {
            zFind = false;
        } else {
            if (storyLinkSheet.urlPattern == null) {
                storyLinkSheet.urlPattern = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
            }
            zFind = storyLinkSheet.urlPattern.matcher(str).find();
        }
        StoryLinkSheet$$ExternalSyntheticLambda1 storyLinkSheet$$ExternalSyntheticLambda1 = storyLinkSheet.requestPreview;
        AndroidUtilities.cancelRunOnUIThread(storyLinkSheet$$ExternalSyntheticLambda1);
        if (zFind) {
            if (!storyLinkSheet.loading || storyLinkSheet.webpage != null) {
                storyLinkSheet.loading = true;
                storyLinkSheet.webpage = null;
                AnonymousClass3 anonymousClass3 = storyLinkSheet.adapter;
                if (anonymousClass3 != null) {
                    anonymousClass3.update(true);
                }
            }
            AndroidUtilities.runOnUIThread(storyLinkSheet$$ExternalSyntheticLambda1, 700L);
        } else if (storyLinkSheet.loading || storyLinkSheet.webpage != null) {
            storyLinkSheet.loading = false;
            storyLinkSheet.webpage = null;
            if (storyLinkSheet.reqId != 0) {
                ConnectionsManager.getInstance(storyLinkSheet.currentAccount).cancelRequest(storyLinkSheet.reqId, true);
                storyLinkSheet.reqId = 0;
            }
            AnonymousClass3 anonymousClass4 = storyLinkSheet.adapter;
            if (anonymousClass4 != null) {
                anonymousClass4.update(true);
            }
        }
        storyLinkSheet.button.setEnabled(zFind);
    }

    public final void closePreview() {
        this.loading = false;
        this.webpage = null;
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        AnonymousClass3 anonymousClass3 = this.adapter;
        if (anonymousClass3 != null) {
            anonymousClass3.update(true);
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.recyclerListView, getContext(), this.currentAccount, 0, true, new TodoItemMenu$$ExternalSyntheticLambda17(this, 3), this.resourcesProvider);
        this.adapter = anonymousClass3;
        return anonymousClass3;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.didReceivedWebpagesInUpdates || this.webpageId == 0) {
            return;
        }
        LongSparseArray longSparseArray = (LongSparseArray) objArr[0];
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) longSparseArray.valueAt(i3);
            if (webPage != null && this.webpageId == webPage.id) {
                if ((webPage instanceof TLRPC.TL_webPagePending) || (TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description))) {
                    webPage = null;
                }
                this.webpage = webPage;
                this.loading = false;
                this.webpageId = 0L;
                AnonymousClass3 anonymousClass3 = this.adapter;
                if (anonymousClass3 != null) {
                    anonymousClass3.update(true);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        AndroidUtilities.hideKeyboard(this.urlEditText.editText);
        AndroidUtilities.hideKeyboard(this.nameEditText.editText);
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    public final void lambda$new$4(Context context, StoryRecorder.AnonymousClass7 anonymousClass7, View view, int i) {
        TLRPC.WebPage webPage;
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        boolean zInstanceOf = item.instanceOf(WebpagePreviewView.Factory.class);
        EditTextCell editTextCell = this.nameEditText;
        EditTextCell editTextCell2 = this.urlEditText;
        if (!zInstanceOf || (webPage = this.webpage) == null || (webPage instanceof TLRPC.TL_webPagePending) || (TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description))) {
            if (item.id == 2 && (view instanceof TextCheckCell)) {
                boolean z = !this.nameOpen;
                this.nameOpen = z;
                ((TextCheckCell) view).setChecked(z);
                this.adapter.update(true);
                if (this.nameOpen) {
                    editTextCell.requestFocus();
                    return;
                } else {
                    editTextCell2.requestFocus();
                    return;
                }
            }
            return;
        }
        StoryLinkPreviewDialog storyLinkPreviewDialog = new StoryLinkPreviewDialog(context, this.currentAccount);
        LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
        webPagePreview.url = editTextCell2.editText.getText().toString();
        webPagePreview.name = this.nameOpen ? editTextCell.editText.getText().toString() : null;
        TLRPC.WebPage webPage2 = this.webpage;
        webPagePreview.webpage = webPage2;
        webPagePreview.largePhoto = this.photoLarge;
        webPagePreview.captionAbove = this.captionAbove;
        VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(this, 18);
        storyLinkPreviewDialog.link = webPagePreview;
        int i2 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        MessagePreviewView.ToggleButton toggleButton = storyLinkPreviewDialog.photoButton;
        toggleButton.setVisibility(i2);
        storyLinkPreviewDialog.linkView.set(storyLinkPreviewDialog.currentAccount, webPagePreview, false);
        storyLinkPreviewDialog.captionButton.setState(!webPagePreview.captionAbove, false);
        toggleButton.setState(!webPagePreview.largePhoto, false);
        storyLinkPreviewDialog.whenDone = voIPFragment$$ExternalSyntheticLambda7;
        storyLinkPreviewDialog.backgroundView.setImageDrawable(new TextCell.AnonymousClass2(anonymousClass7, 4));
        storyLinkPreviewDialog.show();
    }

    public final void lambda$new$5(TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
            } else {
                tL_messageMediaWebPage = null;
            }
        } else {
            tL_messageMediaWebPage = null;
        }
        if (tL_messageMediaWebPage != null) {
            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
            this.webpage = webPage;
            if ((webPage instanceof TLRPC.TL_webPagePending) || (TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description))) {
                TLRPC.WebPage webPage2 = this.webpage;
                this.webpageId = webPage2 == null ? 0L : webPage2.id;
                this.webpage = null;
            } else {
                this.webpageId = 0L;
            }
        } else {
            this.webpage = null;
            this.webpageId = 0L;
        }
        this.loading = this.webpageId != 0;
        AnonymousClass3 anonymousClass3 = this.adapter;
        if (anonymousClass3 != null) {
            anonymousClass3.update(true);
        }
    }

    public final void lambda$new$7$2$3() {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = this.urlEditText.editText.getText().toString();
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwebpagepreview, new RichMediaUploader$$ExternalSyntheticLambda0(this, 8));
    }

    public final void processDone$10() {
        if (this.button.enabled) {
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
            lambda$showGiftOfferSheet$15();
        }
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new StoryLinkSheet$$ExternalSyntheticLambda1(this, 2), 150L);
    }
}
