package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ro {
    public final org.telegram.ui.ActionBar.y0 f39296a;
    public final org.telegram.ui.ActionBar.y0 f39297b;
    public final org.telegram.ui.ActionBar.y0 f39298c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f39299e;
    public final po f39300f;
    public final int f39301g;
    public org.telegram.ui.ActionBar.g1 h;
    public final qo f39302i;
    public long f39303j;
    public int f39304k;
    public int f39305l;
    public final FrameLayout f39306m;
    public final TextView f39307n;
    public int f39308o;

    public ro(Context context, int i7, kf0 kf0Var, boolean z10, final qo qoVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i10;
        po poVar;
        final int i11;
        Integer num;
        this.f39301g = i7;
        this.f39302i = qoVar;
        if (z10) {
            i10 = 2131232566;
        } else {
            i10 = 0;
        }
        po poVar2 = new po(i10, 0, 0, context, h6Var);
        poVar2.V = new Path();
        this.f39300f = poVar2;
        poVar2.setFitItems(true);
        if (kf0Var != null) {
            num = 1;
            poVar = poVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232059, org.telegram.messenger.hd.N0(2131753753, null), false, h6Var);
            this.f39296a = c10;
            c10.setOnClickListener(new h8(kf0Var, 1));
        } else {
            poVar = poVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232405, org.telegram.messenger.hd.N0(2131745079, null), false, h6Var);
        this.f39297b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232259, org.telegram.messenger.hd.N0(2131748118, null), false, h6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232259, org.telegram.messenger.hd.N0(2131748118, null), false, h6Var);
        this.f39299e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232260, org.telegram.messenger.hd.N0(2131748115, null), false, h6Var).setOnClickListener(new no(this, context, h6Var, i7, qoVar, 0));
        org.telegram.ui.ActionBar.q0.c(false, false, poVar, 2131232108, org.telegram.messenger.hd.N0(2131747723, null), false, h6Var).setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, poVar, 0, "", false, h6Var);
        this.f39298c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39306m = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, frameLayout, h6Var);
        poVar.a(frameLayout, c8.ma.o(-1, 8));
        TextView textView = new TextView(context);
        this.f39307n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.E8, h6Var);
        frameLayout.setTag(2131296439, num2);
        textView.setTag(2131296439, num2);
        poVar.a(textView, c8.ma.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.m6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 0, 6);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, h6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ro f37589b;

            {
                this.f37589b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37589b.a();
                        qoVar.w();
                        return;
                    case 1:
                        ro roVar = this.f37589b;
                        roVar.a();
                        qoVar.B(roVar.f39305l);
                        return;
                    case 2:
                        ro roVar2 = this.f37589b;
                        roVar2.a();
                        qoVar.B(roVar2.f39304k);
                        return;
                    case 3:
                        this.f37589b.a();
                        qoVar.u();
                        return;
                    case 4:
                        this.f37589b.a();
                        org.telegram.messenger.g0.g3(new oo(qoVar, 0));
                        return;
                    default:
                        qoVar.p();
                        this.f37589b.a();
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
            sb2.append(org.telegram.messenger.hd.N0(2131745496, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.hd.N0(2131745495, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.hd.N0(2131745494, null));
        }
        return org.telegram.messenger.hd.a0("MuteForButton", null, 2131748116, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        y0Var.c(i7, i7);
        y0Var.h(0.1f, i7);
        if (y0Var.getTextView() != null && y0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        y0Var.d(x02, x02);
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.f39302i.dismiss();
        this.f39303j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.g2 g2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (g2Var.getFragmentView() != null) {
            po poVar = this.f39300f;
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(poVar, -2, -2);
            this.h = g1Var;
            g1Var.f28977e = true;
            g1Var.f28976c = 220;
            g1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            poVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != g2Var.getFragmentView()) {
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
                measuredWidth = f10 - (poVar.getMeasuredWidth() / 2.0f);
                measuredHeight = poVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(g2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f39303j < 200) {
            org.telegram.messenger.g0.g3(new d3.e0(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.f39301g;
        boolean u22 = org.telegram.messenger.np.u1(i12).u2(j3, j10, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.f39298c;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f39297b;
        if (u22) {
            y0Var.j(org.telegram.messenger.hd.N0(2131743603, null), 2131232414, null);
            i7 = org.telegram.ui.ActionBar.m6.f29754x6;
            y0Var2.setVisibility(8);
        } else {
            y0Var.j(org.telegram.messenger.hd.N0(2131748113, null), 2131232258, null);
            int i13 = org.telegram.ui.ActionBar.m6.f29622q7;
            y0Var2.setVisibility(0);
            if (org.telegram.messenger.np.u1(i12).v2(j3, j10)) {
                y0Var2.j(org.telegram.messenger.hd.N0(2131745081, null), 2131232404, null);
            } else {
                y0Var2.j(org.telegram.messenger.hd.N0(2131745079, null), 2131232405, null);
            }
            i7 = i13;
        }
        if (this.f39308o == 1) {
            this.f39296a.setVisibility(8);
        }
        if (!u22 && this.f39308o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i12).f25857g7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.d;
        if (i11 != 0) {
            this.f39305l = i11;
            y0Var3.setVisibility(0);
            y0Var3.getImageView().setImageDrawable(l01.a(i11));
            y0Var3.setText(b(i11));
        } else {
            y0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f39299e;
        if (i10 != 0) {
            this.f39304k = i10;
            y0Var4.setVisibility(0);
            y0Var4.getImageView().setImageDrawable(l01.a(i10));
            y0Var4.setText(b(i10));
        } else {
            y0Var4.setVisibility(8);
        }
        c(y0Var, i7);
        FrameLayout frameLayout = this.f39306m;
        TextView textView = this.f39307n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.m6.f29563n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
