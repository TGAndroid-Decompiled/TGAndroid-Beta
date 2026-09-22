package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class hb1 extends org.telegram.ui.ActionBar.f3 {
    public static hb1 f34214b;

    public static void m(hb1 hb1Var, uy uyVar) {
        if (uyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(hb1Var.currentAccount).clearQueryTime();
        uyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void n(uy uyVar) {
        if (f34214b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(uyVar.getParentActivity(), false);
            Activity parentActivity = uyVar.getParentActivity();
            LinearLayout f7 = org.telegram.messenger.y0.f(parentActivity, 1);
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(parentActivity, f3Var.currentAccount);
            zw0Var.setStickerNum(7);
            zw0Var.getImageReceiver().setAutoRepeat(1);
            f7.addView(zw0Var, w7.x5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.i6.f18940j5;
            org.telegram.messenger.y0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, i10, false), 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            f7.addView(textView, w7.x5.d(-1, -2.0f, 0, 21.0f, 30.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(uyVar.getMessagesStorage().getDatabaseSize()))));
            f7.addView(textView2, w7.x5.d(-1, -2.0f, 0, 21.0f, 15.0f, 21.0f, 16.0f));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, w02, k10, k10));
            f7.addView(textView3, w7.x5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new wy0(8, f3Var, uyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(f7);
            f3Var.setCustomView(scrollView);
            f34214b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f34214b = null;
    }
}
