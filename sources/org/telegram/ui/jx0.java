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
public final class jx0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public FrameLayout f49085a;
    public int f49086a0;
    public org.telegram.ui.Components.ek0 f49087b;
    public boolean f49088b0;
    public hx0 f49089c;
    public boolean f49090c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.h6 f49091e;
    public final long f49092f;
    public final long h;
    public final boolean f49093n;
    public boolean f49094r;
    public ix0 f49095s;
    public org.telegram.ui.Components.co f49096w;
    public int f49097x;
    public int f49098y;

    public jx0(Bundle bundle, org.telegram.ui.ActionBar.h6 h6Var) {
        super(bundle);
        this.f49091e = h6Var;
        this.f49092f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f49093n = bundle.getBoolean("exception", false);
    }

    public static void Z(jx0 jx0Var, String str, int i7, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i7);
        putInt.putInt("smart_delay_" + str, i10).apply();
        hx0 hx0Var = jx0Var.f49089c;
        if (hx0Var != null) {
            hx0Var.g(jx0Var.J);
        }
    }

    public static void a0(final jx0 jx0Var, Context context, String str, View view, int i7) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.h6 h6Var = jx0Var.f49091e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i7 == jx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
                String N0 = org.telegram.messenger.hd.N0(2131745906, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131745907, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745922, null), new ex0(jx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                jx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
                }
            } else if (i7 == jx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", jx0Var.f49092f);
                bundle.putLong("topic_id", jx0Var.h);
                jx0Var.presentFragment(new yh0(bundle, h6Var));
            } else if (i7 == jx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7;
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
                    jx0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == jx0Var.I) {
                Activity parentActivity = jx0Var.getParentActivity();
                long j3 = jx0Var.f49092f;
                long j10 = jx0Var.h;
                Runnable runnable = new Runnable(jx0Var) {
                    public final jx0 f47825b;

                    {
                        this.f47825b = jx0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                jx0 jx0Var2 = this.f47825b;
                                hx0 hx0Var = jx0Var2.f49089c;
                                if (hx0Var != null) {
                                    hx0Var.g(jx0Var2.I);
                                    return;
                                }
                                return;
                            case 1:
                                jx0 jx0Var3 = this.f47825b;
                                hx0 hx0Var2 = jx0Var3.f49089c;
                                if (hx0Var2 != null) {
                                    hx0Var2.g(jx0Var3.T);
                                    return;
                                }
                                return;
                            case 2:
                                jx0 jx0Var4 = this.f47825b;
                                hx0 hx0Var3 = jx0Var4.f49089c;
                                if (hx0Var3 != null) {
                                    hx0Var3.g(jx0Var4.K);
                                    return;
                                }
                                return;
                            default:
                                jx0 jx0Var5 = this.f47825b;
                                hx0 hx0Var4 = jx0Var5.f49089c;
                                if (hx0Var4 != null) {
                                    hx0Var4.g(jx0Var5.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.h6 h6Var2 = jx0Var.f49091e;
                Pattern pattern = org.telegram.ui.Components.c5.f33977a;
                if (j3 != 0) {
                    str3 = a8.p0.o(j3, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                jx0Var.showDialog(org.telegram.ui.Components.c5.V(parentActivity, j3, j10, str3, runnable, h6Var2));
            } else {
                int i10 = 2;
                if (i7 == jx0Var.F) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z10 = !s8Var.f31780e.h;
                    jx0Var.f49094r = z10;
                    s8Var.setChecked(z10);
                    int childCount = jx0Var.f49087b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) jx0Var.f49087b.T(jx0Var.f49087b.getChildAt(i11));
                        int i12 = mj0Var.f59115f;
                        View view2 = mj0Var.f59111a;
                        int b10 = mj0Var.b();
                        if (b10 != jx0Var.F && b10 != jx0Var.Y) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == jx0Var.G) {
                                                    ((org.telegram.ui.Cells.s8) view2).e(arrayList, jx0Var.f49094r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, jx0Var.f49094r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.u8) view2).a(arrayList, jx0Var.f49094r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.a9) view2).c(arrayList, jx0Var.f49094r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.x9) view2).a(arrayList, jx0Var.f49094r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.o4) view2).a(arrayList, jx0Var.f49094r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = jx0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        jx0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        jx0Var.d.addListener(new ay(jx0Var, 24));
                        jx0Var.d.setDuration(150L);
                        jx0Var.d.start();
                    }
                } else if (i7 == jx0Var.G) {
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    Switch r32 = s8Var2.f31780e;
                    org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit().putBoolean(p5.c.k("content_preview_", str), !r32.h).apply();
                    s8Var2.setChecked(!r32.h);
                } else if (i7 == jx0Var.T) {
                    jx0Var.showDialog(org.telegram.ui.Components.c5.V(jx0Var.getParentActivity(), jx0Var.f49092f, jx0Var.h, p5.c.k("calls_vibrate_", str), new Runnable(jx0Var) {
                        public final jx0 f47825b;

                        {
                            this.f47825b = jx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    jx0 jx0Var2 = this.f47825b;
                                    hx0 hx0Var = jx0Var2.f49089c;
                                    if (hx0Var != null) {
                                        hx0Var.g(jx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    jx0 jx0Var3 = this.f47825b;
                                    hx0 hx0Var2 = jx0Var3.f49089c;
                                    if (hx0Var2 != null) {
                                        hx0Var2.g(jx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    jx0 jx0Var4 = this.f47825b;
                                    hx0 hx0Var3 = jx0Var4.f49089c;
                                    if (hx0Var3 != null) {
                                        hx0Var3.g(jx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    jx0 jx0Var5 = this.f47825b;
                                    hx0 hx0Var4 = jx0Var5.f49089c;
                                    if (hx0Var4 != null) {
                                        hx0Var4.g(jx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, jx0Var.f49091e));
                } else if (i7 == jx0Var.K) {
                    jx0Var.showDialog(org.telegram.ui.Components.c5.F(jx0Var.getParentActivity(), jx0Var.f49092f, jx0Var.h, -1, new Runnable(jx0Var) {
                        public final jx0 f47825b;

                        {
                            this.f47825b = jx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    jx0 jx0Var2 = this.f47825b;
                                    hx0 hx0Var = jx0Var2.f49089c;
                                    if (hx0Var != null) {
                                        hx0Var.g(jx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    jx0 jx0Var3 = this.f47825b;
                                    hx0 hx0Var2 = jx0Var3.f49089c;
                                    if (hx0Var2 != null) {
                                        hx0Var2.g(jx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    jx0 jx0Var4 = this.f47825b;
                                    hx0 hx0Var3 = jx0Var4.f49089c;
                                    if (hx0Var3 != null) {
                                        hx0Var3.g(jx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    jx0 jx0Var5 = this.f47825b;
                                    hx0 hx0Var4 = jx0Var5.f49089c;
                                    if (hx0Var4 != null) {
                                        hx0Var4.g(jx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, jx0Var.f49091e));
                } else if (i7 == jx0Var.J) {
                    if (jx0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7;
                        int c10 = org.telegram.messenger.f3.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.f3.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = jx0Var.getParentActivity();
                        ex0 ex0Var = new ex0(jx0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.c5.f33977a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.m6.f29455j5;
                            if (h6Var != null) {
                                x02 = h6Var.i(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.m6.f29420h5;
                            if (h6Var != null) {
                                x03 = h6Var.i(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.m6.Aj;
                            if (h6Var != null) {
                                h6Var.i(i15);
                            } else {
                                org.telegram.ui.ActionBar.m6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.m6.Ej;
                            if (h6Var != null) {
                                h6Var.i(i16);
                            } else {
                                org.telegram.ui.ActionBar.m6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.m6.E8;
                            if (h6Var != null) {
                                h6Var.i(i17);
                            } else {
                                org.telegram.ui.ActionBar.m6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.m6.G8;
                            if (h6Var != null) {
                                h6Var.i(i18);
                            } else {
                                org.telegram.ui.ActionBar.m6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.m6.f29439i6;
                            if (h6Var != null) {
                                h6Var.i(i19);
                            } else {
                                org.telegram.ui.ActionBar.m6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.m6.Ji;
                            if (h6Var != null) {
                                x04 = h6Var.i(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.m6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.m6.Fi;
                            if (h6Var != null) {
                                x05 = h6Var.i(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.m6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.m6.Hi;
                            if (h6Var != null) {
                                x06 = h6Var.i(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.m6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            hi.x4 x4Var = new hi.x4(parentActivity2, h6Var);
                            ((org.telegram.ui.ActionBar.w2) x4Var.f15680b).f30180w0 = false;
                            org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(parentActivity2, h6Var);
                            tb0Var.setMinValue(0);
                            tb0Var.setMaxValue(10);
                            tb0Var.setTextColor(x02);
                            tb0Var.setValue(i10 - 1);
                            tb0Var.setWrapSelectorWheel(false);
                            tb0Var.setFormatter(new cr(25));
                            org.telegram.ui.Components.tb0 tb0Var2 = new org.telegram.ui.Components.tb0(parentActivity2, h6Var);
                            tb0Var2.setMinValue(0);
                            tb0Var2.setMaxValue(10);
                            tb0Var2.setTextColor(x02);
                            tb0Var2.setValue((c11 / 60) - 1);
                            tb0Var2.setWrapSelectorWheel(false);
                            tb0Var2.setFormatter(new cr(26));
                            org.telegram.ui.Components.tb0 tb0Var3 = new org.telegram.ui.Components.tb0(parentActivity2, h6Var);
                            tb0Var3.setMinValue(0);
                            tb0Var3.setMaxValue(0);
                            tb0Var3.setTextColor(x02);
                            tb0Var3.setValue(0);
                            tb0Var3.setWrapSelectorWheel(false);
                            tb0Var3.setFormatter(new cr(27));
                            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, tb0Var, tb0Var2, tb0Var3, 5);
                            w3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            w3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.hd.N0(2131747927, null));
                            textView2.setTextColor(x02);
                            i5.c.x(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new gi.a(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            w3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.xb xbVar = new di.xb(parentActivity2, 18);
                            linearLayout.addView(tb0Var, c8.na.l(0.4f, 0, 270));
                            linearLayout.addView(tb0Var3, c8.na.p(0, -2, 0.2f, 16));
                            linearLayout.addView(tb0Var2, c8.na.l(0.4f, 0, 270));
                            xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            xbVar.setGravity(17);
                            xbVar.setTextColor(x04);
                            xbVar.setTextSize(1, 14.0f);
                            xbVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i22, i24, i24));
                            xbVar.setText(org.telegram.messenger.hd.N0(2131753863, null));
                            w3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
                            cr crVar = new cr(11);
                            tb0Var.setOnValueChangedListener(crVar);
                            tb0Var2.setOnValueChangedListener(crVar);
                            xbVar.setOnClickListener(new bi.s6(tb0Var, tb0Var2, ex0Var, x4Var, 8));
                            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) x4Var.f15680b;
                            w2Var.O = w3Var;
                            w2Var.show();
                            w2Var.v0(x03);
                            w2Var.P(x03);
                        }
                    }
                } else if (i7 == jx0Var.W) {
                    if (jx0Var.getParentActivity() != null) {
                        jx0Var.showDialog(org.telegram.ui.Components.c5.t(jx0Var.getParentActivity(), jx0Var.f49092f, jx0Var.h, -1, new Runnable(jx0Var) {
                            public final jx0 f47825b;

                            {
                                this.f47825b = jx0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        jx0 jx0Var2 = this.f47825b;
                                        hx0 hx0Var = jx0Var2.f49089c;
                                        if (hx0Var != null) {
                                            hx0Var.g(jx0Var2.I);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        jx0 jx0Var3 = this.f47825b;
                                        hx0 hx0Var2 = jx0Var3.f49089c;
                                        if (hx0Var2 != null) {
                                            hx0Var2.g(jx0Var3.T);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        jx0 jx0Var4 = this.f47825b;
                                        hx0 hx0Var3 = jx0Var4.f49089c;
                                        if (hx0Var3 != null) {
                                            hx0Var3.g(jx0Var4.K);
                                            return;
                                        }
                                        return;
                                    default:
                                        jx0 jx0Var5 = this.f47825b;
                                        hx0 hx0Var4 = jx0Var5.f49089c;
                                        if (hx0Var4 != null) {
                                            hx0Var4.g(jx0Var5.W);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, jx0Var.f49091e));
                    }
                } else if (i7 == jx0Var.N) {
                    org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = jx0Var.f49087b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i7 == jx0Var.O) {
                    org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = jx0Var.f49087b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i7 == jx0Var.Q) {
                    org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                    boolean z11 = s8Var3.f31780e.h;
                    boolean z12 = !z11;
                    s8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit();
                    if (jx0Var.f49088b0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    jx0Var.getNotificationsController().c0(jx0Var.f49092f, jx0Var.h, true);
                }
            }
        }
    }

    public static void b0(jx0 jx0Var, String str) {
        jx0Var.f49090c0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(jx0Var.currentAccount).f25821g7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        jx0Var.finishFragment();
        ix0 ix0Var = jx0Var.f49095s;
        if (ix0Var != null) {
            ix0Var.a0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29758z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29403g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        long j3 = this.f49092f;
        long j10 = this.h;
        String v = org.telegram.messenger.ys.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new gx0(this, v));
        org.telegram.ui.ActionBar.h6 h6Var = this.f49091e;
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, h6Var);
        this.f49096w = coVar;
        coVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25932t7.f(-j3, j10);
                qg.c.q(this.f49096w.getAvatarImageView(), f10, false, true, h6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                this.f49096w.setChatAvatar(O0);
                this.simpleActionBar.setTitle(O0.title);
            }
        } else {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                this.f49096w.setUserAvatar(c22);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
            }
        }
        if (this.f49093n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.N0(2131747701, null));
            this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.N0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49087b = ek0Var;
        ek0Var.r1();
        this.f49087b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f49087b, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f49087b;
        hx0 hx0Var = new hx0(this, context);
        this.f49089c = hx0Var;
        ek0Var2.setAdapter(hx0Var);
        this.f49087b.setItemAnimator(null);
        this.f49087b.setLayoutAnimation(null);
        this.f49087b.setLayoutManager(new jg.b0(17));
        this.f49087b.setOnItemClickListener(new a61(this, context, v, 1));
        this.f49085a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25268f0) {
            try {
                this.f49089c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49087b;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.f49091e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49087b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49087b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49087b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29739y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49087b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29529n6));
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
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.f26895b, uri)) != null) {
                if (i7 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.hd.N0(2131751587, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.hd.N0(2131745084, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).f25821g7.edit();
            String v = org.telegram.messenger.ys.v(this.f49092f, this.h, false);
            if (i7 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f49092f, this.h);
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
            hx0 hx0Var = this.f49089c;
            if (hx0Var != null) {
                if (i7 == 13) {
                    i11 = this.S;
                } else {
                    i11 = this.H;
                }
                hx0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f49090c0) {
            String v = org.telegram.messenger.ys.v(this.f49092f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.currentAccount).f25821g7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25268f0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.z3(this.f49096w.f34202e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15884b, org.telegram.messenger.g0.L(6.0f), 0);
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
        org.telegram.messenger.g0.E2(this.f49096w.f34202e);
        if (!this.f49093n) {
            this.f49085a.addView(this.f49096w.f34202e, c8.na.e(42, 42, 53));
        }
        org.telegram.messenger.g0.z3(this.f49096w.f34202e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15884b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
