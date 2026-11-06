package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class yn {
    public final org.telegram.ui.ActionBar.z0 f40654a;
    public final org.telegram.ui.ActionBar.z0 f40655b;
    public final org.telegram.ui.ActionBar.z0 f40656c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f40657e;
    public final wn f40658f;
    public final int f40659g;
    public org.telegram.ui.ActionBar.g1 h;
    public final xn f40660i;
    public long f40661j;
    public int f40662k;
    public int f40663l;
    public final FrameLayout f40664m;
    public final TextView f40665n;
    public int f40666o;

    public yn(Context context, int i7, ve0 ve0Var, boolean z9, final xn xnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        wn wnVar;
        final int i11;
        Integer num;
        this.f40659g = i7;
        this.f40660i = xnVar;
        if (z9) {
            i10 = 2131232564;
        } else {
            i10 = 0;
        }
        wn wnVar2 = new wn(i10, 0, 0, context, f6Var);
        wnVar2.U = new Path();
        this.f40658f = wnVar2;
        wnVar2.setFitItems(true);
        if (ve0Var != null) {
            num = 1;
            wnVar = wnVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232057, org.telegram.messenger.hd.M0(2131753756, null), false, f6Var);
            this.f40654a = c10;
            c10.setOnClickListener(new d8(ve0Var, 1));
        } else {
            wnVar = wnVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232403, org.telegram.messenger.hd.M0(2131745276, null), false, f6Var);
        this.f40655b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232257, org.telegram.messenger.hd.M0(2131748310, null), false, f6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232257, org.telegram.messenger.hd.M0(2131748310, null), false, f6Var);
        this.f40657e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232258, org.telegram.messenger.hd.M0(2131748307, null), false, f6Var).setOnClickListener(new vn(this, context, f6Var, i7, xnVar, 0));
        org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 2131232106, org.telegram.messenger.hd.M0(2131747916, null), false, f6Var).setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, wnVar, 0, "", false, f6Var);
        this.f40656c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40664m = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, f6Var);
        wnVar.a(frameLayout, c8.ha.o(-1, 8));
        TextView textView = new TextView(context);
        this.f40665n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, f6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        wnVar.a(textView, c8.ha.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var), 0, 6);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, f6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final yn f38694b;

            {
                this.f38694b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38694b.a();
                        xnVar.L();
                        return;
                    case 1:
                        yn ynVar = this.f38694b;
                        ynVar.a();
                        xnVar.R(ynVar.f40663l);
                        return;
                    case 2:
                        yn ynVar2 = this.f38694b;
                        ynVar2.a();
                        xnVar.R(ynVar2.f40662k);
                        return;
                    case 3:
                        this.f38694b.a();
                        xnVar.y();
                        return;
                    case 4:
                        this.f38694b.a();
                        org.telegram.messenger.g0.h3(new xf(xnVar, 28));
                        return;
                    default:
                        xnVar.n();
                        this.f38694b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i7 / 86400;
        int i11 = i7 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(org.telegram.messenger.hd.M0(2131745693, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.hd.M0(2131745692, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.hd.M0(2131745691, null));
        }
        return org.telegram.messenger.hd.a0("MuteForButton", null, 2131748308, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        z0Var.c(i7, i7);
        z0Var.h(0.1f, i7);
        if (z0Var.getTextView() != null && z0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        z0Var.d(x02, x02);
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.f40660i.dismiss();
        this.f40661j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.f2 f2Var, View view, float f10, float f11, boolean z9) {
        float measuredWidth;
        float measuredHeight;
        if (f2Var.getFragmentView() != null) {
            wn wnVar = this.f40658f;
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(wnVar, -2, -2);
            this.h = g1Var;
            g1Var.f27481e = true;
            g1Var.f27480c = 220;
            g1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            wnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != f2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f10 += view.getX();
                f11 += view.getY();
                view = (View) view.getParent();
            }
            if (z9) {
                measuredWidth = f10 - org.telegram.messenger.g0.N(8.0f);
                measuredHeight = org.telegram.messenger.g0.N(16.0f);
            } else {
                measuredWidth = f10 - (wnVar.getMeasuredWidth() / 2.0f);
                measuredHeight = wnVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(f2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f40661j < 200) {
            org.telegram.messenger.g0.h3(new bi.h4(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.f40659g;
        boolean r22 = org.telegram.messenger.qp.s1(i12).r2(j3, j10, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.f40656c;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f40655b;
        if (r22) {
            z0Var.j(org.telegram.messenger.hd.M0(2131743849, null), 2131232412, null);
            i7 = org.telegram.ui.ActionBar.k6.f28221x6;
            z0Var2.setVisibility(8);
        } else {
            z0Var.j(org.telegram.messenger.hd.M0(2131748305, null), 2131232256, null);
            int i13 = org.telegram.ui.ActionBar.k6.f28089q7;
            z0Var2.setVisibility(0);
            if (org.telegram.messenger.qp.s1(i12).s2(j3, j10)) {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745278, null), 2131232402, null);
            } else {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745276, null), 2131232403, null);
            }
            i7 = i13;
        }
        if (this.f40666o == 1) {
            this.f40654a.setVisibility(8);
        }
        if (!r22 && this.f40666o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i12).f24749d7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.d;
        if (i11 != 0) {
            this.f40663l = i11;
            z0Var3.setVisibility(0);
            z0Var3.getImageView().setImageDrawable(zz0.a(i11));
            z0Var3.setText(b(i11));
        } else {
            z0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f40657e;
        if (i10 != 0) {
            this.f40662k = i10;
            z0Var4.setVisibility(0);
            z0Var4.getImageView().setImageDrawable(zz0.a(i10));
            z0Var4.setText(b(i10));
        } else {
            z0Var4.setVisibility(8);
        }
        c(z0Var, i7);
        FrameLayout frameLayout = this.f40664m;
        TextView textView = this.f40665n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.k6.f28030n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
