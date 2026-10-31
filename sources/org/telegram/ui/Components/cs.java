package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cs implements Runnable {
    public final int f25153a;
    public final Context f25154b;
    public final org.telegram.ui.ActionBar.p6 f25155c;

    public cs(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f25153a = i10;
        this.f25154b = context;
        this.f25155c = p6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25153a;
        org.telegram.ui.ActionBar.p6 p6Var = this.f25155c;
        Context context = this.f25154b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
                SpannableStringBuilder U2 = org.telegram.messenger.i0.U2(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.L0(2131754175, null), p6Var, new as(x1VarArr, 0)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(U2);
                while (matcher.find()) {
                    U2.setSpan(new org.telegram.messenger.w(x1VarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.cd.L0(2131754174, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = U2;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754176, null), null);
                x1VarArr[0] = alertDialog$Builder.p();
                return;
            case 1:
                org.telegram.ui.Wallet.b6.H0(context, p6Var);
                return;
            default:
                new rh.y7(context, p6Var).show();
                return;
        }
    }

    public cs(gs gsVar, org.telegram.ui.ActionBar.p6 p6Var, Context context) {
        this.f25153a = 0;
        this.f25155c = p6Var;
        this.f25154b = context;
    }
}
