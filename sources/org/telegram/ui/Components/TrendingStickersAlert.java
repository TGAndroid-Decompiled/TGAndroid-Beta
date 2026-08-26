package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Cells.FeaturedStickerSetCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.QrActivity;

public class TrendingStickersAlert extends BottomSheet {
    public final AlertContainerView alertContainerView;
    public final TrendingStickersLayout layout;
    public int scrollOffsetY;
    public final GradientDrawable shapeDrawable;
    public final int topOffset;

    public final class AlertContainerView extends SizeNotifierFrameLayout {
        public boolean gluedToTop;
        public boolean ignoreLayout;
        public final Paint paint;
        public final float[] radii;
        public float statusBarAlpha;
        public ValueAnimator statusBarAnimator;
        public boolean statusBarOpen;
        public boolean statusBarVisible;

        public AlertContainerView(Context context) {
            super(context, null);
            this.paint = new Paint(1);
            this.gluedToTop = false;
            this.ignoreLayout = false;
            this.statusBarVisible = false;
            this.statusBarAlpha = 0.0f;
            this.radii = new float[8];
            setWillNotDraw(false);
            setPadding(((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, 0, ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, 0);
            setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
                public boolean lastIsWidthGreater;
                public int lastKeyboardHeight;

                @Override
                public final void onSizeChanged(int i, boolean z) {
                    if (this.lastKeyboardHeight == i && this.lastIsWidthGreater == z) {
                        return;
                    }
                    this.lastKeyboardHeight = i;
                    this.lastIsWidthGreater = z;
                    if (i > AndroidUtilities.dp(20.0f)) {
                        AlertContainerView alertContainerView = AlertContainerView.this;
                        if (alertContainerView.gluedToTop) {
                            return;
                        }
                        TrendingStickersAlert.this.setAllowNestedScroll(false);
                        alertContainerView.gluedToTop = true;
                    }
                }
            });
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            float fraction = getFraction();
            TrendingStickersAlert trendingStickersAlert = TrendingStickersAlert.this;
            setStatusBarVisible(fraction == 0.0f && !trendingStickersAlert.isDismissed());
            boolean z = this.statusBarAlpha > 0.5f;
            if (this.statusBarOpen != z) {
                this.statusBarOpen = z;
                boolean z2 = AndroidUtilities.computePerceivedBrightness(trendingStickersAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(trendingStickersAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                if (!z) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(trendingStickersAlert.getWindow(), z2);
            }
            if (this.statusBarAlpha > 0.0f) {
                Paint paint = this.paint;
                paint.setColor(trendingStickersAlert.getThemedColor(Theme.key_dialogBackground));
                float f = trendingStickersAlert.scrollOffsetY;
                int i = trendingStickersAlert.topOffset;
                int iMax = (int) Math.max(0.0f, trendingStickersAlert.layout.getTranslationY() + (AndroidUtilities.statusBarHeight - i) + ((1.0f - getFraction()) * i) + f + AndroidUtilities.dp(24.0f));
                canvas2 = canvas;
                canvas2.drawRect(((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, AndroidUtilities.lerp(iMax, -AndroidUtilities.statusBarHeight, this.statusBarAlpha), getMeasuredWidth() - ((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, iMax, paint);
            } else {
                canvas2 = canvas;
            }
            super.dispatchDraw(canvas2);
            canvas2.save();
            canvas2.translate(0.0f, (trendingStickersAlert.layout.getTranslationY() + AndroidUtilities.statusBarHeight) - trendingStickersAlert.topOffset);
            int iDp = AndroidUtilities.dp(36.0f);
            int iDp2 = AndroidUtilities.dp(4.0f);
            int i2 = (int) ((1.0f - fraction) * iDp2 * 2.0f);
            GradientDrawable gradientDrawable = trendingStickersAlert.shapeDrawable;
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
            int themedColor = trendingStickersAlert.getThemedColor(Theme.key_sheet_scrollUp);
            gradientDrawable.setColor(ColorUtils.setAlphaComponent(themedColor, (int) (Color.alpha(themedColor) * fraction)));
            gradientDrawable.setBounds((getWidth() - iDp) / 2, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(trendingStickersAlert.scrollOffsetY, 10.0f, i2), (getWidth() + iDp) / 2, AndroidUtilities.dp(10.0f) + trendingStickersAlert.scrollOffsetY + i2 + iDp2);
            gradientDrawable.draw(canvas2);
            canvas2.restore();
        }

        public final float getFraction() {
            TrendingStickersAlert trendingStickersAlert = TrendingStickersAlert.this;
            return Math.min(1.0f, Math.max(0.0f, trendingStickersAlert.scrollOffsetY / (trendingStickersAlert.topOffset * 2.0f)));
        }

        @Override
        public final float getTranslationY() {
            return TrendingStickersAlert.this.layout.getTranslationY();
        }

        @Override
        public final void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 6), 200L);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TrendingStickersAlert trendingStickersAlert = TrendingStickersAlert.this;
            TrendingStickersAlert.access$100(trendingStickersAlert);
            super.onDraw(canvas);
            float fraction = getFraction();
            int i = trendingStickersAlert.topOffset;
            int i2 = (int) ((1.0f - fraction) * i);
            int i3 = AndroidUtilities.statusBarHeight - i;
            canvas.save();
            canvas.translate(0.0f, trendingStickersAlert.layout.getTranslationY() + i3);
            ((BottomSheet) trendingStickersAlert).shadowDrawable.setBounds(0, (trendingStickersAlert.scrollOffsetY - ((BottomSheet) trendingStickersAlert).backgroundPaddingTop) + i2, getMeasuredWidth(), getMeasuredHeight() + (i3 < 0 ? -i3 : 0));
            ((BottomSheet) trendingStickersAlert).shadowDrawable.draw(canvas);
            if (fraction > 0.0f && fraction < 1.0f) {
                float fDp = AndroidUtilities.dp(12.0f) * fraction;
                GradientDrawable gradientDrawable = trendingStickersAlert.shapeDrawable;
                gradientDrawable.setColor(trendingStickersAlert.getThemedColor(Theme.key_dialogBackground));
                float[] fArr = this.radii;
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable.setBounds(((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, trendingStickersAlert.scrollOffsetY + i2, getWidth() - ((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + trendingStickersAlert.scrollOffsetY + i2);
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                TrendingStickersAlert trendingStickersAlert = TrendingStickersAlert.this;
                if (trendingStickersAlert.scrollOffsetY != 0 && motionEvent.getY() < trendingStickersAlert.scrollOffsetY) {
                    trendingStickersAlert.lambda$showGiftOfferSheet$15();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = AndroidUtilities.statusBarHeight;
            int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i5;
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            int i6 = (int) ((size + iMeasureKeyboardHeight) * 0.2f);
            this.ignoreLayout = true;
            int iDp = AndroidUtilities.dp(20.0f);
            TrendingStickersAlert trendingStickersAlert = TrendingStickersAlert.this;
            if (iMeasureKeyboardHeight > iDp) {
                trendingStickersAlert.layout.glueToTop(true);
                trendingStickersAlert.setAllowNestedScroll(false);
                this.gluedToTop = true;
            } else {
                trendingStickersAlert.layout.glueToTop(false);
                trendingStickersAlert.setAllowNestedScroll(true);
                this.gluedToTop = false;
            }
            trendingStickersAlert.layout.setContentViewPaddingTop(i6);
            if (getPaddingTop() != i5) {
                setPadding(((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, i5, ((BottomSheet) trendingStickersAlert).backgroundPaddingLeft, 0);
            }
            this.ignoreLayout = false;
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return !TrendingStickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public final void setStatusBarVisible(boolean z) {
            if (this.statusBarVisible != z) {
                ValueAnimator valueAnimator = this.statusBarAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.statusBarVisible = z;
                ValueAnimator valueAnimator2 = this.statusBarAnimator;
                if (valueAnimator2 == null) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.statusBarAlpha, z ? 1.0f : 0.0f);
                    this.statusBarAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 28));
                    this.statusBarAnimator.setDuration(200L);
                } else {
                    valueAnimator2.setFloatValues(this.statusBarAlpha, z ? 1.0f : 0.0f);
                }
                this.statusBarAnimator.start();
            }
        }

        @Override
        public final void setTranslationY(float f) {
            TrendingStickersAlert.this.layout.setTranslationY(f);
            invalidate();
        }
    }

    public TrendingStickersAlert(Context context, BaseFragment baseFragment, TrendingStickersLayout trendingStickersLayout, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, true, false);
        this.topOffset = AndroidUtilities.dp(12.0f);
        this.shapeDrawable = new GradientDrawable();
        AlertContainerView alertContainerView = new AlertContainerView(context);
        this.alertContainerView = alertContainerView;
        alertContainerView.addView(trendingStickersLayout, LayoutHelper.createFrame(-1.0f, -1));
        this.containerView = alertContainerView;
        this.layout = trendingStickersLayout;
        trendingStickersLayout.setParentFragment(baseFragment);
        trendingStickersLayout.setOnScrollListener(new AnonymousClass1(this));
    }

    public static void access$100(TrendingStickersAlert trendingStickersAlert) {
        if (trendingStickersAlert.layout.update$1()) {
            trendingStickersAlert.scrollOffsetY = trendingStickersAlert.layout.getContentTopOffset();
            trendingStickersAlert.containerView.invalidate();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        TrendingStickersLayout trendingStickersLayout = this.layout;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(trendingStickersLayout.currentAccount);
        notificationCenter.removeObserver(trendingStickersLayout, NotificationCenter.stickersDidLoad);
        notificationCenter.removeObserver(trendingStickersLayout, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TrendingStickersLayout trendingStickersLayout = this.layout;
        Objects.requireNonNull(trendingStickersLayout);
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(trendingStickersLayout, 22);
        TrendingStickersLayout.AnonymousClass2 anonymousClass2 = trendingStickersLayout.searchView;
        arrayList.add(new ThemeDescription(anonymousClass2.searchBackground, 32, null, null, null, null, Theme.key_dialogSearchBackground));
        ImageView imageView = anonymousClass2.searchIconImageView;
        int i = Theme.key_dialogSearchIcon;
        arrayList.add(new ThemeDescription(imageView, 8, null, null, null, null, i));
        arrayList.add(new ThemeDescription(anonymousClass2.clearSearchImageView, 8, null, null, null, null, i));
        arrayList.add(new ThemeDescription(anonymousClass2.searchEditText, 4, null, null, null, null, Theme.key_dialogSearchText));
        arrayList.add(new ThemeDescription(anonymousClass2.searchEditText, 8388608, null, null, null, null, Theme.key_dialogSearchHint));
        arrayList.add(new ThemeDescription(anonymousClass2.searchEditText, 16777216, null, null, null, null, Theme.key_featuredStickers_addedIcon));
        trendingStickersLayout.adapter.getClass();
        TrendingStickersLayout.AnonymousClass3 anonymousClass3 = trendingStickersLayout.listView;
        FeaturedStickerSetInfoCell.createThemeDescriptions(arrayList, anonymousClass3, chatActivity$$ExternalSyntheticLambda94);
        arrayList.add(new ThemeDescription(anonymousClass3, 4, new Class[]{FeaturedStickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(anonymousClass3, 4, new Class[]{FeaturedStickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(anonymousClass3, 4, new Class[]{FeaturedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(anonymousClass3, 4, new Class[]{FeaturedStickerSetCell.class}, new String[]{"delButton"}, null, null, -1, null, Theme.key_featuredStickers_removeButtonText));
        arrayList.add(new ThemeDescription(anonymousClass3, 0, new Class[]{FeaturedStickerSetCell.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_featuredStickers_buttonProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_featuredStickers_addButtonPressed));
        GraySectionCell.createThemeDescriptions(arrayList, anonymousClass3);
        StickersSearchAdapter stickersSearchAdapter = trendingStickersLayout.searchAdapter;
        stickersSearchAdapter.getClass();
        TrendingStickersLayout.AnonymousClass3 anonymousClass4 = trendingStickersLayout.listView;
        FeaturedStickerSetInfoCell.createThemeDescriptions(arrayList, anonymousClass4, chatActivity$$ExternalSyntheticLambda94);
        int i2 = Theme.key_chat_emojiPanelStickerSetName;
        arrayList.add(new ThemeDescription(anonymousClass4, 4, new Class[]{StickerSetNameCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(anonymousClass4, 4, new Class[]{StickerSetNameCell.class}, new String[]{"urlTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(anonymousClass4, 8, new Class[]{StickerSetNameCell.class}, new String[]{"buttonView"}, null, null, -1, null, Theme.key_chat_emojiPanelStickerSetNameIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_chat_emojiPanelStickerSetNameHighlight));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i2));
        ImageView imageView2 = stickersSearchAdapter.emptyImageView;
        int i3 = Theme.key_chat_emojiPanelEmptyText;
        arrayList.add(new ThemeDescription(imageView2, 8, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(stickersSearchAdapter.emptyTextView, 4, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(trendingStickersLayout.shadowView, 1, null, null, null, null, Theme.key_dialogShadowLine));
        FrameLayout frameLayout = trendingStickersLayout.searchLayout;
        int i4 = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(frameLayout, 1, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.alertContainerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, i4));
        arrayList.add(new ThemeDescription(this.alertContainerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        return arrayList;
    }

    @Override
    public final void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2);
    }

    public final class AnonymousClass1 extends RecyclerView.OnScrollListener {
        public final int $r8$classId;
        public int scrolledY;
        public final Object this$0;

        public AnonymousClass1(TrendingStickersAlert trendingStickersAlert) {
            this.$r8$classId = 0;
            this.this$0 = trendingStickersAlert;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            switch (this.$r8$classId) {
                case 0:
                    if (i == 0) {
                        this.scrolledY = 0;
                    }
                    break;
            }
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.scrolledY += i2;
                    int scrollState = recyclerView.getScrollState();
                    TrendingStickersAlert trendingStickersAlert = (TrendingStickersAlert) this.this$0;
                    if (scrollState == 1 && Math.abs(this.scrolledY) > AndroidUtilities.dp(96.0f)) {
                        View viewFindFocus = trendingStickersAlert.layout.findFocus();
                        if (viewFindFocus == null) {
                            viewFindFocus = trendingStickersAlert.layout;
                        }
                        AndroidUtilities.hideKeyboard(viewFindFocus);
                    }
                    if (i2 != 0) {
                        TrendingStickersAlert.access$100(trendingStickersAlert);
                    }
                    break;
                default:
                    int i3 = this.scrolledY + i2;
                    this.scrolledY = i3;
                    ((QrActivity.ThemeListViewController) this.this$0).topShadow.setAlpha((i3 * 1.0f) / AndroidUtilities.dp(6.0f));
                    break;
            }
        }

        public AnonymousClass1(QrActivity.ThemeListViewController themeListViewController) {
            this.$r8$classId = 1;
            this.this$0 = themeListViewController;
            this.scrolledY = 0;
        }
    }
}
