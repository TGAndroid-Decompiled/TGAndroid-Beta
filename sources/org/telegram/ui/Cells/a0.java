package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.wy0;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.i6 f30446a;
    public final b0 f30447b;
    public final q01 f30448c;
    public int d;
    public float f30449e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30446a = i6Var;
        this.f30447b = new b0(i7, context, i6Var);
        q01 q01Var = new q01(i7, this, i6Var, true);
        this.f30448c = q01Var;
        q01Var.f38642e = new wy0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i7) {
        this.d = i7;
        this.f30449e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        b0 b0Var = this.f30447b;
        int i7 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30446a;
        if (i6Var != null) {
            i6Var.c(f11, this.f30449e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.n6.r(f11, this.f30449e, measuredWidth2, this.d);
        }
        this.f30448c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.f30503i + L);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), m10.C(40.0f, this.f30447b.f30503i, 1073741824));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.f30447b;
        wy0 wy0Var = b0Var.d;
        TLRPC.User c22 = mp.u1(b0Var.f30498b).c2(Long.valueOf(j3));
        wy0 wy0Var2 = b0Var.f30500e;
        wy0Var2.m(1);
        wy0Var2.p(9999.0f);
        wy0Var2.q(gd.a0(null, null, 2131753067, n10.q(c22)));
        float b10 = (wy0Var2.b() / 2.0f) * 1.2f;
        wy0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.f24226q.x * 0.95f);
        wy0Var2.p(Math.min(f10, b10));
        if (wy0Var2.f41762b.getLineCount() > 2) {
            wy0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, wy0Var2.b()), wy0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = wy0Var.i();
        float i10 = wy0Var2.i();
        b0Var.h = (int) min;
        b0Var.f30503i = (int) (i10 + i7 + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f));
    }
}
