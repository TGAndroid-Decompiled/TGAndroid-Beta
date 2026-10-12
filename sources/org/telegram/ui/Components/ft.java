package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ft implements Runnable {
    public final int f26169a;
    public final Context f26170b;
    public final org.telegram.ui.ActionBar.c6 f26171c;

    public ft(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26169a = i10;
        this.f26170b = context;
        this.f26171c = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f26169a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                dt dtVar = new dt(a2VarArr, 0);
                org.telegram.ui.ActionBar.c6 c6Var = this.f26171c;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, c6Var, dtVar));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(replaceTags);
                while (true) {
                    boolean find = matcher.find();
                    Context context = this.f26170b;
                    if (find) {
                        replaceTags.setSpan(new org.telegram.ui.o0(a2VarArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string2;
                        a2Var.T = replaceTags;
                        alertDialog$Builder.k(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        a2VarArr[0] = alertDialog$Builder.o();
                        return;
                    }
                }
            case 1:
                org.telegram.ui.Wallet.c5.t0(this.f26170b, this.f26171c);
                return;
            default:
                new yh.f7(this.f26170b, this.f26171c).show();
                return;
        }
    }

    public ft(lt ltVar, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.f26169a = 0;
        this.f26171c = c6Var;
        this.f26170b = context;
    }
}
