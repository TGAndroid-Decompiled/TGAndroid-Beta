package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class pr0 extends org.telegram.ui.Cells.a6 {
    public final qr0 F;

    public pr0(qr0 qr0Var, Context context, int i7, j40 j40Var) {
        super(context, i7, j40Var, null);
        this.F = qr0Var;
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        sr0 sr0Var = this.F.d;
        g61 g61Var = sr0Var.f49923c;
        View F = g61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = sr0Var.D;
            if (i7 == sr0Var.f49936n && b10 == (sr0Var.f49937n0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        sr0 sr0Var = this.F.d;
        g61 g61Var = sr0Var.f49923c;
        View F = g61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return sr0Var.f49950x[b10 - sr0Var.f49937n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                cn.B8(menu, this.F.d.f49928f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        sr0 sr0Var = this.F.d;
        sr0Var.f49923c.getChildCount();
        if (z9 && sr0Var.L) {
            Arrays.fill(sr0Var.f49950x, false);
            for (int i7 = sr0Var.f49937n0; i7 < sr0Var.f49937n0 + sr0Var.D; i7++) {
                v4.d1 K = sr0Var.f49923c.K(i7);
                if (K != null) {
                    View view = K.f57052a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28909r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        g61 g61Var = sr0Var.f49923c;
        View F = g61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            sr0Var.f49950x[b10 - sr0Var.f49937n0] = z9;
        }
        sr0Var.n0();
    }

    @Override
    public final void i(boolean z9) {
        sr0.i0(this.F.d, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        sr0.j0(this.F.d, a6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        sr0 sr0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            sr0Var.f49923c.getClass();
            int R = RecyclerView.R(this) - sr0Var.f49937n0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < sr0Var.f49936n) {
                    for (int length = sr0Var.f49948w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = sr0Var.f49948w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    sr0Var.f49948w[i7] = (CharSequence) arrayList.remove(0);
                    sr0Var.D++;
                    i7++;
                }
                sr0Var.w0();
                sr0Var.f49930g0 = (sr0Var.f49937n0 + i7) - 1;
                sr0Var.f49921b.f();
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
