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
import org.telegram.ui.ki1;
public abstract class g5 {
    public static final Pattern f24879a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, ki1 ki1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.a2(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.z5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        alertDialog$Builder.f19248a.V = frameLayout;
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bi.h(8, activity, z10));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.f19272j0 = true;
        a2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), ki1Var);
        alertDialog$Builder.f19248a.O0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.a2 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new h1(launchActivity, 1));
        return alertDialog$Builder.f19248a;
    }

    public static org.telegram.ui.ActionBar.a2 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f19248a;
    }

    public static org.telegram.ui.ActionBar.a2 D(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        int x02;
        int i10;
        int i11;
        int x03;
        int x04;
        int x05;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        e.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i12 = org.telegram.ui.ActionBar.g6.f19707j5;
        if (c6Var != null) {
            x02 = c6Var.b0(i12);
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
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
        e.addView(textView, w7.z5.t(-2, -2, i14, 24, i11, 24, 8));
        for (int i15 = 0; i15 < 4; i15++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, c6Var);
            l6Var.d = 42;
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i15));
            int i16 = org.telegram.ui.ActionBar.g6.f19655g7;
            if (c6Var != null) {
                x04 = c6Var.b0(i16);
            } else {
                x04 = org.telegram.ui.ActionBar.g6.x0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.g6.E5;
            if (c6Var != null) {
                x05 = c6Var.b0(i17);
            } else {
                x05 = org.telegram.ui.ActionBar.g6.x0(null, i17, false);
            }
            l6Var.a(x04, x05);
            String str = strArr[i15];
            if (iArr[0] == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(str, z11);
            e.addView(l6Var);
            l6Var.setOnClickListener(new q0(iArr, e));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        if (z10) {
            a2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (c6Var != null) {
                x03 = c6Var.b0(org.telegram.ui.ActionBar.g6.L5);
            } else {
                x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false);
            }
            a2Var.f19261b0 = new jr0(activity, 0);
            a2Var.f19264c0 = x03;
        }
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new m4.y0(24, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return a2Var;
    }

    public static org.telegram.ui.ActionBar.e3 E(final long j10, final long j11, final org.telegram.ui.ActionBar.m2 m2Var, final org.telegram.ui.ActionBar.c6 c6Var) {
        if (m2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) m2Var.getParentActivity(), c6Var, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.Notifications);
        e3Var.bigTitle = true;
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
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                if (zc.a(m2Var2)) {
                    zc.z(m2Var2, i11, 0, c6Var).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        return e3Var;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.c6 c6Var, f5 f5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
        if (c6Var != null) {
            x02 = c6Var.b0(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.g6.f19672h5;
        if (c6Var != null) {
            x03 = c6Var.b0(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.b0(i12);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.b0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.b0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.b0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.f19690i6;
        if (c6Var != null) {
            c6Var.b0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            x04 = c6Var.b0(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.g6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            x05 = c6Var.b0(i18);
        } else {
            x05 = org.telegram.ui.ActionBar.g6.x0(null, i18, false);
        }
        int i19 = x05;
        if (c6Var != null) {
            x06 = c6Var.b0(org.telegram.ui.ActionBar.g6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        }
        int i20 = x06;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, c6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(x02);
        p4Var.setValue(0);
        p4Var.setFormatter(new g1(0, iArr));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.f4 f4Var = new bi.f4(context, 19);
        linearLayout.addView(p4Var, w7.z5.l(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.is(8));
        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        f4Var.setGravity(17);
        f4Var.setTextColor(x04);
        f4Var.setTextSize(1, 14.0f);
        f4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, i19, i20, i20));
        f4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        l4Var.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        f4Var.setOnClickListener(new bi.b5(iArr, p4Var, f5Var, z2Var, 6));
        z2Var.b(l4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        e3Var.setBackgroundColor(x03);
        e3Var.fixNavigationBar(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f19248a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.g6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.g6.x0(null, i10, false), hashMap);
        alertDialog$Builder.f19248a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f19248a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.a2 H(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
        boolean z10;
        final long j12 = j10;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j12 != 0) {
            int i12 = notificationsSettings.getInt("priority_" + j12, 3);
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
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, c6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            l6Var.a(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19655g7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            e.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i15;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i16 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j13 = j12;
                    if (j13 != 0) {
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
                        edit.putInt("priority_" + j13, i16);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j13, j11);
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
                    alertDialog$Builder.f19248a.L0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
            z11 = true;
        }
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f19248a;
    }

    public static void I(int i10, Activity activity, long j10, TLRPC.Photo photo, bi.b bVar) {
        if (activity != null) {
            b3 b3Var = new b3(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, (org.telegram.ui.ActionBar.c6) bVar, true);
            e3Var.fixNavigationBar();
            e3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            e3Var.bigTitle = true;
            c3 c3Var = new c3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, b3Var, 0);
            e3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            e3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            e3Var.onClickListener = c3Var;
            e3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.z2 J(final Context context, final long j10, long j11, int i10, boolean z10, final f5 f5Var, Runnable runnable, e5 e5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        int i12;
        ?? r82;
        boolean[] zArr;
        long j12;
        FrameLayout frameLayout3;
        TextView textView;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i13;
        w3 w3Var;
        Calendar calendar;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        String[] strArr;
        int i17;
        int[] iArr2;
        Calendar calendar2;
        View view;
        yj0 yj0Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        ViewGroup viewGroup3;
        float f7;
        String[] strArr2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        final org.telegram.ui.ActionBar.e3 e3Var;
        int i18;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final ?? ud0Var = new ud0(context, c6Var);
        int i19 = e5Var.f24306a;
        int i20 = e5Var.f24308c;
        int i21 = e5Var.f24307b;
        ud0Var.setTextColor(i19);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        final ?? ud0Var2 = new ud0(context, c6Var);
        ud0Var2.setWrapSelectorWheel(true);
        ud0Var2.setAllItemsCount(24);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextColor(i19);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? ud0Var3 = new ud0(context, c6Var);
        ud0Var3.setWrapSelectorWheel(true);
        ud0Var3.setAllItemsCount(60);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextColor(i19);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? y3Var = new y3(context, ud0Var, ud0Var2, ud0Var3, 0);
        y3Var.setClipToPadding(false);
        y3Var.setClipChildren(false);
        y3Var.setOrientation(1);
        frameLayout4.addView((View) y3Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
        FrameLayout frameLayout6 = new FrameLayout(context);
        y3Var.addView(frameLayout6, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView5 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            frameLayout = frameLayout5;
            textView5.setText((CharSequence) null);
        } else {
            frameLayout = frameLayout5;
            if (j10 == clientUserId) {
                textView5.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView5.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        }
        org.telegram.messenger.g0.m(20.0f, i19, 1, textView5);
        frameLayout6.addView(textView5, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView5.setOnTouchListener(new ci.d(10));
        boolean[] zArr2 = {true};
        if (DialogObject.isUserDialog(j10) && j10 != clientUserId && (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) != null && !user.bot && (userStatus = user.status) != null && userStatus.expires > 0) {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout4;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            viewGroup2 = y3Var;
            textView = null;
            i11 = i21;
            zArr = zArr2;
            u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, e5Var.f24306a, false, c6Var);
            context2 = context;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackground(org.telegram.ui.ActionBar.g6.g0(i20, 1, -1));
            frameLayout3.addView(u0Var, w7.z5.a(40.0f, 0.0f, 8.0f, 5.0f, 0.0f, 40, 53));
            u0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            context2 = context;
            viewGroup = frameLayout4;
            i11 = i21;
            frameLayout2 = frameLayout;
            i12 = -1;
            r82 = 0;
            zArr = zArr2;
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            textView = null;
            viewGroup2 = y3Var;
            u0Var = null;
        }
        if (u0Var != null) {
            u0Var.setOnClickListener(new org.telegram.ui.xf(11, u0Var, e5Var));
            u0Var.setDelegate(new androidx.car.app.utils.a(f5Var, zArr, z2Var, 19));
        }
        ?? imageView = new ImageView(context2);
        yj0 yj0Var2 = new yj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.start();
        yj0Var2.M(40);
        yj0Var2.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(yj0Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(i20, 1, i12));
        if (u0Var != null) {
            i13 = 42;
        } else {
            i13 = r82;
        }
        frameLayout3.addView(imageView, w7.z5.a(40.0f, 0.0f, 8.0f, i13 + 8, 0.0f, 40, 53));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final bi.f4 f4Var = new bi.f4(context2, 14);
        linearLayout.addView(ud0Var, w7.z5.l(0.5f, r82, 270));
        ud0Var.setMinValue(r82);
        ud0Var.setMaxValue(365);
        ud0Var.setWrapSelectorWheel(r82);
        ud0Var.setFormatter(new org.telegram.ui.is(28));
        ViewGroup viewGroup4 = viewGroup2;
        final long j13 = j12;
        int i22 = i11;
        final boolean[] zArr3 = zArr;
        sd0 sd0Var = new sd0() {
            @Override
            public final void r(ud0 ud0Var4, int i23) {
                int i24;
                if (j13 == j10) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                g5.f(bi.f4.this, null, 0L, 0L, i24, ud0Var, ud0Var2, ud0Var3);
            }
        };
        ud0Var.setOnValueChangedListener(sd0Var);
        ud0Var2.setMinValue(r82);
        ud0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.u0 u0Var3 = u0Var;
        linearLayout.addView(ud0Var2, w7.z5.l(0.2f, r82, 270));
        ud0Var2.setFormatter(new org.telegram.ui.is(29));
        ud0Var2.setOnValueChangedListener(sd0Var);
        ud0Var3.setMinValue(r82);
        ud0Var3.setMaxValue(59);
        ud0Var3.setValue(r82);
        ud0Var3.setFormatter(new n2(r82));
        linearLayout.addView(ud0Var3, w7.z5.l(0.3f, r82, 270));
        ud0Var3.setOnValueChangedListener(sd0Var);
        if (j11 > 0 && j11 != 2147483646) {
            long j14 = 1000 * j11;
            w3Var = ud0Var2;
            calendar = calendar3;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                ud0Var3.setValue(calendar.get(12));
                w3Var.setValue(calendar.get(11));
                ud0Var.setValue(timeInMillis);
            }
        } else {
            w3Var = ud0Var2;
            calendar = calendar3;
        }
        final boolean[] zArr4 = {true};
        if (j13 == j10) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        final w3 w3Var2 = w3Var;
        f(f4Var, null, 0L, 0L, i14, ud0Var, w3Var2, ud0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            i15 = 1;
            i16 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i15 = 1;
            i16 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[i15] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i16] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[9] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i16];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[i15] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (!z10) {
            f7 = 14.0f;
            ?? frameLayout7 = new FrameLayout(context2);
            String[] strArr3 = strArr;
            int v = org.telegram.ui.ActionBar.g6.v(i22, org.telegram.ui.ActionBar.g6.m1(0.075f, i19));
            calendar2 = calendar;
            int m12 = org.telegram.ui.ActionBar.g6.m1(0.1f, i19);
            yj0Var = yj0Var2;
            textView4 = new TextView(context2);
            textView4.setTextSize(i15, 13.0f);
            textView4.setTextColor(i19);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.g6.v(v, m12);
            textView4.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, v, v10, v10));
            textView4.setGravity(17);
            strArr2 = strArr3;
            int[] iArr4 = iArr;
            u0Var2 = u0Var3;
            view = imageView;
            i17 = i22;
            ?? p6Var = new org.telegram.ui.p6(iArr4, iArr3, strArr2, textView4, 15);
            iArr2 = iArr4;
            p6Var.run();
            frameLayout7.addView(textView4, w7.z5.a(28.0f, 32.0f, 4.0f, 32.0f, 5.0f, -2, 1));
            ViewGroup viewGroup5 = viewGroup4;
            viewGroup5.addView((View) frameLayout7, w7.z5.n(-1, -2));
            textView3 = p6Var;
            textView2 = frameLayout7;
            viewGroup3 = viewGroup5;
        } else {
            int[] iArr5 = iArr;
            i17 = i22;
            iArr2 = iArr5;
            calendar2 = calendar;
            view = imageView;
            yj0Var = yj0Var2;
            u0Var2 = u0Var3;
            viewGroup3 = viewGroup4;
            f7 = 14.0f;
            strArr2 = strArr;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        }
        ?? r57 = textView2;
        ?? r58 = textView3;
        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        f4Var.setGravity(17);
        f4Var.setTextColor(e5Var.f24310g);
        f4Var.setTextSize(1, f7);
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, e5Var.h));
        viewGroup3.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar4 = calendar2;
        f4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i23;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i23 = 1;
                } else {
                    i23 = 0;
                }
                ud0 ud0Var4 = ud0Var;
                w3 w3Var3 = w3Var2;
                x3 x3Var = ud0Var3;
                boolean f10 = g5.f(null, null, 0L, 0L, i23, ud0Var4, w3Var3, x3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, ud0Var4.getValue());
                calendar5.set(11, w3Var3.getValue());
                calendar5.set(12, x3Var.getValue());
                if (f10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z11 = zArr3[0];
                f5Var.J((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = z2Var.f20538a.dismissRunnable;
                runnable2.run();
            }
        });
        z2Var.b(viewGroup);
        String[] strArr4 = strArr2;
        org.telegram.ui.ActionBar.e3 e3Var2 = z2Var.f20538a;
        e3Var2.show();
        e3Var2.setOnDismissListener(new p2(runnable, zArr4));
        e3Var2.setBackgroundColor(i17);
        e3Var2.fixNavigationBar(i17);
        if (textView4 != null) {
            i18 = 1;
            e3Var = e3Var2;
            textView4.setOnClickListener(new a2(frameLayout2, c6Var, e3Var2, (FrameLayout) r57, iArr2, strArr4, iArr3, (org.telegram.ui.p6) r58));
        } else {
            e3Var = e3Var2;
            i18 = 1;
        }
        final di.d4[] d4VarArr = new di.d4[i18];
        final org.telegram.ui.ActionBar.u0 u0Var4 = u0Var2;
        final yj0 yj0Var3 = yj0Var;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i23;
                String string;
                int i24;
                int i25;
                int i26;
                int i27;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                yj0 yj0Var4 = yj0Var3;
                if (!z11) {
                    if (yj0Var4.f31285a0 >= 40) {
                        yj0Var4.M(0);
                    }
                    yj0Var4.P(40);
                    yj0Var4.start();
                } else {
                    if (yj0Var4.f31285a0 < 40) {
                        yj0Var4.M(40);
                    }
                    yj0Var4.P(80);
                    yj0Var4.start();
                }
                di.d4[] d4VarArr2 = d4VarArr;
                di.d4 d4Var = d4VarArr2[0];
                if (d4Var != null) {
                    d4Var.e(true);
                    d4VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                di.d4 d4Var2 = new di.d4(context, 3);
                d4VarArr2[0] = d4Var2;
                d4Var2.r();
                d4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                d4Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int m13 = org.telegram.ui.ActionBar.g6.m1(0.25f, -16777216);
                d4Var2.f6801i0 = dp2;
                d4Var2.f6802j0 = dp3;
                d4Var2.f6803k0 = m13;
                d4Var2.F.setShadowLayer(dp2, 0.0f, dp3, m13);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i27 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i27 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i27);
                } else if (chat == null && user2 != null) {
                    if (j15 == j13) {
                        if (zArr5[0]) {
                            i25 = R.string.ScheduleNotifyOnSelf;
                        } else {
                            i25 = R.string.ScheduleNotifyOffSelf;
                        }
                        string = LocaleController.getString(i25);
                    } else {
                        if (zArr5[0]) {
                            i24 = R.string.ScheduleNotifyOnChat;
                        } else {
                            i24 = R.string.ScheduleNotifyOffChat;
                        }
                        string = LocaleController.formatString(i24, UserObject.getForcedFirstName(user2));
                    }
                } else {
                    if (zArr5[0]) {
                        i23 = R.string.ScheduleNotifyOnGroup;
                    } else {
                        i23 = R.string.ScheduleNotifyOffGroup;
                    }
                    string = LocaleController.getString(i23);
                }
                d4Var2.s(string);
                d4Var2.d = 5000L;
                if (u0Var4 != null) {
                    i26 = 42;
                } else {
                    i26 = -8;
                }
                d4Var2.l(1.0f, -(i26 + 20));
                d4Var2.f6804l0 = new qg(d4Var2, 2);
                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                e3Var3.getContainerView().setClipToPadding(false);
                e3Var3.getContainerView().setClipChildren(false);
                e3Var3.getContainerView().addView(d4Var2, w7.z5.a(200.0f, 0.0f, -194.0f, 0.0f, 0.0f, -1, 48));
                d4Var2.u();
            }
        });
        return z2Var;
    }

    public static void K(Context context, long j10, f5 f5Var) {
        J(context, j10, -1L, 0, false, f5Var, null, new e5(null), null);
    }

    public static void L(Context context, long j10, f5 f5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        J(context, j10, -1L, 0, false, f5Var, null, new e5(c6Var), c6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = str;
        a2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.a2 O(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = str;
        a2Var.T = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f19248a;
    }

    public static org.telegram.ui.ActionBar.m1 P(org.telegram.ui.ActionBar.m2 m2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (m2Var != null && view != null) {
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            m1Var.e = true;
            m1Var.f20221c = 220;
            m1Var.setOutsideTouchable(true);
            m1Var.setClippingEnabled(true);
            m1Var.setAnimationStyle(R.style.PopupContextAnimation);
            m1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            m1Var.setInputMethodMode(2);
            m1Var.getContentView().setFocusableInTouchMode(true);
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
            m1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            m1Var.b();
            return m1Var;
        }
        return null;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.m2 m2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = str6;
        a2Var.T = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new ig.p(editTextBoldCursor, i10, stringCallback, a2VarArr, view2, 1));
        editTextBoldCursor.addTextChangedListener(new a4(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, w7.z5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f19248a.f19257a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new hg.b2(editTextBoldCursor, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.is(18));
        a2VarArr[0] = alertDialog$Builder.f19248a;
        if (m2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, m2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr[0];
        a2Var2.f19270h0 = false;
        a2Var2.setOnDismissListener(new fi.s0(editTextBoldCursor, m2Var, findActivity, 2));
        a2VarArr[0].setOnShowListener(new f1(1, editTextBoldCursor));
        a2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        Q(context, m2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), c6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.z2 S(Context context, long j10, final f5 f5Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
        int i17 = org.telegram.ui.ActionBar.g6.f19690i6;
        org.telegram.ui.ActionBar.g6.x0(null, i17, false);
        int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final ud0 ud0Var = new ud0(context, c6Var);
        ud0Var.setTextColor(x02);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        final ?? ud0Var2 = new ud0(context, c6Var);
        ud0Var2.setWrapSelectorWheel(true);
        ud0Var2.setAllItemsCount(24);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextColor(x02);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? ud0Var3 = new ud0(context, c6Var);
        ud0Var3.setWrapSelectorWheel(true);
        ud0Var3.setAllItemsCount(60);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextColor(x02);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        y3 y3Var = new y3(context, ud0Var, ud0Var2, ud0Var3, 5);
        y3Var.setOrientation(1);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        y3Var.addView(e, w7.z5.t(-1, -2, 51, 22, 0, 22, 4));
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
        e.addView(textView, w7.z5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ci.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.sk.o(org.telegram.ui.ActionBar.g6.f20005z6, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        e.addView(textView2, w7.z5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i18 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final bi.f4 f4Var = new bi.f4(context, 20);
        linearLayout.addView(ud0Var, w7.z5.l(0.5f, 0, 270));
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(365);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new i2.v(i18, 8));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        sd0 sd0Var = new sd0() {
            @Override
            public final void r(ud0 ud0Var4, int i19) {
                g5.f(bi.f4.this, null, j11, j12, i12, ud0Var, ud0Var2, ud0Var3);
            }
        };
        ud0Var.setOnValueChangedListener(sd0Var);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(23);
        linearLayout.addView((View) ud0Var2, w7.z5.l(0.2f, 0, 270));
        ud0Var2.setFormatter(new org.telegram.ui.is(13));
        ud0Var2.setOnValueChangedListener(sd0Var);
        ud0Var3.setMinValue(0);
        ud0Var3.setMaxValue(59);
        ud0Var3.setValue(0);
        ud0Var3.setFormatter(new org.telegram.ui.is(14));
        linearLayout.addView((View) ud0Var3, w7.z5.l(0.3f, 0, 270));
        ud0Var3.setOnValueChangedListener(sd0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            i13 = x03;
            i14 = i17;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i15 = x04;
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                ud0Var3.setValue(calendar.get(12));
                ud0Var2.setValue(calendar.get(11));
                ud0Var.setValue(timeInMillis);
            }
        } else {
            i13 = x03;
            i14 = i17;
            i15 = x04;
        }
        final boolean[] zArr = {true};
        f(f4Var, null, j11, j12, i12, ud0Var, ud0Var2, ud0Var3);
        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        f4Var.setGravity(17);
        f4Var.setTextColor(i15);
        f4Var.setTextSize(1, 14.0f);
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, x05));
        y3Var.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i19 = i12;
        f4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i20 = i19;
                ud0 ud0Var4 = ud0Var;
                w4 w4Var = ud0Var2;
                x4 x4Var = ud0Var3;
                boolean f7 = g5.f(null, null, j14, j15, i20, ud0Var4, w4Var, x4Var);
                long epochMilli = LocalDate.now().plusDays(ud0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, w4Var.getValue());
                calendar2.set(12, x4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                }
                f5Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = z2Var.f20538a.dismissRunnable;
                runnable.run();
            }
        });
        w7.b6.b(f4Var, 0.02f, 1.2f);
        bi.f4 f4Var2 = new bi.f4(context, 21);
        f4Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        f4Var2.setGravity(17);
        if (i10 == 1) {
            i16 = R.string.MessageSuggestionPublishNow;
        } else {
            i16 = R.string.PostSuggestionsAnytime;
        }
        f4Var2.setText(LocaleController.getString(i16));
        f4Var2.setTextColor(x05);
        f4Var2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false);
        int x07 = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
        f4Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x06, x07, x07));
        y3Var.addView(f4Var2, w7.z5.t(-1, 48, 83, 16, 0, 16, 16));
        f4Var2.setOnClickListener(new bi.x(zArr, f5Var, z2Var, 12));
        w7.b6.b(f4Var2, 0.02f, 1.2f);
        z2Var.b(y3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        e3Var.setOnDismissListener(new di.e1(zArr));
        e3Var.setBackgroundColor(i13);
        e3Var.fixNavigationBar(i13);
        return z2Var;
    }

    public static org.telegram.ui.ActionBar.a2 T(org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        URLSpan[] uRLSpanArr;
        if (m2Var == null || m2Var.getParentActivity() == null) {
            return null;
        }
        da0 da0Var = new da0(m2Var.getParentActivity(), m2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(m2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        da0Var.setText(spannableString);
        da0Var.setTextSize(1, 16.0f);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19727k5, c6Var));
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19744l5, c6Var));
        da0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.n(da0Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new s2(1, m2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f19248a;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.MessageLifetime);
        ud0 ud0Var = new ud0(context, null);
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            ud0Var.setValue(i10);
        } else if (i10 == 30) {
            ud0Var.setValue(16);
        } else if (i10 == 60) {
            ud0Var.setValue(17);
        } else if (i10 == 3600) {
            ud0Var.setValue(18);
        } else if (i10 == 86400) {
            ud0Var.setValue(19);
        } else if (i10 == 604800) {
            ud0Var.setValue(20);
        } else if (i10 == 0) {
            ud0Var.setValue(0);
        }
        ud0Var.setFormatter(new n2(4));
        alertDialog$Builder.n(ud0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new m4.y0(29, encryptedChat, ud0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.m2 m2Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        String sb2;
        if (m2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19915u5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19932v5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new n2(5));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.g0.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f19707j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new t2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i2.d.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        i2.d.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        i2.d.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i2.d.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        i2.d.q(16711680, hashMap, "Red", 16711807, "Rose");
        i2.d.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i2.d.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i2.d.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        i2.d.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        i2.d.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        i2.d.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        i2.d.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i2.d.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i2.d.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i2.d.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i2.d.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        i2.d.q(65280, hashMap, "Green", 43115, "Jade");
        i2.d.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        i2.d.q(776785, hashMap, "Malachite", 10026904, "Mint");
        i2.d.q(11394989, hashMap, "Moss", 3234721, "Azure");
        i2.d.q(255, hashMap, "Blue", 18347, "Cobalt");
        i2.d.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i2.d.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i2.d.q(128, hashMap, "Navy", 3101086, "Sapphire");
        i2.d.q(7788522, hashMap, "Sky", 32896, "Teal");
        i2.d.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i2.d.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i2.d.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i2.d.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i2.d.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        i2.d.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        i2.d.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i2.d.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i2.d.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        i2.d.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i2.d.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        i2.d.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        i2.d.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i2.d.q(15653316, hashMap, "Almond", 16776656, "Cream");
        i2.d.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        i2.d.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i2.d.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i2.d.q(16777215, hashMap, "White", 8421504, "Gray");
        i2.d.q(0, hashMap, "Black", 15266260, "Chrome");
        i2.d.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i2.d.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        i2.d.q(2499381, hashMap, "Steel", 5220413, "Apple");
        i2.d.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        i2.d.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (e6Var == null) {
            e6Var2 = org.telegram.ui.ActionBar.g6.B0().k(false);
        } else {
            e6Var2 = e6Var;
        }
        if (e6Var2 == null || (i11 = e6Var2.f19447c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.s0())[0];
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
            sb2 = a1.g.q((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder i17 = t8.b.i(str, " ");
            i17.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = i17.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        f1 f1Var = new f1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.setOnShowListener(f1Var);
        m2Var.showDialog(a2Var);
        editTextBoldCursor.requestFocus();
        a2Var.d(-1).setOnClickListener(new bi.l0(m2Var, editTextBoldCursor, e6Var, f6Var, a2Var, 9));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) activity, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        ?? ud0Var = new ud0(activity, null);
        t3 t3Var = new t3(activity, ud0Var);
        t3Var.setOrientation(0);
        t3Var.setWeightSum(1.0f);
        ud0Var.setAllItemsCount(24);
        ud0Var.setItemCount(5);
        ud0Var.setTextColor(x02);
        ud0Var.setGravity(5);
        ud0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? ud0Var2 = new ud0(activity, null);
        ud0Var2.setWrapSelectorWheel(true);
        ud0Var2.setAllItemsCount(60);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextColor(x02);
        ud0Var2.setGravity(3);
        ud0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final j2 j2Var = new j2(i11, i12, (s3) ud0Var, (u3) ud0Var2, i10, t3Var);
        t3Var.addView((View) ud0Var, w7.z5.l(0.5f, 0, 270));
        ud0Var.setFormatter(new org.telegram.ui.is(26));
        ud0Var.setOnValueChangedListener(new sd0() {
            @Override
            public final void r(ud0 ud0Var3, int i13) {
                switch (r2) {
                    case 0:
                        j2Var.run(Boolean.TRUE);
                        return;
                    default:
                        j2Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        t3Var.addView((View) ud0Var2, w7.z5.l(0.5f, 0, 270));
        ud0Var2.setFormatter(new org.telegram.ui.is(27));
        ud0Var2.setOnValueChangedListener(new sd0() {
            @Override
            public final void r(ud0 ud0Var3, int i13) {
                switch (r2) {
                    case 0:
                        j2Var.run(Boolean.TRUE);
                        return;
                    default:
                        j2Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        j2Var.run(Boolean.FALSE);
        v3 v3Var = new v3(activity, ud0Var, ud0Var2);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        v3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        v3Var.addView(t3Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.d dVar = new di.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new l2(r1, 0));
        v3Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
        e3Var.customView = v3Var;
        e3Var.show();
        e3Var.setOnDismissListener(new fi.s0(callback, ud0Var, ud0Var2, 3));
        e3Var.setBackgroundColor(x03);
        e3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
    }

    public static org.telegram.ui.ActionBar.a2 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        boolean z11 = true;
        final int[] iArr = new int[1];
        if (j10 != 0) {
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
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, c6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19655g7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str3, z10);
            e.addView(l6Var);
            l6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j10;
                    int i13 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
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
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
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
                    alertDialog$Builder.f19248a.L0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z11 = true;
        }
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f19248a;
    }

    public static org.telegram.ui.ActionBar.a2 Y(Context context, org.telegram.ui.ActionBar.c6 c6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new da.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new m4.y0(23, atomicBoolean, aVar));
        alertDialog$Builder.f19248a.setOnDismissListener(new fi.d0(5, atomicBoolean, aVar));
        return alertDialog$Builder.f19248a;
    }

    public static void Z(int i10, int i11, long j10, Utilities.Callback callback) {
        a0(i10, j10, i11, callback, 0L);
    }

    public static void a(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
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
        ud0Var3.setMaxValue(i16);
        ud0Var3.setMinValue(i13);
        int value = ud0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        ud0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        ud0Var2.setMinValue(i11);
        int value2 = ud0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        ud0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        ud0Var.setMinValue(i12);
    }

    public static boolean a0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.c6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        zh.n5.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final w2 w2Var = new w2(i10, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j10, "ask_paid_message_", "_price"), 0L)) {
                w2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new bi.b();
            }
            org.telegram.ui.ActionBar.c6 c6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j10);
            if (ChatObject.isMonoForum(i10, j10)) {
                shortName = og.d.h(i10, j10);
            } else if (U instanceof org.telegram.ui.fo) {
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) U;
                if (foVar.f35652g4 && foVar.a() == j10 && (chat = foVar.f35641f4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f18916id);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = (int) j13;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i12, shortName)));
            spannableStringBuilder.append((CharSequence) " ");
            if (i11 == 1) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i12)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j12)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i11)));
            }
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        int i13 = i10;
                        SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                        long j14 = j10;
                        edit.putLong(org.telegram.ui.Cells.c1.h(j14, "ask_paid_message_", "_price"), j13).apply();
                        zh.n5.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(w2Var);
                }
            }, c6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static long b(di.d dVar, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((ud0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (ud0Var2.getValue() - 120) % 12);
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = ud0Var.getValue();
        int value3 = ud0Var3.getValue();
        int value4 = ud0Var4.getValue();
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
        org.telegram.ui.ActionBar.c6 bVar;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        boolean z11 = true;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l4 = (Long) obj;
            long j11 = j10;
            long longValue = l4.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l4, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            boolean z12 = z10;
            zh.n5.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new bi.b();
            }
            org.telegram.ui.ActionBar.c6 c6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            Object[] objArr = new Object[1];
            objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.dr(i10, max, activity, arrayList, hashMap, callback, c6Var), c6Var, true);
            return true;
        }
        callback.run(hashMap);
        return z13;
    }

    public static void c(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        ud0Var3.setMinValue(i12);
        int value = ud0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        ud0Var2.setMinValue(i10);
        int value2 = ud0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        ud0Var.setMinValue(i11);
    }

    public static boolean c0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.c1.h(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(TextView textView, ud0 ud0Var, f4 f4Var, g4 g4Var) {
        String str;
        String str2;
        int value = ud0Var.getValue();
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

    public static void d0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.a2 a2Var, org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            String obj = editTextBoldCursor.getText().toString();
            int i10 = org.telegram.ui.ActionBar.g6.f19536a;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            f6Var.f19493b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            f6Var.f19491a = obj;
            org.telegram.ui.ActionBar.g6.f19667h0 = org.telegram.ui.ActionBar.g6.Z0(org.telegram.ui.ActionBar.g6.I.f19503i0);
            f6Var.E = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.g6.s1(f6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(m2Var.getParentActivity(), f6Var);
            a2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(m2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e) {
                FileLog.e(e);
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
                        if (user.f19063id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f19063id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f19063id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new fi.l3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.a2 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.m2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.m2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.a2");
    }

    public static boolean f(TextView textView, TextView textView2, long j10, long j11, int i10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        long j14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int i17;
        int i18;
        int i19;
        int value = ud0Var.getValue();
        int value2 = ud0Var2.getValue();
        int value3 = ud0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i20 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            i11 = i20;
            calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j12 = currentTimeMillis;
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i13 = 23;
            i14 = 59;
        } else {
            j12 = currentTimeMillis;
            i11 = i20;
            j13 = j11;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i21 = i14;
        if (j10 > 0) {
            j14 = TimeUnit.SECONDS.toMillis(j10);
        } else {
            j14 = 60000;
        }
        long j15 = j14;
        long j16 = j12 + j15;
        calendar.setTimeInMillis(j16);
        int i22 = calendar.get(11);
        int i23 = calendar.get(12);
        long j17 = j13;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        ud0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            ud0Var.setMaxValue(i12);
        }
        int value4 = ud0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        ud0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i12) {
                i19 = i13;
            } else {
                i19 = 23;
            }
            ud0Var2.setMaxValue(i19);
        }
        int value5 = ud0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        ud0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i12 && value5 == i13) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            ud0Var3.setMaxValue(i18);
        }
        int value6 = ud0Var3.getValue();
        if (timeInMillis <= j16) {
            calendar.setTimeInMillis(j16);
        } else if (i24 > 0 && timeInMillis > j17) {
            calendar.setTimeInMillis(j17);
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
            int i26 = (int) ((timeInMillis2 - j12) / 1000);
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
        if (timeInMillis - j12 > j15) {
            return z10;
        }
        return z11;
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, gn gnVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        a2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q6, c6Var));
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
                    matches = g5.f24879a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr[0];
                if (a2Var2 != null) {
                    a2Var2.dismiss();
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, w7.z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = t91.f29000f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            t91 t91Var = new t91(context, c6Var);
            t91Var.setWebPage(webPage);
            linearLayout.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        a2Var.f19257a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new m4.y0(27, (Object) editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.is(25));
        if (gnVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, gnVar));
        }
        a2VarArr[0] = a2Var;
        a2Var.f19270h0 = false;
        a2Var.setOnDismissListener(new b1(editTextBoldCursor, 2));
        a2VarArr[0].setOnShowListener(new i2(0, editTextBoldCursor));
        a2VarArr[0].show();
        TextView textView = (TextView) a2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        }
    }

    public static boolean g(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f18916id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f18916id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
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

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && m2Var != null && m2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
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
                    a2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    a2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    a2Var.T = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        a2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    a2Var.T = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    a2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new s2(0, m2Var));
                    break;
                case 6:
                    if (z10) {
                        a2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        a2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    a2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    a2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        a2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        a2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    a2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        a2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    a2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    a2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        a2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    a2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        a2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        a2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        a2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    a2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    a2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    a2Var.T = sb2.toString();
                    break;
            }
            org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.a2 h(Activity activity, d5 d5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.p1 p1Var = alertDialog$Builder.f19248a.L0;
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f21129f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                k9 k9Var = kVar.e;
                k9Var.m(i10, currentUser);
                kVar.f21126a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                z9 z9Var = kVar.f21128c;
                z9Var.getImageReceiver().setCurrentAccount(i10);
                z9Var.e(currentUser, k9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                e.addView(kVar, w7.z5.n(-1, 50));
                kVar.setOnClickListener(new bi.x(a2VarArr, p1Var, d5Var, 13));
            }
        }
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2VarArr[0] = a2Var;
        return a2Var;
    }

    public static org.telegram.ui.ActionBar.a2 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
        boolean[] zArr = {false};
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        c5 c5Var = new c5(activity, a2VarArr);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.G = 6;
        alertDialog$Builder.n(c5Var);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.g6.E8, c6Var, textView2, 1, 20.0f);
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
        c5Var.addView(textView2, w7.z5.a(-2.0f, 24.0f, 8.0f, 24.0f, 0.0f, -1, i12 | 48));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        c5Var.addView(textView, w7.z5.a(-2.0f, 24.0f, 48.0f, 24.0f, 6.0f, -2, i13 | 48));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(activity, 1, c6Var);
            a2VarArr[0] = a2Var2;
            a2Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var), 7, AndroidUtilities.dp(12.0f)));
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
            org.telegram.ui.Cells.a2 a2Var3 = a2VarArr[0];
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
            a2Var3.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            c5Var.addView(a2VarArr[0], w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 83));
            a2VarArr[0].setOnClickListener(new t0(5, zArr));
        }
        alertDialog$Builder.k(str2, new d3(0, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            a2Var.X0 = true;
        }
        a2Var.show();
        return a2Var;
    }

    public static org.telegram.ui.ActionBar.a2 i(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f19248a;
    }

    public static void i0(org.telegram.ui.ActionBar.m2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.c6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.i0(org.telegram.ui.ActionBar.m2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void j(Context context, org.telegram.ui.ActionBar.c6 c6Var, f5 f5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
        if (c6Var != null) {
            x02 = c6Var.b0(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.g6.f19672h5;
        if (c6Var != null) {
            x03 = c6Var.b0(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        }
        int i12 = x03;
        int i13 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.b0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.b0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.b0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.b0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.f19690i6;
        if (c6Var != null) {
            c6Var.b0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            x04 = c6Var.b0(i18);
        } else {
            x04 = org.telegram.ui.ActionBar.g6.x0(null, i18, false);
        }
        int i19 = x04;
        int i20 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            x05 = c6Var.b0(i20);
        } else {
            x05 = org.telegram.ui.ActionBar.g6.x0(null, i20, false);
        }
        int i21 = x05;
        if (c6Var != null) {
            x06 = c6Var.b0(org.telegram.ui.ActionBar.g6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        }
        int i22 = x06;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        k4 k4Var = new k4(context, c6Var, iArr);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(16);
        k4Var.setTextColor(x02);
        k4Var.setValue(0);
        k4Var.setFormatter(new g1(1, iArr));
        l4 l4Var = new l4(context, k4Var, 0);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 1);
        linearLayout.addView(k4Var, w7.z5.l(1.0f, 0, 270));
        u3Var.setPadding(0, 0, 0, 0);
        u3Var.setGravity(17);
        u3Var.setTextColor(i19);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        u3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, i21, i22, i22));
        l4Var.addView(u3Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        k4Var.setOnValueChangedListener(new s(u3Var, 10));
        u3Var.setOnClickListener(new bi.b5(iArr, k4Var, f5Var, z2Var, 8));
        z2Var.b(l4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        e3Var.setBackgroundColor(i12);
        e3Var.fixNavigationBar(i12);
    }

    public static void j0(org.telegram.ui.fo foVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.xg xgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (foVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = foVar.getAccountInstance();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            if (i10 < 0) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, c6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.P0 = false;
                a2Var.N = new b1(xgVar, 0);
                a2Var.R = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(foVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.a2[] a2VarArr = {new org.telegram.ui.Cells.a2(foVar.getParentActivity(), 1, c6Var)};
                a2VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                a2VarArr[0].setTag(0);
                a2VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
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
                a2Var2.setPadding(dp, 0, dp2, 0);
                linearLayout.addView(a2VarArr[0], w7.z5.n(-1, -2));
                a2VarArr[0].setOnClickListener(new c1(a2VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new d1(user, accountInstance, foVar, chat, messageObject, a2VarArr, c6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                foVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder k(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        if (org.telegram.ui.ActionBar.g6.B0().q()) {
            i10 = R.raw.permission_map_dark;
        } else {
            i10 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i10);
        if (org.telegram.ui.ActionBar.g6.B0().q()) {
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
        frameLayout.addView(view, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.z5.a(82.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, 17));
        z9 z9Var = new z9(activity);
        z9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        z9Var.e(user, new k9(0, user));
        frameLayout.addView(z9Var, w7.z5.a(52.0f, 0.0f, 0.0f, 0.0f, 11.0f, 52, 17));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.V = frameLayout;
        a2Var.O0 = 0.37820512f;
        alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new k1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void k0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.e3 i11 = org.telegram.messenger.sk.i(1, context, null, false);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        frameLayout.addView(frameLayout2, w7.z5.a(80.0f, 0.0f, 12.0f, 0.0f, 0.0f, 80, 1));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, textView);
        org.telegram.messenger.sk.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        i13.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        i13.setTextSize(1, 14.0f);
        i13.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        i13.setGravity(17);
        e.addView(i13, w7.z5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        di.d dVar = new di.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        e.addView(dVar, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = e;
        dVar.setOnClickListener(new org.telegram.ui.wd(i10, dVar, i11, j10));
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.z2 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        ud0 ud0Var = new ud0(context, c6Var);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0 ud0Var2 = new ud0(context, c6Var);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0 ud0Var3 = new ud0(context, c6Var);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        c4 c4Var = new c4(context, ud0Var, ud0Var2, ud0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.g6.f19707j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        z2 z2Var2 = new z2(ud0Var3, i15, ud0Var, ud0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(ud0Var, w7.z5.l(0.25f, 0, 270));
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(31);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new n2(6));
        s sVar = new s(z2Var2, 9);
        ud0Var.setOnScrollListener(sVar);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(11);
        ud0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
        ud0Var2.setFormatter(new n2(7));
        ud0Var2.setOnScrollListener(sVar);
        ud0Var3.setMinValue(calendar.get(1) - 149);
        ud0Var3.setMaxValue(i15);
        ud0Var3.setWrapSelectorWheel(false);
        ud0Var3.setFormatter(new i2.v(i15, 9));
        linearLayout.addView(ud0Var3, w7.z5.l(0.25f, 0, 270));
        ud0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            ud0Var.setValue(tL_birthday.day);
            ud0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                ud0Var3.setValue(tL_birthday.year);
            } else {
                ud0Var3.setValue(i15);
            }
        } else {
            ud0Var.setValue(calendar.get(5));
            ud0Var2.setValue(calendar.get(2));
            ud0Var3.setValue(i15);
        }
        z2Var2.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            da0 da0Var = new da0(context, null);
            da0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            da0Var.setTextSize(1, 13.0f);
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19838q5, c6Var));
            da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
            da0Var.setGravity(17);
            frameLayout2.addView(da0Var, w7.z5.e(-2, -2, 17));
            c4Var.addView(frameLayout2, w7.z5.n(-1, -2));
            int i16 = UserConfig.selectedAccount;
            ah.g gVar = new ah.g(i16, da0Var, 29);
            gVar.run();
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new a3(gVar, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        }
        if (z10) {
            di.d dVar = new di.d(context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Cells.sa(ud0Var3, i15, z2Var2, 5));
            c4Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, w03, w03));
        w7.b6.b(textView2, 0.02f, 1.2f);
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
        c4Var.addView(textView2, w7.z5.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new fi.m3(ud0Var, ud0Var2, ud0Var3, i15, z2Var, callback));
        if (z11) {
            di.d dVar2 = new di.d(context, c6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.e();
            dVar2.setOnClickListener(new org.telegram.ui.xf(14, z2Var, callback));
            c4Var.addView(dVar2, w7.z5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        z2Var.b(c4Var);
        return z2Var;
    }

    public static void l0(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        String formatPluralString;
        if (str != null && str.startsWith("FLOOD_WAIT") && m2Var != null && m2Var.getParentActivity() != null) {
            int intValue = Utilities.parseInt((CharSequence) str).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            m2Var.showDialog(a2Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.m2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.m(org.telegram.ui.ActionBar.m2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        e.addView(new zh.t2(context, tL_starGiftUnique, userOrChat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.sk.o(org.telegram.ui.ActionBar.g6.f19707j5, c6Var, textView, 1, 16.0f);
        org.telegram.messenger.sk.r(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        e.addView(textView, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        i2.d.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void n(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = m2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        da0 da0Var = new da0(context, null);
        NotificationCenter.listenEmojiLoading(da0Var);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19660gc, false));
        da0Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        da0Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f19248a.G = 6;
        alertDialog$Builder.n(frameLayout);
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.u(AndroidUtilities.dp(18.0f));
        z9 z9Var = new z9(context);
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(z9Var, w7.z5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f19649g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f19668h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20008z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
            h5Var.i(new cr(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19763m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new u0(user, m2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        br brVar = new br(R.drawable.attach_arrow_right, 0);
        brVar.setTopOffset(1);
        brVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(brVar, valueOf.length() - 1, valueOf.length(), 33);
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
        frameLayout.addView(h5Var, w7.z5.a(-2.0f, f7, 0.0f, i16, 0.0f, -1, i20));
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
        frameLayout.addView(textView, w7.z5.a(-2.0f, f10, 24.0f, i21, 0.0f, -1, i22));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(da0Var, w7.z5.a(-2.0f, 24.0f, 57.0f, 24.0f, 1.0f, -2, i19 | 48));
        if (UserObject.isReplyUser(user)) {
            k9Var.f26292p = 0.8f;
            k9Var.g(12);
            z9Var.h(null, null, k9Var, user);
        } else {
            k9Var.f26292p = 1.0f;
            k9Var.m(m2Var.getCurrentAccount(), user);
            z9Var.e(user, k9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener s0Var = new s0(3, runnable2);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        m2Var.showDialog(a2Var, false, s0Var);
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(0, context, a2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1, c6Var);
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
        linearLayout.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(a2Var, w7.z5.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f19248a.f19257a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr[0];
                        if (a2Var3 != null) {
                            a2Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.a2 a2Var4 = a2VarArr[0];
                        if (a2Var4 != null) {
                            a2Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr[0];
                        if (a2Var3 != null) {
                            a2Var3.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(a2Var.b()));
                        org.telegram.ui.ActionBar.a2 a2Var4 = a2VarArr[0];
                        if (a2Var4 != null) {
                            a2Var4.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        a2VarArr[0] = alertDialog$Builder.o();
    }

    public static org.telegram.ui.ActionBar.z2 o(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(activity, c6Var);
        z2Var.a();
        ud0 ud0Var = new ud0(activity, c6Var);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0 ud0Var2 = new ud0(activity, c6Var);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0 ud0Var3 = new ud0(activity, c6Var);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        q4 q4Var = new q4(activity, ud0Var, ud0Var2, ud0Var3);
        q4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        q4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.g6.f19707j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        q4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(ud0Var, w7.z5.l(0.25f, 0, 270));
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(31);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setFormatter(new org.telegram.ui.is(4));
        l0 l0Var = new l0(ud0Var, ud0Var2, ud0Var3, 0);
        ud0Var.setOnValueChangedListener(l0Var);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(11);
        ud0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(ud0Var2, w7.z5.l(0.5f, 0, 270));
        ud0Var2.setFormatter(new org.telegram.ui.is(5));
        ud0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        ud0Var3.setMinValue(i10);
        ud0Var3.setMaxValue(i11);
        ud0Var3.setWrapSelectorWheel(false);
        ud0Var3.setFormatter(new org.telegram.ui.is(6));
        linearLayout.addView(ud0Var3, w7.z5.l(0.25f, 0, 270));
        ud0Var3.setOnValueChangedListener(l0Var);
        ud0Var.setValue(31);
        ud0Var2.setValue(12);
        ud0Var3.setValue(i11);
        a(ud0Var, ud0Var2, ud0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, w03, w03));
        q4Var.addView(textView2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new m0(ud0Var, ud0Var2, ud0Var3, calendar, intCallback, z2Var, 0));
        z2Var.b(q4Var);
        return z2Var;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        String u10;
        LinearLayout linearLayout;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!pf.d.e(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    u10 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                r2 r2Var = new r2(context, str, j10, z11, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(u10);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.g6.f19707j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = t91.f29000f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    t91 t91Var = new t91(context, c6Var);
                    t91Var.setWebPage(webPage);
                    linearLayout.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                a2Var.f19257a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(r2Var, 8));
                i2.d.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            u10 = str;
            r2 r2Var2 = new r2(context, str, j10, z11, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
            a2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(u10);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.g6.f19707j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i102, c6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i102, c6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = t91.f29000f;
            if (webPage != null) {
                t91 t91Var2 = new t91(context, c6Var);
                t91Var2.setWebPage(webPage);
                linearLayout.addView(t91Var2, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            a2Var2.f19257a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(r2Var2, 8));
            i2.d.r(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        Uri parse2 = Uri.parse(str);
        if (j10 == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z15 = true;
        } else {
            z15 = false;
        }
        pf.d.q(context, parse2, z14, z11, z15, cVar, null, false, true, false);
    }

    public static void p(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (m2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(m2Var.getCurrentAccount()).getClientUserId() != user.f19063id) {
            m2Var.getCurrentAccount();
            Activity parentActivity = m2Var.getParentActivity();
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.u(AndroidUtilities.dp(12.0f));
            k9Var.f26292p = 1.0f;
            k9Var.m(m2Var.getCurrentAccount(), user);
            z9 z9Var = new z9(parentActivity);
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            z9Var.e(user, k9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(z9Var, w7.z5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
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
            frameLayout.addView(textView2, w7.z5.a(-2.0f, f7, 11.0f, i17, 0.0f, -1, i16));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, w7.z5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i15 | 48));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(m2Var, user, z10, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            m2Var.showDialog(alertDialog$Builder.f19248a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.m2 m2Var, String str, boolean z10, boolean z11) {
        q0(m2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.m2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.c6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.q(org.telegram.ui.ActionBar.m2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.m2 m2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        long j10;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            if (m2Var instanceof org.telegram.ui.fo) {
                j10 = ((org.telegram.ui.fo) m2Var).f35644f8;
            } else {
                j10 = 0;
            }
            o0(m2Var.getParentActivity(), str, z10, z11, z12, z13, j10, cVar, webPage, c6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (m2Var != null) {
            c6Var = m2Var.getResourceProvider();
        } else {
            c6Var = null;
        }
        s(m2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, c6Var);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.c1.s(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.c1.s(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.c1.s(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, c6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            l6Var.a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19655g7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(charSequence, z11);
            l6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), 2, -1));
            linearLayout.addView(l6Var);
            l6Var.setOnClickListener(new bi.x(arrayList2, runnable, alertDialog$Builder, 14));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.a2 o10 = alertDialog$Builder.o();
        if (z10) {
            o10.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.m2 r45, final boolean r46, final boolean r47, org.telegram.tgnet.TLRPC.Chat r48, final org.telegram.tgnet.TLRPC.User r49, final boolean r50, final boolean r51, boolean r52, final boolean r53, final org.telegram.messenger.MessagesStorage.BooleanCallback r54, final org.telegram.ui.ActionBar.c6 r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.s(org.telegram.ui.ActionBar.m2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (i10 != 0 && m2Var != null && m2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            m2Var.showDialog(alertDialog$Builder.f19248a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.a2 t(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.g0.c("color_", sharedPrefKey, notificationsSettings, -16776961);
            } else if (DialogObject.isChatDialog(j10)) {
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
        LinearLayout e = org.telegram.messenger.g0.e(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, c6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.y8.e[i13];
            l6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.y8.f22486f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            e.addView(l6Var);
            l6Var.setOnClickListener(new q0(e, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i16 != 0) {
                    edit.putInt(t8.b.h("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.d(j10, i10, runnable, 5));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new u2(1, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f19248a;
    }

    public static org.telegram.ui.ActionBar.a2 t0(org.telegram.ui.ActionBar.m2 m2Var, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        if (m2Var == null) {
            m2Var = LaunchActivity.U();
        }
        if (str2 != null && m2Var != null && m2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.a2 a2Var = N(m2Var.getParentActivity(), str, str2, null, null, c6Var).f19248a;
            m2Var.showDialog(a2Var);
            return a2Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.m2 m2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        a2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new m4.y0(28, str3, m2Var));
        m2Var.showDialog(a2Var);
    }

    public static org.telegram.ui.ActionBar.a2 u0(org.telegram.ui.ActionBar.m2 m2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.a2 O = O(m2Var.getContext(), m2Var.getResourceProvider(), str, charSequence, str2, runnable);
        m2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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

    public static void v0(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        Context context;
        if (str == null) {
            return;
        }
        if (m2Var != null && m2Var.getParentActivity() != null) {
            context = m2Var.getParentActivity();
        } else {
            context = ApplicationLoader.applicationContext;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, hg.b2 b2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final ud0 ud0Var = new ud0(context, null);
        final ud0 ud0Var2 = new ud0(context, null);
        final ud0 ud0Var3 = new ud0(context, null);
        linearLayout.addView(ud0Var2, w7.z5.l(0.3f, 0, -2));
        ud0Var2.setOnScrollListener(new rd0() {
            @Override
            public final void l(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(11);
        linearLayout.addView(ud0Var, w7.z5.l(0.3f, 0, -2));
        ud0Var.setFormatter(new org.telegram.ui.is(12));
        ud0Var.setOnValueChangedListener(new l0(ud0Var2, ud0Var, ud0Var3, 1));
        ud0Var.setOnScrollListener(new rd0() {
            @Override
            public final void l(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        ud0Var3.setMinValue(i10 + i16);
        ud0Var3.setMaxValue(i11 + i16);
        ud0Var3.setValue(i16 + i12);
        linearLayout.addView(ud0Var3, w7.z5.l(0.4f, 0, -2));
        ud0Var3.setOnValueChangedListener(new l0(ud0Var2, ud0Var, ud0Var3, 2));
        ud0Var3.setOnScrollListener(new rd0() {
            @Override
            public final void l(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            g5.c(ud0Var2, ud0Var, ud0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(ud0Var2, ud0Var, ud0Var3);
        if (z10) {
            c(ud0Var2, ud0Var, ud0Var3);
        }
        if (i13 != -1) {
            ud0Var2.setValue(i13);
            ud0Var.setValue(i14);
            ud0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f19248a.R = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.pk(z10, ud0Var2, ud0Var, ud0Var3, b2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.a2 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = string;
        a2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void x(Context context, String str, String str2, long j10, f5 f5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false);
        int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
        z2Var.a();
        ud0 ud0Var = new ud0(context, null);
        ud0Var.setTextColor(x02);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        ud0 ud0Var2 = new ud0(context, null);
        ud0Var2.setItemCount(5);
        ud0Var2.setTextColor(x02);
        ud0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ud0 ud0Var3 = new ud0(context, null);
        ud0Var3.setItemCount(5);
        ud0Var3.setTextColor(x02);
        ud0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ud0 ud0Var4 = ud0Var;
        y3 y3Var = new y3(context, ud0Var4, ud0Var2, ud0Var3, 1);
        y3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        y3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.g0.m(20.0f, x02, 1, textView);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new ci.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        bi.f4 f4Var = new bi.f4(context, 15);
        linearLayout.addView(ud0Var4, w7.z5.l(0.5f, 0, 270));
        ud0Var4.setMinValue(0);
        ud0Var4.setMaxValue(365);
        ud0Var4.setWrapSelectorWheel(false);
        ud0Var4.setFormatter(new org.telegram.ui.is(15));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ud0Var4, ud0Var2, ud0Var3, 18);
        ud0Var4.setOnValueChangedListener(aVar);
        ud0Var2.setMinValue(0);
        ud0Var2.setMaxValue(23);
        linearLayout.addView(ud0Var2, w7.z5.l(0.2f, 0, 270));
        ud0Var2.setFormatter(new org.telegram.ui.is(16));
        ud0Var2.setOnValueChangedListener(aVar);
        ud0Var3.setMinValue(0);
        ud0Var3.setMaxValue(59);
        ud0Var3.setValue(0);
        ud0Var3.setFormatter(new org.telegram.ui.is(17));
        linearLayout.addView(ud0Var3, w7.z5.l(0.3f, 0, 270));
        ud0Var3.setOnValueChangedListener(aVar);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                ud0Var3.setValue(calendar.get(12));
                ud0Var2.setValue(calendar.get(11));
                ud0Var4 = ud0Var4;
                ud0Var4.setValue(timeInMillis);
            } else {
                ud0Var4 = ud0Var4;
            }
        }
        f(null, null, 0L, 0L, 0, ud0Var4, ud0Var2, ud0Var3);
        f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        f4Var.setGravity(17);
        f4Var.setTextColor(x04);
        f4Var.setTextSize(1, 14.0f);
        f4Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x05, x06, x06));
        f4Var.setText(str2);
        y3Var.addView(f4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        f4Var.setOnClickListener(new m0(ud0Var4, ud0Var2, ud0Var3, calendar, f5Var, z2Var, 2));
        z2Var.b(y3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        e3Var.setBackgroundColor(x03);
        e3Var.fixNavigationBar(x03);
    }

    public static void x0(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, ud0Var2.getValue());
        calendar.set(1, ud0Var3.getValue());
        ud0Var.setMinValue(1);
        ud0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.m2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.c6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.y(org.telegram.ui.ActionBar.m2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.c6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        s30 s30Var = new s30(0, context, true);
        s30Var.setImportantForAccessibility(2);
        ah.x xVar = new ah.x(context, s30Var);
        xVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        xVar.setClipToOutline(true);
        xVar.setOutlineProvider(new bi.a2(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        xVar.addView(view, w7.z5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
        xVar.addView(s30Var, w7.z5.d(117.0f, 117));
        alertDialog$Builder.f19248a.V = xVar;
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.f19272j0 = true;
        a2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f19248a.O0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
