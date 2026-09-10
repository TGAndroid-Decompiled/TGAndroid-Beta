package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ts implements Runnable {
    public final int f27477a = 1;
    public final Context f27478b;
    public final org.telegram.ui.ActionBar.f6 f27479c;

    public ts(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27478b = context;
        this.f27479c = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f27477a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                rs rsVar = new rs(d2VarArr, 0);
                org.telegram.ui.ActionBar.f6 f6Var = this.f27479c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, f6Var, rsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f27478b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(d2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string2;
                        d2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        d2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new xh.p7(this.f27478b, this.f27479c).show();
                return;
        }
    }

    public ts(xs xsVar, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f27479c = f6Var;
        this.f27478b = context;
    }
}
