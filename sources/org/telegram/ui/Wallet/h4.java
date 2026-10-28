package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.z51;
public final class h4 extends n91 {
    public final Context f36655a;
    public final m5 f36656b;

    public h4(m5 m5Var, Context context) {
        this.f36656b = m5Var;
        this.f36655a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        m5.U0((s71) view, false);
    }

    @Override
    public final View d(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i13;
        m5 m5Var = this.f36656b;
        s71[] s71VarArr = m5Var.f36960r0;
        s71 s71Var = s71VarArr[i10];
        if (s71Var == null) {
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
            s71 s71Var2 = new s71(this.f36655a, i11, i12, false, oVar, r3Var, r3Var2, u6Var, i13, 1);
            if (i10 == 1) {
                s71Var2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f));
            }
            s71Var2.setFocusableInTouchMode(false);
            s71Var2.setClipChildren(false);
            s71Var2.setClipToPadding(false);
            if (i10 == 0) {
                s71Var2.u1();
            } else {
                s71Var2.setSelectorType(9);
                s71Var2.setSelectorDrawableColor(0);
            }
            s71Var2.f32504g3.f29878r = false;
            s71Var2.j(new z51(this, i10));
            s71VarArr[i10] = s71Var2;
            return s71Var2;
        }
        return s71Var;
    }

    @Override
    public final int e() {
        if (this.f36656b.f36947f0) {
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
