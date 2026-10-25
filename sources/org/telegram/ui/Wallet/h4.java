package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.y51;
public final class h4 extends m91 {
    public final Context f36627a;
    public final m5 f36628b;

    public h4(m5 m5Var, Context context) {
        this.f36628b = m5Var;
        this.f36627a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        m5.U0((r71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i13;
        m5 m5Var = this.f36628b;
        r71[] r71VarArr = m5Var.f36952r0;
        r71 r71Var = r71VarArr[i10];
        if (r71Var == null) {
            i11 = ((org.telegram.ui.ActionBar.r2) m5Var).currentAccount;
            i12 = ((org.telegram.ui.ActionBar.r2) m5Var).classGuid;
            org.telegram.ui.Components.o oVar = new org.telegram.ui.Components.o(this, i10, 2);
            r3 r3Var = new r3(m5Var);
            r3 r3Var2 = new r3(m5Var);
            u6Var = ((org.telegram.ui.ActionBar.r2) m5Var).resourceProvider;
            if (i10 == 1) {
                i13 = 3;
            } else {
                i13 = -1;
            }
            r71 r71Var2 = new r71(this.f36627a, i11, i12, false, oVar, r3Var, r3Var2, u6Var, i13, 1);
            if (i10 == 1) {
                r71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            r71Var2.setFocusableInTouchMode(false);
            r71Var2.setClipChildren(false);
            r71Var2.setClipToPadding(false);
            if (i10 == 0) {
                r71Var2.u1();
            } else {
                r71Var2.setSelectorType(9);
                r71Var2.setSelectorDrawableColor(0);
            }
            r71Var2.f32150g3.f29505r = false;
            r71Var2.j(new y51(this, i10));
            r71VarArr[i10] = r71Var2;
            return r71Var2;
        }
        return r71Var;
    }

    @Override
    public final int e() {
        if (this.f36628b.f36939f0) {
            return 2;
        }
        return 1;
    }

    @Override
    public final CharSequence g(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = R.string.WalletTransactions;
        } else {
            i11 = R.string.WalletCollectibles;
        }
        return LocaleController.getString(i11);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
