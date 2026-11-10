package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class gp0 implements Runnable {
    public final int f33947a = 0;
    public final org.telegram.ui.ActionBar.z0 f33948b;
    public final org.telegram.ui.ActionBar.z0 f33949c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f33950e;
    public final org.telegram.ui.ActionBar.z0 f33951f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f33952n;
    public final org.telegram.ui.ActionBar.z0 f33953r;
    public final Object f33954s;

    public gp0(org.telegram.ui.ActionBar.z0 z0Var, bi.v9 v9Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f33948b = z0Var;
        this.f33954s = v9Var;
        this.f33949c = z0Var2;
        this.d = z0Var3;
        this.f33950e = z0Var4;
        this.f33951f = z0Var5;
        this.h = z9;
        this.f33952n = z0Var6;
        this.f33953r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f33947a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f33953r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f33952n;
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f33951f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f33950e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f33949c;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f33948b;
        Object obj = this.f33954s;
        switch (i13) {
            case 0:
                bi.v9 v9Var = (bi.v9) obj;
                if (z0Var7 != null) {
                    if (v9Var.f4908e) {
                        i7 = 2131750197;
                    } else {
                        i7 = 2131750198;
                    }
                    String M0 = org.telegram.messenger.id.M0(i7, null);
                    if (v9Var.f4908e) {
                        i10 = 2131231890;
                    } else {
                        i10 = 2131231888;
                    }
                    z0Var7.j(M0, i10, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(v9Var.f4910g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var.f4910g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var.f4910g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var.f4910g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var.f4910g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var.f4910g, 512));
                    return;
                }
                return;
            default:
                bi.v9 v9Var2 = ((zh.n3) obj).f60497c.T1;
                if (v9Var2.f4908e) {
                    i11 = 2131750197;
                } else {
                    i11 = 2131750198;
                }
                String M02 = org.telegram.messenger.id.M0(i11, null);
                if (v9Var2.f4908e) {
                    i12 = 2131231890;
                } else {
                    i12 = 2131231888;
                }
                z0Var7.j(M02, i12, null);
                z0Var6.setChecked(TLObject.hasFlag(v9Var2.f4910g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var2.f4910g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var2.f4910g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var2.f4910g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var2.f4910g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var2.f4910g, 512));
                    return;
                }
                return;
        }
    }

    public gp0(zh.n3 n3Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f33954s = n3Var;
        this.f33948b = z0Var;
        this.f33949c = z0Var2;
        this.d = z0Var3;
        this.f33950e = z0Var4;
        this.f33951f = z0Var5;
        this.h = z9;
        this.f33952n = z0Var6;
        this.f33953r = z0Var7;
    }
}
