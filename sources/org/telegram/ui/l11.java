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
public final class l11 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.rl0 f35618a;
    public j11 f35619b;
    public AnimatorSet f35620c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f35621f;
    public final boolean h;
    public boolean f35622n;
    public k11 f35623r;
    public org.telegram.ui.Components.yn f35624s;
    public int v;
    public int f35625w;
    public int f35626x;
    public int f35627y;

    public l11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f35621f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(l11 l11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(l11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        j11 j11Var = l11Var.f35619b;
        if (j11Var != null) {
            j11Var.m(l11Var.E);
        }
    }

    public static void V(final l11 l11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j10 = l11Var.f35621f;
        long j11 = l11Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = l11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == l11Var.T) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new g11(l11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                l11Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                }
            } else if (i10 == l11Var.C) {
                Bundle g10 = kf.k0.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                l11Var.presentFragment(new qk0(g10, f6Var));
            } else if (i10 == l11Var.N) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(l11Var.currentAccount);
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
                    l11Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == l11Var.D) {
                Activity parentActivity = l11Var.getParentActivity();
                long j12 = l11Var.e;
                long j13 = l11Var.f35621f;
                Runnable runnable = new Runnable(l11Var) {
                    public final l11 f34549b;

                    {
                        this.f34549b = l11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                l11 l11Var2 = this.f34549b;
                                j11 j11Var = l11Var2.f35619b;
                                if (j11Var != null) {
                                    j11Var.m(l11Var2.D);
                                    return;
                                }
                                return;
                            case 1:
                                l11 l11Var3 = this.f34549b;
                                j11 j11Var2 = l11Var3.f35619b;
                                if (j11Var2 != null) {
                                    j11Var2.m(l11Var3.O);
                                    return;
                                }
                                return;
                            case 2:
                                l11 l11Var4 = this.f34549b;
                                j11 j11Var3 = l11Var4.f35619b;
                                if (j11Var3 != null) {
                                    j11Var3.m(l11Var4.F);
                                    return;
                                }
                                return;
                            default:
                                l11 l11Var5 = this.f34549b;
                                j11 j11Var4 = l11Var5.f35619b;
                                if (j11Var4 != null) {
                                    j11Var4.m(l11Var5.R);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = l11Var.d;
                Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                if (j12 != 0) {
                    str3 = android.support.v4.media.a.n(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                l11Var.showDialog(org.telegram.ui.Components.z4.Y(parentActivity, j12, j13, str3, runnable, f6Var2));
            } else {
                int i11 = 2;
                if (i10 == l11Var.f35627y) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z4 = !r8Var.e.h;
                    l11Var.f35622n = z4;
                    r8Var.setChecked(z4);
                    int childCount = l11Var.f35618a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) l11Var.f35618a.T(l11Var.f35618a.getChildAt(i12));
                        int i13 = dl0Var.f5777f;
                        View view2 = dl0Var.f5774a;
                        int b10 = dl0Var.b();
                        if (b10 != l11Var.f35627y && b10 != l11Var.T) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == l11Var.B) {
                                                    ((org.telegram.ui.Cells.r8) view2).e(arrayList, l11Var.f35622n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.i6) view2).b(arrayList, l11Var.f35622n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, l11Var.f35622n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.z8) view2).c(arrayList, l11Var.f35622n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.z9) view2).a(arrayList, l11Var.f35622n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.l4) view2).a(arrayList, l11Var.f35622n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = l11Var.f35620c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        l11Var.f35620c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        l11Var.f35620c.addListener(new ss0(l11Var, 14));
                        l11Var.f35620c.setDuration(150L);
                        l11Var.f35620c.start();
                    }
                } else if (i10 == l11Var.B) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    Switch r32 = r8Var2.e;
                    MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putBoolean(vh.w2.e("content_preview_", str), !r32.h).apply();
                    r8Var2.setChecked(!r32.h);
                } else if (i10 == l11Var.O) {
                    l11Var.showDialog(org.telegram.ui.Components.z4.Y(l11Var.getParentActivity(), l11Var.e, l11Var.f35621f, vh.w2.e("calls_vibrate_", str), new Runnable(l11Var) {
                        public final l11 f34549b;

                        {
                            this.f34549b = l11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    l11 l11Var2 = this.f34549b;
                                    j11 j11Var = l11Var2.f35619b;
                                    if (j11Var != null) {
                                        j11Var.m(l11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    l11 l11Var3 = this.f34549b;
                                    j11 j11Var2 = l11Var3.f35619b;
                                    if (j11Var2 != null) {
                                        j11Var2.m(l11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l11 l11Var4 = this.f34549b;
                                    j11 j11Var3 = l11Var4.f35619b;
                                    if (j11Var3 != null) {
                                        j11Var3.m(l11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    l11 l11Var5 = this.f34549b;
                                    j11 j11Var4 = l11Var5.f35619b;
                                    if (j11Var4 != null) {
                                        j11Var4.m(l11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, l11Var.d));
                } else if (i10 == l11Var.F) {
                    l11Var.showDialog(org.telegram.ui.Components.z4.I(l11Var.getParentActivity(), l11Var.e, l11Var.f35621f, -1, new Runnable(l11Var) {
                        public final l11 f34549b;

                        {
                            this.f34549b = l11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    l11 l11Var2 = this.f34549b;
                                    j11 j11Var = l11Var2.f35619b;
                                    if (j11Var != null) {
                                        j11Var.m(l11Var2.D);
                                        return;
                                    }
                                    return;
                                case 1:
                                    l11 l11Var3 = this.f34549b;
                                    j11 j11Var2 = l11Var3.f35619b;
                                    if (j11Var2 != null) {
                                        j11Var2.m(l11Var3.O);
                                        return;
                                    }
                                    return;
                                case 2:
                                    l11 l11Var4 = this.f34549b;
                                    j11 j11Var3 = l11Var4.f35619b;
                                    if (j11Var3 != null) {
                                        j11Var3.m(l11Var4.F);
                                        return;
                                    }
                                    return;
                                default:
                                    l11 l11Var5 = this.f34549b;
                                    j11 j11Var4 = l11Var5.f35619b;
                                    if (j11Var4 != null) {
                                        j11Var4.m(l11Var5.R);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, l11Var.d));
                } else if (i10 == l11Var.E) {
                    if (l11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(l11Var.currentAccount);
                        int c3 = org.telegram.messenger.y3.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c10 = org.telegram.messenger.y3.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c3 != 0) {
                            i11 = c3;
                        }
                        Activity parentActivity2 = l11Var.getParentActivity();
                        g11 g11Var = new g11(l11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.z4.f31242a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f19987j5;
                            if (f6Var != null) {
                                w02 = f6Var.d0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f19952h5;
                            if (f6Var != null) {
                                w03 = f6Var.d0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (f6Var != null) {
                                f6Var.d0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (f6Var != null) {
                                f6Var.d0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (f6Var != null) {
                                f6Var.d0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (f6Var != null) {
                                f6Var.d0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f19971i6;
                            if (f6Var != null) {
                                f6Var.d0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (f6Var != null) {
                                w04 = f6Var.d0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (f6Var != null) {
                                w05 = f6Var.d0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (f6Var != null) {
                                w06 = f6Var.d0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, f6Var);
                            b3Var.a();
                            ?? xc0Var = new org.telegram.ui.Components.xc0(parentActivity2, f6Var);
                            xc0Var.setMinValue(0);
                            xc0Var.setMaxValue(10);
                            xc0Var.setTextColor(w02);
                            xc0Var.setValue(i11 - 1);
                            xc0Var.setWrapSelectorWheel(false);
                            xc0Var.setFormatter(new bs(20));
                            ?? xc0Var2 = new org.telegram.ui.Components.xc0(parentActivity2, f6Var);
                            xc0Var2.setMinValue(0);
                            xc0Var2.setMaxValue(10);
                            xc0Var2.setTextColor(w02);
                            xc0Var2.setValue((c10 / 60) - 1);
                            xc0Var2.setWrapSelectorWheel(false);
                            xc0Var2.setFormatter(new bs(21));
                            org.telegram.ui.Components.xc0 xc0Var3 = new org.telegram.ui.Components.xc0(parentActivity2, f6Var);
                            xc0Var3.setMinValue(0);
                            xc0Var3.setMaxValue(0);
                            xc0Var3.setTextColor(w02);
                            xc0Var3.setValue(0);
                            xc0Var3.setWrapSelectorWheel(false);
                            xc0Var3.setFormatter(new bs(22));
                            org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(parentActivity2, xc0Var, xc0Var2, xc0Var3);
                            s3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            s3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new oh.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            gg.q qVar = new gg.q(parentActivity2, 17);
                            linearLayout.addView((View) xc0Var, k7.b6.l(0.4f, 0, 270));
                            linearLayout.addView(xc0Var3, k7.b6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) xc0Var2, k7.b6.l(0.4f, 0, 270));
                            qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            qVar.setGravity(17);
                            qVar.setTextColor(w04);
                            qVar.setTextSize(1, 14.0f);
                            qVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            qVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                            bs bsVar = new bs(9);
                            xc0Var.setOnValueChangedListener(bsVar);
                            xc0Var2.setOnValueChangedListener(bsVar);
                            qVar.setOnClickListener(new kh.t3((Object) xc0Var, (Object) xc0Var2, g11Var, b3Var, 5));
                            b3Var.b(s3Var);
                            org.telegram.ui.ActionBar.g3 g3Var = b3Var.f19500a;
                            g3Var.show();
                            g3Var.setBackgroundColor(w03);
                            g3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == l11Var.R) {
                    if (l11Var.getParentActivity() != null) {
                        l11Var.showDialog(org.telegram.ui.Components.z4.u(l11Var.getParentActivity(), l11Var.e, l11Var.f35621f, -1, new Runnable(l11Var) {
                            public final l11 f34549b;

                            {
                                this.f34549b = l11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        l11 l11Var2 = this.f34549b;
                                        j11 j11Var = l11Var2.f35619b;
                                        if (j11Var != null) {
                                            j11Var.m(l11Var2.D);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        l11 l11Var3 = this.f34549b;
                                        j11 j11Var2 = l11Var3.f35619b;
                                        if (j11Var2 != null) {
                                            j11Var2.m(l11Var3.O);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        l11 l11Var4 = this.f34549b;
                                        j11 j11Var3 = l11Var4.f35619b;
                                        if (j11Var3 != null) {
                                            j11Var3.m(l11Var4.F);
                                            return;
                                        }
                                        return;
                                    default:
                                        l11 l11Var5 = this.f34549b;
                                        j11 j11Var4 = l11Var5.f35619b;
                                        if (j11Var4 != null) {
                                            j11Var4.m(l11Var5.R);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, l11Var.d));
                    }
                } else if (i10 == l11Var.I) {
                    MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = l11Var.f35618a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == l11Var.J) {
                    MessagesController.getNotificationsSettings(l11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = l11Var.f35618a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == l11Var.L) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = r8Var3.e.h;
                    boolean z11 = !z10;
                    r8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(l11Var.currentAccount).edit();
                    if (l11Var.W && !z10) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z11);
                    }
                    edit.apply();
                    l11Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(l11 l11Var, String str) {
        l11Var.X = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(l11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        l11Var.finishFragment();
        k11 k11Var = l11Var.f35623r;
        if (k11Var != null) {
            k11Var.b0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19919f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20202v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.e;
        long j11 = this.f35621f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new i11(this, sharedPrefKey));
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, null, false, f6Var);
        this.f35624s = ynVar;
        ynVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.yn ynVar2 = this.f35624s;
        if (!this.inPreviewMode) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        kVar2.addView(ynVar2, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                ag.f.p(this.f35624s.getAvatarImageView(), findTopic, false, true, f6Var);
                this.f35624s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f35624s.setChatAvatar(chat);
                this.f35624s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f35624s.setUserAvatar(user);
                this.f35624s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f35624s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f35624s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, f6Var));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f35618a = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f35618a);
        frameLayout.addView(this.f35618a, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var2 = this.f35618a;
        j11 j11Var = new j11(this, context);
        this.f35619b = j11Var;
        rl0Var2.setAdapter(j11Var);
        this.f35618a.setItemAnimator(null);
        this.f35618a.setLayoutAnimation(null);
        this.f35618a.setLayoutManager(new k(15));
        this.f35618a.setOnItemClickListener(new mb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f35619b.l();
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
        jy0 jy0Var = new jy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.i6.class, org.telegram.ui.Cells.ta.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.o8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19936g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19954h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"statusColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, new String[]{"statusOnlineColor"}, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.f20060n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35618a, 0, new Class[]{org.telegram.ui.Cells.ta.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f35621f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f35621f);
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
            j11 j11Var = this.f35619b;
            if (j11Var != null) {
                if (i10 == 13) {
                    i12 = this.N;
                } else {
                    i12 = this.C;
                }
                j11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f35621f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35618a.setPadding(0, 0, 0, i13);
        this.f35618a.setClipToPadding(false);
    }
}
