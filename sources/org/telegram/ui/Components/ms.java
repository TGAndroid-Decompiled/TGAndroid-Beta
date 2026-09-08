package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ms implements Runnable {
    public final int f28533a = 1;
    public final Context f28534b;
    public final org.telegram.ui.ActionBar.f6 f28535c;

    public ms(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28534b = context;
        this.f28535c = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f28533a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ks ksVar = new ks(b2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.f28535c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, ksVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f28534b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.n0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new zh.l7(this.f28534b, this.f28535c).show();
                return;
        }
    }

    public ms(qs qsVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f28535c = f6Var;
        this.f28534b = context;
    }
}
