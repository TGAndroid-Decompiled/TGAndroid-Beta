package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ec1;
public final class io extends org.telegram.ui.Cells.d6 {
    public final jo F;

    public io(jo joVar, Context context, int i10, bo boVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, boVar, d6Var);
        this.F = joVar;
    }

    @Override
    public final boolean e() {
        s4.d1 T;
        lo loVar = this.F.d;
        ec1 ec1Var = loVar.f28403s;
        View F = ec1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = loVar.M;
            if (i10 == loVar.J && b10 == (loVar.f28405t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.d1 T;
        int b10;
        lo loVar = this.F.d;
        ec1 ec1Var = loVar.f28403s;
        View F = ec1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return loVar.L[b10 - loVar.f28405t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        lo loVar = this.F.d;
        if (loVar.f28396n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.n8(menu, ((org.telegram.ui.zn) loVar.f30161b.f33216f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        int b10;
        lo loVar = this.F.d;
        if (z10 && loVar.f28377c0 && !loVar.f28375b0) {
            Arrays.fill(loVar.L, false);
            loVar.f28403s.getChildCount();
            for (int i10 = loVar.f28405t0; i10 < loVar.f28405t0 + loVar.M; i10++) {
                s4.d1 K = loVar.f28403s.K(i10);
                if (K != null) {
                    View view = K.f47748a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21969r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        ec1 ec1Var = loVar.f28403s;
        View F = ec1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            loVar.L[b10 - loVar.f28405t0] = z10;
        }
        loVar.W();
    }

    @Override
    public final void i(boolean z10) {
        lo.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        lo.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f30161b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        lo loVar = this.F.d;
        if (!arrayList.isEmpty()) {
            loVar.f28403s.getClass();
            int R = RecyclerView.R(this) - loVar.f28405t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < loVar.J) {
                    for (int length = loVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = loVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    loVar.K[i10] = (CharSequence) arrayList.remove(0);
                    loVar.M++;
                    i10++;
                }
                loVar.k0();
                loVar.f28393k0 = (loVar.f28405t0 + i10) - 1;
                loVar.f28403s.setItemAnimator(loVar.v);
                loVar.f28401r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.f28377c0;
    }
}
