package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ev0 extends org.telegram.ui.Cells.c6 {
    public final fv0 F;

    public ev0(fv0 fv0Var, Context context, int i10, y50 y50Var) {
        super(context, i10, y50Var, null);
        this.F = fv0Var;
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        hv0 hv0Var = this.F.d;
        ua1 ua1Var = hv0Var.f37628c;
        View F = ua1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ua1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = hv0Var.f37656y;
            if (i10 == hv0Var.f37640n && b10 == (hv0Var.f37641n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.b1 T;
        int b10;
        hv0 hv0Var = this.F.d;
        ua1 ua1Var = hv0Var.f37628c;
        View F = ua1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ua1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return hv0Var.f37652w[b10 - hv0Var.f37641n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                sn.n8(menu, this.F.d.f37632f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.b1 T;
        int b10;
        hv0 hv0Var = this.F.d;
        if (z10 && hv0Var.L) {
            Arrays.fill(hv0Var.f37652w, false);
            hv0Var.f37628c.getChildCount();
            for (int i10 = hv0Var.f37641n0; i10 < hv0Var.f37641n0 + hv0Var.f37656y; i10++) {
                s4.b1 K = hv0Var.f37628c.K(i10);
                if (K != null) {
                    View view = K.f45910a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22092r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ua1 ua1Var = hv0Var.f37628c;
        View F = ua1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ua1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            hv0Var.f37652w[b10 - hv0Var.f37641n0] = z10;
        }
        hv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        hv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.F.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            hv0Var.f37628c.getClass();
            int R = RecyclerView.R(this) - hv0Var.f37641n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < hv0Var.f37640n) {
                    for (int length = hv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = hv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    hv0Var.f37656y++;
                    i10++;
                }
                hv0Var.r0();
                hv0Var.f37634g0 = (hv0Var.f37641n0 + i10) - 1;
                hv0Var.f37626b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.L;
    }
}
