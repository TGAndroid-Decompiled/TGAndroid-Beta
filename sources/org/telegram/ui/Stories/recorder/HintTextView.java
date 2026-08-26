package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class HintTextView extends View implements FlashViews.Invertable {
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public HintTextView(Activity activity) {
        super(activity);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.35f, 0L, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(1.4f), 0.0f, AndroidUtilities.dp(0.4f), 1275068416);
        animatedTextDrawable.setGravity(1);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        animatedTextDrawable.setBounds(0, 0, getWidth(), getHeight());
        animatedTextDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.textDrawable.setOverrideFullWidth(getMeasuredWidth());
    }

    @Override
    public void setInvert(float f) {
        this.textDrawable.setTextColor(ColorUtils.blendARGB(f, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || super.verifyDrawable(drawable);
    }
}
