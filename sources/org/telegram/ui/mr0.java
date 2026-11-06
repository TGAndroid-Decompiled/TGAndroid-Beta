package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class mr0 extends org.telegram.ui.Cells.a6 {
    public final nr0 F;

    public mr0(nr0 nr0Var, Context context, int i7, g40 g40Var) {
        super(context, i7, g40Var, null);
        this.F = nr0Var;
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        pr0 pr0Var = this.F.d;
        e61 e61Var = pr0Var.f48917c;
        View F = e61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = pr0Var.D;
            if (i7 == pr0Var.f48930n && b10 == (pr0Var.f48931n0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        pr0 pr0Var = this.F.d;
        e61 e61Var = pr0Var.f48917c;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return pr0Var.f48944x[b10 - pr0Var.f48931n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                an.A8(menu, this.F.d.f48922f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        pr0 pr0Var = this.F.d;
        pr0Var.f48917c.getChildCount();
        if (z9 && pr0Var.L) {
            Arrays.fill(pr0Var.f48944x, false);
            for (int i7 = pr0Var.f48931n0; i7 < pr0Var.f48931n0 + pr0Var.D; i7++) {
                v4.d1 K = pr0Var.f48917c.K(i7);
                if (K != null) {
                    View view = K.f56952a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28890r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        e61 e61Var = pr0Var.f48917c;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            pr0Var.f48944x[b10 - pr0Var.f48931n0] = z9;
        }
        pr0Var.n0();
    }

    @Override
    public final void i(boolean z9) {
        pr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        pr0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        pr0 pr0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            pr0Var.f48917c.getClass();
            int R = RecyclerView.R(this) - pr0Var.f48931n0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < pr0Var.f48930n) {
                    for (int length = pr0Var.f48942w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = pr0Var.f48942w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    pr0Var.f48942w[i7] = (CharSequence) arrayList.remove(0);
                    pr0Var.D++;
                    i7++;
                }
                pr0Var.w0();
                pr0Var.f48924g0 = (pr0Var.f48931n0 + i7) - 1;
                pr0Var.f48915b.f();
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
