package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e41 extends org.telegram.ui.Components.pm0 {
    public final Context f37152c;
    public final boolean d;
    public final f41 f37153e;

    public e41(f41 f41Var, Context context, boolean z10) {
        this.f37153e = f41Var;
        this.f37152c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        f41 f41Var = this.f37153e;
        if (z10) {
            ArrayList arrayList = f41Var.f37447f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (f41Var.f37446e >= 0) {
            i10 = 1;
        }
        return f41Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f37153e.f37446e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e41.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f37152c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
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
