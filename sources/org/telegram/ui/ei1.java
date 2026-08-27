package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ei1 {

    public org.telegram.ui.Cells.y1 f37771a;

    public org.telegram.ui.ActionBar.b2 f37772b;

    public TextView f37773c;

    public static void a(Context context, d5.d dVar, Runnable runnable) {
        ei1 ei1Var = new ei1();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textView.setTextSize(1, 14.0f);
        linearLayoutG.addView(textView, h7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        ei1Var.f37771a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        ei1Var.f37771a.getTextView().setTextSize(1, 14.0f);
        linearLayoutG.addView(ei1Var.f37771a, h7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y1.p(R.string.BotWebAppDisclaimerSubtitle, textView);
        ei1Var.f37771a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new fv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(linearLayoutG);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new di1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j70(15));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        ei1Var.f37772b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) ei1Var.f37772b.d(-1);
        ei1Var.f37773c = textView2;
        textView2.setEnabled(false);
        ei1Var.f37773c.setAlpha(0.5f);
        ei1Var.f37771a.setOnClickListener(new v21(ei1Var, 10));
        ei1Var.f37771a.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 7, -1));
        ei1Var.f37772b.setOnDismissListener(new org.telegram.ui.Components.k2(zArr, runnable));
    }
}
