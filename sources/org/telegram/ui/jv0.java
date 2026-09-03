package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class jv0 extends org.telegram.ui.Cells.c6 {
    public final kv0 C;

    public jv0(kv0 kv0Var, Context context, int i10, f60 f60Var) {
        super(context, i10, f60Var, null);
        this.C = kv0Var;
    }

    @Override
    public final boolean e() {
        f2.m1 T;
        mv0 mv0Var = this.C.d;
        qb1 qb1Var = mv0Var.f39093c;
        View F = qb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = mv0Var.f39122y;
            if (i10 == mv0Var.f39106n && b10 == (mv0Var.f39104k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.m1 T;
        int b10;
        mv0 mv0Var = this.C.d;
        qb1 qb1Var = mv0Var.f39093c;
        View F = qb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return mv0Var.f39118w[b10 - mv0Var.f39104k0];
        }
        return false;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.C.d.f39098f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        int b10;
        mv0 mv0Var = this.C.d;
        if (z4 && mv0Var.I) {
            Arrays.fill(mv0Var.f39118w, false);
            mv0Var.f39093c.getChildCount();
            for (int i10 = mv0Var.f39104k0; i10 < mv0Var.f39104k0 + mv0Var.f39122y; i10++) {
                f2.m1 K = mv0Var.f39093c.K(i10);
                if (K != null) {
                    View view = K.f5875a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22655r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        qb1 qb1Var = mv0Var.f39093c;
        View F = qb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            mv0Var.f39118w[b10 - mv0Var.f39104k0] = z4;
        }
        mv0Var.i0();
    }

    @Override
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        mv0.e0(this.C.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            mv0Var.f39093c.getClass();
            int R = RecyclerView.R(this) - mv0Var.f39104k0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < mv0Var.f39106n) {
                    for (int length = mv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = mv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    mv0Var.f39122y++;
                    i10++;
                }
                mv0Var.r0();
                mv0Var.f39095d0 = (mv0Var.f39104k0 + i10) - 1;
                mv0Var.f39091b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.C.d.I;
    }
}
