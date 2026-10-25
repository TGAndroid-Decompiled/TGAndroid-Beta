package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ki1 {
    public org.telegram.ui.Cells.y1 f40949a;
    public org.telegram.ui.ActionBar.e2 f40950b;
    public TextView f40951c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, null);
        textView.setTextSize(1, 14.0f);
        d.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, null);
        obj.f40949a = y1Var;
        y1Var.getTextView().getLayoutParams().width = -1;
        obj.f40949a.getTextView().setTextSize(1, 14.0f);
        d.addView(obj.f40949a, org.telegram.ui.Components.gb1.x(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.t.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f40949a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new av(context, 8)), "", false, false, false);
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.d3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ji1(0));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        obj.f40950b = e2Var;
        e2Var.show();
        TextView textView2 = (TextView) obj.f40950b.d(-1);
        obj.f40951c = textView2;
        textView2.setEnabled(false);
        obj.f40951c.setAlpha(0.5f);
        obj.f40949a.setOnClickListener(new t21(obj, 10));
        obj.f40949a.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false), 7, -1));
        obj.f40950b.setOnDismissListener(new org.telegram.ui.Components.q2(zArr, runnable));
    }
}
