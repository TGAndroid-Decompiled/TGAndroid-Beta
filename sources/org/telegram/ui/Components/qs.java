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
    public final int f30159a = 1;
    public final Context f30160b;
    public final org.telegram.ui.ActionBar.d6 f30161c;

    public qs(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30160b = context;
        this.f30161c = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f30159a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                os osVar = new os(b2VarArr, 0);
                org.telegram.ui.ActionBar.d6 d6Var = this.f30161c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, d6Var, osVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f30160b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new yh.n7(this.f30160b, this.f30161c).show();
                return;
        }
    }

    public qs(us usVar, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f30161c = d6Var;
        this.f30160b = context;
    }
}
