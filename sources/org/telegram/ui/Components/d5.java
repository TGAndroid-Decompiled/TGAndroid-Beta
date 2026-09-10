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
import org.telegram.ui.hi1;
public abstract class d5 {
    public static final Pattern f22289a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        p30 p30Var = new p30(0, context, true);
        p30Var.setImportantForAccessibility(2);
        bi.ld ldVar = new bi.ld(context, p30Var);
        ldVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        ldVar.setClipToOutline(true);
        ldVar.setOutlineProvider(new bi.g(10));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        ldVar.addView(view, w7.a6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        ldVar.addView(p30Var, w7.a6.c(117.0f, 117));
        alertDialog$Builder.f17528a.V = ldVar;
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new l0(context, 3));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.f17624j0 = true;
        d2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f17528a.O0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, hi1 hi1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bi.g(9));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.a6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f17528a.V = frameLayout;
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new gg.d0(6, activity, z10));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.f17624j0 = true;
        d2Var.T0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), hi1Var);
        alertDialog$Builder.f17528a.O0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new j1(launchActivity, 1));
        return alertDialog$Builder.f17528a;
    }

    public static org.telegram.ui.ActionBar.d2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f17528a;
    }

    public static org.telegram.ui.ActionBar.d2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        int w02;
        int i10;
        int i11;
        int w03;
        int w04;
        int w05;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        if (f6Var != null) {
            w02 = f6Var.e0(i12);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
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
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        f7.addView(textView, w7.a6.t(-2, -2, i14, 24, i11, 24, 8));
        for (int i15 = 0; i15 < 4; i15++) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.d = 42;
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i15));
            int i16 = org.telegram.ui.ActionBar.j6.f17983g7;
            if (f6Var != null) {
                w04 = f6Var.e0(i16);
            } else {
                w04 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.j6.E5;
            if (f6Var != null) {
                w05 = f6Var.e0(i17);
            } else {
                w05 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
            }
            m6Var.a(w04, w05);
            String str = strArr[i15];
            if (iArr[0] == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            m6Var.b(str, z11);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new s0(iArr, f7));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        if (z10) {
            d2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (f6Var != null) {
                w03 = f6Var.e0(org.telegram.ui.ActionBar.j6.L5);
            } else {
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false);
            }
            d2Var.f17613b0 = new tq0(activity, 0);
            d2Var.f17616c0 = w03;
        }
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new org.telegram.ui.oe(15, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.h3 F(final long j3, final long j10, final org.telegram.ui.ActionBar.p2 p2Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) p2Var.getParentActivity(), f6Var, false);
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
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j3, j10, i11);
                org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                if (wc.a(p2Var2)) {
                    wc.z(p2Var2, i11, 0, f6Var).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        return h3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.f6 f6Var, c5 c5Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        if (f6Var != null) {
            w02 = f6Var.e0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.j6.f17998h5;
        if (f6Var != null) {
            w03 = f6Var.e0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.e0(i12);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.f18017i6;
        if (f6Var != null) {
            f6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.Sh;
        if (f6Var != null) {
            w04 = f6Var.e0(i17);
        } else {
            w04 = org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.Oh;
        if (f6Var != null) {
            w05 = f6Var.e0(i18);
        } else {
            w05 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        }
        int i19 = w05;
        if (f6Var != null) {
            w06 = f6Var.e0(org.telegram.ui.ActionBar.j6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        }
        int i20 = w06;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        m4 m4Var = new m4(context, f6Var, iArr);
        m4Var.setMinValue(0);
        m4Var.setMaxValue(20);
        m4Var.setTextColor(w02);
        m4Var.setValue(0);
        m4Var.setFormatter(new i1(0, iArr));
        i4 i4Var = new i4(context, m4Var, 1);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        di.h hVar = new di.h(context, 18);
        linearLayout.addView(m4Var, w7.a6.l(1.0f, 0, 270));
        m4Var.setOnValueChangedListener(new b(6));
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(w04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i19, i20, i20));
        hVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        i4Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        hVar.setOnClickListener(new di.o(iArr, m4Var, c5Var, c3Var, 5));
        c3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f17528a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.j6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.j6.w0(null, i10, false), hashMap);
        alertDialog$Builder.f17528a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f17528a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 I(Activity activity, long j3, final long j10, int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        boolean z10;
        final long j11 = j3;
        final int i11 = i10;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i14));
            m6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17983g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            m6Var.b(str, z10);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f17528a.L0.run();
                    runnable.run();
                }
            });
            i14++;
            j11 = j3;
            i11 = i10;
        }
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f17528a;
    }

    public static void J(int i10, Activity activity, long j3, TLRPC.Photo photo, zh.b bVar) {
        if (activity != null) {
            z2 z2Var = new z2(i10, j3, photo, activity, bVar);
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.f6) bVar, true);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            h3Var.bigTitle = true;
            a3 a3Var = new a3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, z2Var, 0);
            h3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            h3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            h3Var.onClickListener = a3Var;
            h3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.c3 K(final Context context, final long j3, long j10, int i10, boolean z10, final c5 c5Var, Runnable runnable, b5 b5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        ?? r82;
        int i12;
        boolean[] zArr;
        long j11;
        FrameLayout frameLayout3;
        TextView textView;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i13;
        t3 t3Var;
        int i14;
        char c10;
        int i15;
        int[] iArr;
        String[] strArr;
        int i16;
        final Calendar calendar;
        int[] iArr2;
        org.telegram.ui.ActionBar.w0 w0Var2;
        ViewGroup viewGroup3;
        int i17;
        float f7;
        String[] strArr2;
        View view;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        View view2;
        final org.telegram.ui.ActionBar.h3 h3Var;
        int i18;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        final ?? dd0Var = new dd0(context, f6Var);
        int i19 = b5Var.f21721a;
        int i20 = b5Var.f21723c;
        int i21 = b5Var.f21722b;
        dd0Var.setTextColor(i19);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        final ?? dd0Var2 = new dd0(context, f6Var);
        dd0Var2.setWrapSelectorWheel(true);
        dd0Var2.setAllItemsCount(24);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextColor(i19);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? dd0Var3 = new dd0(context, f6Var);
        dd0Var3.setWrapSelectorWheel(true);
        dd0Var3.setAllItemsCount(60);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextColor(i19);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? v3Var = new v3(context, dd0Var, dd0Var2, dd0Var3, 0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout4.addView((View) v3Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        v3Var.addView(frameLayout6, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView5 = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            frameLayout = frameLayout5;
            textView5.setText((CharSequence) null);
        } else {
            frameLayout = frameLayout5;
            if (j3 == clientUserId) {
                textView5.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView5.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        }
        org.telegram.messenger.a2.q(textView5, i19, 1, 20.0f);
        frameLayout6.addView(textView5, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new ai.h(10));
        boolean[] zArr2 = {true};
        if (DialogObject.isUserDialog(j3) && j3 != clientUserId && (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3))) != null && !user.bot && (userStatus = user.status) != null && userStatus.expires > 0) {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout4;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            j11 = clientUserId;
            frameLayout3 = frameLayout6;
            viewGroup2 = v3Var;
            textView = null;
            i11 = i21;
            zArr = zArr2;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, b5Var.f21721a, false, f6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(i20, 1, -1));
            frameLayout3.addView(w0Var, w7.a6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            context2 = context;
            viewGroup = frameLayout4;
            i11 = i21;
            frameLayout2 = frameLayout;
            r82 = 0;
            i12 = -1;
            zArr = zArr2;
            j11 = clientUserId;
            frameLayout3 = frameLayout6;
            textView = null;
            viewGroup2 = v3Var;
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.setOnClickListener(new org.telegram.ui.sh(8, w0Var, b5Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(c5Var, zArr, c3Var, 17));
        }
        ?? imageView = new ImageView(context2);
        final hj0 hj0Var = new hj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.start();
        hj0Var.M(40);
        hj0Var.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(hj0Var);
        imageView.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i20, 1, i12));
        if (w0Var != null) {
            i13 = 42;
        } else {
            i13 = 0;
        }
        frameLayout3.addView(imageView, w7.a6.d(40, 40.0f, 53, 0.0f, 8.0f, i13 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final di.h hVar = new di.h(context2, 13);
        linearLayout.addView(dd0Var, w7.a6.l(0.5f, r82, 270));
        dd0Var.setMinValue(r82);
        dd0Var.setMaxValue(365);
        dd0Var.setWrapSelectorWheel(r82);
        dd0Var.setFormatter(new b(26));
        ViewGroup viewGroup4 = viewGroup2;
        final boolean[] zArr3 = zArr;
        final long j12 = j11;
        int i22 = i11;
        bd0 bd0Var = new bd0() {
            @Override
            public final void q(dd0 dd0Var4, int i23) {
                int i24;
                if (j12 == j3) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                d5.g(di.h.this, null, 0L, 0L, i24, dd0Var, dd0Var2, dd0Var3);
            }
        };
        dd0Var.setOnValueChangedListener(bd0Var);
        dd0Var2.setMinValue(r82);
        dd0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(dd0Var2, w7.a6.l(0.2f, r82, 270));
        dd0Var2.setFormatter(new b(27));
        dd0Var2.setOnValueChangedListener(bd0Var);
        dd0Var3.setMinValue(r82);
        dd0Var3.setMaxValue(59);
        dd0Var3.setValue(r82);
        dd0Var3.setFormatter(new b(28));
        linearLayout.addView(dd0Var3, w7.a6.l(0.3f, r82, 270));
        dd0Var3.setOnValueChangedListener(bd0Var);
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
                dd0Var3.setValue(calendar2.get(12));
                t3Var = dd0Var2;
                t3Var.setValue(calendar2.get(11));
                dd0Var.setValue(timeInMillis);
            } else {
                t3Var = dd0Var2;
            }
        } else {
            t3Var = dd0Var2;
        }
        final boolean[] zArr4 = {true};
        if (j12 == j3) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        final t3 t3Var2 = t3Var;
        g(hVar, null, 0L, 0L, i14, dd0Var, t3Var2, dd0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i15 = 10;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i15 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[i15];
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
            ?? frameLayout7 = new FrameLayout(context2);
            int v = org.telegram.ui.ActionBar.j6.v(i22, org.telegram.ui.ActionBar.j6.l1(0.075f, i19));
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i19);
            textView4 = new TextView(context2);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i19);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v9 = org.telegram.ui.ActionBar.j6.v(v, l1);
            textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v, v9, v9));
            textView4.setGravity(17);
            calendar = calendar2;
            i16 = i22;
            int[] iArr4 = iArr;
            w0Var2 = w0Var3;
            view = imageView;
            i17 = 17;
            f7 = 34.0f;
            strArr2 = strArr;
            ?? daVar = new org.telegram.ui.da(iArr4, iArr3, strArr2, textView4, 13);
            iArr2 = iArr4;
            daVar.run();
            frameLayout7.addView(textView4, w7.a6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ViewGroup viewGroup5 = viewGroup4;
            viewGroup5.addView((View) frameLayout7, w7.a6.n(-1, -2));
            textView3 = daVar;
            textView2 = frameLayout7;
            viewGroup3 = viewGroup5;
        } else {
            i16 = i22;
            calendar = calendar2;
            iArr2 = iArr;
            w0Var2 = w0Var3;
            viewGroup3 = viewGroup4;
            i17 = 17;
            f7 = 34.0f;
            strArr2 = strArr;
            view = imageView;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        }
        ?? r53 = textView2;
        ?? r54 = textView3;
        hVar.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
        hVar.setGravity(i17);
        hVar.setTextColor(b5Var.f21725g);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        hVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{24.0f}, b5Var.h));
        viewGroup3.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        View view3 = view;
        hVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i23;
                Runnable runnable2;
                zArr4[0] = false;
                if (j12 == j3) {
                    i23 = 1;
                } else {
                    i23 = 0;
                }
                dd0 dd0Var4 = dd0Var;
                t3 t3Var3 = t3Var2;
                u3 u3Var = dd0Var3;
                boolean g10 = d5.g(null, null, 0L, 0L, i23, dd0Var4, t3Var3, u3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar3 = calendar;
                calendar3.setTimeInMillis(currentTimeMillis);
                calendar3.add(6, dd0Var4.getValue());
                calendar3.set(11, t3Var3.getValue());
                calendar3.set(12, u3Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                boolean z11 = zArr3[0];
                c5Var.I((int) (calendar3.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = c3Var.f17571a.dismissRunnable;
                runnable2.run();
            }
        });
        c3Var.b(viewGroup);
        String[] strArr3 = strArr2;
        org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.f17571a;
        h3Var2.show();
        h3Var2.setOnDismissListener(new o2(runnable, zArr4));
        h3Var2.setBackgroundColor(i16);
        h3Var2.fixNavigationBar(i16);
        if (textView4 != null) {
            view2 = view3;
            i18 = 1;
            h3Var = h3Var2;
            textView4.setOnClickListener(new b2(frameLayout2, f6Var, h3Var2, (FrameLayout) r53, iArr2, strArr3, iArr3, (org.telegram.ui.da) r54));
        } else {
            view2 = view3;
            h3Var = h3Var2;
            i18 = 1;
        }
        final bi.x4[] x4VarArr = new bi.x4[i18];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i23;
                String string;
                int i24;
                int i25;
                int i26;
                int i27;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                hj0 hj0Var2 = hj0Var;
                if (!z11) {
                    if (hj0Var2.f23648b0 >= 40) {
                        hj0Var2.M(0);
                    }
                    hj0Var2.P(40);
                    hj0Var2.start();
                } else {
                    if (hj0Var2.f23648b0 < 40) {
                        hj0Var2.M(40);
                    }
                    hj0Var2.P(80);
                    hj0Var2.start();
                }
                bi.x4[] x4VarArr2 = x4VarArr;
                bi.x4 x4Var = x4VarArr2[0];
                if (x4Var != null) {
                    x4Var.e(true);
                    x4VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j14 = j3;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j14));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j14));
                bi.x4 x4Var2 = new bi.x4(context, 3);
                x4VarArr2[0] = x4Var2;
                x4Var2.r();
                x4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                x4Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.j6.l1(0.25f, -16777216);
                x4Var2.f3887i0 = dp2;
                x4Var2.f3888j0 = dp3;
                x4Var2.f3889k0 = l12;
                x4Var2.F.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i27 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i27 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i27);
                } else if (chat == null && user2 != null) {
                    if (j14 == j12) {
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
                x4Var2.s(string);
                x4Var2.d = 5000L;
                if (w0Var4 != null) {
                    i26 = 42;
                } else {
                    i26 = -8;
                }
                x4Var2.l(1.0f, -(i26 + 20));
                x4Var2.f3890l0 = new rg(x4Var2, 2);
                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                h3Var3.getContainerView().setClipToPadding(false);
                h3Var3.getContainerView().setClipChildren(false);
                h3Var3.getContainerView().addView(x4Var2, w7.a6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                x4Var2.u();
            }
        });
        return c3Var;
    }

    public static void L(Context context, long j3, c5 c5Var) {
        K(context, j3, -1L, 0, false, c5Var, null, new b5(null), null);
    }

    public static void M(Context context, long j3, c5 c5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        K(context, j3, -1L, 0, false, c5Var, null, new b5(f6Var), f6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = str;
        d2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new b1(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 P(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = str;
        d2Var.T = charSequence;
        alertDialog$Builder.k(str2, new b1(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f17528a;
    }

    public static org.telegram.ui.ActionBar.p1 Q(org.telegram.ui.ActionBar.p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (p2Var != null && view != null) {
            org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            p1Var.e = true;
            p1Var.f18535c = 220;
            p1Var.setOutsideTouchable(true);
            p1Var.setClippingEnabled(true);
            p1Var.setAnimationStyle(R.style.PopupContextAnimation);
            p1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            p1Var.setInputMethodMode(2);
            p1Var.getContentView().setFocusableInTouchMode(true);
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
            p1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            p1Var.b();
            return p1Var;
        }
        return null;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.f6 f6Var, MessagesStorage.StringCallback stringCallback) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = str6;
        d2Var.T = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new gg.r(editTextBoldCursor, i10, stringCallback, d2VarArr, view2, 1));
        editTextBoldCursor.addTextChangedListener(new x3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, w7.a6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f17528a.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new fg.e2(editTextBoldCursor, i10, stringCallback, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b(16));
        d2VarArr[0] = alertDialog$Builder.f17528a;
        if (p2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, p2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
        d2Var2.f17622h0 = false;
        d2Var2.setOnDismissListener(new di.w0(editTextBoldCursor, p2Var, findActivity, 2));
        d2VarArr[0].setOnShowListener(new h1(1, editTextBoldCursor));
        d2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), f6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.c3 T(Context context, long j3, final c5 c5Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        int i16 = org.telegram.ui.ActionBar.j6.f18017i6;
        org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        final dd0 dd0Var = new dd0(context, f6Var);
        dd0Var.setTextColor(w02);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        final ?? dd0Var2 = new dd0(context, f6Var);
        dd0Var2.setWrapSelectorWheel(true);
        dd0Var2.setAllItemsCount(24);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextColor(w02);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? dd0Var3 = new dd0(context, f6Var);
        dd0Var3.setWrapSelectorWheel(true);
        dd0Var3.setAllItemsCount(60);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextColor(w02);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, dd0Var, dd0Var2, dd0Var3, 5);
        v3Var.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        v3Var.addView(f7, w7.a6.t(-1, -2, 51, 22, 0, 22, 4));
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
        f7.addView(textView, w7.a6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ai.h(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18325z6, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        f7.addView(textView2, w7.a6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j10 = configTime.get(timeUnit) * 2;
        final long j11 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final di.h hVar = new di.h(context, 19);
        linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(365);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new i2.v(i17, 4));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        bd0 bd0Var = new bd0() {
            @Override
            public final void q(dd0 dd0Var4, int i18) {
                d5.g(di.h.this, null, j10, j11, i12, dd0Var, dd0Var2, dd0Var3);
            }
        };
        dd0Var.setOnValueChangedListener(bd0Var);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(23);
        linearLayout.addView((View) dd0Var2, w7.a6.l(0.2f, 0, 270));
        dd0Var2.setFormatter(new b(11));
        dd0Var2.setOnValueChangedListener(bd0Var);
        dd0Var3.setMinValue(0);
        dd0Var3.setMaxValue(59);
        dd0Var3.setValue(0);
        dd0Var3.setFormatter(new b(12));
        linearLayout.addView((View) dd0Var3, w7.a6.l(0.3f, 0, 270));
        dd0Var3.setOnValueChangedListener(bd0Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j12 = 1000 * j3;
            i13 = w03;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i14 = i16;
            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j12);
            if (timeInMillis >= 0) {
                dd0Var3.setValue(calendar.get(12));
                dd0Var2.setValue(calendar.get(11));
                dd0Var.setValue(timeInMillis);
            }
        } else {
            i13 = w03;
            i14 = i16;
        }
        final boolean[] zArr = {true};
        g(hVar, null, j10, j11, i12, dd0Var, dd0Var2, dd0Var3);
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(w04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        hVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, w05));
        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i18 = i12;
        hVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j13 = j10;
                long j14 = j11;
                int i19 = i18;
                dd0 dd0Var4 = dd0Var;
                t4 t4Var = dd0Var2;
                u4 u4Var = dd0Var3;
                boolean g10 = d5.g(null, null, j13, j14, i19, dd0Var4, t4Var, u4Var);
                long epochMilli = LocalDate.now().plusDays(dd0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, t4Var.getValue());
                calendar2.set(12, u4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                c5Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = c3Var.f17571a.dismissRunnable;
                runnable.run();
            }
        });
        w7.c6.b(hVar, 0.02f, 1.2f);
        di.h hVar2 = new di.h(context, 20);
        hVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar2.setGravity(17);
        if (i10 == 1) {
            i15 = R.string.MessageSuggestionPublishNow;
        } else {
            i15 = R.string.PostSuggestionsAnytime;
        }
        hVar2.setText(LocaleController.getString(i15));
        hVar2.setTextColor(w05);
        hVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false);
        int w07 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        hVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w06, w07, w07));
        v3Var.addView(hVar2, w7.a6.t(-1, 48, 83, 16, 0, 16, 16));
        hVar2.setOnClickListener(new bi.q(zArr, c5Var, c3Var, 8));
        w7.c6.b(hVar2, 0.02f, 1.2f);
        c3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        h3Var.setOnDismissListener(new bi.k1(zArr));
        h3Var.setBackgroundColor(i13);
        h3Var.fixNavigationBar(i13);
        return c3Var;
    }

    public static org.telegram.ui.ActionBar.d2 U(org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        URLSpan[] uRLSpanArr;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return null;
        }
        m90 m90Var = new m90(p2Var.getParentActivity(), p2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new l4(p2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        m90Var.setText(spannableString);
        m90Var.setTextSize(1, 16.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18054k5, f6Var));
        m90Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18072l5, f6Var));
        m90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        m90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
        alertDialog$Builder.n(m90Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new s2(1, p2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f17528a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.MessageLifetime);
        dd0 dd0Var = new dd0(context, null);
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            dd0Var.setValue(i10);
        } else if (i10 == 30) {
            dd0Var.setValue(16);
        } else if (i10 == 60) {
            dd0Var.setValue(17);
        } else if (i10 == 3600) {
            dd0Var.setValue(18);
        } else if (i10 == 86400) {
            dd0Var.setValue(19);
        } else if (i10 == 604800) {
            dd0Var.setValue(20);
        } else if (i10 == 0) {
            dd0Var.setValue(0);
        }
        dd0Var.setFormatter(new q2(2));
        alertDialog$Builder.n(dd0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new org.telegram.ui.oe(20, encryptedChat, dd0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.p2 p2Var, int i10, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i11;
        String sb2;
        if (p2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18235u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18253v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new q2(3));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.a2.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        linearLayout.addView(textView, w7.a6.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new og.w(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        hc.b.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        hc.b.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        hc.b.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        hc.b.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        hc.b.r(16711680, hashMap, "Red", 16711807, "Rose");
        hc.b.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        hc.b.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        hc.b.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        hc.b.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        hc.b.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        hc.b.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        hc.b.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        hc.b.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        hc.b.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        hc.b.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        hc.b.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        hc.b.r(65280, hashMap, "Green", 43115, "Jade");
        hc.b.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        hc.b.r(776785, hashMap, "Malachite", 10026904, "Mint");
        hc.b.r(11394989, hashMap, "Moss", 3234721, "Azure");
        hc.b.r(255, hashMap, "Blue", 18347, "Cobalt");
        hc.b.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        hc.b.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        hc.b.r(128, hashMap, "Navy", 3101086, "Sapphire");
        hc.b.r(7788522, hashMap, "Sky", 32896, "Teal");
        hc.b.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        hc.b.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        hc.b.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        hc.b.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        hc.b.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        hc.b.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        hc.b.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        hc.b.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        hc.b.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        hc.b.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        hc.b.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        hc.b.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        hc.b.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        hc.b.r(15653316, hashMap, "Almond", 16776656, "Cream");
        hc.b.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        hc.b.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        hc.b.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        hc.b.r(16777215, hashMap, "White", 8421504, "Gray");
        hc.b.r(0, hashMap, "Black", 15266260, "Chrome");
        hc.b.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        hc.b.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        hc.b.r(2499381, hashMap, "Steel", 5220413, "Apple");
        hc.b.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        hc.b.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (h6Var == null) {
            h6Var2 = org.telegram.ui.ActionBar.j6.A0().k(false);
        } else {
            h6Var2 = h6Var;
        }
        if (h6Var2 == null || (i11 = h6Var2.f17794c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.r0())[0];
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
            sb2 = a4.a.q((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder g10 = w.f.g(str, " ");
            g10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = g10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        h1 h1Var = new h1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.setOnShowListener(h1Var);
        p2Var.showDialog(d2Var);
        editTextBoldCursor.requestFocus();
        d2Var.d(-1).setOnClickListener(new hi.c(p2Var, editTextBoldCursor, h6Var, i6Var, d2Var, 5));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        ?? dd0Var = new dd0(activity, null);
        q3 q3Var = new q3(activity, dd0Var);
        q3Var.setOrientation(0);
        q3Var.setWeightSum(1.0f);
        dd0Var.setAllItemsCount(24);
        dd0Var.setItemCount(5);
        dd0Var.setTextColor(w02);
        dd0Var.setGravity(5);
        dd0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? dd0Var2 = new dd0(activity, null);
        dd0Var2.setWrapSelectorWheel(true);
        dd0Var2.setAllItemsCount(60);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextColor(w02);
        dd0Var2.setGravity(3);
        dd0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final j2 j2Var = new j2(i11, i12, (p3) dd0Var, (r3) dd0Var2, i10, q3Var);
        q3Var.addView((View) dd0Var, w7.a6.l(0.5f, 0, 270));
        dd0Var.setFormatter(new b(24));
        dd0Var.setOnValueChangedListener(new bd0() {
            @Override
            public final void q(dd0 dd0Var3, int i13) {
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
        q3Var.addView((View) dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setFormatter(new b(25));
        dd0Var2.setOnValueChangedListener(new bd0() {
            @Override
            public final void q(dd0 dd0Var3, int i13) {
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
        s3 s3Var = new s3(activity, dd0Var, dd0Var2);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        s3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        s3Var.addView(q3Var, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.d dVar = new bi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new l2(r1, 0));
        s3Var.addView(dVar, w7.a6.t(-1, 48, 0, 16, 12, 16, 12));
        h3Var.customView = s3Var;
        h3Var.show();
        h3Var.setOnDismissListener(new di.w0(callback, dd0Var, dd0Var2, 3));
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
    }

    public static org.telegram.ui.ActionBar.d2 Y(Activity activity, final long j3, final long j10, String str, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
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
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i12));
            m6Var.a(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17983g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E5, f6Var));
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            m6Var.b(str3, z10);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j11 = j3;
                    String str4 = str2;
                    if (j11 != 0) {
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
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
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
                    alertDialog$Builder.f17528a.L0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f17528a;
    }

    public static org.telegram.ui.ActionBar.d2 Z(Context context, org.telegram.ui.ActionBar.f6 f6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        int i11;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new ca.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.oe(14, atomicBoolean, aVar));
        alertDialog$Builder.f17528a.setOnDismissListener(new di.h0(5, atomicBoolean, aVar));
        return alertDialog$Builder.f17528a;
    }

    public static void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j3, Utilities.Callback callback) {
        b0(i10, j3, i11, callback, 0L);
    }

    public static void b(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
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
        dd0Var3.setMaxValue(i16);
        dd0Var3.setMinValue(i13);
        int value = dd0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        dd0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        dd0Var2.setMinValue(i11);
        int value2 = dd0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        dd0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        dd0Var.setMinValue(i12);
    }

    public static boolean b0(final int i10, final long j3, int i11, Utilities.Callback callback, long j10) {
        org.telegram.ui.ActionBar.f6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        long j11 = i11 * sendPaidMessagesStars;
        xh.v5.y(i10, false).P.put(Long.valueOf(j3), Integer.valueOf(i11));
        if (j11 > 0 && j10 != j11) {
            final long j12 = sendPaidMessagesStars;
            final u2 u2Var = new u2(i10, j11, j3, callback, j12, 0);
            if (j12 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(j3, "ask_paid_message_", "_price"), 0L)) {
                u2Var.run();
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
                bVar = new zh.b();
            }
            org.telegram.ui.ActionBar.f6 f6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j3);
            if (ChatObject.isMonoForum(i10, j3)) {
                shortName = mg.d.h(i10, j3);
            } else if (U instanceof org.telegram.ui.eo) {
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) U;
                if (eoVar.f32335g4 && eoVar.a() == j3 && (chat = eoVar.f32323f4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f17195id);
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
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        int i13 = i10;
                        SharedPreferences.Editor edit = MessagesController.getInstance(i13).getMainSettings().edit();
                        long j13 = j3;
                        edit.putLong(org.telegram.ui.Cells.r6.h(j13, "ask_paid_message_", "_price"), j12).apply();
                        xh.v5.y(i13, false).O.put(Long.valueOf(j13), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(u2Var);
                }
            }, f6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j11));
        return false;
    }

    public static long c(bi.d dVar, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((dd0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (dd0Var2.getValue() - 120) % 12);
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = dd0Var.getValue();
        int value3 = dd0Var3.getValue();
        int value4 = dd0Var4.getValue();
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
        org.telegram.ui.ActionBar.f6 bVar;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j3 = 0;
        int i12 = 0;
        boolean z11 = true;
        int i13 = 0;
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
            xh.v5.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j3 = j11;
            z10 = false;
        }
        long max = Math.max(1, i11) * j3;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new zh.b();
            }
            org.telegram.ui.ActionBar.f6 f6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.br(i10, max, activity, arrayList, hashMap, callback, f6Var), f6Var, true);
            return true;
        }
        callback.run(hashMap);
        return false;
    }

    public static void d(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        dd0Var3.setMinValue(i12);
        int value = dd0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        dd0Var2.setMinValue(i10);
        int value2 = dd0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        dd0Var.setMinValue(i11);
    }

    public static boolean d0(int i10, long j3) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j3);
        if (sendPaidMessagesStars <= 0 && j3 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j3));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.r6.h(j3, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void e(TextView textView, dd0 dd0Var, c4 c4Var, d4 d4Var) {
        String str;
        String str2;
        int value = dd0Var.getValue();
        int value2 = c4Var.getValue();
        int value3 = d4Var.getValue();
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
            int i10 = org.telegram.ui.ActionBar.j6.f17865a;
            org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            i6Var.f17836b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            i6Var.f17834a = obj;
            org.telegram.ui.ActionBar.j6.f17993h0 = org.telegram.ui.ActionBar.j6.Y0(org.telegram.ui.ActionBar.j6.I.f17846i0);
            i6Var.E = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.j6.r1(i6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(p2Var.getParentActivity(), i6Var);
            d2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(p2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e) {
                FileLog.e(e);
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
                        if (user.f17342id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f17342id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f17342id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new di.o3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.d2 f0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.p2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.f0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.d2");
    }

    public static boolean g(TextView textView, TextView textView2, long j3, long j10, int i10, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
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
        int value = dd0Var.getValue();
        int value2 = dd0Var2.getValue();
        int value3 = dd0Var3.getValue();
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
            i13 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j12 = calendar.getTimeInMillis();
            i12 = 23;
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
        dd0Var.setMinValue(0);
        int i24 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
        if (i24 > 0) {
            dd0Var.setMaxValue(i13);
        }
        int value4 = dd0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        dd0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i13) {
                i19 = i12;
            } else {
                i19 = 23;
            }
            dd0Var2.setMaxValue(i19);
        }
        int value5 = dd0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        dd0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i13 && value5 == i12) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            dd0Var3.setMaxValue(i18);
        }
        int value6 = dd0Var3.getValue();
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

    public static void g0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, zm zmVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var));
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
                e4 e4Var = e4.this;
                String trim = e4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = d5.f22289a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(e4Var);
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, w7.a6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = d91.f22337f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            d91 d91Var = new d91(context, f6Var);
            d91Var.setWebPage(webPage);
            linearLayout.addView(d91Var, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.oe(18, editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b(23));
        if (zmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new b1(4, zmVar));
        }
        d2VarArr[0] = d2Var;
        d2Var.f17622h0 = false;
        d2Var.setOnDismissListener(new d1(editTextBoldCursor, 2));
        d2VarArr[0].setOnShowListener(new bu(2, editTextBoldCursor));
        d2VarArr[0].show();
        TextView textView = (TextView) d2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j3, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j3) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f17195id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f17195id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
                }
                if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && p2Var != null && p2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
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
                    d2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    d2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    d2Var.T = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        d2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    d2Var.T = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    d2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new s2(0, p2Var));
                    break;
                case 6:
                    if (z10) {
                        d2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        d2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    d2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    d2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        d2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        d2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    d2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        d2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    d2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    d2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        d2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    d2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        d2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        d2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        d2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    d2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    d2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    d2Var.T = sb2.toString();
                    break;
            }
            hc.b.A(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.d2 i(Activity activity, a5 a5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f17528a.L0;
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f19395f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                g9 g9Var = kVar.e;
                g9Var.m(i10, currentUser);
                kVar.f19392a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                w9 w9Var = kVar.f19394c;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.e(currentUser, g9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                f7.addView(kVar, w7.a6.n(-1, 50));
                kVar.setOnClickListener(new bi.q(d2VarArr, s1Var, a5Var, 9));
            }
        }
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2VarArr[0] = d2Var;
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = new boolean[1];
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        textView.setTextSize(1, 16.0f);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        z4 z4Var = new z4(activity, z1VarArr);
        alertDialog$Builder.f17528a.G = 6;
        alertDialog$Builder.n(z4Var);
        TextView textView2 = new TextView(activity);
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.E8, f6Var, textView2, 1, 20.0f);
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
        z4Var.addView(textView2, w7.a6.d(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        z4Var.addView(textView, w7.a6.d(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, f6Var);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 7, AndroidUtilities.dp(12.0f)));
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
            z4Var.addView(z1VarArr[0], w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new v0(5, zArr));
        }
        alertDialog$Builder.k(str2, new org.telegram.ui.oe(24, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        if (z10) {
            d2Var.X0 = true;
        }
        d2Var.show();
        return d2Var;
    }

    public static org.telegram.ui.ActionBar.d2 j(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f17528a;
    }

    public static void j0(org.telegram.ui.ActionBar.p2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.f6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.j0(org.telegram.ui.ActionBar.p2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.f6):void");
    }

    public static void k(Context context, org.telegram.ui.ActionBar.f6 f6Var, c5 c5Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        if (f6Var != null) {
            w02 = f6Var.e0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.j6.f17998h5;
        if (f6Var != null) {
            w03 = f6Var.e0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        }
        int i12 = w03;
        int i13 = org.telegram.ui.ActionBar.j6.Ji;
        if (f6Var != null) {
            f6Var.e0(i13);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.j6.Ni;
        if (f6Var != null) {
            f6Var.e0(i14);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.E8;
        if (f6Var != null) {
            f6Var.e0(i15);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.G8;
        if (f6Var != null) {
            f6Var.e0(i16);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.f18017i6;
        if (f6Var != null) {
            f6Var.e0(i17);
        } else {
            org.telegram.ui.ActionBar.j6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.Sh;
        if (f6Var != null) {
            w04 = f6Var.e0(i18);
        } else {
            w04 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        }
        int i19 = w04;
        int i20 = org.telegram.ui.ActionBar.j6.Oh;
        if (f6Var != null) {
            w05 = f6Var.e0(i20);
        } else {
            w05 = org.telegram.ui.ActionBar.j6.w0(null, i20, false);
        }
        int i21 = w05;
        if (f6Var != null) {
            w06 = f6Var.e0(org.telegram.ui.ActionBar.j6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        }
        int i22 = w06;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, f6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(16);
        h4Var.setTextColor(w02);
        h4Var.setValue(0);
        h4Var.setFormatter(new i1(1, iArr));
        i4 i4Var = new i4(context, h4Var, 0);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 1);
        linearLayout.addView(h4Var, w7.a6.l(1.0f, 0, 270));
        t3Var.setPadding(0, 0, 0, 0);
        t3Var.setGravity(17);
        t3Var.setTextColor(i19);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        t3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i21, i22, i22));
        i4Var.addView(t3Var, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        h4Var.setOnValueChangedListener(new t(t3Var, 10));
        t3Var.setOnClickListener(new di.o(iArr, h4Var, c5Var, c3Var, 7));
        c3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        h3Var.setBackgroundColor(i12);
        h3Var.fixNavigationBar(i12);
    }

    public static void k0(org.telegram.ui.eo eoVar, MessageObject messageObject, long j3, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.vg vgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (eoVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = eoVar.getAccountInstance();
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, f6Var);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.P0 = false;
                d2Var.N = new d1(vgVar, 0);
                d2Var.R = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(eoVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(eoVar.getParentActivity(), 1, f6Var)};
                z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
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
                linearLayout.addView(z1VarArr[0], w7.a6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new e1(z1VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new f1(user, accountInstance, eoVar, chat, messageObject, z1VarArr, f6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eoVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        if (org.telegram.ui.ActionBar.j6.A0().q()) {
            i10 = R.raw.permission_map_dark;
        } else {
            i10 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i10);
        if (org.telegram.ui.ActionBar.j6.A0().q()) {
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
        frameLayout.addView(view, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, w7.a6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        w9Var.e(user, new g9(0, user));
        frameLayout.addView(w9Var, w7.a6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.V = frameLayout;
        d2Var.O0 = 0.37820512f;
        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new l1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b1(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j3) {
        org.telegram.ui.ActionBar.h3 i11 = org.telegram.messenger.em.i(1, context, null, false);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.a6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.a6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        frameLayout.addView(frameLayout2, w7.a6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 20.0f);
        org.telegram.messenger.em.k(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        g10.setTextSize(1, 14.0f);
        g10.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j3))));
        g10.setGravity(17);
        f7.addView(g10, w7.a6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        bi.d dVar = new bi.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        f7.addView(dVar, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = f7;
        dVar.setOnClickListener(new org.telegram.ui.rd(i10, dVar, i11, j3));
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.c3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        float f7;
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, f6Var);
        c3Var.a();
        dd0 dd0Var = new dd0(context, f6Var);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        dd0 dd0Var2 = new dd0(context, f6Var);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0 dd0Var3 = new dd0(context, f6Var);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        z3 z3Var = new z3(context, dd0Var, dd0Var2, dd0Var3);
        z3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        z3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        z3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i12 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i13 = calendar.get(5);
        int i14 = calendar.get(2);
        int i15 = calendar.get(1);
        int i16 = i15 + 1;
        x2 x2Var = new x2(dd0Var3, i16, dd0Var, dd0Var2, i15, i14, i13);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(dd0Var, w7.a6.l(0.25f, 0, 270));
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(31);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new q2(4));
        t tVar = new t(x2Var, 9);
        dd0Var.setOnScrollListener(tVar);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(11);
        dd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setFormatter(new q2(5));
        dd0Var2.setOnScrollListener(tVar);
        dd0Var3.setMinValue(i12);
        dd0Var3.setMaxValue(i16);
        dd0Var3.setWrapSelectorWheel(false);
        dd0Var3.setFormatter(new i2.v(i16, 5));
        linearLayout.addView(dd0Var3, w7.a6.l(0.25f, 0, 270));
        dd0Var3.setOnScrollListener(tVar);
        if (tL_birthday != null) {
            dd0Var.setValue(tL_birthday.day);
            dd0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                dd0Var3.setValue(tL_birthday.year);
            } else {
                dd0Var3.setValue(i16);
            }
        } else {
            dd0Var.setValue(calendar.get(5));
            dd0Var2.setValue(calendar.get(2));
            dd0Var3.setValue(i16);
        }
        x2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            m90 m90Var = new m90(context, null);
            m90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            m90Var.setTextSize(1, 13.0f);
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, f6Var));
            m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
            m90Var.setGravity(17);
            frameLayout2.addView(m90Var, w7.a6.e(-2, -2, 17));
            z3Var.addView(frameLayout2, w7.a6.n(-1, -2));
            int i17 = UserConfig.selectedAccount;
            bi.s sVar = new bi.s(i17, m90Var, 27);
            sVar.run();
            f7 = 8.0f;
            NotificationCenter.getInstance(i17).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new y2(sVar, 0));
            ContactsController.getInstance(i17).loadPrivacySettings();
        } else {
            f7 = 8.0f;
        }
        if (z10) {
            bi.d dVar = new bi.d(context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new org.telegram.ui.Cells.wa(dd0Var3, i16, x2Var, 5));
            z3Var.addView(dVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(f7);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        w7.c6.a(textView2);
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
        z3Var.addView(textView2, w7.a6.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new di.p3(dd0Var, dd0Var2, dd0Var3, i16, c3Var, callback));
        if (z11) {
            bi.d dVar2 = new bi.d(context, f6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.sh(11, c3Var, callback));
            z3Var.addView(dVar2, w7.a6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        c3Var.b(z3Var);
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
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            p2Var.showDialog(d2Var, true, null);
        }
    }

    public static void n(org.telegram.ui.ActionBar.p2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.n(org.telegram.ui.ActionBar.p2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.addView(new xh.y2(context, tL_starGiftUnique, userOrChat), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 16.0f);
        org.telegram.messenger.em.p(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        f7.addView(textView, w7.a6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new b1(2, runnable));
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
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
        m90 m90Var = new m90(context, null);
        NotificationCenter.listenEmojiLoading(m90Var);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        m90Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        m90Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f17528a.G = 6;
        alertDialog$Builder.n(frameLayout);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(18.0f));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
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
            l5Var.i(org.telegram.ui.ActionBar.j6.f17977g1);
        } else if (user.fake) {
            l5Var.i(org.telegram.ui.ActionBar.j6.f17994h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18328z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A9, false), mode));
            l5Var.i(new vq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18090m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new w0(user, p2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        uq uqVar = new uq(R.drawable.attach_arrow_right, 0);
        uqVar.setTopOffset(1);
        uqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(uqVar, valueOf.length() - 1, valueOf.length(), 33);
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
        frameLayout.addView(l5Var, w7.a6.d(-1, -2.0f, i20, f7, 0.0f, i16, 0.0f));
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
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, i22, f10, 24.0f, i21, 0.0f));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(m90Var, w7.a6.d(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            g9Var.f23286p = 0.8f;
            g9Var.g(12);
            w9Var.h(null, null, g9Var, user);
        } else {
            g9Var.f23286p = 1.0f;
            g9Var.m(p2Var.getCurrentAccount(), user);
            w9Var.e(user, g9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener u0Var = new u0(3, runnable2);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        p2Var.showDialog(d2Var, false, u0Var);
        m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new m1(0, context, d2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.f6 f6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, f6Var);
        z1Var.setMultiline(true);
        z1Var.getTextView().getLayoutParams().width = -1;
        z1Var.getTextView().setSingleLine(false);
        z1Var.getTextView().setMaxLines(3);
        z1Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i10 = R.string.BrowserAlwaysOpenExternal;
        } else {
            i10 = R.string.BrowserAlwaysOpenInApp;
        }
        z1Var.e(LocaleController.getString(i10), "", false, false, false);
        z1Var.setOnClickListener(new h0(z1Var, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(z1Var, w7.a6.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f17528a.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
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
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
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

    public static org.telegram.ui.ActionBar.c3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.f6 f6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(activity, f6Var);
        c3Var.a();
        dd0 dd0Var = new dd0(activity, f6Var);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        dd0 dd0Var2 = new dd0(activity, f6Var);
        dd0Var2.setItemCount(5);
        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0 dd0Var3 = new dd0(activity, f6Var);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        n4 n4Var = new n4(activity, dd0Var, dd0Var2, dd0Var3);
        n4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n4Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n4Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(dd0Var, w7.a6.l(0.25f, 0, 270));
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(31);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setFormatter(new b(2));
        n0 n0Var = new n0(dd0Var, dd0Var2, dd0Var3, 0);
        dd0Var.setOnValueChangedListener(n0Var);
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(11);
        dd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setFormatter(new b(3));
        dd0Var2.setOnValueChangedListener(n0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        dd0Var3.setMinValue(i10);
        dd0Var3.setMaxValue(i11);
        dd0Var3.setWrapSelectorWheel(false);
        dd0Var3.setFormatter(new b(4));
        linearLayout.addView(dd0Var3, w7.a6.l(0.25f, 0, 270));
        dd0Var3.setOnValueChangedListener(n0Var);
        dd0Var.setValue(31);
        dd0Var2.setValue(12);
        dd0Var3.setValue(i11);
        b(dd0Var, dd0Var2, dd0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03));
        n4Var.addView(textView2, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new o0(dd0Var, dd0Var2, dd0Var3, calendar, intCallback, c3Var, 0));
        c3Var.b(n4Var);
        return c3Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, nf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
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
        if (!nf.f.f(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                r2 r2Var = new r2(context, str, j3, z11, eVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = d91.f22337f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    d91 d91Var = new d91(context, f6Var);
                    d91Var.setWebPage(webPage);
                    linearLayout.addView(d91Var, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                d2Var.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new t(r2Var, 8));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            v = str;
            r2 r2Var2 = new r2(context, str, j3, z11, eVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
            d2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.j6.f18034j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i102, f6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i102, f6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, w7.a6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = d91.f22337f;
            if (webPage != null) {
                d91 d91Var2 = new d91(context, f6Var);
                d91Var2.setWebPage(webPage);
                linearLayout.addView(d91Var2, w7.a6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            d2Var2.f17609a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new t(r2Var2, 8));
            hc.b.s(R.string.Cancel, alertDialog$Builder2, null);
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
        nf.f.r(context, parse2, z14, z11, z15, eVar, null, false, true, false);
    }

    public static void q(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (p2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(p2Var.getCurrentAccount()).getClientUserId() != user.f17342id) {
            p2Var.getCurrentAccount();
            Activity parentActivity = p2Var.getParentActivity();
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
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.u(AndroidUtilities.dp(12.0f));
            g9Var.f23286p = 1.0f;
            g9Var.m(p2Var.getCurrentAccount(), user);
            w9 w9Var = new w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            w9Var.e(user, g9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
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
            frameLayout.addView(textView2, w7.a6.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, w7.a6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(p2Var, user, z10, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            p2Var.showDialog(alertDialog$Builder.f17528a);
        }
    }

    public static void q0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z10, boolean z11) {
        r0(p2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void r(org.telegram.ui.ActionBar.p2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.f6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.r(org.telegram.ui.ActionBar.p2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.f6):void");
    }

    public static void r0(org.telegram.ui.ActionBar.p2 p2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, nf.e eVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.f6 f6Var) {
        long j3;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (p2Var instanceof org.telegram.ui.eo) {
                j3 = ((org.telegram.ui.eo) p2Var).f32326f8;
            } else {
                j3 = 0;
            }
            p0(p2Var.getParentActivity(), str, z10, z11, z12, z13, j3, eVar, webPage, f6Var);
        }
    }

    public static void s(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (p2Var != null) {
            f6Var = p2Var.getResourceProvider();
        } else {
            f6Var = null;
        }
        t(p2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, f6Var);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.r6.u(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i12));
            m6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17983g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            m6Var.b(charSequence, z11);
            m6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
            linearLayout.addView(m6Var);
            m6Var.setOnClickListener(new bi.q(arrayList2, runnable, alertDialog$Builder, 10));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.d2 o9 = alertDialog$Builder.o();
        if (z10) {
            o9.setCanceledOnTouchOutside(false);
        }
    }

    public static void t(final org.telegram.ui.ActionBar.p2 r44, final boolean r45, final boolean r46, org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.MessagesStorage.BooleanCallback r53, final org.telegram.ui.ActionBar.f6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.t(org.telegram.ui.ActionBar.p2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.f6):void");
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        if (i10 != 0 && p2Var != null && p2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            p2Var.showDialog(alertDialog$Builder.f17528a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.d2 u(Activity activity, final long j3, final long j10, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.a2.c("color_", sharedPrefKey, notificationsSettings, -16776961);
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
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(activity, f6Var);
            m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            m6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.z8.e[i13];
            m6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.z8.f20793f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            m6Var.b(str, z10);
            f7.addView(m6Var);
            m6Var.setOnClickListener(new s0(f7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, f6Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j11 = j3;
                int[] iArr2 = iArr;
                if (j11 != 0) {
                    edit.putInt(org.telegram.ui.Cells.r6.i("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j11, j10);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.c(j3, i10, runnable, 5));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new org.telegram.ui.oe(22, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f17528a;
    }

    public static org.telegram.ui.ActionBar.d2 u0(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        if (p2Var == null) {
            p2Var = LaunchActivity.U();
        }
        if (str2 != null && p2Var != null && p2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.d2 d2Var = O(p2Var.getParentActivity(), str, str2, null, null, f6Var).f17528a;
            p2Var.showDialog(d2Var);
            return d2Var;
        }
        return null;
    }

    public static void v(org.telegram.ui.ActionBar.p2 p2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new org.telegram.ui.oe(19, str3, p2Var));
        p2Var.showDialog(d2Var);
    }

    public static org.telegram.ui.ActionBar.d2 v0(org.telegram.ui.ActionBar.p2 p2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.d2 P = P(p2Var.getContext(), p2Var.getResourceProvider(), str, charSequence, str2, runnable);
        p2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.c2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, fg.e2 e2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final dd0 dd0Var = new dd0(context, null);
        final dd0 dd0Var2 = new dd0(context, null);
        final dd0 dd0Var3 = new dd0(context, null);
        linearLayout.addView(dd0Var2, w7.a6.l(0.3f, 0, -2));
        dd0Var2.setOnScrollListener(new ad0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(11);
        linearLayout.addView(dd0Var, w7.a6.l(0.3f, 0, -2));
        dd0Var.setFormatter(new b(10));
        dd0Var.setOnValueChangedListener(new n0(dd0Var2, dd0Var, dd0Var3, 1));
        dd0Var.setOnScrollListener(new ad0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        dd0Var3.setMinValue(i10 + i16);
        dd0Var3.setMaxValue(i11 + i16);
        dd0Var3.setValue(i16 + i12);
        linearLayout.addView(dd0Var3, w7.a6.l(0.4f, 0, -2));
        dd0Var3.setOnValueChangedListener(new n0(dd0Var2, dd0Var, dd0Var3, 2));
        dd0Var3.setOnScrollListener(new ad0() {
            @Override
            public final void n(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            d5.d(dd0Var2, dd0Var, dd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        y0(dd0Var2, dd0Var, dd0Var3);
        if (z10) {
            d(dd0Var2, dd0Var, dd0Var3);
        }
        if (i13 != -1) {
            dd0Var2.setValue(i13);
            dd0Var.setValue(i14);
            dd0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f17528a.R = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.jk(z10, dd0Var2, dd0Var, dd0Var3, e2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.d2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new l0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j3, c5 c5Var) {
        dd0 dd0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
        c3Var.a();
        dd0 dd0Var2 = new dd0(context, null);
        dd0Var2.setTextColor(w02);
        dd0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var2.setItemCount(5);
        dd0 dd0Var3 = new dd0(context, null);
        dd0Var3.setItemCount(5);
        dd0Var3.setTextColor(w02);
        dd0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
        dd0 dd0Var4 = new dd0(context, null);
        dd0Var4.setItemCount(5);
        dd0Var4.setTextColor(w02);
        dd0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, dd0Var2, dd0Var3, dd0Var4, 1);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.a2.q(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        di.h hVar = new di.h(context, 14);
        linearLayout.addView(dd0Var2, w7.a6.l(0.5f, 0, 270));
        dd0Var2.setMinValue(0);
        dd0Var2.setMaxValue(365);
        dd0Var2.setWrapSelectorWheel(false);
        dd0Var2.setFormatter(new b(13));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(dd0Var2, dd0Var3, dd0Var4, 16);
        dd0Var2.setOnValueChangedListener(aVar);
        dd0Var3.setMinValue(0);
        dd0Var3.setMaxValue(23);
        linearLayout.addView(dd0Var3, w7.a6.l(0.2f, 0, 270));
        dd0Var3.setFormatter(new b(14));
        dd0Var3.setOnValueChangedListener(aVar);
        dd0Var4.setMinValue(0);
        dd0Var4.setMaxValue(59);
        dd0Var4.setValue(0);
        dd0Var4.setFormatter(new b(15));
        linearLayout.addView(dd0Var4, w7.a6.l(0.3f, 0, 270));
        dd0Var4.setOnValueChangedListener(aVar);
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
                dd0Var4.setValue(calendar.get(12));
                dd0Var3.setValue(calendar.get(11));
                dd0Var = dd0Var2;
                dd0Var.setValue(timeInMillis);
            } else {
                dd0Var = dd0Var2;
            }
        } else {
            dd0Var = dd0Var2;
        }
        dd0 dd0Var5 = dd0Var;
        g(null, null, 0L, 0L, 0, dd0Var5, dd0Var3, dd0Var4);
        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hVar.setGravity(17);
        hVar.setTextColor(w04);
        hVar.setTextSize(1, 14.0f);
        hVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
        hVar.setText(str2);
        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
        hVar.setOnClickListener(new o0(dd0Var5, dd0Var3, dd0Var4, calendar, c5Var, c3Var, 2));
        c3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        h3Var.setBackgroundColor(w03);
        h3Var.fixNavigationBar(w03);
    }

    public static void y0(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, dd0Var2.getValue());
        calendar.set(1, dd0Var3.getValue());
        dd0Var.setMinValue(1);
        dd0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void z(final org.telegram.ui.ActionBar.p2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.f6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.z(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.f6):void");
    }
}
