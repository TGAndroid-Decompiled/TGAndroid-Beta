package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class bv extends vk0 {
    public static final int[] f32361e0 = {2131232126, 2131232118, 2131232120, 2131232117, 2131232128, 2131232122, 2131232123, 2131232119};
    public static final int[] f32362f0 = {2131624098, 2131624093, 2131624095, 2131624092, 2131624099, 2131624096, 2131624097, 2131624094};
    public final xu D;
    public final xu E;
    public final xu F;
    public final zu G;
    public final HashMap H;
    public final int I;
    public ValueAnimator J;
    public float K;
    public float L;
    public int M;
    public int N;
    public boolean O;
    public final boolean P;
    public final int Q;
    public final Runnable R;
    public int S;
    public final int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f32363a0;
    public boolean f32364b0;
    public boolean f32365c0;
    public float f32366d0;
    public final int h;
    public final boolean f32367n;
    public boolean f32368r;
    public w5 f32369s;
    public final org.telegram.ui.ActionBar.f6 f32370w;
    public final boolean f32371x;
    public final xu f32372y;

    public bv(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10, boolean z11, boolean z12, int i7, Runnable runnable, int i10, boolean z13) {
        super(context);
        boolean z14;
        this.h = 2131232125;
        this.f32367n = !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q();
        this.f32368r = true;
        this.H = new HashMap();
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0;
        this.N = 0;
        this.O = true;
        this.S = 6;
        this.U = true;
        this.V = true;
        this.W = true;
        this.f32363a0 = true;
        this.f32364b0 = false;
        this.f32365c0 = true;
        this.f32366d0 = 11.0f;
        this.f32371x = z12;
        this.f32370w = f6Var;
        this.R = runnable;
        this.T = i7;
        this.Q = i10;
        this.P = z13;
        tu tuVar = new tu(this, context, z12, z13);
        this.f39027b = tuVar;
        tuVar.setClipToPadding(false);
        this.f39027b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f39027b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f39027b;
            xu xuVar = new xu(this, context, 2131232127, false);
            this.f32372y = xuVar;
            linearLayout.addView(xuVar);
            xuVar.setContentDescription(org.telegram.messenger.id.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = 2131232126;
        }
        if (i7 == 6) {
            this.h = 2131231063;
        }
        if (z9) {
            LinearLayout linearLayout2 = this.f39027b;
            xu xuVar2 = new xu(this, context, this.h, false);
            this.D = xuVar2;
            linearLayout2.addView(xuVar2);
            xuVar2.setContentDescription(org.telegram.messenger.id.M0(2131746362, null));
            xuVar2.f40480a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.f39027b;
            xu xuVar3 = new xu(this, context, 2131232121, false);
            this.E = xuVar3;
            linearLayout3.addView(xuVar3);
            xuVar3.setContentDescription(org.telegram.messenger.id.M0(2131751176, null));
            xuVar3.setAlpha(0.0f);
            xuVar3.f40480a = Long.valueOf(98352451);
        }
        if (!z12) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f32361e0[i11];
                if (i11 == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                xu xuVar4 = new xu(this, context, i12, z14);
                xuVar4.setContentDescription(f(i11));
                this.f39027b.addView(xuVar4);
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.f39027b;
            zu zuVar = new zu(this, context);
            this.G = zuVar;
            linearLayout4.addView(zuVar);
            zuVar.h = 3552126;
        }
        this.I = this.f39027b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f39027b;
            xu xuVar5 = new xu(this, context, 2131232742, true);
            this.F = xuVar5;
            linearLayout5.addView(xuVar5);
            xuVar5.setContentDescription(org.telegram.messenger.id.M0(2131745498, null));
            xuVar5.f40480a = Long.valueOf(1434631203);
            xuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.id.M0(2131751196, null);
            case 1:
                return org.telegram.messenger.id.M0(2131751195, null);
            case 2:
                return org.telegram.messenger.id.M0(2131751194, null);
            case 3:
                return org.telegram.messenger.id.M0(2131751193, null);
            case 4:
                return org.telegram.messenger.id.M0(2131751192, null);
            case 5:
                return org.telegram.messenger.id.M0(2131751191, null);
            case 6:
                return org.telegram.messenger.id.M0(2131751190, null);
            case 7:
                return org.telegram.messenger.id.M0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(uw uwVar) {
        return uwVar.f38750f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.o0(this.f32370w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        if (z9 && !this.f32365c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xu xuVar = this.f32372y;
        if (xuVar != null) {
            i7++;
        }
        if (!this.W || xuVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.M;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f39027b.getChildCount()) {
            View childAt = this.f39027b.getChildAt(i12);
            if (childAt instanceof zu) {
                zu zuVar = (zu) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < zuVar.f39027b.getChildCount()) {
                    View childAt2 = zuVar.f39027b.getChildAt(i14);
                    if (childAt2 instanceof xu) {
                        xu xuVar2 = (xu) childAt2;
                        if (i7 == i15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xuVar2.g(z13, z10);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof xu) {
                    xu xuVar3 = (xu) childAt;
                    if (i7 == i13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    xuVar3.g(z12, z10);
                }
                i10 = i13;
            }
            if (i7 >= i13 && i7 <= i10) {
                this.M = i12;
            }
            i12++;
            i13 = i10 + 1;
        }
        int i16 = this.M;
        zu zuVar2 = this.G;
        if (i11 != i16) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.K;
            float f11 = this.M;
            float f12 = 1.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new fi.l9(this, f10, f11, 1));
                this.J.setDuration(350L);
                this.J.setInterpolator(xq.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f39027b.invalidate();
            }
            if (zuVar2 != null) {
                if (this.M != 1 && !this.f32367n) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 != zuVar2.f41148n) {
                    zuVar2.f41148n = z11;
                    if (!z11) {
                        zuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = zuVar2.f39028c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        float f13 = zuVar2.f41149r;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        zuVar2.f39028c = ofFloat2;
                        ofFloat2.addUpdateListener(new e6(zuVar2, 20));
                        zuVar2.f39028c.setDuration(475L);
                        zuVar2.f39028c.setInterpolator(xq.h);
                        zuVar2.f39028c.start();
                    } else {
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        zuVar2.f41149r = f12;
                        zuVar2.invalidate();
                        zuVar2.requestLayout();
                        zuVar2.c();
                        zuVar2.f41150s.f39027b.invalidate();
                    }
                }
            }
            View childAt3 = this.f39027b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i7) {
            if (zuVar2 != null && this.M == 1 && i7 >= 1 && i7 <= zuVar2.f39027b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                zuVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.N = i7;
        }
    }

    public final int k() {
        boolean z9 = this.P;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32370w;
        if (z9) {
            return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 12.75f);
        }
        int i7 = this.T;
        if (i7 != 5 && i7 != 7) {
            return org.telegram.ui.ActionBar.k6.r1(0.18f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var));
        }
        return org.telegram.ui.ActionBar.k6.r1(0.09f, this.Q);
    }

    public final void l(boolean z9) {
        int i7;
        xu xuVar = this.E;
        if (xuVar != null) {
            boolean z10 = this.f32363a0;
            if (z10 || this.f32364b0 != z9) {
                this.f32364b0 = z9;
                float f10 = 0.0f;
                if (z10) {
                    if (z9) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    xuVar.setVisibility(i7);
                    if (z9) {
                        f10 = 1.0f;
                    }
                    xuVar.setAlpha(f10);
                } else {
                    xuVar.setVisibility(0);
                    ViewPropertyAnimator animate = xuVar.animate();
                    if (z9) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(xq.h).withEndAction(new bi.k1(23, this, z9)).start();
                }
                this.f39027b.requestLayout();
                this.f32363a0 = false;
            }
        }
    }

    public final void m(boolean z9) {
        xu xuVar = this.D;
        if (xuVar == null) {
            return;
        }
        if (z9) {
            xuVar.setBackground(new av(k()));
        } else {
            xuVar.setBackground(null);
        }
    }

    public final void n(boolean z9) {
        this.f32368r = z9;
        this.f39027b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f39027b.getChildCount()) {
            View childAt = this.f39027b.getChildAt(i7);
            if (childAt instanceof zu) {
                zu zuVar = (zu) childAt;
                int i11 = 0;
                while (i11 < zuVar.f39027b.getChildCount()) {
                    zuVar.f39027b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final bv f38142b;

                        {
                            this.f38142b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f38142b.h(i10);
                                    return;
                                default:
                                    this.f38142b.h(i10);
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
                    public final bv f38142b;

                    {
                        this.f38142b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f38142b.h(i10);
                                return;
                            default:
                                this.f38142b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        xu xuVar = this.F;
        if (xuVar != null) {
            xuVar.setOnClickListener(new h0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f39027b.setPadding(org.telegram.messenger.g0.L(this.f32366d0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.S = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f32366d0 = f10;
    }

    public void i(xu xuVar) {
    }

    public void e() {
    }
}
