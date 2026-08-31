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
import org.telegram.ui.kh1;
public abstract class z4 {
    public static final Pattern f33718a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        i30 i30Var = new i30(0, context, true);
        i30Var.setImportantForAccessibility(2);
        eg.s2 s2Var = new eg.s2(context, i30Var);
        s2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        s2Var.setClipToOutline(true);
        s2Var.setOutlineProvider(new hg.j1(9));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        s2Var.addView(view, k7.c6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        s2Var.addView(i30Var, k7.c6.c(117.0f, 117));
        alertDialog$Builder.f21166a.S = s2Var;
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new k0(context, 3));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.f21246g0 = true;
        d2Var.Q0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f21166a.L0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, kh1 kh1Var, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new hg.j1(8));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, k7.c6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f21166a.S = frameLayout;
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new jh.q(5, activity, z4));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.f21246g0 = true;
        d2Var.Q0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), kh1Var);
        alertDialog$Builder.f21166a.L0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new g1(launchActivity, 1));
        return alertDialog$Builder.f21166a;
    }

    public static org.telegram.ui.ActionBar.d2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f21166a;
    }

    public static org.telegram.ui.ActionBar.d2 E(Activity activity, boolean z4, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02;
        int i10;
        int i11;
        int w03;
        int w04;
        int w05;
        boolean z10;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout h = l.d.h(activity, 1);
        h.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z4) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21766j5;
        if (g6Var != null) {
            w02 = g6Var.e0(i12);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        }
        textView.setTextColor(w02);
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
        if (z4) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        h.addView(textView, k7.c6.t(-2, -2, i14, 24, i11, 24, 8));
        for (int i15 = 0; i15 < 4; i15++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, g6Var);
            k6Var.d = 42;
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i15));
            int i16 = org.telegram.ui.ActionBar.k6.f21715g7;
            if (g6Var != null) {
                w04 = g6Var.e0(i16);
            } else {
                w04 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.k6.E5;
            if (g6Var != null) {
                w05 = g6Var.e0(i17);
            } else {
                w05 = org.telegram.ui.ActionBar.k6.w0(null, i17, false);
            }
            k6Var.a(w04, w05);
            String str = strArr[i15];
            if (iArr[0] == i15) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(str, z10);
            h.addView(k6Var);
            k6Var.setOnClickListener(new q0(iArr, h));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (g6Var != null) {
                w03 = g6Var.e0(org.telegram.ui.ActionBar.k6.L5);
            } else {
                w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false);
            }
            d2Var.Y = new nq0(activity, 0);
            d2Var.Z = w03;
        }
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new ng.w(28, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.h3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.p2 p2Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        if (p2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(p2Var.getParentActivity(), g6Var, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.Notifications);
        h3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11;
                if (i10 == 0) {
                    i11 = 0;
                } else if (i10 == 1) {
                    i11 = 1;
                } else if (i10 == 2) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                if (qc.a(p2Var2)) {
                    qc.z(p2Var2, i11, 0, g6Var).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        return h3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.g6 g6Var, y4 y4Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21766j5;
        if (g6Var != null) {
            w02 = g6Var.e0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21731h5;
        if (g6Var != null) {
            w03 = g6Var.e0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e0(i12);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.f21750i6;
        if (g6Var != null) {
            g6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            w04 = g6Var.e0(i17);
        } else {
            w04 = org.telegram.ui.ActionBar.k6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            w05 = g6Var.e0(i18);
        } else {
            w05 = org.telegram.ui.ActionBar.k6.w0(null, i18, false);
        }
        int i19 = w05;
        if (g6Var != null) {
            w06 = g6Var.e0(org.telegram.ui.ActionBar.k6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        }
        int i20 = w06;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        i4 i4Var = new i4(context, g6Var, iArr);
        i4Var.setMinValue(0);
        i4Var.setMaxValue(20);
        i4Var.setTextColor(w02);
        i4Var.setValue(0);
        i4Var.setFormatter(new f1(0, iArr));
        e4 e4Var = new e4(context, i4Var, 1);
        e4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hg.q qVar = new hg.q(context, 18);
        linearLayout.addView(i4Var, k7.c6.l(1.0f, 0, 270));
        i4Var.setOnValueChangedListener(new org.telegram.ui.as(9));
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, i19, i20, i20));
        qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        e4Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new lh.u3(iArr, i4Var, y4Var, c3Var, 4));
        c3Var.b(e4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
        h3Var.show();
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f21166a.O = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.w0(null, i10, false), hashMap);
        alertDialog$Builder.f21166a.T = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f21166a.Q = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        String[] strArr;
        boolean z4;
        final long j12 = j10;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout h = l.d.h(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, g6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i14));
            k6Var.a(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21715g7, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z4 = true;
            } else {
                z4 = false;
            }
            k6Var.b(str, z4);
            h.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f21166a.I0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
        }
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f21166a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, oh.b bVar) {
        if (activity != null) {
            lh.t tVar = new lh.t(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(activity, bVar, true, false);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            h3Var.bigTitle = true;
            x2 x2Var = new x2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, tVar, 0);
            h3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            h3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            h3Var.onClickListener = x2Var;
            h3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.c3 K(final Context context, final long j10, long j11, int i10, boolean z4, final y4 y4Var, Runnable runnable, x4 x4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        FrameLayout frameLayout;
        int i11;
        boolean[] zArr;
        Context context2;
        ViewGroup viewGroup;
        FrameLayout frameLayout2;
        ?? r82;
        char c3;
        long j12;
        FrameLayout frameLayout3;
        TextView textView;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i12;
        ij0 ij0Var;
        Calendar calendar;
        int i13;
        int i14;
        int[] iArr;
        String[] strArr;
        org.telegram.ui.ActionBar.w0 w0Var2;
        ij0 ij0Var2;
        int i15;
        ViewGroup viewGroup3;
        int[] iArr2;
        Calendar calendar2;
        TextView textView2;
        TextView textView3;
        org.telegram.ui.ih ihVar;
        View view;
        final org.telegram.ui.ActionBar.h3 h3Var;
        int i16;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        final ?? yc0Var = new yc0(context, g6Var);
        int i17 = x4Var.f32944a;
        int i18 = x4Var.f32946c;
        int i19 = x4Var.f32945b;
        yc0Var.setTextColor(i17);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        final ?? yc0Var2 = new yc0(context, g6Var);
        yc0Var2.setWrapSelectorWheel(true);
        yc0Var2.setAllItemsCount(24);
        yc0Var2.setItemCount(5);
        yc0Var2.setTextColor(i17);
        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? yc0Var3 = new yc0(context, g6Var);
        yc0Var3.setWrapSelectorWheel(true);
        yc0Var3.setAllItemsCount(60);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextColor(i17);
        yc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? s3Var = new s3(context, yc0Var, yc0Var2, yc0Var3, 0);
        s3Var.setClipToPadding(false);
        s3Var.setClipChildren(false);
        s3Var.setOrientation(1);
        frameLayout4.addView((View) s3Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        s3Var.addView(frameLayout6, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView4 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            frameLayout = frameLayout5;
            textView4.setText((CharSequence) null);
        } else {
            frameLayout = frameLayout5;
            if (j10 == clientUserId) {
                textView4.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView4.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        }
        org.telegram.messenger.y3.t(textView4, i17, 1, 20.0f);
        frameLayout6.addView(textView4, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView4.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        boolean[] zArr2 = {true};
        if (DialogObject.isUserDialog(j10) && j10 != clientUserId && (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) != null && !user.bot && (userStatus = user.status) != null && userStatus.expires > 0) {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            i11 = i19;
            zArr = zArr2;
            viewGroup = frameLayout4;
            frameLayout2 = frameLayout;
            r82 = 0;
            c3 = '\t';
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            viewGroup2 = s3Var;
            textView = null;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, x4Var.f32944a, false, g6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(i18, 1, -1));
            frameLayout3.addView(w0Var, k7.c6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            i11 = i19;
            zArr = zArr2;
            context2 = context;
            viewGroup = frameLayout4;
            frameLayout2 = frameLayout;
            r82 = 0;
            c3 = '\t';
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            textView = null;
            viewGroup2 = s3Var;
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.setOnClickListener(new org.telegram.messenger.video.g(26, w0Var, x4Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(y4Var, zArr, c3Var, 14));
        }
        ?? imageView = new ImageView(context2);
        ij0 ij0Var3 = new ij0(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        ij0Var3.H(true);
        ij0Var3.h = true;
        ij0Var3.start();
        ij0Var3.K(40);
        ij0Var3.N(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ij0Var3);
        imageView.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(i18, 1, -1));
        if (w0Var != null) {
            i12 = 42;
        } else {
            i12 = 0;
        }
        frameLayout3.addView(imageView, k7.c6.d(40, 40.0f, 53, 0.0f, 8.0f, i12 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final hg.q qVar = new hg.q(context2, 13);
        linearLayout.addView(yc0Var, k7.c6.l(0.5f, r82, 270));
        yc0Var.setMinValue(r82);
        yc0Var.setMaxValue(365);
        yc0Var.setWrapSelectorWheel(r82);
        yc0Var.setFormatter(new org.telegram.ui.as(29));
        ViewGroup viewGroup4 = viewGroup2;
        final boolean[] zArr3 = zArr;
        final long j13 = j12;
        int i20 = i11;
        wc0 wc0Var = new wc0() {
            @Override
            public final void q(yc0 yc0Var4, int i21) {
                int i22;
                if (j13 == j10) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                z4.g(hg.q.this, null, 0L, 0L, i22, yc0Var, yc0Var2, yc0Var3);
            }
        };
        yc0Var.setOnValueChangedListener(wc0Var);
        yc0Var2.setMinValue(r82);
        yc0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(yc0Var2, k7.c6.l(0.2f, r82, 270));
        yc0Var2.setFormatter(new k2(r82));
        yc0Var2.setOnValueChangedListener(wc0Var);
        yc0Var3.setMinValue(r82);
        yc0Var3.setMaxValue(59);
        yc0Var3.setValue(r82);
        yc0Var3.setFormatter(new k2(1));
        linearLayout.addView(yc0Var3, k7.c6.l(0.3f, 0, 270));
        yc0Var3.setOnValueChangedListener(wc0Var);
        if (j11 > 0 && j11 != 2147483646) {
            long j14 = 1000 * j11;
            calendar = calendar3;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            ij0Var = ij0Var3;
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                yc0Var3.setValue(calendar.get(12));
                yc0Var2.setValue(calendar.get(11));
                yc0Var.setValue(timeInMillis);
            }
        } else {
            ij0Var = ij0Var3;
            calendar = calendar3;
        }
        final boolean[] zArr4 = {true};
        if (j13 == j10) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        g(qVar, null, 0L, 0L, i13, yc0Var, yc0Var2, yc0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            i14 = 10;
            iArr = new int[10];
            iArr[0] = 0;
            iArr[1] = 60;
            iArr[2] = 300;
            iArr[3] = 86400;
            iArr[4] = 604800;
            iArr[5] = 1209600;
            iArr[6] = 2592000;
            iArr[7] = 7862400;
            iArr[8] = 15724800;
            iArr[c3] = 31536000;
        } else {
            i14 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
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
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[]{LocaleController.getString(R.string.MessageScheduledRepeatOptionNever), LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily), LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly), LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly), LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly), LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly)};
        }
        String[] strArr2 = strArr;
        if (!z4) {
            ?? frameLayout7 = new FrameLayout(context2);
            int v = org.telegram.ui.ActionBar.k6.v(i20, org.telegram.ui.ActionBar.k6.l1(0.075f, i17));
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.1f, i17);
            int[] iArr4 = iArr;
            textView3 = new TextView(context2);
            ij0Var2 = ij0Var;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(i17);
            textView3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.k6.v(v, l1);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v, v10, v10));
            textView3.setGravity(17);
            i15 = i20;
            w0Var2 = w0Var3;
            org.telegram.ui.ih ihVar2 = new org.telegram.ui.ih(iArr4, iArr3, strArr2, textView3, 8);
            iArr2 = iArr4;
            ihVar2.run();
            frameLayout7.addView(textView3, k7.c6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ViewGroup viewGroup5 = viewGroup4;
            viewGroup5.addView((View) frameLayout7, k7.c6.n(-1, -2));
            calendar2 = calendar;
            ihVar = ihVar2;
            textView2 = frameLayout7;
            viewGroup3 = viewGroup5;
        } else {
            w0Var2 = w0Var3;
            ij0Var2 = ij0Var;
            i15 = i20;
            viewGroup3 = viewGroup4;
            iArr2 = iArr;
            calendar2 = calendar;
            textView2 = textView;
            textView3 = textView2;
            ihVar = textView3;
        }
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(x4Var.f32949g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, x4Var.h));
        viewGroup3.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        int i21 = i15;
        final Calendar calendar4 = calendar2;
        qVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i22;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                yc0 yc0Var4 = yc0Var;
                q3 q3Var = yc0Var2;
                r3 r3Var = yc0Var3;
                boolean g10 = z4.g(null, null, 0L, 0L, i22, yc0Var4, q3Var, r3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, yc0Var4.getValue());
                calendar5.set(11, q3Var.getValue());
                calendar5.set(12, r3Var.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z10 = zArr3[0];
                y4Var.I((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z10);
                runnable2 = c3Var.f21207a.dismissRunnable;
                runnable2.run();
            }
        });
        c3Var.b(viewGroup);
        org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.f21207a;
        h3Var2.show();
        h3Var2.setOnDismissListener(new m2(runnable, zArr4));
        h3Var2.setBackgroundColor(i21);
        h3Var2.fixNavigationBar(i21);
        if (textView3 != null) {
            view = imageView;
            i16 = 1;
            h3Var = h3Var2;
            textView3.setOnClickListener(new a2(frameLayout2, g6Var, h3Var2, (FrameLayout) textView2, iArr2, strArr2, iArr3, (org.telegram.ui.ih) ihVar));
        } else {
            view = imageView;
            h3Var = h3Var2;
            i16 = 1;
        }
        final qh.f3[] f3VarArr = new qh.f3[i16];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        final ij0 ij0Var4 = ij0Var2;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                int i22;
                String string;
                int i23;
                int i24;
                int i25;
                int i26;
                boolean[] zArr5 = zArr3;
                boolean z10 = zArr5[0];
                zArr5[0] = !z10;
                ij0 ij0Var5 = ij0Var4;
                if (!z10) {
                    if (ij0Var5.Y >= 40) {
                        ij0Var5.K(0);
                    }
                    ij0Var5.N(40);
                    ij0Var5.start();
                } else {
                    if (ij0Var5.Y < 40) {
                        ij0Var5.K(40);
                    }
                    ij0Var5.N(80);
                    ij0Var5.start();
                }
                qh.f3[] f3VarArr2 = f3VarArr;
                qh.f3 f3Var = f3VarArr2[0];
                if (f3Var != null) {
                    f3Var.e(true);
                    f3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                qh.f3 f3Var2 = new qh.f3(context, 3);
                f3VarArr2[0] = f3Var2;
                f3Var2.s();
                f3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                f3Var2.r(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.k6.l1(0.25f, -16777216);
                f3Var2.f45295f0 = dp2;
                f3Var2.f45296g0 = dp3;
                f3Var2.f45297h0 = l12;
                f3Var2.C.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i26 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i26 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i26);
                } else if (chat == null && user2 != null) {
                    if (j15 == j13) {
                        if (zArr5[0]) {
                            i24 = R.string.ScheduleNotifyOnSelf;
                        } else {
                            i24 = R.string.ScheduleNotifyOffSelf;
                        }
                        string = LocaleController.getString(i24);
                    } else {
                        if (zArr5[0]) {
                            i23 = R.string.ScheduleNotifyOnChat;
                        } else {
                            i23 = R.string.ScheduleNotifyOffChat;
                        }
                        string = LocaleController.formatString(i23, UserObject.getForcedFirstName(user2));
                    }
                } else {
                    if (zArr5[0]) {
                        i22 = R.string.ScheduleNotifyOnGroup;
                    } else {
                        i22 = R.string.ScheduleNotifyOffGroup;
                    }
                    string = LocaleController.getString(i22);
                }
                f3Var2.t(string);
                f3Var2.d = 5000L;
                if (w0Var4 != null) {
                    i25 = 42;
                } else {
                    i25 = -8;
                }
                f3Var2.m(1.0f, -(i25 + 20));
                f3Var2.f45298i0 = new fg(f3Var2, 2);
                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                h3Var3.getContainerView().setClipToPadding(false);
                h3Var3.getContainerView().setClipChildren(false);
                h3Var3.getContainerView().addView(f3Var2, k7.c6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                f3Var2.v();
            }
        });
        return c3Var;
    }

    public static void L(Context context, long j10, y4 y4Var) {
        K(context, j10, -1L, 0, false, y4Var, null, new x4(null), null);
    }

    public static void M(Context context, long j10, y4 y4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        K(context, j10, -1L, 0, false, y4Var, null, new x4(g6Var), g6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = str;
        d2Var.Q = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new z0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 P(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = str;
        d2Var.Q = charSequence;
        alertDialog$Builder.k(str2, new z0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f21166a;
    }

    public static org.telegram.ui.ActionBar.p1 Q(org.telegram.ui.ActionBar.p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (p2Var != null && view != null) {
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            p1Var.f22218e = true;
            p1Var.f22217c = 220;
            p1Var.setOutsideTouchable(true);
            p1Var.setClippingEnabled(true);
            p1Var.setAnimationStyle(R.style.PopupContextAnimation);
            p1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            p1Var.setInputMethodMode(2);
            p1Var.getContentView().setFocusableInTouchMode(true);
            float f12 = 0.0f;
            View view2 = view;
            float f13 = 0.0f;
            while (view2 != view.getRootView()) {
                f12 += view2.getX();
                f13 += view2.getY();
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
            }
            p1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            p1Var.b();
            return p1Var;
        }
        return null;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = str6;
        d2Var.Q = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21894q6, g6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new b2(editTextBoldCursor, i10, stringCallback, d2VarArr, view2, 0));
        editTextBoldCursor.addTextChangedListener(new u3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, k7.c6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f21166a.f21235a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new e3.d(editTextBoldCursor, i10, stringCallback, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.as(19));
        d2VarArr[0] = alertDialog$Builder.f21166a;
        if (p2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, p2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
        d2Var2.f21243e0 = false;
        d2Var2.setOnDismissListener(new lh.i(editTextBoldCursor, p2Var, findActivity, 2));
        d2VarArr[0].setOnShowListener(new e1(1, editTextBoldCursor));
        d2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), g6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.c3 T(Context context, long j10, final y4 y4Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i15 = org.telegram.ui.ActionBar.k6.f21750i6;
        org.telegram.ui.ActionBar.k6.w0(null, i15, false);
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        final yc0 yc0Var = new yc0(context, g6Var);
        yc0Var.setTextColor(w02);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        final ?? yc0Var2 = new yc0(context, g6Var);
        yc0Var2.setWrapSelectorWheel(true);
        yc0Var2.setAllItemsCount(24);
        yc0Var2.setItemCount(5);
        yc0Var2.setTextColor(w02);
        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? yc0Var3 = new yc0(context, g6Var);
        yc0Var3.setWrapSelectorWheel(true);
        yc0Var3.setAllItemsCount(60);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextColor(w02);
        yc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        s3 s3Var = new s3(context, yc0Var, yc0Var2, yc0Var3, 5);
        s3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        s3Var.addView(f10, k7.c6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i10 == 1) {
            i11 = R.string.SuggestedPostAcceptTitle;
        } else {
            i11 = R.string.PostSuggestionsAddTime;
        }
        textView.setText(LocaleController.getString(i11));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(textView, k7.c6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22053z6, g6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        f10.addView(textView2, k7.c6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final hg.q qVar = new hg.q(context, 19);
        linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
        yc0Var.setMinValue(0);
        yc0Var.setMaxValue(365);
        yc0Var.setWrapSelectorWheel(false);
        yc0Var.setFormatter(new d4.b(i16, 4));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        wc0 wc0Var = new wc0() {
            @Override
            public final void q(yc0 yc0Var4, int i17) {
                z4.g(hg.q.this, null, j11, j12, i12, yc0Var, yc0Var2, yc0Var3);
            }
        };
        yc0Var.setOnValueChangedListener(wc0Var);
        yc0Var2.setMinValue(0);
        yc0Var2.setMaxValue(23);
        linearLayout.addView((View) yc0Var2, k7.c6.l(0.2f, 0, 270));
        yc0Var2.setFormatter(new org.telegram.ui.as(14));
        yc0Var2.setOnValueChangedListener(wc0Var);
        yc0Var3.setMinValue(0);
        yc0Var3.setMaxValue(59);
        yc0Var3.setValue(0);
        yc0Var3.setFormatter(new org.telegram.ui.as(15));
        linearLayout.addView((View) yc0Var3, k7.c6.l(0.3f, 0, 270));
        yc0Var3.setOnValueChangedListener(wc0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            i13 = w03;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                yc0Var3.setValue(calendar.get(12));
                yc0Var2.setValue(calendar.get(11));
                yc0Var.setValue(timeInMillis);
            }
        } else {
            i13 = w03;
        }
        final boolean[] zArr = {true};
        g(qVar, null, j11, j12, i12, yc0Var, yc0Var2, yc0Var3);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, w05));
        s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i12;
        qVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i18 = i17;
                yc0 yc0Var4 = yc0Var;
                p4 p4Var = yc0Var2;
                q4 q4Var = yc0Var3;
                boolean g10 = z4.g(null, null, j14, j15, i18, yc0Var4, p4Var, q4Var);
                long epochMilli = LocalDate.now().plusDays(yc0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, p4Var.getValue());
                calendar2.set(12, q4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                y4Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = c3Var.f21207a.dismissRunnable;
                runnable.run();
            }
        });
        k7.e6.b(qVar, 0.02f, 1.2f);
        hg.q qVar2 = new hg.q(context, 20);
        qVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar2.setGravity(17);
        if (i10 == 1) {
            i14 = R.string.MessageSuggestionPublishNow;
        } else {
            i14 = R.string.PostSuggestionsAnytime;
        }
        qVar2.setText(LocaleController.getString(i14));
        qVar2.setTextColor(w05);
        qVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false);
        int w07 = org.telegram.ui.ActionBar.k6.w0(null, i15, false);
        qVar2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w06, w07, w07));
        s3Var.addView(qVar2, k7.c6.t(-1, 48, 83, 16, 0, 16, 16));
        qVar2.setOnClickListener(new eg.o(zArr, y4Var, c3Var, 15));
        k7.e6.b(qVar2, 0.02f, 1.2f);
        c3Var.b(s3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
        h3Var.show();
        h3Var.setOnDismissListener(new eg.c0(zArr));
        h3Var.setBackgroundColor(i13);
        h3Var.fixNavigationBar(i13);
        return c3Var;
    }

    public static org.telegram.ui.ActionBar.d2 U(org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        URLSpan[] uRLSpanArr;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return null;
        }
        g90 g90Var = new g90(p2Var.getParentActivity(), p2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h4(p2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        g90Var.setText(spannableString);
        g90Var.setTextSize(1, 16.0f);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21784k5, g6Var));
        g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21802l5, g6Var));
        g90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        g90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var);
        alertDialog$Builder.n(g90Var);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new p2(1, p2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f21166a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.MessageLifetime);
        yc0 yc0Var = new yc0(context, null);
        yc0Var.setMinValue(0);
        yc0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            yc0Var.setValue(i10);
        } else if (i10 == 30) {
            yc0Var.setValue(16);
        } else if (i10 == 60) {
            yc0Var.setValue(17);
        } else if (i10 == 3600) {
            yc0Var.setValue(18);
        } else if (i10 == 86400) {
            yc0Var.setValue(19);
        } else if (i10 == 604800) {
            yc0Var.setValue(20);
        } else if (i10 == 0) {
            yc0Var.setValue(0);
        }
        yc0Var.setFormatter(new k2(5));
        alertDialog$Builder.n(yc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new o1(3, encryptedChat, yc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.p2 p2Var, int i10, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i11;
        String sb;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21960u5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21978v5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new k2(6));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.y3.q(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f21766j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new dg.a0(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        w.c.l(9306112, hashMap, "Berry", 14598550, "Brandy");
        w.c.l(8391495, hashMap, "Cherry", 16744272, "Coral");
        w.c.l(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        w.c.l(14725375, hashMap, "Mauve", 16761035, "Pink");
        w.c.l(16711680, hashMap, "Red", 16711807, "Rose");
        w.c.l(8406555, hashMap, "Russet", 16720896, "Scarlet");
        w.c.l(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        w.c.l(16760576, hashMap, "Amber", 15438707, "Apricot");
        w.c.l(16508850, hashMap, "Banana", 10601738, "Citrus");
        w.c.l(11560192, hashMap, "Ginger", 16766720, "Gold");
        w.c.l(16640272, hashMap, "Lemon", 16753920, "Orange");
        w.c.l(16770484, hashMap, "Peach", 16739155, "Persimmon");
        w.c.l(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        w.c.l(16763004, hashMap, "Topaz", 16776960, "Yellow");
        w.c.l(3688720, hashMap, "Clover", 8628829, "Cucumber");
        w.c.l(5294200, hashMap, "Emerald", 11907932, "Olive");
        w.c.l(65280, hashMap, "Green", 43115, "Jade");
        w.c.l(2730887, hashMap, "Jungle", 12582656, "Lime");
        w.c.l(776785, hashMap, "Malachite", 10026904, "Mint");
        w.c.l(11394989, hashMap, "Moss", 3234721, "Azure");
        w.c.l(255, hashMap, "Blue", 18347, "Cobalt");
        w.c.l(5204422, hashMap, "Indigo", 96647, "Lagoon");
        w.c.l(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        w.c.l(128, hashMap, "Navy", 3101086, "Sapphire");
        w.c.l(7788522, hashMap, "Sky", 32896, "Teal");
        w.c.l(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        w.c.l(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        w.c.l(13148872, hashMap, "Lilac", 11894492, "Lavender");
        w.c.l(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        w.c.l(6684825, hashMap, "Purple", 14204888, "Thistle");
        w.c.l(14315734, hashMap, "Orchid", 2361920, "Violet");
        w.c.l(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        w.c.l(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        w.c.l(7365973, hashMap, "Coffee", 7956873, "Rum");
        w.c.l(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        w.c.l(12759680, hashMap, "Sand", 8924439, "Sienna");
        w.c.l(7864585, hashMap, "Maple", 15787660, "Khaki");
        w.c.l(12088115, hashMap, "Copper", 12144200, "Chestnut");
        w.c.l(15653316, hashMap, "Almond", 16776656, "Cream");
        w.c.l(12186367, hashMap, "Diamond", 11109127, "Honey");
        w.c.l(16777200, hashMap, "Ivory", 15392968, "Pearl");
        w.c.l(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        w.c.l(16777215, hashMap, "White", 8421504, "Gray");
        w.c.l(0, hashMap, "Black", 15266260, "Chrome");
        w.c.l(3556687, hashMap, "Charcoal", 789277, "Ebony");
        w.c.l(12632256, hashMap, "Silver", 16119285, "Smoke");
        w.c.l(2499381, hashMap, "Steel", 5220413, "Apple");
        w.c.l(8434628, hashMap, "Glacier", 16693933, "Melon");
        w.c.l(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (i6Var == null) {
            i6Var2 = org.telegram.ui.ActionBar.k6.A0().k(false);
        } else {
            i6Var2 = i6Var;
        }
        if (i6Var2 == null || (i11 = i6Var2.f21469c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.r0())[0];
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
            sb = android.support.v4.media.a.p((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder f10 = w.c.f(str, " ");
            f10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb = f10.toString();
        }
        editTextBoldCursor.setText(sb);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        e1 e1Var = new e1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.setOnShowListener(e1Var);
        p2Var.showDialog(d2Var);
        editTextBoldCursor.requestFocus();
        d2Var.d(-1).setOnClickListener(new oh.b0(p2Var, editTextBoldCursor, i6Var, j6Var, d2Var, 8));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(activity, null, false, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        ?? yc0Var = new yc0(activity, null);
        n3 n3Var = new n3(activity, yc0Var);
        n3Var.setOrientation(0);
        n3Var.setWeightSum(1.0f);
        yc0Var.setAllItemsCount(24);
        yc0Var.setItemCount(5);
        yc0Var.setTextColor(w02);
        yc0Var.setGravity(5);
        yc0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? yc0Var2 = new yc0(activity, null);
        yc0Var2.setWrapSelectorWheel(true);
        yc0Var2.setAllItemsCount(60);
        yc0Var2.setItemCount(5);
        yc0Var2.setTextColor(w02);
        yc0Var2.setGravity(3);
        yc0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final mh.h3 h3Var2 = new mh.h3(i11, i12, (m3) yc0Var, (o3) yc0Var2, i10, n3Var);
        n3Var.addView((View) yc0Var, k7.c6.l(0.5f, 0, 270));
        yc0Var.setFormatter(new org.telegram.ui.as(27));
        yc0Var.setOnValueChangedListener(new wc0() {
            @Override
            public final void q(yc0 yc0Var3, int i13) {
                switch (r2) {
                    case 0:
                        h3Var2.run(Boolean.TRUE);
                        return;
                    default:
                        h3Var2.run(Boolean.TRUE);
                        return;
                }
            }
        });
        n3Var.addView((View) yc0Var2, k7.c6.l(0.5f, 0, 270));
        yc0Var2.setFormatter(new org.telegram.ui.as(28));
        yc0Var2.setOnValueChangedListener(new wc0() {
            @Override
            public final void q(yc0 yc0Var3, int i13) {
                switch (r2) {
                    case 0:
                        h3Var2.run(Boolean.TRUE);
                        return;
                    default:
                        h3Var2.run(Boolean.TRUE);
                        return;
                }
            }
        });
        h3Var2.run(Boolean.FALSE);
        p3 p3Var = new p3(activity, yc0Var, yc0Var2);
        p3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        p3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        p3Var.addView(n3Var, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        qh.d dVar = new qh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new i2(r1, 0));
        p3Var.addView(dVar, k7.c6.t(-1, 48, 0, 16, 12, 16, 12));
        h3Var.customView = p3Var;
        h3Var.show();
        h3Var.setOnDismissListener(new lh.i(callback, yc0Var, yc0Var2, 3));
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
    }

    public static org.telegram.ui.ActionBar.d2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        String[] strArr;
        boolean z4;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout h = l.d.h(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, g6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i12));
            k6Var.a(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21715g7, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z4 = true;
            } else {
                z4 = false;
            }
            k6Var.b(str3, z4);
            h.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j10;
                    String str4 = str2;
                    if (j12 != 0) {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i13 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i13 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i13 == 3) {
                            edit.putInt(str4, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                    } else {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i14 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i14 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i14 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i14 == 4) {
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
                    alertDialog$Builder.f21166a.I0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f21166a;
    }

    public static org.telegram.ui.ActionBar.d2 Z(Context context, org.telegram.ui.ActionBar.g6 g6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z4;
        int i11;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            for (String str3 : strArr) {
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
        if (z4) {
            str = str2;
        }
        alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(str);
        if (z4) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new o9.b(z4, context, atomicBoolean, aVar, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new ng.w(27, atomicBoolean, aVar));
        alertDialog$Builder.f21166a.setOnDismissListener(new hg.g(4, atomicBoolean, aVar));
        return alertDialog$Builder.f21166a;
    }

    public static void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j10, Utilities.Callback callback) {
        b0(i10, j10, i11, callback, 0L);
    }

    public static void b(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
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
        yc0Var3.setMaxValue(i16);
        yc0Var3.setMinValue(i13);
        int value = yc0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        yc0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        yc0Var2.setMinValue(i11);
        int value2 = yc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        yc0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        yc0Var.setMinValue(i12);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.g6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        mh.t7.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final r2 r2Var = new r2(i10, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(j10, "ask_paid_message_", "_price"), 0L)) {
                r2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new oh.b();
            }
            org.telegram.ui.ActionBar.g6 g6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j10);
            if (ChatObject.isMonoForum(i10, j10)) {
                shortName = bg.e.h(i10, j10);
            } else if (U instanceof org.telegram.ui.xn) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) U;
                if (xnVar.f43156d4 && xnVar.a() == j10 && (chat = xnVar.f43143c4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f20843id);
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
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        int i13 = i10;
                        SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                        long j14 = j10;
                        edit.putLong(e2.c.i(j14, "ask_paid_message_", "_price"), j13).apply();
                        mh.t7.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(r2Var);
                }
            }, g6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static long c(qh.d dVar, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, yc0 yc0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((yc0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (yc0Var2.getValue() - 120) % 12);
        yc0Var.setMinValue(1);
        yc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = yc0Var.getValue();
        int value3 = yc0Var3.getValue();
        int value4 = yc0Var4.getValue();
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

    public static boolean c0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.g6 bVar;
        boolean z4 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j10 = 0;
        int i12 = 0;
        boolean z10 = true;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            Long l10 = (Long) obj;
            long j11 = j10;
            long longValue = l10.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
            }
            hashMap.put(l10, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            mh.t7.y(i10, z4).P.put(l10, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z10 && MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z10 = false;
            }
            j10 = j12;
            z4 = false;
        }
        long max = Math.max(1, i11) * j10;
        if (!z10 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new oh.b();
            }
            org.telegram.ui.ActionBar.g6 g6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.uq(i10, max, activity, arrayList, hashMap, callback, g6Var), g6Var, true);
            return true;
        }
        callback.run(hashMap);
        return false;
    }

    public static void d(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        yc0Var3.setMinValue(i12);
        int value = yc0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        yc0Var2.setMinValue(i10);
        int value2 = yc0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        yc0Var.setMinValue(i11);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(e2.c.i(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void e(TextView textView, yc0 yc0Var, y3 y3Var, z3 z3Var) {
        String str;
        String str2;
        int value = yc0Var.getValue();
        int value2 = y3Var.getValue();
        int value3 = z3Var.getValue();
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

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            String obj = editTextBoldCursor.getText().toString();
            int i10 = org.telegram.ui.ActionBar.k6.f21598a;
            org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            j6Var.f21505b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            j6Var.f21503a = obj;
            org.telegram.ui.ActionBar.k6.f21726h0 = org.telegram.ui.ActionBar.k6.Y0(org.telegram.ui.ActionBar.k6.I.f21513f0);
            j6Var.B = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.k6.r1(j6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(p2Var.getParentActivity(), j6Var);
            d2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(p2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public static void f(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
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
                        if (user.f20990id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f20990id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f20990id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new eg.d3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d2 f0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.p2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.f0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.d2");
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        long j12;
        int i11;
        long j13;
        int i12;
        int i13;
        int i14;
        long j14;
        int i15;
        int i16;
        boolean z4;
        boolean z10;
        String formatPluralString;
        int i17;
        int i18;
        int i19;
        int value = yc0Var.getValue();
        int value2 = yc0Var2.getValue();
        int value3 = yc0Var3.getValue();
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
            i13 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i12 = 23;
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
        yc0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            yc0Var.setMaxValue(i13);
        }
        int value4 = yc0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        yc0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i13) {
                i19 = i12;
            } else {
                i19 = 23;
            }
            yc0Var2.setMaxValue(i19);
        }
        int value5 = yc0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        yc0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i13 && value5 == i12) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            yc0Var3.setMaxValue(i18);
        }
        int value6 = yc0Var3.getValue();
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
                z10 = false;
                formatPluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i26 / 86400.0f), new Object[0]);
            } else {
                z10 = false;
                z10 = false;
                z10 = false;
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
                z4 = true;
                Object[] objArr = new Object[1];
                objArr[z10 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i27, objArr));
            } else {
                z4 = true;
                int i28 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z10 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i28, objArr2));
            }
        } else {
            z4 = true;
            z10 = false;
        }
        if (timeInMillis - j12 > j15) {
            return z4;
        }
        return z10;
    }

    public static void g0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, sm smVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21766j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21894q6, g6Var));
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
                a4 a4Var = a4.this;
                String trim = a4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = z4.f33718a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(a4Var);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                if (d2Var2 != null) {
                    d2Var2.dismiss();
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, k7.c6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = u81.f31601f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            u81 u81Var = new u81(context, g6Var);
            u81Var.setWebPage(webPage);
            linearLayout.addView(u81Var, k7.c6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f21235a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new o1(1, editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.as(26));
        if (smVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new z0(4, smVar));
        }
        d2VarArr[0] = d2Var;
        d2Var.f21243e0 = false;
        d2Var.setOnDismissListener(new b1(editTextBoldCursor, 2));
        d2VarArr[0].setOnShowListener(new tt(2, editTextBoldCursor));
        d2VarArr[0].show();
        TextView textView = (TextView) d2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z4) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z4) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f20843id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f20843id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
                }
                if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    z4 = true;
                }
            }
            if (z4) {
                N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && p2Var != null && p2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.O = string;
            String str = tL_error.text;
            str.getClass();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2120721660:
                    if (str.equals("CHANNELS_ADMIN_LOCATED_TOO_MUCH")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -2012133105:
                    if (str.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1763467626:
                    if (str.equals("USERS_TOO_FEW")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -538116776:
                    if (str.equals("USER_BLOCKED")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -512775857:
                    if (str.equals("USER_RESTRICTED")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -454039871:
                    if (str.equals("PEER_FLOOD")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case -420079733:
                    if (str.equals("BOTS_TOO_MUCH")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 98635865:
                    if (str.equals("USER_KICKED")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 517420851:
                    if (str.equals("USER_BOT")) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 845559454:
                    if (str.equals("YOU_BLOCKED_USER")) {
                        c3 = '\t';
                        break;
                    }
                    break;
                case 916342611:
                    if (str.equals("USER_ADMIN_INVALID")) {
                        c3 = '\n';
                        break;
                    }
                    break;
                case 1047173446:
                    if (str.equals("CHAT_ADMIN_BAN_REQUIRED")) {
                        c3 = 11;
                        break;
                    }
                    break;
                case 1167301807:
                    if (str.equals("USERS_TOO_MUCH")) {
                        c3 = '\f';
                        break;
                    }
                    break;
                case 1227003815:
                    if (str.equals("USER_ID_INVALID")) {
                        c3 = '\r';
                        break;
                    }
                    break;
                case 1253103379:
                    if (str.equals("ADMINS_TOO_MUCH")) {
                        c3 = 14;
                        break;
                    }
                    break;
                case 1355367367:
                    if (str.equals("CHANNELS_TOO_MUCH")) {
                        c3 = 15;
                        break;
                    }
                    break;
                case 1377621075:
                    if (str.equals("USER_CHANNELS_TOO_MUCH")) {
                        c3 = 16;
                        break;
                    }
                    break;
                case 1623167701:
                    if (str.equals("USER_NOT_MUTUAL_CONTACT")) {
                        c3 = 17;
                        break;
                    }
                    break;
                case 1754587486:
                    if (str.equals("CHAT_ADMIN_INVITE_REQUIRED")) {
                        c3 = 18;
                        break;
                    }
                    break;
                case 1916725894:
                    if (str.equals("USER_PRIVACY_RESTRICTED")) {
                        c3 = 19;
                        break;
                    }
                    break;
                case 1965565720:
                    if (str.equals("USER_ALREADY_PARTICIPANT")) {
                        c3 = 20;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    d2Var.Q = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    d2Var.Q = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    d2Var.Q = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    d2Var.Q = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    d2Var.Q = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new p2(0, p2Var));
                    break;
                case 6:
                    if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        d2Var.Q = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    d2Var.Q = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    d2Var.Q = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    d2Var.O = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    d2Var.O = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    d2Var.Q = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    d2Var.Q = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z10) {
                        d2Var.Q = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z4) {
                        d2Var.Q = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    d2Var.O = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    d2Var.Q = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    org.telegram.ui.b.i(R.string.ErrorOccurred, "\n", sb);
                    sb.append(tL_error.text);
                    d2Var.Q = sb.toString();
                    break;
            }
            l.d.C(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.d2 i(Activity activity, w4 w4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f21166a.I0;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        LinearLayout h = l.d.h(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f23039f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                z8 z8Var = kVar.f23038e;
                z8Var.m(i10, currentUser);
                kVar.f23035a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                p9 p9Var = kVar.f23037c;
                p9Var.getImageReceiver().setCurrentAccount(i10);
                p9Var.e(currentUser, z8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                h.addView(kVar, k7.c6.n(-1, 50));
                kVar.setOnClickListener(new eg.o(d2VarArr, s1Var, w4Var, 16));
            }
        }
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2VarArr[0] = d2Var;
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int dp;
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = new boolean[1];
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
        textView.setTextSize(1, 16.0f);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        v4 v4Var = new v4(activity, z1VarArr);
        alertDialog$Builder.f21166a.D = 6;
        alertDialog$Builder.n(v4Var);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.E8, g6Var, textView2, 1, 20.0f);
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
        v4Var.addView(textView2, k7.c6.d(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        v4Var.addView(textView, k7.c6.d(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, g6Var);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 7, AndroidUtilities.dp(12.0f)));
            z1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            layoutParams.gravity = i15 | 16;
            z1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            z1VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
            if (LocaleController.isRTL) {
                i14 = AndroidUtilities.dp(4.0f);
            } else {
                i14 = 0;
            }
            int dp2 = AndroidUtilities.dp(12.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            z1Var2.setPadding(i14, dp2, dp, AndroidUtilities.dp(12.0f));
            v4Var.addView(z1VarArr[0], k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new t0(5, zArr));
        }
        alertDialog$Builder.k(str2, new o1(7, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        if (z4) {
            d2Var.U0 = true;
        }
        d2Var.show();
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 j(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f21166a;
    }

    public static void j0(org.telegram.ui.ActionBar.p2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.j0(org.telegram.ui.ActionBar.p2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static void k(Context context, org.telegram.ui.ActionBar.g6 g6Var, y4 y4Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21766j5;
        if (g6Var != null) {
            w02 = g6Var.e0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21731h5;
        if (g6Var != null) {
            w03 = g6Var.e0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        }
        int i12 = w03;
        int i13 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.f21750i6;
        if (g6Var != null) {
            g6Var.e0(i17);
        } else {
            org.telegram.ui.ActionBar.k6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            w04 = g6Var.e0(i18);
        } else {
            w04 = org.telegram.ui.ActionBar.k6.w0(null, i18, false);
        }
        int i19 = w04;
        int i20 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            w05 = g6Var.e0(i20);
        } else {
            w05 = org.telegram.ui.ActionBar.k6.w0(null, i20, false);
        }
        int i21 = w05;
        if (g6Var != null) {
            w06 = g6Var.e0(org.telegram.ui.ActionBar.k6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        }
        int i22 = w06;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        d4 d4Var = new d4(context, g6Var, iArr);
        d4Var.setMinValue(0);
        d4Var.setMaxValue(16);
        d4Var.setTextColor(w02);
        d4Var.setValue(0);
        d4Var.setFormatter(new f1(1, iArr));
        e4 e4Var = new e4(context, d4Var, 0);
        e4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 1);
        linearLayout.addView(d4Var, k7.c6.l(1.0f, 0, 270));
        t3Var.setPadding(0, 0, 0, 0);
        t3Var.setGravity(17);
        t3Var.setTextColor(i19);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        t3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, i21, i22, i22));
        e4Var.addView(t3Var, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        d4Var.setOnValueChangedListener(new t(t3Var, 10));
        t3Var.setOnClickListener(new lh.u3(iArr, d4Var, y4Var, c3Var, 6));
        c3Var.b(e4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
        h3Var.show();
        h3Var.setBackgroundColor(i12);
        h3Var.fixNavigationBar(i12);
    }

    public static void k0(org.telegram.ui.xn xnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ng ngVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (xnVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = xnVar.getAccountInstance();
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, g6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.M0 = false;
                d2Var.K = new b1(ngVar, 0);
                d2Var.O = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(xnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(xnVar.getParentActivity(), 1, g6Var)};
                z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                z1VarArr[0].setTag(0);
                z1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                org.telegram.ui.Cells.z1 z1Var = z1VarArr[0];
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
                z1Var.setPadding(dp, 0, dp2, 0);
                linearLayout.addView(z1VarArr[0], k7.c6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new c1(z1VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new hg.d0(user, accountInstance, xnVar, chat, messageObject, z1VarArr, g6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                xnVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        if (org.telegram.ui.ActionBar.k6.A0().q()) {
            i10 = R.raw.permission_map_dark;
        } else {
            i10 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i10);
        if (org.telegram.ui.ActionBar.k6.A0().q()) {
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
        frameLayout.addView(view, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, k7.c6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        p9Var.e(user, new z8(0, user));
        frameLayout.addView(p9Var, k7.c6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.S = frameLayout;
        d2Var.L0 = 0.37820512f;
        alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.c6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, k7.c6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false)));
        frameLayout.addView(frameLayout2, k7.c6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, 20.0f);
        org.telegram.messenger.y3.r(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView i12 = org.telegram.ui.yh.i(f10, textView, k7.c6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        i12.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        i12.setTextSize(1, 14.0f);
        i12.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        i12.setGravity(17);
        f10.addView(i12, k7.c6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        qh.d dVar = new qh.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        f10.addView(dVar, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        o10.customView = f10;
        dVar.setOnClickListener(new org.telegram.ui.rd(i10, dVar, o10, j10));
        o10.fixNavigationBar();
        o10.show();
    }

    public static org.telegram.ui.ActionBar.c3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        float f10;
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
        c3Var.a();
        yc0 yc0Var = new yc0(context, g6Var);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        yc0 yc0Var2 = new yc0(context, g6Var);
        yc0Var2.setItemCount(5);
        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        yc0 yc0Var3 = new yc0(context, g6Var);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        w3 w3Var = new w3(context, yc0Var, yc0Var2, yc0Var3);
        w3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        w3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i12 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i13 = calendar.get(5);
        int i14 = calendar.get(2);
        int i15 = calendar.get(1);
        int i16 = i15 + 1;
        u2 u2Var = new u2(yc0Var3, i16, yc0Var, yc0Var2, i15, i14, i13);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(yc0Var, k7.c6.l(0.25f, 0, 270));
        yc0Var.setMinValue(1);
        yc0Var.setMaxValue(31);
        yc0Var.setWrapSelectorWheel(false);
        yc0Var.setFormatter(new k2(7));
        t tVar = new t(u2Var, 9);
        yc0Var.setOnScrollListener(tVar);
        yc0Var2.setMinValue(0);
        yc0Var2.setMaxValue(11);
        yc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
        yc0Var2.setFormatter(new k2(8));
        yc0Var2.setOnScrollListener(tVar);
        yc0Var3.setMinValue(i12);
        yc0Var3.setMaxValue(i16);
        yc0Var3.setWrapSelectorWheel(false);
        yc0Var3.setFormatter(new d4.b(i16, 5));
        linearLayout.addView(yc0Var3, k7.c6.l(0.25f, 0, 270));
        yc0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            yc0Var.setValue(tL_birthday.day);
            yc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                yc0Var3.setValue(tL_birthday.year);
            } else {
                yc0Var3.setValue(i16);
            }
        } else {
            yc0Var.setValue(calendar.get(5));
            yc0Var2.setValue(calendar.get(2));
            yc0Var3.setValue(i16);
        }
        u2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            g90 g90Var = new g90(context, null);
            g90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            g90Var.setTextSize(1, 13.0f);
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21893q5, g6Var));
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
            g90Var.setGravity(17);
            frameLayout2.addView(g90Var, k7.c6.e(-2, -2, 17));
            w3Var.addView(frameLayout2, k7.c6.n(-1, -2));
            int i17 = UserConfig.selectedAccount;
            af.b bVar = new af.b(i17, g90Var, 26);
            bVar.run();
            f10 = 8.0f;
            NotificationCenter.getInstance(i17).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new v2(bVar, 0));
            ContactsController.getInstance(i17).loadPrivacySettings();
        } else {
            f10 = 8.0f;
        }
        if (z4) {
            qh.d dVar = new qh.d(context, g6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new eg.k2(yc0Var3, i16, u2Var, 9));
            w3Var.addView(dVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(f10);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, v03, v03));
        k7.e6.a(textView2);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 15;
        }
        if (z10) {
            i11 = 0;
        } else {
            i11 = 16;
        }
        w3Var.addView(textView2, k7.c6.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new mh.s8(yc0Var, yc0Var2, yc0Var3, i16, c3Var, callback));
        if (z10) {
            qh.d dVar2 = new qh.d(context, g6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new org.telegram.messenger.video.g(29, c3Var, callback));
            w3Var.addView(dVar2, k7.c6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        c3Var.b(w3Var);
        return c3Var;
    }

    public static void m0(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        String formatPluralString;
        if (str != null && str.startsWith("FLOOD_WAIT") && p2Var != null && p2Var.getParentActivity() != null) {
            int intValue = Utilities.parseInt((CharSequence) str).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            p2Var.showDialog(d2Var, true, null);
        }
    }

    public static void n(org.telegram.ui.ActionBar.p2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.n(org.telegram.ui.ActionBar.p2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.addView(new mh.g4(context, tL_starGiftUnique, userOrChat), k7.c6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 16.0f);
        org.telegram.ui.b.o(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        f10.addView(textView, k7.c6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new z0(2, runnable));
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = p2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        g90 g90Var = new g90(context, null);
        NotificationCenter.listenEmojiLoading(g90Var);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21720gc, false));
        g90Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g90Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f21166a.D = 6;
        alertDialog$Builder.n(frameLayout);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.u(AndroidUtilities.dp(18.0f));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(p9Var, k7.c6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
        l5Var.setTextSize(20);
        l5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.l(user.first_name, false);
        if (user.scam) {
            l5Var.i(org.telegram.ui.ActionBar.k6.f21709g1);
        } else if (user.fake) {
            l5Var.i(org.telegram.ui.ActionBar.k6.f21727h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22056z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A9, false), mode));
            l5Var.i(new pq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21820m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new u0(user, p2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        oq oqVar = new oq(R.drawable.attach_arrow_right, 0);
        oqVar.setTopOffset(1);
        oqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(oqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        int i21 = 76;
        if (z4) {
            i15 = 21;
        } else {
            i15 = 76;
        }
        float f10 = i15;
        if (z4) {
            i16 = 76;
        } else {
            i16 = 21;
        }
        frameLayout.addView(l5Var, k7.c6.d(-1, -2.0f, i20, f10, 0.0f, i16, 0.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i17 = 5;
        } else {
            i17 = 3;
        }
        int i22 = i17 | 48;
        if (z10) {
            i18 = 21;
        } else {
            i18 = 76;
        }
        float f11 = i18;
        if (!z10) {
            i21 = 21;
        }
        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, i22, f11, 24.0f, i21, 0.0f));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(g90Var, k7.c6.d(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            z8Var.f33803p = 0.8f;
            z8Var.g(12);
            p9Var.h(null, null, z8Var, user);
        } else {
            z8Var.f33803p = 1.0f;
            z8Var.m(p2Var.getCurrentAccount(), user);
            p9Var.e(user, z8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new z0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener s0Var = new s0(3, runnable2);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        p2Var.showDialog(d2Var, false, s0Var);
        g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(0, context, d2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, boolean z4, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, g6Var);
        z1Var.setMultiline(true);
        z1Var.getTextView().getLayoutParams().width = -1;
        z1Var.getTextView().setSingleLine(false);
        z1Var.getTextView().setMaxLines(3);
        z1Var.getTextView().setTextSize(1, 16.0f);
        if (z4) {
            i10 = R.string.BrowserAlwaysOpenExternal;
        } else {
            i10 = R.string.BrowserAlwaysOpenInApp;
        }
        z1Var.e(LocaleController.getString(i10), "", false, false, false);
        z1Var.setOnClickListener(new g0(z1Var, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, k7.c6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(z1Var, k7.c6.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f21166a.f21235a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
                        if (d2Var3 != null) {
                            d2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
                        if (d2Var3 != null) {
                            d2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        d2VarArr[0] = alertDialog$Builder.o();
    }

    public static org.telegram.ui.ActionBar.c3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(activity, g6Var);
        c3Var.a();
        yc0 yc0Var = new yc0(activity, g6Var);
        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var.setItemCount(5);
        yc0 yc0Var2 = new yc0(activity, g6Var);
        yc0Var2.setItemCount(5);
        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        yc0 yc0Var3 = new yc0(activity, g6Var);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        j4 j4Var = new j4(activity, yc0Var, yc0Var2, yc0Var3);
        j4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        j4Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        j4Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(yc0Var, k7.c6.l(0.25f, 0, 270));
        yc0Var.setMinValue(1);
        yc0Var.setMaxValue(31);
        yc0Var.setWrapSelectorWheel(false);
        yc0Var.setFormatter(new org.telegram.ui.as(5));
        m0 m0Var = new m0(yc0Var, yc0Var2, yc0Var3, 0);
        yc0Var.setOnValueChangedListener(m0Var);
        yc0Var2.setMinValue(0);
        yc0Var2.setMaxValue(11);
        yc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
        yc0Var2.setFormatter(new org.telegram.ui.as(6));
        yc0Var2.setOnValueChangedListener(m0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        yc0Var3.setMinValue(i10);
        yc0Var3.setMaxValue(i11);
        yc0Var3.setWrapSelectorWheel(false);
        yc0Var3.setFormatter(new org.telegram.ui.as(7));
        linearLayout.addView(yc0Var3, k7.c6.l(0.25f, 0, 270));
        yc0Var3.setOnValueChangedListener(m0Var);
        yc0Var.setValue(31);
        yc0Var2.setValue(12);
        yc0Var3.setValue(i11);
        b(yc0Var, yc0Var2, yc0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, v03, v03));
        j4Var.addView(textView2, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new hg.e(yc0Var, yc0Var2, yc0Var3, calendar, (Object) intCallback, c3Var, 1));
        c3Var.b(j4Var);
        return c3Var;
    }

    public static void p0(Context context, String str, boolean z4, boolean z10, boolean z11, boolean z12, long j10, af.f fVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        String scheme;
        boolean z13;
        boolean z14;
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
        if (!af.g.f(Uri.parse(str), false, null) && z11 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z4) {
                try {
                    Uri parse = Uri.parse(str);
                    v = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                } catch (Exception e6) {
                    FileLog.e((Throwable) e6, false);
                }
                o2 o2Var = new o2(context, str, j10, z10, fVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.k6.f21766j5;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, k7.c6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = u81.f31601f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    u81 u81Var = new u81(context, g6Var);
                    u81Var.setWebPage(webPage);
                    linearLayout.addView(u81Var, k7.c6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                d2Var.f21235a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new t(o2Var, 8));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            v = str;
            o2 o2Var2 = new o2(context, str, j10, z10, fVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
            d2Var2.O = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.k6.f21766j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i102, g6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i102, g6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, k7.c6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = u81.f31601f;
            if (webPage != null) {
                u81 u81Var2 = new u81(context, g6Var);
                u81Var2.setWebPage(webPage);
                linearLayout.addView(u81Var2, k7.c6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            d2Var2.f21235a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new t(o2Var2, 8));
            l.d.u(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        Uri parse2 = Uri.parse(str);
        if (j10 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$")) {
            z14 = true;
        } else {
            z14 = false;
        }
        af.g.r(context, parse2, z13, z10, z14, fVar, null, false, true, false);
    }

    public static void q(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, boolean z4) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (p2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId() != user.f20990id) {
            p2Var.getCurrentAccount();
            Activity parentActivity = p2Var.getParentActivity();
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            if (z4) {
                string = LocaleController.getString(R.string.VideoCallAlertTitle);
                formatString = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
            } else {
                string = LocaleController.getString(R.string.CallAlertTitle);
                formatString = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
            }
            TextView textView = new TextView(parentActivity);
            NotificationCenter.listenEmojiLoading(textView);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            z8Var.f33803p = 1.0f;
            z8Var.m(p2Var.getCurrentAccount(), user);
            p9 p9Var = new p9(parentActivity);
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            p9Var.e(user, z8Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(p9Var, k7.c6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
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
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            int i17 = 76;
            if (z10) {
                i14 = 21;
            } else {
                i14 = 76;
            }
            float f10 = i14;
            if (!z10) {
                i17 = 21;
            }
            frameLayout.addView(textView2, k7.c6.d(-1, -2.0f, i16, f10, 11.0f, i17, 0.0f));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, k7.c6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(p2Var, user, z4, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            p2Var.showDialog(alertDialog$Builder.f21166a);
        }
    }

    public static void q0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z4, boolean z10) {
        r0(p2Var, str, z4, true, z10, false, null, null, null);
    }

    public static void r(org.telegram.ui.ActionBar.p2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.r(org.telegram.ui.ActionBar.p2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static void r0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z4, boolean z10, boolean z11, boolean z12, af.f fVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        long j10;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (p2Var instanceof org.telegram.ui.xn) {
                j10 = ((org.telegram.ui.xn) p2Var).f43147c8;
            } else {
                j10 = 0;
            }
            p0(p2Var.getParentActivity(), str, z4, z10, z11, z12, j10, fVar, webPage, g6Var);
        }
    }

    public static void s(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, TLRPC.Chat chat, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (p2Var != null) {
            g6Var = p2Var.getResourceProvider();
        } else {
            g6Var = null;
        }
        t(p2Var, z4, false, chat, user, z10, z11, z12, z13, booleanCallback, g6Var);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.yh.q(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.yh.q(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.yh.q(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, g6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i12));
            k6Var.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21715g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(charSequence, z10);
            k6Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 2, -1));
            linearLayout.addView(k6Var);
            k6Var.setOnClickListener(new eg.o(arrayList2, runnable, alertDialog$Builder, 17));
        }
        if (!z4) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
        if (z4) {
            o10.setCanceledOnTouchOutside(false);
        }
    }

    public static void t(final org.telegram.ui.ActionBar.p2 r44, final boolean r45, final boolean r46, org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.MessagesStorage.BooleanCallback r53, final org.telegram.ui.ActionBar.g6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.t(org.telegram.ui.ActionBar.p2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        if (i10 != 0 && p2Var != null && p2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            p2Var.showDialog(alertDialog$Builder.f21166a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.d2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        boolean z4;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.y3.c("color_", sharedPrefKey, notificationsSettings, -16776961);
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
        LinearLayout h = l.d.h(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, g6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.u8.f24223e[i13];
            k6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.u8.f24224f[i13]) {
                z4 = true;
            } else {
                z4 = false;
            }
            k6Var.b(str, z4);
            h.addView(k6Var);
            k6Var.setOnClickListener(new q0(h, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(h);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(org.telegram.ui.yh.k("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                } else {
                    int i16 = i10;
                    if (i16 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i16 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i16 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i16 != 5 && i16 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i16);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new k3.d(runnable, i10, j10, 3));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new o1(5, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f21166a;
    }

    public static org.telegram.ui.ActionBar.d2 u0(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        if (p2Var == null) {
            p2Var = LaunchActivity.U();
        }
        if (str2 != null && p2Var != null && p2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.d2 d2Var = O(p2Var.getParentActivity(), str, str2, null, null, g6Var).f21166a;
            p2Var.showDialog(d2Var);
            return d2Var;
        }
        return null;
    }

    public static void v(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new o1(2, str3, p2Var));
        p2Var.showDialog(d2Var);
    }

    public static org.telegram.ui.ActionBar.d2 v0(org.telegram.ui.ActionBar.p2 p2Var, String str, CharSequence charSequence, String str2, boolean z4, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.d2 P = P(p2Var.getContext(), p2Var.getResourceProvider(), str, charSequence, str2, runnable);
        p2Var.showDialog(P);
        if (z4 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
        alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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

    public static void w0(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        Context context;
        if (str == null) {
            return;
        }
        if (p2Var != null && p2Var.getParentActivity() != null) {
            context = p2Var.getParentActivity();
        } else {
            context = ApplicationLoader.applicationContext;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z4, e3.d dVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final yc0 yc0Var = new yc0(context, null);
        final yc0 yc0Var2 = new yc0(context, null);
        final yc0 yc0Var3 = new yc0(context, null);
        linearLayout.addView(yc0Var2, k7.c6.l(0.3f, 0, -2));
        yc0Var2.setOnScrollListener(new vc0() {
            @Override
            public final void g(int i16) {
                switch (r5) {
                    case 0:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        yc0Var.setMinValue(0);
        yc0Var.setMaxValue(11);
        linearLayout.addView(yc0Var, k7.c6.l(0.3f, 0, -2));
        yc0Var.setFormatter(new org.telegram.ui.as(13));
        yc0Var.setOnValueChangedListener(new m0(yc0Var2, yc0Var, yc0Var3, 1));
        yc0Var.setOnScrollListener(new vc0() {
            @Override
            public final void g(int i16) {
                switch (r5) {
                    case 0:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z4 && i16 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        yc0Var3.setMinValue(i10 + i16);
        yc0Var3.setMaxValue(i11 + i16);
        yc0Var3.setValue(i16 + i12);
        linearLayout.addView(yc0Var3, k7.c6.l(0.4f, 0, -2));
        yc0Var3.setOnValueChangedListener(new m0(yc0Var2, yc0Var, yc0Var3, 2));
        yc0Var3.setOnScrollListener(new vc0() {
            @Override
            public final void g(int i162) {
                switch (r5) {
                    case 0:
                        if (z4 && i162 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z4 && i162 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z4 && i162 == 0) {
                            z4.d(yc0Var2, yc0Var, yc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        y0(yc0Var2, yc0Var, yc0Var3);
        if (z4) {
            d(yc0Var2, yc0Var, yc0Var3);
        }
        if (i13 != -1) {
            yc0Var2.setValue(i13);
            yc0Var.setValue(i14);
            yc0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f21166a.O = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.dk(z4, yc0Var2, yc0Var, yc0Var3, dVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 x0(Context context, String str, boolean z4) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z4) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new k0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, y4 y4Var) {
        yc0 yc0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false);
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
        c3Var.a();
        yc0 yc0Var2 = new yc0(context, null);
        yc0Var2.setTextColor(w02);
        yc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        yc0Var2.setItemCount(5);
        yc0 yc0Var3 = new yc0(context, null);
        yc0Var3.setItemCount(5);
        yc0Var3.setTextColor(w02);
        yc0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
        yc0 yc0Var4 = new yc0(context, null);
        yc0Var4.setItemCount(5);
        yc0Var4.setTextColor(w02);
        yc0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
        s3 s3Var = new s3(context, yc0Var2, yc0Var3, yc0Var4, 1);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.y3.t(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        hg.q qVar = new hg.q(context, 14);
        linearLayout.addView(yc0Var2, k7.c6.l(0.5f, 0, 270));
        yc0Var2.setMinValue(0);
        yc0Var2.setMaxValue(365);
        yc0Var2.setWrapSelectorWheel(false);
        yc0Var2.setFormatter(new org.telegram.ui.as(16));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(yc0Var2, yc0Var3, yc0Var4, 13);
        yc0Var2.setOnValueChangedListener(aVar);
        yc0Var3.setMinValue(0);
        yc0Var3.setMaxValue(23);
        linearLayout.addView(yc0Var3, k7.c6.l(0.2f, 0, 270));
        yc0Var3.setFormatter(new org.telegram.ui.as(17));
        yc0Var3.setOnValueChangedListener(aVar);
        yc0Var4.setMinValue(0);
        yc0Var4.setMaxValue(59);
        yc0Var4.setValue(0);
        yc0Var4.setFormatter(new org.telegram.ui.as(18));
        linearLayout.addView(yc0Var4, k7.c6.l(0.3f, 0, 270));
        yc0Var4.setOnValueChangedListener(aVar);
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
                yc0Var4.setValue(calendar.get(12));
                yc0Var3.setValue(calendar.get(11));
                yc0Var = yc0Var2;
                yc0Var.setValue(timeInMillis);
            } else {
                yc0Var = yc0Var2;
            }
        } else {
            yc0Var = yc0Var2;
        }
        yc0 yc0Var5 = yc0Var;
        g(null, null, 0L, 0L, 0, yc0Var5, yc0Var3, yc0Var4);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w04);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w05, w06, w06));
        qVar.setText(str2);
        s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new hg.e(yc0Var5, yc0Var3, yc0Var4, calendar, (Object) y4Var, c3Var, 3));
        c3Var.b(s3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
        h3Var.show();
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
    }

    public static void y0(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, yc0Var2.getValue());
        calendar.set(1, yc0Var3.getValue());
        yc0Var.setMinValue(1);
        yc0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void z(final org.telegram.ui.ActionBar.p2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.g6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z4.z(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.g6):void");
    }
}
