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
public final class y1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final t41 f30919a;
    public final org.telegram.ui.ActionBar.g6 f30920b;
    public int f30921c;
    public int d;
    public l1 f30922e;
    public float f30923f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30920b = g6Var;
        t41 t41Var = new t41();
        this.f30919a = t41Var;
        t41Var.setCallback(this);
        t41Var.f38283n = id.M0(2131743827, null);
        t41Var.f38284o = id.M0(2131743828, null);
        t41Var.f38285p = id.M0(2131743826, null);
        t41Var.f38279j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30920b;
        if (g6Var != null) {
            g6Var.b(0.0f, this.f30923f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.l6.r(0.0f, this.f30923f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f30921c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (g6Var != null) {
            paint = g6Var.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.l6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (g6Var != null) {
            d12 = g6Var.g();
        } else {
            d12 = org.telegram.ui.ActionBar.l6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f30921c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.l6.f27935h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f30923f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f30921c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        t41 t41Var = this.f30919a;
        t41Var.setBounds(L, L2, L3, L4);
        t41Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f30921c = L;
        int a10 = this.f30919a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30919a.f38278i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.f30922e = l1Var;
    }

    @Override
    public final void updateColors() {
        this.f30919a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30919a) {
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
