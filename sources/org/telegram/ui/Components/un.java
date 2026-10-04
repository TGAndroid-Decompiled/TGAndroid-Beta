package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.zb1;
public final class un extends org.telegram.ui.Cells.d6 {
    public final vn F;

    public un(vn vnVar, Context context, int i10, on onVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, onVar, d6Var);
        this.F = vnVar;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        xn xnVar = this.F.d;
        zb1 zb1Var = xnVar.f32937s;
        View F = zb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = zb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = xnVar.M;
            if (i10 == xnVar.J && b10 == (xnVar.f32939t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 T;
        int b10;
        xn xnVar = this.F.d;
        zb1 zb1Var = xnVar.f32937s;
        View F = zb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = zb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return xnVar.L[b10 - xnVar.f32939t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        xn xnVar = this.F.d;
        if (xnVar.f32930n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) xnVar.f29643b.f32813f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        int b10;
        xn xnVar = this.F.d;
        if (z10 && xnVar.f32911c0 && !xnVar.f32909b0) {
            Arrays.fill(xnVar.L, false);
            xnVar.f32937s.getChildCount();
            for (int i10 = xnVar.f32939t0; i10 < xnVar.f32939t0 + xnVar.M; i10++) {
                s4.c1 K = xnVar.f32937s.K(i10);
                if (K != null) {
                    View view = K.f46524a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21925r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        zb1 zb1Var = xnVar.f32937s;
        View F = zb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = zb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            xnVar.L[b10 - xnVar.f32939t0] = z10;
        }
        xnVar.R();
    }

    @Override
    public final void i(boolean z10) {
        xn.K(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        xn.L(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f29643b.q1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        xn xnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            xnVar.f32937s.getClass();
            int R = RecyclerView.R(this) - xnVar.f32939t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < xnVar.J) {
                    for (int length = xnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = xnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    xnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    xnVar.M++;
                    i10++;
                }
                xnVar.h0();
                xnVar.f32927k0 = (xnVar.f32939t0 + i10) - 1;
                xnVar.f32937s.setItemAnimator(xnVar.v);
                xnVar.f32935r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f32911c0;
    }
}
