package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class px {
    public final ey f40253a;

    public px(ey eyVar) {
        this.f40253a = eyVar;
    }

    public final long a() {
        ey eyVar = this.f40253a;
        yw ywVar = eyVar.G3;
        if (ywVar != null && (ywVar.getFragment() instanceof te1)) {
            return -((te1) eyVar.G3.getFragment()).f41679a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ey eyVar = this.f40253a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.oo0 oo0Var = eyVar.C0.f31340b0;
        if (oo0Var.N && oo0Var.P()) {
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.oo0 oo0Var2 = eyVar.C0.f31340b0;
            if (oo0Var2.N) {
                arrayList = oo0Var2.f11898v0;
            } else {
                arrayList = oo0Var2.f11897u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20601a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final px f39897b;

                {
                    this.f39897b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39897b.f40253a.C0.f31340b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f39897b.f40253a;
                            if (eyVar2.C0.f31340b0.P()) {
                                eyVar2.C0.f31340b0.E();
                                return;
                            }
                            org.telegram.ui.Components.oo0 oo0Var3 = eyVar2.C0.f31340b0;
                            oo0Var3.f11884j0.c();
                            oo0Var3.J.clear();
                            oo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final px f39897b;

                {
                    this.f39897b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39897b.f40253a.C0.f31340b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f39897b.f40253a;
                            if (eyVar2.C0.f31340b0.P()) {
                                eyVar2.C0.f31340b0.E();
                                return;
                            }
                            org.telegram.ui.Components.oo0 oo0Var3 = eyVar2.C0.f31340b0;
                            oo0Var3.f11884j0.c();
                            oo0Var3.J.clear();
                            oo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        eyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
        }
    }

    public final void c() {
        int i10;
        nx nxVar = this.f40253a.C0;
        if (nxVar != null) {
            org.telegram.ui.Components.nl0 nl0Var = nxVar.f31342d0;
            int i11 = nxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            nl0Var.b(i10);
            nxVar.S0 = nxVar.f31340b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.f40253a;
        if (eyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.f36658j2 && eyVar.f36663k2) {
            nx nxVar = eyVar.C0;
            if (nxVar.W != null) {
                if (!z10 && nxVar.f31340b0.h() == 0) {
                    eyVar.C0.W.e(false, z11);
                } else {
                    eyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && eyVar.C0.f31340b0.h() == 0) {
            nx nxVar2 = eyVar.C0;
            nxVar2.f31342d0.a();
            nxVar2.V.invalidate();
            nxVar2.S0 = 0;
        }
    }
}
