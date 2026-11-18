package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class a0 implements View.OnClickListener {
    public final int f28750a;
    public final r0 f28751b;

    public a0(r0 r0Var, int i7) {
        this.f28750a = i7;
        this.f28751b = r0Var;
    }

    @Override
    public final void onClick(View view) {
        n0 n0Var;
        h1 h1Var;
        int i7 = this.f28750a;
        r0 r0Var = this.f28751b;
        switch (i7) {
            case 0:
                ArrayList arrayList = r0Var.f29928h0;
                if (r0Var.f29923e.length() != 0) {
                    r0Var.f29923e.setText("");
                } else if (r0Var.s()) {
                    r0Var.f29923e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (r0Var.I != null && ((jg.o0) arrayList.get(i10)).h) {
                            r0Var.I.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    r0Var.n();
                } else {
                    TextView textView = r0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((n0Var = r0Var.I) == null || n0Var.a())) {
                        r0Var.h.setVisibility(8);
                        n0 n0Var2 = r0Var.I;
                        if (n0Var2 != null) {
                            n0Var2.f();
                        }
                    }
                }
                r0Var.f29923e.requestFocus();
                org.telegram.messenger.g0.I3(r0Var.f29923e);
                return;
            case 1:
                if (r0Var.y()) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        r0Var.r();
                    } else {
                        return;
                    }
                }
                z zVar = r0Var.f29920c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var = r0Var.Q;
                if (m0Var != null) {
                    m0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                z zVar2 = r0Var.f29920c;
                if (zVar2 != null) {
                    zVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var2 = r0Var.Q;
                if (m0Var2 != null) {
                    m0Var2.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (r0Var.y()) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        if (!r0Var.S && (h1Var = r0Var.d) != null) {
                            h1Var.setAnimationStyle(2131755191);
                        }
                        r0Var.r();
                    } else {
                        return;
                    }
                }
                z zVar3 = r0Var.f29920c;
                if (zVar3 != null) {
                    zVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var3 = r0Var.Q;
                if (m0Var3 != null) {
                    m0Var3.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
