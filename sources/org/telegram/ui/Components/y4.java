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
import org.telegram.ui.ug1;
public abstract class y4 {
    public static final Pattern f34847a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        p20 p20Var = new p20(0, context, true);
        p20Var.setImportantForAccessibility(2);
        fh.d2 d2Var = new fh.d2(context, p20Var);
        d2Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        d2Var.setClipToOutline(true);
        d2Var.setOutlineProvider(new bg.q1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        d2Var.addView(view, g7.e6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        d2Var.addView(p20Var, g7.e6.c(117.0f, 117));
        alertDialog$Builder.f22702a.R = d2Var;
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.f22771f0 = true;
        c2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22702a.K0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, ug1 ug1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, g7.e6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f22702a.R = frameLayout;
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new dh.s(5, activity, z10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.f22771f0 = true;
        c2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), ug1Var);
        alertDialog$Builder.f22702a.K0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new f1(launchActivity, 1));
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.c2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.c2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.b6 b6Var) {
        int w02;
        int i9;
        int i10;
        int w03;
        int w04;
        int w05;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        if (b6Var != null) {
            w02 = b6Var.p0(i11);
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        }
        textView.setTextColor(w02);
        textView.setTextSize(1, 16.0f);
        int i12 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 48);
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        int i13 = i12 | 48;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f10.addView(textView, g7.e6.t(-2, -2, i13, 24, i10, 24, 8));
        for (int i14 = 0; i14 < 4; i14++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, b6Var);
            k6Var.d = 42;
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i14));
            int i15 = org.telegram.ui.ActionBar.f6.f23056g7;
            if (b6Var != null) {
                w04 = b6Var.p0(i15);
            } else {
                w04 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
            }
            int i16 = org.telegram.ui.ActionBar.f6.E5;
            if (b6Var != null) {
                w05 = b6Var.p0(i16);
            } else {
                w05 = org.telegram.ui.ActionBar.f6.w0(null, i16, false);
            }
            k6Var.a(w04, w05);
            String str = strArr[i14];
            if (iArr[0] == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.b(str, z11);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new p0(iArr, f10));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            if (b6Var != null) {
                w03 = b6Var.p0(org.telegram.ui.ActionBar.f6.L5);
            } else {
                w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false);
            }
            c2Var.X = new sp0(activity, 0);
            c2Var.Y = w03;
        }
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new ih.v3(29, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.f3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.o2 o2Var, final org.telegram.ui.ActionBar.b6 b6Var) {
        if (o2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(o2Var.getParentActivity(), b6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.Notifications);
        f3Var.bigTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0])), LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0])), LocaleController.getString(R.string.MuteDisable)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i9) {
                int i10;
                if (i9 == 0) {
                    i10 = 0;
                } else if (i9 == 1) {
                    i10 = 1;
                } else if (i9 == 2) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i10);
                org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                if (oc.a(o2Var2)) {
                    oc.z(o2Var2, i10, 0, b6Var).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        return f3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.b6 b6Var, x4 x4Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        if (b6Var != null) {
            w02 = b6Var.p0(i9);
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        if (b6Var != null) {
            w03 = b6Var.p0(i10);
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.f6.Ji;
        if (b6Var != null) {
            b6Var.p0(i11);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.f6.Ni;
        if (b6Var != null) {
            b6Var.p0(i12);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.f6.E8;
        if (b6Var != null) {
            b6Var.p0(i13);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.f6.G8;
        if (b6Var != null) {
            b6Var.p0(i14);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.f6.f23092i6;
        if (b6Var != null) {
            b6Var.p0(i15);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.f6.Sh;
        if (b6Var != null) {
            w04 = b6Var.p0(i16);
        } else {
            w04 = org.telegram.ui.ActionBar.f6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.f6.Oh;
        if (b6Var != null) {
            w05 = b6Var.p0(i17);
        } else {
            w05 = org.telegram.ui.ActionBar.f6.w0(null, i17, false);
        }
        int i18 = w05;
        if (b6Var != null) {
            w06 = b6Var.p0(org.telegram.ui.ActionBar.f6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        }
        int i19 = w06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, b6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(w02);
        h4Var.setValue(0);
        h4Var.setFormatter(new e1(0, iArr));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bg.t tVar = new bg.t(context, 20);
        linearLayout.addView(h4Var, g7.e6.l(1.0f, 0, 270));
        h4Var.setOnValueChangedListener(new org.telegram.ui.tr(10));
        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar.setGravity(17);
        tVar.setTextColor(w04);
        tVar.setTextSize(1, 14.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, i18, i19, i19));
        tVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        d4Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        tVar.setOnClickListener(new fh.g4(iArr, h4Var, x4Var, a3Var, 7));
        a3Var.b(d4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = str;
        HashMap hashMap = new HashMap();
        int i9 = org.telegram.ui.ActionBar.f6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.f6.w0(null, i9, false), hashMap);
        alertDialog$Builder.f22702a.S = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f22702a.P = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 I(Activity activity, long j10, final long j11, int i9, final Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        String[] strArr;
        boolean z10;
        final long j12 = j10;
        final int i10 = i9;
        final SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j12 != 0) {
            int i11 = notificationsSettings.getInt("priority_" + j12, 3);
            iArr[0] = i11;
            if (i11 == 3) {
                iArr[0] = 0;
            } else if (i11 == 4) {
                iArr[0] = 1;
            } else if (i11 == 5) {
                iArr[0] = 2;
            } else if (i11 == 0) {
                iArr[0] = 3;
            } else {
                iArr[0] = 4;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPrioritySettings), LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        } else {
            if (i10 == 1) {
                iArr[0] = notificationsSettings.getInt("priority_messages", 1);
            } else if (i10 == 0) {
                iArr[0] = notificationsSettings.getInt("priority_group", 1);
            } else if (i10 == 2) {
                iArr[0] = notificationsSettings.getInt("priority_channel", 1);
            } else if (i10 == 3) {
                iArr[0] = notificationsSettings.getInt("priority_stories", 1);
            } else if (i10 == 4 || i10 == 5) {
                iArr[0] = notificationsSettings.getInt("priority_react", 1);
            }
            int i12 = iArr[0];
            if (i12 == 4) {
                iArr[0] = 0;
            } else if (i12 == 5) {
                iArr[0] = 1;
            } else if (i12 == 0) {
                iArr[0] = 2;
            } else {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.NotificationsPriorityLow), LocaleController.getString(R.string.NotificationsPriorityMedium), LocaleController.getString(R.string.NotificationsPriorityHigh), LocaleController.getString(R.string.NotificationsPriorityUrgent)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        int i13 = 0;
        while (i13 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, b6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i13));
            k6Var.a(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23056g7, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
            String str = strArr2[i13];
            if (iArr[0] == i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(str, z10);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i14;
                    int intValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i15 = 0;
                    iArr2[0] = intValue;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j13 = j12;
                    if (j13 != 0) {
                        int i16 = iArr2[0];
                        if (i16 == 0) {
                            i15 = 3;
                        } else if (i16 == 1) {
                            i15 = 4;
                        } else if (i16 == 2) {
                            i15 = 5;
                        } else if (i16 != 3) {
                            i15 = 1;
                        }
                        edit.putInt("priority_" + j13, i15);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j13, j11);
                    } else {
                        int i17 = iArr2[0];
                        if (i17 == 0) {
                            i14 = 4;
                        } else if (i17 == 1) {
                            i14 = 5;
                        } else if (i17 == 2) {
                            i14 = 0;
                        } else {
                            i14 = 1;
                        }
                        int i18 = i10;
                        SharedPreferences sharedPreferences = notificationsSettings;
                        if (i18 == 1) {
                            edit.putInt("priority_messages", i14);
                            iArr2[0] = sharedPreferences.getInt("priority_messages", 1);
                        } else if (i18 == 0) {
                            edit.putInt("priority_group", i14);
                            iArr2[0] = sharedPreferences.getInt("priority_group", 1);
                        } else if (i18 == 2) {
                            edit.putInt("priority_channel", i14);
                            iArr2[0] = sharedPreferences.getInt("priority_channel", 1);
                        } else if (i18 == 3) {
                            edit.putInt("priority_stories", i14);
                            iArr2[0] = sharedPreferences.getInt("priority_stories", 1);
                        } else if (i18 == 4 || i18 == 5) {
                            edit.putInt("priority_react", i14);
                            iArr2[0] = sharedPreferences.getInt("priority_react", 1);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i18);
                    }
                    edit.commit();
                    alertDialog$Builder.f22702a.H0.run();
                    runnable.run();
                }
            });
            i13++;
            j12 = j10;
            i10 = i9;
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static void J(int i9, Activity activity, long j10, TLRPC.Photo photo, ih.b bVar) {
        if (activity != null) {
            fh.y yVar = new fh.y(i9, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, bVar, true, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            f3Var.bigTitle = true;
            w2 w2Var = new w2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, yVar, 0);
            f3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            f3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            f3Var.onClickListener = w2Var;
            f3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.a3 K(final Context context, final long j10, long j11, int i9, boolean z10, final x4 x4Var, Runnable runnable, w4 w4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        FrameLayout frameLayout;
        Context context2;
        ViewGroup viewGroup;
        int i10;
        FrameLayout frameLayout2;
        ?? r82;
        int i11;
        boolean[] zArr;
        long j12;
        FrameLayout frameLayout3;
        TextView textView;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i12;
        Calendar calendar;
        int i13;
        char c10;
        int i14;
        int i15;
        int[] iArr;
        String[] strArr;
        org.telegram.ui.ActionBar.w0 w0Var2;
        String[] strArr2;
        View view;
        mi0 mi0Var;
        Calendar calendar2;
        int[] iArr2;
        int i16;
        ViewGroup viewGroup3;
        float f10;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        final org.telegram.ui.ActionBar.f3 f3Var;
        View view2;
        int i17;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i9};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        final ?? bc0Var = new bc0(context, b6Var);
        int i18 = w4Var.f34092a;
        int i19 = w4Var.f34094c;
        int i20 = w4Var.f34093b;
        bc0Var.setTextColor(i18);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        final ?? bc0Var2 = new bc0(context, b6Var);
        bc0Var2.setWrapSelectorWheel(true);
        bc0Var2.setAllItemsCount(24);
        bc0Var2.setItemCount(5);
        bc0Var2.setTextColor(i18);
        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? bc0Var3 = new bc0(context, b6Var);
        bc0Var3.setWrapSelectorWheel(true);
        bc0Var3.setAllItemsCount(60);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextColor(i18);
        bc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? r3Var = new r3(context, bc0Var, bc0Var2, bc0Var3, 0);
        r3Var.setClipToPadding(false);
        r3Var.setClipChildren(false);
        r3Var.setOrientation(1);
        frameLayout4.addView((View) r3Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        r3Var.addView(frameLayout6, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
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
        org.telegram.messenger.l0.q(textView5, i18, 1, 20.0f);
        frameLayout6.addView(textView5, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new jh.d(10));
        boolean[] zArr2 = {true};
        if (DialogObject.isUserDialog(j10) && j10 != clientUserId && (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) != null && !user.bot && (userStatus = user.status) != null && userStatus.expires > 0) {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            viewGroup = frameLayout4;
            frameLayout2 = frameLayout;
            r82 = 0;
            i11 = -1;
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            viewGroup2 = r3Var;
            textView = null;
            i10 = i20;
            zArr = zArr2;
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, w4Var.f34092a, false, b6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(i19, 1, -1));
            frameLayout3.addView(w0Var, g7.e6.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            context2 = context;
            viewGroup = frameLayout4;
            i10 = i20;
            frameLayout2 = frameLayout;
            r82 = 0;
            i11 = -1;
            zArr = zArr2;
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            textView = null;
            viewGroup2 = r3Var;
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.setOnClickListener(new mh.k3(28, w0Var, w4Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(x4Var, zArr, a3Var, 18));
        }
        ?? imageView = new ImageView(context2);
        mi0 mi0Var2 = new mi0(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        mi0Var2.H(true);
        mi0Var2.h = true;
        mi0Var2.start();
        mi0Var2.K(40);
        mi0Var2.N(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(mi0Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(i19, 1, i11));
        if (w0Var != null) {
            i12 = 42;
        } else {
            i12 = 0;
        }
        frameLayout3.addView(imageView, g7.e6.d(40, 40.0f, 53, 0.0f, 8.0f, i12 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final bg.t tVar = new bg.t(context2, 15);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(bc0Var, g7.e6.l(0.5f, r82, 270));
        bc0Var.setMinValue(r82);
        bc0Var.setMaxValue(365);
        bc0Var.setWrapSelectorWheel(r82);
        bc0Var.setFormatter(new g2(r82));
        ViewGroup viewGroup4 = viewGroup2;
        final boolean[] zArr3 = zArr;
        final long j13 = j12;
        int i21 = i10;
        zb0 zb0Var = new zb0() {
            @Override
            public final void m(bc0 bc0Var4, int i22) {
                int i23;
                if (j13 == j10) {
                    i23 = 1;
                } else {
                    i23 = 0;
                }
                y4.g(bg.t.this, null, 0L, 0L, i23, bc0Var, bc0Var2, bc0Var3);
            }
        };
        bc0Var.setOnValueChangedListener(zb0Var);
        bc0Var2.setMinValue(r82);
        bc0Var2.setMaxValue(23);
        linearLayout.addView(bc0Var2, g7.e6.l(0.2f, r82, 270));
        bc0Var2.setFormatter(new g2(1));
        bc0Var2.setOnValueChangedListener(zb0Var);
        bc0Var3.setMinValue(r82);
        bc0Var3.setMaxValue(59);
        bc0Var3.setValue(r82);
        bc0Var3.setFormatter(new g2(2));
        linearLayout.addView(bc0Var3, g7.e6.l(0.3f, r82, 270));
        bc0Var3.setOnValueChangedListener(zb0Var);
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
                bc0Var3.setValue(calendar.get(12));
                bc0Var2.setValue(calendar.get(11));
                bc0Var.setValue(timeInMillis);
            }
        } else {
            calendar = calendar3;
        }
        final boolean[] zArr4 = {true};
        if (j13 == j10) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        g(tVar, null, 0L, 0L, i13, bc0Var, bc0Var2, bc0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            c10 = '\t';
            i14 = 10;
            i15 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i14 = 10;
            i15 = 8;
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
            strArr[i15] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[c10] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        } else {
            strArr = new String[i15];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = LocaleController.getString(R.string.MessageScheduledRepeatOptionDaily);
            strArr[2] = LocaleController.getString(R.string.MessageScheduledRepeatOptionWeekly);
            strArr[3] = LocaleController.getString(R.string.MessageScheduledRepeatOptionBiweekly);
            strArr[4] = LocaleController.getString(R.string.MessageScheduledRepeatOptionMonthly);
            strArr[5] = LocaleController.getString(R.string.MessageScheduledRepeatOption3Monthly);
            strArr[6] = LocaleController.getString(R.string.MessageScheduledRepeatOption6Monthly);
            strArr[7] = LocaleController.getString(R.string.MessageScheduledRepeatOptionYearly);
        }
        if (!z10) {
            ?? frameLayout7 = new FrameLayout(context2);
            calendar2 = calendar;
            i16 = i21;
            int v = org.telegram.ui.ActionBar.f6.v(i16, org.telegram.ui.ActionBar.f6.l1(0.075f, i18));
            strArr2 = strArr;
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, i18);
            textView4 = new TextView(context2);
            view = imageView;
            mi0Var = mi0Var2;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i18);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v4 = org.telegram.ui.ActionBar.f6.v(v, l1);
            textView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v, v4, v4));
            textView4.setGravity(17);
            w0Var2 = w0Var3;
            int[] iArr4 = iArr;
            f10 = 14.0f;
            ?? k6Var = new org.telegram.ui.k6(iArr4, iArr3, strArr2, textView4, 16);
            iArr2 = iArr4;
            k6Var.run();
            frameLayout7.addView(textView4, g7.e6.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ViewGroup viewGroup5 = viewGroup4;
            viewGroup5.addView((View) frameLayout7, g7.e6.n(-1, -2));
            textView3 = k6Var;
            textView2 = frameLayout7;
            viewGroup3 = viewGroup5;
        } else {
            w0Var2 = w0Var3;
            strArr2 = strArr;
            view = imageView;
            mi0Var = mi0Var2;
            calendar2 = calendar;
            iArr2 = iArr;
            i16 = i21;
            viewGroup3 = viewGroup4;
            f10 = 14.0f;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        }
        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar.setGravity(17);
        tVar.setTextColor(w4Var.f34097g);
        tVar.setTextSize(1, f10);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, w4Var.h));
        viewGroup3.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar4 = calendar2;
        tVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                int i22;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i22 = 1;
                } else {
                    i22 = 0;
                }
                bc0 bc0Var4 = bc0Var;
                p3 p3Var = bc0Var2;
                q3 q3Var = bc0Var3;
                boolean g10 = y4.g(null, null, 0L, 0L, i22, bc0Var4, p3Var, q3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, bc0Var4.getValue());
                calendar5.set(11, p3Var.getValue());
                calendar5.set(12, q3Var.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z11 = zArr3[0];
                x4Var.B((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = a3Var.f22713a.dismissRunnable;
                runnable2.run();
            }
        });
        a3Var.b(viewGroup);
        org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f22713a;
        f3Var2.show();
        f3Var2.setOnDismissListener(new k2(runnable, zArr4));
        f3Var2.setBackgroundColor(i16);
        f3Var2.fixNavigationBar(i16);
        if (textView4 != null) {
            view2 = view;
            i17 = 1;
            f3Var = f3Var2;
            textView4.setOnClickListener(new y1(frameLayout2, b6Var, f3Var2, (FrameLayout) textView2, iArr2, strArr2, iArr3, (org.telegram.ui.k6) textView3));
        } else {
            f3Var = f3Var2;
            view2 = view;
            i17 = 1;
        }
        final kh.x3[] x3VarArr = new kh.x3[i17];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        final mi0 mi0Var3 = mi0Var;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                int i22;
                String string;
                int i23;
                int i24;
                int i25;
                int i26;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                mi0 mi0Var4 = mi0Var3;
                if (!z11) {
                    if (mi0Var4.X >= 40) {
                        mi0Var4.K(0);
                    }
                    mi0Var4.N(40);
                    mi0Var4.start();
                } else {
                    if (mi0Var4.X < 40) {
                        mi0Var4.K(40);
                    }
                    mi0Var4.N(80);
                    mi0Var4.start();
                }
                kh.x3[] x3VarArr2 = x3VarArr;
                kh.x3 x3Var = x3VarArr2[0];
                if (x3Var != null) {
                    x3Var.e(true);
                    x3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                kh.x3 x3Var2 = new kh.x3(context, 3);
                x3VarArr2[0] = x3Var2;
                x3Var2.s();
                x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                x3Var2.r(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int l12 = org.telegram.ui.ActionBar.f6.l1(0.25f, -16777216);
                x3Var2.f16348e0 = dp2;
                x3Var2.f16350f0 = dp3;
                x3Var2.f16351g0 = l12;
                x3Var2.B.setShadowLayer(dp2, 0.0f, dp3, l12);
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
                x3Var2.t(string);
                x3Var2.d = 5000L;
                if (w0Var4 != null) {
                    i25 = 42;
                } else {
                    i25 = -8;
                }
                x3Var2.m(1.0f, -(i25 + 20));
                x3Var2.f16352h0 = new fg(x3Var2, 2);
                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                f3Var3.getContainerView().setClipToPadding(false);
                f3Var3.getContainerView().setClipChildren(false);
                f3Var3.getContainerView().addView(x3Var2, g7.e6.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                x3Var2.v();
            }
        });
        return a3Var;
    }

    public static void L(Context context, long j10, x4 x4Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(null), null);
    }

    public static void M(Context context, long j10, x4 x4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(b6Var), b6Var);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2) {
        return O(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder O(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = str;
        c2Var.P = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new y0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 P(Context context, org.telegram.ui.ActionBar.b6 b6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = str;
        c2Var.P = charSequence;
        alertDialog$Builder.k(str2, new y0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.o1 Q(org.telegram.ui.ActionBar.o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (o2Var != null && view != null) {
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            o1Var.f23690e = true;
            o1Var.f23689c = 220;
            o1Var.setOutsideTouchable(true);
            o1Var.setClippingEnabled(true);
            o1Var.setAnimationStyle(R.style.PopupContextAnimation);
            o1Var.setFocusable(true);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            o1Var.setInputMethodMode(2);
            o1Var.getContentView().setFocusableInTouchMode(true);
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
            o1Var.showAtLocation(view.getRootView(), 0, (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f13 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            o1Var.b();
            return o1Var;
        }
        return null;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3, String str4, int i9, String str5, org.telegram.ui.ActionBar.b6 b6Var, MessagesStorage.StringCallback stringCallback) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = str6;
        c2Var.P = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, b6Var));
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new z1(editTextBoldCursor, i9, stringCallback, c2VarArr, view2, 0));
        editTextBoldCursor.addTextChangedListener(new t3(i9, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, g7.e6.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22702a.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new c3.e(editTextBoldCursor, i9, stringCallback, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.tr(20));
        c2VarArr[0] = alertDialog$Builder.f22702a;
        if (o2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, o2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
        c2Var2.f22767d0 = false;
        c2Var2.setOnDismissListener(new fh.j(editTextBoldCursor, o2Var, findActivity, 4));
        c2VarArr[0].setOnShowListener(new d1(1, editTextBoldCursor));
        c2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), b6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.a3 T(Context context, long j10, final x4 x4Var, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        int i10;
        final int i11;
        int i12;
        int i13;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
        int i14 = org.telegram.ui.ActionBar.f6.f23092i6;
        org.telegram.ui.ActionBar.f6.w0(null, i14, false);
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        final bc0 bc0Var = new bc0(context, b6Var);
        bc0Var.setTextColor(w02);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        final ?? bc0Var2 = new bc0(context, b6Var);
        bc0Var2.setWrapSelectorWheel(true);
        bc0Var2.setAllItemsCount(24);
        bc0Var2.setItemCount(5);
        bc0Var2.setTextColor(w02);
        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? bc0Var3 = new bc0(context, b6Var);
        bc0Var3.setWrapSelectorWheel(true);
        bc0Var3.setAllItemsCount(60);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextColor(w02);
        bc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, bc0Var, bc0Var2, bc0Var3, 5);
        r3Var.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        r3Var.addView(f10, g7.e6.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        if (i9 == 1) {
            i10 = R.string.SuggestedPostAcceptTitle;
        } else {
            i10 = R.string.PostSuggestionsAddTime;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(textView, g7.e6.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new jh.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23386z6, b6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        f10.addView(textView2, g7.e6.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i15 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final bg.t tVar = new bg.t(context, 21);
        linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
        bc0Var.setMinValue(0);
        bc0Var.setMaxValue(365);
        bc0Var.setWrapSelectorWheel(false);
        bc0Var.setFormatter(new h3.x(i15, 3));
        if (i9 == 1) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        zb0 zb0Var = new zb0() {
            @Override
            public final void m(bc0 bc0Var4, int i16) {
                y4.g(bg.t.this, null, j11, j12, i11, bc0Var, bc0Var2, bc0Var3);
            }
        };
        bc0Var.setOnValueChangedListener(zb0Var);
        bc0Var2.setMinValue(0);
        bc0Var2.setMaxValue(23);
        linearLayout.addView((View) bc0Var2, g7.e6.l(0.2f, 0, 270));
        bc0Var2.setFormatter(new org.telegram.ui.tr(15));
        bc0Var2.setOnValueChangedListener(zb0Var);
        bc0Var3.setMinValue(0);
        bc0Var3.setMaxValue(59);
        bc0Var3.setValue(0);
        bc0Var3.setFormatter(new org.telegram.ui.tr(16));
        linearLayout.addView((View) bc0Var3, g7.e6.l(0.3f, 0, 270));
        bc0Var3.setOnValueChangedListener(zb0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = 1000 * j10;
            i12 = w03;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                bc0Var3.setValue(calendar.get(12));
                bc0Var2.setValue(calendar.get(11));
                bc0Var.setValue(timeInMillis);
            }
        } else {
            i12 = w03;
        }
        final boolean[] zArr = {true};
        g(tVar, null, j11, j12, i11, bc0Var, bc0Var2, bc0Var3);
        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar.setGravity(17);
        tVar.setTextColor(w04);
        tVar.setTextSize(1, 14.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{8.0f}, w05));
        r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i11;
        tVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i17 = i16;
                bc0 bc0Var4 = bc0Var;
                o4 o4Var = bc0Var2;
                p4 p4Var = bc0Var3;
                boolean g10 = y4.g(null, null, j14, j15, i17, bc0Var4, o4Var, p4Var);
                long epochMilli = LocalDate.now().plusDays(bc0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, o4Var.getValue());
                calendar2.set(12, p4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                x4Var.B((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = a3Var.f22713a.dismissRunnable;
                runnable.run();
            }
        });
        g7.g6.b(tVar, 0.02f, 1.2f);
        bg.t tVar2 = new bg.t(context, 22);
        tVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar2.setGravity(17);
        if (i9 == 1) {
            i13 = R.string.MessageSuggestionPublishNow;
        } else {
            i13 = R.string.PostSuggestionsAnytime;
        }
        tVar2.setText(LocaleController.getString(i13));
        tVar2.setTextColor(w05);
        tVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
        int w07 = org.telegram.ui.ActionBar.f6.w0(null, i14, false);
        tVar2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w06, w07, w07));
        r3Var.addView(tVar2, g7.e6.t(-1, 48, 83, 16, 0, 16, 16));
        tVar2.setOnClickListener(new fg.f(zArr, x4Var, a3Var, 17));
        g7.g6.b(tVar2, 0.02f, 1.2f);
        a3Var.b(r3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        f3Var.setOnDismissListener(new kh.g1(zArr));
        f3Var.setBackgroundColor(i12);
        f3Var.fixNavigationBar(i12);
        return a3Var;
    }

    public static org.telegram.ui.ActionBar.c2 U(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        URLSpan[] uRLSpanArr;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return null;
        }
        l80 l80Var = new l80(o2Var.getParentActivity(), o2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(o2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        l80Var.setText(spannableString);
        l80Var.setTextSize(1, 16.0f);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23126k5, b6Var));
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23143l5, b6Var));
        l80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var);
        alertDialog$Builder.n(l80Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new n2(1, o2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.b6 b6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.MessageLifetime);
        bc0 bc0Var = new bc0(context, null);
        bc0Var.setMinValue(0);
        bc0Var.setMaxValue(20);
        int i9 = encryptedChat.ttl;
        if (i9 > 0 && i9 < 16) {
            bc0Var.setValue(i9);
        } else if (i9 == 30) {
            bc0Var.setValue(16);
        } else if (i9 == 60) {
            bc0Var.setValue(17);
        } else if (i9 == 3600) {
            bc0Var.setValue(18);
        } else if (i9 == 86400) {
            bc0Var.setValue(19);
        } else if (i9 == 604800) {
            bc0Var.setValue(20);
        } else if (i9 == 0) {
            bc0Var.setValue(0);
        }
        bc0Var.setFormatter(new g2(6));
        alertDialog$Builder.n(bc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new g1(4, encryptedChat, bc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.o2 o2Var, int i9, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        String sb2;
        if (o2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23302u5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23318v5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new g2(7));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i9 != 0) {
            org.telegram.messenger.l0.m(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new o2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        ta.b.h(9306112, hashMap, "Berry", 14598550, "Brandy");
        ta.b.h(8391495, hashMap, "Cherry", 16744272, "Coral");
        ta.b.h(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        ta.b.h(14725375, hashMap, "Mauve", 16761035, "Pink");
        ta.b.h(16711680, hashMap, "Red", 16711807, "Rose");
        ta.b.h(8406555, hashMap, "Russet", 16720896, "Scarlet");
        ta.b.h(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        ta.b.h(16760576, hashMap, "Amber", 15438707, "Apricot");
        ta.b.h(16508850, hashMap, "Banana", 10601738, "Citrus");
        ta.b.h(11560192, hashMap, "Ginger", 16766720, "Gold");
        ta.b.h(16640272, hashMap, "Lemon", 16753920, "Orange");
        ta.b.h(16770484, hashMap, "Peach", 16739155, "Persimmon");
        ta.b.h(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        ta.b.h(16763004, hashMap, "Topaz", 16776960, "Yellow");
        ta.b.h(3688720, hashMap, "Clover", 8628829, "Cucumber");
        ta.b.h(5294200, hashMap, "Emerald", 11907932, "Olive");
        ta.b.h(65280, hashMap, "Green", 43115, "Jade");
        ta.b.h(2730887, hashMap, "Jungle", 12582656, "Lime");
        ta.b.h(776785, hashMap, "Malachite", 10026904, "Mint");
        ta.b.h(11394989, hashMap, "Moss", 3234721, "Azure");
        ta.b.h(255, hashMap, "Blue", 18347, "Cobalt");
        ta.b.h(5204422, hashMap, "Indigo", 96647, "Lagoon");
        ta.b.h(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        ta.b.h(128, hashMap, "Navy", 3101086, "Sapphire");
        ta.b.h(7788522, hashMap, "Sky", 32896, "Teal");
        ta.b.h(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        ta.b.h(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        ta.b.h(13148872, hashMap, "Lilac", 11894492, "Lavender");
        ta.b.h(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        ta.b.h(6684825, hashMap, "Purple", 14204888, "Thistle");
        ta.b.h(14315734, hashMap, "Orchid", 2361920, "Violet");
        ta.b.h(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        ta.b.h(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        ta.b.h(7365973, hashMap, "Coffee", 7956873, "Rum");
        ta.b.h(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        ta.b.h(12759680, hashMap, "Sand", 8924439, "Sienna");
        ta.b.h(7864585, hashMap, "Maple", 15787660, "Khaki");
        ta.b.h(12088115, hashMap, "Copper", 12144200, "Chestnut");
        ta.b.h(15653316, hashMap, "Almond", 16776656, "Cream");
        ta.b.h(12186367, hashMap, "Diamond", 11109127, "Honey");
        ta.b.h(16777200, hashMap, "Ivory", 15392968, "Pearl");
        ta.b.h(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        ta.b.h(16777215, hashMap, "White", 8421504, "Gray");
        ta.b.h(0, hashMap, "Black", 15266260, "Chrome");
        ta.b.h(3556687, hashMap, "Charcoal", 789277, "Ebony");
        ta.b.h(12632256, hashMap, "Silver", 16119285, "Smoke");
        ta.b.h(2499381, hashMap, "Steel", 5220413, "Apple");
        ta.b.h(8434628, hashMap, "Glacier", 16693933, "Melon");
        ta.b.h(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (d6Var == null) {
            d6Var2 = org.telegram.ui.ActionBar.f6.A0().k(false);
        } else {
            d6Var2 = d6Var;
        }
        if (d6Var2 == null || (i10 = d6Var2.f22868c) == 0) {
            i10 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.f6.r0())[0];
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int i12 = Integer.MAX_VALUE;
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int red2 = Color.red(num.intValue());
            int i13 = (red + red2) / 2;
            int i14 = red - red2;
            int green2 = green - Color.green(num.intValue());
            int blue2 = blue - Color.blue(num.intValue());
            int i15 = (green2 * 4 * green2) + ((((i13 + 512) * i14) * i14) >> 8) + ((((767 - i13) * blue2) * blue2) >> 8);
            if (i15 < i12) {
                str = (String) entry.getValue();
                i12 = i15;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            sb2 = aa.d.p((String) asList.get(Utilities.random.nextInt(asList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = e10.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        d1 d1Var = new d1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.setOnShowListener(d1Var);
        o2Var.showDialog(c2Var);
        editTextBoldCursor.requestFocus();
        c2Var.d(-1).setOnClickListener(new ih.d0(o2Var, editTextBoldCursor, d6Var, e6Var, c2Var, 8));
    }

    public static void X(Activity activity, String str, int i9, int i10, int i11, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, null, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        ?? bc0Var = new bc0(activity, null);
        m3 m3Var = new m3(activity, bc0Var);
        m3Var.setOrientation(0);
        m3Var.setWeightSum(1.0f);
        bc0Var.setAllItemsCount(24);
        bc0Var.setItemCount(5);
        bc0Var.setTextColor(w02);
        bc0Var.setGravity(5);
        bc0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? bc0Var2 = new bc0(activity, null);
        bc0Var2.setWrapSelectorWheel(true);
        bc0Var2.setAllItemsCount(60);
        bc0Var2.setItemCount(5);
        bc0Var2.setTextColor(w02);
        bc0Var2.setGravity(3);
        bc0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final gh.j3 j3Var = new gh.j3(i10, i11, (l3) bc0Var, (n3) bc0Var2, i9, m3Var);
        m3Var.addView((View) bc0Var, g7.e6.l(0.5f, 0, 270));
        bc0Var.setFormatter(new org.telegram.ui.tr(28));
        bc0Var.setOnValueChangedListener(new zb0() {
            @Override
            public final void m(bc0 bc0Var3, int i12) {
                switch (r2) {
                    case 0:
                        j3Var.run(Boolean.TRUE);
                        return;
                    default:
                        j3Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        m3Var.addView((View) bc0Var2, g7.e6.l(0.5f, 0, 270));
        bc0Var2.setFormatter(new org.telegram.ui.tr(29));
        bc0Var2.setOnValueChangedListener(new zb0() {
            @Override
            public final void m(bc0 bc0Var3, int i12) {
                switch (r2) {
                    case 0:
                        j3Var.run(Boolean.TRUE);
                        return;
                    default:
                        j3Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        j3Var.run(Boolean.FALSE);
        o3 o3Var = new o3(activity, bc0Var, bc0Var2);
        o3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        o3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        o3Var.addView(m3Var, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        kh.d dVar = new kh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new h2(r1, 0));
        o3Var.addView(dVar, g7.e6.t(-1, 48, 0, 16, 12, 16, 12));
        f3Var.customView = o3Var;
        f3Var.show();
        f3Var.setOnDismissListener(new fh.j(callback, bc0Var, bc0Var2, 5));
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
    }

    public static org.telegram.ui.ActionBar.c2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        String[] strArr;
        boolean z10;
        final String str2 = str;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final int[] iArr = new int[1];
        if (j10 != 0) {
            int i9 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i9;
            if (i9 == 3) {
                iArr[0] = 2;
            } else if (i9 == 2) {
                iArr[0] = 3;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.VibrationDisabled)};
        } else {
            int i10 = notificationsSettings.getInt(str2, 0);
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = 1;
            } else if (i10 == 1) {
                iArr[0] = 2;
            } else if (i10 == 2) {
                iArr[0] = 0;
            }
            strArr = new String[]{LocaleController.getString(R.string.VibrationDisabled), LocaleController.getString(R.string.VibrationDefault), LocaleController.getString(R.string.Short), LocaleController.getString(R.string.Long), LocaleController.getString(R.string.OnlyIfSilent)};
        }
        String[] strArr2 = strArr;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        int i11 = 0;
        while (i11 < strArr2.length) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, b6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i11));
            k6Var.a(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23056g7, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
            String str3 = strArr2[i11];
            if (iArr[0] == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(str3, z10);
            f10.addView(k6Var);
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
                        int i12 = iArr2[0];
                        if (i12 == 0) {
                            edit.putInt(str4, 0);
                        } else if (i12 == 1) {
                            edit.putInt(str4, 1);
                        } else if (i12 == 2) {
                            edit.putInt(str4, 3);
                        } else if (i12 == 3) {
                            edit.putInt(str4, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                    } else {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            edit.putInt(str4, 2);
                        } else if (i13 == 1) {
                            edit.putInt(str4, 0);
                        } else if (i13 == 2) {
                            edit.putInt(str4, 1);
                        } else if (i13 == 3) {
                            edit.putInt(str4, 3);
                        } else if (i13 == 4) {
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
                    alertDialog$Builder.f22702a.H0.run();
                    runnable.run();
                }
            });
            i11++;
            str2 = str;
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.c2 Z(Context context, org.telegram.ui.ActionBar.b6 b6Var, String[] strArr, int i9, String str, String str2, q0.a aVar) {
        boolean z10;
        int i10;
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.m(i9, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(str);
        if (z10) {
            i10 = R.string.PermissionOpenSettings;
        } else {
            i10 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new k9.b(z10, context, atomicBoolean, aVar, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new ih.v3(28, atomicBoolean, aVar));
        alertDialog$Builder.f22702a.setOnDismissListener(new bg.j(7, atomicBoolean, aVar));
        return alertDialog$Builder.f22702a;
    }

    public static void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i9, int i10, long j10, Utilities.Callback callback) {
        b0(i9, j10, i10, callback, 0L);
    }

    public static void b(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        int i9;
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        int i16 = calendar.get(2);
        int i17 = calendar.get(5);
        bc0Var3.setMaxValue(i15);
        bc0Var3.setMinValue(i12);
        int value = bc0Var3.getValue();
        if (value == i15) {
            i9 = i16;
        } else {
            i9 = 11;
        }
        bc0Var2.setMaxValue(i9);
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        bc0Var2.setMinValue(i10);
        int value2 = bc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i15 && value2 == i16) {
            actualMaximum = Math.min(i17, actualMaximum);
        }
        bc0Var.setMaxValue(actualMaximum);
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        bc0Var.setMinValue(i11);
    }

    public static boolean b0(final int i9, final long j10, int i10, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.b6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i9).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i9).isUserContactBlocked(j10));
        }
        long j12 = i10 * sendPaidMessagesStars;
        gh.v7.y(i9, false).P.put(Long.valueOf(j10), Integer.valueOf(i10));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final q2 q2Var = new q2(i9, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i9).getMainSettings().getLong(aa.d.n(j10, "ask_paid_message_", "_price"), 0L)) {
                q2Var.run();
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
                bVar = new ih.b();
            }
            org.telegram.ui.ActionBar.b6 b6Var = bVar;
            String shortName = DialogObject.getShortName(i9, j10);
            if (ChatObject.isMonoForum(i9, j10)) {
                shortName = vf.c.h(i9, j10);
            } else if (U instanceof org.telegram.ui.qn) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) U;
                if (qnVar.f41869c4 && qnVar.a() == j10 && (chat = qnVar.f41856b4) != null) {
                    shortName = DialogObject.getShortName(i9, -chat.f22380id);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i11 = (int) j13;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage1", i11, shortName)));
            spannableStringBuilder.append((CharSequence) " ");
            if (i10 == 1) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2One", i11)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many1", (int) j12)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessage2Many2", i10)));
            }
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i10), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        int i12 = i9;
                        SharedPreferences.Editor edit = MessagesController.getInstance(i12).getMainSettings().edit();
                        long j14 = j10;
                        edit.putLong(aa.d.n(j14, "ask_paid_message_", "_price"), j13).apply();
                        gh.v7.y(i12, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(q2Var);
                }
            }, b6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static long c(kh.d dVar, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, bc0 bc0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i9 = 1;
        int i10 = calendar.get(1);
        int value = ((bc0Var2.getValue() - 120) / 12) + i10;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (bc0Var2.getValue() - 120) % 12);
        bc0Var.setMinValue(1);
        bc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = bc0Var.getValue();
        int value3 = bc0Var3.getValue();
        int value4 = bc0Var4.getValue();
        calendar.set(5, value2);
        calendar.set(11, value3);
        calendar.set(12, value4);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value2 == 0) {
                i9 = 0;
            } else if (i10 != value) {
                i9 = 2;
            }
            dVar.setText(LocaleController.getInstance().getFormatterScheduleSend(i9 + 9).format(timeInMillis));
        }
        return timeInMillis;
    }

    public static boolean c0(int i9, ArrayList arrayList, int i10, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.b6 bVar;
        boolean z10 = false;
        if (arrayList.isEmpty()) {
            callback.run(new HashMap());
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        long j10 = 0;
        int i11 = 0;
        boolean z11 = true;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Long l10 = (Long) obj;
            long j11 = j10;
            long longValue = l10.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i9).getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i9).isUserContactBlocked(longValue));
            }
            hashMap.put(l10, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            gh.v7.y(i9, z10).P.put(l10, Integer.valueOf(i10));
            int i13 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i13 > 0) {
                i11++;
            }
            if (i13 > 0 && z11 && MessagesController.getInstance(i9).getMainSettings().getLong(aa.d.n(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j10 = j12;
            z10 = false;
        }
        long max = Math.max(1, i10) * j10;
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
                bVar = new ih.b();
            }
            org.telegram.ui.ActionBar.b6 b6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i11)));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i11) * i10))));
            i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i10), new org.telegram.ui.lq(i9, max, activity, arrayList, hashMap, callback, b6Var), b6Var, true);
            return true;
        }
        callback.run(hashMap);
        return false;
    }

    public static void d(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        int i9;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        bc0Var3.setMinValue(i11);
        int value = bc0Var3.getValue();
        if (value == i11) {
            i9 = i12;
        } else {
            i9 = 0;
        }
        bc0Var2.setMinValue(i9);
        int value2 = bc0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        bc0Var.setMinValue(i10);
    }

    public static boolean d0(int i9, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i9).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i9).isUserContactBlocked(j10));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i9).getMainSettings().getLong(aa.d.n(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void e(TextView textView, bc0 bc0Var, x3 x3Var, y3 y3Var) {
        String str;
        String str2;
        int value = bc0Var.getValue();
        int value2 = x3Var.getValue();
        int value3 = y3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - currentTimeMillis) / 1000);
        int i9 = timeInMillis / 86400;
        int i10 = (timeInMillis % 86400) / 3600;
        int i11 = (timeInMillis % 3600) / 60;
        String str3 = "";
        if (i9 <= 0) {
            str = "";
        } else {
            str = LocaleController.formatPluralString("Days", i9, new Object[0]);
        }
        if (i10 <= 0) {
            str2 = "";
        } else {
            str2 = LocaleController.formatPluralString("Hours", i10, new Object[0]);
        }
        if (i11 > 0) {
            str3 = LocaleController.formatPluralString("Minutes", i11, new Object[0]);
        }
        textView.setText(LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, str, str2, str3).trim()));
    }

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            String obj = editTextBoldCursor.getText().toString();
            int i9 = org.telegram.ui.ActionBar.f6.f22941a;
            org.telegram.ui.ActionBar.e6 e6Var = new org.telegram.ui.ActionBar.e6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            e6Var.f22908b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            e6Var.f22906a = obj;
            org.telegram.ui.ActionBar.f6.f23067h0 = org.telegram.ui.ActionBar.f6.Y0(org.telegram.ui.ActionBar.f6.I.f22914e0);
            e6Var.A = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.f6.r1(e6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().c(o2Var.getParentActivity(), e6Var);
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

    public static void f(int i9, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty() && chat != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.TL_missingInvitee> arrayList4 = tL_messages_invitedUsers.missing_invitees;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_missingInvitee tL_missingInvitee = arrayList4.get(i10);
                i10++;
                TLRPC.TL_missingInvitee tL_missingInvitee2 = tL_missingInvitee;
                if (tL_messages_invitedUsers.updates != null) {
                    for (int i11 = 0; i11 < tL_messages_invitedUsers.updates.users.size(); i11++) {
                        user = tL_messages_invitedUsers.updates.users.get(i11);
                        if (user.f22527id == tL_missingInvitee2.user_id) {
                            break;
                        }
                    }
                }
                user = null;
                if (user == null) {
                    user = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_missingInvitee2.user_id));
                }
                if (user != null) {
                    arrayList.add(user);
                    if (tL_missingInvitee2.premium_required_for_pm) {
                        arrayList2.add(Long.valueOf(user.f22527id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f22527id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new fh.g1(i9, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static org.telegram.ui.ActionBar.c2 f0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.o2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.f0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.c2");
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i9, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        long j12;
        int i10;
        long j13;
        int i11;
        int i12;
        int i13;
        long j14;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        String formatPluralString;
        int i16;
        int i17;
        int i18;
        int value = bc0Var.getValue();
        int value2 = bc0Var2.getValue();
        int value3 = bc0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long currentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(currentTimeMillis);
        int i19 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            i10 = i19;
            calendar.setTimeInMillis((j11 * 1000) + currentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            j12 = currentTimeMillis;
            i12 = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            j13 = calendar.getTimeInMillis();
            i11 = 23;
            i13 = 59;
        } else {
            j12 = currentTimeMillis;
            i10 = i19;
            j13 = j11;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i20 = i13;
        if (j10 > 0) {
            j14 = TimeUnit.SECONDS.toMillis(j10);
        } else {
            j14 = 60000;
        }
        long j15 = j14;
        long j16 = j12 + j15;
        calendar.setTimeInMillis(j16);
        int i21 = calendar.get(11);
        int i22 = calendar.get(12);
        long j17 = j13;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        bc0Var.setMinValue(0);
        int i23 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i23 > 0) {
            bc0Var.setMaxValue(i12);
        }
        int value4 = bc0Var.getValue();
        if (value4 == 0) {
            i14 = i21;
        } else {
            i14 = 0;
        }
        bc0Var2.setMinValue(i14);
        if (i23 > 0) {
            if (value4 == i12) {
                i18 = i11;
            } else {
                i18 = 23;
            }
            bc0Var2.setMaxValue(i18);
        }
        int value5 = bc0Var2.getValue();
        if (value4 == 0 && value5 == i21) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        bc0Var3.setMinValue(i15);
        if (i23 > 0) {
            if (value4 == i12 && value5 == i11) {
                i17 = i20;
            } else {
                i17 = 59;
            }
            bc0Var3.setMaxValue(i17);
        }
        int value6 = bc0Var3.getValue();
        if (timeInMillis <= j16) {
            calendar.setTimeInMillis(j16);
        } else if (i23 > 0 && timeInMillis > j17) {
            calendar.setTimeInMillis(j17);
        }
        int i24 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i16 = 0;
            } else if (i10 == i24) {
                i16 = 1;
            } else {
                i16 = 2;
            }
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i9 * 3) + i16).format(timeInMillis2));
        }
        if (textView2 != null) {
            int i25 = (int) ((timeInMillis2 - j12) / 1000);
            if (i25 > 86400) {
                z11 = false;
                formatPluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i25 / 86400.0f), new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i25 >= 3600) {
                    formatPluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i25 / 3600.0f), new Object[0]);
                } else if (i25 >= 60) {
                    formatPluralString = LocaleController.formatPluralString("MinutesSchedule", Math.round(i25 / 60.0f), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("SecondsSchedule", i25, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i26 = R.string.VoipChannelScheduleInfo;
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i26, objArr));
            } else {
                z10 = true;
                int i27 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = formatPluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i27, objArr2));
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

    public static void g0(Context context, org.telegram.ui.ActionBar.b6 b6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, jm jmVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, b6Var));
        if (str != null) {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(str.length());
        }
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean matches;
                if (i10 != 6) {
                    return false;
                }
                z3 z3Var = z3.this;
                String trim = z3Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = y4.f34847a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(z3Var);
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView((View) editTextBoldCursor, g7.e6.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i10 = v71.f33306f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            v71 v71Var = new v71(context, b6Var);
            v71Var.setWebPage(webPage);
            linearLayout.addView(v71Var, g7.e6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new g1(2, editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.tr(27));
        if (jmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new y0(4, jmVar));
        }
        c2VarArr[0] = c2Var;
        c2Var.f22767d0 = false;
        c2Var.setOnDismissListener(new a1(editTextBoldCursor, 2));
        c2VarArr[0].setOnShowListener(new ht(2, editTextBoldCursor));
        c2VarArr[0].show();
        TextView textView = (TextView) c2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
    }

    public static boolean h(Context context, int i9, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(chat.f22380id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i9).loadChatInfo(chat.f22380id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
                }
                if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i9).getCurrentTime()) {
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
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
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new n2(0, o2Var));
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
                    org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    c2Var.P = sb2.toString();
                    break;
            }
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static org.telegram.ui.ActionBar.c2 i(Activity activity, v4 v4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.r1 r1Var = alertDialog$Builder.f22702a.H0;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f24584f = i9;
                TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
                z8 z8Var = kVar.f24583e;
                z8Var.m(i9, currentUser);
                kVar.f24580a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                o9 o9Var = kVar.f24582c;
                o9Var.getImageReceiver().setCurrentAccount(i9);
                o9Var.e(currentUser, z8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                f10.addView(kVar, g7.e6.n(-1, 50));
                kVar.setOnClickListener(new fg.f((Object) c2VarArr, (Runnable) r1Var, (Object) v4Var, 18));
            }
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2VarArr[0] = c2Var;
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = new boolean[1];
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        textView.setTextSize(1, 16.0f);
        int i14 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 48);
        textView.setText(charSequence);
        u4 u4Var = new u4(activity, z1VarArr);
        alertDialog$Builder.f22702a.C = 6;
        alertDialog$Builder.n(u4Var);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.E8, b6Var, textView2, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(str);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        u4Var.addView(textView2, g7.e6.d(-1, -2.0f, i11 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u4Var.addView(textView, g7.e6.d(-2, -2.0f, i12 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, b6Var);
            z1VarArr[0] = z1Var;
            z1Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 7, AndroidUtilities.dp(12.0f)));
            z1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            layoutParams.gravity = i14 | 16;
            z1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            z1VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
            if (LocaleController.isRTL) {
                i13 = AndroidUtilities.dp(4.0f);
            } else {
                i13 = 0;
            }
            int dp2 = AndroidUtilities.dp(12.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            z1Var2.setPadding(i13, dp2, dp, AndroidUtilities.dp(12.0f));
            u4Var.addView(z1VarArr[0], g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new s0(5, zArr));
        }
        alertDialog$Builder.k(str2, new g1(8, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        if (z10) {
            c2Var.T0 = true;
        }
        c2Var.show();
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 j(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22702a;
    }

    public static void j0(org.telegram.ui.ActionBar.o2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.b6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.j0(org.telegram.ui.ActionBar.o2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.b6):void");
    }

    public static void k(Context context, org.telegram.ui.ActionBar.b6 b6Var, x4 x4Var) {
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        if (context == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        if (b6Var != null) {
            w02 = b6Var.p0(i9);
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        if (b6Var != null) {
            w03 = b6Var.p0(i10);
        } else {
            w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        }
        int i11 = w03;
        int i12 = org.telegram.ui.ActionBar.f6.Ji;
        if (b6Var != null) {
            b6Var.p0(i12);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.f6.Ni;
        if (b6Var != null) {
            b6Var.p0(i13);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.f6.E8;
        if (b6Var != null) {
            b6Var.p0(i14);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.f6.G8;
        if (b6Var != null) {
            b6Var.p0(i15);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.f6.f23092i6;
        if (b6Var != null) {
            b6Var.p0(i16);
        } else {
            org.telegram.ui.ActionBar.f6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.f6.Sh;
        if (b6Var != null) {
            w04 = b6Var.p0(i17);
        } else {
            w04 = org.telegram.ui.ActionBar.f6.w0(null, i17, false);
        }
        int i18 = w04;
        int i19 = org.telegram.ui.ActionBar.f6.Oh;
        if (b6Var != null) {
            w05 = b6Var.p0(i19);
        } else {
            w05 = org.telegram.ui.ActionBar.f6.w0(null, i19, false);
        }
        int i20 = w05;
        if (b6Var != null) {
            w06 = b6Var.p0(org.telegram.ui.ActionBar.f6.Qh);
        } else {
            w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        }
        int i21 = w06;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        c4 c4Var = new c4(context, b6Var, iArr);
        c4Var.setMinValue(0);
        c4Var.setMaxValue(16);
        c4Var.setTextColor(w02);
        c4Var.setValue(0);
        c4Var.setFormatter(new e1(1, iArr));
        d4 d4Var = new d4(context, c4Var, 0);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(w02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, false, 1);
        linearLayout.addView(c4Var, g7.e6.l(1.0f, 0, 270));
        u3Var.setPadding(0, 0, 0, 0);
        u3Var.setGravity(17);
        u3Var.setTextColor(i18);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        u3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, i20, i21, i21));
        d4Var.addView(u3Var, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        c4Var.setOnValueChangedListener(new s(u3Var, 10));
        u3Var.setOnClickListener(new fh.g4(iArr, c4Var, x4Var, a3Var, 9));
        a3Var.b(d4Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        f3Var.setBackgroundColor(i11);
        f3Var.fixNavigationBar(i11);
    }

    public static void k0(org.telegram.ui.qn qnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.jg jgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (qnVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = qnVar.getAccountInstance();
            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i9 > 0) {
                user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            if (i9 < 0) {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            } else {
                chat = null;
            }
            if (user != null || chat != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, b6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.L0 = false;
                c2Var.J = new a1(jgVar, 0);
                c2Var.N = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(qnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(qnVar.getParentActivity(), 1, b6Var)};
                z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
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
                linearLayout.addView(z1VarArr[0], g7.e6.n(-1, -2));
                z1VarArr[0].setOnClickListener(new b1(z1VarArr, 0));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new bg.g0(user, accountInstance, qnVar, chat, messageObject, z1VarArr, b6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            }
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        int i10;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        if (org.telegram.ui.ActionBar.f6.A0().q()) {
            i9 = R.raw.permission_map_dark;
        } else {
            i9 = R.raw.permission_map;
        }
        String readRes = AndroidUtilities.readRes(i9);
        if (org.telegram.ui.ActionBar.f6.A0().q()) {
            i10 = R.raw.permission_pin_dark;
        } else {
            i10 = R.raw.permission_pin;
        }
        String readRes2 = AndroidUtilities.readRes(i10);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(readRes));
        frameLayout.addView(view, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(readRes2));
        frameLayout.addView(view2, g7.e6.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        o9 o9Var = new o9(activity);
        o9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        o9Var.e(user, new z8(0, user));
        frameLayout.addView(o9Var, g7.e6.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.R = frameLayout;
        c2Var.K0 = 0.37820512f;
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new y0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i9, long j10) {
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, null, false, false);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, g7.e6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, g7.e6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        frameLayout.addView(frameLayout2, g7.e6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, i10, false), 1, 20.0f);
        org.telegram.messenger.ll.l(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView h = j3.r0.h(f10, textView, g7.e6.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        h.setTextSize(1, 14.0f);
        h.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i9, j10))));
        h.setGravity(17);
        f10.addView(h, g7.e6.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        kh.d dVar = new kh.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        f10.addView(dVar, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        j11.customView = f10;
        dVar.setOnClickListener(new org.telegram.ui.md(i9, dVar, j11, j10));
        j11.fixNavigationBar();
        j11.show();
    }

    public static org.telegram.ui.ActionBar.a3 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        float f10;
        int i9;
        int i10;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
        a3Var.a();
        bc0 bc0Var = new bc0(context, b6Var);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        bc0 bc0Var2 = new bc0(context, b6Var);
        bc0Var2.setItemCount(5);
        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        bc0 bc0Var3 = new bc0(context, b6Var);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        v3 v3Var = new v3(context, bc0Var, bc0Var2, bc0Var3);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        u2 u2Var = new u2(bc0Var3, i15, bc0Var, bc0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(bc0Var, g7.e6.l(0.25f, 0, 270));
        bc0Var.setMinValue(1);
        bc0Var.setMaxValue(31);
        bc0Var.setWrapSelectorWheel(false);
        bc0Var.setFormatter(new g2(8));
        s sVar = new s(u2Var, 9);
        bc0Var.setOnScrollListener(sVar);
        bc0Var2.setMinValue(0);
        bc0Var2.setMaxValue(11);
        bc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
        bc0Var2.setFormatter(new g2(9));
        bc0Var2.setOnScrollListener(sVar);
        bc0Var3.setMinValue(i11);
        bc0Var3.setMaxValue(i15);
        bc0Var3.setWrapSelectorWheel(false);
        bc0Var3.setFormatter(new h3.x(i15, 4));
        linearLayout.addView(bc0Var3, g7.e6.l(0.25f, 0, 270));
        bc0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            bc0Var.setValue(tL_birthday.day);
            bc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                bc0Var3.setValue(tL_birthday.year);
            } else {
                bc0Var3.setValue(i15);
            }
        } else {
            bc0Var.setValue(calendar.get(5));
            bc0Var2.setValue(calendar.get(2));
            bc0Var3.setValue(i15);
        }
        u2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            l80 l80Var = new l80(context, null);
            l80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            l80Var.setTextSize(1, 13.0f);
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, b6Var));
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
            l80Var.setGravity(17);
            frameLayout2.addView(l80Var, g7.e6.e(-2, -2, 17));
            v3Var.addView(frameLayout2, g7.e6.n(-1, -2));
            int i16 = UserConfig.selectedAccount;
            bg.c2 c2Var = new bg.c2(i16, l80Var, 27);
            c2Var.run();
            f10 = 8.0f;
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new v2(c2Var, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        } else {
            f10 = 8.0f;
        }
        if (z10) {
            kh.d dVar = new kh.d(context, b6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new fh.a3(bc0Var3, i15, u2Var, 8));
            v3Var.addView(dVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(f10);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03));
        g7.g6.a(textView2);
        if (z10) {
            i9 = 0;
        } else {
            i9 = 15;
        }
        if (z11) {
            i10 = 0;
        } else {
            i10 = 16;
        }
        v3Var.addView(textView2, g7.e6.t(-1, 48, 83, 16, i9, 16, i10));
        textView2.setOnClickListener(new gh.v8(bc0Var, bc0Var2, bc0Var3, i15, a3Var, callback));
        if (z11) {
            kh.d dVar2 = new kh.d(context, b6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new s2(1, a3Var, callback));
            v3Var.addView(dVar2, g7.e6.t(-1, 48, 83, 16, 4, 16, 16));
        }
        a3Var.b(v3Var);
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(c2Var, true, null);
        }
    }

    public static void n(org.telegram.ui.ActionBar.o2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.n(org.telegram.ui.ActionBar.o2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(j10);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.addView(new gh.j4(context, tL_starGiftUnique, userOrChat), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 16.0f);
        org.telegram.messenger.ll.q(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        f10.addView(textView, g7.e6.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new y0(2, runnable));
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Context context = o2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        l80 l80Var = new l80(context, null);
        NotificationCenter.listenEmojiLoading(l80Var);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23061gc, false));
        l80Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        l80Var.setGravity(i9 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f22702a.C = 6;
        alertDialog$Builder.n(frameLayout);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.u(AndroidUtilities.dp(18.0f));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11 | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.f6.f23050g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.f6.f23068h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23389z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A9, false), mode));
            h5Var.i(new fq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23161m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, o2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        eq eqVar = new eq(R.drawable.attach_arrow_right, 0);
        eqVar.setTopOffset(1);
        eqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(eqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        int i20 = 76;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f10 = i14;
        if (z10) {
            i15 = 76;
        } else {
            i15 = 21;
        }
        frameLayout.addView(h5Var, g7.e6.d(-1, -2.0f, i19, f10, 0.0f, i15, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        int i21 = i16 | 48;
        if (z11) {
            i17 = 21;
        } else {
            i17 = 76;
        }
        float f11 = i17;
        if (!z11) {
            i20 = 21;
        }
        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, i21, f11, 24.0f, i20, 0.0f));
        if (LocaleController.isRTL) {
            i18 = 5;
        } else {
            i18 = 3;
        }
        frameLayout.addView(l80Var, g7.e6.d(-2, -2.0f, i18 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            z8Var.f35234p = 0.8f;
            z8Var.g(12);
            o9Var.h(null, null, z8Var, user);
        } else {
            z8Var.f35234p = 1.0f;
            z8Var.m(o2Var.getCurrentAccount(), user);
            o9Var.e(user, z8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener r0Var = new r0(3, runnable2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        o2Var.showDialog(c2Var, false, r0Var);
        l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(0, context, c2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.b6 b6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i9;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        textView.setBackground(gradientDrawable);
        final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, b6Var);
        z1Var.setMultiline(true);
        z1Var.getTextView().getLayoutParams().width = -1;
        z1Var.getTextView().setSingleLine(false);
        z1Var.getTextView().setMaxLines(3);
        z1Var.getTextView().setTextSize(1, 16.0f);
        if (z10) {
            i9 = R.string.BrowserAlwaysOpenExternal;
        } else {
            i9 = R.string.BrowserAlwaysOpenInApp;
        }
        z1Var.e(LocaleController.getString(i9), "", false, false, false);
        z1Var.setOnClickListener(new f0(z1Var, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, g7.e6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(z1Var, g7.e6.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22702a.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
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
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(z1Var.b()));
                        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                        if (c2Var2 != null) {
                            c2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(z1Var.b()));
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

    public static org.telegram.ui.ActionBar.a3 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.b6 b6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(activity, b6Var);
        a3Var.a();
        bc0 bc0Var = new bc0(activity, b6Var);
        bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var.setItemCount(5);
        bc0 bc0Var2 = new bc0(activity, b6Var);
        bc0Var2.setItemCount(5);
        bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        bc0 bc0Var3 = new bc0(activity, b6Var);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        i4 i4Var = new i4(activity, bc0Var, bc0Var2, bc0Var3);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        i4Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(bc0Var, g7.e6.l(0.25f, 0, 270));
        bc0Var.setMinValue(1);
        bc0Var.setMaxValue(31);
        bc0Var.setWrapSelectorWheel(false);
        bc0Var.setFormatter(new org.telegram.ui.tr(6));
        l0 l0Var = new l0(bc0Var, bc0Var2, bc0Var3, 0);
        bc0Var.setOnValueChangedListener(l0Var);
        bc0Var2.setMinValue(0);
        bc0Var2.setMaxValue(11);
        bc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
        bc0Var2.setFormatter(new org.telegram.ui.tr(7));
        bc0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i9 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(1);
        bc0Var3.setMinValue(i9);
        bc0Var3.setMaxValue(i10);
        bc0Var3.setWrapSelectorWheel(false);
        bc0Var3.setFormatter(new org.telegram.ui.tr(8));
        linearLayout.addView(bc0Var3, g7.e6.l(0.25f, 0, 270));
        bc0Var3.setOnValueChangedListener(l0Var);
        bc0Var.setValue(31);
        bc0Var2.setValue(12);
        bc0Var3.setValue(i10);
        b(bc0Var, bc0Var2, bc0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03));
        i4Var.addView(textView2, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new bg.h(bc0Var, bc0Var2, bc0Var3, calendar, (Object) intCallback, a3Var, 1));
        a3Var.b(i4Var);
        return a3Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, ve.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.b6 b6Var) {
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
        if (!ve.e.f(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    v = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                }
                m2 m2Var = new m2(context, str, j10, z11, dVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                TextView textView = new TextView(context);
                textView.setText(v);
                textView.setTextSize(1, 14.0f);
                int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
                gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                textView.setBackground(gradientDrawable);
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(textView, g7.e6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i10 = v71.f33306f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    v71 v71Var = new v71(context, b6Var);
                    v71Var.setWebPage(webPage);
                    linearLayout.addView(v71Var, g7.e6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.n(linearLayout);
                c2Var.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(m2Var, 8));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            v = str;
            m2 m2Var2 = new m2(context, str, j10, z11, dVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, b6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
            c2Var2.N = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(v);
            textView2.setTextSize(1, 14.0f);
            int i92 = org.telegram.ui.ActionBar.f6.f23108j5;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i92, b6Var));
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable2.setColor(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i92, b6Var)));
            textView2.setBackground(gradientDrawable2);
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView2, g7.e6.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i102 = v71.f33306f;
            if (webPage != null) {
                v71 v71Var2 = new v71(context, b6Var);
                v71Var2.setWebPage(webPage);
                linearLayout.addView(v71Var2, g7.e6.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.n(linearLayout);
            c2Var2.f22761a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(m2Var2, 8));
            j3.r0.v(R.string.Cancel, alertDialog$Builder2, null);
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
        ve.e.r(context, parse2, z14, z11, z15, dVar, null, false, true, false);
    }

    public static void q(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (o2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId() != user.f22527id) {
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
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
            textView.setTextSize(1, 16.0f);
            int i14 = 3;
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView.setGravity(i9 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.u(AndroidUtilities.dp(12.0f));
            z8Var.f35234p = 1.0f;
            z8Var.m(o2Var.getCurrentAccount(), user);
            o9 o9Var = new o9(parentActivity);
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            o9Var.e(user, z8Var);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
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
            textView2.setText(string);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i15 = i12 | 48;
            int i16 = 76;
            if (z11) {
                i13 = 21;
            } else {
                i13 = 76;
            }
            float f10 = i13;
            if (!z11) {
                i16 = 21;
            }
            frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new b5.e(o2Var, user, z10, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(alertDialog$Builder.f22702a);
        }
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11) {
        r0(o2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void r(org.telegram.ui.ActionBar.o2 r31, int r32, org.telegram.tgnet.TLRPC.User r33, org.telegram.tgnet.TLRPC.Chat r34, boolean r35, org.telegram.messenger.MessagesStorage.BooleanCallback r36, org.telegram.ui.ActionBar.b6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.r(org.telegram.ui.ActionBar.o2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.b6):void");
    }

    public static void r0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, ve.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.b6 b6Var) {
        long j10;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (o2Var instanceof org.telegram.ui.qn) {
                j10 = ((org.telegram.ui.qn) o2Var).f41860b8;
            } else {
                j10 = 0;
            }
            p0(o2Var.getParentActivity(), str, z10, z11, z12, z13, j10, dVar, webPage, b6Var);
        }
    }

    public static void s(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (o2Var != null) {
            b6Var = o2Var.getResourceProvider();
        } else {
            b6Var = null;
        }
        t(o2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, b6Var);
    }

    public static void s0(Activity activity, int i9, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = MessagesController.getInstance(i9).availableMapProviders;
        if ((i10 & 1) != 0) {
            org.telegram.ui.Cells.j2.x(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i10 & 2) != 0) {
            org.telegram.ui.Cells.j2.x(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i10 & 4) != 0) {
            org.telegram.ui.Cells.j2.x(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, b6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i11));
            k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
            CharSequence charSequence = (CharSequence) arrayList.get(i11);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i11)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.b(charSequence, z11);
            k6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
            linearLayout.addView(k6Var);
            k6Var.setOnClickListener(new fg.f((Object) arrayList2, runnable, (Object) alertDialog$Builder, 19));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.c2 o6 = alertDialog$Builder.o();
        if (z10) {
            o6.setCanceledOnTouchOutside(false);
        }
    }

    public static void t(final org.telegram.ui.ActionBar.o2 r44, final boolean r45, final boolean r46, org.telegram.tgnet.TLRPC.Chat r47, final org.telegram.tgnet.TLRPC.User r48, final boolean r49, final boolean r50, boolean r51, final boolean r52, final org.telegram.messenger.MessagesStorage.BooleanCallback r53, final org.telegram.ui.ActionBar.b6 r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.t(org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.b6):void");
    }

    public static void t0(int i9, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        if (i9 != 0 && o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnableForward);
            if (i9 == 1) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i9 == 2) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i9 == 3) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i9 == 4) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i9 == 5) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i9 == 6) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i9 == 7) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i9 == 8) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i9 == 9) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i9 == 10) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i9 == 11) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i9 == 12) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i9 == 13) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i9 == 14) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i9 == 15) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i9 == 16) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i9 == 17) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i9 == 18) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i9 == 19) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i9 == 20) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i9 == 21) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i9 == 22) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(alertDialog$Builder.f22702a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.c2 u(Activity activity, final long j10, final long j11, final int i9, final Runnable runnable, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i10 = org.telegram.messenger.l0.c("color_", sharedPrefKey, notificationsSettings, -16776961);
            } else if (DialogObject.isChatDialog(j10)) {
                i10 = notificationsSettings.getInt("GroupLed", -16776961);
            } else {
                i10 = notificationsSettings.getInt("MessagesLed", -16776961);
            }
        } else if (i9 == 1) {
            i10 = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i9 == 0) {
            i10 = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i9 == 3) {
            i10 = notificationsSettings.getInt("StoriesLed", -16776961);
        } else if (i9 != 5 && i9 != 4) {
            i10 = notificationsSettings.getInt("ChannelLed", -16776961);
        } else {
            i10 = notificationsSettings.getInt("ReactionsLed", -16776961);
        }
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i10};
        for (int i12 = 0; i12 < 9; i12++) {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(activity, b6Var);
            k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i12));
            int i13 = org.telegram.ui.Cells.v8.f25799e[i12];
            k6Var.a(i13, i13);
            String str = strArr[i12];
            if (i10 == org.telegram.ui.Cells.v8.f25800f[i12]) {
                z10 = true;
            } else {
                z10 = false;
            }
            k6Var.b(str, z10);
            f10.addView(k6Var);
            k6Var.setOnClickListener(new p0(f10, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, b6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(f10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    edit.putInt(ta.b.d("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                } else {
                    int i15 = i9;
                    if (i15 == 1) {
                        edit.putInt("MessagesLed", iArr2[0]);
                    } else if (i15 == 0) {
                        edit.putInt("GroupLed", iArr2[0]);
                    } else if (i15 == 3) {
                        edit.putInt("StoriesLed", iArr2[0]);
                    } else if (i15 != 5 && i15 != 4) {
                        edit.putInt("ChannelLed", iArr2[0]);
                    } else {
                        edit.putInt("ReactionLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i15);
                }
                edit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new i3.e(runnable, i9, j10, 3));
        if (i11 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new g1(6, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.c2 u0(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        if (o2Var == null) {
            o2Var = LaunchActivity.U();
        }
        if (str2 != null && o2Var != null && o2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = O(o2Var.getParentActivity(), str, str2, null, null, b6Var).f22702a;
            o2Var.showDialog(c2Var);
            return c2Var;
        }
        return null;
    }

    public static void v(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new g1(3, str3, o2Var));
        o2Var.showDialog(c2Var);
    }

    public static org.telegram.ui.ActionBar.c2 v0(org.telegram.ui.ActionBar.o2 o2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.c2 P = P(o2Var.getContext(), o2Var.getResourceProvider(), str, charSequence, str2, runnable);
        o2Var.showDialog(P);
        if (z10 && (textView = (TextView) P.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
        return P;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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

    public static AlertDialog$Builder x(Context context, int i9, int i10, int i11, int i12, int i13, int i14, String str, final boolean z10, c3.e eVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final bc0 bc0Var = new bc0(context, null);
        final bc0 bc0Var2 = new bc0(context, null);
        final bc0 bc0Var3 = new bc0(context, null);
        linearLayout.addView(bc0Var2, g7.e6.l(0.3f, 0, -2));
        bc0Var2.setOnScrollListener(new yb0() {
            @Override
            public final void j(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        bc0Var.setMinValue(0);
        bc0Var.setMaxValue(11);
        linearLayout.addView(bc0Var, g7.e6.l(0.3f, 0, -2));
        bc0Var.setFormatter(new org.telegram.ui.tr(14));
        bc0Var.setOnValueChangedListener(new l0(bc0Var2, bc0Var, bc0Var3, 1));
        bc0Var.setOnScrollListener(new yb0() {
            @Override
            public final void j(int i15) {
                switch (r5) {
                    case 0:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i15 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i15 = calendar.get(1);
        bc0Var3.setMinValue(i9 + i15);
        bc0Var3.setMaxValue(i10 + i15);
        bc0Var3.setValue(i15 + i11);
        linearLayout.addView(bc0Var3, g7.e6.l(0.4f, 0, -2));
        bc0Var3.setOnValueChangedListener(new l0(bc0Var2, bc0Var, bc0Var3, 2));
        bc0Var3.setOnScrollListener(new yb0() {
            @Override
            public final void j(int i152) {
                switch (r5) {
                    case 0:
                        if (z10 && i152 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i152 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i152 == 0) {
                            y4.d(bc0Var2, bc0Var, bc0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        y0(bc0Var2, bc0Var, bc0Var3);
        if (z10) {
            d(bc0Var2, bc0Var, bc0Var3);
        }
        if (i12 != -1) {
            bc0Var2.setValue(i12);
            bc0Var.setValue(i13);
            bc0Var3.setValue(i14);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.sj(z10, bc0Var2, bc0Var, bc0Var3, eVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, x4 x4Var) {
        bc0 bc0Var;
        if (context == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ji, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ni, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false);
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
        int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        int w06 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
        a3Var.a();
        bc0 bc0Var2 = new bc0(context, null);
        bc0Var2.setTextColor(w02);
        bc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        bc0Var2.setItemCount(5);
        bc0 bc0Var3 = new bc0(context, null);
        bc0Var3.setItemCount(5);
        bc0Var3.setTextColor(w02);
        bc0Var3.setTextOffset(-AndroidUtilities.dp(10.0f));
        bc0 bc0Var4 = new bc0(context, null);
        bc0Var4.setItemCount(5);
        bc0Var4.setTextColor(w02);
        bc0Var4.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, bc0Var2, bc0Var3, bc0Var4, 1);
        r3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        r3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.l0.q(textView, w02, 1, 20.0f);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new jh.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        bg.t tVar = new bg.t(context, 16);
        linearLayout.addView(bc0Var2, g7.e6.l(0.5f, 0, 270));
        bc0Var2.setMinValue(0);
        bc0Var2.setMaxValue(365);
        bc0Var2.setWrapSelectorWheel(false);
        bc0Var2.setFormatter(new org.telegram.ui.tr(17));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(bc0Var2, bc0Var3, bc0Var4, 17);
        bc0Var2.setOnValueChangedListener(aVar);
        bc0Var3.setMinValue(0);
        bc0Var3.setMaxValue(23);
        linearLayout.addView(bc0Var3, g7.e6.l(0.2f, 0, 270));
        bc0Var3.setFormatter(new org.telegram.ui.tr(18));
        bc0Var3.setOnValueChangedListener(aVar);
        bc0Var4.setMinValue(0);
        bc0Var4.setMaxValue(59);
        bc0Var4.setValue(0);
        bc0Var4.setFormatter(new org.telegram.ui.tr(19));
        linearLayout.addView(bc0Var4, g7.e6.l(0.3f, 0, 270));
        bc0Var4.setOnValueChangedListener(aVar);
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
                bc0Var4.setValue(calendar.get(12));
                bc0Var3.setValue(calendar.get(11));
                bc0Var = bc0Var2;
                bc0Var.setValue(timeInMillis);
            } else {
                bc0Var = bc0Var2;
            }
        } else {
            bc0Var = bc0Var2;
        }
        bc0 bc0Var5 = bc0Var;
        g(null, null, 0L, 0L, 0, bc0Var5, bc0Var3, bc0Var4);
        tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tVar.setGravity(17);
        tVar.setTextColor(w04);
        tVar.setTextSize(1, 14.0f);
        tVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w05, w06, w06));
        tVar.setText(str2);
        r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
        tVar.setOnClickListener(new bg.h(bc0Var5, bc0Var3, bc0Var4, calendar, (Object) x4Var, a3Var, 3));
        a3Var.b(r3Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
        f3Var.show();
        f3Var.setBackgroundColor(w03);
        f3Var.fixNavigationBar(w03);
    }

    public static void y0(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, bc0Var2.getValue());
        calendar.set(1, bc0Var3.getValue());
        bc0Var.setMinValue(1);
        bc0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void z(final org.telegram.ui.ActionBar.o2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.b6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y4.z(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.b6):void");
    }
}
