package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ym extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 F;

    public ym(org.telegram.ui.l4 l4Var, Context context, int i7, tm tmVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, tmVar, h6Var);
        this.F = l4Var;
        ((an) l4Var.f47512e).f31922s.getChildCount();
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        an anVar = (an) this.F.f47512e;
        org.telegram.ui.g61 g61Var = anVar.f31922s;
        View F = g61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = anVar.M;
            if (i7 == anVar.J && b10 == (anVar.f31924t0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        an anVar = (an) this.F.f47512e;
        org.telegram.ui.g61 g61Var = anVar.f31922s;
        View F = g61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return anVar.L[b10 - anVar.f31924t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        an anVar = (an) this.F.f47512e;
        if (anVar.f31912n && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) anVar.f38656b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        an anVar = (an) this.F.f47512e;
        if (z9 && anVar.f31892c0 && !anVar.f31890b0) {
            Arrays.fill(anVar.L, false);
            for (int i7 = anVar.f31924t0; i7 < anVar.f31924t0 + anVar.M; i7++) {
                v4.d1 K = anVar.f31922s.K(i7);
                if (K != null) {
                    View view = K.f57052a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28909r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        org.telegram.ui.g61 g61Var = anVar.f31922s;
        View F = g61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = g61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            anVar.L[b10 - anVar.f31924t0] = z9;
        }
        anVar.X();
    }

    @Override
    public final void i(boolean z9) {
        an.Q((an) this.F.f47512e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        an.R((an) this.F.f47512e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((an) this.F.f47512e).f38656b.h1(z5Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.F.f47512e;
        if (!arrayList.isEmpty()) {
            anVar.f31922s.getClass();
            int R = RecyclerView.R(this) - anVar.f31924t0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < anVar.J) {
                    for (int length = anVar.K.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = anVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    anVar.K[i7] = (CharSequence) arrayList.remove(0);
                    anVar.M++;
                    i7++;
                }
                anVar.n0();
                anVar.f31908k0 = (anVar.f31924t0 + i7) - 1;
                anVar.f31922s.setItemAnimator(anVar.f31927w);
                anVar.f31920r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return ((an) this.F.f47512e).f31892c0;
    }
}
