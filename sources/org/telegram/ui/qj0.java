package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
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
public final class qj0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final pj0 f41812b;
    public final org.telegram.ui.Components.pi0 f41813c;
    public Utilities.Callback d;

    public qj0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        int i9;
        this.d = callback;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f41813c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.silent_unmute, 46, 46, null);
        imageView.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(dp, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        frameLayout.addView((View) imageView, g7.e6.e(72, 72, 17));
        pj0 pj0Var = new pj0(context);
        this.f41812b = pj0Var;
        frameLayout.addView(pj0Var, g7.e6.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        pj0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final qj0 f41177b;

            {
                this.f41177b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.pi0 pi0Var = this.f41177b.f41813c;
                        if (!pi0Var.b()) {
                            pi0Var.setProgress(0.0f);
                            pi0Var.d();
                            return;
                        }
                        return;
                    default:
                        qj0 qj0Var = this.f41177b;
                        Utilities.Callback callback2 = qj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            qj0Var.d = null;
                        }
                        qj0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(frameLayout, g7.e6.n(-1, 110));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.j2.c(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        f10.addView(textView, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.j2.c(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        f10.addView(textView2, g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), g7.e6.n(-1, -2));
        f10.addView(new dh.g(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), g7.e6.n(-1, -2));
        setCustomView(f10);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
        TextView textView3 = new TextView(context);
        if (z10) {
            i9 = R.string.NotificationsPermissionSettings;
        } else {
            i9 = R.string.NotificationsPermissionContinue;
        }
        textView3.setText(LocaleController.getString(i9));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final qj0 f41177b;

            {
                this.f41177b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.pi0 pi0Var = this.f41177b.f41813c;
                        if (!pi0Var.b()) {
                            pi0Var.setProgress(0.0f);
                            pi0Var.d();
                            return;
                        }
                        return;
                    default:
                        qj0 qj0Var = this.f41177b;
                        Utilities.Callback callback2 = qj0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            qj0Var.d = null;
                        }
                        qj0Var.dismiss();
                        return;
                }
            }
        });
        f10.addView(textView3, g7.e6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i12 = 0; i12 < 4; i12++) {
            try {
                NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    public static void m() {
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

    public static boolean n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                    if (messagesStorage != null) {
                        i11 = messagesStorage.getMainUnreadCount() + i11;
                    }
                }
                if (this.f41812b.a(i11)) {
                    org.telegram.ui.Components.pi0 pi0Var = this.f41813c;
                    if (!pi0Var.b()) {
                        pi0Var.setProgress(0.0f);
                        pi0Var.d();
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
            m();
        }
        for (int i9 = 0; i9 < 4; i9++) {
            try {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.updateInterfaces);
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
