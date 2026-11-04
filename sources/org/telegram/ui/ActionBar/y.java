package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class y implements View.OnClickListener {
    public final int f28810a;
    public final q0 f28811b;

    public y(q0 q0Var, int i3) {
        this.f28810a = i3;
        this.f28811b = q0Var;
    }

    @Override
    public final void onClick(View view) {
        m0 m0Var;
        f1 f1Var;
        int i3 = this.f28810a;
        q0 q0Var = this.f28811b;
        switch (i3) {
            case 0:
                ArrayList arrayList = q0Var.f28450h0;
                if (q0Var.f28445e.length() != 0) {
                    q0Var.f28445e.setText("");
                } else if (q0Var.r()) {
                    q0Var.f28445e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (q0Var.I != null && ((kg.l0) arrayList.get(i10)).h) {
                            q0Var.I.j((kg.l0) arrayList.get(i10));
                        }
                    }
                    q0Var.m();
                } else {
                    TextView textView = q0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((m0Var = q0Var.I) == null || m0Var.a())) {
                        q0Var.h.setVisibility(8);
                        m0 m0Var2 = q0Var.I;
                        if (m0Var2 != null) {
                            m0Var2.f();
                        }
                    }
                }
                q0Var.f28445e.requestFocus();
                org.telegram.messenger.g0.K3(q0Var.f28445e);
                return;
            case 1:
                if (q0Var.x()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.q();
                    } else {
                        return;
                    }
                }
                x xVar = q0Var.f28442c;
                if (xVar != null) {
                    xVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var = q0Var.Q;
                if (l0Var != null) {
                    l0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                x xVar2 = q0Var.f28442c;
                if (xVar2 != null) {
                    xVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var2 = q0Var.Q;
                if (l0Var2 != null) {
                    l0Var2.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (q0Var.x()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        if (!q0Var.S && (f1Var = q0Var.d) != null) {
                            f1Var.setAnimationStyle(2131755191);
                        }
                        q0Var.q();
                    } else {
                        return;
                    }
                }
                x xVar3 = q0Var.f28442c;
                if (xVar3 != null) {
                    xVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var3 = q0Var.Q;
                if (l0Var3 != null) {
                    l0Var3.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
