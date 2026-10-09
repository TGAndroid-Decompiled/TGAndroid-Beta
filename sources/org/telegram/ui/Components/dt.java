package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dt implements Runnable {
    public final int f25807a;
    public final Context f25808b;
    public final org.telegram.ui.ActionBar.e6 f25809c;

    public dt(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25807a = i10;
        this.f25808b = context;
        this.f25809c = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f25807a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                bt btVar = new bt(b2VarArr, 0);
                org.telegram.ui.ActionBar.e6 e6Var = this.f25809c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, e6Var, btVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f25808b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            case 1:
                org.telegram.ui.Wallet.a5.t0(this.f25808b, this.f25809c);
                return;
            default:
                new yh.f7(this.f25808b, this.f25809c).show();
                return;
        }
    }

    public dt(ht htVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.f25807a = 0;
        this.f25809c = e6Var;
        this.f25808b = context;
    }
}
