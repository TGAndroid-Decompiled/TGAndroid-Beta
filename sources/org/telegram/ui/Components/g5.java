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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.xg1;
public abstract class g5 {
    public static final Pattern f28387a = Pattern.compile("^([a-zA-Z][a-zA-Z0-9+\\-.]*://)?([a-zA-Z0-9\\-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[^\\s]*)?$");

    public static AlertDialog$Builder A(Activity activity, xg1 xg1Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String readRes = AndroidUtilities.readRes(R.raw.pip_video_request);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-14535089, -14527894}));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ag.v0(12));
        View view = new View(activity);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(161.36752f), false)));
        frameLayout.addView(view, kb1.h(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        alertDialog$Builder.f22369a.V = frameLayout;
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherApps);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new di.f(8, activity, z10));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.f22582l0 = true;
        e2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), xg1Var);
        alertDialog$Builder.f22369a.Q0 = 0.50427353f;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.e2 B(LaunchActivity launchActivity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.LowDiskSpaceTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.LowDiskSpaceMessage2);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.LowDiskSpaceButton), new g1(launchActivity, 1));
        return alertDialog$Builder.f22369a;
    }

    public static org.telegram.ui.ActionBar.e2 C(Activity activity) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
        int i10 = R.raw.permission_request_location;
        int i11 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(activity, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22369a;
    }

    public static org.telegram.ui.ActionBar.e2 D(Activity activity, boolean z10, TLRPC.User user, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        int i11;
        int x02;
        boolean z11;
        int[] iArr = new int[1];
        String[] strArr = {LocaleController.getString(R.string.SendLiveLocationFor15m), LocaleController.getString(R.string.SendLiveLocationFor1h), LocaleController.getString(R.string.SendLiveLocationFor8h), LocaleController.getString(R.string.SendLiveLocationForever)};
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(activity);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertExpandMessage));
        } else if (user != null) {
            textView.setText(LocaleController.formatString(R.string.LiveLocationAlertPrivate, UserObject.getFirstName(user)));
        } else {
            textView.setText(LocaleController.getString(R.string.LiveLocationAlertGroup));
        }
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
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
        f7.addView(textView, kb1.x(-2, -2, i13, 24, i11, 24, 8));
        for (int i14 = 0; i14 < 4; i14++) {
            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(activity, u6Var);
            p6Var.d = 42;
            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p6Var.setTag(Integer.valueOf(i14));
            a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, u6Var);
            String str = strArr[i14];
            if (iArr[0] == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            p6Var.b(str, z11);
            f7.addView(p6Var);
            p6Var.setOnClickListener(new r1(iArr, f7));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        if (z10) {
            e2Var.R = LocaleController.getString(R.string.LiveLocationAlertExpandTitle);
        } else {
            int i15 = org.telegram.ui.ActionBar.y6.L5;
            if (u6Var != null) {
                x02 = u6Var.e(i15);
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, i15, false);
            }
            e2Var.f22560b0 = new or0(activity, 0);
            e2Var.f22563c0 = x02;
            e2Var.f22565d0 = -1;
            if (u6Var == null) {
                alertDialog$Builder.n(org.telegram.ui.ActionBar.y6.L5, null);
            }
        }
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareFile), new p1(1, iArr, intCallback));
        alertDialog$Builder.i(LocaleController.getString(R.string.Cancel), null);
        return e2Var;
    }

    public static org.telegram.ui.ActionBar.k3 E(final long j10, final long j11, final org.telegram.ui.ActionBar.r2 r2Var, final org.telegram.ui.ActionBar.u6 u6Var) {
        if (r2Var.getParentActivity() == null) {
            return null;
        }
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) r2Var.getParentActivity(), u6Var, false);
        k3Var.fixNavigationBar();
        k3Var.title = LocaleController.getString(R.string.Notifications);
        k3Var.bigTitle = true;
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
                org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                if (wc.a(r2Var2)) {
                    wc.z(r2Var2, i11, 0, u6Var).j();
                }
            }
        };
        k3Var.items = charSequenceArr;
        k3Var.onClickListener = onClickListener;
        return k3Var;
    }

    public static void F(Context context, org.telegram.ui.ActionBar.u6 u6Var, e5 e5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        if (u6Var != null) {
            x02 = u6Var.e(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.y6.f23428h5;
        if (u6Var != null) {
            x03 = u6Var.e(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        }
        int i12 = org.telegram.ui.ActionBar.y6.Ji;
        if (u6Var != null) {
            u6Var.e(i12);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        }
        int i13 = org.telegram.ui.ActionBar.y6.Ni;
        if (u6Var != null) {
            u6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.y6.E8;
        if (u6Var != null) {
            u6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.y6.G8;
        if (u6Var != null) {
            u6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.y6.f23449i6;
        if (u6Var != null) {
            u6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.y6.Sh;
        if (u6Var != null) {
            x04 = u6Var.e(i17);
        } else {
            x04 = org.telegram.ui.ActionBar.y6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.y6.Oh;
        if (u6Var != null) {
            x05 = u6Var.e(i18);
        } else {
            x05 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
        }
        int i19 = x05;
        if (u6Var != null) {
            x06 = u6Var.e(org.telegram.ui.ActionBar.y6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        }
        int i20 = x06;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        int[] iArr = {30, 60, 120, 180, 480, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        p4 p4Var = new p4(context, u6Var, iArr);
        p4Var.setMinValue(0);
        p4Var.setMaxValue(20);
        p4Var.setTextColor(x02);
        p4Var.setValue(0);
        p4Var.setFormatter(new f1(0, iArr));
        l4 l4Var = new l4(context, p4Var, 1);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.MuteForAlert));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        bi.md mdVar = new bi.md(context, 19);
        linearLayout.addView(p4Var, kb1.p(1.0f, 0, 270));
        p4Var.setOnValueChangedListener(new org.telegram.ui.cg(18));
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, i19, i20, i20));
        mdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
        l4Var.addView(mdVar, kb1.x(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new di.c4(iArr, p4Var, e5Var, e3Var, 6));
        e3Var.b(l4Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        k3Var.setBackgroundColor(x03);
        k3Var.fixNavigationBar(x03);
    }

    public static AlertDialog$Builder G(Context context, String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22369a.R = str;
        HashMap hashMap = new HashMap();
        int i10 = org.telegram.ui.ActionBar.y6.L5;
        hashMap.put("info1", Integer.valueOf(org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        hashMap.put("info2", Integer.valueOf(org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        alertDialog$Builder.m(R.raw.not_available, 52, org.telegram.ui.ActionBar.y6.x0(null, i10, false), hashMap);
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.f22369a.W = true;
        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
        alertDialog$Builder.f22369a.T = str2;
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.e2 H(Activity activity, long j10, final long j11, int i10, final Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
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
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        int i14 = 0;
        while (i14 < strArr2.length) {
            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(activity, u6Var);
            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p6Var.setTag(Integer.valueOf(i14));
            a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, u6Var);
            String str = strArr2[i14];
            if (iArr[0] == i14) {
                z10 = z11;
            } else {
                z10 = false;
            }
            p6Var.b(str, z10);
            f7.addView(p6Var);
            p6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f22369a.N0.run();
                    runnable.run();
                }
            });
            i14++;
            j12 = j10;
            i11 = i10;
            z11 = true;
        }
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.NotificationsImportance);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22369a;
    }

    public static void I(int i10, Activity activity, long j10, TLRPC.Photo photo, di.b bVar) {
        if (activity != null) {
            ai.c1 c1Var = new ai.c1(i10, j10, photo, activity, bVar);
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, (org.telegram.ui.ActionBar.u6) bVar, true);
            k3Var.fixNavigationBar();
            k3Var.title = LocaleController.getString(R.string.ReportProfilePhoto);
            k3Var.bigTitle = true;
            c3 c3Var = new c3(new int[]{0, 6, 1, 2, 3, 4, 5, 100}, activity, bVar, c1Var, 0);
            k3Var.items = new CharSequence[]{LocaleController.getString(R.string.ReportChatSpam), LocaleController.getString(R.string.ReportChatFakeAccount), LocaleController.getString(R.string.ReportChatViolence), LocaleController.getString(R.string.ReportChatChild), LocaleController.getString(R.string.ReportChatIllegalDrugs), LocaleController.getString(R.string.ReportChatPersonalDetails), LocaleController.getString(R.string.ReportChatPornography), LocaleController.getString(R.string.ReportChatOther)};
            k3Var.itemIcons = new int[]{R.drawable.msg_clearcache, R.drawable.msg_report_fake, R.drawable.msg_report_violence, R.drawable.msg_block2, R.drawable.msg_report_drugs, R.drawable.msg_report_personal, R.drawable.msg_report_xxx, R.drawable.msg_report_other};
            k3Var.onClickListener = c3Var;
            k3Var.show();
        }
    }

    public static org.telegram.ui.ActionBar.e3 J(final Context context, final long j10, long j11, int i10, boolean z10, final e5 e5Var, Runnable runnable, d5 d5Var, org.telegram.ui.ActionBar.u6 u6Var) {
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
        org.telegram.ui.ActionBar.w0 w0Var;
        int i13;
        Calendar calendar;
        int i14;
        int i15;
        int[] iArr;
        String[] strArr;
        org.telegram.ui.ActionBar.w0 w0Var2;
        View view;
        yj0 yj0Var;
        Calendar calendar2;
        int[] iArr2;
        int i16;
        ViewGroup viewGroup3;
        int i17;
        String[] strArr2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        View view2;
        int i18;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if (context == null) {
            return null;
        }
        final int[] iArr3 = {i10};
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        final ?? nd0Var = new nd0(context, u6Var);
        int i19 = d5Var.f27339a;
        int i20 = d5Var.f27341c;
        int i21 = d5Var.f27340b;
        nd0Var.setTextColor(i19);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        final ?? nd0Var2 = new nd0(context, u6Var);
        nd0Var2.setWrapSelectorWheel(true);
        nd0Var2.setAllItemsCount(24);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextColor(i19);
        nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? nd0Var3 = new nd0(context, u6Var);
        nd0Var3.setWrapSelectorWheel(true);
        nd0Var3.setAllItemsCount(60);
        nd0Var3.setItemCount(5);
        nd0Var3.setTextColor(i19);
        nd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        ViewGroup frameLayout4 = new FrameLayout(context);
        ?? y3Var = new y3(context, nd0Var, nd0Var2, nd0Var3, 0);
        y3Var.setClipToPadding(false);
        y3Var.setClipChildren(false);
        y3Var.setOrientation(1);
        frameLayout4.addView((View) y3Var, kb1.g(-1.0f, -1));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout4.addView(frameLayout5, kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout6 = new FrameLayout(context);
        y3Var.addView(frameLayout6, kb1.x(-1, -2, 51, 22, 0, 0, 4));
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
        textView5.setTextColor(i19);
        textView5.setTextSize(1, 20.0f);
        textView5.setTypeface(AndroidUtilities.bold());
        frameLayout6.addView(textView5, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView5.setOnTouchListener(new ei.d(10));
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
            w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, d5Var.f27339a, false, u6Var);
            context2 = context;
            w0Var.setLongClickEnabled(false);
            w0Var.setSubMenuOpenSide(2);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setBackground(org.telegram.ui.ActionBar.y6.g0(i20, 1, -1));
            frameLayout3.addView(w0Var, kb1.h(40, 40.0f, 53, 0.0f, 8.0f, 5.0f, 0.0f));
            w0Var.g(1, LocaleController.formatString(R.string.ScheduleWhenOnline, firstName));
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
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
            w0Var = null;
        }
        if (w0Var != null) {
            w0Var.setOnClickListener(new org.telegram.ui.ActionBar.u1(21, w0Var, d5Var));
            w0Var.setDelegate(new androidx.car.app.utils.a(e5Var, zArr, e3Var, 20));
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
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(i20, 1, i12));
        if (w0Var != null) {
            i13 = 42;
        } else {
            i13 = r82;
        }
        frameLayout3.addView(imageView, kb1.h(40, 40.0f, 53, 0.0f, 8.0f, i13 + 8, 0.0f));
        ?? linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(r82);
        linearLayout.setWeightSum(1.0f);
        viewGroup2.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar3 = Calendar.getInstance();
        final bi.md mdVar = new bi.md(context2, 14);
        linearLayout.addView(nd0Var, kb1.p(0.5f, r82, 270));
        nd0Var.setMinValue(r82);
        nd0Var.setMaxValue(365);
        nd0Var.setWrapSelectorWheel(r82);
        nd0Var.setFormatter(new f2(8));
        ViewGroup viewGroup4 = viewGroup2;
        final long j13 = j12;
        int i22 = i11;
        final boolean[] zArr3 = zArr;
        ld0 ld0Var = new ld0() {
            @Override
            public final void q(nd0 nd0Var4, int i23) {
                int i24;
                if (j13 == j10) {
                    i24 = 1;
                } else {
                    i24 = 0;
                }
                g5.g(bi.md.this, null, 0L, 0L, i24, nd0Var, nd0Var2, nd0Var3);
            }
        };
        nd0Var.setOnValueChangedListener(ld0Var);
        nd0Var2.setMinValue(r82);
        nd0Var2.setMaxValue(23);
        org.telegram.ui.ActionBar.w0 w0Var3 = w0Var;
        linearLayout.addView(nd0Var2, kb1.p(0.2f, r82, 270));
        nd0Var2.setFormatter(new f2(9));
        nd0Var2.setOnValueChangedListener(ld0Var);
        nd0Var3.setMinValue(r82);
        nd0Var3.setMaxValue(59);
        nd0Var3.setValue(r82);
        nd0Var3.setFormatter(new f2(10));
        linearLayout.addView(nd0Var3, kb1.p(0.3f, r82, 270));
        nd0Var3.setOnValueChangedListener(ld0Var);
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
                nd0Var3.setValue(calendar.get(12));
                nd0Var2.setValue(calendar.get(11));
                nd0Var.setValue(timeInMillis);
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
        g(mdVar, null, 0L, 0L, i14, nd0Var, nd0Var2, nd0Var3);
        boolean isTestBackend = ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend();
        if (isTestBackend) {
            i15 = 8;
            iArr = new int[]{0, 60, 300, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        } else {
            i15 = 8;
            iArr = new int[]{0, 86400, 604800, 1209600, 2592000, 7862400, 15724800, 31536000};
        }
        if (isTestBackend) {
            strArr = new String[10];
            strArr[0] = LocaleController.getString(R.string.MessageScheduledRepeatOptionNever);
            strArr[1] = "Every minute";
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
            i16 = i22;
            int v = org.telegram.ui.ActionBar.y6.v(i16, org.telegram.ui.ActionBar.y6.o1(0.075f, i19));
            String[] strArr3 = strArr;
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, i19);
            textView4 = new TextView(context2);
            view = imageView;
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(i19);
            textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int dp = AndroidUtilities.dp(14.0f);
            int v10 = org.telegram.ui.ActionBar.y6.v(v, o12);
            textView4.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, v, v10, v10));
            textView4.setGravity(17);
            int[] iArr4 = iArr;
            i17 = 17;
            strArr2 = strArr3;
            yj0Var = yj0Var2;
            w0Var2 = w0Var3;
            ?? v0Var = new m4.v0(iArr4, iArr3, strArr2, textView4, 24);
            iArr2 = iArr4;
            v0Var.run();
            frameLayout7.addView(textView4, kb1.h(-2, 28.0f, 1, 32.0f, 4.0f, 32.0f, 5.0f));
            ViewGroup viewGroup5 = viewGroup4;
            viewGroup5.addView((View) frameLayout7, kb1.r(-1, -2));
            textView3 = v0Var;
            textView2 = frameLayout7;
            viewGroup3 = viewGroup5;
        } else {
            w0Var2 = w0Var3;
            view = imageView;
            yj0Var = yj0Var2;
            calendar2 = calendar;
            iArr2 = iArr;
            i16 = i22;
            viewGroup3 = viewGroup4;
            i17 = 17;
            strArr2 = strArr;
            textView2 = textView;
            textView3 = textView2;
            textView4 = textView3;
        }
        ?? r55 = textView2;
        ?? r56 = textView3;
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(i17);
        mdVar.setTextColor(d5Var.f27343g);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, d5Var.h));
        viewGroup3.addView(mdVar, kb1.x(-1, 48, 83, 16, 15, 16, 16));
        View view3 = view;
        final Calendar calendar4 = calendar2;
        mdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                int i23;
                Runnable runnable2;
                zArr4[0] = false;
                if (j13 == j10) {
                    i23 = 1;
                } else {
                    i23 = 0;
                }
                nd0 nd0Var4 = nd0Var;
                w3 w3Var = nd0Var2;
                x3 x3Var = nd0Var3;
                boolean g7 = g5.g(null, null, 0L, 0L, i23, nd0Var4, w3Var, x3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar5 = calendar4;
                calendar5.setTimeInMillis(currentTimeMillis);
                calendar5.add(6, nd0Var4.getValue());
                calendar5.set(11, w3Var.getValue());
                calendar5.set(12, x3Var.getValue());
                if (g7) {
                    calendar5.set(13, 0);
                    calendar5.set(14, 0);
                }
                boolean z11 = zArr3[0];
                e5Var.G((int) (calendar5.getTimeInMillis() / 1000), iArr3[0], z11);
                runnable2 = e3Var.f22602a.dismissRunnable;
                runnable2.run();
            }
        });
        e3Var.b(viewGroup);
        String[] strArr4 = strArr2;
        final org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        k3Var.setOnDismissListener(new q2(runnable, zArr4));
        k3Var.setBackgroundColor(i16);
        k3Var.fixNavigationBar(i16);
        if (textView4 != null) {
            view2 = view3;
            i18 = 1;
            textView4.setOnClickListener(new d2(frameLayout2, u6Var, k3Var, (FrameLayout) r55, iArr2, strArr4, iArr3, (m4.v0) r56));
        } else {
            view2 = view3;
            i18 = 1;
        }
        final fi.v3[] v3VarArr = new fi.v3[i18];
        final org.telegram.ui.ActionBar.w0 w0Var4 = w0Var2;
        final yj0 yj0Var3 = yj0Var;
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
                yj0 yj0Var4 = yj0Var3;
                if (!z11) {
                    if (yj0Var4.f35067a0 >= 40) {
                        yj0Var4.M(0);
                    }
                    yj0Var4.P(40);
                    yj0Var4.start();
                } else {
                    if (yj0Var4.f35067a0 < 40) {
                        yj0Var4.M(40);
                    }
                    yj0Var4.P(80);
                    yj0Var4.start();
                }
                fi.v3[] v3VarArr2 = v3VarArr;
                fi.v3 v3Var = v3VarArr2[0];
                if (v3Var != null) {
                    v3Var.e(true);
                    v3VarArr2[0] = null;
                }
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                long j15 = j10;
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(j15));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j15));
                fi.v3 v3Var2 = new fi.v3(context, 3);
                v3VarArr2[0] = v3Var2;
                v3Var2.r();
                v3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                v3Var2.q(20.0f);
                float dp2 = AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(4.0f);
                int o13 = org.telegram.ui.ActionBar.y6.o1(0.25f, -16777216);
                v3Var2.f11794i0 = dp2;
                v3Var2.f11795j0 = dp3;
                v3Var2.f11796k0 = o13;
                v3Var2.F.setShadowLayer(dp2, 0.0f, dp3, o13);
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
                v3Var2.s(string);
                v3Var2.d = 5000L;
                if (w0Var4 != null) {
                    i26 = 42;
                } else {
                    i26 = -8;
                }
                v3Var2.l(1.0f, -(i26 + 20));
                v3Var2.f11797l0 = new pg(v3Var2, 2);
                org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                k3Var2.getContainerView().setClipToPadding(false);
                k3Var2.getContainerView().setClipChildren(false);
                k3Var2.getContainerView().addView(v3Var2, kb1.h(-1, 200.0f, 48, 0.0f, -194.0f, 0.0f, 0.0f));
                v3Var2.u();
            }
        });
        return e3Var;
    }

    public static void K(Context context, long j10, e5 e5Var) {
        J(context, j10, -1L, 0, false, e5Var, null, new d5(null), null);
    }

    public static void L(Context context, long j10, e5 e5Var, org.telegram.ui.ActionBar.u6 u6Var) {
        J(context, j10, -1L, 0, false, e5Var, null, new d5(u6Var), u6Var);
    }

    public static AlertDialog$Builder M(Context context, String str, String str2) {
        return N(context, str, str2, null, null, null);
    }

    public static AlertDialog$Builder N(Context context, String str, String str2, String str3, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
        if (context == null || str2 == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        if (str == null) {
            str = LocaleController.getString(R.string.AppName);
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = str;
        e2Var.T = str2;
        if (str3 == null) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            return alertDialog$Builder;
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(str3, new b1(5, runnable));
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.e2 O(Context context, org.telegram.ui.ActionBar.u6 u6Var, String str, CharSequence charSequence, String str2, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = str;
        e2Var.T = charSequence;
        alertDialog$Builder.k(str2, new b1(4, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22369a;
    }

    public static org.telegram.ui.ActionBar.o1 P(org.telegram.ui.ActionBar.r2 r2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, View view, float f7, float f10) {
        if (r2Var != null && view != null) {
            org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
            o1Var.e = true;
            o1Var.f22910c = 220;
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
            o1Var.showAtLocation(view.getRootView(), 0, (int) ((f11 + f7) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) ((f12 + f10) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2.0f)));
            o1Var.b();
            return o1Var;
        }
        return null;
    }

    public static void Q(Context context, org.telegram.ui.ActionBar.r2 r2Var, String str, String str2, String str3, String str4, int i10, String str5, org.telegram.ui.ActionBar.u6 u6Var, MessagesStorage.StringCallback stringCallback) {
        View view;
        String str6;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        if (str == null) {
            str6 = LocaleController.getString(R.string.AppName);
        } else {
            str6 = str;
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = str6;
        e2Var.T = str2;
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, u6Var);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.Xh, u6Var);
        editTextBoldCursor.setHint(str3);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(147457);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(11.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.y6.f23598q6, u6Var);
        if (str4 != null) {
            editTextBoldCursor.setText(str4);
        }
        editTextBoldCursor.setOnEditorActionListener(new jg.q(editTextBoldCursor, i10, stringCallback, e2VarArr, view, 1));
        editTextBoldCursor.addTextChangedListener(new a4(i10, editTextBoldCursor));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.06f, i11);
        editTextBoldCursor.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(editTextBoldCursor, c02, L, null, u6Var);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        d.addView((View) editTextBoldCursor, kb1.o(20.0f, 9.0f, 20.0f, 9.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(d);
        alertDialog$Builder.f22369a.f22556a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(str5, new i2.z((Object) editTextBoldCursor, i10, stringCallback, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.cg(28));
        e2VarArr[0] = alertDialog$Builder.f22369a;
        if (r2Var != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, r2Var.getClassGuid());
        }
        org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
        e2Var2.f22578j0 = false;
        e2Var2.setOnDismissListener(new hi.y0(editTextBoldCursor, r2Var, findActivity, 2));
        e2VarArr[0].setOnShowListener(new e1(1, editTextBoldCursor));
        e2VarArr[0].show();
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void R(Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, MessagesStorage.StringCallback stringCallback) {
        Q(context, r2Var, LocaleController.getString(R.string.StoriesAlbumCreateNew), LocaleController.getString(R.string.StoriesAlbumAddHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), null, 12, LocaleController.getString(R.string.Create), u6Var, stringCallback);
    }

    public static org.telegram.ui.ActionBar.e3 S(Context context, long j10, final e5 e5Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        int i11;
        final int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
        int i17 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.y6.x0(null, i17, false);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        if (context == null) {
            return null;
        }
        final org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        final nd0 nd0Var = new nd0(context, u6Var);
        nd0Var.setTextColor(x02);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        final ?? nd0Var2 = new nd0(context, u6Var);
        nd0Var2.setWrapSelectorWheel(true);
        nd0Var2.setAllItemsCount(24);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextColor(x02);
        nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? nd0Var3 = new nd0(context, u6Var);
        nd0Var3.setWrapSelectorWheel(true);
        nd0Var3.setAllItemsCount(60);
        nd0Var3.setItemCount(5);
        nd0Var3.setTextColor(x02);
        nd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        y3 y3Var = new y3(context, nd0Var, nd0Var2, nd0Var3, 5);
        y3Var.setOrientation(1);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        y3Var.addView(d, kb1.x(-1, -2, 51, 22, 0, 22, 4));
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
        d.addView(textView, kb1.x(-2, -2, 51, 0, 12, 0, 0));
        textView.setOnTouchListener(new ei.d(10));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23768z6, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.PostSuggestionsAddTimeHint));
        d.addView(textView2, kb1.x(-2, -2, 51, 0, 2, 0, 0));
        textView2.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i18 = calendar.get(1);
        AppGlobalConfig.ConfigTime configTime = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMin;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final long j11 = configTime.get(timeUnit) * 2;
        final long j12 = MessagesController.getInstance(UserConfig.selectedAccount).config.starsSuggestedPostFutureMax.get(timeUnit) - 86400;
        final bi.md mdVar = new bi.md(context, 20);
        linearLayout.addView(nd0Var, kb1.p(0.5f, 0, 270));
        nd0Var.setMinValue(0);
        nd0Var.setMaxValue(365);
        nd0Var.setWrapSelectorWheel(false);
        nd0Var.setFormatter(new i2.w(i18, 8));
        if (i10 == 1) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        ld0 ld0Var = new ld0() {
            @Override
            public final void q(nd0 nd0Var4, int i19) {
                g5.g(bi.md.this, null, j11, j12, i12, nd0Var, nd0Var2, nd0Var3);
            }
        };
        nd0Var.setOnValueChangedListener(ld0Var);
        nd0Var2.setMinValue(0);
        nd0Var2.setMaxValue(23);
        linearLayout.addView((View) nd0Var2, kb1.p(0.2f, 0, 270));
        nd0Var2.setFormatter(new org.telegram.ui.cg(23));
        nd0Var2.setOnValueChangedListener(ld0Var);
        nd0Var3.setMinValue(0);
        nd0Var3.setMaxValue(59);
        nd0Var3.setValue(0);
        nd0Var3.setFormatter(new org.telegram.ui.cg(24));
        linearLayout.addView((View) nd0Var3, kb1.p(0.3f, 0, 270));
        nd0Var3.setOnValueChangedListener(ld0Var);
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
                nd0Var3.setValue(calendar.get(12));
                nd0Var2.setValue(calendar.get(11));
                nd0Var.setValue(timeInMillis);
            }
        } else {
            i13 = x03;
            i14 = i17;
            i15 = x04;
        }
        final boolean[] zArr = {true};
        g(mdVar, null, j11, j12, i12, nd0Var, nd0Var2, nd0Var3);
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(i15);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, x05));
        y3Var.addView(mdVar, kb1.x(-1, 48, 83, 16, 15, 16, 4));
        final int i19 = i12;
        mdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                long j14 = j11;
                long j15 = j12;
                int i20 = i19;
                nd0 nd0Var4 = nd0Var;
                v4 v4Var = nd0Var2;
                w4 w4Var = nd0Var3;
                boolean g7 = g5.g(null, null, j14, j15, i20, nd0Var4, v4Var, w4Var);
                long epochMilli = LocalDate.now().plusDays(nd0Var4.getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(epochMilli);
                calendar2.set(11, v4Var.getValue());
                calendar2.set(12, w4Var.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                }
                e5Var.G((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = e3Var.f22602a.dismissRunnable;
                runnable.run();
            }
        });
        kb1.c(mdVar, 0.02f, 1.2f);
        bi.md mdVar2 = new bi.md(context, 21);
        mdVar2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar2.setGravity(17);
        if (i10 == 1) {
            i16 = R.string.MessageSuggestionPublishNow;
        } else {
            i16 = R.string.PostSuggestionsAnytime;
        }
        mdVar2.setText(LocaleController.getString(i16));
        mdVar2.setTextColor(x05);
        mdVar2.setTextSize(1, 14.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i20 = org.telegram.ui.ActionBar.y6.f23357d6;
        int x06 = org.telegram.ui.ActionBar.y6.x0(null, i20, false);
        int i21 = i14;
        int x07 = org.telegram.ui.ActionBar.y6.x0(null, i21, false);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x06, x07, x07);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i20);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i21);
        mdVar2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(mdVar2, j02, N, N2, null);
        y3Var.addView(mdVar2, kb1.x(-1, 48, 83, 16, 0, 16, 16));
        mdVar2.setOnClickListener(new bi.w0(zArr, e5Var, e3Var, 15));
        kb1.c(mdVar2, 0.02f, 1.2f);
        e3Var.b(y3Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        k3Var.setOnDismissListener(new fi.e1(zArr));
        k3Var.setBackgroundColor(i13);
        k3Var.fixNavigationBar(i13);
        return e3Var;
    }

    public static org.telegram.ui.ActionBar.e2 T(org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        URLSpan[] uRLSpanArr;
        if (r2Var == null || r2Var.getParentActivity() == null) {
            return null;
        }
        aa0 aa0Var = new aa0(r2Var.getParentActivity(), r2Var.getResourceProvider());
        SpannableString spannableString = new SpannableString(Html.fromHtml(LocaleController.getString(R.string.AskAQuestionInfo).replace("\n", "<br>")));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new o4(r2Var, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        aa0Var.setText(spannableString);
        aa0Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.f23484k5, u6Var);
        org.telegram.ui.ActionBar.f7.D(aa0Var, org.telegram.ui.ActionBar.y6.f23502l5, u6Var);
        aa0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        aa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var);
        alertDialog$Builder.o(aa0Var);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AskAQuestion);
        alertDialog$Builder.k(LocaleController.getString(R.string.AskButton), new t2(1, r2Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22369a;
    }

    public static AlertDialog$Builder U(Context context, TLRPC.EncryptedChat encryptedChat, org.telegram.ui.ActionBar.u6 u6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.MessageLifetime);
        nd0 nd0Var = new nd0(context, null);
        nd0Var.setMinValue(0);
        nd0Var.setMaxValue(20);
        int i10 = encryptedChat.ttl;
        if (i10 > 0 && i10 < 16) {
            nd0Var.setValue(i10);
        } else if (i10 == 30) {
            nd0Var.setValue(16);
        } else if (i10 == 60) {
            nd0Var.setValue(17);
        } else if (i10 == 3600) {
            nd0Var.setValue(18);
        } else if (i10 == 86400) {
            nd0Var.setValue(19);
        } else if (i10 == 604800) {
            nd0Var.setValue(20);
        } else if (i10 == 0) {
            nd0Var.setValue(0);
        }
        nd0Var.setFormatter(new f2(14));
        alertDialog$Builder.o(nd0Var);
        alertDialog$Builder.h(LocaleController.getString(R.string.Done), new p1(4, encryptedChat, nd0Var));
        return alertDialog$Builder;
    }

    public static void V(org.telegram.ui.ActionBar.r2 r2Var, int i10, org.telegram.ui.ActionBar.x6 x6Var, org.telegram.ui.ActionBar.w6 w6Var) {
        org.telegram.ui.ActionBar.w6 w6Var2;
        int i11;
        String sb2;
        if (r2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = r2Var.getParentActivity();
        ?? editTextBoldCursor = new EditTextBoldCursor(parentActivity);
        String str = null;
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23673u5, org.telegram.ui.ActionBar.y6.f23692v5, org.telegram.ui.ActionBar.y6.f23599q7, null);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.NewTheme);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Create), new f2(15));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(parentActivity);
        if (i10 != 0) {
            org.telegram.messenger.t.n(R.string.EnterThemeNameEdit, textView);
        } else {
            textView.setText(LocaleController.getString(R.string.EnterThemeName));
        }
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        int i12 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        linearLayout.addView(textView, kb1.r(-1, -2));
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.y6.G6, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView((View) editTextBoldCursor, kb1.x(-1, 36, 51, 24, 6, 24, 0));
        editTextBoldCursor.setOnEditorActionListener(new u2(0));
        List asList = Arrays.asList("Ancient", "Antique", "Autumn", "Baby", "Barely", "Baroque", "Blazing", "Blushing", "Bohemian", "Bubbly", "Burning", "Buttered", "Classic", "Clear", "Cool", "Cosmic", "Cotton", "Cozy", "Crystal", "Dark", "Daring", "Darling", "Dawn", "Dazzling", "Deep", "Deepest", "Delicate", "Delightful", "Divine", "Double", "Downtown", "Dreamy", "Dusky", "Dusty", "Electric", "Enchanted", "Endless", "Evening", "Fantastic", "Flirty", "Forever", "Frigid", "Frosty", "Frozen", "Gentle", "Heavenly", "Hyper", "Icy", "Infinite", "Innocent", "Instant", "Luscious", "Lunar", "Lustrous", "Magic", "Majestic", "Mambo", "Midnight", "Millenium", "Morning", "Mystic", "Natural", "Neon", "Night", "Opaque", "Paradise", "Perfect", "Perky", "Polished", "Powerful", "Rich", "Royal", "Sheer", "Simply", "Sizzling", "Solar", "Sparkling", "Splendid", "Spicy", "Spring", "Stellar", "Sugared", "Summer", "Sunny", "Super", "Sweet", "Tender", "Tenacious", "Tidal", "Toasted", "Totally", "Tranquil", "Tropical", "True", "Twilight", "Twinkling", "Ultimate", "Ultra", "Velvety", "Vibrant", "Vintage", "Virtual", "Warm", "Warmest", "Whipped", "Wild", "Winsome");
        List asList2 = Arrays.asList("Ambrosia", "Attack", "Avalanche", "Blast", "Bliss", "Blossom", "Blush", "Burst", "Butter", "Candy", "Carnival", "Charm", "Chiffon", "Cloud", "Comet", "Delight", "Dream", "Dust", "Fantasy", "Flame", "Flash", "Fire", "Freeze", "Frost", "Glade", "Glaze", "Gleam", "Glimmer", "Glitter", "Glow", "Grande", "Haze", "Highlight", "Ice", "Illusion", "Intrigue", "Jewel", "Jubilee", "Kiss", "Lights", "Lollypop", "Love", "Luster", "Madness", "Matte", "Mirage", "Mist", "Moon", "Muse", "Myth", "Nectar", "Nova", "Parfait", "Passion", "Pop", "Rain", "Reflection", "Rhapsody", "Romance", "Satin", "Sensation", "Silk", "Shine", "Shadow", "Shimmer", "Sky", "Spice", "Star", "Sugar", "Sunrise", "Sunset", "Sun", "Twist", "Unbound", "Velvet", "Vibrant", "Waters", "Wine", "Wink", "Wonder", "Zone");
        HashMap hashMap = new HashMap();
        ic.a.q(9306112, hashMap, "Berry", 14598550, "Brandy");
        ic.a.q(8391495, hashMap, "Cherry", 16744272, "Coral");
        ic.a.q(14372985, hashMap, "Cranberry", 14423100, "Crimson");
        ic.a.q(14725375, hashMap, "Mauve", 16761035, "Pink");
        ic.a.q(16711680, hashMap, "Red", 16711807, "Rose");
        ic.a.q(8406555, hashMap, "Russet", 16720896, "Scarlet");
        ic.a.q(15856113, hashMap, "Seashell", 16724889, "Strawberry");
        ic.a.q(16760576, hashMap, "Amber", 15438707, "Apricot");
        ic.a.q(16508850, hashMap, "Banana", 10601738, "Citrus");
        ic.a.q(11560192, hashMap, "Ginger", 16766720, "Gold");
        ic.a.q(16640272, hashMap, "Lemon", 16753920, "Orange");
        ic.a.q(16770484, hashMap, "Peach", 16739155, "Persimmon");
        ic.a.q(14996514, hashMap, "Sunflower", 15893760, "Tangerine");
        ic.a.q(16763004, hashMap, "Topaz", 16776960, "Yellow");
        ic.a.q(3688720, hashMap, "Clover", 8628829, "Cucumber");
        ic.a.q(5294200, hashMap, "Emerald", 11907932, "Olive");
        ic.a.q(65280, hashMap, "Green", 43115, "Jade");
        ic.a.q(2730887, hashMap, "Jungle", 12582656, "Lime");
        ic.a.q(776785, hashMap, "Malachite", 10026904, "Mint");
        ic.a.q(11394989, hashMap, "Moss", 3234721, "Azure");
        ic.a.q(255, hashMap, "Blue", 18347, "Cobalt");
        ic.a.q(5204422, hashMap, "Indigo", 96647, "Lagoon");
        ic.a.q(7461346, hashMap, "Aquamarine", 1182351, "Ultramarine");
        ic.a.q(128, hashMap, "Navy", 3101086, "Sapphire");
        ic.a.q(7788522, hashMap, "Sky", 32896, "Teal");
        ic.a.q(4251856, hashMap, "Turquoise", 10053324, "Amethyst");
        ic.a.q(5046581, hashMap, "Blackberry", 6373457, "Eggplant");
        ic.a.q(13148872, hashMap, "Lilac", 11894492, "Lavender");
        ic.a.q(13421823, hashMap, "Periwinkle", 8663417, "Plum");
        ic.a.q(6684825, hashMap, "Purple", 14204888, "Thistle");
        ic.a.q(14315734, hashMap, "Orchid", 2361920, "Violet");
        ic.a.q(4137225, hashMap, "Bronze", 3604994, "Chocolate");
        ic.a.q(8077056, hashMap, "Cinnamon", 3153694, "Cocoa");
        ic.a.q(7365973, hashMap, "Coffee", 7956873, "Rum");
        ic.a.q(5113350, hashMap, "Mahogany", 7875865, "Mocha");
        ic.a.q(12759680, hashMap, "Sand", 8924439, "Sienna");
        ic.a.q(7864585, hashMap, "Maple", 15787660, "Khaki");
        ic.a.q(12088115, hashMap, "Copper", 12144200, "Chestnut");
        ic.a.q(15653316, hashMap, "Almond", 16776656, "Cream");
        ic.a.q(12186367, hashMap, "Diamond", 11109127, "Honey");
        ic.a.q(16777200, hashMap, "Ivory", 15392968, "Pearl");
        ic.a.q(15725299, hashMap, "Porcelain", 13745832, "Vanilla");
        ic.a.q(16777215, hashMap, "White", 8421504, "Gray");
        ic.a.q(0, hashMap, "Black", 15266260, "Chrome");
        ic.a.q(3556687, hashMap, "Charcoal", 789277, "Ebony");
        ic.a.q(12632256, hashMap, "Silver", 16119285, "Smoke");
        ic.a.q(2499381, hashMap, "Steel", 5220413, "Apple");
        ic.a.q(8434628, hashMap, "Glacier", 16693933, "Melon");
        ic.a.q(12929932, hashMap, "Mulberry", 11126466, "Opal");
        hashMap.put(5547512, "Blue");
        if (w6Var == null) {
            w6Var2 = org.telegram.ui.ActionBar.y6.C0().k(false);
        } else {
            w6Var2 = w6Var;
        }
        if (w6Var2 == null || (i11 = w6Var2.f23218c) == 0) {
            i11 = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.y6.s0())[0];
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
            StringBuilder l4 = b10.l(str, " ");
            l4.append((String) asList2.get(Utilities.random.nextInt(asList2.size())));
            sb2 = l4.toString();
        }
        editTextBoldCursor.setText(sb2);
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        e1 e1Var = new e1(2, editTextBoldCursor);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.setOnShowListener(e1Var);
        r2Var.showDialog(e2Var);
        editTextBoldCursor.requestFocus();
        e2Var.d(-1).setOnClickListener(new di.e0(r2Var, editTextBoldCursor, w6Var, x6Var, e2Var, 9));
    }

    public static void W(Activity activity, String str, int i10, int i11, int i12, Utilities.Callback callback) {
        if (activity == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, (org.telegram.ui.ActionBar.u6) null, false);
        k3Var.fixNavigationBar();
        k3Var.applyBottomPadding = false;
        ?? nd0Var = new nd0(activity, null);
        t3 t3Var = new t3(activity, nd0Var);
        t3Var.setOrientation(0);
        t3Var.setWeightSum(1.0f);
        nd0Var.setAllItemsCount(24);
        nd0Var.setItemCount(5);
        nd0Var.setTextColor(x02);
        nd0Var.setGravity(5);
        nd0Var.setTextOffset(-AndroidUtilities.dp(12.0f));
        ?? nd0Var2 = new nd0(activity, null);
        nd0Var2.setWrapSelectorWheel(true);
        nd0Var2.setAllItemsCount(60);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextColor(x02);
        nd0Var2.setGravity(3);
        nd0Var2.setTextOffset(AndroidUtilities.dp(12.0f));
        final bi.t4 t4Var = new bi.t4(i11, i12, (s3) nd0Var, (u3) nd0Var2, i10, t3Var);
        t3Var.addView((View) nd0Var, kb1.p(0.5f, 0, 270));
        nd0Var.setFormatter(new f2(6));
        nd0Var.setOnValueChangedListener(new ld0() {
            @Override
            public final void q(nd0 nd0Var3, int i13) {
                switch (r2) {
                    case 0:
                        t4Var.run(Boolean.TRUE);
                        return;
                    default:
                        t4Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        t3Var.addView((View) nd0Var2, kb1.p(0.5f, 0, 270));
        nd0Var2.setFormatter(new f2(7));
        nd0Var2.setOnValueChangedListener(new ld0() {
            @Override
            public final void q(nd0 nd0Var3, int i13) {
                switch (r2) {
                    case 0:
                        t4Var.run(Boolean.TRUE);
                        return;
                    default:
                        t4Var.run(Boolean.TRUE);
                        return;
                }
            }
        });
        t4Var.run(Boolean.FALSE);
        v3 v3Var = new v3(activity, nd0Var, nd0Var2);
        v3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        v3Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        v3Var.addView(t3Var, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        fi.d dVar = new fi.d(activity, null, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.Select), false, true);
        dVar.setOnClickListener(new n2(r1, 0));
        v3Var.addView(dVar, kb1.x(-1, 48, 0, 16, 12, 16, 12));
        k3Var.customView = v3Var;
        k3Var.show();
        k3Var.setOnDismissListener(new hi.y0(callback, nd0Var, nd0Var2, 3));
        k3Var.setBackgroundColor(x03);
        k3Var.fixNavigationBar(x03);
        org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
    }

    public static org.telegram.ui.ActionBar.e2 X(Activity activity, final long j10, final long j11, String str, final Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
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
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        int i12 = 0;
        while (i12 < strArr2.length) {
            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(activity, u6Var);
            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p6Var.setTag(Integer.valueOf(i12));
            a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, u6Var);
            String str3 = strArr2[i12];
            if (iArr[0] == i12) {
                z10 = z11;
            } else {
                z10 = false;
            }
            p6Var.b(str3, z10);
            f7.addView(p6Var);
            p6Var.setOnClickListener(new View.OnClickListener() {
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
                    alertDialog$Builder.f22369a.N0.run();
                    runnable.run();
                }
            });
            i12++;
            str2 = str;
            z11 = true;
        }
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Vibrate);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder.f22369a;
    }

    public static org.telegram.ui.ActionBar.e2 Y(Context context, org.telegram.ui.ActionBar.u6 u6Var, String[] strArr, int i10, String str, String str2, q0.a aVar) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
        alertDialog$Builder.n(i12, null);
        if (z10) {
            str = str2;
        }
        alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(str);
        if (z10) {
            i11 = R.string.PermissionOpenSettings;
        } else {
            i11 = R.string.BotWebViewRequestAllow;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new ea.b(z10, context, atomicBoolean, aVar, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new m4.s0(28, atomicBoolean, aVar));
        alertDialog$Builder.f22369a.setOnDismissListener(new bi.u3(7, atomicBoolean, aVar));
        return alertDialog$Builder.f22369a;
    }

    public static void Z(int i10, int i11, long j10, Utilities.Callback callback) {
        a0(i10, j10, i11, callback, 0L);
    }

    public static void a(org.telegram.ui.Cells.p6 p6Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        for (int i12 = 0; i12 < p6Var.getChildCount(); i12++) {
            View childAt = p6Var.getChildAt(i12);
            if (childAt instanceof RadioButton) {
                org.telegram.ui.ActionBar.f7.P((RadioButton) childAt, i10, i11, u6Var);
                return;
            }
        }
        p6Var.a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
    }

    public static boolean a0(final int i10, final long j10, int i11, Utilities.Callback callback, long j11) {
        org.telegram.ui.ActionBar.u6 bVar;
        TLRPC.Chat chat;
        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
        if (sendPaidMessagesStars <= 0 && j10 > 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(j10));
        }
        long j12 = i11 * sendPaidMessagesStars;
        bi.ca.y(i10, false).P.put(Long.valueOf(j10), Integer.valueOf(i11));
        if (j12 > 0 && j11 != j12) {
            final long j13 = sendPaidMessagesStars;
            final x2 x2Var = new x2(i10, j12, j10, callback, j13, 0);
            if (j13 <= MessagesController.getInstance(i10).getMainSettings().getLong(b10.i(j10, "ask_paid_message_", "_price"), 0L)) {
                x2Var.run();
                return true;
            }
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (!PhotoViewer.v1().U1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new di.b();
            }
            org.telegram.ui.ActionBar.u6 u6Var = bVar;
            String shortName = DialogObject.getShortName(i10, j10);
            if (ChatObject.isMonoForum(i10, j10)) {
                shortName = pg.d.h(i10, j10);
            } else if (U instanceof org.telegram.ui.wn) {
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) U;
                if (wnVar.f45277s4 && wnVar.a() == j10 && (chat = wnVar.f45264r4) != null) {
                    shortName = DialogObject.getShortName(i10, -chat.f22028id);
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
                        edit.putLong(b10.i(j14, "ask_paid_message_", "_price"), j13).apply();
                        bi.ca.y(i13, false).O.put(Long.valueOf(j14), Long.valueOf(System.currentTimeMillis()));
                    }
                    AndroidUtilities.runOnUIThread(x2Var);
                }
            }, u6Var, true);
            return true;
        }
        callback.run(Long.valueOf(j12));
        return false;
    }

    public static void b(nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
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
        nd0Var3.setMaxValue(i16);
        nd0Var3.setMinValue(i13);
        int value = nd0Var3.getValue();
        if (value == i16) {
            i10 = i17;
        } else {
            i10 = 11;
        }
        nd0Var2.setMaxValue(i10);
        if (value == i13) {
            i11 = i14;
        } else {
            i11 = 0;
        }
        nd0Var2.setMinValue(i11);
        int value2 = nd0Var2.getValue();
        calendar.set(1, value);
        calendar.set(2, value2);
        int actualMaximum = calendar.getActualMaximum(5);
        if (value == i16 && value2 == i17) {
            actualMaximum = Math.min(i18, actualMaximum);
        }
        nd0Var.setMaxValue(actualMaximum);
        if (value == i13 && value2 == i14) {
            i12 = i15;
        }
        nd0Var.setMinValue(i12);
    }

    public static boolean b0(int i10, ArrayList arrayList, int i11, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.u6 bVar;
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
            bi.ca.y(i10, z10).P.put(l4, Integer.valueOf(i11));
            int i14 = (sendPaidMessagesStars > 0L ? 1 : (sendPaidMessagesStars == 0L ? 0 : -1));
            if (i14 > 0) {
                i12++;
            }
            if (i14 > 0 && z11 && MessagesController.getInstance(i10).getMainSettings().getLong(b10.i(longValue, "ask_paid_message_", "_price"), 0L) < sendPaidMessagesStars) {
                z11 = z12;
            }
            j10 = j12;
            z10 = z12;
        }
        boolean z13 = z10;
        long max = Math.max(1, i11) * j10;
        if (!z11 && max > 0) {
            Activity activity = AndroidUtilities.getActivity();
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (!PhotoViewer.v1().U1() && (U == null || !U.hasShownSheet())) {
                if (U != null) {
                    bVar = U.getResourceProvider();
                } else {
                    bVar = null;
                }
            } else {
                bVar = new di.b();
            }
            org.telegram.ui.ActionBar.u6 u6Var = bVar;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti1", i12)));
            spannableStringBuilder.append((CharSequence) " ");
            Object[] objArr = new Object[1];
            objArr[z13 ? 1 : 0] = LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2Messages", Math.max(1, i12) * i11);
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessageMulti2", (int) max, objArr)));
            h0(activity, LocaleController.getString(R.string.MessageLockedStarsConfirmTitle), spannableStringBuilder, LocaleController.getString(R.string.MessageLockedStarsConfirmMessageDontAsk), LocaleController.formatPluralStringComma("MessageLockedStarsConfirmMessagePay", i11), new org.telegram.ui.rq(i10, max, activity, arrayList, hashMap, callback, u6Var), u6Var, true);
            return true;
        }
        callback.run(hashMap);
        return z13;
    }

    public static long c(fi.d dVar, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, nd0 nd0Var4) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i10 = 1;
        int i11 = calendar.get(1);
        int value = ((nd0Var2.getValue() - 120) / 12) + i11;
        calendar.clear();
        calendar.set(1, value);
        calendar.set(2, (nd0Var2.getValue() - 120) % 12);
        nd0Var.setMinValue(1);
        nd0Var.setMaxValue(calendar.getActualMaximum(5));
        int value2 = nd0Var.getValue();
        int value3 = nd0Var3.getValue();
        int value4 = nd0Var4.getValue();
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
        if (sendPaidMessagesStars > 0 && sendPaidMessagesStars > MessagesController.getInstance(i10).getMainSettings().getLong(b10.i(j10, "ask_paid_message_", "_price"), 0L)) {
            return true;
        }
        return false;
    }

    public static void d(nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
        int i10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = 1;
        int i12 = calendar.get(1);
        int i13 = calendar.get(2);
        int i14 = calendar.get(5);
        nd0Var3.setMinValue(i12);
        int value = nd0Var3.getValue();
        if (value == i12) {
            i10 = i13;
        } else {
            i10 = 0;
        }
        nd0Var2.setMinValue(i10);
        int value2 = nd0Var2.getValue();
        if (value == i12 && value2 == i13) {
            i11 = i14;
        }
        nd0Var.setMinValue(i11);
    }

    public static void d0(f5 f5Var, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(f5Var);
            String obj = f5Var.getText().toString();
            int i10 = org.telegram.ui.ActionBar.y6.f23293a;
            org.telegram.ui.ActionBar.x6 x6Var = new org.telegram.ui.ActionBar.x6();
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            x6Var.f23254b = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
            x6Var.f23252a = obj;
            org.telegram.ui.ActionBar.y6.f23423h0 = org.telegram.ui.ActionBar.y6.a1(org.telegram.ui.ActionBar.y6.I.f23264i0);
            x6Var.E = UserConfig.selectedAccount;
            org.telegram.ui.ActionBar.y6.u1(x6Var, true, true, false);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
            new ThemeEditorView().d(r2Var.getParentActivity(), x6Var);
            e2Var.dismiss();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("themehint", false)) {
                return;
            }
            globalMainSettings.edit().putBoolean("themehint", true).commit();
            try {
                Toast.makeText(r2Var.getParentActivity(), LocaleController.getString(R.string.CreateNewThemeHelp), 1).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void e(TextView textView, nd0 nd0Var, f4 f4Var, g4 g4Var) {
        String str;
        String str2;
        int value = nd0Var.getValue();
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

    public static org.telegram.ui.ActionBar.e2 e0(final int r23, org.telegram.tgnet.TLRPC.TL_error r24, org.telegram.ui.ActionBar.r2 r25, org.telegram.tgnet.TLObject r26, java.lang.Object... r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.e0(int, org.telegram.tgnet.TLRPC$TL_error, org.telegram.ui.ActionBar.r2, org.telegram.tgnet.TLObject, java.lang.Object[]):org.telegram.ui.ActionBar.e2");
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
                        if (user.f22177id == tL_missingInvitee2.user_id) {
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
                        arrayList2.add(Long.valueOf(user.f22177id));
                    }
                    if (tL_missingInvitee2.premium_would_allow_invite) {
                        arrayList3.add(Long.valueOf(user.f22177id));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new bi.sb(i10, chat, arrayList, arrayList2, arrayList3), 200L);
            }
        }
    }

    public static void f0(Context context, org.telegram.ui.ActionBar.u6 u6Var, String str, TLRPC.WebPage webPage, final Utilities.Callback callback, en enVar) {
        final View view;
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        final org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        String string = LocaleController.getString(R.string.PollV2AddLinkTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = LocaleController.getString(R.string.PollV2AddLinkMessage);
        final ?? editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i10, u6Var);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.Xh, u6Var);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.PollV2AddLinkUrlHint));
        editTextBoldCursor.setInputType(17);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setMaxLines(10);
        editTextBoldCursor.setSingleLine(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.i(org.telegram.ui.ActionBar.y6.f23598q6, u6Var);
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
                    matches = g5.f28387a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return true;
                }
                callback.run(trim);
                org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.06f, i10);
        editTextBoldCursor.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(editTextBoldCursor, c02, L, null, u6Var);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        d.addView((View) editTextBoldCursor, kb1.o(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
        int i11 = da1.f27384f;
        if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
            da1 da1Var = new da1(context, u6Var);
            da1Var.setWebPage(webPage);
            d.addView(da1Var, kb1.o(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
        }
        alertDialog$Builder.c();
        alertDialog$Builder.o(d);
        e2Var.f22556a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Done), new p1(2, editTextBoldCursor, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(5));
        if (enVar != null) {
            alertDialog$Builder.i(LocaleController.getString(R.string.Delete), new b1(3, enVar));
        }
        e2VarArr[0] = e2Var;
        e2Var.f22578j0 = false;
        e2Var.setOnDismissListener(new z0(editTextBoldCursor, 2));
        e2VarArr[0].setOnShowListener(new l2(editTextBoldCursor, 0));
        e2VarArr[0].show();
        TextView textView = (TextView) e2VarArr[0].d(-3);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
        }
    }

    public static boolean g(TextView textView, TextView textView2, long j10, long j11, int i10, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
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
        int value = nd0Var.getValue();
        int value2 = nd0Var2.getValue();
        int value3 = nd0Var3.getValue();
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
        nd0Var.setMinValue(0);
        int i24 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i24 > 0) {
            nd0Var.setMaxValue(i12);
        }
        int value4 = nd0Var.getValue();
        if (value4 == 0) {
            i15 = i22;
        } else {
            i15 = 0;
        }
        nd0Var2.setMinValue(i15);
        if (i24 > 0) {
            if (value4 == i12) {
                i19 = i13;
            } else {
                i19 = 23;
            }
            nd0Var2.setMaxValue(i19);
        }
        int value5 = nd0Var2.getValue();
        if (value4 == 0 && value5 == i22) {
            i16 = i23;
        } else {
            i16 = 0;
        }
        nd0Var3.setMinValue(i16);
        if (i24 > 0) {
            if (value4 == i12 && value5 == i13) {
                i18 = i21;
            } else {
                i18 = 59;
            }
            nd0Var3.setMaxValue(i18);
        }
        int value6 = nd0Var3.getValue();
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

    public static void g0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, boolean z11, TLObject tLObject) {
        if (tL_error != null && tL_error.code != 406 && tL_error.text != null && r2Var != null && r2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
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
                    e2Var.T = LocaleController.getString(R.string.LocatedChannelsTooMuch);
                    break;
                case 1:
                    e2Var.T = LocaleController.getString(R.string.PublicChannelsTooMuch);
                    break;
                case 2:
                    e2Var.T = LocaleController.getString(R.string.CreateGroupError);
                    break;
                case 3:
                case '\b':
                case '\r':
                    if (z10) {
                        e2Var.T = LocaleController.getString(R.string.ChannelUserCantAdd);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.GroupUserCantAdd);
                        break;
                    }
                case 4:
                    e2Var.T = LocaleController.getString(R.string.UserRestricted);
                    break;
                case 5:
                    e2Var.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                    alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new t2(0, r2Var));
                    break;
                case 6:
                    if (z10) {
                        e2Var.T = LocaleController.getString(R.string.ChannelUserCantBot);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.GroupUserCantBot);
                        break;
                    }
                case 7:
                case 11:
                    if (tLObject instanceof TLRPC.TL_channels_inviteToChannel) {
                        e2Var.T = LocaleController.getString(R.string.AddUserErrorBlacklisted);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.AddAdminErrorBlacklisted);
                        break;
                    }
                case '\t':
                    e2Var.T = LocaleController.getString(R.string.YouBlockedUser);
                    break;
                case '\n':
                    e2Var.T = LocaleController.getString(R.string.AddBannedErrorAdmin);
                    break;
                case '\f':
                    if (z10) {
                        e2Var.T = LocaleController.getString(R.string.ChannelUserAddLimit);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.GroupUserAddLimit);
                        break;
                    }
                case 14:
                    if (z10) {
                        e2Var.T = LocaleController.getString(R.string.ChannelUserCantAdmin);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.GroupUserCantAdmin);
                        break;
                    }
                case 15:
                    e2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    if (tLObject instanceof TLRPC.TL_channels_createChannel) {
                        e2Var.T = LocaleController.getString(R.string.ChannelTooMuch);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.ChannelTooMuchJoin);
                        break;
                    }
                case 16:
                    e2Var.R = LocaleController.getString(R.string.ChannelTooMuchTitle);
                    e2Var.T = LocaleController.getString(R.string.UserChannelTooMuchJoin);
                    break;
                case 17:
                    if (z10) {
                        e2Var.T = LocaleController.getString(R.string.ChannelUserLeftError);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.GroupUserLeftError);
                        break;
                    }
                case 18:
                    e2Var.T = LocaleController.getString(R.string.AddAdminErrorNotAMember);
                    break;
                case 19:
                    if (z11) {
                        e2Var.T = LocaleController.getString(R.string.InviteToCommunityError);
                        break;
                    } else if (z10) {
                        e2Var.T = LocaleController.getString(R.string.InviteToChannelError);
                        break;
                    } else {
                        e2Var.T = LocaleController.getString(R.string.InviteToGroupError);
                        break;
                    }
                case 20:
                    e2Var.R = LocaleController.getString(R.string.VoipGroupVoiceChat);
                    e2Var.T = LocaleController.getString(R.string.VoipGroupInviteAlreadyParticipant);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error.text);
                    e2Var.T = sb2.toString();
                    break;
            }
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static boolean h(Context context, int i10, long j10, boolean z10) {
        TLRPC.Chat chat;
        if (DialogObject.isChatDialog(j10) && (chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
            if (!z10) {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22028id);
                if (chatFull == null) {
                    chatFull = MessagesStorage.getInstance(i10).loadChatInfo(chat.f22028id, ChatObject.isChannel(chat), new CountDownLatch(1), false, false);
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

    public static org.telegram.ui.ActionBar.e2 h0(Activity activity, String str, CharSequence charSequence, CharSequence charSequence2, String str2, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        boolean[] zArr = {false};
        TextView textView = new TextView(activity);
        NotificationCenter.listenEmojiLoading(textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        textView.setText(charSequence);
        b5 b5Var = new b5(activity, y1VarArr);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.G = 6;
        alertDialog$Builder.o(b5Var);
        TextView textView2 = new TextView(activity);
        org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, u6Var, 1, 20.0f);
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
        b5Var.addView(textView2, kb1.h(-1, -2.0f, i12 | 48, 24.0f, 8.0f, 24.0f, 0.0f));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        b5Var.addView(textView, kb1.h(-2, -2.0f, i13 | 48, 24.0f, 48.0f, 24.0f, 6.0f));
        if (!TextUtils.isEmpty(charSequence2)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(activity, 1, u6Var);
            y1VarArr[0] = y1Var;
            int i16 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, u6Var), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
            y1Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var);
            y1VarArr[0].setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1VarArr[0].getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            layoutParams.gravity = i14 | 16;
            y1VarArr[0].getCheckBoxView().setLayoutParams(layoutParams);
            y1VarArr[0].e(charSequence2, "", false, false, false);
            org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
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
            y1Var2.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            b5Var.addView(y1VarArr[0], kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 0.0f));
            y1VarArr[0].setOnClickListener(new r0(5, zArr));
        }
        alertDialog$Builder.k(str2, new d3(0, callback, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            e2Var.Z0 = true;
        }
        e2Var.show();
        return e2Var;
    }

    public static org.telegram.ui.ActionBar.e2 i(Activity activity, c5 c5Var) {
        if (UserConfig.getActivatedAccountsCount() < 2) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        org.telegram.ui.ActionBar.r1 r1Var = alertDialog$Builder.f22369a.N0;
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(activity, false);
                kVar.f24306f = i10;
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                j9 j9Var = kVar.e;
                j9Var.m(i10, currentUser);
                kVar.f24303a.l(ContactsController.formatName(currentUser.first_name, currentUser.last_name), false);
                y9 y9Var = kVar.f24305c;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.f(currentUser, j9Var);
                kVar.d.setVisibility(4);
                kVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                kVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                f7.addView(kVar, kb1.r(-1, 50));
                kVar.setOnClickListener(new bi.w0(e2VarArr, r1Var, c5Var, 16));
            }
        }
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.SelectAccount);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2VarArr[0] = e2Var;
        return e2Var;
    }

    public static void i0(org.telegram.ui.ActionBar.r2 r28, long r29, final org.telegram.tgnet.TLRPC.User r31, final org.telegram.tgnet.TLRPC.Chat r32, final org.telegram.tgnet.TLRPC.EncryptedChat r33, final boolean r34, org.telegram.tgnet.TLRPC.ChatFull r35, final org.telegram.messenger.MessagesStorage.IntCallback r36, org.telegram.ui.ActionBar.u6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.i0(org.telegram.ui.ActionBar.r2, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, boolean, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.messenger.MessagesStorage$IntCallback, org.telegram.ui.ActionBar.u6):void");
    }

    public static org.telegram.ui.ActionBar.e2 j(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ApkRestricted);
        int i10 = R.raw.permission_request_apk;
        int i11 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new j0(context, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
        return alertDialog$Builder.f22369a;
    }

    public static void j0(org.telegram.ui.wn wnVar, MessageObject messageObject, long j10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ig igVar) {
        TLRPC.User user;
        TLRPC.Chat chat;
        int dp;
        int dp2;
        if (wnVar.getParentActivity() != null && messageObject != null) {
            AccountInstance accountInstance = wnVar.getAccountInstance();
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, u6Var);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R0 = false;
                e2Var.N = new z0(igVar, 0);
                e2Var.R = LocaleController.getString(R.string.BlockUser);
                if (user != null) {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, UserObject.getFirstName(user)));
                } else {
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserReplyAlert", R.string.BlockUserReplyAlert, chat.title));
                }
                LinearLayout linearLayout = new LinearLayout(wnVar.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.y1[] y1VarArr = {new org.telegram.ui.Cells.y1(wnVar.getParentActivity(), 1, u6Var)};
                y1VarArr[0].setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
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
                linearLayout.addView(y1VarArr[0], kb1.r(-1, -2));
                y1VarArr[0].setOnClickListener(new a1(y1VarArr, 0));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.BlockAndDeleteReplies), new c1(user, accountInstance, wnVar, chat, messageObject, y1VarArr, u6Var));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wnVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                }
            }
        }
    }

    public static void k(Context context, org.telegram.ui.ActionBar.u6 u6Var, e5 e5Var) {
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        if (context == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        if (u6Var != null) {
            x02 = u6Var.e(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        int i11 = org.telegram.ui.ActionBar.y6.f23428h5;
        if (u6Var != null) {
            x03 = u6Var.e(i11);
        } else {
            x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        }
        int i12 = x03;
        int i13 = org.telegram.ui.ActionBar.y6.Ji;
        if (u6Var != null) {
            u6Var.e(i13);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        }
        int i14 = org.telegram.ui.ActionBar.y6.Ni;
        if (u6Var != null) {
            u6Var.e(i14);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.y6.E8;
        if (u6Var != null) {
            u6Var.e(i15);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.y6.G8;
        if (u6Var != null) {
            u6Var.e(i16);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.y6.f23449i6;
        if (u6Var != null) {
            u6Var.e(i17);
        } else {
            org.telegram.ui.ActionBar.y6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.y6.Sh;
        if (u6Var != null) {
            x04 = u6Var.e(i18);
        } else {
            x04 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
        }
        int i19 = x04;
        int i20 = org.telegram.ui.ActionBar.y6.Oh;
        if (u6Var != null) {
            x05 = u6Var.e(i20);
        } else {
            x05 = org.telegram.ui.ActionBar.y6.x0(null, i20, false);
        }
        int i21 = x05;
        if (u6Var != null) {
            x06 = u6Var.e(org.telegram.ui.ActionBar.y6.Qh);
        } else {
            x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        }
        int i22 = x06;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        int[] iArr = {0, 1440, 2880, 4320, 5760, 7200, 8640, 10080, 20160, 30240, 44640, 89280, 133920, 178560, 223200, 267840, 525600};
        k4 k4Var = new k4(context, u6Var, iArr);
        k4Var.setMinValue(0);
        k4Var.setMaxValue(16);
        k4Var.setTextColor(x02);
        k4Var.setValue(0);
        k4Var.setFormatter(new f1(1, iArr));
        l4 l4Var = new l4(context, k4Var, 0);
        l4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        l4Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AutoDeleteAfteTitle));
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        l4Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, false, 1);
        linearLayout.addView(k4Var, kb1.p(1.0f, 0, 270));
        y3Var.setPadding(0, 0, 0, 0);
        y3Var.setGravity(17);
        y3Var.setTextColor(i19);
        y3Var.setTextSize(AndroidUtilities.dp(14.0f));
        y3Var.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        y3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, i21, i22, i22));
        l4Var.addView(y3Var, kb1.x(-1, 48, 83, 16, 15, 16, 16));
        y3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
        k4Var.setOnValueChangedListener(new s(y3Var, 10));
        y3Var.setOnClickListener(new di.c4(iArr, k4Var, e5Var, e3Var, 8));
        e3Var.b(l4Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        k3Var.setBackgroundColor(i12);
        k3Var.fixNavigationBar(i12);
    }

    public static void k0(Context context, final int i10, final long j10) {
        final org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.wh.i(1, context, null, false);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        d.addView(frameLayout, kb1.x(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, kb1.i(-1, -1, 17));
        int dp = AndroidUtilities.dp(80.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, null);
        frameLayout.addView(frameLayout2, kb1.h(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.messenger.t.r(textView, i13, null, 1, 20.0f);
        org.telegram.messenger.wh.k(R.string.CallForbiddenInviteLinkTitle, textView, 17);
        TextView e = org.telegram.messenger.wh.e(d, textView, kb1.o(32.0f, 16.0f, 32.0f, 8.0f, -1, -2), context);
        org.telegram.ui.ActionBar.f7.V(e, i13, null);
        e.setTextSize(1, 14.0f);
        e.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallForbiddenInviteLinkText, DialogObject.getName(i10, j10))));
        e.setGravity(17);
        d.addView(e, kb1.o(32.0f, 0.0f, 32.0f, 18.0f, -1, -2));
        final fi.d dVar = new fi.d(context, null, true);
        dVar.i(LocaleController.getString(R.string.CallForbiddenInviteLinkButton), false, true);
        d.addView(dVar, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        i11.customView = d;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                final int i14 = i10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                final fi.d dVar2 = dVar;
                final org.telegram.ui.ActionBar.k3 k3Var = i11;
                final long j11 = j10;
                connectionsManager.sendRequest(createconferencecall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new bi.a9(tLObject, i14, dVar2, k3Var, j11, tL_error));
                    }
                });
            }
        });
        i11.fixNavigationBar();
        i11.show();
    }

    public static org.telegram.ui.ActionBar.e3 l(Context context, String str, String str2, TL_account.TL_birthday tL_birthday, Utilities.Callback callback, Runnable runnable, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        int i11;
        if (context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, u6Var);
        e3Var.a();
        nd0 nd0Var = new nd0(context, u6Var);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        nd0 nd0Var2 = new nd0(context, u6Var);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        nd0 nd0Var3 = new nd0(context, u6Var);
        nd0Var3.setItemCount(5);
        nd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        c4 c4Var = new c4(context, nd0Var, nd0Var2, nd0Var3);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var, 1, 20.0f);
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        int i15 = i14 + 1;
        a3 a3Var = new a3(nd0Var3, i15, nd0Var, nd0Var2, i14, i13, i12);
        System.currentTimeMillis();
        TextView textView2 = new TextView(context);
        linearLayout.addView(nd0Var, kb1.p(0.25f, 0, 270));
        nd0Var.setMinValue(1);
        nd0Var.setMaxValue(31);
        nd0Var.setWrapSelectorWheel(false);
        nd0Var.setFormatter(new f2(16));
        s sVar = new s(a3Var, 9);
        nd0Var.setOnScrollListener(sVar);
        nd0Var2.setMinValue(0);
        nd0Var2.setMaxValue(11);
        nd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(nd0Var2, kb1.p(0.5f, 0, 270));
        nd0Var2.setFormatter(new f2(17));
        nd0Var2.setOnScrollListener(sVar);
        nd0Var3.setMinValue(calendar.get(1) - 149);
        nd0Var3.setMaxValue(i15);
        nd0Var3.setWrapSelectorWheel(false);
        nd0Var3.setFormatter(new i2.w(i15, 9));
        linearLayout.addView(nd0Var3, kb1.p(0.25f, 0, 270));
        nd0Var3.setOnScrollListener(sVar);
        if (tL_birthday != null) {
            nd0Var.setValue(tL_birthday.day);
            nd0Var2.setValue(tL_birthday.month - 1);
            if ((tL_birthday.flags & 1) != 0) {
                nd0Var3.setValue(tL_birthday.year);
            } else {
                nd0Var3.setValue(i15);
            }
        } else {
            nd0Var.setValue(calendar.get(5));
            nd0Var2.setValue(calendar.get(2));
            nd0Var3.setValue(i15);
        }
        a3Var.run();
        if (runnable != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            aa0 aa0Var = new aa0(context, null);
            aa0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            aa0Var.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.q5, u6Var);
            org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
            aa0Var.setGravity(17);
            frameLayout2.addView(aa0Var, kb1.i(-2, -2, 17));
            c4Var.addView(frameLayout2, kb1.r(-1, -2));
            int i16 = UserConfig.selectedAccount;
            h2 h2Var = new h2(i16, aa0Var, 1);
            h2Var.run();
            NotificationCenter.getInstance(i16).listen(frameLayout2, NotificationCenter.privacyRulesUpdated, new b3(h2Var, 0));
            ContactsController.getInstance(i16).loadPrivacySettings();
        }
        if (z10) {
            fi.d dVar = new fi.d(context, u6Var, false);
            dVar.i(LocaleController.getString(R.string.DateOfBirthHideYear), false, true);
            dVar.setOnClickListener(new bi.pa(nd0Var3, i15, a3Var, 7));
            c4Var.addView(dVar, kb1.x(-1, 48, 83, 16, 15, 16, 4));
        }
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(str2);
        int dp = AndroidUtilities.dp(24.0f);
        int i17 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i17, u6Var);
        int i18 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i18, u6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView2, j02, N, N2, u6Var);
        kb1.c(textView2, 0.02f, 1.2f);
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
        c4Var.addView(textView2, kb1.x(-1, 48, 83, 16, i10, 16, i11));
        textView2.setOnClickListener(new bi.mb(nd0Var, nd0Var2, nd0Var3, i15, e3Var, callback));
        if (z11) {
            fi.d dVar2 = new fi.d(context, u6Var, false);
            dVar2.i(LocaleController.getString(R.string.BirthdayRemove), false, true);
            dVar2.f();
            dVar2.setOnClickListener(new org.telegram.ui.ActionBar.u1(24, e3Var, callback));
            c4Var.addView(dVar2, kb1.x(-1, 48, 83, 16, 4, 16, 16));
        }
        e3Var.b(c4Var);
        return e3Var;
    }

    public static void l0(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        String formatPluralString;
        if (str != null && str.startsWith("FLOOD_WAIT") && r2Var != null && r2Var.getParentActivity() != null) {
            int intValue = Utilities.parseInt((CharSequence) str).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity());
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            r2Var.showDialog(e2Var, true, null);
        }
    }

    public static void m(org.telegram.ui.ActionBar.r2 r30, java.util.concurrent.atomic.AtomicBoolean r31, org.telegram.tgnet.TLRPC.User r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.m(org.telegram.ui.ActionBar.r2, java.util.concurrent.atomic.AtomicBoolean, org.telegram.tgnet.TLRPC$User, java.lang.Runnable):void");
    }

    public static void m0(Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Runnable runnable) {
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        d.addView(new bi.a6(context, tL_starGiftUnique, userOrChat), kb1.x(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var);
        textView.setTextSize(1, 16.0f);
        org.telegram.messenger.wh.o(R.string.GiftThemesSetInReuseInfo, new Object[]{DialogObject.getDialogTitle(userOrChat)}, textView);
        d.addView(textView, kb1.x(-1, -2, 48, 24, 0, 24, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.o(d);
        alertDialog$Builder.k(LocaleController.getString(R.string.GiftThemesSetInReuseConfirm), new b1(1, runnable));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void n(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, Runnable runnable, Runnable runnable2) {
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
        Context context = r2Var.getContext();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        aa0 aa0Var = new aa0(context, null);
        NotificationCenter.listenEmojiLoading(aa0Var);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23465j5, null);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, null);
        aa0Var.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        aa0Var.setGravity(i10 | 48);
        FrameLayout frameLayout = new FrameLayout(context);
        alertDialog$Builder.f22369a.G = 6;
        alertDialog$Builder.o(frameLayout);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.u(AndroidUtilities.dp(18.0f));
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(y9Var, kb1.h(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.E8, null);
        b6Var.setTextSize(20);
        b6Var.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        b6Var.setGravity(i12 | 16);
        b6Var.setEllipsizeByGradient(true);
        b6Var.l(user.first_name, false);
        if (user.scam) {
            b6Var.i(org.telegram.ui.ActionBar.y6.f23408g1);
        } else if (user.fake) {
            b6Var.i(org.telegram.ui.ActionBar.y6.f23424h1);
        } else if (user.verified) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            int i20 = org.telegram.ui.ActionBar.y6.f23771z9;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(b6Var, mutate, i20, null, mode);
            Drawable mutate2 = context.getResources().getDrawable(R.drawable.verified_check).mutate();
            org.telegram.ui.ActionBar.f7.y(b6Var, mutate2, org.telegram.ui.ActionBar.y6.A9, null, mode);
            b6Var.i(new ar(mutate, mutate2));
        }
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23520m5, null);
        org.telegram.messenger.wh.r(textView, 1, 14.0f, 1, 1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13 | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new t0(user, r2Var, alertDialog$Builder, 0));
        SpannableString valueOf = SpannableString.valueOf(LocaleController.getString(R.string.MoreAboutThisBot) + "  ");
        zq zqVar = new zq(R.drawable.attach_arrow_right, 0);
        zqVar.setTopOffset(1);
        zqVar.setSize(AndroidUtilities.dp(10.0f));
        valueOf.setSpan(zqVar, valueOf.length() - 1, valueOf.length(), 33);
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
        frameLayout.addView(b6Var, kb1.h(-1, -2.0f, i21, f7, 0.0f, i16, 0.0f));
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
        frameLayout.addView(textView, kb1.h(-1, -2.0f, i23, f10, 24.0f, i22, 0.0f));
        if (LocaleController.isRTL) {
            i19 = 5;
        } else {
            i19 = 3;
        }
        frameLayout.addView(aa0Var, kb1.h(-2, -2.0f, i19 | 48, 24.0f, 57.0f, 24.0f, 1.0f));
        if (UserObject.isReplyUser(user)) {
            j9Var.f29558p = 0.8f;
            j9Var.g(12);
            y9Var.h(null, null, j9Var, user);
        } else {
            j9Var.f29558p = 1.0f;
            j9Var.m(r2Var.getCurrentAccount(), user);
            y9Var.f(user, j9Var);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new b1(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        DialogInterface.OnDismissListener q0Var = new q0(3, runnable2);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        r2Var.showDialog(e2Var, false, q0Var);
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebViewStartPermission2), new l1(0, context, e2Var)));
    }

    public static void n0(Context context, org.telegram.ui.ActionBar.u6 u6Var, String str, boolean z10, final Utilities.Callback2 callback2) {
        int i10;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        final org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.OpenUrlTitle);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setGravity(17);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.06f, i11);
        textView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView, c02, L, null, u6Var);
        final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1, u6Var);
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
        y1Var.setOnClickListener(new i1(y1Var, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView, kb1.o(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
        linearLayout.addView(y1Var, kb1.x(-1, -2, 3, 8, 6, 8, 4));
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.f22369a.f22556a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
                        if (e2Var2 != null) {
                            e2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr[0];
                        if (e2Var3 != null) {
                            e2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                switch (r4) {
                    case 0:
                        callback2.run(Boolean.TRUE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2VarArr[0];
                        if (e2Var2 != null) {
                            e2Var2.dismiss();
                            return;
                        }
                        return;
                    default:
                        callback2.run(Boolean.FALSE, Boolean.valueOf(y1Var.b()));
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2VarArr[0];
                        if (e2Var3 != null) {
                            e2Var3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        e2VarArr[0] = alertDialog$Builder.p();
    }

    public static org.telegram.ui.ActionBar.e3 o(Activity activity, MessagesStorage.IntCallback intCallback, org.telegram.ui.ActionBar.u6 u6Var) {
        if (activity == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, u6Var);
        e3Var.a();
        nd0 nd0Var = new nd0(activity, u6Var);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        nd0 nd0Var2 = new nd0(activity, u6Var);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        nd0 nd0Var3 = new nd0(activity, u6Var);
        nd0Var3.setItemCount(5);
        nd0Var3.setTextOffset(-AndroidUtilities.dp(24.0f));
        q4 q4Var = new q4(activity, nd0Var, nd0Var2, nd0Var3);
        q4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        q4Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.ChooseDate));
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var, 1, 20.0f);
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        q4Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        System.currentTimeMillis();
        TextView textView2 = new TextView(activity);
        linearLayout.addView(nd0Var, kb1.p(0.25f, 0, 270));
        nd0Var.setMinValue(1);
        nd0Var.setMaxValue(31);
        nd0Var.setWrapSelectorWheel(false);
        nd0Var.setFormatter(new org.telegram.ui.cg(14));
        l0 l0Var = new l0(nd0Var, nd0Var2, nd0Var3, 0);
        nd0Var.setOnValueChangedListener(l0Var);
        nd0Var2.setMinValue(0);
        nd0Var2.setMaxValue(11);
        nd0Var2.setWrapSelectorWheel(false);
        linearLayout.addView(nd0Var2, kb1.p(0.5f, 0, 270));
        nd0Var2.setFormatter(new org.telegram.ui.cg(15));
        nd0Var2.setOnValueChangedListener(l0Var);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1375315200000L);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        nd0Var3.setMinValue(i10);
        nd0Var3.setMaxValue(i11);
        nd0Var3.setWrapSelectorWheel(false);
        nd0Var3.setFormatter(new org.telegram.ui.cg(16));
        linearLayout.addView(nd0Var3, kb1.p(0.25f, 0, 270));
        nd0Var3.setOnValueChangedListener(l0Var);
        nd0Var.setValue(31);
        nd0Var2.setValue(12);
        nd0Var3.setValue(i11);
        b(nd0Var, nd0Var2, nd0Var3);
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.JumpToDate));
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        int i13 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView2, j02, N, N2, u6Var);
        q4Var.addView(textView2, kb1.x(-1, 48, 83, 16, 15, 16, 16));
        textView2.setOnClickListener(new m0(nd0Var, nd0Var2, nd0Var3, calendar, intCallback, e3Var, 0));
        e3Var.b(q4Var);
        return e3Var;
    }

    public static void o0(Context context, String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, qf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.u6 u6Var) {
        String scheme;
        boolean z14;
        boolean z15;
        String u10;
        LinearLayout d;
        if (!AndroidUtilities.isContextSafe(context)) {
            return;
        }
        if (str == null) {
            scheme = null;
        } else {
            scheme = Uri.parse(str).getScheme();
        }
        if (!qf.d.e(Uri.parse(str), false, null) && z12 && !"mailto".equalsIgnoreCase(scheme)) {
            if (z10) {
                try {
                    Uri parse = Uri.parse(str);
                    u10 = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                s2 s2Var = new s2(context, str, j10, z11, cVar);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                String string = LocaleController.getString(R.string.OpenUrlTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                TextView textView = new TextView(context);
                textView.setText(u10);
                textView.setTextSize(1, 14.0f);
                int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
                org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
                textView.setGravity(17);
                textView.setMaxLines(5);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.06f, i10);
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(textView, c02, L, null, u6Var);
                d = org.telegram.messenger.wh.d(context, 1);
                d.addView(textView, kb1.o(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
                int i11 = da1.f27384f;
                if (webPage != null && (webPage.site_name != null || webPage.title != null || webPage.description != null || webPage.photo != null || webPage.document != null)) {
                    da1 da1Var = new da1(context, u6Var);
                    da1Var.setWebPage(webPage);
                    d.addView(da1Var, kb1.o(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
                }
                alertDialog$Builder.o(d);
                e2Var.f22556a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new s(s2Var, 8));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            }
            u10 = str;
            s2 s2Var2 = new s2(context, str, j10, z11, cVar);
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, u6Var);
            String string2 = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
            e2Var2.R = string2;
            TextView textView2 = new TextView(context);
            textView2.setText(u10);
            textView2.setTextSize(1, 14.0f);
            int i102 = org.telegram.ui.ActionBar.y6.f23465j5;
            org.telegram.ui.ActionBar.f7.V(textView2, i102, u6Var);
            textView2.setGravity(17);
            textView2.setMaxLines(5);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
            ShapeDrawable c022 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i102, u6Var)));
            org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.06f, i102);
            textView2.setBackground(c022);
            org.telegram.ui.ActionBar.f7.k(textView2, c022, L2, null, u6Var);
            d = org.telegram.messenger.wh.d(context, 1);
            d.addView(textView2, kb1.o(22.0f, 4.0f, 22.0f, 9.0f, -1, -2));
            int i112 = da1.f27384f;
            if (webPage != null) {
                da1 da1Var2 = new da1(context, u6Var);
                da1Var2.setWebPage(webPage);
                d.addView(da1Var2, kb1.o(22.0f, 3.0f, 22.0f, 7.0f, -1, -2));
            }
            alertDialog$Builder2.o(d);
            e2Var2.f22556a = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Open), new s(s2Var2, 8));
            ic.a.r(R.string.Cancel, alertDialog$Builder2, null);
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
        qf.d.q(context, parse2, z14, z11, z15, cVar, null, false, true, false);
    }

    public static void p(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, boolean z10) {
        String string;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (r2Var.getParentActivity() != null && user != null && !UserObject.isDeleted(user) && UserConfig.getInstance(r2Var.getCurrentAccount()).getClientUserId() != user.f22177id) {
            r2Var.getCurrentAccount();
            Activity parentActivity = r2Var.getParentActivity();
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
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
            textView.setTextSize(1, 16.0f);
            int i15 = 3;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(formatString));
            j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.u(AndroidUtilities.dp(12.0f));
            j9Var.f29558p = 1.0f;
            j9Var.m(r2Var.getCurrentAccount(), user);
            y9 y9Var = new y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            y9Var.f(user, j9Var);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            frameLayout.addView(y9Var, kb1.h(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, null, 1, 20.0f);
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
            frameLayout.addView(textView2, kb1.h(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            frameLayout.addView(textView, kb1.h(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.o(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(R.string.Call), new bi.z3(r2Var, user, z10, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            r2Var.showDialog(alertDialog$Builder.f22369a);
        }
    }

    public static void p0(org.telegram.ui.ActionBar.r2 r2Var, String str, boolean z10, boolean z11) {
        q0(r2Var, str, z10, true, z11, false, null, null, null);
    }

    public static void q(org.telegram.ui.ActionBar.r2 r32, int r33, org.telegram.tgnet.TLRPC.User r34, org.telegram.tgnet.TLRPC.Chat r35, boolean r36, org.telegram.messenger.MessagesStorage.BooleanCallback r37, org.telegram.ui.ActionBar.u6 r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.q(org.telegram.ui.ActionBar.r2, int, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.u6):void");
    }

    public static void q0(org.telegram.ui.ActionBar.r2 r2Var, String str, boolean z10, boolean z11, boolean z12, boolean z13, qf.c cVar, TLRPC.WebPage webPage, org.telegram.ui.ActionBar.u6 u6Var) {
        long j10;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if (r2Var instanceof org.telegram.ui.wn) {
                j10 = ((org.telegram.ui.wn) r2Var).f45320v8;
            } else {
                j10 = 0;
            }
            o0(r2Var.getParentActivity(), str, z10, z11, z12, z13, j10, cVar, webPage, u6Var);
        }
    }

    public static void r(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, TLRPC.Chat chat, TLRPC.User user, boolean z11, boolean z12, boolean z13, boolean z14, MessagesStorage.BooleanCallback booleanCallback) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (r2Var != null) {
            u6Var = r2Var.getResourceProvider();
        } else {
            u6Var = null;
        }
        s(r2Var, z10, false, chat, user, z11, z12, z13, z14, booleanCallback, u6Var);
    }

    public static void r0(Activity activity, int i10, Runnable runnable, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = MessagesController.getInstance(i10).availableMapProviders;
        if ((i11 & 1) != 0) {
            org.telegram.ui.d3.y(R.string.MapPreviewProviderTelegram, 0, arrayList, arrayList2);
        }
        if ((i11 & 2) != 0) {
            org.telegram.ui.d3.y(R.string.MapPreviewProviderGoogle, 1, arrayList, arrayList2);
        }
        if ((i11 & 4) != 0) {
            org.telegram.ui.d3.y(R.string.MapPreviewProviderYandex, 3, arrayList, arrayList2);
        }
        arrayList.add(LocaleController.getString(R.string.MapPreviewProviderNobody));
        arrayList2.add(2);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.MapPreviewProviderTitle);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(activity, u6Var);
            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p6Var.setTag(Integer.valueOf(i12));
            a(p6Var, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.E5, null);
            CharSequence charSequence = (CharSequence) arrayList.get(i12);
            if (SharedConfig.mapPreviewType == ((Integer) arrayList2.get(i12)).intValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            p6Var.b(charSequence, z11);
            int i13 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i13, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
            p6Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(p6Var, g02, null, N, null);
            linearLayout.addView(p6Var);
            p6Var.setOnClickListener(new bi.w0(arrayList2, runnable, alertDialog$Builder, 17));
        }
        if (!z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        }
        org.telegram.ui.ActionBar.e2 p10 = alertDialog$Builder.p();
        if (z10) {
            p10.setCanceledOnTouchOutside(false);
        }
    }

    public static void s(final org.telegram.ui.ActionBar.r2 r46, final boolean r47, final boolean r48, org.telegram.tgnet.TLRPC.Chat r49, final org.telegram.tgnet.TLRPC.User r50, final boolean r51, final boolean r52, boolean r53, final boolean r54, final org.telegram.messenger.MessagesStorage.BooleanCallback r55, final org.telegram.ui.ActionBar.u6 r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.s(org.telegram.ui.ActionBar.r2, boolean, boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, boolean, boolean, boolean, boolean, org.telegram.messenger.MessagesStorage$BooleanCallback, org.telegram.ui.ActionBar.u6):void");
    }

    public static void s0(int i10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        if (i10 != 0 && r2Var != null && r2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UnableForward);
            if (i10 == 1) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickers);
            } else if (i10 == 2) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedMedia);
            } else if (i10 == 3) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
            } else if (i10 == 4) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedStickersAll);
            } else if (i10 == 5) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedMediaAll);
            } else if (i10 == 6) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
            } else if (i10 == 7) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVoiceMessages);
            } else if (i10 == 8) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPrivacyVideoMessages);
            } else if (i10 == 9) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideoAll);
            } else if (i10 == 10) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhotoAll);
            } else if (i10 == 11) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedVideo);
            } else if (i10 == 12) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedPhoto);
            } else if (i10 == 13) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoiceAll);
            } else if (i10 == 14) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedVoice);
            } else if (i10 == 15) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedRoundAll);
            } else if (i10 == 16) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedRound);
            } else if (i10 == 17) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocumentsAll);
            } else if (i10 == 18) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedDocuments);
            } else if (i10 == 19) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusicAll);
            } else if (i10 == 20) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedMusic);
            } else if (i10 == 21) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
            } else if (i10 == 22) {
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            r2Var.showDialog(alertDialog$Builder.f22369a, true, null);
        }
    }

    public static org.telegram.ui.ActionBar.e2 t(Activity activity, final long j10, final long j11, final int i10, final Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (notificationsSettings.contains("color_" + sharedPrefKey)) {
                i11 = org.telegram.messenger.t.d("color_", sharedPrefKey, notificationsSettings, -16776961);
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
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        String[] strArr = {LocaleController.getString(R.string.ColorRed), LocaleController.getString(R.string.ColorOrange), LocaleController.getString(R.string.ColorYellow), LocaleController.getString(R.string.ColorGreen), LocaleController.getString(R.string.ColorCyan), LocaleController.getString(R.string.ColorBlue), LocaleController.getString(R.string.ColorViolet), LocaleController.getString(R.string.ColorPink), LocaleController.getString(R.string.ColorWhite)};
        final int[] iArr = {i11};
        for (int i13 = 0; i13 < 9; i13++) {
            org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(activity, u6Var);
            p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            p6Var.setTag(Integer.valueOf(i13));
            int i14 = org.telegram.ui.Cells.c9.e[i13];
            p6Var.a(i14, i14);
            String str = strArr[i13];
            if (i11 == org.telegram.ui.Cells.c9.f23945f[i13]) {
                z10 = true;
            } else {
                z10 = false;
            }
            p6Var.b(str, z10);
            f7.addView(p6Var);
            p6Var.setOnClickListener(new r1(f7, iArr));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.LedColor);
        alertDialog$Builder.o(f7);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i15) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                long j12 = j10;
                int i16 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                int[] iArr2 = iArr;
                if (i16 != 0) {
                    edit.putInt(b10.j("color_", sharedPrefKey), iArr2[0]);
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Default), new p1(6, sharedPrefKey, runnable));
        }
        return alertDialog$Builder.f22369a;
    }

    public static org.telegram.ui.ActionBar.e2 t0(org.telegram.ui.ActionBar.r2 r2Var, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        if (r2Var == null) {
            r2Var = LaunchActivity.U();
        }
        if (str2 != null && r2Var != null && r2Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.e2 e2Var = N(r2Var.getParentActivity(), str, str2, null, null, u6Var).f22369a;
            r2Var.showDialog(e2Var);
            return e2Var;
        }
        return null;
    }

    public static void u(org.telegram.ui.ActionBar.r2 r2Var, String str, String str2, String str3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity());
        String string = LocaleController.getString(R.string.ContactNotRegisteredTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = LocaleController.formatString("ContactNotRegistered", R.string.ContactNotRegistered, ContactsController.formatName(str, str2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Invite), new p1(3, str3, r2Var));
        r2Var.showDialog(e2Var);
    }

    public static org.telegram.ui.ActionBar.e2 u0(org.telegram.ui.ActionBar.r2 r2Var, String str, CharSequence charSequence, String str2, boolean z10, Runnable runnable) {
        TextView textView;
        org.telegram.ui.ActionBar.e2 O = O(r2Var.getContext(), r2Var.getResourceProvider(), str, charSequence, str2, runnable);
        r2Var.showDialog(O);
        if (z10 && (textView = (TextView) O.d(-1)) != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
        }
        return O;
    }

    public static AlertDialog$Builder v(Activity activity, final MessagesStorage.IntCallback intCallback) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        int i10 = R.raw.permission_request_contacts;
        int i11 = org.telegram.ui.ActionBar.y6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ContactsPermissionAlert));
        alertDialog$Builder.k(LocaleController.getString(R.string.ContactsPermissionAlertContinue), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
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
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
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

    public static void v0(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        Context context;
        if (str == null) {
            return;
        }
        if (r2Var != null && r2Var.getParentActivity() != null) {
            context = r2Var.getParentActivity();
        } else {
            context = ApplicationLoader.applicationContext;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static AlertDialog$Builder w(Context context, int i10, int i11, int i12, int i13, int i14, int i15, String str, final boolean z10, i2.z zVar) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        final nd0 nd0Var = new nd0(context, null);
        final nd0 nd0Var2 = new nd0(context, null);
        final nd0 nd0Var3 = new nd0(context, null);
        linearLayout.addView(nd0Var2, kb1.p(0.3f, 0, -2));
        nd0Var2.setOnScrollListener(new kd0() {
            @Override
            public final void m(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        nd0Var.setMinValue(0);
        nd0Var.setMaxValue(11);
        linearLayout.addView(nd0Var, kb1.p(0.3f, 0, -2));
        nd0Var.setFormatter(new org.telegram.ui.cg(22));
        nd0Var.setOnValueChangedListener(new l0(nd0Var2, nd0Var, nd0Var3, 1));
        nd0Var.setOnScrollListener(new kd0() {
            @Override
            public final void m(int i16) {
                switch (r5) {
                    case 0:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i16 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i16 = calendar.get(1);
        nd0Var3.setMinValue(i10 + i16);
        nd0Var3.setMaxValue(i11 + i16);
        nd0Var3.setValue(i16 + i12);
        linearLayout.addView(nd0Var3, kb1.p(0.4f, 0, -2));
        nd0Var3.setOnValueChangedListener(new l0(nd0Var2, nd0Var, nd0Var3, 2));
        nd0Var3.setOnScrollListener(new kd0() {
            @Override
            public final void m(int i162) {
                switch (r5) {
                    case 0:
                        if (z10 && i162 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    case 1:
                        if (z10 && i162 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                    default:
                        if (z10 && i162 == 0) {
                            g5.d(nd0Var2, nd0Var, nd0Var3);
                            return;
                        }
                        return;
                }
            }
        });
        x0(nd0Var2, nd0Var, nd0Var3);
        if (z10) {
            d(nd0Var2, nd0Var, nd0Var3);
        }
        if (i13 != -1) {
            nd0Var2.setValue(i13);
            nd0Var.setValue(i14);
            nd0Var3.setValue(i15);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22369a.R = str;
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Set), new org.telegram.messenger.ok(z10, nd0Var2, nd0Var, nd0Var3, zVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        return alertDialog$Builder;
    }

    public static org.telegram.ui.ActionBar.e2 w0(Context context, String str, boolean z10) {
        if (context == null || str == null) {
            return null;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = str;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (z10) {
            alertDialog$Builder.h(LocaleController.getString(R.string.UpdateApp), new j0(context, 2));
        }
        return alertDialog$Builder.p();
    }

    public static void x(Context context, String str, String str2, long j10, e5 e5Var) {
        if (context == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
        int x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, null);
        e3Var.a();
        nd0 nd0Var = new nd0(context, null);
        nd0Var.setTextColor(x02);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        nd0 nd0Var2 = new nd0(context, null);
        nd0Var2.setItemCount(5);
        nd0Var2.setTextColor(x02);
        nd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        nd0 nd0Var3 = new nd0(context, null);
        nd0Var3.setItemCount(5);
        nd0Var3.setTextColor(x02);
        nd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        nd0 nd0Var4 = nd0Var;
        y3 y3Var = new y3(context, nd0Var4, nd0Var2, nd0Var3, 1);
        y3Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        y3Var.addView(frameLayout, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(x02);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        Calendar calendar = Calendar.getInstance();
        bi.md mdVar = new bi.md(context, 15);
        linearLayout.addView(nd0Var4, kb1.p(0.5f, 0, 270));
        nd0Var4.setMinValue(0);
        nd0Var4.setMaxValue(365);
        nd0Var4.setWrapSelectorWheel(false);
        nd0Var4.setFormatter(new org.telegram.ui.cg(25));
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(nd0Var4, nd0Var2, nd0Var3, 19);
        nd0Var4.setOnValueChangedListener(aVar);
        nd0Var2.setMinValue(0);
        nd0Var2.setMaxValue(23);
        linearLayout.addView(nd0Var2, kb1.p(0.2f, 0, 270));
        nd0Var2.setFormatter(new org.telegram.ui.cg(26));
        nd0Var2.setOnValueChangedListener(aVar);
        nd0Var3.setMinValue(0);
        nd0Var3.setMaxValue(59);
        nd0Var3.setValue(0);
        nd0Var3.setFormatter(new org.telegram.ui.cg(27));
        linearLayout.addView(nd0Var3, kb1.p(0.3f, 0, 270));
        nd0Var3.setOnValueChangedListener(aVar);
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
                nd0Var3.setValue(calendar.get(12));
                nd0Var2.setValue(calendar.get(11));
                nd0Var4 = nd0Var4;
                nd0Var4.setValue(timeInMillis);
            } else {
                nd0Var4 = nd0Var4;
            }
        }
        g(null, null, 0L, 0L, 0, nd0Var4, nd0Var2, nd0Var3);
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(x04);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(8.0f);
        mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x05, x06, x06));
        mdVar.setText(str2);
        y3Var.addView(mdVar, kb1.x(-1, 48, 83, 16, 15, 16, 16));
        mdVar.setOnClickListener(new m0(nd0Var4, nd0Var2, nd0Var3, calendar, e5Var, e3Var, 2));
        e3Var.b(y3Var);
        org.telegram.ui.ActionBar.k3 k3Var = e3Var.f22602a;
        k3Var.show();
        k3Var.setBackgroundColor(x03);
        k3Var.fixNavigationBar(x03);
    }

    public static void x0(nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, nd0Var2.getValue());
        calendar.set(1, nd0Var3.getValue());
        nd0Var.setMinValue(1);
        nd0Var.setMaxValue(calendar.getActualMaximum(5));
    }

    public static void y(final org.telegram.ui.ActionBar.r2 r44, final org.telegram.tgnet.TLRPC.User r45, final org.telegram.tgnet.TLRPC.Chat r46, final org.telegram.tgnet.TLRPC.EncryptedChat r47, final org.telegram.tgnet.TLRPC.ChatFull r48, final long r49, final org.telegram.messenger.MessageObject r51, final android.util.SparseArray[] r52, final org.telegram.messenger.MessageObject.GroupedMessages r53, final int r54, final int r55, org.telegram.tgnet.TLRPC.ChannelParticipant[] r56, final java.lang.Runnable r57, java.lang.Runnable r58, final org.telegram.ui.ActionBar.u6 r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.y(org.telegram.ui.ActionBar.r2, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$ChatFull, long, org.telegram.messenger.MessageObject, android.util.SparseArray[], org.telegram.messenger.MessageObject$GroupedMessages, int, int, org.telegram.tgnet.TLRPC$ChannelParticipant[], java.lang.Runnable, java.lang.Runnable, org.telegram.ui.ActionBar.u6):void");
    }

    public static AlertDialog$Builder z(Context context) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        String readRes = AndroidUtilities.readRes(R.raw.pip_voice_request);
        q30 q30Var = new q30(0, context, true);
        q30Var.setImportantForAccessibility(2);
        bh.r rVar = new bh.r(context, q30Var);
        rVar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{-15128003, -15118002}));
        rVar.setClipToOutline(true);
        rVar.setOutlineProvider(new ag.v0(13));
        View view = new View(context);
        view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(184.61539f), false)));
        rVar.addView(view, kb1.h(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
        rVar.addView(q30Var, kb1.g(117.0f, 117));
        alertDialog$Builder.f22369a.V = rVar;
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCallTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PermissionDrawAboveOtherAppsGroupCall);
        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j0(context, 3));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.f22582l0 = true;
        e2Var.V0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22369a.Q0 = 0.5769231f;
        return alertDialog$Builder;
    }
}
