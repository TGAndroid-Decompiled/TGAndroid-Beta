package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class tx0 extends View {
    public String f32830a;
    public Drawable f32831b;
    public boolean f32832c;
    public int d;
    public final y5 f32833e;
    public final ux0 f32834f;

    public tx0(ux0 ux0Var, Context context) {
        super(context);
        this.f32834f = ux0Var;
        this.d = 0;
        this.f32833e = new y5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = ((1.0f - this.f32833e.d(f10, false)) * 0.2f) + 0.8f;
        if (this.f32831b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f32831b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f32831b;
            if (drawable instanceof k5) {
                ((k5) drawable).q(System.currentTimeMillis());
            }
            this.f32831b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f32831b;
        if (drawable instanceof k5) {
            ((k5) drawable).a(this);
        }
        this.f32832c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f32831b;
        if (drawable instanceof k5) {
            ((k5) drawable).o(this);
        }
        this.f32832c = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int dp = AndroidUtilities.dp(3.0f);
        float f11 = 6.66f;
        if (this.d == 0) {
            f10 = 0.0f;
        } else {
            f10 = 6.66f;
        }
        int dp2 = AndroidUtilities.dp(f10 + 3.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        if (this.d != 0) {
            f11 = 0.0f;
        }
        setPadding(dp, dp2, dp3, AndroidUtilities.dp(f11 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setDirection(int i9) {
        this.d = i9;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f32831b;
        if (drawable2 instanceof k5) {
            ((k5) drawable2).o(this);
        }
        this.f32831b = drawable;
        if ((drawable instanceof k5) && this.f32832c) {
            ((k5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
