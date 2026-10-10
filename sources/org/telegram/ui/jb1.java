package org.telegram.ui;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class jb1 extends org.telegram.ui.ActionBar.f3 {
    public static jb1 f38948b;

    public static void o(jb1 jb1Var, ty tyVar) {
        if (tyVar.getParentActivity() == null) {
            return;
        }
        MessagesController.getInstance(jb1Var.currentAccount).clearQueryTime();
        tyVar.getMessagesStorage().clearLocalDatabase();
    }

    public static void p(ty tyVar) {
        if (f38948b == null) {
            ?? f3Var = new org.telegram.ui.ActionBar.f3(tyVar.getParentActivity(), false);
            Activity parentActivity = tyVar.getParentActivity();
            LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
            org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(parentActivity, f3Var.currentAccount);
            cy0Var.setStickerNum(7);
            cy0Var.getImageReceiver().setAutoRepeat(1);
            e7.addView(cy0Var, w7.x5.t(144, 144, 1, 0, 16, 0, 0));
            TextView textView = new TextView(parentActivity);
            textView.setGravity(8388611);
            int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
            org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.SuggestClearDatabaseTitle));
            e7.addView(textView, w7.x5.a(-2.0f, 21.0f, 30.0f, 21.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(parentActivity);
            textView2.setGravity(8388611);
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestClearDatabaseMessage", R.string.SuggestClearDatabaseMessage, AndroidUtilities.formatFileSize(tyVar.getMessagesStorage().getDatabaseSize()))));
            e7.addView(textView2, w7.x5.a(-2.0f, 21.0f, 15.0f, 21.0f, 16.0f, -1, 0));
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.ClearLocalDatabase));
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            int dp = AndroidUtilities.dp(6.0f);
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false), 120);
            textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x02, k10, k10));
            e7.addView(textView3, w7.x5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 0));
            textView3.setOnClickListener(new vy0(8, f3Var, tyVar));
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(e7);
            f3Var.setCustomView(scrollView);
            f38948b = f3Var;
            f3Var.show();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        f38948b = null;
    }
}
