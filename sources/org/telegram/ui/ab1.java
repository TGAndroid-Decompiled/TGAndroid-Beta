package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ab1 extends org.telegram.ui.ActionBar.e3 {
    public static ab1 f32093b;

    public static void m(ab1 ab1Var, qy qyVar) {
        if (qyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(ab1Var.currentAccount).clearQueryTime();
        qyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(qy qyVar) {
        if (f32093b == null) {
            ?? e3Var = new org.telegram.ui.ActionBar.e3(qyVar.getParentActivity(), false);
            Activity parentActivity = qyVar.getParentActivity();
            LinearLayout e = org.telegram.messenger.f0.e(parentActivity, 1);
            org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(parentActivity, e3Var.currentAccount);
            jx0Var.setStickerNum(7);
            jx0Var.getImageReceiver().setAutoRepeat(1);
            e.addView(jx0Var, w7.y5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.h6.f19165j5;
            org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e.addView(textView, w7.y5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(qyVar.getMessagesStorage().getDatabaseSize()))));
            e.addView(textView2, w7.y5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w02, k10, k10));
            e.addView(textView3, w7.y5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new ny0(8, e3Var, qyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e);
            e3Var.setCustomView(scrollView);
            f32093b = e3Var;
            e3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f32093b = null;
    }
}
