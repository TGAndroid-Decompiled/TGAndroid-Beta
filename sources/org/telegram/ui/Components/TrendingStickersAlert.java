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
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
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

public class TrendingStickersAlert extends BottomSheet {
    private final AlertContainerView alertContainerView;
    private final TrendingStickersLayout layout;
    private int scrollOffsetY;
    private final GradientDrawable shapeDrawable;
    private final int topOffset;

    public class AlertContainerView extends SizeNotifierFrameLayout {
        private boolean gluedToTop;
        private boolean ignoreLayout;
        private final Paint paint;
        private float[] radii;
        private float statusBarAlpha;
        private ValueAnimator statusBarAnimator;
        private boolean statusBarOpen;
        private boolean statusBarVisible;

        public AlertContainerView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.gluedToTop = false;
            this.ignoreLayout = false;
            this.statusBarVisible = false;
            this.statusBarAlpha = 0.0f;
            this.radii = new float[8];
            setWillNotDraw(false);
            setPadding(((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, 0, ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, 0);
            setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
                private boolean lastIsWidthGreater;
                private int lastKeyboardHeight;

                @Override
                public void onSizeChanged(int i, boolean z) {
                    if (this.lastKeyboardHeight == i && this.lastIsWidthGreater == z) {
                        return;
                    }
                    this.lastKeyboardHeight = i;
                    this.lastIsWidthGreater = z;
                    if (i <= AndroidUtilities.dp(20.0f) || AlertContainerView.this.gluedToTop) {
                        return;
                    }
                    TrendingStickersAlert.this.setAllowNestedScroll(false);
                    AlertContainerView.this.gluedToTop = true;
                }
            });
        }

        private float getFraction() {
            return Math.min(1.0f, Math.max(0.0f, TrendingStickersAlert.this.scrollOffsetY / (TrendingStickersAlert.this.topOffset * 2.0f)));
        }

        public void lambda$setStatusBarVisible$0(ValueAnimator valueAnimator) {
            this.statusBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        private void setStatusBarVisible(boolean z, boolean z2) {
            if (this.statusBarVisible != z) {
                ValueAnimator valueAnimator = this.statusBarAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.statusBarVisible = z;
                if (!z2) {
                    this.statusBarAlpha = z ? 1.0f : 0.0f;
                    invalidate();
                    return;
                }
                ValueAnimator valueAnimator2 = this.statusBarAnimator;
                if (valueAnimator2 == null) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.statusBarAlpha, z ? 1.0f : 0.0f);
                    this.statusBarAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 20));
                    this.statusBarAnimator.setDuration(200L);
                } else {
                    valueAnimator2.setFloatValues(this.statusBarAlpha, z ? 1.0f : 0.0f);
                }
                this.statusBarAnimator.start();
            }
        }

        private void updateLightStatusBar(boolean z) {
            if (this.statusBarOpen != z) {
                this.statusBarOpen = z;
                boolean z2 = AndroidUtilities.computePerceivedBrightness(TrendingStickersAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(TrendingStickersAlert.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                if (!z) {
                    z2 = z3;
                }
                AndroidUtilities.setLightStatusBar(TrendingStickersAlert.this.getWindow(), z2);
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            float fraction = getFraction();
            setStatusBarVisible(fraction == 0.0f && !TrendingStickersAlert.this.isDismissed(), true);
            updateLightStatusBar(this.statusBarAlpha > 0.5f);
            if (this.statusBarAlpha > 0.0f) {
                this.paint.setColor(TrendingStickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                int iMax = (int) Math.max(0.0f, TrendingStickersAlert.this.layout.getTranslationY() + (AndroidUtilities.statusBarHeight - TrendingStickersAlert.this.topOffset) + DiffUtil.m(1.0f, getFraction(), TrendingStickersAlert.this.topOffset, TrendingStickersAlert.this.scrollOffsetY) + AndroidUtilities.dp(24.0f));
                canvas2 = canvas;
                canvas2.drawRect(((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, AndroidUtilities.lerp(iMax, -AndroidUtilities.statusBarHeight, this.statusBarAlpha), getMeasuredWidth() - ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, iMax, this.paint);
            } else {
                canvas2 = canvas;
            }
            super.dispatchDraw(canvas2);
            canvas2.save();
            canvas2.translate(0.0f, (TrendingStickersAlert.this.layout.getTranslationY() + AndroidUtilities.statusBarHeight) - TrendingStickersAlert.this.topOffset);
            int iDp = AndroidUtilities.dp(36.0f);
            int iDp2 = AndroidUtilities.dp(4.0f);
            int i = (int) ((1.0f - fraction) * iDp2 * 2.0f);
            TrendingStickersAlert.this.shapeDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
            int themedColor = TrendingStickersAlert.this.getThemedColor(Theme.key_sheet_scrollUp);
            TrendingStickersAlert.this.shapeDrawable.setColor(ColorUtils.setAlphaComponent(themedColor, (int) (Color.alpha(themedColor) * fraction)));
            TrendingStickersAlert.this.shapeDrawable.setBounds((getWidth() - iDp) / 2, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, TrendingStickersAlert.this.scrollOffsetY, i), (getWidth() + iDp) / 2, AndroidUtilities.dp(10.0f) + TrendingStickersAlert.this.scrollOffsetY + i + iDp2);
            TrendingStickersAlert.this.shapeDrawable.draw(canvas2);
            canvas2.restore();
        }

        @Override
        public float getTranslationY() {
            return TrendingStickersAlert.this.layout.getTranslationY();
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this, 11), 200L);
        }

        @Override
        public void onDraw(Canvas canvas) {
            TrendingStickersAlert.this.updateLayout();
            super.onDraw(canvas);
            float fraction = getFraction();
            int i = (int) ((1.0f - fraction) * TrendingStickersAlert.this.topOffset);
            int i2 = AndroidUtilities.statusBarHeight - TrendingStickersAlert.this.topOffset;
            canvas.save();
            canvas.translate(0.0f, TrendingStickersAlert.this.layout.getTranslationY() + i2);
            ((BottomSheet) TrendingStickersAlert.this).shadowDrawable.setBounds(0, (TrendingStickersAlert.this.scrollOffsetY - ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingTop) + i, getMeasuredWidth(), getMeasuredHeight() + (i2 < 0 ? -i2 : 0));
            ((BottomSheet) TrendingStickersAlert.this).shadowDrawable.draw(canvas);
            if (fraction > 0.0f && fraction < 1.0f) {
                float fDp = AndroidUtilities.dp(12.0f) * fraction;
                TrendingStickersAlert.this.shapeDrawable.setColor(TrendingStickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                float[] fArr = this.radii;
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                TrendingStickersAlert.this.shapeDrawable.setCornerRadii(this.radii);
                TrendingStickersAlert.this.shapeDrawable.setBounds(((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, TrendingStickersAlert.this.scrollOffsetY + i, getWidth() - ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + TrendingStickersAlert.this.scrollOffsetY + i);
                TrendingStickersAlert.this.shapeDrawable.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || TrendingStickersAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= TrendingStickersAlert.this.scrollOffsetY) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            TrendingStickersAlert.this.lambda$showGiftOfferSheet$15();
            return true;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = AndroidUtilities.statusBarHeight;
            int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i5;
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            int i6 = (int) ((size + iMeasureKeyboardHeight) * 0.2f);
            this.ignoreLayout = true;
            if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
                TrendingStickersAlert.this.layout.glueToTop(true);
                TrendingStickersAlert.this.setAllowNestedScroll(false);
                this.gluedToTop = true;
            } else {
                TrendingStickersAlert.this.layout.glueToTop(false);
                TrendingStickersAlert.this.setAllowNestedScroll(true);
                this.gluedToTop = false;
            }
            TrendingStickersAlert.this.layout.setContentViewPaddingTop(i6);
            if (getPaddingTop() != i5) {
                setPadding(((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, i5, ((BottomSheet) TrendingStickersAlert.this).backgroundPaddingLeft, 0);
            }
            this.ignoreLayout = false;
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !TrendingStickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void setTranslationY(float f) {
            TrendingStickersAlert.this.layout.setTranslationY(f);
            invalidate();
        }
    }

    public TrendingStickersAlert(Context context, BaseFragment baseFragment, TrendingStickersLayout trendingStickersLayout, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, false, resourcesProvider);
        this.topOffset = AndroidUtilities.dp(12.0f);
        this.shapeDrawable = new GradientDrawable();
        AlertContainerView alertContainerView = new AlertContainerView(context);
        this.alertContainerView = alertContainerView;
        alertContainerView.addView(trendingStickersLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView = alertContainerView;
        this.layout = trendingStickersLayout;
        trendingStickersLayout.setParentFragment(baseFragment);
        trendingStickersLayout.setOnScrollListener(new RecyclerView.OnScrollListener() {
            private int scrolledY;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    this.scrolledY = 0;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                this.scrolledY += i2;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.scrolledY) > AndroidUtilities.dp(96.0f)) {
                    View viewFindFocus = TrendingStickersAlert.this.layout.findFocus();
                    if (viewFindFocus == null) {
                        viewFindFocus = TrendingStickersAlert.this.layout;
                    }
                    AndroidUtilities.hideKeyboard(viewFindFocus);
                }
                if (i2 != 0) {
                    TrendingStickersAlert.this.updateLayout();
                }
            }
        });
    }

    public void updateLayout() {
        if (this.layout.update()) {
            this.scrollOffsetY = this.layout.getContentTopOffset();
            this.containerView.invalidate();
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        this.layout.recycle();
        setHeavyOperationsEnabled(true);
    }

    public TrendingStickersLayout getLayout() {
        return this.layout;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        TrendingStickersLayout trendingStickersLayout = this.layout;
        Objects.requireNonNull(trendingStickersLayout);
        trendingStickersLayout.getThemeDescriptions(arrayList, new ColorPicker$$ExternalSyntheticLambda7(trendingStickersLayout, 10));
        arrayList.add(new ThemeDescription(this.alertContainerView, 0, null, null, new Drawable[]{this.shadowDrawable}, null, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.alertContainerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        return arrayList;
    }

    @Override
    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public void setHeavyOperationsEnabled(boolean z) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.startAllHeavyOperations : NotificationCenter.stopAllHeavyOperations, 2);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        setHeavyOperationsEnabled(false);
    }
}
