package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final dv0 F;

    public cv0(dv0 dv0Var, Context context, int i10, s50 s50Var) {
        super(context, i10, s50Var, null);
        this.F = dv0Var;
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        fv0 fv0Var = this.F.d;
        sa1 sa1Var = fv0Var.f37095c;
        View F = sa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = fv0Var.f37123y;
            if (i10 == fv0Var.f37107n && b10 == (fv0Var.f37108n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.b1 T;
        int b10;
        fv0 fv0Var = this.F.d;
        sa1 sa1Var = fv0Var.f37095c;
        View F = sa1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return fv0Var.f37119w[b10 - fv0Var.f37108n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                qn.n8(menu, this.F.d.f37099f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.b1 T;
        int b10;
        fv0 fv0Var = this.F.d;
        if (z10 && fv0Var.L) {
            Arrays.fill(fv0Var.f37119w, false);
            fv0Var.f37095c.getChildCount();
            for (int i10 = fv0Var.f37108n0; i10 < fv0Var.f37108n0 + fv0Var.f37123y; i10++) {
                s4.b1 K = fv0Var.f37095c.K(i10);
                if (K != null) {
                    View view = K.f45912a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22093r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        sa1 sa1Var = fv0Var.f37095c;
        View F = sa1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            fv0Var.f37119w[b10 - fv0Var.f37108n0] = z10;
        }
        fv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        fv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            fv0Var.f37095c.getClass();
            int R = RecyclerView.R(this) - fv0Var.f37108n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < fv0Var.f37107n) {
                    for (int length = fv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = fv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    fv0Var.f37123y++;
                    i10++;
                }
                fv0Var.r0();
                fv0Var.f37101g0 = (fv0Var.f37108n0 + i10) - 1;
                fv0Var.f37093b.l();
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
