package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class et implements Runnable {
    public final int f26131a;
    public final Context f26132b;
    public final org.telegram.ui.ActionBar.d6 f26133c;

    public et(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26131a = i10;
        this.f26132b = context;
        this.f26133c = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f26131a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ct ctVar = new ct(a2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26133c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, ctVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f26132b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.n0(a2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                        a2Var.R = string2;
                        a2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        a2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            case 1:
                org.telegram.ui.Wallet.c5.t0(this.f26132b, this.f26133c);
                return;
            default:
                new yh.f7(this.f26132b, this.f26133c).show();
                return;
        }
    }

    public et(jt jtVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f26131a = 0;
        this.f26133c = d6Var;
        this.f26132b = context;
    }
}
