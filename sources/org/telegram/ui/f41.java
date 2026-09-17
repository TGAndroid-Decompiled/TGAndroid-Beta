package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f41 extends org.telegram.ui.Components.ll0 {
    public final Context f33548c;
    public final boolean d;
    public final g41 e;

    public f41(g41 g41Var, Context context, boolean z10) {
        this.e = g41Var;
        this.f33548c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42700f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        g41 g41Var = this.e;
        if (z10) {
            ArrayList arrayList = g41Var.f33845f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (g41Var.e >= 0) {
            i10 = 1;
        }
        return g41Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f41.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f33548c;
        if (i10 != 0) {
            if (i10 != 2) {
                l4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.c1(l4Var);
    }
}
