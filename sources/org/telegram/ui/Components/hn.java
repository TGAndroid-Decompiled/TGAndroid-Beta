package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class hn extends org.telegram.ui.Cells.e6 {
    public final fg.j F;

    public hn(fg.j jVar, Context context, int i10, cn cnVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, cnVar, p6Var);
        this.F = jVar;
        ((jn) jVar.e).f27511s.getChildCount();
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        jn jnVar = (jn) this.F.e;
        org.telegram.ui.u71 u71Var = jnVar.f27511s;
        View F = u71Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = jnVar.M;
            if (i10 == jnVar.J && b10 == (jnVar.f27513t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 T;
        int b10;
        jn jnVar = (jn) this.F.e;
        org.telegram.ui.u71 u71Var = jnVar.f27511s;
        View F = u71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return jnVar.L[b10 - jnVar.f27513t0];
        }
        return false;
    }

    @Override
    public final void g(ih.b bVar, ActionMode actionMode) {
        jn jnVar = (jn) this.F.e;
        if (jnVar.f27500n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.un.x8(menu, ((org.telegram.ui.un) jnVar.f30964b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        int b10;
        jn jnVar = (jn) this.F.e;
        if (z10 && jnVar.f27480c0 && !jnVar.f27478b0) {
            Arrays.fill(jnVar.L, false);
            for (int i10 = jnVar.f27513t0; i10 < jnVar.f27513t0 + jnVar.M; i10++) {
                s4.c1 K = jnVar.f27511s.K(i10);
                if (K != null) {
                    View view = K.f47909a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f21864r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        org.telegram.ui.u71 u71Var = jnVar.f27511s;
        View F = u71Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = u71Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.L[b10 - jnVar.f27513t0] = z10;
        }
        jnVar.W();
    }

    @Override
    public final void i(boolean z10) {
        jn.P((jn) this.F.e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.F.e, e6Var);
    }

    @Override
    public final void k(ih.b bVar) {
        ((jn) this.F.e).f30964b.g1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        jn jnVar = (jn) this.F.e;
        if (!arrayList.isEmpty()) {
            jnVar.f27511s.getClass();
            int R = RecyclerView.R(this) - jnVar.f27513t0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < jnVar.J) {
                    for (int length = jnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = jnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    jnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    jnVar.M++;
                    i10++;
                }
                jnVar.l0();
                jnVar.f27496k0 = (jnVar.f27513t0 + i10) - 1;
                jnVar.f27511s.setItemAnimator(jnVar.f27516w);
                jnVar.f27509r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return ((jn) this.F.e).f27480c0;
    }
}
