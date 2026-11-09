package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class hp0 implements Runnable {
    public final int f34346a = 0;
    public final org.telegram.ui.ActionBar.z0 f34347b;
    public final org.telegram.ui.ActionBar.z0 f34348c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f34349e;
    public final org.telegram.ui.ActionBar.z0 f34350f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.z0 f34351n;
    public final org.telegram.ui.ActionBar.z0 f34352r;
    public final Object f34353s;

    public hp0(org.telegram.ui.ActionBar.z0 z0Var, bi.v9 v9Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f34347b = z0Var;
        this.f34353s = v9Var;
        this.f34348c = z0Var2;
        this.d = z0Var3;
        this.f34349e = z0Var4;
        this.f34350f = z0Var5;
        this.h = z9;
        this.f34351n = z0Var6;
        this.f34352r = z0Var7;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f34346a;
        org.telegram.ui.ActionBar.z0 z0Var = this.f34352r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f34351n;
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f34350f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f34349e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.f34348c;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.f34347b;
        Object obj = this.f34353s;
        switch (i13) {
            case 0:
                bi.v9 v9Var = (bi.v9) obj;
                if (z0Var7 != null) {
                    if (v9Var.f4907e) {
                        i7 = 2131750197;
                    } else {
                        i7 = 2131750198;
                    }
                    String M0 = org.telegram.messenger.id.M0(i7, null);
                    if (v9Var.f4907e) {
                        i10 = 2131231890;
                    } else {
                        i10 = 2131231888;
                    }
                    z0Var7.j(M0, i10, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(v9Var.f4909g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var.f4909g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var.f4909g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var.f4909g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var.f4909g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var.f4909g, 512));
                    return;
                }
                return;
            default:
                bi.v9 v9Var2 = ((zh.n3) obj).f60490c.Q1;
                if (v9Var2.f4907e) {
                    i11 = 2131750197;
                } else {
                    i11 = 2131750198;
                }
                String M02 = org.telegram.messenger.id.M0(i11, null);
                if (v9Var2.f4907e) {
                    i12 = 2131231890;
                } else {
                    i12 = 2131231888;
                }
                z0Var7.j(M02, i12, null);
                z0Var6.setChecked(TLObject.hasFlag(v9Var2.f4909g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var2.f4909g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var2.f4909g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var2.f4909g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var2.f4909g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var2.f4909g, 512));
                    return;
                }
                return;
        }
    }

    public hp0(zh.n3 n3Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.f34353s = n3Var;
        this.f34347b = z0Var;
        this.f34348c = z0Var2;
        this.d = z0Var3;
        this.f34349e = z0Var4;
        this.f34350f = z0Var5;
        this.h = z9;
        this.f34351n = z0Var6;
        this.f34352r = z0Var7;
    }
}
