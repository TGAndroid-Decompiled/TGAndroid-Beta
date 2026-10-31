package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class rx0 extends View {
    public String f30037a;
    public Drawable f30038b;
    public boolean f30039c;
    public int d;
    public final t5 e;
    public final sx0 f30040f;

    public rx0(sx0 sx0Var, Context context) {
        super(context);
        this.f30040f = sx0Var;
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
        if (this.f30038b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f30038b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e, e, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f30038b;
            if (drawable instanceof f5) {
                ((f5) drawable).p(System.currentTimeMillis());
            }
            this.f30038b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f30038b;
        if (drawable instanceof f5) {
            ((f5) drawable).a(this);
        }
        this.f30039c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f30038b;
        if (drawable instanceof f5) {
            ((f5) drawable).n(this);
        }
        this.f30039c = false;
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
        Drawable drawable2 = this.f30038b;
        if (drawable2 instanceof f5) {
            ((f5) drawable2).n(this);
        }
        this.f30038b = drawable;
        if ((drawable instanceof f5) && this.f30039c) {
            ((f5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
