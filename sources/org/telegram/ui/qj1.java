package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qj1 {
    public org.telegram.ui.Cells.z1 f36082a;
    public org.telegram.ui.ActionBar.d2 f36083b;
    public TextView f36084c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.a6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f36082a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f36082a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f36082a, w7.a6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.a2.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f36082a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new qv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new fz0(16, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(6));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        obj.f36083b = d2Var;
        d2Var.show();
        TextView textView2 = (TextView) obj.f36083b.d(-1);
        obj.f36084c = textView2;
        textView2.setEnabled(false);
        obj.f36084c.setAlpha(0.5f);
        obj.f36082a.setOnClickListener(new m41(obj, 9));
        obj.f36082a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 7, -1));
        obj.f36083b.setOnDismissListener(new org.telegram.ui.Components.o2(zArr, runnable));
    }
}
