package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;

public abstract class MentionsContainerView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private MentionsAdapter adapter;
    private int animationIndex;
    private BlurredBackgroundDrawable backgroundDrawable;
    BaseFragment baseFragment;
    private PhotoViewer.PhotoViewerProvider botContextProvider;
    private ArrayList botContextResults;
    private final RectF clipBounds;
    private final Path clipPath;
    private Integer color;
    private float containerBottom;
    private float containerPadding;
    private float containerTop;
    private Delegate delegate;
    private ExtendedGridLayoutManager gridLayoutManager;
    private float hideT;
    private boolean ignoreLayout;
    private LinearLayoutManager linearLayoutManager;
    private MentionsListView listView;
    private boolean listViewHiding;
    private float listViewPadding;
    private SpringAnimation listViewTranslationAnimator;
    private RecyclerListView.OnItemClickListener mentionsOnItemClickListener;
    private PaddedListAdapter paddedAdapter;
    private Paint paint;
    private Rect rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollRangeUpdateTries;
    private boolean scrollToFirst;
    private boolean shouldLiftMentions;
    private boolean shown;
    private boolean switchLayoutManagerOnEnd;
    private Runnable updateVisibilityRunnable;

    public interface Delegate {

        public abstract class CC {
            public static void $default$addEmojiToRecent(Delegate delegate, String str) {
            }

            public static void $default$onStickerSelected(Delegate delegate, TLRPC.TL_document tL_document, String str, Object obj) {
            }

            public static void $default$sendBotInlineResult(Delegate delegate, TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
            }
        }

        void addEmojiToRecent(String str);

        Paint.FontMetricsInt getFontMetrics();

        void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj);

        void replaceText(int i, int i2, CharSequence charSequence, boolean z);

        void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i);
    }

    public static void lambda$updateListViewTranslation$3(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
    }

    protected boolean canOpen() {
        return true;
    }

    protected boolean isStories() {
        return false;
    }

    protected void onAnimationScroll() {
    }

    protected void onClose() {
    }

    protected void onContextClick(TLRPC.BotInlineResult botInlineResult) {
    }

    protected void onContextSearch(boolean z) {
    }

    protected void onOpen() {
    }

    protected void onScrolled(boolean z, boolean z2) {
    }

    public MentionsContainerView(Context context, long j, long j2, final BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.shouldLiftMentions = false;
        this.rect = new Rect();
        this.ignoreLayout = false;
        this.scrollToFirst = false;
        this.shown = false;
        this.updateVisibilityRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.animationIndex = -1;
        this.listViewHiding = false;
        this.hideT = 0.0f;
        this.switchLayoutManagerOnEnd = false;
        this.botContextProvider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public org.telegram.ui.PhotoViewer.PlaceProviderObject getPlaceForPhoto(org.telegram.messenger.MessageObject r4, org.telegram.tgnet.TLRPC.FileLocation r5, int r6, boolean r7, boolean r8) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MentionsContainerView.AnonymousClass5.getPlaceForPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.PhotoViewer$PlaceProviderObject");
            }

            @Override
            public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                if (i < 0 || i >= MentionsContainerView.this.botContextResults.size()) {
                    return;
                }
                MentionsContainerView.this.delegate.sendBotInlineResult((TLRPC.BotInlineResult) MentionsContainerView.this.botContextResults.get(i), z, i2);
            }
        };
        this.clipPath = new Path();
        this.clipBounds = new RectF();
        this.baseFragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        this.listView = new MentionsListView(context, resourcesProvider);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public void setReverseLayout(boolean z) {
                super.setReverseLayout(z);
                MentionsContainerView.this.listView.setTranslationY((z ? -1 : 1) * AndroidUtilities.dp(6.0f));
            }
        };
        this.linearLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 100, false, false) {
            private Size size = new Size();

            @Override
            protected Size getSizeForItem(int i) {
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                Size size = this.size;
                int i2 = 0;
                size.full = false;
                if (i != 0) {
                    int i3 = i - 1;
                    if (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.getBotWebViewSwitch() == null) {
                        i = i3;
                    }
                    Size size2 = this.size;
                    size2.width = 0.0f;
                    size2.height = 0.0f;
                    Object item = MentionsContainerView.this.adapter.getItem(i);
                    if (item instanceof TLRPC.BotInlineResult) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
                        TLRPC.Document document = botInlineResult.document;
                        if (document != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            Size size3 = this.size;
                            size3.width = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                            size3.height = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                            while (i2 < botInlineResult.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                    Size size4 = this.size;
                                    size4.width = documentAttribute.w;
                                    size4.height = documentAttribute.h;
                                    break;
                                }
                                i2++;
                            }
                        } else if (botInlineResult.content != null) {
                            while (i2 < botInlineResult.content.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                                    Size size5 = this.size;
                                    size5.width = documentAttribute2.w;
                                    size5.height = documentAttribute2.h;
                                    break;
                                }
                                i2++;
                            }
                        } else if (botInlineResult.thumb != null) {
                            while (i2 < botInlineResult.thumb.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                                if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                                    Size size6 = this.size;
                                    size6.width = documentAttribute3.w;
                                    size6.height = documentAttribute3.h;
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                                Size size7 = this.size;
                                size7.width = closestPhotoSizeWithSize.w;
                                size7.height = closestPhotoSizeWithSize.h;
                            }
                        }
                    }
                    return this.size;
                }
                size.width = getWidth();
                this.size.height = MentionsContainerView.this.paddedAdapter.getPadding();
                Size size8 = this.size;
                size8.full = true;
                return size8;
            }

            @Override
            protected int getFlowItemCount() {
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null || MentionsContainerView.this.adapter.getBotWebViewSwitch() != null) {
                    return getItemCount() - 1;
                }
                return super.getFlowItemCount();
            }
        };
        this.gridLayoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                if (i == 0) {
                    return 100;
                }
                int i2 = i - 1;
                Object item = MentionsContainerView.this.adapter.getItem(i2);
                if (item instanceof TLRPC.TL_inlineBotSwitchPM) {
                    return 100;
                }
                if (item instanceof TLRPC.Document) {
                    return 20;
                }
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null || MentionsContainerView.this.adapter.getBotWebViewSwitch() != null) {
                    i = i2;
                }
                return MentionsContainerView.this.gridLayoutManager.getSpanSizeForItem(i);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(150L);
        defaultItemAnimator.setChangeDuration(150L);
        defaultItemAnimator.setRemoveDuration(150L);
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setClipToPadding(false);
        this.listView.setLayoutManager(this.linearLayoutManager);
        MentionsAdapter mentionsAdapter = new MentionsAdapter(context, false, j, j2, new MentionsAdapter.MentionsAdapterDelegate() {
            @Override
            public void onItemCountUpdate(int i, int i2) {
                if (MentionsContainerView.this.listView.getLayoutManager() == MentionsContainerView.this.gridLayoutManager || !MentionsContainerView.this.shown) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(MentionsContainerView.this.updateVisibilityRunnable);
                AndroidUtilities.runOnUIThread(MentionsContainerView.this.updateVisibilityRunnable, baseFragment.getFragmentBeginToShow() ? 0L : 100L);
            }

            @Override
            public void needChangePanelVisibility(boolean z) {
                if (MentionsContainerView.this.getNeededLayoutManager() != MentionsContainerView.this.getCurrentLayoutManager() && MentionsContainerView.this.canOpen()) {
                    if (MentionsContainerView.this.adapter.getLastItemCount() > 0) {
                        MentionsContainerView.this.switchLayoutManagerOnEnd = true;
                        MentionsContainerView.this.updateVisibility(false);
                        return;
                    }
                    MentionsContainerView.this.listView.setLayoutManager(MentionsContainerView.this.getNeededLayoutManager());
                }
                if (z && !MentionsContainerView.this.canOpen()) {
                    z = false;
                }
                MentionsContainerView.this.updateVisibility((!z || MentionsContainerView.this.adapter.getItemCountInternal() > 0) ? z : false);
            }

            @Override
            public void onContextSearch(boolean z) {
                MentionsContainerView.this.onContextSearch(z);
            }

            @Override
            public void onContextClick(TLRPC.BotInlineResult botInlineResult) {
                MentionsContainerView.this.onContextClick(botInlineResult);
            }
        }, resourcesProvider, isStories());
        this.adapter = mentionsAdapter;
        PaddedListAdapter paddedListAdapter = new PaddedListAdapter(mentionsAdapter);
        this.paddedAdapter = paddedListAdapter;
        this.listView.setAdapter(paddedListAdapter);
        this.listView.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        setReversed(false);
    }

    public MentionsListView getListView() {
        return this.listView;
    }

    public MentionsAdapter getAdapter() {
        return this.adapter;
    }

    public void setReversed(boolean z) {
        if (z != isReversed()) {
            this.scrollToFirst = true;
            this.linearLayoutManager.setReverseLayout(z);
            this.adapter.setIsReversed(z);
        }
    }

    public boolean isReversed() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager && linearLayoutManager.getReverseLayout();
    }

    public LinearLayoutManager getCurrentLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager ? linearLayoutManager : this.gridLayoutManager;
    }

    public LinearLayoutManager getNeededLayoutManager() {
        return ((this.adapter.isStickers() || this.adapter.isBotContext()) && this.adapter.isMediaLayout()) ? this.gridLayoutManager : this.linearLayoutManager;
    }

    public float clipBottom() {
        if (getVisibility() == 0 && !isReversed()) {
            return getMeasuredHeight() - this.containerTop;
        }
        return 0.0f;
    }

    public float clipTop() {
        if (getVisibility() == 0 && isReversed()) {
            return this.containerBottom;
        }
        return 0.0f;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float fMin;
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas);
            canvas.save();
            canvas.clipPath(this.clipPath);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean zIsReversed = isReversed();
        this.containerPadding = AndroidUtilities.dp(((this.adapter.isStickers() || this.adapter.isBotContext()) && this.adapter.isMediaLayout() && this.adapter.getBotContextSwitch() == null && this.adapter.getBotWebViewSwitch() == null ? 2 : 0) + 2);
        canvas.save();
        float fDp = AndroidUtilities.dp(6.0f);
        float f = this.containerTop;
        if (zIsReversed) {
            float fMin2 = Math.min(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? r0.paddingView.getTop() : getHeight()) + this.listView.getTranslationY()) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            Rect rect = this.rect;
            this.containerTop = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.containerBottom = fMin2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) fMin2);
            fMin = Math.min(fDp, Math.abs(getMeasuredHeight() - this.containerBottom));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                this.rect.top -= (int) fMin;
            }
        } else {
            if (this.listView.getLayoutManager() == this.gridLayoutManager) {
                this.containerPadding += AndroidUtilities.dp(2.0f);
                fDp += AndroidUtilities.dp(2.0f);
            }
            float fMax = Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? r0.paddingView.getBottom() : 0) + this.listView.getTranslationY()) - this.containerPadding;
            this.containerTop = fMax;
            float fMax2 = Math.max(fMax, this.hideT * getHeight());
            Rect rect2 = this.rect;
            this.containerTop = fMax2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.containerBottom = measuredHeight;
            rect2.set(0, (int) fMax2, measuredWidth2, (int) measuredHeight);
            fMin = Math.min(fDp, Math.abs(this.containerTop));
            if (fMin > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                this.rect.bottom += (int) fMin;
            }
        }
        if (Math.abs(f - this.containerTop) > 0.1f) {
            onAnimationScroll();
        }
        if (this.paint == null) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.paint;
        Integer num = this.color;
        paint2.setColor(num != null ? num.intValue() : getThemedColor(Theme.key_chat_messagePanelBackground));
        drawRoundRect(canvas, this.rect, fMin);
        canvas.clipRect(this.rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void drawRoundRect(Canvas canvas, Rect rect, float f) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f, f, this.paint);
    }

    public void setOverrideColor(int i) {
        this.color = Integer.valueOf(i);
        invalidate();
    }

    public void setIgnoreLayout(boolean z) {
        this.ignoreLayout = z;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void lambda$new$0() {
        updateListViewTranslation(!this.shown, true);
    }

    public void updateVisibility(boolean z) {
        if (z) {
            boolean zIsReversed = isReversed();
            if (!this.shown) {
                this.scrollToFirst = true;
                RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                if (layoutManager == linearLayoutManager) {
                    linearLayoutManager.scrollToPositionWithOffset(0, zIsReversed ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.hideT = 1.0f;
                    this.listView.setTranslationY(zIsReversed ? -(this.listViewPadding + AndroidUtilities.dp(12.0f)) : r2.computeVerticalScrollOffset() + this.listViewPadding);
                }
            }
            setVisibility(0);
        } else {
            this.scrollToFirst = false;
        }
        this.shown = z;
        AndroidUtilities.cancelRunOnUIThread(this.updateVisibilityRunnable);
        SpringAnimation springAnimation = this.listViewTranslationAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        Runnable runnable = this.updateVisibilityRunnable;
        BaseFragment baseFragment = this.baseFragment;
        AndroidUtilities.runOnUIThread(runnable, (baseFragment == null || !baseFragment.getFragmentBeginToShow()) ? 100L : 0L);
        if (z) {
            onOpen();
        } else {
            onClose();
        }
    }

    public boolean isOpen() {
        return this.shown;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        checkListViewPadding();
        super.onMeasure(i, i2);
    }

    private void updateListViewTranslation(final boolean z, boolean z2) {
        float fDp;
        int i;
        float fMax;
        SpringAnimation springAnimation;
        if (this.listView == null || this.paddedAdapter == null) {
            this.scrollRangeUpdateTries = 0;
            return;
        }
        if (this.listViewHiding && (springAnimation = this.listViewTranslationAnimator) != null && springAnimation.isRunning() && z) {
            this.scrollRangeUpdateTries = 0;
            return;
        }
        boolean zIsReversed = isReversed();
        if (z) {
            fDp = (-this.containerPadding) - AndroidUtilities.dp(6.0f);
        } else {
            int iComputeVerticalScrollRange = this.listView.computeVerticalScrollRange();
            float padding = (iComputeVerticalScrollRange - this.paddedAdapter.getPadding()) + this.containerPadding;
            if (iComputeVerticalScrollRange <= 0 && this.adapter.getItemCountInternal() > 0 && (i = this.scrollRangeUpdateTries) < 3) {
                this.scrollRangeUpdateTries = i + 1;
                updateVisibility(true);
                return;
            }
            fDp = padding;
        }
        this.scrollRangeUpdateTries = 0;
        if (zIsReversed) {
            fMax = -Math.max(0.0f, this.listViewPadding - fDp);
        } else {
            float f = this.listViewPadding;
            fMax = Math.max(0.0f, f - fDp) + (-f);
        }
        if (z && !zIsReversed) {
            fMax += this.listView.computeVerticalScrollOffset();
        }
        final float f2 = fMax;
        SpringAnimation springAnimation2 = this.listViewTranslationAnimator;
        if (springAnimation2 != null) {
            springAnimation2.cancel();
        }
        Integer numValueOf = null;
        if (z2) {
            this.listViewHiding = z;
            final float translationY = this.listView.getTranslationY();
            final float f3 = this.hideT;
            final float f4 = z ? 1.0f : 0.0f;
            if (translationY == f2) {
                this.listViewTranslationAnimator = null;
                numValueOf = Integer.valueOf(z ? 8 : 0);
                if (this.switchLayoutManagerOnEnd && z) {
                    this.switchLayoutManagerOnEnd = false;
                    this.listView.setLayoutManager(getNeededLayoutManager());
                    this.shown = true;
                    updateVisibility(true);
                }
            } else {
                SpringAnimation spring = new SpringAnimation(new FloatValueHolder(translationY)).setSpring(new SpringForce(f2).setDampingRatio(1.0f).setStiffness(550.0f));
                this.listViewTranslationAnimator = spring;
                spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f5, float f6) {
                        this.f$0.lambda$updateListViewTranslation$1(f3, f4, translationY, f2, dynamicAnimation, f5, f6);
                    }
                });
                if (z) {
                    this.listViewTranslationAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f5, float f6) {
                            this.f$0.lambda$updateListViewTranslation$2(z, dynamicAnimation, z3, f5, f6);
                        }
                    });
                }
                this.listViewTranslationAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f5, float f6) {
                        MentionsContainerView.lambda$updateListViewTranslation$3(dynamicAnimation, z3, f5, f6);
                    }
                });
                this.listViewTranslationAnimator.start();
            }
        } else {
            this.hideT = z ? 1.0f : 0.0f;
            this.listView.setTranslationY(f2);
            if (z) {
                numValueOf = 8;
            }
        }
        if (numValueOf == null || getVisibility() == numValueOf.intValue()) {
            return;
        }
        setVisibility(numValueOf.intValue());
    }

    public void lambda$updateListViewTranslation$1(float f, float f2, float f3, float f4, DynamicAnimation dynamicAnimation, float f5, float f6) {
        this.listView.setTranslationY(f5);
        onAnimationScroll();
        this.hideT = AndroidUtilities.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    public void lambda$updateListViewTranslation$2(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (z2) {
            return;
        }
        this.listViewTranslationAnimator = null;
        setVisibility(z ? 8 : 0);
        if (this.switchLayoutManagerOnEnd && z) {
            this.switchLayoutManagerOnEnd = false;
            this.listView.setLayoutManager(getNeededLayoutManager());
            this.shown = true;
            updateVisibility(true);
        }
    }

    public void setDialogId(long j) {
        this.adapter.setDialogId(j);
    }

    public void withDelegate(final Delegate delegate) {
        this.delegate = delegate;
        MentionsListView listView = getListView();
        RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) throws Resources.NotFoundException, NumberFormatException {
                this.f$0.lambda$withDelegate$4(delegate, view, i);
            }
        };
        this.mentionsOnItemClickListener = onItemClickListener;
        listView.setOnItemClickListener(onItemClickListener);
        getListView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.lambda$withDelegate$5(view, motionEvent);
            }
        });
    }

    public void lambda$withDelegate$4(Delegate delegate, View view, int i) throws Resources.NotFoundException, NumberFormatException {
        Paint.FontMetricsInt fontMetrics;
        AnimatedEmojiSpan animatedEmojiSpan;
        if (i == 0 || getAdapter().isBannedInline()) {
            return;
        }
        int i2 = i - 1;
        Object item = getAdapter().getItem(i2);
        int resultStartPosition = getAdapter().getResultStartPosition();
        int resultLength = getAdapter().getResultLength();
        String str = "";
        if (getAdapter().isLocalHashtagHint(i2)) {
            TLRPC.Chat currentChat = getAdapter().chat;
            if (currentChat == null && getAdapter().parentFragment != null) {
                currentChat = getAdapter().parentFragment.getCurrentChat();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(getAdapter().getHashtagHint());
            if (currentChat != null) {
                str = "@" + ChatObject.getPublicUsername(currentChat);
            }
            sb.append(str);
            sb.append(" ");
            delegate.replaceText(resultStartPosition, resultLength, sb.toString(), false);
            return;
        }
        if (getAdapter().isGlobalHashtagHint(i2)) {
            delegate.replaceText(resultStartPosition, resultLength, getAdapter().getHashtagHint() + " ", false);
            return;
        }
        if (item instanceof TLRPC.TL_document) {
            if (view instanceof StickerCell) {
                ((StickerCell) view).getSendAnimationData();
            }
            TLRPC.TL_document tL_document = (TLRPC.TL_document) item;
            delegate.onStickerSelected(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), getAdapter().getItemParent(i2));
        } else if (item instanceof TLRPC.Chat) {
            String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) item);
            if (publicUsername != null) {
                delegate.replaceText(resultStartPosition, resultLength, "@" + publicUsername + " ", false);
            }
        } else if (item instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) item;
            if (UserObject.getPublicUsername(user) != null) {
                delegate.replaceText(resultStartPosition, resultLength, "@" + UserObject.getPublicUsername(user) + " ", false);
            } else {
                SpannableString spannableString = new SpannableString(UserObject.getFirstName(user, false) + " ");
                spannableString.setSpan(new URLSpanUserMention("" + user.id, 3), 0, spannableString.length(), 33);
                delegate.replaceText(resultStartPosition, resultLength, spannableString, false);
            }
        } else if (item instanceof String) {
            delegate.replaceText(resultStartPosition, resultLength, item + " ", false);
        } else if (item instanceof MediaDataController.KeywordResult) {
            String str2 = ((MediaDataController.KeywordResult) item).emoji;
            delegate.addEmojiToRecent(str2);
            if (str2 != null && str2.startsWith("animated_")) {
                try {
                    try {
                        fontMetrics = delegate.getFontMetrics();
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                        fontMetrics = null;
                    }
                    long j = Long.parseLong(str2.substring(9));
                    TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j);
                    SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentFindDocument));
                    if (documentFindDocument != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(documentFindDocument, fontMetrics);
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, fontMetrics);
                    }
                    spannableString2.setSpan(animatedEmojiSpan, 0, spannableString2.length(), 33);
                    delegate.replaceText(resultStartPosition, resultLength, spannableString2, false);
                } catch (Exception unused) {
                    delegate.replaceText(resultStartPosition, resultLength, str2, true);
                }
            } else {
                delegate.replaceText(resultStartPosition, resultLength, str2, true);
            }
            updateVisibility(false);
        }
        if (item instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                ArrayList arrayList = new ArrayList(getAdapter().getSearchResultBotContext());
                this.botContextResults = arrayList;
                PhotoViewer.getInstance().setParentActivity(this.baseFragment, this.resourcesProvider);
                PhotoViewer.getInstance().openPhotoForSelect(arrayList, getAdapter().getItemPosition(i2), 3, false, this.botContextProvider, null);
                return;
            }
            delegate.sendBotInlineResult(botInlineResult, true, 0);
        }
    }

    public boolean lambda$withDelegate$5(View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, getListView(), 0, this.mentionsOnItemClickListener, null, this.resourcesProvider);
    }

    public class MentionsListView extends RecyclerListView {
        private boolean isDragging;
        private boolean isScrolling;
        private int lastHeight;
        private int lastWidth;

        public MentionsListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    MentionsListView.this.isScrolling = i != 0;
                    MentionsListView.this.isDragging = i == 1;
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int iFindLastVisibleItemPosition = MentionsListView.this.getLayoutManager() == MentionsContainerView.this.gridLayoutManager ? MentionsContainerView.this.gridLayoutManager.findLastVisibleItemPosition() : MentionsContainerView.this.linearLayoutManager.findLastVisibleItemPosition();
                    if ((iFindLastVisibleItemPosition == -1 ? 0 : iFindLastVisibleItemPosition) > 0 && iFindLastVisibleItemPosition > MentionsContainerView.this.adapter.getLastItemCount() - 5) {
                        MentionsContainerView.this.adapter.searchForContextBotForNextOffset();
                    }
                    MentionsContainerView.this.onScrolled(!r2.canScrollVertically(-1), true ^ MentionsListView.this.canScrollVertically(1));
                    MentionsContainerView.this.checkBackgroundBounds();
                }
            });
            addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    if (recyclerView.getLayoutManager() != MentionsContainerView.this.gridLayoutManager || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == 0 || MentionsContainerView.this.adapter.isStickers()) {
                        return;
                    }
                    if (MentionsContainerView.this.adapter.getBotContextSwitch() == null && MentionsContainerView.this.adapter.getBotWebViewSwitch() == null) {
                        rect.top = AndroidUtilities.dp(2.0f);
                    } else {
                        if (childAdapterPosition == 0) {
                            return;
                        }
                        childAdapterPosition--;
                        if (!MentionsContainerView.this.gridLayoutManager.isFirstRow(childAdapterPosition)) {
                            rect.top = AndroidUtilities.dp(2.0f);
                        }
                    }
                    rect.right = MentionsContainerView.this.gridLayoutManager.isLastInRow(childAdapterPosition) ? 0 : AndroidUtilities.dp(2.0f);
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (MentionsContainerView.this.linearLayoutManager.getReverseLayout()) {
                if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() > MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() < MentionsContainerView.this.paddedAdapter.paddingView.getBottom()) {
                return false;
            }
            boolean z = !this.isScrolling && ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, MentionsContainerView.this.listView, 0, null, this.resourcesProvider);
            if ((MentionsContainerView.this.adapter.isStickers() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) {
                MentionsContainerView.this.adapter.doSomeStickersAction();
            }
            return super.onInterceptTouchEvent(motionEvent) || z;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (MentionsContainerView.this.linearLayoutManager.getReverseLayout()) {
                if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() > MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() < MentionsContainerView.this.paddedAdapter.paddingView.getBottom()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestLayout() {
            if (MentionsContainerView.this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int top;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            boolean zIsReversed = MentionsContainerView.this.isReversed();
            LinearLayoutManager currentLayoutManager = MentionsContainerView.this.getCurrentLayoutManager();
            int iFindFirstVisibleItemPosition = zIsReversed ? currentLayoutManager.findFirstVisibleItemPosition() : currentLayoutManager.findLastVisibleItemPosition();
            View viewFindViewByPosition = currentLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                top = viewFindViewByPosition.getTop() - (zIsReversed ? 0 : this.lastHeight - i6);
            } else {
                top = 0;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (MentionsContainerView.this.scrollToFirst) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(0, 100000);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
                MentionsContainerView.this.scrollToFirst = false;
            } else if (iFindFirstVisibleItemPosition != -1 && i5 == this.lastWidth && i6 - this.lastHeight != 0) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, top, false);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
            }
            this.lastHeight = i6;
            this.lastWidth = i5;
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            MentionsContainerView.this.invalidate();
            MentionsContainerView.this.checkBackgroundBounds();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            if (MentionsContainerView.this.paddedAdapter != null) {
                MentionsContainerView.this.paddedAdapter.setPadding(size);
            }
            MentionsContainerView.this.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) MentionsContainerView.this.listViewPadding), 1073741824));
        }

        @Override
        public void onScrolled(int i, int i2) {
            super.onScrolled(i, i2);
            MentionsContainerView.this.invalidate();
            MentionsContainerView.this.checkBackgroundBounds();
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    MentionsContainerView.lambda$didReceivedNotification$6((View) obj);
                }
            });
        }
    }

    public static void lambda$didReceivedNotification$6(View view) {
        if (view instanceof MentionCell) {
            ((MentionCell) view).invalidateEmojis();
        } else if (view instanceof QuickRepliesActivity.QuickReplyView) {
            ((QuickRepliesActivity.QuickReplyView) view).invalidateEmojis();
        } else {
            view.invalidate();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkBackgroundBounds();
    }

    public void setBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
        this.backgroundDrawable.setPadding(AndroidUtilities.dp(5.0f));
        checkListViewPadding();
    }

    public void checkBackgroundBounds() {
        if (this.listView == null || this.linearLayoutManager == null) {
            return;
        }
        boolean zIsReversed = isReversed();
        this.containerPadding = 0.0f;
        if (zIsReversed) {
            float fMin = Math.min(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? r0.paddingView.getTop() : getHeight()) + this.listView.getTranslationY()) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            this.containerTop = 0.0f;
            this.containerBottom = fMin;
        } else {
            this.containerTop = Math.max(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? r0.paddingView.getBottom() : 0) + this.listView.getTranslationY()) - this.containerPadding, this.hideT * getHeight());
            this.containerBottom = getMeasuredHeight();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, ((int) this.containerTop) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), ((int) this.containerBottom) + AndroidUtilities.dp(5.0f));
            this.clipPath.rewind();
            this.clipBounds.set(this.backgroundDrawable.getPaddedBounds());
            if (isGif()) {
                this.clipBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                this.clipPath.addRoundRect(this.clipBounds, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            } else {
                this.clipPath.addRoundRect(this.clipBounds, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
            }
            this.clipPath.close();
            invalidate();
        }
    }

    private boolean isGif() {
        MentionsAdapter mentionsAdapter;
        MentionsListView mentionsListView = this.listView;
        return (mentionsListView == null || this.gridLayoutManager == null || mentionsListView.getLayoutManager() != this.gridLayoutManager || (mentionsAdapter = this.adapter) == null || !mentionsAdapter.isBotContext()) ? false : true;
    }

    private void checkListViewPadding() {
        if (this.listView == null || this.linearLayoutManager == null) {
            return;
        }
        boolean zIsGif = isGif();
        if (this.backgroundDrawable == null) {
            this.listView.setPadding(0, 0, 0, 0);
        } else {
            this.listView.setPadding(AndroidUtilities.dp(zIsGif ? 7.0f : 5.0f), zIsGif ? AndroidUtilities.dp(2.0f) : 0, AndroidUtilities.dp(zIsGif ? 7.0f : 5.0f), zIsGif ? AndroidUtilities.dp(2.0f) : 0);
        }
    }
}
