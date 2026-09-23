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
    public org.telegram.ui.Components.ml0 f35998a;
    public boolean f35999a0;
    public n11 f36000b;
    public AnimatorSet f36001c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final long f36002f;
    public final boolean h;
    public boolean f36003n;
    public o11 f36004r;
    public org.telegram.ui.Components.fo f36005s;
    public int v;
    public int f36006w;
    public int f36007x;
    public int f36008y;

    public p11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.e = bundle.getLong("dialog_id");
        this.f36002f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(p11 p11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        n11 n11Var = p11Var.f36000b;
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
        long j3 = p11Var.f36002f;
        long j10 = p11Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = p11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == p11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new k11(p11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                p11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                }
            } else if (i10 == p11Var.F) {
                Bundle e = w.c.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                p11Var.presentFragment(new sk0(e, d6Var));
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
                long j12 = p11Var.f36002f;
                Runnable runnable = new Runnable(p11Var) {
                    public final p11 f34843b;

                    {
                        this.f34843b = p11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.f34843b;
                                n11 n11Var = p11Var2.f36000b;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                p11 p11Var3 = this.f34843b;
                                n11 n11Var2 = p11Var3.f36000b;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                p11 p11Var4 = this.f34843b;
                                n11 n11Var3 = p11Var4.f36000b;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                p11 p11Var5 = this.f34843b;
                                n11 n11Var4 = p11Var5.f36000b;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = p11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.f23567a;
                if (j11 != 0) {
                    str3 = a4.a.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, str3, runnable, d6Var2));
            } else if (i10 == p11Var.f36008y) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                boolean z10 = !x8Var.e.h;
                p11Var.f36003n = z10;
                x8Var.setChecked(z10);
                int childCount = p11Var.f35998a.getChildCount();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < childCount; i11++) {
                    org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) p11Var.f35998a.T(p11Var.f35998a.getChildAt(i11));
                    int i12 = wk0Var.f42630f;
                    View view2 = wk0Var.f42627a;
                    int b10 = wk0Var.b();
                    if (b10 != p11Var.f36008y && b10 != p11Var.W) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        if (i12 != 4) {
                                            if (i12 == 7 && b10 == p11Var.E) {
                                                ((org.telegram.ui.Cells.x8) view2).e(arrayList, p11Var.f36003n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.k6) view2).b(arrayList, p11Var.f36003n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.z8) view2).a(arrayList, p11Var.f36003n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.f9) view2).c(arrayList, p11Var.f36003n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.fa) view2).a(arrayList, p11Var.f36003n);
                            }
                        } else {
                            ((org.telegram.ui.Cells.m4) view2).a(arrayList, p11Var.f36003n);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AnimatorSet animatorSet = p11Var.f36001c;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    p11Var.f36001c = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    p11Var.f36001c.addListener(new wq0(p11Var, 15));
                    p11Var.f36001c.setDuration(150L);
                    p11Var.f36001c.start();
                }
            } else if (i10 == p11Var.E) {
                org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                Switch r32 = x8Var2.e;
                MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.q3.i("content_preview_", str), !r32.h).apply();
                x8Var2.setChecked(!r32.h);
            } else if (i10 == p11Var.R) {
                p11Var.showDialog(org.telegram.ui.Components.e5.Y(p11Var.getParentActivity(), p11Var.e, p11Var.f36002f, org.telegram.ui.Cells.q3.i("calls_vibrate_", str), new Runnable(p11Var) {
                    public final p11 f34843b;

                    {
                        this.f34843b = p11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.f34843b;
                                n11 n11Var = p11Var2.f36000b;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                p11 p11Var3 = this.f34843b;
                                n11 n11Var2 = p11Var3.f36000b;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                p11 p11Var4 = this.f34843b;
                                n11 n11Var3 = p11Var4.f36000b;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                p11 p11Var5 = this.f34843b;
                                n11 n11Var4 = p11Var5.f36000b;
                                if (n11Var4 != null) {
                                    n11Var4.m(p11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                }, p11Var.d));
            } else if (i10 == p11Var.I) {
                p11Var.showDialog(org.telegram.ui.Components.e5.I(p11Var.getParentActivity(), p11Var.e, p11Var.f36002f, -1, new Runnable(p11Var) {
                    public final p11 f34843b;

                    {
                        this.f34843b = p11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p11 p11Var2 = this.f34843b;
                                n11 n11Var = p11Var2.f36000b;
                                if (n11Var != null) {
                                    n11Var.m(p11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                p11 p11Var3 = this.f34843b;
                                n11 n11Var2 = p11Var3.f36000b;
                                if (n11Var2 != null) {
                                    n11Var2.m(p11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                p11 p11Var4 = this.f34843b;
                                n11 n11Var3 = p11Var4.f36000b;
                                if (n11Var3 != null) {
                                    n11Var3.m(p11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                p11 p11Var5 = this.f34843b;
                                n11 n11Var4 = p11Var5.f36000b;
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
                    int c10 = org.telegram.messenger.z0.c("smart_max_count_", str, notificationsSettings2, 2);
                    int c11 = org.telegram.messenger.z0.c("smart_delay_", str, notificationsSettings2, 180);
                    if (c10 == 0) {
                        c10 = 2;
                    }
                    Activity parentActivity2 = p11Var.getParentActivity();
                    k11 k11Var = new k11(p11Var, str);
                    Pattern pattern2 = org.telegram.ui.Components.e5.f23567a;
                    if (parentActivity2 != null) {
                        int i13 = org.telegram.ui.ActionBar.h6.f18895j5;
                        if (d6Var != null) {
                            w02 = d6Var.g0(i13);
                        } else {
                            w02 = org.telegram.ui.ActionBar.h6.w0(null, i13, false);
                        }
                        int i14 = org.telegram.ui.ActionBar.h6.f18859h5;
                        if (d6Var != null) {
                            w03 = d6Var.g0(i14);
                        } else {
                            w03 = org.telegram.ui.ActionBar.h6.w0(null, i14, false);
                        }
                        int i15 = org.telegram.ui.ActionBar.h6.Ji;
                        if (d6Var != null) {
                            d6Var.g0(i15);
                        } else {
                            org.telegram.ui.ActionBar.h6.w0(null, i15, false);
                        }
                        int i16 = org.telegram.ui.ActionBar.h6.Ni;
                        if (d6Var != null) {
                            d6Var.g0(i16);
                        } else {
                            org.telegram.ui.ActionBar.h6.w0(null, i16, false);
                        }
                        int i17 = org.telegram.ui.ActionBar.h6.E8;
                        if (d6Var != null) {
                            d6Var.g0(i17);
                        } else {
                            org.telegram.ui.ActionBar.h6.w0(null, i17, false);
                        }
                        int i18 = org.telegram.ui.ActionBar.h6.G8;
                        if (d6Var != null) {
                            d6Var.g0(i18);
                        } else {
                            org.telegram.ui.ActionBar.h6.w0(null, i18, false);
                        }
                        int i19 = org.telegram.ui.ActionBar.h6.f18878i6;
                        if (d6Var != null) {
                            d6Var.g0(i19);
                        } else {
                            org.telegram.ui.ActionBar.h6.w0(null, i19, false);
                        }
                        int i20 = org.telegram.ui.ActionBar.h6.Sh;
                        if (d6Var != null) {
                            w04 = d6Var.g0(i20);
                        } else {
                            w04 = org.telegram.ui.ActionBar.h6.w0(null, i20, false);
                        }
                        int i21 = org.telegram.ui.ActionBar.h6.Oh;
                        if (d6Var != null) {
                            w05 = d6Var.g0(i21);
                        } else {
                            w05 = org.telegram.ui.ActionBar.h6.w0(null, i21, false);
                        }
                        int i22 = w05;
                        int i23 = org.telegram.ui.ActionBar.h6.Qh;
                        if (d6Var != null) {
                            w06 = d6Var.g0(i23);
                        } else {
                            w06 = org.telegram.ui.ActionBar.h6.w0(null, i23, false);
                        }
                        int i24 = w06;
                        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, d6Var);
                        a3Var.a();
                        ?? tc0Var = new org.telegram.ui.Components.tc0(parentActivity2, d6Var);
                        tc0Var.setMinValue(0);
                        tc0Var.setMaxValue(10);
                        tc0Var.setTextColor(w02);
                        tc0Var.setValue(c10 - 1);
                        tc0Var.setWrapSelectorWheel(false);
                        tc0Var.setFormatter(new org.telegram.ui.Components.x1(2));
                        ?? tc0Var2 = new org.telegram.ui.Components.tc0(parentActivity2, d6Var);
                        tc0Var2.setMinValue(0);
                        tc0Var2.setMaxValue(10);
                        tc0Var2.setTextColor(w02);
                        tc0Var2.setValue((c11 / 60) - 1);
                        tc0Var2.setWrapSelectorWheel(false);
                        tc0Var2.setFormatter(new org.telegram.ui.Components.x1(3));
                        org.telegram.ui.Components.tc0 tc0Var3 = new org.telegram.ui.Components.tc0(parentActivity2, d6Var);
                        tc0Var3.setMinValue(0);
                        tc0Var3.setMaxValue(0);
                        tc0Var3.setTextColor(w02);
                        tc0Var3.setValue(0);
                        tc0Var3.setWrapSelectorWheel(false);
                        tc0Var3.setFormatter(new org.telegram.ui.Components.x1(4));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, tc0Var, tc0Var2, tc0Var3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(parentActivity2);
                        w3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(parentActivity2);
                        textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                        linearLayout.addView((View) tc0Var, w7.x5.l(0.4f, 0, 270));
                        linearLayout.addView(tc0Var3, w7.x5.o(0, -2, 0.2f, 16));
                        linearLayout.addView((View) tc0Var2, w7.x5.l(0.4f, 0, 270));
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, i22, i24, i24));
                        p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                        w3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7(21);
                        tc0Var.setOnValueChangedListener(y7Var);
                        tc0Var2.setOnValueChangedListener(y7Var);
                        p4Var.setOnClickListener(new ai.o5((Object) tc0Var, (Object) tc0Var2, k11Var, a3Var, 7));
                        a3Var.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18414a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                    }
                }
            } else if (i10 == p11Var.U) {
                if (p11Var.getParentActivity() != null) {
                    p11Var.showDialog(org.telegram.ui.Components.e5.u(p11Var.getParentActivity(), p11Var.e, p11Var.f36002f, -1, new Runnable(p11Var) {
                        public final p11 f34843b;

                        {
                            this.f34843b = p11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    p11 p11Var2 = this.f34843b;
                                    n11 n11Var = p11Var2.f36000b;
                                    if (n11Var != null) {
                                        n11Var.m(p11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    p11 p11Var3 = this.f34843b;
                                    n11 n11Var2 = p11Var3.f36000b;
                                    if (n11Var2 != null) {
                                        n11Var2.m(p11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    p11 p11Var4 = this.f34843b;
                                    n11 n11Var3 = p11Var4.f36000b;
                                    if (n11Var3 != null) {
                                        n11Var3.m(p11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    p11 p11Var5 = this.f34843b;
                                    n11 n11Var4 = p11Var5.f36000b;
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
                View findViewWithTag = p11Var.f35998a.findViewWithTag(2);
                if (findViewWithTag != null) {
                    ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                }
            } else if (i10 == p11Var.M) {
                MessagesController.getNotificationsSettings(p11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                ((org.telegram.ui.Cells.k6) view).a(true, true);
                View findViewWithTag2 = p11Var.f35998a.findViewWithTag(1);
                if (findViewWithTag2 != null) {
                    ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                }
            } else if (i10 == p11Var.O) {
                org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
                boolean z11 = x8Var3.e.h;
                boolean z12 = !z11;
                x8Var3.setChecked(z12);
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

    public static void W(p11 p11Var, String str) {
        p11Var.f35999a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(p11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        p11Var.finishFragment();
        o11 o11Var = p11Var.f36004r;
        if (o11Var != null) {
            o11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f18826f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f36002f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new m11(this, sharedPrefKey));
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, d6Var);
        this.f36005s = foVar;
        foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.fo foVar2 = this.f36005s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(foVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f36005s.getAvatarImageView(), findTopic, false, true, d6Var);
                this.f36005s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f36005s.setChatAvatar(chat);
                this.f36005s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f36005s.setUserAvatar(user);
                this.f36005s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f36005s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f36005s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, d6Var));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f35998a = ml0Var;
        ml0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35998a);
        frameLayout.addView(this.f35998a, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ml0 ml0Var2 = this.f35998a;
        n11 n11Var = new n11(this, context);
        this.f36000b = n11Var;
        ml0Var2.setAdapter(n11Var);
        this.f35998a.setItemAnimator(null);
        this.f35998a.setLayoutAnimation(null);
        this.f35998a.setLayoutManager(new gg.b0(17));
        this.f35998a.setOnItemClickListener(new rb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f36000b.l();
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ab.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18844g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18861h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35998a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36002f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f36002f);
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
            n11 n11Var = this.f36000b;
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
        if (!this.f35999a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f36002f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35998a.setPadding(0, 0, 0, i13);
        this.f35998a.setClipToPadding(false);
    }
}
