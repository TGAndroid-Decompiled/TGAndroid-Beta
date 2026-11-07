package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class gp0 implements Runnable {
    public final int f33964a = 0;
    public final org.telegram.ui.ActionBar.z0 f33965b;
    public final org.telegram.ui.ActionBar.z0 f33966c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f33967e;
    public final org.telegram.ui.ActionBar.z0 f33968f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f33969n;
    public final org.telegram.ui.ActionBar.z0 f33970r;
    public final Object f33971s;

    public gp0(org.telegram.ui.ActionBar.z0 z0Var, bi.v9 v9Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f33965b = z0Var;
        this.f33971s = v9Var;
        this.f33966c = z0Var2;
        this.d = z0Var3;
        this.f33967e = z0Var4;
        this.f33968f = z0Var5;
        this.h = z9;
        this.f33969n = z0Var6;
        this.f33970r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f33964a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f33970r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f33969n;
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f33968f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f33967e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f33966c;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f33965b;
        Object obj = this.f33971s;
        switch (i13) {
            case 0:
                bi.v9 v9Var = (bi.v9) obj;
                if (z0Var7 != null) {
                    if (v9Var.f4909e) {
                        i7 = 2131750196;
                    } else {
                        i7 = 2131750197;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i7, null);
                    if (v9Var.f4909e) {
                        i10 = 2131231890;
                    } else {
                        i10 = 2131231888;
                    }
                    z0Var7.j(M0, i10, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(v9Var.f4911g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var.f4911g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var.f4911g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var.f4911g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var.f4911g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var.f4911g, 512));
                    return;
                }
                return;
            default:
                bi.v9 v9Var2 = ((zh.n3) obj).f60391c.Q1;
                if (v9Var2.f4909e) {
                    i11 = 2131750196;
                } else {
                    i11 = 2131750197;
                }
                String M02 = org.telegram.messenger.hd.M0(i11, null);
                if (v9Var2.f4909e) {
                    i12 = 2131231890;
                } else {
                    i12 = 2131231888;
                }
                z0Var7.j(M02, i12, null);
                z0Var6.setChecked(TLObject.hasFlag(v9Var2.f4911g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var2.f4911g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var2.f4911g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var2.f4911g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var2.f4911g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var2.f4911g, 512));
                    return;
                }
                return;
        }
    }

    public gp0(zh.n3 n3Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f33971s = n3Var;
        this.f33965b = z0Var;
        this.f33966c = z0Var2;
        this.d = z0Var3;
        this.f33967e = z0Var4;
        this.f33968f = z0Var5;
        this.h = z9;
        this.f33969n = z0Var6;
        this.f33970r = z0Var7;
    }
}
