package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mj1 {
    public org.telegram.ui.Cells.a2 f39995a;
    public org.telegram.ui.ActionBar.a2 f39996b;
    public TextView f39997c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
        textView.setTextSize(1, 14.0f);
        e7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f39995a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f39995a.getTextView().setTextSize(1, 14.0f);
        e7.addView(obj.f39995a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.q.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f39995a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new mv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v20(21));
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20404a;
        obj.f39996b = a2Var2;
        a2Var2.show();
        TextView textView2 = (TextView) obj.f39996b.d(-1);
        obj.f39997c = textView2;
        textView2.setEnabled(false);
        obj.f39997c.setAlpha(0.5f);
        obj.f39995a.setOnClickListener(new o41(obj, 8));
        obj.f39995a.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913i6, false), 7, -1));
        obj.f39996b.setOnDismissListener(new org.telegram.ui.Components.p2(zArr, runnable));
    }
}
