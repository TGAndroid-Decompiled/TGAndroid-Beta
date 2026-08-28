package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class aa1 extends org.telegram.ui.ActionBar.f3 {
    public static aa1 f36446b;

    public static void m(aa1 aa1Var, dy dyVar) {
        if (dyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(aa1Var.currentAccount).clearQueryTime();
        dyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(dy dyVar) {
        if (f36446b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(dyVar.getParentActivity(), false);
            Activity parentActivity = dyVar.getParentActivity();
            LinearLayout f10 = org.telegram.messenger.l0.f(parentActivity, 1);
            org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(parentActivity, f3Var.currentAccount);
            hw0Var.setStickerNum(7);
            hw0Var.getImageReceiver().setAutoRepeat(1);
            f10.addView(hw0Var, g7.e6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
            org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i9, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f10.addView(textView, g7.e6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(dyVar.getMessagesStorage().getDatabaseSize()))));
            f10.addView(textView2, g7.e6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, k10, k10));
            f10.addView(textView3, g7.e6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new v80(25, f3Var, dyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f10);
            f3Var.setCustomView(scrollView);
            f36446b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f36446b = null;
    }
}
