package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.recorder.FlashViews;

public class HintTextView extends View implements FlashViews.Invertable {
    private final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public HintTextView(Context context) {
        super(context);
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

    public void setText(CharSequence charSequence, boolean z) {
        this.textDrawable.setText(charSequence, z);
        invalidate();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.textDrawable.setBounds(0, 0, getWidth(), getHeight());
        this.textDrawable.draw(canvas);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || super.verifyDrawable(drawable);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.textDrawable.setOverrideFullWidth(getMeasuredWidth());
    }

    @Override
    public void setInvert(float f) {
        this.textDrawable.setTextColor(ColorUtils.blendARGB(-1, -16777216, f));
    }
}
