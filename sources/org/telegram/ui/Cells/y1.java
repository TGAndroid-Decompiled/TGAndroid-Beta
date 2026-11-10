package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.t41;
public final class y1 extends View implements org.telegram.ui.ActionBar.c6 {
    public final t41 f30930a;
    public final org.telegram.ui.ActionBar.h6 f30931b;
    public int f30932c;
    public int d;
    public l1 f30933e;
    public float f30934f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30931b = h6Var;
        t41 t41Var = new t41();
        this.f30930a = t41Var;
        t41Var.setCallback(this);
        t41Var.f38175n = id.M0(2131743827, null);
        t41Var.f38176o = id.M0(2131743828, null);
        t41Var.f38177p = id.M0(2131743826, null);
        t41Var.f38171j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30931b;
        if (h6Var != null) {
            h6Var.b(0.0f, this.f30934f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, this.f30934f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f30932c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (h6Var != null) {
            paint = h6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (h6Var != null) {
            d12 = h6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.m6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f30932c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.f27960h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f30934f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f30932c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        t41 t41Var = this.f30930a;
        t41Var.setBounds(L, L2, L3, L4);
        t41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f30932c = L;
        int a10 = this.f30930a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30930a.f38170i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f30933e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f30930a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30930a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
    }
}
