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

    public zm(org.telegram.ui.l4 l4Var, Context context, int i7, um umVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, umVar, f6Var);
        this.F = l4Var;
        ((bn) l4Var.f47405e).f32239s.getChildCount();
    }

    @Override
    public final boolean e() {
        v4.d1 T;
        bn bnVar = (bn) this.F.f47405e;
        org.telegram.ui.e61 e61Var = bnVar.f32239s;
        View F = e61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = bnVar.M;
            if (i7 == bnVar.J && b10 == (bnVar.f32241t0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        v4.d1 T;
        int b10;
        bn bnVar = (bn) this.F.f47405e;
        org.telegram.ui.e61 e61Var = bnVar.f32239s;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return bnVar.L[b10 - bnVar.f32241t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        bn bnVar = (bn) this.F.f47405e;
        if (bnVar.f32229n && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) bnVar.f38969b.W1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        int b10;
        bn bnVar = (bn) this.F.f47405e;
        if (z9 && bnVar.f32209c0 && !bnVar.f32207b0) {
            Arrays.fill(bnVar.L, false);
            for (int i7 = bnVar.f32241t0; i7 < bnVar.f32241t0 + bnVar.M; i7++) {
                v4.d1 K = bnVar.f32239s.K(i7);
                if (K != null) {
                    View view = K.f56951a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f28891r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        org.telegram.ui.e61 e61Var = bnVar.f32239s;
        View F = e61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = e61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            bnVar.L[b10 - bnVar.f32241t0] = z9;
        }
        bnVar.X();
    }

    @Override
    public final void i(boolean z9) {
        bn.Q((bn) this.F.f47405e, this, z9);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.F.f47405e, a6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.F.f47405e).f38969b.h1(z5Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        bn bnVar = (bn) this.F.f47405e;
        if (!arrayList.isEmpty()) {
            bnVar.f32239s.getClass();
            int R = RecyclerView.R(this) - bnVar.f32241t0;
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
                bnVar.f32225k0 = (bnVar.f32241t0 + i7) - 1;
                bnVar.f32239s.setItemAnimator(bnVar.f32244w);
                bnVar.f32237r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return ((bn) this.F.f47405e).f32209c0;
    }
}
