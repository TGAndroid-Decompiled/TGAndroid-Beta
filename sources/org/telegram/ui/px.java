package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class px {
    public final ey f40554a;

    public px(ey eyVar) {
        this.f40554a = eyVar;
    }

    public final long a() {
        ey eyVar = this.f40554a;
        yw ywVar = eyVar.G3;
        if (ywVar != null && (ywVar.getFragment() instanceof ye1)) {
            return -((ye1) eyVar.G3.getFragment()).f43792a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ey eyVar = this.f40554a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.so0 so0Var = eyVar.C0.f24799b0;
        if (so0Var.N && so0Var.O()) {
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.so0 so0Var2 = eyVar.C0.f24799b0;
            if (so0Var2.N) {
                arrayList = so0Var2.f11924v0;
            } else {
                arrayList = so0Var2.f11923u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final px f40289b;

                {
                    this.f40289b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40289b.f40554a.C0.f24799b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f40289b.f40554a;
                            if (eyVar2.C0.f24799b0.O()) {
                                eyVar2.C0.f24799b0.E();
                                return;
                            }
                            org.telegram.ui.Components.so0 so0Var3 = eyVar2.C0.f24799b0;
                            so0Var3.f11910j0.c();
                            so0Var3.J.clear();
                            so0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final px f40289b;

                {
                    this.f40289b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f40289b.f40554a.C0.f24799b0.E();
                            return;
                        default:
                            ey eyVar2 = this.f40289b.f40554a;
                            if (eyVar2.C0.f24799b0.O()) {
                                eyVar2.C0.f24799b0.E();
                                return;
                            }
                            org.telegram.ui.Components.so0 so0Var3 = eyVar2.C0.f24799b0;
                            so0Var3.f11910j0.c();
                            so0Var3.J.clear();
                            so0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        eyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, eyVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        nx nxVar = this.f40554a.C0;
        if (nxVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = nxVar.f24801d0;
            int i11 = nxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            rl0Var.b(i10);
            nxVar.S0 = nxVar.f24799b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.f40554a;
        if (eyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.f37087j2 && eyVar.f37092k2) {
            nx nxVar = eyVar.C0;
            if (nxVar.W != null) {
                if (!z10 && nxVar.f24799b0.h() == 0) {
                    eyVar.C0.W.e(false, z11);
                } else {
                    eyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && eyVar.C0.f24799b0.h() == 0) {
            nx nxVar2 = eyVar.C0;
            nxVar2.f24801d0.a();
            nxVar2.V.invalidate();
            nxVar2.S0 = 0;
        }
    }
}
