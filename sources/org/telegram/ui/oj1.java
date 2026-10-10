package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oj1 {
    public org.telegram.ui.Cells.a2 f40590a;
    public org.telegram.ui.ActionBar.b2 f40591b;
    public TextView f40592c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        textView.setTextSize(1, 14.0f);
        e7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f40590a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f40590a.getTextView().setTextSize(1, 14.0f);
        e7.addView(obj.f40590a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.q.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f40590a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new nv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a80(19));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        obj.f40591b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f40591b.d(-1);
        obj.f40592c = textView2;
        textView2.setEnabled(false);
        obj.f40592c.setAlpha(0.5f);
        obj.f40590a.setOnClickListener(new p41(obj, 8));
        obj.f40590a.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), 7, -1));
        obj.f40591b.setOnDismissListener(new org.telegram.ui.Components.p2(zArr, runnable));
    }
}
