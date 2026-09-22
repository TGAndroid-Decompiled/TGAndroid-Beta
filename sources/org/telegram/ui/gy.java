package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gy {
    public final uy f34019a;

    public gy(uy uyVar) {
        this.f34019a = uyVar;
    }

    public final long a() {
        uy uyVar = this.f34019a;
        ox oxVar = uyVar.F3;
        if (oxVar != null && (oxVar.getFragment() instanceof fg1)) {
            return -((fg1) uyVar.F3.getFragment()).f33621a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        uy uyVar = this.f34019a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.go0 go0Var = uyVar.C0.f26838c0;
        if (go0Var.N && go0Var.P()) {
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.go0 go0Var2 = uyVar.C0.f26838c0;
            if (go0Var2.N) {
                arrayList = go0Var2.f9787v0;
            } else {
                arrayList = go0Var2.f9786u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18669a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f33779b;

                {
                    this.f33779b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33779b.f34019a.C0.f26838c0.E();
                            return;
                        default:
                            uy uyVar2 = this.f33779b.f34019a;
                            if (uyVar2.C0.f26838c0.P()) {
                                uyVar2.C0.f26838c0.E();
                                return;
                            }
                            org.telegram.ui.Components.go0 go0Var3 = uyVar2.C0.f26838c0;
                            go0Var3.f9773j0.c();
                            go0Var3.J.clear();
                            go0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final gy f33779b;

                {
                    this.f33779b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33779b.f34019a.C0.f26838c0.E();
                            return;
                        default:
                            uy uyVar2 = this.f33779b.f34019a;
                            if (uyVar2.C0.f26838c0.P()) {
                                uyVar2.C0.f26838c0.E();
                                return;
                            }
                            org.telegram.ui.Components.go0 go0Var3 = uyVar2.C0.f26838c0;
                            go0Var3.f9773j0.c();
                            go0Var3.J.clear();
                            go0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19348q7));
        }
    }

    public final void c() {
        int i10;
        ey eyVar = this.f34019a.C0;
        if (eyVar != null) {
            org.telegram.ui.Components.dl0 dl0Var = eyVar.f26840e0;
            int i11 = eyVar.T0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            dl0Var.b(i10);
            eyVar.T0 = eyVar.f26838c0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.f34019a;
        if (uyVar.C0.f26836a0.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.f38305j2 && uyVar.f38309k2) {
            ey eyVar = uyVar.C0;
            if (eyVar.f26836a0 != null) {
                if (!z10 && eyVar.f26838c0.h() == 0) {
                    uyVar.C0.f26836a0.e(false, z11);
                } else {
                    uyVar.C0.f26836a0.e(true, z11);
                }
            }
        }
        if (z10 && uyVar.C0.f26838c0.h() == 0) {
            ey eyVar2 = uyVar.C0;
            eyVar2.f26840e0.a();
            eyVar2.W.invalidate();
            eyVar2.T0 = 0;
        }
    }
}
