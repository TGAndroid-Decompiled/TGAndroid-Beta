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
public final class hx0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public FrameLayout f48643a;
    public int f48644a0;
    public org.telegram.ui.Components.ek0 f48645b;
    public boolean f48646b0;
    public fx0 f48647c;
    public boolean f48648c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.i6 f48649e;
    public final long f48650f;
    public final long h;
    public final boolean f48651n;
    public boolean f48652r;
    public gx0 f48653s;
    public org.telegram.ui.Components.zn f48654w;
    public int f48655x;
    public int f48656y;

    public hx0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.f48649e = i6Var;
        this.f48650f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f48651n = bundle.getBoolean("exception", false);
    }

    public static void Z(hx0 hx0Var, String str, int i7, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i7);
        putInt.putInt("smart_delay_" + str, i10).apply();
        fx0 fx0Var = hx0Var.f48647c;
        if (fx0Var != null) {
            fx0Var.g(hx0Var.J);
        }
    }

    public static void a0(final hx0 hx0Var, Context context, String str, View view, int i7) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.i6 i6Var = hx0Var.f48649e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i7 == hx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
                String N0 = org.telegram.messenger.gd.N0(2131745906, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131745907, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745922, null), new cx0(hx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                hx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                }
            } else if (i7 == hx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", hx0Var.f48650f);
                bundle.putLong("topic_id", hx0Var.h);
                hx0Var.presentFragment(new wh0(bundle, i6Var));
            } else if (i7 == hx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7;
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
                    hx0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == hx0Var.I) {
                Activity parentActivity = hx0Var.getParentActivity();
                long j3 = hx0Var.f48650f;
                long j10 = hx0Var.h;
                Runnable runnable = new Runnable(hx0Var) {
                    public final hx0 f47253b;

                    {
                        this.f47253b = hx0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                hx0 hx0Var2 = this.f47253b;
                                fx0 fx0Var = hx0Var2.f48647c;
                                if (fx0Var != null) {
                                    fx0Var.g(hx0Var2.I);
                                    return;
                                }
                                return;
                            case 1:
                                hx0 hx0Var3 = this.f47253b;
                                fx0 fx0Var2 = hx0Var3.f48647c;
                                if (fx0Var2 != null) {
                                    fx0Var2.g(hx0Var3.T);
                                    return;
                                }
                                return;
                            case 2:
                                hx0 hx0Var4 = this.f47253b;
                                fx0 fx0Var3 = hx0Var4.f48647c;
                                if (fx0Var3 != null) {
                                    fx0Var3.g(hx0Var4.K);
                                    return;
                                }
                                return;
                            default:
                                hx0 hx0Var5 = this.f47253b;
                                fx0 fx0Var4 = hx0Var5.f48647c;
                                if (fx0Var4 != null) {
                                    fx0Var4.g(hx0Var5.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.i6 i6Var2 = hx0Var.f48649e;
                Pattern pattern = org.telegram.ui.Components.b5.f33627a;
                if (j3 != 0) {
                    str3 = a8.p0.o(j3, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                hx0Var.showDialog(org.telegram.ui.Components.b5.V(parentActivity, j3, j10, str3, runnable, i6Var2));
            } else {
                int i10 = 2;
                if (i7 == hx0Var.F) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z10 = !r8Var.f31813e.h;
                    hx0Var.f48652r = z10;
                    r8Var.setChecked(z10);
                    int childCount = hx0Var.f48645b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) hx0Var.f48645b.T(hx0Var.f48645b.getChildAt(i11));
                        int i12 = mj0Var.f59249f;
                        View view2 = mj0Var.f59245a;
                        int b10 = mj0Var.b();
                        if (b10 != hx0Var.F && b10 != hx0Var.Y) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == hx0Var.G) {
                                                    ((org.telegram.ui.Cells.r8) view2).e(arrayList, hx0Var.f48652r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.i6) view2).b(arrayList, hx0Var.f48652r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.t8) view2).a(arrayList, hx0Var.f48652r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.z8) view2).c(arrayList, hx0Var.f48652r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.w9) view2).a(arrayList, hx0Var.f48652r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.o4) view2).a(arrayList, hx0Var.f48652r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = hx0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        hx0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        hx0Var.d.addListener(new zx(hx0Var, 24));
                        hx0Var.d.setDuration(150L);
                        hx0Var.d.start();
                    }
                } else if (i7 == hx0Var.G) {
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    Switch r32 = r8Var2.f31813e;
                    org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit().putBoolean(p5.c.k("content_preview_", str), !r32.h).apply();
                    r8Var2.setChecked(!r32.h);
                } else if (i7 == hx0Var.T) {
                    hx0Var.showDialog(org.telegram.ui.Components.b5.V(hx0Var.getParentActivity(), hx0Var.f48650f, hx0Var.h, p5.c.k("calls_vibrate_", str), new Runnable(hx0Var) {
                        public final hx0 f47253b;

                        {
                            this.f47253b = hx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    hx0 hx0Var2 = this.f47253b;
                                    fx0 fx0Var = hx0Var2.f48647c;
                                    if (fx0Var != null) {
                                        fx0Var.g(hx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    hx0 hx0Var3 = this.f47253b;
                                    fx0 fx0Var2 = hx0Var3.f48647c;
                                    if (fx0Var2 != null) {
                                        fx0Var2.g(hx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    hx0 hx0Var4 = this.f47253b;
                                    fx0 fx0Var3 = hx0Var4.f48647c;
                                    if (fx0Var3 != null) {
                                        fx0Var3.g(hx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    hx0 hx0Var5 = this.f47253b;
                                    fx0 fx0Var4 = hx0Var5.f48647c;
                                    if (fx0Var4 != null) {
                                        fx0Var4.g(hx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, hx0Var.f48649e));
                } else if (i7 == hx0Var.K) {
                    hx0Var.showDialog(org.telegram.ui.Components.b5.F(hx0Var.getParentActivity(), hx0Var.f48650f, hx0Var.h, -1, new Runnable(hx0Var) {
                        public final hx0 f47253b;

                        {
                            this.f47253b = hx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    hx0 hx0Var2 = this.f47253b;
                                    fx0 fx0Var = hx0Var2.f48647c;
                                    if (fx0Var != null) {
                                        fx0Var.g(hx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    hx0 hx0Var3 = this.f47253b;
                                    fx0 fx0Var2 = hx0Var3.f48647c;
                                    if (fx0Var2 != null) {
                                        fx0Var2.g(hx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    hx0 hx0Var4 = this.f47253b;
                                    fx0 fx0Var3 = hx0Var4.f48647c;
                                    if (fx0Var3 != null) {
                                        fx0Var3.g(hx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    hx0 hx0Var5 = this.f47253b;
                                    fx0 fx0Var4 = hx0Var5.f48647c;
                                    if (fx0Var4 != null) {
                                        fx0Var4.g(hx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, hx0Var.f48649e));
                } else if (i7 == hx0Var.J) {
                    if (hx0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7;
                        int c10 = org.telegram.messenger.f3.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.f3.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = hx0Var.getParentActivity();
                        cx0 cx0Var = new cx0(hx0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.b5.f33627a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.n6.f29559j5;
                            if (i6Var != null) {
                                x02 = i6Var.g(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.n6.f29524h5;
                            if (i6Var != null) {
                                x03 = i6Var.g(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.n6.Aj;
                            if (i6Var != null) {
                                i6Var.g(i15);
                            } else {
                                org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.n6.Ej;
                            if (i6Var != null) {
                                i6Var.g(i16);
                            } else {
                                org.telegram.ui.ActionBar.n6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.n6.E8;
                            if (i6Var != null) {
                                i6Var.g(i17);
                            } else {
                                org.telegram.ui.ActionBar.n6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.n6.G8;
                            if (i6Var != null) {
                                i6Var.g(i18);
                            } else {
                                org.telegram.ui.ActionBar.n6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.n6.f29543i6;
                            if (i6Var != null) {
                                i6Var.g(i19);
                            } else {
                                org.telegram.ui.ActionBar.n6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.n6.Ji;
                            if (i6Var != null) {
                                x04 = i6Var.g(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.n6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.n6.Fi;
                            if (i6Var != null) {
                                x05 = i6Var.g(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.n6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.n6.Hi;
                            if (i6Var != null) {
                                x06 = i6Var.g(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.n6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            h6.o oVar = new h6.o(parentActivity2, i6Var);
                            ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30264w0 = false;
                            org.telegram.ui.Components.qb0 qb0Var = new org.telegram.ui.Components.qb0(parentActivity2, i6Var);
                            qb0Var.setMinValue(0);
                            qb0Var.setMaxValue(10);
                            qb0Var.setTextColor(x02);
                            qb0Var.setValue(i10 - 1);
                            qb0Var.setWrapSelectorWheel(false);
                            qb0Var.setFormatter(new cr(25));
                            org.telegram.ui.Components.qb0 qb0Var2 = new org.telegram.ui.Components.qb0(parentActivity2, i6Var);
                            qb0Var2.setMinValue(0);
                            qb0Var2.setMaxValue(10);
                            qb0Var2.setTextColor(x02);
                            qb0Var2.setValue((c11 / 60) - 1);
                            qb0Var2.setWrapSelectorWheel(false);
                            qb0Var2.setFormatter(new cr(26));
                            org.telegram.ui.Components.qb0 qb0Var3 = new org.telegram.ui.Components.qb0(parentActivity2, i6Var);
                            qb0Var3.setMinValue(0);
                            qb0Var3.setMaxValue(0);
                            qb0Var3.setTextColor(x02);
                            qb0Var3.setValue(0);
                            qb0Var3.setWrapSelectorWheel(false);
                            qb0Var3.setFormatter(new cr(27));
                            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, qb0Var, qb0Var2, qb0Var3, 5);
                            v3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            v3Var.addView(frameLayout, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.gd.N0(2131747927, null));
                            textView2.setTextColor(x02);
                            i5.c.x(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new gi.a(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            v3Var.addView(linearLayout, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.xb xbVar = new di.xb(parentActivity2, 18);
                            linearLayout.addView(qb0Var, c8.na.l(0.4f, 0, 270));
                            linearLayout.addView(qb0Var3, c8.na.p(0, -2, 0.2f, 16));
                            linearLayout.addView(qb0Var2, c8.na.l(0.4f, 0, 270));
                            xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            xbVar.setGravity(17);
                            xbVar.setTextColor(x04);
                            xbVar.setTextSize(1, 14.0f);
                            xbVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            xbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, i22, i24, i24));
                            xbVar.setText(org.telegram.messenger.gd.N0(2131753863, null));
                            v3Var.addView(xbVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
                            cr crVar = new cr(11);
                            qb0Var.setOnValueChangedListener(crVar);
                            qb0Var2.setOnValueChangedListener(crVar);
                            xbVar.setOnClickListener(new bi.s6(qb0Var, qb0Var2, cx0Var, oVar, 8));
                            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.f13936b;
                            w2Var.O = v3Var;
                            w2Var.show();
                            w2Var.v0(x03);
                            w2Var.P(x03);
                        }
                    }
                } else if (i7 == hx0Var.W) {
                    if (hx0Var.getParentActivity() != null) {
                        hx0Var.showDialog(org.telegram.ui.Components.b5.t(hx0Var.getParentActivity(), hx0Var.f48650f, hx0Var.h, -1, new Runnable(hx0Var) {
                            public final hx0 f47253b;

                            {
                                this.f47253b = hx0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hx0 hx0Var2 = this.f47253b;
                                        fx0 fx0Var = hx0Var2.f48647c;
                                        if (fx0Var != null) {
                                            fx0Var.g(hx0Var2.I);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        hx0 hx0Var3 = this.f47253b;
                                        fx0 fx0Var2 = hx0Var3.f48647c;
                                        if (fx0Var2 != null) {
                                            fx0Var2.g(hx0Var3.T);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        hx0 hx0Var4 = this.f47253b;
                                        fx0 fx0Var3 = hx0Var4.f48647c;
                                        if (fx0Var3 != null) {
                                            fx0Var3.g(hx0Var4.K);
                                            return;
                                        }
                                        return;
                                    default:
                                        hx0 hx0Var5 = this.f47253b;
                                        fx0 fx0Var4 = hx0Var5.f48647c;
                                        if (fx0Var4 != null) {
                                            fx0Var4.g(hx0Var5.W);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, hx0Var.f48649e));
                    }
                } else if (i7 == hx0Var.N) {
                    org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag = hx0Var.f48645b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag).a(false, true);
                    }
                } else if (i7 == hx0Var.O) {
                    org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.i6) view).a(true, true);
                    View findViewWithTag2 = hx0Var.f48645b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.i6) findViewWithTag2).a(false, true);
                    }
                } else if (i7 == hx0Var.Q) {
                    org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                    boolean z11 = r8Var3.f31813e.h;
                    boolean z12 = !z11;
                    r8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit();
                    if (hx0Var.f48646b0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    hx0Var.getNotificationsController().c0(hx0Var.f48650f, hx0Var.h, true);
                }
            }
        }
    }

    public static void b0(hx0 hx0Var, String str) {
        hx0Var.f48648c0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(hx0Var.currentAccount).f25753g7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        hx0Var.finishFragment();
        gx0 gx0Var = hx0Var.f48653s;
        if (gx0Var != null) {
            gx0Var.Q();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29507g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        long j3 = this.f48650f;
        long j10 = this.h;
        String v = org.telegram.messenger.xs.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ex0(this, v));
        org.telegram.ui.ActionBar.i6 i6Var = this.f48649e;
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, null, false, i6Var);
        this.f48654w = znVar;
        znVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25864t7.f(-j3, j10);
                qg.c.q(this.f48654w.getAvatarImageView(), f10, false, true, i6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                this.f48654w.setChatAvatar(O0);
                this.simpleActionBar.setTitle(O0.title);
            }
        } else {
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 != null) {
                this.f48654w.setUserAvatar(c22);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
            }
        }
        if (this.f48651n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131747701, null));
            this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f48645b = ek0Var;
        ek0Var.r1();
        this.f48645b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f48645b, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f48645b;
        fx0 fx0Var = new fx0(this, context);
        this.f48647c = fx0Var;
        ek0Var2.setAdapter(fx0Var);
        this.f48645b.setItemAnimator(null);
        this.f48645b.setLayoutAnimation(null);
        this.f48645b.setLayoutManager(new jg.b0(17));
        this.f48645b.setOnItemClickListener(new y51(this, context, v, 1));
        this.f48643a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25209f0) {
            try {
                this.f48647c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f48645b;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f48649e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48645b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48645b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48645b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29843y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48645b, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
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
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.f27013b, uri)) != null) {
                if (i7 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.gd.N0(2131751587, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.gd.N0(2131745084, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.currentAccount).f25753g7.edit();
            String v = org.telegram.messenger.xs.v(this.f48650f, this.h, false);
            if (i7 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f48650f, this.h);
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
            fx0 fx0Var = this.f48647c;
            if (fx0Var != null) {
                if (i7 == 13) {
                    i11 = this.S;
                } else {
                    i11 = this.H;
                }
                fx0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f48648c0) {
            String v = org.telegram.messenger.xs.v(this.f48650f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.currentAccount).f25753g7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25209f0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.z3(this.f48654w.f42934e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15979b, org.telegram.messenger.g0.L(6.0f), 0);
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
        org.telegram.messenger.g0.E2(this.f48654w.f42934e);
        if (!this.f48651n) {
            this.f48643a.addView(this.f48654w.f42934e, c8.na.e(42, 42, 53));
        }
        org.telegram.messenger.g0.z3(this.f48654w.f42934e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15979b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
