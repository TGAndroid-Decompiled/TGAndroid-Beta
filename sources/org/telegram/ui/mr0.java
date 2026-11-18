package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class mr0 extends org.telegram.ui.Cells.a6 {
    public final nr0 G;

    public mr0(nr0 nr0Var, Context context, int i7, j40 j40Var) {
        super(context, i7, j40Var, null);
        this.G = nr0Var;
    }

    @Override
    public final boolean f() {
        v4.f1 T;
        pr0 pr0Var = this.G.d;
        f61 f61Var = pr0Var.f50967c;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = pr0Var.E;
            if (i7 == pr0Var.f50980n && b10 == (pr0Var.f50982o0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.a6 a6Var) {
        v4.f1 T;
        int b10;
        pr0 pr0Var = this.G.d;
        f61 f61Var = pr0Var.f50967c;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return pr0Var.f50994x[b10 - pr0Var.f50982o0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bn.C8(menu, this.G.d.f50972f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        int b10;
        pr0 pr0Var = this.G.d;
        pr0Var.f50967c.getChildCount();
        if (z10 && pr0Var.M) {
            Arrays.fill(pr0Var.f50994x, false);
            for (int i7 = pr0Var.f50982o0; i7 < pr0Var.f50982o0 + pr0Var.E; i7++) {
                v4.f1 K = pr0Var.f50967c.K(i7);
                if (K != null) {
                    View view = K.f59122a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f30389r.a(false, true);
                    }
                }
            }
        }
        super.i(a6Var, z10);
        f61 f61Var = pr0Var.f50967c;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            pr0Var.f50994x[b10 - pr0Var.f50982o0] = z10;
        }
        pr0Var.n0();
    }

    @Override
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        pr0.j0(this.G.d, a6Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        pr0 pr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            pr0Var.f50967c.getClass();
            int R = RecyclerView.R(this) - pr0Var.f50982o0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < pr0Var.f50980n) {
                    for (int length = pr0Var.f50992w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = pr0Var.f50992w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    pr0Var.f50992w[i7] = (CharSequence) arrayList.remove(0);
                    pr0Var.E++;
                    i7++;
                }
                pr0Var.w0();
                pr0Var.f50975h0 = (pr0Var.f50982o0 + i7) - 1;
                pr0Var.f50965b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.G.d.M;
    }
}
