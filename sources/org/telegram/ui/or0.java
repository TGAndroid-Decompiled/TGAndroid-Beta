package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class or0 extends org.telegram.ui.Cells.a6 {
    public final pr0 F;

    public or0(pr0 pr0Var, Context context, int i7, i40 i40Var) {
        super(context, i7, i40Var, null);
        this.F = pr0Var;
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        rr0 rr0Var = this.F.d;
        f61 f61Var = rr0Var.f49569c;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = rr0Var.D;
            if (i7 == rr0Var.f49582n && b10 == (rr0Var.f49583n0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        rr0 rr0Var = this.F.d;
        f61 f61Var = rr0Var.f49569c;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return rr0Var.f49596x[b10 - rr0Var.f49583n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                cn.B8(menu, this.F.d.f49574f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        rr0 rr0Var = this.F.d;
        rr0Var.f49569c.getChildCount();
        if (z9 && rr0Var.L) {
            Arrays.fill(rr0Var.f49596x, false);
            for (int i7 = rr0Var.f49583n0; i7 < rr0Var.f49583n0 + rr0Var.D; i7++) {
                v4.d1 K = rr0Var.f49569c.K(i7);
                if (K != null) {
                    View view = K.f57056a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28898r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        f61 f61Var = rr0Var.f49569c;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            rr0Var.f49596x[b10 - rr0Var.f49583n0] = z9;
        }
        rr0Var.n0();
    }

    @Override
    public final void i(boolean z9) {
        rr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        rr0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rr0 rr0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            rr0Var.f49569c.getClass();
            int R = RecyclerView.R(this) - rr0Var.f49583n0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < rr0Var.f49582n) {
                    for (int length = rr0Var.f49594w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = rr0Var.f49594w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rr0Var.f49594w[i7] = (CharSequence) arrayList.remove(0);
                    rr0Var.D++;
                    i7++;
                }
                rr0Var.w0();
                rr0Var.f49576g0 = (rr0Var.f49583n0 + i7) - 1;
                rr0Var.f49567b.f();
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
