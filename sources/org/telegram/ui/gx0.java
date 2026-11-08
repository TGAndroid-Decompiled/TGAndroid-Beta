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
public final class gx0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public FrameLayout f46130a;
    public boolean f46131a0;
    public org.telegram.ui.Components.pj0 f46132b;
    public boolean f46133b0;
    public ex0 f46134c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.f6 f46135e;
    public final long f46136f;
    public final long h;
    public final boolean f46137n;
    public boolean f46138r;
    public fx0 f46139s;
    public org.telegram.ui.Components.kn f46140w;
    public int f46141x;
    public int f46142y;

    public gx0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.f46135e = f6Var;
        this.f46136f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f46137n = bundle.getBoolean("exception", false);
    }

    public static void Z(gx0 gx0Var, String str, int i7, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i7);
        putInt.putInt("smart_delay_" + str, i10).apply();
        ex0 ex0Var = gx0Var.f46134c;
        if (ex0Var != null) {
            ex0Var.g(gx0Var.I);
        }
    }

    public static void a0(final gx0 gx0Var, Context context, String str, View view, int i7) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.f6 f6Var = gx0Var.f46135e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i7 == gx0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
                String M0 = org.telegram.messenger.id.M0(2131746105, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746106, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new bx0(gx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                gx0Var.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
                }
            } else if (i7 == gx0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", gx0Var.f46136f);
                bundle.putLong("topic_id", gx0Var.h);
                gx0Var.presentFragment(new sh0(bundle, f6Var));
            } else if (i7 == gx0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7;
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
                    gx0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == gx0Var.H) {
                Activity parentActivity = gx0Var.getParentActivity();
                long j3 = gx0Var.f46136f;
                long j10 = gx0Var.h;
                Runnable runnable = new Runnable(gx0Var) {
                    public final gx0 f44916b;

                    {
                        this.f44916b = gx0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                gx0 gx0Var2 = this.f44916b;
                                ex0 ex0Var = gx0Var2.f46134c;
                                if (ex0Var != null) {
                                    ex0Var.g(gx0Var2.H);
                                    return;
                                }
                                return;
                            case 1:
                                gx0 gx0Var3 = this.f44916b;
                                ex0 ex0Var2 = gx0Var3.f46134c;
                                if (ex0Var2 != null) {
                                    ex0Var2.g(gx0Var3.S);
                                    return;
                                }
                                return;
                            case 2:
                                gx0 gx0Var4 = this.f44916b;
                                ex0 ex0Var3 = gx0Var4.f46134c;
                                if (ex0Var3 != null) {
                                    ex0Var3.g(gx0Var4.J);
                                    return;
                                }
                                return;
                            default:
                                gx0 gx0Var5 = this.f44916b;
                                ex0 ex0Var4 = gx0Var5.f46134c;
                                if (ex0Var4 != null) {
                                    ex0Var4.g(gx0Var5.V);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = gx0Var.f46135e;
                Pattern pattern = org.telegram.ui.Components.v4.f38848a;
                if (j3 != 0) {
                    str3 = a8.p0.o(j3, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                gx0Var.showDialog(org.telegram.ui.Components.v4.V(parentActivity, j3, j10, str3, runnable, f6Var2));
            } else {
                int i10 = 2;
                if (i7 == gx0Var.E) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z9 = !r8Var.f30210e.h;
                    gx0Var.f46138r = z9;
                    r8Var.setChecked(z9);
                    int childCount = gx0Var.f46132b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) gx0Var.f46132b.T(gx0Var.f46132b.getChildAt(i11));
                        int i12 = xi0Var.f57047f;
                        View view2 = xi0Var.f57043a;
                        int b10 = xi0Var.b();
                        if (b10 != gx0Var.E && b10 != gx0Var.X) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == gx0Var.F) {
                                                    ((org.telegram.ui.Cells.r8) view2).e(arrayList, gx0Var.f46138r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.i6) view2).b(arrayList, gx0Var.f46138r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, gx0Var.f46138r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.z8) view2).c(arrayList, gx0Var.f46138r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.w9) view2).a(arrayList, gx0Var.f46138r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.n4) view2).a(arrayList, gx0Var.f46138r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = gx0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        gx0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        gx0Var.d.addListener(new d30(gx0Var, 23));
                        gx0Var.d.setDuration(150L);
                        gx0Var.d.start();
                    }
                } else if (i7 == gx0Var.F) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    Switch r32 = r8Var2.f30210e;
                    org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit().putBoolean(rf.b.i("content_preview_", str), !r32.h).apply();
                    r8Var2.setChecked(!r32.h);
                } else if (i7 == gx0Var.S) {
                    gx0Var.showDialog(org.telegram.ui.Components.v4.V(gx0Var.getParentActivity(), gx0Var.f46136f, gx0Var.h, rf.b.i("calls_vibrate_", str), new Runnable(gx0Var) {
                        public final gx0 f44916b;

                        {
                            this.f44916b = gx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    gx0 gx0Var2 = this.f44916b;
                                    ex0 ex0Var = gx0Var2.f46134c;
                                    if (ex0Var != null) {
                                        ex0Var.g(gx0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    gx0 gx0Var3 = this.f44916b;
                                    ex0 ex0Var2 = gx0Var3.f46134c;
                                    if (ex0Var2 != null) {
                                        ex0Var2.g(gx0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    gx0 gx0Var4 = this.f44916b;
                                    ex0 ex0Var3 = gx0Var4.f46134c;
                                    if (ex0Var3 != null) {
                                        ex0Var3.g(gx0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    gx0 gx0Var5 = this.f44916b;
                                    ex0 ex0Var4 = gx0Var5.f46134c;
                                    if (ex0Var4 != null) {
                                        ex0Var4.g(gx0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, gx0Var.f46135e));
                } else if (i7 == gx0Var.J) {
                    gx0Var.showDialog(org.telegram.ui.Components.v4.F(gx0Var.getParentActivity(), gx0Var.f46136f, gx0Var.h, -1, new Runnable(gx0Var) {
                        public final gx0 f44916b;

                        {
                            this.f44916b = gx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    gx0 gx0Var2 = this.f44916b;
                                    ex0 ex0Var = gx0Var2.f46134c;
                                    if (ex0Var != null) {
                                        ex0Var.g(gx0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    gx0 gx0Var3 = this.f44916b;
                                    ex0 ex0Var2 = gx0Var3.f46134c;
                                    if (ex0Var2 != null) {
                                        ex0Var2.g(gx0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    gx0 gx0Var4 = this.f44916b;
                                    ex0 ex0Var3 = gx0Var4.f46134c;
                                    if (ex0Var3 != null) {
                                        ex0Var3.g(gx0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    gx0 gx0Var5 = this.f44916b;
                                    ex0 ex0Var4 = gx0Var5.f46134c;
                                    if (ex0Var4 != null) {
                                        ex0Var4.g(gx0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, gx0Var.f46135e));
                } else if (i7 == gx0Var.I) {
                    if (gx0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7;
                        int c10 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = gx0Var.getParentActivity();
                        bx0 bx0Var = new bx0(gx0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.v4.f38848a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.k6.f27960j5;
                            if (f6Var != null) {
                                x02 = f6Var.f(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.k6.f27925h5;
                            if (f6Var != null) {
                                x03 = f6Var.f(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.k6.xj;
                            if (f6Var != null) {
                                f6Var.f(i15);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.k6.Bj;
                            if (f6Var != null) {
                                f6Var.f(i16);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.k6.E8;
                            if (f6Var != null) {
                                f6Var.f(i17);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.k6.G8;
                            if (f6Var != null) {
                                f6Var.f(i18);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.k6.f27944i6;
                            if (f6Var != null) {
                                f6Var.f(i19);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.k6.Gi;
                            if (f6Var != null) {
                                x04 = f6Var.f(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.k6.Ci;
                            if (f6Var != null) {
                                x05 = f6Var.f(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.k6.Ei;
                            if (f6Var != null) {
                                x06 = f6Var.f(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.k6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            h9.f1 f1Var = new h9.f1(parentActivity2, f6Var);
                            ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28651v0 = false;
                            org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(parentActivity2, f6Var);
                            hb0Var.setMinValue(0);
                            hb0Var.setMaxValue(10);
                            hb0Var.setTextColor(x02);
                            hb0Var.setValue(i10 - 1);
                            hb0Var.setWrapSelectorWheel(false);
                            hb0Var.setFormatter(new zq(20));
                            org.telegram.ui.Components.hb0 hb0Var2 = new org.telegram.ui.Components.hb0(parentActivity2, f6Var);
                            hb0Var2.setMinValue(0);
                            hb0Var2.setMaxValue(10);
                            hb0Var2.setTextColor(x02);
                            hb0Var2.setValue((c11 / 60) - 1);
                            hb0Var2.setWrapSelectorWheel(false);
                            hb0Var2.setFormatter(new zq(21));
                            org.telegram.ui.Components.hb0 hb0Var3 = new org.telegram.ui.Components.hb0(parentActivity2, f6Var);
                            hb0Var3.setMinValue(0);
                            hb0Var3.setMaxValue(0);
                            hb0Var3.setTextColor(x02);
                            hb0Var3.setValue(0);
                            hb0Var3.setWrapSelectorWheel(false);
                            hb0Var3.setFormatter(new zq(22));
                            org.telegram.ui.Components.p3 p3Var = new org.telegram.ui.Components.p3(parentActivity2, hb0Var, hb0Var2, hb0Var3, 5);
                            p3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            p3Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.id.M0(2131748121, null));
                            textView2.setTextColor(x02);
                            com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ei.b(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            p3Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.md mdVar = new bi.md(parentActivity2, 18);
                            linearLayout.addView(hb0Var, c8.ha.l(0.4f, 0, 270));
                            linearLayout.addView(hb0Var3, c8.ha.p(0, -2, 0.2f, 16));
                            linearLayout.addView(hb0Var2, c8.ha.l(0.4f, 0, 270));
                            mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            mdVar.setGravity(17);
                            mdVar.setTextColor(x04);
                            mdVar.setTextSize(1, 14.0f);
                            mdVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            mdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i22, i24, i24));
                            mdVar.setText(org.telegram.messenger.id.M0(2131753866, null));
                            p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
                            zq zqVar = new zq(6);
                            hb0Var.setOnValueChangedListener(zqVar);
                            hb0Var2.setOnValueChangedListener(zqVar);
                            mdVar.setOnClickListener(new di.u3(hb0Var, hb0Var2, bx0Var, f1Var, 7));
                            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.f14323b;
                            v2Var.N = p3Var;
                            v2Var.show();
                            v2Var.v0(x03);
                            v2Var.O(x03);
                        }
                    }
                } else if (i7 == gx0Var.V) {
                    if (gx0Var.getParentActivity() != null) {
                        gx0Var.showDialog(org.telegram.ui.Components.v4.t(gx0Var.getParentActivity(), gx0Var.f46136f, gx0Var.h, -1, new Runnable(gx0Var) {
                            public final gx0 f44916b;

                            {
                                this.f44916b = gx0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        gx0 gx0Var2 = this.f44916b;
                                        ex0 ex0Var = gx0Var2.f46134c;
                                        if (ex0Var != null) {
                                            ex0Var.g(gx0Var2.H);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        gx0 gx0Var3 = this.f44916b;
                                        ex0 ex0Var2 = gx0Var3.f46134c;
                                        if (ex0Var2 != null) {
                                            ex0Var2.g(gx0Var3.S);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        gx0 gx0Var4 = this.f44916b;
                                        ex0 ex0Var3 = gx0Var4.f46134c;
                                        if (ex0Var3 != null) {
                                            ex0Var3.g(gx0Var4.J);
                                            return;
                                        }
                                        return;
                                    default:
                                        gx0 gx0Var5 = this.f44916b;
                                        ex0 ex0Var4 = gx0Var5.f46134c;
                                        if (ex0Var4 != null) {
                                            ex0Var4.g(gx0Var5.V);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, gx0Var.f46135e));
                    }
                } else if (i7 == gx0Var.M) {
                    org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = gx0Var.f46132b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                    }
                } else if (i7 == gx0Var.N) {
                    org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = gx0Var.f46132b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                    }
                } else if (i7 == gx0Var.P) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = r8Var3.f30210e.h;
                    boolean z11 = !z10;
                    r8Var3.setChecked(z11);
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit();
                    if (gx0Var.f46131a0 && !z10) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z11);
                    }
                    edit.apply();
                    gx0Var.getNotificationsController().c0(gx0Var.f46136f, gx0Var.h, true);
                }
            }
        }
    }

    public static void b0(gx0 gx0Var, String str) {
        gx0Var.f46133b0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(gx0Var.currentAccount).f24764d7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        gx0Var.finishFragment();
        fx0 fx0Var = gx0Var.f46139s;
        if (fx0Var != null) {
            fx0Var.c0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27908g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        long j3 = this.f46136f;
        long j10 = this.h;
        String v = org.telegram.messenger.dt.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dx0(this, v));
        org.telegram.ui.ActionBar.f6 f6Var = this.f46135e;
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, null, false, f6Var);
        this.f46140w = knVar;
        knVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f24877q7.f(-j3, j10);
                qg.d.p(this.f46140w.getAvatarImageView(), f10, false, true, f6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                this.f46140w.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                this.f46140w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        }
        if (this.f46137n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131747896, null));
            this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.id.M0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f46132b = pj0Var;
        pj0Var.r1();
        this.f46132b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f46132b, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.pj0 pj0Var2 = this.f46132b;
        ex0 ex0Var = new ex0(this, context);
        this.f46134c = ex0Var;
        pj0Var2.setAdapter(ex0Var);
        this.f46132b.setItemAnimator(null);
        this.f46132b.setLayoutAnimation(null);
        this.f46132b.setLayoutManager(new jg.b0(17));
        this.f46132b.setOnItemClickListener(new z51(this, context, v, 1));
        this.f46130a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f24996f0) {
            try {
                this.f46134c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f46132b;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f46135e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46132b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46132b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46132b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28244y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46132b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28034n6));
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
                        str = org.telegram.messenger.id.M0(2131751600, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.id.M0(2131745283, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
            String v = org.telegram.messenger.dt.v(this.f46136f, this.h, false);
            if (i7 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f46136f, this.h);
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
            ex0 ex0Var = this.f46134c;
            if (ex0Var != null) {
                if (i7 == 13) {
                    i11 = this.R;
                } else {
                    i11 = this.G;
                }
                ex0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f46133b0) {
            String v = org.telegram.messenger.dt.v(this.f46136f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24996f0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.B3(this.f46140w.f35367e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
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
        org.telegram.messenger.g0.E2(this.f46140w.f35367e);
        if (!this.f46137n) {
            this.f46130a.addView(this.f46140w.f35367e, c8.ha.e(42, 42, 53));
        }
        org.telegram.messenger.g0.B3(this.f46140w.f35367e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
