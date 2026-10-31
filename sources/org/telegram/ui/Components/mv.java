package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class mv extends yl0 {
    public static final int[] f28598e0 = {2131232125, 2131232117, 2131232119, 2131232116, 2131232127, 2131232121, 2131232122, 2131232118};
    public static final int[] f28599f0 = {2131624096, 2131624091, 2131624093, 2131624090, 2131624097, 2131624094, 2131624095, 2131624092};
    public final iv D;
    public final iv E;
    public final iv F;
    public final kv G;
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
    public boolean f28600a0;
    public boolean f28601b0;
    public boolean f28602c0;
    public float f28603d0;
    public final int h;
    public final boolean f28604n;
    public boolean f28605r;
    public t5 f28606s;
    public final org.telegram.ui.ActionBar.p6 f28607w;
    public final boolean f28608x;
    public final iv f28609y;

    public mv(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable, int i11, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232124;
        this.f28604n = !org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q();
        this.f28605r = true;
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
        this.f28600a0 = true;
        this.f28601b0 = false;
        this.f28602c0 = true;
        this.f28603d0 = 11.0f;
        this.f28608x = z13;
        this.f28607w = p6Var;
        this.R = runnable;
        this.T = i10;
        this.Q = i11;
        this.P = z14;
        ev evVar = new ev(this, context, z13, z14);
        this.f32758b = evVar;
        evVar.setClipToPadding(false);
        this.f32758b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f32758b);
        if (i10 == 4) {
            LinearLayout linearLayout = this.f32758b;
            iv ivVar = new iv(this, context, 2131232126, false);
            this.f28609y = ivVar;
            linearLayout.addView(ivVar);
            ivVar.setContentDescription(org.telegram.messenger.cd.L0(2131754756, null));
        }
        if (i10 == 3) {
            this.h = 2131232125;
        }
        if (i10 == 6) {
            this.h = 2131231063;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f32758b;
            iv ivVar2 = new iv(this, context, this.h, false);
            this.D = ivVar2;
            linearLayout2.addView(ivVar2);
            ivVar2.setContentDescription(org.telegram.messenger.cd.L0(2131746376, null));
            ivVar2.f27095a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f32758b;
            iv ivVar3 = new iv(this, context, 2131232120, false);
            this.E = ivVar3;
            linearLayout3.addView(ivVar3);
            ivVar3.setContentDescription(org.telegram.messenger.cd.L0(2131751176, null));
            ivVar3.setAlpha(0.0f);
            ivVar3.f27095a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = f28598e0[i12];
                if (i12 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                iv ivVar4 = new iv(this, context, i13, z15);
                ivVar4.setContentDescription(f(i12));
                this.f32758b.addView(ivVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f32758b;
            kv kvVar = new kv(this, context);
            this.G = kvVar;
            linearLayout4.addView(kvVar);
            kvVar.h = 3552126;
        }
        this.I = this.f32758b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f32758b;
            iv ivVar5 = new iv(this, context, 2131232739, true);
            this.F = ivVar5;
            linearLayout5.addView(ivVar5);
            ivVar5.setContentDescription(org.telegram.messenger.cd.L0(2131745512, null));
            ivVar5.f27095a = Long.valueOf(1434631203);
            ivVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i10) {
        switch (i10) {
            case 0:
                return org.telegram.messenger.cd.L0(2131751196, null);
            case 1:
                return org.telegram.messenger.cd.L0(2131751195, null);
            case 2:
                return org.telegram.messenger.cd.L0(2131751194, null);
            case 3:
                return org.telegram.messenger.cd.L0(2131751193, null);
            case 4:
                return org.telegram.messenger.cd.L0(2131751192, null);
            case 5:
                return org.telegram.messenger.cd.L0(2131751191, null);
            case 6:
                return org.telegram.messenger.cd.L0(2131751190, null);
            case 7:
                return org.telegram.messenger.cd.L0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(ix ixVar) {
        return ixVar.f27115f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.t6.o0(this.f28607w);
    }

    public abstract boolean h(int i10);

    public final void j(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        if (z10 && !this.f28602c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        iv ivVar = this.f28609y;
        if (ivVar != null) {
            i10++;
        }
        if (!this.W || ivVar != null) {
            i10 = Math.max(1, i10);
        }
        int i12 = this.M;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f32758b.getChildCount()) {
            View childAt = this.f32758b.getChildAt(i13);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i15 = 0;
                int i16 = i14;
                while (i15 < kvVar.f32758b.getChildCount()) {
                    View childAt2 = kvVar.f32758b.getChildAt(i15);
                    if (childAt2 instanceof iv) {
                        iv ivVar2 = (iv) childAt2;
                        if (i10 == i16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ivVar2.g(z14, z11);
                    }
                    i15++;
                    i16++;
                }
                i11 = i16 - 1;
            } else {
                if (childAt instanceof iv) {
                    iv ivVar3 = (iv) childAt;
                    if (i10 == i14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ivVar3.g(z13, z11);
                }
                i11 = i14;
            }
            if (i10 >= i14 && i10 <= i11) {
                this.M = i13;
            }
            i13++;
            i14 = i11 + 1;
        }
        int i17 = this.M;
        kv kvVar2 = this.G;
        if (i12 != i17) {
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f7 = this.K;
            float f10 = this.M;
            float f11 = 1.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = ofFloat;
                ofFloat.addUpdateListener(new fe.c(this, f7, f10, 2));
                this.J.setDuration(350L);
                this.J.setInterpolator(gr.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.i0.T1(f7, f10, 1.0f);
                this.f32758b.invalidate();
            }
            if (kvVar2 != null) {
                if (this.M != 1 && !this.f28604n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != kvVar2.f27928n) {
                    kvVar2.f27928n = z12;
                    if (!z12) {
                        kvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = kvVar2.f32759c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f12 = kvVar2.f27929r;
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
                        kvVar2.f32759c = ofFloat2;
                        ofFloat2.addUpdateListener(new a6(kvVar2, 20));
                        kvVar2.f32759c.setDuration(475L);
                        kvVar2.f32759c.setInterpolator(gr.h);
                        kvVar2.f32759c.start();
                    } else {
                        if (!z12) {
                            f11 = 0.0f;
                        }
                        kvVar2.f27929r = f11;
                        kvVar2.invalidate();
                        kvVar2.requestLayout();
                        kvVar2.c();
                        kvVar2.f27930s.f32758b.invalidate();
                    }
                }
            }
            View childAt3 = this.f32758b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i10) {
            if (kvVar2 != null && this.M == 1 && i10 >= 1 && i10 <= kvVar2.f32758b.getChildCount() + 1) {
                int i18 = (i10 - 1) * 36;
                kvVar2.b(org.telegram.messenger.i0.L(i18 - 6), org.telegram.messenger.i0.L(i18 + 24));
            }
            this.N = i10;
        }
    }

    public final int k() {
        boolean z10 = this.P;
        org.telegram.ui.ActionBar.p6 p6Var = this.f28607w;
        if (z10) {
            return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f);
        }
        int i10 = this.T;
        if (i10 != 5 && i10 != 7) {
            return org.telegram.ui.ActionBar.t6.r1(0.18f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var));
        }
        return org.telegram.ui.ActionBar.t6.r1(0.09f, this.Q);
    }

    public final void l(boolean z10) {
        int i10;
        iv ivVar = this.E;
        if (ivVar != null) {
            boolean z11 = this.f28600a0;
            if (z11 || this.f28601b0 != z10) {
                this.f28601b0 = z10;
                float f7 = 0.0f;
                if (z11) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    ivVar.setVisibility(i10);
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ivVar.setAlpha(f7);
                } else {
                    ivVar.setVisibility(0);
                    ViewPropertyAnimator animate = ivVar.animate();
                    if (z10) {
                        f7 = 1.0f;
                    }
                    animate.alpha(f7).setDuration(200L).setInterpolator(gr.h).withEndAction(new k2.v(13, this, z10)).start();
                }
                this.f32758b.requestLayout();
                this.f28600a0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        iv ivVar = this.D;
        if (ivVar == null) {
            return;
        }
        if (z10) {
            ivVar.setBackground(new lv(k()));
        } else {
            ivVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f28605r = z10;
        this.f32758b.invalidate();
    }

    public final void o() {
        int i10 = 0;
        final int i11 = 0;
        while (i10 < this.f32758b.getChildCount()) {
            View childAt = this.f32758b.getChildAt(i10);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                int i12 = 0;
                while (i12 < kvVar.f32758b.getChildCount()) {
                    kvVar.f32758b.getChildAt(i12).setOnClickListener(new View.OnClickListener(this) {
                        public final mv f25543b;

                        {
                            this.f25543b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f25543b.h(i11);
                                    return;
                                default:
                                    this.f25543b.h(i11);
                                    return;
                            }
                        }
                    });
                    i12++;
                    i11++;
                }
                i11--;
            } else if (childAt != null) {
                childAt.setOnClickListener(new View.OnClickListener(this) {
                    public final mv f25543b;

                    {
                        this.f25543b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f25543b.h(i11);
                                return;
                            default:
                                this.f25543b.h(i11);
                                return;
                        }
                    }
                });
            }
            i10++;
            i11++;
        }
        iv ivVar = this.F;
        if (ivVar != null) {
            ivVar.setOnClickListener(new h0(this, 11));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32758b.setPadding(org.telegram.messenger.i0.L(this.f28603d0), 0, org.telegram.messenger.i0.L(11.0f), 0);
        super.onMeasure(i10, i11);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i10) {
        this.S = i10;
    }

    public void setPaddingLeft(float f7) {
        this.f28603d0 = f7;
    }

    public void i(iv ivVar) {
    }

    public void e() {
    }
}
