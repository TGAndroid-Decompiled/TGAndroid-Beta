package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class c11 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.lm0 f36175a;
    public boolean f36176a0;
    public a11 f36177b;
    public AnimatorSet f36178c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long e;
    public final long f36179f;
    public final boolean h;
    public boolean f36180n;
    public b11 f36181r;
    public org.telegram.ui.Components.mo f36182s;
    public int v;
    public int f36183w;
    public int f36184x;
    public int f36185y;

    public c11(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.d = g6Var;
        this.e = bundle.getLong("dialog_id");
        this.f36179f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(c11 c11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        a11 a11Var = c11Var.f36177b;
        if (a11Var != null) {
            a11Var.m(c11Var.H);
        }
    }

    public static void V(final c11 c11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j10 = c11Var.f36179f;
        long j11 = c11Var.e;
        org.telegram.ui.ActionBar.g6 g6Var = c11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == c11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new x01(c11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c11Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                }
            } else if (i10 == c11Var.F) {
                Bundle e = si.o0.e(j11, "dialog_id");
                e.putLong("topic_id", j10);
                c11Var.presentFragment(new mk0(e, g6Var));
            } else if (i10 == c11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(c11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, str2);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(str2) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    c11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == c11Var.G) {
                Activity parentActivity = c11Var.getParentActivity();
                long j12 = c11Var.e;
                long j13 = c11Var.f36179f;
                Runnable runnable = new Runnable(c11Var) {
                    public final c11 f43723b;

                    {
                        this.f43723b = c11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                c11 c11Var2 = this.f43723b;
                                a11 a11Var = c11Var2.f36177b;
                                if (a11Var != null) {
                                    a11Var.m(c11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                c11 c11Var3 = this.f43723b;
                                a11 a11Var2 = c11Var3.f36177b;
                                if (a11Var2 != null) {
                                    a11Var2.m(c11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                c11 c11Var4 = this.f43723b;
                                a11 a11Var3 = c11Var4.f36177b;
                                if (a11Var3 != null) {
                                    a11Var3.m(c11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                c11 c11Var5 = this.f43723b;
                                a11 a11Var4 = c11Var5.f36177b;
                                if (a11Var4 != null) {
                                    a11Var4.m(c11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = c11Var.d;
                Pattern pattern = org.telegram.ui.Components.d5.f25562a;
                if (j12 != 0) {
                    str3 = a1.g.o(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                c11Var.showDialog(org.telegram.ui.Components.d5.X(parentActivity, j12, j13, str3, runnable, g6Var2));
            } else {
                int i11 = 2;
                if (i10 == c11Var.f36185y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    c11Var.f36180n = z10;
                    w8Var.setChecked(z10);
                    int childCount = c11Var.f36175a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) c11Var.f36175a.T(c11Var.f36175a.getChildAt(i12));
                        int i13 = vl0Var.f46345f;
                        View view2 = vl0Var.f46342a;
                        int b10 = vl0Var.b();
                        if (b10 != c11Var.f36185y && b10 != c11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == c11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, c11Var.f36180n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, c11Var.f36180n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, c11Var.f36180n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, c11Var.f36180n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ca) view2).a(arrayList, c11Var.f36180n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.l4) view2).a(arrayList, c11Var.f36180n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = c11Var.f36178c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c11Var.f36178c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        c11Var.f36178c.addListener(new v70(c11Var, 22));
                        c11Var.f36178c.setDuration(150L);
                        c11Var.f36178c.start();
                    }
                } else if (i10 == c11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(c11Var.currentAccount).edit().putBoolean(si.o0.h("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == c11Var.R) {
                    c11Var.showDialog(org.telegram.ui.Components.d5.X(c11Var.getParentActivity(), c11Var.e, c11Var.f36179f, si.o0.h("calls_vibrate_", str), new Runnable(c11Var) {
                        public final c11 f43723b;

                        {
                            this.f43723b = c11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c11 c11Var2 = this.f43723b;
                                    a11 a11Var = c11Var2.f36177b;
                                    if (a11Var != null) {
                                        a11Var.m(c11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c11 c11Var3 = this.f43723b;
                                    a11 a11Var2 = c11Var3.f36177b;
                                    if (a11Var2 != null) {
                                        a11Var2.m(c11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c11 c11Var4 = this.f43723b;
                                    a11 a11Var3 = c11Var4.f36177b;
                                    if (a11Var3 != null) {
                                        a11Var3.m(c11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c11 c11Var5 = this.f43723b;
                                    a11 a11Var4 = c11Var5.f36177b;
                                    if (a11Var4 != null) {
                                        a11Var4.m(c11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, c11Var.d));
                } else if (i10 == c11Var.I) {
                    c11Var.showDialog(org.telegram.ui.Components.d5.H(c11Var.getParentActivity(), c11Var.e, c11Var.f36179f, -1, new Runnable(c11Var) {
                        public final c11 f43723b;

                        {
                            this.f43723b = c11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c11 c11Var2 = this.f43723b;
                                    a11 a11Var = c11Var2.f36177b;
                                    if (a11Var != null) {
                                        a11Var.m(c11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c11 c11Var3 = this.f43723b;
                                    a11 a11Var2 = c11Var3.f36177b;
                                    if (a11Var2 != null) {
                                        a11Var2.m(c11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c11 c11Var4 = this.f43723b;
                                    a11 a11Var3 = c11Var4.f36177b;
                                    if (a11Var3 != null) {
                                        a11Var3.m(c11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c11 c11Var5 = this.f43723b;
                                    a11 a11Var4 = c11Var5.f36177b;
                                    if (a11Var4 != null) {
                                        a11Var4.m(c11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, c11Var.d));
                } else if (i10 == c11Var.H) {
                    if (c11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(c11Var.currentAccount);
                        int c10 = org.telegram.messenger.v0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.v0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = c11Var.getParentActivity();
                        x01 x01Var = new x01(c11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.d5.f25562a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.k6.f21290j5;
                            if (g6Var != null) {
                                x02 = g6Var.e(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.k6.f21255h5;
                            if (g6Var != null) {
                                x03 = g6Var.e(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.k6.Ji;
                            if (g6Var != null) {
                                g6Var.e(i16);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.k6.Ni;
                            if (g6Var != null) {
                                g6Var.e(i17);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.k6.E8;
                            if (g6Var != null) {
                                g6Var.e(i18);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.k6.G8;
                            if (g6Var != null) {
                                g6Var.e(i19);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.k6.f21273i6;
                            if (g6Var != null) {
                                g6Var.e(i20);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.k6.Sh;
                            if (g6Var != null) {
                                x04 = g6Var.e(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.k6.Oh;
                            if (g6Var != null) {
                                x05 = g6Var.e(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.k6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.k6.Qh;
                            if (g6Var != null) {
                                x06 = g6Var.e(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.k6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, g6Var);
                            b3Var.a();
                            ?? od0Var = new org.telegram.ui.Components.od0(parentActivity2, g6Var);
                            od0Var.setMinValue(0);
                            od0Var.setMaxValue(10);
                            od0Var.setTextColor(x02);
                            od0Var.setValue(i11 - 1);
                            od0Var.setWrapSelectorWheel(false);
                            od0Var.setFormatter(new tr(25));
                            ?? od0Var2 = new org.telegram.ui.Components.od0(parentActivity2, g6Var);
                            od0Var2.setMinValue(0);
                            od0Var2.setMaxValue(10);
                            od0Var2.setTextColor(x02);
                            od0Var2.setValue((c11 / 60) - 1);
                            od0Var2.setWrapSelectorWheel(false);
                            od0Var2.setFormatter(new tr(26));
                            org.telegram.ui.Components.od0 od0Var3 = new org.telegram.ui.Components.od0(parentActivity2, g6Var);
                            od0Var3.setMinValue(0);
                            od0Var3.setMaxValue(0);
                            od0Var3.setTextColor(x02);
                            od0Var3.setValue(0);
                            od0Var3.setWrapSelectorWheel(false);
                            od0Var3.setFormatter(new tr(27));
                            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, od0Var, od0Var2, od0Var3);
                            v3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            v3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(x02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new di.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            v3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.wd wdVar = new ai.wd(parentActivity2, 18);
                            linearLayout.addView((View) od0Var, w7.z5.l(0.4f, 0, 270));
                            linearLayout.addView(od0Var3, w7.z5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) od0Var2, w7.z5.l(0.4f, 0, 270));
                            wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            wdVar.setGravity(17);
                            wdVar.setTextColor(x04);
                            wdVar.setTextSize(1, 14.0f);
                            wdVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, i23, i25, i25));
                            wdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            v3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            tr trVar = new tr(14);
                            od0Var.setOnValueChangedListener(trVar);
                            od0Var2.setOnValueChangedListener(trVar);
                            wdVar.setOnClickListener(new ci.b4((Object) od0Var, (Object) od0Var2, x01Var, b3Var, 7));
                            b3Var.b(v3Var);
                            org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
                            h3Var.show();
                            h3Var.setBackgroundColor(x03);
                            h3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == c11Var.U) {
                    if (c11Var.getParentActivity() != null) {
                        c11Var.showDialog(org.telegram.ui.Components.d5.t(c11Var.getParentActivity(), c11Var.e, c11Var.f36179f, -1, new Runnable(c11Var) {
                            public final c11 f43723b;

                            {
                                this.f43723b = c11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c11 c11Var2 = this.f43723b;
                                        a11 a11Var = c11Var2.f36177b;
                                        if (a11Var != null) {
                                            a11Var.m(c11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        c11 c11Var3 = this.f43723b;
                                        a11 a11Var2 = c11Var3.f36177b;
                                        if (a11Var2 != null) {
                                            a11Var2.m(c11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        c11 c11Var4 = this.f43723b;
                                        a11 a11Var3 = c11Var4.f36177b;
                                        if (a11Var3 != null) {
                                            a11Var3.m(c11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        c11 c11Var5 = this.f43723b;
                                        a11 a11Var4 = c11Var5.f36177b;
                                        if (a11Var4 != null) {
                                            a11Var4.m(c11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, c11Var.d));
                    }
                } else if (i10 == c11Var.L) {
                    MessagesController.getNotificationsSettings(c11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = c11Var.f36175a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == c11Var.M) {
                    MessagesController.getNotificationsSettings(c11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = c11Var.f36175a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == c11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c11Var.currentAccount).edit();
                    if (c11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    c11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(c11 c11Var, String str) {
        c11Var.f36176a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        c11Var.finishFragment();
        b11 b11Var = c11Var.f36181r;
        if (b11Var != null) {
            b11Var.O();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21238g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21221f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(kVar, 3, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21519v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f36179f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, sharedPrefKey));
        org.telegram.ui.Components.mo moVar = new org.telegram.ui.Components.mo(context, null, false, g6Var);
        this.f36182s = moVar;
        moVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.mo moVar2 = this.f36182s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(moVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                og.d.p(this.f36182s.getAvatarImageView(), findTopic, false, true, g6Var);
                this.f36182s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f36182s.setChatAvatar(chat);
                this.f36182s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f36182s.setUserAvatar(user);
                this.f36182s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f36182s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.m().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f36182s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, g6Var);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f36175a = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f36175a);
        frameLayout.addView(this.f36175a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.lm0 lm0Var2 = this.f36175a;
        a11 a11Var = new a11(this, context);
        this.f36177b = a11Var;
        lm0Var2.setAdapter(a11Var);
        this.f36175a.setItemAnimator(null);
        this.f36175a.setLayoutAnimation(null);
        this.f36175a.setLayoutManager(new hg.a0(17));
        this.f36175a.setOnItemClickListener(new ra1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f36177b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(20, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36175a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36175a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36175a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21572y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f36175a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        int i12;
        Ringtone ringtone;
        if (i11 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) != null) {
                if (i10 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString(R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString(R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36179f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f36179f);
            } else if (i10 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + sharedPrefKey, str);
                    edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                    edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
                }
            }
            edit.apply();
            a11 a11Var = this.f36177b;
            if (a11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                a11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f36176a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36179f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36175a.setPadding(0, 0, 0, i13);
        this.f36175a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
