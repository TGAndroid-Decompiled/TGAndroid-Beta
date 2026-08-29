package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gi1 {
    public org.telegram.ui.Cells.y1 f38597a;
    public org.telegram.ui.ActionBar.c2 f38598b;
    public TextView f38599c;

    public static void a(Context context, f5.d dVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        textView.setTextSize(1, 14.0f);
        g10.addView(textView, i7.f6.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        obj.f38597a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        obj.f38597a.getTextView().setTextSize(1, 14.0f);
        g10.addView(obj.f38597a, i7.f6.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.x3.r(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f38597a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new dv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new fi1(0, dVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xx0(4));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        obj.f38598b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) obj.f38598b.d(-1);
        obj.f38599c = textView2;
        textView2.setEnabled(false);
        obj.f38599c.setAlpha(0.5f);
        obj.f38597a.setOnClickListener(new w21(obj, 10));
        obj.f38597a.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 7, -1));
        obj.f38598b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
