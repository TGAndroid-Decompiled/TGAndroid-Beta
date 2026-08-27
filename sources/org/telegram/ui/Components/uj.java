package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class uj extends yk0 {

    public final ArrayList f33096c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final ArrayList f33097e = new ArrayList();

    public final Context f33098f;
    public final bk h;

    public uj(bk bkVar, Context context) {
        this.h = bkVar;
        this.f33098f = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    public final vj E(int i10) {
        int iE;
        ArrayList arrayList = this.f33096c;
        int size = arrayList.size();
        if (i10 < size) {
            return (vj) arrayList.get(i10);
        }
        if (!this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = this.f33097e;
        if (arrayList2.isEmpty() || i10 == size || i10 == size + 1 || (iE = org.telegram.ui.Cells.pa.e(2, i10, arrayList)) >= arrayList2.size()) {
            return null;
        }
        return (vj) arrayList2.get(iE);
    }

    @Override
    public final int h() {
        int size = this.f33096c.size();
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.f33097e;
            if (!arrayList.isEmpty()) {
                size += arrayList.size() + 2;
            }
        }
        return size + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 3;
        }
        int size = this.f33096c.size();
        if (i10 == size) {
            return 2;
        }
        return i10 == size + 1 ? 0 : 1;
    }

    @Override
    public final void l() {
        super.l();
        this.h.T();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        bk bkVar = this.h;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (bkVar.V) {
                j4Var.setText(LocaleController.getString(R.string.RecentFilesAZ));
                return;
            } else {
                j4Var.setText(LocaleController.getString(R.string.RecentFiles));
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        vj vjVarE = E(i10);
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
        int i12 = vjVarE.f33427a;
        if (i12 != 0) {
            f7Var.d(i10 != this.f33096c.size() - 1, vjVarE.f33428b, i12, vjVarE.f33429c, null, null);
        } else {
            f7Var.d(false, vjVarE.f33428b, 0, vjVarE.f33429c, vjVarE.d.toUpperCase().substring(0, Math.min(vjVarE.d.length(), 4)), vjVarE.f33430e);
        }
        File file = vjVarE.f33431f;
        if (file != null) {
            f7Var.b(bkVar.N.containsKey(file.toString()), !bkVar.Q);
        } else {
            f7Var.b(false, !bkVar.Q);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        View w6Var;
        org.telegram.ui.ActionBar.c6 c6Var = this.h.f34899a;
        Context context = this.f33098f;
        if (i10 != 0) {
            if (i10 == 1) {
                j4Var = new org.telegram.ui.Cells.f7(context, 1, c6Var);
            } else if (i10 != 2) {
                w6Var = new View(context);
                w6Var.setTag(-33024);
            } else {
                w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
            }
            return new lk0(w6Var);
        }
        j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
        w6Var = j4Var;
        return new lk0(w6Var);
    }
}
