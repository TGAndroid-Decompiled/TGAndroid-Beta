package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class cr0 extends org.telegram.ui.Cells.z5 {
    public final dr0 G;

    public cr0(dr0 dr0Var, Context context, int i3, b40 b40Var) {
        super(context, i3, b40Var, null);
        this.G = dr0Var;
    }

    @Override
    public final boolean e() {
        u4.d1 T;
        fr0 fr0Var = this.G.d;
        u51 u51Var = fr0Var.f45331c;
        View F = u51Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i3 = fr0Var.E;
            if (i3 == fr0Var.f45344n && b10 == (fr0Var.f45346o0 + i3) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        u4.d1 T;
        int b10;
        fr0 fr0Var = this.G.d;
        u51 u51Var = fr0Var.f45331c;
        View F = u51Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return fr0Var.f45358x[b10 - fr0Var.f45346o0];
        }
        return false;
    }

    @Override
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                wm.A8(menu, this.G.d.f45336f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        u4.d1 T;
        int b10;
        fr0 fr0Var = this.G.d;
        fr0Var.f45331c.getChildCount();
        if (z10 && fr0Var.M) {
            Arrays.fill(fr0Var.f45358x, false);
            for (int i3 = fr0Var.f45346o0; i3 < fr0Var.f45346o0 + fr0Var.E; i3++) {
                u4.d1 K = fr0Var.f45331c.K(i3);
                if (K != null) {
                    View view = K.f55540a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f31051r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        u51 u51Var = fr0Var.f45331c;
        View F = u51Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = u51Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            fr0Var.f45358x[b10 - fr0Var.f45346o0] = z10;
        }
        fr0Var.n0();
    }

    @Override
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fr0 fr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            fr0Var.f45331c.getClass();
            int R = RecyclerView.R(this) - fr0Var.f45346o0;
            if (R >= 0) {
                ai.z zVar = this.d;
                zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i3 = R + 1;
                while (!arrayList.isEmpty() && i3 < fr0Var.f45344n) {
                    for (int length = fr0Var.f45356w.length - 1; length > i3; length--) {
                        CharSequence[] charSequenceArr = fr0Var.f45356w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fr0Var.f45356w[i3] = (CharSequence) arrayList.remove(0);
                    fr0Var.E++;
                    i3++;
                }
                fr0Var.w0();
                fr0Var.f45339h0 = (fr0Var.f45346o0 + i3) - 1;
                fr0Var.f45329b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.G.d.M;
    }
}
