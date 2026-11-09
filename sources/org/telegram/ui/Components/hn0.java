package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class hn0 implements View.OnClickListener {
    public final int f34338a;
    public final no0 f34339b;

    public hn0(no0 no0Var, int i7) {
        this.f34338a = i7;
        this.f34339b = no0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f34338a;
        no0 no0Var = this.f34339b;
        switch (i7) {
            case 0:
                no0Var.V0(true);
                return;
            case 1:
                wo woVar = no0Var.W1;
                woVar.a(!woVar.f40108a.f31268q, true);
                no0Var.a1();
                return;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = no0Var.B2;
                if (g1Var != null && g1Var.isShowing()) {
                    no0Var.B2.d(true);
                }
                no0Var.V0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = no0Var.B2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    no0Var.B2.d(true);
                }
                no0Var.V0(true);
                return;
            case 4:
                String[] strArr = no0Var.f36435g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f36434f2 || strArr[0] != null) {
                        no0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && no0Var.d2) {
                            no0Var.f36433e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            return;
                        }
                        no0Var.getContext();
                        no0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = no0Var.f36435g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f36434f2 || strArr2[0] != null) {
                        no0Var.dismiss();
                        if (strArr2[0] == null && no0Var.d2) {
                            no0Var.f36433e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            return;
                        }
                        no0Var.getContext();
                        no0Var.M0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = no0Var.f36435g2;
                if (no0Var.M1.m() == 0) {
                    if (no0Var.f36434f2 || strArr3[0] != null) {
                        no0Var.dismiss();
                        if (strArr3[0] == null && no0Var.d2) {
                            no0Var.f36433e2 = true;
                            Toast.makeText(no0Var.getContext(), org.telegram.messenger.id.M0(2131748779, null), 0).show();
                            return;
                        }
                        no0Var.getContext();
                        no0Var.M0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
