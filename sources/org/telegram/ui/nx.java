package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nx {
    public final cy f39705a;

    public nx(cy cyVar) {
        this.f39705a = cyVar;
    }

    public final long a() {
        cy cyVar = this.f39705a;
        ww wwVar = cyVar.G3;
        if (wwVar != null && (wwVar.getFragment() instanceof re1)) {
            return -((re1) cyVar.G3.getFragment()).f41152a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        cy cyVar = this.f39705a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        org.telegram.ui.Components.po0 po0Var = cyVar.C0.f32183b0;
        if (po0Var.N && po0Var.P()) {
            alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.po0 po0Var2 = cyVar.C0.f32183b0;
            if (po0Var2.N) {
                arrayList = po0Var2.f11897v0;
            } else {
                arrayList = po0Var2.f11896u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20609a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final nx f39366b;

                {
                    this.f39366b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39366b.f39705a.C0.f32183b0.E();
                            return;
                        default:
                            cy cyVar2 = this.f39366b.f39705a;
                            if (cyVar2.C0.f32183b0.P()) {
                                cyVar2.C0.f32183b0.E();
                                return;
                            }
                            org.telegram.ui.Components.po0 po0Var3 = cyVar2.C0.f32183b0;
                            po0Var3.f11883j0.c();
                            po0Var3.J.clear();
                            po0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final nx f39366b;

                {
                    this.f39366b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39366b.f39705a.C0.f32183b0.E();
                            return;
                        default:
                            cy cyVar2 = this.f39366b.f39705a;
                            if (cyVar2.C0.f32183b0.P()) {
                                cyVar2.C0.f32183b0.E();
                                return;
                            }
                            org.telegram.ui.Components.po0 po0Var3 = cyVar2.C0.f32183b0;
                            po0Var3.f11883j0.c();
                            po0Var3.J.clear();
                            po0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        cyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7));
        }
    }

    public final void c() {
        int i10;
        lx lxVar = this.f39705a.C0;
        if (lxVar != null) {
            org.telegram.ui.Components.ol0 ol0Var = lxVar.f32185d0;
            int i11 = lxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            ol0Var.b(i10);
            lxVar.S0 = lxVar.f32183b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cy cyVar = this.f39705a;
        if (cyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (cyVar.f36124j2 && cyVar.f36129k2) {
            lx lxVar = cyVar.C0;
            if (lxVar.W != null) {
                if (!z10 && lxVar.f32183b0.h() == 0) {
                    cyVar.C0.W.e(false, z11);
                } else {
                    cyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && cyVar.C0.f32183b0.h() == 0) {
            lx lxVar2 = cyVar.C0;
            lxVar2.f32185d0.a();
            lxVar2.V.invalidate();
            lxVar2.S0 = 0;
        }
    }
}
