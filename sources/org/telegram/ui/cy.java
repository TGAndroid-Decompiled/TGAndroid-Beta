package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cy {
    public final qy f32801a;

    public cy(qy qyVar) {
        this.f32801a = qyVar;
    }

    public final long a() {
        qy qyVar = this.f32801a;
        kx kxVar = qyVar.F3;
        if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
            return -((wf1) qyVar.F3.getFragment()).f39293a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        qy qyVar = this.f32801a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        org.telegram.ui.Components.eo0 eo0Var = qyVar.C0.f26144b0;
        if (eo0Var.N && eo0Var.P()) {
            alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.eo0 eo0Var2 = qyVar.C0.f26144b0;
            if (eo0Var2.N) {
                arrayList = eo0Var2.f9768v0;
            } else {
                arrayList = eo0Var2.f9767u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18647a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final cy f32242b;

                {
                    this.f32242b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32242b.f32801a.C0.f26144b0.E();
                            return;
                        default:
                            qy qyVar2 = this.f32242b.f32801a;
                            if (qyVar2.C0.f26144b0.P()) {
                                qyVar2.C0.f26144b0.E();
                                return;
                            }
                            org.telegram.ui.Components.eo0 eo0Var3 = qyVar2.C0.f26144b0;
                            eo0Var3.f9754j0.c();
                            eo0Var3.J.clear();
                            eo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final cy f32242b;

                {
                    this.f32242b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32242b.f32801a.C0.f26144b0.E();
                            return;
                        default:
                            qy qyVar2 = this.f32242b.f32801a;
                            if (qyVar2.C0.f26144b0.P()) {
                                qyVar2.C0.f26144b0.E();
                                return;
                            }
                            org.telegram.ui.Components.eo0 eo0Var3 = qyVar2.C0.f26144b0;
                            eo0Var3.f9754j0.c();
                            eo0Var3.J.clear();
                            eo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        qyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19284q7));
        }
    }

    public final void c() {
        int i10;
        zx zxVar = this.f32801a.C0;
        if (zxVar != null) {
            org.telegram.ui.Components.bl0 bl0Var = zxVar.f26146d0;
            int i11 = zxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            bl0Var.b(i10);
            zxVar.S0 = zxVar.f26144b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        qy qyVar = this.f32801a;
        if (qyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (qyVar.f37049j2 && qyVar.f37053k2) {
            zx zxVar = qyVar.C0;
            if (zxVar.W != null) {
                if (!z10 && zxVar.f26144b0.h() == 0) {
                    qyVar.C0.W.e(false, z11);
                } else {
                    qyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && qyVar.C0.f26144b0.h() == 0) {
            zx zxVar2 = qyVar.C0;
            zxVar2.f26146d0.a();
            zxVar2.V.invalidate();
            zxVar2.S0 = 0;
        }
    }
}
