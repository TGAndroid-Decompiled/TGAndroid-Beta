package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hi1 {
    public org.telegram.ui.Cells.z1 f37869a;
    public org.telegram.ui.ActionBar.c2 f37870b;
    public TextView f37871c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, null);
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f37869a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f37869a.getTextView().setTextSize(1, 14.0f);
        e.addView(obj.f37869a, w7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.v0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f37869a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new dv(context, 8)), "", false, false, false);
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.b3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(28));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        obj.f37870b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) obj.f37870b.d(-1);
        obj.f37871c = textView2;
        textView2.setEnabled(false);
        obj.f37871c.setAlpha(0.5f);
        obj.f37869a.setOnClickListener(new g31(obj, 8));
        obj.f37869a.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false), 7, -1));
        obj.f37870b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
