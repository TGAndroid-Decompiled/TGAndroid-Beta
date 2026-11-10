package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kw {
    public final zw f47439a;

    public kw(zw zwVar) {
        this.f47439a = zwVar;
    }

    public final long a() {
        zw zwVar = this.f47439a;
        vv vvVar = zwVar.G3;
        if (vvVar != null && (vvVar.getFragment() instanceof z91)) {
            return -((z91) zwVar.G3.getFragment()).f52343a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        zw zwVar = this.f47439a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zwVar.getParentActivity());
        org.telegram.ui.Components.yl0 yl0Var = zwVar.C0.f33590d0;
        boolean z9 = yl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        if (z9 && yl0Var.O()) {
            u1Var.R = org.telegram.messenger.id.M0(2131752059, null);
            org.telegram.ui.Components.yl0 yl0Var2 = zwVar.C0.f33590d0;
            if (yl0Var2.N) {
                arrayList = yl0Var2.f16763v0;
            } else {
                arrayList = yl0Var2.f16762u0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            u1Var.T = org.telegram.messenger.id.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                public final kw f47085b;

                {
                    this.f47085b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f47085b.f47439a.C0.f33590d0.E();
                            return;
                        default:
                            zw zwVar2 = this.f47085b.f47439a;
                            if (zwVar2.C0.f33590d0.O()) {
                                zwVar2.C0.f33590d0.E();
                                return;
                            }
                            org.telegram.ui.Components.yl0 yl0Var3 = zwVar2.C0.f33590d0;
                            yl0Var3.f16749j0.c();
                            yl0Var3.J.clear();
                            yl0Var3.f();
                            return;
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.id.M0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) {
                public final kw f47085b;

                {
                    this.f47085b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f47085b.f47439a.C0.f33590d0.E();
                            return;
                        default:
                            zw zwVar2 = this.f47085b.f47439a;
                            if (zwVar2.C0.f33590d0.O()) {
                                zwVar2.C0.f33590d0.E();
                                return;
                            }
                            org.telegram.ui.Components.yl0 yl0Var3 = zwVar2.C0.f33590d0;
                            yl0Var3.f16749j0.c();
                            yl0Var3.J.clear();
                            yl0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        zwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, zwVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        iw iwVar = this.f47439a.C0;
        if (iwVar != null) {
            org.telegram.ui.Components.si0 si0Var = iwVar.f33592f0;
            int i10 = iwVar.U0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            si0Var.b(i7);
            iwVar.U0 = iwVar.f33590d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        zw zwVar = this.f47439a;
        if (zwVar.C0.f33588b0.getVisibility() == 0) {
            z10 = true;
        }
        if (zwVar.f52609k2 && zwVar.f52613l2) {
            iw iwVar = zwVar.C0;
            if (iwVar.f33588b0 != null) {
                if (!z9 && iwVar.f33590d0.b() == 0) {
                    zwVar.C0.f33588b0.e(false, z10);
                } else {
                    zwVar.C0.f33588b0.e(true, z10);
                }
            }
        }
        if (z9 && zwVar.C0.f33590d0.b() == 0) {
            iw iwVar2 = zwVar.C0;
            iwVar2.f33592f0.a();
            iwVar2.f33587a0.invalidate();
            iwVar2.U0 = 0;
        }
    }
}
