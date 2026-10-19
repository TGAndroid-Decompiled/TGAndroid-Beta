package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q21 extends org.telegram.ui.Components.hm0 {
    public final Context f40348c;
    public final boolean d;
    public final r21 e;

    public q21(r21 r21Var, Context context, boolean z10) {
        this.e = r21Var;
        this.f40348c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        r21 r21Var = this.e;
        if (z10) {
            ArrayList arrayList = r21Var.f41034f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (r21Var.e >= 0) {
            i10 = 1;
        }
        return r21Var.h.size() + i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q21.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f40348c;
        if (i10 != 0) {
            if (i10 != 2) {
                l4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.w8(context);
        }
        return new s4.b1(l4Var);
    }
}
