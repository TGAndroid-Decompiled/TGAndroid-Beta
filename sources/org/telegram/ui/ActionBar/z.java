package org.telegram.ui.ActionBar;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class z implements View.OnClickListener {
    public final int f21576a;
    public final t0 f21577b;

    public z(t0 t0Var, int i10) {
        this.f21576a = i10;
        this.f21577b = t0Var;
    }

    @Override
    public final void onClick(View view) {
        p0 p0Var;
        k1 k1Var;
        int i10 = this.f21576a;
        t0 t0Var = this.f21577b;
        switch (i10) {
            case 0:
                ArrayList arrayList = t0Var.f20835g0;
                if (t0Var.e.length() != 0) {
                    t0Var.e.setText("");
                } else if (t0Var.r()) {
                    t0Var.e.m();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (t0Var.H != null && ((zf.e0) arrayList.get(i11)).h) {
                            t0Var.H.j((zf.e0) arrayList.get(i11));
                        }
                    }
                    t0Var.m();
                } else {
                    TextView textView = t0Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((p0Var = t0Var.H) == null || p0Var.a())) {
                        t0Var.h.setVisibility(8);
                        p0 p0Var2 = t0Var.H;
                        if (p0Var2 != null) {
                            p0Var2.f();
                        }
                    }
                }
                t0Var.e.requestFocus();
                org.telegram.messenger.i0.J3(t0Var.e);
                return;
            case 1:
                if (t0Var.x()) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        t0Var.q();
                    } else {
                        return;
                    }
                }
                y yVar = t0Var.f20829c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                o0 o0Var = t0Var.P;
                if (o0Var != null) {
                    o0Var.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                y yVar2 = t0Var.f20829c;
                if (yVar2 != null) {
                    yVar2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                o0 o0Var2 = t0Var.P;
                if (o0Var2 != null) {
                    o0Var2.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (t0Var.x()) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        if (!t0Var.R && (k1Var = t0Var.d) != null) {
                            k1Var.setAnimationStyle(2131755191);
                        }
                        t0Var.q();
                    } else {
                        return;
                    }
                }
                y yVar3 = t0Var.f20829c;
                if (yVar3 != null) {
                    yVar3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                o0 o0Var3 = t0Var.P;
                if (o0Var3 != null) {
                    o0Var3.k(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
