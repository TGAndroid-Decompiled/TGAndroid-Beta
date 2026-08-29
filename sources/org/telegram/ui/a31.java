package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a31 extends org.telegram.ui.Components.il0 {
    public final Context f36416c;
    public final boolean d;
    public final b31 f36417e;

    public a31(b31 b31Var, Context context, boolean z10) {
        this.f36417e = b31Var;
        this.f36416c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        b31 b31Var = this.f36417e;
        if (z10) {
            ArrayList arrayList = b31Var.f36679f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (b31Var.f36678e >= 0) {
            i10 = 1;
        }
        return b31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f36417e.f36678e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a31.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k4 k4Var;
        Context context = this.f36416c;
        if (i10 != 0) {
            if (i10 != 2) {
                k4Var = new org.telegram.ui.Cells.x6(context, (b) null);
            } else {
                org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context);
                k4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                k4Var = k4Var2;
            }
        } else {
            k4Var = new org.telegram.ui.Cells.r8(context);
        }
        return new f2.n1(k4Var);
    }
}
