package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.EmptyCell;
import org.telegram.p009ui.Cells.StickerEmojiCell;
import org.telegram.p009ui.Cells.StickerSetNameCell;
import org.telegram.p009ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.ScrollSlidingTabStrip;
import org.telegram.p009ui.Components.StickerMasksAlert;
import org.telegram.p009ui.ContentPreviewViewer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickers;

public class StickerMasksAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout bottomTabContainer;
    private ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate;
    private int currentAccount;
    private int currentType;
    private StickerMasksAlertDelegate delegate;
    private ImageView emojiButton;
    private boolean emojiSmoothScrolling;
    private int favTabBum;
    private ArrayList<TLRPC$Document> favouriteStickers;
    private RecyclerListView gridView;
    private String[] lastSearchKeyboardLanguage;
    private ImageView masksButton;
    private ArrayList<TLRPC$Document>[] recentStickers;
    private int recentTabBum;
    private RecyclerAnimationScrollHelper scrollHelper;
    private int scrollOffsetY;
    private int searchFieldHeight;
    private Drawable shadowDrawable;
    private View shadowLine;
    private Drawable[] stickerIcons;
    private ArrayList<TLRPC$TL_messages_stickerSet>[] stickerSets;
    private ImageView stickersButton;
    private StickersGridAdapter stickersGridAdapter;
    private GridLayoutManager stickersLayoutManager;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private SearchField stickersSearchField;
    private StickersSearchGridAdapter stickersSearchGridAdapter;
    private ScrollSlidingTabStrip stickersTab;
    private int stickersTabOffset;

    public interface StickerMasksAlertDelegate {
        void onStickerSelected(Object obj, TLRPC$Document tLRPC$Document);
    }

    public int typeIndex(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 0;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public class SearchField extends FrameLayout {
        private ImageView clearSearchImageView;
        private CloseProgressDrawable2 progressDrawable;
        private EditTextBoldCursor searchEditText;

        public void showShadow(boolean z, boolean z2) {
        }

        public SearchField(Context context, int i) {
            super(context);
            View view = new View(context);
            view.setBackgroundColor(-14342875);
            addView(view, new FrameLayout.LayoutParams(-1, StickerMasksAlert.this.searchFieldHeight));
            View view2 = new View(context);
            view2.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.m36dp(18.0f), -13224394));
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 14.0f, 14.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(C1072R.C1073drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(-8947849, PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 14.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clearSearchImageView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView3 = this.clearSearchImageView;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2(this, StickerMasksAlert.this) {
                @Override
                public int getCurrentColor() {
                    return -8947849;
                }
            };
            this.progressDrawable = closeProgressDrawable2;
            imageView3.setImageDrawable(closeProgressDrawable2);
            this.progressDrawable.setSide(AndroidUtilities.m36dp(7.0f));
            this.clearSearchImageView.setScaleX(0.1f);
            this.clearSearchImageView.setScaleY(0.1f);
            this.clearSearchImageView.setAlpha(0.0f);
            addView(this.clearSearchImageView, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 14.0f, 14.0f, 0.0f));
            this.clearSearchImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    StickerMasksAlert.SearchField.this.lambda$new$0(view3);
                }
            });
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context, StickerMasksAlert.this) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        SearchField.this.searchEditText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.searchEditText);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.searchEditText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.searchEditText.setHintTextColor(-8947849);
            this.searchEditText.setTextColor(-1);
            this.searchEditText.setBackgroundDrawable(null);
            this.searchEditText.setPadding(0, 0, 0, 0);
            this.searchEditText.setMaxLines(1);
            this.searchEditText.setLines(1);
            this.searchEditText.setSingleLine(true);
            this.searchEditText.setImeOptions(268435459);
            if (i == 0) {
                this.searchEditText.setHint(LocaleController.getString("SearchStickersHint", C1072R.string.SearchStickersHint));
            } else if (i == 1) {
                this.searchEditText.setHint(LocaleController.getString("SearchEmojiHint", C1072R.string.SearchEmojiHint));
            } else if (i == 2) {
                this.searchEditText.setHint(LocaleController.getString("SearchGifsTitle", C1072R.string.SearchGifsTitle));
            }
            this.searchEditText.setCursorColor(-1);
            this.searchEditText.setCursorSize(AndroidUtilities.m36dp(20.0f));
            this.searchEditText.setCursorWidth(1.5f);
            addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 12.0f, 46.0f, 0.0f));
            this.searchEditText.addTextChangedListener(new TextWatcher(StickerMasksAlert.this) {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    boolean z = SearchField.this.searchEditText.length() > 0;
                    if (z != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                        SearchField.this.clearSearchImageView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
                    }
                    StickerMasksAlert.this.stickersSearchGridAdapter.search(SearchField.this.searchEditText.getText().toString());
                }
            });
        }

        public void lambda$new$0(View view) {
            this.searchEditText.setText("");
            AndroidUtilities.showKeyboard(this.searchEditText);
        }

        public void hideKeyboard() {
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }
    }

    public StickerMasksAlert(Context context, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.currentAccount = UserConfig.selectedAccount;
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.favouriteStickers = new ArrayList<>();
        this.recentTabBum = -2;
        this.favTabBum = -2;
        this.contentPreviewViewerDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
            @Override
            public boolean can() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
            }

            @Override
            public boolean canSchedule() {
                return false;
            }

            @Override
            public long getDialogId() {
                return 0L;
            }

            @Override
            public String getQuery(boolean z2) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z2);
            }

            @Override
            public void gifAddedOrDeleted() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
            }

            @Override
            public boolean isInScheduleMode() {
                return false;
            }

            @Override
            public boolean needMenu() {
                return false;
            }

            @Override
            public boolean needOpen() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
            }

            @Override
            public boolean needRemove() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
            }

            @Override
            public boolean needSend() {
                return false;
            }

            @Override
            public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z2) {
            }

            @Override
            public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
            }

            @Override
            public void sendGif(Object obj, Object obj2, boolean z2, int i) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z2, i);
            }

            @Override
            public void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z2, int i) {
                StickerMasksAlert.this.delegate.onStickerSelected(obj, tLRPC$Document);
            }
        };
        this.behindKeyboardColorKey = null;
        this.behindKeyboardColor = -14342875;
        this.useLightStatusBar = false;
        fixNavigationBar(-14342875);
        this.currentType = 0;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(1, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        Drawable mutate = context.getResources().getDrawable(C1072R.C1073drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private long lastUpdateTime;
            private float statusBarProgress;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();

            @Override
            protected void onMeasure(int i, int i2) {
                int m36dp;
                int size = View.MeasureSpec.getSize(i2);
                if (Build.VERSION.SDK_INT >= 21 && !((BottomSheet) StickerMasksAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size - getPaddingTop();
                if (measureKeyboardHeight() > AndroidUtilities.m36dp(20.0f)) {
                    this.statusBarProgress = 1.0f;
                    m36dp = 0;
                } else {
                    m36dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.m36dp(16.0f);
                }
                if (StickerMasksAlert.this.gridView.getPaddingTop() != m36dp) {
                    this.ignoreLayout = true;
                    StickerMasksAlert.this.gridView.setPinnedSectionOffsetY(-m36dp);
                    StickerMasksAlert.this.gridView.setPadding(AndroidUtilities.m36dp(4.0f), m36dp, AndroidUtilities.m36dp(4.0f), AndroidUtilities.m36dp(48.0f));
                    this.ignoreLayout = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                StickerMasksAlert.this.updateLayout(false);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && StickerMasksAlert.this.scrollOffsetY != 0 && motionEvent.getY() < StickerMasksAlert.this.scrollOffsetY + AndroidUtilities.m36dp(12.0f)) {
                    StickerMasksAlert.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickerMasksAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                int m36dp = AndroidUtilities.m36dp(13.0f);
                int i = (StickerMasksAlert.this.scrollOffsetY - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop) - m36dp;
                if (((BottomSheet) StickerMasksAlert.this).currentSheetAnimationType == 1) {
                    i = (int) (i + StickerMasksAlert.this.gridView.getTranslationY());
                }
                int m36dp2 = AndroidUtilities.m36dp(20.0f) + i;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.m36dp(15.0f) + ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop;
                int m36dp3 = AndroidUtilities.m36dp(12.0f);
                if (((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + i < m36dp3) {
                    float m36dp4 = m36dp + AndroidUtilities.m36dp(4.0f);
                    float min = Math.min(1.0f, ((m36dp3 - i) - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop) / m36dp4);
                    int i2 = (int) ((m36dp3 - m36dp4) * min);
                    i -= i2;
                    m36dp2 -= i2;
                    measuredHeight += i2;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    int i3 = AndroidUtilities.statusBarHeight;
                    i += i3;
                    m36dp2 += i3;
                }
                StickerMasksAlert.this.shadowDrawable.setBounds(0, i, getMeasuredWidth(), measuredHeight);
                StickerMasksAlert.this.shadowDrawable.draw(canvas);
                if (f != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(-14342875);
                    this.rect.set(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + i, getMeasuredWidth() - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + i + AndroidUtilities.m36dp(24.0f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(12.0f) * f, AndroidUtilities.m36dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.lastUpdateTime;
                if (j > 18) {
                    j = 18;
                }
                this.lastUpdateTime = elapsedRealtime;
                if (f > 0.0f) {
                    int m36dp5 = AndroidUtilities.m36dp(36.0f);
                    this.rect.set((getMeasuredWidth() - m36dp5) / 2, m36dp2, (getMeasuredWidth() + m36dp5) / 2, m36dp2 + AndroidUtilities.m36dp(4.0f));
                    int alpha = Color.alpha(-11842741);
                    Theme.dialogs_onlineCirclePaint.setColor(-11842741);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    float f2 = this.statusBarProgress;
                    if (f2 > 0.0f) {
                        float f3 = f2 - (((float) j) / 180.0f);
                        this.statusBarProgress = f3;
                        if (f3 < 0.0f) {
                            this.statusBarProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else {
                    float f4 = this.statusBarProgress;
                    if (f4 < 1.0f) {
                        float f5 = f4 + (((float) j) / 180.0f);
                        this.statusBarProgress = f5;
                        if (f5 > 1.0f) {
                            this.statusBarProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (this.statusBarProgress * 255.0f), (int) (Color.red(-14342875) * 0.8f), (int) (Color.green(-14342875) * 0.8f), (int) (Color.blue(-14342875) * 0.8f)));
                canvas.drawRect(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
            }
        };
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        this.searchFieldHeight = AndroidUtilities.m36dp(64.0f);
        this.stickerIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, C1072R.C1073drawable.stickers_recent, -11842741, -9520403), Theme.createEmojiIconSelectorDrawable(context, C1072R.C1073drawable.stickers_favorites, -11842741, -9520403)};
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).checkStickers(1);
        MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            SparseArray<ArrayList<ImageViewEmoji>> viewsGroupedByLines = new SparseArray<>();
            ArrayList<DrawingInBackgroundLine> lineDrawables = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> lineDrawablesTmp = new ArrayList<>();
            ArrayList<ArrayList<ImageViewEmoji>> unusedArrays = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> unusedLineDrawables = new ArrayList<>();

            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (StickerMasksAlert.this.scrollOffsetY + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)));
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, StickerMasksAlert.this.gridView, ((BottomSheet) StickerMasksAlert.this).containerView.getMeasuredHeight(), StickerMasksAlert.this.contentPreviewViewerDelegate, this.resourcesProvider);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                DrawingInBackgroundLine drawingInBackgroundLine;
                DrawingInBackgroundLine drawingInBackgroundLine2;
                ArrayList<DrawingInBackgroundLine> arrayList;
                ArrayList<ArrayList<ImageViewEmoji>> arrayList2;
                super.dispatchDraw(canvas);
                for (int i2 = 0; i2 < this.viewsGroupedByLines.size(); i2++) {
                    ArrayList<ImageViewEmoji> valueAt = this.viewsGroupedByLines.valueAt(i2);
                    valueAt.clear();
                    this.unusedArrays.add(valueAt);
                }
                this.viewsGroupedByLines.clear();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof ImageViewEmoji) {
                        int top = childAt.getTop() + ((int) childAt.getTranslationY());
                        ArrayList<ImageViewEmoji> arrayList3 = this.viewsGroupedByLines.get(top);
                        if (arrayList3 == null) {
                            if (!this.unusedArrays.isEmpty()) {
                                arrayList3 = this.unusedArrays.remove(arrayList2.size() - 1);
                            } else {
                                arrayList3 = new ArrayList<>();
                            }
                            this.viewsGroupedByLines.put(top, arrayList3);
                        }
                        arrayList3.add((ImageViewEmoji) childAt);
                    }
                }
                this.lineDrawablesTmp.clear();
                this.lineDrawablesTmp.addAll(this.lineDrawables);
                this.lineDrawables.clear();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i4 = 0; i4 < this.viewsGroupedByLines.size(); i4++) {
                    ArrayList<ImageViewEmoji> valueAt2 = this.viewsGroupedByLines.valueAt(i4);
                    ImageViewEmoji imageViewEmoji = valueAt2.get(0);
                    int i5 = imageViewEmoji.position;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= this.lineDrawablesTmp.size()) {
                            drawingInBackgroundLine = null;
                            break;
                        } else if (this.lineDrawablesTmp.get(i6).position == i5) {
                            drawingInBackgroundLine = this.lineDrawablesTmp.get(i6);
                            this.lineDrawablesTmp.remove(i6);
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (drawingInBackgroundLine == null) {
                        if (!this.unusedLineDrawables.isEmpty()) {
                            drawingInBackgroundLine2 = this.unusedLineDrawables.remove(arrayList.size() - 1);
                        } else {
                            drawingInBackgroundLine2 = new DrawingInBackgroundLine();
                        }
                        drawingInBackgroundLine2.position = i5;
                        drawingInBackgroundLine2.onAttachToWindow();
                    } else {
                        drawingInBackgroundLine2 = drawingInBackgroundLine;
                    }
                    this.lineDrawables.add(drawingInBackgroundLine2);
                    drawingInBackgroundLine2.imageViewEmojis = valueAt2;
                    canvas.save();
                    canvas.translate(imageViewEmoji.getLeft(), imageViewEmoji.getY() + imageViewEmoji.getPaddingTop());
                    drawingInBackgroundLine2.startOffset = imageViewEmoji.getLeft();
                    int measuredWidth = getMeasuredWidth() - (imageViewEmoji.getLeft() * 2);
                    int measuredHeight = imageViewEmoji.getMeasuredHeight() - imageViewEmoji.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        drawingInBackgroundLine2.draw(canvas, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                }
                for (int i7 = 0; i7 < this.lineDrawablesTmp.size(); i7++) {
                    if (this.unusedLineDrawables.size() < 3) {
                        this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i7));
                        this.lineDrawablesTmp.get(i7).imageViewEmojis = null;
                        this.lineDrawablesTmp.get(i7).reset();
                    } else {
                        this.lineDrawablesTmp.get(i7).onDetachFromWindow();
                    }
                }
                this.lineDrawablesTmp.clear();
            }
        };
        this.gridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i3) {
                        return super.calculateDyToMakeVisible(view, i3) - (StickerMasksAlert.this.gridView.getPaddingTop() - AndroidUtilities.m36dp(7.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i3) {
                        return super.calculateTimeForDeceleration(i3) * 4;
                    }
                };
                linearSmoothScroller.setTargetPosition(i2);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.stickersLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.stickersLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersGridAdapter) {
                    if (i2 == StickerMasksAlert.this.stickersSearchGridAdapter.totalItems || !(StickerMasksAlert.this.stickersSearchGridAdapter.cache.get(i2) == null || (StickerMasksAlert.this.stickersSearchGridAdapter.cache.get(i2) instanceof TLRPC$Document))) {
                        return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                    }
                    return 1;
                } else if (i2 == 0) {
                    return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                } else {
                    if (i2 == StickerMasksAlert.this.stickersGridAdapter.totalItems || !(StickerMasksAlert.this.stickersGridAdapter.cache.get(i2) == null || (StickerMasksAlert.this.stickersGridAdapter.cache.get(i2) instanceof TLRPC$Document))) {
                        return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                    }
                    return 1;
                }
            }
        });
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.gridView, this.stickersLayoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
            @Override
            public void onPreAnimation() {
                StickerMasksAlert.this.emojiSmoothScrolling = true;
            }

            @Override
            public void onEndAnimation() {
                StickerMasksAlert.this.emojiSmoothScrolling = false;
            }

            @Override
            public void ignoreView(View view, boolean z2) {
                if (view instanceof ImageViewEmoji) {
                    ((ImageViewEmoji) view).ignoring = z2;
                }
            }
        });
        this.gridView.setPadding(AndroidUtilities.m36dp(4.0f), AndroidUtilities.m36dp(56.0f), AndroidUtilities.m36dp(4.0f), AndroidUtilities.m36dp(48.0f));
        this.gridView.setClipToPadding(false);
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setGlowColor(-14342875);
        this.gridView.setSelectorDrawableColor(0);
        this.stickersSearchGridAdapter = new StickersSearchGridAdapter(context);
        RecyclerListView recyclerListView2 = this.gridView;
        StickersGridAdapter stickersGridAdapter = new StickersGridAdapter(context);
        this.stickersGridAdapter = stickersGridAdapter;
        recyclerListView2.setAdapter(stickersGridAdapter);
        this.gridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$0;
                lambda$new$0 = StickerMasksAlert.this.lambda$new$0(resourcesProvider, view, motionEvent);
                return lambda$new$0;
            }
        });
        RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                StickerMasksAlert.this.lambda$new$1(view, i2);
            }
        };
        this.stickersOnItemClickListener = onItemClickListener;
        this.gridView.setOnItemClickListener(onItemClickListener);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f));
        this.stickersTab = new ScrollSlidingTabStrip(this, context, resourcesProvider) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        SearchField searchField = new SearchField(context, 0);
        this.stickersSearchField = searchField;
        this.containerView.addView(searchField, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
        this.stickersTab.setType(ScrollSlidingTabStrip.Type.TAB);
        this.stickersTab.setUnderlineHeight(AndroidUtilities.getShadowHeight());
        this.stickersTab.setIndicatorColor(-9520403);
        this.stickersTab.setUnderlineColor(0);
        this.stickersTab.setBackgroundColor(-14342875);
        this.containerView.addView(this.stickersTab, LayoutHelper.createFrame(-1, 42, 51));
        this.stickersTab.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public final void onPageSelected(int i2) {
                StickerMasksAlert.this.lambda$new$2(i2);
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    StickerMasksAlert.this.stickersSearchField.hideKeyboard();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                StickerMasksAlert.this.updateLayout(true);
            }
        });
        this.bottomTabContainer = new FrameLayout(this, context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        View view = new View(context);
        this.shadowLine = view;
        view.setBackgroundColor(301989888);
        this.bottomTabContainer.addView(this.shadowLine, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight()));
        View view2 = new View(context);
        view2.setBackgroundColor(-14342875);
        this.bottomTabContainer.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.m36dp(48.0f), 83));
        this.containerView.addView(this.bottomTabContainer, new FrameLayout.LayoutParams(-1, AndroidUtilities.m36dp(48.0f) + AndroidUtilities.getShadowHeight(), 83));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(this, context) {
            @Override
            public void setSelected(boolean z2) {
                super.setSelected(z2);
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT < 21 || background == null) {
                    return;
                }
                int i2 = z2 ? -9520403 : 520093695;
                Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i2), Color.green(i2), Color.blue(i2)), true);
            }
        };
        this.emojiButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.emojiButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, C1072R.C1073drawable.smiles_tab_smiles, -1, -9520403));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            RippleDrawable rippleDrawable = (RippleDrawable) Theme.createSelectorDrawable(520093695);
            Theme.setRippleDrawableForceSoftware(rippleDrawable);
            this.emojiButton.setBackground(rippleDrawable);
        }
        linearLayout.addView(this.emojiButton, LayoutHelper.createLinear(70, 48));
        this.emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                StickerMasksAlert.this.lambda$new$3(view3);
            }
        });
        ImageView imageView2 = new ImageView(this, context) {
            @Override
            public void setSelected(boolean z2) {
                super.setSelected(z2);
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT < 21 || background == null) {
                    return;
                }
                int i3 = z2 ? -9520403 : 520093695;
                Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i3), Color.green(i3), Color.blue(i3)), true);
            }
        };
        this.stickersButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.stickersButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, C1072R.C1073drawable.smiles_tab_stickers, -1, -9520403));
        if (i2 >= 21) {
            RippleDrawable rippleDrawable2 = (RippleDrawable) Theme.createSelectorDrawable(520093695);
            Theme.setRippleDrawableForceSoftware(rippleDrawable2);
            this.stickersButton.setBackground(rippleDrawable2);
        }
        linearLayout.addView(this.stickersButton, LayoutHelper.createLinear(70, 48));
        this.stickersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                StickerMasksAlert.this.lambda$new$4(view3);
            }
        });
        if (!z) {
            ImageView imageView3 = new ImageView(this, context) {
                @Override
                public void setSelected(boolean z2) {
                    super.setSelected(z2);
                    Drawable background = getBackground();
                    if (Build.VERSION.SDK_INT < 21 || background == null) {
                        return;
                    }
                    int i3 = z2 ? -9520403 : 520093695;
                    Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i3), Color.green(i3), Color.blue(i3)), true);
                }
            };
            this.masksButton = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.masksButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, C1072R.C1073drawable.ic_masks_msk1, -1, -9520403));
            if (i2 >= 21) {
                RippleDrawable rippleDrawable3 = (RippleDrawable) Theme.createSelectorDrawable(520093695);
                Theme.setRippleDrawableForceSoftware(rippleDrawable3);
                this.masksButton.setBackground(rippleDrawable3);
            }
            linearLayout.addView(this.masksButton, LayoutHelper.createLinear(70, 48));
            this.masksButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    StickerMasksAlert.this.lambda$new$5(view3);
                }
            });
        }
        this.bottomTabContainer.addView(linearLayout, LayoutHelper.createFrame(-2, 48, 81));
        checkDocuments(true);
        reloadStickersAdapter();
    }

    public boolean lambda$new$0(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, this.containerView.getMeasuredHeight(), this.stickersOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$1(View view, int i) {
        if (view instanceof ImageViewEmoji) {
            ContentPreviewViewer.getInstance().reset();
            this.delegate.onStickerSelected(null, ((ImageViewEmoji) view).document);
            dismiss();
        } else if (view instanceof StickerEmojiCell) {
            ContentPreviewViewer.getInstance().reset();
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            this.delegate.onStickerSelected(stickerEmojiCell.getParentObject(), stickerEmojiCell.getSticker());
            dismiss();
        }
    }

    public void lambda$new$2(int i) {
        int positionForPack;
        if (i == this.recentTabBum) {
            positionForPack = this.stickersGridAdapter.getPositionForPack("recent");
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
            int i2 = this.recentTabBum;
            scrollSlidingTabStrip.onPageScrolled(i2, i2 > 0 ? i2 : this.stickersTabOffset);
        } else if (i == this.favTabBum) {
            positionForPack = this.stickersGridAdapter.getPositionForPack("fav");
            ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
            int i3 = this.favTabBum;
            scrollSlidingTabStrip2.onPageScrolled(i3, i3 > 0 ? i3 : this.stickersTabOffset);
        } else {
            int i4 = i - this.stickersTabOffset;
            if (i4 >= this.stickerSets[typeIndex(this.currentType)].size()) {
                return;
            }
            if (i4 >= this.stickerSets[typeIndex(this.currentType)].size()) {
                i4 = this.stickerSets[typeIndex(this.currentType)].size() - 1;
            }
            positionForPack = this.stickersGridAdapter.getPositionForPack(this.stickerSets[typeIndex(this.currentType)].get(i4));
        }
        if (this.stickersLayoutManager.findFirstVisibleItemPosition() == positionForPack) {
            return;
        }
        scrollEmojisToPosition(positionForPack, (-this.gridView.getPaddingTop()) + this.searchFieldHeight + AndroidUtilities.m36dp(48.0f));
    }

    public void lambda$new$3(View view) {
        if (this.currentType == 5) {
            return;
        }
        this.currentType = 5;
        updateType();
    }

    public void lambda$new$4(View view) {
        if (this.currentType == 0) {
            return;
        }
        this.currentType = 0;
        updateType();
    }

    public void lambda$new$5(View view) {
        if (this.currentType == 1) {
            return;
        }
        this.currentType = 1;
        updateType();
    }

    private void updateType() {
        View childAt;
        RecyclerView.ViewHolder findContainingViewHolder;
        int top;
        if (this.currentType == 5) {
            this.stickersLayoutManager.setSpanCount(8);
        } else {
            this.stickersLayoutManager.setSpanCount(5);
        }
        this.stickersLayoutManager.requestLayout();
        if (this.gridView.getChildCount() > 0 && (findContainingViewHolder = this.gridView.findContainingViewHolder((childAt = this.gridView.getChildAt(0)))) != null) {
            if (findContainingViewHolder.getAdapterPosition() != 0) {
                top = -this.gridView.getPaddingTop();
            } else {
                top = childAt.getTop() + (-this.gridView.getPaddingTop());
            }
            this.stickersLayoutManager.scrollToPositionWithOffset(0, top);
        }
        checkDocuments(true);
    }

    private void scrollEmojisToPosition(int i, int i2) {
        View findViewByPosition = this.stickersLayoutManager.findViewByPosition(i);
        int findFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition();
        if ((findViewByPosition == null && Math.abs(i - findFirstVisibleItemPosition) > this.stickersLayoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
            this.scrollHelper.setScrollDirection(this.stickersLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.scrollHelper.scrollToPosition(i, i2, false, true);
            return;
        }
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2) {
            @Override
            public void onEnd() {
                StickerMasksAlert.this.emojiSmoothScrolling = false;
            }

            @Override
            protected void onStart() {
                StickerMasksAlert.this.emojiSmoothScrolling = true;
            }
        };
        linearSmoothScrollerCustom.setTargetPosition(i);
        linearSmoothScrollerCustom.setOffset(i2);
        this.stickersLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
    }

    public void setDelegate(StickerMasksAlertDelegate stickerMasksAlertDelegate) {
        this.delegate = stickerMasksAlertDelegate;
    }

    public void updateLayout(boolean z) {
        RecyclerListView.Holder holder;
        if (this.gridView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.gridView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.containerView.invalidate();
            return;
        }
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder2 = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int m36dp = AndroidUtilities.m36dp(7.0f);
        if (top < AndroidUtilities.m36dp(7.0f) || holder2 == null || holder2.getAdapterPosition() != 0) {
            top = m36dp;
        }
        int i = top + (-AndroidUtilities.m36dp(11.0f));
        if (this.scrollOffsetY != i) {
            RecyclerListView recyclerListView2 = this.gridView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            this.stickersTab.setTranslationY(i);
            this.stickersSearchField.setTranslationY(i + AndroidUtilities.m36dp(32.0f));
            this.containerView.invalidate();
        }
        RecyclerListView.Holder holder3 = (RecyclerListView.Holder) this.gridView.findViewHolderForAdapterPosition(0);
        if (holder3 == null) {
            this.stickersSearchField.showShadow(true, z);
        } else {
            this.stickersSearchField.showShadow(holder3.itemView.getTop() < this.gridView.getPaddingTop(), z);
        }
        RecyclerView.Adapter adapter = this.gridView.getAdapter();
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (adapter == stickersSearchGridAdapter && (holder = (RecyclerListView.Holder) this.gridView.findViewHolderForAdapterPosition(stickersSearchGridAdapter.getItemCount() - 1)) != null && holder.getItemViewType() == 5) {
            FrameLayout frameLayout = (FrameLayout) holder.itemView;
            int childCount = frameLayout.getChildCount();
            float f = (-((frameLayout.getTop() - this.searchFieldHeight) - AndroidUtilities.m36dp(48.0f))) / 2;
            for (int i2 = 0; i2 < childCount; i2++) {
                frameLayout.getChildAt(i2).setTranslationY(f);
            }
        }
        checkPanels();
    }

    private class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
        ArrayList<ImageViewEmoji> drawInBackgroundViews;
        ArrayList<ImageViewEmoji> imageViewEmojis;
        public int position;
        public int startOffset;

        private DrawingInBackgroundLine() {
            this.drawInBackgroundViews = new ArrayList<>();
            new OvershootInterpolator(3.0f);
        }

        @Override
        public void draw(Canvas canvas, long j, int i, int i2, float f) {
            ArrayList<ImageViewEmoji> arrayList = this.imageViewEmojis;
            if (arrayList == null) {
                return;
            }
            boolean z = true;
            boolean z2 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0;
            if (!z2) {
                for (int i3 = 0; i3 < this.imageViewEmojis.size(); i3++) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i3);
                    if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.backAnimator != null) {
                        break;
                    }
                }
            }
            z = z2;
            if (z) {
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, f);
                reset();
                return;
            }
            super.draw(canvas, j, i, i2, f);
        }

        @Override
        public void prepareDraw(long j) {
            this.drawInBackgroundViews.clear();
            for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                    animatedEmojiDrawable.update(j);
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                    int i2 = this.threadIndex;
                    ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = imageViewEmoji.backgroundThreadDrawHolder;
                    int i3 = this.threadIndex;
                    backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr2[i3], i3);
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].time = j;
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].overrideAlpha = 1.0f;
                    animatedEmojiDrawable.setAlpha(255);
                    int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set((imageViewEmoji.getLeft() + imageViewEmoji.getPaddingLeft()) - this.startOffset, height, (imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight()) - this.startOffset, ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom());
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                    imageViewEmoji.drawable = animatedEmojiDrawable;
                    animatedEmojiDrawable.getImageReceiver();
                    this.drawInBackgroundViews.add(imageViewEmoji);
                }
            }
        }

        @Override
        public void drawInBackground(Canvas canvas) {
            for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
                AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.draw(canvas, imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex], false);
                }
            }
        }

        @Override
        protected void drawInUiThread(Canvas canvas, float f) {
            if (this.imageViewEmojis != null) {
                canvas.save();
                canvas.translate(-this.startOffset, 0.0f);
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                    AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                    if (animatedEmojiDrawable != null) {
                        int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set(imageViewEmoji.getLeft() + imageViewEmoji.getPaddingLeft(), height, imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight(), ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingBottom()) - imageViewEmoji.getPaddingTop());
                        float f2 = imageViewEmoji.pressedProgress;
                        float f3 = f2 != 0.0f ? (((1.0f - f2) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        animatedEmojiDrawable.setAlpha((int) (255.0f * f));
                        animatedEmojiDrawable.setBounds(rect);
                        if (f3 != 1.0f) {
                            canvas.save();
                            canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                            animatedEmojiDrawable.draw(canvas);
                            canvas.restore();
                        } else {
                            animatedEmojiDrawable.draw(canvas);
                        }
                    }
                }
                canvas.restore();
            }
        }

        @Override
        public void onFrameReady() {
            super.onFrameReady();
            for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
                if (imageViewEmoji.backgroundThreadDrawHolder != null) {
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].release();
                }
            }
            StickerMasksAlert.this.gridView.invalidate();
        }
    }

    private void updateStickerTabs() {
        ArrayList<TLRPC$Document> arrayList;
        if (this.stickersTab == null) {
            return;
        }
        if (this.stickersButton != null) {
            this.emojiButton.setSelected(this.currentType == 5);
            this.stickersButton.setSelected(this.currentType == 0);
            ImageView imageView = this.masksButton;
            if (imageView != null) {
                imageView.setSelected(this.currentType == 1);
            }
        }
        this.recentTabBum = -2;
        this.favTabBum = -2;
        this.stickersTabOffset = 0;
        int currentPosition = this.stickersTab.getCurrentPosition();
        this.stickersTab.beginUpdate(false);
        if (this.currentType == 0 && !this.favouriteStickers.isEmpty()) {
            int i = this.stickersTabOffset;
            this.favTabBum = i;
            this.stickersTabOffset = i + 1;
            this.stickersTab.addIconTab(1, this.stickerIcons[1]).setContentDescription(LocaleController.getString("FavoriteStickers", C1072R.string.FavoriteStickers));
        }
        if (!this.recentStickers[typeIndex(this.currentType)].isEmpty()) {
            int i2 = this.stickersTabOffset;
            this.recentTabBum = i2;
            this.stickersTabOffset = i2 + 1;
            this.stickersTab.addIconTab(0, this.stickerIcons[0]).setContentDescription(LocaleController.getString("RecentStickers", C1072R.string.RecentStickers));
        }
        this.stickerSets[typeIndex(this.currentType)].clear();
        ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType);
        for (int i3 = 0; i3 < stickerSets.size(); i3++) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSets.get(i3);
            if (!tLRPC$TL_messages_stickerSet.set.archived && (arrayList = tLRPC$TL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
                this.stickerSets[typeIndex(this.currentType)].add(tLRPC$TL_messages_stickerSet);
            }
        }
        for (int i4 = 0; i4 < this.stickerSets[typeIndex(this.currentType)].size(); i4++) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSets[typeIndex(this.currentType)].get(i4);
            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet2.documents.get(0);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messages_stickerSet2.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = tLRPC$Document;
            }
            View addStickerTab = this.stickersTab.addStickerTab(closestPhotoSizeWithSize, tLRPC$Document, tLRPC$TL_messages_stickerSet2);
            addStickerTab.setContentDescription(tLRPC$TL_messages_stickerSet2.set.title + ", " + LocaleController.getString("AccDescrStickerSet", C1072R.string.AccDescrStickerSet));
        }
        this.stickersTab.commitUpdate();
        this.stickersTab.updateTabStyles();
        if (currentPosition != 0) {
            this.stickersTab.onPageScrolled(currentPosition, currentPosition);
        }
        checkPanels();
    }

    private void checkPanels() {
        if (this.stickersTab == null) {
            return;
        }
        int childCount = this.gridView.getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            view = this.gridView.getChildAt(i);
            if (view.getBottom() > this.searchFieldHeight + AndroidUtilities.m36dp(48.0f)) {
                break;
            }
        }
        if (view == null) {
            return;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(view);
        int adapterPosition = holder != null ? holder.getAdapterPosition() : -1;
        if (adapterPosition != -1) {
            int i2 = this.favTabBum;
            if (i2 <= 0 && (i2 = this.recentTabBum) <= 0) {
                i2 = this.stickersTabOffset;
            }
            this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(adapterPosition), i2);
        }
    }

    private void reloadStickersAdapter() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (stickersSearchGridAdapter != null) {
            stickersSearchGridAdapter.notifyDataSetChanged();
        }
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().close();
        }
        ContentPreviewViewer.getInstance().reset();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    private void checkDocuments(boolean z) {
        int size = this.recentStickers[typeIndex(this.currentType)].size();
        int size2 = this.favouriteStickers.size();
        this.recentStickers[typeIndex(this.currentType)] = MediaDataController.getInstance(this.currentAccount).getRecentStickers(this.currentType);
        this.favouriteStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(2);
        if (this.currentType == 0) {
            for (int i = 0; i < this.favouriteStickers.size(); i++) {
                TLRPC$Document tLRPC$Document = this.favouriteStickers.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < this.recentStickers[typeIndex(this.currentType)].size()) {
                        TLRPC$Document tLRPC$Document2 = this.recentStickers[typeIndex(this.currentType)].get(i2);
                        if (tLRPC$Document2.dc_id == tLRPC$Document.dc_id && tLRPC$Document2.f865id == tLRPC$Document.f865id) {
                            this.recentStickers[typeIndex(this.currentType)].remove(i2);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (z || size != this.recentStickers[typeIndex(this.currentType)].size() || size2 != this.favouriteStickers.size()) {
            updateStickerTabs();
        }
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        if (z) {
            return;
        }
        checkPanels();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == this.currentType) {
                updateStickerTabs();
                reloadStickersAdapter();
                checkPanels();
            }
        } else if (i == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue) {
                return;
            }
            if (intValue == this.currentType || intValue == 2) {
                checkDocuments(false);
            }
        } else if (i == NotificationCenter.emojiLoaded && (recyclerListView = this.gridView) != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.gridView.getChildAt(i3);
                if ((childAt instanceof StickerSetNameCell) || (childAt instanceof StickerEmojiCell)) {
                    childAt.invalidate();
                }
            }
        }
    }

    public class StickersGridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int stickersPerRow;
        private int stickersPerRowType;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private HashMap<Object, Integer> packStartPosition = new HashMap<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParents = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();

        public StickersGridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == -1;
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 0) {
                return i + 1;
            }
            return 0;
        }

        public int getPositionForPack(Object obj) {
            Integer num = this.packStartPosition.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            Object obj = this.cache.get(i);
            if (obj != null) {
                if (obj instanceof TLRPC$Document) {
                    return StickerMasksAlert.this.currentType == 5 ? -1 : 0;
                }
                return 2;
            }
            return 1;
        }

        public int getTabForPosition(int i) {
            if (i == 0) {
                i = 1;
            }
            if (this.stickersPerRow == 0 || this.stickersPerRowType != StickerMasksAlert.this.currentType) {
                int measuredWidth = StickerMasksAlert.this.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.m36dp(StickerMasksAlert.this.currentType == 5 ? 45.0f : 72.0f);
                this.stickersPerRowType = StickerMasksAlert.this.currentType;
            }
            int i2 = this.positionToRow.get(i, Integer.MIN_VALUE);
            if (i2 == Integer.MIN_VALUE) {
                ArrayList[] arrayListArr = StickerMasksAlert.this.stickerSets;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                return (arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].size() - 1) + StickerMasksAlert.this.stickersTabOffset;
            }
            Object obj = this.rowStartPack.get(i2);
            if (obj instanceof String) {
                return "recent".equals(obj) ? StickerMasksAlert.this.recentTabBum : StickerMasksAlert.this.favTabBum;
            }
            ArrayList[] arrayListArr2 = StickerMasksAlert.this.stickerSets;
            StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
            return arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].indexOf((TLRPC$TL_messages_stickerSet) obj) + StickerMasksAlert.this.stickersTabOffset;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerSetNameCell stickerSetNameCell;
            if (i == -1) {
                stickerSetNameCell = new ImageViewEmoji(this.context);
            } else if (i == 0) {
                stickerSetNameCell = new StickerEmojiCell(this.context, false) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (StickerMasksAlert.this.currentType == 5) {
                            super.onMeasure(i2, i2);
                        } else {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(82.0f), 1073741824));
                        }
                    }
                };
            } else if (i == 1) {
                stickerSetNameCell = new EmptyCell(this.context);
            } else if (i == 2) {
                StickerSetNameCell stickerSetNameCell2 = new StickerSetNameCell(this.context, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider);
                stickerSetNameCell2.setTitleColor(-7829368);
                stickerSetNameCell = stickerSetNameCell2;
            } else if (i != 4) {
                stickerSetNameCell = null;
            } else {
                View view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, StickerMasksAlert.this.searchFieldHeight + AndroidUtilities.m36dp(48.0f)));
                stickerSetNameCell = view;
            }
            return new RecyclerListView.Holder(stickerSetNameCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList<TLRPC$Document> arrayList;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == -1) {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) this.cache.get(i);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                imageViewEmoji.document = tLRPC$Document;
                imageViewEmoji.setDocument(tLRPC$Document);
                ArrayList[] arrayListArr = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                if (arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].contains(tLRPC$Document)) {
                    return;
                }
                StickerMasksAlert.this.favouriteStickers.contains(tLRPC$Document);
            } else if (itemViewType == 0) {
                TLRPC$Document tLRPC$Document2 = (TLRPC$Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(tLRPC$Document2, this.cacheParents.get(i), false);
                ArrayList[] arrayListArr2 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                stickerEmojiCell.setRecent(arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].contains(tLRPC$Document2));
            } else {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                    Object obj = this.cache.get(i);
                    if (!(obj instanceof TLRPC$TL_messages_stickerSet)) {
                        ArrayList[] arrayListArr3 = StickerMasksAlert.this.recentStickers;
                        StickerMasksAlert stickerMasksAlert3 = StickerMasksAlert.this;
                        if (obj != arrayListArr3[stickerMasksAlert3.typeIndex(stickerMasksAlert3.currentType)]) {
                            if (obj == StickerMasksAlert.this.favouriteStickers) {
                                stickerSetNameCell.setText(LocaleController.getString("FavoriteStickers", C1072R.string.FavoriteStickers), 0);
                                return;
                            }
                            return;
                        }
                        stickerSetNameCell.setText(LocaleController.getString("RecentStickers", C1072R.string.RecentStickers), 0);
                        return;
                    }
                    TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_messages_stickerSet) obj).set;
                    if (tLRPC$StickerSet != null) {
                        stickerSetNameCell.setText(tLRPC$StickerSet.title, 0);
                        return;
                    }
                    return;
                }
                EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
                if (i == this.totalItems) {
                    int i2 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                    if (i2 == Integer.MIN_VALUE) {
                        emptyCell.setHeight(1);
                        return;
                    }
                    Object obj2 = this.rowStartPack.get(i2);
                    if (obj2 instanceof TLRPC$TL_messages_stickerSet) {
                        arrayList = ((TLRPC$TL_messages_stickerSet) obj2).documents;
                    } else if (!(obj2 instanceof String)) {
                        arrayList = null;
                    } else if ("recent".equals(obj2)) {
                        ArrayList<TLRPC$Document>[] arrayListArr4 = StickerMasksAlert.this.recentStickers;
                        StickerMasksAlert stickerMasksAlert4 = StickerMasksAlert.this;
                        arrayList = arrayListArr4[stickerMasksAlert4.typeIndex(stickerMasksAlert4.currentType)];
                    } else {
                        arrayList = StickerMasksAlert.this.favouriteStickers;
                    }
                    if (arrayList == null) {
                        emptyCell.setHeight(1);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        int height = StickerMasksAlert.this.gridView.getHeight() - (((int) Math.ceil(arrayList.size() / this.stickersPerRow)) * AndroidUtilities.m36dp(82.0f));
                        emptyCell.setHeight(height > 0 ? height : 1);
                        return;
                    } else {
                        emptyCell.setHeight(AndroidUtilities.m36dp(8.0f));
                        return;
                    }
                }
                emptyCell.setHeight(AndroidUtilities.m36dp(82.0f));
            }
        }

        @Override
        public void notifyDataSetChanged() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.StickerMasksAlert.StickersGridAdapter.notifyDataSetChanged():void");
        }
    }

    public class ImageViewEmoji extends BackupImageView {
        ValueAnimator backAnimator;
        private ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public TLRPC$Document document;
        public AnimatedEmojiDrawable drawable;
        private boolean ignoring;
        public int position;
        float pressedProgress;

        public ImageViewEmoji(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            setPadding(AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(3.0f), AndroidUtilities.m36dp(3.0f));
            setBackground(Theme.createRadSelectorDrawable(StickerMasksAlert.this.getThemedColor("listSelectorSDK21"), AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f)));
        }

        private void setDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.drawable;
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this);
            }
            this.drawable = animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        public void setDocument(TLRPC$Document tLRPC$Document) {
            setDrawable(AnimatedEmojiDrawable.make(StickerMasksAlert.this.currentAccount, 2, tLRPC$Document));
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            StickerMasksAlert.ImageViewEmoji.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            ImageViewEmoji.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                    this.pressedProgress = min;
                    this.pressedProgress = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            super.onDraw(canvas);
            canvas.restore();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i);
        }
    }

    public class StickersSearchGridAdapter extends RecyclerListView.SelectionAdapter {
        boolean cleared;
        private Context context;
        private int emojiSearchId;
        private int reqId2;
        private String searchQuery;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParent = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();
        private SparseArray<String> positionToEmoji = new SparseArray<>();
        private ArrayList<TLRPC$TL_messages_stickerSet> localPacks = new ArrayList<>();
        private HashMap<TLRPC$TL_messages_stickerSet, Boolean> localPacksByShortName = new HashMap<>();
        private HashMap<TLRPC$TL_messages_stickerSet, Integer> localPacksByName = new HashMap<>();
        private HashMap<ArrayList<TLRPC$Document>, String> emojiStickers = new HashMap<>();
        private ArrayList<ArrayList<TLRPC$Document>> emojiArrays = new ArrayList<>();
        private Runnable searchRunnable = new RunnableC28911();

        static int access$5604(StickersSearchGridAdapter stickersSearchGridAdapter) {
            int i = stickersSearchGridAdapter.emojiSearchId + 1;
            stickersSearchGridAdapter.emojiSearchId = i;
            return i;
        }

        public class RunnableC28911 implements Runnable {
            RunnableC28911() {
            }

            private void clear() {
                StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                if (stickersSearchGridAdapter.cleared) {
                    return;
                }
                stickersSearchGridAdapter.cleared = true;
                stickersSearchGridAdapter.emojiStickers.clear();
                StickersSearchGridAdapter.this.emojiArrays.clear();
                StickersSearchGridAdapter.this.localPacks.clear();
                StickersSearchGridAdapter.this.localPacksByShortName.clear();
                StickersSearchGridAdapter.this.localPacksByName.clear();
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.StickerMasksAlert.StickersSearchGridAdapter.RunnableC28911.run():void");
            }

            public void lambda$run$0(int i, HashMap hashMap, ArrayList arrayList, String str) {
                if (i != StickersSearchGridAdapter.this.emojiSearchId) {
                    return;
                }
                int size = arrayList.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i2)).emoji;
                    ArrayList arrayList2 = hashMap != null ? (ArrayList) hashMap.get(str2) : null;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        clear();
                        if (!StickersSearchGridAdapter.this.emojiStickers.containsKey(arrayList2)) {
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList2, str2);
                            StickersSearchGridAdapter.this.emojiArrays.add(arrayList2);
                            z = true;
                        }
                    }
                }
                if (!z) {
                    if (StickersSearchGridAdapter.this.reqId2 == 0) {
                        clear();
                        StickersSearchGridAdapter.this.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                StickersSearchGridAdapter.this.notifyDataSetChanged();
            }

            public void lambda$run$2(final TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, final ArrayList arrayList, final LongSparseArray longSparseArray, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StickerMasksAlert.StickersSearchGridAdapter.RunnableC28911.this.lambda$run$1(tLRPC$TL_messages_getStickers, tLObject, arrayList, longSparseArray);
                    }
                });
            }

            public void lambda$run$1(TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
                if (tLRPC$TL_messages_getStickers.emoticon.equals(StickersSearchGridAdapter.this.searchQuery)) {
                    StickerMasksAlert.this.stickersSearchField.progressDrawable.stopAnimation();
                    StickersSearchGridAdapter.this.reqId2 = 0;
                    if (tLObject instanceof TLRPC$TL_messages_stickers) {
                        TLRPC$TL_messages_stickers tLRPC$TL_messages_stickers = (TLRPC$TL_messages_stickers) tLObject;
                        int size = arrayList.size();
                        int size2 = tLRPC$TL_messages_stickers.stickers.size();
                        for (int i = 0; i < size2; i++) {
                            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickers.stickers.get(i);
                            if (longSparseArray.indexOfKey(tLRPC$Document.f865id) < 0) {
                                arrayList.add(tLRPC$Document);
                            }
                        }
                        if (size != arrayList.size()) {
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList, StickersSearchGridAdapter.this.searchQuery);
                            if (size == 0) {
                                StickersSearchGridAdapter.this.emojiArrays.add(arrayList);
                            }
                            StickersSearchGridAdapter.this.notifyDataSetChanged();
                        }
                        if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersSearchGridAdapter) {
                            StickerMasksAlert.this.gridView.setAdapter(StickerMasksAlert.this.stickersSearchGridAdapter);
                        }
                    }
                }
            }
        }

        public StickersSearchGridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == -1;
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 1) {
                return i + 1;
            }
            return 2;
        }

        public void search(String str) {
            if (this.reqId2 != 0) {
                ConnectionsManager.getInstance(StickerMasksAlert.this.currentAccount).cancelRequest(this.reqId2, true);
                this.reqId2 = 0;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchQuery = null;
                this.localPacks.clear();
                this.emojiStickers.clear();
                if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersGridAdapter) {
                    StickerMasksAlert.this.gridView.setAdapter(StickerMasksAlert.this.stickersGridAdapter);
                }
                notifyDataSetChanged();
            } else {
                this.searchQuery = str.toLowerCase();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, 300L);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            if (i == 1 && this.totalItems == 1) {
                return 5;
            }
            Object obj = this.cache.get(i);
            if (obj != null) {
                if (obj instanceof TLRPC$Document) {
                    return StickerMasksAlert.this.currentType == 5 ? -1 : 0;
                }
                return 2;
            }
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            FrameLayout frameLayout;
            if (i == -1) {
                imageViewEmoji = new ImageViewEmoji(this.context);
            } else if (i == 0) {
                imageViewEmoji = new StickerEmojiCell(this.context, false) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (StickerMasksAlert.this.currentType == 5) {
                            super.onMeasure(i2, i2);
                        } else {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(82.0f), 1073741824));
                        }
                    }
                };
            } else if (i == 1) {
                imageViewEmoji = new EmptyCell(this.context);
            } else if (i != 2) {
                if (i == 4) {
                    View view = new View(this.context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, StickerMasksAlert.this.searchFieldHeight + AndroidUtilities.m36dp(48.0f)));
                    frameLayout = view;
                } else if (i != 5) {
                    imageViewEmoji = null;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(((StickerMasksAlert.this.gridView.getMeasuredHeight() - StickerMasksAlert.this.searchFieldHeight) - AndroidUtilities.m36dp(48.0f)) - AndroidUtilities.m36dp(48.0f), 1073741824));
                        }
                    };
                    ImageView imageView = new ImageView(this.context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(C1072R.C1073drawable.stickers_empty);
                    imageView.setColorFilter(new PorterDuffColorFilter(-7038047, PorterDuff.Mode.MULTIPLY));
                    frameLayout2.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 50.0f));
                    TextView textView = new TextView(this.context);
                    textView.setText(LocaleController.getString("NoStickersFound", C1072R.string.NoStickersFound));
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(-7038047);
                    frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                    frameLayout2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    frameLayout = frameLayout2;
                }
                imageViewEmoji = frameLayout;
            } else {
                imageViewEmoji = new StickerSetNameCell(this.context, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == -1) {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) this.cache.get(i);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                imageViewEmoji.document = tLRPC$Document;
                imageViewEmoji.setDocument(tLRPC$Document);
                ArrayList[] arrayListArr = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                if (arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].contains(tLRPC$Document)) {
                    return;
                }
                StickerMasksAlert.this.favouriteStickers.contains(tLRPC$Document);
                return;
            }
            boolean z = false;
            if (itemViewType == 0) {
                TLRPC$Document tLRPC$Document2 = (TLRPC$Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(tLRPC$Document2, null, this.cacheParent.get(i), this.positionToEmoji.get(i), false);
                ArrayList[] arrayListArr2 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                stickerEmojiCell.setRecent((arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].contains(tLRPC$Document2) || StickerMasksAlert.this.favouriteStickers.contains(tLRPC$Document2)) ? true : true);
                return;
            }
            Integer num = null;
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                Object obj = this.cache.get(i);
                if (obj instanceof TLRPC$TL_messages_stickerSet) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.searchQuery) && this.localPacksByShortName.containsKey(tLRPC$TL_messages_stickerSet)) {
                        TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
                        if (tLRPC$StickerSet != null) {
                            stickerSetNameCell.setText(tLRPC$StickerSet.title, 0);
                        }
                        stickerSetNameCell.setUrl(tLRPC$TL_messages_stickerSet.set.short_name, this.searchQuery.length());
                        return;
                    }
                    Integer num2 = this.localPacksByName.get(tLRPC$TL_messages_stickerSet);
                    TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set;
                    if (tLRPC$StickerSet2 != null && num2 != null) {
                        stickerSetNameCell.setText(tLRPC$StickerSet2.title, 0, num2.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                    }
                    stickerSetNameCell.setUrl(null, 0);
                    return;
                }
                return;
            }
            EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
            if (i == this.totalItems) {
                int i2 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                if (i2 == Integer.MIN_VALUE) {
                    emptyCell.setHeight(1);
                    return;
                }
                Object obj2 = this.rowStartPack.get(i2);
                if (obj2 instanceof TLRPC$TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC$TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    emptyCell.setHeight(1);
                    return;
                } else if (num.intValue() != 0) {
                    int height = StickerMasksAlert.this.gridView.getHeight() - (((int) Math.ceil(num.intValue() / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow)) * AndroidUtilities.m36dp(82.0f));
                    emptyCell.setHeight(height > 0 ? height : 1);
                    return;
                } else {
                    emptyCell.setHeight(AndroidUtilities.m36dp(8.0f));
                    return;
                }
            }
            emptyCell.setHeight(AndroidUtilities.m36dp(82.0f));
        }

        @Override
        public void notifyDataSetChanged() {
            int i;
            this.rowStartPack.clear();
            this.positionToRow.clear();
            this.cache.clear();
            this.positionToEmoji.clear();
            this.totalItems = 0;
            int size = this.localPacks.size();
            int i2 = !this.emojiArrays.isEmpty() ? 1 : 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            while (i4 < size + i2) {
                if (i4 == i3) {
                    SparseArray<Object> sparseArray = this.cache;
                    int i6 = this.totalItems;
                    this.totalItems = i6 + 1;
                    sparseArray.put(i6, "search");
                    i5++;
                } else if (i4 < size) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.localPacks.get(i4);
                    ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
                    if (!arrayList.isEmpty()) {
                        int ceil = (int) Math.ceil(arrayList.size() / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow);
                        this.cache.put(this.totalItems, tLRPC$TL_messages_stickerSet);
                        this.positionToRow.put(this.totalItems, i5);
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            int i8 = i7 + 1;
                            int i9 = this.totalItems + i8;
                            int i10 = i5 + 1 + (i7 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow);
                            this.cache.put(i9, arrayList.get(i7));
                            this.cacheParent.put(i9, tLRPC$TL_messages_stickerSet);
                            this.positionToRow.put(i9, i10);
                            i7 = i8;
                        }
                        int i11 = ceil + 1;
                        for (int i12 = 0; i12 < i11; i12++) {
                            this.rowStartPack.put(i5 + i12, tLRPC$TL_messages_stickerSet);
                        }
                        this.totalItems += (ceil * StickerMasksAlert.this.stickersGridAdapter.stickersPerRow) + 1;
                        i5 += i11;
                    }
                } else {
                    int size3 = this.emojiArrays.size();
                    String str = "";
                    int i13 = 0;
                    for (int i14 = 0; i14 < size3; i14++) {
                        ArrayList<TLRPC$Document> arrayList2 = this.emojiArrays.get(i14);
                        String str2 = this.emojiStickers.get(arrayList2);
                        if (str2 != null && !str.equals(str2)) {
                            this.positionToEmoji.put(this.totalItems + i13, str2);
                            str = str2;
                        }
                        int size4 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size4) {
                            int i16 = this.totalItems + i13;
                            int i17 = (i13 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow) + i5;
                            TLRPC$Document tLRPC$Document = arrayList2.get(i15);
                            this.cache.put(i16, tLRPC$Document);
                            int i18 = size;
                            TLRPC$TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(tLRPC$Document));
                            if (stickerSetById != null) {
                                this.cacheParent.put(i16, stickerSetById);
                            }
                            this.positionToRow.put(i16, i17);
                            i13++;
                            i15++;
                            size = i18;
                        }
                    }
                    i = size;
                    int ceil2 = (int) Math.ceil(i13 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow);
                    for (int i19 = 0; i19 < ceil2; i19++) {
                        this.rowStartPack.put(i5 + i19, Integer.valueOf(i13));
                    }
                    this.totalItems += StickerMasksAlert.this.stickersGridAdapter.stickersPerRow * ceil2;
                    i5 += ceil2;
                    i4++;
                    size = i;
                    i3 = -1;
                }
                i = size;
                i4++;
                size = i;
                i3 = -1;
            }
            super.notifyDataSetChanged();
        }
    }
}
