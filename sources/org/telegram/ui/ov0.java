package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ov0 extends org.telegram.ui.Cells.d6 {
    public final pv0 F;

    public ov0(pv0 pv0Var, Context context, int i10, f60 f60Var) {
        super(context, i10, f60Var, null);
        this.F = pv0Var;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        rv0 rv0Var = this.F.d;
        wb1 wb1Var = rv0Var.f37485c;
        View F = wb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = rv0Var.f37513y;
            if (i10 == rv0Var.f37497n && b10 == (rv0Var.f37498n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 T;
        int b10;
        rv0 rv0Var = this.F.d;
        wb1 wb1Var = rv0Var.f37485c;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return rv0Var.f37509w[b10 - rv0Var.f37498n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                wn.k8(menu, this.F.d.f37489f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        int b10;
        rv0 rv0Var = this.F.d;
        if (z10 && rv0Var.L) {
            Arrays.fill(rv0Var.f37509w, false);
            rv0Var.f37485c.getChildCount();
            for (int i10 = rv0Var.f37498n0; i10 < rv0Var.f37498n0 + rv0Var.f37513y; i10++) {
                s4.c1 K = rv0Var.f37485c.K(i10);
                if (K != null) {
                    View view = K.f42946a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20125r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = rv0Var.f37485c;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            rv0Var.f37509w[b10 - rv0Var.f37498n0] = z10;
        }
        rv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        rv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        rv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rv0 rv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            rv0Var.f37485c.getClass();
            int R = RecyclerView.R(this) - rv0Var.f37498n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < rv0Var.f37497n) {
                    for (int length = rv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = rv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    rv0Var.f37513y++;
                    i10++;
                }
                rv0Var.r0();
                rv0Var.f37491g0 = (rv0Var.f37498n0 + i10) - 1;
                rv0Var.f37483b.l();
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
