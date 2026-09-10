package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j41 extends org.telegram.ui.Components.ul0 {
    public final Context f33926c;
    public final boolean d;
    public final k41 e;

    public j41(k41 k41Var, Context context, boolean z10) {
        this.e = k41Var;
        this.f33926c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        k41 k41Var = this.e;
        if (z10) {
            ArrayList arrayList = k41Var.f34224f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (k41Var.e >= 0) {
            i10 = 1;
        }
        return k41Var.h.size() + i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j41.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f33926c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.y8(context);
        }
        return new s4.c1(m4Var);
    }
}
