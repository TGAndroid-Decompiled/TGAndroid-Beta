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
public final class hk0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final gk0 f33404b;
    public final org.telegram.ui.Components.kj0 f33405c;
    public Utilities.Callback d;

    public hk0(Context context, boolean z10, Utilities.Callback callback) {
        super(context, false);
        int i10;
        this.d = callback;
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f33405c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.silent_unmute, 46, 46, null);
        imageView.d();
        int dp = AndroidUtilities.dp(72.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(dp, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        frameLayout.addView((View) imageView, w7.a6.e(72, 72, 17));
        gk0 gk0Var = new gk0(context);
        this.f33404b = gk0Var;
        frameLayout.addView(gk0Var, w7.a6.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        gk0Var.a(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hk0 f32856b;

            {
                this.f32856b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.kj0 kj0Var = this.f32856b.f33405c;
                        if (!kj0Var.b()) {
                            kj0Var.setProgress(0.0f);
                            kj0Var.d();
                            return;
                        }
                        return;
                    default:
                        hk0 hk0Var = this.f32856b;
                        Utilities.Callback callback2 = hk0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            hk0Var.d = null;
                        }
                        hk0Var.dismiss();
                        return;
                }
            }
        });
        f7.addView(frameLayout, w7.a6.n(-1, 110));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(org.telegram.ui.Cells.r6.b(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        f7.addView(textView, w7.a6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(org.telegram.ui.Cells.r6.b(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        f7.addView(textView2, w7.a6.n(-1, -2));
        f7.addView(new bi.l4(context, LocaleController.getString(R.string.NotificationsPermissionAlert1), R.drawable.msg_message_s), w7.a6.n(-1, -2));
        f7.addView(new bi.l4(context, LocaleController.getString(R.string.NotificationsPermissionAlert2), R.drawable.msg_members_list2), w7.a6.n(-1, -2));
        f7.addView(new bi.l4(context, LocaleController.getString(R.string.NotificationsPermissionAlert3), R.drawable.msg_customize_s), w7.a6.n(-1, -2));
        setCustomView(f7);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
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
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        textView3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final hk0 f32856b;

            {
                this.f32856b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.kj0 kj0Var = this.f32856b.f33405c;
                        if (!kj0Var.b()) {
                            kj0Var.setProgress(0.0f);
                            kj0Var.d();
                            return;
                        }
                        return;
                    default:
                        hk0 hk0Var = this.f32856b;
                        Utilities.Callback callback2 = hk0Var.d;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            hk0Var.d = null;
                        }
                        hk0Var.dismiss();
                        return;
                }
            }
        });
        f7.addView(textView3, w7.a6.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i13 = 0; i13 < 4; i13++) {
            try {
                NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    public static void m() {
        long j3 = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j3;
        long j10 = 259200000;
        if (j3 >= 259200000) {
            j10 = 604800000;
            if (j3 >= 604800000) {
                j10 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j10).apply();
    }

    public static boolean n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            long j3 = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
            if (j3 != -2) {
                if (j3 < 0 || System.currentTimeMillis() >= j3) {
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
                if (this.f33404b.a(i12)) {
                    org.telegram.ui.Components.kj0 kj0Var = this.f33405c;
                    if (!kj0Var.b()) {
                        kj0Var.setProgress(0.0f);
                        kj0Var.d();
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
