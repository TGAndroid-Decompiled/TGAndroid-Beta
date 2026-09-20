package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ns implements Runnable {
    public final int f26729a = 1;
    public final Context f26730b;
    public final org.telegram.ui.ActionBar.f6 f26731c;

    public ns(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26730b = context;
        this.f26731c = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f26729a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ls lsVar = new ls(b2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.f26731c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, lsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f26730b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.n0(b2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.R = string2;
                        b2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        b2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new yh.m7(this.f26730b, this.f26731c).show();
                return;
        }
    }

    public ns(rs rsVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f26731c = f6Var;
        this.f26730b = context;
    }
}
