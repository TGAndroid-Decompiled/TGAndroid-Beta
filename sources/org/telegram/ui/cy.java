package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cy {
    public final qy f33255a;

    public cy(qy qyVar) {
        this.f33255a = qyVar;
    }

    public final long a() {
        qy qyVar = this.f33255a;
        lx lxVar = qyVar.C3;
        if (lxVar != null && (lxVar.getFragment() instanceof sf1)) {
            return -((sf1) qyVar.C3.getFragment()).f38175a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        qy qyVar = this.f33255a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        org.telegram.ui.Components.vn0 vn0Var = qyVar.f37647z0.V;
        if (vn0Var.K && vn0Var.P()) {
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.vn0 vn0Var2 = qyVar.f37647z0.V;
            if (vn0Var2.K) {
                arrayList = vn0Var2.f44975s0;
            } else {
                arrayList = vn0Var2.f44973r0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                public final cy f32670b;

                {
                    this.f32670b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32670b.f33255a.f37647z0.V.E();
                            return;
                        default:
                            qy qyVar2 = this.f32670b.f33255a;
                            if (qyVar2.f37647z0.V.P()) {
                                qyVar2.f37647z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.vn0 vn0Var3 = qyVar2.f37647z0.V;
                            vn0Var3.f44961g0.c();
                            vn0Var3.G.clear();
                            vn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) {
                public final cy f32670b;

                {
                    this.f32670b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32670b.f33255a.f37647z0.V.E();
                            return;
                        default:
                            qy qyVar2 = this.f32670b.f33255a;
                            if (qyVar2.f37647z0.V.P()) {
                                qyVar2.f37647z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.vn0 vn0Var3 = qyVar2.f37647z0.V;
                            vn0Var3.f44961g0.c();
                            vn0Var3.G.clear();
                            vn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        qyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20116q7));
        }
    }

    public final void c() {
        int i10;
        zx zxVar = this.f33255a.f37647z0;
        if (zxVar != null) {
            org.telegram.ui.Components.yk0 yk0Var = zxVar.f23983a0;
            int i11 = zxVar.P0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            yk0Var.b(i10);
            zxVar.P0 = zxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        qy qyVar = this.f33255a;
        if (qyVar.f37647z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (qyVar.f37555g2 && qyVar.f37560h2) {
            zx zxVar = qyVar.f37647z0;
            if (zxVar.T != null) {
                if (!z4 && zxVar.V.h() == 0) {
                    qyVar.f37647z0.T.e(false, z10);
                } else {
                    qyVar.f37647z0.T.e(true, z10);
                }
            }
        }
        if (z4 && qyVar.f37647z0.V.h() == 0) {
            zx zxVar2 = qyVar.f37647z0;
            zxVar2.f23983a0.a();
            zxVar2.S.invalidate();
            zxVar2.P0 = 0;
        }
    }
}
