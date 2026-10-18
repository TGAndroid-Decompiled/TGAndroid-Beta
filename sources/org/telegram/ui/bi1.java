package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bi1 {
    public org.telegram.ui.Cells.a2 f35719a;
    public org.telegram.ui.ActionBar.b2 f35720b;
    public TextView f35721c;

    public static void a(Context context, Utilities.Callback callback, Runnable runnable) {
        ?? obj = new Object();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.TermsOfUse);
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21099j5, false));
        textView.setTextSize(1, 14.0f);
        e.addView(textView, w7.z5.t(-1, -2, 0, 24, 0, 24, 0));
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, null);
        obj.f35719a = a2Var;
        a2Var.getTextView().getLayoutParams().width = -1;
        obj.f35719a.getTextView().setTextSize(1, 14.0f);
        e.addView(obj.f35719a, w7.z5.t(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.n(R.string.BotWebAppDisclaimerSubtitle, textView);
        obj.f35719a.e(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new dv(context, 8)), "", false, false, false);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new org.telegram.ui.Components.c3(1, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hk0(15));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
        obj.f35720b = b2Var;
        b2Var.show();
        TextView textView2 = (TextView) obj.f35720b.d(-1);
        obj.f35721c = textView2;
        textView2.setEnabled(false);
        obj.f35721c.setAlpha(0.5f);
        obj.f35719a.setOnClickListener(new i31(obj, 7));
        obj.f35719a.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false), 7, -1));
        obj.f35720b.setOnDismissListener(new org.telegram.ui.Components.o2(zArr, runnable));
    }
}
