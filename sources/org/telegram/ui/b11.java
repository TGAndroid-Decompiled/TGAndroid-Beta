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
public final class b11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.im0 f35514a;
    public boolean f35515a0;
    public z01 f35516b;
    public AnimatorSet f35517c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final long f35518f;
    public final boolean h;
    public boolean f35519n;
    public a11 f35520r;
    public org.telegram.ui.Components.oo f35521s;
    public int v;
    public int f35522w;
    public int f35523x;
    public int f35524y;

    public b11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.e = bundle.getLong("dialog_id");
        this.f35518f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(b11 b11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(b11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        z01 z01Var = b11Var.f35516b;
        if (z01Var != null) {
            z01Var.m(b11Var.H);
        }
    }

    public static void V(final b11 b11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j10 = b11Var.f35518f;
        long j11 = b11Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = b11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == b11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new w01(b11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                b11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
                }
            } else if (i10 == b11Var.F) {
                Bundle b10 = zf.d0.b(j11, "dialog_id");
                b10.putLong("topic_id", j10);
                b11Var.presentFragment(new mk0(b10, d6Var));
            } else if (i10 == b11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(b11Var.currentAccount);
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
                    b11Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == b11Var.G) {
                Activity parentActivity = b11Var.getParentActivity();
                long j12 = b11Var.e;
                long j13 = b11Var.f35518f;
                Runnable runnable = new Runnable(b11Var) {
                    public final b11 f42953b;

                    {
                        this.f42953b = b11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                b11 b11Var2 = this.f42953b;
                                z01 z01Var = b11Var2.f35516b;
                                if (z01Var != null) {
                                    z01Var.m(b11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                b11 b11Var3 = this.f42953b;
                                z01 z01Var2 = b11Var3.f35516b;
                                if (z01Var2 != null) {
                                    z01Var2.m(b11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                b11 b11Var4 = this.f42953b;
                                z01 z01Var3 = b11Var4.f35516b;
                                if (z01Var3 != null) {
                                    z01Var3.m(b11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                b11 b11Var5 = this.f42953b;
                                z01 z01Var4 = b11Var5.f35516b;
                                if (z01Var4 != null) {
                                    z01Var4.m(b11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = b11Var.d;
                Pattern pattern = org.telegram.ui.Components.f5.f26080a;
                if (j12 != 0) {
                    str3 = a1.g.o(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                b11Var.showDialog(org.telegram.ui.Components.f5.X(parentActivity, j12, j13, str3, runnable, d6Var2));
            } else {
                int i11 = 2;
                if (i10 == b11Var.f35524y) {
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    boolean z10 = !v8Var.e.h;
                    b11Var.f35519n = z10;
                    v8Var.setChecked(z10);
                    int childCount = b11Var.f35514a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) b11Var.f35514a.T(b11Var.f35514a.getChildAt(i12));
                        int i13 = sl0Var.f45913f;
                        View view2 = sl0Var.f45910a;
                        int b11 = sl0Var.b();
                        if (b11 != b11Var.f35524y && b11 != b11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b11 == b11Var.E) {
                                                    ((org.telegram.ui.Cells.v8) view2).e(arrayList, b11Var.f35519n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, b11Var.f35519n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.x8) view2).a(arrayList, b11Var.f35519n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.d9) view2).c(arrayList, b11Var.f35519n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ba) view2).a(arrayList, b11Var.f35519n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.l4) view2).a(arrayList, b11Var.f35519n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = b11Var.f35517c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        b11Var.f35517c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        b11Var.f35517c.addListener(new bc0(b11Var, 21));
                        b11Var.f35517c.setDuration(150L);
                        b11Var.f35517c.start();
                    }
                } else if (i10 == b11Var.E) {
                    org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                    Switch r32 = v8Var2.e;
                    MessagesController.getNotificationsSettings(b11Var.currentAccount).edit().putBoolean(r4.c.h("content_preview_", str), !r32.h).apply();
                    v8Var2.setChecked(!r32.h);
                } else if (i10 == b11Var.R) {
                    b11Var.showDialog(org.telegram.ui.Components.f5.X(b11Var.getParentActivity(), b11Var.e, b11Var.f35518f, r4.c.h("calls_vibrate_", str), new Runnable(b11Var) {
                        public final b11 f42953b;

                        {
                            this.f42953b = b11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    b11 b11Var2 = this.f42953b;
                                    z01 z01Var = b11Var2.f35516b;
                                    if (z01Var != null) {
                                        z01Var.m(b11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    b11 b11Var3 = this.f42953b;
                                    z01 z01Var2 = b11Var3.f35516b;
                                    if (z01Var2 != null) {
                                        z01Var2.m(b11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b11 b11Var4 = this.f42953b;
                                    z01 z01Var3 = b11Var4.f35516b;
                                    if (z01Var3 != null) {
                                        z01Var3.m(b11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    b11 b11Var5 = this.f42953b;
                                    z01 z01Var4 = b11Var5.f35516b;
                                    if (z01Var4 != null) {
                                        z01Var4.m(b11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, b11Var.d));
                } else if (i10 == b11Var.I) {
                    b11Var.showDialog(org.telegram.ui.Components.f5.H(b11Var.getParentActivity(), b11Var.e, b11Var.f35518f, -1, new Runnable(b11Var) {
                        public final b11 f42953b;

                        {
                            this.f42953b = b11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    b11 b11Var2 = this.f42953b;
                                    z01 z01Var = b11Var2.f35516b;
                                    if (z01Var != null) {
                                        z01Var.m(b11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    b11 b11Var3 = this.f42953b;
                                    z01 z01Var2 = b11Var3.f35516b;
                                    if (z01Var2 != null) {
                                        z01Var2.m(b11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    b11 b11Var4 = this.f42953b;
                                    z01 z01Var3 = b11Var4.f35516b;
                                    if (z01Var3 != null) {
                                        z01Var3.m(b11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    b11 b11Var5 = this.f42953b;
                                    z01 z01Var4 = b11Var5.f35516b;
                                    if (z01Var4 != null) {
                                        z01Var4.m(b11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, b11Var.d));
                } else if (i10 == b11Var.H) {
                    if (b11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(b11Var.currentAccount);
                        int c10 = org.telegram.messenger.g0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.g0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = b11Var.getParentActivity();
                        w01 w01Var = new w01(b11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.f5.f26080a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.h6.f21092j5;
                            if (d6Var != null) {
                                x02 = d6Var.r(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.h6.f21057h5;
                            if (d6Var != null) {
                                x03 = d6Var.r(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.h6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.h6.Ji;
                            if (d6Var != null) {
                                d6Var.r(i16);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.h6.Ni;
                            if (d6Var != null) {
                                d6Var.r(i17);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.h6.E8;
                            if (d6Var != null) {
                                d6Var.r(i18);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.h6.G8;
                            if (d6Var != null) {
                                d6Var.r(i19);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.h6.f21075i6;
                            if (d6Var != null) {
                                d6Var.r(i20);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.h6.Sh;
                            if (d6Var != null) {
                                x04 = d6Var.r(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.h6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.h6.Oh;
                            if (d6Var != null) {
                                x05 = d6Var.r(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.h6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.h6.Qh;
                            if (d6Var != null) {
                                x06 = d6Var.r(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.h6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, d6Var);
                            a3Var.a();
                            ?? od0Var = new org.telegram.ui.Components.od0(parentActivity2, d6Var);
                            od0Var.setMinValue(0);
                            od0Var.setMaxValue(10);
                            od0Var.setTextColor(x02);
                            od0Var.setValue(i11 - 1);
                            od0Var.setWrapSelectorWheel(false);
                            od0Var.setFormatter(new tr(21));
                            ?? od0Var2 = new org.telegram.ui.Components.od0(parentActivity2, d6Var);
                            od0Var2.setMinValue(0);
                            od0Var2.setMaxValue(10);
                            od0Var2.setTextColor(x02);
                            od0Var2.setValue((c11 / 60) - 1);
                            od0Var2.setWrapSelectorWheel(false);
                            od0Var2.setFormatter(new tr(22));
                            org.telegram.ui.Components.od0 od0Var3 = new org.telegram.ui.Components.od0(parentActivity2, d6Var);
                            od0Var3.setMinValue(0);
                            od0Var3.setMaxValue(0);
                            od0Var3.setTextColor(x02);
                            od0Var3.setValue(0);
                            od0Var3.setWrapSelectorWheel(false);
                            od0Var3.setFormatter(new tr(23));
                            org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(parentActivity2, od0Var, od0Var2, od0Var3);
                            x3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            x3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
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
                            x3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.vd vdVar = new ai.vd(parentActivity2, 19);
                            linearLayout.addView((View) od0Var, w7.z5.l(0.4f, 0, 270));
                            linearLayout.addView(od0Var3, w7.z5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) od0Var2, w7.z5.l(0.4f, 0, 270));
                            vdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            vdVar.setGravity(17);
                            vdVar.setTextColor(x04);
                            vdVar.setTextSize(1, 14.0f);
                            vdVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            vdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, i23, i25, i25));
                            vdVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            x3Var.addView(vdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            tr trVar = new tr(10);
                            od0Var.setOnValueChangedListener(trVar);
                            od0Var2.setOnValueChangedListener(trVar);
                            vdVar.setOnClickListener(new ci.b4((Object) od0Var, (Object) od0Var2, w01Var, a3Var, 7));
                            a3Var.b(x3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20609a;
                            f3Var.show();
                            f3Var.setBackgroundColor(x03);
                            f3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == b11Var.U) {
                    if (b11Var.getParentActivity() != null) {
                        b11Var.showDialog(org.telegram.ui.Components.f5.t(b11Var.getParentActivity(), b11Var.e, b11Var.f35518f, -1, new Runnable(b11Var) {
                            public final b11 f42953b;

                            {
                                this.f42953b = b11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        b11 b11Var2 = this.f42953b;
                                        z01 z01Var = b11Var2.f35516b;
                                        if (z01Var != null) {
                                            z01Var.m(b11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        b11 b11Var3 = this.f42953b;
                                        z01 z01Var2 = b11Var3.f35516b;
                                        if (z01Var2 != null) {
                                            z01Var2.m(b11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b11 b11Var4 = this.f42953b;
                                        z01 z01Var3 = b11Var4.f35516b;
                                        if (z01Var3 != null) {
                                            z01Var3.m(b11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        b11 b11Var5 = this.f42953b;
                                        z01 z01Var4 = b11Var5.f35516b;
                                        if (z01Var4 != null) {
                                            z01Var4.m(b11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, b11Var.d));
                    }
                } else if (i10 == b11Var.L) {
                    MessagesController.getNotificationsSettings(b11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = b11Var.f35514a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == b11Var.M) {
                    MessagesController.getNotificationsSettings(b11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = b11Var.f35514a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == b11Var.O) {
                    org.telegram.ui.Cells.v8 v8Var3 = (org.telegram.ui.Cells.v8) view;
                    boolean z11 = v8Var3.e.h;
                    boolean z12 = !z11;
                    v8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(b11Var.currentAccount).edit();
                    if (b11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    b11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(b11 b11Var, String str) {
        b11Var.f35515a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(b11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        b11Var.finishFragment();
        a11 a11Var = b11Var.f35520r;
        if (a11Var != null) {
            a11Var.O();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21023f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21321v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f35518f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, sharedPrefKey));
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, d6Var);
        this.f35521s = ooVar;
        ooVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.oo ooVar2 = this.f35521s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(ooVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                og.d.p(this.f35521s.getAvatarImageView(), findTopic, false, true, d6Var);
                this.f35521s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f35521s.setChatAvatar(chat);
                this.f35521s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f35521s.setUserAvatar(user);
                this.f35521s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f35521s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f35521s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, d6Var));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f35514a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35514a);
        frameLayout.addView(this.f35514a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.im0 im0Var2 = this.f35514a;
        z01 z01Var = new z01(this, context);
        this.f35516b = z01Var;
        im0Var2.setAdapter(z01Var);
        this.f35514a.setItemAnimator(null);
        this.f35514a.setLayoutAnimation(null);
        this.f35514a.setLayoutManager(new hg.a0(17));
        this.f35514a.setOnItemClickListener(new pa1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f35516b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        by0 by0Var = new by0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.r8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20986d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21265s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21040g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21059h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21391z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f21374y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f21169n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35514a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f35518f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f35518f);
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
            z01 z01Var = this.f35516b;
            if (z01Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                z01Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f35515a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f35518f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35514a.setPadding(0, 0, 0, i13);
        this.f35514a.setClipToPadding(false);
    }
}
