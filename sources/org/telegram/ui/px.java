package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class px {
    public final ey f40644a;

    public px(ey eyVar) {
        this.f40644a = eyVar;
    }

    public final long a() {
        ey eyVar = this.f40644a;
        yw ywVar = eyVar.G3;
        if (ywVar != null && (ywVar.getFragment() instanceof xe1)) {
            return -((xe1) eyVar.G3.getFragment()).f43545a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ey eyVar = this.f40644a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.ro0 ro0Var = eyVar.C0.f33303b0;
        if (ro0Var.N && ro0Var.O()) {
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.ro0 ro0Var2 = eyVar.C0.f33303b0;
            if (ro0Var2.N) {
                arrayList = ro0Var2.f11924v0;
            } else {
                arrayList = ro0Var2.f11923u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20679a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final px f40271b;

                {
                    this.f40271b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40271b.f40644a.C0.f33303b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f40271b.f40644a;
                            if (eyVar2.C0.f33303b0.O()) {
                                eyVar2.C0.f33303b0.E();
                                return;
                            }
                            org.telegram.ui.Components.ro0 ro0Var3 = eyVar2.C0.f33303b0;
                            ro0Var3.f11910j0.c();
                            ro0Var3.J.clear();
                            ro0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final px f40271b;

                {
                    this.f40271b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40271b.f40644a.C0.f33303b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f40271b.f40644a;
                            if (eyVar2.C0.f33303b0.O()) {
                                eyVar2.C0.f33303b0.E();
                                return;
                            }
                            org.telegram.ui.Components.ro0 ro0Var3 = eyVar2.C0.f33303b0;
                            ro0Var3.f11910j0.c();
                            ro0Var3.J.clear();
                            ro0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        eyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, eyVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        nx nxVar = this.f40644a.C0;
        if (nxVar != null) {
            org.telegram.ui.Components.ql0 ql0Var = nxVar.f33305d0;
            int i11 = nxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            ql0Var.b(i10);
            nxVar.S0 = nxVar.f33303b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.f40644a;
        if (eyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.f37062j2 && eyVar.f37067k2) {
            nx nxVar = eyVar.C0;
            if (nxVar.W != null) {
                if (!z10 && nxVar.f33303b0.h() == 0) {
                    eyVar.C0.W.e(false, z11);
                } else {
                    eyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && eyVar.C0.f33303b0.h() == 0) {
            nx nxVar2 = eyVar.C0;
            nxVar2.f33305d0.a();
            nxVar2.V.invalidate();
            nxVar2.S0 = 0;
        }
    }
}
