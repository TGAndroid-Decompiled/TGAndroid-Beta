package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cj1 {
    public org.telegram.ui.Cells.a2 f32738a;
    public org.telegram.ui.ActionBar.c2 f32739b;
    public TextView f32740c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19164j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.y5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f32738a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f32738a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f32738a, w7.y5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.l0.l(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f32738a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new mv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.b3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(28));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        obj.f32739b = c2Var;
        c2Var.show();
        TextView textView2 = (TextView) obj.f32739b.d(-1);
        obj.f32740c = textView2;
        textView2.setEnabled(false);
        obj.f32740c.setAlpha(0.5f);
        obj.f32738a.setOnClickListener(new a41(obj, 9));
        obj.f32738a.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19147i6, false), 7, -1));
        obj.f32739b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
