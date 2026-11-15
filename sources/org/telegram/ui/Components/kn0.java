package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class kn0 implements View.OnClickListener {
    public final int f36571a;
    public final po0 f36572b;

    public kn0(po0 po0Var, int i7) {
        this.f36571a = i7;
        this.f36572b = po0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f36571a;
        po0 po0Var = this.f36572b;
        switch (i7) {
            case 0:
                po0Var.V0(true);
                return;
            case 1:
                fp fpVar = po0Var.f38340a2;
                fpVar.a(!fpVar.f34663a.f32441q, true);
                po0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = po0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    po0Var.F2.d(true);
                }
                po0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = po0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    po0Var.F2.d(true);
                }
                po0Var.V0(true);
                return;
            case 4:
                String[] strArr = po0Var.f38349k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.f38348j2 || strArr[0] != null) {
                        po0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && po0Var.f38346h2) {
                            po0Var.f38347i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            return;
                        }
                        po0Var.getContext();
                        po0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = po0Var.f38349k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.f38348j2 || strArr2[0] != null) {
                        po0Var.dismiss();
                        if (strArr2[0] == null && po0Var.f38346h2) {
                            po0Var.f38347i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            return;
                        }
                        po0Var.getContext();
                        po0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = po0Var.f38349k2;
                if (po0Var.Q1.m() == 0) {
                    if (po0Var.f38348j2 || strArr3[0] != null) {
                        po0Var.dismiss();
                        if (strArr3[0] == null && po0Var.f38346h2) {
                            po0Var.f38347i2 = true;
                            Toast.makeText(po0Var.getContext(), org.telegram.messenger.hd.M0(2131748779, null), 0).show();
                            return;
                        }
                        po0Var.getContext();
                        po0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
