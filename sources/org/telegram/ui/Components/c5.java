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
import org.telegram.ui.wg1;
public abstract class c5 {
    public static final Pattern f27308a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        c30 c30Var = new c30(0, context, true);
        c30Var.setImportantForAccessibility(2);
        bg.x2 x2Var = new bg.x2(context, c30Var);
        x2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        x2Var.setClipToOutline(true);
        x2Var.setOutlineProvider(new eg.k1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        x2Var.addView(view, i7.f6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        x2Var.addView(c30Var, i7.f6.c(117.0f, 117));
        alertDialog$Builder.f22714a.R = x2Var;
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new l0(context, 3));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.f22788f0 = true;
        c2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22714a.K0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, wg1 wg1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new eg.k1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, i7.f6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f22714a.R = frameLayout;
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new gh.q(5, activity, z10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.f22788f0 = true;
        c2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), wg1Var);
        alertDialog$Builder.f22714a.K0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new i1(launchActivity, 1));
        return alertDialog$Builder.f22714a;
    }

    public static org.telegram.ui.ActionBar.c2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22714a;
    }

    public static org.telegram.ui.ActionBar.c2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        int w02;
        int i10;
        int i11;
        int w03;
        int w04;
        int w05;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        f9.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        if (c6Var != null) {
            w02 = c6Var.h0(i12);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
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
        f9.addView(textView, i7.f6.t(-2, -2, i14, 24, i11, 24, 8));
        for (int i15 = 0; i15 < 4; i15++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, c6Var);
            i6Var.d = 42;
            i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i15));
            int i16 = org.telegram.ui.ActionBar.g6.f23118g7;
            if (c6Var != null) {
                w04 = c6Var.h0(i16);
            } else {
                w04 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
            }
            int i17 = org.telegram.ui.ActionBar.g6.E5;
            if (c6Var != null) {
                w05 = c6Var.h0(i17);
            } else {
                w05 = org.telegram.ui.ActionBar.g6.w0(null, i17, false);
            }
            i6Var.a(w04, w05);
            String str = strArr[i15];
            if (iArr[0] == i15) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(str, z11);
            f9.addView(i6Var);
            i6Var.setOnClickListener(new s0(iArr, f9));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (c6Var != null) {
                w03 = c6Var.h0(org.telegram.ui.ActionBar.g6.L5);
            } else {
                w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false);
            }
            c2Var.X = new eq0(activity, 0);
            c2Var.Y = w03;
        }
        alertDialog$Builder.n(f9);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new kg.w(29, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.f3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.o2 o2Var, final org.telegram.ui.ActionBar.c6 c6Var) {
        if (o2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(o2Var.getParentActivity(), c6Var, false, false);
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
                } else if (i10 == 1) {
                    i11 = 1;
                } else if (i10 == 2) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                if (tc.a(o2Var2)) {
                    tc.z(o2Var2, i11, 0, c6Var).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        return f3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.c6 c6Var, b5 b5Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        if (c6Var != null) {
            w02 = c6Var.h0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        if (c6Var != null) {
            w03 = c6Var.h0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.h0(i12);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.h0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.h0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.h0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.f23152i6;
        if (c6Var != null) {
            c6Var.h0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            w04 = c6Var.h0(i17);
        } else {
            w04 = org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            w05 = c6Var.h0(i18);
        } else {
            w05 = org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        }
        int i19 = w05;
        if (c6Var != null) {
            w06 = c6Var.h0(org.telegram.ui.ActionBar.g6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        }
        int i20 = w06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        l4 l4Var = new l4(context, c6Var, iArr);
        l4Var.setMinValue(0);
        l4Var.setMaxValue(20);
        l4Var.setTextColor(w02);
        l4Var.setValue(0);
        l4Var.setFormatter(new h1(0, iArr));
        h4 h4Var = new h4(context, l4Var, 1);
        h4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        h4Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        h4Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        eg.r rVar = new eg.r(context, 18);
        linearLayout.addView(l4Var, i7.f6.l(1.0f, 0, 270));
        l4Var.setOnValueChangedListener(new n0(4));
        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar.setGravity(17);
        rVar.setTextColor(w04);
        rVar.setTextSize(1, 14.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, i19, i20, i20));
        rVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        h4Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        rVar.setOnClickListener(new ih.u3(iArr, l4Var, b5Var, a3Var, 4));
        a3Var.b(h4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22714a.N = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.g6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.g6.w0(null, i10, false), hashMap);
        alertDialog$Builder.f22714a.S = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f22714a.P = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
        boolean z10;
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
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, c6Var);
            i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i14));
            i6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23118g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.b(str, z10);
            f9.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f22714a.H0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
        }
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(f9);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22714a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, lh.b bVar) {
        if (activity != null) {
            ih.u uVar = new ih.u(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, bVar, true, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            f3Var.bigTitle = true;
            a3 a3Var = new a3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, uVar, 0);
            f3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            f3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            f3Var.onClickListener = a3Var;
            f3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.a3 K(final Context context, final long j10, long j11, int i10, boolean z10, final b5 b5Var, Runnable runnable, a5 a5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i11;
        FrameLayout frameLayout2;
        ?? r82;
        int i12;
        boolean[] zArr;
        long j12;
        FrameLayout frameLayout3;
        org.telegram.ui.gg ggVar;
        ?? r11;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i13;
        Calendar calendar;
        int i14;
        int i15;
        char c3;
        int[] iArr;
        String[] strArr;
        View view;
        xi0 xi0Var;
        Calendar calendar2;
        t3 t3Var;
        int[] iArr2;
        org.telegram.ui.ActionBar.w0 w0Var2;
        int i16;
        ?? r22;
        int i17;
        String[] strArr2;
        org.telegram.ui.gg ggVar2;
        org.telegram.ui.gg ggVar3;
        ?? r42;
        final org.telegram.ui.ActionBar.f3 f3Var;
        View view2;
        int i18;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        final ?? qc0Var = new qc0(context, c6Var);
        int i19 = a5Var.f26665a;
        int i20 = a5Var.f26667c;
        int i21 = a5Var.f26666b;
        qc0Var.setTextColor(i19);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        final ?? qc0Var2 = new qc0(context, c6Var);
        qc0Var2.setWrapSelectorWheel(true);
        qc0Var2.setAllItemsCount(24);
        qc0Var2.setItemCount(5);
        qc0Var2.setTextColor(i19);
        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? qc0Var3 = new qc0(context, c6Var);
        qc0Var3.setWrapSelectorWheel(true);
        qc0Var3.setAllItemsCount(60);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextColor(i19);
        qc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? v3Var = new v3(context, qc0Var, qc0Var2, qc0Var3, 0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout4.addView((View) v3Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        v3Var.addView(frameLayout6, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (!TextUtils.isEmpty(null)) {
            frameLayout = frameLayout5;
            textView.setText((CharSequence) null);
        } else {
            frameLayout = frameLayout5;
            if (j10 == clientUserId) {
                textView.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        }
        org.telegram.messenger.x3.t(textView, i19, 1, 20.0f);
        frameLayout6.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
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
            r11 = v3Var;
            ggVar = null;
            i11 = i21;
            zArr = zArr2;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, a5Var.f26665a, false, c6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i20, 1, -1));
            frameLayout3.addView(w0Var, i7.f6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
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
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            ggVar = null;
            r11 = v3Var;
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.setOnClickListener(new nh.r7(29, w0Var, a5Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(b5Var, zArr, a3Var, 16));
        }
        ?? imageView = new ImageView(context2);
        xi0 xi0Var2 = new xi0(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        xi0Var2.H(true);
        xi0Var2.h = true;
        xi0Var2.start();
        xi0Var2.K(40);
        xi0Var2.N(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(xi0Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(i20, 1, i12));
        if (w0Var != null) {
            i13 = 42;
        } else {
            i13 = 0;
        }
        frameLayout3.addView(imageView, i7.f6.d(40, 40.0f, 53, 0.0f, 8.0f, i13 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final eg.r rVar = new eg.r(context2, 13);
        linearLayout.addView(qc0Var, i7.f6.l(0.5f, r82, 270));
        qc0Var.setMinValue(r82);
        qc0Var.setMaxValue(365);
        qc0Var.setWrapSelectorWheel(r82);
        qc0Var.setFormatter(new n0(24));
        Object obj = r11;
        final boolean[] zArr3 = zArr;
        final long j13 = j12;
        int i22 = i11;
        oc0 oc0Var = new oc0() {
            @Override
            public final void q(qc0 qc0Var4, int i23) {
                int i24;
                if (j13 == j10) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                c5.g(eg.r.this, null, 0L, 0L, i24, qc0Var, qc0Var2, qc0Var3);
            }
        };
        qc0Var.setOnValueChangedListener(oc0Var);
        qc0Var2.setMinValue(r82);
        qc0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(qc0Var2, i7.f6.l(0.2f, r82, 270));
        qc0Var2.setFormatter(new n0(25));
        qc0Var2.setOnValueChangedListener(oc0Var);
        qc0Var3.setMinValue(r82);
        qc0Var3.setMaxValue(59);
        qc0Var3.setValue(r82);
        qc0Var3.setFormatter(new n0(26));
        linearLayout.addView(qc0Var3, i7.f6.l(0.3f, r82, 270));
        qc0Var3.setOnValueChangedListener(oc0Var);
        if (j11 > 0 && j11 != 2147483646) {
            long j14 = 1000 * j11;
            calendar = calendar3;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j14);
            if (timeInMillis >= 0) {
                qc0Var3.setValue(calendar.get(12));
                qc0Var2.setValue(calendar.get(11));
                qc0Var.setValue(timeInMillis);
            }
        } else {
            calendar = calendar3;
        }
        final boolean[] zArr4 = {true};
        if (j13 == j10) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        g(rVar, null, 0L, 0L, i14, qc0Var, qc0Var2, qc0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c3 = 1;
            i15 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i15 = 8;
            c3 = 1;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[c3] = "Every minute";
            strArr[2] = "Every 5 minutes";
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[i15] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[9] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i15];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[c3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (!z10) {
            calendar2 = calendar;
            ?? frameLayout7 = new FrameLayout(context2);
            t3Var = qc0Var2;
            i16 = i22;
            int v = org.telegram.ui.ActionBar.g6.v(i16, org.telegram.ui.ActionBar.g6.l1(0.075f, i19));
            String[] strArr3 = strArr;
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i19);
            ?? textView2 = new TextView(context2);
            view = imageView;
            xi0Var = xi0Var2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i19);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.g6.v(v, l1);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v, v10, v10));
            textView2.setGravity(17);
            strArr2 = strArr3;
            int[] iArr4 = iArr;
            w0Var2 = w0Var3;
            i17 = 17;
            ggVar2 = new org.telegram.ui.gg(iArr4, iArr3, strArr2, textView2, 10);
            iArr2 = iArr4;
            ggVar2.run();
            frameLayout7.addView(textView2, i7.f6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r22 = obj;
            r22.addView(frameLayout7, i7.f6.n(-1, -2));
            ggVar3 = textView2;
            r42 = frameLayout7;
        } else {
            view = imageView;
            xi0Var = xi0Var2;
            calendar2 = calendar;
            t3Var = qc0Var2;
            iArr2 = iArr;
            w0Var2 = w0Var3;
            i16 = i22;
            r22 = obj;
            i17 = 17;
            strArr2 = strArr;
            ggVar2 = ggVar;
            org.telegram.ui.gg ggVar4 = ggVar2;
            ggVar3 = ggVar4;
            r42 = ggVar4;
        }
        org.telegram.ui.gg ggVar5 = ggVar2;
        String[] strArr4 = strArr2;
        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar.setGravity(i17);
        rVar.setTextColor(a5Var.f26670g);
        rVar.setTextSize(1, 14.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, a5Var.h));
        r22.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        int i23 = i16;
        final t3 t3Var2 = t3Var;
        final Calendar calendar4 = calendar2;
        rVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                int i24;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                qc0 qc0Var4 = qc0Var;
                t3 t3Var3 = t3Var2;
                u3 u3Var = qc0Var3;
                boolean g10 = c5.g(null, null, 0L, 0L, i24, qc0Var4, t3Var3, u3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, qc0Var4.getValue());
                calendar5.set(11, t3Var3.getValue());
                calendar5.set(12, u3Var.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z11 = zArr3[0];
                b5Var.I((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = a3Var.f22729a.dismissRunnable;
                runnable2.run();
            }
        });
        a3Var.b(viewGroup);
        org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f22729a;
        f3Var2.show();
        f3Var2.setOnDismissListener(new n2(runnable, zArr4));
        f3Var2.setBackgroundColor(i23);
        f3Var2.fixNavigationBar(i23);
        if (ggVar3 != null) {
            view2 = view;
            i18 = 1;
            f3Var = f3Var2;
            ggVar3.setOnClickListener(new c2(frameLayout2, c6Var, f3Var2, (FrameLayout) r42, iArr2, strArr4, iArr3, ggVar5));
        } else {
            f3Var = f3Var2;
            view2 = view;
            i18 = 1;
        }
        final nh.t3[] t3VarArr = new nh.t3[i18];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        final xi0 xi0Var3 = xi0Var;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                int i24;
                String string;
                int i25;
                int i26;
                int i27;
                int i28;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                xi0 xi0Var4 = xi0Var3;
                if (!z11) {
                    if (xi0Var4.X >= 40) {
                        xi0Var4.K(0);
                    }
                    xi0Var4.N(40);
                    xi0Var4.start();
                } else {
                    if (xi0Var4.X < 40) {
                        xi0Var4.K(40);
                    }
                    xi0Var4.N(80);
                    xi0Var4.start();
                }
                nh.t3[] t3VarArr2 = t3VarArr;
                nh.t3 t3Var3 = t3VarArr2[0];
                if (t3Var3 != null) {
                    t3Var3.e(true);
                    t3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                nh.t3 t3Var4 = new nh.t3(context, 3);
                t3VarArr2[0] = t3Var4;
                t3Var4.s();
                t3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                t3Var4.r(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.g6.l1(0.25f, -16777216);
                t3Var4.f18593e0 = dp2;
                t3Var4.f18595f0 = dp3;
                t3Var4.f18596g0 = l12;
                t3Var4.B.setShadowLayer(dp2, 0.0f, dp3, l12);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i28 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i28 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i28);
                } else if (chat == null && user2 != null) {
                    if (j15 == j13) {
                        if (zArr5[0]) {
                            i26 = R.string.ScheduleNotifyOnSelf;
                        } else {
                            i26 = R.string.ScheduleNotifyOffSelf;
                        }
                        string = LocaleController.getString(i26);
                    } else {
                        if (zArr5[0]) {
                            i25 = R.string.ScheduleNotifyOnChat;
                        } else {
                            i25 = R.string.ScheduleNotifyOffChat;
                        }
                        string = LocaleController.formatString(i25, UserObject.getForcedFirstName(user2));
                    }
                } else {
                    if (zArr5[0]) {
                        i24 = R.string.ScheduleNotifyOnGroup;
                    } else {
                        i24 = R.string.ScheduleNotifyOffGroup;
                    }
                    string = LocaleController.getString(i24);
                }
                t3Var4.t(string);
                t3Var4.d = 5000L;
                if (w0Var4 != null) {
                    i27 = 42;
                } else {
                    i27 = -8;
                }
                t3Var4.m(1.0f, -(i27 + 20));
                t3Var4.f18597h0 = new ig(t3Var4, 2);
                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                f3Var3.getContainerView().setClipToPadding(false);
                f3Var3.getContainerView().setClipChildren(false);
                f3Var3.getContainerView().addView(t3Var4, i7.f6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                t3Var4.v();
            }
        });
        return a3Var;
    }

    public static void L(Context context, long j10, b5 b5Var) {
        K(context, j10, -1L, 0, false, b5Var, null, new a5(null), null);
    }

    public static void M(Context context, long j10, b5 b5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        K(context, j10, -1L, 0, false, b5Var, null, new a5(c6Var), c6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str;
        c2Var.P = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new b1(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 P(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str;
        c2Var.P = charSequence;
        alertDialog$Builder.k(str2, new b1(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22714a;
    }

    public static org.telegram.ui.ActionBar.o1 Q(org.telegram.ui.ActionBar.o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f9, float f10) {
        if (o2Var != null && view != null) {
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            o1Var.f23712e = true;
            o1Var.f23711c = 220;
            o1Var.setOutsideTouchable(true);
            o1Var.setClippingEnabled(true);
            o1Var.setAnimationStyle(R.style.PopupContextAnimation);
            o1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            o1Var.setInputMethodMode(2);
            o1Var.getContentView().setFocusableInTouchMode(true);
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
            o1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f9) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            o1Var.b();
            return o1Var;
        }
        return null;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        View view2 = view;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str6;
        c2Var.P = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new d2(editTextBoldCursor, i10, stringCallback, c2VarArr, view2, 0));
        editTextBoldCursor.addTextChangedListener(new x3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, i7.f6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22714a.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new e3.d(editTextBoldCursor, i10, stringCallback, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n0(14));
        c2VarArr[0] = alertDialog$Builder.f22714a;
        if (o2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, o2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
        c2Var2.f22784d0 = false;
        c2Var2.setOnDismissListener(new ih.j(editTextBoldCursor, o2Var, findActivity, 2));
        c2VarArr[0].setOnShowListener(new g1(1, editTextBoldCursor));
        c2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), c6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.a3 T(Context context, long j10, final b5 b5Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        int i15 = org.telegram.ui.ActionBar.g6.f23152i6;
        org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        final qc0 qc0Var = new qc0(context, c6Var);
        qc0Var.setTextColor(w02);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        final ?? qc0Var2 = new qc0(context, c6Var);
        qc0Var2.setWrapSelectorWheel(true);
        qc0Var2.setAllItemsCount(24);
        qc0Var2.setItemCount(5);
        qc0Var2.setTextColor(w02);
        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? qc0Var3 = new qc0(context, c6Var);
        qc0Var3.setWrapSelectorWheel(true);
        qc0Var3.setAllItemsCount(60);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextColor(w02);
        qc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, qc0Var, qc0Var2, qc0Var3, 5);
        v3Var.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        v3Var.addView(g10, i7.f6.t(-1, -2, 51, 22, 0, 22, 4));
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
        g10.addView(textView, i7.f6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new mh.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23450z6, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        g10.addView(textView2, i7.f6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i16 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final eg.r rVar = new eg.r(context, 19);
        linearLayout.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
        qc0Var.setMinValue(0);
        qc0Var.setMaxValue(365);
        qc0Var.setWrapSelectorWheel(false);
        qc0Var.setFormatter(new j3.x(i16, 3));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        oc0 oc0Var = new oc0() {
            @Override
            public final void q(qc0 qc0Var4, int i17) {
                c5.g(eg.r.this, null, j11, j12, i12, qc0Var, qc0Var2, qc0Var3);
            }
        };
        qc0Var.setOnValueChangedListener(oc0Var);
        qc0Var2.setMinValue(0);
        qc0Var2.setMaxValue(23);
        linearLayout.addView((View) qc0Var2, i7.f6.l(0.2f, 0, 270));
        qc0Var2.setFormatter(new n0(9));
        qc0Var2.setOnValueChangedListener(oc0Var);
        qc0Var3.setMinValue(0);
        qc0Var3.setMaxValue(59);
        qc0Var3.setValue(0);
        qc0Var3.setFormatter(new n0(10));
        linearLayout.addView((View) qc0Var3, i7.f6.l(0.3f, 0, 270));
        qc0Var3.setOnValueChangedListener(oc0Var);
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
                qc0Var3.setValue(calendar.get(12));
                qc0Var2.setValue(calendar.get(11));
                qc0Var.setValue(timeInMillis);
            }
        } else {
            i13 = w03;
        }
        final boolean[] zArr = {true};
        g(rVar, null, j11, j12, i12, qc0Var, qc0Var2, qc0Var3);
        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar.setGravity(17);
        rVar.setTextColor(w04);
        rVar.setTextSize(1, 14.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, w05));
        v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i17 = i12;
        rVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i18 = i17;
                qc0 qc0Var4 = qc0Var;
                s4 s4Var = qc0Var2;
                t4 t4Var = qc0Var3;
                boolean g11 = c5.g(null, null, j14, j15, i18, qc0Var4, s4Var, t4Var);
                long epochMilli = LocalDate.now().plusDays(qc0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, s4Var.getValue());
                calendar2.set(12, t4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                }
                b5Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = a3Var.f22729a.dismissRunnable;
                runnable.run();
            }
        });
        i7.h6.b(rVar, 0.02f, 1.2f);
        eg.r rVar2 = new eg.r(context, 20);
        rVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar2.setGravity(17);
        if (i10 == 1) {
            i14 = R.string.MessageSuggestionPublishNow;
        } else {
            i14 = R.string.PostSuggestionsAnytime;
        }
        rVar2.setText(LocaleController.getString(i14));
        rVar2.setTextColor(w05);
        rVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
        int w07 = org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        rVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w06, w07, w07));
        v3Var.addView(rVar2, i7.f6.t(-1, 48, 83, 16, 0, 16, 16));
        rVar2.setOnClickListener(new bg.q(zArr, b5Var, a3Var, 18));
        i7.h6.b(rVar2, 0.02f, 1.2f);
        a3Var.b(v3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        f3Var.setOnDismissListener(new bg.f0(zArr));
        f3Var.setBackgroundColor(i13);
        f3Var.fixNavigationBar(i13);
        return a3Var;
    }

    public static org.telegram.ui.ActionBar.c2 U(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        URLSpan[] uRLSpanArr;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return null;
        }
        y80 y80Var = new y80(o2Var.getParentActivity(), o2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new k4(o2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        y80Var.setText(spannableString);
        y80Var.setTextSize(1, 16.0f);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23188k5, c6Var));
        y80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23205l5, c6Var));
        y80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        y80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.n(y80Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new q2(1, o2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22714a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.MessageLifetime);
        qc0 qc0Var = new qc0(context, null);
        qc0Var.setMinValue(0);
        qc0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            qc0Var.setValue(i10);
        } else if (i10 == 30) {
            qc0Var.setValue(16);
        } else if (i10 == 60) {
            qc0Var.setValue(17);
        } else if (i10 == 3600) {
            qc0Var.setValue(18);
        } else if (i10 == 86400) {
            qc0Var.setValue(19);
        } else if (i10 == 604800) {
            qc0Var.setValue(20);
        } else if (i10 == 0) {
            qc0Var.setValue(0);
        }
        qc0Var.setFormatter(new r2(0));
        alertDialog$Builder.n(qc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new j1(4, encryptedChat, qc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.o2 o2Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        String sb2;
        if (o2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23364u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23382v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new r2(1));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.x3.r(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new ag.b0(2));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        u3.c.l(9306112, hashMap, "Berry", 14598550, "Brandy");
        u3.c.l(8391495, hashMap, "Cherry", 16744272, "Coral");
        u3.c.l(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        u3.c.l(14725375, hashMap, "Mauve", 16761035, "Pink");
        u3.c.l(16711680, hashMap, "Red", 16711807, "Rose");
        u3.c.l(8406555, hashMap, "Russet", 16720896, "Scarlet");
        u3.c.l(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        u3.c.l(16760576, hashMap, "Amber", 15438707, "Apricot");
        u3.c.l(16508850, hashMap, "Banana", 10601738, "Citrus");
        u3.c.l(11560192, hashMap, "Ginger", 16766720, "Gold");
        u3.c.l(16640272, hashMap, "Lemon", 16753920, "Orange");
        u3.c.l(16770484, hashMap, "Peach", 16739155, "Persimmon");
        u3.c.l(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        u3.c.l(16763004, hashMap, "Topaz", 16776960, "Yellow");
        u3.c.l(3688720, hashMap, "Clover", 8628829, "Cucumber");
        u3.c.l(5294200, hashMap, "Emerald", 11907932, "Olive");
        u3.c.l(65280, hashMap, "Green", 43115, "Jade");
        u3.c.l(2730887, hashMap, "Jungle", 12582656, "Lime");
        u3.c.l(776785, hashMap, "Malachite", 10026904, "Mint");
        u3.c.l(11394989, hashMap, "Moss", 3234721, "Azure");
        u3.c.l(255, hashMap, "Blue", 18347, "Cobalt");
        u3.c.l(5204422, hashMap, "Indigo", 96647, "Lagoon");
        u3.c.l(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        u3.c.l(128, hashMap, "Navy", 3101086, "Sapphire");
        u3.c.l(7788522, hashMap, "Sky", 32896, "Teal");
        u3.c.l(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        u3.c.l(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        u3.c.l(13148872, hashMap, "Lilac", 11894492, "Lavender");
        u3.c.l(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        u3.c.l(6684825, hashMap, "Purple", 14204888, "Thistle");
        u3.c.l(14315734, hashMap, "Orchid", 2361920, "Violet");
        u3.c.l(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        u3.c.l(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        u3.c.l(7365973, hashMap, "Coffee", 7956873, "Rum");
        u3.c.l(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        u3.c.l(12759680, hashMap, "Sand", 8924439, "Sienna");
        u3.c.l(7864585, hashMap, "Maple", 15787660, "Khaki");
        u3.c.l(12088115, hashMap, "Copper", 12144200, "Chestnut");
        u3.c.l(15653316, hashMap, "Almond", 16776656, "Cream");
        u3.c.l(12186367, hashMap, "Diamond", 11109127, "Honey");
        u3.c.l(16777200, hashMap, "Ivory", 15392968, "Pearl");
        u3.c.l(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        u3.c.l(16777215, hashMap, "White", 8421504, "Gray");
        u3.c.l(0, hashMap, "Black", 15266260, "Chrome");
        u3.c.l(3556687, hashMap, "Charcoal", 789277, "Ebony");
        u3.c.l(12632256, hashMap, "Silver", 16119285, "Smoke");
        u3.c.l(2499381, hashMap, "Steel", 5220413, "Apple");
        u3.c.l(8434628, hashMap, "Glacier", 16693933, "Melon");
        u3.c.l(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (e6Var == null) {
            e6Var2 = org.telegram.ui.ActionBar.g6.A0().k(false);
        } else {
            e6Var2 = e6Var;
        }
        if (e6Var2 == null || (i11 = e6Var2.f22904c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.r0())[0];
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
            sb2 = a4.w.o((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder f9 = u3.c.f(str, " ");
            f9.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = f9.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        g1 g1Var = new g1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.setOnShowListener(g1Var);
        o2Var.showDialog(c2Var);
        editTextBoldCursor.requestFocus();
        c2Var.d(-1).setOnClickListener(new lh.b0(o2Var, editTextBoldCursor, e6Var, f6Var, c2Var, 8));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        ?? qc0Var = new qc0(activity, null);
        q3 q3Var = new q3(activity, qc0Var);
        q3Var.setOrientation(0);
        q3Var.setWeightSum(1.0f);
        qc0Var.setAllItemsCount(24);
        qc0Var.setItemCount(5);
        qc0Var.setTextColor(w02);
        qc0Var.setGravity(5);
        qc0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? qc0Var2 = new qc0(activity, null);
        qc0Var2.setWrapSelectorWheel(true);
        qc0Var2.setAllItemsCount(60);
        qc0Var2.setItemCount(5);
        qc0Var2.setTextColor(w02);
        qc0Var2.setGravity(3);
        qc0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final jh.i3 i3Var = new jh.i3(i11, i12, (p3) qc0Var, (r3) qc0Var2, i10, q3Var);
        q3Var.addView((View) qc0Var, i7.f6.l(0.5f, 0, 270));
        qc0Var.setFormatter(new n0(22));
        qc0Var.setOnValueChangedListener(new oc0() {
            @Override
            public final void q(qc0 qc0Var3, int i13) {
                switch (r2) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        return;
                    default:
                        i3Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        q3Var.addView((View) qc0Var2, i7.f6.l(0.5f, 0, 270));
        qc0Var2.setFormatter(new n0(23));
        qc0Var2.setOnValueChangedListener(new oc0() {
            @Override
            public final void q(qc0 qc0Var3, int i13) {
                switch (r2) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        return;
                    default:
                        i3Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        i3Var.run(Boolean.FALSE);
        s3 s3Var = new s3(activity, qc0Var, qc0Var2);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        s3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        s3Var.addView(q3Var, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        nh.d dVar = new nh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new k2(r1, 0));
        s3Var.addView(dVar, i7.f6.t(-1, 48, 0, 16, 12, 16, 12));
        f3Var.customView = s3Var;
        f3Var.show();
        f3Var.setOnDismissListener(new ih.j(callback, qc0Var, qc0Var2, 3));
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
    }

    public static org.telegram.ui.ActionBar.c2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
        boolean z10;
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
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, c6Var);
            i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i12));
            i6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23118g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.b(str3, z10);
            f9.addView(i6Var);
            i6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f22714a.H0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(f9);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22714a;
    }

    public static org.telegram.ui.ActionBar.c2 Z(Context context, org.telegram.ui.ActionBar.c6 c6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new m9.b(z10, context, atomicBoolean, aVar, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new kg.w(28, atomicBoolean, aVar));
        alertDialog$Builder.f22714a.setOnDismissListener(new eg.g(4, atomicBoolean, aVar));
        return alertDialog$Builder.f22714a;
    }

    public static void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j10, Utilities.Callback callback) {
        b0(i10, j10, i11, callback, 0L);
    }

    public static void b(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
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
        qc0Var3.setMaxValue(i16);
        qc0Var3.setMinValue(i13);
        int value = qc0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        qc0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        qc0Var2.setMinValue(i11);
        int value2 = qc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        qc0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        qc0Var.setMinValue(i12);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.c6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        jh.s7.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final u2 u2Var = new u2(i10, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.l(j10, "ask_paid_message_", "_price"), 0L)) {
                u2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new lh.b();
            }
            org.telegram.ui.ActionBar.c6 c6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j10);
            if (ChatObject.isMonoForum(i10, j10)) {
                shortName = yf.d.h(i10, j10);
            } else if (U instanceof org.telegram.ui.tn) {
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) U;
                if (tnVar.f42767c4 && tnVar.a() == j10 && (chat = tnVar.f42754b4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f22392id);
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
                        edit.putLong(com.google.android.recaptcha.internal.a.l(j14, "ask_paid_message_", "_price"), j13).apply();
                        jh.s7.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(u2Var);
                }
            }, c6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static long c(nh.d dVar, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, qc0 qc0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((qc0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (qc0Var2.getValue() - 120) % 12);
        qc0Var.setMinValue(1);
        qc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = qc0Var.getValue();
        int value3 = qc0Var3.getValue();
        int value4 = qc0Var4.getValue();
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
        org.telegram.ui.ActionBar.c6 bVar;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j10 = 0;
        int i12 = 0;
        boolean z11 = true;
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
            jh.s7.y(i10, z10).P.put(l10, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.l(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j10 = j12;
            z10 = false;
        }
        long max = Math.max(1, i11) * j10;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new lh.b();
            }
            org.telegram.ui.ActionBar.c6 c6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.nq(i10, max, activity, arrayList, hashMap, callback, c6Var), c6Var, true);
            return true;
        }
        callback.run(hashMap);
        return false;
    }

    public static void d(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        qc0Var3.setMinValue(i12);
        int value = qc0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        qc0Var2.setMinValue(i10);
        int value2 = qc0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        qc0Var.setMinValue(i11);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.l(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void e(TextView textView, qc0 qc0Var, b4 b4Var, c4 c4Var) {
        String str;
        String str2;
        int value = qc0Var.getValue();
        int value2 = b4Var.getValue();
        int value3 = c4Var.getValue();
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

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            String obj = editTextBoldCursor.getText().toString();
            int i10 = org.telegram.ui.ActionBar.g6.f23002a;
            org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            f6Var.f22943b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            f6Var.f22941a = obj;
            org.telegram.ui.ActionBar.g6.f23128h0 = org.telegram.ui.ActionBar.g6.Y0(org.telegram.ui.ActionBar.g6.I.f22949e0);
            f6Var.A = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(o2Var.getParentActivity(), f6Var);
            c2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(o2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e10) {
                FileLog.e(e10);
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
                        if (user.f22539id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f22539id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f22539id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new bg.j3(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.c2 f0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.o2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.f0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.c2");
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
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
        int value = qc0Var.getValue();
        int value2 = qc0Var2.getValue();
        int value3 = qc0Var3.getValue();
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
        qc0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            qc0Var.setMaxValue(i13);
        }
        int value4 = qc0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        qc0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i13) {
                i19 = i12;
            } else {
                i19 = 23;
            }
            qc0Var2.setMaxValue(i19);
        }
        int value5 = qc0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        qc0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i13 && value5 == i12) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            qc0Var3.setMaxValue(i18);
        }
        int value6 = qc0Var3.getValue();
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

    public static void g0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, nm nmVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var));
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
                d4 d4Var = d4.this;
                String trim = d4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = c5.f27308a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(d4Var);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                if (c2Var2 != null) {
                    c2Var2.dismiss();
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, i7.f6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = h81.f29136f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            h81 h81Var = new h81(context, c6Var);
            h81Var.setWebPage(webPage);
            linearLayout.addView(h81Var, i7.f6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new j1(2, editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n0(21));
        if (nmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new b1(4, nmVar));
        }
        c2VarArr[0] = c2Var;
        c2Var.f22784d0 = false;
        c2Var.setOnDismissListener(new d1(editTextBoldCursor, 2));
        c2VarArr[0].setOnShowListener(new ot(2, editTextBoldCursor));
        c2VarArr[0].show();
        TextView textView = (TextView) c2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22392id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f22392id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
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

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
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
                    c2Var.P = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    c2Var.P = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    c2Var.P = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        c2Var.P = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    c2Var.P = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    c2Var.P = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new q2(0, o2Var));
                    break;
                case 6:
                    if (z10) {
                        c2Var.P = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        c2Var.P = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    c2Var.P = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    c2Var.P = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        c2Var.P = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        c2Var.P = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    c2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        c2Var.P = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    c2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    c2Var.P = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        c2Var.P = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    c2Var.P = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        c2Var.P = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        c2Var.P = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        c2Var.P = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    c2Var.N = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    c2Var.P = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.b.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    c2Var.P = sb2.toString();
                    break;
            }
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.c2 i(Activity activity, z4 z4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.r1 r1Var = alertDialog$Builder.f22714a.H0;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f24572f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                e9 e9Var = kVar.f24571e;
                e9Var.m(i10, currentUser);
                kVar.f24568a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                t9 t9Var = kVar.f24570c;
                t9Var.getImageReceiver().setCurrentAccount(i10);
                t9Var.e(currentUser, e9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                f9.addView(kVar, i7.f6.n(-1, 50));
                kVar.setOnClickListener(new bg.q(c2VarArr, r1Var, z4Var, 19));
            }
        }
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(f9);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2VarArr[0] = c2Var;
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        boolean[] zArr = new boolean[1];
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
        textView.setTextSize(1, 16.0f);
        int i15 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        y4 y4Var = new y4(activity, y1VarArr);
        alertDialog$Builder.f22714a.C = 6;
        alertDialog$Builder.n(y4Var);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.E8, c6Var, textView2, 1, 20.0f);
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
        y4Var.addView(textView2, i7.f6.d(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        y4Var.addView(textView, i7.f6.d(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(activity, 1, c6Var);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 7, AndroidUtilities.dp(12.0f)));
            y1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            layoutParams.gravity = i15 | 16;
            y1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            y1VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
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
            y1Var2.setPadding(i14, dp2, dp, AndroidUtilities.dp(12.0f));
            y4Var.addView(y1VarArr[0], i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new v0(5, zArr));
        }
        alertDialog$Builder.k(str2, new j1(8, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        if (z10) {
            c2Var.T0 = true;
        }
        c2Var.show();
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 j(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new l0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22714a;
    }

    public static void j0(org.telegram.ui.ActionBar.o2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.c6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.j0(org.telegram.ui.ActionBar.o2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void k(Context context, org.telegram.ui.ActionBar.c6 c6Var, b5 b5Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        if (c6Var != null) {
            w02 = c6Var.h0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        if (c6Var != null) {
            w03 = c6Var.h0(i11);
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        }
        int i12 = w03;
        int i13 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.h0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.h0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.h0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.h0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.f23152i6;
        if (c6Var != null) {
            c6Var.h0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        if (c6Var != null) {
            w04 = c6Var.h0(i18);
        } else {
            w04 = org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        }
        int i19 = w04;
        int i20 = org.telegram.ui.ActionBar.g6.Oh;
        if (c6Var != null) {
            w05 = c6Var.h0(i20);
        } else {
            w05 = org.telegram.ui.ActionBar.g6.w0(null, i20, false);
        }
        int i21 = w05;
        if (c6Var != null) {
            w06 = c6Var.h0(org.telegram.ui.ActionBar.g6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        }
        int i22 = w06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        g4 g4Var = new g4(context, c6Var, iArr);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(16);
        g4Var.setTextColor(w02);
        g4Var.setValue(0);
        g4Var.setFormatter(new h1(1, iArr));
        h4 h4Var = new h4(context, g4Var, 0);
        h4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        h4Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        h4Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, true, true, false, 1);
        linearLayout.addView(g4Var, i7.f6.l(1.0f, 0, 270));
        r3Var.setPadding(0, 0, 0, 0);
        r3Var.setGravity(17);
        r3Var.setTextColor(i19);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        r3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, i21, i22, i22));
        h4Var.addView(r3Var, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        r3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        g4Var.setOnValueChangedListener(new u(r3Var, 10));
        r3Var.setOnClickListener(new ih.u3(iArr, g4Var, b5Var, a3Var, 6));
        a3Var.b(h4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        f3Var.setBackgroundColor(i12);
        f3Var.fixNavigationBar(i12);
    }

    public static void k0(org.telegram.ui.tn tnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ig igVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (tnVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = tnVar.getAccountInstance();
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, c6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.L0 = false;
                c2Var.J = new d1(igVar, 0);
                c2Var.N = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(tnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1[] y1VarArr = {new org.telegram.ui.Cells.y1(tnVar.getParentActivity(), 1, c6Var)};
                y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                y1VarArr[0].setTag(0);
                y1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                org.telegram.ui.Cells.y1 y1Var = y1VarArr[0];
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
                y1Var.setPadding(dp, 0, dp2, 0);
                linearLayout.addView(y1VarArr[0], i7.f6.n(-1, -2));
                y1VarArr[0].setOnClickListener(new e1(y1VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new eg.e0(user, accountInstance, tnVar, chat, messageObject, y1VarArr, c6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                tnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        if (org.telegram.ui.ActionBar.g6.A0().q()) {
            i10 = R.raw.permission_map_dark;
        } else {
            i10 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i10);
        if (org.telegram.ui.ActionBar.g6.A0().q()) {
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
        frameLayout.addView(view, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, i7.f6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        t9 t9Var = new t9(activity);
        t9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        t9Var.e(user, new e9(0, user));
        frameLayout.addView(t9Var, i7.f6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.R = frameLayout;
        c2Var.K0 = 0.37820512f;
        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new l1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b1(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, null, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, i7.f6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, i7.f6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        frameLayout.addView(frameLayout2, i7.f6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 20.0f);
        org.telegram.ui.b.i(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView i12 = org.telegram.ui.th.i(g10, textView, i7.f6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        i12.setTextSize(1, 14.0f);
        i12.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        i12.setGravity(17);
        g10.addView(i12, i7.f6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        nh.d dVar = new nh.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        g10.addView(dVar, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        q6.customView = g10;
        dVar.setOnClickListener(new org.telegram.ui.ld(i10, dVar, q6, j10));
        q6.fixNavigationBar();
        q6.show();
    }

    public static org.telegram.ui.ActionBar.a3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        float f9;
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, c6Var);
        a3Var.a();
        qc0 qc0Var = new qc0(context, c6Var);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        qc0 qc0Var2 = new qc0(context, c6Var);
        qc0Var2.setItemCount(5);
        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qc0 qc0Var3 = new qc0(context, c6Var);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        z3 z3Var = new z3(context, qc0Var, qc0Var2, qc0Var3);
        z3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        z3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        z3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i12 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i13 = calendar.get(5);
        int i14 = calendar.get(2);
        int i15 = calendar.get(1);
        int i16 = i15 + 1;
        x2 x2Var = new x2(qc0Var3, i16, qc0Var, qc0Var2, i15, i14, i13);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(qc0Var, i7.f6.l(0.25f, 0, 270));
        qc0Var.setMinValue(1);
        qc0Var.setMaxValue(31);
        qc0Var.setWrapSelectorWheel(false);
        qc0Var.setFormatter(new r2(2));
        u uVar = new u(x2Var, 9);
        qc0Var.setOnScrollListener(uVar);
        qc0Var2.setMinValue(0);
        qc0Var2.setMaxValue(11);
        qc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
        qc0Var2.setFormatter(new r2(3));
        qc0Var2.setOnScrollListener(uVar);
        qc0Var3.setMinValue(i12);
        qc0Var3.setMaxValue(i16);
        qc0Var3.setWrapSelectorWheel(false);
        qc0Var3.setFormatter(new j3.x(i16, 4));
        linearLayout.addView(qc0Var3, i7.f6.l(0.25f, 0, 270));
        qc0Var3.setOnScrollListener(uVar);
        if (tL_birthday != null) {
            qc0Var.setValue(tL_birthday.day);
            qc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                qc0Var3.setValue(tL_birthday.year);
            } else {
                qc0Var3.setValue(i16);
            }
        } else {
            qc0Var.setValue(calendar.get(5));
            qc0Var2.setValue(calendar.get(2));
            qc0Var3.setValue(i16);
        }
        x2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            y80 y80Var = new y80(context, null);
            y80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            y80Var.setTextSize(1, 13.0f);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, c6Var));
            y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
            y80Var.setGravity(17);
            frameLayout2.addView(y80Var, i7.f6.e(-2, -2, 17));
            z3Var.addView(frameLayout2, i7.f6.n(-1, -2));
            int i17 = UserConfig.selectedAccount;
            bg.f fVar = new bg.f(i17, y80Var, 29);
            fVar.run();
            f9 = 8.0f;
            NotificationCenter.getInstance(i17).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new y2(fVar, 0));
            ContactsController.getInstance(i17).loadPrivacySettings();
        } else {
            f9 = 8.0f;
        }
        if (z10) {
            nh.d dVar = new nh.d(context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new bg.p2(qc0Var3, i16, x2Var, 9));
            z3Var.addView(dVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(f9);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        i7.h6.a(textView2);
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
        z3Var.addView(textView2, i7.f6.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new jh.r8(qc0Var, qc0Var2, qc0Var3, i16, a3Var, callback));
        if (z11) {
            nh.d dVar2 = new nh.d(context, c6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new t2(2, a3Var, callback));
            z3Var.addView(dVar2, i7.f6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        a3Var.b(z3Var);
        return a3Var;
    }

    public static void m0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        String formatPluralString;
        if (str != null && str.startsWith("FLOOD_WAIT") && o2Var != null && o2Var.getParentActivity() != null) {
            int intValue = Utilities.parseInt((CharSequence) str).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(c2Var, true, null);
        }
    }

    public static void n(org.telegram.ui.ActionBar.o2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.n(org.telegram.ui.ActionBar.o2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.addView(new jh.h4(context, tL_starGiftUnique, userOrChat), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 16.0f);
        org.telegram.ui.b.p(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        g10.addView(textView, i7.f6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(g10);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new b1(2, runnable));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = o2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        y80 y80Var = new y80(context, null);
        NotificationCenter.listenEmojiLoading(y80Var);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        y80Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y80Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f22714a.C = 6;
        alertDialog$Builder.n(frameLayout);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.u(AndroidUtilities.dp(18.0f));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
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
            h5Var.i(org.telegram.ui.ActionBar.g6.f23112g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f23129h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23453z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
            h5Var.i(new jq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23222m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new w0(user, o2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        iq iqVar = new iq(R.drawable.attach_arrow_right, 0);
        iqVar.setTopOffset(1);
        iqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(iqVar, valueOf.length() - 1, valueOf.length(), 33);
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
        float f9 = i15;
        if (z10) {
            i16 = 76;
        } else {
            i16 = 21;
        }
        frameLayout.addView(h5Var, i7.f6.d(-1, -2.0f, i20, f9, 0.0f, i16, 0.0f));
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
        frameLayout.addView(textView, i7.f6.d(-1, -2.0f, i22, f10, 24.0f, i21, 0.0f));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(y80Var, i7.f6.d(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            e9Var.f27964p = 0.8f;
            e9Var.g(12);
            t9Var.h(null, null, e9Var, user);
        } else {
            e9Var.f27964p = 1.0f;
            e9Var.m(o2Var.getCurrentAccount(), user);
            t9Var.e(user, e9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener u0Var = new u0(3, runnable2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        o2Var.showDialog(c2Var, false, u0Var);
        y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new m1(0, context, c2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, c6Var);
        y1Var.setMultiline(true);
        y1Var.getTextView().getLayoutParams().width = -1;
        y1Var.getTextView().setSingleLine(false);
        y1Var.getTextView().setMaxLines(3);
        y1Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i10 = R.string.BrowserAlwaysOpenExternal;
        } else {
            i10 = R.string.BrowserAlwaysOpenInApp;
        }
        y1Var.e(LocaleController.getString(i10), "", false, false, false);
        y1Var.setOnClickListener(new h0(y1Var, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, i7.f6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(y1Var, i7.f6.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22714a.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                        if (c2Var3 != null) {
                            c2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                        if (c2Var3 != null) {
                            c2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        c2VarArr[0] = alertDialog$Builder.o();
    }

    public static org.telegram.ui.ActionBar.a3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(activity, c6Var);
        a3Var.a();
        qc0 qc0Var = new qc0(activity, c6Var);
        qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var.setItemCount(5);
        qc0 qc0Var2 = new qc0(activity, c6Var);
        qc0Var2.setItemCount(5);
        qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        qc0 qc0Var3 = new qc0(activity, c6Var);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        m4 m4Var = new m4(activity, qc0Var, qc0Var2, qc0Var3);
        m4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        m4Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        m4Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(qc0Var, i7.f6.l(0.25f, 0, 270));
        qc0Var.setMinValue(1);
        qc0Var.setMaxValue(31);
        qc0Var.setWrapSelectorWheel(false);
        qc0Var.setFormatter(new n0(0));
        o0 o0Var = new o0(qc0Var, qc0Var2, qc0Var3, 0);
        qc0Var.setOnValueChangedListener(o0Var);
        qc0Var2.setMinValue(0);
        qc0Var2.setMaxValue(11);
        qc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
        qc0Var2.setFormatter(new n0(1));
        qc0Var2.setOnValueChangedListener(o0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        qc0Var3.setMinValue(i10);
        qc0Var3.setMaxValue(i11);
        qc0Var3.setWrapSelectorWheel(false);
        qc0Var3.setFormatter(new n0(2));
        linearLayout.addView(qc0Var3, i7.f6.l(0.25f, 0, 270));
        qc0Var3.setOnValueChangedListener(o0Var);
        qc0Var.setValue(31);
        qc0Var2.setValue(12);
        qc0Var3.setValue(i11);
        b(qc0Var, qc0Var2, qc0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        m4Var.addView(textView2, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new eg.f(qc0Var, qc0Var2, qc0Var3, calendar, (Object) intCallback, a3Var, 1));
        a3Var.b(m4Var);
        return a3Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, ye.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
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
        if (!ye.d.f(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                }
                p2 p2Var = new p2(context, str, j10, z11, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, i7.f6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = h81.f29136f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    h81 h81Var = new h81(context, c6Var);
                    h81Var.setWebPage(webPage);
                    linearLayout.addView(h81Var, i7.f6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                c2Var.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new u(p2Var, 8));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            v = str;
            p2 p2Var2 = new p2(context, str, j10, z11, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
            c2Var2.N = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.g6.f23169j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i102, c6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i102, c6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, i7.f6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = h81.f29136f;
            if (webPage != null) {
                h81 h81Var2 = new h81(context, c6Var);
                h81Var2.setWebPage(webPage);
                linearLayout.addView(h81Var2, i7.f6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            c2Var2.f22778a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new u(p2Var2, 8));
            j7.l1.u(R.string.Cancel, alertDialog$Builder2, null);
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
        ye.d.r(context, parse2, z14, z11, z15, cVar, null, false, true, false);
    }

    public static void q(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (o2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId() != user.f22539id) {
            o2Var.getCurrentAccount();
            Activity parentActivity = o2Var.getParentActivity();
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.u(AndroidUtilities.dp(12.0f));
            e9Var.f27964p = 1.0f;
            e9Var.m(o2Var.getCurrentAccount(), user);
            t9 t9Var = new t9(parentActivity);
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            t9Var.e(user, e9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
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
            float f9 = i14;
            if (!z11) {
                i17 = 21;
            }
            frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, i16, f9, 11.0f, i17, 0.0f));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, i7.f6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new com.google.firebase.messaging.i(o2Var, user, z10, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(alertDialog$Builder.f22714a);
        }
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11) {
        r0(o2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void r(org.telegram.ui.ActionBar.o2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.c6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.r(org.telegram.ui.ActionBar.o2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void r0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, ye.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        long j10;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (o2Var instanceof org.telegram.ui.tn) {
                j10 = ((org.telegram.ui.tn) o2Var).f42758b8;
            } else {
                j10 = 0;
            }
            p0(o2Var.getParentActivity(), str, z10, z11, z12, z13, j10, cVar, webPage, c6Var);
        }
    }

    public static void s(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (o2Var != null) {
            c6Var = o2Var.getResourceProvider();
        } else {
            c6Var = null;
        }
        t(o2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, c6Var);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.th.o(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.th.o(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.th.o(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, c6Var);
            i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i12));
            i6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.b(charSequence, z11);
            i6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
            linearLayout.addView(i6Var);
            i6Var.setOnClickListener(new bg.q(arrayList2, runnable, alertDialog$Builder, 20));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
        if (z10) {
            o10.setCanceledOnTouchOutside(false);
        }
    }

    public static void t(final org.telegram.ui.ActionBar.o2 r44, final boolean r45, final boolean r46, org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.MessagesStorage.BooleanCallback r53, final org.telegram.ui.ActionBar.c6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.t(org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.c6):void");
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (i10 != 0 && o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(alertDialog$Builder.f22714a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.c2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.x3.c("color_", sharedPrefKey, notificationsSettings, -16776961);
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
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(activity, c6Var);
            i6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            i6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.s8.f25669e[i13];
            i6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.s8.f25670f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.b(str, z10);
            f9.addView(i6Var);
            i6Var.setOnClickListener(new s0(f9, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(f9);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(u3.c.e("color_", sharedPrefKey), iArr2[0]);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new k3.e(runnable, i10, j10, 3));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new j1(6, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f22714a;
    }

    public static org.telegram.ui.ActionBar.c2 u0(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        if (o2Var == null) {
            o2Var = LaunchActivity.U();
        }
        if (str2 != null && o2Var != null && o2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = O(o2Var.getParentActivity(), str, str2, null, null, c6Var).f22714a;
            o2Var.showDialog(c2Var);
            return c2Var;
        }
        return null;
    }

    public static void v(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new j1(3, str3, o2Var));
        o2Var.showDialog(c2Var);
    }

    public static org.telegram.ui.ActionBar.c2 v0(org.telegram.ui.ActionBar.o2 o2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.c2 P = P(o2Var.getContext(), o2Var.getResourceProvider(), str, charSequence, str2, runnable);
        o2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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

    public static void w0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        Context context;
        if (str == null) {
            return;
        }
        if (o2Var != null && o2Var.getParentActivity() != null) {
            context = o2Var.getParentActivity();
        } else {
            context = ApplicationLoader.applicationContext;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, e3.d dVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final qc0 qc0Var = new qc0(context, null);
        final qc0 qc0Var2 = new qc0(context, null);
        final qc0 qc0Var3 = new qc0(context, null);
        linearLayout.addView(qc0Var2, i7.f6.l(0.3f, 0, -2));
        qc0Var2.setOnScrollListener(new nc0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        qc0Var.setMinValue(0);
        qc0Var.setMaxValue(11);
        linearLayout.addView(qc0Var, i7.f6.l(0.3f, 0, -2));
        qc0Var.setFormatter(new n0(8));
        qc0Var.setOnValueChangedListener(new o0(qc0Var2, qc0Var, qc0Var3, 1));
        qc0Var.setOnScrollListener(new nc0() {
            @Override
            public final void n(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        qc0Var3.setMinValue(i10 + i16);
        qc0Var3.setMaxValue(i11 + i16);
        qc0Var3.setValue(i16 + i12);
        linearLayout.addView(qc0Var3, i7.f6.l(0.4f, 0, -2));
        qc0Var3.setOnValueChangedListener(new o0(qc0Var2, qc0Var, qc0Var3, 2));
        qc0Var3.setOnScrollListener(new nc0() {
            @Override
            public final void n(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            c5.d(qc0Var2, qc0Var, qc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        y0(qc0Var2, qc0Var, qc0Var3);
        if (z10) {
            d(qc0Var2, qc0Var, qc0Var3);
        }
        if (i13 != -1) {
            qc0Var2.setValue(i13);
            qc0Var.setValue(i14);
            qc0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22714a.N = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.zj(z10, qc0Var2, qc0Var, qc0Var3, dVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new l0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, b5 b5Var) {
        qc0 qc0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
        a3Var.a();
        qc0 qc0Var2 = new qc0(context, null);
        qc0Var2.setTextColor(w02);
        qc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        qc0Var2.setItemCount(5);
        qc0 qc0Var3 = new qc0(context, null);
        qc0Var3.setItemCount(5);
        qc0Var3.setTextColor(w02);
        qc0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
        qc0 qc0Var4 = new qc0(context, null);
        qc0Var4.setItemCount(5);
        qc0Var4.setTextColor(w02);
        qc0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, qc0Var2, qc0Var3, qc0Var4, 1);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.x3.t(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new mh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        eg.r rVar = new eg.r(context, 14);
        linearLayout.addView(qc0Var2, i7.f6.l(0.5f, 0, 270));
        qc0Var2.setMinValue(0);
        qc0Var2.setMaxValue(365);
        qc0Var2.setWrapSelectorWheel(false);
        qc0Var2.setFormatter(new n0(11));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(qc0Var2, qc0Var3, qc0Var4, 15);
        qc0Var2.setOnValueChangedListener(aVar);
        qc0Var3.setMinValue(0);
        qc0Var3.setMaxValue(23);
        linearLayout.addView(qc0Var3, i7.f6.l(0.2f, 0, 270));
        qc0Var3.setFormatter(new n0(12));
        qc0Var3.setOnValueChangedListener(aVar);
        qc0Var4.setMinValue(0);
        qc0Var4.setMaxValue(59);
        qc0Var4.setValue(0);
        qc0Var4.setFormatter(new n0(13));
        linearLayout.addView(qc0Var4, i7.f6.l(0.3f, 0, 270));
        qc0Var4.setOnValueChangedListener(aVar);
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
                qc0Var4.setValue(calendar.get(12));
                qc0Var3.setValue(calendar.get(11));
                qc0Var = qc0Var2;
                qc0Var.setValue(timeInMillis);
            } else {
                qc0Var = qc0Var2;
            }
        } else {
            qc0Var = qc0Var2;
        }
        qc0 qc0Var5 = qc0Var;
        g(null, null, 0L, 0L, 0, qc0Var5, qc0Var3, qc0Var4);
        rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        rVar.setGravity(17);
        rVar.setTextColor(w04);
        rVar.setTextSize(1, 14.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
        rVar.setText(str2);
        v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
        rVar.setOnClickListener(new eg.f(qc0Var5, qc0Var3, qc0Var4, calendar, (Object) b5Var, a3Var, 3));
        a3Var.b(v3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
        f3Var.show();
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
    }

    public static void y0(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, qc0Var2.getValue());
        calendar.set(1, qc0Var3.getValue());
        qc0Var.setMinValue(1);
        qc0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void z(final org.telegram.ui.ActionBar.o2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.c6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c5.z(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.c6):void");
    }
}
