package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class jv0 extends org.telegram.ui.Cells.h6 {
    public final kv0 F;

    public jv0(kv0 kv0Var, Context context, int i10, x50 x50Var) {
        super(context, i10, x50Var, null);
        this.F = kv0Var;
    }

    @Override
    public final boolean e() {
        s4.e1 T;
        mv0 mv0Var = this.F.d;
        za1 za1Var = mv0Var.f41679c;
        View F = za1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = za1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = mv0Var.f41707y;
            if (i10 == mv0Var.f41691n && b10 == (mv0Var.f41692n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.h6 h6Var) {
        s4.e1 T;
        int b10;
        mv0 mv0Var = this.F.d;
        za1 za1Var = mv0Var.f41679c;
        View F = za1Var.F(h6Var);
        if (F == null) {
            T = null;
        } else {
            T = za1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return mv0Var.f41703w[b10 - mv0Var.f41692n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                un.r8(menu, this.F.d.f41683f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        s4.e1 T;
        int b10;
        mv0 mv0Var = this.F.d;
        mv0Var.f41679c.getChildCount();
        if (z10 && mv0Var.L) {
            Arrays.fill(mv0Var.f41703w, false);
            for (int i10 = mv0Var.f41692n0; i10 < mv0Var.f41692n0 + mv0Var.f41707y; i10++) {
                s4.e1 K = mv0Var.f41679c.K(i10);
                if (K != null) {
                    View view = K.f47738a;
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).f24202r.a(false, true);
                    }
                }
            }
        }
        super.h(h6Var, z10);
        za1 za1Var = mv0Var.f41679c;
        View F = za1Var.F(h6Var);
        if (F == null) {
            T = null;
        } else {
            T = za1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            mv0Var.f41703w[b10 - mv0Var.f41692n0] = z10;
        }
        mv0Var.j0();
    }

    @Override
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            mv0Var.f41679c.getClass();
            int R = RecyclerView.R(this) - mv0Var.f41692n0;
            if (R >= 0) {
                org.telegram.ui.Cells.g6 g6Var = this.d;
                g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < mv0Var.f41691n) {
                    for (int length = mv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = mv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    mv0Var.f41707y++;
                    i10++;
                }
                mv0Var.s0();
                mv0Var.f41685g0 = (mv0Var.f41692n0 + i10) - 1;
                mv0Var.f41677b.l();
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
