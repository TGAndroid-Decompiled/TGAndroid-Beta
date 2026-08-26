package org.telegram.ui.Components.voip;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;

public final class EndCloseLayout extends FrameLayout {
    public final EndCloseView endCloseView;
    public boolean isClosedState;
    public final TransitionSet transitionSet;

    public final class EndCloseView extends View {
        public int backColor;
        public final Paint backgroundPaint;
        public final RectF backgroundRect;
        public int callDeclineAlpha;
        public final Drawable callDeclineDrawable;
        public final String closeText;
        public int closeTextAlpha;
        public BaseCell.RippleDrawableSafe rippleDrawable;
        public int round;
        public final Paint textPaint;
        public final Paint textPaintMask;

        public EndCloseView(Activity activity) {
            super(activity);
            this.backgroundPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.textPaintMask = paint;
            Paint paint2 = new Paint(1);
            this.textPaint = paint2;
            this.backgroundRect = new RectF();
            this.backColor = -761748;
            this.round = AndroidUtilities.dp(26.0f);
            this.callDeclineAlpha = 255;
            this.closeTextAlpha = 0;
            Drawable drawableMutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
            this.callDeclineDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            paint.setTextSize(AndroidUtilities.dp(18.0f));
            paint.setTypeface(AndroidUtilities.bold());
            Paint.Align align = Paint.Align.CENTER;
            paint.setTextAlign(align);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint2.setTextSize(AndroidUtilities.dp(18.0f));
            paint2.setTypeface(AndroidUtilities.bold());
            paint2.setTextAlign(align);
            paint2.setColor(-16777216);
            setLayerType(2, null);
            setClickable(true);
            this.closeText = LocaleController.getString(R.string.Close);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (isEnabled()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
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
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            Paint paint = this.backgroundPaint;
            paint.setColor(this.backColor);
            RectF rectF = this.backgroundRect;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float f = this.round;
            canvas.drawRoundRect(rectF, f, f, paint);
            Drawable drawable = this.callDeclineDrawable;
            drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
            drawable.setAlpha(this.callDeclineAlpha);
            drawable.draw(canvas);
            Paint paint2 = this.textPaintMask;
            paint2.setAlpha(this.closeTextAlpha);
            Paint paint3 = this.textPaint;
            paint3.setAlpha((this.closeTextAlpha / 255) * 38);
            float fDp = AndroidUtilities.dp(6.0f) + height;
            String str = this.closeText;
            canvas.drawText(str, width, fDp, paint2);
            canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
            if (this.rippleDrawable == null) {
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 8, 8);
                this.rippleDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
                rippleDrawableSafeCreateRadSelectorDrawable.setCallback(this);
            }
            this.rippleDrawable.setBounds(0, 0, getWidth(), getHeight());
            this.rippleDrawable.draw(canvas);
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
        }
    }

    public EndCloseLayout(Activity activity) {
        super(activity);
        this.isClosedState = false;
        setWillNotDraw(false);
        EndCloseView endCloseView = new EndCloseView(activity);
        this.endCloseView = endCloseView;
        addView(endCloseView, LayoutHelper.createFrame(52, 52, 5));
        TransitionSet transitionSet = new TransitionSet();
        this.transitionSet = transitionSet;
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ActionBar.AnonymousClass7(1));
        transitionSet.setDuration(500L);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
    }

    public EndCloseView getEndCloseView() {
        return this.endCloseView;
    }

    public final void switchToClose(View.OnClickListener onClickListener, boolean z) {
        if (this.isClosedState) {
            return;
        }
        this.isClosedState = true;
        if (z) {
            TransitionManager.beginDelayedTransition(this, this.transitionSet);
        }
        EndCloseView endCloseView = this.endCloseView;
        endCloseView.closeTextAlpha = 255;
        endCloseView.backColor = -1;
        endCloseView.callDeclineAlpha = 0;
        endCloseView.round = AndroidUtilities.dp(8.0f);
        ViewGroup.LayoutParams layoutParams = endCloseView.getLayoutParams();
        layoutParams.width = -1;
        endCloseView.setLayoutParams(layoutParams);
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(10, this, onClickListener), 500L);
    }
}
