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
public final class p11 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.yl0 f36291a;
    public boolean f36292a0;
    public n11 f36293b;
    public AnimatorSet f36294c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long e;
    public final long f36295f;
    public final boolean h;
    public boolean f36296n;
    public o11 f36297r;
    public org.telegram.ui.Components.go f36298s;
    public int v;
    public int f36299w;
    public int f36300x;
    public int f36301y;

    public p11(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.d = e6Var;
        this.e = bundle.getLong("dialog_id");
        this.f36295f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(p11 p11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        n11 n11Var = p11Var.f36293b;
        if (n11Var != null) {
            n11Var.m(p11Var.H);
        }
    }

    public static void V(final p11 p11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = p11Var.f36295f;
        long j10 = p11Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = p11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == p11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new k11(p11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                p11Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                }
            } else if (i10 == p11Var.F) {
                Bundle e = v7.k0.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                p11Var.presentFragment(new vk0(e, e6Var));
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
                long j11 = p11Var.e;
                long j12 = p11Var.f36295f;
                Runnable runnable = new Runnable(p11Var) {
                    public final p11 f35228b;

                    {
                        this.f35228b = p11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.f35228b;
                                n11 n11Var = p11Var2.f36293b;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                p11 p11Var3 = this.f35228b;
                                n11 n11Var2 = p11Var3.f36293b;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                p11 p11Var4 = this.f35228b;
                                n11 n11Var3 = p11Var4.f36293b;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                p11 p11Var5 = this.f35228b;
                                n11 n11Var4 = p11Var5.f36293b;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = p11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.f23875a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, str3, runnable, e6Var2));
            } else {
                int i11 = 2;
                if (i10 == p11Var.f36301y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    p11Var.f36296n = z10;
                    w8Var.setChecked(z10);
                    int childCount = p11Var.f36291a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) p11Var.f36291a.U(p11Var.f36291a.getChildAt(i12));
                        int i13 = il0Var.f43008f;
                        View view2 = il0Var.f43005a;
                        int b10 = il0Var.b();
                        if (b10 != p11Var.f36301y && b10 != p11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == p11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, p11Var.f36296n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, p11Var.f36296n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, p11Var.f36296n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, p11Var.f36296n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, p11Var.f36296n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, p11Var.f36296n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = p11Var.f36294c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        p11Var.f36294c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        p11Var.f36294c.addListener(new ap0(p11Var, 16));
                        p11Var.f36294c.setDuration(150L);
                        p11Var.f36294c.start();
                    }
                } else if (i10 == p11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putBoolean(v7.k0.g("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == p11Var.R) {
                    p11Var.showDialog(org.telegram.ui.Components.e5.Y(p11Var.getParentActivity(), p11Var.e, p11Var.f36295f, v7.k0.g("calls_vibrate_", str), new Runnable(p11Var) {
                        public final p11 f35228b;

                        {
                            this.f35228b = p11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    p11 p11Var2 = this.f35228b;
                                    n11 n11Var = p11Var2.f36293b;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    p11 p11Var3 = this.f35228b;
                                    n11 n11Var2 = p11Var3.f36293b;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    p11 p11Var4 = this.f35228b;
                                    n11 n11Var3 = p11Var4.f36293b;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    p11 p11Var5 = this.f35228b;
                                    n11 n11Var4 = p11Var5.f36293b;
                                    if (n11Var4 != null) {
                                        n11Var4.m(p11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, p11Var.d));
                } else if (i10 == p11Var.I) {
                    p11Var.showDialog(org.telegram.ui.Components.e5.I(p11Var.getParentActivity(), p11Var.e, p11Var.f36295f, -1, new Runnable(p11Var) {
                        public final p11 f35228b;

                        {
                            this.f35228b = p11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    p11 p11Var2 = this.f35228b;
                                    n11 n11Var = p11Var2.f36293b;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    p11 p11Var3 = this.f35228b;
                                    n11 n11Var2 = p11Var3.f36293b;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    p11 p11Var4 = this.f35228b;
                                    n11 n11Var3 = p11Var4.f36293b;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    p11 p11Var5 = this.f35228b;
                                    n11 n11Var4 = p11Var5.f36293b;
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
                        int c10 = org.telegram.messenger.l0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.l0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = p11Var.getParentActivity();
                        k11 k11Var = new k11(p11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.e5.f23875a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.i6.f19164j5;
                            if (e6Var != null) {
                                w02 = e6Var.g0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.i6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.i6.f19128h5;
                            if (e6Var != null) {
                                w03 = e6Var.g0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.i6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.i6.Ji;
                            if (e6Var != null) {
                                e6Var.g0(i16);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.i6.Ni;
                            if (e6Var != null) {
                                e6Var.g0(i17);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.i6.E8;
                            if (e6Var != null) {
                                e6Var.g0(i18);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.i6.G8;
                            if (e6Var != null) {
                                e6Var.g0(i19);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.i6.f19147i6;
                            if (e6Var != null) {
                                e6Var.g0(i20);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.i6.Sh;
                            if (e6Var != null) {
                                w04 = e6Var.g0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.i6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.i6.Oh;
                            if (e6Var != null) {
                                w05 = e6Var.g0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.i6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.i6.Qh;
                            if (e6Var != null) {
                                w06 = e6Var.g0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.i6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, e6Var);
                            b3Var.a();
                            ?? ed0Var = new org.telegram.ui.Components.ed0(parentActivity2, e6Var);
                            ed0Var.setMinValue(0);
                            ed0Var.setMaxValue(10);
                            ed0Var.setTextColor(w02);
                            ed0Var.setValue(i11 - 1);
                            ed0Var.setWrapSelectorWheel(false);
                            ed0Var.setFormatter(new org.telegram.ui.Components.w1(5));
                            ?? ed0Var2 = new org.telegram.ui.Components.ed0(parentActivity2, e6Var);
                            ed0Var2.setMinValue(0);
                            ed0Var2.setMaxValue(10);
                            ed0Var2.setTextColor(w02);
                            ed0Var2.setValue((c11 / 60) - 1);
                            ed0Var2.setWrapSelectorWheel(false);
                            ed0Var2.setFormatter(new org.telegram.ui.Components.w1(6));
                            org.telegram.ui.Components.ed0 ed0Var3 = new org.telegram.ui.Components.ed0(parentActivity2, e6Var);
                            ed0Var3.setMinValue(0);
                            ed0Var3.setMaxValue(0);
                            ed0Var3.setTextColor(w02);
                            ed0Var3.setValue(0);
                            ed0Var3.setWrapSelectorWheel(false);
                            ed0Var3.setFormatter(new org.telegram.ui.Components.w1(7));
                            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, ed0Var, ed0Var2, ed0Var3);
                            w3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                            linearLayout.addView((View) ed0Var, w7.y5.l(0.4f, 0, 270));
                            linearLayout.addView(ed0Var3, w7.y5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) ed0Var2, w7.y5.l(0.4f, 0, 270));
                            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            p4Var.setGravity(17);
                            p4Var.setTextColor(w04);
                            p4Var.setTextSize(1, 14.0f);
                            p4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            n4 n4Var = new n4(24);
                            ed0Var.setOnValueChangedListener(n4Var);
                            ed0Var2.setOnValueChangedListener(n4Var);
                            p4Var.setOnClickListener(new ai.o5((Object) ed0Var, (Object) ed0Var2, k11Var, b3Var, 7));
                            b3Var.b(w3Var);
                            org.telegram.ui.ActionBar.g3 g3Var = b3Var.f18683a;
                            g3Var.show();
                            g3Var.setBackgroundColor(w03);
                            g3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == p11Var.U) {
                    if (p11Var.getParentActivity() != null) {
                        p11Var.showDialog(org.telegram.ui.Components.e5.u(p11Var.getParentActivity(), p11Var.e, p11Var.f36295f, -1, new Runnable(p11Var) {
                            public final p11 f35228b;

                            {
                                this.f35228b = p11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        p11 p11Var2 = this.f35228b;
                                        n11 n11Var = p11Var2.f36293b;
                                        if (n11Var != null) {
                                            n11Var.m(p11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        p11 p11Var3 = this.f35228b;
                                        n11 n11Var2 = p11Var3.f36293b;
                                        if (n11Var2 != null) {
                                            n11Var2.m(p11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        p11 p11Var4 = this.f35228b;
                                        n11 n11Var3 = p11Var4.f36293b;
                                        if (n11Var3 != null) {
                                            n11Var3.m(p11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        p11 p11Var5 = this.f35228b;
                                        n11 n11Var4 = p11Var5.f36293b;
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
                    View findViewWithTag = p11Var.f36291a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == p11Var.M) {
                    MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = p11Var.f36291a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == p11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
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

    public static void W(p11 p11Var, String str) {
        p11Var.f36292a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        p11Var.finishFragment();
        o11 o11Var = p11Var.f36297r;
        if (o11Var != null) {
            o11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19094f8;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        lVar.B(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), false);
        this.actionBar.E(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19392v8, e6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f36295f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new m11(this, sharedPrefKey));
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(context, null, false, e6Var);
        this.f36298s = goVar;
        goVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        org.telegram.ui.Components.go goVar2 = this.f36298s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        lVar2.addView(goVar2, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f36298s.getAvatarImageView(), findTopic, false, true, e6Var);
                this.f36298s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f36298s.setChatAvatar(chat);
                this.f36298s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f36298s.setUserAvatar(user);
                this.f36298s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f36298s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f36298s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001a7, e6Var));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f36291a = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f36291a);
        frameLayout.addView(this.f36291a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var2 = this.f36291a;
        n11 n11Var = new n11(this, context);
        this.f36293b = n11Var;
        yl0Var2.setAdapter(n11Var);
        this.f36291a.setItemAnimator(null);
        this.f36291a.setLayoutAnimation(null);
        this.f36291a.setLayoutManager(new gg.b0(17));
        this.f36291a.setOnItemClickListener(new rb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f36293b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qy0 qy0Var = new qy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19112g7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19130h7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19461z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19442y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19242n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36291a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.i6.f19310r0, null, org.telegram.ui.ActionBar.i6.J7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36295f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f36295f);
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
            n11 n11Var = this.f36293b;
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
        if (!this.f36292a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36295f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36291a.setPadding(0, 0, 0, i13);
        this.f36291a.setClipToPadding(false);
    }
}
