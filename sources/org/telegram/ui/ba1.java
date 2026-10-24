package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ba1 extends org.telegram.ui.ActionBar.h3 {
    public static ba1 f36005b;

    public static void m(ba1 ba1Var, ey eyVar) {
        if (eyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ba1Var.currentAccount).clearQueryTime();
        eyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(ey eyVar) {
        if (f36005b == null) {
            ?? h3Var = new org.telegram.ui.ActionBar.h3(eyVar.getParentActivity(), false);
            Activity parentActivity = eyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
            org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(parentActivity, h3Var.currentAccount);
            wx0Var.setStickerNum(7);
            wx0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(wx0Var, w7.z5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
            org.telegram.messenger.v0.q(textView, i10, null, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.z5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView2, i10, null);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(eyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.z5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Sh, null);
            int dp = AndroidUtilities.dp(6.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.k6.f21184d6;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 120);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x02, o10, o10);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 120);
            textView3.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(textView3, j02, O, h, null);
            f7.addView(textView3, w7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new zd0(19, h3Var, eyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            h3Var.setCustomView(scrollView);
            f36005b = h3Var;
            h3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f36005b = null;
    }
}
