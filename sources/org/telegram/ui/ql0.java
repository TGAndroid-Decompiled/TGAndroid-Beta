package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ql0 implements View.OnClickListener {
    public final int f37043a;
    public final fn0 f37044b;

    public ql0(fn0 fn0Var, int i10) {
        this.f37043a = i10;
        this.f37044b = fn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37043a) {
            case 0:
                fn0 fn0Var = this.f37044b;
                fn0Var.S0 = 2;
                fn0Var.D1();
                return;
            case 1:
                this.f37044b.d1();
                return;
            case 2:
                fn0 fn0Var2 = this.f37044b;
                fn0Var2.S0 = 3;
                fn0Var2.D1();
                return;
            case 3:
                fn0 fn0Var3 = this.f37044b;
                fn0Var3.S0 = 1;
                fn0Var3.D1();
                return;
            case 4:
                fn0 fn0Var4 = this.f37044b;
                fn0Var4.S0 = 4;
                fn0Var4.D1();
                return;
            case 5:
                fn0.e0(this.f37044b);
                return;
            case 6:
                fn0 fn0Var5 = this.f37044b;
                fn0Var5.f33800f = true;
                fn0Var5.L.callOnClick();
                fn0Var5.f33800f = false;
                return;
            case 7:
                fn0 fn0Var6 = this.f37044b;
                fn0Var6.S0 = 0;
                fn0Var6.D1();
                return;
            case 8:
                fn0 fn0Var7 = this.f37044b;
                fn0Var7.S0 = 4;
                fn0Var7.D1();
                return;
            case 9:
                this.f37044b.d1();
                return;
            case 10:
                fn0.b0(this.f37044b);
                return;
            case 11:
                fn0.c0(this.f37044b);
                return;
            case 12:
                this.f37044b.C1();
                return;
            case 13:
                fn0 fn0Var8 = this.f37044b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var8.getParentActivity());
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sl0(fn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                fn0Var8.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
                    return;
                }
                return;
            case 14:
                this.f37044b.C1();
                return;
            case 15:
                fn0.V(this.f37044b);
                return;
            default:
                fn0 fn0Var9 = this.f37044b;
                fn0Var9.f33800f = true;
                fn0Var9.L.callOnClick();
                fn0Var9.f33800f = false;
                return;
        }
    }
}
