package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a31 extends org.telegram.ui.Components.vk0 {
    public final Context f36358c;
    public final boolean d;
    public final b31 f36359e;

    public a31(b31 b31Var, Context context, boolean z10) {
        this.f36359e = b31Var;
        this.f36358c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i9 = 0;
        b31 b31Var = this.f36359e;
        if (z10) {
            ArrayList arrayList = b31Var.f36622f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (b31Var.f36621e >= 0) {
            i9 = 1;
        }
        return b31Var.h.size() + i9;
    }

    @Override
    public final int j(int i9) {
        if (!this.d && i9 == this.f36359e.f36621e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a31.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f36358c;
        if (i9 != 0) {
            if (i9 != 2) {
                m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setText(LocaleController.getString(R.string.ChooseLanguages));
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.u8(context);
        }
        return new f2.q1(m4Var);
    }
}
