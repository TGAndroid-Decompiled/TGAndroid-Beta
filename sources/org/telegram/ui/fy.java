package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fy {
    public final ty f37717a;

    public fy(ty tyVar) {
        this.f37717a = tyVar;
    }

    public final long a() {
        ty tyVar = this.f37717a;
        nx nxVar = tyVar.F3;
        if (nxVar != null && (nxVar.getFragment() instanceof fg1)) {
            return -((fg1) tyVar.F3.getFragment()).f37558a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ty tyVar = this.f37717a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        org.telegram.ui.Components.wo0 wo0Var = tyVar.C0.f25766b0;
        if (wo0Var.N && wo0Var.P()) {
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wo0 wo0Var2 = tyVar.C0.f25766b0;
            if (wo0Var2.N) {
                arrayList = wo0Var2.f10641v0;
            } else {
                arrayList = wo0Var2.f10640u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20374a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final fy f37384b;

                {
                    this.f37384b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37384b.f37717a.C0.f25766b0.E();
                            return;
                        default:
                            ty tyVar2 = this.f37384b.f37717a;
                            if (tyVar2.C0.f25766b0.P()) {
                                tyVar2.C0.f25766b0.E();
                                return;
                            }
                            org.telegram.ui.Components.wo0 wo0Var3 = tyVar2.C0.f25766b0;
                            wo0Var3.f10627j0.c();
                            wo0Var3.J.clear();
                            wo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final fy f37384b;

                {
                    this.f37384b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37384b.f37717a.C0.f25766b0.E();
                            return;
                        default:
                            ty tyVar2 = this.f37384b.f37717a;
                            if (tyVar2.C0.f25766b0.P()) {
                                tyVar2.C0.f25766b0.E();
                                return;
                            }
                            org.telegram.ui.Components.wo0 wo0Var3 = tyVar2.C0.f25766b0;
                            wo0Var3.f10627j0.c();
                            wo0Var3.J.clear();
                            wo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        tyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21037q7));
        }
    }

    public final void c() {
        int i10;
        dy dyVar = this.f37717a.C0;
        if (dyVar != null) {
            org.telegram.ui.Components.vl0 vl0Var = dyVar.f25768d0;
            int i11 = dyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            vl0Var.b(i10);
            dyVar.S0 = dyVar.f25766b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ty tyVar = this.f37717a;
        if (tyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (tyVar.f42202j2 && tyVar.f42206k2) {
            dy dyVar = tyVar.C0;
            if (dyVar.W != null) {
                if (!z10 && dyVar.f25766b0.h() == 0) {
                    tyVar.C0.W.e(false, z11);
                } else {
                    tyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && tyVar.C0.f25766b0.h() == 0) {
            dy dyVar2 = tyVar.C0;
            dyVar2.f25768d0.a();
            dyVar2.V.invalidate();
            dyVar2.S0 = 0;
        }
    }
}
