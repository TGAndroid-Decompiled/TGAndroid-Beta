package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class qw0 extends View {
    public String f38777a;
    public Drawable f38778b;
    public boolean f38779c;
    public int d;
    public final u5 f38780e;
    public final rw0 f38781f;

    public qw0(rw0 rw0Var, Context context) {
        super(context);
        this.f38781f = rw0Var;
        this.d = 0;
        this.f38780e = new u5(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = ((1.0f - this.f38780e.e(false, f10)) * 0.2f) + 0.8f;
        if (this.f38778b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f38778b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e10, e10, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f38778b;
            if (drawable instanceof g5) {
                ((g5) drawable).p(System.currentTimeMillis());
            }
            this.f38778b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f38778b;
        if (drawable instanceof g5) {
            ((g5) drawable).a(this);
        }
        this.f38779c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f38778b;
        if (drawable instanceof g5) {
            ((g5) drawable).n(this);
        }
        this.f38779c = false;
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
        Drawable drawable2 = this.f38778b;
        if (drawable2 instanceof g5) {
            ((g5) drawable2).n(this);
        }
        this.f38778b = drawable;
        if ((drawable instanceof g5) && this.f38779c) {
            ((g5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
