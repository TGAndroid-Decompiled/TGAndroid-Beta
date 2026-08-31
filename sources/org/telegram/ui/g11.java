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
public final class g11 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.tl0 f37056a;
    public e11 f37057b;
    public AnimatorSet f37058c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long f37059e;
    public final long f37060f;
    public final boolean h;
    public boolean f37061n;
    public f11 f37062r;
    public org.telegram.ui.Components.bo f37063s;
    public int v;
    public int f37064w;
    public int f37065x;
    public int f37066y;

    public g11(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.d = g6Var;
        this.f37059e = bundle.getLong("dialog_id");
        this.f37060f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(g11 g11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(g11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        e11 e11Var = g11Var.f37057b;
        if (e11Var != null) {
            e11Var.m(g11Var.E);
        }
    }

    public static void V(final g11 g11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j10 = g11Var.f37060f;
        long j11 = g11Var.f37059e;
        org.telegram.ui.ActionBar.g6 g6Var = g11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == g11Var.T) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new b11(g11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                g11Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                }
            } else if (i10 == g11Var.C) {
                Bundle g10 = l.d.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                g11Var.presentFragment(new qk0(g10, g6Var));
            } else if (i10 == g11Var.N) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(g11Var.currentAccount);
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
                    g11Var.startActivityForResult(intent, 13);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else if (i10 == g11Var.D) {
                Activity parentActivity = g11Var.getParentActivity();
                long j12 = g11Var.f37059e;
                long j13 = g11Var.f37060f;
                Runnable runnable = new Runnable(g11Var) {
                    public final g11 f35646b;

                    {
                        this.f35646b = g11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                g11 g11Var2 = this.f35646b;
                                e11 e11Var = g11Var2.f37057b;
                                if (e11Var != null) {
                                    e11Var.m(g11Var2.D);
                                    return;
                                }
                                return;
                            case 1:
                                g11 g11Var3 = this.f35646b;
                                e11 e11Var2 = g11Var3.f37057b;
                                if (e11Var2 != null) {
                                    e11Var2.m(g11Var3.O);
                                    return;
                                }
                                return;
                            case 2:
                                g11 g11Var4 = this.f35646b;
                                e11 e11Var3 = g11Var4.f37057b;
                                if (e11Var3 != null) {
                                    e11Var3.m(g11Var4.F);
                                    return;
                                }
                                return;
                            default:
                                g11 g11Var5 = this.f35646b;
                                e11 e11Var4 = g11Var5.f37057b;
                                if (e11Var4 != null) {
                                    e11Var4.m(g11Var5.R);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = g11Var.d;
                Pattern pattern = org.telegram.ui.Components.z4.f33718a;
                if (j12 != 0) {
                    str3 = android.support.v4.media.a.n(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                g11Var.showDialog(org.telegram.ui.Components.z4.Y(parentActivity, j12, j13, str3, runnable, g6Var2));
            } else {
                int i11 = 2;
                if (i10 == g11Var.f37066y) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z4 = !s8Var.f23753e.h;
                    g11Var.f37061n = z4;
                    s8Var.setChecked(z4);
                    int childCount = g11Var.f37056a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) g11Var.f37056a.T(g11Var.f37056a.getChildAt(i12));
                        int i13 = fl0Var.f5879f;
                        View view2 = fl0Var.f5875a;
                        int b10 = fl0Var.b();
                        if (b10 != g11Var.f37066y && b10 != g11Var.T) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == g11Var.B) {
                                                    ((org.telegram.ui.Cells.s8) view2).e(arrayList, g11Var.f37061n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, g11Var.f37061n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.u8) view2).a(arrayList, g11Var.f37061n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.a9) view2).c(arrayList, g11Var.f37061n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.aa) view2).a(arrayList, g11Var.f37061n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, g11Var.f37061n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = g11Var.f37058c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        g11Var.f37058c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        g11Var.f37058c.addListener(new ns0(g11Var, 14));
                        g11Var.f37058c.setDuration(150L);
                        g11Var.f37058c.start();
                    }
                } else if (i10 == g11Var.B) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    Switch r32 = s8Var2.f23753e;
                    MessagesController.getNotificationsSettings(g11Var.currentAccount).edit().putBoolean(yh.k("content_preview_", str), !r32.h).apply();
                    s8Var2.setChecked(!r32.h);
                } else if (i10 == g11Var.O) {
                    g11Var.showDialog(org.telegram.ui.Components.z4.Y(g11Var.getParentActivity(), g11Var.f37059e, g11Var.f37060f, yh.k("calls_vibrate_", str), new Runnable(g11Var) {
                        public final g11 f35646b;

                        {
                            this.f35646b = g11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    g11 g11Var2 = this.f35646b;
                                    e11 e11Var = g11Var2.f37057b;
                                    if (e11Var != null) {
                                        e11Var.m(g11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    g11 g11Var3 = this.f35646b;
                                    e11 e11Var2 = g11Var3.f37057b;
                                    if (e11Var2 != null) {
                                        e11Var2.m(g11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g11 g11Var4 = this.f35646b;
                                    e11 e11Var3 = g11Var4.f37057b;
                                    if (e11Var3 != null) {
                                        e11Var3.m(g11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    g11 g11Var5 = this.f35646b;
                                    e11 e11Var4 = g11Var5.f37057b;
                                    if (e11Var4 != null) {
                                        e11Var4.m(g11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, g11Var.d));
                } else if (i10 == g11Var.F) {
                    g11Var.showDialog(org.telegram.ui.Components.z4.I(g11Var.getParentActivity(), g11Var.f37059e, g11Var.f37060f, -1, new Runnable(g11Var) {
                        public final g11 f35646b;

                        {
                            this.f35646b = g11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    g11 g11Var2 = this.f35646b;
                                    e11 e11Var = g11Var2.f37057b;
                                    if (e11Var != null) {
                                        e11Var.m(g11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    g11 g11Var3 = this.f35646b;
                                    e11 e11Var2 = g11Var3.f37057b;
                                    if (e11Var2 != null) {
                                        e11Var2.m(g11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    g11 g11Var4 = this.f35646b;
                                    e11 e11Var3 = g11Var4.f37057b;
                                    if (e11Var3 != null) {
                                        e11Var3.m(g11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    g11 g11Var5 = this.f35646b;
                                    e11 e11Var4 = g11Var5.f37057b;
                                    if (e11Var4 != null) {
                                        e11Var4.m(g11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, g11Var.d));
                } else if (i10 == g11Var.E) {
                    if (g11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(g11Var.currentAccount);
                        int c3 = org.telegram.messenger.y3.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c10 = org.telegram.messenger.y3.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c3 != 0) {
                            i11 = c3;
                        }
                        Activity parentActivity2 = g11Var.getParentActivity();
                        b11 b11Var = new b11(g11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.z4.f33718a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.k6.f21766j5;
                            if (g6Var != null) {
                                w02 = g6Var.e0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.k6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.k6.f21731h5;
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
                            int i20 = org.telegram.ui.ActionBar.k6.f21750i6;
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
                            qVar.setOnClickListener(new lh.u3((Object) yc0Var, (Object) yc0Var2, b11Var, c3Var, 5));
                            c3Var.b(s3Var);
                            org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21207a;
                            h3Var.show();
                            h3Var.setBackgroundColor(w03);
                            h3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == g11Var.R) {
                    if (g11Var.getParentActivity() != null) {
                        g11Var.showDialog(org.telegram.ui.Components.z4.u(g11Var.getParentActivity(), g11Var.f37059e, g11Var.f37060f, -1, new Runnable(g11Var) {
                            public final g11 f35646b;

                            {
                                this.f35646b = g11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        g11 g11Var2 = this.f35646b;
                                        e11 e11Var = g11Var2.f37057b;
                                        if (e11Var != null) {
                                            e11Var.m(g11Var2.D);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        g11 g11Var3 = this.f35646b;
                                        e11 e11Var2 = g11Var3.f37057b;
                                        if (e11Var2 != null) {
                                            e11Var2.m(g11Var3.O);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g11 g11Var4 = this.f35646b;
                                        e11 e11Var3 = g11Var4.f37057b;
                                        if (e11Var3 != null) {
                                            e11Var3.m(g11Var4.F);
                                            return;
                                        }
                                        return;
                                    default:
                                        g11 g11Var5 = this.f35646b;
                                        e11 e11Var4 = g11Var5.f37057b;
                                        if (e11Var4 != null) {
                                            e11Var4.m(g11Var5.R);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, g11Var.d));
                    }
                } else if (i10 == g11Var.I) {
                    MessagesController.getNotificationsSettings(g11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = g11Var.f37056a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == g11Var.J) {
                    MessagesController.getNotificationsSettings(g11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = g11Var.f37056a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == g11Var.L) {
                    org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                    boolean z10 = s8Var3.f23753e.h;
                    boolean z11 = !z10;
                    s8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(g11Var.currentAccount).edit();
                    if (g11Var.W && !z10) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z11);
                    }
                    edit.apply();
                    g11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(g11 g11Var, String str) {
        g11Var.X = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(g11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        g11Var.finishFragment();
        f11 f11Var = g11Var.f37062r;
        if (f11Var != null) {
            f11Var.d0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21698f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, g6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f37059e;
        long j11 = this.f37060f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new d11(this, sharedPrefKey));
        org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(context, null, false, g6Var);
        this.f37063s = boVar;
        boVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.bo boVar2 = this.f37063s;
        if (!this.inPreviewMode) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        kVar2.addView(boVar2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                bg.e.p(this.f37063s.getAvatarImageView(), findTopic, false, true, g6Var);
                this.f37063s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f37063s.setChatAvatar(chat);
                this.f37063s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f37063s.setUserAvatar(user);
                this.f37063s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f37063s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f37063s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, g6Var));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f37056a = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37056a);
        frameLayout.addView(this.f37056a, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.tl0 tl0Var2 = this.f37056a;
        e11 e11Var = new e11(this, context);
        this.f37057b = e11Var;
        tl0Var2.setAdapter(e11Var);
        this.f37056a.setItemAnimator(null);
        this.f37056a.setLayoutAnimation(null);
        this.f37056a.setLayoutManager(new k(15));
        this.f37056a.setOnItemClickListener(new fb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f37057b.l();
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
        ey0 ey0Var = new ey0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.u8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.u8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21715g7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21733h7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37056a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f37059e, this.f37060f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f37059e, this.f37060f);
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
            e11 e11Var = this.f37057b;
            if (e11Var != null) {
                if (i10 == 13) {
                    i12 = this.N;
                } else {
                    i12 = this.C;
                }
                e11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f37059e, this.f37060f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37056a.setPadding(0, 0, 0, i13);
        this.f37056a.setClipToPadding(false);
    }
}
