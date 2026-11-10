package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class xn {
    public final org.telegram.ui.ActionBar.z0 f40353a;
    public final org.telegram.ui.ActionBar.z0 f40354b;
    public final org.telegram.ui.ActionBar.z0 f40355c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f40356e;
    public final vn f40357f;
    public final int f40358g;
    public org.telegram.ui.ActionBar.g1 h;
    public final wn f40359i;
    public long f40360j;
    public int f40361k;
    public int f40362l;
    public final FrameLayout f40363m;
    public final TextView f40364n;
    public int f40365o;

    public xn(Context context, int i7, ve0 ve0Var, boolean z9, final wn wnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        vn vnVar;
        final int i11;
        Integer num;
        this.f40358g = i7;
        this.f40359i = wnVar;
        if (z9) {
            i10 = 2131232564;
        } else {
            i10 = 0;
        }
        vn vnVar2 = new vn(i10, 0, 0, context, h6Var);
        vnVar2.U = new Path();
        this.f40357f = vnVar2;
        vnVar2.setFitItems(true);
        if (ve0Var != null) {
            num = 1;
            vnVar = vnVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232057, org.telegram.messenger.id.M0(2131753756, null), false, h6Var);
            this.f40353a = c10;
            c10.setOnClickListener(new c8(ve0Var, 1));
        } else {
            vnVar = vnVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232403, org.telegram.messenger.id.M0(2131745275, null), false, h6Var);
        this.f40354b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232257, org.telegram.messenger.id.M0(2131748311, null), false, h6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232257, org.telegram.messenger.id.M0(2131748311, null), false, h6Var);
        this.f40356e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232258, org.telegram.messenger.id.M0(2131748308, null), false, h6Var).setOnClickListener(new un(this, context, h6Var, i7, wnVar, 0));
        org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 2131232106, org.telegram.messenger.id.M0(2131747917, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, vnVar, 0, "", false, h6Var);
        this.f40355c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40363m = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, frameLayout, h6Var);
        vnVar.a(frameLayout, c8.ha.o(-1, 8));
        TextView textView = new TextView(context);
        this.f40364n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, h6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        vnVar.a(textView, c8.ha.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 0, 6);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, h6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final xn f38344b;

            {
                this.f38344b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f38344b.a();
                        wnVar.L();
                        return;
                    case 1:
                        xn xnVar = this.f38344b;
                        xnVar.a();
                        wnVar.R(xnVar.f40362l);
                        return;
                    case 2:
                        xn xnVar2 = this.f38344b;
                        xnVar2.a();
                        wnVar.R(xnVar2.f40361k);
                        return;
                    case 3:
                        this.f38344b.a();
                        wnVar.y();
                        return;
                    case 4:
                        this.f38344b.a();
                        org.telegram.messenger.g0.h3(new wf(wnVar, 28));
                        return;
                    default:
                        wnVar.n();
                        this.f38344b.a();
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
            sb2.append(org.telegram.messenger.id.M0(2131745692, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.id.M0(2131745691, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.id.M0(2131745690, null));
        }
        return org.telegram.messenger.id.a0("MuteForButton", null, 2131748309, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        z0Var.c(i7, i7);
        z0Var.h(0.1f, i7);
        if (z0Var.getTextView() != null && z0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        z0Var.d(x02, x02);
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.f40359i.dismiss();
        this.f40360j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.f2 f2Var, View view, float f10, float f11, boolean z9) {
        float measuredWidth;
        float measuredHeight;
        if (f2Var.getFragmentView() != null) {
            vn vnVar = this.f40357f;
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(vnVar, -2, -2);
            this.h = g1Var;
            g1Var.f27493e = true;
            g1Var.f27492c = 220;
            g1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            vnVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f10 - (vnVar.getMeasuredWidth() / 2.0f);
                measuredHeight = vnVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(f2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f40360j < 200) {
            org.telegram.messenger.g0.h3(new bi.h4(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.f40358g;
        boolean r22 = org.telegram.messenger.qp.s1(i12).r2(j3, j10, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.f40355c;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f40354b;
        if (r22) {
            z0Var.j(org.telegram.messenger.id.M0(2131743848, null), 2131232412, null);
            i7 = org.telegram.ui.ActionBar.m6.f28263x6;
            z0Var2.setVisibility(8);
        } else {
            z0Var.j(org.telegram.messenger.id.M0(2131748306, null), 2131232256, null);
            int i13 = org.telegram.ui.ActionBar.m6.f28131q7;
            z0Var2.setVisibility(0);
            if (org.telegram.messenger.qp.s1(i12).s2(j3, j10)) {
                z0Var2.j(org.telegram.messenger.id.M0(2131745277, null), 2131232402, null);
            } else {
                z0Var2.j(org.telegram.messenger.id.M0(2131745275, null), 2131232403, null);
            }
            i7 = i13;
        }
        if (this.f40365o == 1) {
            this.f40353a.setVisibility(8);
        }
        if (!r22 && this.f40365o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i12).f24768d7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.d;
        if (i11 != 0) {
            this.f40362l = i11;
            z0Var3.setVisibility(0);
            z0Var3.getImageView().setImageDrawable(a01.a(i11));
            z0Var3.setText(b(i11));
        } else {
            z0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f40356e;
        if (i10 != 0) {
            this.f40361k = i10;
            z0Var4.setVisibility(0);
            z0Var4.getImageView().setImageDrawable(a01.a(i10));
            z0Var4.setText(b(i10));
        } else {
            z0Var4.setVisibility(8);
        }
        c(z0Var, i7);
        FrameLayout frameLayout = this.f40363m;
        TextView textView = this.f40364n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.m6.f28072n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
