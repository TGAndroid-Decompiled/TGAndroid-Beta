package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class hb0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.dw0 {
    public final int f34181a;
    public final rb0 f34182b;

    public hb0(rb0 rb0Var, int i10) {
        this.f34181a = i10;
        this.f34182b = rb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f34182b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        rb0 rb0Var = this.f34182b;
        rb0Var.T.a(rb0Var.e);
        rb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f34181a) {
            case 2:
                rb0 rb0Var = this.f34182b;
                ArrayList arrayList = rb0Var.P;
                if (i10 < arrayList.size()) {
                    rb0Var.f37289w.setText(LocaleController.formatDateAudio(rb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                rb0Var.f37289w.setText("");
                return;
            default:
                rb0 rb0Var2 = this.f34182b;
                rb0Var2.F.clearFocus();
                rb0Var2.O = true;
                ArrayList arrayList2 = rb0Var2.R;
                if (i10 < arrayList2.size()) {
                    rb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    rb0Var2.F.setText("");
                }
                rb0Var2.O = false;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f34181a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
