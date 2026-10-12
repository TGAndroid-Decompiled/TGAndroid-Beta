package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class lk0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final kk0 f38036b;
    public final org.telegram.ui.Components.bk0 f38037c;
    public Utilities.Callback d;

    public lk0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        int i10;
        this.d = callback;
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f38037c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.silent_unmute, 46, 46, null);
        imageView.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        frameLayout.addView((View) imageView, w7.a6.e(72, 72, 17));
        kk0 kk0Var = new kk0(context);
        this.f38036b = kk0Var;
        frameLayout.addView(kk0Var, w7.a6.a(32.0f, 29.0f, 16.0f, 0.0f, 0.0f, 64, 49));
        kk0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final lk0 f37403b;

            {
                this.f37403b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.bk0 bk0Var = this.f37403b.f38037c;
                        if (!bk0Var.b()) {
                            bk0Var.setProgress(0.0f);
                            bk0Var.d();
                            return;
                        }
                        return;
                    default:
                        lk0 lk0Var = this.f37403b;
                        Utilities.Callback callback2 = lk0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            lk0Var.d = null;
                        }
                        lk0Var.dismiss();
                        return;
                }
            }
        });
        e.addView(frameLayout, w7.a6.n(-1, 110));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.g6.f20007j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.d0.c(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        e.addView(textView, w7.a6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.d0.c(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        e.addView(textView2, w7.a6.n(-1, -2));
        e.addView(new bi.i5(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), w7.a6.n(-1, -2));
        e.addView(new bi.i5(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), w7.a6.n(-1, -2));
        e.addView(new bi.i5(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), w7.a6.n(-1, -2));
        setCustomView(e);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5));
        TextView textView3 = new TextView(context);
        if (z10) {
            i10 = R.string.NotificationsPermissionSettings;
        } else {
            i10 = R.string.NotificationsPermissionContinue;
        }
        textView3.setText(LocaleController.getString(i10));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final lk0 f37403b;

            {
                this.f37403b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.bk0 bk0Var = this.f37403b.f38037c;
                        if (!bk0Var.b()) {
                            bk0Var.setProgress(0.0f);
                            bk0Var.d();
                            return;
                        }
                        return;
                    default:
                        lk0 lk0Var = this.f37403b;
                        Utilities.Callback callback2 = lk0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            lk0Var.d = null;
                        }
                        lk0Var.dismiss();
                        return;
                }
            }
        });
        e.addView(textView3, w7.a6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i13 = 0; i13 < 4; i13++) {
            try {
                NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    public static void n() {
        long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j10;
        long j11 = 259200000;
        if (j10 >= 259200000) {
            j11 = 604800000;
            if (j10 >= 604800000) {
                j11 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j11).apply();
    }

    public static boolean o(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j10 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
            if (j10 != -2) {
                if (j10 < 0 || System.currentTimeMillis() >= j10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                    if (messagesStorage != null) {
                        i12 = messagesStorage.getMainUnreadCount() + i12;
                    }
                }
                if (this.f38036b.a(i12)) {
                    org.telegram.ui.Components.bk0 bk0Var = this.f38037c;
                    if (!bk0Var.b()) {
                        bk0Var.setProgress(0.0f);
                        bk0Var.d();
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Utilities.Callback callback = this.d;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.d = null;
            n();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
