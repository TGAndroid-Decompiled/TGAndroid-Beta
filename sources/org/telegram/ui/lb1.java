package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class lb1 extends org.telegram.ui.ActionBar.e3 {
    public static lb1 f39684b;

    public static void o(lb1 lb1Var, vy vyVar) {
        if (vyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(lb1Var.currentAccount).clearQueryTime();
        vyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void p(vy vyVar) {
        if (f39684b == null) {
            ?? e3Var = new org.telegram.ui.ActionBar.e3(vyVar.getParentActivity(), false);
            Activity parentActivity = vyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
            org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(parentActivity, e3Var.currentAccount);
            hy0Var.setStickerNum(7);
            hy0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(hy0Var, w7.w5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.f20668j5;
            org.telegram.messenger.v0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.w5.a(-2.0f, 21.0f, 30.0f, 21.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(vyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.w5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, k10, k10));
            f7.addView(textView3, w7.w5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 0));
            textView3.setOnClickListener(new xy0(8, e3Var, vyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            e3Var.setCustomView(scrollView);
            f39684b = e3Var;
            e3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f39684b = null;
    }
}
