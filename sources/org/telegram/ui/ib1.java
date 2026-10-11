package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ib1 extends org.telegram.ui.ActionBar.e3 {
    public static ib1 f38684b;

    public static void o(ib1 ib1Var, sy syVar) {
        if (syVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ib1Var.currentAccount).clearQueryTime();
        syVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void p(sy syVar) {
        if (f38684b == null) {
            ?? e3Var = new org.telegram.ui.ActionBar.e3(syVar.getParentActivity(), false);
            Activity parentActivity = syVar.getParentActivity();
            LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
            org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(parentActivity, e3Var.currentAccount);
            cy0Var.setStickerNum(7);
            cy0Var.getImageReceiver().setAutoRepeat(1);
            e7.addView(cy0Var, w7.x5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.f20930j5;
            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e7.addView(textView, w7.x5.a(-2.0f, 21.0f, 30.0f, 21.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(syVar.getMessagesStorage().getDatabaseSize()))));
            e7.addView(textView2, w7.x5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, k10, k10));
            e7.addView(textView3, w7.x5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 0));
            textView3.setOnClickListener(new uy0(8, e3Var, syVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e7);
            e3Var.setCustomView(scrollView);
            f38684b = e3Var;
            e3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f38684b = null;
    }
}
