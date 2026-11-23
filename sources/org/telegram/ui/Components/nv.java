package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class nv extends kl0 {
    public static final int[] f37946f0 = {2131232128, 2131232120, 2131232122, 2131232119, 2131232130, 2131232124, 2131232125, 2131232121};
    public static final int[] f37947g0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final jv E;
    public final jv F;
    public final jv G;
    public final lv H;
    public final HashMap I;
    public final int J;
    public ValueAnimator K;
    public float L;
    public float M;
    public int N;
    public int O;
    public boolean P;
    public final boolean Q;
    public final int R;
    public final Runnable S;
    public int T;
    public final int U;
    public boolean V;
    public boolean W;
    public boolean f37948a0;
    public boolean f37949b0;
    public boolean f37950c0;
    public boolean f37951d0;
    public float f37952e0;
    public final int h;
    public final boolean f37953n;
    public boolean f37954r;
    public d6 f37955s;
    public final org.telegram.ui.ActionBar.h6 f37956w;
    public final boolean f37957x;
    public final jv f37958y;

    public nv(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232127;
        this.f37953n = !org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).q();
        this.f37954r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.f37948a0 = true;
        this.f37949b0 = true;
        this.f37950c0 = false;
        this.f37951d0 = true;
        this.f37952e0 = 11.0f;
        this.f37957x = z13;
        this.f37956w = h6Var;
        this.S = runnable;
        this.U = i7;
        this.R = i10;
        this.Q = z14;
        fv fvVar = new fv(this, context, z13, z14);
        this.f36895b = fvVar;
        fvVar.setClipToPadding(false);
        this.f36895b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f36895b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f36895b;
            jv jvVar = new jv(this, context, 2131232129, false);
            this.f37958y = jvVar;
            linearLayout.addView(jvVar);
            jvVar.setContentDescription(org.telegram.messenger.hd.N0(2131754755, null));
        }
        if (i7 == 3) {
            this.h = 2131232128;
        }
        if (i7 == 6) {
            this.h = 2131231063;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f36895b;
            jv jvVar2 = new jv(this, context, this.h, false);
            this.E = jvVar2;
            linearLayout2.addView(jvVar2);
            jvVar2.setContentDescription(org.telegram.messenger.hd.N0(2131746165, null));
            jvVar2.f36654a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f36895b;
            jv jvVar3 = new jv(this, context, 2131232123, false);
            this.F = jvVar3;
            linearLayout3.addView(jvVar3);
            jvVar3.setContentDescription(org.telegram.messenger.hd.N0(2131751163, null));
            jvVar3.setAlpha(0.0f);
            jvVar3.f36654a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f37946f0[i11];
                if (i11 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                jv jvVar4 = new jv(this, context, i12, z15);
                jvVar4.setContentDescription(f(i11));
                this.f36895b.addView(jvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f36895b;
            lv lvVar = new lv(this, context);
            this.H = lvVar;
            linearLayout4.addView(lvVar);
            lvVar.h = 3552126;
        }
        this.J = this.f36895b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f36895b;
            jv jvVar5 = new jv(this, context, 2131232744, true);
            this.G = jvVar5;
            linearLayout5.addView(jvVar5);
            jvVar5.setContentDescription(org.telegram.messenger.hd.N0(2131745299, null));
            jvVar5.f36654a = Long.valueOf(1434631203);
            jvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.hd.N0(2131751183, null);
            case 1:
                return org.telegram.messenger.hd.N0(2131751182, null);
            case 2:
                return org.telegram.messenger.hd.N0(2131751181, null);
            case 3:
                return org.telegram.messenger.hd.N0(2131751180, null);
            case 4:
                return org.telegram.messenger.hd.N0(2131751179, null);
            case 5:
                return org.telegram.messenger.hd.N0(2131751178, null);
            case 6:
                return org.telegram.messenger.hd.N0(2131751177, null);
            case 7:
                return org.telegram.messenger.hd.N0(2131751176, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(hx hxVar) {
        return hxVar.f35939f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.m6.o0(this.f37956w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.f37951d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        jv jvVar = this.f37958y;
        if (jvVar != null) {
            i7++;
        }
        if (!this.f37948a0 || jvVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.N;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f36895b.getChildCount()) {
            View childAt = this.f36895b.getChildAt(i12);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < lvVar.f36895b.getChildCount()) {
                    View childAt2 = lvVar.f36895b.getChildAt(i14);
                    if (childAt2 instanceof jv) {
                        jv jvVar2 = (jv) childAt2;
                        if (i7 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        jvVar2.g(z14, z11);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof jv) {
                    jv jvVar3 = (jv) childAt;
                    if (i7 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jvVar3.g(z13, z11);
                }
                i10 = i13;
            }
            if (i7 >= i13 && i7 <= i10) {
                this.N = i12;
            }
            i12++;
            i13 = i10 + 1;
        }
        int i16 = this.N;
        lv lvVar2 = this.H;
        if (i11 != i16) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.L;
            float f11 = this.N;
            float f12 = 1.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.K = ofFloat;
                ofFloat.addUpdateListener(new hi.j9(this, f10, f11, 2));
                this.K.setDuration(350L);
                this.K.setInterpolator(nr.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f36895b.invalidate();
            }
            if (lvVar2 != null) {
                if (this.N != 1 && !this.f37953n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != lvVar2.f37248n) {
                    lvVar2.f37248n = z12;
                    if (!z12) {
                        lvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = lvVar2.f36896c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = lvVar2.f37249r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        lvVar2.f36896c = ofFloat2;
                        ofFloat2.addUpdateListener(new x(lvVar2, 21));
                        lvVar2.f36896c.setDuration(475L);
                        lvVar2.f36896c.setInterpolator(nr.h);
                        lvVar2.f36896c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        lvVar2.f37249r = f12;
                        lvVar2.invalidate();
                        lvVar2.requestLayout();
                        lvVar2.c();
                        lvVar2.f37250s.f36895b.invalidate();
                    }
                }
            }
            View childAt3 = this.f36895b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i7) {
            if (lvVar2 != null && this.N == 1 && i7 >= 1 && i7 <= lvVar2.f36895b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                lvVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.O = i7;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37956w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nl, h6Var), (int) 12.75f);
        }
        int i7 = this.U;
        if (i7 != 5 && i7 != 7) {
            return org.telegram.ui.ActionBar.m6.r1(0.18f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var));
        }
        return org.telegram.ui.ActionBar.m6.r1(0.09f, this.R);
    }

    public final void l(boolean z10) {
        int i7;
        jv jvVar = this.F;
        if (jvVar != null) {
            boolean z11 = this.f37949b0;
            if (z11 || this.f37950c0 != z10) {
                this.f37950c0 = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    jvVar.setVisibility(i7);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    jvVar.setAlpha(f10);
                } else {
                    jvVar.setVisibility(0);
                    ViewPropertyAnimator animate = jvVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(nr.h).withEndAction(new ch.k(24, this, z10)).start();
                }
                this.f36895b.requestLayout();
                this.f37949b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        jv jvVar = this.E;
        if (jvVar == null) {
            return;
        }
        if (z10) {
            jvVar.setBackground(new mv(k()));
        } else {
            jvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f37954r = z10;
        this.f36895b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f36895b.getChildCount()) {
            View childAt = this.f36895b.getChildAt(i7);
            if (childAt instanceof lv) {
                lv lvVar = (lv) childAt;
                int i11 = 0;
                while (i11 < lvVar.f36895b.getChildCount()) {
                    lvVar.f36895b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final nv f34975b;

                        {
                            this.f34975b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f34975b.h(i10);
                                    return;
                                default:
                                    this.f34975b.h(i10);
                                    return;
                            }
                        }
                    });
                    i11++;
                    i10++;
                }
                i10--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final nv f34975b;

                    {
                        this.f34975b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f34975b.h(i10);
                                return;
                            default:
                                this.f34975b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        jv jvVar = this.G;
        if (jvVar != null) {
            jvVar.setOnClickListener(new o0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36895b.setPadding(org.telegram.messenger.g0.L(this.f37952e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.T = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f37952e0 = f10;
    }

    public void i(jv jvVar) {
    }

    public void e() {
    }
}
