package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qs implements Runnable {
    public final int f27716a = 1;
    public final Context f27717b;
    public final org.telegram.ui.ActionBar.d6 f27718c;

    public qs(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f27717b = context;
        this.f27718c = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f27716a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                os osVar = new os(a2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.f27718c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, osVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f27717b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(a2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                        a2Var.R = string2;
                        a2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        a2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new yh.m7(this.f27717b, this.f27718c).show();
                return;
        }
    }

    public qs(us usVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f27718c = d6Var;
        this.f27717b = context;
    }
}
