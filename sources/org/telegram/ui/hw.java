package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hw {
    public final ww f46495a;

    public hw(ww wwVar) {
        this.f46495a = wwVar;
    }

    public final long a() {
        ww wwVar = this.f46495a;
        sv svVar = wwVar.F3;
        if (svVar != null && (svVar.getFragment() instanceof v91)) {
            return -((v91) wwVar.F3.getFragment()).f50619a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        ww wwVar = this.f46495a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wwVar.getParentActivity());
        org.telegram.ui.Components.yl0 yl0Var = wwVar.C0.f33637d0;
        boolean z9 = yl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        if (z9 && yl0Var.O()) {
            u1Var.R = org.telegram.messenger.hd.M0(2131752059, null);
            org.telegram.ui.Components.yl0 yl0Var2 = wwVar.C0.f33637d0;
            if (yl0Var2.N) {
                arrayList = yl0Var2.f16760v0;
            } else {
                arrayList = yl0Var2.f16759u0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            u1Var.T = org.telegram.messenger.hd.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                public final hw f46102b;

                {
                    this.f46102b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46102b.f46495a.C0.f33637d0.E();
                            return;
                        default:
                            ww wwVar2 = this.f46102b.f46495a;
                            if (wwVar2.C0.f33637d0.O()) {
                                wwVar2.C0.f33637d0.E();
                                return;
                            }
                            org.telegram.ui.Components.yl0 yl0Var3 = wwVar2.C0.f33637d0;
                            yl0Var3.f16746j0.c();
                            yl0Var3.J.clear();
                            yl0Var3.f();
                            return;
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.hd.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) {
                public final hw f46102b;

                {
                    this.f46102b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46102b.f46495a.C0.f33637d0.E();
                            return;
                        default:
                            ww wwVar2 = this.f46102b.f46495a;
                            if (wwVar2.C0.f33637d0.O()) {
                                wwVar2.C0.f33637d0.E();
                                return;
                            }
                            org.telegram.ui.Components.yl0 yl0Var3 = wwVar2.C0.f33637d0;
                            yl0Var3.f16746j0.c();
                            yl0Var3.J.clear();
                            yl0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        wwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, wwVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        fw fwVar = this.f46495a.C0;
        if (fwVar != null) {
            org.telegram.ui.Components.si0 si0Var = fwVar.f33639f0;
            int i10 = fwVar.U0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            si0Var.b(i7);
            fwVar.U0 = fwVar.f33637d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        ww wwVar = this.f46495a;
        if (wwVar.C0.f33635b0.getVisibility() == 0) {
            z10 = true;
        }
        if (wwVar.f51562j2 && wwVar.f51566k2) {
            fw fwVar = wwVar.C0;
            if (fwVar.f33635b0 != null) {
                if (!z9 && fwVar.f33637d0.b() == 0) {
                    wwVar.C0.f33635b0.e(false, z10);
                } else {
                    wwVar.C0.f33635b0.e(true, z10);
                }
            }
        }
        if (z9 && wwVar.C0.f33637d0.b() == 0) {
            fw fwVar2 = wwVar.C0;
            fwVar2.f33639f0.a();
            fwVar2.f33634a0.invalidate();
            fwVar2.U0 = 0;
        }
    }
}
