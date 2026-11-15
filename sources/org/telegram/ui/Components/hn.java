package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class hn extends org.telegram.ui.Cells.z5 {
    public final org.telegram.ui.l4 G;

    public hn(org.telegram.ui.l4 l4Var, Context context, int i7, cn cnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, cnVar, e6Var);
        this.G = l4Var;
        ((jn) l4Var.f48823e).f36097s.getChildCount();
    }

    @Override
    public final boolean f() {
        v4.e1 T;
        jn jnVar = (jn) this.G.f48823e;
        org.telegram.ui.b61 b61Var = jnVar.f36097s;
        View F = b61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = jnVar.N;
            if (i7 == jnVar.K && b10 == (jnVar.f36100u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.z5 z5Var) {
        v4.e1 T;
        int b10;
        jn jnVar = (jn) this.G.f48823e;
        org.telegram.ui.b61 b61Var = jnVar.f36097s;
        View F = b61Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return jnVar.M[b10 - jnVar.f36100u0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        jn jnVar = (jn) this.G.f48823e;
        if (jnVar.f36086n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) jnVar.f33609b.f36424a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        v4.e1 T;
        int b10;
        jn jnVar = (jn) this.G.f48823e;
        if (z10 && jnVar.f36068d0 && !jnVar.f36066c0) {
            Arrays.fill(jnVar.M, false);
            for (int i7 = jnVar.f36100u0; i7 < jnVar.f36100u0 + jnVar.N; i7++) {
                v4.e1 K = jnVar.f36097s.K(i7);
                if (K != null) {
                    View view = K.f58535a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f32121r.a(false, true);
                    }
                }
            }
        }
        super.i(z5Var, z10);
        org.telegram.ui.b61 b61Var = jnVar.f36097s;
        View F = b61Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.M[b10 - jnVar.f36100u0] = z10;
        }
        jnVar.Y();
    }

    @Override
    public final void j(boolean z10) {
        jn.R((jn) this.G.f48823e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.G.f48823e, z5Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((jn) this.G.f48823e).f33609b.h1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        jn jnVar = (jn) this.G.f48823e;
        if (!arrayList.isEmpty()) {
            jnVar.f36097s.getClass();
            int R = RecyclerView.R(this) - jnVar.f36100u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < jnVar.K) {
                    for (int length = jnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = jnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    jnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    jnVar.N++;
                    i7++;
                }
                jnVar.n0();
                jnVar.f36084l0 = (jnVar.f36100u0 + i7) - 1;
                jnVar.f36097s.setItemAnimator(jnVar.f36102w);
                jnVar.f36094r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((jn) this.G.f48823e).f36068d0;
    }
}
