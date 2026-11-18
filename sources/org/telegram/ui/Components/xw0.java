package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class xw0 extends View {
    public String f42200a;
    public Drawable f42201b;
    public boolean f42202c;
    public int d;
    public final c6 f42203e;
    public final yw0 f42204f;

    public xw0(yw0 yw0Var, Context context) {
        super(context);
        this.f42204f = yw0Var;
        this.d = 0;
        this.f42203e = new c6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = ((1.0f - this.f42203e.e(false, f10)) * 0.2f) + 0.8f;
        if (this.f42201b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f42201b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e10, e10, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f42201b;
            if (drawable instanceof o5) {
                ((o5) drawable).p(System.currentTimeMillis());
            }
            this.f42201b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f42201b;
        if (drawable instanceof o5) {
            ((o5) drawable).a(this);
        }
        this.f42202c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f42201b;
        if (drawable instanceof o5) {
            ((o5) drawable).n(this);
        }
        this.f42202c = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int L = org.telegram.messenger.g0.L(3.0f);
        float f11 = 6.66f;
        if (this.d == 0) {
            f10 = 0.0f;
        } else {
            f10 = 6.66f;
        }
        int L2 = org.telegram.messenger.g0.L(f10 + 3.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        if (this.d != 0) {
            f11 = 0.0f;
        }
        setPadding(L, L2, L3, org.telegram.messenger.g0.L(f11 + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }

    public void setDirection(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f42201b;
        if (drawable2 instanceof o5) {
            ((o5) drawable2).n(this);
        }
        this.f42201b = drawable;
        if ((drawable instanceof o5) && this.f42202c) {
            ((o5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
