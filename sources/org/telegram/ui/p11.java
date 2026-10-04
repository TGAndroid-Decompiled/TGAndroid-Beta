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
public final class p11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.zl0 f39318a;
    public boolean f39319a0;
    public n11 f39320b;
    public AnimatorSet f39321c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long f39322e;
    public final long f39323f;
    public final boolean h;
    public boolean f39324n;
    public o11 f39325r;
    public org.telegram.ui.Components.ho f39326s;
    public int v;
    public int f39327w;
    public int f39328x;
    public int f39329y;

    public p11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.f39322e = bundle.getLong("dialog_id");
        this.f39323f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void S(p11 p11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        n11 n11Var = p11Var.f39320b;
        if (n11Var != null) {
            n11Var.m(p11Var.H);
        }
    }

    public static void T(final p11 p11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = p11Var.f39323f;
        long j10 = p11Var.f39322e;
        org.telegram.ui.ActionBar.d6 d6Var = p11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == p11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new k11(p11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                p11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
                }
            } else if (i10 == p11Var.F) {
                Bundle f7 = sa.e.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                p11Var.presentFragment(new wk0(f7, d6Var));
            } else if (i10 == p11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(p11Var.currentAccount);
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
                    p11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == p11Var.G) {
                Activity parentActivity = p11Var.getParentActivity();
                long j11 = p11Var.f39322e;
                long j12 = p11Var.f39323f;
                Runnable runnable = new Runnable(p11Var) {
                    public final p11 f38144b;

                    {
                        this.f38144b = p11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.f38144b;
                                n11 n11Var = p11Var2.f39320b;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                p11 p11Var3 = this.f38144b;
                                n11 n11Var2 = p11Var3.f39320b;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                p11 p11Var4 = this.f38144b;
                                n11 n11Var3 = p11Var4.f39320b;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                p11 p11Var5 = this.f38144b;
                                n11 n11Var4 = p11Var5.f39320b;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = p11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.f25919a;
                if (j11 != 0) {
                    str3 = a4.a.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, str3, runnable, d6Var2));
            } else {
                int i11 = 2;
                if (i10 == p11Var.f39329y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.f23696e.h;
                    p11Var.f39324n = z10;
                    w8Var.setChecked(z10);
                    int childCount = p11Var.f39318a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) p11Var.f39318a.T(p11Var.f39318a.getChildAt(i12));
                        int i13 = il0Var.f46535f;
                        View view2 = il0Var.f46531a;
                        int b10 = il0Var.b();
                        if (b10 != p11Var.f39329y && b10 != p11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == p11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, p11Var.f39324n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, p11Var.f39324n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, p11Var.f39324n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, p11Var.f39324n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, p11Var.f39324n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, p11Var.f39324n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = p11Var.f39321c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        p11Var.f39321c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        p11Var.f39321c.addListener(new ap0(p11Var, 16));
                        p11Var.f39321c.setDuration(150L);
                        p11Var.f39321c.start();
                    }
                } else if (i10 == p11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.f23696e;
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putBoolean(sa.e.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == p11Var.R) {
                    p11Var.showDialog(org.telegram.ui.Components.e5.Y(p11Var.getParentActivity(), p11Var.f39322e, p11Var.f39323f, sa.e.i("calls_vibrate_", str), new Runnable(p11Var) {
                        public final p11 f38144b;

                        {
                            this.f38144b = p11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    p11 p11Var2 = this.f38144b;
                                    n11 n11Var = p11Var2.f39320b;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    p11 p11Var3 = this.f38144b;
                                    n11 n11Var2 = p11Var3.f39320b;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    p11 p11Var4 = this.f38144b;
                                    n11 n11Var3 = p11Var4.f39320b;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    p11 p11Var5 = this.f38144b;
                                    n11 n11Var4 = p11Var5.f39320b;
                                    if (n11Var4 != null) {
                                        n11Var4.m(p11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, p11Var.d));
                } else if (i10 == p11Var.I) {
                    p11Var.showDialog(org.telegram.ui.Components.e5.I(p11Var.getParentActivity(), p11Var.f39322e, p11Var.f39323f, -1, new Runnable(p11Var) {
                        public final p11 f38144b;

                        {
                            this.f38144b = p11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    p11 p11Var2 = this.f38144b;
                                    n11 n11Var = p11Var2.f39320b;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    p11 p11Var3 = this.f38144b;
                                    n11 n11Var2 = p11Var3.f39320b;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    p11 p11Var4 = this.f38144b;
                                    n11 n11Var3 = p11Var4.f39320b;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    p11 p11Var5 = this.f38144b;
                                    n11 n11Var4 = p11Var5.f39320b;
                                    if (n11Var4 != null) {
                                        n11Var4.m(p11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, p11Var.d));
                } else if (i10 == p11Var.H) {
                    if (p11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(p11Var.currentAccount);
                        int c10 = org.telegram.messenger.q.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.q.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = p11Var.getParentActivity();
                        k11 k11Var = new k11(p11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.e5.f25919a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.i6.f20930j5;
                            if (d6Var != null) {
                                w02 = d6Var.j0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.i6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.i6.f20894h5;
                            if (d6Var != null) {
                                w03 = d6Var.j0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.i6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.i6.Ji;
                            if (d6Var != null) {
                                d6Var.j0(i16);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.i6.Ni;
                            if (d6Var != null) {
                                d6Var.j0(i17);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.i6.E8;
                            if (d6Var != null) {
                                d6Var.j0(i18);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.i6.G8;
                            if (d6Var != null) {
                                d6Var.j0(i19);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.i6.f20913i6;
                            if (d6Var != null) {
                                d6Var.j0(i20);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.i6.Sh;
                            if (d6Var != null) {
                                w04 = d6Var.j0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.i6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.i6.Oh;
                            if (d6Var != null) {
                                w05 = d6Var.j0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.i6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.i6.Qh;
                            if (d6Var != null) {
                                w06 = d6Var.j0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.i6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, d6Var);
                            a3Var.a();
                            ?? gd0Var = new org.telegram.ui.Components.gd0(parentActivity2, d6Var);
                            gd0Var.setMinValue(0);
                            gd0Var.setMaxValue(10);
                            gd0Var.setTextColor(w02);
                            gd0Var.setValue(i11 - 1);
                            gd0Var.setWrapSelectorWheel(false);
                            gd0Var.setFormatter(new org.telegram.ui.Components.w1(6));
                            ?? gd0Var2 = new org.telegram.ui.Components.gd0(parentActivity2, d6Var);
                            gd0Var2.setMinValue(0);
                            gd0Var2.setMaxValue(10);
                            gd0Var2.setTextColor(w02);
                            gd0Var2.setValue((c11 / 60) - 1);
                            gd0Var2.setWrapSelectorWheel(false);
                            gd0Var2.setFormatter(new org.telegram.ui.Components.w1(7));
                            org.telegram.ui.Components.gd0 gd0Var3 = new org.telegram.ui.Components.gd0(parentActivity2, d6Var);
                            gd0Var3.setMinValue(0);
                            gd0Var3.setMaxValue(0);
                            gd0Var3.setTextColor(w02);
                            gd0Var3.setValue(0);
                            gd0Var3.setWrapSelectorWheel(false);
                            gd0Var3.setFormatter(new org.telegram.ui.Components.w1(8));
                            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, gd0Var, gd0Var2, gd0Var3);
                            w3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                            linearLayout.addView((View) gd0Var, w7.z5.l(0.4f, 0, 270));
                            linearLayout.addView(gd0Var3, w7.z5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) gd0Var2, w7.z5.l(0.4f, 0, 270));
                            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            p4Var.setGravity(17);
                            p4Var.setTextColor(w04);
                            p4Var.setTextSize(1, 14.0f);
                            p4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            w3Var.addView(p4Var, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                            m4 m4Var = new m4(25);
                            gd0Var.setOnValueChangedListener(m4Var);
                            gd0Var2.setOnValueChangedListener(m4Var);
                            p4Var.setOnClickListener(new ai.o5((Object) gd0Var, (Object) gd0Var2, k11Var, a3Var, 7));
                            a3Var.b(w3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20378a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == p11Var.U) {
                    if (p11Var.getParentActivity() != null) {
                        p11Var.showDialog(org.telegram.ui.Components.e5.u(p11Var.getParentActivity(), p11Var.f39322e, p11Var.f39323f, -1, new Runnable(p11Var) {
                            public final p11 f38144b;

                            {
                                this.f38144b = p11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        p11 p11Var2 = this.f38144b;
                                        n11 n11Var = p11Var2.f39320b;
                                        if (n11Var != null) {
                                            n11Var.m(p11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        p11 p11Var3 = this.f38144b;
                                        n11 n11Var2 = p11Var3.f39320b;
                                        if (n11Var2 != null) {
                                            n11Var2.m(p11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        p11 p11Var4 = this.f38144b;
                                        n11 n11Var3 = p11Var4.f39320b;
                                        if (n11Var3 != null) {
                                            n11Var3.m(p11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        p11 p11Var5 = this.f38144b;
                                        n11 n11Var4 = p11Var5.f39320b;
                                        if (n11Var4 != null) {
                                            n11Var4.m(p11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, p11Var.d));
                    }
                } else if (i10 == p11Var.L) {
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = p11Var.f39318a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == p11Var.M) {
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = p11Var.f39318a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == p11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.f23696e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
                    if (p11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    p11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void U(p11 p11Var, String str) {
        p11Var.f39319a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        p11Var.finishFragment();
        o11 o11Var = p11Var.f39325r;
        if (o11Var != null) {
            o11Var.d0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20860f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21159v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f39322e;
        long j10 = this.f39323f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new m11(this, sharedPrefKey));
        org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(context, null, false, d6Var);
        this.f39326s = hoVar;
        hoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.ho hoVar2 = this.f39326s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(hoVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f39326s.getAvatarImageView(), findTopic, false, true, d6Var);
                this.f39326s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f39326s.setChatAvatar(chat);
                this.f39326s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f39326s.setUserAvatar(user);
                this.f39326s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f39326s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f39326s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20766a7, d6Var));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f39318a = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f39318a);
        frameLayout.addView(this.f39318a, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var2 = this.f39318a;
        n11 n11Var = new n11(this, context);
        this.f39320b = n11Var;
        zl0Var2.setAdapter(n11Var);
        this.f39318a.setItemAnimator(null);
        this.f39318a.setLayoutAnimation(null);
        this.f39318a.setLayoutManager(new gg.b0(17));
        this.f39318a.setOnItemClickListener(new ub1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f39320b.l();
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
        qy0 qy0Var = new qy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21104s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20878g7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20896h7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21228z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f21209y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f21008n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39318a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39322e, this.f39323f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f39322e, this.f39323f);
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
            n11 n11Var = this.f39320b;
            if (n11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                n11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f39319a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f39322e, this.f39323f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39318a.setPadding(0, 0, 0, i13);
        this.f39318a.setClipToPadding(false);
    }
}
