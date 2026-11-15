package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class a0 implements View.OnClickListener {
    public final int f28396a;
    public final q0 f28397b;

    public a0(q0 q0Var, int i7) {
        this.f28396a = i7;
        this.f28397b = q0Var;
    }

    @Override
    public final void onClick(View view) {
        m0 m0Var;
        g1 g1Var;
        int i7 = this.f28396a;
        q0 q0Var = this.f28397b;
        switch (i7) {
            case 0:
                ArrayList arrayList = q0Var.f29507h0;
                if (q0Var.f29502e.length() != 0) {
                    q0Var.f29502e.setText("");
                } else if (q0Var.s()) {
                    q0Var.f29502e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (q0Var.I != null && ((jg.o0) arrayList.get(i10)).h) {
                            q0Var.I.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    q0Var.n();
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
                q0Var.f29502e.requestFocus();
                org.telegram.messenger.g0.J3(q0Var.f29502e);
                return;
            case 1:
                if (q0Var.y()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.r();
                    } else {
                        return;
                    }
                }
                y yVar = q0Var.f29499c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var = q0Var.Q;
                if (l0Var != null) {
                    l0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                y yVar2 = q0Var.f29499c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var2 = q0Var.Q;
                if (l0Var2 != null) {
                    l0Var2.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (q0Var.y()) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        if (!q0Var.S && (g1Var = q0Var.d) != null) {
                            g1Var.setAnimationStyle(2131755191);
                        }
                        q0Var.r();
                    } else {
                        return;
                    }
                }
                y yVar3 = q0Var.f29499c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                l0 l0Var3 = q0Var.Q;
                if (l0Var3 != null) {
                    l0Var3.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
