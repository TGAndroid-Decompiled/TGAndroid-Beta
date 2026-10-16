package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class pb1 extends org.telegram.ui.ActionBar.e3 {
    public static pb1 f38870b;

    public static void n(pb1 pb1Var, yy yyVar) {
        if (yyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(pb1Var.currentAccount).clearQueryTime();
        yyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void o(yy yyVar) {
        if (f38870b == null) {
            ?? e3Var = new org.telegram.ui.ActionBar.e3(yyVar.getParentActivity(), false);
            Activity parentActivity = yyVar.getParentActivity();
            LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
            org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(parentActivity, e3Var.currentAccount);
            xx0Var.setStickerNum(7);
            xx0Var.getImageReceiver().setAutoRepeat(1);
            e.addView(xx0Var, w7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
            org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e.addView(textView, w7.z5.a(-2.0f, 21.0f, 30.0f, 21.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(yyVar.getMessagesStorage().getDatabaseSize()))));
            e.addView(textView2, w7.z5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x02, k10, k10));
            e.addView(textView3, w7.z5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 0));
            textView3.setOnClickListener(new bz0(8, e3Var, yyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e);
            e3Var.setCustomView(scrollView);
            f38870b = e3Var;
            e3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f38870b = null;
    }
}
