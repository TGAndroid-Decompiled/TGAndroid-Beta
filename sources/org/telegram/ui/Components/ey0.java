package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class ey0 extends View {
    public String f28204a;
    public Drawable f28205b;
    public boolean f28206c;
    public int d;
    public final d6 f28207e;
    public final fy0 f28208f;

    public ey0(fy0 fy0Var, Context context) {
        super(context);
        this.f28208f = fy0Var;
        this.d = 0;
        this.f28207e = new d6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        if (isPressed()) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = ((1.0f - this.f28207e.d(f9, false)) * 0.2f) + 0.8f;
        if (this.f28205b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f28205b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f28205b;
            if (drawable instanceof p5) {
                ((p5) drawable).q(System.currentTimeMillis());
            }
            this.f28205b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f28205b;
        if (drawable instanceof p5) {
            ((p5) drawable).a(this);
        }
        this.f28206c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f28205b;
        if (drawable instanceof p5) {
            ((p5) drawable).o(this);
        }
        this.f28206c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int dp = AndroidUtilities.dp(3.0f);
        float f10 = 6.66f;
        if (this.d == 0) {
            f9 = 0.0f;
        } else {
            f9 = 6.66f;
        }
        int dp2 = AndroidUtilities.dp(f9 + 3.0f);
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
        Drawable drawable2 = this.f28205b;
        if (drawable2 instanceof p5) {
            ((p5) drawable2).o(this);
        }
        this.f28205b = drawable;
        if ((drawable instanceof p5) && this.f28206c) {
            ((p5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
