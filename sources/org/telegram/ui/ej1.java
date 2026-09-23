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
    public org.telegram.ui.Cells.z1 f32959a;
    public org.telegram.ui.ActionBar.b2 f32960b;
    public TextView f32961c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false));
        textView.setTextSize(1, 14.0f);
        f7.addView(textView, w7.x5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, null);
        obj.f32959a = z1Var;
        z1Var.getTextView().getLayoutParams().width = -1;
        obj.f32959a.getTextView().setTextSize(1, 14.0f);
        f7.addView(obj.f32959a, w7.x5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.z0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f32959a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new lv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.a3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rs(21));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        obj.f32960b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f32960b.d(-1);
        obj.f32961c = textView2;
        textView2.setEnabled(false);
        obj.f32961c.setAlpha(0.5f);
        obj.f32959a.setOnClickListener(new z31(obj, 9));
        obj.f32959a.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 7, -1));
        obj.f32960b.setOnDismissListener(new org.telegram.ui.Components.n2(zArr, runnable));
    }
}
