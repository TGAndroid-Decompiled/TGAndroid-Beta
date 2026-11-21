package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.xy0;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.h6 f30384a;
    public final b0 f30385b;
    public final s01 f30386c;
    public int d;
    public float f30387e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30384a = h6Var;
        this.f30385b = new b0(i7, context, h6Var);
        s01 s01Var = new s01(i7, this, h6Var, true);
        this.f30386c = s01Var;
        s01Var.f39431e = new xy0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i7) {
        this.d = i7;
        this.f30387e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        b0 b0Var = this.f30385b;
        int i7 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30384a;
        if (h6Var != null) {
            h6Var.e(f11, this.f30387e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.m6.r(f11, this.f30387e, measuredWidth2, this.d);
        }
        this.f30386c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.f30446i + L);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), n10.C(40.0f, this.f30385b.f30446i, 1073741824));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.f30385b;
        xy0 xy0Var = b0Var.d;
        TLRPC.User c22 = mp.u1(b0Var.f30441b).c2(Long.valueOf(j3));
        xy0 xy0Var2 = b0Var.f30443e;
        xy0Var2.m(1);
        xy0Var2.p(9999.0f);
        xy0Var2.q(gd.a0(null, null, 2131753067, o10.q(c22)));
        float b10 = (xy0Var2.b() / 2.0f) * 1.2f;
        xy0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.f24146q.x * 0.95f);
        xy0Var2.p(Math.min(f10, b10));
        if (xy0Var2.f42253b.getLineCount() > 2) {
            xy0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, xy0Var2.b()), xy0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = xy0Var.i();
        float i10 = xy0Var2.i();
        b0Var.h = (int) min;
        b0Var.f30446i = (int) (i10 + i7 + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f));
    }
}
