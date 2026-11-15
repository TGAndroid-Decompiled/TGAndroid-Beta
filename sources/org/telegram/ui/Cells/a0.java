package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.oy0;
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.e6 f29981a;
    public final b0 f29982b;
    public final i01 f29983c;
    public int d;
    public float f29984e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29981a = e6Var;
        this.f29982b = new b0(i7, context, e6Var);
        i01 i01Var = new i01(i7, this, e6Var, true);
        this.f29983c = i01Var;
        i01Var.f35388e = new oy0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i7) {
        this.d = i7;
        this.f29984e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        b0 b0Var = this.f29982b;
        int i7 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29981a;
        if (e6Var != null) {
            e6Var.b(f11, this.f29984e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.j6.r(f11, this.f29984e, measuredWidth2, this.d);
        }
        this.f29983c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.f30033i + L);
        b0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i20.B(40.0f, this.f29982b.f30033i, 1073741824));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.f29982b;
        oy0 oy0Var = b0Var.d;
        TLRPC.User a22 = np.s1(b0Var.f30028b).a2(Long.valueOf(j3));
        oy0 oy0Var2 = b0Var.f30030e;
        oy0Var2.m(1);
        oy0Var2.p(9999.0f);
        oy0Var2.q(hd.a0(null, null, 2131753070, q10.p(a22)));
        float b10 = (oy0Var2.b() / 2.0f) * 1.2f;
        oy0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.f23611q.x * 0.95f);
        oy0Var2.p(Math.min(f10, b10));
        if (oy0Var2.f38102b.getLineCount() > 2) {
            oy0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, oy0Var2.b()), oy0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = oy0Var.i();
        float i10 = oy0Var2.i();
        b0Var.h = (int) min;
        b0Var.f30033i = (int) (i10 + i7 + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f));
    }
}
