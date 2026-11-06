package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.ly0;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.f6 f28862a;
    public final b0 f28863b;
    public final f01 f28864c;
    public int d;
    public float f28865e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28862a = f6Var;
        this.f28863b = new b0(i7, context, f6Var);
        f01 f01Var = new f01(i7, this, f6Var, true);
        this.f28864c = f01Var;
        f01Var.f33422e = new ly0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i7) {
        this.d = i7;
        this.f28865e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        b0 b0Var = this.f28863b;
        int i7 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28862a;
        if (f6Var != null) {
            f6Var.b(f11, this.f28865e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(f11, this.f28865e, measuredWidth2, this.d);
        }
        this.f28864c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.f28914i + L);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(40.0f, this.f28863b.f28914i, 1073741824));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.f28863b;
        ly0 ly0Var = b0Var.d;
        TLRPC.User a22 = qp.s1(b0Var.f28909b).a2(Long.valueOf(j3));
        ly0 ly0Var2 = b0Var.f28911e;
        ly0Var2.m(1);
        ly0Var2.p(9999.0f);
        ly0Var2.q(hd.a0(null, null, 2131753070, t10.p(a22)));
        float b10 = (ly0Var2.b() / 2.0f) * 1.2f;
        ly0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.f22537q.x * 0.95f);
        ly0Var2.p(Math.min(f10, b10));
        if (ly0Var2.f35781b.getLineCount() > 2) {
            ly0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, ly0Var2.b()), ly0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = ly0Var.i();
        float i10 = ly0Var2.i();
        b0Var.h = (int) min;
        b0Var.f28914i = (int) (i10 + i7 + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f));
    }
}
