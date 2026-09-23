package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class os implements Runnable {
    public final int f26844a = 1;
    public final Context f26845b;
    public final org.telegram.ui.ActionBar.d6 f26846c;

    public os(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26845b = context;
        this.f26846c = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f26844a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ms msVar = new ms(b2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26846c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, msVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f26845b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new yh.m7(this.f26845b, this.f26846c).show();
                return;
        }
    }

    public os(ss ssVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f26846c = d6Var;
        this.f26845b = context;
    }
}
