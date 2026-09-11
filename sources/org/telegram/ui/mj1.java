package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mj1 {
    public org.telegram.ui.Cells.z1 f38724a;
    public org.telegram.ui.ActionBar.b2 f38725b;
    public TextView f38726c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f38724a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f38724a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f38724a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.w1.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f38724a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new pv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qv0(21, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sw0(5));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        obj.f38725b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f38725b.d(-1);
        obj.f38726c = textView2;
        textView2.setEnabled(false);
        obj.f38726c.setAlpha(0.5f);
        obj.f38724a.setOnClickListener(new j41(obj, 9));
        obj.f38724a.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 7, -1));
        obj.f38725b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
