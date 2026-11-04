package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ym extends org.telegram.ui.Cells.z5 {
    public final org.telegram.ui.n4 G;

    public ym(org.telegram.ui.n4 n4Var, Context context, int i3, tm tmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, tmVar, e6Var);
        this.G = n4Var;
        ((an) n4Var.f47865e).f31939s.getChildCount();
    }

    @Override
    public final boolean e() {
        u4.d1 T;
        an anVar = (an) this.G.f47865e;
        org.telegram.ui.u51 u51Var = anVar.f31939s;
        View F = u51Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i3 = anVar.N;
            if (i3 == anVar.K && b10 == (anVar.f31942u0 + i3) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        u4.d1 T;
        int b10;
        an anVar = (an) this.G.f47865e;
        org.telegram.ui.u51 u51Var = anVar.f31939s;
        View F = u51Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return anVar.M[b10 - anVar.f31942u0];
        }
        return false;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
        an anVar = (an) this.G.f47865e;
        if (anVar.f31927n && zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) anVar.f38416b.X1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        u4.d1 T;
        int b10;
        an anVar = (an) this.G.f47865e;
        if (z10 && anVar.f31910d0 && !anVar.f31908c0) {
            Arrays.fill(anVar.M, false);
            for (int i3 = anVar.f31942u0; i3 < anVar.f31942u0 + anVar.N; i3++) {
                u4.d1 K = anVar.f31939s.K(i3);
                if (K != null) {
                    View view = K.f55540a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f31051r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        org.telegram.ui.u51 u51Var = anVar.f31939s;
        View F = u51Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            anVar.M[b10 - anVar.f31942u0] = z10;
        }
        anVar.X();
    }

    @Override
    public final void i(boolean z10) {
        an.Q((an) this.G.f47865e, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.G.f47865e, z5Var);
    }

    @Override
    public final void k(ai.z zVar) {
        ((an) this.G.f47865e).f38416b.h1(zVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.G.f47865e;
        if (!arrayList.isEmpty()) {
            anVar.f31939s.getClass();
            int R = RecyclerView.R(this) - anVar.f31942u0;
            if (R >= 0) {
                ai.z zVar = this.d;
                zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i3 = R + 1;
                while (!arrayList.isEmpty() && i3 < anVar.K) {
                    for (int length = anVar.L.length - 1; length > i3; length--) {
                        CharSequence[] charSequenceArr = anVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    anVar.L[i3] = (CharSequence) arrayList.remove(0);
                    anVar.N++;
                    i3++;
                }
                anVar.n0();
                anVar.f31925l0 = (anVar.f31942u0 + i3) - 1;
                anVar.f31939s.setItemAnimator(anVar.f31944w);
                anVar.f31936r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return ((an) this.G.f47865e).f31910d0;
    }
}
