package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class go {
    public final org.telegram.ui.ActionBar.b1 f26473a;
    public final org.telegram.ui.ActionBar.b1 f26474b;
    public final org.telegram.ui.ActionBar.b1 f26475c;
    public final org.telegram.ui.ActionBar.b1 d;
    public final org.telegram.ui.ActionBar.b1 e;
    public final eo f26476f;
    public final int f26477g;
    public org.telegram.ui.ActionBar.k1 h;
    public final fo f26478i;
    public long f26479j;
    public int f26480k;
    public int f26481l;
    public final FrameLayout f26482m;
    public final TextView f26483n;
    public int f26484o;

    public go(Context context, int i10, yf0 yf0Var, boolean z10, final fo foVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        eo eoVar;
        final int i12;
        Integer num;
        this.f26477g = i10;
        this.f26478i = foVar;
        if (z10) {
            i11 = 2131232561;
        } else {
            i11 = 0;
        }
        eo eoVar2 = new eo(i11, 0, 0, context, p6Var);
        eoVar2.U = new Path();
        this.f26476f = eoVar2;
        eoVar2.setFitItems(true);
        if (yf0Var != null) {
            num = 1;
            eoVar = eoVar2;
            i12 = 1;
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232056, org.telegram.messenger.cd.L0(2131753756, null), false, p6Var);
            this.f26473a = c10;
            c10.setOnClickListener(new y7(yf0Var, 1));
        } else {
            eoVar = eoVar2;
            i12 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232402, org.telegram.messenger.cd.L0(2131745293, null), false, p6Var);
        this.f26474b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232256, org.telegram.messenger.cd.L0(2131748326, null), false, p6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232256, org.telegram.messenger.cd.L0(2131748326, null), false, p6Var);
        this.e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232257, org.telegram.messenger.cd.L0(2131748323, null), false, p6Var).setOnClickListener(new co(this, context, p6Var, i10, foVar, 0));
        org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 2131232105, org.telegram.messenger.cd.L0(2131747933, null), false, p6Var).setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, eoVar, 0, "", false, p6Var);
        this.f26475c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26482m = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.H8, frameLayout, p6Var);
        eoVar.a(frameLayout, w7.b6.o(-1, 8));
        TextView textView = new TextView(context);
        this.f26483n = textView;
        textView.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        textView.setTextSize(i12, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.E8, p6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        eoVar.a(textView, w7.b6.o(-2, -2));
        int i13 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 0, 6);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(textView, a02, null, N, p6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final go f24845b;

            {
                this.f24845b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f24845b.a();
                        foVar.y();
                        return;
                    case 1:
                        go goVar = this.f24845b;
                        goVar.a();
                        foVar.E(goVar.f26481l);
                        return;
                    case 2:
                        go goVar2 = this.f24845b;
                        goVar2.a();
                        foVar.E(goVar2.f26480k);
                        return;
                    case 3:
                        this.f24845b.a();
                        foVar.x();
                        return;
                    case 4:
                        this.f24845b.a();
                        org.telegram.messenger.i0.g3(new tf(foVar, 29));
                        return;
                    default:
                        foVar.n();
                        this.f24845b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = (i12 - (i13 * 3600)) / 60;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(org.telegram.messenger.cd.L0(2131745709, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.cd.L0(2131745708, null));
        }
        if (i14 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i14);
            sb2.append(org.telegram.messenger.cd.L0(2131745707, null));
        }
        return org.telegram.messenger.cd.a0("MuteForButton", null, 2131748324, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.b1 b1Var, int i10) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        b1Var.c(i10, i10);
        b1Var.h(0.1f, i10);
        if (b1Var.getTextView() != null && b1Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        b1Var.d(x02, x02);
        b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.k1 k1Var = this.h;
        if (k1Var != null) {
            k1Var.d(true);
            this.h.d(true);
        }
        this.f26478i.dismiss();
        this.f26479j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.k2 k2Var, View view, float f7, float f10, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (k2Var.getFragmentView() != null) {
            eo eoVar = this.f26476f;
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(eoVar, -2, -2);
            this.h = k1Var;
            k1Var.e = true;
            k1Var.f20456c = 220;
            k1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            eoVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != k2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f7 += view.getX();
                f10 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f7 - org.telegram.messenger.i0.N(8.0f);
                measuredHeight = org.telegram.messenger.i0.N(16.0f);
            } else {
                measuredWidth = f7 - (eoVar.getMeasuredWidth() / 2.0f);
                measuredHeight = eoVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(k2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f10 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j10, long j11, HashSet hashSet) {
        int i10;
        int i11;
        int i12;
        if (System.currentTimeMillis() - this.f26479j < 200) {
            org.telegram.messenger.i0.g3(new a3.h0(this, j10, j11, hashSet, 4));
            return;
        }
        int i13 = this.f26477g;
        boolean q22 = org.telegram.messenger.vp.r1(i13).q2(j10, j11, null);
        org.telegram.ui.ActionBar.b1 b1Var = this.f26475c;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.f26474b;
        if (q22) {
            b1Var.j(org.telegram.messenger.cd.L0(2131743873, null), 2131232411, null);
            i10 = org.telegram.ui.ActionBar.t6.f21295x6;
            b1Var2.setVisibility(8);
        } else {
            b1Var.j(org.telegram.messenger.cd.L0(2131748321, null), 2131232255, null);
            int i14 = org.telegram.ui.ActionBar.t6.f21170q7;
            b1Var2.setVisibility(0);
            if (org.telegram.messenger.vp.r1(i13).r2(j10, j11)) {
                b1Var2.j(org.telegram.messenger.cd.L0(2131745295, null), 2131232401, null);
            } else {
                b1Var2.j(org.telegram.messenger.cd.L0(2131745293, null), 2131232402, null);
            }
            i10 = i14;
        }
        if (this.f26484o == 1) {
            this.f26473a.setVisibility(8);
        }
        if (!q22 && this.f26484o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i13).e7;
            i12 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i11 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i11 = 0;
            i12 = 0;
        }
        org.telegram.ui.ActionBar.b1 b1Var3 = this.d;
        if (i12 != 0) {
            this.f26481l = i12;
            b1Var3.setVisibility(0);
            b1Var3.getImageView().setImageDrawable(f11.a(i12));
            b1Var3.setText(b(i12));
        } else {
            b1Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.b1 b1Var4 = this.e;
        if (i11 != 0) {
            this.f26480k = i11;
            b1Var4.setVisibility(0);
            b1Var4.getImageView().setImageDrawable(f11.a(i11));
            b1Var4.setText(b(i11));
        } else {
            b1Var4.setVisibility(8);
        }
        c(b1Var, i10);
        FrameLayout frameLayout = this.f26482m;
        TextView textView = this.f26483n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.t6.f21115n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
