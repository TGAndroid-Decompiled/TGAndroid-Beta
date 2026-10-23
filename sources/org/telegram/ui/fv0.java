package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class fv0 extends org.telegram.ui.Cells.d6 {
    public final gv0 F;

    public fv0(gv0 gv0Var, Context context, int i10, w50 w50Var) {
        super(context, i10, w50Var, null);
        this.F = gv0Var;
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        iv0 iv0Var = this.F.d;
        xa1 xa1Var = iv0Var.f38377c;
        View F = xa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = xa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = iv0Var.f38405y;
            if (i10 == iv0Var.f38389n && b10 == (iv0Var.f38390n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        iv0 iv0Var = this.F.d;
        xa1 xa1Var = iv0Var.f38377c;
        View F = xa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = xa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return iv0Var.f38401w[b10 - iv0Var.f38390n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                sn.n8(menu, this.F.d.f38381f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        iv0 iv0Var = this.F.d;
        iv0Var.f38377c.getChildCount();
        if (z10 && iv0Var.L) {
            Arrays.fill(iv0Var.f38401w, false);
            for (int i10 = iv0Var.f38390n0; i10 < iv0Var.f38390n0 + iv0Var.f38405y; i10++) {
                s4.b1 K = iv0Var.f38377c.K(i10);
                if (K != null) {
                    View view = K.f46343a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f22282r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        xa1 xa1Var = iv0Var.f38377c;
        View F = xa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = xa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            iv0Var.f38401w[b10 - iv0Var.f38390n0] = z10;
        }
        iv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        iv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        iv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        iv0 iv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            iv0Var.f38377c.getClass();
            int R = RecyclerView.R(this) - iv0Var.f38390n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < iv0Var.f38389n) {
                    for (int length = iv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = iv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    iv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    iv0Var.f38405y++;
                    i10++;
                }
                iv0Var.r0();
                iv0Var.f38383g0 = (iv0Var.f38390n0 + i10) - 1;
                iv0Var.f38375b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.L;
    }
}
