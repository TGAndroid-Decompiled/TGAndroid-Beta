package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ta1;

public final class fn extends org.telegram.ui.Cells.z5 {
    public final gn B;

    public fn(gn gnVar, Context context, int i10, an anVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, anVar, c6Var);
        this.B = gnVar;
    }

    @Override
    public final boolean e() {
        in inVar = this.B.d;
        ta1 ta1Var = inVar.f29437s;
        View viewF = ta1Var.F(this);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT != null) {
            int iB = o1VarT.b();
            int i10 = inVar.I;
            if (i10 == inVar.F && iB == (inVar.f29433p0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int iB;
        in inVar = this.B.d;
        ta1 ta1Var = inVar.f29437s;
        View viewF = ta1Var.F(z5Var);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT == null || (iB = o1VarT.b()) == -1) {
            return false;
        }
        return inVar.H[iB - inVar.f29433p0];
    }

    @Override
    public final void g(gh.r rVar, ActionMode actionMode) {
        in inVar = this.B.d;
        if (inVar.f29430n && rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) == null) {
                return;
            }
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) inVar.f34900b.f28635b0).h, false, true, true, true);
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int iB;
        in inVar = this.B.d;
        if (z10 && inVar.V && !inVar.U) {
            Arrays.fill(inVar.H, false);
            inVar.f29437s.getChildCount();
            for (int i10 = inVar.f29433p0; i10 < inVar.f29433p0 + inVar.I; i10++) {
                f2.o1 o1VarK = inVar.f29437s.K(i10);
                if (o1VarK != null) {
                    View view = o1VarK.f5789a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f26037r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        ta1 ta1Var = inVar.f29437s;
        View viewF = ta1Var.F(z5Var);
        f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
        if (o1VarT != null && (iB = o1VarT.b()) != -1) {
            inVar.H[iB - inVar.f29433p0] = z10;
        }
        inVar.T();
    }

    @Override
    public final void i(boolean z10) {
        in.M(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        in.N(this.B.d, z5Var);
    }

    @Override
    public final void k(gh.r rVar) {
        this.B.d.f34900b.t1(rVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        in inVar = this.B.d;
        if (!arrayList.isEmpty()) {
            inVar.f29437s.getClass();
            int iR = RecyclerView.R(this) - inVar.f29433p0;
            if (iR >= 0) {
                gh.r rVar = this.d;
                rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = iR + 1;
                while (!arrayList.isEmpty() && i10 < inVar.F) {
                    for (int length = inVar.G.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = inVar.G;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    inVar.G[i10] = (CharSequence) arrayList.remove(0);
                    inVar.I++;
                    i10++;
                }
                inVar.h0();
                inVar.f29422g0 = (inVar.f29433p0 + i10) - 1;
                inVar.f29437s.setItemAnimator(inVar.v);
                inVar.f29435r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.B.d.V;
    }
}
