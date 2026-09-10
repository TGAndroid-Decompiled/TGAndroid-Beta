package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
public final class c21 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.vl0 f31498a;
    public boolean f31499a0;
    public a21 f31500b;
    public AnimatorSet f31501c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f31502f;
    public final boolean h;
    public boolean f31503n;
    public b21 f31504r;
    public org.telegram.ui.Components.jo f31505s;
    public int v;
    public int f31506w;
    public int f31507x;
    public int f31508y;

    public c21(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f31502f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(c21 c21Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        a21 a21Var = c21Var.f31500b;
        if (a21Var != null) {
            a21Var.m(c21Var.H);
        }
    }

    public static void V(final c21 c21Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = c21Var.f31502f;
        long j10 = c21Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = c21Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == c21Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new x11(c21Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c21Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                }
            } else if (i10 == c21Var.F) {
                Bundle e = w.f.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                c21Var.presentFragment(new al0(e, f6Var));
            } else if (i10 == c21Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(c21Var.currentAccount);
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
                    c21Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == c21Var.G) {
                Activity parentActivity = c21Var.getParentActivity();
                long j11 = c21Var.e;
                long j12 = c21Var.f31502f;
                Runnable runnable = new Runnable(c21Var) {
                    public final c21 f38873b;

                    {
                        this.f38873b = c21Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                c21 c21Var2 = this.f38873b;
                                a21 a21Var = c21Var2.f31500b;
                                if (a21Var != null) {
                                    a21Var.m(c21Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                c21 c21Var3 = this.f38873b;
                                a21 a21Var2 = c21Var3.f31500b;
                                if (a21Var2 != null) {
                                    a21Var2.m(c21Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                c21 c21Var4 = this.f38873b;
                                a21 a21Var3 = c21Var4.f31500b;
                                if (a21Var3 != null) {
                                    a21Var3.m(c21Var4.I);
                                    return;
                                }
                                return;
                            default:
                                c21 c21Var5 = this.f38873b;
                                a21 a21Var4 = c21Var5.f31500b;
                                if (a21Var4 != null) {
                                    a21Var4.m(c21Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = c21Var.d;
                Pattern pattern = org.telegram.ui.Components.d5.f22289a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                c21Var.showDialog(org.telegram.ui.Components.d5.Y(parentActivity, j11, j12, str3, runnable, f6Var2));
            } else {
                int i11 = 2;
                if (i10 == c21Var.f31508y) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    boolean z10 = !x8Var.e.h;
                    c21Var.f31503n = z10;
                    x8Var.setChecked(z10);
                    int childCount = c21Var.f31498a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) c21Var.f31498a.T(c21Var.f31498a.getChildAt(i12));
                        int i13 = fl0Var.f41613f;
                        View view2 = fl0Var.f41610a;
                        int b10 = fl0Var.b();
                        if (b10 != c21Var.f31508y && b10 != c21Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == c21Var.E) {
                                                    ((org.telegram.ui.Cells.x8) view2).e(arrayList, c21Var.f31503n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.l6) view2).b(arrayList, c21Var.f31503n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.z8) view2).a(arrayList, c21Var.f31503n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.f9) view2).c(arrayList, c21Var.f31503n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ga) view2).a(arrayList, c21Var.f31503n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, c21Var.f31503n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = c21Var.f31501c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c21Var.f31501c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        c21Var.f31501c.addListener(new mv0(c21Var, 5));
                        c21Var.f31501c.setDuration(150L);
                        c21Var.f31501c.start();
                    }
                } else if (i10 == c21Var.E) {
                    org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                    Switch r32 = x8Var2.e;
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.r6.i("content_preview_", str), !r32.h).apply();
                    x8Var2.setChecked(!r32.h);
                } else if (i10 == c21Var.R) {
                    c21Var.showDialog(org.telegram.ui.Components.d5.Y(c21Var.getParentActivity(), c21Var.e, c21Var.f31502f, org.telegram.ui.Cells.r6.i("calls_vibrate_", str), new Runnable(c21Var) {
                        public final c21 f38873b;

                        {
                            this.f38873b = c21Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c21 c21Var2 = this.f38873b;
                                    a21 a21Var = c21Var2.f31500b;
                                    if (a21Var != null) {
                                        a21Var.m(c21Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c21 c21Var3 = this.f38873b;
                                    a21 a21Var2 = c21Var3.f31500b;
                                    if (a21Var2 != null) {
                                        a21Var2.m(c21Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c21 c21Var4 = this.f38873b;
                                    a21 a21Var3 = c21Var4.f31500b;
                                    if (a21Var3 != null) {
                                        a21Var3.m(c21Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c21 c21Var5 = this.f38873b;
                                    a21 a21Var4 = c21Var5.f31500b;
                                    if (a21Var4 != null) {
                                        a21Var4.m(c21Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, c21Var.d));
                } else if (i10 == c21Var.I) {
                    c21Var.showDialog(org.telegram.ui.Components.d5.I(c21Var.getParentActivity(), c21Var.e, c21Var.f31502f, -1, new Runnable(c21Var) {
                        public final c21 f38873b;

                        {
                            this.f38873b = c21Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c21 c21Var2 = this.f38873b;
                                    a21 a21Var = c21Var2.f31500b;
                                    if (a21Var != null) {
                                        a21Var.m(c21Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c21 c21Var3 = this.f38873b;
                                    a21 a21Var2 = c21Var3.f31500b;
                                    if (a21Var2 != null) {
                                        a21Var2.m(c21Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c21 c21Var4 = this.f38873b;
                                    a21 a21Var3 = c21Var4.f31500b;
                                    if (a21Var3 != null) {
                                        a21Var3.m(c21Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c21 c21Var5 = this.f38873b;
                                    a21 a21Var4 = c21Var5.f31500b;
                                    if (a21Var4 != null) {
                                        a21Var4.m(c21Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, c21Var.d));
                } else if (i10 == c21Var.H) {
                    if (c21Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(c21Var.currentAccount);
                        int c10 = org.telegram.messenger.a2.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.a2.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = c21Var.getParentActivity();
                        x11 x11Var = new x11(c21Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.d5.f22289a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f18034j5;
                            if (f6Var != null) {
                                w02 = f6Var.e0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f17998h5;
                            if (f6Var != null) {
                                w03 = f6Var.e0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (f6Var != null) {
                                f6Var.e0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (f6Var != null) {
                                f6Var.e0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (f6Var != null) {
                                f6Var.e0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (f6Var != null) {
                                f6Var.e0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f18017i6;
                            if (f6Var != null) {
                                f6Var.e0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (f6Var != null) {
                                w04 = f6Var.e0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (f6Var != null) {
                                w05 = f6Var.e0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (f6Var != null) {
                                w06 = f6Var.e0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(parentActivity2, f6Var);
                            c3Var.a();
                            ?? dd0Var = new org.telegram.ui.Components.dd0(parentActivity2, f6Var);
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setTextColor(w02);
                            dd0Var.setValue(i11 - 1);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setFormatter(new org.telegram.ui.Components.b(17));
                            ?? dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity2, f6Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setTextColor(w02);
                            dd0Var2.setValue((c11 / 60) - 1);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setFormatter(new org.telegram.ui.Components.b(18));
                            org.telegram.ui.Components.dd0 dd0Var3 = new org.telegram.ui.Components.dd0(parentActivity2, f6Var);
                            dd0Var3.setMinValue(0);
                            dd0Var3.setMaxValue(0);
                            dd0Var3.setTextColor(w02);
                            dd0Var3.setValue(0);
                            dd0Var3.setWrapSelectorWheel(false);
                            dd0Var3.setFormatter(new org.telegram.ui.Components.b(19));
                            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, dd0Var, dd0Var2, dd0Var3);
                            v3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ai.h(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.h hVar = new di.h(parentActivity2, 17);
                            linearLayout.addView((View) dd0Var, w7.a6.l(0.4f, 0, 270));
                            linearLayout.addView(dd0Var3, w7.a6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) dd0Var2, w7.a6.l(0.4f, 0, 270));
                            hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            hVar.setGravity(17);
                            hVar.setTextColor(w04);
                            hVar.setTextSize(1, 14.0f);
                            hVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            hVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Components.b bVar = new org.telegram.ui.Components.b(6);
                            dd0Var.setOnValueChangedListener(bVar);
                            dd0Var2.setOnValueChangedListener(bVar);
                            hVar.setOnClickListener(new di.o((Object) dd0Var, (Object) dd0Var2, x11Var, c3Var, 6));
                            c3Var.b(v3Var);
                            org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
                            h3Var.show();
                            h3Var.setBackgroundColor(w03);
                            h3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == c21Var.U) {
                    if (c21Var.getParentActivity() != null) {
                        c21Var.showDialog(org.telegram.ui.Components.d5.u(c21Var.getParentActivity(), c21Var.e, c21Var.f31502f, -1, new Runnable(c21Var) {
                            public final c21 f38873b;

                            {
                                this.f38873b = c21Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c21 c21Var2 = this.f38873b;
                                        a21 a21Var = c21Var2.f31500b;
                                        if (a21Var != null) {
                                            a21Var.m(c21Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        c21 c21Var3 = this.f38873b;
                                        a21 a21Var2 = c21Var3.f31500b;
                                        if (a21Var2 != null) {
                                            a21Var2.m(c21Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        c21 c21Var4 = this.f38873b;
                                        a21 a21Var3 = c21Var4.f31500b;
                                        if (a21Var3 != null) {
                                            a21Var3.m(c21Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        c21 c21Var5 = this.f38873b;
                                        a21 a21Var4 = c21Var5.f31500b;
                                        if (a21Var4 != null) {
                                            a21Var4.m(c21Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, c21Var.d));
                    }
                } else if (i10 == c21Var.L) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag = c21Var.f31498a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == c21Var.M) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag2 = c21Var.f31498a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == c21Var.O) {
                    org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
                    boolean z11 = x8Var3.e.h;
                    boolean z12 = !z11;
                    x8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
                    if (c21Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    c21Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(c21 c21Var, String str) {
        c21Var.f31499a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        c21Var.finishFragment();
        b21 b21Var = c21Var.f31504r;
        if (b21Var != null) {
            b21Var.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f17965f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        lVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f31502f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new z11(this, sharedPrefKey));
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(context, null, false, f6Var);
        this.f31505s = joVar;
        joVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        org.telegram.ui.Components.jo joVar2 = this.f31505s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        lVar2.addView(joVar2, 0, w7.a6.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                mg.d.p(this.f31505s.getAvatarImageView(), findTopic, false, true, f6Var);
                this.f31505s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f31505s.setChatAvatar(chat);
                this.f31505s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f31505s.setUserAvatar(user);
                this.f31505s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f31505s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f31505s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f31498a = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f31498a);
        frameLayout.addView(this.f31498a, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var2 = this.f31498a;
        a21 a21Var = new a21(this, context);
        this.f31500b = a21Var;
        vl0Var2.setAdapter(a21Var);
        this.f31498a.setItemAnimator(null);
        this.f31498a.setLayoutAnimation(null);
        this.f31498a.setLayoutManager(new fg.a0(17));
        this.f31498a.setOnItemClickListener(new dc1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f31500b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        zy0 zy0Var = new zy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.l6.class, org.telegram.ui.Cells.ab.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17983g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18000h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, null, null, -1, zy0Var, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31498a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, org.telegram.ui.ActionBar.j6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f31502f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f31502f);
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
            a21 a21Var = this.f31500b;
            if (a21Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                a21Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c21.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f31499a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f31502f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31498a.setPadding(0, 0, 0, i13);
        this.f31498a.setClipToPadding(false);
    }
}
