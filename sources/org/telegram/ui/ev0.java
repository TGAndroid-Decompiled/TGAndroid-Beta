package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ev0 extends org.telegram.ui.Cells.c6 {
    public final fv0 C;

    public ev0(fv0 fv0Var, Context context, int i10, f60 f60Var) {
        super(context, i10, f60Var, null);
        this.C = fv0Var;
    }

    @Override
    public final boolean e() {
        f2.m1 T;
        hv0 hv0Var = this.C.d;
        kb1 kb1Var = hv0Var.f37644c;
        View F = kb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = hv0Var.f37673y;
            if (i10 == hv0Var.f37657n && b10 == (hv0Var.f37655k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.m1 T;
        int b10;
        hv0 hv0Var = this.C.d;
        kb1 kb1Var = hv0Var.f37644c;
        View F = kb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return hv0Var.f37669w[b10 - hv0Var.f37655k0];
        }
        return false;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.C.d.f37649f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        int b10;
        hv0 hv0Var = this.C.d;
        if (z4 && hv0Var.I) {
            Arrays.fill(hv0Var.f37669w, false);
            hv0Var.f37644c.getChildCount();
            for (int i10 = hv0Var.f37655k0; i10 < hv0Var.f37655k0 + hv0Var.f37673y; i10++) {
                f2.m1 K = hv0Var.f37644c.K(i10);
                if (K != null) {
                    View view = K.f5875a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22653r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        kb1 kb1Var = hv0Var.f37644c;
        View F = kb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            hv0Var.f37669w[b10 - hv0Var.f37655k0] = z4;
        }
        hv0Var.i0();
    }

    @Override
    public final void i(boolean z4) {
        hv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.C.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            hv0Var.f37644c.getClass();
            int R = RecyclerView.R(this) - hv0Var.f37655k0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < hv0Var.f37657n) {
                    for (int length = hv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = hv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    hv0Var.f37673y++;
                    i10++;
                }
                hv0Var.r0();
                hv0Var.f37646d0 = (hv0Var.f37655k0 + i10) - 1;
                hv0Var.f37642b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.C.d.I;
    }
}
