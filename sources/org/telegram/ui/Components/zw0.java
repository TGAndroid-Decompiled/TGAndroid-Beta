package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class zw0 extends View {
    public String f42995a;
    public Drawable f42996b;
    public boolean f42997c;
    public int d;
    public final d6 f42998e;
    public final ax0 f42999f;

    public zw0(ax0 ax0Var, Context context) {
        super(context);
        this.f42999f = ax0Var;
        this.d = 0;
        this.f42998e = new d6(this, 350L, new OvershootInterpolator(5.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (isPressed()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = ((1.0f - this.f42998e.e(false, f10)) * 0.2f) + 0.8f;
        if (this.f42996b != null) {
            int height = getHeight() - getPaddingBottom();
            this.f42996b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e10, e10, getWidth() / 2, (getPaddingTop() + height) / 2);
            Drawable drawable = this.f42996b;
            if (drawable instanceof p5) {
                ((p5) drawable).p(System.currentTimeMillis());
            }
            this.f42996b.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f42996b;
        if (drawable instanceof p5) {
            ((p5) drawable).a(this);
        }
        this.f42997c = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f42996b;
        if (drawable instanceof p5) {
            ((p5) drawable).n(this);
        }
        this.f42997c = false;
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
        Drawable drawable2 = this.f42996b;
        if (drawable2 instanceof p5) {
            ((p5) drawable2).n(this);
        }
        this.f42996b = drawable;
        if ((drawable instanceof p5) && this.f42997c) {
            ((p5) drawable).a(this);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        invalidate();
    }
}
