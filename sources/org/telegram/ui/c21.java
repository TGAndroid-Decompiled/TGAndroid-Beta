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
public final class c21 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.mm0 f34706a;
    public boolean f34707a0;
    public a21 f34708b;
    public AnimatorSet f34709c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long e;
    public final long f34710f;
    public final boolean h;
    public boolean f34711n;
    public b21 f34712r;
    public org.telegram.ui.Components.ro f34713s;
    public int v;
    public int f34714w;
    public int f34715x;
    public int f34716y;

    public c21(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.d = c6Var;
        this.e = bundle.getLong("dialog_id");
        this.f34710f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(c21 c21Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        a21 a21Var = c21Var.f34708b;
        if (a21Var != null) {
            a21Var.m(c21Var.H);
        }
    }

    public static void V(final c21 c21Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j10 = c21Var.f34710f;
        long j11 = c21Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = c21Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == c21Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new x11(c21Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c21Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                }
            } else if (i10 == c21Var.F) {
                Bundle e = t8.b.e(j11, "dialog_id");
                e.putLong("topic_id", j10);
                c21Var.presentFragment(new fl0(e, c6Var));
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
                long j12 = c21Var.e;
                long j13 = c21Var.f34710f;
                Runnable runnable = new Runnable(c21Var) {
                    public final c21 f42008b;

                    {
                        this.f42008b = c21Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                c21 c21Var2 = this.f42008b;
                                a21 a21Var = c21Var2.f34708b;
                                if (a21Var != null) {
                                    a21Var.m(c21Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                c21 c21Var3 = this.f42008b;
                                a21 a21Var2 = c21Var3.f34708b;
                                if (a21Var2 != null) {
                                    a21Var2.m(c21Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                c21 c21Var4 = this.f42008b;
                                a21 a21Var3 = c21Var4.f34708b;
                                if (a21Var3 != null) {
                                    a21Var3.m(c21Var4.I);
                                    return;
                                }
                                return;
                            default:
                                c21 c21Var5 = this.f42008b;
                                a21 a21Var4 = c21Var5.f34708b;
                                if (a21Var4 != null) {
                                    a21Var4.m(c21Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.c6 c6Var2 = c21Var.d;
                Pattern pattern = org.telegram.ui.Components.g5.f25184a;
                if (j12 != 0) {
                    str3 = a1.g.o(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                c21Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j12, j13, str3, runnable, c6Var2));
            } else {
                int i11 = 2;
                if (i10 == c21Var.f34716y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    c21Var.f34711n = z10;
                    w8Var.setChecked(z10);
                    int childCount = c21Var.f34706a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) c21Var.f34706a.T(c21Var.f34706a.getChildAt(i12));
                        int i13 = wl0Var.f44841f;
                        View view2 = wl0Var.f44838a;
                        int b10 = wl0Var.b();
                        if (b10 != c21Var.f34716y && b10 != c21Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == c21Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, c21Var.f34711n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, c21Var.f34711n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, c21Var.f34711n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, c21Var.f34711n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ca) view2).a(arrayList, c21Var.f34711n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, c21Var.f34711n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = c21Var.f34709c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c21Var.f34709c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        c21Var.f34709c.addListener(new lj0(c21Var, 19));
                        c21Var.f34709c.setDuration(150L);
                        c21Var.f34709c.start();
                    }
                } else if (i10 == c21Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putBoolean(t8.b.h("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == c21Var.R) {
                    c21Var.showDialog(org.telegram.ui.Components.g5.X(c21Var.getParentActivity(), c21Var.e, c21Var.f34710f, t8.b.h("calls_vibrate_", str), new Runnable(c21Var) {
                        public final c21 f42008b;

                        {
                            this.f42008b = c21Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c21 c21Var2 = this.f42008b;
                                    a21 a21Var = c21Var2.f34708b;
                                    if (a21Var != null) {
                                        a21Var.m(c21Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c21 c21Var3 = this.f42008b;
                                    a21 a21Var2 = c21Var3.f34708b;
                                    if (a21Var2 != null) {
                                        a21Var2.m(c21Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c21 c21Var4 = this.f42008b;
                                    a21 a21Var3 = c21Var4.f34708b;
                                    if (a21Var3 != null) {
                                        a21Var3.m(c21Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c21 c21Var5 = this.f42008b;
                                    a21 a21Var4 = c21Var5.f34708b;
                                    if (a21Var4 != null) {
                                        a21Var4.m(c21Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, c21Var.d));
                } else if (i10 == c21Var.I) {
                    c21Var.showDialog(org.telegram.ui.Components.g5.H(c21Var.getParentActivity(), c21Var.e, c21Var.f34710f, -1, new Runnable(c21Var) {
                        public final c21 f42008b;

                        {
                            this.f42008b = c21Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    c21 c21Var2 = this.f42008b;
                                    a21 a21Var = c21Var2.f34708b;
                                    if (a21Var != null) {
                                        a21Var.m(c21Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    c21 c21Var3 = this.f42008b;
                                    a21 a21Var2 = c21Var3.f34708b;
                                    if (a21Var2 != null) {
                                        a21Var2.m(c21Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    c21 c21Var4 = this.f42008b;
                                    a21 a21Var3 = c21Var4.f34708b;
                                    if (a21Var3 != null) {
                                        a21Var3.m(c21Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    c21 c21Var5 = this.f42008b;
                                    a21 a21Var4 = c21Var5.f34708b;
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
                        int d = org.telegram.messenger.q.d("smart_max_count_", str, notificationsSettings2, 2);
                        int d10 = org.telegram.messenger.q.d("smart_delay_", str, notificationsSettings2, 180);
                        if (d != 0) {
                            i11 = d;
                        }
                        Activity parentActivity2 = c21Var.getParentActivity();
                        x11 x11Var = new x11(c21Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.g5.f25184a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.g6.f20007j5;
                            if (c6Var != null) {
                                x02 = c6Var.b0(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.g6.f19972h5;
                            if (c6Var != null) {
                                x03 = c6Var.b0(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.g6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.g6.Ji;
                            if (c6Var != null) {
                                c6Var.b0(i16);
                            } else {
                                org.telegram.ui.ActionBar.g6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.g6.Ni;
                            if (c6Var != null) {
                                c6Var.b0(i17);
                            } else {
                                org.telegram.ui.ActionBar.g6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.g6.E8;
                            if (c6Var != null) {
                                c6Var.b0(i18);
                            } else {
                                org.telegram.ui.ActionBar.g6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.g6.G8;
                            if (c6Var != null) {
                                c6Var.b0(i19);
                            } else {
                                org.telegram.ui.ActionBar.g6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.g6.f19990i6;
                            if (c6Var != null) {
                                c6Var.b0(i20);
                            } else {
                                org.telegram.ui.ActionBar.g6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.g6.Sh;
                            if (c6Var != null) {
                                x04 = c6Var.b0(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.g6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.g6.Oh;
                            if (c6Var != null) {
                                x05 = c6Var.b0(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.g6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.g6.Qh;
                            if (c6Var != null) {
                                x06 = c6Var.b0(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.g6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, c6Var);
                            z2Var.a();
                            ?? ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, c6Var);
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setTextColor(x02);
                            ud0Var.setValue(i11 - 1);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setFormatter(new is(21));
                            ?? ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, c6Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setTextColor(x02);
                            ud0Var2.setValue((d10 / 60) - 1);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setFormatter(new is(22));
                            org.telegram.ui.Components.ud0 ud0Var3 = new org.telegram.ui.Components.ud0(parentActivity2, c6Var);
                            ud0Var3.setMinValue(0);
                            ud0Var3.setMaxValue(0);
                            ud0Var3.setTextColor(x02);
                            ud0Var3.setValue(0);
                            ud0Var3.setWrapSelectorWheel(false);
                            ud0Var3.setFormatter(new is(23));
                            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, ud0Var, ud0Var2, ud0Var3);
                            y3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            y3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(x02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new ci.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            y3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.f4 f4Var = new bi.f4(parentActivity2, 18);
                            linearLayout.addView((View) ud0Var, w7.a6.l(0.4f, 0, 270));
                            linearLayout.addView(ud0Var3, w7.a6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) ud0Var2, w7.a6.l(0.4f, 0, 270));
                            f4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            f4Var.setGravity(17);
                            f4Var.setTextColor(x04);
                            f4Var.setTextSize(1, 14.0f);
                            f4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            f4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, i23, i25, i25));
                            f4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            y3Var.addView(f4Var, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                            is isVar = new is(10);
                            ud0Var.setOnValueChangedListener(isVar);
                            ud0Var2.setOnValueChangedListener(isVar);
                            f4Var.setOnClickListener(new bi.b5((Object) ud0Var, (Object) ud0Var2, x11Var, z2Var, 7));
                            z2Var.b(y3Var);
                            org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20838a;
                            e3Var.show();
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == c21Var.U) {
                    if (c21Var.getParentActivity() != null) {
                        c21Var.showDialog(org.telegram.ui.Components.g5.t(c21Var.getParentActivity(), c21Var.e, c21Var.f34710f, -1, new Runnable(c21Var) {
                            public final c21 f42008b;

                            {
                                this.f42008b = c21Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        c21 c21Var2 = this.f42008b;
                                        a21 a21Var = c21Var2.f34708b;
                                        if (a21Var != null) {
                                            a21Var.m(c21Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        c21 c21Var3 = this.f42008b;
                                        a21 a21Var2 = c21Var3.f34708b;
                                        if (a21Var2 != null) {
                                            a21Var2.m(c21Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        c21 c21Var4 = this.f42008b;
                                        a21 a21Var3 = c21Var4.f34708b;
                                        if (a21Var3 != null) {
                                            a21Var3.m(c21Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        c21 c21Var5 = this.f42008b;
                                        a21 a21Var4 = c21Var5.f34708b;
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
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = c21Var.f34706a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == c21Var.M) {
                    MessagesController.getNotificationsSettings(c21Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = c21Var.f34706a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == c21Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
                    if (c21Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    c21Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(c21 c21Var, String str) {
        c21Var.f34707a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(c21Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        c21Var.finishFragment();
        b21 b21Var = c21Var.f34712r;
        if (b21Var != null) {
            b21Var.a0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19938f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20235v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f34710f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new z11(this, sharedPrefKey));
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, null, false, c6Var);
        this.f34713s = roVar;
        roVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.ro roVar2 = this.f34713s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(roVar2, 0, w7.a6.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                og.d.p(this.f34713s.getAvatarImageView(), findTopic, false, true, c6Var);
                this.f34713s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f34713s.setChatAvatar(chat);
                this.f34713s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f34713s.setUserAvatar(user);
                this.f34713s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f34713s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f34713s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f34706a = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34706a);
        frameLayout.addView(this.f34706a, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var2 = this.f34706a;
        a21 a21Var = new a21(this, context);
        this.f34708b = a21Var;
        mm0Var2.setAdapter(a21Var);
        this.f34706a.setItemAnimator(null);
        this.f34706a.setLayoutAnimation(null);
        this.f34706a.setLayoutManager(new hg.a0(17));
        this.f34706a.setOnItemClickListener(new fc1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f34708b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        cz0 cz0Var = new cz0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f20180s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19955g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19974h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34706a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f34710f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f34710f);
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
            a21 a21Var = this.f34708b;
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
        if (!this.f34707a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f34710f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34706a.setPadding(0, 0, 0, i13);
        this.f34706a.setClipToPadding(false);
    }
}
