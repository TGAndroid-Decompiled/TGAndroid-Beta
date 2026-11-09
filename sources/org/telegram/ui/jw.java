package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jw {
    public final yw f47105a;

    public jw(yw ywVar) {
        this.f47105a = ywVar;
    }

    public final long a() {
        yw ywVar = this.f47105a;
        uv uvVar = ywVar.G3;
        if (uvVar != null && (uvVar.getFragment() instanceof y91)) {
            return -((y91) ywVar.G3.getFragment()).f52013a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        yw ywVar = this.f47105a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        org.telegram.ui.Components.zl0 zl0Var = ywVar.C0.f33995d0;
        boolean z9 = zl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        if (z9 && zl0Var.O()) {
            u1Var.R = org.telegram.messenger.id.M0(2131752059, null);
            org.telegram.ui.Components.zl0 zl0Var2 = ywVar.C0.f33995d0;
            if (zl0Var2.N) {
                arrayList = zl0Var2.f16763v0;
            } else {
                arrayList = zl0Var2.f16762u0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            u1Var.T = org.telegram.messenger.id.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) {
                public final jw f46766b;

                {
                    this.f46766b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46766b.f47105a.C0.f33995d0.E();
                            return;
                        default:
                            yw ywVar2 = this.f46766b.f47105a;
                            if (ywVar2.C0.f33995d0.O()) {
                                ywVar2.C0.f33995d0.E();
                                return;
                            }
                            org.telegram.ui.Components.zl0 zl0Var3 = ywVar2.C0.f33995d0;
                            zl0Var3.f16749j0.c();
                            zl0Var3.J.clear();
                            zl0Var3.f();
                            return;
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.id.M0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) {
                public final jw f46766b;

                {
                    this.f46766b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46766b.f47105a.C0.f33995d0.E();
                            return;
                        default:
                            yw ywVar2 = this.f46766b.f47105a;
                            if (ywVar2.C0.f33995d0.O()) {
                                ywVar2.C0.f33995d0.E();
                                return;
                            }
                            org.telegram.ui.Components.zl0 zl0Var3 = ywVar2.C0.f33995d0;
                            zl0Var3.f16749j0.c();
                            zl0Var3.J.clear();
                            zl0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        ywVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, ywVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        hw hwVar = this.f47105a.C0;
        if (hwVar != null) {
            org.telegram.ui.Components.ti0 ti0Var = hwVar.f33997f0;
            int i10 = hwVar.U0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            ti0Var.b(i7);
            hwVar.U0 = hwVar.f33995d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        yw ywVar = this.f47105a;
        if (ywVar.C0.f33993b0.getVisibility() == 0) {
            z10 = true;
        }
        if (ywVar.f52263k2 && ywVar.f52267l2) {
            hw hwVar = ywVar.C0;
            if (hwVar.f33993b0 != null) {
                if (!z9 && hwVar.f33995d0.b() == 0) {
                    ywVar.C0.f33993b0.e(false, z10);
                } else {
                    ywVar.C0.f33993b0.e(true, z10);
                }
            }
        }
        if (z9 && ywVar.C0.f33995d0.b() == 0) {
            hw hwVar2 = ywVar.C0;
            hwVar2.f33997f0.a();
            hwVar2.f33992a0.invalidate();
            hwVar2.U0 = 0;
        }
    }
}
