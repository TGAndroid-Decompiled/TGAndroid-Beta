package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ky {
    public final yy f37546a;

    public ky(yy yyVar) {
        this.f37546a = yyVar;
    }

    public final long a() {
        yy yyVar = this.f37546a;
        sx sxVar = yyVar.G3;
        if (sxVar != null && (sxVar.getFragment() instanceof kg1)) {
            return -((kg1) yyVar.G3.getFragment()).f37380a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        yy yyVar = this.f37546a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
        org.telegram.ui.Components.so0 so0Var = yyVar.C0.f31618b0;
        if (so0Var.N && so0Var.P()) {
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.so0 so0Var2 = yyVar.C0.f31618b0;
            if (so0Var2.N) {
                arrayList = so0Var2.f10593v0;
            } else {
                arrayList = so0Var2.f10592u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f19248a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final ky f37171b;

                {
                    this.f37171b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37171b.f37546a.C0.f31618b0.E();
                            return;
                        default:
                            yy yyVar2 = this.f37171b.f37546a;
                            if (yyVar2.C0.f31618b0.P()) {
                                yyVar2.C0.f31618b0.E();
                                return;
                            }
                            org.telegram.ui.Components.so0 so0Var3 = yyVar2.C0.f31618b0;
                            so0Var3.f10579j0.c();
                            so0Var3.J.clear();
                            so0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final ky f37171b;

                {
                    this.f37171b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37171b.f37546a.C0.f31618b0.E();
                            return;
                        default:
                            yy yyVar2 = this.f37171b.f37546a;
                            if (yyVar2.C0.f31618b0.P()) {
                                yyVar2.C0.f31618b0.E();
                                return;
                            }
                            org.telegram.ui.Components.so0 so0Var3 = yyVar2.C0.f31618b0;
                            so0Var3.f10579j0.c();
                            so0Var3.J.clear();
                            so0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        yyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
        }
    }

    public final void c() {
        int i10;
        iy iyVar = this.f37546a.C0;
        if (iyVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = iyVar.f31620d0;
            int i11 = iyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            rl0Var.b(i10);
            iyVar.S0 = iyVar.f31618b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        yy yyVar = this.f37546a;
        if (yyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (yyVar.f42032j2 && yyVar.f42037k2) {
            iy iyVar = yyVar.C0;
            if (iyVar.W != null) {
                if (!z10 && iyVar.f31618b0.h() == 0) {
                    yyVar.C0.W.e(false, z11);
                } else {
                    yyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && yyVar.C0.f31618b0.h() == 0) {
            iy iyVar2 = yyVar.C0;
            iyVar2.f31620d0.a();
            iyVar2.V.invalidate();
            iyVar2.S0 = 0;
        }
    }
}
