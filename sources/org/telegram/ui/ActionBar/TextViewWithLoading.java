package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class TextViewWithLoading extends TextView {
    public final AnimatedFloat animatedLoading;
    public boolean loading;
    public final CircularProgressDrawable spinner;

    public TextViewWithLoading(Context context) {
        super(context);
        this.loading = false;
        this.animatedLoading = new AnimatedFloat(320L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.spinner = new CircularProgressDrawable(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f = this.animatedLoading.set(this.loading);
        if (f < 1.0f) {
            if (f <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * f);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (f > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int iDp = width - ((int) ((1.0f - f) * AndroidUtilities.dp(6.0f)));
            CircularProgressDrawable circularProgressDrawable = this.spinner;
            circularProgressDrawable.paint.setAlpha((int) (f * 255.0f));
            int i = ((int) (circularProgressDrawable.size + circularProgressDrawable.thickness)) / 2;
            circularProgressDrawable.setBounds(iDp - i, height - i, iDp + i, i + height);
            circularProgressDrawable.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.spinner.paint.setColor(i);
    }
}
