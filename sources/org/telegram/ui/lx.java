package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lx {
    public final cy f41387a;

    public lx(cy cyVar) {
        this.f41387a = cyVar;
    }

    public final long a() {
        cy cyVar = this.f41387a;
        tw twVar = cyVar.G3;
        if (twVar != null && (twVar.getFragment() instanceof af1)) {
            return -((af1) cyVar.G3.getFragment()).f37734a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        cy cyVar = this.f41387a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        org.telegram.ui.Components.wo0 wo0Var = cyVar.C0.f27936d0;
        if (wo0Var.N && wo0Var.O()) {
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wo0 wo0Var2 = cyVar.C0.f27936d0;
            if (wo0Var2.N) {
                arrayList = wo0Var2.f14097v0;
            } else {
                arrayList = wo0Var2.f14096u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f22368a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final lx f41081b;

                {
                    this.f41081b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41081b.f41387a.C0.f27936d0.E();
                            return;
                        default:
                            cy cyVar2 = this.f41081b.f41387a;
                            if (cyVar2.C0.f27936d0.O()) {
                                cyVar2.C0.f27936d0.E();
                                return;
                            }
                            org.telegram.ui.Components.wo0 wo0Var3 = cyVar2.C0.f27936d0;
                            wo0Var3.f14083j0.c();
                            wo0Var3.J.clear();
                            wo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final lx f41081b;

                {
                    this.f41081b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41081b.f41387a.C0.f27936d0.E();
                            return;
                        default:
                            cy cyVar2 = this.f41081b.f41387a;
                            if (cyVar2.C0.f27936d0.O()) {
                                cyVar2.C0.f27936d0.E();
                                return;
                            }
                            org.telegram.ui.Components.wo0 wo0Var3 = cyVar2.C0.f27936d0;
                            wo0Var3.f14083j0.c();
                            wo0Var3.J.clear();
                            wo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        cyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, cyVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        jx jxVar = this.f41387a.C0;
        if (jxVar != null) {
            org.telegram.ui.Components.ql0 ql0Var = jxVar.f27938f0;
            int i11 = jxVar.U0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            ql0Var.b(i10);
            jxVar.U0 = jxVar.f27936d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cy cyVar = this.f41387a;
        if (cyVar.C0.f27934b0.getVisibility() == 0) {
            z11 = true;
        }
        if (cyVar.f38614j2 && cyVar.f38619k2) {
            jx jxVar = cyVar.C0;
            if (jxVar.f27934b0 != null) {
                if (!z10 && jxVar.f27936d0.h() == 0) {
                    cyVar.C0.f27934b0.e(false, z11);
                } else {
                    cyVar.C0.f27934b0.e(true, z11);
                }
            }
        }
        if (z10 && cyVar.C0.f27936d0.h() == 0) {
            jx jxVar2 = cyVar.C0;
            jxVar2.f27938f0.a();
            jxVar2.f27933a0.invalidate();
            jxVar2.U0 = 0;
        }
    }
}
