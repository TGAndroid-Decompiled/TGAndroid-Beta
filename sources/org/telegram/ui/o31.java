package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o31 extends org.telegram.ui.Components.sl0 {
    public final Context f39578c;
    public final boolean d;
    public final p31 f39579e;

    public o31(p31 p31Var, Context context, boolean z4) {
        this.f39579e = p31Var;
        this.f39578c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z4 = this.d;
        int i10 = 0;
        p31 p31Var = this.f39579e;
        if (z4) {
            ArrayList arrayList = p31Var.f39919f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (p31Var.f39918e >= 0) {
            i10 = 1;
        }
        return p31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f39579e.f39918e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o31.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f39578c;
        if (i10 != 0) {
            if (i10 != 2) {
                m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.t8(context);
        }
        return new f2.m1(m4Var);
    }
}
