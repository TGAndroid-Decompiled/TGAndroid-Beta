package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class oo {
    public final org.telegram.ui.ActionBar.y0 f38223a;
    public final org.telegram.ui.ActionBar.y0 f38224b;
    public final org.telegram.ui.ActionBar.y0 f38225c;
    public final org.telegram.ui.ActionBar.y0 d;
    public final org.telegram.ui.ActionBar.y0 f38226e;
    public final mo f38227f;
    public final int f38228g;
    public org.telegram.ui.ActionBar.g1 h;
    public final no f38229i;
    public long f38230j;
    public int f38231k;
    public int f38232l;
    public final FrameLayout f38233m;
    public final TextView f38234n;
    public int f38235o;

    public oo(Context context, int i7, jf0 jf0Var, boolean z10, final no noVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        mo moVar;
        final int i11;
        Integer num;
        this.f38228g = i7;
        this.f38229i = noVar;
        if (z10) {
            i10 = 2131232569;
        } else {
            i10 = 0;
        }
        mo moVar2 = new mo(i10, 0, 0, context, i6Var);
        moVar2.V = new Path();
        this.f38227f = moVar2;
        moVar2.setFitItems(true);
        if (jf0Var != null) {
            num = 1;
            moVar = moVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232062, org.telegram.messenger.gd.N0(2131753753, null), false, i6Var);
            this.f38223a = c10;
            c10.setOnClickListener(new g8(jf0Var, 1));
        } else {
            moVar = moVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232408, org.telegram.messenger.gd.N0(2131745079, null), false, i6Var);
        this.f38224b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232262, org.telegram.messenger.gd.N0(2131748118, null), false, i6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232262, org.telegram.messenger.gd.N0(2131748118, null), false, i6Var);
        this.f38226e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232263, org.telegram.messenger.gd.N0(2131748115, null), false, i6Var).setOnClickListener(new ko(this, context, i6Var, i7, noVar, 0));
        org.telegram.ui.ActionBar.q0.c(false, false, moVar, 2131232111, org.telegram.messenger.gd.N0(2131747723, null), false, i6Var).setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, moVar, 0, "", false, i6Var);
        this.f38225c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38233m = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout, i6Var);
        moVar.a(frameLayout, c8.na.o(-1, 8));
        TextView textView = new TextView(context);
        this.f38234n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, i6Var);
        frameLayout.setTag(2131296439, num2);
        textView.setTag(2131296439, num2);
        moVar.a(textView, c8.na.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 0, 6);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(textView, a02, null, M, i6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final oo f36467b;

            {
                this.f36467b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36467b.a();
                        noVar.J();
                        return;
                    case 1:
                        oo ooVar = this.f36467b;
                        ooVar.a();
                        noVar.Q(ooVar.f38232l);
                        return;
                    case 2:
                        oo ooVar2 = this.f36467b;
                        ooVar2.a();
                        noVar.Q(ooVar2.f38231k);
                        return;
                    case 3:
                        this.f36467b.a();
                        noVar.y();
                        return;
                    case 4:
                        this.f36467b.a();
                        org.telegram.messenger.g0.g3(new lo(noVar, 0));
                        return;
                    default:
                        noVar.u();
                        this.f36467b.a();
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
            sb2.append(org.telegram.messenger.gd.N0(2131745496, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.gd.N0(2131745495, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.gd.N0(2131745494, null));
        }
        return org.telegram.messenger.gd.a0("MuteForButton", null, 2131748116, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.y0 y0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        y0Var.c(i7, i7);
        y0Var.h(0.1f, i7);
        if (y0Var.getTextView() != null && y0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        y0Var.d(x02, x02);
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.d(true);
            this.h.d(true);
        }
        this.f38229i.dismiss();
        this.f38230j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.g2 g2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (g2Var.getFragmentView() != null) {
            mo moVar = this.f38227f;
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(moVar, -2, -2);
            this.h = g1Var;
            g1Var.f29036e = true;
            g1Var.f29035c = 220;
            g1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            moVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
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
                measuredWidth = f10 - (moVar.getMeasuredWidth() / 2.0f);
                measuredHeight = moVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(g2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f38230j < 200) {
            org.telegram.messenger.g0.g3(new d3.e0(this, j3, j10, hashSet, 6));
            return;
        }
        int i12 = this.f38228g;
        boolean u22 = org.telegram.messenger.mp.u1(i12).u2(j3, j10, null);
        org.telegram.ui.ActionBar.y0 y0Var = this.f38225c;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f38224b;
        if (u22) {
            y0Var.j(org.telegram.messenger.gd.N0(2131743601, null), 2131232417, null);
            i7 = org.telegram.ui.ActionBar.n6.f29824x6;
            y0Var2.setVisibility(8);
        } else {
            y0Var.j(org.telegram.messenger.gd.N0(2131748113, null), 2131232261, null);
            int i13 = org.telegram.ui.ActionBar.n6.f29692q7;
            y0Var2.setVisibility(0);
            if (org.telegram.messenger.mp.u1(i12).v2(j3, j10)) {
                y0Var2.j(org.telegram.messenger.gd.N0(2131745081, null), 2131232407, null);
            } else {
                y0Var2.j(org.telegram.messenger.gd.N0(2131745079, null), 2131232408, null);
            }
            i7 = i13;
        }
        if (this.f38235o == 1) {
            this.f38223a.setVisibility(8);
        }
        if (!u22 && this.f38235o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).f25753g7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.y0 y0Var3 = this.d;
        if (i11 != 0) {
            this.f38232l = i11;
            y0Var3.setVisibility(0);
            y0Var3.getImageView().setImageDrawable(k01.a(i11));
            y0Var3.setText(b(i11));
        } else {
            y0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y0 y0Var4 = this.f38226e;
        if (i10 != 0) {
            this.f38231k = i10;
            y0Var4.setVisibility(0);
            y0Var4.getImageView().setImageDrawable(k01.a(i10));
            y0Var4.setText(b(i10));
        } else {
            y0Var4.setVisibility(8);
        }
        c(y0Var, i7);
        FrameLayout frameLayout = this.f38233m;
        TextView textView = this.f38234n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.n6.f29633n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
