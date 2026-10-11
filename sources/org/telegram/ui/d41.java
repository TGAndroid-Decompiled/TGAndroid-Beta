package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d41 extends org.telegram.ui.Components.qm0 {
    public final Context f36933c;
    public final boolean d;
    public final e41 f36934e;

    public d41(e41 e41Var, Context context, boolean z10) {
        this.f36934e = e41Var;
        this.f36933c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        boolean z10 = this.d;
        int i10 = 0;
        e41 e41Var = this.f36934e;
        if (z10) {
            ArrayList arrayList = e41Var.f37238f;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (e41Var.f37237e >= 0) {
            i10 = 1;
        }
        return e41Var.h.size() + i10;
    }

    @Override
    public final int j(int i10) {
        if (!this.d && i10 == this.f36934e.f37237e) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d41.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f36933c;
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
