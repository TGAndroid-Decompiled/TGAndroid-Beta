package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class z implements View.OnClickListener {
    public final int f28809a;
    public final r0 f28810b;

    public z(r0 r0Var, int i7) {
        this.f28809a = i7;
        this.f28810b = r0Var;
    }

    @Override
    public final void onClick(View view) {
        n0 n0Var;
        g1 g1Var;
        int i7 = this.f28809a;
        r0 r0Var = this.f28810b;
        switch (i7) {
            case 0:
                ArrayList arrayList = r0Var.f28430g0;
                if (r0Var.f28426e.length() != 0) {
                    r0Var.f28426e.setText("");
                } else if (r0Var.r()) {
                    r0Var.f28426e.m();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (r0Var.H != null && ((jg.o0) arrayList.get(i10)).h) {
                            r0Var.H.j((jg.o0) arrayList.get(i10));
                        }
                    }
                    r0Var.m();
                } else {
                    TextView textView = r0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((n0Var = r0Var.H) == null || n0Var.a())) {
                        r0Var.h.setVisibility(8);
                        n0 n0Var2 = r0Var.H;
                        if (n0Var2 != null) {
                            n0Var2.f();
                        }
                    }
                }
                r0Var.f28426e.requestFocus();
                org.telegram.messenger.g0.K3(r0Var.f28426e);
                return;
            case 1:
                if (r0Var.x()) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        r0Var.q();
                    } else {
                        return;
                    }
                }
                y yVar = r0Var.f28423c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var = r0Var.P;
                if (m0Var != null) {
                    m0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                y yVar2 = r0Var.f28423c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var2 = r0Var.P;
                if (m0Var2 != null) {
                    m0Var2.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (r0Var.x()) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        if (!r0Var.R && (g1Var = r0Var.d) != null) {
                            g1Var.setAnimationStyle(2131755191);
                        }
                        r0Var.q();
                    } else {
                        return;
                    }
                }
                y yVar3 = r0Var.f28423c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m0 m0Var3 = r0Var.P;
                if (m0Var3 != null) {
                    m0Var3.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
