package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dy {
    public final ry f32739a;

    public dy(ry ryVar) {
        this.f32739a = ryVar;
    }

    public final long a() {
        ry ryVar = this.f32739a;
        lx lxVar = ryVar.F3;
        if (lxVar != null && (lxVar.getFragment() instanceof wf1)) {
            return -((wf1) ryVar.F3.getFragment()).f38936a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ry ryVar = this.f32739a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
        org.telegram.ui.Components.rn0 rn0Var = ryVar.C0.f30335b0;
        if (rn0Var.N && rn0Var.P()) {
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.rn0 rn0Var2 = ryVar.C0.f30335b0;
            if (rn0Var2.N) {
                arrayList = rn0Var2.f9769v0;
            } else {
                arrayList = rn0Var2.f9768u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18409a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final dy f32437b;

                {
                    this.f32437b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32437b.f32739a.C0.f30335b0.E();
                            return;
                        default:
                            ry ryVar2 = this.f32437b.f32739a;
                            if (ryVar2.C0.f30335b0.P()) {
                                ryVar2.C0.f30335b0.E();
                                return;
                            }
                            org.telegram.ui.Components.rn0 rn0Var3 = ryVar2.C0.f30335b0;
                            rn0Var3.f9755j0.c();
                            rn0Var3.J.clear();
                            rn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final dy f32437b;

                {
                    this.f32437b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32437b.f32739a.C0.f30335b0.E();
                            return;
                        default:
                            ry ryVar2 = this.f32437b.f32739a;
                            if (ryVar2.C0.f30335b0.P()) {
                                ryVar2.C0.f30335b0.E();
                                return;
                            }
                            org.telegram.ui.Components.rn0 rn0Var3 = ryVar2.C0.f30335b0;
                            rn0Var3.f9755j0.c();
                            rn0Var3.J.clear();
                            rn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        ryVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
        }
    }

    public final void c() {
        int i10;
        ay ayVar = this.f32739a.C0;
        if (ayVar != null) {
            org.telegram.ui.Components.rk0 rk0Var = ayVar.f30337d0;
            int i11 = ayVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            rk0Var.b(i10);
            ayVar.S0 = ayVar.f30335b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ry ryVar = this.f32739a;
        if (ryVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (ryVar.f37006j2 && ryVar.f37010k2) {
            ay ayVar = ryVar.C0;
            if (ayVar.W != null) {
                if (!z10 && ayVar.f30335b0.h() == 0) {
                    ryVar.C0.W.e(false, z11);
                } else {
                    ryVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && ryVar.C0.f30335b0.h() == 0) {
            ay ayVar2 = ryVar.C0;
            ayVar2.f30337d0.a();
            ayVar2.V.invalidate();
            ayVar2.S0 = 0;
        }
    }
}
