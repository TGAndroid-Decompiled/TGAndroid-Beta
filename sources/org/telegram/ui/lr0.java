package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class lr0 extends org.telegram.ui.Cells.a6 {
    public final mr0 F;

    public lr0(mr0 mr0Var, Context context, int i7, g40 g40Var) {
        super(context, i7, g40Var, null);
        this.F = mr0Var;
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        or0 or0Var = this.F.d;
        e61 e61Var = or0Var.f48511c;
        View F = e61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = or0Var.D;
            if (i7 == or0Var.f48524n && b10 == (or0Var.f48525n0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        or0 or0Var = this.F.d;
        e61 e61Var = or0Var.f48511c;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return or0Var.f48538x[b10 - or0Var.f48525n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                an.A8(menu, this.F.d.f48516f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        or0 or0Var = this.F.d;
        or0Var.f48511c.getChildCount();
        if (z9 && or0Var.L) {
            Arrays.fill(or0Var.f48538x, false);
            for (int i7 = or0Var.f48525n0; i7 < or0Var.f48525n0 + or0Var.D; i7++) {
                v4.d1 K = or0Var.f48511c.K(i7);
                if (K != null) {
                    View view = K.f56927a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28890r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        e61 e61Var = or0Var.f48511c;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            or0Var.f48538x[b10 - or0Var.f48525n0] = z9;
        }
        or0Var.n0();
    }

    @Override
    public final void i(boolean z9) {
        or0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        or0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        or0 or0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            or0Var.f48511c.getClass();
            int R = RecyclerView.R(this) - or0Var.f48525n0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < or0Var.f48524n) {
                    for (int length = or0Var.f48536w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = or0Var.f48536w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    or0Var.f48536w[i7] = (CharSequence) arrayList.remove(0);
                    or0Var.D++;
                    i7++;
                }
                or0Var.w0();
                or0Var.f48518g0 = (or0Var.f48525n0 + i7) - 1;
                or0Var.f48509b.f();
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
