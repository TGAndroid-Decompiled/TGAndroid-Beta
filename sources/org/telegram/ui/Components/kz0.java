package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends View {
    public String f26508a;
    public Drawable f26509b;
    public boolean f26510c;
    public int d;
    public final g6 e;
    public final lz0 f26511f;

    public kz0(lz0 lz0Var, Context context) {
        super(context);
        this.f26511f = lz0Var;
        this.d = 0;
        this.e = new g6(this, 350L, new OvershootInterpolator(5.0f));
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
        if (this.f26509b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f26509b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(d, d, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f26509b;
            if (drawable instanceof s5) {
                ((s5) drawable).q(System.currentTimeMillis());
            }
            this.f26509b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f26509b;
        if (drawable instanceof s5) {
            ((s5) drawable).a(this);
        }
        this.f26510c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f26509b;
        if (drawable instanceof s5) {
            ((s5) drawable).o(this);
        }
        this.f26510c = false;
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
        Drawable drawable2 = this.f26509b;
        if (drawable2 instanceof s5) {
            ((s5) drawable2).o(this);
        }
        this.f26509b = drawable;
        if ((drawable instanceof s5) && this.f26510c) {
            ((s5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
