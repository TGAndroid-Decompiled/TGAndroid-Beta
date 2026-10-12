package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k41 extends org.telegram.ui.Components.lm0 {
    public final Context f37564c;
    public final boolean d;
    public final l41 e;

    public k41(l41 l41Var, Context context, boolean z10) {
        this.e = l41Var;
        this.f37564c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        l41 l41Var = this.e;
        if (z10) {
            ArrayList arrayList = l41Var.f37841f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (l41Var.e >= 0) {
            i10 = 1;
        }
        return l41Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k41.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f37564c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.b1(m4Var);
    }
}
