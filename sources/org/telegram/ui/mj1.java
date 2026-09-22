package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mj1 {
    public org.telegram.ui.Cells.z1 f35764a;
    public org.telegram.ui.ActionBar.b2 f35765b;
    public TextView f35766c;

    public static void a(Context context, e2.h hVar, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18940j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f35764a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f35764a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f35764a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.y0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f35764a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new ov(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rv0(20, hVar, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(7));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
        obj.f35765b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f35765b.d(-1);
        obj.f35766c = textView2;
        textView2.setEnabled(false);
        obj.f35766c.setAlpha(0.5f);
        obj.f35764a.setOnClickListener(new h41(obj, 9));
        obj.f35764a.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18923i6, false), 7, -1));
        obj.f35765b.setOnDismissListener(new org.telegram.ui.Components.m2(zArr, runnable));
    }
}
