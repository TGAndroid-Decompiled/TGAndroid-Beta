package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.di1;
public abstract class g5 {
    public static final Pattern f26609a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, di1 di1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ai.l2(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.x5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        alertDialog$Builder.f20378a.V = frameLayout;
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ai.k(8, activity, z10));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.f20427j0 = true;
        b2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), di1Var);
        alertDialog$Builder.f20378a.O0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new h1(launchActivity, 1));
        return alertDialog$Builder.f20378a;
    }

    public static org.telegram.ui.ActionBar.b2 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f20378a;
    }

    public static org.telegram.ui.ActionBar.b2 D(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        int x02;
        int i10;
        int i11;
        int x03;
        int x04;
        int x05;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i12 = org.telegram.ui.ActionBar.i6.f20909j5;
        if (e6Var != null) {
            x02 = e6Var.c0(i12);
        } else {
            x02 = org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        }
        textView.setTextColor(x02);
        textView.setTextSize(1, 16.0f);
        int i13 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (LocaleController.isRTL) {
            i13 = 5;
        }
        int i14 = i13 | 48;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        e7.addView(textView, w7.x5.t(-2, -2, i14, 24, i11, 24, 8));
        for (int i15 = 0; i15 < 4; i15++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.d = 42;
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i15));
            int i16 = org.telegram.ui.ActionBar.i6.f20858g7;
            if (e6Var != null) {
                x04 = e6Var.c0(i16);
            } else {
                x04 = org.telegram.ui.ActionBar.i6.x0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.i6.E5;
            if (e6Var != null) {
                x05 = e6Var.c0(i17);
            } else {
                x05 = org.telegram.ui.ActionBar.i6.x0(null, i17, false);
            }
            l6Var.a(x04, x05);
            String str = strArr[i15];
            if (iArr[0] == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(str, z11);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new q0(iArr, e7));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (e6Var != null) {
                x03 = e6Var.c0(org.telegram.ui.ActionBar.i6.L5);
            } else {
                x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false);
            }
            b2Var.f20415b0 = new or0(activity, 0);
            b2Var.f20418c0 = x03;
        }
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new org.telegram.ui.o(22, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.f3 E(final long j3, final long j10, final org.telegram.ui.ActionBar.n2 n2Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) n2Var.getParentActivity(), e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.Notifications);
        f3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11;
                if (i10 == 0) {
                    i11 = 0;
                } else {
                    int i12 = 1;
                    if (i10 != 1) {
                        i12 = 2;
                        if (i10 != 2) {
                            i12 = 3;
                        }
                    }
                    i11 = i12;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j3, j10, i11);
                org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                if (ad.a(n2Var2)) {
                    ad.z(n2Var2, i11, 0, e6Var).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        return f3Var;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.e6 e6Var, f5 f5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
        if (e6Var != null) {
            x02 = e6Var.c0(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.i6.f20872h5;
        if (e6Var != null) {
            x03 = e6Var.c0(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.c0(i12);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.c0(i13);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.c0(i14);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.c0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.f20892i6;
        if (e6Var != null) {
            e6Var.c0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.Sh;
        if (e6Var != null) {
            x04 = e6Var.c0(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.i6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.Oh;
        if (e6Var != null) {
            x05 = e6Var.c0(i18);
        } else {
            x05 = org.telegram.ui.ActionBar.i6.x0(null, i18, false);
        }
        int i19 = x05;
        if (e6Var != null) {
            x06 = e6Var.c0(org.telegram.ui.ActionBar.i6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        }
        int i20 = x06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, e6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(x02);
        p4Var.setValue(0);
        p4Var.setFormatter(new g1(0, iArr));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ai.q4 q4Var = new ai.q4(context, 19);
        linearLayout.addView(p4Var, w7.x5.l(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.nr(15));
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(x04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, i19, i20, i20));
        q4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        l4Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        q4Var.setOnClickListener(new ai.p5(iArr, p4Var, f5Var, a3Var, 6));
        a3Var.b(l4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        f3Var.setBackgroundColor(x03);
        f3Var.fixNavigationBar(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20378a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.i6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.i6.x0(null, i10, false), hashMap);
        alertDialog$Builder.f20378a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f20378a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 H(Activity activity, long j3, final long j10, int i10, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        boolean z10;
        final long j11 = j3;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j11 != 0) {
            int i12 = notificationsSettings.getInt("priority_" + j11, 3);
            iArr[0] = i12;
            if (i12 == 3) {
                iArr[0] = 0;
            } else if (i12 == 4) {
                iArr[0] = 1;
            } else if (i12 == 5) {
                iArr[0] = 2;
            } else if (i12 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i11 == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i11 == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i11 == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i11 == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i11 == 4 || i11 == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i13 = iArr[0];
            if (i13 == 4) {
                iArr[0] = 0;
            } else if (i13 == 5) {
                iArr[0] = 1;
            } else if (i13 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            l6Var.a(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20858g7, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E5, e6Var));
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i15;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i16 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j11;
                    if (j12 != 0) {
                        int i17 = iArr2[0];
                        if (i17 == 0) {
                            i16 = 3;
                        } else if (i17 == 1) {
                            i16 = 4;
                        } else if (i17 == 2) {
                            i16 = 5;
                        } else if (i17 != 3) {
                            i16 = 1;
                        }
                        edit.putInt("priority_" + j12, i16);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j10);
                    } else {
                        int i18 = iArr2[0];
                        if (i18 == 0) {
                            i15 = 4;
                        } else if (i18 == 1) {
                            i15 = 5;
                        } else if (i18 == 2) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                        int i19 = i11;
                        SharedPreferences sharedPreferences = notificationsSettings;
                        if (i19 == 1) {
                            edit.putInt("priority_messages", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_messages", 1);
                        } else if (i19 == 0) {
                            edit.putInt("priority_group", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_group", 1);
                        } else if (i19 == 2) {
                            edit.putInt("priority_channel", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_channel", 1);
                        } else if (i19 == 3) {
                            edit.putInt("priority_stories", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_stories", 1);
                        } else if (i19 == 4 || i19 == 5) {
                            edit.putInt("priority_react", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_react", 1);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i19);
                    }
                    edit.commit();
                    alertDialog$Builder.f20378a.L0.run();
                    runnable.run();
                }
            });
            i14++;
            j11 = j3;
            i11 = i10;
            z11 = true;
        }
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20378a;
    }

    public static void I(int i10, Activity activity, long j3, TLRPC.Photo photo, ai.d dVar) {
        if (activity != null) {
            b3 b3Var = new b3(i10, j3, photo, activity, dVar);
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (org.telegram.ui.ActionBar.e6) dVar, true);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            f3Var.bigTitle = true;
            c3 c3Var = new c3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, dVar, b3Var, 0);
            f3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            f3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            f3Var.onClickListener = c3Var;
            f3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.a3 J(final Context context, final long j3, long j10, int i10, boolean z10, final f5 f5Var, Runnable runnable, e5 e5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        int[] iArr;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        ?? r82;
        boolean[] zArr;
        vd0 vd0Var;
        long j11;
        int i11;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i12;
        int i13;
        char c10;
        int i14;
        int[] iArr2;
        String[] strArr;
        final Calendar calendar;
        int i15;
        int[] iArr3;
        float f7;
        int[] iArr4;
        FrameLayout frameLayout5;
        String[] strArr2;
        FrameLayout frameLayout6;
        int i16;
        View view;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        int[] iArr5 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        vd0 vd0Var2 = new vd0(context, e6Var);
        int i17 = e5Var.f25905a;
        int i18 = e5Var.f25907c;
        int i19 = e5Var.f25906b;
        vd0Var2.setTextColor(i17);
        vd0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        vd0Var2.setItemCount(5);
        final ?? vd0Var3 = new vd0(context, e6Var);
        vd0Var3.setWrapSelectorWheel(true);
        vd0Var3.setAllItemsCount(24);
        vd0Var3.setItemCount(5);
        vd0Var3.setTextColor(i17);
        vd0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? vd0Var4 = new vd0(context, e6Var);
        vd0Var4.setWrapSelectorWheel(true);
        vd0Var4.setAllItemsCount(60);
        vd0Var4.setItemCount(5);
        vd0Var4.setTextColor(i17);
        vd0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout7 = new FrameLayout(context);
        ?? y3Var = new y3(context, vd0Var2, vd0Var3, vd0Var4, 0);
        y3Var.setClipToPadding(false);
        y3Var.setClipChildren(false);
        y3Var.setOrientation(1);
        frameLayout7.addView((View) y3Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout7.addView(frameLayout8, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
        FrameLayout frameLayout9 = new FrameLayout(context);
        y3Var.addView(frameLayout9, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            frameLayout = frameLayout8;
            textView.setText((CharSequence) null);
        } else {
            frameLayout = frameLayout8;
            if (j3 == clientUserId) {
                textView.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        }
        org.telegram.messenger.q.m(20.0f, i17, 1, textView);
        frameLayout9.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        boolean[] zArr2 = {true};
        if (DialogObject.isUserDialog(j3) && j3 != clientUserId && (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3))) != null && !user.bot && (userStatus = user.status) != null && userStatus.expires > 0) {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout7;
            iArr = iArr5;
            frameLayout3 = frameLayout9;
            r82 = 0;
            zArr = zArr2;
            frameLayout4 = null;
            vd0Var = vd0Var2;
            frameLayout2 = frameLayout;
            j11 = clientUserId;
            viewGroup2 = y3Var;
            i11 = -1;
            v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, e5Var.f25905a, false, e6Var);
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i18, 1, -1));
            frameLayout3.addView(v0Var, w7.x5.a(40.0f, 0.0f, 8.0f, 5.0f, 0.0f, 40, 53));
            v0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            viewGroup = frameLayout7;
            iArr = iArr5;
            frameLayout2 = frameLayout;
            frameLayout3 = frameLayout9;
            frameLayout4 = null;
            r82 = 0;
            zArr = zArr2;
            vd0Var = vd0Var2;
            j11 = clientUserId;
            i11 = -1;
            viewGroup2 = y3Var;
            v0Var = null;
        }
        if (v0Var != null) {
            v0Var.setOnClickListener(new org.telegram.ui.sf(11, v0Var, e5Var));
            v0Var.setDelegate(new ai.r5(f5Var, zArr, a3Var, 19));
        }
        ?? imageView = new ImageView(context);
        final dk0 dk0Var = new dk0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        dk0Var.J(true);
        dk0Var.h = true;
        dk0Var.start();
        dk0Var.M(40);
        dk0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(dk0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(i18, 1, i11));
        if (v0Var != null) {
            i12 = 42;
        } else {
            i12 = r82;
        }
        frameLayout3.addView(imageView, w7.x5.a(40.0f, 0.0f, 8.0f, i12 + 8, 0.0f, 40, 53));
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final ai.q4 q4Var = new ai.q4(context, 14);
        final vd0 vd0Var5 = vd0Var;
        linearLayout.addView(vd0Var5, w7.x5.l(0.5f, r82, 270));
        vd0Var5.setMinValue(r82);
        vd0Var5.setMaxValue(365);
        vd0Var5.setWrapSelectorWheel(r82);
        vd0Var5.setFormatter(new f2(5));
        final org.telegram.ui.ActionBar.v0 v0Var2 = v0Var;
        ViewGroup viewGroup3 = viewGroup2;
        final long j12 = j11;
        td0 td0Var = new td0() {
            @Override
            public final void r(vd0 vd0Var6, int i20) {
                int i21;
                if (j12 == j3) {
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                g5.f(ai.q4.this, null, 0L, 0L, i21, vd0Var5, vd0Var3, vd0Var4);
            }
        };
        vd0Var5.setOnValueChangedListener(td0Var);
        vd0Var3.setMinValue(0);
        vd0Var3.setMaxValue(23);
        final boolean[] zArr3 = zArr;
        linearLayout.addView(vd0Var3, w7.x5.l(0.2f, 0, 270));
        vd0Var3.setFormatter(new f2(6));
        vd0Var3.setOnValueChangedListener(td0Var);
        vd0Var4.setMinValue(0);
        vd0Var4.setMaxValue(59);
        vd0Var4.setValue(0);
        vd0Var4.setFormatter(new f2(7));
        linearLayout.addView(vd0Var4, w7.x5.l(0.3f, 0, 270));
        vd0Var4.setOnValueChangedListener(td0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar2.getTimeInMillis()) / 86400000);
            calendar2.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                vd0Var4.setValue(calendar2.get(12));
                vd0Var3.setValue(calendar2.get(11));
                vd0Var5.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        if (j12 == j3) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        f(q4Var, null, 0L, 0L, i13, vd0Var5, vd0Var3, vd0Var4);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i14 = 10;
            iArr2 = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i14 = 10;
            iArr2 = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[i14];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[8] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[c10] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[]{LocaleController.getString(R.string.MessageScheduledRepeatOptionNever), LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily), LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly), LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly)};
        }
        if (!z10) {
            FrameLayout frameLayout10 = new FrameLayout(context);
            i15 = i19;
            int v = org.telegram.ui.ActionBar.i6.v(i15, org.telegram.ui.ActionBar.i6.m1(0.075f, i17));
            f7 = 14.0f;
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.1f, i17);
            ?? textView2 = new TextView(context);
            calendar = calendar2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i17);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v9 = org.telegram.ui.ActionBar.i6.v(v, m12);
            textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, v, v9, v9));
            textView2.setGravity(17);
            iArr3 = iArr;
            ?? n5Var = new org.telegram.ui.ActionBar.n5(iArr2, iArr3, strArr, (TextView) textView2);
            n5Var.run();
            frameLayout10.addView((View) textView2, w7.x5.a(28.0f, 32.0f, 4.0f, 32.0f, 5.0f, -2, 1));
            viewGroup3.addView(frameLayout10, w7.x5.n(-1, -2));
            frameLayout4 = n5Var;
            frameLayout5 = textView2;
            iArr4 = iArr2;
            strArr2 = strArr;
            frameLayout6 = frameLayout10;
        } else {
            calendar = calendar2;
            i15 = i19;
            iArr3 = iArr;
            f7 = 14.0f;
            iArr4 = iArr2;
            frameLayout5 = frameLayout4;
            strArr2 = strArr;
            frameLayout6 = frameLayout5;
        }
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(e5Var.f25910g);
        q4Var.setTextSize(1, f7);
        q4Var.setTypeface(AndroidUtilities.bold());
        q4Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, e5Var.h));
        viewGroup3.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        int i20 = i15;
        final int[] iArr6 = iArr3;
        q4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i21;
                Runnable runnable2;
                zArr4[0] = false;
                if (j12 == j3) {
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                vd0 vd0Var6 = vd0Var5;
                w3 w3Var = vd0Var3;
                x3 x3Var = vd0Var4;
                boolean f10 = g5.f(null, null, 0L, 0L, i21, vd0Var6, w3Var, x3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, vd0Var6.getValue());
                calendar3.set(11, w3Var.getValue());
                calendar3.set(12, x3Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                boolean z11 = zArr3[0];
                f5Var.J((int) (calendar3.getTimeInMillis() / 1000), iArr6[0], z11);
                runnable2 = a3Var.f20384a.dismissRunnable;
                runnable2.run();
            }
        });
        a3Var.b(viewGroup);
        final org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        f3Var.setOnDismissListener(new p2(runnable, zArr4));
        f3Var.setBackgroundColor(i20);
        f3Var.fixNavigationBar(i20);
        if (frameLayout5 != null) {
            i16 = 1;
            view = imageView;
            frameLayout5.setOnClickListener(new a2(frameLayout2, e6Var, f3Var, frameLayout6, iArr4, strArr2, iArr3, (org.telegram.ui.ActionBar.n5) frameLayout4));
        } else {
            i16 = 1;
            view = imageView;
        }
        final ci.d4[] d4VarArr = new ci.d4[i16];
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i21;
                String string;
                int i22;
                int i23;
                int i24;
                int i25;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                dk0 dk0Var2 = dk0Var;
                if (!z11) {
                    if (dk0Var2.f25726a0 >= 40) {
                        dk0Var2.M(0);
                    }
                    dk0Var2.P(40);
                    dk0Var2.start();
                } else {
                    if (dk0Var2.f25726a0 < 40) {
                        dk0Var2.M(40);
                    }
                    dk0Var2.P(80);
                    dk0Var2.start();
                }
                ci.d4[] d4VarArr2 = d4VarArr;
                ci.d4 d4Var = d4VarArr2[0];
                if (d4Var != null) {
                    d4Var.e(true);
                    d4VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j14 = j3;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j14));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j14));
                ci.d4 d4Var2 = new ci.d4(context, 3);
                d4VarArr2[0] = d4Var2;
                d4Var2.r();
                d4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                d4Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int m13 = org.telegram.ui.ActionBar.i6.m1(0.25f, -16777216);
                d4Var2.f4915i0 = dp2;
                d4Var2.f4916j0 = dp3;
                d4Var2.f4917k0 = m13;
                d4Var2.F.setShadowLayer(dp2, 0.0f, dp3, m13);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i25 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i25 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i25);
                } else if (chat == null && user2 != null) {
                    if (j14 == j12) {
                        if (zArr5[0]) {
                            i23 = R.string.ScheduleNotifyOnSelf;
                        } else {
                            i23 = R.string.ScheduleNotifyOffSelf;
                        }
                        string = LocaleController.getString(i23);
                    } else {
                        if (zArr5[0]) {
                            i22 = R.string.ScheduleNotifyOnChat;
                        } else {
                            i22 = R.string.ScheduleNotifyOffChat;
                        }
                        string = LocaleController.formatString(i22, UserObject.getForcedFirstName(user2));
                    }
                } else {
                    if (zArr5[0]) {
                        i21 = R.string.ScheduleNotifyOnGroup;
                    } else {
                        i21 = R.string.ScheduleNotifyOffGroup;
                    }
                    string = LocaleController.getString(i21);
                }
                d4Var2.s(string);
                d4Var2.d = 5000L;
                if (v0Var2 != null) {
                    i24 = 42;
                } else {
                    i24 = -8;
                }
                d4Var2.l(1.0f, -(i24 + 20));
                d4Var2.f4918l0 = new rg(d4Var2, 2);
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                f3Var2.getContainerView().setClipToPadding(false);
                f3Var2.getContainerView().setClipChildren(false);
                f3Var2.getContainerView().addView(d4Var2, w7.x5.a(200.0f, 0.0f, -194.0f, 0.0f, 0.0f, -1, 48));
                d4Var2.u();
            }
        });
        return a3Var;
    }

    public static void K(Context context, long j3, f5 f5Var) {
        J(context, j3, -1L, 0, false, f5Var, null, new e5(null), null);
    }

    public static void L(Context context, long j3, f5 f5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        J(context, j3, -1L, 0, false, f5Var, null, new e5(e6Var), e6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = str;
        b2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 O(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = str;
        b2Var.T = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20378a;
    }

    public static org.telegram.ui.ActionBar.n1 P(org.telegram.ui.ActionBar.n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (n2Var != null && view != null) {
            org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            n1Var.f21419e = true;
            n1Var.f21418c = 220;
            n1Var.setOutsideTouchable(true);
            n1Var.setClippingEnabled(true);
            n1Var.setAnimationStyle(R.style.PopupContextAnimation);
            n1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            n1Var.setInputMethodMode(2);
            n1Var.getContentView().setFocusableInTouchMode(true);
            float f11 = 0.0f;
            View view2 = view;
            float f12 = 0.0f;
            while (view2 != view.getRootView()) {
                f11 += view2.getX();
                f12 += view2.getY();
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            n1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            n1Var.b();
            return n1Var;
        }
        return null;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.e6 e6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = str6;
        b2Var.T = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.i6.f20909j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xh, e6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new hg.q(editTextBoldCursor, i10, stringCallback, b2VarArr, view2, 1));
        editTextBoldCursor.addTextChangedListener(new a4(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, w7.x5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20378a.f20411a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new gg.c2(editTextBoldCursor, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.nr(25));
        b2VarArr[0] = alertDialog$Builder.f20378a;
        if (n2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, n2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.f20425h0 = false;
        b2Var2.setOnDismissListener(new ei.t0(editTextBoldCursor, n2Var, findActivity, 2));
        b2VarArr[0].setOnShowListener(new f1(1, editTextBoldCursor));
        b2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, MessagesStorage.StringCallback stringCallback) {
        Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), e6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.a3 S(Context context, long j3, final f5 f5Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        int i16 = org.telegram.ui.ActionBar.i6.f20892i6;
        org.telegram.ui.ActionBar.i6.x0(null, i16, false);
        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        final vd0 vd0Var = new vd0(context, e6Var);
        vd0Var.setTextColor(x02);
        vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        vd0Var.setItemCount(5);
        final ?? vd0Var2 = new vd0(context, e6Var);
        vd0Var2.setWrapSelectorWheel(true);
        vd0Var2.setAllItemsCount(24);
        vd0Var2.setItemCount(5);
        vd0Var2.setTextColor(x02);
        vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? vd0Var3 = new vd0(context, e6Var);
        vd0Var3.setWrapSelectorWheel(true);
        vd0Var3.setAllItemsCount(60);
        vd0Var3.setItemCount(5);
        vd0Var3.setTextColor(x02);
        vd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        y3 y3Var = new y3(context, vd0Var, vd0Var2, vd0Var3, 5);
        y3Var.setOrientation(1);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        y3Var.addView(e7, w7.x5.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i10 == 1) {
            i11 = R.string.SuggestedPostAcceptTitle;
        } else {
            i11 = R.string.PostSuggestionsAddTime;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e7.addView(textView, w7.x5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new bi.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.f21203z6, e6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        e7.addView(textView2, w7.x5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j10 = configTime.get(timeUnit) * 2;
        final long j11 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final ai.q4 q4Var = new ai.q4(context, 20);
        linearLayout.addView(vd0Var, w7.x5.l(0.5f, 0, 270));
        vd0Var.setMinValue(0);
        vd0Var.setMaxValue(365);
        vd0Var.setWrapSelectorWheel(false);
        vd0Var.setFormatter(new i2.w(i17, 8));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        td0 td0Var = new td0() {
            @Override
            public final void r(vd0 vd0Var4, int i18) {
                g5.f(ai.q4.this, null, j10, j11, i12, vd0Var, vd0Var2, vd0Var3);
            }
        };
        vd0Var.setOnValueChangedListener(td0Var);
        vd0Var2.setMinValue(0);
        vd0Var2.setMaxValue(23);
        linearLayout.addView((View) vd0Var2, w7.x5.l(0.2f, 0, 270));
        vd0Var2.setFormatter(new org.telegram.ui.nr(20));
        vd0Var2.setOnValueChangedListener(td0Var);
        vd0Var3.setMinValue(0);
        vd0Var3.setMaxValue(59);
        vd0Var3.setValue(0);
        vd0Var3.setFormatter(new org.telegram.ui.nr(21));
        linearLayout.addView((View) vd0Var3, w7.x5.l(0.3f, 0, 270));
        vd0Var3.setOnValueChangedListener(td0Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j12 = 1000 * j3;
            i13 = x03;
            i14 = i16;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j12);
            if (timeInMillis >= 0) {
                vd0Var3.setValue(calendar.get(12));
                vd0Var2.setValue(calendar.get(11));
                vd0Var.setValue(timeInMillis);
            }
        } else {
            i13 = x03;
            i14 = i16;
        }
        final boolean[] zArr = {true};
        f(q4Var, null, j10, j11, i12, vd0Var, vd0Var2, vd0Var3);
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(x04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        q4Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{8.0f}, x05));
        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i18 = i12;
        q4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j13 = j10;
                long j14 = j11;
                int i19 = i18;
                vd0 vd0Var4 = vd0Var;
                w4 w4Var = vd0Var2;
                x4 x4Var = vd0Var3;
                boolean f7 = g5.f(null, null, j13, j14, i19, vd0Var4, w4Var, x4Var);
                long epochMilli = LocalDate.now().plusDays(vd0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, w4Var.getValue());
                calendar2.set(12, x4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                }
                f5Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = a3Var.f20384a.dismissRunnable;
                runnable.run();
            }
        });
        w7.z5.b(q4Var, 0.02f, 1.2f);
        ai.q4 q4Var2 = new ai.q4(context, 21);
        q4Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var2.setGravity(17);
        if (i10 == 1) {
            i15 = R.string.MessageSuggestionPublishNow;
        } else {
            i15 = R.string.PostSuggestionsAnytime;
        }
        q4Var2.setText(LocaleController.getString(i15));
        q4Var2.setTextColor(x05);
        q4Var2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false);
        int x07 = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        q4Var2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x06, x07, x07));
        y3Var.addView(q4Var2, w7.x5.t(-1, 48, 83, 16, 0, 16, 16));
        q4Var2.setOnClickListener(new ai.d0(zArr, f5Var, a3Var, 12));
        w7.z5.b(q4Var2, 0.02f, 1.2f);
        a3Var.b(y3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        f3Var.setOnDismissListener(new ci.e1(zArr));
        f3Var.setBackgroundColor(i13);
        f3Var.fixNavigationBar(i13);
        return a3Var;
    }

    public static org.telegram.ui.ActionBar.b2 T(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        URLSpan[] uRLSpanArr;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        fa0 fa0Var = new fa0(n2Var.getParentActivity(), n2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(n2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        fa0Var.setText(spannableString);
        fa0Var.setTextSize(1, 16.0f);
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20928k5, e6Var));
        fa0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20946l5, e6Var));
        fa0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        fa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, e6Var);
        alertDialog$Builder.n(fa0Var);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new s2(1, n2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20378a;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.MessageLifetime);
        vd0 vd0Var = new vd0(context, null);
        vd0Var.setMinValue(0);
        vd0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            vd0Var.setValue(i10);
        } else if (i10 == 30) {
            vd0Var.setValue(16);
        } else if (i10 == 60) {
            vd0Var.setValue(17);
        } else if (i10 == 3600) {
            vd0Var.setValue(18);
        } else if (i10 == 86400) {
            vd0Var.setValue(19);
        } else if (i10 == 604800) {
            vd0Var.setValue(20);
        } else if (i10 == 0) {
            vd0Var.setValue(0);
        }
        vd0Var.setFormatter(new f2(11));
        alertDialog$Builder.n(vd0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new org.telegram.ui.o(27, encryptedChat, vd0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.n2 n2Var, int i10, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        String sb2;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21113u5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21131v5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new f2(12));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.q.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.i6.f20909j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new t2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        hg.c.o(9306112, hashMap, "Berry", 14598550, "Brandy");
        hg.c.o(8391495, hashMap, "Cherry", 16744272, "Coral");
        hg.c.o(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        hg.c.o(14725375, hashMap, "Mauve", 16761035, "Pink");
        hg.c.o(16711680, hashMap, "Red", 16711807, "Rose");
        hg.c.o(8406555, hashMap, "Russet", 16720896, "Scarlet");
        hg.c.o(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        hg.c.o(16760576, hashMap, "Amber", 15438707, "Apricot");
        hg.c.o(16508850, hashMap, "Banana", 10601738, "Citrus");
        hg.c.o(11560192, hashMap, "Ginger", 16766720, "Gold");
        hg.c.o(16640272, hashMap, "Lemon", 16753920, "Orange");
        hg.c.o(16770484, hashMap, "Peach", 16739155, "Persimmon");
        hg.c.o(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        hg.c.o(16763004, hashMap, "Topaz", 16776960, "Yellow");
        hg.c.o(3688720, hashMap, "Clover", 8628829, "Cucumber");
        hg.c.o(5294200, hashMap, "Emerald", 11907932, "Olive");
        hg.c.o(65280, hashMap, "Green", 43115, "Jade");
        hg.c.o(2730887, hashMap, "Jungle", 12582656, "Lime");
        hg.c.o(776785, hashMap, "Malachite", 10026904, "Mint");
        hg.c.o(11394989, hashMap, "Moss", 3234721, "Azure");
        hg.c.o(255, hashMap, "Blue", 18347, "Cobalt");
        hg.c.o(5204422, hashMap, "Indigo", 96647, "Lagoon");
        hg.c.o(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        hg.c.o(128, hashMap, "Navy", 3101086, "Sapphire");
        hg.c.o(7788522, hashMap, "Sky", 32896, "Teal");
        hg.c.o(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        hg.c.o(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        hg.c.o(13148872, hashMap, "Lilac", 11894492, "Lavender");
        hg.c.o(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        hg.c.o(6684825, hashMap, "Purple", 14204888, "Thistle");
        hg.c.o(14315734, hashMap, "Orchid", 2361920, "Violet");
        hg.c.o(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        hg.c.o(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        hg.c.o(7365973, hashMap, "Coffee", 7956873, "Rum");
        hg.c.o(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        hg.c.o(12759680, hashMap, "Sand", 8924439, "Sienna");
        hg.c.o(7864585, hashMap, "Maple", 15787660, "Khaki");
        hg.c.o(12088115, hashMap, "Copper", 12144200, "Chestnut");
        hg.c.o(15653316, hashMap, "Almond", 16776656, "Cream");
        hg.c.o(12186367, hashMap, "Diamond", 11109127, "Honey");
        hg.c.o(16777200, hashMap, "Ivory", 15392968, "Pearl");
        hg.c.o(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        hg.c.o(16777215, hashMap, "White", 8421504, "Gray");
        hg.c.o(0, hashMap, "Black", 15266260, "Chrome");
        hg.c.o(3556687, hashMap, "Charcoal", 789277, "Ebony");
        hg.c.o(12632256, hashMap, "Silver", 16119285, "Smoke");
        hg.c.o(2499381, hashMap, "Steel", 5220413, "Apple");
        hg.c.o(8434628, hashMap, "Glacier", 16693933, "Melon");
        hg.c.o(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (g6Var == null) {
            g6Var2 = org.telegram.ui.ActionBar.i6.B0().k(false);
        } else {
            g6Var2 = g6Var;
        }
        if (g6Var2 == null || (i11 = g6Var2.f20659c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.s0())[0];
        }
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int i13 = Integer.MAX_VALUE;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i14 = (red + red2) / 2;
            int i15 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i16 = (green2 * 4 * green2) + ((((i14 + 512) * i15) * i15) >> 8) + ((((767 - i14) * blue2) * blue2) >> 8);
            if (i16 < i13) {
                str = (String) entry.getValue();
                i13 = i16;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            sb2 = a1.g.r((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder j3 = sc.v.j(str, " ");
            j3.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = j3.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        f1 f1Var = new f1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.setOnShowListener(f1Var);
        n2Var.showDialog(b2Var);
        editTextBoldCursor.requestFocus();
        b2Var.d(-1).setOnClickListener(new ai.s0(n2Var, editTextBoldCursor, g6Var, h6Var, b2Var, 9));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        ?? vd0Var = new vd0(activity, null);
        t3 t3Var = new t3(activity, vd0Var);
        t3Var.setOrientation(0);
        t3Var.setWeightSum(1.0f);
        vd0Var.setAllItemsCount(24);
        vd0Var.setItemCount(5);
        vd0Var.setTextColor(x02);
        vd0Var.setGravity(5);
        vd0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? vd0Var2 = new vd0(activity, null);
        vd0Var2.setWrapSelectorWheel(true);
        vd0Var2.setAllItemsCount(60);
        vd0Var2.setItemCount(5);
        vd0Var2.setTextColor(x02);
        vd0Var2.setGravity(3);
        vd0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final k2 k2Var = new k2(i11, i12, (s3) vd0Var, (u3) vd0Var2, i10, t3Var);
        t3Var.addView((View) vd0Var, w7.x5.l(0.5f, 0, 270));
        vd0Var.setFormatter(new f2(3));
        vd0Var.setOnValueChangedListener(new td0() {
            @Override
            public final void r(vd0 vd0Var3, int i13) {
                switch (r2) {
                    case 0:
                        k2Var.run(Boolean.TRUE);
                        return;
                    default:
                        k2Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        t3Var.addView((View) vd0Var2, w7.x5.l(0.5f, 0, 270));
        vd0Var2.setFormatter(new f2(4));
        vd0Var2.setOnValueChangedListener(new td0() {
            @Override
            public final void r(vd0 vd0Var3, int i13) {
                switch (r2) {
                    case 0:
                        k2Var.run(Boolean.TRUE);
                        return;
                    default:
                        k2Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        k2Var.run(Boolean.FALSE);
        v3 v3Var = new v3(activity, vd0Var, vd0Var2);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        v3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        v3Var.addView(t3Var, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ci.d dVar = new ci.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new m2(r1, 0));
        v3Var.addView(dVar, w7.x5.t(-1, 48, 0, 16, 12, 16, 12));
        f3Var.customView = v3Var;
        f3Var.show();
        f3Var.setOnDismissListener(new ei.t0(callback, vd0Var, vd0Var2, 3));
        f3Var.setBackgroundColor(x03);
        f3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
    }

    public static org.telegram.ui.ActionBar.b2 X(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j3 != 0) {
            int i10 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 3) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i11 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = 1;
            } else if (i11 == 1) {
                iArr[0] = 2;
            } else if (i11 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20858g7, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E5, e6Var));
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str3, z10);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j11 = j3;
                    int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    String str4 = str2;
                    if (i13 != 0) {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i14 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i14 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i14 == 3) {
                            edit.putInt(str4, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
                    } else {
                        int i15 = iArr2[0];
                        if (i15 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i15 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i15 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i15 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i15 == 4) {
                            edit.putInt(str4, 4);
                        }
                        if (str4.equals("vibrate_channel")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
                        } else if (str4.equals("vibrate_group")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
                        } else if (str4.equals("vibrate_react")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(4);
                        } else {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
                        }
                    }
                    edit.commit();
                    alertDialog$Builder.f20378a.L0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z11 = true;
        }
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20378a;
    }

    public static org.telegram.ui.ActionBar.b2 Y(Context context, org.telegram.ui.ActionBar.e6 e6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        int i11;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new ca.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.o(21, atomicBoolean, aVar));
        alertDialog$Builder.f20378a.setOnDismissListener(new ei.e0(5, atomicBoolean, aVar));
        return alertDialog$Builder.f20378a;
    }

    public static void Z(int i10, int i11, long j3, Utilities.Callback callback) {
        a0(i10, j3, i11, callback, 0L);
    }

    public static void a(vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3) {
        int i10;
        int i11;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i12 = 1;
        int i13 = calendar.get(1);
        int i14 = calendar.get(2);
        int i15 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        int i17 = calendar.get(2);
        int i18 = calendar.get(5);
        vd0Var3.setMaxValue(i16);
        vd0Var3.setMinValue(i13);
        int value = vd0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        vd0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        vd0Var2.setMinValue(i11);
        int value2 = vd0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        vd0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        vd0Var.setMinValue(i12);
    }

    public static boolean a0(final int i10, final long j3, int i11, Utilities.Callback callback, long j10) {
        org.telegram.ui.ActionBar.e6 dVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        long j11 = i11 * sendPaidMessagesStars;
        yh.m5.y(i10, false).P.put(Long.valueOf(j3), Integer.valueOf(i11));
        if (j11 > 0 && j10 != j11) {
            final long j12 = sendPaidMessagesStars;
            final v2 v2Var = new v2(i10, j11, j3, callback, j12, 0);
            if (j12 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j3, "ask_paid_message_", "_price"), 0L)) {
                v2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    dVar = U.getResourceProvider();
                } else {
                    dVar = null;
                }
            } else {
                dVar = new ai.d();
            }
            org.telegram.ui.ActionBar.e6 e6Var = dVar;
            String shortName = DialogObject.getShortName(i10, j3);
            if (ChatObject.isMonoForum(i10, j3)) {
                shortName = ng.d.h(i10, j3);
            } else if (U instanceof org.telegram.ui.zn) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) U;
                if (znVar.f44826g4 && znVar.a() == j3 && (chat = znVar.f44814f4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f20042id);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = (int) j12;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i12, shortName)));
            spannableStringBuilder.append((CharSequence) " ");
            if (i11 == 1) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i12)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j11)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i11)));
            }
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        int i13 = i10;
                        SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                        long j13 = j3;
                        edit.putLong(org.telegram.ui.Cells.c1.h(j13, "ask_paid_message_", "_price"), j12).apply();
                        yh.m5.y(i13, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(v2Var);
                }
            }, e6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j11));
        return false;
    }

    public static long b(ci.d dVar, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, vd0 vd0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((vd0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (vd0Var2.getValue() - 120) % 12);
        vd0Var.setMinValue(1);
        vd0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = vd0Var.getValue();
        int value3 = vd0Var3.getValue();
        int value4 = vd0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i10 = 0;
            } else if (i11 != value) {
                i10 = 2;
            }
            dVar.setText(LocaleController.getInstance().getFormatterScheduleSend(i10 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.e6 dVar;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        long j3 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j10 = j3;
            long longValue = l4.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l4, Long.valueOf(sendPaidMessagesStars));
            long j11 = j10 + sendPaidMessagesStars;
            boolean z12 = z10;
            yh.m5.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j3 = j11;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j3;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    dVar = U.getResourceProvider();
                } else {
                    dVar = null;
                }
            } else {
                dVar = new ai.d();
            }
            org.telegram.ui.ActionBar.e6 e6Var = dVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            Object[] objArr = new Object[1];
            objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.xq(i10, max, activity, arrayList, hashMap, callback, e6Var), e6Var, true);
            return true;
        }
        callback.run(hashMap);
        return z13;
    }

    public static void c(vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        vd0Var3.setMinValue(i12);
        int value = vd0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        vd0Var2.setMinValue(i10);
        int value2 = vd0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        vd0Var.setMinValue(i11);
    }

    public static boolean c0(int i10, long j3) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j3, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(TextView textView, vd0 vd0Var, f4 f4Var, g4 g4Var) {
        String str;
        String str2;
        int value = vd0Var.getValue();
        int value2 = f4Var.getValue();
        int value3 = g4Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i10 = timeInMillis / 86400;
        int i11 = (timeInMillis % 86400) / 3600;
        int i12 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i10 <= 0) {
            str = "";
        } else {
            str = LocaleController.formatPluralString("Days", i10, new Object[0]);
        }
        if (i11 <= 0) {
            str2 = "";
        } else {
            str2 = LocaleController.formatPluralString("Hours", i11, new Object[0]);
        }
        if (i12 > 0) {
            str3 = LocaleController.formatPluralString("Minutes", i12, new Object[0]);
        }
        textView.setText(LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, str, str2, str3).trim()));
    }

    public static void d0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            String obj = editTextBoldCursor.getText().toString();
            int i10 = org.telegram.ui.ActionBar.i6.f20738a;
            org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            h6Var.f20709b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            h6Var.f20707a = obj;
            org.telegram.ui.ActionBar.i6.f20867h0 = org.telegram.ui.ActionBar.i6.Z0(org.telegram.ui.ActionBar.i6.I.f20720i0);
            h6Var.E = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.i6.s1(h6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(n2Var.getParentActivity(), h6Var);
            b2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(n2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static void e(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty() && chat != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i11);
                i11++;
                TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                if (tL_messages_invitedUsers.updates != null) {
                    for (int i12 = 0; i12 < tL_messages_invitedUsers.updates.users.size(); i12++) {
                        user = tL_messages_invitedUsers.updates.users.get(i12);
                        if (user.f20189id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f20189id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f20189id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new ei.l3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.b2 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.n2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.b2");
    }

    public static boolean f(TextView textView, TextView textView2, long j3, long j10, int i10, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3) {
        long j11;
        int i11;
        long j12;
        int i12;
        int i13;
        int i14;
        long j13;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int i17;
        int i18;
        int i19;
        int value = vd0Var.getValue();
        int value2 = vd0Var2.getValue();
        int value3 = vd0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i20 = calendar.get(1);
        calendar.get(6);
        if (j10 > 0) {
            i11 = i20;
            calendar.setTimeInMillis((j10 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j11 = currentTimeMillis;
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j12 = calendar.getTimeInMillis();
            i13 = 23;
            i14 = 59;
        } else {
            j11 = currentTimeMillis;
            i11 = i20;
            j12 = j10;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i21 = i14;
        if (j3 > 0) {
            j13 = TimeUnit.SECONDS.toMillis(j3);
        } else {
            j13 = 60000;
        }
        long j14 = j13;
        long j15 = j11 + j14;
        calendar.setTimeInMillis(j15);
        int i22 = calendar.get(11);
        int i23 = calendar.get(12);
        long j16 = j12;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        vd0Var.setMinValue(0);
        int i24 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i24 > 0) {
            vd0Var.setMaxValue(i12);
        }
        int value4 = vd0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        vd0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i12) {
                i19 = i13;
            } else {
                i19 = 23;
            }
            vd0Var2.setMaxValue(i19);
        }
        int value5 = vd0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        vd0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i12 && value5 == i13) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            vd0Var3.setMaxValue(i18);
        }
        int value6 = vd0Var3.getValue();
        if (timeInMillis <= j15) {
            calendar.setTimeInMillis(j15);
        } else if (i24 > 0 && timeInMillis > j16) {
            calendar.setTimeInMillis(j16);
        }
        int i25 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i17 = 0;
            } else if (i11 == i25) {
                i17 = 1;
            } else {
                i17 = 2;
            }
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i10 * 3) + i17).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i26 = (int) ((timeInMillis2 - j11) / 1000);
            if (i26 > 86400) {
                z11 = false;
                formatPluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i26 / 86400.0f), new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i26 >= 3600) {
                    formatPluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i26 / 3600.0f), new Object[0]);
                } else if (i26 >= 60) {
                    formatPluralString = LocaleController.formatPluralString("MinutesSchedule", Math.round(i26 / 60.0f), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("SecondsSchedule", i26, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i27 = R.string.VoipChannelScheduleInfo;
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i27, objArr));
            } else {
                z10 = true;
                int i28 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i28, objArr2));
            }
        } else {
            z10 = true;
            z11 = false;
        }
        if (timeInMillis - j11 > j14) {
            return z10;
        }
        return z11;
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, jn jnVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = string;
        b2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Xh, e6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean matches;
                if (i11 != 6) {
                    return false;
                }
                h4 h4Var = h4.this;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = g5.f26609a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, w7.x5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = x91.f32880f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            x91 x91Var = new x91(context, e6Var);
            x91Var.setWebPage(webPage);
            linearLayout.addView(x91Var, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f20411a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.o(25, (Object) editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(2));
        if (jnVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, jnVar));
        }
        b2VarArr[0] = b2Var;
        b2Var.f20425h0 = false;
        b2Var.setOnDismissListener(new b1(editTextBoldCursor, 2));
        b2VarArr[0].setOnShowListener(new j2(0, editTextBoldCursor));
        b2VarArr[0].show();
        TextView textView = (TextView) b2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
        }
    }

    public static boolean g(Context context, int i10, long j3, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j3) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f20042id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f20042id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
                }
                if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                M(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && n2Var != null && n2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            b2Var.R = string;
            String str = tL_error.text;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c10 = 20;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    b2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    b2Var.T = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        b2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    b2Var.T = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    b2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new s2(0, n2Var));
                    break;
                case 6:
                    if (z10) {
                        b2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        b2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    b2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    b2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        b2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        b2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    b2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        b2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    b2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    b2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        b2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    b2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        b2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        b2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        b2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    b2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    b2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    b2Var.T = sb2.toString();
                    break;
            }
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.b2 h(Activity activity, d5 d5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.q1 q1Var = alertDialog$Builder.f20378a.L0;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f22363f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                j9 j9Var = kVar.f22362e;
                j9Var.m(i10, currentUser);
                kVar.f22359a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                y9 y9Var = kVar.f22361c;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.e(currentUser, j9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                e7.addView(kVar, w7.x5.n(-1, 50));
                kVar.setOnClickListener(new ai.d0(b2VarArr, q1Var, d5Var, 13));
            }
        }
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2VarArr[0] = b2Var;
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int dp;
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
        boolean[] zArr = {false};
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        c5 c5Var = new c5(activity, a2VarArr);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.G = 6;
        alertDialog$Builder.n(c5Var);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.E8, e6Var, textView2, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(str);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        c5Var.addView(textView2, w7.x5.a(-2.0f, 24.0f, 8.0f, 24.0f, 0.0f, -1, i12 | 48));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        c5Var.addView(textView, w7.x5.a(-2.0f, 24.0f, 48.0f, 24.0f, 6.0f, -2, i13 | 48));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(activity, 1, e6Var);
            a2VarArr[0] = a2Var;
            a2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 7, AndroidUtilities.dp(12.0f)));
            a2VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            layoutParams.gravity = i14 | 16;
            a2VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            a2VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
            if (LocaleController.isRTL) {
                i15 = AndroidUtilities.dp(4.0f);
            } else {
                i15 = 0;
            }
            int dp2 = AndroidUtilities.dp(12.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            a2Var2.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            c5Var.addView(a2VarArr[0], w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 83));
            a2VarArr[0].setOnClickListener(new t0(5, zArr));
        }
        alertDialog$Builder.k(str2, new d3(0, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            b2Var.X0 = true;
        }
        b2Var.show();
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 i(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f20378a;
    }

    public static void i0(org.telegram.ui.ActionBar.n2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.e6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.i0(org.telegram.ui.ActionBar.n2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.e6):void");
    }

    public static void j(Context context, org.telegram.ui.ActionBar.e6 e6Var, f5 f5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
        if (e6Var != null) {
            x02 = e6Var.c0(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.i6.f20872h5;
        if (e6Var != null) {
            x03 = e6Var.c0(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        }
        int i12 = x03;
        int i13 = org.telegram.ui.ActionBar.i6.Ji;
        if (e6Var != null) {
            e6Var.c0(i13);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.i6.Ni;
        if (e6Var != null) {
            e6Var.c0(i14);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.i6.E8;
        if (e6Var != null) {
            e6Var.c0(i15);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.i6.G8;
        if (e6Var != null) {
            e6Var.c0(i16);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.i6.f20892i6;
        if (e6Var != null) {
            e6Var.c0(i17);
        } else {
            org.telegram.ui.ActionBar.i6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.i6.Sh;
        if (e6Var != null) {
            x04 = e6Var.c0(i18);
        } else {
            x04 = org.telegram.ui.ActionBar.i6.x0(null, i18, false);
        }
        int i19 = x04;
        int i20 = org.telegram.ui.ActionBar.i6.Oh;
        if (e6Var != null) {
            x05 = e6Var.c0(i20);
        } else {
            x05 = org.telegram.ui.ActionBar.i6.x0(null, i20, false);
        }
        int i21 = x05;
        if (e6Var != null) {
            x06 = e6Var.c0(org.telegram.ui.ActionBar.i6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        }
        int i22 = x06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        k4 k4Var = new k4(context, e6Var, iArr);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(16);
        k4Var.setTextColor(x02);
        k4Var.setValue(0);
        k4Var.setFormatter(new g1(1, iArr));
        l4 l4Var = new l4(context, k4Var, 0);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 1);
        linearLayout.addView(k4Var, w7.x5.l(1.0f, 0, 270));
        u3Var.setPadding(0, 0, 0, 0);
        u3Var.setGravity(17);
        u3Var.setTextColor(i19);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        u3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, i21, i22, i22));
        l4Var.addView(u3Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        k4Var.setOnValueChangedListener(new s(u3Var, 10));
        u3Var.setOnClickListener(new ai.p5(iArr, k4Var, f5Var, a3Var, 8));
        a3Var.b(l4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        f3Var.setBackgroundColor(i12);
        f3Var.fixNavigationBar(i12);
    }

    public static void j0(org.telegram.ui.zn znVar, MessageObject messageObject, long j3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.tg tgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (znVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = znVar.getAccountInstance();
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                user = accountInstance.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (i10 < 0) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j3));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, e6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.P0 = false;
                b2Var.N = new b1(tgVar, 0);
                b2Var.R = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(znVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.a2[] a2VarArr = {new org.telegram.ui.Cells.a2(znVar.getParentActivity(), 1, e6Var)};
                a2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                a2VarArr[0].setTag(0);
                a2VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                org.telegram.ui.Cells.a2 a2Var = a2VarArr[0];
                if (LocaleController.isRTL) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                a2Var.setPadding(dp, 0, dp2, 0);
                linearLayout.addView(a2VarArr[0], w7.x5.n(-1, -2));
                a2VarArr[0].setOnClickListener(new c1(a2VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new d1(user, accountInstance, znVar, chat, messageObject, a2VarArr, e6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                znVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder k(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        if (org.telegram.ui.ActionBar.i6.B0().q()) {
            i10 = R.raw.permission_map_dark;
        } else {
            i10 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i10);
        if (org.telegram.ui.ActionBar.i6.B0().q()) {
            i11 = R.raw.permission_pin_dark;
        } else {
            i11 = R.raw.permission_pin;
        }
        String readRes2 = AndroidUtilities.readRes(i11);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.x5.a(82.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, 17));
        y9 y9Var = new y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        y9Var.e(user, new j9(0, user));
        frameLayout.addView(y9Var, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 11.0f, 52, 17));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.V = frameLayout;
        b2Var.O0 = 0.37820512f;
        alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void k0(Context context, int i10, long j3) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, null, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.x5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.x5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false)));
        frameLayout.addView(frameLayout2, w7.x5.a(80.0f, 0.0f, 12.0f, 0.0f, 0.0f, 80, 1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, textView);
        org.telegram.messenger.bi.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        h.setTextSize(1, 14.0f);
        h.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j3))));
        h.setGravity(17);
        e7.addView(h, w7.x5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ci.d dVar = new ci.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        e7.addView(dVar, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = e7;
        dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, i11, j3));
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.a3 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, e6Var);
        a3Var.a();
        vd0 vd0Var = new vd0(context, e6Var);
        vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        vd0Var.setItemCount(5);
        vd0 vd0Var2 = new vd0(context, e6Var);
        vd0Var2.setItemCount(5);
        vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        vd0 vd0Var3 = new vd0(context, e6Var);
        vd0Var3.setItemCount(5);
        vd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        c4 c4Var = new c4(context, vd0Var, vd0Var2, vd0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        z2 z2Var = new z2(vd0Var3, i15, vd0Var, vd0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(vd0Var, w7.x5.l(0.25f, 0, 270));
        vd0Var.setMinValue(1);
        vd0Var.setMaxValue(31);
        vd0Var.setWrapSelectorWheel(false);
        vd0Var.setFormatter(new f2(13));
        s sVar = new s(z2Var, 9);
        vd0Var.setOnScrollListener(sVar);
        vd0Var2.setMinValue(0);
        vd0Var2.setMaxValue(11);
        vd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(vd0Var2, w7.x5.l(0.5f, 0, 270));
        vd0Var2.setFormatter(new f2(14));
        vd0Var2.setOnScrollListener(sVar);
        vd0Var3.setMinValue(calendar.get(1) - 149);
        vd0Var3.setMaxValue(i15);
        vd0Var3.setWrapSelectorWheel(false);
        vd0Var3.setFormatter(new i2.w(i15, 9));
        linearLayout.addView(vd0Var3, w7.x5.l(0.25f, 0, 270));
        vd0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            vd0Var.setValue(tL_birthday.day);
            vd0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                vd0Var3.setValue(tL_birthday.year);
            } else {
                vd0Var3.setValue(i15);
            }
        } else {
            vd0Var.setValue(calendar.get(5));
            vd0Var2.setValue(calendar.get(2));
            vd0Var3.setValue(i15);
        }
        z2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            fa0 fa0Var = new fa0(context, null);
            fa0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            fa0Var.setTextSize(1, 13.0f);
            fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21040q5, e6Var));
            fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
            fa0Var.setGravity(17);
            frameLayout2.addView(fa0Var, w7.x5.e(-2, -2, 17));
            c4Var.addView(frameLayout2, w7.x5.n(-1, -2));
            int i16 = UserConfig.selectedAccount;
            ai.p8 p8Var = new ai.p8(i16, fa0Var, 28);
            p8Var.run();
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new a3(p8Var, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        }
        if (z10) {
            ci.d dVar = new ci.d(context, e6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Cells.sa(vd0Var3, i15, z2Var, 5));
            c4Var.addView(dVar, w7.x5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03));
        w7.z5.b(textView2, 0.02f, 1.2f);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 15;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 16;
        }
        c4Var.addView(textView2, w7.x5.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new ei.m3(vd0Var, vd0Var2, vd0Var3, i15, a3Var, callback));
        if (z11) {
            ci.d dVar2 = new ci.d(context, e6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.e();
            dVar2.setOnClickListener(new org.telegram.ui.sf(14, a3Var, callback));
            c4Var.addView(dVar2, w7.x5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        a3Var.b(c4Var);
        return a3Var;
    }

    public static void l0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        String formatPluralString;
        if (str != null && str.startsWith("FLOOD_WAIT") && n2Var != null && n2Var.getParentActivity() != null) {
            int intValue = Utilities.parseInt((CharSequence) str).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            n2Var.showDialog(b2Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.n2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.m(org.telegram.ui.ActionBar.n2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.addView(new yh.u2(context, tL_starGiftUnique, userOrChat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView, 1, 16.0f);
        org.telegram.messenger.bi.r(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        e7.addView(textView, w7.x5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void n(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Context context = n2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        fa0 fa0Var = new fa0(context, null);
        NotificationCenter.listenEmojiLoading(fa0Var);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        fa0Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fa0Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f20378a.G = 6;
        alertDialog$Builder.n(frameLayout);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(18.0f));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        j5Var.setTextSize(20);
        j5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(user.first_name, false);
        if (user.scam) {
            j5Var.i(org.telegram.ui.ActionBar.i6.f20852g1);
        } else if (user.fake) {
            j5Var.i(org.telegram.ui.ActionBar.i6.f20868h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21206z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A9, false), mode));
            j5Var.i(new fr(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20965m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new u0(user, n2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        er erVar = new er(R.drawable.attach_arrow_right, 0);
        erVar.setTopOffset(1);
        erVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(erVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        int i21 = 76;
        if (z10) {
            i15 = 21;
        } else {
            i15 = 76;
        }
        float f7 = i15;
        if (z10) {
            i16 = 76;
        } else {
            i16 = 21;
        }
        frameLayout.addView(j5Var, w7.x5.a(-2.0f, f7, 0.0f, i16, 0.0f, -1, i20));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i17 = 5;
        } else {
            i17 = 3;
        }
        int i22 = i17 | 48;
        if (z11) {
            i18 = 21;
        } else {
            i18 = 76;
        }
        float f10 = i18;
        if (!z11) {
            i21 = 21;
        }
        frameLayout.addView(textView, w7.x5.a(-2.0f, f10, 24.0f, i21, 0.0f, -1, i22));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(fa0Var, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, i19 | 48));
        if (UserObject.isReplyUser(user)) {
            j9Var.f27608p = 0.8f;
            j9Var.g(12);
            y9Var.h(null, null, j9Var, user);
        } else {
            j9Var.f27608p = 1.0f;
            j9Var.m(n2Var.getCurrentAccount(), user);
            y9Var.e(user, j9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener s0Var = new s0(3, runnable2);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        n2Var.showDialog(b2Var, false, s0Var);
        fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(0, context, b2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.i6.f20909j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, e6Var);
        a2Var.setMultiline(true);
        a2Var.getTextView().getLayoutParams().width = -1;
        a2Var.getTextView().setSingleLine(false);
        a2Var.getTextView().setMaxLines(3);
        a2Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i10 = R.string.BrowserAlwaysOpenExternal;
        } else {
            i10 = R.string.BrowserAlwaysOpenInApp;
        }
        a2Var.e(LocaleController.getString(i10), "", false, false, false);
        a2Var.setOnClickListener(new i1(a2Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(a2Var, w7.x5.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f20378a.f20411a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                        if (b2Var2 != null) {
                            b2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                        if (b2Var3 != null) {
                            b2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                        if (b2Var2 != null) {
                            b2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                        if (b2Var3 != null) {
                            b2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        b2VarArr[0] = alertDialog$Builder.o();
    }

    public static org.telegram.ui.ActionBar.a3 o(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.e6 e6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(activity, e6Var);
        a3Var.a();
        vd0 vd0Var = new vd0(activity, e6Var);
        vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        vd0Var.setItemCount(5);
        vd0 vd0Var2 = new vd0(activity, e6Var);
        vd0Var2.setItemCount(5);
        vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        vd0 vd0Var3 = new vd0(activity, e6Var);
        vd0Var3.setItemCount(5);
        vd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        q4 q4Var = new q4(activity, vd0Var, vd0Var2, vd0Var3);
        q4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        q4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        q4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(vd0Var, w7.x5.l(0.25f, 0, 270));
        vd0Var.setMinValue(1);
        vd0Var.setMaxValue(31);
        vd0Var.setWrapSelectorWheel(false);
        vd0Var.setFormatter(new org.telegram.ui.nr(11));
        l0 l0Var = new l0(vd0Var, vd0Var2, vd0Var3, 0);
        vd0Var.setOnValueChangedListener(l0Var);
        vd0Var2.setMinValue(0);
        vd0Var2.setMaxValue(11);
        vd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(vd0Var2, w7.x5.l(0.5f, 0, 270));
        vd0Var2.setFormatter(new org.telegram.ui.nr(12));
        vd0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        vd0Var3.setMinValue(i10);
        vd0Var3.setMaxValue(i11);
        vd0Var3.setWrapSelectorWheel(false);
        vd0Var3.setFormatter(new org.telegram.ui.nr(13));
        linearLayout.addView(vd0Var3, w7.x5.l(0.25f, 0, 270));
        vd0Var3.setOnValueChangedListener(l0Var);
        vd0Var.setValue(31);
        vd0Var2.setValue(12);
        vd0Var3.setValue(i11);
        a(vd0Var, vd0Var2, vd0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Qh, e6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03));
        q4Var.addView(textView2, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new m0(vd0Var, vd0Var2, vd0Var3, calendar, intCallback, a3Var, 0));
        a3Var.b(q4Var);
        return a3Var;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, of.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        String v;
        LinearLayout linearLayout;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!of.f.f(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                r2 r2Var = new r2(context, str, j3, z11, eVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                b2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.i6.f20909j5;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = x91.f32880f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    x91 x91Var = new x91(context, e6Var);
                    x91Var.setWebPage(webPage);
                    linearLayout.addView(x91Var, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                b2Var.f20411a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(r2Var, 8));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            v = str;
            r2 r2Var2 = new r2(context, str, j3, z11, eVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, e6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
            b2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.i6.f20909j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i102, e6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i102, e6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, w7.x5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = x91.f32880f;
            if (webPage != null) {
                x91 x91Var2 = new x91(context, e6Var);
                x91Var2.setWebPage(webPage);
                linearLayout.addView(x91Var2, w7.x5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            b2Var2.f20411a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(r2Var2, 8));
            hg.c.p(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        Uri parse2 = Uri.parse(str);
        if (j3 == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z15 = true;
        } else {
            z15 = false;
        }
        of.f.r(context, parse2, z14, z11, z15, eVar, null, false, true, false);
    }

    public static void p(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (n2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId() != user.f20189id) {
            n2Var.getCurrentAccount();
            Activity parentActivity = n2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z10) {
                string = LocaleController.getString(R.string.VideoCallAlertTitle);
                formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
            } else {
                string = LocaleController.getString(R.string.CallAlertTitle);
                formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
            }
            TextView textView = new TextView(parentActivity);
            NotificationCenter.listenEmojiLoading(textView);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            j9Var.f27608p = 1.0f;
            j9Var.m(n2Var.getCurrentAccount(), user);
            y9 y9Var = new y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            y9Var.e(user, j9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(string);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            int i17 = 76;
            if (z11) {
                i14 = 21;
            } else {
                i14 = 76;
            }
            float f7 = i14;
            if (!z11) {
                i17 = 21;
            }
            frameLayout.addView(textView2, w7.x5.a(-2.0f, f7, 11.0f, i17, 0.0f, -1, i16));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i15 | 48));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(n2Var, user, z10, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(alertDialog$Builder.f20378a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11) {
        q0(n2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.n2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.e6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.q(org.telegram.ui.ActionBar.n2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.e6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, of.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.e6 e6Var) {
        long j3;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (n2Var instanceof org.telegram.ui.zn) {
                j3 = ((org.telegram.ui.zn) n2Var).f44817f8;
            } else {
                j3 = 0;
            }
            o0(n2Var.getParentActivity(), str, z10, z11, z12, z13, j3, eVar, webPage, e6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (n2Var != null) {
            e6Var = n2Var.getResourceProvider();
        } else {
            e6Var = null;
        }
        s(n2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, e6Var);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.c1.t(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20858g7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(charSequence, z11);
            l6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), 2, -1));
            linearLayout.addView(l6Var);
            l6Var.setOnClickListener(new ai.d0(arrayList2, runnable, alertDialog$Builder, 14));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.b2 o9 = alertDialog$Builder.o();
        if (z10) {
            o9.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.n2 r45, final boolean r46, final boolean r47, org.telegram.tgnet.TLRPC.Chat r48, final org.telegram.tgnet.TLRPC.User r49, final boolean r50, final boolean r51, boolean r52, final boolean r53, final org.telegram.messenger.MessagesStorage.BooleanCallback r54, final org.telegram.ui.ActionBar.e6 r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.s(org.telegram.ui.ActionBar.n2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.e6):void");
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        if (i10 != 0 && n2Var != null && n2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, e6Var);
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            n2Var.showDialog(alertDialog$Builder.f20378a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.b2 t(Activity activity, final long j3, final long j10, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.q.c("color_", sharedPrefKey, notificationsSettings, -16776961);
            } else if (DialogObject.isChatDialog(j3)) {
                i11 = notificationsSettings.getInt("GroupLed", -16776961);
            } else {
                i11 = notificationsSettings.getInt("MessagesLed", -16776961);
            }
        } else if (i10 == 1) {
            i11 = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i10 == 0) {
            i11 = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i10 == 3) {
            i11 = notificationsSettings.getInt("StoriesLed", -16776961);
        } else if (i10 != 5 && i10 != 4) {
            i11 = notificationsSettings.getInt("ChannelLed", -16776961);
        } else {
            i11 = notificationsSettings.getInt("ReactionsLed", -16776961);
        }
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, e6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.y8.f23787e[i13];
            l6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.y8.f23788f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            e7.addView(l6Var);
            l6Var.setOnClickListener(new q0(e7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(e7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j11 = j3;
                int i16 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i16 != 0) {
                    edit.putInt(sc.v.i("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
                } else {
                    int i17 = i10;
                    if (i17 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i17 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i17 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i17 != 5 && i17 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i17);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.d(j3, i10, runnable, 5));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new org.telegram.ui.o(29, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f20378a;
    }

    public static org.telegram.ui.ActionBar.b2 t0(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        if (n2Var == null) {
            n2Var = LaunchActivity.U();
        }
        if (str2 != null && n2Var != null && n2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = N(n2Var.getParentActivity(), str, str2, null, null, e6Var).f20378a;
            n2Var.showDialog(b2Var);
            return b2Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new org.telegram.ui.o(26, str3, n2Var));
        n2Var.showDialog(b2Var);
    }

    public static org.telegram.ui.ActionBar.b2 u0(org.telegram.ui.ActionBar.n2 n2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.b2 O = O(n2Var.getContext(), n2Var.getResourceProvider(), str, charSequence, str2, runnable);
        n2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
        alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        intCallback.run(0);
                        return;
                    default:
                        intCallback.run(1);
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                switch (r2) {
                    case 0:
                        intCallback.run(0);
                        return;
                    default:
                        intCallback.run(1);
                        return;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void v0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        Context context;
        if (str == null) {
            return;
        }
        if (n2Var != null && n2Var.getParentActivity() != null) {
            context = n2Var.getParentActivity();
        } else {
            context = ApplicationLoader.applicationContext;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, gg.c2 c2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final vd0 vd0Var = new vd0(context, null);
        final vd0 vd0Var2 = new vd0(context, null);
        final vd0 vd0Var3 = new vd0(context, null);
        linearLayout.addView(vd0Var2, w7.x5.l(0.3f, 0, -2));
        vd0Var2.setOnScrollListener(new sd0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        vd0Var.setMinValue(0);
        vd0Var.setMaxValue(11);
        linearLayout.addView(vd0Var, w7.x5.l(0.3f, 0, -2));
        vd0Var.setFormatter(new org.telegram.ui.nr(19));
        vd0Var.setOnValueChangedListener(new l0(vd0Var2, vd0Var, vd0Var3, 1));
        vd0Var.setOnScrollListener(new sd0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        vd0Var3.setMinValue(i10 + i16);
        vd0Var3.setMaxValue(i11 + i16);
        vd0Var3.setValue(i16 + i12);
        linearLayout.addView(vd0Var3, w7.x5.l(0.4f, 0, -2));
        vd0Var3.setOnValueChangedListener(new l0(vd0Var2, vd0Var, vd0Var3, 2));
        vd0Var3.setOnScrollListener(new sd0() {
            @Override
            public final void n(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            g5.c(vd0Var2, vd0Var, vd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(vd0Var2, vd0Var, vd0Var3);
        if (z10) {
            c(vd0Var2, vd0Var, vd0Var3);
        }
        if (i13 != -1) {
            vd0Var2.setValue(i13);
            vd0Var.setValue(i14);
            vd0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20378a.R = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.mk(z10, vd0Var2, vd0Var, vd0Var3, c2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.R = string;
        b2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void x(Context context, String str, String str2, long j3, f5 f5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false);
        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
        a3Var.a();
        vd0 vd0Var = new vd0(context, null);
        vd0Var.setTextColor(x02);
        vd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        vd0Var.setItemCount(5);
        vd0 vd0Var2 = new vd0(context, null);
        vd0Var2.setItemCount(5);
        vd0Var2.setTextColor(x02);
        vd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        vd0 vd0Var3 = new vd0(context, null);
        vd0Var3.setItemCount(5);
        vd0Var3.setTextColor(x02);
        vd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        vd0 vd0Var4 = vd0Var;
        y3 y3Var = new y3(context, vd0Var4, vd0Var2, vd0Var3, 1);
        y3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        y3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.q.m(20.0f, x02, 1, textView);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ai.q4 q4Var = new ai.q4(context, 15);
        linearLayout.addView(vd0Var4, w7.x5.l(0.5f, 0, 270));
        vd0Var4.setMinValue(0);
        vd0Var4.setMaxValue(365);
        vd0Var4.setWrapSelectorWheel(false);
        vd0Var4.setFormatter(new org.telegram.ui.nr(22));
        ai.r5 r5Var = new ai.r5(vd0Var4, vd0Var2, vd0Var3, 18);
        vd0Var4.setOnValueChangedListener(r5Var);
        vd0Var2.setMinValue(0);
        vd0Var2.setMaxValue(23);
        linearLayout.addView(vd0Var2, w7.x5.l(0.2f, 0, 270));
        vd0Var2.setFormatter(new org.telegram.ui.nr(23));
        vd0Var2.setOnValueChangedListener(r5Var);
        vd0Var3.setMinValue(0);
        vd0Var3.setMaxValue(59);
        vd0Var3.setValue(0);
        vd0Var3.setFormatter(new org.telegram.ui.nr(24));
        linearLayout.addView(vd0Var3, w7.x5.l(0.3f, 0, 270));
        vd0Var3.setOnValueChangedListener(r5Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                vd0Var3.setValue(calendar.get(12));
                vd0Var2.setValue(calendar.get(11));
                vd0Var4 = vd0Var4;
                vd0Var4.setValue(timeInMillis);
            } else {
                vd0Var4 = vd0Var4;
            }
        }
        f(null, null, 0L, 0L, 0, vd0Var4, vd0Var2, vd0Var3);
        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        q4Var.setGravity(17);
        q4Var.setTextColor(x04);
        q4Var.setTextSize(1, 14.0f);
        q4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x05, x06, x06));
        q4Var.setText(str2);
        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
        q4Var.setOnClickListener(new m0(vd0Var4, vd0Var2, vd0Var3, calendar, f5Var, a3Var, 2));
        a3Var.b(y3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        f3Var.setBackgroundColor(x03);
        f3Var.fixNavigationBar(x03);
    }

    public static void x0(vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, vd0Var2.getValue());
        calendar.set(1, vd0Var3.getValue());
        vd0Var.setMinValue(1);
        vd0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.n2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.e6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.y(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.e6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        x30 x30Var = new x30(0, context, true);
        x30Var.setImportantForAccessibility(2);
        ai.f0 f0Var = new ai.f0(context, x30Var);
        f0Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        f0Var.setClipToOutline(true);
        f0Var.setOutlineProvider(new ai.l2(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        f0Var.addView(view, w7.x5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        f0Var.addView(x30Var, w7.x5.d(117.0f, 117));
        alertDialog$Builder.f20378a.V = f0Var;
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        b2Var.f20427j0 = true;
        b2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f20378a.O0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
