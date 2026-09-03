package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bj1 {
    public org.telegram.ui.Cells.z1 f35557a;
    public org.telegram.ui.ActionBar.d2 f35558b;
    public TextView f35559c;

    public static void a(Context context, h5.d dVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false));
        textView.setTextSize(1, 14.0f);
        f10.addView(textView, k7.c6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f35557a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f35557a.getTextView().setTextSize(1, 14.0f);
        f10.addView(obj.f35557a, k7.c6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y3.q(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f35557a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new mv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new vl0(29, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(9));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        obj.f35558b = d2Var;
        d2Var.show();
        TextView textView2 = (TextView) obj.f35558b.d(-1);
        obj.f35559c = textView2;
        textView2.setEnabled(false);
        obj.f35559c.setAlpha(0.5f);
        obj.f35557a.setOnClickListener(new v31(obj, 9));
        obj.f35557a.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 7, -1));
        obj.f35558b.setOnDismissListener(new org.telegram.ui.Components.m2(zArr, runnable));
    }
}
