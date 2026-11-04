package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class zu extends zk0 {
    public static final int[] f41112f0 = {2131232126, 2131232118, 2131232120, 2131232117, 2131232128, 2131232122, 2131232123, 2131232119};
    public static final int[] f41113g0 = {2131624098, 2131624093, 2131624095, 2131624092, 2131624099, 2131624096, 2131624097, 2131624094};
    public final vu E;
    public final vu F;
    public final vu G;
    public final xu H;
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
    public boolean f41114a0;
    public boolean f41115b0;
    public boolean f41116c0;
    public boolean f41117d0;
    public float f41118e0;
    public final int h;
    public final boolean f41119n;
    public boolean f41120r;
    public u5 f41121s;
    public final org.telegram.ui.ActionBar.e6 f41122w;
    public final boolean f41123x;
    public final vu f41124y;

    public zu(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i3, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232125;
        this.f41119n = !org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q();
        this.f41120r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.f41114a0 = true;
        this.f41115b0 = true;
        this.f41116c0 = false;
        this.f41117d0 = true;
        this.f41118e0 = 11.0f;
        this.f41123x = z13;
        this.f41122w = e6Var;
        this.S = runnable;
        this.U = i3;
        this.R = i10;
        this.Q = z14;
        ru ruVar = new ru(this, context, z13, z14);
        this.f41058b = ruVar;
        ruVar.setClipToPadding(false);
        this.f41058b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f41058b);
        if (i3 == 4) {
            LinearLayout linearLayout = this.f41058b;
            vu vuVar = new vu(this, context, 2131232127, false);
            this.f41124y = vuVar;
            linearLayout.addView(vuVar);
            vuVar.setContentDescription(org.telegram.messenger.bd.M0(2131754756, null));
        }
        if (i3 == 3) {
            this.h = 2131232126;
        }
        if (i3 == 6) {
            this.h = 2131231063;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f41058b;
            vu vuVar2 = new vu(this, context, this.h, false);
            this.E = vuVar2;
            linearLayout2.addView(vuVar2);
            vuVar2.setContentDescription(org.telegram.messenger.bd.M0(2131746369, null));
            vuVar2.f39795a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f41058b;
            vu vuVar3 = new vu(this, context, 2131232121, false);
            this.F = vuVar3;
            linearLayout3.addView(vuVar3);
            vuVar3.setContentDescription(org.telegram.messenger.bd.M0(2131751176, null));
            vuVar3.setAlpha(0.0f);
            vuVar3.f39795a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f41112f0[i11];
                if (i11 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                vu vuVar4 = new vu(this, context, i12, z15);
                vuVar4.setContentDescription(f(i11));
                this.f41058b.addView(vuVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f41058b;
            xu xuVar = new xu(this, context);
            this.H = xuVar;
            linearLayout4.addView(xuVar);
            xuVar.h = 3552126;
        }
        this.J = this.f41058b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f41058b;
            vu vuVar5 = new vu(this, context, 2131232740, true);
            this.G = vuVar5;
            linearLayout5.addView(vuVar5);
            vuVar5.setContentDescription(org.telegram.messenger.bd.M0(2131745505, null));
            vuVar5.f39795a = Long.valueOf(1434631203);
            vuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i3) {
        switch (i3) {
            case 0:
                return org.telegram.messenger.bd.M0(2131751196, null);
            case 1:
                return org.telegram.messenger.bd.M0(2131751195, null);
            case 2:
                return org.telegram.messenger.bd.M0(2131751194, null);
            case 3:
                return org.telegram.messenger.bd.M0(2131751193, null);
            case 4:
                return org.telegram.messenger.bd.M0(2131751192, null);
            case 5:
                return org.telegram.messenger.bd.M0(2131751191, null);
            case 6:
                return org.telegram.messenger.bd.M0(2131751190, null);
            case 7:
                return org.telegram.messenger.bd.M0(2131751189, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(sw swVar) {
        return swVar.f38128f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.k6.o0(this.f41122w);
    }

    public abstract boolean h(int i3);

    public final void j(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.f41117d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vu vuVar = this.f41124y;
        if (vuVar != null) {
            i3++;
        }
        if (!this.f41114a0 || vuVar != null) {
            i3 = Math.max(1, i3);
        }
        int i11 = this.N;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f41058b.getChildCount()) {
            View childAt = this.f41058b.getChildAt(i12);
            if (childAt instanceof xu) {
                xu xuVar = (xu) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < xuVar.f41058b.getChildCount()) {
                    View childAt2 = xuVar.f41058b.getChildAt(i14);
                    if (childAt2 instanceof vu) {
                        vu vuVar2 = (vu) childAt2;
                        if (i3 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        vuVar2.g(z14, z11);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof vu) {
                    vu vuVar3 = (vu) childAt;
                    if (i3 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    vuVar3.g(z13, z11);
                }
                i10 = i13;
            }
            if (i3 >= i13 && i3 <= i10) {
                this.N = i12;
            }
            i12++;
            i13 = i10 + 1;
        }
        int i16 = this.N;
        xu xuVar2 = this.H;
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
                ofFloat.addUpdateListener(new gi.l9(this, f10, f11, 1));
                this.K.setDuration(350L);
                this.K.setInterpolator(xq.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f41058b.invalidate();
            }
            if (xuVar2 != null) {
                if (this.N != 1 && !this.f41119n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != xuVar2.f40480n) {
                    xuVar2.f40480n = z12;
                    if (!z12) {
                        xuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = xuVar2.f41059c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = xuVar2.f40481r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        xuVar2.f41059c = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(xuVar2, 20));
                        xuVar2.f41059c.setDuration(475L);
                        xuVar2.f41059c.setInterpolator(xq.h);
                        xuVar2.f41059c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        xuVar2.f40481r = f12;
                        xuVar2.invalidate();
                        xuVar2.requestLayout();
                        xuVar2.c();
                        xuVar2.f40482s.f41058b.invalidate();
                    }
                }
            }
            View childAt3 = this.f41058b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i3) {
            if (xuVar2 != null && this.N == 1 && i3 >= 1 && i3 <= xuVar2.f41058b.getChildCount() + 1) {
                int i17 = (i3 - 1) * 36;
                xuVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.O = i3;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41122w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f);
        }
        int i3 = this.U;
        if (i3 != 5 && i3 != 7) {
            return org.telegram.ui.ActionBar.k6.r1(0.18f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var));
        }
        return org.telegram.ui.ActionBar.k6.r1(0.09f, this.R);
    }

    public final void l(boolean z10) {
        int i3;
        vu vuVar = this.F;
        if (vuVar != null) {
            boolean z11 = this.f41115b0;
            if (z11 || this.f41116c0 != z10) {
                this.f41116c0 = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    vuVar.setVisibility(i3);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    vuVar.setAlpha(f10);
                } else {
                    vuVar.setVisibility(0);
                    ViewPropertyAnimator animate = vuVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(xq.h).withEndAction(new ci.e1(23, this, z10)).start();
                }
                this.f41058b.requestLayout();
                this.f41115b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        vu vuVar = this.E;
        if (vuVar == null) {
            return;
        }
        if (z10) {
            vuVar.setBackground(new yu(k()));
        } else {
            vuVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f41120r = z10;
        this.f41058b.invalidate();
    }

    public final void o() {
        int i3 = 0;
        final int i10 = 0;
        while (i3 < this.f41058b.getChildCount()) {
            View childAt = this.f41058b.getChildAt(i3);
            if (childAt instanceof xu) {
                xu xuVar = (xu) childAt;
                int i11 = 0;
                while (i11 < xuVar.f41058b.getChildCount()) {
                    xuVar.f41058b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final zu f37543b;

                        {
                            this.f37543b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f37543b.h(i10);
                                    return;
                                default:
                                    this.f37543b.h(i10);
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
                    public final zu f37543b;

                    {
                        this.f37543b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f37543b.h(i10);
                                return;
                            default:
                                this.f37543b.h(i10);
                                return;
                        }
                    }
                });
            }
            i3++;
            i10++;
        }
        vu vuVar = this.G;
        if (vuVar != null) {
            vuVar.setOnClickListener(new f0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f41058b.setPadding(org.telegram.messenger.g0.L(this.f41118e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i3, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i3) {
        this.T = i3;
    }

    public void setPaddingLeft(float f10) {
        this.f41118e0 = f10;
    }

    public void i(vu vuVar) {
    }

    public void e() {
    }
}
