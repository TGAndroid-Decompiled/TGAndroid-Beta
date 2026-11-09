package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class zm extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 F;

    public zm(org.telegram.ui.l4 l4Var, Context context, int i7, um umVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, umVar, g6Var);
        this.F = l4Var;
        ((bn) l4Var.f47458e).f32319s.getChildCount();
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        bn bnVar = (bn) this.F.f47458e;
        org.telegram.ui.f61 f61Var = bnVar.f32319s;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = bnVar.M;
            if (i7 == bnVar.J && b10 == (bnVar.f32321t0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        bn bnVar = (bn) this.F.f47458e;
        org.telegram.ui.f61 f61Var = bnVar.f32319s;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return bnVar.L[b10 - bnVar.f32321t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        bn bnVar = (bn) this.F.f47458e;
        if (bnVar.f32309n && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) bnVar.f39071b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        bn bnVar = (bn) this.F.f47458e;
        if (z9 && bnVar.f32289c0 && !bnVar.f32287b0) {
            Arrays.fill(bnVar.L, false);
            for (int i7 = bnVar.f32321t0; i7 < bnVar.f32321t0 + bnVar.M; i7++) {
                v4.d1 K = bnVar.f32319s.K(i7);
                if (K != null) {
                    View view = K.f57056a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28898r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        org.telegram.ui.f61 f61Var = bnVar.f32319s;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            bnVar.L[b10 - bnVar.f32321t0] = z9;
        }
        bnVar.X();
    }

    @Override
    public final void i(boolean z9) {
        bn.Q((bn) this.F.f47458e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.F.f47458e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.F.f47458e).f39071b.h1(z5Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        bn bnVar = (bn) this.F.f47458e;
        if (!arrayList.isEmpty()) {
            bnVar.f32319s.getClass();
            int R = RecyclerView.R(this) - bnVar.f32321t0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < bnVar.J) {
                    for (int length = bnVar.K.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = bnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    bnVar.K[i7] = (CharSequence) arrayList.remove(0);
                    bnVar.M++;
                    i7++;
                }
                bnVar.n0();
                bnVar.f32305k0 = (bnVar.f32321t0 + i7) - 1;
                bnVar.f32319s.setItemAnimator(bnVar.f32324w);
                bnVar.f32317r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return ((bn) this.F.f47458e).f32289c0;
    }
}
