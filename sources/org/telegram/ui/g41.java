package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g41 extends org.telegram.ui.Components.vm0 {
    public final Context f37927c;
    public final boolean d;
    public final h41 f37928e;

    public g41(h41 h41Var, Context context, boolean z10) {
        this.f37928e = h41Var;
        this.f37927c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        h41 h41Var = this.f37928e;
        if (z10) {
            ArrayList arrayList = h41Var.f38244f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (h41Var.f38243e >= 0) {
            i10 = 1;
        }
        return h41Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f37928e.f38243e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g41.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f37927c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.d1(m4Var);
    }
}
