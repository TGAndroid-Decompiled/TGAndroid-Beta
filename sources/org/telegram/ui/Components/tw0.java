package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tw0 {
    public final int f40113a;
    public final org.telegram.ui.Cells.u0 f40114b;
    public final org.telegram.ui.ActionBar.i6 f40115c;
    public final mh0 d;
    public TL_account.TL_birthday f40116e;
    public vy0 f40117f;
    public vy0[] f40118g;
    public vy0[] h;
    public boolean f40119i;
    public vy0 f40120j;
    public final RectF f40121k = new RectF();
    public final Paint f40122l = new Paint(1);
    public final mc f40123m;

    public tw0(int i7, org.telegram.ui.Cells.u0 u0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40113a = i7;
        this.f40114b = u0Var;
        this.f40115c = i6Var;
        mh0 mh0Var = new mh0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = mh0Var;
        mh0Var.H(false);
        this.f40123m = new mc(u0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.u0 u0Var = this.f40114b;
        int width = (u0Var.getWidth() - L) / 2;
        mh0 mh0Var = this.d;
        mh0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        mh0Var.draw(canvas);
        this.f40117f.c((u0Var.getWidth() - this.f40117f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f40117f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f40118g.length; i11++) {
            i10 = (int) (Math.max(this.f40118g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (u0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f40118g.length) {
            float max = Math.max(this.f40118g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            vy0 vy0Var = this.f40118g[i12];
            vy0Var.c(f11 - (vy0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            vy0 vy0Var2 = this.h[i12];
            vy0Var2.c(f11 - (vy0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f40119i) {
            canvas.save();
            float k10 = this.f40120j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f40121k;
            rectF.set((u0Var.getWidth() - k10) / 2.0f, L3, (u0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f40123m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f40122l);
            this.f40120j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        b5.l(this.f40114b.getContext(), org.telegram.messenger.gd.M0(2131751661, null), org.telegram.messenger.gd.M0(2131751660, null), this.f40116e, new y2(this, 13), null, true, false, this.f40115c).C2();
    }

    public final void c(org.telegram.messenger.fj fjVar) {
        int i7;
        String i10;
        boolean q10;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) fjVar.f23968k.action;
        this.f40116e = tL_messageActionSuggestBirthday.birthday;
        vy0 vy0Var = new vy0(TextUtils.concat(fjVar.v, ":"), 13.0f, null);
        vy0Var.m(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        vy0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
        this.f40117f = vy0Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        vy0[] vy0VarArr = new vy0[i7];
        this.f40118g = vy0VarArr;
        this.h = new vy0[i7];
        vy0VarArr[0] = new vy0(org.telegram.messenger.gd.M0(2131751663, null), 11.0f, null);
        this.h[0] = new vy0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
        this.f40118g[1] = new vy0(org.telegram.messenger.gd.M0(2131751662, null), 11.0f, null);
        vy0[] vy0VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {2131748894, 2131750818, 2131748491, 2131754171, 2131748470, 2131748872, 2131748874, 2131753893, 2131745370, 2131747637, 2131747642, 2131751594};
        if (i12 >= 0 && i12 < 12) {
            i10 = org.telegram.messenger.gd.M0(iArr[i12], null);
        } else {
            i10 = i5.c.i(i12, "");
        }
        sb2.append(i10);
        vy0VarArr2[1] = new vy0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f40118g[2] = new vy0(org.telegram.messenger.gd.M0(2131751658, null), 11.0f, null);
            this.h[2] = new vy0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
        }
        this.f40119i = !fjVar.P3();
        org.telegram.ui.ActionBar.i6 i6Var = this.f40115c;
        if (i6Var != null) {
            q10 = i6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (q10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f40122l.setColor(org.telegram.ui.ActionBar.n6.r1(0.12f, i11));
        this.f40120j = new vy0(org.telegram.messenger.gd.M0(2131744160, null), 14.0f, org.telegram.messenger.g0.o());
    }
}
