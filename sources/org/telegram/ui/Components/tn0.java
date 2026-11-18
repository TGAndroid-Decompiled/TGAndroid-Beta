package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class tn0 implements View.OnClickListener {
    public final int f40059a;
    public final yo0 f40060b;

    public tn0(yo0 yo0Var, int i7) {
        this.f40059a = i7;
        this.f40060b = yo0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40059a;
        yo0 yo0Var = this.f40060b;
        switch (i7) {
            case 0:
                yo0Var.W0(true);
                return;
            case 1:
                mp mpVar = yo0Var.f42553a2;
                mpVar.a(!mpVar.f37598a.f32838q, true);
                yo0Var.b1();
                return;
            case 2:
                org.telegram.ui.ActionBar.h1 h1Var = yo0Var.F2;
                if (h1Var != null && h1Var.isShowing()) {
                    yo0Var.F2.d(true);
                }
                yo0Var.W0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.h1 h1Var2 = yo0Var.F2;
                if (h1Var2 != null && h1Var2.isShowing()) {
                    yo0Var.F2.d(true);
                }
                yo0Var.W0(true);
                return;
            case 4:
                String[] strArr = yo0Var.f42562k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.f42561j2 || strArr[0] != null) {
                        yo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && yo0Var.f42559h2) {
                            yo0Var.f42560i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            return;
                        }
                        yo0Var.getContext();
                        yo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = yo0Var.f42562k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.f42561j2 || strArr2[0] != null) {
                        yo0Var.dismiss();
                        if (strArr2[0] == null && yo0Var.f42559h2) {
                            yo0Var.f42560i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            return;
                        }
                        yo0Var.getContext();
                        yo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = yo0Var.f42562k2;
                if (yo0Var.Q1.m() == 0) {
                    if (yo0Var.f42561j2 || strArr3[0] != null) {
                        yo0Var.dismiss();
                        if (strArr3[0] == null && yo0Var.f42559h2) {
                            yo0Var.f42560i2 = true;
                            Toast.makeText(yo0Var.getContext(), org.telegram.messenger.gd.M0(2131748587, null), 0).show();
                            return;
                        }
                        yo0Var.getContext();
                        yo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
