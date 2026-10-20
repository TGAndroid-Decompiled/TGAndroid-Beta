package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.sa1;
public final class bo extends org.telegram.ui.Cells.c6 {
    public final co F;

    public bo(co coVar, Context context, int i10, vn vnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, vnVar, d6Var);
        this.F = coVar;
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        fo foVar = this.F.d;
        sa1 sa1Var = foVar.f26313s;
        View F = sa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = foVar.M;
            if (i10 == foVar.J && b10 == (foVar.f26315t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.b1 T;
        int b10;
        fo foVar = this.F.d;
        sa1 sa1Var = foVar.f26313s;
        View F = sa1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return foVar.L[b10 - foVar.f26315t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        fo foVar = this.F.d;
        if (foVar.f26306n && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) foVar.f28173b.f30545f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.b1 T;
        int b10;
        fo foVar = this.F.d;
        if (z10 && foVar.f26287c0 && !foVar.f26285b0) {
            Arrays.fill(foVar.L, false);
            foVar.f26313s.getChildCount();
            for (int i10 = foVar.f26315t0; i10 < foVar.f26315t0 + foVar.M; i10++) {
                s4.b1 K = foVar.f26313s.K(i10);
                if (K != null) {
                    View view = K.f45917a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22096r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        sa1 sa1Var = foVar.f26313s;
        View F = sa1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = sa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            foVar.L[b10 - foVar.f26315t0] = z10;
        }
        foVar.W();
    }

    @Override
    public final void i(boolean z10) {
        fo.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fo.Q(this.F.d, c6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.f28173b.w1(b6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.F.d;
        if (!arrayList.isEmpty()) {
            foVar.f26313s.getClass();
            int R = RecyclerView.R(this) - foVar.f26315t0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < foVar.J) {
                    for (int length = foVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = foVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    foVar.K[i10] = (CharSequence) arrayList.remove(0);
                    foVar.M++;
                    i10++;
                }
                foVar.k0();
                foVar.f26303k0 = (foVar.f26315t0 + i10) - 1;
                foVar.f26313s.setItemAnimator(foVar.v);
                foVar.f26311r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f26287c0;
    }
}
