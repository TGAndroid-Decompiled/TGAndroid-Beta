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
public final class k11 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
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
    public boolean W;
    public boolean X;
    public org.telegram.ui.Components.sl0 f38159a;
    public i11 f38160b;
    public AnimatorSet f38161c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long f38162e;
    public final long f38163f;
    public final boolean h;
    public boolean f38164n;
    public j11 f38165r;
    public org.telegram.ui.Components.ao f38166s;
    public int v;
    public int f38167w;
    public int f38168x;
    public int f38169y;

    public k11(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.d = g6Var;
        this.f38162e = bundle.getLong("dialog_id");
        this.f38163f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(k11 k11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(k11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        i11 i11Var = k11Var.f38160b;
        if (i11Var != null) {
            i11Var.m(k11Var.E);
        }
    }

    public static void V(final k11 k11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j10 = k11Var.f38163f;
        long j11 = k11Var.f38162e;
        org.telegram.ui.ActionBar.g6 g6Var = k11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == k11Var.T) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new f11(k11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                k11Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                }
            } else if (i10 == k11Var.C) {
                Bundle g10 = l.d.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                k11Var.presentFragment(new qk0(g10, g6Var));
            } else if (i10 == k11Var.N) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(k11Var.currentAccount);
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
                    k11Var.startActivityForResult(intent, 13);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else if (i10 == k11Var.D) {
                Activity parentActivity = k11Var.getParentActivity();
                long j12 = k11Var.f38162e;
                long j13 = k11Var.f38163f;
                Runnable runnable = new Runnable(k11Var) {
                    public final k11 f36964b;

                    {
                        this.f36964b = k11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                k11 k11Var2 = this.f36964b;
                                i11 i11Var = k11Var2.f38160b;
                                if (i11Var != null) {
                                    i11Var.m(k11Var2.D);
                                    return;
                                }
                                return;
                            case 1:
                                k11 k11Var3 = this.f36964b;
                                i11 i11Var2 = k11Var3.f38160b;
                                if (i11Var2 != null) {
                                    i11Var2.m(k11Var3.O);
                                    return;
                                }
                                return;
                            case 2:
                                k11 k11Var4 = this.f36964b;
                                i11 i11Var3 = k11Var4.f38160b;
                                if (i11Var3 != null) {
                                    i11Var3.m(k11Var4.F);
                                    return;
                                }
                                return;
                            default:
                                k11 k11Var5 = this.f36964b;
                                i11 i11Var4 = k11Var5.f38160b;
                                if (i11Var4 != null) {
                                    i11Var4.m(k11Var5.R);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = k11Var.d;
                Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                if (j12 != 0) {
                    str3 = android.support.v4.media.a.n(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                k11Var.showDialog(org.telegram.ui.Components.z4.Y(parentActivity, j12, j13, str3, runnable, g6Var2));
            } else {
                int i11 = 2;
                if (i10 == k11Var.f38169y) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z4 = !s8Var.f23755e.h;
                    k11Var.f38164n = z4;
                    s8Var.setChecked(z4);
                    int childCount = k11Var.f38159a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) k11Var.f38159a.T(k11Var.f38159a.getChildAt(i12));
                        int i13 = el0Var.f5879f;
                        View view2 = el0Var.f5875a;
                        int b10 = el0Var.b();
                        if (b10 != k11Var.f38169y && b10 != k11Var.T) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == k11Var.B) {
                                                    ((org.telegram.ui.Cells.s8) view2).e(arrayList, k11Var.f38164n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, k11Var.f38164n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.u8) view2).a(arrayList, k11Var.f38164n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.a9) view2).c(arrayList, k11Var.f38164n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.aa) view2).a(arrayList, k11Var.f38164n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, k11Var.f38164n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = k11Var.f38161c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        k11Var.f38161c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        k11Var.f38161c.addListener(new ss0(k11Var, 14));
                        k11Var.f38161c.setDuration(150L);
                        k11Var.f38161c.start();
                    }
                } else if (i10 == k11Var.B) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    Switch r32 = s8Var2.f23755e;
                    MessagesController.getNotificationsSettings(k11Var.currentAccount).edit().putBoolean(yh.k("content_preview_", str), !r32.h).apply();
                    s8Var2.setChecked(!r32.h);
                } else if (i10 == k11Var.O) {
                    k11Var.showDialog(org.telegram.ui.Components.z4.Y(k11Var.getParentActivity(), k11Var.f38162e, k11Var.f38163f, yh.k("calls_vibrate_", str), new Runnable(k11Var) {
                        public final k11 f36964b;

                        {
                            this.f36964b = k11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    k11 k11Var2 = this.f36964b;
                                    i11 i11Var = k11Var2.f38160b;
                                    if (i11Var != null) {
                                        i11Var.m(k11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    k11 k11Var3 = this.f36964b;
                                    i11 i11Var2 = k11Var3.f38160b;
                                    if (i11Var2 != null) {
                                        i11Var2.m(k11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    k11 k11Var4 = this.f36964b;
                                    i11 i11Var3 = k11Var4.f38160b;
                                    if (i11Var3 != null) {
                                        i11Var3.m(k11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    k11 k11Var5 = this.f36964b;
                                    i11 i11Var4 = k11Var5.f38160b;
                                    if (i11Var4 != null) {
                                        i11Var4.m(k11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, k11Var.d));
                } else if (i10 == k11Var.F) {
                    k11Var.showDialog(org.telegram.ui.Components.z4.I(k11Var.getParentActivity(), k11Var.f38162e, k11Var.f38163f, -1, new Runnable(k11Var) {
                        public final k11 f36964b;

                        {
                            this.f36964b = k11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    k11 k11Var2 = this.f36964b;
                                    i11 i11Var = k11Var2.f38160b;
                                    if (i11Var != null) {
                                        i11Var.m(k11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    k11 k11Var3 = this.f36964b;
                                    i11 i11Var2 = k11Var3.f38160b;
                                    if (i11Var2 != null) {
                                        i11Var2.m(k11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    k11 k11Var4 = this.f36964b;
                                    i11 i11Var3 = k11Var4.f38160b;
                                    if (i11Var3 != null) {
                                        i11Var3.m(k11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    k11 k11Var5 = this.f36964b;
                                    i11 i11Var4 = k11Var5.f38160b;
                                    if (i11Var4 != null) {
                                        i11Var4.m(k11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, k11Var.d));
                } else if (i10 == k11Var.E) {
                    if (k11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(k11Var.currentAccount);
                        int c3 = org.telegram.messenger.y3.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c10 = org.telegram.messenger.y3.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c3 != 0) {
                            i11 = c3;
                        }
                        Activity parentActivity2 = k11Var.getParentActivity();
                        f11 f11Var = new f11(k11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.z4.f33754a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.k6.f21768j5;
                            if (g6Var != null) {
                                w02 = g6Var.e0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.k6.f21733h5;
                            if (g6Var != null) {
                                w03 = g6Var.e0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.k6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.k6.Ji;
                            if (g6Var != null) {
                                g6Var.e0(i16);
                            } else {
                                org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.k6.Ni;
                            if (g6Var != null) {
                                g6Var.e0(i17);
                            } else {
                                org.telegram.ui.ActionBar.k6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.k6.E8;
                            if (g6Var != null) {
                                g6Var.e0(i18);
                            } else {
                                org.telegram.ui.ActionBar.k6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.k6.G8;
                            if (g6Var != null) {
                                g6Var.e0(i19);
                            } else {
                                org.telegram.ui.ActionBar.k6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.k6.f21752i6;
                            if (g6Var != null) {
                                g6Var.e0(i20);
                            } else {
                                org.telegram.ui.ActionBar.k6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.k6.Sh;
                            if (g6Var != null) {
                                w04 = g6Var.e0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.k6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.k6.Oh;
                            if (g6Var != null) {
                                w05 = g6Var.e0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.k6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.k6.Qh;
                            if (g6Var != null) {
                                w06 = g6Var.e0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.k6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(parentActivity2, g6Var);
                            c3Var.a();
                            ?? yc0Var = new org.telegram.ui.Components.yc0(parentActivity2, g6Var);
                            yc0Var.setMinValue(0);
                            yc0Var.setMaxValue(10);
                            yc0Var.setTextColor(w02);
                            yc0Var.setValue(i11 - 1);
                            yc0Var.setWrapSelectorWheel(false);
                            yc0Var.setFormatter(new as(20));
                            ?? yc0Var2 = new org.telegram.ui.Components.yc0(parentActivity2, g6Var);
                            yc0Var2.setMinValue(0);
                            yc0Var2.setMaxValue(10);
                            yc0Var2.setTextColor(w02);
                            yc0Var2.setValue((c10 / 60) - 1);
                            yc0Var2.setWrapSelectorWheel(false);
                            yc0Var2.setFormatter(new as(21));
                            org.telegram.ui.Components.yc0 yc0Var3 = new org.telegram.ui.Components.yc0(parentActivity2, g6Var);
                            yc0Var3.setMinValue(0);
                            yc0Var3.setMaxValue(0);
                            yc0Var3.setTextColor(w02);
                            yc0Var3.setValue(0);
                            yc0Var3.setWrapSelectorWheel(false);
                            yc0Var3.setFormatter(new as(22));
                            org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(parentActivity2, yc0Var, yc0Var2, yc0Var3);
                            s3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            s3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            hg.q qVar = new hg.q(parentActivity2, 17);
                            linearLayout.addView((View) yc0Var, k7.c6.l(0.4f, 0, 270));
                            linearLayout.addView(yc0Var3, k7.c6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) yc0Var2, k7.c6.l(0.4f, 0, 270));
                            qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            qVar.setGravity(17);
                            qVar.setTextColor(w04);
                            qVar.setTextSize(1, 14.0f);
                            qVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, i23, i25, i25));
                            qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                            as asVar = new as(9);
                            yc0Var.setOnValueChangedListener(asVar);
                            yc0Var2.setOnValueChangedListener(asVar);
                            qVar.setOnClickListener(new lh.u3((Object) yc0Var, (Object) yc0Var2, f11Var, c3Var, 5));
                            c3Var.b(s3Var);
                            org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21209a;
                            h3Var.show();
                            h3Var.setBackgroundColor(w03);
                            h3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == k11Var.R) {
                    if (k11Var.getParentActivity() != null) {
                        k11Var.showDialog(org.telegram.ui.Components.z4.u(k11Var.getParentActivity(), k11Var.f38162e, k11Var.f38163f, -1, new Runnable(k11Var) {
                            public final k11 f36964b;

                            {
                                this.f36964b = k11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        k11 k11Var2 = this.f36964b;
                                        i11 i11Var = k11Var2.f38160b;
                                        if (i11Var != null) {
                                            i11Var.m(k11Var2.D);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        k11 k11Var3 = this.f36964b;
                                        i11 i11Var2 = k11Var3.f38160b;
                                        if (i11Var2 != null) {
                                            i11Var2.m(k11Var3.O);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        k11 k11Var4 = this.f36964b;
                                        i11 i11Var3 = k11Var4.f38160b;
                                        if (i11Var3 != null) {
                                            i11Var3.m(k11Var4.F);
                                            return;
                                        }
                                        return;
                                    default:
                                        k11 k11Var5 = this.f36964b;
                                        i11 i11Var4 = k11Var5.f38160b;
                                        if (i11Var4 != null) {
                                            i11Var4.m(k11Var5.R);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, k11Var.d));
                    }
                } else if (i10 == k11Var.I) {
                    MessagesController.getNotificationsSettings(k11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = k11Var.f38159a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == k11Var.J) {
                    MessagesController.getNotificationsSettings(k11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = k11Var.f38159a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == k11Var.L) {
                    org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                    boolean z10 = s8Var3.f23755e.h;
                    boolean z11 = !z10;
                    s8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(k11Var.currentAccount).edit();
                    if (k11Var.W && !z10) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z11);
                    }
                    edit.apply();
                    k11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(k11 k11Var, String str) {
        k11Var.X = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(k11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        k11Var.finishFragment();
        j11 j11Var = k11Var.f38165r;
        if (j11Var != null) {
            j11Var.d0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21700f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21983v8, g6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f38162e;
        long j11 = this.f38163f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new h11(this, sharedPrefKey));
        org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(context, null, false, g6Var);
        this.f38166s = aoVar;
        aoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.ao aoVar2 = this.f38166s;
        if (!this.inPreviewMode) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        kVar2.addView(aoVar2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                bg.e.p(this.f38166s.getAvatarImageView(), findTopic, false, true, g6Var);
                this.f38166s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f38166s.setChatAvatar(chat);
                this.f38166s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f38166s.setUserAvatar(user);
                this.f38166s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f38166s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f38166s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, g6Var));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f38159a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f38159a);
        frameLayout.addView(this.f38159a, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var2 = this.f38159a;
        i11 i11Var = new i11(this, context);
        this.f38160b = i11Var;
        sl0Var2.setAdapter(i11Var);
        this.f38159a.setItemAnimator(null);
        this.f38159a.setLayoutAnimation(null);
        this.f38159a.setLayoutManager(new k(15));
        this.f38159a.setOnItemClickListener(new lb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f38160b.l();
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
        jy0 jy0Var = new jy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21717g7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21735h7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38159a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f38162e, this.f38163f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f38162e, this.f38163f);
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
            i11 i11Var = this.f38160b;
            if (i11Var != null) {
                if (i10 == 13) {
                    i12 = this.N;
                } else {
                    i12 = this.C;
                }
                i11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f38162e, this.f38163f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38159a.setPadding(0, 0, 0, i13);
        this.f38159a.setClipToPadding(false);
    }
}
