package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda12;

public final class RateCallLayout extends FrameLayout {
    public VoIPFragment$$ExternalSyntheticLambda12 onRateSelected;
    public final RateCallContainer rateCallContainer;
    public final FrameLayout starsContainer;
    public final StarContainer[] startsViews;

    public final class RateCallContainer extends FrameLayout {
        public final VoIPBackgroundProvider backgroundProvider;
        public final RectF bgRect;

        public RateCallContainer(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(activity);
            this.bgRect = new RectF();
            this.backgroundProvider = voIPBackgroundProvider;
            voIPBackgroundProvider.views.add(this);
            setWillNotDraw(false);
            TextView textView = new TextView(activity);
            textView.setTextColor(-1);
            textView.setText(LocaleController.getString(R.string.VoipRateCallTitle));
            textView.setTextSize(1, 15.0f);
            textView.setGravity(1);
            textView.setTypeface(AndroidUtilities.bold());
            TextView textView2 = new TextView(activity);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(-1);
            textView2.setGravity(1);
            textView2.setText(LocaleController.getString(R.string.VoipRateCallDescription));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            RectF rectF = this.bgRect;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float x = ((View) getParent()).getX() + getX();
            float y = ((View) getParent()).getY() + getY();
            VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
            voIPBackgroundProvider.setDarkTranslation(x, y);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), voIPBackgroundProvider.getDarkPaint());
            super.dispatchDraw(canvas);
        }
    }

    public final class StarContainer extends FrameLayout {
        public AllStarsProvider allStarsProvider;
        public final RLottieImageView defaultStar;
        public RateCallLayout$$ExternalSyntheticLambda1 onSelectedStar;
        public int pos;
        public final BaseCell.RippleDrawableSafe rippleDrawable;
        public final RLottieImageView selectedStar;

        public interface AllStarsProvider {
        }

        public StarContainer(Activity activity) {
            super(activity);
            this.pos = 0;
            setWillNotDraw(false);
            RLottieImageView rLottieImageView = new RLottieImageView(activity);
            this.defaultStar = rLottieImageView;
            RLottieImageView rLottieImageView2 = new RLottieImageView(activity);
            this.selectedStar = rLottieImageView2;
            rLottieImageView.setAnimation(R.raw.star_stroke, 37, 37, null);
            rLottieImageView2.setAnimation(R.raw.star_fill, 37, 37, null);
            rLottieImageView2.setAlpha(0.0f);
            addView(rLottieImageView, LayoutHelper.createFrame(37.0f, 37));
            addView(rLottieImageView2, LayoutHelper.createFrame(37.0f, 37));
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(37.0f), 0, ColorUtils.setAlphaComponent(-1, 76));
            this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
            rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
            setClickable(true);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int i;
            AllStarsProvider allStarsProvider;
            int action = motionEvent.getAction();
            int i2 = 0;
            if (action == 0) {
                AllStarsProvider allStarsProvider2 = this.allStarsProvider;
                if (allStarsProvider2 != null) {
                    StarContainer[] starContainerArr = ((RateCallLayout) ((VideoEditTextureView$$ExternalSyntheticLambda1) allStarsProvider2).f$0).startsViews;
                    while (true) {
                        i = this.pos;
                        if (i2 > i) {
                            break;
                        }
                        StarContainer starContainer = starContainerArr[i2];
                        RLottieImageView rLottieImageView = starContainer.defaultStar;
                        RLottieImageView rLottieImageView2 = starContainer.selectedStar;
                        rLottieImageView.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                        rLottieImageView2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                        i2++;
                    }
                    for (int i3 = i + 1; i3 < starContainerArr.length; i3++) {
                        StarContainer starContainer2 = starContainerArr[i3];
                        RLottieImageView rLottieImageView3 = starContainer2.defaultStar;
                        RLottieImageView rLottieImageView4 = starContainer2.selectedStar;
                        rLottieImageView3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        rLottieImageView4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
            } else if (action == 1) {
                AllStarsProvider allStarsProvider3 = this.allStarsProvider;
                if (allStarsProvider3 != null) {
                    StarContainer[] starContainerArr2 = ((RateCallLayout) ((VideoEditTextureView$$ExternalSyntheticLambda1) allStarsProvider3).f$0).startsViews;
                    for (int i4 = 0; i4 <= this.pos; i4++) {
                        StarContainer starContainer3 = starContainerArr2[i4];
                        RLottieImageView rLottieImageView5 = starContainer3.defaultStar;
                        RLottieImageView rLottieImageView6 = starContainer3.selectedStar;
                        rLottieImageView5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        rLottieImageView6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.onSelectedStar != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    RateCallLayout$$ExternalSyntheticLambda1 rateCallLayout$$ExternalSyntheticLambda1 = this.onSelectedStar;
                    float width = (getWidth() / 2.0f) + i5;
                    float height = (getHeight() / 2.0f) + i6;
                    int i7 = this.pos + 1;
                    RateCallLayout rateCallLayout = (RateCallLayout) rateCallLayout$$ExternalSyntheticLambda1.f$0;
                    if (i7 >= 4) {
                        rateCallLayout.getClass();
                        RLottieImageView rLottieImageView7 = new RLottieImageView((Activity) rateCallLayout$$ExternalSyntheticLambda1.f$1);
                        int iDp = AndroidUtilities.dp(133.0f);
                        rLottieImageView7.setAnimation(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        rateCallLayout.getLocationOnScreen(iArr2);
                        int i8 = iArr2[0];
                        int i9 = iArr2[1];
                        rateCallLayout.addView(rLottieImageView7, LayoutHelper.createFrame(133.0f, 133));
                        float f = width - i8;
                        float f2 = iDp / 2.0f;
                        rLottieImageView7.setTranslationX(f - f2);
                        rLottieImageView7.setTranslationY((height - i9) - f2);
                        rLottieImageView7.setOnAnimationEndListener(new RateCallLayout$$ExternalSyntheticLambda2(rateCallLayout, rLottieImageView7, 0));
                        rLottieImageView7.playAnimation();
                    }
                    VoIPFragment$$ExternalSyntheticLambda12 voIPFragment$$ExternalSyntheticLambda12 = rateCallLayout.onRateSelected;
                    if (voIPFragment$$ExternalSyntheticLambda12 != null) {
                        voIPFragment$$ExternalSyntheticLambda12.f$0.selectedRating = i7;
                    }
                }
            } else if (action == 3 && (allStarsProvider = this.allStarsProvider) != null) {
                StarContainer[] starContainerArr3 = ((RateCallLayout) ((VideoEditTextureView$$ExternalSyntheticLambda1) allStarsProvider).f$0).startsViews;
                int length = starContainerArr3.length;
                while (i2 < length) {
                    StarContainer starContainer4 = starContainerArr3[i2];
                    RLottieImageView rLottieImageView8 = starContainer4.defaultStar;
                    RLottieImageView rLottieImageView9 = starContainer4.selectedStar;
                    rLottieImageView8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    rLottieImageView9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    i2++;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            if (rippleDrawableSafe != null) {
                rippleDrawableSafe.setState(getDrawableState());
            }
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            if (rippleDrawableSafe != null) {
                rippleDrawableSafe.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth();
            int height = getHeight();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            rippleDrawableSafe.setBounds(0, 0, width, height);
            rippleDrawableSafe.draw(canvas);
        }

        public void setAllStarsProvider(AllStarsProvider allStarsProvider) {
            this.allStarsProvider = allStarsProvider;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
        }
    }

    public RateCallLayout(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.startsViews = new StarContainer[5];
        setWillNotDraw(false);
        RateCallContainer rateCallContainer = new RateCallContainer(activity, voIPBackgroundProvider);
        this.rateCallContainer = rateCallContainer;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.starsContainer = frameLayout;
        rateCallContainer.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i = 0; i < 5; i++) {
            this.startsViews[i] = new StarContainer(activity);
            this.startsViews[i].setAllStarsProvider(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 8));
            StarContainer starContainer = this.startsViews[i];
            starContainer.onSelectedStar = new RateCallLayout$$ExternalSyntheticLambda1(0, this, activity);
            starContainer.pos = i;
            this.starsContainer.addView(starContainer, LayoutHelper.createFrame(-2, -2.0f, 51, i * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.rateCallContainer, LayoutHelper.createFrame(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.starsContainer, LayoutHelper.createFrame(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
