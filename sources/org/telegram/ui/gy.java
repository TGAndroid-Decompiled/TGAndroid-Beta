package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gy {
    public final uy f33967a;

    public gy(uy uyVar) {
        this.f33967a = uyVar;
    }

    public final long a() {
        uy uyVar = this.f33967a;
        ox oxVar = uyVar.F3;
        if (oxVar != null && (oxVar.getFragment() instanceof dg1)) {
            return -((dg1) uyVar.F3.getFragment()).f32970a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        uy uyVar = this.f33967a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.eo0 eo0Var = uyVar.C0.f26207c0;
        if (eo0Var.N && eo0Var.P()) {
            alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.eo0 eo0Var2 = uyVar.C0.f26207c0;
            if (eo0Var2.N) {
                arrayList = eo0Var2.f9786v0;
            } else {
                arrayList = eo0Var2.f9785u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18622a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f33640b;

                {
                    this.f33640b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33640b.f33967a.C0.f26207c0.E();
                            return;
                        default:
                            uy uyVar2 = this.f33640b.f33967a;
                            if (uyVar2.C0.f26207c0.P()) {
                                uyVar2.C0.f26207c0.E();
                                return;
                            }
                            org.telegram.ui.Components.eo0 eo0Var3 = uyVar2.C0.f26207c0;
                            eo0Var3.f9772j0.c();
                            eo0Var3.J.clear();
                            eo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f33640b;

                {
                    this.f33640b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33640b.f33967a.C0.f26207c0.E();
                            return;
                        default:
                            uy uyVar2 = this.f33640b.f33967a;
                            if (uyVar2.C0.f26207c0.P()) {
                                uyVar2.C0.f26207c0.E();
                                return;
                            }
                            org.telegram.ui.Components.eo0 eo0Var3 = uyVar2.C0.f26207c0;
                            eo0Var3.f9772j0.c();
                            eo0Var3.J.clear();
                            eo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19301q7));
        }
    }

    public final void c() {
        int i10;
        ey eyVar = this.f33967a.C0;
        if (eyVar != null) {
            org.telegram.ui.Components.bl0 bl0Var = eyVar.f26209e0;
            int i11 = eyVar.T0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            bl0Var.b(i10);
            eyVar.T0 = eyVar.f26207c0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.f33967a;
        if (uyVar.C0.f26205a0.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.f38177j2 && uyVar.f38181k2) {
            ey eyVar = uyVar.C0;
            if (eyVar.f26205a0 != null) {
                if (!z10 && eyVar.f26207c0.h() == 0) {
                    uyVar.C0.f26205a0.e(false, z11);
                } else {
                    uyVar.C0.f26205a0.e(true, z11);
                }
            }
        }
        if (z10 && uyVar.C0.f26207c0.h() == 0) {
            ey eyVar2 = uyVar.C0;
            eyVar2.f26209e0.a();
            eyVar2.W.invalidate();
            eyVar2.T0 = 0;
        }
    }
}
