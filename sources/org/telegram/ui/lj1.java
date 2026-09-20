package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lj1 {
    public org.telegram.ui.Cells.a2 f35462a;
    public org.telegram.ui.ActionBar.b2 f35463b;
    public TextView f35464c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.y5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f35462a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f35462a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f35462a, w7.y5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.l0.l(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f35462a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new pv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rv0(21, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ja0(16));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
        obj.f35463b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f35463b.d(-1);
        obj.f35464c = textView2;
        textView2.setEnabled(false);
        obj.f35464c.setAlpha(0.5f);
        obj.f35462a.setOnClickListener(new h41(obj, 9));
        obj.f35462a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false), 7, -1));
        obj.f35463b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
