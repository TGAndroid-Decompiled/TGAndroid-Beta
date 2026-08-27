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
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.LongFunction;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ld1;
import org.telegram.ui.tg1;

public abstract class y4 {

    public static final Pattern f34802a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String res = AndroidUtilities.readRes(R.raw.pip_voice_request);
        t20 t20Var = new t20(0, context, true);
        t20Var.setImportantForAccessibility(2);
        ag.p1 p1Var = new ag.p1(context, t20Var);
        p1Var.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        p1Var.setClipToOutline(true);
        p1Var.setOutlineProvider(new cg.l1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        p1Var.addView(view, h7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        p1Var.addView(t20Var, h7.z5.c(117.0f, 117));
        alertDialog$Builder.f22702a.R = p1Var;
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.f22752f0 = true;
        b2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22702a.K0 = 0.5769231f;
        return alertDialog$Builder;
    }

    public static AlertDialog$Builder B(Activity activity, tg1 tg1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String res = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.l1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(res, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, h7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f22702a.R = frameLayout;
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new eh.q(5, activity, z10));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.f22752f0 = true;
        b2Var.P0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), tg1Var);
        alertDialog$Builder.f22702a.K0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 C(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new f1(launchActivity, 1));
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.b2 D(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.b2 E(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        linearLayoutF.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(c6Var != null ? c6Var.q0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayoutF.addView(textView, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, z10 ? 4 : 0, 24, 8));
        int i11 = 0;
        while (i11 < 4) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.d = 42;
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.ActionBar.g6.f23109g7;
            int iQ0 = c6Var != null ? c6Var.q0(i12) : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            int i13 = org.telegram.ui.ActionBar.g6.E5;
            h6Var.a(iQ0, c6Var != null ? c6Var.q0(i13) : org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            h6Var.b(strArr[i11], iArr[0] == i11);
            linearLayoutF.addView(h6Var);
            h6Var.setOnClickListener(new p0(iArr, linearLayoutF));
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (z10) {
            b2Var.N = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int iQ1 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.L5) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false);
            b2Var.X = new tp0(activity, 0);
            b2Var.Y = iQ1;
        }
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new jh.z1(29, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.e3 F(final long j10, final long j11, final org.telegram.ui.ActionBar.n2 n2Var, final org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(n2Var.getParentActivity(), c6Var, false, false);
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
                } else if (i10 == 1) {
                    i11 = 1;
                } else {
                    i11 = i10 == 2 ? 2 : 3;
                }
                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(j10, j11, i11);
                org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                if (mc.a(n2Var2)) {
                    mc.z(n2Var2, i11, 0, c6Var).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        return e3Var;
    }

    public static void G(Context context, org.telegram.ui.ActionBar.c6 c6Var, x4 x4Var) {
        if (context == null) {
            return;
        }
        int i10 = 0;
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        int iQ0 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.f23124h5;
        int iQ1 = c6Var != null ? c6Var.q0(i12) : org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.f23144i6;
        if (c6Var != null) {
            c6Var.q0(i17);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.g6.Sh;
        int iQ2 = c6Var != null ? c6Var.q0(i18) : org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        int i19 = org.telegram.ui.ActionBar.g6.Oh;
        int iQ3 = c6Var != null ? c6Var.q0(i19) : org.telegram.ui.ActionBar.g6.w0(null, i19, false);
        int iQ4 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.Qh) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, c6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(20);
        h4Var.setTextColor(iQ0);
        h4Var.setValue(0);
        h4Var.setFormatter(new e1(i10, iArr));
        d4 d4Var = new d4(context, h4Var, 1);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(iQ0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        cg.q qVar = new cg.q(context, 20);
        linearLayout.addView(h4Var, h7.z5.l(1.0f, 0, 270));
        h4Var.setOnValueChangedListener(new org.telegram.ui.fr(15));
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(iQ2);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iQ3, iQ4, iQ4));
        qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        d4Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new gh.a4(iArr, h4Var, x4Var, z2Var, 7));
        z2Var.b(d4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setBackgroundColor(iQ1);
        e3Var.fixNavigationBar(iQ1);
    }

    public static AlertDialog$Builder H(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = str;
        HashMap map = new HashMap();
        int i10 = org.telegram.ui.ActionBar.g6.L5;
        map.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        map.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.g6.w0(null, i10, false), map);
        alertDialog$Builder.f22702a.S = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f22702a.P = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 I(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
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
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i14));
            h6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23109g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            h6Var.b(strArr2[i14], iArr[0] == i14);
            linearLayoutF.addView(h6Var);
            h6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int i15;
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    int i16 = 0;
                    iArr2[0] = iIntValue;
                    SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
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
                        editorEdit.putInt("priority_" + j13, i16);
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j13, j11);
                    } else {
                        int i18 = iArr2[0];
                        if (i18 == 0) {
                            i15 = 4;
                        } else if (i18 == 1) {
                            i15 = 5;
                        } else {
                            i15 = i18 == 2 ? 0 : 1;
                        }
                        int i19 = i11;
                        SharedPreferences sharedPreferences = notificationsSettings;
                        if (i19 == 1) {
                            editorEdit.putInt("priority_messages", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_messages", 1);
                        } else if (i19 == 0) {
                            editorEdit.putInt("priority_group", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_group", 1);
                        } else if (i19 == 2) {
                            editorEdit.putInt("priority_channel", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_channel", 1);
                        } else if (i19 == 3) {
                            editorEdit.putInt("priority_stories", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_stories", 1);
                        } else if (i19 == 4 || i19 == 5) {
                            editorEdit.putInt("priority_react", i15);
                            iArr2[0] = sharedPreferences.getInt("priority_react", 1);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i19);
                    }
                    editorEdit.commit();
                    alertDialog$Builder.f22702a.H0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static void J(int i10, Activity activity, long j10, TLRPC.Photo photo, jh.b bVar) {
        if (activity != null) {
            gh.w wVar = new gh.w(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, bVar, true, false);
            e3Var.fixNavigationBar();
            e3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            e3Var.bigTitle = true;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            int[] iArr = {R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            w2 w2Var = new w2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, wVar, 0);
            e3Var.items = charSequenceArr;
            e3Var.itemIcons = iArr;
            e3Var.onClickListener = w2Var;
            e3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.z2 K(final Context context, final long j10, long j11, int i10, boolean z10, final x4 x4Var, Runnable runnable, w4 w4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        FrameLayout frameLayout;
        ?? r10;
        int i11;
        boolean[] zArr;
        ViewGroup viewGroup;
        Object obj;
        ?? r11;
        org.telegram.ui.ActionBar.v0 v0Var;
        Calendar calendar;
        char c10;
        int i12;
        int[] iArr;
        String[] strArr;
        int[] iArr2;
        int i13;
        ?? r12;
        String[] strArr2;
        Object obj2;
        Object obj3;
        Object obj4;
        int i14;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        final long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final ?? z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final ?? fc0Var = new fc0(context, c6Var);
        int i15 = w4Var.f34103a;
        int i16 = w4Var.f34105c;
        int i17 = w4Var.f34104b;
        fc0Var.setTextColor(i15);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        final ?? p3Var = new p3(context, c6Var);
        p3Var.setWrapSelectorWheel(true);
        p3Var.setAllItemsCount(24);
        p3Var.setItemCount(5);
        p3Var.setTextColor(i15);
        p3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? q3Var = new q3(context, c6Var);
        q3Var.setWrapSelectorWheel(true);
        q3Var.setAllItemsCount(60);
        q3Var.setItemCount(5);
        q3Var.setTextColor(i15);
        q3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        ?? frameLayout2 = new FrameLayout(context);
        r3 r3Var = new r3(context, fc0Var, p3Var, q3Var, 0);
        r3Var.setClipToPadding(false);
        r3Var.setClipChildren(false);
        r3Var.setOrientation(1);
        frameLayout2.addView(r3Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        r3Var.addView(frameLayout4, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        if (TextUtils.isEmpty(null)) {
            frameLayout = frameLayout3;
            if (j10 == clientUserId) {
                textView.setText(LocaleController.getString(R.string.SetReminder));
            } else {
                textView.setText(LocaleController.getString(R.string.ScheduleMessage));
            }
        } else {
            frameLayout = frameLayout3;
            textView.setText((CharSequence) null);
        }
        org.telegram.messenger.y1.s(textView, i15, 1, 20.0f);
        frameLayout4.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        boolean[] zArr2 = {true};
        if (!DialogObject.isUserDialog(j10) || j10 == clientUserId || (user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10))) == null || user.bot || (userStatus = user.status) == null || userStatus.expires <= 0) {
            r10 = 0;
            i11 = -1;
            zArr = zArr2;
            viewGroup = frameLayout4;
            obj = null;
            r11 = r3Var;
            v0Var = null;
        } else {
            String firstName = UserObject.getFirstName(user);
            if (firstName.length() > 10) {
                firstName = firstName.substring(0, 10) + "…";
            }
            r10 = 0;
            i11 = -1;
            viewGroup = frameLayout4;
            r11 = r3Var;
            obj = null;
            zArr = zArr2;
            v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, w4Var.f34103a, false, c6Var);
            v0Var.setLongClickEnabled(false);
            v0Var.setSubMenuOpenSide(2);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i16, 1, -1));
            viewGroup.addView(v0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            v0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        }
        if (v0Var != null) {
            v0Var.setOnClickListener(new nh.x1(29, v0Var, w4Var));
            v0Var.setDelegate(new ag.l0(x4Var, zArr, z2Var, 18));
        }
        ri0 ri0Var = new ri0(r1);
        final oi0 oi0Var = new oi0(R.raw.notify_toggle, "notify_toggle", AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        oi0Var.H(true);
        oi0Var.h = true;
        oi0Var.start();
        oi0Var.K(40);
        oi0Var.N(40);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setAnimation(oi0Var);
        ri0Var.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i16, 1, i11));
        viewGroup.addView(ri0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, (v0Var != null ? 42 : 0) + 8, 0.0f));
        ?? linearLayout = new LinearLayout(r1);
        linearLayout.setOrientation(r10);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar2 = Calendar.getInstance();
        final cg.q qVar = new cg.q(r1, 15);
        final org.telegram.ui.ActionBar.v0 v0Var2 = v0Var;
        linearLayout.addView(fc0Var, h7.z5.l(0.5f, r10, 270));
        fc0Var.setMinValue(r10);
        fc0Var.setMaxValue(365);
        fc0Var.setWrapSelectorWheel(r10);
        fc0Var.setFormatter(new c2(5));
        ?? r49 = r11;
        final boolean[] zArr3 = zArr;
        dc0 dc0Var = new dc0() {
            @Override
            public final void m(fc0 fc0Var2, int i18) {
                y4.g(qVar, null, 0L, 0L, clientUserId == j10 ? 1 : 0, fc0Var, p3Var, q3Var);
            }
        };
        fc0Var.setOnValueChangedListener(dc0Var);
        p3Var.setMinValue(r10);
        p3Var.setMaxValue(23);
        linearLayout.addView(p3Var, h7.z5.l(0.2f, r10, 270));
        p3Var.setFormatter(new c2(6));
        p3Var.setOnValueChangedListener(dc0Var);
        q3Var.setMinValue(r10);
        q3Var.setMaxValue(59);
        q3Var.setValue(r10);
        q3Var.setFormatter(new c2(7));
        linearLayout.addView(q3Var, h7.z5.l(0.3f, r10, 270));
        q3Var.setOnValueChangedListener(dc0Var);
        if (j11 <= 0 || j11 == 2147483646) {
            calendar = calendar2;
        } else {
            long j12 = 1000 * j11;
            calendar = calendar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j12);
            if (timeInMillis >= 0) {
                q3Var.setValue(calendar.get(12));
                p3Var.setValue(calendar.get(11));
                fc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr4 = {true};
        g(qVar, null, 0L, 0L, clientUserId == j10 ? 1 : 0, fc0Var, p3Var, q3Var);
        boolean zIsTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (zIsTestBackend) {
            c10 = '\t';
            i12 = 10;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            c10 = '\t';
            i12 = 10;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (zIsTestBackend) {
            strArr = new String[i12];
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
        if (z10) {
            iArr2 = iArr;
            i13 = i17;
            r12 = r49;
            strArr2 = strArr;
            Object obj5 = obj;
            Object obj6 = obj5;
            obj2 = obj6;
            obj4 = obj5;
            obj3 = obj6;
        } else {
            FrameLayout frameLayout5 = new FrameLayout(r1);
            i13 = i17;
            int iV = org.telegram.ui.ActionBar.g6.v(i13, org.telegram.ui.ActionBar.g6.l1(0.075f, i15));
            String[] strArr3 = strArr;
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.1f, i15);
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(i15);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int iDp = AndroidUtilities.dp(14.0f);
            int iV2 = org.telegram.ui.ActionBar.g6.v(iV, iL1);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV, iV2, iV2));
            textView2.setGravity(17);
            int[] iArr4 = iArr;
            strArr2 = strArr3;
            org.telegram.ui.yf yfVar = new org.telegram.ui.yf(iArr4, iArr3, strArr2, textView2, 12);
            iArr2 = iArr4;
            yfVar.run();
            frameLayout5.addView(textView2, h7.z5.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ?? r13 = r49;
            r13.addView(frameLayout5, h7.z5.n(-1, -2));
            obj3 = yfVar;
            obj4 = frameLayout5;
            r12 = r13;
            obj2 = textView2;
        }
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w4Var.f34108g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, w4Var.h));
        r12.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        final Calendar calendar3 = calendar;
        qVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr4[0] = false;
                int i18 = clientUserId == j10 ? 1 : 0;
                fc0 fc0Var2 = fc0Var;
                p3 p3Var2 = p3Var;
                q3 q3Var2 = q3Var;
                boolean zG = y4.g(null, null, 0L, 0L, i18, fc0Var2, p3Var2, q3Var2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Calendar calendar4 = calendar3;
                calendar4.setTimeInMillis(jCurrentTimeMillis);
                calendar4.add(6, fc0Var2.getValue());
                calendar4.set(11, p3Var2.getValue());
                calendar4.set(12, q3Var2.getValue());
                if (zG) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                x4Var.I((int) (calendar4.getTimeInMillis() / 1000), iArr3[0], zArr3[0]);
                z2Var.f23994a.dismissRunnable.run();
            }
        });
        z2Var.b(frameLayout2);
        String[] strArr4 = strArr2;
        final org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setOnDismissListener(new k2(runnable, zArr4));
        e3Var.setBackgroundColor(i13);
        e3Var.fixNavigationBar(i13);
        if (obj2 != null) {
            i14 = 1;
            obj2.setOnClickListener(new y1(frameLayout, c6Var, e3Var, (FrameLayout) obj4, iArr2, strArr4, iArr3, (org.telegram.ui.yf) obj3));
        } else {
            i14 = 1;
        }
        final lh.w3[] w3VarArr = new lh.w3[i14];
        ri0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String string;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                oi0 oi0Var2 = oi0Var;
                if (z11) {
                    if (oi0Var2.X < 40) {
                        oi0Var2.K(40);
                    }
                    oi0Var2.N(80);
                    oi0Var2.start();
                } else {
                    if (oi0Var2.X >= 40) {
                        oi0Var2.K(0);
                    }
                    oi0Var2.N(40);
                    oi0Var2.start();
                }
                lh.w3[] w3VarArr2 = w3VarArr;
                lh.w3 w3Var = w3VarArr2[0];
                if (w3Var != null) {
                    w3Var.e(true);
                    w3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j13 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j13));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j13));
                lh.w3 w3Var2 = new lh.w3(context, 3);
                w3VarArr2[0] = w3Var2;
                w3Var2.s();
                w3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                w3Var2.r(20.0f);
                float fDp = AndroidUtilities.dp(12.0f);
                float fDp2 = AndroidUtilities.dp(4.0f);
                int iL2 = org.telegram.ui.ActionBar.g6.l1(0.25f, -16777216);
                w3Var2.f16980e0 = fDp;
                w3Var2.f16982f0 = fDp2;
                w3Var2.f16983g0 = iL2;
                w3Var2.B.setShadowLayer(fDp, 0.0f, fDp2, iL2);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnChannel : R.string.ScheduleNotifyOffChannel);
                } else if (chat != null || user2 == null) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnGroup : R.string.ScheduleNotifyOffGroup);
                } else if (j13 == clientUserId) {
                    string = LocaleController.getString(zArr5[0] ? R.string.ScheduleNotifyOnSelf : R.string.ScheduleNotifyOffSelf);
                } else {
                    string = LocaleController.formatString(zArr5[0] ? R.string.ScheduleNotifyOnChat : R.string.ScheduleNotifyOffChat, UserObject.getForcedFirstName(user2));
                }
                w3Var2.t(string);
                w3Var2.d = 5000L;
                w3Var2.m(1.0f, -((v0Var2 != null ? 42 : -8) + 20));
                w3Var2.f16984h0 = new bg(w3Var2, 2);
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                e3Var2.getContainerView().setClipToPadding(false);
                e3Var2.getContainerView().setClipChildren(false);
                e3Var2.getContainerView().addView(w3Var2, h7.z5.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                w3Var2.v();
            }
        });
        return z2Var;
    }

    public static void L(Context context, long j10, x4 x4Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(null), null);
    }

    public static void M(Context context, long j10, x4 x4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        K(context, j10, -1L, 0, false, x4Var, null, new w4(c6Var), c6Var);
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new y0(6, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 P(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = charSequence;
        alertDialog$Builder.k(str2, new y0(5, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.n1 Q(org.telegram.ui.ActionBar.n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f10, float f11) {
        if (n2Var == null || view == null) {
            return null;
        }
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        n1Var.f23684e = true;
        n1Var.f23683c = 220;
        n1Var.setOutsideTouchable(true);
        n1Var.setClippingEnabled(true);
        n1Var.setAnimationStyle(R.style.PopupContextAnimation);
        n1Var.setFocusable(true);
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        n1Var.setInputMethodMode(2);
        n1Var.getContentView().setFocusableInTouchMode(true);
        float x8 = 0.0f;
        View view2 = view;
        float y10 = 0.0f;
        while (view2 != view.getRootView()) {
            x8 += view2.getX();
            y10 += view2.getY();
            view2 = (View) view2.getParent();
            if (view2 == null) {
                break;
            }
        }
        n1Var.showAtLocation(view.getRootView(), 0, (int) ((x8 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((y10 + f11) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
        n1Var.b();
        return n1Var;
    }

    public static void R(Context context, org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = str == null ? LocaleController.getString(R.string.AppName) : str;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = str2;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
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
        editTextBoldCursor.setOnEditorActionListener(new z1(editTextBoldCursor, i10, stringCallback, b2VarArr, currentFocus, 0));
        editTextBoldCursor.addTextChangedListener(new t3(i10, editTextBoldCursor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        editTextBoldCursor.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(editTextBoldCursor, h7.z5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22702a.f22742a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new c3.d(editTextBoldCursor, i10, stringCallback, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.fr(25));
        b2VarArr[0] = alertDialog$Builder.f22702a;
        if (n2Var != null) {
            AndroidUtilities.requestAdjustNothing(activityFindActivity, n2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.f22748d0 = false;
        b2Var2.setOnDismissListener(new gh.j(editTextBoldCursor, n2Var, activityFindActivity, 4));
        b2VarArr[0].setOnShowListener(new d1(1, editTextBoldCursor));
        b2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void S(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, MessagesStorage.StringCallback stringCallback) {
        R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), c6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.z2 T(Context context, long j10, final x4 x4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        int i11;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        int i12 = org.telegram.ui.ActionBar.g6.f23144i6;
        org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        final fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextColor(iW0);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        final o4 o4Var = new o4(context, c6Var);
        o4Var.setWrapSelectorWheel(true);
        o4Var.setAllItemsCount(24);
        o4Var.setItemCount(5);
        o4Var.setTextColor(iW0);
        o4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final p4 p4Var = new p4(context, c6Var);
        p4Var.setWrapSelectorWheel(true);
        p4Var.setAllItemsCount(60);
        p4Var.setItemCount(5);
        p4Var.setTextColor(iW0);
        p4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, fc0Var, o4Var, p4Var, 5);
        r3Var.setOrientation(1);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        r3Var.addView(linearLayoutG, h7.z5.t(-1, -2, 51, 22, 0, 22, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.SuggestedPostAcceptTitle : R.string.PostSuggestionsAddTime));
        textView.setTextColor(iW0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayoutG.addView(textView, h7.z5.t(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new kh.e(10));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23441z6, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        linearLayoutG.addView(textView2, h7.z5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i13 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final cg.q qVar = new cg.q(context, 21);
        linearLayout.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(365);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new h3.y(i13, 3));
        final int i14 = i10 == 1 ? 5 : 3;
        dc0 dc0Var = new dc0() {
            @Override
            public final void m(fc0 fc0Var2, int i15) {
                y4.g(qVar, null, j11, j12, i14, fc0Var, o4Var, p4Var);
            }
        };
        fc0Var.setOnValueChangedListener(dc0Var);
        o4Var.setMinValue(0);
        o4Var.setMaxValue(23);
        linearLayout.addView(o4Var, h7.z5.l(0.2f, 0, 270));
        o4Var.setFormatter(new org.telegram.ui.fr(20));
        o4Var.setOnValueChangedListener(dc0Var);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(59);
        p4Var.setValue(0);
        p4Var.setFormatter(new org.telegram.ui.fr(21));
        linearLayout.addView(p4Var, h7.z5.l(0.3f, 0, 270));
        p4Var.setOnValueChangedListener(dc0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            i11 = iW1;
        } else {
            long j13 = 1000 * j10;
            i11 = iW1;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j13);
            if (timeInMillis >= 0) {
                p4Var.setValue(calendar.get(12));
                o4Var.setValue(calendar.get(11));
                fc0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g(qVar, null, j11, j12, i14, fc0Var, o4Var, p4Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        int i15 = 17;
        qVar.setGravity(17);
        qVar.setTextColor(iW2);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, iW3));
        r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i16 = i14;
        qVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i17 = i16;
                fc0 fc0Var2 = fc0Var;
                o4 o4Var2 = o4Var;
                p4 p4Var2 = p4Var;
                boolean zG = y4.g(null, null, j14, j15, i17, fc0Var2, o4Var2, p4Var2);
                long epochMilli = LocalDate.now().plusDays(fc0Var2.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, o4Var2.getValue());
                calendar2.set(12, p4Var2.getValue());
                if (zG) {
                    calendar2.set(13, 0);
                }
                x4Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                z2Var.f23994a.dismissRunnable.run();
            }
        });
        h7.b6.b(qVar, 0.02f, 1.2f);
        cg.q qVar2 = new cg.q(context, 22);
        qVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar2.setGravity(17);
        qVar2.setText(LocaleController.getString(i10 == 1 ? R.string.MessageSuggestionPublishNow : R.string.PostSuggestionsAnytime));
        qVar2.setTextColor(iW3);
        qVar2.setTextSize(1, 14.0f);
        int iDp = AndroidUtilities.dp(8.0f);
        int iW4 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
        int iW5 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        qVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW4, iW5, iW5));
        r3Var.addView(qVar2, h7.z5.t(-1, 48, 83, 16, 0, 16, 16));
        qVar2.setOnClickListener(new gg.f(zArr, x4Var, z2Var, i15));
        h7.b6.b(qVar2, 0.02f, 1.2f);
        z2Var.b(r3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setOnDismissListener(new lh.e1(zArr));
        e3Var.setBackgroundColor(i11);
        e3Var.fixNavigationBar(i11);
        return z2Var;
    }

    public static org.telegram.ui.ActionBar.b2 U(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        p80 p80Var = new p80(n2Var.getParentActivity(), n2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new g4(n2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        p80Var.setText(spannableString);
        p80Var.setTextSize(1, 16.0f);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23180k5, c6Var));
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23197l5, c6Var));
        p80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.n(p80Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new n2(1, n2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static AlertDialog$Builder V(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.MessageLifetime);
        fc0 fc0Var = new fc0(context, null);
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            fc0Var.setValue(i10);
        } else if (i10 == 30) {
            fc0Var.setValue(16);
        } else if (i10 == 60) {
            fc0Var.setValue(17);
        } else if (i10 == 3600) {
            fc0Var.setValue(18);
        } else if (i10 == 86400) {
            fc0Var.setValue(19);
        } else if (i10 == 604800) {
            fc0Var.setValue(20);
        } else if (i10 == 0) {
            fc0Var.setValue(0);
        }
        fc0Var.setFormatter(new c2(11));
        alertDialog$Builder.n(fc0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new g1(4, encryptedChat, fc0Var));
        return alertDialog$Builder;
    }

    public static void W(org.telegram.ui.ActionBar.n2 n2Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11;
        String string;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23372v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new c2(12));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.y1.p(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        linearLayout.addView(textView, h7.z5.n(-1, -2));
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
        linearLayout.addView(editTextBoldCursor, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new o2(0));
        List listAsList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List listAsList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap map = new HashMap();
        s3.c.m(9306112, map, "Berry", 14598550, "Brandy");
        s3.c.m(8391495, map, "Cherry", 16744272, "Coral");
        s3.c.m(14372985, map, "Cranberry", 14423100, "Crimson");
        s3.c.m(14725375, map, "Mauve", 16761035, "Pink");
        s3.c.m(16711680, map, "Red", 16711807, "Rose");
        s3.c.m(8406555, map, "Russet", 16720896, "Scarlet");
        s3.c.m(15856113, map, "Seashell", 16724889, "Strawberry");
        s3.c.m(16760576, map, "Amber", 15438707, "Apricot");
        s3.c.m(16508850, map, "Banana", 10601738, "Citrus");
        s3.c.m(11560192, map, "Ginger", 16766720, "Gold");
        s3.c.m(16640272, map, "Lemon", 16753920, "Orange");
        s3.c.m(16770484, map, "Peach", 16739155, "Persimmon");
        s3.c.m(14996514, map, "Sunflower", 15893760, "Tangerine");
        s3.c.m(16763004, map, "Topaz", 16776960, "Yellow");
        s3.c.m(3688720, map, "Clover", 8628829, "Cucumber");
        s3.c.m(5294200, map, "Emerald", 11907932, "Olive");
        s3.c.m(65280, map, "Green", 43115, "Jade");
        s3.c.m(2730887, map, "Jungle", 12582656, "Lime");
        s3.c.m(776785, map, "Malachite", 10026904, "Mint");
        s3.c.m(11394989, map, "Moss", 3234721, "Azure");
        s3.c.m(255, map, "Blue", 18347, "Cobalt");
        s3.c.m(5204422, map, "Indigo", 96647, "Lagoon");
        s3.c.m(7461346, map, "Aquamarine", 1182351, "Ultramarine");
        s3.c.m(128, map, "Navy", 3101086, "Sapphire");
        s3.c.m(7788522, map, "Sky", 32896, "Teal");
        s3.c.m(4251856, map, "Turquoise", 10053324, "Amethyst");
        s3.c.m(5046581, map, "Blackberry", 6373457, "Eggplant");
        s3.c.m(13148872, map, "Lilac", 11894492, "Lavender");
        s3.c.m(13421823, map, "Periwinkle", 8663417, "Plum");
        s3.c.m(6684825, map, "Purple", 14204888, "Thistle");
        s3.c.m(14315734, map, "Orchid", 2361920, "Violet");
        s3.c.m(4137225, map, "Bronze", 3604994, "Chocolate");
        s3.c.m(8077056, map, "Cinnamon", 3153694, "Cocoa");
        s3.c.m(7365973, map, "Coffee", 7956873, "Rum");
        s3.c.m(5113350, map, "Mahogany", 7875865, "Mocha");
        s3.c.m(12759680, map, "Sand", 8924439, "Sienna");
        s3.c.m(7864585, map, "Maple", 15787660, "Khaki");
        s3.c.m(12088115, map, "Copper", 12144200, "Chestnut");
        s3.c.m(15653316, map, "Almond", 16776656, "Cream");
        s3.c.m(12186367, map, "Diamond", 11109127, "Honey");
        s3.c.m(16777200, map, "Ivory", 15392968, "Pearl");
        s3.c.m(15725299, map, "Porcelain", 13745832, "Vanilla");
        s3.c.m(16777215, map, "White", 8421504, "Gray");
        s3.c.m(0, map, "Black", 15266260, "Chrome");
        s3.c.m(3556687, map, "Charcoal", 789277, "Ebony");
        s3.c.m(12632256, map, "Silver", 16119285, "Smoke");
        s3.c.m(2499381, map, "Steel", 5220413, "Apple");
        s3.c.m(8434628, map, "Glacier", 16693933, "Melon");
        s3.c.m(12929932, map, "Mulberry", 11126466, "Opal");
        map.put(5547512, "Blue");
        org.telegram.ui.ActionBar.e6 e6VarK = e6Var == null ? org.telegram.ui.ActionBar.g6.A0().k(false) : e6Var;
        if (e6VarK == null || (i11 = e6VarK.f22885c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.g6.r0())[0];
        }
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        int i13 = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iRed2 = Color.red(num.intValue());
            int i14 = (iRed + iRed2) / 2;
            int i15 = iRed - iRed2;
            int iGreen2 = iGreen - Color.green(num.intValue());
            int iBlue2 = iBlue - Color.blue(num.intValue());
            int i16 = (iGreen2 * 4 * iGreen2) + ((((i14 + 512) * i15) * i15) >> 8) + ((((767 - i14) * iBlue2) * iBlue2) >> 8);
            if (i16 < i13) {
                str = (String) entry.getValue();
                i13 = i16;
            }
        }
        if (Utilities.random.nextInt() % 2 == 0) {
            string = a9.p.n((String) listAsList.get(Utilities.random.nextInt(listAsList.size())), " ", str, new StringBuilder());
        } else {
            StringBuilder sbF = s3.c.f(str, " ");
            sbF.append((String) listAsList2.get(Utilities.random.nextInt(listAsList2.size())));
            string = sbF.toString();
        }
        editTextBoldCursor.setText(string);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        d1 d1Var = new d1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.setOnShowListener(d1Var);
        n2Var.showDialog(b2Var);
        editTextBoldCursor.requestFocus();
        b2Var.d(-1).setOnClickListener(new jh.b0(n2Var, editTextBoldCursor, e6Var, f6Var, b2Var, 8));
    }

    public static void X(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        l3 l3Var = new l3(activity, null);
        m3 m3Var = new m3(activity, l3Var);
        m3Var.setOrientation(0);
        m3Var.setWeightSum(1.0f);
        l3Var.setAllItemsCount(24);
        l3Var.setItemCount(5);
        l3Var.setTextColor(iW0);
        l3Var.setGravity(5);
        l3Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        n3 n3Var = new n3(activity, null);
        n3Var.setWrapSelectorWheel(true);
        n3Var.setAllItemsCount(60);
        n3Var.setItemCount(5);
        n3Var.setTextColor(iW0);
        n3Var.setGravity(3);
        n3Var.setTextOffset(AndroidUtilities.dp(12.0f));
        final hh.i3 i3Var = new hh.i3(i11, i12, l3Var, n3Var, i10, m3Var);
        m3Var.addView(l3Var, h7.z5.l(0.5f, 0, 270));
        l3Var.setFormatter(new c2(3));
        final int i13 = 0;
        l3Var.setOnValueChangedListener(new dc0() {
            @Override
            public final void m(fc0 fc0Var, int i14) {
                switch (i13) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        break;
                    default:
                        i3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        m3Var.addView(n3Var, h7.z5.l(0.5f, 0, 270));
        n3Var.setFormatter(new c2(4));
        final int i14 = 1;
        n3Var.setOnValueChangedListener(new dc0() {
            @Override
            public final void m(fc0 fc0Var, int i15) {
                switch (i14) {
                    case 0:
                        i3Var.run(Boolean.TRUE);
                        break;
                    default:
                        i3Var.run(Boolean.TRUE);
                        break;
                }
            }
        });
        i3Var.run(Boolean.FALSE);
        o3 o3Var = new o3(activity, l3Var, n3Var);
        o3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(iW0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        o3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        o3Var.addView(m3Var, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        lh.d dVar = new lh.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new h2(e3VarArr, 0));
        o3Var.addView(dVar, h7.z5.t(-1, 48, 0, 16, 12, 16, 12));
        e3Var.customView = o3Var;
        e3Var.show();
        e3Var.setOnDismissListener(new gh.j(callback, l3Var, n3Var, 5));
        e3Var.setBackgroundColor(iW1);
        e3Var.fixNavigationBar(iW1);
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
    }

    public static org.telegram.ui.ActionBar.b2 Y(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        String[] strArr;
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
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i12));
            h6Var.a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23109g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
            h6Var.b(strArr2[i12], iArr[0] == i12);
            linearLayoutF.addView(h6Var);
            h6Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    int[] iArr2 = iArr;
                    iArr2[0] = iIntValue;
                    SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                    long j12 = j10;
                    String str3 = str2;
                    if (j12 != 0) {
                        int i13 = iArr2[0];
                        if (i13 == 0) {
                            editorEdit.putInt(str3, 0);
                        } else if (i13 == 1) {
                            editorEdit.putInt(str3, 1);
                        } else if (i13 == 2) {
                            editorEdit.putInt(str3, 3);
                        } else if (i13 == 3) {
                            editorEdit.putInt(str3, 2);
                        }
                        NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                    } else {
                        int i14 = iArr2[0];
                        if (i14 == 0) {
                            editorEdit.putInt(str3, 2);
                        } else if (i14 == 1) {
                            editorEdit.putInt(str3, 0);
                        } else if (i14 == 2) {
                            editorEdit.putInt(str3, 1);
                        } else if (i14 == 3) {
                            editorEdit.putInt(str3, 3);
                        } else if (i14 == 4) {
                            editorEdit.putInt(str3, 4);
                        }
                        if (str3.equals("vibrate_channel")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(2);
                        } else if (str3.equals("vibrate_group")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(0);
                        } else if (str3.equals("vibrate_react")) {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(4);
                        } else {
                            NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(1);
                        }
                    }
                    editorEdit.commit();
                    alertDialog$Builder.f22702a.H0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.b2 Z(Context context, org.telegram.ui.ActionBar.c6 c6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
        boolean z10;
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 23) {
            Activity activity = (Activity) context;
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                }
                String str3 = strArr[i11];
                if (activity.checkSelfPermission(str3) != 0 && activity.shouldShowRequestPermissionRationale(str3)) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        } else {
            z10 = false;
            break;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(str);
        alertDialog$Builder.k(LocaleController.getString(z10 ? R.string.PermissionOpenSettings : R.string.BotWebViewRequestAllow), new l9.b(z10, context, atomicBoolean, aVar, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new jh.z1(28, atomicBoolean, aVar));
        alertDialog$Builder.f22702a.setOnDismissListener(new cg.g(6, atomicBoolean, aVar));
        return alertDialog$Builder.f22702a;
    }

    public static void a(Activity activity) {
        if (activity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 30);
        }
    }

    public static void a0(int i10, int i11, long j10, Utilities.Callback callback) {
        b0(i10, j10, i11, callback, 0L);
    }

    public static void b(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        fc0Var3.setMaxValue(i14);
        fc0Var3.setMinValue(i11);
        int value = fc0Var3.getValue();
        fc0Var2.setMaxValue(value == i14 ? i15 : 11);
        fc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = fc0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i14 && value2 == i15) {
            actualMaximum = Math.min(i16, actualMaximum);
        }
        fc0Var.setMaxValue(actualMaximum);
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        fc0Var.setMinValue(i10);
    }

    public static boolean b0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.c6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = ((long) i11) * sendPaidMessagesStars;
        hh.u7.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 <= 0 || j11 == j12) {
            callback.run(Long.valueOf(j12));
            return false;
        }
        final long j13 = sendPaidMessagesStars;
        final r2 r2Var = new r2(i10, j12, j10, callback, j13, 0);
        if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(j10, "ask_paid_message_", "_price"), 0L)) {
            r2Var.run();
            return true;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (PhotoViewer.t1().Q1() || (n2VarU != null && n2VarU.hasShownSheet())) {
            bVar = new jh.b();
        } else {
            bVar = n2VarU != null ? n2VarU.getResourceProvider() : null;
        }
        org.telegram.ui.ActionBar.c6 c6Var = bVar;
        String shortName = DialogObject.getShortName(i10, j10);
        if (ChatObject.isMonoForum(i10, j10)) {
            shortName = wf.c.h(i10, j10);
        } else if (n2VarU instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2VarU;
            if (rnVar.f42005c4 && rnVar.a() == j10 && (chat = rnVar.f41991b4) != null) {
                shortName = DialogObject.getShortName(i10, -chat.f22380id);
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
                    SharedPreferences.Editor editorEdit = MessagesController.getInstance(i13).getMainSettings().edit();
                    long j14 = j10;
                    editorEdit.putLong(com.google.android.recaptcha.internal.a.m(j14, "ask_paid_message_", "_price"), j13).apply();
                    hh.u7.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                }
                AndroidUtilities.runOnUIThread(r2Var);
            }
        }, c6Var, true);
        return true;
    }

    public static long c(lh.d dVar, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((fc0Var2.getValue() - 120) / 12) + i11;
        int value2 = (fc0Var2.getValue() - 120) % 12;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, value2);
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(calendar.getActualMaximum(5));
        int value3 = fc0Var.getValue();
        int value4 = fc0Var3.getValue();
        int value5 = fc0Var4.getValue();
        calendar.set(5, value3);
        calendar.set(11, value4);
        calendar.set(12, value5);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        if (dVar != null) {
            if (value3 == 0) {
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
        HashMap map = new HashMap();
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
            long jLongValue = l10.longValue();
            long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(jLongValue);
            if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(jLongValue));
            }
            map.put(l10, Long.valueOf(sendPaidMessagesStars));
            long j12 = j11 + sendPaidMessagesStars;
            hh.u7.y(i10, z10).P.put(l10, Integer.valueOf(i11));
            if (sendPaidMessagesStars > 0) {
                i12++;
            }
            if (sendPaidMessagesStars > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(jLongValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = false;
            }
            j10 = j12;
            z10 = false;
        }
        long jMax = ((long) Math.max(1, i11)) * j10;
        if (z11 || jMax <= 0) {
            callback.run(map);
            return false;
        }
        Activity activity = AndroidUtilities.getActivity();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (PhotoViewer.t1().Q1() || (n2VarU != null && n2VarU.hasShownSheet())) {
            bVar = new jh.b();
        } else {
            bVar = n2VarU != null ? n2VarU.getResourceProvider() : null;
        }
        org.telegram.ui.ActionBar.c6 c6Var = bVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) jMax, LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11))));
        i0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.nq(i10, jMax, activity, arrayList, map, callback, c6Var), c6Var, true);
        return true;
    }

    public static void d(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = 1;
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        int i13 = calendar.get(5);
        fc0Var3.setMinValue(i11);
        int value = fc0Var3.getValue();
        fc0Var2.setMinValue(value == i11 ? i12 : 0);
        int value2 = fc0Var2.getValue();
        if (value == i11 && value2 == i12) {
            i10 = i13;
        }
        fc0Var.setMinValue(i10);
    }

    public static boolean d0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        return sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(com.google.android.recaptcha.internal.a.m(j10, "ask_paid_message_", "_price"), 0L);
    }

    public static void e(TextView textView, fc0 fc0Var, x3 x3Var, y3 y3Var) {
        int value = fc0Var.getValue();
        int value2 = x3Var.getValue();
        int value3 = y3Var.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - jCurrentTimeMillis) / 1000);
        int i10 = timeInMillis / 86400;
        int i11 = (timeInMillis % 86400) / 3600;
        int i12 = (timeInMillis % 3600) / 60;
        textView.setText(LocaleController.formatString(R.string.PollCustomDeadlineClosesIn, LocaleController.formatString(R.string.PollCustomDeadlineClosesInFmt, i10 > 0 ? LocaleController.formatPluralString("Days", i10, new Object[0]) : "", i11 > 0 ? LocaleController.formatPluralString("Hours", i11, new Object[0]) : "", i12 > 0 ? LocaleController.formatPluralString("Minutes", i12, new Object[0]) : "").trim()));
    }

    public static void e0(EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.b2 b2Var, org.telegram.ui.ActionBar.n2 n2Var) throws Throwable {
        if (n2Var.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        String string = editTextBoldCursor.getText().toString();
        int i10 = org.telegram.ui.ActionBar.g6.f22993a;
        org.telegram.ui.ActionBar.f6 f6Var = new org.telegram.ui.ActionBar.f6();
        f6Var.f22943b = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        f6Var.f22941a = string;
        org.telegram.ui.ActionBar.g6.f23119h0 = org.telegram.ui.ActionBar.g6.Y0(org.telegram.ui.ActionBar.g6.I.f22949e0);
        f6Var.A = UserConfig.selectedAccount;
        org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
        new ThemeEditorView().c(n2Var.getParentActivity(), f6Var);
        b2Var.dismiss();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("themehint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("themehint", true).commit();
        try {
            Toast.makeText(n2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void f(int i10, TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        TLRPC.User user;
        if (tL_messages_invitedUsers == null || tL_messages_invitedUsers.missing_invitees.isEmpty() || chat == null) {
            return;
        }
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
            if (tL_messages_invitedUsers.updates == null) {
                user = null;
                break;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= tL_messages_invitedUsers.updates.users.size()) {
                    user = null;
                    break;
                }
                user = tL_messages_invitedUsers.updates.users.get(i12);
                if (user.f22527id == tL_missingInvitee2.user_id) {
                    break;
                } else {
                    i12++;
                }
            }
            if (user == null) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_missingInvitee2.user_id));
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
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gh.e1(i10, chat, arrayList, arrayList2, arrayList3), 200L);
    }

    public static org.telegram.ui.ActionBar.b2 f0(final int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, Object... objArr) {
        String str;
        TLRPC.InputPeer inputPeer;
        long peerDialogId;
        String firstName;
        final long j10;
        long peerDialogId2;
        org.telegram.ui.ActionBar.n2 n2VarR = n2Var;
        if (tL_error != null && tL_error.code != 406 && (str = tL_error.text) != null) {
            if ("BALANCE_TOO_LOW".equalsIgnoreCase(str)) {
                final long jO = hh.u7.o(tLObject);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                } else {
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        peerDialogId2 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                    } else {
                        j10 = 0;
                    }
                    if (jO > 0) {
                        hh.u7.y(i10, false).q(true, true, new Runnable() {
                            @Override
                            public final void run() {
                                org.telegram.ui.ActionBar.c6 bVar;
                                Activity activity = AndroidUtilities.getActivity();
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (PhotoViewer.t1().Q1() || (n2VarU != null && n2VarU.hasShownSheet())) {
                                    bVar = new jh.b();
                                } else {
                                    bVar = n2VarU != null ? n2VarU.getResourceProvider() : null;
                                }
                                org.telegram.ui.ActionBar.c6 c6Var = bVar;
                                int i11 = i10;
                                long j11 = j10;
                                new hh.ea(activity, c6Var, jO, 13, DialogObject.getShortName(i11, j11), new ag.l3(25), j11).show();
                            }
                        });
                        return null;
                    }
                }
                j10 = peerDialogId2;
                if (jO > 0) {
                    hh.u7.y(i10, false).q(true, true, new Runnable() {
                        @Override
                        public final void run() {
                            org.telegram.ui.ActionBar.c6 bVar;
                            Activity activity = AndroidUtilities.getActivity();
                            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                            if (PhotoViewer.t1().Q1() || (n2VarU != null && n2VarU.hasShownSheet())) {
                                bVar = new jh.b();
                            } else {
                                bVar = n2VarU != null ? n2VarU.getResourceProvider() : null;
                            }
                            org.telegram.ui.ActionBar.c6 c6Var = bVar;
                            int i11 = i10;
                            long j11 = j10;
                            new hh.ea(activity, c6Var, jO, 13, DialogObject.getShortName(i11, j11), new ag.l3(25), j11).show();
                        }
                    });
                    return null;
                }
            } else {
                if (tL_error.text.equals("JOIN_GUARD_TIMEOUT")) {
                    u0(n2VarR, LocaleController.getString(R.string.GuardBotTimeoutTitle), LocaleController.getString(R.string.GuardBotTimeout), null);
                    return null;
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
                if (z10 && tL_error.text.contains("PRIVACY_PREMIUM_REQUIRED")) {
                    long peerDialogId3 = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                    if (peerDialogId3 >= 0) {
                        firstName = UserObject.getFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId3)));
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId3));
                        firstName = chat != null ? chat.title : "";
                    }
                    if (n2VarR == null) {
                        n2VarR = LaunchActivity.R();
                    }
                    u0(n2VarR, LocaleController.getString(R.string.MessagePremiumErrorTitle), LocaleController.formatString(R.string.MessagePremiumErrorMessage, firstName), null);
                    MessagesController.getInstance(i10).invalidateUserPremiumBlocked(peerDialogId3, 0);
                    return null;
                }
                boolean z11 = tLObject instanceof TLRPC.TL_messages_initHistoryImport;
                if (z11 || (tLObject instanceof TLRPC.TL_messages_checkHistoryImportPeer) || (tLObject instanceof TLRPC.TL_messages_checkHistoryImport) || (tLObject instanceof TLRPC.TL_messages_startHistoryImport)) {
                    if (z11) {
                        inputPeer = ((TLRPC.TL_messages_initHistoryImport) tLObject).peer;
                    } else {
                        inputPeer = tLObject instanceof TLRPC.TL_messages_startHistoryImport ? ((TLRPC.TL_messages_startHistoryImport) tLObject).peer : null;
                    }
                    org.telegram.ui.ActionBar.n2 n2VarR2 = n2VarR == null ? LaunchActivity.R() : n2VarR;
                    if (tL_error.text.contains("USER_IS_BLOCKED")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorUserBlocked), null);
                        return null;
                    }
                    if (tL_error.text.contains("USER_NOT_MUTUAL_CONTACT")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportMutualError), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_PEER_TYPE_INVALID")) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidUser), null);
                            return null;
                        }
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorChatInvalidGroup), null);
                        return null;
                    }
                    if (tL_error.text.contains("CHAT_ADMIN_REQUIRED")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorNotAdmin), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("IMPORT_FORMAT")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileFormatInvalid), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("PEER_ID_INVALID")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorPeerInvalid), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_LANG_NOT_FOUND")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportErrorFileLang), null);
                        return null;
                    }
                    if (tL_error.text.contains("IMPORT_UPLOAD_FAILED")) {
                        u0(n2VarR2, LocaleController.getString(R.string.ImportErrorTitle), LocaleController.getString(R.string.ImportFailedToUpload), null);
                        return null;
                    }
                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        m0(n2VarR2, tL_error.text);
                        return null;
                    }
                    String string = LocaleController.getString(R.string.ImportErrorTitle);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    u0(n2VarR2, string, sb2.toString(), null);
                } else {
                    if ((tLObject instanceof TL_account.saveSecureValue) || (tLObject instanceof TL_account.getAuthorizationForm)) {
                        org.telegram.ui.ActionBar.n2 n2VarR3 = n2VarR == null ? LaunchActivity.R() : n2VarR;
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            u0(n2VarR3, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                            return null;
                        }
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            u0(n2VarR3, null, LocaleController.getString(R.string.FloodWait), null);
                            return null;
                        }
                        if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                            x0(n2VarR3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                            return null;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error.text);
                        u0(n2VarR3, null, sb3.toString(), null);
                        return null;
                    }
                    boolean z12 = tLObject instanceof TLRPC.TL_channels_joinChannel;
                    if (!z12 && !(tLObject instanceof TLRPC.TL_channels_editAdmin) && !(tLObject instanceof TLRPC.TL_channels_inviteToChannel) && !(tLObject instanceof TLRPC.TL_messages_addChatUser) && !(tLObject instanceof TLRPC.TL_messages_startBot) && !(tLObject instanceof TLRPC.TL_channels_editBanned) && !(tLObject instanceof TLRPC.TL_messages_editChatDefaultBannedRights) && !(tLObject instanceof TLRPC.TL_messages_editChatAdmin) && !(tLObject instanceof TLRPC.TL_messages_migrateChat) && !(tLObject instanceof TL_phone.inviteToGroupCall)) {
                        if (tLObject instanceof TLRPC.TL_messages_createChat) {
                            org.telegram.ui.ActionBar.n2 n2VarR4 = n2VarR == null ? LaunchActivity.R() : n2VarR;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (n2VarR4.getParentActivity() != null) {
                                    n2VarR4.showDialog(new ag.i1(5, i10, n2VarR4.getParentActivity(), n2VarR4, null));
                                    return null;
                                }
                                n2VarR4.presentFragment(new ld1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2VarR4;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(n2Var2, tL_error.text);
                                return null;
                            }
                            h0(tL_error, n2Var2, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                            org.telegram.ui.ActionBar.n2 n2VarR5 = n2VarR == null ? LaunchActivity.R() : n2VarR;
                            if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                if (n2VarR5.getParentActivity() != null) {
                                    n2VarR5.showDialog(new ag.i1(5, i10, n2VarR5.getParentActivity(), n2VarR5, null));
                                    return null;
                                }
                                n2VarR5.presentFragment(new ld1(2));
                                return null;
                            }
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2VarR5;
                            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                m0(n2Var3, tL_error.text);
                                return null;
                            }
                            h0(tL_error, n2Var3, false, false, tLObject);
                            return null;
                        }
                        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
                            if (!tL_error.text.equals("MESSAGE_NOT_MODIFIED")) {
                                if (n2VarR != null) {
                                    u0(n2VarR, null, LocaleController.getString(R.string.EditMessageError), null);
                                    return null;
                                }
                                w0(null, LocaleController.getString(R.string.EditMessageError));
                                return null;
                            }
                        } else {
                            if (z10 || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) || (tLObject instanceof TLRPC.TL_messages_forwardMessages) || (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) || (tLObject instanceof TLRPC.TL_messages_sendScheduledMessages)) {
                                if (z10) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMedia) tLObject).peer);
                                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TL_ephemeral.TL_sendMessage) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_forwardMessages) tLObject).to_peer);
                                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendMultiMedia) tLObject).peer);
                                } else {
                                    peerDialogId = tLObject instanceof TLRPC.TL_messages_sendScheduledMessages ? DialogObject.getPeerDialogId(((TLRPC.TL_messages_sendScheduledMessages) tLObject).peer) : 0L;
                                }
                                String str2 = tL_error.text;
                                if (str2 == null || !str2.startsWith("CHAT_SEND_") || !tL_error.text.endsWith("FORBIDDEN")) {
                                    String str3 = tL_error.text;
                                    str3.getClass();
                                    switch (str3) {
                                        case "USER_BANNED_IN_CHANNEL":
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 5);
                                            return null;
                                        case "PEER_FLOOD":
                                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 0);
                                            return null;
                                        case "SCHEDULE_TOO_MUCH":
                                            w0(n2VarR, LocaleController.getString(R.string.MessageScheduledLimitReached));
                                            return null;
                                    }
                                }
                                String restrictedErrorText = tL_error.text;
                                TLRPC.Chat chat2 = peerDialogId < 0 ? MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId)) : null;
                                String str4 = tL_error.text;
                                str4.getClass();
                                switch (str4) {
                                    case "CHAT_SEND_VOICES_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 20);
                                        break;
                                    case "CHAT_SEND_PLAIN_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 22);
                                        break;
                                    case "CHAT_SEND_AUDIOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 18);
                                        break;
                                    case "CHAT_SEND_POLL_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 10);
                                        break;
                                    case "CHAT_SEND_DOCS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 19);
                                        break;
                                    case "CHAT_SEND_ROUNDVIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 21);
                                        break;
                                    case "CHAT_SEND_VIDEOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 17);
                                        break;
                                    case "CHAT_SEND_GIFS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 23);
                                        break;
                                    case "CHAT_SEND_PHOTOS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 16);
                                        break;
                                    case "CHAT_SEND_STICKERS_FORBIDDEN":
                                        restrictedErrorText = ChatObject.getRestrictedErrorText(chat2, 8);
                                        break;
                                }
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, restrictedErrorText);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_importChatInvite) {
                                org.telegram.ui.ActionBar.n2 n2VarR6 = n2VarR == null ? LaunchActivity.R() : n2VarR;
                                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                    u0(n2VarR6, null, LocaleController.getString(R.string.FloodWait), null);
                                    return null;
                                }
                                if (tL_error.text.equals("USERS_TOO_MUCH")) {
                                    u0(n2VarR6, null, LocaleController.getString(R.string.JoinToGroupErrorFull), null);
                                    return null;
                                }
                                if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                                    if (n2VarR6.getParentActivity() != null) {
                                        n2VarR6.showDialog(new ag.i1(5, i10, n2VarR6.getParentActivity(), n2VarR6, null));
                                        return null;
                                    }
                                    n2VarR6.presentFragment(new ld1(0));
                                    return null;
                                }
                                if (tL_error.text.equals("INVITE_HASH_EXPIRED")) {
                                    u0(n2VarR6, LocaleController.getString(R.string.ExpiredLink), LocaleController.getString(R.string.InviteExpired), null);
                                    return null;
                                }
                                u0(n2VarR6, null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
                                return null;
                            }
                            if (tLObject instanceof TLRPC.TL_messages_getAttachedStickers) {
                                if (n2VarR != null && n2VarR.getParentActivity() != null) {
                                    Activity parentActivity = n2VarR.getParentActivity();
                                    StringBuilder sb4 = new StringBuilder();
                                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb4);
                                    sb4.append(tL_error.text);
                                    Toast.makeText(parentActivity, sb4.toString(), 0).show();
                                    return null;
                                }
                            } else {
                                if ((tLObject instanceof TL_account.confirmPhone) || (tLObject instanceof TL_account.verifyPhone) || (tLObject instanceof TL_account.verifyEmail)) {
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("CODE_EMPTY")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED") || tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    return tL_error.text.startsWith("FLOOD_WAIT") ? u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null) : u0(n2VarR, null, tL_error.text, null);
                                }
                                if (tLObject instanceof TLRPC.TL_auth_resendCode) {
                                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.InvalidCode), null);
                                    }
                                    if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.CodeExpired), null);
                                    }
                                    if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                        return u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null);
                                    }
                                    if (tL_error.code != -1000) {
                                        StringBuilder sb5 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb5);
                                        sb5.append(tL_error.text);
                                        return u0(n2VarR, null, sb5.toString(), null);
                                    }
                                } else {
                                    if (tLObject instanceof TL_account.sendConfirmPhoneCode) {
                                        if (tL_error.code == 400) {
                                            return u0(n2VarR, null, LocaleController.getString(R.string.CancelLinkExpired), null);
                                        }
                                        return tL_error.text.startsWith("FLOOD_WAIT") ? u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null) : u0(n2VarR, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                    }
                                    if (tLObject instanceof TL_account.changePhone) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.InvalidPhoneNumber), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("FRESH_CHANGE_PHONE_FORBIDDEN")) {
                                            u0(n2VarR, LocaleController.getString(R.string.FreshChangePhoneForbiddenTitle), LocaleController.getString(R.string.FreshChangePhoneForbidden), null);
                                            return null;
                                        }
                                        u0(n2VarR, null, tL_error.text, null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.sendChangePhoneCode) {
                                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                                            org.telegram.ui.ig0.m1(n2VarR, (String) objArr[0], null, false);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.InvalidCode), null);
                                            return null;
                                        }
                                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.CodeExpired), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_OCCUPIED")) {
                                            u0(n2VarR, null, LocaleController.formatString("ChangePhoneNumberOccupied", R.string.ChangePhoneNumberOccupied, objArr[0]), null);
                                            return null;
                                        }
                                        if (tL_error.text.startsWith("PHONE_NUMBER_BANNED")) {
                                            org.telegram.ui.ig0.m1(n2VarR, (String) objArr[0], null, true);
                                            return null;
                                        }
                                        u0(n2VarR, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TL_account.updateUsername) {
                                        String str5 = tL_error.text;
                                        str5.getClass();
                                        if (str5.equals("USERNAME_INVALID")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.UsernameInvalid), null);
                                            return null;
                                        }
                                        if (str5.equals("USERNAME_OCCUPIED")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.UsernameInUse), null);
                                            return null;
                                        }
                                        u0(n2VarR, null, LocaleController.getString(R.string.ErrorOccurred), null);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_contacts_importContacts) {
                                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                            u0(n2VarR, null, LocaleController.getString(R.string.FloodWait), null);
                                            return null;
                                        }
                                        StringBuilder sb6 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb6);
                                        sb6.append(tL_error.text);
                                        u0(n2VarR, null, sb6.toString(), null);
                                        return null;
                                    }
                                    if ((tLObject instanceof TL_account.getPassword) || (tLObject instanceof TL_account.getTmpPassword)) {
                                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                            w0(n2VarR, tL_error.text);
                                            return null;
                                        }
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                        w0(n2VarR, LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_sendPaymentForm) {
                                        String str6 = tL_error.text;
                                        str6.getClass();
                                        if (str6.equals("BOT_PRECHECKOUT_FAILED")) {
                                            w0(n2VarR, LocaleController.getString(R.string.PaymentPrecheckoutFailed));
                                            return null;
                                        }
                                        if (str6.equals("PAYMENT_FAILED")) {
                                            w0(n2VarR, LocaleController.getString(R.string.PaymentFailed));
                                            return null;
                                        }
                                        w0(n2VarR, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_validateRequestedInfo) {
                                        String str7 = tL_error.text;
                                        str7.getClass();
                                        if (str7.equals("SHIPPING_NOT_AVAILABLE")) {
                                            w0(n2VarR, LocaleController.getString(R.string.PaymentNoShippingMethod));
                                            return null;
                                        }
                                        w0(n2VarR, tL_error.text);
                                        return null;
                                    }
                                    if (tLObject instanceof TLRPC.TL_payments_assignPlayMarketTransaction) {
                                        StringBuilder sb7 = new StringBuilder();
                                        org.telegram.messenger.rl.j(R.string.PaymentConfirmationError, "\n", sb7);
                                        sb7.append(tL_error.text);
                                        u0(n2VarR, null, sb7.toString(), null);
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        if (n2VarR != null && tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                            if (n2VarR.getParentActivity() != null) {
                                n2VarR.showDialog(new ag.i1(5, i10, n2VarR.getParentActivity(), n2VarR, null));
                                return null;
                            }
                            if (z12 || (tLObject instanceof TLRPC.TL_channels_inviteToChannel)) {
                                n2VarR.presentFragment(new ld1(0));
                                return null;
                            }
                            n2VarR.presentFragment(new ld1(1));
                            return null;
                        }
                        if (n2VarR != null) {
                            h0(tL_error, n2VarR, objArr.length > 0 ? ((Boolean) objArr[0]).booleanValue() : false, objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : false, tLObject);
                            return null;
                        }
                        if (tL_error.text.equals("PEER_FLOOD")) {
                            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 1);
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        long timeInMillis;
        int i11;
        int iBetween;
        int i12;
        boolean z10;
        boolean z11;
        String pluralString;
        int i13;
        int value = fc0Var.getValue();
        int value2 = fc0Var2.getValue();
        int value3 = fc0Var3.getValue();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i14 = calendar.get(1);
        calendar.get(6);
        if (j11 > 0) {
            calendar.setTimeInMillis((j11 * 1000) + jCurrentTimeMillis);
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 0);
            iBetween = (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(jCurrentTimeMillis).atZone(ZoneId.systemDefault()).f(), Instant.ofEpochMilli(calendar.getTimeInMillis()).atZone(ZoneId.systemDefault()).f());
            timeInMillis = calendar.getTimeInMillis();
            i11 = 23;
            i12 = 59;
        } else {
            timeInMillis = j11;
            i11 = 0;
            iBetween = 0;
            i12 = 0;
        }
        int i15 = i12;
        long millis = j10 > 0 ? TimeUnit.SECONDS.toMillis(j10) : 60000L;
        long j12 = jCurrentTimeMillis + millis;
        calendar.setTimeInMillis(j12);
        int i16 = calendar.get(11);
        int i17 = calendar.get(12);
        long j13 = timeInMillis;
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value);
        calendar.set(11, value2);
        calendar.set(12, value3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        fc0Var.setMinValue(0);
        if (j13 > 0) {
            fc0Var.setMaxValue(iBetween);
        }
        int value4 = fc0Var.getValue();
        fc0Var2.setMinValue(value4 == 0 ? i16 : 0);
        if (j13 > 0) {
            fc0Var2.setMaxValue(value4 == iBetween ? i11 : 23);
        }
        int value5 = fc0Var2.getValue();
        fc0Var3.setMinValue((value4 == 0 && value5 == i16) ? i17 : 0);
        if (j13 > 0) {
            fc0Var3.setMaxValue((value4 == iBetween && value5 == i11) ? i15 : 59);
        }
        int value6 = fc0Var3.getValue();
        if (timeInMillis2 <= j12) {
            calendar.setTimeInMillis(j12);
        } else if (j13 > 0 && timeInMillis2 > j13) {
            calendar.setTimeInMillis(j13);
        }
        int i18 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, value4);
        calendar.set(11, value5);
        calendar.set(12, value6);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis3 = calendar.getTimeInMillis();
        if (textView != null) {
            if (value4 == 0) {
                i13 = 0;
            } else {
                i13 = i14 == i18 ? 1 : 2;
            }
            textView.setText(LocaleController.getInstance().getFormatterScheduleSend((i10 * 3) + i13).format(timeInMillis3));
        }
        if (textView2 != null) {
            int i19 = (int) ((timeInMillis3 - jCurrentTimeMillis) / 1000);
            if (i19 > 86400) {
                z11 = false;
                pluralString = LocaleController.formatPluralString("DaysSchedule", Math.round(i19 / 86400.0f), new Object[0]);
            } else {
                z11 = false;
                z11 = false;
                z11 = false;
                if (i19 >= 3600) {
                    pluralString = LocaleController.formatPluralString("HoursSchedule", Math.round(i19 / 3600.0f), new Object[0]);
                } else {
                    pluralString = i19 >= 60 ? LocaleController.formatPluralString("MinutesSchedule", Math.round(i19 / 60.0f), new Object[0]) : LocaleController.formatPluralString("SecondsSchedule", i19, new Object[0]);
                }
            }
            if (textView2.getTag() != null) {
                int i20 = R.string.VoipChannelScheduleInfo;
                z10 = true;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipChannelScheduleInfo", i20, objArr));
            } else {
                z10 = true;
                int i21 = R.string.VoipGroupScheduleInfo;
                Object[] objArr2 = new Object[1];
                objArr2[z11 ? 1 : 0] = pluralString;
                textView2.setText(LocaleController.formatString("VoipGroupScheduleInfo", i21, objArr2));
            }
        } else {
            z10 = true;
            z11 = false;
        }
        return timeInMillis2 - jCurrentTimeMillis > millis ? z10 : z11;
    }

    public static void g0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, gm gmVar) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final z3 z3Var = new z3(context);
        z3Var.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        z3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        z3Var.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        z3Var.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        z3Var.setInputType(17);
        z3Var.setImeOptions(6);
        z3Var.setMaxLines(10);
        z3Var.setSingleLine(false);
        z3Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        z3Var.setCursorWidth(1.5f);
        z3Var.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (str != null) {
            z3Var.setText(str);
            z3Var.setSelection(str.length());
        }
        z3Var.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 6) {
                    return false;
                }
                z3 z3Var2 = z3Var;
                String strTrim = z3Var2.getText().toString().trim();
                if (!(TextUtils.isEmpty(strTrim) ? false : y4.f34802a.matcher(strTrim.trim()).matches())) {
                    AndroidUtilities.shakeView(z3Var2);
                    return true;
                }
                callback.run(strTrim);
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        z3Var.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(z3Var, h7.z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = x71.f34536f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            x71 x71Var = new x71(context, c6Var);
            x71Var.setWebPage(webPage);
            linearLayout.addView(x71Var, h7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f22742a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        int i12 = 2;
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new g1(i12, z3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c2(i12));
        if (gmVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new y0(4, gmVar));
        }
        b2VarArr[0] = b2Var;
        b2Var.f22748d0 = false;
        b2Var.setOnDismissListener(new a1(z3Var, i12));
        b2VarArr[0].setOnShowListener(new gt(i12, z3Var));
        b2VarArr[0].show();
        TextView textView = (TextView) b2VarArr[0].d(-3);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (!DialogObject.isChatDialog(j10) || (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) == null || !chat.slowmode_enabled || ChatObject.hasAdminRights(chat)) {
            return false;
        }
        if (!z10) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22380id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f22380id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                z10 = true;
            }
        }
        if (!z10) {
            return false;
        }
        N(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).o();
        return true;
    }

    public static void h0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error == null || tL_error.code == 406 || tL_error.text == null || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        String str = tL_error.text;
        str.getClass();
        int i10 = 0;
        switch (str) {
            case "CHANNELS_ADMIN_LOCATED_TOO_MUCH":
                b2Var.P = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                break;
            case "CHANNELS_ADMIN_PUBLIC_TOO_MUCH":
                b2Var.P = LocaleController.getString(R.string.PublicChannelsTooMuch);
                break;
            case "USERS_TOO_FEW":
                b2Var.P = LocaleController.getString(R.string.CreateGroupError);
                break;
            case "USER_BLOCKED":
            case "USER_BOT":
            case "USER_ID_INVALID":
                if (z10) {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantAdd);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantAdd);
                    break;
                }
                break;
            case "USER_RESTRICTED":
                b2Var.P = LocaleController.getString(R.string.UserRestricted);
                break;
            case "PEER_FLOOD":
                b2Var.P = LocaleController.getString(R.string.NobodyLikesSpam2);
                alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new n2(i10, n2Var));
                break;
            case "BOTS_TOO_MUCH":
                if (z10) {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantBot);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantBot);
                    break;
                }
                break;
            case "USER_KICKED":
            case "CHAT_ADMIN_BAN_REQUIRED":
                if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                    b2Var.P = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                    break;
                }
                break;
            case "YOU_BLOCKED_USER":
                b2Var.P = LocaleController.getString(R.string.YouBlockedUser);
                break;
            case "USER_ADMIN_INVALID":
                b2Var.P = LocaleController.getString(R.string.AddBannedErrorAdmin);
                break;
            case "USERS_TOO_MUCH":
                if (z10) {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserAddLimit);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.GroupUserAddLimit);
                    break;
                }
                break;
            case "ADMINS_TOO_MUCH":
                if (z10) {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserCantAdmin);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.GroupUserCantAdmin);
                    break;
                }
                break;
            case "CHANNELS_TOO_MUCH":
                b2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                    b2Var.P = LocaleController.getString(R.string.ChannelTooMuch);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.ChannelTooMuchJoin);
                    break;
                }
                break;
            case "USER_CHANNELS_TOO_MUCH":
                b2Var.N = LocaleController.getString(R.string.ChannelTooMuchTitle);
                b2Var.P = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                break;
            case "USER_NOT_MUTUAL_CONTACT":
                if (z10) {
                    b2Var.P = LocaleController.getString(R.string.ChannelUserLeftError);
                    break;
                } else {
                    b2Var.P = LocaleController.getString(R.string.GroupUserLeftError);
                    break;
                }
                break;
            case "CHAT_ADMIN_INVITE_REQUIRED":
                b2Var.P = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                break;
            case "USER_PRIVACY_RESTRICTED":
                if (z11) {
                    b2Var.P = LocaleController.getString(R.string.InviteToCommunityError);
                    break;
                } else {
                    if (!z10) {
                        b2Var.P = LocaleController.getString(R.string.InviteToGroupError);
                    } else {
                        b2Var.P = LocaleController.getString(R.string.InviteToChannelError);
                    }
                    break;
                }
                break;
            case "USER_ALREADY_PARTICIPANT":
                b2Var.N = LocaleController.getString(R.string.VoipGroupVoiceChat);
                b2Var.P = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                b2Var.P = sb2.toString();
                break;
        }
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static org.telegram.ui.ActionBar.b2 i(Activity activity, v4 v4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.q1 q1Var = alertDialog$Builder.f22702a.H0;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f24551f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                y8 y8Var = kVar.f24550e;
                y8Var.m(i10, currentUser);
                kVar.f24547a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                n9 n9Var = kVar.f24549c;
                n9Var.getImageReceiver().setCurrentAccount(i10);
                n9Var.e(currentUser, y8Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                linearLayoutF.addView(kVar, h7.z5.n(-1, 50));
                kVar.setOnClickListener(new gg.f((Object) b2VarArr, (Runnable) q1Var, (Object) v4Var, 18));
            }
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2VarArr[0] = b2Var;
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 i0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        if (activity == null) {
            callback.run(Boolean.FALSE);
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        boolean[] zArr = new boolean[1];
        t4 t4Var = new t4(activity);
        NotificationCenter.listenEmojiLoading(t4Var);
        t4Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        t4Var.setTextSize(1, 16.0f);
        t4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        t4Var.setText(charSequence);
        u4 u4Var = new u4(activity, y1VarArr);
        alertDialog$Builder.f22702a.C = 6;
        alertDialog$Builder.n(u4Var);
        TextView textView = new TextView(activity);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.E8, c6Var, textView, 1, 20.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        u4Var.addView(textView, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        u4Var.addView(t4Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(activity, 1, c6Var);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 7, AndroidUtilities.dp(12.0f)));
            y1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
            y1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            y1VarArr[0].e(charSequence2, "", false, false, false);
            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(4.0f) : 0, AndroidUtilities.dp(12.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
            u4Var.addView(y1VarArr[0], h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new s0(5, zArr));
        }
        alertDialog$Builder.k(str2, new g1(8, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (z10) {
            b2Var.T0 = true;
        }
        b2Var.show();
        return b2Var;
    }

    public static org.telegram.ui.ActionBar.b2 j(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ApkRestricted);
        alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22702a;
    }

    public static void j0(org.telegram.ui.ActionBar.n2 n2Var, long j10, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final boolean z10, TLRPC.ChatFull chatFull, final MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        long j11;
        boolean z11;
        org.telegram.ui.ActionBar.b2 b2Var;
        String string;
        final org.telegram.ui.Cells.y1[] y1VarArr;
        TextView textView;
        int i10;
        org.telegram.ui.Cells.y1[] y1VarArr2;
        LinearLayout linearLayout;
        int i11;
        int iDp;
        int iDp2;
        if (n2Var.getParentActivity() == null) {
            return;
        }
        final AccountInstance accountInstance = n2Var.getAccountInstance();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(n2Var.getCurrentAccount());
        int i12 = 1;
        if (encryptedChat == null) {
            j11 = j10;
            if (!org.telegram.messenger.y1.w("dialog_bar_report", j11, notificationsSettings, false)) {
                z11 = false;
            }
            b2Var = alertDialog$Builder.f22702a;
            if (user != null) {
                b2Var.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
                string = LocaleController.getString(R.string.BlockContact);
                y1VarArr2 = new org.telegram.ui.Cells.y1[2];
                linearLayout = new LinearLayout(n2Var.getParentActivity());
                linearLayout.setOrientation(1);
                i11 = 0;
                for (i10 = 2; i11 < i10; i10 = 2) {
                    if (i11 == 0 || z11) {
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(n2Var.getParentActivity(), i12, c6Var);
                        y1VarArr2[i11] = y1Var;
                        y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        y1VarArr2[i11].setTag(Integer.valueOf(i11));
                        if (i11 == 0) {
                            y1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                        } else {
                            y1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                        }
                        org.telegram.ui.Cells.y1 y1Var2 = y1VarArr2[i11];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        y1Var2.setPadding(iDp, 0, iDp2, 0);
                        linearLayout.addView(y1VarArr2[i11], h7.z5.n(-1, -2));
                        y1VarArr2[i11].setOnClickListener(new b1(y1VarArr2, 1));
                    }
                    i11++;
                    i12 = 1;
                }
                alertDialog$Builder.n(linearLayout);
                y1VarArr = y1VarArr2;
            } else {
                if (chat == null && z10) {
                    b2Var.N = LocaleController.getString(R.string.ReportUnrelatedGroup);
                    if (chatFull != null) {
                        TLRPC.ChannelLocation channelLocation = chatFull.location;
                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ReportUnrelatedGroupText", R.string.ReportUnrelatedGroupText, ((TLRPC.TL_channelLocation) channelLocation).address));
                        } else {
                            b2Var.P = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                        }
                    } else {
                        b2Var.P = LocaleController.getString(R.string.ReportUnrelatedGroupTextNoAddress);
                    }
                } else {
                    b2Var.N = LocaleController.getString(R.string.ReportSpamTitle);
                    if (ChatObject.isChannel(chat) || chat.megagroup) {
                        b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                    } else {
                        b2Var.P = LocaleController.getString(R.string.ReportSpamAlertChannel);
                    }
                }
                string = LocaleController.getString(R.string.ReportChat);
                y1VarArr = null;
            }
            final long j12 = j11;
            alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                    org.telegram.ui.Cells.y1 y1Var3;
                    TLRPC.User user2 = user;
                    AccountInstance accountInstance2 = accountInstance;
                    if (user2 != null) {
                        accountInstance2.getMessagesController().blockPeer(user2.f22527id);
                    }
                    org.telegram.ui.Cells.y1[] y1VarArr3 = y1VarArr;
                    long j13 = j12;
                    TLRPC.Chat chat2 = chat;
                    if (y1VarArr3 == null || ((y1Var3 = y1VarArr3[0]) != null && y1Var3.b())) {
                        accountInstance2.getMessagesController().reportSpam(j13, user2, chat2, encryptedChat, chat2 != null && z10);
                    }
                    MessagesStorage.IntCallback intCallback2 = intCallback;
                    if (y1VarArr3 != null && !y1VarArr3[1].b()) {
                        intCallback2.run(0);
                        return;
                    }
                    if (chat2 == null || ChatObject.isNotInChat(chat2)) {
                        accountInstance2.getMessagesController().deleteDialog(j13, 0);
                    } else {
                        accountInstance2.getMessagesController().deleteParticipantFromChat(-j13, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                    }
                    intCallback2.run(1);
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(b2Var);
            textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
        j11 = j10;
        z11 = true;
        b2Var = alertDialog$Builder.f22702a;
        if (user != null) {
            b2Var.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, UserObject.getFirstName(user));
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserAlert", R.string.BlockUserAlert, UserObject.getFirstName(user)));
            string = LocaleController.getString(R.string.BlockContact);
            y1VarArr2 = new org.telegram.ui.Cells.y1[2];
            linearLayout = new LinearLayout(n2Var.getParentActivity());
            linearLayout.setOrientation(1);
            i11 = 0;
            while (i11 < i10) {
                if (i11 == 0) {
                    org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(n2Var.getParentActivity(), i12, c6Var);
                    y1VarArr2[i11] = y1Var3;
                    y1Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    y1VarArr2[i11].setTag(Integer.valueOf(i11));
                    if (i11 == 0) {
                        y1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        y1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    org.telegram.ui.Cells.y1 y1Var4 = y1VarArr2[i11];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    y1Var4.setPadding(iDp, 0, iDp2, 0);
                    linearLayout.addView(y1VarArr2[i11], h7.z5.n(-1, -2));
                    y1VarArr2[i11].setOnClickListener(new b1(y1VarArr2, 1));
                } else {
                    org.telegram.ui.Cells.y1 y1Var5 = new org.telegram.ui.Cells.y1(n2Var.getParentActivity(), i12, c6Var);
                    y1VarArr2[i11] = y1Var5;
                    y1Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    y1VarArr2[i11].setTag(Integer.valueOf(i11));
                    if (i11 == 0) {
                        y1VarArr2[i11].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
                    } else {
                        y1VarArr2[i11].e(LocaleController.formatString("DeleteThisChat", R.string.DeleteThisChat, new Object[0]), "", true, false, false);
                    }
                    org.telegram.ui.Cells.y1 y1Var6 = y1VarArr2[i11];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    y1Var6.setPadding(iDp, 0, iDp2, 0);
                    linearLayout.addView(y1VarArr2[i11], h7.z5.n(-1, -2));
                    y1VarArr2[i11].setOnClickListener(new b1(y1VarArr2, 1));
                }
                i11++;
                i12 = 1;
            }
            alertDialog$Builder.n(linearLayout);
            y1VarArr = y1VarArr2;
        } else {
            if (chat == null) {
                b2Var.N = LocaleController.getString(R.string.ReportSpamTitle);
                if (ChatObject.isChannel(chat)) {
                    b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                } else {
                    b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                }
            } else {
                b2Var.N = LocaleController.getString(R.string.ReportSpamTitle);
                if (ChatObject.isChannel(chat)) {
                    b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                } else {
                    b2Var.P = LocaleController.getString(R.string.ReportSpamAlertGroup);
                }
            }
            string = LocaleController.getString(R.string.ReportChat);
            y1VarArr = null;
        }
        final long j13 = j11;
        alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i13) {
                org.telegram.ui.Cells.y1 y1Var7;
                TLRPC.User user2 = user;
                AccountInstance accountInstance2 = accountInstance;
                if (user2 != null) {
                    accountInstance2.getMessagesController().blockPeer(user2.f22527id);
                }
                org.telegram.ui.Cells.y1[] y1VarArr3 = y1VarArr;
                long j14 = j13;
                TLRPC.Chat chat2 = chat;
                if (y1VarArr3 == null || ((y1Var7 = y1VarArr3[0]) != null && y1Var7.b())) {
                    accountInstance2.getMessagesController().reportSpam(j14, user2, chat2, encryptedChat, chat2 != null && z10);
                }
                MessagesStorage.IntCallback intCallback2 = intCallback;
                if (y1VarArr3 != null && !y1VarArr3[1].b()) {
                    intCallback2.run(0);
                    return;
                }
                if (chat2 == null || ChatObject.isNotInChat(chat2)) {
                    accountInstance2.getMessagesController().deleteDialog(j14, 0);
                } else {
                    accountInstance2.getMessagesController().deleteParticipantFromChat(-j14, accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId())));
                }
                intCallback2.run(1);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var);
        textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.c6 c6Var, x4 x4Var) {
        if (context == null) {
            return;
        }
        boolean z10 = false;
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        int iQ0 = c6Var != null ? c6Var.q0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
        int iQ1 = c6Var != null ? c6Var.q0(i11) : org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Ji;
        if (c6Var != null) {
            c6Var.q0(i12);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.g6.Ni;
        if (c6Var != null) {
            c6Var.q0(i13);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.g6.E8;
        if (c6Var != null) {
            c6Var.q0(i14);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.g6.G8;
        if (c6Var != null) {
            c6Var.q0(i15);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.g6.f23144i6;
        if (c6Var != null) {
            c6Var.q0(i16);
        } else {
            org.telegram.ui.ActionBar.g6.w0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.g6.Sh;
        int iQ2 = c6Var != null ? c6Var.q0(i17) : org.telegram.ui.ActionBar.g6.w0(null, i17, false);
        int i18 = org.telegram.ui.ActionBar.g6.Oh;
        int iQ3 = c6Var != null ? c6Var.q0(i18) : org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        int iQ4 = c6Var != null ? c6Var.q0(org.telegram.ui.ActionBar.g6.Qh) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        c4 c4Var = new c4(context, c6Var, iArr);
        c4Var.setMinValue(0);
        c4Var.setMaxValue(16);
        c4Var.setTextColor(iQ0);
        c4Var.setValue(0);
        c4Var.setFormatter(new e1(1, iArr));
        d4 d4Var = new d4(context, c4Var, 0);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(iQ0);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, 1 == true ? 1 : 0, 1 == true ? 1 : 0, z10, 1);
        linearLayout.addView(c4Var, h7.z5.l(1.0f, 0, 270));
        r3Var.setPadding(0, 0, 0, 0);
        r3Var.setGravity(17);
        r3Var.setTextColor(iQ2);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        r3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iQ3, iQ4, iQ4));
        d4Var.addView(r3Var, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        r3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        c4Var.setOnValueChangedListener(new s(r3Var, 10));
        r3Var.setOnClickListener(new gh.a4(iArr, c4Var, x4Var, z2Var, 9));
        z2Var.b(d4Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setBackgroundColor(iQ1);
        e3Var.fixNavigationBar(iQ1);
    }

    public static void k0(org.telegram.ui.rn rnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.lg lgVar) {
        if (rnVar.getParentActivity() == null || messageObject == null) {
            return;
        }
        AccountInstance accountInstance = rnVar.getAccountInstance();
        TLRPC.User user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : null;
        TLRPC.Chat chat = j10 < 0 ? accountInstance.getMessagesController().getChat(Long.valueOf(-j10)) : null;
        if (user == null && chat == null) {
            return;
        }
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, c6Var);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.L0 = false;
        b2Var.J = new a1(lgVar, i10);
        b2Var.N = LocaleController.getString(R.string.BlockUser);
        if (user != null) {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
        }
        LinearLayout linearLayout = new LinearLayout(rnVar.getParentActivity());
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.y1[] y1VarArr = {new org.telegram.ui.Cells.y1(rnVar.getParentActivity(), 1, c6Var)};
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        y1VarArr[0].setTag(0);
        y1VarArr[0].e(LocaleController.getString(R.string.DeleteReportSpam), "", true, false, false);
        y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(y1VarArr[0], h7.z5.n(-1, -2));
        y1VarArr[0].setOnClickListener(new b1(y1VarArr, i10));
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new cg.d0(user, accountInstance, rnVar, chat, messageObject, y1VarArr, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        rnVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static AlertDialog$Builder l(Activity activity, TLRPC.User user, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        String res = AndroidUtilities.readRes(org.telegram.ui.ActionBar.g6.A0().q() ? R.raw.permission_map_dark : R.raw.permission_map);
        String res2 = AndroidUtilities.readRes(org.telegram.ui.ActionBar.g6.A0().q() ? R.raw.permission_pin_dark : R.raw.permission_pin);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new l4());
        View view = new View(activity);
        view.setBackground(SvgHelper.getDrawable(res));
        frameLayout.addView(view, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view2 = new View(activity);
        view2.setBackground(SvgHelper.getDrawable(res2));
        frameLayout.addView(view2, h7.z5.d(60, 82.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        n9 n9Var = new n9(activity);
        n9Var.setRoundRadius(AndroidUtilities.dp(26.0f));
        n9Var.e(user, new y8(0, user));
        frameLayout.addView(n9Var, h7.z5.d(52, 52.0f, 17, 0.0f, 0.0f, 0.0f, 11.0f));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.R = frameLayout;
        b2Var.K0 = 0.37820512f;
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionBackgroundLocation));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new i1(activity, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new y0(1, runnable));
        return alertDialog$Builder;
    }

    public static void l0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, null, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayoutG.addView(frameLayout, h7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, h7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        frameLayout.addView(frameLayout2, h7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 20.0f);
        org.telegram.messenger.rl.i(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textViewI.setTextSize(1, 14.0f);
        textViewI.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        textViewI.setGravity(17);
        linearLayoutG.addView(textViewI, h7.z5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        lh.d dVar = new lh.d(context, null, true);
        dVar.g(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        linearLayoutG.addView(dVar, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        e3VarO.customView = linearLayoutG;
        dVar.setOnClickListener(new org.telegram.ui.md(i10, dVar, e3VarO, j10));
        e3VarO.fixNavigationBar();
        e3VarO.show();
    }

    public static org.telegram.ui.ActionBar.z2 m(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
        z2Var.a();
        fc0 fc0Var = new fc0(context, c6Var);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0 fc0Var2 = new fc0(context, c6Var);
        fc0Var2.setItemCount(5);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0 fc0Var3 = new fc0(context, c6Var);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        v3 v3Var = new v3(context, fc0Var, fc0Var2, fc0Var3);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(1) - 149;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(5);
        int i12 = calendar.get(2);
        int i13 = calendar.get(1);
        int i14 = i13 + 1;
        u2 u2Var = new u2(fc0Var3, i14, fc0Var, fc0Var2, i13, i12, i11);
        System.currentTimeMillis();
        w3 w3Var = new w3(context);
        linearLayout.addView(fc0Var, h7.z5.l(0.25f, 0, 270));
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new c2(13));
        s sVar = new s(u2Var, 9);
        fc0Var.setOnScrollListener(sVar);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(11);
        fc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setFormatter(new c2(14));
        fc0Var2.setOnScrollListener(sVar);
        fc0Var3.setMinValue(i10);
        fc0Var3.setMaxValue(i14);
        fc0Var3.setWrapSelectorWheel(false);
        fc0Var3.setFormatter(new h3.y(i14, 4));
        linearLayout.addView(fc0Var3, h7.z5.l(0.25f, 0, 270));
        fc0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            fc0Var.setValue(tL_birthday.day);
            fc0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                fc0Var3.setValue(tL_birthday.year);
            } else {
                fc0Var3.setValue(i14);
            }
        } else {
            fc0Var.setValue(calendar.get(5));
            fc0Var2.setValue(calendar.get(2));
            fc0Var3.setValue(i14);
        }
        u2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            p80 p80Var = new p80(context, null);
            p80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            p80Var.setTextSize(1, 13.0f);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, c6Var));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
            p80Var.setGravity(17);
            frameLayout2.addView(p80Var, h7.z5.e(-2, -2, 17));
            v3Var.addView(frameLayout2, h7.z5.n(-1, -2));
            int i15 = UserConfig.selectedAccount;
            cg.w1 w1Var = new cg.w1(i15, p80Var, 26);
            w1Var.run();
            f10 = 8.0f;
            NotificationCenter.getInstance(i15).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new v2(w1Var, 0));
            ContactsController.getInstance(i15).loadPrivacySettings();
        } else {
            f10 = 8.0f;
        }
        if (z10) {
            lh.d dVar = new lh.d(context, c6Var, false);
            dVar.g(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new gh.v2(fc0Var3, i14, u2Var, 8));
            v3Var.addView(dVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        w3Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        w3Var.setGravity(17);
        w3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        w3Var.setTextSize(1, 14.0f);
        w3Var.setTypeface(AndroidUtilities.bold());
        w3Var.setText(str2);
        int iDp = AndroidUtilities.dp(f10);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        w3Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iV1, iV1));
        h7.b6.a(w3Var);
        v3Var.addView(w3Var, h7.z5.t(-1, 48, 83, 16, z10 ? 0 : 15, 16, z11 ? 0 : 16));
        w3Var.setOnClickListener(new hh.u8(fc0Var, fc0Var2, fc0Var3, i14, z2Var, callback));
        if (z11) {
            lh.d dVar2 = new lh.d(context, c6Var, false);
            dVar2.g(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.setOnClickListener(new q2(2, z2Var, callback));
            v3Var.addView(dVar2, h7.z5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        z2Var.b(v3Var);
        return z2Var;
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null || !str.startsWith("FLOOD_WAIT") || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        int iIntValue = Utilities.parseInt((CharSequence) str).intValue();
        String pluralString = iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(b2Var, true, null);
    }

    public static void n(org.telegram.ui.ActionBar.n2 n2Var, AtomicBoolean atomicBoolean, TLRPC.User user, Runnable runnable) {
        boolean[] zArr;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Cells.y1 y1Var;
        int iDp;
        int iDp2;
        if (n2Var == null) {
            return;
        }
        Context context = n2Var.getContext();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        r4 r4Var = new r4(context, null);
        NotificationCenter.listenEmojiLoading(r4Var);
        r4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        r4Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        r4Var.setTextSize(1, 16.0f);
        r4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        s4 s4Var = new s4(context, y1VarArr);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.C = 6;
        alertDialog$Builder.n(s4Var);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        s4Var.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f23103g1);
        } else {
            if (!user.fake) {
                if (user.verified) {
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23444z9, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(iW0, mode));
                    Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
                    zArr = null;
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
                    h5Var.i(new dq(drawableMutate, drawableMutate2));
                }
                TextView textView = new TextView(context);
                int iW1 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.f23214m5, false);
                int i17 = 1;
                org.telegram.messenger.rl.p(textView, iW1, 1, 14.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, i17));
                SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
                cq cqVar = new cq(R.drawable.attach_arrow_right, 0);
                cqVar.setTopOffset(1);
                cqVar.setSize(AndroidUtilities.dp(10.0f));
                spannableStringValueOf.setSpan(cqVar, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
                textView.setText(spannableStringValueOf);
                z10 = LocaleController.isRTL;
                if (z10) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z10) {
                    i12 = 21;
                } else {
                    i12 = 76;
                }
                float f10 = i12;
                if (z10) {
                    i13 = 76;
                } else {
                    i13 = 21;
                }
                s4Var.addView(h5Var, h7.z5.d(-1, -2.0f, i18, f10, 0.0f, i13, 0.0f));
                z11 = LocaleController.isRTL;
                if (z11) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i19 = i14 | 48;
                if (z11) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                s4Var.addView(textView, h7.z5.d(-1, -2.0f, i19, i15, 24.0f, z11 ? 76 : 21, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                s4Var.addView(r4Var, h7.z5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                atomicBoolean.set(true);
                y1Var = new org.telegram.ui.Cells.y1(context, 1, n2Var.getResourceProvider());
                y1VarArr[0] = y1Var;
                if (!y1Var.D) {
                    org.telegram.ui.Cells.w1 w1Var = y1Var.f25977c;
                    w1Var.setLines(3);
                    w1Var.setMaxLines(3);
                    w1Var.setSingleLine(false);
                }
                y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
                ag.d0 d0Var = y1VarArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                d0Var.setPadding(iDp, 0, iDp2, 0);
                y1VarArr[0].c(true, false);
                s4Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                y1VarArr[0].setOnClickListener(new f0(atomicBoolean, 2));
                if (UserObject.isReplyUser(user)) {
                    y8Var.f34858p = 0.8f;
                    y8Var.g(12);
                    n9Var.h(null, null, y8Var, user);
                } else {
                    y8Var.f34858p = 1.0f;
                    y8Var.m(n2Var.getCurrentAccount(), user);
                    n9Var.e(user, y8Var);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(3, runnable));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n2Var.showDialog(b2Var);
                r4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, b2Var)));
            }
            h5Var.i(org.telegram.ui.ActionBar.g6.f23120h1);
        }
        zArr = null;
        TextView textView2 = new TextView(context);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.f23214m5, false);
        int i110 = 1;
        org.telegram.messenger.rl.p(textView2, iW2, 1, 14.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, i110));
        SpannableString spannableStringValueOf2 = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        cq cqVar2 = new cq(R.drawable.attach_arrow_right, 0);
        cqVar2.setTopOffset(1);
        cqVar2.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf2.setSpan(cqVar2, spannableStringValueOf2.length() - 1, spannableStringValueOf2.length(), 33);
        textView2.setText(spannableStringValueOf2);
        z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i111 = i11 | 48;
        if (z10) {
            i12 = 21;
        } else {
            i12 = 76;
        }
        float f11 = i12;
        if (z10) {
            i13 = 76;
        } else {
            i13 = 21;
        }
        s4Var.addView(h5Var, h7.z5.d(-1, -2.0f, i111, f11, 0.0f, i13, 0.0f));
        z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i112 = i14 | 48;
        if (z11) {
            i15 = 21;
        } else {
            i15 = 76;
        }
        s4Var.addView(textView2, h7.z5.d(-1, -2.0f, i112, i15, 24.0f, z11 ? 76 : 21, 0.0f));
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        s4Var.addView(r4Var, h7.z5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        atomicBoolean.set(true);
        y1Var = new org.telegram.ui.Cells.y1(context, 1, n2Var.getResourceProvider());
        y1VarArr[0] = y1Var;
        if (!y1Var.D) {
            org.telegram.ui.Cells.w1 w1Var2 = y1Var.f25977c;
            w1Var2.setLines(3);
            w1Var2.setMaxLines(3);
            w1Var2.setSingleLine(false);
        }
        y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        y1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
        ag.d0 d0Var2 = y1VarArr[0];
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(16.0f);
        } else {
            iDp = AndroidUtilities.dp(8.0f);
        }
        if (LocaleController.isRTL) {
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp2 = AndroidUtilities.dp(16.0f);
        }
        d0Var2.setPadding(iDp, 0, iDp2, 0);
        y1VarArr[0].c(true, false);
        s4Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        y1VarArr[0].setOnClickListener(new f0(atomicBoolean, 2));
        if (UserObject.isReplyUser(user)) {
            y8Var.f34858p = 0.8f;
            y8Var.g(12);
            n9Var.h(null, null, y8Var, user);
        } else {
            y8Var.f34858p = 1.0f;
            y8Var.m(n2Var.getCurrentAccount(), user);
            n9Var.e(user, y8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(3, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var);
        r4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(1, context, b2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.addView(new hh.h4(context, tL_starGiftUnique, userOrChat), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 16.0f);
        org.telegram.messenger.rl.n(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        linearLayoutG.addView(textView, h7.z5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.n(linearLayoutG);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new y0(2, runnable));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void o(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
        Context context = n2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        m4 m4Var = new m4(context, null);
        NotificationCenter.listenEmojiLoading(m4Var);
        m4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        m4Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        m4Var.setTextSize(1, 16.0f);
        m4Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f22702a.C = 6;
        alertDialog$Builder.n(frameLayout);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        h5Var.setTextSize(20);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(user.first_name, false);
        if (user.scam) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f23103g1);
        } else if (user.fake) {
            h5Var.i(org.telegram.ui.ActionBar.g6.f23120h1);
        } else if (user.verified) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23444z9, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(iW0, mode));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A9, false), mode));
            h5Var.i(new dq(drawableMutate, drawableMutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23214m5, false), 1, 14.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, n2Var, alertDialog$Builder, 0));
        SpannableString spannableStringValueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        cq cqVar = new cq(R.drawable.attach_arrow_right, 0);
        cqVar.setTopOffset(1);
        cqVar.setSize(AndroidUtilities.dp(10.0f));
        spannableStringValueOf.setSpan(cqVar, spannableStringValueOf.length() - 1, spannableStringValueOf.length(), 33);
        textView.setText(spannableStringValueOf);
        boolean z10 = LocaleController.isRTL;
        frameLayout.addView(h5Var, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 0.0f, z10 ? 76 : 21, 0.0f));
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 24.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(m4Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            y8Var.f34858p = 0.8f;
            y8Var.g(12);
            n9Var.h(null, null, y8Var, user);
        } else {
            y8Var.f34858p = 1.0f;
            y8Var.m(n2Var.getCurrentAccount(), user);
            n9Var.e(user, y8Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new y0(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener r0Var = new r0(3, runnable2);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        n2Var.showDialog(b2Var, false, r0Var);
        m4Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new j1(0, context, b2Var)));
    }

    public static void o0(Context context, org.telegram.ui.ActionBar.c6 c6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        if (AndroidUtilities.isContextSafe(context)) {
            final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.OpenUrlTitle);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            textView.setBackground(gradientDrawable);
            final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, c6Var);
            y1Var.setMultiline(true);
            y1Var.getTextView().getLayoutParams().width = -1;
            y1Var.getTextView().setSingleLine(false);
            y1Var.getTextView().setMaxLines(3);
            y1Var.getTextView().setTextSize(1, 16.0f);
            y1Var.e(LocaleController.getString(z10 ? R.string.BrowserAlwaysOpenExternal : R.string.BrowserAlwaysOpenInApp), "", false, false, false);
            y1Var.setOnClickListener(new f0(y1Var, 1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, h7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            linearLayout.addView(y1Var, h7.z5.t(-1, -2, 3, 8, 6, 8, 4));
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.f22702a.f22742a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            final int i11 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                    switch (i11) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                            if (b2Var3 != null) {
                                b2Var3.dismiss();
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                    switch (i12) {
                        case 0:
                            callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                            if (b2Var2 != null) {
                                b2Var2.dismiss();
                            }
                            break;
                        default:
                            callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
                            if (b2Var3 != null) {
                                b2Var3.dismiss();
                            }
                            break;
                    }
                }
            });
            b2VarArr[0] = alertDialog$Builder.o();
        }
    }

    public static org.telegram.ui.ActionBar.z2 p(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(activity, c6Var);
        z2Var.a();
        fc0 fc0Var = new fc0(activity, c6Var);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        fc0 fc0Var2 = new fc0(activity, c6Var);
        fc0Var2.setItemCount(5);
        fc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        fc0 fc0Var3 = new fc0(activity, c6Var);
        fc0Var3.setItemCount(5);
        fc0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        i4 i4Var = new i4(activity, fc0Var, fc0Var2, fc0Var3);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        i4Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        j4 j4Var = new j4(activity);
        linearLayout.addView(fc0Var, h7.z5.l(0.25f, 0, 270));
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(31);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setFormatter(new org.telegram.ui.fr(11));
        l0 l0Var = new l0(fc0Var, fc0Var2, fc0Var3, 0);
        fc0Var.setOnValueChangedListener(l0Var);
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(11);
        fc0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setFormatter(new org.telegram.ui.fr(12));
        fc0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        fc0Var3.setMinValue(i10);
        fc0Var3.setMaxValue(i11);
        fc0Var3.setWrapSelectorWheel(false);
        fc0Var3.setFormatter(new org.telegram.ui.fr(13));
        linearLayout.addView(fc0Var3, h7.z5.l(0.25f, 0, 270));
        fc0Var3.setOnValueChangedListener(l0Var);
        fc0Var.setValue(31);
        fc0Var2.setValue(12);
        fc0Var3.setValue(i11);
        b(fc0Var, fc0Var2, fc0Var3);
        j4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        j4Var.setGravity(17);
        j4Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        j4Var.setTextSize(1, 14.0f);
        j4Var.setTypeface(AndroidUtilities.bold());
        j4Var.setText(LocaleController.getString(R.string.JumpToDate));
        int iDp = AndroidUtilities.dp(8.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        j4Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iV1, iV1));
        i4Var.addView(j4Var, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        j4Var.setOnClickListener(new cg.f(fc0Var, fc0Var2, fc0Var3, calendar, (Object) intCallback, z2Var, 1));
        z2Var.b(i4Var);
        return z2Var;
    }

    public static void p0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, we.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        String strV;
        if (AndroidUtilities.isContextSafe(context)) {
            String scheme = str == null ? null : Uri.parse(str).getScheme();
            if (we.e.f(Uri.parse(str), false, null) || !z12 || "mailto".equalsIgnoreCase(scheme)) {
                we.e.r(context, Uri.parse(str), j10 == 0, z11, z13 && Uri.parse(str).getPath().matches("^/\\w*/[^\\d]*(?:\\?startapp=.*?|)$"), dVar, null, false, true, false);
                return;
            }
            if (z10) {
                try {
                    Uri uri = Uri.parse(str);
                    strV = we.e.v(uri, null, null, we.e.a(uri.getHost()), null);
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                    strV = str;
                }
            } else {
                strV = str;
            }
            m2 m2Var = new m2(context, str, j10, z11, dVar);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            TextView textView = new TextView(context);
            textView.setText(strV);
            textView.setTextSize(1, 14.0f);
            int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            textView.setGravity(17);
            textView.setMaxLines(5);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
            textView.setBackground(gradientDrawable);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(textView, h7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i11 = x71.f34536f;
            if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                x71 x71Var = new x71(context, c6Var);
                x71Var.setWebPage(webPage);
                linearLayout.addView(x71Var, h7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder.n(linearLayout);
            b2Var.f22742a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(m2Var, 8));
            i0.a.w(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void q(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, boolean z10) {
        String string;
        String string2;
        if (n2Var.getParentActivity() == null || user == null || UserObject.isDeleted(user) || UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId() == user.f22527id) {
            return;
        }
        n2Var.getCurrentAccount();
        Activity parentActivity = n2Var.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity);
        if (z10) {
            string = LocaleController.getString(R.string.VideoCallAlertTitle);
            string2 = LocaleController.formatString("VideoCallAlert", R.string.VideoCallAlert, UserObject.getUserName(user));
        } else {
            string = LocaleController.getString(R.string.CallAlertTitle);
            string2 = LocaleController.formatString("CallAlert", R.string.CallAlert, UserObject.getUserName(user));
        }
        i3 i3Var = new i3(parentActivity);
        NotificationCenter.listenEmojiLoading(i3Var);
        i3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        i3Var.setTextSize(1, 16.0f);
        int i10 = 5;
        i3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        i3Var.setText(AndroidUtilities.replaceTags(string2));
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(12.0f));
        y8Var.f34858p = 1.0f;
        y8Var.m(n2Var.getCurrentAccount(), user);
        n9 n9Var = new n9(parentActivity);
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        n9Var.e(user, y8Var);
        frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(string);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(i3Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Call), new b5.d(n2Var, user, z10, i10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void q0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11) {
        r0(n2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void r(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, TLRPC.Chat chat, boolean z10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        boolean[] zArr;
        String string;
        TextView textView;
        int iDp;
        int iDp2;
        long j10;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (user == null && chat == null) {
            return;
        }
        int currentAccount = n2Var.getCurrentAccount();
        Activity parentActivity = n2Var.getParentActivity();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        g3 g3Var = new g3(parentActivity);
        NotificationCenter.listenEmojiLoading(g3Var);
        g3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        g3Var.setTextSize(1, 16.0f);
        g3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        h3 h3Var = new h3(parentActivity, y1VarArr);
        alertDialog$Builder.n(h3Var);
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        h3Var.addView(textView2, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
        h3Var.addView(g3Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 48.0f, 24.0f, 18.0f));
        if (i10 == -1) {
            textView2.setText(LocaleController.formatString("ClearHistory", R.string.ClearHistory, new Object[0]));
            if (user != null) {
                g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithUser", R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            } else {
                if (z10) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = 1;
                        g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChannel", R.string.AreYouSureClearHistoryWithChannel, chat.title)));
                    } else {
                        g3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureClearHistoryWithChat", R.string.AreYouSureClearHistoryWithChat, chat.title)));
                    }
                    zArr = new boolean[i11];
                    zArr[0] = false;
                    if (chat != null && z10 && ChatObject.isPublic(chat)) {
                        zArr[0] = i11;
                    }
                    if (user != null) {
                        j10 = user.f22527id;
                        if (j10 == clientUserId && j10 != 489000 && !ChatObject.isMonoForum(chat)) {
                            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                            y1VarArr[0] = y1Var;
                            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            if (chat != null) {
                                y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            y1Var2.setPadding(iDp, 0, iDp2, 0);
                            h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1VarArr[0].c(false, false);
                            y1VarArr[0].setOnClickListener(new s0(4, zArr));
                        } else if (chat != null && z10 && !ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.isMonoForum(chat)) {
                            org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                            y1VarArr[0] = y1Var3;
                            y1Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            if (chat != null) {
                                y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                            } else {
                                y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            }
                            org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[0];
                            if (LocaleController.isRTL) {
                                iDp = AndroidUtilities.dp(16.0f);
                            } else {
                                iDp = AndroidUtilities.dp(8.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(8.0f);
                            } else {
                                iDp2 = AndroidUtilities.dp(16.0f);
                            }
                            y1Var4.setPadding(iDp, 0, iDp2, 0);
                            h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1VarArr[0].c(false, false);
                            y1VarArr[0].setOnClickListener(new s0(4, zArr));
                        }
                    } else if (chat != null) {
                        org.telegram.ui.Cells.y1 y1Var5 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                        y1VarArr[0] = y1Var5;
                        y1Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        if (chat != null) {
                            y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                        } else {
                            y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        }
                        org.telegram.ui.Cells.y1 y1Var6 = y1VarArr[0];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(8.0f);
                        }
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(8.0f);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        y1Var6.setPadding(iDp, 0, iDp2, 0);
                        h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1VarArr[0].c(false, false);
                        y1VarArr[0].setOnClickListener(new s0(4, zArr));
                    }
                    string = LocaleController.getString(R.string.Delete);
                    if (chat != null && z10 && ChatObject.isPublic(chat) && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.getString(R.string.ClearForAll);
                    }
                    alertDialog$Builder.k(string, new g1(7, booleanCallback, zArr));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    n2Var.showDialog(b2Var);
                    textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    }
                }
                if (chat.megagroup) {
                    g3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                } else {
                    g3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                }
            }
        } else {
            textView2.setText(LocaleController.formatPluralString("DeleteDays", i10, new Object[0]));
            g3Var.setText(LocaleController.getString(R.string.DeleteHistoryByDaysMessage));
        }
        i11 = 1;
        zArr = new boolean[i11];
        zArr[0] = false;
        if (chat != null) {
            zArr[0] = i11;
        }
        if (user != null) {
            j10 = user.f22527id;
            if (j10 == clientUserId) {
                if (chat != null) {
                    org.telegram.ui.Cells.y1 y1Var7 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                    y1VarArr[0] = y1Var7;
                    y1Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    if (chat != null) {
                        y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                    } else {
                        y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    }
                    org.telegram.ui.Cells.y1 y1Var8 = y1VarArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    y1Var8.setPadding(iDp, 0, iDp2, 0);
                    h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1VarArr[0].c(false, false);
                    y1VarArr[0].setOnClickListener(new s0(4, zArr));
                }
            } else if (chat != null) {
                org.telegram.ui.Cells.y1 y1Var9 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                y1VarArr[0] = y1Var9;
                y1Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                if (chat != null) {
                    y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
                } else {
                    y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                }
                org.telegram.ui.Cells.y1 y1Var10 = y1VarArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(8.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                y1Var10.setPadding(iDp, 0, iDp2, 0);
                h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                y1VarArr[0].c(false, false);
                y1VarArr[0].setOnClickListener(new s0(4, zArr));
            }
        } else if (chat != null) {
            org.telegram.ui.Cells.y1 y1Var11 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
            y1VarArr[0] = y1Var11;
            y1Var11.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (chat != null) {
                y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesOptionAlsoChat), "", false, false, false);
            } else {
                y1VarArr[0].e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
            }
            org.telegram.ui.Cells.y1 y1Var12 = y1VarArr[0];
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(16.0f);
            } else {
                iDp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                iDp2 = AndroidUtilities.dp(8.0f);
            } else {
                iDp2 = AndroidUtilities.dp(16.0f);
            }
            y1Var12.setPadding(iDp, 0, iDp2, 0);
            h3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            y1VarArr[0].c(false, false);
            y1VarArr[0].setOnClickListener(new s0(4, zArr));
        }
        string = LocaleController.getString(R.string.Delete);
        if (chat != null) {
            string = LocaleController.getString(R.string.ClearForAll);
        }
        alertDialog$Builder.k(string, new g1(7, booleanCallback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
        n2Var.showDialog(b2Var2);
        textView = (TextView) b2Var2.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static void r0(org.telegram.ui.ActionBar.n2 n2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, we.d dVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        p0(n2Var.getParentActivity(), str, z10, z11, z12, z13, n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).f41995b8 : 0L, dVar, webPage, c6Var);
    }

    public static void s(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        t(n2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, n2Var != null ? n2Var.getResourceProvider() : null);
    }

    public static void s0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.pa.z(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i12));
            h6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
            h6Var.b((CharSequence) arrayList.get(i12), SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue());
            h6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
            linearLayout.addView(h6Var);
            h6Var.setOnClickListener(new gg.f((Object) arrayList2, runnable, (Object) alertDialog$Builder, 19));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.b2 b2VarO = alertDialog$Builder.o();
        if (z10) {
            b2VarO.setCanceledOnTouchOutside(false);
        }
    }

    public static void t(final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10, final boolean z11, TLRPC.Chat chat, final TLRPC.User user, final boolean z12, final boolean z13, boolean z14, final boolean z15, final MessagesStorage.BooleanCallback booleanCallback, final org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        float f11;
        final TLRPC.Chat chat2;
        boolean z16;
        n9 n9Var;
        org.telegram.ui.ActionBar.b2 b2Var;
        boolean z17;
        boolean z18;
        int iDp;
        int iDp2;
        cg.c cVar;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        String string;
        String string2;
        CharSequence string3;
        TextView textView;
        n9 n9Var2;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (chat == null && user == null) {
            return;
        }
        final int currentAccount = n2Var.getCurrentAccount();
        final Activity parentActivity = n2Var.getParentActivity();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        c3 c3Var = new c3(parentActivity);
        NotificationCenter.listenEmojiLoading(c3Var);
        c3Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        c3Var.setTextSize(1, 16.0f);
        c3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z19 = !z15 && ChatObject.isChannel(chat) && ChatObject.isPublic(chat);
        d3 d3Var = new d3(parentActivity, y1VarArr);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
        b2Var2.C = 6;
        alertDialog$Builder.n(d3Var);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(18.0f));
        n9 n9Var3 = new n9(parentActivity);
        n9Var3.setRoundRadius(AndroidUtilities.dp(15.0f));
        d3Var.addView(n9Var3, h7.z5.d(30, 30.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        j6 j6Var = new j6(parentActivity, false, false, false);
        final boolean z20 = z19;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        j6Var.setTextSize(AndroidUtilities.dp(20.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j6Var.setEllipsizeByGradient(true);
        if (z10) {
            if (z20) {
                j6Var.setText(LocaleController.getString(R.string.ClearHistoryCache));
            } else {
                j6Var.setText(LocaleController.getString(R.string.ClearHistory));
            }
        } else if (chat == null) {
            j6Var.setText(LocaleController.getString(R.string.DeleteChatUser));
        } else if (ChatObject.isCommunity(chat)) {
            j6Var.setText(LocaleController.getString(R.string.CommunityDelete));
        } else if (!ChatObject.isChannel(chat)) {
            j6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else if (chat.monoforum) {
            j6Var.setText(LocaleController.getString(R.string.LeaveConversationMenu));
        } else if (chat.megagroup) {
            j6Var.setText(LocaleController.getString(R.string.LeaveMega));
        } else {
            j6Var.setText(LocaleController.getString(R.string.LeaveChannel));
        }
        boolean z21 = LocaleController.isRTL;
        d3Var.addView(j6Var, h7.z5.d(-1, 24.0f, (z21 ? 5 : 3) | 48, z21 ? 22 : 65, 7.66f, z21 ? 65 : 22, 0.0f));
        d3Var.addView(c3Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 49.0f, 24.0f, 1.0f));
        TLRPC.Chat monoForumLinkedChat = ChatObject.isMonoForum(chat) ? n2Var.getMessagesController().getMonoForumLinkedChat(chat.f22380id) : null;
        boolean z22 = !z12 && user != null && (user != null && !user.bot && (user.f22527id > clientUserId ? 1 : (user.f22527id == clientUserId ? 0 : -1)) != 0 && MessagesController.getInstance(currentAccount).canRevokePmInbox) && (user != null ? MessagesController.getInstance(currentAccount).revokeTimePmLimit : MessagesController.getInstance(currentAccount).revokeTimeLimit) == Integer.MAX_VALUE;
        final boolean[] zArr = new boolean[1];
        ArrayList arrayList = user != null ? (ArrayList) MessagesController.getInstance(currentAccount).dialogMessage.f(user.f22527id) : null;
        boolean z23 = (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((MessageObject) arrayList.get(0)).messageOwner == null || (!(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
        if (user != null) {
            f10 = 10.0f;
            if (user.bot) {
                n9Var3 = n9Var3;
                f11 = 8.0f;
                if (user.f22527id != 489000) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1VarArr[0].e(LocaleController.getString(R.string.BlockBot), "", false, false, false);
                    y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f), LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
                    zArr[0] = true;
                    y1Var2.c(true, false);
                    y1VarArr[0].setMultiline(true);
                    d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1VarArr[0].setOnClickListener(new s0(3, zArr));
                    chat2 = chat;
                    n9Var = n9Var3;
                    b2Var = b2Var2;
                    z17 = false;
                } else {
                    y1VarArr = y1VarArr;
                    if (!z11 || (((!z12 || z10) && !z22) || UserObject.isDeleted(user) || z23)) {
                        if (z13 || z10 || chat == null) {
                            chat2 = chat;
                        } else {
                            chat2 = chat;
                            z16 = chat2.creator;
                            if (z16) {
                                n9Var = n9Var3;
                                b2Var = b2Var2;
                            }
                            z17 = z16;
                        }
                        if (z16) {
                            n9Var = n9Var3;
                            b2Var = b2Var2;
                        }
                        z17 = z16;
                    } else {
                        chat2 = chat;
                        z16 = false;
                    }
                    org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                    y1VarArr[0] = y1Var3;
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    if (!z16) {
                        if (z10) {
                            y1VarArr[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        } else {
                            z18 = true;
                            y1VarArr[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                        }
                        y1VarArr[0].setMultiline(z18);
                        org.telegram.ui.Cells.y1 y1Var4 = y1VarArr[0];
                        if (LocaleController.isRTL) {
                            iDp = AndroidUtilities.dp(16.0f);
                        } else {
                            iDp = AndroidUtilities.dp(f11);
                        }
                        int iDp3 = AndroidUtilities.dp(f10);
                        if (LocaleController.isRTL) {
                            iDp2 = AndroidUtilities.dp(f11);
                        } else {
                            iDp2 = AndroidUtilities.dp(16.0f);
                        }
                        n9Var = n9Var3;
                        int i10 = iDp2;
                        b2Var = b2Var2;
                        y1Var4.setPadding(iDp, iDp3, i10, AndroidUtilities.dp(f10));
                        d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                        y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                        if (z14) {
                            org.telegram.ui.Cells.y1 y1Var5 = y1VarArr[0];
                            zArr[0] = true;
                            y1Var5.c(true, false);
                            cVar.run();
                        }
                        z17 = z16;
                    } else if (ChatObject.isChannel(chat2) || chat2.megagroup) {
                        y1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                    } else {
                        y1VarArr[0].e(LocaleController.getString(R.string.DeleteChannelForAll), "", false, false, false);
                    }
                    z18 = true;
                    y1VarArr[0].setMultiline(z18);
                    org.telegram.ui.Cells.y1 y1Var6 = y1VarArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(f11);
                    }
                    int iDp4 = AndroidUtilities.dp(f10);
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(f11);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    n9Var = n9Var3;
                    int i11 = iDp2;
                    b2Var = b2Var2;
                    y1Var6.setPadding(iDp, iDp4, i11, AndroidUtilities.dp(f10));
                    d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                    y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                    if (z14) {
                        org.telegram.ui.Cells.y1 y1Var7 = y1VarArr[0];
                        zArr[0] = true;
                        y1Var7.c(true, false);
                        cVar.run();
                    }
                    z17 = z16;
                }
            }
            if (user != null) {
                n9 n9Var4 = n9Var;
                int currentAccount2 = n2Var.getCurrentAccount();
                if (monoForumLinkedChat != null) {
                    chat3 = monoForumLinkedChat;
                } else {
                    chat3 = chat2;
                }
                y8Var.k(currentAccount2, chat3);
                if (monoForumLinkedChat != null) {
                    chat4 = monoForumLinkedChat;
                } else {
                    chat4 = chat2;
                }
                n9Var4.e(chat4, y8Var);
            } else if (UserObject.isReplyUser(user)) {
                y8Var.f34858p = 0.8f;
                y8Var.g(12);
                n9Var.h(null, null, y8Var, user);
            } else {
                n9Var2 = n9Var;
                if (user.f22527id == clientUserId) {
                    y8Var.f34858p = 0.8f;
                    y8Var.g(1);
                    n9Var2.h(null, null, y8Var, user);
                } else {
                    y8Var.f34858p = 1.0f;
                    y8Var.m(n2Var.getCurrentAccount(), user);
                    n9Var2.e(user, y8Var);
                }
            }
            if (z11) {
                if (UserObject.isUserSelf(user)) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
                } else if (chat2 == null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesChannelAlert)));
                } else {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
                }
            } else if (z10) {
                if (user != null) {
                    if (monoForumLinkedChat != null) {
                        string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                    } else {
                        string2 = chat2.title;
                    }
                    if (ChatObject.isChannel(chat2) || (chat2.megagroup && !ChatObject.isPublic(chat2))) {
                        c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                    } else if (chat2.megagroup) {
                        c3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryGroup));
                    } else {
                        c3Var.setText(LocaleController.getString(R.string.AreYouSureClearHistoryChannel));
                    }
                } else if (z12) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
                } else if (user.f22527id == clientUserId) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
                } else {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
                }
            } else if (user != null) {
                if (z12) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
                } else if (user.f22527id == clientUserId) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
                } else if (user.bot || user.support) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
                } else {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithBotWithCheckmark, UserObject.getUserName(user))));
                }
            } else if (ChatObject.isChannel(chat2)) {
                if (monoForumLinkedChat != null) {
                    string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string = chat2.title;
                }
                if (chat2.megagroup) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
                } else {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
                }
            } else {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
            }
            if (z11) {
                if (z10) {
                    if (z20) {
                        string3 = LocaleController.getString(R.string.ClearHistoryCache);
                    } else {
                        string3 = LocaleController.getString(R.string.ClearForMe);
                    }
                } else if (!z17 && zArr[0]) {
                    string3 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.ChannelDelete : R.string.DeleteMega);
                } else if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
                org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                alertDialog$Builder.k(string3, new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i12) {
                        final boolean[] zArr2;
                        boolean z24 = z20;
                        final boolean z25 = z11;
                        final boolean[] zArr3 = zArr;
                        final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                        boolean z26 = true;
                        if (z24 || z25 || z12) {
                            zArr2 = zArr3;
                        } else {
                            final TLRPC.User user2 = user;
                            boolean zIsUserSelf = UserObject.isUserSelf(user2);
                            final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            final boolean z27 = z10;
                            final TLRPC.Chat chat5 = chat2;
                            final boolean z28 = z13;
                            final boolean z29 = z15;
                            final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                            if (zIsUserSelf) {
                                y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                                return;
                            }
                            if (user2 != null && zArr3[0]) {
                                MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.f22527id, new MessagesStorage.IntCallback() {
                                    @Override
                                    public final void run(int i13) {
                                        boolean[] zArr4 = zArr3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (i13 >= 50) {
                                            y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                        } else if (booleanCallback3 != null) {
                                            booleanCallback3.run(zArr4[0]);
                                        }
                                    }
                                });
                                return;
                            }
                            zArr2 = zArr3;
                            if (ChatObject.isChannel(chat5) && chat5.creator && !zArr2[0]) {
                                final we.d dVarG = alertDialog$Builder.f22702a.g(-1, true, true);
                                dVarG.d();
                                TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                                tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat5);
                                final int i13 = currentAccount;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                                org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                                final Context context = parentActivity;
                                connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        TLRPC.User user3 = (TLRPC.User) obj;
                                        dVarG.c(false);
                                        TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                        MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                        if (user4 == null) {
                                            booleanCallback3.run(z25 || zArr2[0]);
                                            return;
                                        }
                                        Context context2 = context;
                                        TLRPC.Chat chat6 = chat5;
                                        gf.k0 k0Var = new gf.k0(context2, chat6, user4, i13, booleanCallback3, c6Var2, 8);
                                        s1 s1Var = new s1(booleanCallback3, 0);
                                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                        if (n2Var3 == null || n2Var3.getParentActivity() == null || chat6 == null) {
                                            return;
                                        }
                                        Context context3 = n2Var3.getContext();
                                        TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat6);
                                        FrameLayout frameLayout = new FrameLayout(context3);
                                        frameLayout.setClipToPadding(false);
                                        frameLayout.setClipChildren(false);
                                        n9 n9Var5 = new n9(context3);
                                        y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                        y8Var2.r(currentUser);
                                        n9Var5.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        n9Var5.e(currentUser, y8Var2);
                                        frameLayout.addView(n9Var5, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                        ImageView imageView = new ImageView(context3);
                                        imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                        imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7), PorterDuff.Mode.SRC_IN));
                                        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                        e3 e3Var = new e3(context3);
                                        y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                        y8Var3.r(user4);
                                        e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                        e3Var.e(user4, y8Var3);
                                        frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                        n9 n9Var6 = new n9(context3);
                                        y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                        y8Var4.q(chat6);
                                        n9Var6.setRoundRadius(AndroidUtilities.dp(12.0f));
                                        n9Var6.e(chat6, y8Var4);
                                        frameLayout.addView(n9Var6, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                        org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder2.f22702a;
                                        b2Var5.K0 = -1.0f;
                                        b2Var5.R = frameLayout;
                                        b2Var5.N = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                        b2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat6.title));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                        alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder2.k(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                        b2Var5.show();
                                        View viewD = b2Var5.d(-1);
                                        if (viewD instanceof TextView) {
                                            ((TextView) viewD).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                        }
                                    }
                                });
                                return;
                            }
                            booleanCallback2 = booleanCallback2;
                        }
                        if (!z25 && !zArr2[0]) {
                            z26 = false;
                        }
                        booleanCallback2.run(z26);
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                n2Var.showDialog(b2Var3);
                textView = (TextView) b2Var3.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
            }
            string3 = LocaleController.getString(R.string.DeleteAll);
            org.telegram.ui.ActionBar.b2 b2Var4 = b2Var;
            alertDialog$Builder.k(string3, new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i12) {
                    final boolean[] zArr2;
                    boolean z24 = z20;
                    final boolean z25 = z11;
                    final boolean[] zArr3 = zArr;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z26 = true;
                    if (z24 || z25 || z12) {
                        zArr2 = zArr3;
                    } else {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        final boolean z27 = z10;
                        final TLRPC.Chat chat5 = chat2;
                        final boolean z28 = z13;
                        final boolean z29 = z15;
                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (zIsUserSelf) {
                            y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                            return;
                        }
                        if (user2 != null && zArr3[0]) {
                            MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.f22527id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i13) {
                                    boolean[] zArr4 = zArr3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i13 >= 50) {
                                        y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr4[0]);
                                    }
                                }
                            });
                            return;
                        }
                        zArr2 = zArr3;
                        if (ChatObject.isChannel(chat5) && chat5.creator && !zArr2[0]) {
                            final we.d dVarG = alertDialog$Builder.f22702a.g(-1, true, true);
                            dVarG.d();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat5);
                            final int i13 = currentAccount;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                            final Context context = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    dVarG.c(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z25 || zArr2[0]);
                                        return;
                                    }
                                    Context context2 = context;
                                    TLRPC.Chat chat6 = chat5;
                                    gf.k0 k0Var = new gf.k0(context2, chat6, user4, i13, booleanCallback3, c6Var2, 8);
                                    s1 s1Var = new s1(booleanCallback3, 0);
                                    org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                    if (n2Var3 == null || n2Var3.getParentActivity() == null || chat6 == null) {
                                        return;
                                    }
                                    Context context3 = n2Var3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat6);
                                    FrameLayout frameLayout = new FrameLayout(context3);
                                    frameLayout.setClipToPadding(false);
                                    frameLayout.setClipChildren(false);
                                    n9 n9Var5 = new n9(context3);
                                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var2.r(currentUser);
                                    n9Var5.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    n9Var5.e(currentUser, y8Var2);
                                    frameLayout.addView(n9Var5, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context3);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7), PorterDuff.Mode.SRC_IN));
                                    frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    e3 e3Var = new e3(context3);
                                    y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var3.r(user4);
                                    e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    e3Var.e(user4, y8Var3);
                                    frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    n9 n9Var6 = new n9(context3);
                                    y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var4.q(chat6);
                                    n9Var6.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    n9Var6.e(chat6, y8Var4);
                                    frameLayout.addView(n9Var6, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                    org.telegram.ui.ActionBar.b2 b2Var6 = alertDialog$Builder2.f22702a;
                                    b2Var6.K0 = -1.0f;
                                    b2Var6.R = frameLayout;
                                    b2Var6.N = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    b2Var6.P = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat6.title));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder2.k(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                    b2Var6.show();
                                    View viewD = b2Var6.d(-1);
                                    if (viewD instanceof TextView) {
                                        ((TextView) viewD).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                    }
                                }
                            });
                            return;
                        }
                        booleanCallback2 = booleanCallback2;
                    }
                    if (!z25 && !zArr2[0]) {
                        z26 = false;
                    }
                    booleanCallback2.run(z26);
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(b2Var4);
            textView = (TextView) b2Var4.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
        f10 = 10.0f;
        f11 = 8.0f;
        if (z11) {
            if (z13) {
                chat2 = chat;
            } else {
                chat2 = chat;
            }
            if (z16) {
                org.telegram.ui.Cells.y1 y1Var8 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                y1VarArr[0] = y1Var8;
                y1Var8.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                if (!z16) {
                    if (z10) {
                        y1VarArr[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    } else {
                        z18 = true;
                        y1VarArr[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    }
                    y1VarArr[0].setMultiline(z18);
                    org.telegram.ui.Cells.y1 y1Var9 = y1VarArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(f11);
                    }
                    int iDp5 = AndroidUtilities.dp(f10);
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(f11);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    n9Var = n9Var3;
                    int i12 = iDp2;
                    b2Var = b2Var2;
                    y1Var9.setPadding(iDp, iDp5, i12, AndroidUtilities.dp(f10));
                    d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                    y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                    if (z14) {
                        org.telegram.ui.Cells.y1 y1Var10 = y1VarArr[0];
                        zArr[0] = true;
                        y1Var10.c(true, false);
                        cVar.run();
                    }
                } else if (ChatObject.isChannel(chat2)) {
                    y1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                } else {
                    y1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                }
                z18 = true;
                y1VarArr[0].setMultiline(z18);
                org.telegram.ui.Cells.y1 y1Var11 = y1VarArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(f11);
                }
                int iDp6 = AndroidUtilities.dp(f10);
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(f11);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                n9Var = n9Var3;
                int i13 = iDp2;
                b2Var = b2Var2;
                y1Var11.setPadding(iDp, iDp6, i13, AndroidUtilities.dp(f10));
                d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                if (z14) {
                    org.telegram.ui.Cells.y1 y1Var12 = y1VarArr[0];
                    zArr[0] = true;
                    y1Var12.c(true, false);
                    cVar.run();
                }
            } else {
                n9Var = n9Var3;
                b2Var = b2Var2;
            }
        } else {
            if (z13) {
                chat2 = chat;
            } else {
                chat2 = chat;
            }
            if (z16) {
                org.telegram.ui.Cells.y1 y1Var13 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                y1VarArr[0] = y1Var13;
                y1Var13.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                if (!z16) {
                    if (z10) {
                        y1VarArr[0].e(LocaleController.formatString(R.string.ClearHistoryOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    } else {
                        z18 = true;
                        y1VarArr[0].e(LocaleController.formatString(R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                    }
                    y1VarArr[0].setMultiline(z18);
                    org.telegram.ui.Cells.y1 y1Var14 = y1VarArr[0];
                    if (LocaleController.isRTL) {
                        iDp = AndroidUtilities.dp(16.0f);
                    } else {
                        iDp = AndroidUtilities.dp(f11);
                    }
                    int iDp7 = AndroidUtilities.dp(f10);
                    if (LocaleController.isRTL) {
                        iDp2 = AndroidUtilities.dp(f11);
                    } else {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    }
                    n9Var = n9Var3;
                    int i14 = iDp2;
                    b2Var = b2Var2;
                    y1Var14.setPadding(iDp, iDp7, i14, AndroidUtilities.dp(f10));
                    d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                    cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                    y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                    if (z14) {
                        org.telegram.ui.Cells.y1 y1Var15 = y1VarArr[0];
                        zArr[0] = true;
                        y1Var15.c(true, false);
                        cVar.run();
                    }
                } else if (ChatObject.isChannel(chat2)) {
                    y1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                } else {
                    y1VarArr[0].e(LocaleController.getString(R.string.DeleteGroupForAll), "", false, false, false);
                }
                z18 = true;
                y1VarArr[0].setMultiline(z18);
                org.telegram.ui.Cells.y1 y1Var16 = y1VarArr[0];
                if (LocaleController.isRTL) {
                    iDp = AndroidUtilities.dp(16.0f);
                } else {
                    iDp = AndroidUtilities.dp(f11);
                }
                int iDp8 = AndroidUtilities.dp(f10);
                if (LocaleController.isRTL) {
                    iDp2 = AndroidUtilities.dp(f11);
                } else {
                    iDp2 = AndroidUtilities.dp(16.0f);
                }
                n9Var = n9Var3;
                int i15 = iDp2;
                b2Var = b2Var2;
                y1Var16.setPadding(iDp, iDp8, i15, AndroidUtilities.dp(f10));
                d3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                cVar = new cg.c(z16, chat2, alertDialog$Builder, zArr);
                y1VarArr[0].setOnClickListener(new q2(0, zArr, cVar));
                if (z14) {
                    org.telegram.ui.Cells.y1 y1Var17 = y1VarArr[0];
                    zArr[0] = true;
                    y1Var17.c(true, false);
                    cVar.run();
                }
            } else {
                n9Var = n9Var3;
                b2Var = b2Var2;
            }
        }
        z17 = z16;
        if (user != null) {
            n9 n9Var5 = n9Var;
            int currentAccount3 = n2Var.getCurrentAccount();
            if (monoForumLinkedChat != null) {
                chat3 = monoForumLinkedChat;
            } else {
                chat3 = chat2;
            }
            y8Var.k(currentAccount3, chat3);
            if (monoForumLinkedChat != null) {
                chat4 = monoForumLinkedChat;
            } else {
                chat4 = chat2;
            }
            n9Var5.e(chat4, y8Var);
        } else if (UserObject.isReplyUser(user)) {
            y8Var.f34858p = 0.8f;
            y8Var.g(12);
            n9Var.h(null, null, y8Var, user);
        } else {
            n9Var2 = n9Var;
            if (user.f22527id == clientUserId) {
                y8Var.f34858p = 0.8f;
                y8Var.g(1);
                n9Var2.h(null, null, y8Var, user);
            } else {
                y8Var.f34858p = 1.0f;
                y8Var.m(n2Var.getCurrentAccount(), user);
                n9Var2.e(user, y8Var);
            }
        }
        if (z11) {
            if (UserObject.isUserSelf(user)) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesSavedAlert)));
            } else if (chat2 == null) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            } else {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DeleteAllMessagesAlert)));
            }
        } else if (z10) {
            if (user != null) {
                if (monoForumLinkedChat != null) {
                    string2 = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
                } else {
                    string2 = chat2.title;
                }
                if (ChatObject.isChannel(chat2)) {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                } else {
                    c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithChat, string2)));
                }
            } else if (z12) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithSecretUser, UserObject.getUserName(user))));
            } else if (user.f22527id == clientUserId) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureClearHistorySavedMessages)));
            } else {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureClearHistoryWithUser, UserObject.getUserName(user))));
            }
        } else if (user != null) {
            if (z12) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithSecretUser, UserObject.getUserName(user))));
            } else if (user.f22527id == clientUserId) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureDeleteThisChatSavedMessages)));
            } else if (user.bot) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
            } else {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteThisChatWithUser, UserObject.getUserName(user))));
            }
        } else if (ChatObject.isChannel(chat2)) {
            if (monoForumLinkedChat != null) {
                string = LocaleController.formatString(R.string.MonoforumTitle, monoForumLinkedChat.title);
            } else {
                string = chat2.title;
            }
            if (chat2.megagroup) {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.MegaLeaveAlertWithName, string)));
            } else {
                c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.ChannelLeaveAlertWithName, string)));
            }
        } else {
            c3Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureDeleteAndExitName, chat2.title)));
        }
        if (z11) {
            if (z10) {
                if (z20) {
                    string3 = LocaleController.getString(R.string.ClearHistoryCache);
                } else {
                    string3 = LocaleController.getString(R.string.ClearForMe);
                }
            } else if (!z17) {
                if (!ChatObject.isChannel(chat2)) {
                    string3 = LocaleController.getString(R.string.DeleteChatUser);
                } else if (chat2.monoforum) {
                    string3 = LocaleController.getString(R.string.LeaveConversationMenu);
                } else if (chat2.megagroup) {
                    string3 = LocaleController.getString(R.string.LeaveMegaMenu);
                } else {
                    string3 = LocaleController.getString(R.string.LeaveChannelMenu);
                }
            } else if (!ChatObject.isChannel(chat2)) {
                string3 = LocaleController.getString(R.string.DeleteChatUser);
            } else if (chat2.monoforum) {
                string3 = LocaleController.getString(R.string.LeaveConversationMenu);
            } else if (chat2.megagroup) {
                string3 = LocaleController.getString(R.string.LeaveMegaMenu);
            } else {
                string3 = LocaleController.getString(R.string.LeaveChannelMenu);
            }
            org.telegram.ui.ActionBar.b2 b2Var5 = b2Var;
            alertDialog$Builder.k(string3, new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i16) {
                    final boolean[] zArr2;
                    boolean z24 = z20;
                    final boolean z25 = z11;
                    final boolean[] zArr3 = zArr;
                    final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                    boolean z26 = true;
                    if (z24 || z25 || z12) {
                        zArr2 = zArr3;
                    } else {
                        final TLRPC.User user2 = user;
                        boolean zIsUserSelf = UserObject.isUserSelf(user2);
                        final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        final boolean z27 = z10;
                        final TLRPC.Chat chat5 = chat2;
                        final boolean z28 = z13;
                        final boolean z29 = z15;
                        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (zIsUserSelf) {
                            y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                            return;
                        }
                        if (user2 != null && zArr3[0]) {
                            MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.f22527id, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i17) {
                                    boolean[] zArr4 = zArr3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (i17 >= 50) {
                                        y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                    } else if (booleanCallback3 != null) {
                                        booleanCallback3.run(zArr4[0]);
                                    }
                                }
                            });
                            return;
                        }
                        zArr2 = zArr3;
                        if (ChatObject.isChannel(chat5) && chat5.creator && !zArr2[0]) {
                            final we.d dVarG = alertDialog$Builder.f22702a.g(-1, true, true);
                            dVarG.d();
                            TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                            tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat5);
                            final int i17 = currentAccount;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i17);
                            org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                            final Context context = parentActivity;
                            connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    TLRPC.User user3 = (TLRPC.User) obj;
                                    dVarG.c(false);
                                    TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                    MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                    if (user4 == null) {
                                        booleanCallback3.run(z25 || zArr2[0]);
                                        return;
                                    }
                                    Context context2 = context;
                                    TLRPC.Chat chat6 = chat5;
                                    gf.k0 k0Var = new gf.k0(context2, chat6, user4, i17, booleanCallback3, c6Var2, 8);
                                    s1 s1Var = new s1(booleanCallback3, 0);
                                    org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                    if (n2Var3 == null || n2Var3.getParentActivity() == null || chat6 == null) {
                                        return;
                                    }
                                    Context context3 = n2Var3.getContext();
                                    TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                    boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat6);
                                    FrameLayout frameLayout = new FrameLayout(context3);
                                    frameLayout.setClipToPadding(false);
                                    frameLayout.setClipChildren(false);
                                    n9 n9Var6 = new n9(context3);
                                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var2.r(currentUser);
                                    n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    n9Var6.e(currentUser, y8Var2);
                                    frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                    ImageView imageView = new ImageView(context3);
                                    imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                    imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7), PorterDuff.Mode.SRC_IN));
                                    frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                    e3 e3Var = new e3(context3);
                                    y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var3.r(user4);
                                    e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                    e3Var.e(user4, y8Var3);
                                    frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                    n9 n9Var7 = new n9(context3);
                                    y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                    y8Var4.q(chat6);
                                    n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                    n9Var7.e(chat6, y8Var4);
                                    frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                    org.telegram.ui.ActionBar.b2 b2Var7 = alertDialog$Builder2.f22702a;
                                    b2Var7.K0 = -1.0f;
                                    b2Var7.R = frameLayout;
                                    b2Var7.N = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                    b2Var7.P = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat6.title));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                    alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder2.k(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                    b2Var7.show();
                                    View viewD = b2Var7.d(-1);
                                    if (viewD instanceof TextView) {
                                        ((TextView) viewD).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                    }
                                }
                            });
                            return;
                        }
                        booleanCallback2 = booleanCallback2;
                    }
                    if (!z25 && !zArr2[0]) {
                        z26 = false;
                    }
                    booleanCallback2.run(z26);
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(b2Var5);
            textView = (TextView) b2Var5.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
        string3 = LocaleController.getString(R.string.DeleteAll);
        org.telegram.ui.ActionBar.b2 b2Var6 = b2Var;
        alertDialog$Builder.k(string3, new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var7, int i16) {
                final boolean[] zArr2;
                boolean z24 = z20;
                final boolean z25 = z11;
                final boolean[] zArr3 = zArr;
                final MessagesStorage.BooleanCallback booleanCallback2 = booleanCallback;
                boolean z26 = true;
                if (z24 || z25 || z12) {
                    zArr2 = zArr3;
                } else {
                    final TLRPC.User user2 = user;
                    boolean zIsUserSelf = UserObject.isUserSelf(user2);
                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    final boolean z27 = z10;
                    final TLRPC.Chat chat5 = chat2;
                    final boolean z28 = z13;
                    final boolean z29 = z15;
                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    if (zIsUserSelf) {
                        y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr3[0], z29, booleanCallback2, c6Var2);
                        return;
                    }
                    if (user2 != null && zArr3[0]) {
                        MessagesStorage.getInstance(n2Var2.getCurrentAccount()).getMessagesCount(user2.f22527id, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i17) {
                                boolean[] zArr4 = zArr3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (i17 >= 50) {
                                    y4.t(n2Var2, z27, true, chat5, user2, false, z28, zArr4[0], z29, booleanCallback3, c6Var2);
                                } else if (booleanCallback3 != null) {
                                    booleanCallback3.run(zArr4[0]);
                                }
                            }
                        });
                        return;
                    }
                    zArr2 = zArr3;
                    if (ChatObject.isChannel(chat5) && chat5.creator && !zArr2[0]) {
                        final we.d dVarG = alertDialog$Builder.f22702a.g(-1, true, true);
                        dVarG.d();
                        TLRPC.TL_channels_getFutureCreatorAfterLeave tL_channels_getFutureCreatorAfterLeave = new TLRPC.TL_channels_getFutureCreatorAfterLeave();
                        tL_channels_getFutureCreatorAfterLeave.channel = MessagesController.getInputChannel(chat5);
                        final int i17 = currentAccount;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i17);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final Context context = parentActivity;
                        connectionsManager.sendRequestTyped(tL_channels_getFutureCreatorAfterLeave, aVar, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.User user3 = (TLRPC.User) obj;
                                dVarG.c(false);
                                TLRPC.User user4 = user3 instanceof TLRPC.TL_userEmpty ? null : user3;
                                MessagesStorage.BooleanCallback booleanCallback3 = booleanCallback2;
                                if (user4 == null) {
                                    booleanCallback3.run(z25 || zArr2[0]);
                                    return;
                                }
                                Context context2 = context;
                                TLRPC.Chat chat6 = chat5;
                                gf.k0 k0Var = new gf.k0(context2, chat6, user4, i17, booleanCallback3, c6Var2, 8);
                                s1 s1Var = new s1(booleanCallback3, 0);
                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                if (n2Var3 == null || n2Var3.getParentActivity() == null || chat6 == null) {
                                    return;
                                }
                                Context context3 = n2Var3.getContext();
                                TLRPC.User currentUser = UserConfig.getInstance(n2Var3.getCurrentAccount()).getCurrentUser();
                                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat6);
                                FrameLayout frameLayout = new FrameLayout(context3);
                                frameLayout.setClipToPadding(false);
                                frameLayout.setClipChildren(false);
                                n9 n9Var6 = new n9(context3);
                                y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var2.r(currentUser);
                                n9Var6.setRoundRadius(AndroidUtilities.dp(30.0f));
                                n9Var6.e(currentUser, y8Var2);
                                frameLayout.addView(n9Var6, h7.z5.d(60, 60.0f, 17, -48.0f, 15.0f, 0.0f, 12.0f));
                                ImageView imageView = new ImageView(context3);
                                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                                imageView.setColorFilter(new PorterDuffColorFilter(n2Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7), PorterDuff.Mode.SRC_IN));
                                frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 17, 0.0f, 15.0f, 0.0f, 12.0f));
                                e3 e3Var = new e3(context3);
                                y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var3.r(user4);
                                e3Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                                e3Var.e(user4, y8Var3);
                                frameLayout.addView(e3Var, h7.z5.d(60, 60.0f, 17, 48.0f, 15.0f, 0.0f, 12.0f));
                                n9 n9Var7 = new n9(context3);
                                y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                                y8Var4.q(chat6);
                                n9Var7.setRoundRadius(AndroidUtilities.dp(12.0f));
                                n9Var7.e(chat6, y8Var4);
                                frameLayout.addView(n9Var7, h7.z5.d(24, 24.0f, 17, 72.0f, 26.0f, 0.0f, 0.0f));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context3);
                                org.telegram.ui.ActionBar.b2 b2Var8 = alertDialog$Builder2.f22702a;
                                b2Var8.K0 = -1.0f;
                                b2Var8.R = frameLayout;
                                b2Var8.N = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelTitle : R.string.LeaveGroupTitle);
                                b2Var8.P = AndroidUtilities.replaceTags(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannelNewOwnerText : R.string.LeaveGroupNewOwnerText, UserObject.getUserName(user4), chat6.title));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.AppointNewOwner), new s(k0Var, 4));
                                alertDialog$Builder2.i(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder2.k(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.LeaveChannel : R.string.LeaveMegaMenu), new s(s1Var, 5));
                                b2Var8.show();
                                View viewD = b2Var8.d(-1);
                                if (viewD instanceof TextView) {
                                    ((TextView) viewD).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            }
                        });
                        return;
                    }
                    booleanCallback2 = booleanCallback2;
                }
                if (!z25 && !zArr2[0]) {
                    z26 = false;
                }
                booleanCallback2.run(z26);
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var6);
        textView = (TextView) b2Var6.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static void t0(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        if (i10 == 0 || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnableForward);
        if (i10 == 1) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
        } else if (i10 == 2) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
        } else if (i10 == 3) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
        } else if (i10 == 4) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
        } else if (i10 == 5) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
        } else if (i10 == 6) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
        } else if (i10 == 7) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
        } else if (i10 == 8) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
        } else if (i10 == 9) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
        } else if (i10 == 10) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
        } else if (i10 == 11) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
        } else if (i10 == 12) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
        } else if (i10 == 13) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
        } else if (i10 == 14) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
        } else if (i10 == 15) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
        } else if (i10 == 16) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedRound);
        } else if (i10 == 17) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
        } else if (i10 == 18) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
        } else if (i10 == 19) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
        } else if (i10 == 20) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
        } else if (i10 == 21) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
        } else if (i10 == 22) {
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(alertDialog$Builder.f22702a, true, null);
    }

    public static org.telegram.ui.ActionBar.b2 u(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int iC;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        if (j10 != 0) {
            iC = notificationsSettings.contains("color_" + sharedPrefKey) ? org.telegram.messenger.y1.c("color_", sharedPrefKey, notificationsSettings, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings.getInt("GroupLed", -16776961) : notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i10 == 1) {
            iC = notificationsSettings.getInt("MessagesLed", -16776961);
        } else if (i10 == 0) {
            iC = notificationsSettings.getInt("GroupLed", -16776961);
        } else if (i10 == 3) {
            iC = notificationsSettings.getInt("StoriesLed", -16776961);
        } else {
            iC = (i10 == 5 || i10 == 4) ? notificationsSettings.getInt("ReactionsLed", -16776961) : notificationsSettings.getInt("ChannelLed", -16776961);
        }
        LinearLayout linearLayoutF = org.telegram.messenger.y1.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {iC};
        for (int i11 = 0; i11 < 9; i11++) {
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(activity, c6Var);
            h6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            h6Var.setTag(Integer.valueOf(i11));
            int i12 = org.telegram.ui.Cells.r8.f25232e[i11];
            h6Var.a(i12, i12);
            h6Var.b(strArr[i11], iC == org.telegram.ui.Cells.r8.f25233f[i11]);
            linearLayoutF.addView(h6Var);
            h6Var.setOnClickListener(new p0(linearLayoutF, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, c6Var);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.n(linearLayoutF);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int[] iArr2 = iArr;
                if (j12 != 0) {
                    editorEdit.putInt(s3.c.e("color_", sharedPrefKey), iArr2[0]);
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannel(j12, j11);
                } else {
                    int i14 = i10;
                    if (i14 == 1) {
                        editorEdit.putInt("MessagesLed", iArr2[0]);
                    } else if (i14 == 0) {
                        editorEdit.putInt("GroupLed", iArr2[0]);
                    } else if (i14 == 3) {
                        editorEdit.putInt("StoriesLed", iArr2[0]);
                    } else if (i14 == 5 || i14 == 4) {
                        editorEdit.putInt("ReactionLed", iArr2[0]);
                    } else {
                        editorEdit.putInt("ChannelLed", iArr2[0]);
                    }
                    NotificationsController.getInstance(UserConfig.selectedAccount).deleteNotificationChannelGlobal(i14);
                }
                editorEdit.commit();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new i3.e(runnable, i10, j10, 3));
        if (j10 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new g1(6, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f22702a;
    }

    public static org.telegram.ui.ActionBar.b2 u0(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        if (n2Var == null) {
            n2Var = LaunchActivity.U();
        }
        if (str2 == null || n2Var == null || n2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b2 b2Var = O(n2Var.getParentActivity(), str, str2, null, null, c6Var).f22702a;
        n2Var.showDialog(b2Var);
        return b2Var;
    }

    public static void v(org.telegram.ui.ActionBar.n2 n2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new g1(3, str3, n2Var));
        n2Var.showDialog(b2Var);
    }

    public static org.telegram.ui.ActionBar.b2 v0(org.telegram.ui.ActionBar.n2 n2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.b2 b2VarP = P(n2Var.getContext(), n2Var.getResourceProvider(), str, charSequence, str2, runnable);
        n2Var.showDialog(b2VarP);
        if (z10 && (textView = (TextView) b2VarP.d(-1)) != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
        return b2VarP;
    }

    public static AlertDialog$Builder w(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        final int i10 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        intCallback.run(0);
                        break;
                    default:
                        intCallback.run(1);
                        break;
                }
            }
        });
        final int i11 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        intCallback.run(0);
                        break;
                    default:
                        intCallback.run(1);
                        break;
                }
            }
        });
        return alertDialog$Builder;
    }

    public static void w0(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (str == null) {
            return;
        }
        Toast.makeText((n2Var == null || n2Var.getParentActivity() == null) ? ApplicationLoader.applicationContext : n2Var.getParentActivity(), str, 1).show();
    }

    public static AlertDialog$Builder x(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, c3.d dVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final fc0 fc0Var = new fc0(context, null);
        final fc0 fc0Var2 = new fc0(context, null);
        final fc0 fc0Var3 = new fc0(context, null);
        linearLayout.addView(fc0Var2, h7.z5.l(0.3f, 0, -2));
        final int i16 = 0;
        fc0Var2.setOnScrollListener(new cc0() {
            @Override
            public final void j(int i17) {
                switch (i16) {
                    case 0:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i17 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(11);
        linearLayout.addView(fc0Var, h7.z5.l(0.3f, 0, -2));
        fc0Var.setFormatter(new org.telegram.ui.fr(19));
        fc0Var.setOnValueChangedListener(new l0(fc0Var2, fc0Var, fc0Var3, 1));
        final int i17 = 1;
        fc0Var.setOnScrollListener(new cc0() {
            @Override
            public final void j(int i18) {
                switch (i17) {
                    case 0:
                        if (z10 && i18 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i18 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i18 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i18 = calendar.get(1);
        fc0Var3.setMinValue(i10 + i18);
        fc0Var3.setMaxValue(i11 + i18);
        fc0Var3.setValue(i18 + i12);
        linearLayout.addView(fc0Var3, h7.z5.l(0.4f, 0, -2));
        fc0Var3.setOnValueChangedListener(new l0(fc0Var2, fc0Var, fc0Var3, 2));
        final int i19 = 2;
        fc0Var3.setOnScrollListener(new cc0() {
            @Override
            public final void j(int i110) {
                switch (i19) {
                    case 0:
                        if (z10 && i110 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    case 1:
                        if (z10 && i110 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                    default:
                        if (z10 && i110 == 0) {
                            y4.d(fc0Var2, fc0Var, fc0Var3);
                            break;
                        }
                        break;
                }
            }
        });
        y0(fc0Var2, fc0Var, fc0Var3);
        if (z10) {
            d(fc0Var2, fc0Var, fc0Var3);
        }
        if (i13 != -1) {
            fc0Var2.setValue(i13);
            fc0Var.setValue(i14);
            fc0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = str;
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.wj(z10, fc0Var2, fc0Var, fc0Var3, dVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.b2 x0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.o();
    }

    public static void y(Context context, String str, String str2, long j10, x4 x4Var) {
        fc0 fc0Var;
        if (context == null) {
            return;
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ji, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ni, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        int iW4 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
        z2Var.a();
        fc0 fc0Var2 = new fc0(context, null);
        fc0Var2.setTextColor(iW0);
        fc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var2.setItemCount(5);
        s3 s3Var = new s3(context, null);
        s3Var.setItemCount(5);
        s3Var.setTextColor(iW0);
        s3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        u3 u3Var = new u3(context, null);
        u3Var.setItemCount(5);
        u3Var.setTextColor(iW0);
        u3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        r3 r3Var = new r3(context, fc0Var2, s3Var, u3Var, 1);
        r3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        r3Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.y1.s(textView, iW0, 1, 20.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r3Var.addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        cg.q qVar = new cg.q(context, 16);
        linearLayout.addView(fc0Var2, h7.z5.l(0.5f, 0, 270));
        fc0Var2.setMinValue(0);
        fc0Var2.setMaxValue(365);
        fc0Var2.setWrapSelectorWheel(false);
        fc0Var2.setFormatter(new org.telegram.ui.fr(22));
        ag.l0 l0Var = new ag.l0(fc0Var2, s3Var, u3Var, 17);
        fc0Var2.setOnValueChangedListener(l0Var);
        s3Var.setMinValue(0);
        s3Var.setMaxValue(23);
        linearLayout.addView(s3Var, h7.z5.l(0.2f, 0, 270));
        s3Var.setFormatter(new org.telegram.ui.fr(23));
        s3Var.setOnValueChangedListener(l0Var);
        u3Var.setMinValue(0);
        u3Var.setMaxValue(59);
        u3Var.setValue(0);
        u3Var.setFormatter(new org.telegram.ui.fr(24));
        linearLayout.addView(u3Var, h7.z5.l(0.3f, 0, 270));
        u3Var.setOnValueChangedListener(l0Var);
        if (j10 <= 0 || j10 == 2147483646) {
            fc0Var = fc0Var2;
        } else {
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                u3Var.setValue(calendar.get(12));
                s3Var.setValue(calendar.get(11));
                fc0Var = fc0Var2;
                fc0Var.setValue(timeInMillis);
            } else {
                fc0Var = fc0Var2;
            }
        }
        fc0 fc0Var3 = fc0Var;
        g(null, null, 0L, 0L, 0, fc0Var3, s3Var, u3Var);
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(iW2);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW3, iW4, iW4));
        qVar.setText(str2);
        r3Var.addView(qVar, h7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new cg.f(fc0Var3, (fc0) s3Var, (fc0) u3Var, calendar, (Object) x4Var, z2Var, 3));
        z2Var.b(r3Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        e3Var.setBackgroundColor(iW1);
        e3Var.fixNavigationBar(iW1);
    }

    public static void y0(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, fc0Var2.getValue());
        calendar.set(1, fc0Var3.getValue());
        fc0Var.setMinValue(1);
        fc0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void z(final org.telegram.ui.ActionBar.n2 n2Var, final TLRPC.User user, final TLRPC.Chat chat, final TLRPC.EncryptedChat encryptedChat, final TLRPC.ChatFull chatFull, final long j10, final MessageObject messageObject, final SparseArray[] sparseArrayArr, final MessageObject.GroupedMessages groupedMessages, final int i10, final int i11, TLRPC.ChannelParticipant[] channelParticipantArr, final Runnable runnable, Runnable runnable2, final org.telegram.ui.ActionBar.c6 c6Var) {
        Activity parentActivity;
        boolean z10;
        long jMakeEncryptedDialogId;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        org.telegram.ui.ActionBar.b2 b2Var;
        int i14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Cells.y1 y1Var;
        int i17;
        TLRPC.MessageAction messageAction;
        org.telegram.ui.ActionBar.a2 a2Var;
        final int i18;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i19;
        boolean z18;
        final boolean z19;
        int i20;
        org.telegram.ui.ActionBar.b2 b2Var3;
        boolean z20;
        int i21;
        boolean z21;
        String str;
        int i22;
        MessageObject messageObject2;
        boolean z22;
        long j11;
        AlertDialog$Builder alertDialog$Builder;
        int i23;
        AlertDialog$Builder alertDialog$Builder2;
        TextView textView;
        TextView textView2;
        long j12;
        int i24;
        int i25;
        boolean z23;
        TLRPC.MessageAction messageAction2;
        final int i26;
        int i27;
        TLRPC.Message message;
        int i28;
        MessageObject messageObject3 = messageObject;
        boolean z24 = i11 == 1;
        boolean z25 = i11 == 3;
        if (n2Var != null) {
            if ((user == null && chat == null && encryptedChat == null) || (parentActivity = n2Var.getParentActivity()) == null) {
                return;
            }
            final int currentAccount = n2Var.getCurrentAccount();
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(parentActivity, 0, c6Var);
            float f10 = runnable2 != null ? 0.5f : 0.6f;
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder3.f22702a;
            b2Var4.M0 = f10;
            int size = groupedMessages != null ? groupedMessages.messages.size() : messageObject3 != null ? 1 : sparseArrayArr[1].size() + sparseArrayArr[0].size();
            if (encryptedChat != null) {
                z10 = z25;
                jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
            } else {
                z10 = z25;
                jMakeEncryptedDialogId = user != null ? user.f22527id : -chat.f22380id;
            }
            if (z24) {
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (i28 = message.schedule_repeat_period) > 0) {
                    i26 = i28;
                    i27 = message.date;
                } else if (groupedMessages == null || groupedMessages.messages.isEmpty() || groupedMessages.messages.get(0) == null || groupedMessages.messages.get(0).messageOwner == null || groupedMessages.messages.get(0).messageOwner.schedule_repeat_period <= 0) {
                    i26 = 0;
                    i27 = 0;
                } else {
                    i27 = groupedMessages.messages.get(0).messageOwner.date;
                    i26 = groupedMessages.messages.get(0).messageOwner.schedule_repeat_period;
                }
                if (i27 > 0 && i26 > 0) {
                    String string = LocaleController.formatString(R.string.MessageScheduledRepeatDeletePostponeSeconds, Integer.valueOf(i26));
                    if (i26 == 31536000) {
                        string = LocaleController.getString(R.string.MessageScheduledRepeatDeletePostponeYear);
                    } else if (i26 >= 2592000) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeMonths", i26 / 2592000, new Object[0]);
                    } else if (i26 >= 604800) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeWeeks", i26 / 604800, new Object[0]);
                    } else if (i26 >= 86400) {
                        string = LocaleController.formatPluralString("MessageScheduledRepeatDeletePostponeDays", i26 / 86400, new Object[0]);
                    }
                    String str2 = string;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(parentActivity, 0, c6Var);
                    String string2 = LocaleController.getString(R.string.MessageScheduledRepeatDeleteTitle);
                    org.telegram.ui.ActionBar.b2 b2Var5 = alertDialog$Builder4.f22702a;
                    b2Var5.N = string2;
                    b2Var5.P = LocaleController.getString(R.string.MessageScheduledRepeatDeleteText);
                    final int i29 = i27;
                    alertDialog$Builder4.h(str2, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i30) {
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            int i31 = currentAccount;
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            int i32 = i29;
                            int i33 = i26;
                            if (groupedMessages2 != null && !groupedMessages2.messages.isEmpty()) {
                                SendMessagesHelper.getInstance(i31).editMessage(groupedMessages2.messages.get(0), null, false, n2Var2, null, i32 + i33, i33);
                            } else {
                                SendMessagesHelper.getInstance(i31).editMessage(messageObject, null, false, n2Var2, null, i32 + i33, i33);
                            }
                        }
                    });
                    final long j13 = jMakeEncryptedDialogId;
                    final boolean z26 = z10;
                    alertDialog$Builder4.i(LocaleController.getString(R.string.MessageScheduledRepeatDeleteAll), new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i30) {
                            SparseArray[] sparseArrayArr2;
                            ArrayList<Long> arrayList;
                            int i31;
                            long j14;
                            ArrayList<Long> arrayList2;
                            long j15;
                            TLRPC.Peer peer;
                            ArrayList<Integer> arrayList3;
                            boolean z27 = z26;
                            int i32 = currentAccount;
                            long clientUserId = z27 ? UserConfig.getInstance(i32).getClientUserId() : j13;
                            MessageObject messageObject4 = messageObject;
                            TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                            long j16 = j10;
                            int i33 = i10;
                            int i34 = i11;
                            ArrayList<Long> arrayList4 = null;
                            if (messageObject4 != null) {
                                ArrayList<Integer> arrayList5 = new ArrayList<>();
                                MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                if (groupedMessages2 != null) {
                                    int i35 = 0;
                                    while (i35 < groupedMessages2.messages.size()) {
                                        MessageObject messageObject5 = groupedMessages2.messages.get(i35);
                                        arrayList5.add(Integer.valueOf(messageObject5.getId()));
                                        if (encryptedChat2 != null) {
                                            arrayList3 = arrayList5;
                                            if (messageObject5.messageOwner.random_id != 0 && messageObject5.type != 10) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList<>();
                                                }
                                                ArrayList<Long> arrayList6 = arrayList4;
                                                arrayList6.add(Long.valueOf(messageObject5.messageOwner.random_id));
                                                arrayList4 = arrayList6;
                                            }
                                        } else {
                                            arrayList3 = arrayList5;
                                        }
                                        i35++;
                                        arrayList5 = arrayList3;
                                        i32 = i32;
                                        clientUserId = clientUserId;
                                    }
                                    i31 = i32;
                                    j14 = clientUserId;
                                } else {
                                    i31 = i32;
                                    j14 = clientUserId;
                                    arrayList5.add(Integer.valueOf(messageObject4.getId()));
                                    if (encryptedChat2 != null && messageObject4.messageOwner.random_id != 0 && messageObject4.type != 10) {
                                        ArrayList<Long> arrayList7 = new ArrayList<>();
                                        arrayList7.add(Long.valueOf(messageObject4.messageOwner.random_id));
                                        arrayList2 = arrayList7;
                                    }
                                    if (j16 == 0 && (peer = messageObject4.messageOwner.peer_id) != null && peer.chat_id == (-j16)) {
                                        j15 = j16;
                                    } else {
                                        j15 = j14;
                                    }
                                    MessagesController.getInstance(i31).deleteMessages(arrayList5, arrayList2, encryptedChat2, j15, i33, true, i34);
                                }
                                arrayList2 = arrayList4;
                                if (j16 == 0) {
                                    j15 = j14;
                                } else {
                                    j15 = j14;
                                }
                                MessagesController.getInstance(i31).deleteMessages(arrayList5, arrayList2, encryptedChat2, j15, i33, true, i34);
                            } else {
                                long j17 = clientUserId;
                                int i36 = 1;
                                while (i36 >= 0) {
                                    ArrayList<Integer> arrayList8 = new ArrayList<>();
                                    int i37 = 0;
                                    while (true) {
                                        sparseArrayArr2 = sparseArrayArr;
                                        if (i37 >= sparseArrayArr2[i36].size()) {
                                            break;
                                        }
                                        arrayList8.add(Integer.valueOf(sparseArrayArr2[i36].keyAt(i37)));
                                        i37++;
                                    }
                                    if (encryptedChat2 != null) {
                                        ArrayList<Long> arrayList9 = new ArrayList<>();
                                        for (int i38 = 0; i38 < sparseArrayArr2[i36].size(); i38++) {
                                            MessageObject messageObject6 = (MessageObject) sparseArrayArr2[i36].valueAt(i38);
                                            long j18 = messageObject6.messageOwner.random_id;
                                            if (j18 != 0 && messageObject6.type != 10) {
                                                arrayList9.add(Long.valueOf(j18));
                                            }
                                        }
                                        arrayList = arrayList9;
                                    } else {
                                        arrayList = null;
                                    }
                                    MessagesController.getInstance(i32).deleteMessages(arrayList8, arrayList, encryptedChat2, (i36 != 1 || j16 == 0) ? j17 : j16, i33, true, i34);
                                    sparseArrayArr2[i36].clear();
                                    i36--;
                                }
                            }
                            Runnable runnable3 = runnable;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    });
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder4.d(-2);
                    alertDialog$Builder4.d(-3);
                    b2Var5.J = new r0(2, runnable2);
                    alertDialog$Builder4.o();
                    return;
                }
                messageObject3 = messageObject;
            }
            Runnable runnable3 = runnable2;
            final int i30 = currentAccount;
            int currentTime = ConnectionsManager.getInstance(i30).getCurrentTime();
            MessagesController.getInstance(i30).config.starsSuggestedPostAgeMin.get(TimeUnit.SECONDS);
            if (messageObject3 != null) {
                z12 = !messageObject3.isDice() || Math.abs(currentTime - messageObject3.messageOwner.date) > 86400;
                if (messageObject3.isPaidSuggestedPostProtected()) {
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    z13 = message2.paid_suggested_post_stars;
                    z11 = message2.paid_suggested_post_ton;
                } else {
                    z13 = false;
                    z11 = false;
                }
            } else {
                int i31 = 0;
                z11 = false;
                boolean z27 = false;
                boolean z28 = false;
                while (i31 < 2) {
                    int i32 = 0;
                    while (true) {
                        i12 = i31;
                        if (i32 < sparseArrayArr[i31].size()) {
                            MessageObject messageObject4 = (MessageObject) sparseArrayArr[i12].valueAt(i32);
                            if (messageObject4.isDice()) {
                                i13 = i32;
                                if (Math.abs(currentTime - messageObject4.messageOwner.date) > 86400) {
                                }
                                if (messageObject4.isPaidSuggestedPostProtected()) {
                                    TLRPC.Message message3 = messageObject4.messageOwner;
                                    z28 |= message3.paid_suggested_post_stars;
                                    z11 |= message3.paid_suggested_post_ton;
                                }
                                i32 = i13 + 1;
                                i31 = i12;
                            } else {
                                i13 = i32;
                            }
                            z27 = true;
                            if (messageObject4.isPaidSuggestedPostProtected()) {
                                TLRPC.Message message4 = messageObject4.messageOwner;
                                z28 |= message4.paid_suggested_post_stars;
                                z11 |= message4.paid_suggested_post_ton;
                            }
                            i32 = i13 + 1;
                            i31 = i12;
                        }
                    }
                    i31 = i12 + 1;
                }
                z12 = z27;
                z13 = z28;
            }
            boolean z29 = z13;
            if (groupedMessages != null) {
                int i33 = 0;
                while (i33 < groupedMessages.messages.size()) {
                    MessageObject messageObject5 = groupedMessages.messages.get(i33);
                    if (messageObject5.isPaidSuggestedPostProtected()) {
                        TLRPC.Message message5 = messageObject5.messageOwner;
                        boolean z30 = z29 | message5.paid_suggested_post_stars;
                        z11 = message5.paid_suggested_post_ton | z11;
                        z29 = z30;
                    }
                    i33++;
                    z12 = z12;
                }
            }
            boolean z31 = z12;
            final boolean[] zArr = new boolean[1];
            boolean z32 = user != null && MessagesController.getInstance(i30).canRevokePmInbox;
            int i34 = user != null ? MessagesController.getInstance(i30).revokeTimePmLimit : MessagesController.getInstance(i30).revokeTimeLimit;
            if (encryptedChat == null && user != null && z32) {
                z14 = z32;
                boolean z33 = i34 == Integer.MAX_VALUE;
                if (chat != null || !chat.megagroup || z24 || z10) {
                    b2Var = b2Var4;
                    i14 = i30;
                    if (!z24 || z10 || ChatObject.isChannel(chat) || encryptedChat != null) {
                        i15 = i14;
                        i16 = 0;
                        z15 = false;
                    } else {
                        if ((user == null || user.f22527id == UserConfig.getInstance(i14).getClientUserId() || (user.bot && !user.support)) && chat == null) {
                            i15 = i14;
                            i16 = 0;
                            z17 = false;
                        } else if (messageObject3 != null) {
                            i16 = (messageObject3.isSendError() || !((messageAction = messageObject3.messageOwner.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty) || (messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) || (messageAction instanceof TLRPC.TL_messageActionSetChatTheme)) || (!(messageObject3.isOut() || z14 || ChatObject.hasAdminRights(chat)) || currentTime - messageObject3.messageOwner.date > i34)) ? 0 : 1;
                            z17 = !messageObject3.isOut();
                            i15 = i14;
                        } else {
                            int i35 = 1;
                            z17 = false;
                            int i36 = 0;
                            while (i35 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    i17 = i14;
                                    if (i37 < sparseArrayArr[i35].size()) {
                                        MessageObject messageObject6 = (MessageObject) sparseArrayArr[i35].valueAt(i37);
                                        int i38 = i37;
                                        TLRPC.MessageAction messageAction3 = messageObject6.messageOwner.action;
                                        if ((messageAction3 == null || (messageAction3 instanceof TLRPC.TL_messageActionEmpty) || (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) || (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached)) && ((messageObject6.isOut() || z14 || (chat != null && ChatObject.canBlockUsers(chat))) && currentTime - messageObject6.messageOwner.date <= i34)) {
                                            i36++;
                                            if (!z17 && !messageObject6.isOut()) {
                                                z17 = true;
                                            }
                                        }
                                        i37 = i38 + 1;
                                        i14 = i17;
                                    }
                                }
                                i35--;
                                i14 = i17;
                            }
                            i15 = i14;
                            i16 = i36;
                        }
                        if (i16 <= 0 || !z31 || (user != null && UserObject.isDeleted(user))) {
                            z15 = z17;
                        } else {
                            FrameLayout frameLayout = new FrameLayout(parentActivity);
                            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                            y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                            if (z33) {
                                y1Var = y1Var2;
                                y1Var.e(LocaleController.formatString("DeleteMessagesOptionAlso", R.string.DeleteMessagesOptionAlso, UserObject.getFirstName(user)), "", false, false, false);
                            } else {
                                y1Var = y1Var2;
                                if (chat == null || !(z17 || i16 == size)) {
                                    y1Var.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                                } else {
                                    y1Var.e(LocaleController.getString(R.string.DeleteForAll), "", false, false, false);
                                }
                            }
                            org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                            y1Var3.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                            frameLayout.addView(y1Var3, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            y1Var3.setOnClickListener(new s0(1, zArr));
                            alertDialog$Builder3.n(frameLayout);
                            b2Var.C = 9;
                            b2Var = b2Var;
                            z15 = z17;
                            z16 = true;
                        }
                    }
                    z16 = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (messageObject3 != null) {
                        TLRPC.MessageAction messageAction4 = messageObject3.messageOwner.action;
                        if (messageAction4 == null || (messageAction4 instanceof TLRPC.TL_messageActionEmpty) || (messageAction4 instanceof TLRPC.TL_messageActionChatDeleteUser) || (messageAction4 instanceof TLRPC.TL_messageActionChatJoinedByLink) || (messageAction4 instanceof TLRPC.TL_messageActionChatAddUser)) {
                            if (groupedMessages != null) {
                                arrayList.addAll(groupedMessages.messages);
                            } else {
                                arrayList.add(messageObject3);
                            }
                        }
                        i24 = (!messageObject3.isSendError() && messageObject3.getDialogId() == j10 && ((messageAction2 = messageObject3.messageOwner.action) == null || (messageAction2 instanceof TLRPC.TL_messageActionEmpty)) && messageObject3.isOut() && currentTime - messageObject3.messageOwner.date <= i34) ? 1 : 0;
                    } else {
                        int i39 = 1;
                        int i40 = 0;
                        while (i39 >= 0) {
                            int i41 = i40;
                            int i42 = 0;
                            while (i42 < sparseArrayArr[i39].size()) {
                                MessageObject messageObject7 = (MessageObject) sparseArrayArr[i39].valueAt(i42);
                                int i43 = i42;
                                if (i39 == 1 && messageObject7.isOut()) {
                                    TLRPC.Message message6 = messageObject7.messageOwner;
                                    i25 = i39;
                                    if (message6.action == null && currentTime - message6.date <= i34) {
                                        i41++;
                                    }
                                } else {
                                    i25 = i39;
                                }
                                arrayList.add(messageObject7);
                                i42 = i43 + 1;
                                i39 = i25;
                            }
                            i39--;
                            i40 = i41;
                        }
                        i24 = i40;
                    }
                    int i44 = i24;
                    ArrayList arrayList2 = (ArrayList) Collection.EL.stream(arrayList).filter(new gh.g1(2)).mapToLong(new w0(0)).distinct().mapToObj(new LongFunction() {
                        @Override
                        public final Object apply(long j14) {
                            int i45 = i30;
                            return j14 > 0 ? MessagesController.getInstance(i45).getUser(Long.valueOf(j14)) : MessagesController.getInstance(i45).getChat(Long.valueOf(-j14));
                        }
                    }).filter(new gh.g1(3)).filter(new org.telegram.ui.q8(UserConfig.getInstance(i30).getClientUserId(), 2)).collect(Collectors.toCollection(new org.telegram.ui.tf()));
                    if (!arrayList2.isEmpty()) {
                        if (channelParticipantArr != null) {
                            ur urVar = new ur(n2Var, chat, arrayList, arrayList2, channelParticipantArr, j10, i10, i11, false, runnable);
                            if (runnable3 != null) {
                                urVar.setOnHideListener(new r0(0, runnable3));
                            }
                            urVar.show();
                            return;
                        }
                        final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(parentActivity, 3, null)};
                        final int size2 = arrayList2.size();
                        final TLRPC.ChannelParticipant[] channelParticipantArr2 = new TLRPC.ChannelParticipant[size2];
                        int[] iArr = new int[size2];
                        int[] iArr2 = new int[1];
                        final int i45 = 0;
                        while (i45 < size2) {
                            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                            tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                            tL_channels_getParticipant.participant = MessagesController.getInputPeer((TLObject) arrayList2.get(i45));
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i30);
                            ArrayList arrayList3 = arrayList2;
                            final int[] iArr3 = iArr2;
                            final int[] iArr4 = iArr;
                            final Runnable runnable4 = runnable3;
                            RequestDelegate requestDelegate = new RequestDelegate() {
                                @Override
                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                    final int[] iArr5 = iArr3;
                                    final int[] iArr6 = iArr4;
                                    final int i46 = i45;
                                    final TLRPC.ChannelParticipant[] channelParticipantArr3 = channelParticipantArr2;
                                    final int i47 = size2;
                                    final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                                    final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                    final TLRPC.User user2 = user;
                                    final TLRPC.Chat chat2 = chat;
                                    final TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                                    final TLRPC.ChatFull chatFull2 = chatFull;
                                    final long j14 = j10;
                                    final MessageObject messageObject8 = messageObject;
                                    final SparseArray[] sparseArrayArr2 = sparseArrayArr;
                                    final MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                                    final int i48 = i10;
                                    final int i49 = i11;
                                    final Runnable runnable5 = runnable;
                                    final Runnable runnable6 = runnable4;
                                    final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
                                            int[] iArr7 = iArr5;
                                            iArr7[0] = iArr7[0] + 1;
                                            int[] iArr8 = iArr6;
                                            int i50 = i46;
                                            iArr8[i50] = 0;
                                            TLObject tLObject2 = tLObject;
                                            TLRPC.ChannelParticipant[] channelParticipantArr4 = channelParticipantArr3;
                                            if (tLObject2 != null) {
                                                channelParticipantArr4[i50] = ((TLRPC.TL_channels_channelParticipant) tLObject2).participant;
                                            }
                                            if (iArr7[0] == i47) {
                                                try {
                                                    b2VarArr3[0].dismiss();
                                                } catch (Throwable unused) {
                                                }
                                                b2VarArr3[0] = null;
                                                y4.z(n2Var2, user2, chat2, encryptedChat2, chatFull2, j14, messageObject8, sparseArrayArr2, groupedMessages2, i48, i49, channelParticipantArr4, runnable5, runnable6, c6Var2);
                                            }
                                        }
                                    });
                                }
                            };
                            int i46 = i45;
                            iArr4[i46] = connectionsManager.sendRequest(tL_channels_getParticipant, requestDelegate);
                            runnable3 = runnable2;
                            size2 = size2;
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i45 = i46 + 1;
                            i30 = i30;
                            arrayList2 = arrayList3;
                        }
                        AndroidUtilities.runOnUIThread(new gh.e1(b2VarArr, iArr, i30, runnable2, n2Var, 16), 1000L);
                        return;
                    }
                    if (i44 <= 0 || !z31) {
                        z23 = false;
                    } else {
                        FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                        org.telegram.ui.Cells.y1 y1Var4 = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                        y1Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        y1Var4.e(LocaleController.getString(R.string.DeleteMessagesOption), "", false, false, false);
                        int i47 = 0;
                        y1Var4.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        frameLayout2.addView(y1Var4, h7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1Var4.setOnClickListener(new s0(i47, zArr));
                        alertDialog$Builder3.n(frameLayout2);
                        b2Var4.C = 9;
                        z23 = true;
                    }
                    b2Var = b2Var4;
                    z16 = z23;
                    i15 = i30;
                    i16 = i44;
                    z15 = false;
                }
                i18 = i15;
                b2Var2 = b2Var;
                int i48 = i16;
                final long j14 = jMakeEncryptedDialogId;
                i19 = size;
                z18 = z11;
                z19 = z10;
                a2Var = new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i49) {
                        SparseArray[] sparseArrayArr2;
                        ArrayList<Long> arrayList4;
                        int i50;
                        long j15;
                        long j16;
                        TLRPC.Peer peer;
                        int i51;
                        long j17;
                        boolean z34 = z19;
                        int i52 = i18;
                        long clientUserId = z34 ? UserConfig.getInstance(i52).getClientUserId() : j14;
                        MessageObject messageObject8 = messageObject;
                        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                        long j18 = j10;
                        int i53 = i10;
                        boolean[] zArr2 = zArr;
                        int i54 = i11;
                        ArrayList<Long> arrayList5 = null;
                        if (messageObject8 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList<Integer> arrayList7 = new ArrayList<>();
                            MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                            if (groupedMessages2 != null) {
                                int i55 = 0;
                                while (i55 < groupedMessages2.messages.size()) {
                                    MessageObject messageObject9 = groupedMessages2.messages.get(i55);
                                    if (messageObject9.isEphemeral()) {
                                        arrayList6.add(messageObject9);
                                        i51 = i52;
                                    } else {
                                        i51 = i52;
                                        arrayList7.add(Integer.valueOf(messageObject9.getId()));
                                        if (encryptedChat2 != null) {
                                            j17 = clientUserId;
                                            if (messageObject9.messageOwner.random_id != 0 && messageObject9.type != 10) {
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList<>();
                                                }
                                                ArrayList<Long> arrayList8 = arrayList5;
                                                arrayList8.add(Long.valueOf(messageObject9.messageOwner.random_id));
                                                arrayList5 = arrayList8;
                                            }
                                        }
                                        i55++;
                                        i52 = i51;
                                        clientUserId = j17;
                                    }
                                    j17 = clientUserId;
                                    i55++;
                                    i52 = i51;
                                    clientUserId = j17;
                                }
                                i50 = i52;
                                j15 = clientUserId;
                            } else {
                                i50 = i52;
                                j15 = clientUserId;
                                if (messageObject8.isEphemeral()) {
                                    arrayList6.add(messageObject8);
                                } else {
                                    arrayList7.add(Integer.valueOf(messageObject8.getId()));
                                    if (encryptedChat2 != null && messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                        ArrayList<Long> arrayList9 = new ArrayList<>();
                                        arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                        arrayList5 = arrayList9;
                                    }
                                }
                            }
                            long j19 = (j18 == 0 || (peer = messageObject8.messageOwner.peer_id) == null || peer.chat_id != (-j18)) ? j15 : j18;
                            if (arrayList7.isEmpty()) {
                                j16 = j19;
                            } else {
                                j16 = j19;
                                MessagesController.getInstance(i50).deleteMessages(arrayList7, arrayList5, encryptedChat2, j16, i53, zArr2[0], i54);
                            }
                            int size3 = arrayList6.size();
                            int i56 = 0;
                            while (i56 < size3) {
                                Object obj = arrayList6.get(i56);
                                i56++;
                                MessagesController.getInstance(i50).deleteEphemeralMessage(j16, i53, (MessageObject) obj);
                            }
                        } else {
                            long j20 = clientUserId;
                            int i57 = 1;
                            while (i57 >= 0) {
                                ArrayList<Integer> arrayList10 = new ArrayList<>();
                                int i58 = 0;
                                while (true) {
                                    sparseArrayArr2 = sparseArrayArr;
                                    if (i58 >= sparseArrayArr2[i57].size()) {
                                        break;
                                    }
                                    arrayList10.add(Integer.valueOf(sparseArrayArr2[i57].keyAt(i58)));
                                    i58++;
                                }
                                if (encryptedChat2 != null) {
                                    ArrayList<Long> arrayList11 = new ArrayList<>();
                                    int i59 = 0;
                                    while (i59 < sparseArrayArr2[i57].size()) {
                                        MessageObject messageObject10 = (MessageObject) sparseArrayArr2[i57].valueAt(i59);
                                        int i60 = i57;
                                        long j21 = messageObject10.messageOwner.random_id;
                                        if (j21 != 0 && messageObject10.type != 10) {
                                            arrayList11.add(Long.valueOf(j21));
                                        }
                                        i59++;
                                        i57 = i60;
                                    }
                                    arrayList4 = arrayList11;
                                } else {
                                    arrayList4 = null;
                                }
                                int i61 = i57;
                                MessagesController.getInstance(i52).deleteMessages(arrayList10, arrayList4, encryptedChat2, (i61 != 1 || j18 == 0) ? j20 : j18, i53, zArr2[0], i54);
                                sparseArrayArr2[i61].clear();
                                i57 = i61 - 1;
                            }
                        }
                        Runnable runnable5 = runnable;
                        if (runnable5 != null) {
                            runnable5.run();
                        }
                    }
                };
                if (z19) {
                    i20 = i19;
                    if (i20 == 1) {
                        b2Var3 = b2Var2;
                        b2Var3.N = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                    } else {
                        b2Var3 = b2Var2;
                        b2Var3.N = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i20, new Object[0]));
                    }
                } else {
                    i20 = i19;
                    b2Var3 = b2Var2;
                    if (i20 == 1) {
                        b2Var3.N = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                    } else {
                        b2Var3.N = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i20, new Object[0]));
                    }
                }
                if (z19) {
                    if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                    }
                } else if (chat == null && z15) {
                    if (z16 && i48 != i20) {
                        b2Var3.P = LocaleController.formatString(R.string.DeleteMessagesTextGroupPart, LocaleController.formatPluralString("messages", i48, new Object[0]));
                    } else if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (z16 || z33 || i48 == i20) {
                    if (chat == null && chat.megagroup && !z24) {
                        if (i20 == 1) {
                            b2Var3.P = LocaleController.getString((messageObject == null || !messageObject.isEphemeral()) ? R.string.AreYouSureDeleteSingleMessageMega : R.string.AreYouSureDeleteSingleMessage);
                        } else {
                            b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessagesMega);
                        }
                    } else if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (chat != null) {
                    b2Var3.P = LocaleController.formatString("DeleteMessagesTextGroup", R.string.DeleteMessagesTextGroup, LocaleController.formatPluralString("messages", i48, new Object[0]));
                } else {
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteMessagesText", R.string.DeleteMessagesText, LocaleController.formatPluralString("messages", i48, new Object[0]), UserObject.getFirstName(user)));
                }
                if (messageObject != null) {
                    if (messageObject.isGiveaway() || messageObject.isForwarded()) {
                        z20 = false;
                    } else {
                        z20 = true;
                    }
                    if (z20) {
                        j12 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date) * 1000;
                        str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j12));
                        if (System.currentTimeMillis() < j12) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        str = null;
                    }
                } else if (i20 == 1) {
                    z21 = false;
                    str = null;
                    for (i21 = 1; i21 >= 0; i21--) {
                        for (i22 = 0; i22 < sparseArrayArr[i21].size(); i22++) {
                            messageObject2 = (MessageObject) sparseArrayArr[i21].valueAt(i22);
                            if (messageObject2.isGiveaway() || messageObject2.isForwarded()) {
                                z22 = false;
                            } else {
                                z22 = true;
                            }
                            if (z22) {
                                j11 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject2.messageOwner.media).until_date) * 1000;
                                str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j11));
                                if (System.currentTimeMillis() < j11) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                            } else {
                                z21 = z22;
                            }
                        }
                    }
                    z20 = z21;
                } else {
                    z20 = false;
                    str = null;
                }
                if (z29) {
                    int i49 = (int) MessagesController.getInstance(i18).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    b2Var3.N = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i49)));
                    AlertDialog$Builder alertDialog$Builder5 = alertDialog$Builder3;
                    alertDialog$Builder5.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                    alertDialog$Builder2 = alertDialog$Builder5;
                } else {
                    alertDialog$Builder = alertDialog$Builder3;
                    if (z18) {
                        int i50 = (int) MessagesController.getInstance(i18).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                        b2Var3.N = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                        b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i50)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                        alertDialog$Builder2 = alertDialog$Builder;
                    } else if (z20 || z19) {
                        if (z19) {
                            i23 = R.string.Remove;
                        } else {
                            i23 = R.string.Delete;
                        }
                        alertDialog$Builder.k(LocaleController.getString(i23), a2Var);
                        alertDialog$Builder2 = alertDialog$Builder;
                    } else {
                        b2Var3.N = LocaleController.getString(R.string.BoostingGiveawayDeleteMsgTitle);
                        b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingGiveawayDeleteMsgText, str));
                        alertDialog$Builder.i(LocaleController.getString(R.string.Delete), a2Var);
                        alertDialog$Builder2 = alertDialog$Builder;
                    }
                }
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                b2Var3.J = new r0(1, runnable2);
                n2Var.showDialog(b2Var3);
                textView = (TextView) b2Var3.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
                textView2 = (TextView) b2Var3.d(-3);
                if (textView2 != null) {
                    b2Var3.f22762p0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                    ((ViewGroup.MarginLayoutParams) b2Var3.f22762p0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
            }
            z14 = z32;
            if (chat != null) {
                b2Var = b2Var4;
                i14 = i30;
                if (z24) {
                    i15 = i14;
                    i16 = 0;
                    z15 = false;
                    z16 = false;
                } else {
                    i15 = i14;
                    i16 = 0;
                    z15 = false;
                    z16 = false;
                }
            } else {
                b2Var = b2Var4;
                i14 = i30;
                if (z24) {
                    i15 = i14;
                    i16 = 0;
                    z15 = false;
                    z16 = false;
                } else {
                    i15 = i14;
                    i16 = 0;
                    z15 = false;
                    z16 = false;
                }
            }
            i18 = i15;
            b2Var2 = b2Var;
            int i410 = i16;
            final long j15 = jMakeEncryptedDialogId;
            i19 = size;
            z18 = z11;
            z19 = z10;
            a2Var = new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var6, int i411) {
                    SparseArray[] sparseArrayArr2;
                    ArrayList<Long> arrayList4;
                    int i51;
                    long j16;
                    long j17;
                    TLRPC.Peer peer;
                    int i52;
                    long j18;
                    boolean z34 = z19;
                    int i53 = i18;
                    long clientUserId = z34 ? UserConfig.getInstance(i53).getClientUserId() : j15;
                    MessageObject messageObject8 = messageObject;
                    TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                    long j19 = j10;
                    int i54 = i10;
                    boolean[] zArr2 = zArr;
                    int i55 = i11;
                    ArrayList<Long> arrayList5 = null;
                    if (messageObject8 != null) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList<Integer> arrayList7 = new ArrayList<>();
                        MessageObject.GroupedMessages groupedMessages2 = groupedMessages;
                        if (groupedMessages2 != null) {
                            int i56 = 0;
                            while (i56 < groupedMessages2.messages.size()) {
                                MessageObject messageObject9 = groupedMessages2.messages.get(i56);
                                if (messageObject9.isEphemeral()) {
                                    arrayList6.add(messageObject9);
                                    i52 = i53;
                                } else {
                                    i52 = i53;
                                    arrayList7.add(Integer.valueOf(messageObject9.getId()));
                                    if (encryptedChat2 != null) {
                                        j18 = clientUserId;
                                        if (messageObject9.messageOwner.random_id != 0 && messageObject9.type != 10) {
                                            if (arrayList5 == null) {
                                                arrayList5 = new ArrayList<>();
                                            }
                                            ArrayList<Long> arrayList8 = arrayList5;
                                            arrayList8.add(Long.valueOf(messageObject9.messageOwner.random_id));
                                            arrayList5 = arrayList8;
                                        }
                                    }
                                    i56++;
                                    i53 = i52;
                                    clientUserId = j18;
                                }
                                j18 = clientUserId;
                                i56++;
                                i53 = i52;
                                clientUserId = j18;
                            }
                            i51 = i53;
                            j16 = clientUserId;
                        } else {
                            i51 = i53;
                            j16 = clientUserId;
                            if (messageObject8.isEphemeral()) {
                                arrayList6.add(messageObject8);
                            } else {
                                arrayList7.add(Integer.valueOf(messageObject8.getId()));
                                if (encryptedChat2 != null && messageObject8.messageOwner.random_id != 0 && messageObject8.type != 10) {
                                    ArrayList<Long> arrayList9 = new ArrayList<>();
                                    arrayList9.add(Long.valueOf(messageObject8.messageOwner.random_id));
                                    arrayList5 = arrayList9;
                                }
                            }
                        }
                        long j110 = (j19 == 0 || (peer = messageObject8.messageOwner.peer_id) == null || peer.chat_id != (-j19)) ? j16 : j19;
                        if (arrayList7.isEmpty()) {
                            j17 = j110;
                        } else {
                            j17 = j110;
                            MessagesController.getInstance(i51).deleteMessages(arrayList7, arrayList5, encryptedChat2, j17, i54, zArr2[0], i55);
                        }
                        int size3 = arrayList6.size();
                        int i57 = 0;
                        while (i57 < size3) {
                            Object obj = arrayList6.get(i57);
                            i57++;
                            MessagesController.getInstance(i51).deleteEphemeralMessage(j17, i54, (MessageObject) obj);
                        }
                    } else {
                        long j20 = clientUserId;
                        int i58 = 1;
                        while (i58 >= 0) {
                            ArrayList<Integer> arrayList10 = new ArrayList<>();
                            int i59 = 0;
                            while (true) {
                                sparseArrayArr2 = sparseArrayArr;
                                if (i59 >= sparseArrayArr2[i58].size()) {
                                    break;
                                }
                                arrayList10.add(Integer.valueOf(sparseArrayArr2[i58].keyAt(i59)));
                                i59++;
                            }
                            if (encryptedChat2 != null) {
                                ArrayList<Long> arrayList11 = new ArrayList<>();
                                int i510 = 0;
                                while (i510 < sparseArrayArr2[i58].size()) {
                                    MessageObject messageObject10 = (MessageObject) sparseArrayArr2[i58].valueAt(i510);
                                    int i60 = i58;
                                    long j21 = messageObject10.messageOwner.random_id;
                                    if (j21 != 0 && messageObject10.type != 10) {
                                        arrayList11.add(Long.valueOf(j21));
                                    }
                                    i510++;
                                    i58 = i60;
                                }
                                arrayList4 = arrayList11;
                            } else {
                                arrayList4 = null;
                            }
                            int i61 = i58;
                            MessagesController.getInstance(i53).deleteMessages(arrayList10, arrayList4, encryptedChat2, (i61 != 1 || j19 == 0) ? j20 : j19, i54, zArr2[0], i55);
                            sparseArrayArr2[i61].clear();
                            i58 = i61 - 1;
                        }
                    }
                    Runnable runnable5 = runnable;
                    if (runnable5 != null) {
                        runnable5.run();
                    }
                }
            };
            if (z19) {
                i20 = i19;
                if (i20 == 1) {
                    b2Var3 = b2Var2;
                    b2Var3.N = LocaleController.getString(R.string.UnsaveSingleMessagesTitle);
                } else {
                    b2Var3 = b2Var2;
                    b2Var3.N = LocaleController.formatString(R.string.UnsaveMessagesTitle, LocaleController.formatPluralString("messages", i20, new Object[0]));
                }
            } else {
                i20 = i19;
                b2Var3 = b2Var2;
                if (i20 == 1) {
                    b2Var3.N = LocaleController.getString(R.string.DeleteSingleMessagesTitle);
                } else {
                    b2Var3.N = LocaleController.formatString(R.string.DeleteMessagesTitle, LocaleController.formatPluralString("messages", i20, new Object[0]));
                }
            }
            if (z19) {
                if (i20 == 1) {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureUnsaveSingleMessage);
                } else {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureUnsaveFewMessages);
                }
            } else if (chat == null) {
                if (z16) {
                    if (chat == null) {
                        if (i20 == 1) {
                            b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                        } else {
                            b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                        }
                    } else if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (chat == null) {
                    if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i20 == 1) {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                } else {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                }
            } else if (z16) {
                if (chat == null) {
                    if (i20 == 1) {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                    } else {
                        b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                    }
                } else if (i20 == 1) {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                } else {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                }
            } else if (chat == null) {
                if (i20 == 1) {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
                } else {
                    b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
                }
            } else if (i20 == 1) {
                b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteSingleMessage);
            } else {
                b2Var3.P = LocaleController.getString(R.string.AreYouSureDeleteFewMessages);
            }
            if (messageObject != null) {
                if (messageObject.isGiveaway()) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                if (z20) {
                    j12 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media).until_date) * 1000;
                    str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j12));
                    if (System.currentTimeMillis() < j12) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                } else {
                    str = null;
                }
            } else if (i20 == 1) {
                z21 = false;
                str = null;
                while (i21 >= 0) {
                    while (i22 < sparseArrayArr[i21].size()) {
                        messageObject2 = (MessageObject) sparseArrayArr[i21].valueAt(i22);
                        if (messageObject2.isGiveaway()) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        if (z22) {
                            j11 = ((long) ((TLRPC.TL_messageMediaGiveaway) messageObject2.messageOwner.media).until_date) * 1000;
                            str = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(j11));
                            if (System.currentTimeMillis() < j11) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                        } else {
                            z21 = z22;
                        }
                    }
                }
                z20 = z21;
            } else {
                z20 = false;
                str = null;
            }
            if (z29) {
                int i411 = (int) MessagesController.getInstance(i18).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                b2Var3.N = LocaleController.getString(R.string.SuggestionStarsWillBeLost);
                b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionStarsWillBeLostInfo, Integer.valueOf(i411)));
                AlertDialog$Builder alertDialog$Builder6 = alertDialog$Builder3;
                alertDialog$Builder6.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                alertDialog$Builder2 = alertDialog$Builder6;
            } else {
                alertDialog$Builder = alertDialog$Builder3;
                if (z18) {
                    int i51 = (int) MessagesController.getInstance(i18).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS);
                    b2Var3.N = LocaleController.getString(R.string.SuggestionTONWillBeLost);
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestionTONWillBeLostInfo, Integer.valueOf(i51)));
                    alertDialog$Builder.k(LocaleController.getString(R.string.SuggestionStarsWillBeLostDelete), a2Var);
                    alertDialog$Builder2 = alertDialog$Builder;
                } else if (z20) {
                    if (z19) {
                        i23 = R.string.Remove;
                    } else {
                        i23 = R.string.Delete;
                    }
                    alertDialog$Builder.k(LocaleController.getString(i23), a2Var);
                    alertDialog$Builder2 = alertDialog$Builder;
                } else {
                    if (z19) {
                        i23 = R.string.Remove;
                    } else {
                        i23 = R.string.Delete;
                    }
                    alertDialog$Builder.k(LocaleController.getString(i23), a2Var);
                    alertDialog$Builder2 = alertDialog$Builder;
                }
            }
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            b2Var3.J = new r0(1, runnable2);
            n2Var.showDialog(b2Var3);
            textView = (TextView) b2Var3.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
            textView2 = (TextView) b2Var3.d(-3);
            if (textView2 != null) {
                b2Var3.f22762p0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f));
                ((ViewGroup.MarginLayoutParams) b2Var3.f22762p0.getLayoutParams()).topMargin = AndroidUtilities.dp(-8.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
    }
}
