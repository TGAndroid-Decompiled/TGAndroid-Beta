package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class lv extends kl0 {
    public static final int[] f37229f0 = {2131232131, 2131232123, 2131232125, 2131232122, 2131232133, 2131232127, 2131232128, 2131232124};
    public static final int[] f37230g0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final hv E;
    public final hv F;
    public final hv G;
    public final jv H;
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
    public boolean f37231a0;
    public boolean f37232b0;
    public boolean f37233c0;
    public boolean f37234d0;
    public float f37235e0;
    public final int h;
    public final boolean f37236n;
    public boolean f37237r;
    public c6 f37238s;
    public final org.telegram.ui.ActionBar.i6 f37239w;
    public final boolean f37240x;
    public final hv f37241y;

    public lv(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232130;
        this.f37236n = !org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q();
        this.f37237r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.f37231a0 = true;
        this.f37232b0 = true;
        this.f37233c0 = false;
        this.f37234d0 = true;
        this.f37235e0 = 11.0f;
        this.f37240x = z13;
        this.f37239w = i6Var;
        this.S = runnable;
        this.U = i7;
        this.R = i10;
        this.Q = z14;
        dv dvVar = new dv(this, context, z13, z14);
        this.f36804b = dvVar;
        dvVar.setClipToPadding(false);
        this.f36804b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f36804b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f36804b;
            hv hvVar = new hv(this, context, 2131232132, false);
            this.f37241y = hvVar;
            linearLayout.addView(hvVar);
            hvVar.setContentDescription(org.telegram.messenger.gd.N0(2131754755, null));
        }
        if (i7 == 3) {
            this.h = 2131232131;
        }
        if (i7 == 6) {
            this.h = 2131231065;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f36804b;
            hv hvVar2 = new hv(this, context, this.h, false);
            this.E = hvVar2;
            linearLayout2.addView(hvVar2);
            hvVar2.setContentDescription(org.telegram.messenger.gd.N0(2131746165, null));
            hvVar2.f35831a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f36804b;
            hv hvVar3 = new hv(this, context, 2131232126, false);
            this.F = hvVar3;
            linearLayout3.addView(hvVar3);
            hvVar3.setContentDescription(org.telegram.messenger.gd.N0(2131751163, null));
            hvVar3.setAlpha(0.0f);
            hvVar3.f35831a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f37229f0[i11];
                if (i11 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                hv hvVar4 = new hv(this, context, i12, z15);
                hvVar4.setContentDescription(f(i11));
                this.f36804b.addView(hvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f36804b;
            jv jvVar = new jv(this, context);
            this.H = jvVar;
            linearLayout4.addView(jvVar);
            jvVar.h = 3552126;
        }
        this.J = this.f36804b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f36804b;
            hv hvVar5 = new hv(this, context, 2131232747, true);
            this.G = hvVar5;
            linearLayout5.addView(hvVar5);
            hvVar5.setContentDescription(org.telegram.messenger.gd.N0(2131745299, null));
            hvVar5.f35831a = Long.valueOf(1434631203);
            hvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.gd.N0(2131751183, null);
            case 1:
                return org.telegram.messenger.gd.N0(2131751182, null);
            case 2:
                return org.telegram.messenger.gd.N0(2131751181, null);
            case 3:
                return org.telegram.messenger.gd.N0(2131751180, null);
            case 4:
                return org.telegram.messenger.gd.N0(2131751179, null);
            case 5:
                return org.telegram.messenger.gd.N0(2131751178, null);
            case 6:
                return org.telegram.messenger.gd.N0(2131751177, null);
            case 7:
                return org.telegram.messenger.gd.N0(2131751176, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(ex exVar) {
        return exVar.f34859f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.n6.o0(this.f37239w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.f37234d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hv hvVar = this.f37241y;
        if (hvVar != null) {
            i7++;
        }
        if (!this.f37231a0 || hvVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.N;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f36804b.getChildCount()) {
            View childAt = this.f36804b.getChildAt(i12);
            if (childAt instanceof jv) {
                jv jvVar = (jv) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < jvVar.f36804b.getChildCount()) {
                    View childAt2 = jvVar.f36804b.getChildAt(i14);
                    if (childAt2 instanceof hv) {
                        hv hvVar2 = (hv) childAt2;
                        if (i7 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        hvVar2.g(z14, z11);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof hv) {
                    hv hvVar3 = (hv) childAt;
                    if (i7 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hvVar3.g(z13, z11);
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
        jv jvVar2 = this.H;
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
                ofFloat.addUpdateListener(new hi.da(this, f10, f11, 2));
                this.K.setDuration(350L);
                this.K.setInterpolator(kr.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f36804b.invalidate();
            }
            if (jvVar2 != null) {
                if (this.N != 1 && !this.f37236n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != jvVar2.f36521n) {
                    jvVar2.f36521n = z12;
                    if (!z12) {
                        jvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = jvVar2.f36805c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = jvVar2.f36522r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        jvVar2.f36805c = ofFloat2;
                        ofFloat2.addUpdateListener(new w(jvVar2, 21));
                        jvVar2.f36805c.setDuration(475L);
                        jvVar2.f36805c.setInterpolator(kr.h);
                        jvVar2.f36805c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        jvVar2.f36522r = f12;
                        jvVar2.invalidate();
                        jvVar2.requestLayout();
                        jvVar2.c();
                        jvVar2.f36523s.f36804b.invalidate();
                    }
                }
            }
            View childAt3 = this.f36804b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i7) {
            if (jvVar2 != null && this.N == 1 && i7 >= 1 && i7 <= jvVar2.f36804b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                jvVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.O = i7;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.i6 i6Var = this.f37239w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, i6Var), (int) 12.75f);
        }
        int i7 = this.U;
        if (i7 != 5 && i7 != 7) {
            return org.telegram.ui.ActionBar.n6.r1(0.18f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var));
        }
        return org.telegram.ui.ActionBar.n6.r1(0.09f, this.R);
    }

    public final void l(boolean z10) {
        int i7;
        hv hvVar = this.F;
        if (hvVar != null) {
            boolean z11 = this.f37232b0;
            if (z11 || this.f37233c0 != z10) {
                this.f37233c0 = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    hvVar.setVisibility(i7);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    hvVar.setAlpha(f10);
                } else {
                    hvVar.setVisibility(0);
                    ViewPropertyAnimator animate = hvVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(kr.h).withEndAction(new ch.k(24, this, z10)).start();
                }
                this.f36804b.requestLayout();
                this.f37232b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        hv hvVar = this.E;
        if (hvVar == null) {
            return;
        }
        if (z10) {
            hvVar.setBackground(new kv(k()));
        } else {
            hvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f37237r = z10;
        this.f36804b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f36804b.getChildCount()) {
            View childAt = this.f36804b.getChildAt(i7);
            if (childAt instanceof jv) {
                jv jvVar = (jv) childAt;
                int i11 = 0;
                while (i11 < jvVar.f36804b.getChildCount()) {
                    jvVar.f36804b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final lv f34150b;

                        {
                            this.f34150b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f34150b.h(i10);
                                    return;
                                default:
                                    this.f34150b.h(i10);
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
                    public final lv f34150b;

                    {
                        this.f34150b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f34150b.h(i10);
                                return;
                            default:
                                this.f34150b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        hv hvVar = this.G;
        if (hvVar != null) {
            hvVar.setOnClickListener(new n0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36804b.setPadding(org.telegram.messenger.g0.L(this.f37235e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.T = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f37235e0 = f10;
    }

    public void i(hv hvVar) {
    }

    public void e() {
    }
}
