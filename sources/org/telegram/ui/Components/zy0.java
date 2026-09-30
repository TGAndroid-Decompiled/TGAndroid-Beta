package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class zy0 extends View {
    public String f31086a;
    public Drawable f31087b;
    public boolean f31088c;
    public int d;
    public final e6 e;
    public final az0 f31089f;

    public zy0(az0 az0Var, Context context) {
        super(context);
        this.f31089f = az0Var;
        this.d = 0;
        this.e = new e6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = ((1.0f - this.e.d(f7, false)) * 0.2f) + 0.8f;
        if (this.f31087b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f31087b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f31087b;
            if (drawable instanceof q5) {
                ((q5) drawable).q(System.currentTimeMillis());
            }
            this.f31087b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f31087b;
        if (drawable instanceof q5) {
            ((q5) drawable).a(this);
        }
        this.f31088c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f31087b;
        if (drawable instanceof q5) {
            ((q5) drawable).o(this);
        }
        this.f31088c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int dp = AndroidUtilities.dp(3.0f);
        float f10 = 6.66f;
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = 6.66f;
        }
        int dp2 = AndroidUtilities.dp(f7 + 3.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        if (this.d != 0) {
            f10 = 0.0f;
        }
        setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setDirection(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f31087b;
        if (drawable2 instanceof q5) {
            ((q5) drawable2).o(this);
        }
        this.f31087b = drawable;
        if ((drawable instanceof q5) && this.f31088c) {
            ((q5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
