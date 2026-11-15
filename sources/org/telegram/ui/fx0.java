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
public final class fx0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public FrameLayout f47208a;
    public int f47209a0;
    public org.telegram.ui.Components.uj0 f47210b;
    public boolean f47211b0;
    public dx0 f47212c;
    public boolean f47213c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.e6 f47214e;
    public final long f47215f;
    public final long h;
    public final boolean f47216n;
    public boolean f47217r;
    public ex0 f47218s;
    public org.telegram.ui.Components.sn f47219w;
    public int f47220x;
    public int f47221y;

    public fx0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.f47214e = e6Var;
        this.f47215f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f47216n = bundle.getBoolean("exception", false);
    }

    public static void Z(fx0 fx0Var, String str, int i7, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i7);
        putInt.putInt("smart_delay_" + str, i10).apply();
        dx0 dx0Var = fx0Var.f47212c;
        if (dx0Var != null) {
            dx0Var.g(fx0Var.J);
        }
    }

    public static void a0(final fx0 fx0Var, Context context, String str, View view, int i7) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.e6 e6Var = fx0Var.f47214e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i7 == fx0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = org.telegram.messenger.hd.M0(2131746102, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131746103, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new ax0(fx0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                fx0Var.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                }
            } else if (i7 == fx0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", fx0Var.f47215f);
                bundle.putLong("topic_id", fx0Var.h);
                fx0Var.presentFragment(new uh0(bundle, e6Var));
            } else if (i7 == fx0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7;
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
                    fx0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == fx0Var.I) {
                Activity parentActivity = fx0Var.getParentActivity();
                long j3 = fx0Var.f47215f;
                long j10 = fx0Var.h;
                Runnable runnable = new Runnable(fx0Var) {
                    public final fx0 f45839b;

                    {
                        this.f45839b = fx0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                fx0 fx0Var2 = this.f45839b;
                                dx0 dx0Var = fx0Var2.f47212c;
                                if (dx0Var != null) {
                                    dx0Var.g(fx0Var2.I);
                                    return;
                                }
                                return;
                            case 1:
                                fx0 fx0Var3 = this.f45839b;
                                dx0 dx0Var2 = fx0Var3.f47212c;
                                if (dx0Var2 != null) {
                                    dx0Var2.g(fx0Var3.T);
                                    return;
                                }
                                return;
                            case 2:
                                fx0 fx0Var4 = this.f45839b;
                                dx0 dx0Var3 = fx0Var4.f47212c;
                                if (dx0Var3 != null) {
                                    dx0Var3.g(fx0Var4.K);
                                    return;
                                }
                                return;
                            default:
                                fx0 fx0Var5 = this.f45839b;
                                dx0 dx0Var4 = fx0Var5.f47212c;
                                if (dx0Var4 != null) {
                                    dx0Var4.g(fx0Var5.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = fx0Var.f47214e;
                Pattern pattern = org.telegram.ui.Components.t4.f39505a;
                if (j3 != 0) {
                    str3 = a8.p0.o(j3, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                fx0Var.showDialog(org.telegram.ui.Components.t4.V(parentActivity, j3, j10, str3, runnable, e6Var2));
            } else {
                int i10 = 2;
                if (i7 == fx0Var.F) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z10 = !q8Var.f31310e.h;
                    fx0Var.f47217r = z10;
                    q8Var.setChecked(z10);
                    int childCount = fx0Var.f47210b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) fx0Var.f47210b.T(fx0Var.f47210b.getChildAt(i11));
                        int i12 = cj0Var.f58539f;
                        View view2 = cj0Var.f58535a;
                        int b10 = cj0Var.b();
                        if (b10 != fx0Var.F && b10 != fx0Var.Y) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == fx0Var.G) {
                                                    ((org.telegram.ui.Cells.q8) view2).e(arrayList, fx0Var.f47217r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.h6) view2).b(arrayList, fx0Var.f47217r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.s8) view2).a(arrayList, fx0Var.f47217r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.y8) view2).c(arrayList, fx0Var.f47217r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.v9) view2).a(arrayList, fx0Var.f47217r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.n4) view2).a(arrayList, fx0Var.f47217r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = fx0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        fx0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        fx0Var.d.addListener(new xx(fx0Var, 24));
                        fx0Var.d.setDuration(150L);
                        fx0Var.d.start();
                    }
                } else if (i7 == fx0Var.G) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    Switch r32 = q8Var2.f31310e;
                    org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit().putBoolean(r.b.k("content_preview_", str), !r32.h).apply();
                    q8Var2.setChecked(!r32.h);
                } else if (i7 == fx0Var.T) {
                    fx0Var.showDialog(org.telegram.ui.Components.t4.V(fx0Var.getParentActivity(), fx0Var.f47215f, fx0Var.h, r.b.k("calls_vibrate_", str), new Runnable(fx0Var) {
                        public final fx0 f45839b;

                        {
                            this.f45839b = fx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    fx0 fx0Var2 = this.f45839b;
                                    dx0 dx0Var = fx0Var2.f47212c;
                                    if (dx0Var != null) {
                                        dx0Var.g(fx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    fx0 fx0Var3 = this.f45839b;
                                    dx0 dx0Var2 = fx0Var3.f47212c;
                                    if (dx0Var2 != null) {
                                        dx0Var2.g(fx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    fx0 fx0Var4 = this.f45839b;
                                    dx0 dx0Var3 = fx0Var4.f47212c;
                                    if (dx0Var3 != null) {
                                        dx0Var3.g(fx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    fx0 fx0Var5 = this.f45839b;
                                    dx0 dx0Var4 = fx0Var5.f47212c;
                                    if (dx0Var4 != null) {
                                        dx0Var4.g(fx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, fx0Var.f47214e));
                } else if (i7 == fx0Var.K) {
                    fx0Var.showDialog(org.telegram.ui.Components.t4.F(fx0Var.getParentActivity(), fx0Var.f47215f, fx0Var.h, -1, new Runnable(fx0Var) {
                        public final fx0 f45839b;

                        {
                            this.f45839b = fx0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    fx0 fx0Var2 = this.f45839b;
                                    dx0 dx0Var = fx0Var2.f47212c;
                                    if (dx0Var != null) {
                                        dx0Var.g(fx0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    fx0 fx0Var3 = this.f45839b;
                                    dx0 dx0Var2 = fx0Var3.f47212c;
                                    if (dx0Var2 != null) {
                                        dx0Var2.g(fx0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    fx0 fx0Var4 = this.f45839b;
                                    dx0 dx0Var3 = fx0Var4.f47212c;
                                    if (dx0Var3 != null) {
                                        dx0Var3.g(fx0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    fx0 fx0Var5 = this.f45839b;
                                    dx0 dx0Var4 = fx0Var5.f47212c;
                                    if (dx0Var4 != null) {
                                        dx0Var4.g(fx0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, fx0Var.f47214e));
                } else if (i7 == fx0Var.J) {
                    if (fx0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7;
                        int c10 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = fx0Var.getParentActivity();
                        ax0 ax0Var = new ax0(fx0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.t4.f39505a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.j6.f28957j5;
                            if (e6Var != null) {
                                x02 = e6Var.f(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.j6.f28922h5;
                            if (e6Var != null) {
                                x03 = e6Var.f(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.Aj;
                            if (e6Var != null) {
                                e6Var.f(i15);
                            } else {
                                org.telegram.ui.ActionBar.j6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ej;
                            if (e6Var != null) {
                                e6Var.f(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.E8;
                            if (e6Var != null) {
                                e6Var.f(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.G8;
                            if (e6Var != null) {
                                e6Var.f(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.f28941i6;
                            if (e6Var != null) {
                                e6Var.f(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.Ji;
                            if (e6Var != null) {
                                x04 = e6Var.f(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.j6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Fi;
                            if (e6Var != null) {
                                x05 = e6Var.f(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.j6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.j6.Hi;
                            if (e6Var != null) {
                                x06 = e6Var.f(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.j6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(parentActivity2, e6Var);
                            ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
                            org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(parentActivity2, e6Var);
                            ib0Var.setMinValue(0);
                            ib0Var.setMaxValue(10);
                            ib0Var.setTextColor(x02);
                            ib0Var.setValue(i10 - 1);
                            ib0Var.setWrapSelectorWheel(false);
                            ib0Var.setFormatter(new br(24));
                            org.telegram.ui.Components.ib0 ib0Var2 = new org.telegram.ui.Components.ib0(parentActivity2, e6Var);
                            ib0Var2.setMinValue(0);
                            ib0Var2.setMaxValue(10);
                            ib0Var2.setTextColor(x02);
                            ib0Var2.setValue((c11 / 60) - 1);
                            ib0Var2.setWrapSelectorWheel(false);
                            ib0Var2.setFormatter(new br(25));
                            org.telegram.ui.Components.ib0 ib0Var3 = new org.telegram.ui.Components.ib0(parentActivity2, e6Var);
                            ib0Var3.setMinValue(0);
                            ib0Var3.setMaxValue(0);
                            ib0Var3.setTextColor(x02);
                            ib0Var3.setValue(0);
                            ib0Var3.setWrapSelectorWheel(false);
                            ib0Var3.setFormatter(new br(26));
                            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, ib0Var, ib0Var2, ib0Var3, 5);
                            n3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            n3Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.hd.M0(2131748120, null));
                            textView2.setTextColor(x02);
                            i5.c.v(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new gi.a(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            n3Var.addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.tb tbVar = new di.tb(parentActivity2, 18);
                            linearLayout.addView(ib0Var, c8.ja.l(0.4f, 0, 270));
                            linearLayout.addView(ib0Var3, c8.ja.p(0, -2, 0.2f, 16));
                            linearLayout.addView(ib0Var2, c8.ja.l(0.4f, 0, 270));
                            tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            tbVar.setGravity(17);
                            tbVar.setTextColor(x04);
                            tbVar.setTextSize(1, 14.0f);
                            tbVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            tbVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, i22, i24, i24));
                            tbVar.setText(org.telegram.messenger.hd.M0(2131753866, null));
                            n3Var.addView(tbVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
                            br brVar = new br(10);
                            ib0Var.setOnValueChangedListener(brVar);
                            ib0Var2.setOnValueChangedListener(brVar);
                            tbVar.setOnClickListener(new bi.f4(ib0Var, ib0Var2, ax0Var, ouVar, 8));
                            org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
                            u2Var.O = n3Var;
                            u2Var.show();
                            u2Var.v0(x03);
                            u2Var.P(x03);
                        }
                    }
                } else if (i7 == fx0Var.W) {
                    if (fx0Var.getParentActivity() != null) {
                        fx0Var.showDialog(org.telegram.ui.Components.t4.t(fx0Var.getParentActivity(), fx0Var.f47215f, fx0Var.h, -1, new Runnable(fx0Var) {
                            public final fx0 f45839b;

                            {
                                this.f45839b = fx0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fx0 fx0Var2 = this.f45839b;
                                        dx0 dx0Var = fx0Var2.f47212c;
                                        if (dx0Var != null) {
                                            dx0Var.g(fx0Var2.I);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        fx0 fx0Var3 = this.f45839b;
                                        dx0 dx0Var2 = fx0Var3.f47212c;
                                        if (dx0Var2 != null) {
                                            dx0Var2.g(fx0Var3.T);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        fx0 fx0Var4 = this.f45839b;
                                        dx0 dx0Var3 = fx0Var4.f47212c;
                                        if (dx0Var3 != null) {
                                            dx0Var3.g(fx0Var4.K);
                                            return;
                                        }
                                        return;
                                    default:
                                        fx0 fx0Var5 = this.f45839b;
                                        dx0 dx0Var4 = fx0Var5.f47212c;
                                        if (dx0Var4 != null) {
                                            dx0Var4.g(fx0Var5.W);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, fx0Var.f47214e));
                    }
                } else if (i7 == fx0Var.N) {
                    org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag = fx0Var.f47210b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag).a(false, true);
                    }
                } else if (i7 == fx0Var.O) {
                    org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag2 = fx0Var.f47210b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag2).a(false, true);
                    }
                } else if (i7 == fx0Var.Q) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean z11 = q8Var3.f31310e.h;
                    boolean z12 = !z11;
                    q8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit();
                    if (fx0Var.f47211b0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    fx0Var.getNotificationsController().c0(fx0Var.f47215f, fx0Var.h, true);
                }
            }
        }
    }

    public static void b0(fx0 fx0Var, String str) {
        fx0Var.f47213c0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(fx0Var.currentAccount).f25273e7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        fx0Var.finishFragment();
        ex0 ex0Var = fx0Var.f47218s;
        if (ex0Var != null) {
            ex0Var.b0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        long j3 = this.f47215f;
        long j10 = this.h;
        String v = org.telegram.messenger.at.v(j3, j10, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new cx0(this, v));
        org.telegram.ui.ActionBar.e6 e6Var = this.f47214e;
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, e6Var);
        this.f47219w = snVar;
        snVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f25386r7.f(-j3, j10);
                qg.c.p(this.f47219w.getAvatarImageView(), f10, false, true, e6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                this.f47219w.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 != null) {
                this.f47219w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        }
        if (this.f47216n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131747895, null));
            this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131751684, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f47210b = uj0Var;
        uj0Var.r1();
        this.f47210b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f47210b, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.uj0 uj0Var2 = this.f47210b;
        dx0 dx0Var = new dx0(this, context);
        this.f47212c = dx0Var;
        uj0Var2.setAdapter(dx0Var);
        this.f47210b.setItemAnimator(null);
        this.f47210b.setLayoutAnimation(null);
        this.f47210b.setLayoutManager(new jg.b0(17));
        this.f47210b.setOnItemClickListener(new w51(this, context, v, 1));
        this.f47208a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25493f0) {
            try {
                this.f47212c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f47210b;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f47214e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47210b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47210b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47210b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29241y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47210b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
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
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.f26609b, uri)) != null) {
                if (i7 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.hd.M0(2131751599, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.hd.M0(2131745280, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).f25273e7.edit();
            String v = org.telegram.messenger.at.v(this.f47215f, this.h, false);
            if (i7 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f47215f, this.h);
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
            dx0 dx0Var = this.f47212c;
            if (dx0Var != null) {
                if (i7 == 13) {
                    i11 = this.S;
                } else {
                    i11 = this.H;
                }
                dx0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f47213c0) {
            String v = org.telegram.messenger.at.v(this.f47215f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).f25273e7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25493f0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        org.telegram.messenger.g0.A3(this.f47219w.f39351e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15575b, org.telegram.messenger.g0.L(6.0f), 0);
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
        org.telegram.messenger.g0.E2(this.f47219w.f39351e);
        if (!this.f47216n) {
            this.f47208a.addView(this.f47219w.f39351e, c8.ja.e(42, 42, 53));
        }
        org.telegram.messenger.g0.A3(this.f47219w.f39351e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15575b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
