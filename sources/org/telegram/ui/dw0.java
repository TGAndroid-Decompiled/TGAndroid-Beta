package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class dw0 extends org.telegram.ui.Cells.d6 {
    public final ew0 F;

    public dw0(ew0 ew0Var, Context context, int i10, t60 t60Var) {
        super(context, i10, t60Var, null);
        this.F = ew0Var;
    }

    @Override
    public final boolean d() {
        s4.b1 T;
        gw0 gw0Var = this.F.d;
        kc1 kc1Var = gw0Var.f36507c;
        View F = kc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = gw0Var.f36535y;
            if (i10 == gw0Var.f36519n && b10 == (gw0Var.f36520n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        gw0 gw0Var = this.F.d;
        kc1 kc1Var = gw0Var.f36507c;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return gw0Var.f36531w[b10 - gw0Var.f36520n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                fo.n8(menu, this.F.d.f36511f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        gw0 gw0Var = this.F.d;
        if (z10 && gw0Var.L) {
            Arrays.fill(gw0Var.f36531w, false);
            gw0Var.f36507c.getChildCount();
            for (int i10 = gw0Var.f36520n0; i10 < gw0Var.f36520n0 + gw0Var.f36535y; i10++) {
                s4.b1 K = gw0Var.f36507c.K(i10);
                if (K != null) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21074r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = gw0Var.f36507c;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            gw0Var.f36531w[b10 - gw0Var.f36520n0] = z10;
        }
        gw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        gw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        gw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        gw0 gw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            gw0Var.f36507c.getClass();
            int R = RecyclerView.R(this) - gw0Var.f36520n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < gw0Var.f36519n) {
                    for (int length = gw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = gw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    gw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    gw0Var.f36535y++;
                    i10++;
                }
                gw0Var.r0();
                gw0Var.f36513g0 = (gw0Var.f36520n0 + i10) - 1;
                gw0Var.f36505b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.L;
    }
}
