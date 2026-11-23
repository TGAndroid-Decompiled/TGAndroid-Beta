package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class uw0 {
    public final int f40480a;
    public final org.telegram.ui.Cells.v0 f40481b;
    public final org.telegram.ui.ActionBar.i6 f40482c;
    public final nh0 d;
    public TL_account.TL_birthday f40483e;
    public wy0 f40484f;
    public wy0[] f40485g;
    public wy0[] h;
    public boolean f40486i;
    public wy0 f40487j;
    public final RectF f40488k = new RectF();
    public final Paint f40489l = new Paint(1);
    public final lc f40490m;

    public uw0(int i7, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40480a = i7;
        this.f40481b = v0Var;
        this.f40482c = i6Var;
        nh0 nh0Var = new nh0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = nh0Var;
        nh0Var.H(false);
        this.f40490m = new lc(v0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f40481b;
        int width = (v0Var.getWidth() - L) / 2;
        nh0 nh0Var = this.d;
        nh0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        nh0Var.draw(canvas);
        this.f40484f.c((v0Var.getWidth() - this.f40484f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f40484f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f40485g.length; i11++) {
            i10 = (int) (Math.max(this.f40485g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f40485g.length) {
            float max = Math.max(this.f40485g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            wy0 wy0Var = this.f40485g[i12];
            wy0Var.c(f11 - (wy0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            wy0 wy0Var2 = this.h[i12];
            wy0Var2.c(f11 - (wy0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f40486i) {
            canvas.save();
            float k10 = this.f40487j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f40488k;
            rectF.set((v0Var.getWidth() - k10) / 2.0f, L3, (v0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f40490m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f40489l);
            this.f40487j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        b5.l(this.f40481b.getContext(), org.telegram.messenger.gd.N0(2131751660, null), org.telegram.messenger.gd.N0(2131751659, null), this.f40483e, new y2(this, 13), null, true, false, this.f40482c).D0();
    }

    public final void c(org.telegram.messenger.fj fjVar) {
        int i7;
        String i10;
        boolean q10;
        int i11;
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) fjVar.f24073k.action;
        this.f40483e = tL_messageActionSuggestBirthday.birthday;
        wy0 wy0Var = new wy0(TextUtils.concat(fjVar.v, ":"), 13.0f, null);
        wy0Var.m(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var.a();
        wy0Var.p(org.telegram.messenger.g0.L(174.0f) - org.telegram.messenger.g0.L(32.0f));
        this.f40484f = wy0Var;
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        wy0[] wy0VarArr = new wy0[i7];
        this.f40485g = wy0VarArr;
        this.h = new wy0[i7];
        wy0VarArr[0] = new wy0(org.telegram.messenger.gd.N0(2131751662, null), 11.0f, null);
        this.h[0] = new wy0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, org.telegram.messenger.g0.o());
        this.f40485g[1] = new wy0(org.telegram.messenger.gd.N0(2131751661, null), 11.0f, null);
        wy0[] wy0VarArr2 = this.h;
        StringBuilder sb2 = new StringBuilder("");
        int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
        int[] iArr = {2131748893, 2131750817, 2131748490, 2131754170, 2131748469, 2131748871, 2131748873, 2131753892, 2131745369, 2131747636, 2131747641, 2131751593};
        if (i12 >= 0 && i12 < 12) {
            i10 = org.telegram.messenger.gd.N0(iArr[i12], null);
        } else {
            i10 = i5.c.i(i12, "");
        }
        sb2.append(i10);
        wy0VarArr2[1] = new wy0(sb2.toString(), 11.0f, org.telegram.messenger.g0.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.f40485g[2] = new wy0(org.telegram.messenger.gd.N0(2131751657, null), 11.0f, null);
            this.h[2] = new wy0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, org.telegram.messenger.g0.o());
        }
        this.f40486i = !fjVar.P3();
        org.telegram.ui.ActionBar.i6 i6Var = this.f40482c;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (q10) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        this.f40489l.setColor(org.telegram.ui.ActionBar.n6.r1(0.12f, i11));
        this.f40487j = new wy0(org.telegram.messenger.gd.N0(2131744150, null), 14.0f, org.telegram.messenger.g0.o());
    }
}
