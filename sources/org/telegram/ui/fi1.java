package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fi1 {
    public org.telegram.ui.Cells.z1 f38298a;
    public org.telegram.ui.ActionBar.c2 f38299b;
    public TextView f38300c;

    public static void a(Context context, d5.d dVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, g7.e6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f38298a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f38298a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f38298a, g7.e6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.l0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f38298a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new cv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ei1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        obj.f38299b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) obj.f38299b.d(-1);
        obj.f38300c = textView2;
        textView2.setEnabled(false);
        obj.f38300c.setAlpha(0.5f);
        obj.f38298a.setOnClickListener(new w21(obj, 10));
        obj.f38298a.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 7, -1));
        obj.f38299b.setOnDismissListener(new org.telegram.ui.Components.k2(zArr, runnable));
    }
}
