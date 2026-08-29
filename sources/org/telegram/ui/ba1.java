package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ba1 extends org.telegram.ui.ActionBar.f3 {
    public static ba1 f36756b;

    public static void m(ba1 ba1Var, fy fyVar) {
        if (fyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ba1Var.currentAccount).clearQueryTime();
        fyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(fy fyVar) {
        if (f36756b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(fyVar.getParentActivity(), false);
            Activity parentActivity = fyVar.getParentActivity();
            LinearLayout f9 = org.telegram.messenger.x3.f(parentActivity, 1);
            org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(parentActivity, f3Var.currentAccount);
            rw0Var.setStickerNum(7);
            rw0Var.getImageReceiver().setAutoRepeat(1);
            f9.addView(rw0Var, i7.f6.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
            org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f9.addView(textView, i7.f6.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(fyVar.getMessagesStorage().getDatabaseSize()))));
            f9.addView(textView2, i7.f6.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, k9, k9));
            f9.addView(textView3, i7.f6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new t70(26, f3Var, fyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f9);
            f3Var.setCustomView(scrollView);
            f36756b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f36756b = null;
    }
}
