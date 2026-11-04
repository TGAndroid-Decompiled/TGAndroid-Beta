package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class xn {
    public final org.telegram.ui.ActionBar.y0 f40419a;
    public final org.telegram.ui.ActionBar.y0 f40420b;
    public final org.telegram.ui.ActionBar.y0 f40421c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f40422e;
    public final vn f40423f;
    public final int f40424g;
    public org.telegram.ui.ActionBar.f1 h;
    public final wn f40425i;
    public long f40426j;
    public int f40427k;
    public int f40428l;
    public final FrameLayout f40429m;
    public final TextView f40430n;
    public int f40431o;

    public xn(Context context, int i3, xe0 xe0Var, boolean z10, final wn wnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        vn vnVar;
        final int i11;
        Integer num;
        this.f40424g = i3;
        this.f40425i = wnVar;
        if (z10) {
            i10 = 2131232562;
        } else {
            i10 = 0;
        }
        vn vnVar2 = new vn(i10, 0, 0, context, e6Var);
        vnVar2.V = new Path();
        this.f40423f = vnVar2;
        vnVar2.setFitItems(true);
        if (xe0Var != null) {
            num = 1;
            vnVar = vnVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232057, org.telegram.messenger.bd.M0(2131753756, null), false, e6Var);
            this.f40419a = c2;
            c2.setOnClickListener(new b8(xe0Var, 1));
        } else {
            vnVar = vnVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232403, org.telegram.messenger.bd.M0(2131745285, null), false, e6Var);
        this.f40420b = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232257, org.telegram.messenger.bd.M0(2131748319, null), false, e6Var);
        this.d = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232257, org.telegram.messenger.bd.M0(2131748319, null), false, e6Var);
        this.f40422e = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232258, org.telegram.messenger.bd.M0(2131748316, null), false, e6Var).setOnClickListener(new un(this, context, e6Var, i3, wnVar, 0));
        org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 2131232106, org.telegram.messenger.bd.M0(2131747925, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, vnVar, 0, "", false, e6Var);
        this.f40421c = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40429m = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, e6Var);
        vnVar.a(frameLayout, b8.mf.o(-1, 8));
        TextView textView = new TextView(context);
        this.f40430n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, e6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        vnVar.a(textView, b8.mf.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 0, 6);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, e6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38520b;

            {
                this.f38520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38520b.a();
                        wnVar.v();
                        return;
                    case 1:
                        xn xnVar = this.f38520b;
                        xnVar.a();
                        wnVar.z(xnVar.f40428l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38520b;
                        xnVar2.a();
                        wnVar.z(xnVar2.f40427k);
                        return;
                    case 3:
                        this.f38520b.a();
                        wnVar.t();
                        return;
                    case 4:
                        this.f38520b.a();
                        org.telegram.messenger.g0.h3(new vf(wnVar, 28));
                        return;
                    default:
                        wnVar.p();
                        this.f38520b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i3) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i3 / 86400;
        int i11 = i3 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(org.telegram.messenger.bd.M0(2131745702, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.bd.M0(2131745701, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.bd.M0(2131745700, null));
        }
        return org.telegram.messenger.bd.a0("MuteForButton", null, 2131748317, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.y0 y0Var, int i3) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        y0Var.c(i3, i3);
        y0Var.h(0.1f, i3);
        if (y0Var.getTextView() != null && y0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        y0Var.d(x02, x02);
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.f1 f1Var = this.h;
        if (f1Var != null) {
            f1Var.d(true);
            this.h.d(true);
        }
        this.f40425i.dismiss();
        this.f40426j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.d2 d2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (d2Var.getFragmentView() != null) {
            vn vnVar = this.f40423f;
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(vnVar, -2, -2);
            this.h = f1Var;
            f1Var.f27495e = true;
            f1Var.f27494c = 220;
            f1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            vnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != d2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f10 += view.getX();
                f11 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f10 - org.telegram.messenger.g0.N(8.0f);
                measuredHeight = org.telegram.messenger.g0.N(16.0f);
            } else {
                measuredWidth = f10 - (vnVar.getMeasuredWidth() / 2.0f);
                measuredHeight = vnVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(d2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i3;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f40426j < 200) {
            org.telegram.messenger.g0.h3(new c3.f0(this, j10, j11, hashSet, 5));
            return;
        }
        int i12 = this.f40424g;
        boolean r22 = org.telegram.messenger.hp.s1(i12).r2(j10, j11, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.f40421c;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f40420b;
        if (r22) {
            y0Var.j(org.telegram.messenger.bd.M0(2131743858, null), 2131232412, null);
            i3 = org.telegram.ui.ActionBar.k6.f28254x6;
            y0Var2.setVisibility(8);
        } else {
            y0Var.j(org.telegram.messenger.bd.M0(2131748314, null), 2131232256, null);
            int i13 = org.telegram.ui.ActionBar.k6.f28122q7;
            y0Var2.setVisibility(0);
            if (org.telegram.messenger.hp.s1(i12).s2(j10, j11)) {
                y0Var2.j(org.telegram.messenger.bd.M0(2131745287, null), 2131232402, null);
            } else {
                y0Var2.j(org.telegram.messenger.bd.M0(2131745285, null), 2131232403, null);
            }
            i3 = i13;
        }
        if (this.f40431o == 1) {
            this.f40419a.setVisibility(8);
        }
        if (!r22 && this.f40431o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i12).f22989d7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.d;
        if (i11 != 0) {
            this.f40428l = i11;
            y0Var3.setVisibility(0);
            y0Var3.getImageView().setImageDrawable(zz0.a(i11));
            y0Var3.setText(b(i11));
        } else {
            y0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f40422e;
        if (i10 != 0) {
            this.f40427k = i10;
            y0Var4.setVisibility(0);
            y0Var4.getImageView().setImageDrawable(zz0.a(i10));
            y0Var4.setText(b(i10));
        } else {
            y0Var4.setVisibility(8);
        }
        c(y0Var, i3);
        FrameLayout frameLayout = this.f40429m;
        TextView textView = this.f40430n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.k6.f28062n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
