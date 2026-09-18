package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class ob0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ew0 {
    public final int f36159a;
    public final yb0 f36160b;

    public ob0(yb0 yb0Var, int i10) {
        this.f36159a = i10;
        this.f36160b = yb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f36160b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yb0 yb0Var = this.f36160b;
        yb0Var.T.a(yb0Var.e);
        yb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f36159a) {
            case 2:
                yb0 yb0Var = this.f36160b;
                ArrayList arrayList = yb0Var.P;
                if (i10 < arrayList.size()) {
                    yb0Var.f39778w.setText(LocaleController.formatDateAudio(yb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                yb0Var.f39778w.setText("");
                return;
            default:
                yb0 yb0Var2 = this.f36160b;
                yb0Var2.F.clearFocus();
                yb0Var2.O = true;
                ArrayList arrayList2 = yb0Var2.R;
                if (i10 < arrayList2.size()) {
                    yb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    yb0Var2.F.setText("");
                }
                yb0Var2.O = false;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f36159a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
