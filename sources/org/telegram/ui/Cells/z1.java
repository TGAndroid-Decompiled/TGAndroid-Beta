package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.k51;
public final class z1 extends View implements org.telegram.ui.ActionBar.b6 {
    public final k51 f32529a;
    public final org.telegram.ui.ActionBar.h6 f32530b;
    public int f32531c;
    public int d;
    public m1 f32532e;
    public float f32533f;
    public int h;

    public z1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f32530b = h6Var;
        k51 k51Var = new k51();
        this.f32529a = k51Var;
        k51Var.setCallback(this);
        k51Var.f36798n = hd.N0(2131743582, null);
        k51Var.f36799o = hd.N0(2131743583, null);
        k51Var.f36800p = hd.N0(2131743581, null);
        k51Var.f36794j = new f(this, 2);
    }

    public final void a(Canvas canvas) {
        Paint paint;
        boolean d12;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32530b;
        if (h6Var != null) {
            h6Var.e(0.0f, this.f32533f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.m6.r(0.0f, this.f32533f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.g0.L(18.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float L3 = org.telegram.messenger.g0.L(18.0f) + this.f32531c;
        float L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.g0.L(18.0f);
        float L6 = org.telegram.messenger.g0.L(18.0f);
        if (h6Var != null) {
            paint = h6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, paint);
        if (h6Var != null) {
            d12 = h6Var.j();
        } else {
            d12 = org.telegram.ui.ActionBar.m6.d1();
        }
        if (d12) {
            canvas.drawRoundRect(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f) + this.f32531c, org.telegram.messenger.g0.L(6.0f) + this.d, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.m6.f29451h2);
        }
    }

    public final void b(float f10, int i7) {
        this.f32533f = f10;
        this.h = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(18.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(18.0f) + this.f32531c;
        int L4 = org.telegram.messenger.g0.L(6.0f) + this.d;
        k51 k51Var = this.f32529a;
        k51Var.setBounds(L, L2, L3, L4);
        k51Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = size - org.telegram.messenger.g0.L(36.0f);
        this.f32531c = L;
        int a10 = this.f32529a.a(L);
        this.d = a10;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(12.0f) + a10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f32529a.f36793i.a(this, motionEvent);
    }

    public void setDelegate(m1 m1Var) {
        this.f32532e = m1Var;
    }

    @Override
    public final void updateColors() {
        this.f32529a.b();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32529a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }
}
