package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.va1;
public final class gn extends org.telegram.ui.Cells.c6 {
    public final hn B;

    public gn(hn hnVar, Context context, int i9, bn bnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, bnVar, b6Var);
        this.B = hnVar;
    }

    @Override
    public final boolean d() {
        f2.q1 T;
        jn jnVar = this.B.d;
        va1 va1Var = jnVar.f29791s;
        View F = va1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i9 = jnVar.I;
            if (i9 == jnVar.F && b10 == (jnVar.f29787p0 + i9) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.q1 T;
        int b10;
        jn jnVar = this.B.d;
        va1 va1Var = jnVar.f29791s;
        View F = va1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return jnVar.H[b10 - jnVar.f29787p0];
        }
        return false;
    }

    @Override
    public final void g(fh.s sVar, ActionMode actionMode) {
        jn jnVar = this.B.d;
        if (jnVar.f29784n && sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) jnVar.f27493b.f30099b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        f2.q1 T;
        int b10;
        jn jnVar = this.B.d;
        if (z10 && jnVar.V && !jnVar.U) {
            Arrays.fill(jnVar.H, false);
            jnVar.f29791s.getChildCount();
            for (int i9 = jnVar.f29787p0; i9 < jnVar.f29787p0 + jnVar.I; i9++) {
                f2.q1 K = jnVar.f29791s.K(i9);
                if (K != null) {
                    View view = K.f5501a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f24201r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        va1 va1Var = jnVar.f29791s;
        View F = va1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = va1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.H[b10 - jnVar.f29787p0] = z10;
        }
        jnVar.S();
    }

    @Override
    public final void i(boolean z10) {
        jn.L(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        jn.M(this.B.d, c6Var);
    }

    @Override
    public final void k(fh.s sVar) {
        this.B.d.f27493b.t1(sVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        jn jnVar = this.B.d;
        if (!arrayList.isEmpty()) {
            jnVar.f29791s.getClass();
            int R = RecyclerView.R(this) - jnVar.f29787p0;
            if (R >= 0) {
                fh.s sVar = this.d;
                sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i9 = R + 1;
                while (!arrayList.isEmpty() && i9 < jnVar.F) {
                    for (int length = jnVar.G.length - 1; length > i9; length--) {
                        CharSequence[] charSequenceArr = jnVar.G;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    jnVar.G[i9] = (CharSequence) arrayList.remove(0);
                    jnVar.I++;
                    i9++;
                }
                jnVar.g0();
                jnVar.f29776g0 = (jnVar.f29787p0 + i9) - 1;
                jnVar.f29791s.setItemAnimator(jnVar.v);
                jnVar.f29789r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.B.d.V;
    }
}
