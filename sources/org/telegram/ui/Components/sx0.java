package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class sx0 extends View {
    public String f30462a;
    public Drawable f30463b;
    public boolean f30464c;
    public int d;
    public final t5 e;
    public final tx0 f30465f;

    public sx0(tx0 tx0Var, Context context) {
        super(context);
        this.f30465f = tx0Var;
        this.d = 0;
        this.e = new t5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (isPressed()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = ((1.0f - this.e.e(false, f7)) * 0.2f) + 0.8f;
        if (this.f30463b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f30463b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e, e, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f30463b;
            if (drawable instanceof f5) {
                ((f5) drawable).p(System.currentTimeMillis());
            }
            this.f30463b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f30463b;
        if (drawable instanceof f5) {
            ((f5) drawable).a(this);
        }
        this.f30464c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f30463b;
        if (drawable instanceof f5) {
            ((f5) drawable).n(this);
        }
        this.f30464c = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int L = org.telegram.messenger.i0.L(3.0f);
        float f10 = 6.66f;
        if (this.d == 0) {
            f7 = 0.0f;
        } else {
            f7 = 6.66f;
        }
        int L2 = org.telegram.messenger.i0.L(f7 + 3.0f);
        int L3 = org.telegram.messenger.i0.L(3.0f);
        if (this.d != 0) {
            f10 = 0.0f;
        }
        setPadding(L, L2, L3, org.telegram.messenger.i0.L(f10 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), 1073741824));
    }

    public void setDirection(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f30463b;
        if (drawable2 instanceof f5) {
            ((f5) drawable2).n(this);
        }
        this.f30463b = drawable;
        if ((drawable instanceof f5) && this.f30464c) {
            ((f5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
