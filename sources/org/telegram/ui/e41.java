package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e41 extends org.telegram.ui.Components.xl0 {
    public final Context f33240c;
    public final boolean d;
    public final f41 e;

    public e41(f41 f41Var, Context context, boolean z10) {
        this.e = f41Var;
        this.f33240c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        f41 f41Var = this.e;
        if (z10) {
            ArrayList arrayList = f41Var.f33515f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (f41Var.e >= 0) {
            i10 = 1;
        }
        return f41Var.h.size() + i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e41.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f33240c;
        if (i10 != 0) {
            if (i10 != 2) {
                n4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
            } else {
                org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                n4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                n4Var = n4Var2;
            }
        } else {
            n4Var = new org.telegram.ui.Cells.y8(context);
        }
        return new s4.c1(n4Var);
    }
}
