package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class hq0 implements Runnable {
    public final int f26794a = 0;
    public final org.telegram.ui.ActionBar.b1 f26795b;
    public final org.telegram.ui.ActionBar.b1 f26796c;
    public final org.telegram.ui.ActionBar.b1 d;
    public final org.telegram.ui.ActionBar.b1 e;
    public final org.telegram.ui.ActionBar.b1 f26797f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.b1 f26798n;
    public final org.telegram.ui.ActionBar.b1 f26799r;
    public final Object f26800s;

    public hq0(org.telegram.ui.ActionBar.b1 b1Var, rh.v5 v5Var, org.telegram.ui.ActionBar.b1 b1Var2, org.telegram.ui.ActionBar.b1 b1Var3, org.telegram.ui.ActionBar.b1 b1Var4, org.telegram.ui.ActionBar.b1 b1Var5, boolean z10, org.telegram.ui.ActionBar.b1 b1Var6, org.telegram.ui.ActionBar.b1 b1Var7) {
        this.f26795b = b1Var;
        this.f26800s = v5Var;
        this.f26796c = b1Var2;
        this.d = b1Var3;
        this.e = b1Var4;
        this.f26797f = b1Var5;
        this.h = z10;
        this.f26798n = b1Var6;
        this.f26799r = b1Var7;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f26794a;
        org.telegram.ui.ActionBar.b1 b1Var = this.f26799r;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.f26798n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.b1 b1Var3 = this.f26797f;
        org.telegram.ui.ActionBar.b1 b1Var4 = this.e;
        org.telegram.ui.ActionBar.b1 b1Var5 = this.d;
        org.telegram.ui.ActionBar.b1 b1Var6 = this.f26796c;
        org.telegram.ui.ActionBar.b1 b1Var7 = this.f26795b;
        Object obj = this.f26800s;
        switch (i14) {
            case 0:
                rh.v5 v5Var = (rh.v5) obj;
                if (b1Var7 != null) {
                    if (v5Var.e) {
                        i10 = 2131750206;
                    } else {
                        i10 = 2131750207;
                    }
                    String L0 = org.telegram.messenger.cd.L0(i10, null);
                    if (v5Var.e) {
                        i11 = 2131231889;
                    } else {
                        i11 = 2131231887;
                    }
                    b1Var7.j(L0, i11, null);
                }
                b1Var6.setChecked(TLObject.hasFlag(v5Var.f47578g, 1));
                b1Var5.setChecked(TLObject.hasFlag(v5Var.f47578g, 2));
                b1Var4.setChecked(TLObject.hasFlag(v5Var.f47578g, 4));
                b1Var3.setChecked(TLObject.hasFlag(v5Var.f47578g, 8));
                if (z10) {
                    b1Var2.setChecked(TLObject.hasFlag(v5Var.f47578g, 256));
                    b1Var.setChecked(TLObject.hasFlag(v5Var.f47578g, 512));
                    return;
                }
                return;
            default:
                rh.v5 v5Var2 = ((ph.s3) obj).f45310c.Q1;
                if (v5Var2.e) {
                    i12 = 2131750206;
                } else {
                    i12 = 2131750207;
                }
                String L02 = org.telegram.messenger.cd.L0(i12, null);
                if (v5Var2.e) {
                    i13 = 2131231889;
                } else {
                    i13 = 2131231887;
                }
                b1Var7.j(L02, i13, null);
                b1Var6.setChecked(TLObject.hasFlag(v5Var2.f47578g, 1));
                b1Var5.setChecked(TLObject.hasFlag(v5Var2.f47578g, 2));
                b1Var4.setChecked(TLObject.hasFlag(v5Var2.f47578g, 4));
                b1Var3.setChecked(TLObject.hasFlag(v5Var2.f47578g, 8));
                if (z10) {
                    b1Var2.setChecked(TLObject.hasFlag(v5Var2.f47578g, 256));
                    b1Var.setChecked(TLObject.hasFlag(v5Var2.f47578g, 512));
                    return;
                }
                return;
        }
    }

    public hq0(ph.s3 s3Var, org.telegram.ui.ActionBar.b1 b1Var, org.telegram.ui.ActionBar.b1 b1Var2, org.telegram.ui.ActionBar.b1 b1Var3, org.telegram.ui.ActionBar.b1 b1Var4, org.telegram.ui.ActionBar.b1 b1Var5, boolean z10, org.telegram.ui.ActionBar.b1 b1Var6, org.telegram.ui.ActionBar.b1 b1Var7) {
        this.f26800s = s3Var;
        this.f26795b = b1Var;
        this.f26796c = b1Var2;
        this.d = b1Var3;
        this.e = b1Var4;
        this.f26797f = b1Var5;
        this.h = z10;
        this.f26798n = b1Var6;
        this.f26799r = b1Var7;
    }
}
