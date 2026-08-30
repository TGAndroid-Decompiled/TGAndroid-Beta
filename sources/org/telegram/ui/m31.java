package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m31 extends org.telegram.ui.Components.rl0 {
    public final Context f36181c;
    public final boolean d;
    public final n31 e;

    public m31(n31 n31Var, Context context, boolean z4) {
        this.e = n31Var;
        this.f36181c = context;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z4 = this.d;
        int i10 = 0;
        n31 n31Var = this.e;
        if (z4) {
            ArrayList arrayList = n31Var.f36441f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (n31Var.e >= 0) {
            i10 = 1;
        }
        return n31Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.e.e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m31.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f36181c;
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
        return new f2.l1(m4Var);
    }
}
