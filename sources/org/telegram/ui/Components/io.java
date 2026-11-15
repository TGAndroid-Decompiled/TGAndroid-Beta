package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class io {
    public final org.telegram.ui.ActionBar.z0 f35674a;
    public final org.telegram.ui.ActionBar.z0 f35675b;
    public final org.telegram.ui.ActionBar.z0 f35676c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f35677e;
    public final go f35678f;
    public final int f35679g;
    public org.telegram.ui.ActionBar.g1 h;
    public final ho f35680i;
    public long f35681j;
    public int f35682k;
    public int f35683l;
    public final FrameLayout f35684m;
    public final TextView f35685n;
    public int f35686o;

    public io(Context context, int i7, ye0 ye0Var, boolean z10, final ho hoVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        go goVar;
        final int i11;
        Integer num;
        this.f35679g = i7;
        this.f35680i = hoVar;
        if (z10) {
            i10 = 2131232565;
        } else {
            i10 = 0;
        }
        go goVar2 = new go(i10, 0, 0, context, e6Var);
        goVar2.V = new Path();
        this.f35678f = goVar2;
        goVar2.setFitItems(true);
        if (ye0Var != null) {
            num = 1;
            goVar = goVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232058, org.telegram.messenger.hd.M0(2131753756, null), false, e6Var);
            this.f35674a = c10;
            c10.setOnClickListener(new a8(ye0Var, 1));
        } else {
            goVar = goVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232404, org.telegram.messenger.hd.M0(2131745275, null), false, e6Var);
        this.f35675b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232258, org.telegram.messenger.hd.M0(2131748311, null), false, e6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232258, org.telegram.messenger.hd.M0(2131748311, null), false, e6Var);
        this.f35677e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232259, org.telegram.messenger.hd.M0(2131748308, null), false, e6Var).setOnClickListener(new eo(this, context, e6Var, i7, hoVar, 0));
        org.telegram.ui.ActionBar.q0.c(false, false, goVar, 2131232107, org.telegram.messenger.hd.M0(2131747917, null), false, e6Var).setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, goVar, 0, "", false, e6Var);
        this.f35676c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35684m = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.H8, frameLayout, e6Var);
        goVar.a(frameLayout, c8.ja.o(-1, 8));
        TextView textView = new TextView(context);
        this.f35685n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, e6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        goVar.a(textView, c8.ja.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 0, 6);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(textView, a02, null, M, e6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final io f33640b;

            {
                this.f33640b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f33640b.a();
                        hoVar.J();
                        return;
                    case 1:
                        io ioVar = this.f33640b;
                        ioVar.a();
                        hoVar.R(ioVar.f35683l);
                        return;
                    case 2:
                        io ioVar2 = this.f33640b;
                        ioVar2.a();
                        hoVar.R(ioVar2.f35682k);
                        return;
                    case 3:
                        this.f33640b.a();
                        hoVar.F();
                        return;
                    case 4:
                        this.f33640b.a();
                        org.telegram.messenger.g0.h3(new fo(hoVar, 0));
                        return;
                    default:
                        hoVar.t();
                        this.f33640b.a();
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
            sb2.append(org.telegram.messenger.hd.M0(2131745692, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.hd.M0(2131745691, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.hd.M0(2131745690, null));
        }
        return org.telegram.messenger.hd.a0("MuteForButton", null, 2131748309, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        z0Var.c(i7, i7);
        z0Var.h(0.1f, i7);
        if (z0Var.getTextView() != null && z0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        z0Var.d(x02, x02);
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.f35680i.dismiss();
        this.f35681j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.e2 e2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (e2Var.getFragmentView() != null) {
            go goVar = this.f35678f;
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(goVar, -2, -2);
            this.h = g1Var;
            g1Var.f28555e = true;
            g1Var.f28554c = 220;
            g1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            goVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != e2Var.getFragmentView()) {
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
                measuredWidth = f10 - (goVar.getMeasuredWidth() / 2.0f);
                measuredHeight = goVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(e2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f35681j < 200) {
            org.telegram.messenger.g0.h3(new d3.e0(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.f35679g;
        boolean r22 = org.telegram.messenger.np.s1(i12).r2(j3, j10, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.f35676c;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f35675b;
        if (r22) {
            z0Var.j(org.telegram.messenger.hd.M0(2131743848, null), 2131232413, null);
            i7 = org.telegram.ui.ActionBar.j6.f29222x6;
            z0Var2.setVisibility(8);
        } else {
            z0Var.j(org.telegram.messenger.hd.M0(2131748306, null), 2131232257, null);
            int i13 = org.telegram.ui.ActionBar.j6.f29090q7;
            z0Var2.setVisibility(0);
            if (org.telegram.messenger.np.s1(i12).s2(j3, j10)) {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745277, null), 2131232403, null);
            } else {
                z0Var2.j(org.telegram.messenger.hd.M0(2131745275, null), 2131232404, null);
            }
            i7 = i13;
        }
        if (this.f35686o == 1) {
            this.f35674a.setVisibility(8);
        }
        if (!r22 && this.f35686o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i12).f25270e7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.d;
        if (i11 != 0) {
            this.f35683l = i11;
            z0Var3.setVisibility(0);
            z0Var3.getImageView().setImageDrawable(c01.a(i11));
            z0Var3.setText(b(i11));
        } else {
            z0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f35677e;
        if (i10 != 0) {
            this.f35682k = i10;
            z0Var4.setVisibility(0);
            z0Var4.getImageView().setImageDrawable(c01.a(i10));
            z0Var4.setText(b(i10));
        } else {
            z0Var4.setVisibility(8);
        }
        c(z0Var, i7);
        FrameLayout frameLayout = this.f35684m;
        TextView textView = this.f35685n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.j6.f29031n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
