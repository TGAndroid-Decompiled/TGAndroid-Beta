package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ic1;
public final class wn extends org.telegram.ui.Cells.e6 {
    public final xn F;

    public wn(xn xnVar, Context context, int i10, rn rnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, rnVar, f6Var);
        this.F = xnVar;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        zn znVar = this.F.d;
        ic1 ic1Var = znVar.f29762s;
        View F = ic1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = znVar.M;
            if (i10 == znVar.J && b10 == (znVar.f29764t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 T;
        int b10;
        zn znVar = this.F.d;
        ic1 ic1Var = znVar.f29762s;
        View F = ic1Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return znVar.L[b10 - znVar.f29764t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        zn znVar = this.F.d;
        if (znVar.f29755n && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) znVar.f26422b.f29366f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        int b10;
        zn znVar = this.F.d;
        if (z10 && znVar.f29736c0 && !znVar.f29734b0) {
            Arrays.fill(znVar.L, false);
            znVar.f29762s.getChildCount();
            for (int i10 = znVar.f29764t0; i10 < znVar.f29764t0 + znVar.M; i10++) {
                s4.c1 K = znVar.f29762s.K(i10);
                if (K != null) {
                    View view = K.f41610a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f19078r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        ic1 ic1Var = znVar.f29762s;
        View F = ic1Var.F(e6Var);
        if (F == null) {
            T = null;
        } else {
            T = ic1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            znVar.L[b10 - znVar.f29764t0] = z10;
        }
        znVar.T();
    }

    @Override
    public final void i(boolean z10) {
        zn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.F.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.f26422b.t1(d6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        zn znVar = this.F.d;
        if (!arrayList.isEmpty()) {
            znVar.f29762s.getClass();
            int R = RecyclerView.R(this) - znVar.f29764t0;
            if (R >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < znVar.J) {
                    for (int length = znVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = znVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    znVar.K[i10] = (CharSequence) arrayList.remove(0);
                    znVar.M++;
                    i10++;
                }
                znVar.h0();
                znVar.f29752k0 = (znVar.f29764t0 + i10) - 1;
                znVar.f29762s.setItemAnimator(znVar.v);
                znVar.f29760r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f29736c0;
    }
}
