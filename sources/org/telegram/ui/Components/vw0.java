package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vw0 {
    public final int f41565a;
    public final org.telegram.ui.Cells.v0 f41566b;
    public final org.telegram.ui.ActionBar.h6 f41567c;
    public final oh0 d;
    public TL_account.TL_birthday f41568e;
    public xy0 f41569f;
    public xy0[] f41570g;
    public xy0[] h;
    public boolean f41571i;
    public xy0 f41572j;
    public final RectF f41573k = new RectF();
    public final Paint f41574l = new Paint(1);
    public final mc f41575m;

    public vw0(int i7, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f41565a = i7;
        this.f41566b = v0Var;
        this.f41567c = h6Var;
        oh0 oh0Var = new oh0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = oh0Var;
        oh0Var.H(false);
        this.f41575m = new mc(v0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f41566b;
        int width = (v0Var.getWidth() - L) / 2;
        oh0 oh0Var = this.d;
        oh0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        oh0Var.draw(canvas);
        this.f41569f.c((v0Var.getWidth() - this.f41569f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f41569f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f41570g.length; i11++) {
            i10 = (int) (Math.max(this.f41570g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f41570g.length) {
            float max = Math.max(this.f41570g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            xy0 xy0Var = this.f41570g[i12];
            xy0Var.c(f11 - (xy0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            xy0 xy0Var2 = this.h[i12];
            xy0Var2.c(f11 - (xy0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f41571i) {
            canvas.save();
            float k10 = this.f41572j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f41573k;
            rectF.set((v0Var.getWidth() - k10) / 2.0f, L3, (v0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f41575m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f41574l);
            this.f41572j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.l(this.f41566b.getContext(), org.telegram.messenger.gd.N0(2131751660, null), org.telegram.messenger.gd.N0(2131751659, null), this.f41568e, new z2(this, 13), null, true, false, this.f41567c).C2();
    }

    public final void c(org.telegram.messenger.fj fjVar) {
        int i7;
        String i10;
        boolean q10;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) fjVar.f23993k.action;
        this.f41568e = tL_messageActionSuggestBirthday.birthday;
        xy0 xy0Var = new xy0(TextUtils.concat(fjVar.v, ":"), 13.0f, null);
        xy0Var.m(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        xy0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
        this.f41569f = xy0Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        xy0[] xy0VarArr = new xy0[i7];
        this.f41570g = xy0VarArr;
        this.h = new xy0[i7];
        xy0VarArr[0] = new xy0(org.telegram.messenger.gd.N0(2131751662, null), 11.0f, null);
        this.h[0] = new xy0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
        this.f41570g[1] = new xy0(org.telegram.messenger.gd.N0(2131751661, null), 11.0f, null);
        xy0[] xy0VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {2131748893, 2131750817, 2131748490, 2131754170, 2131748469, 2131748871, 2131748873, 2131753892, 2131745369, 2131747636, 2131747641, 2131751593};
        if (i12 >= 0 && i12 < 12) {
            i10 = org.telegram.messenger.gd.N0(iArr[i12], null);
        } else {
            i10 = i5.c.i(i12, "");
        }
        sb2.append(i10);
        xy0VarArr2[1] = new xy0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f41570g[2] = new xy0(org.telegram.messenger.gd.N0(2131751657, null), 11.0f, null);
            this.h[2] = new xy0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
        }
        this.f41571i = !fjVar.P3();
        org.telegram.ui.ActionBar.h6 h6Var = this.f41567c;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        if (q10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f41574l.setColor(org.telegram.ui.ActionBar.m6.r1(0.12f, i11));
        this.f41572j = new xy0(org.telegram.messenger.gd.N0(2131744154, null), 14.0f, org.telegram.messenger.g0.o());
    }
}
