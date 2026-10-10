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
    public final int f26165a;
    public final Context f26166b;
    public final org.telegram.ui.ActionBar.e6 f26167c;

    public et(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f26165a = i10;
        this.f26166b = context;
        this.f26167c = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f26165a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ct ctVar = new ct(b2VarArr, 0);
                org.telegram.ui.ActionBar.e6 e6Var = this.f26167c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, e6Var, ctVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f26166b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            case 1:
                org.telegram.ui.Wallet.b5.t0(this.f26166b, this.f26167c);
                return;
            default:
                new yh.f7(this.f26166b, this.f26167c).show();
                return;
        }
    }

    public et(jt jtVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.f26165a = 0;
        this.f26167c = e6Var;
        this.f26166b = context;
    }
}
