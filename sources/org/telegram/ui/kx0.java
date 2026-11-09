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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class kx0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout f47397a;
    public boolean f47398a0;
    public org.telegram.ui.Components.qj0 f47399b;
    public boolean f47400b0;
    public ix0 f47401c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.g6 f47402e;
    public final long f47403f;
    public final long h;
    public final boolean f47404n;
    public boolean f47405r;
    public jx0 f47406s;
    public org.telegram.ui.Components.kn f47407w;
    public int f47408x;
    public int f47409y;

    public kx0(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.f47402e = g6Var;
        this.f47403f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f47404n = bundle.getBoolean("exception", false);
    }

    public static void Z(kx0 kx0Var, String str, int i7, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i7);
        putInt.putInt("smart_delay_" + str, i10).apply();
        ix0 ix0Var = kx0Var.f47401c;
        if (ix0Var != null) {
            ix0Var.g(kx0Var.I);
        }
    }

    public static void a0(final kx0 kx0Var, Context context, String str, View view, int i7) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.g6 g6Var = kx0Var.f47402e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i7 == kx0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
                String M0 = org.telegram.messenger.id.M0(2131746102, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746103, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746118, null), new fx0(kx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                kx0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                }
            } else if (i7 == kx0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", kx0Var.f47403f);
                bundle.putLong("topic_id", kx0Var.h);
                kx0Var.presentFragment(new uh0(bundle, g6Var));
            } else if (i7 == kx0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string = sharedPreferences.getString("ringtone_path_" + str, str2);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(str2) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    kx0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == kx0Var.H) {
                Activity parentActivity = kx0Var.getParentActivity();
                long j3 = kx0Var.f47403f;
                long j10 = kx0Var.h;
                Runnable runnable = new Runnable(kx0Var) {
                    public final kx0 f46093b;

                    {
                        this.f46093b = kx0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                kx0 kx0Var2 = this.f46093b;
                                ix0 ix0Var = kx0Var2.f47401c;
                                if (ix0Var != null) {
                                    ix0Var.g(kx0Var2.H);
                                    return;
                                }
                                return;
                            case 1:
                                kx0 kx0Var3 = this.f46093b;
                                ix0 ix0Var2 = kx0Var3.f47401c;
                                if (ix0Var2 != null) {
                                    ix0Var2.g(kx0Var3.S);
                                    return;
                                }
                                return;
                            case 2:
                                kx0 kx0Var4 = this.f46093b;
                                ix0 ix0Var3 = kx0Var4.f47401c;
                                if (ix0Var3 != null) {
                                    ix0Var3.g(kx0Var4.J);
                                    return;
                                }
                                return;
                            default:
                                kx0 kx0Var5 = this.f46093b;
                                ix0 ix0Var4 = kx0Var5.f47401c;
                                if (ix0Var4 != null) {
                                    ix0Var4.g(kx0Var5.V);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.g6 g6Var2 = kx0Var.f47402e;
                Pattern pattern = org.telegram.ui.Components.v4.f38913a;
                if (j3 != 0) {
                    str3 = a8.p0.o(j3, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                kx0Var.showDialog(org.telegram.ui.Components.v4.V(parentActivity, j3, j10, str3, runnable, g6Var2));
            } else {
                int i10 = 2;
                if (i7 == kx0Var.E) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z9 = !r8Var.f30214e.h;
                    kx0Var.f47405r = z9;
                    r8Var.setChecked(z9);
                    int childCount = kx0Var.f47399b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) kx0Var.f47399b.T(kx0Var.f47399b.getChildAt(i11));
                        int i12 = yi0Var.f57060f;
                        View view2 = yi0Var.f57056a;
                        int b10 = yi0Var.b();
                        if (b10 != kx0Var.E && b10 != kx0Var.X) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == kx0Var.F) {
                                                    ((org.telegram.ui.Cells.r8) view2).e(arrayList, kx0Var.f47405r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.i6) view2).b(arrayList, kx0Var.f47405r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, kx0Var.f47405r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.z8) view2).c(arrayList, kx0Var.f47405r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.w9) view2).a(arrayList, kx0Var.f47405r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.n4) view2).a(arrayList, kx0Var.f47405r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = kx0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        kx0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        kx0Var.d.addListener(new f30(kx0Var, 23));
                        kx0Var.d.setDuration(150L);
                        kx0Var.d.start();
                    }
                } else if (i7 == kx0Var.F) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    Switch r32 = r8Var2.f30214e;
                    org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit().putBoolean(rf.b.i("content_preview_", str), !r32.h).apply();
                    r8Var2.setChecked(!r32.h);
                } else if (i7 == kx0Var.S) {
                    kx0Var.showDialog(org.telegram.ui.Components.v4.V(kx0Var.getParentActivity(), kx0Var.f47403f, kx0Var.h, rf.b.i("calls_vibrate_", str), new Runnable(kx0Var) {
                        public final kx0 f46093b;

                        {
                            this.f46093b = kx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    kx0 kx0Var2 = this.f46093b;
                                    ix0 ix0Var = kx0Var2.f47401c;
                                    if (ix0Var != null) {
                                        ix0Var.g(kx0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    kx0 kx0Var3 = this.f46093b;
                                    ix0 ix0Var2 = kx0Var3.f47401c;
                                    if (ix0Var2 != null) {
                                        ix0Var2.g(kx0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    kx0 kx0Var4 = this.f46093b;
                                    ix0 ix0Var3 = kx0Var4.f47401c;
                                    if (ix0Var3 != null) {
                                        ix0Var3.g(kx0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    kx0 kx0Var5 = this.f46093b;
                                    ix0 ix0Var4 = kx0Var5.f47401c;
                                    if (ix0Var4 != null) {
                                        ix0Var4.g(kx0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, kx0Var.f47402e));
                } else if (i7 == kx0Var.J) {
                    kx0Var.showDialog(org.telegram.ui.Components.v4.F(kx0Var.getParentActivity(), kx0Var.f47403f, kx0Var.h, -1, new Runnable(kx0Var) {
                        public final kx0 f46093b;

                        {
                            this.f46093b = kx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    kx0 kx0Var2 = this.f46093b;
                                    ix0 ix0Var = kx0Var2.f47401c;
                                    if (ix0Var != null) {
                                        ix0Var.g(kx0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    kx0 kx0Var3 = this.f46093b;
                                    ix0 ix0Var2 = kx0Var3.f47401c;
                                    if (ix0Var2 != null) {
                                        ix0Var2.g(kx0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    kx0 kx0Var4 = this.f46093b;
                                    ix0 ix0Var3 = kx0Var4.f47401c;
                                    if (ix0Var3 != null) {
                                        ix0Var3.g(kx0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    kx0 kx0Var5 = this.f46093b;
                                    ix0 ix0Var4 = kx0Var5.f47401c;
                                    if (ix0Var4 != null) {
                                        ix0Var4.g(kx0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, kx0Var.f47402e));
                } else if (i7 == kx0Var.I) {
                    if (kx0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7;
                        int c10 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = kx0Var.getParentActivity();
                        fx0 fx0Var = new fx0(kx0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.v4.f38913a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.l6.f27973j5;
                            if (g6Var != null) {
                                x02 = g6Var.f(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.l6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.l6.f27938h5;
                            if (g6Var != null) {
                                x03 = g6Var.f(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.l6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.l6.xj;
                            if (g6Var != null) {
                                g6Var.f(i15);
                            } else {
                                org.telegram.ui.ActionBar.l6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.l6.Bj;
                            if (g6Var != null) {
                                g6Var.f(i16);
                            } else {
                                org.telegram.ui.ActionBar.l6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.l6.E8;
                            if (g6Var != null) {
                                g6Var.f(i17);
                            } else {
                                org.telegram.ui.ActionBar.l6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.l6.G8;
                            if (g6Var != null) {
                                g6Var.f(i18);
                            } else {
                                org.telegram.ui.ActionBar.l6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.l6.f27957i6;
                            if (g6Var != null) {
                                g6Var.f(i19);
                            } else {
                                org.telegram.ui.ActionBar.l6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.l6.Gi;
                            if (g6Var != null) {
                                x04 = g6Var.f(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.l6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.l6.Ci;
                            if (g6Var != null) {
                                x05 = g6Var.f(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.l6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.l6.Ei;
                            if (g6Var != null) {
                                x06 = g6Var.f(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.l6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            h9.f1 f1Var = new h9.f1(parentActivity2, g6Var);
                            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28656v0 = false;
                            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(parentActivity2, g6Var);
                            ib0Var.setMinValue(0);
                            ib0Var.setMaxValue(10);
                            ib0Var.setTextColor(x02);
                            ib0Var.setValue(i10 - 1);
                            ib0Var.setWrapSelectorWheel(false);
                            ib0Var.setFormatter(new br(20));
                            org.telegram.ui.Components.ib0 ib0Var2 = new org.telegram.ui.Components.ib0(parentActivity2, g6Var);
                            ib0Var2.setMinValue(0);
                            ib0Var2.setMaxValue(10);
                            ib0Var2.setTextColor(x02);
                            ib0Var2.setValue((c11 / 60) - 1);
                            ib0Var2.setWrapSelectorWheel(false);
                            ib0Var2.setFormatter(new br(21));
                            org.telegram.ui.Components.ib0 ib0Var3 = new org.telegram.ui.Components.ib0(parentActivity2, g6Var);
                            ib0Var3.setMinValue(0);
                            ib0Var3.setMaxValue(0);
                            ib0Var3.setTextColor(x02);
                            ib0Var3.setValue(0);
                            ib0Var3.setWrapSelectorWheel(false);
                            ib0Var3.setFormatter(new br(22));
                            org.telegram.ui.Components.p3 p3Var = new org.telegram.ui.Components.p3(parentActivity2, ib0Var, ib0Var2, ib0Var3, 5);
                            p3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.id.M0(2131748120, null));
                            textView2.setTextColor(x02);
                            com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.b(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.md mdVar = new bi.md(parentActivity2, 18);
                            linearLayout.addView(ib0Var, c8.ha.l(0.4f, 0, 270));
                            linearLayout.addView(ib0Var3, c8.ha.p(0, -2, 0.2f, 16));
                            linearLayout.addView(ib0Var2, c8.ha.l(0.4f, 0, 270));
                            mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            mdVar.setGravity(17);
                            mdVar.setTextColor(x04);
                            mdVar.setTextSize(1, 14.0f);
                            mdVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.k0(L, L, L, L, i22, i24, i24));
                            mdVar.setText(org.telegram.messenger.id.M0(2131753866, null));
                            p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                            br brVar = new br(6);
                            ib0Var.setOnValueChangedListener(brVar);
                            ib0Var2.setOnValueChangedListener(brVar);
                            mdVar.setOnClickListener(new di.v3(ib0Var, ib0Var2, fx0Var, f1Var, 7));
                            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
                            v2Var.N = p3Var;
                            v2Var.show();
                            v2Var.v0(x03);
                            v2Var.O(x03);
                        }
                    }
                } else if (i7 == kx0Var.V) {
                    if (kx0Var.getParentActivity() != null) {
                        kx0Var.showDialog(org.telegram.ui.Components.v4.t(kx0Var.getParentActivity(), kx0Var.f47403f, kx0Var.h, -1, new Runnable(kx0Var) {
                            public final kx0 f46093b;

                            {
                                this.f46093b = kx0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        kx0 kx0Var2 = this.f46093b;
                                        ix0 ix0Var = kx0Var2.f47401c;
                                        if (ix0Var != null) {
                                            ix0Var.g(kx0Var2.H);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        kx0 kx0Var3 = this.f46093b;
                                        ix0 ix0Var2 = kx0Var3.f47401c;
                                        if (ix0Var2 != null) {
                                            ix0Var2.g(kx0Var3.S);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        kx0 kx0Var4 = this.f46093b;
                                        ix0 ix0Var3 = kx0Var4.f47401c;
                                        if (ix0Var3 != null) {
                                            ix0Var3.g(kx0Var4.J);
                                            return;
                                        }
                                        return;
                                    default:
                                        kx0 kx0Var5 = this.f46093b;
                                        ix0 ix0Var4 = kx0Var5.f47401c;
                                        if (ix0Var4 != null) {
                                            ix0Var4.g(kx0Var5.V);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, kx0Var.f47402e));
                    }
                } else if (i7 == kx0Var.M) {
                    org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = kx0Var.f47399b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                    }
                } else if (i7 == kx0Var.N) {
                    org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = kx0Var.f47399b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                    }
                } else if (i7 == kx0Var.P) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = r8Var3.f30214e.h;
                    boolean z11 = !z10;
                    r8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit();
                    if (kx0Var.f47398a0 && !z10) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z11);
                    }
                    edit.apply();
                    kx0Var.getNotificationsController().c0(kx0Var.f47403f, kx0Var.h, true);
                }
            }
        }
    }

    public static void b0(kx0 kx0Var, String str) {
        kx0Var.f47400b0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(kx0Var.currentAccount).f24764d7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        kx0Var.finishFragment();
        jx0 jx0Var = kx0Var.f47406s;
        if (jx0Var != null) {
            jx0Var.c0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27921g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        long j3 = this.f47403f;
        long j10 = this.h;
        String v = org.telegram.messenger.dt.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx0(this, v));
        org.telegram.ui.ActionBar.g6 g6Var = this.f47402e;
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, null, false, g6Var);
        this.f47407w = knVar;
        knVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24877q7.f(-j3, j10);
                qg.d.p(this.f47407w.getAvatarImageView(), f10, false, true, g6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                this.f47407w.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                this.f47407w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        }
        if (this.f47404n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131747895, null));
            this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131751684, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f47399b = qj0Var;
        qj0Var.r1();
        this.f47399b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f47399b, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.qj0 qj0Var2 = this.f47399b;
        ix0 ix0Var = new ix0(this, context);
        this.f47401c = ix0Var;
        qj0Var2.setAdapter(ix0Var);
        this.f47399b.setItemAnimator(null);
        this.f47399b.setLayoutAnimation(null);
        this.f47399b.setLayoutManager(new jg.b0(17));
        this.f47399b.setOnItemClickListener(new a61(this, context, v, 1));
        this.f47397a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24996f0) {
            try {
                this.f47401c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f47399b;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f47402e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47399b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47399b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47399b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28257y6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47399b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28047n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        int i11;
        Ringtone ringtone;
        if (i10 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.f25566b, uri)) != null) {
                if (i7 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.id.M0(2131751599, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.id.M0(2131745280, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
            String v = org.telegram.messenger.dt.v(this.f47403f, this.h, false);
            if (i7 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f47403f, this.h);
            } else if (i7 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + v, str);
                    edit.putString("ringtone_path_" + v, uri.toString());
                } else {
                    edit.putString("ringtone_" + v, "NoSound");
                    edit.putString("ringtone_path_" + v, "NoSound");
                }
            }
            edit.apply();
            ix0 ix0Var = this.f47401c;
            if (ix0Var != null) {
                if (i7 == 13) {
                    i11 = this.R;
                } else {
                    i11 = this.G;
                }
                ix0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kx0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47400b0) {
            String v = org.telegram.messenger.dt.v(this.f47403f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24996f0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.B3(this.f47407w.f35406e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.f47407w.f35406e);
        if (!this.f47404n) {
            this.f47397a.addView(this.f47407w.f35406e, c8.ha.e(42, 42, 53));
        }
        org.telegram.messenger.g0.B3(this.f47407w.f35406e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
