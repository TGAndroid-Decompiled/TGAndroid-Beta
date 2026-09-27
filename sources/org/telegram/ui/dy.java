package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dy {
    public final ty f33063a;

    public dy(ty tyVar) {
        this.f33063a = tyVar;
    }

    public final long a() {
        ty tyVar = this.f33063a;
        kx kxVar = tyVar.F3;
        if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
            return -((wf1) tyVar.F3.getFragment()).f39287a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ty tyVar = this.f33063a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        org.telegram.ui.Components.fo0 fo0Var = tyVar.C0.f26496c0;
        if (fo0Var.N && fo0Var.P()) {
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.fo0 fo0Var2 = tyVar.C0.f26496c0;
            if (fo0Var2.N) {
                arrayList = fo0Var2.f9774v0;
            } else {
                arrayList = fo0Var2.f9773u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18655a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final dy f32809b;

                {
                    this.f32809b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32809b.f33063a.C0.f26496c0.E();
                            return;
                        default:
                            ty tyVar2 = this.f32809b.f33063a;
                            if (tyVar2.C0.f26496c0.P()) {
                                tyVar2.C0.f26496c0.E();
                                return;
                            }
                            org.telegram.ui.Components.fo0 fo0Var3 = tyVar2.C0.f26496c0;
                            fo0Var3.f9760j0.c();
                            fo0Var3.J.clear();
                            fo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final dy f32809b;

                {
                    this.f32809b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32809b.f33063a.C0.f26496c0.E();
                            return;
                        default:
                            ty tyVar2 = this.f32809b.f33063a;
                            if (tyVar2.C0.f26496c0.P()) {
                                tyVar2.C0.f26496c0.E();
                                return;
                            }
                            org.telegram.ui.Components.fo0 fo0Var3 = tyVar2.C0.f26496c0;
                            fo0Var3.f9760j0.c();
                            fo0Var3.J.clear();
                            fo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        tyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
        }
    }

    public final void c() {
        int i10;
        ay ayVar = this.f33063a.C0;
        if (ayVar != null) {
            org.telegram.ui.Components.dl0 dl0Var = ayVar.f26498e0;
            int i11 = ayVar.T0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            dl0Var.b(i10);
            ayVar.T0 = ayVar.f26496c0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ty tyVar = this.f33063a;
        if (tyVar.C0.f26494a0.getVisibility() == 0) {
            z11 = true;
        }
        if (tyVar.f38004j2 && tyVar.f38008k2) {
            ay ayVar = tyVar.C0;
            if (ayVar.f26494a0 != null) {
                if (!z10 && ayVar.f26496c0.h() == 0) {
                    tyVar.C0.f26494a0.e(false, z11);
                } else {
                    tyVar.C0.f26494a0.e(true, z11);
                }
            }
        }
        if (z10 && tyVar.C0.f26496c0.h() == 0) {
            ay ayVar2 = tyVar.C0;
            ayVar2.f26498e0.a();
            ayVar2.W.invalidate();
            ayVar2.T0 = 0;
        }
    }
}
