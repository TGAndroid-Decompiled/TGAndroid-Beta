package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class kr0 extends org.telegram.ui.Cells.z5 {
    public final lr0 G;

    public kr0(lr0 lr0Var, Context context, int i7, g40 g40Var) {
        super(context, i7, g40Var, null);
        this.G = lr0Var;
    }

    @Override
    public final boolean f() {
        v4.e1 T;
        nr0 nr0Var = this.G.d;
        b61 b61Var = nr0Var.f49618c;
        View F = b61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = nr0Var.E;
            if (i7 == nr0Var.f49631n && b10 == (nr0Var.f49633o0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.z5 z5Var) {
        v4.e1 T;
        int b10;
        nr0 nr0Var = this.G.d;
        b61 b61Var = nr0Var.f49618c;
        View F = b61Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return nr0Var.f49645x[b10 - nr0Var.f49633o0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                an.C8(menu, this.G.d.f49623f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        v4.e1 T;
        int b10;
        nr0 nr0Var = this.G.d;
        nr0Var.f49618c.getChildCount();
        if (z10 && nr0Var.M) {
            Arrays.fill(nr0Var.f49645x, false);
            for (int i7 = nr0Var.f49633o0; i7 < nr0Var.f49633o0 + nr0Var.E; i7++) {
                v4.e1 K = nr0Var.f49618c.K(i7);
                if (K != null) {
                    View view = K.f58535a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).f32121r.a(false, true);
                    }
                }
            }
        }
        super.i(z5Var, z10);
        b61 b61Var = nr0Var.f49618c;
        View F = b61Var.F(z5Var);
        if (F == null) {
            T = null;
        } else {
            T = b61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            nr0Var.f49645x[b10 - nr0Var.f49633o0] = z10;
        }
        nr0Var.n0();
    }

    @Override
    public final void j(boolean z10) {
        nr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        nr0.j0(this.G.d, z5Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        nr0 nr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            nr0Var.f49618c.getClass();
            int R = RecyclerView.R(this) - nr0Var.f49633o0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < nr0Var.f49631n) {
                    for (int length = nr0Var.f49643w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = nr0Var.f49643w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    nr0Var.f49643w[i7] = (CharSequence) arrayList.remove(0);
                    nr0Var.E++;
                    i7++;
                }
                nr0Var.w0();
                nr0Var.f49626h0 = (nr0Var.f49633o0 + i7) - 1;
                nr0Var.f49616b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.G.d.M;
    }
}
