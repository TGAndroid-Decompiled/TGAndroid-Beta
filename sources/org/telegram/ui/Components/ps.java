package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ps implements Runnable {
    public final int f27453a = 1;
    public final Context f27454b;
    public final org.telegram.ui.ActionBar.e6 f27455c;

    public ps(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f27454b = context;
        this.f27455c = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f27453a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ns nsVar = new ns(c2VarArr, 0);
                org.telegram.ui.ActionBar.e6 e6Var = this.f27455c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, e6Var, nsVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f27454b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.p0(c2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                        c2Var.R = string2;
                        c2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        c2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            default:
                new yh.l7(this.f27454b, this.f27455c).show();
                return;
        }
    }

    public ps(ts tsVar, org.telegram.ui.ActionBar.e6 e6Var, Context context) {
        this.f27455c = e6Var;
        this.f27454b = context;
    }
}
