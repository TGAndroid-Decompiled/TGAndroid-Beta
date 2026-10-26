package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ea1 extends org.telegram.ui.ActionBar.k3 {
    public static ea1 f39072b;

    public static void m(ea1 ea1Var, cy cyVar) {
        if (cyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ea1Var.currentAccount).clearQueryTime();
        cyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(cy cyVar) {
        if (f39072b == null) {
            ?? k3Var = new org.telegram.ui.ActionBar.k3(cyVar.getParentActivity(), false);
            Activity parentActivity = cyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
            org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(parentActivity, k3Var.currentAccount);
            fy0Var.setStickerNum(7);
            fy0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(fy0Var, org.telegram.ui.Components.gb1.x(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.y6.f23464j5;
            org.telegram.messenger.t.r(textView, i10, null, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(cyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, null);
            int dp = AndroidUtilities.dp(6.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 120);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, o10, o10);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i12, 120);
            textView3.setBackground(j02);
            org.telegram.ui.ActionBar.f7.k(textView3, j02, N, h, null);
            f7.addView(textView3, org.telegram.ui.Components.gb1.h(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new xd0(19, k3Var, cyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            k3Var.setCustomView(scrollView);
            f39072b = k3Var;
            k3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f39072b = null;
    }
}
