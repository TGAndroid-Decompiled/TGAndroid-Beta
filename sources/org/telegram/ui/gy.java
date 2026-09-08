package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gy {
    public final uy f36837a;

    public gy(uy uyVar) {
        this.f36837a = uyVar;
    }

    public final long a() {
        uy uyVar = this.f36837a;
        ox oxVar = uyVar.F3;
        if (oxVar != null && (oxVar.getFragment() instanceof eg1)) {
            return -((eg1) uyVar.F3.getFragment()).f36052a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        uy uyVar = this.f36837a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.rn0 rn0Var = uyVar.C0.f32977b0;
        if (rn0Var.N && rn0Var.P()) {
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.rn0 rn0Var2 = uyVar.C0.f32977b0;
            if (rn0Var2.N) {
                arrayList = rn0Var2.f11122v0;
            } else {
                arrayList = rn0Var2.f11121u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f36520b;

                {
                    this.f36520b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f36520b.f36837a.C0.f32977b0.E();
                            return;
                        default:
                            uy uyVar2 = this.f36520b.f36837a;
                            if (uyVar2.C0.f32977b0.P()) {
                                uyVar2.C0.f32977b0.E();
                                return;
                            }
                            org.telegram.ui.Components.rn0 rn0Var3 = uyVar2.C0.f32977b0;
                            rn0Var3.f11108j0.c();
                            rn0Var3.J.clear();
                            rn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f36520b;

                {
                    this.f36520b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f36520b.f36837a.C0.f32977b0.E();
                            return;
                        default:
                            uy uyVar2 = this.f36520b.f36837a;
                            if (uyVar2.C0.f32977b0.P()) {
                                uyVar2.C0.f32977b0.E();
                                return;
                            }
                            org.telegram.ui.Components.rn0 rn0Var3 = uyVar2.C0.f32977b0;
                            rn0Var3.f11108j0.c();
                            rn0Var3.J.clear();
                            rn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20925q7));
        }
    }

    public final void c() {
        int i10;
        ey eyVar = this.f36837a.C0;
        if (eyVar != null) {
            org.telegram.ui.Components.qk0 qk0Var = eyVar.f32979d0;
            int i11 = eyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            qk0Var.b(i10);
            eyVar.S0 = eyVar.f32977b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.f36837a;
        if (uyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.f41314j2 && uyVar.f41318k2) {
            ey eyVar = uyVar.C0;
            if (eyVar.W != null) {
                if (!z10 && eyVar.f32977b0.h() == 0) {
                    uyVar.C0.W.e(false, z11);
                } else {
                    uyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && uyVar.C0.f32977b0.h() == 0) {
            ey eyVar2 = uyVar.C0;
            eyVar2.f32979d0.a();
            eyVar2.V.invalidate();
            eyVar2.S0 = 0;
        }
    }
}
