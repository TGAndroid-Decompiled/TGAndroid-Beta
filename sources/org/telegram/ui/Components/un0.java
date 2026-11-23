package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class un0 implements View.OnClickListener {
    public final int f40423a;
    public final zo0 f40424b;

    public un0(zo0 zo0Var, int i7) {
        this.f40423a = i7;
        this.f40424b = zo0Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40423a;
        zo0 zo0Var = this.f40424b;
        switch (i7) {
            case 0:
                zo0Var.W0(true);
                return;
            case 1:
                lp lpVar = zo0Var.f42970a2;
                lpVar.a(!lpVar.f37189a.f32938q, true);
                zo0Var.b1();
                return;
            case 2:
                org.telegram.ui.ActionBar.g1 g1Var = zo0Var.F2;
                if (g1Var != null && g1Var.isShowing()) {
                    zo0Var.F2.d(true);
                }
                zo0Var.W0(false);
                return;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var2 = zo0Var.F2;
                if (g1Var2 != null && g1Var2.isShowing()) {
                    zo0Var.F2.d(true);
                }
                zo0Var.W0(true);
                return;
            case 4:
                String[] strArr = zo0Var.f42979k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.f42978j2 || strArr[0] != null) {
                        zo0Var.dismiss();
                        PhotoViewer.p1().z0(true, false);
                        if (strArr[0] == null && zo0Var.f42976h2) {
                            zo0Var.f42977i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        zo0Var.getContext();
                        zo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = zo0Var.f42979k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.f42978j2 || strArr2[0] != null) {
                        zo0Var.dismiss();
                        if (strArr2[0] == null && zo0Var.f42976h2) {
                            zo0Var.f42977i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        zo0Var.getContext();
                        zo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = zo0Var.f42979k2;
                if (zo0Var.Q1.m() == 0) {
                    if (zo0Var.f42978j2 || strArr3[0] != null) {
                        zo0Var.dismiss();
                        if (strArr3[0] == null && zo0Var.f42976h2) {
                            zo0Var.f42977i2 = true;
                            Toast.makeText(zo0Var.getContext(), org.telegram.messenger.gd.N0(2131748586, null), 0).show();
                            return;
                        }
                        zo0Var.getContext();
                        zo0Var.N0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
