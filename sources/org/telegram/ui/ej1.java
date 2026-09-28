package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ej1 {
    public org.telegram.ui.Cells.a2 f33432a;
    public org.telegram.ui.ActionBar.a2 f33433b;
    public TextView f33434c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.y5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f33432a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f33432a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f33432a, w7.y5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.f0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f33432a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new kv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.b3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(27));
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f18662a;
        obj.f33433b = a2Var2;
        a2Var2.show();
        TextView textView2 = (TextView) obj.f33433b.d(-1);
        obj.f33434c = textView2;
        textView2.setEnabled(false);
        obj.f33434c.setAlpha(0.5f);
        obj.f33432a.setOnClickListener(new y31(obj, 9));
        obj.f33432a.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i6, false), 7, -1));
        obj.f33433b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
