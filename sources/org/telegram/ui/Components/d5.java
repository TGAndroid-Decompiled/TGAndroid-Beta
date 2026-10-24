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
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
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
public abstract class d5 {
    public static final Pattern f25562a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, ug1 ug1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ci.n1(10));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f20679a.V = frameLayout;
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ci.f(8, activity, z10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.f20769l0 = true;
        c2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), ug1Var);
        alertDialog$Builder.f20679a.Q0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new f1(launchActivity, 1));
        return alertDialog$Builder.f20679a;
    }

    public static org.telegram.ui.ActionBar.c2 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        int i10 = R.raw.permission_request_location;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f20679a;
    }

    public static org.telegram.ui.ActionBar.c2 D(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        textView.setTextSize(1, 16.0f);
        int i12 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (LocaleController.isRTL) {
            i12 = 5;
        }
        int i13 = i12 | 48;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        f7.addView(textView, w7.z5.t(-2, -2, i13, 24, i11, 24, 8));
        for (int i14 = 0; i14 < 4; i14++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.d = 42;
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            a(l6Var, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            String str = strArr[i14];
            if (iArr[0] == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(str, z11);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new p1(iArr, f7));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        if (z10) {
            c2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int i15 = org.telegram.ui.ActionBar.k6.L5;
            if (g6Var != null) {
                x02 = g6Var.e(i15);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
            }
            c2Var.f20747b0 = new ir0(activity, 0);
            c2Var.f20750c0 = x02;
            c2Var.f20752d0 = -1;
            if (g6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.k6.L5, null);
            }
        }
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new m4.w0(28, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.h3 E(final long j10, final long j11, final org.telegram.ui.ActionBar.o2 o2Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) o2Var.getParentActivity(), g6Var, false);
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
                org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                if (vc.a(o2Var2)) {
                    vc.z(o2Var2, i11, 0, g6Var).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        return h3Var;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.g6 g6Var, b5 b5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
        if (g6Var != null) {
            x02 = g6Var.e(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
        if (g6Var != null) {
            x03 = g6Var.e(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e(i12);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.f21273i6;
        if (g6Var != null) {
            g6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            x04 = g6Var.e(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            x05 = g6Var.e(i18);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        }
        int i19 = x05;
        if (g6Var != null) {
            x06 = g6Var.e(org.telegram.ui.ActionBar.k6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        }
        int i20 = x06;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        m4 m4Var = new m4(context, g6Var, iArr);
        m4Var.setMinValue(0);
        m4Var.setMaxValue(20);
        m4Var.setTextColor(x02);
        m4Var.setValue(0);
        m4Var.setFormatter(new e1(0, iArr));
        i4 i4Var = new i4(context, m4Var, 1);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ai.wd wdVar = new ai.wd(context, 19);
        linearLayout.addView(m4Var, w7.z5.l(1.0f, 0, 270));
        m4Var.setOnValueChangedListener(new org.telegram.ui.tr(14));
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(x04);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, i19, i20, i20));
        wdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        i4Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        wdVar.setOnClickListener(new ci.b4(iArr, m4Var, b5Var, b3Var, 6));
        b3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
        h3Var.show();
        h3Var.setBackgroundColor(x03);
        h3Var.fixNavigationBar(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20679a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.k6.x0(null, i10, false), hashMap);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.f20679a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f20679a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 H(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
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
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i14));
            a(l6Var, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            f7.addView(l6Var);
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
                    alertDialog$Builder.f20679a.N0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
            z11 = true;
        }
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20679a;
    }

    public static void I(int i10, Activity activity, long j10, TLRPC.Photo photo, ci.b bVar) {
        if (activity != null) {
            y2 y2Var = new y2(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.g6) bVar, true);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            h3Var.bigTitle = true;
            z2 z2Var = new z2(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, y2Var, 0);
            h3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            h3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            h3Var.onClickListener = z2Var;
            h3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.b3 J(final Context context, final long j10, long j11, int i10, boolean z10, final b5 b5Var, Runnable runnable, a5 a5Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
        org.telegram.messenger.camera.i iVar;
        ?? r11;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i13;
        Calendar calendar;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        String[] strArr;
        View view;
        xj0 xj0Var;
        Calendar calendar2;
        t3 t3Var;
        int[] iArr2;
        org.telegram.ui.ActionBar.u0 u0Var2;
        int i17;
        ?? r22;
        int i18;
        String[] strArr2;
        org.telegram.messenger.camera.i iVar2;
        org.telegram.messenger.camera.i iVar3;
        ?? r42;
        View view2;
        final org.telegram.ui.ActionBar.h3 h3Var;
        int i19;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        final ?? od0Var = new od0(context, g6Var);
        int i20 = a5Var.f24623a;
        int i21 = a5Var.f24625c;
        int i22 = a5Var.f24624b;
        od0Var.setTextColor(i20);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        final ?? od0Var2 = new od0(context, g6Var);
        od0Var2.setWrapSelectorWheel(true);
        od0Var2.setAllItemsCount(24);
        od0Var2.setItemCount(5);
        od0Var2.setTextColor(i20);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? od0Var3 = new od0(context, g6Var);
        od0Var3.setWrapSelectorWheel(true);
        od0Var3.setAllItemsCount(60);
        od0Var3.setItemCount(5);
        od0Var3.setTextColor(i20);
        od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? v3Var = new v3(context, od0Var, od0Var2, od0Var3, 0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setOrientation(1);
        frameLayout4.addView((View) v3Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        v3Var.addView(frameLayout6, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
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
        textView.setTextColor(i20);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout6.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
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
            iVar = null;
            i11 = i22;
            zArr = zArr2;
            u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, a5Var.f24623a, false, g6Var);
            context2 = context;
            u0Var.setLongClickEnabled(false);
            u0Var.setSubMenuOpenSide(2);
            u0Var.setIcon(R.drawable.ic_ab_other);
            u0Var.setBackground(org.telegram.ui.ActionBar.k6.g0(i21, 1, -1));
            frameLayout3.addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            u0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        } else {
            context2 = context;
            viewGroup = frameLayout4;
            i11 = i22;
            frameLayout2 = frameLayout;
            i12 = -1;
            r82 = 0;
            zArr = zArr2;
            j12 = clientUserId;
            frameLayout3 = frameLayout6;
            iVar = null;
            r11 = v3Var;
            u0Var = null;
        }
        if (u0Var != null) {
            u0Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(21, u0Var, a5Var));
            u0Var.setDelegate(new ai.u2(b5Var, zArr, b3Var, 20));
        }
        ?? imageView = new ImageView(context2);
        xj0 xj0Var2 = new xj0(R.raw.notify_toggle, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        xj0Var2.J(true);
        xj0Var2.h = true;
        xj0Var2.start();
        xj0Var2.M(40);
        xj0Var2.P(40);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(xj0Var2);
        imageView.setColorFilter(new PorterDuffColorFilter(i20, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(i21, 1, i12));
        if (u0Var != null) {
            i13 = 42;
        } else {
            i13 = r82;
        }
        frameLayout3.addView(imageView, w7.z5.d(40, 40.0f, 53, 0.0f, 8.0f, i13 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        r11.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final ai.wd wdVar = new ai.wd(context2, 14);
        linearLayout.addView(od0Var, w7.z5.l(0.5f, r82, 270));
        od0Var.setMinValue(r82);
        od0Var.setMaxValue(365);
        od0Var.setWrapSelectorWheel(r82);
        od0Var.setFormatter(new d2(4));
        Object obj = r11;
        final long j13 = j12;
        int i23 = i11;
        final boolean[] zArr3 = zArr;
        md0 md0Var = new md0() {
            @Override
            public final void n(od0 od0Var4, int i24) {
                int i25;
                if (j13 == j10) {
                    i25 = 1;
                } else {
                    i25 = 0;
                }
                d5.g(ai.wd.this, null, 0L, 0L, i25, od0Var, od0Var2, od0Var3);
            }
        };
        od0Var.setOnValueChangedListener(md0Var);
        od0Var2.setMinValue(r82);
        od0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.u0 u0Var3 = u0Var;
        linearLayout.addView(od0Var2, w7.z5.l(0.2f, r82, 270));
        od0Var2.setFormatter(new d2(5));
        od0Var2.setOnValueChangedListener(md0Var);
        od0Var3.setMinValue(r82);
        od0Var3.setMaxValue(59);
        od0Var3.setValue(r82);
        od0Var3.setFormatter(new d2(6));
        linearLayout.addView(od0Var3, w7.z5.l(0.3f, r82, 270));
        od0Var3.setOnValueChangedListener(md0Var);
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
                od0Var3.setValue(calendar.get(12));
                od0Var2.setValue(calendar.get(11));
                od0Var.setValue(timeInMillis);
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
        g(wdVar, null, 0L, 0L, i14, od0Var, od0Var2, od0Var3);
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
            calendar2 = calendar;
            ?? frameLayout7 = new FrameLayout(context2);
            t3Var = od0Var2;
            i17 = i23;
            int v = org.telegram.ui.ActionBar.k6.v(i17, org.telegram.ui.ActionBar.k6.o1(0.075f, i20));
            String[] strArr3 = strArr;
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, i20);
            ?? textView2 = new TextView(context2);
            view = imageView;
            xj0Var = xj0Var2;
            textView2.setTextSize(i15, 13.0f);
            textView2.setTextColor(i20);
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.k6.v(v, o12);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, v, v10, v10));
            textView2.setGravity(17);
            int[] iArr4 = iArr;
            i18 = 17;
            strArr2 = strArr3;
            u0Var2 = u0Var3;
            iVar2 = new org.telegram.messenger.camera.i(iArr4, iArr3, strArr2, textView2, 21);
            iArr2 = iArr4;
            iVar2.run();
            frameLayout7.addView(textView2, w7.z5.d(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            r22 = obj;
            r22.addView(frameLayout7, w7.z5.n(-1, -2));
            iVar3 = textView2;
            r42 = frameLayout7;
        } else {
            view = imageView;
            xj0Var = xj0Var2;
            calendar2 = calendar;
            t3Var = od0Var2;
            iArr2 = iArr;
            u0Var2 = u0Var3;
            i17 = i23;
            r22 = obj;
            i18 = 17;
            strArr2 = strArr;
            iVar2 = iVar;
            org.telegram.messenger.camera.i iVar4 = iVar2;
            iVar3 = iVar4;
            r42 = iVar4;
        }
        org.telegram.messenger.camera.i iVar5 = iVar2;
        String[] strArr4 = strArr2;
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(i18);
        wdVar.setTextColor(a5Var.f24627g);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        wdVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, a5Var.h));
        r22.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        int i24 = i17;
        View view3 = view;
        final t3 t3Var2 = t3Var;
        final Calendar calendar4 = calendar2;
        wdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i25;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i25 = 1;
                } else {
                    i25 = 0;
                }
                od0 od0Var4 = od0Var;
                t3 t3Var3 = t3Var2;
                u3 u3Var = od0Var3;
                boolean g10 = d5.g(null, null, 0L, 0L, i25, od0Var4, t3Var3, u3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, od0Var4.getValue());
                calendar5.set(11, t3Var3.getValue());
                calendar5.set(12, u3Var.getValue());
                if (g10) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z11 = zArr3[0];
                b5Var.C((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = b3Var.f20729a.dismissRunnable;
                runnable2.run();
            }
        });
        b3Var.b(viewGroup);
        org.telegram.ui.ActionBar.h3 h3Var2 = b3Var.f20729a;
        h3Var2.show();
        h3Var2.setOnDismissListener(new m2(runnable, zArr4));
        h3Var2.setBackgroundColor(i24);
        h3Var2.fixNavigationBar(i24);
        if (iVar3 != null) {
            view2 = view3;
            i19 = 1;
            h3Var = h3Var2;
            iVar3.setOnClickListener(new z1(frameLayout2, g6Var, h3Var2, (FrameLayout) r42, iArr2, strArr4, iArr3, iVar5));
        } else {
            view2 = view3;
            h3Var = h3Var2;
            i19 = 1;
        }
        final ei.x3[] x3VarArr = new ei.x3[i19];
        final org.telegram.ui.ActionBar.u0 u0Var4 = u0Var2;
        final xj0 xj0Var3 = xj0Var;
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i25;
                String string;
                int i26;
                int i27;
                int i28;
                int i29;
                boolean[] zArr5 = zArr3;
                boolean z11 = zArr5[0];
                zArr5[0] = !z11;
                xj0 xj0Var4 = xj0Var3;
                if (!z11) {
                    if (xj0Var4.f32594a0 >= 40) {
                        xj0Var4.M(0);
                    }
                    xj0Var4.P(40);
                    xj0Var4.start();
                } else {
                    if (xj0Var4.f32594a0 < 40) {
                        xj0Var4.M(40);
                    }
                    xj0Var4.P(80);
                    xj0Var4.start();
                }
                ei.x3[] x3VarArr2 = x3VarArr;
                ei.x3 x3Var = x3VarArr2[0];
                if (x3Var != null) {
                    x3Var.e(true);
                    x3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                ei.x3 x3Var2 = new ei.x3(context, 3);
                x3VarArr2[0] = x3Var2;
                x3Var2.r();
                x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                x3Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int o13 = org.telegram.ui.ActionBar.k6.o1(0.25f, -16777216);
                x3Var2.f10094i0 = dp2;
                x3Var2.f10095j0 = dp3;
                x3Var2.f10096k0 = o13;
                x3Var2.F.setShadowLayer(dp2, 0.0f, dp3, o13);
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    if (zArr5[0]) {
                        i29 = R.string.ScheduleNotifyOnChannel;
                    } else {
                        i29 = R.string.ScheduleNotifyOffChannel;
                    }
                    string = LocaleController.getString(i29);
                } else if (chat == null && user2 != null) {
                    if (j15 == j13) {
                        if (zArr5[0]) {
                            i27 = R.string.ScheduleNotifyOnSelf;
                        } else {
                            i27 = R.string.ScheduleNotifyOffSelf;
                        }
                        string = LocaleController.getString(i27);
                    } else {
                        if (zArr5[0]) {
                            i26 = R.string.ScheduleNotifyOnChat;
                        } else {
                            i26 = R.string.ScheduleNotifyOffChat;
                        }
                        string = LocaleController.formatString(i26, UserObject.getForcedFirstName(user2));
                    }
                } else {
                    if (zArr5[0]) {
                        i25 = R.string.ScheduleNotifyOnGroup;
                    } else {
                        i25 = R.string.ScheduleNotifyOffGroup;
                    }
                    string = LocaleController.getString(i25);
                }
                x3Var2.s(string);
                x3Var2.d = 5000L;
                if (u0Var4 != null) {
                    i28 = 42;
                } else {
                    i28 = -8;
                }
                x3Var2.l(1.0f, -(i28 + 20));
                x3Var2.f10097l0 = new ng(x3Var2, 2);
                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                h3Var3.getContainerView().setClipToPadding(false);
                h3Var3.getContainerView().setClipChildren(false);
                h3Var3.getContainerView().addView(x3Var2, w7.z5.d(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                x3Var2.u();
            }
        });
        return b3Var;
    }

    public static void K(Context context, long j10, b5 b5Var) {
        J(context, j10, -1L, 0, false, b5Var, null, new a5(null), null);
    }

    public static void L(Context context, long j10, b5 b5Var, org.telegram.ui.ActionBar.g6 g6Var) {
        J(context, j10, -1L, 0, false, b5Var, null, new a5(g6Var), g6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = str;
        c2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new a1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 O(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = str;
        c2Var.T = charSequence;
        alertDialog$Builder.k(str2, new a1(4, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20679a;
    }

    public static org.telegram.ui.ActionBar.m1 P(org.telegram.ui.ActionBar.o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (o2Var != null && view != null) {
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            m1Var.e = true;
            m1Var.f21632c = 220;
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

    public static void Q(Context context, org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = str6;
        c2Var.T = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.k6.q6, g6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new ig.p(editTextBoldCursor, i10, stringCallback, c2VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new x3(i10, editTextBoldCursor));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i11);
        editTextBoldCursor.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, c02, M, null, g6Var);
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        e.addView((View) editTextBoldCursor, w7.z5.k(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(e);
        alertDialog$Builder.f20679a.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new hg.b2((Object) editTextBoldCursor, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.tr(24));
        c2VarArr[0] = alertDialog$Builder.f20679a;
        if (o2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, o2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
        c2Var2.f20765j0 = false;
        c2Var2.setOnDismissListener(new gi.r0(editTextBoldCursor, o2Var, findActivity, 2));
        c2VarArr[0].setOnShowListener(new d1(1, editTextBoldCursor));
        c2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, MessagesStorage.StringCallback stringCallback) {
        Q(context, o2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), g6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.b3 S(Context context, long j10, final b5 b5Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        int i17 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        final od0 od0Var = new od0(context, g6Var);
        od0Var.setTextColor(x02);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        final ?? od0Var2 = new od0(context, g6Var);
        od0Var2.setWrapSelectorWheel(true);
        od0Var2.setAllItemsCount(24);
        od0Var2.setItemCount(5);
        od0Var2.setTextColor(x02);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? od0Var3 = new od0(context, g6Var);
        od0Var3.setWrapSelectorWheel(true);
        od0Var3.setAllItemsCount(60);
        od0Var3.setItemCount(5);
        od0Var3.setTextColor(x02);
        od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        v3 v3Var = new v3(context, od0Var, od0Var2, od0Var3, 5);
        v3Var.setOrientation(1);
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        v3Var.addView(e, w7.z5.t(-1, -2, 51, 22, 0, 22, 4));
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
        textView.setOnTouchListener(new di.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        e.addView(textView2, w7.z5.t(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i18 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final ai.wd wdVar = new ai.wd(context, 20);
        linearLayout.addView(od0Var, w7.z5.l(0.5f, 0, 270));
        od0Var.setMinValue(0);
        od0Var.setMaxValue(365);
        od0Var.setWrapSelectorWheel(false);
        od0Var.setFormatter(new i2.v(i18, 8));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        md0 md0Var = new md0() {
            @Override
            public final void n(od0 od0Var4, int i19) {
                d5.g(ai.wd.this, null, j11, j12, i12, od0Var, od0Var2, od0Var3);
            }
        };
        od0Var.setOnValueChangedListener(md0Var);
        od0Var2.setMinValue(0);
        od0Var2.setMaxValue(23);
        linearLayout.addView((View) od0Var2, w7.z5.l(0.2f, 0, 270));
        od0Var2.setFormatter(new org.telegram.ui.tr(19));
        od0Var2.setOnValueChangedListener(md0Var);
        od0Var3.setMinValue(0);
        od0Var3.setMaxValue(59);
        od0Var3.setValue(0);
        od0Var3.setFormatter(new org.telegram.ui.tr(20));
        linearLayout.addView((View) od0Var3, w7.z5.l(0.3f, 0, 270));
        od0Var3.setOnValueChangedListener(md0Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j13 = j10 * 1000;
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
                od0Var3.setValue(calendar.get(12));
                od0Var2.setValue(calendar.get(11));
                od0Var.setValue(timeInMillis);
            }
        } else {
            i13 = x03;
            i14 = i17;
            i15 = x04;
        }
        final boolean[] zArr = {true};
        g(wdVar, null, j11, j12, i12, od0Var, od0Var2, od0Var3);
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(i15);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        wdVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, x05));
        v3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        final int i19 = i12;
        wdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i20 = i19;
                od0 od0Var4 = od0Var;
                s4 s4Var = od0Var2;
                t4 t4Var = od0Var3;
                boolean g10 = d5.g(null, null, j14, j15, i20, od0Var4, s4Var, t4Var);
                long epochMilli = LocalDate.now().plusDays(od0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, s4Var.getValue());
                calendar2.set(12, t4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                }
                b5Var.C((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = b3Var.f20729a.dismissRunnable;
                runnable.run();
            }
        });
        w7.b6.b(wdVar, 0.02f, 1.2f);
        ai.wd wdVar2 = new ai.wd(context, 21);
        wdVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar2.setGravity(17);
        if (i10 == 1) {
            i16 = R.string.MessageSuggestionPublishNow;
        } else {
            i16 = R.string.PostSuggestionsAnytime;
        }
        wdVar2.setText(LocaleController.getString(i16));
        wdVar2.setTextColor(x05);
        wdVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i20 = org.telegram.ui.ActionBar.k6.f21184d6;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
        int i21 = i14;
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x06, x07, x07);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i20);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i21);
        wdVar2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(wdVar2, j02, O, O2, null);
        v3Var.addView(wdVar2, w7.z5.t(-1, 48, 83, 16, 0, 16, 16));
        wdVar2.setOnClickListener(new ai.v0(zArr, b5Var, b3Var, 15));
        w7.b6.b(wdVar2, 0.02f, 1.2f);
        b3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
        h3Var.show();
        h3Var.setOnDismissListener(new ei.e1(zArr));
        h3Var.setBackgroundColor(i13);
        h3Var.fixNavigationBar(i13);
        return b3Var;
    }

    public static org.telegram.ui.ActionBar.c2 T(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        URLSpan[] uRLSpanArr;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return null;
        }
        w90 w90Var = new w90(o2Var.getParentActivity(), o2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new l4(o2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        w90Var.setText(spannableString);
        w90Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21310k5, g6Var);
        org.telegram.ui.ActionBar.r6.E(w90Var, org.telegram.ui.ActionBar.k6.f21327l5, g6Var);
        w90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        w90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var);
        alertDialog$Builder.o(w90Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new q2(1, o2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20679a;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.MessageLifetime);
        od0 od0Var = new od0(context, null);
        od0Var.setMinValue(0);
        od0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            od0Var.setValue(i10);
        } else if (i10 == 30) {
            od0Var.setValue(16);
        } else if (i10 == 60) {
            od0Var.setValue(17);
        } else if (i10 == 3600) {
            od0Var.setValue(18);
        } else if (i10 == 86400) {
            od0Var.setValue(19);
        } else if (i10 == 604800) {
            od0Var.setValue(20);
        } else if (i10 == 0) {
            od0Var.setValue(0);
        }
        od0Var.setFormatter(new d2(10));
        alertDialog$Builder.o(od0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new o2(1, encryptedChat, od0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.o2 o2Var, int i10, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i11;
        String sb2;
        if (o2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.r6.H(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21499u5, org.telegram.ui.ActionBar.k6.f21516v5, org.telegram.ui.ActionBar.k6.f21422q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new d2(11));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.v0.m(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i12, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.k6.G6, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new r2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        i2.o1.r(9306112, hashMap, "Berry", 14598550, "Brandy");
        i2.o1.r(8391495, hashMap, "Cherry", 16744272, "Coral");
        i2.o1.r(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        i2.o1.r(14725375, hashMap, "Mauve", 16761035, "Pink");
        i2.o1.r(16711680, hashMap, "Red", 16711807, "Rose");
        i2.o1.r(8406555, hashMap, "Russet", 16720896, "Scarlet");
        i2.o1.r(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        i2.o1.r(16760576, hashMap, "Amber", 15438707, "Apricot");
        i2.o1.r(16508850, hashMap, "Banana", 10601738, "Citrus");
        i2.o1.r(11560192, hashMap, "Ginger", 16766720, "Gold");
        i2.o1.r(16640272, hashMap, "Lemon", 16753920, "Orange");
        i2.o1.r(16770484, hashMap, "Peach", 16739155, "Persimmon");
        i2.o1.r(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        i2.o1.r(16763004, hashMap, "Topaz", 16776960, "Yellow");
        i2.o1.r(3688720, hashMap, "Clover", 8628829, "Cucumber");
        i2.o1.r(5294200, hashMap, "Emerald", 11907932, "Olive");
        i2.o1.r(65280, hashMap, "Green", 43115, "Jade");
        i2.o1.r(2730887, hashMap, "Jungle", 12582656, "Lime");
        i2.o1.r(776785, hashMap, "Malachite", 10026904, "Mint");
        i2.o1.r(11394989, hashMap, "Moss", 3234721, "Azure");
        i2.o1.r(255, hashMap, "Blue", 18347, "Cobalt");
        i2.o1.r(5204422, hashMap, "Indigo", 96647, "Lagoon");
        i2.o1.r(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        i2.o1.r(128, hashMap, "Navy", 3101086, "Sapphire");
        i2.o1.r(7788522, hashMap, "Sky", 32896, "Teal");
        i2.o1.r(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        i2.o1.r(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        i2.o1.r(13148872, hashMap, "Lilac", 11894492, "Lavender");
        i2.o1.r(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        i2.o1.r(6684825, hashMap, "Purple", 14204888, "Thistle");
        i2.o1.r(14315734, hashMap, "Orchid", 2361920, "Violet");
        i2.o1.r(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        i2.o1.r(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        i2.o1.r(7365973, hashMap, "Coffee", 7956873, "Rum");
        i2.o1.r(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        i2.o1.r(12759680, hashMap, "Sand", 8924439, "Sienna");
        i2.o1.r(7864585, hashMap, "Maple", 15787660, "Khaki");
        i2.o1.r(12088115, hashMap, "Copper", 12144200, "Chestnut");
        i2.o1.r(15653316, hashMap, "Almond", 16776656, "Cream");
        i2.o1.r(12186367, hashMap, "Diamond", 11109127, "Honey");
        i2.o1.r(16777200, hashMap, "Ivory", 15392968, "Pearl");
        i2.o1.r(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        i2.o1.r(16777215, hashMap, "White", 8421504, "Gray");
        i2.o1.r(0, hashMap, "Black", 15266260, "Chrome");
        i2.o1.r(3556687, hashMap, "Charcoal", 789277, "Ebony");
        i2.o1.r(12632256, hashMap, "Silver", 16119285, "Smoke");
        i2.o1.r(2499381, hashMap, "Steel", 5220413, "Apple");
        i2.o1.r(8434628, hashMap, "Glacier", 16693933, "Melon");
        i2.o1.r(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (i6Var == null) {
            i6Var2 = org.telegram.ui.ActionBar.k6.C0().k(false);
        } else {
            i6Var2 = i6Var;
        }
        if (i6Var2 == null || (i11 = i6Var2.f20967c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.s0())[0];
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
            StringBuilder i17 = si.o0.i(str, " ");
            i17.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = i17.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        d1 d1Var = new d1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.setOnShowListener(d1Var);
        o2Var.showDialog(c2Var);
        editTextBoldCursor.requestFocus();
        c2Var.d(-1).setOnClickListener(new ci.e0(o2Var, editTextBoldCursor, i6Var, j6Var, c2Var, 9));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        ?? od0Var = new od0(activity, null);
        q3 q3Var = new q3(activity, od0Var);
        q3Var.setOrientation(0);
        q3Var.setWeightSum(1.0f);
        od0Var.setAllItemsCount(24);
        od0Var.setItemCount(5);
        od0Var.setTextColor(x02);
        od0Var.setGravity(5);
        od0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? od0Var2 = new od0(activity, null);
        od0Var2.setWrapSelectorWheel(true);
        od0Var2.setAllItemsCount(60);
        od0Var2.setItemCount(5);
        od0Var2.setTextColor(x02);
        od0Var2.setGravity(3);
        od0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final ai.y4 y4Var = new ai.y4(i11, i12, (p3) od0Var, (r3) od0Var2, i10, q3Var);
        q3Var.addView((View) od0Var, w7.z5.l(0.5f, 0, 270));
        od0Var.setFormatter(new d2(2));
        od0Var.setOnValueChangedListener(new md0() {
            @Override
            public final void n(od0 od0Var3, int i13) {
                switch (r2) {
                    case 0:
                        y4Var.run(Boolean.TRUE);
                        return;
                    default:
                        y4Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        q3Var.addView((View) od0Var2, w7.z5.l(0.5f, 0, 270));
        od0Var2.setFormatter(new d2(3));
        od0Var2.setOnValueChangedListener(new md0() {
            @Override
            public final void n(od0 od0Var3, int i13) {
                switch (r2) {
                    case 0:
                        y4Var.run(Boolean.TRUE);
                        return;
                    default:
                        y4Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        y4Var.run(Boolean.FALSE);
        s3 s3Var = new s3(activity, od0Var, od0Var2);
        s3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        s3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        s3Var.addView(q3Var, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        ei.d dVar = new ei.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new j2(r1, 0));
        s3Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
        h3Var.customView = s3Var;
        h3Var.show();
        h3Var.setOnDismissListener(new gi.r0(callback, od0Var, od0Var2, 3));
        h3Var.setBackgroundColor(x03);
        h3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
    }

    public static org.telegram.ui.ActionBar.c2 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
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
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            a(l6Var, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.E5, g6Var);
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = z11;
            } else {
                z10 = false;
            }
            l6Var.b(str3, z10);
            f7.addView(l6Var);
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
                    alertDialog$Builder.f20679a.N0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z11 = true;
        }
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f20679a;
    }

    public static org.telegram.ui.ActionBar.c2 Y(Context context, org.telegram.ui.ActionBar.g6 g6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new da.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new m4.w0(25, atomicBoolean, aVar));
        alertDialog$Builder.f20679a.setOnDismissListener(new ai.z3(7, atomicBoolean, aVar));
        return alertDialog$Builder.f20679a;
    }

    public static void Z(int i10, int i11, long j10, Utilities.Callback callback) {
        a0(i10, j10, i11, callback, 0L);
    }

    public static void a(org.telegram.ui.Cells.l6 l6Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        for (int i12 = 0; i12 < l6Var.getChildCount(); i12++) {
            View childAt = l6Var.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.r6.Q((RadioButton) childAt, i10, i11, g6Var);
                return;
            }
        }
        l6Var.a(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
    }

    public static boolean a0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.g6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        ai.ha.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final u2 u2Var = new u2(i10, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(j10, "ask_paid_message_", "_price"), 0L)) {
                u2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (!PhotoViewer.u1().T1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new ci.b();
            }
            org.telegram.ui.ActionBar.g6 g6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j10);
            if (ChatObject.isMonoForum(i10, j10)) {
                shortName = og.d.h(i10, j10);
            } else if (U instanceof org.telegram.ui.sn) {
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) U;
                if (snVar.f41673s4 && snVar.a() == j10 && (chat = snVar.f41659r4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f20344id);
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
                        edit.putLong(org.telegram.ui.Cells.b1.k(j14, "ask_paid_message_", "_price"), j13).apply();
                        ai.ha.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(u2Var);
                }
            }, g6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static void b(od0 od0Var, od0 od0Var2, od0 od0Var3) {
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
        od0Var3.setMaxValue(i16);
        od0Var3.setMinValue(i13);
        int value = od0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        od0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        od0Var2.setMinValue(i11);
        int value2 = od0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        od0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        od0Var.setMinValue(i12);
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.g6 bVar;
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
            ai.ha.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (!PhotoViewer.u1().T1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new ci.b();
            }
            org.telegram.ui.ActionBar.g6 g6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            Object[] objArr = new Object[1];
            objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.nq(i10, max, activity, arrayList, hashMap, callback, g6Var), g6Var, true);
            return true;
        }
        callback.run(hashMap);
        return z13;
    }

    public static long c(ei.d dVar, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((od0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (od0Var2.getValue() - 120) % 12);
        od0Var.setMinValue(1);
        od0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = od0Var.getValue();
        int value3 = od0Var3.getValue();
        int value4 = od0Var4.getValue();
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

    public static boolean c0(int i10, long j10) {
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(org.telegram.ui.Cells.b1.k(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(od0 od0Var, od0 od0Var2, od0 od0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        od0Var3.setMinValue(i12);
        int value = od0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        od0Var2.setMinValue(i10);
        int value2 = od0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        od0Var.setMinValue(i11);
    }

    public static void d0(c5 c5Var, org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(c5Var);
            String obj = c5Var.getText().toString();
            int i10 = org.telegram.ui.ActionBar.k6.f21119a;
            org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            j6Var.f21022b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            j6Var.f21020a = obj;
            org.telegram.ui.ActionBar.k6.f21250h0 = org.telegram.ui.ActionBar.k6.a1(org.telegram.ui.ActionBar.k6.I.f21032i0);
            j6Var.E = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.k6.u1(j6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().d(o2Var.getParentActivity(), j6Var);
            c2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(o2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void e(TextView textView, od0 od0Var, c4 c4Var, d4 d4Var) {
        String str;
        String str2;
        int value = od0Var.getValue();
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

    public static org.telegram.ui.ActionBar.c2 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.o2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.c2");
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
                        if (user.f20491id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f20491id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f20491id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new ai.vb(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, bn bnVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i10, g6Var);
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.k6.q6, g6Var);
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
                    matches = d5.f25562a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(e4Var);
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
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i10);
        editTextBoldCursor.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(editTextBoldCursor, c02, M, null, g6Var);
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        e.addView((View) editTextBoldCursor, w7.z5.k(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = t91.f30767f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            t91 t91Var = new t91(context, g6Var);
            t91Var.setWebPage(webPage);
            e.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(e);
        c2Var.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new m4.w0(29, (Object) editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d2(1));
        if (bnVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new a1(3, bnVar));
        }
        c2VarArr[0] = c2Var;
        c2Var.f20765j0 = false;
        c2Var.setOnDismissListener(new y0(editTextBoldCursor, 2));
        c2VarArr[0].setOnShowListener(new h2(editTextBoldCursor, 0));
        c2VarArr[0].show();
        TextView textView = (TextView) c2VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
        }
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, od0 od0Var, od0 od0Var2, od0 od0Var3) {
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
        int value = od0Var.getValue();
        int value2 = od0Var2.getValue();
        int value3 = od0Var3.getValue();
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
        od0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            od0Var.setMaxValue(i12);
        }
        int value4 = od0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        od0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i12) {
                i19 = i13;
            } else {
                i19 = 23;
            }
            od0Var2.setMaxValue(i19);
        }
        int value5 = od0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        od0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i12 && value5 == i13) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            od0Var3.setMaxValue(i18);
        }
        int value6 = od0Var3.getValue();
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

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
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
                    c2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    c2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    c2Var.T = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        c2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    c2Var.T = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    c2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new q2(0, o2Var));
                    break;
                case 6:
                    if (z10) {
                        c2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        c2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    c2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    c2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        c2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        c2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    c2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        c2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    c2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    c2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        c2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    c2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        c2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        c2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        c2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    c2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    c2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    c2Var.T = sb2.toString();
                    break;
            }
            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f20344id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f20344id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
                }
                if (chatFull != null && chatFull.slowmode_next_send_date >= ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    z10 = true;
                }
            }
            if (z10) {
                M(context, chat.title, LocaleController.getString(R.string.SlowmodeSendError)).p();
                return true;
            }
            return false;
        }
        return false;
    }

    public static org.telegram.ui.ActionBar.c2 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
        boolean[] zArr = {false};
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        y4 y4Var = new y4(activity, z1VarArr);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.G = 6;
        alertDialog$Builder.o(y4Var);
        TextView textView2 = new TextView(activity);
        org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.E8, g6Var, 1, 20.0f);
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
        y4Var.addView(textView2, w7.z5.d(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        y4Var.addView(textView, w7.z5.d(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(activity, 1, g6Var);
            z1VarArr[0] = z1Var;
            int i16 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i16, g6Var), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i16);
            z1Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var);
            z1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            layoutParams.gravity = i14 | 16;
            z1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            z1VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
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
            z1Var2.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            y4Var.addView(z1VarArr[0], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            z1VarArr[0].setOnClickListener(new r0(5, zArr));
        }
        alertDialog$Builder.k(str2, new a3(0, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            c2Var.Z0 = true;
        }
        c2Var.show();
        return c2Var;
    }

    public static org.telegram.ui.ActionBar.c2 i(Activity activity, z4 z4Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.p1 p1Var = alertDialog$Builder.f20679a.N0;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f22621f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                f9 f9Var = kVar.e;
                f9Var.m(i10, currentUser);
                kVar.f22618a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                u9 u9Var = kVar.f22620c;
                u9Var.getImageReceiver().setCurrentAccount(i10);
                u9Var.e(currentUser, f9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
                f7.addView(kVar, w7.z5.n(-1, 50));
                kVar.setOnClickListener(new ai.v0(c2VarArr, p1Var, z4Var, 16));
            }
        }
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2VarArr[0] = c2Var;
        return c2Var;
    }

    public static void i0(org.telegram.ui.ActionBar.o2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.i0(org.telegram.ui.ActionBar.o2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static org.telegram.ui.ActionBar.c2 j(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ApkRestricted);
        int i10 = R.raw.permission_request_apk;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f20679a;
    }

    public static void j0(org.telegram.ui.sn snVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.kg kgVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (snVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = snVar.getAccountInstance();
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, g6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R0 = false;
                c2Var.N = new y0(kgVar, 0);
                c2Var.R = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(snVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.z1[] z1VarArr = {new org.telegram.ui.Cells.z1(snVar.getParentActivity(), 1, g6Var)};
                z1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
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
                linearLayout.addView(z1VarArr[0], w7.z5.n(-1, -2));
                z1VarArr[0].setOnClickListener(new z0(z1VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new b1(user, accountInstance, snVar, chat, messageObject, z1VarArr, g6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                snVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                }
            }
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.g6 g6Var, b5 b5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
        if (g6Var != null) {
            x02 = g6Var.e(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
        if (g6Var != null) {
            x03 = g6Var.e(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        }
        int i12 = x03;
        int i13 = org.telegram.ui.ActionBar.k6.Ji;
        if (g6Var != null) {
            g6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.k6.Ni;
        if (g6Var != null) {
            g6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.E8;
        if (g6Var != null) {
            g6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.G8;
        if (g6Var != null) {
            g6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.f21273i6;
        if (g6Var != null) {
            g6Var.e(i17);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.Sh;
        if (g6Var != null) {
            x04 = g6Var.e(i18);
        } else {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        }
        int i19 = x04;
        int i20 = org.telegram.ui.ActionBar.k6.Oh;
        if (g6Var != null) {
            x05 = g6Var.e(i20);
        } else {
            x05 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
        }
        int i21 = x05;
        if (g6Var != null) {
            x06 = g6Var.e(org.telegram.ui.ActionBar.k6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        }
        int i22 = x06;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        h4 h4Var = new h4(context, g6Var, iArr);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(16);
        h4Var.setTextColor(x02);
        h4Var.setValue(0);
        h4Var.setFormatter(new e1(1, iArr));
        i4 i4Var = new i4(context, h4Var, 0);
        i4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        i4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        i4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, false, 1);
        linearLayout.addView(h4Var, w7.z5.l(1.0f, 0, 270));
        t3Var.setPadding(0, 0, 0, 0);
        t3Var.setGravity(17);
        t3Var.setTextColor(i19);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        t3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, i21, i22, i22));
        i4Var.addView(t3Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        h4Var.setOnValueChangedListener(new s(t3Var, 10));
        t3Var.setOnClickListener(new ci.b4(iArr, h4Var, b5Var, b3Var, 8));
        b3Var.b(i4Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
        h3Var.show();
        h3Var.setBackgroundColor(i12);
        h3Var.fixNavigationBar(i12);
    }

    public static void k0(Context context, int i10, long j10) {
        org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.tl.j(1, context, null, false);
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
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
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, null);
        frameLayout.addView(frameLayout2, w7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.v0.q(textView, i12, null, 1, 20.0f);
        org.telegram.messenger.tl.m(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView f7 = org.telegram.messenger.tl.f(e, textView, w7.z5.k(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.r6.W(f7, i12, null);
        f7.setTextSize(1, 14.0f);
        f7.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        f7.setGravity(17);
        e.addView(f7, w7.z5.k(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        ei.d dVar = new ei.d(context, null, true);
        dVar.i(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        e.addView(dVar, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        j11.customView = e;
        dVar.setOnClickListener(new org.telegram.ui.qd(i10, dVar, j11, j10));
        j11.fixNavigationBar();
        j11.show();
    }

    public static org.telegram.ui.ActionBar.b3 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, g6Var);
        b3Var.a();
        od0 od0Var = new od0(context, g6Var);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        od0 od0Var2 = new od0(context, g6Var);
        od0Var2.setItemCount(5);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        od0 od0Var3 = new od0(context, g6Var);
        od0Var3.setItemCount(5);
        od0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        z3 z3Var = new z3(context, od0Var, od0Var2, od0Var3);
        z3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        z3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        z3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        w2 w2Var = new w2(od0Var3, i15, od0Var, od0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(od0Var, w7.z5.l(0.25f, 0, 270));
        od0Var.setMinValue(1);
        od0Var.setMaxValue(31);
        od0Var.setWrapSelectorWheel(false);
        od0Var.setFormatter(new d2(12));
        s sVar = new s(w2Var, 9);
        od0Var.setOnScrollListener(sVar);
        od0Var2.setMinValue(0);
        od0Var2.setMaxValue(11);
        od0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(od0Var2, w7.z5.l(0.5f, 0, 270));
        od0Var2.setFormatter(new d2(13));
        od0Var2.setOnScrollListener(sVar);
        od0Var3.setMinValue(calendar.get(1) - 149);
        od0Var3.setMaxValue(i15);
        od0Var3.setWrapSelectorWheel(false);
        od0Var3.setFormatter(new i2.v(i15, 9));
        linearLayout.addView(od0Var3, w7.z5.l(0.25f, 0, 270));
        od0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            od0Var.setValue(tL_birthday.day);
            od0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                od0Var3.setValue(tL_birthday.year);
            } else {
                od0Var3.setValue(i15);
            }
        } else {
            od0Var.setValue(calendar.get(5));
            od0Var2.setValue(calendar.get(2));
            od0Var3.setValue(i15);
        }
        w2Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            w90 w90Var = new w90(context, null);
            w90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            w90Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21421q5, g6Var);
            org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
            w90Var.setGravity(17);
            frameLayout2.addView(w90Var, w7.z5.e(-2, -2, 17));
            z3Var.addView(frameLayout2, w7.z5.n(-1, -2));
            int i16 = UserConfig.selectedAccount;
            c2 c2Var = new c2(i16, w90Var, 1);
            c2Var.run();
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new x2(c2Var, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        }
        if (z10) {
            ei.d dVar = new ei.d(context, g6Var, false);
            dVar.i(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new ai.ia(od0Var3, i15, w2Var, 6));
            z3Var.addView(dVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int i17 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
        int i18 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i18, g6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i17);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i18);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView2, j02, O, O2, g6Var);
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
        z3Var.addView(textView2, w7.z5.t(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new ai.ob(od0Var, od0Var2, od0Var3, i15, b3Var, callback));
        if (z11) {
            ei.d dVar2 = new ei.d(context, g6Var, false);
            dVar2.i(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new org.telegram.ui.ActionBar.s1(24, b3Var, callback));
            z3Var.addView(dVar2, w7.z5.t(-1, 48, 83, 16, 4, 16, 16));
        }
        b3Var.b(z3Var);
        return b3Var;
    }

    public static void l0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(c2Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.o2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.m(org.telegram.ui.ActionBar.o2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        e.addView(new ai.f6(context, tL_starGiftUnique, userOrChat), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.tl.r(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        e.addView(textView, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.o(e);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new a1(1, runnable));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void n(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        w90 w90Var = new w90(context, null);
        NotificationCenter.listenEmojiLoading(w90Var);
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21290j5, null);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, null);
        w90Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w90Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f20679a.G = 6;
        alertDialog$Builder.o(frameLayout);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.u(AndroidUtilities.dp(18.0f));
        u9 u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(u9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        n5Var.setTextSize(20);
        n5Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(user.first_name, false);
        if (user.scam) {
            n5Var.i(org.telegram.ui.ActionBar.k6.f21232g1);
        } else if (user.fake) {
            n5Var.i(org.telegram.ui.ActionBar.k6.f21251h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int i20 = org.telegram.ui.ActionBar.k6.f21592z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate, i20, null, mode);
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            org.telegram.ui.ActionBar.r6.z(n5Var, mutate2, org.telegram.ui.ActionBar.k6.A9, null, mode);
            n5Var.i(new wq(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21346m5, null);
        org.telegram.messenger.tl.u(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, o2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        vq vqVar = new vq(R.drawable.attach_arrow_right, 0);
        vqVar.setTopOffset(1);
        vqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(vqVar, valueOf.length() - 1, valueOf.length(), 33);
        textView.setText(valueOf);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i21 = i14 | 48;
        int i22 = 76;
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
        frameLayout.addView(n5Var, w7.z5.d(-1, -2.0f, i21, f7, 0.0f, i16, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i17 = 5;
        } else {
            i17 = 3;
        }
        int i23 = i17 | 48;
        if (z11) {
            i18 = 21;
        } else {
            i18 = 76;
        }
        float f10 = i18;
        if (!z11) {
            i22 = 21;
        }
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, i23, f10, 24.0f, i22, 0.0f));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(w90Var, w7.z5.d(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            f9Var.f26245p = 0.8f;
            f9Var.g(12);
            u9Var.h(null, null, f9Var, user);
        } else {
            f9Var.f26245p = 1.0f;
            f9Var.m(o2Var.getCurrentAccount(), user);
            u9Var.e(user, f9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener q0Var = new q0(3, runnable2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        o2Var.showDialog(c2Var, false, q0Var);
        w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new k1(0, context, c2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.g6 g6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i11);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
        final org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1, g6Var);
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
        z1Var.setOnClickListener(new h1(z1Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(z1Var, w7.z5.t(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.f20679a.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
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
        c2VarArr[0] = alertDialog$Builder.p();
    }

    public static org.telegram.ui.ActionBar.b3 o(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(activity, g6Var);
        b3Var.a();
        od0 od0Var = new od0(activity, g6Var);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        od0 od0Var2 = new od0(activity, g6Var);
        od0Var2.setItemCount(5);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        od0 od0Var3 = new od0(activity, g6Var);
        od0Var3.setItemCount(5);
        od0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        n4 n4Var = new n4(activity, od0Var, od0Var2, od0Var3);
        n4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        n4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var, 1, 20.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(od0Var, w7.z5.l(0.25f, 0, 270));
        od0Var.setMinValue(1);
        od0Var.setMaxValue(31);
        od0Var.setWrapSelectorWheel(false);
        od0Var.setFormatter(new org.telegram.ui.tr(10));
        l0 l0Var = new l0(od0Var, od0Var2, od0Var3, 0);
        od0Var.setOnValueChangedListener(l0Var);
        od0Var2.setMinValue(0);
        od0Var2.setMaxValue(11);
        od0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(od0Var2, w7.z5.l(0.5f, 0, 270));
        od0Var2.setFormatter(new org.telegram.ui.tr(11));
        od0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        od0Var3.setMinValue(i10);
        od0Var3.setMaxValue(i11);
        od0Var3.setWrapSelectorWheel(false);
        od0Var3.setFormatter(new org.telegram.ui.tr(12));
        linearLayout.addView(od0Var3, w7.z5.l(0.25f, 0, 270));
        od0Var3.setOnValueChangedListener(l0Var);
        od0Var.setValue(31);
        od0Var2.setValue(12);
        od0Var3.setValue(i11);
        b(od0Var, od0Var2, od0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        int i13 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView2, j02, O, O2, g6Var);
        n4Var.addView(textView2, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new m0(od0Var, od0Var2, od0Var3, calendar, intCallback, b3Var, 0));
        b3Var.b(n4Var);
        return b3Var;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        String u10;
        LinearLayout e;
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
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                p2 p2Var = new p2(context, str, j10, z11, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(u10);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
                org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.06f, i10);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
                e = org.telegram.messenger.tl.e(context, 1);
                e.addView(textView, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = t91.f30767f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    t91 t91Var = new t91(context, g6Var);
                    t91Var.setWebPage(webPage);
                    e.addView(t91Var, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.o(e);
                c2Var.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(p2Var, 8));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            u10 = str;
            p2 p2Var2 = new p2(context, str, j10, z11, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
            c2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(u10);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.k6.f21290j5;
            org.telegram.ui.ActionBar.r6.W(textView2, i102, g6Var);
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            ShapeDrawable c022 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i102, g6Var)));
            org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.06f, i102);
            textView2.setBackground(c022);
            org.telegram.ui.ActionBar.r6.k(textView2, c022, M2, null, g6Var);
            e = org.telegram.messenger.tl.e(context, 1);
            e.addView(textView2, w7.z5.k(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = t91.f30767f;
            if (webPage != null) {
                t91 t91Var2 = new t91(context, g6Var);
                t91Var2.setWebPage(webPage);
                e.addView(t91Var2, w7.z5.k(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.o(e);
            c2Var2.f20743a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(p2Var2, 8));
            i2.o1.s(R.string.Cancel, alertDialog$Builder2, null);
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

    public static void p(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (o2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(o2Var.getCurrentAccount()).getClientUserId() != user.f20491id) {
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
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
            f9Var.u(AndroidUtilities.dp(12.0f));
            f9Var.f26245p = 1.0f;
            f9Var.m(o2Var.getCurrentAccount(), user);
            u9 u9Var = new u9(parentActivity);
            u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            u9Var.e(user, f9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(u9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
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
            frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new ai.e4(o2Var, user, z10, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            o2Var.showDialog(alertDialog$Builder.f20679a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11) {
        q0(o2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.o2 r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, org.telegram.messenger.MessagesStorage.BooleanCallback r37, org.telegram.ui.ActionBar.g6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.q(org.telegram.ui.ActionBar.o2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, pf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.g6 g6Var) {
        long j10;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (o2Var instanceof org.telegram.ui.sn) {
                j10 = ((org.telegram.ui.sn) o2Var).f41663r8;
            } else {
                j10 = 0;
            }
            o0(o2Var.getParentActivity(), str, z10, z11, z12, z13, j10, cVar, webPage, g6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (o2Var != null) {
            g6Var = o2Var.getResourceProvider();
        } else {
            g6Var = null;
        }
        s(o2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, g6Var);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.Cells.b1.v(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i12));
            a(l6Var, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.b(charSequence, z11);
            int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 2, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            l6Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(l6Var, g02, null, O, null);
            linearLayout.addView(l6Var);
            l6Var.setOnClickListener(new ai.v0(arrayList2, runnable, alertDialog$Builder, 17));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.c2 p5 = alertDialog$Builder.p();
        if (z10) {
            p5.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.o2 r46, final boolean r47, final boolean r48, org.telegram.tgnet.TLRPC.Chat r49, final org.telegram.tgnet.TLRPC.User r50, final boolean r51, final boolean r52, boolean r53, final boolean r54, final org.telegram.messenger.MessagesStorage.BooleanCallback r55, final org.telegram.ui.ActionBar.g6 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.s(org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.g6):void");
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        if (i10 != 0 && o2Var != null && o2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            o2Var.showDialog(alertDialog$Builder.f20679a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.c2 t(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.v0.c("color_", sharedPrefKey, notificationsSettings, -16776961);
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
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(activity, g6Var);
            l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            l6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.y8.e[i13];
            l6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.y8.f23992f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            l6Var.b(str, z10);
            f7.addView(l6Var);
            l6Var.setOnClickListener(new p1(f7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i16 != 0) {
                    edit.putInt(si.o0.h("color_", sharedPrefKey), iArr2[0]);
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
        alertDialog$Builder.i(LocaleController.getString(R.string.LedDisabled), new j2.c(j10, i10, runnable, 5));
        if (i12 != 0) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new o2(3, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f20679a;
    }

    public static org.telegram.ui.ActionBar.c2 t0(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        if (o2Var == null) {
            o2Var = LaunchActivity.U();
        }
        if (str2 != null && o2Var != null && o2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = N(o2Var.getParentActivity(), str, str2, null, null, g6Var).f20679a;
            o2Var.showDialog(c2Var);
            return c2Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.o2 o2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new o2(0, str3, o2Var));
        o2Var.showDialog(c2Var);
    }

    public static org.telegram.ui.ActionBar.c2 u0(org.telegram.ui.ActionBar.o2 o2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.c2 O = O(o2Var.getContext(), o2Var.getResourceProvider(), str, charSequence, str2, runnable);
        o2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i10 = R.raw.permission_request_contacts;
        int i11 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
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
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
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

    public static void v0(org.telegram.ui.ActionBar.o2 o2Var, String str) {
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

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, hg.b2 b2Var) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final od0 od0Var = new od0(context, null);
        final od0 od0Var2 = new od0(context, null);
        final od0 od0Var3 = new od0(context, null);
        linearLayout.addView(od0Var2, w7.z5.l(0.3f, 0, -2));
        od0Var2.setOnScrollListener(new ld0() {
            @Override
            public final void i(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        od0Var.setMinValue(0);
        od0Var.setMaxValue(11);
        linearLayout.addView(od0Var, w7.z5.l(0.3f, 0, -2));
        od0Var.setFormatter(new org.telegram.ui.tr(18));
        od0Var.setOnValueChangedListener(new l0(od0Var2, od0Var, od0Var3, 1));
        od0Var.setOnScrollListener(new ld0() {
            @Override
            public final void i(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        od0Var3.setMinValue(i10 + i16);
        od0Var3.setMaxValue(i11 + i16);
        od0Var3.setValue(i16 + i12);
        linearLayout.addView(od0Var3, w7.z5.l(0.4f, 0, -2));
        od0Var3.setOnValueChangedListener(new l0(od0Var2, od0Var, od0Var3, 2));
        od0Var3.setOnScrollListener(new ld0() {
            @Override
            public final void i(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            d5.d(od0Var2, od0Var, od0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(od0Var2, od0Var, od0Var3);
        if (z10) {
            d(od0Var2, od0Var, od0Var3);
        }
        if (i13 != -1) {
            od0Var2.setValue(i13);
            od0Var.setValue(i14);
            od0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20679a.R = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.lk(z10, od0Var2, od0Var, od0Var3, b2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.c2 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.p();
    }

    public static void x(Context context, String str, String str2, long j10, b5 b5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(context, null);
        b3Var.a();
        od0 od0Var = new od0(context, null);
        od0Var.setTextColor(x02);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
        od0 od0Var2 = new od0(context, null);
        od0Var2.setItemCount(5);
        od0Var2.setTextColor(x02);
        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        od0 od0Var3 = new od0(context, null);
        od0Var3.setItemCount(5);
        od0Var3.setTextColor(x02);
        od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        od0 od0Var4 = od0Var;
        v3 v3Var = new v3(context, od0Var4, od0Var2, od0Var3, 1);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        v3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        ai.wd wdVar = new ai.wd(context, 15);
        linearLayout.addView(od0Var4, w7.z5.l(0.5f, 0, 270));
        od0Var4.setMinValue(0);
        od0Var4.setMaxValue(365);
        od0Var4.setWrapSelectorWheel(false);
        od0Var4.setFormatter(new org.telegram.ui.tr(21));
        ai.u2 u2Var = new ai.u2(od0Var4, od0Var2, od0Var3, 19);
        od0Var4.setOnValueChangedListener(u2Var);
        od0Var2.setMinValue(0);
        od0Var2.setMaxValue(23);
        linearLayout.addView(od0Var2, w7.z5.l(0.2f, 0, 270));
        od0Var2.setFormatter(new org.telegram.ui.tr(22));
        od0Var2.setOnValueChangedListener(u2Var);
        od0Var3.setMinValue(0);
        od0Var3.setMaxValue(59);
        od0Var3.setValue(0);
        od0Var3.setFormatter(new org.telegram.ui.tr(23));
        linearLayout.addView(od0Var3, w7.z5.l(0.3f, 0, 270));
        od0Var3.setOnValueChangedListener(u2Var);
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
                od0Var3.setValue(calendar.get(12));
                od0Var2.setValue(calendar.get(11));
                od0Var4 = od0Var4;
                od0Var4.setValue(timeInMillis);
            } else {
                od0Var4 = od0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, od0Var4, od0Var2, od0Var3);
        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        wdVar.setGravity(17);
        wdVar.setTextColor(x04);
        wdVar.setTextSize(1, 14.0f);
        wdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x05, x06, x06));
        wdVar.setText(str2);
        v3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
        wdVar.setOnClickListener(new m0(od0Var4, od0Var2, od0Var3, calendar, b5Var, b3Var, 2));
        b3Var.b(v3Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
        h3Var.show();
        h3Var.setBackgroundColor(x03);
        h3Var.fixNavigationBar(x03);
    }

    public static void x0(od0 od0Var, od0 od0Var2, od0 od0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, od0Var2.getValue());
        calendar.set(1, od0Var3.getValue());
        od0Var.setMinValue(1);
        od0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.o2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.g6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d5.y(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.g6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        m30 m30Var = new m30(0, context, true);
        m30Var.setImportantForAccessibility(2);
        ah.x xVar = new ah.x(context, m30Var);
        xVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        xVar.setClipToOutline(true);
        xVar.setOutlineProvider(new ci.n1(11));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        xVar.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        xVar.addView(m30Var, w7.z5.c(117.0f, 117));
        alertDialog$Builder.f20679a.V = xVar;
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.f20769l0 = true;
        c2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f20679a.Q0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
