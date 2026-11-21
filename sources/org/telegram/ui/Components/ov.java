package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class ov extends kl0 {
    public static final int[] f38373f0 = {2131232128, 2131232120, 2131232122, 2131232119, 2131232130, 2131232124, 2131232125, 2131232121};
    public static final int[] f38374g0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final kv E;
    public final kv F;
    public final kv G;
    public final mv H;
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
    public boolean f38375a0;
    public boolean f38376b0;
    public boolean f38377c0;
    public boolean f38378d0;
    public float f38379e0;
    public final int h;
    public final boolean f38380n;
    public boolean f38381r;
    public d6 f38382s;
    public final org.telegram.ui.ActionBar.h6 f38383w;
    public final boolean f38384x;
    public final kv f38385y;

    public ov(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232127;
        this.f38380n = !org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q();
        this.f38381r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.f38375a0 = true;
        this.f38376b0 = true;
        this.f38377c0 = false;
        this.f38378d0 = true;
        this.f38379e0 = 11.0f;
        this.f38384x = z13;
        this.f38383w = h6Var;
        this.S = runnable;
        this.U = i7;
        this.R = i10;
        this.Q = z14;
        gv gvVar = new gv(this, context, z13, z14);
        this.f36926b = gvVar;
        gvVar.setClipToPadding(false);
        this.f36926b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f36926b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f36926b;
            kv kvVar = new kv(this, context, 2131232129, false);
            this.f38385y = kvVar;
            linearLayout.addView(kvVar);
            kvVar.setContentDescription(org.telegram.messenger.gd.N0(2131754755, null));
        }
        if (i7 == 3) {
            this.h = 2131232128;
        }
        if (i7 == 6) {
            this.h = 2131231063;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f36926b;
            kv kvVar2 = new kv(this, context, this.h, false);
            this.E = kvVar2;
            linearLayout2.addView(kvVar2);
            kvVar2.setContentDescription(org.telegram.messenger.gd.N0(2131746165, null));
            kvVar2.f36989a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f36926b;
            kv kvVar3 = new kv(this, context, 2131232123, false);
            this.F = kvVar3;
            linearLayout3.addView(kvVar3);
            kvVar3.setContentDescription(org.telegram.messenger.gd.N0(2131751163, null));
            kvVar3.setAlpha(0.0f);
            kvVar3.f36989a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f38373f0[i11];
                if (i11 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                kv kvVar4 = new kv(this, context, i12, z15);
                kvVar4.setContentDescription(f(i11));
                this.f36926b.addView(kvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f36926b;
            mv mvVar = new mv(this, context);
            this.H = mvVar;
            linearLayout4.addView(mvVar);
            mvVar.h = 3552126;
        }
        this.J = this.f36926b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f36926b;
            kv kvVar5 = new kv(this, context, 2131232744, true);
            this.G = kvVar5;
            linearLayout5.addView(kvVar5);
            kvVar5.setContentDescription(org.telegram.messenger.gd.N0(2131745299, null));
            kvVar5.f36989a = Long.valueOf(1434631203);
            kvVar5.setAlpha(0.0f);
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

    public boolean g(hx hxVar) {
        return hxVar.f35991f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.m6.o0(this.f38383w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.f38378d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        kv kvVar = this.f38385y;
        if (kvVar != null) {
            i7++;
        }
        if (!this.f38375a0 || kvVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.N;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f36926b.getChildCount()) {
            View childAt = this.f36926b.getChildAt(i12);
            if (childAt instanceof mv) {
                mv mvVar = (mv) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < mvVar.f36926b.getChildCount()) {
                    View childAt2 = mvVar.f36926b.getChildAt(i14);
                    if (childAt2 instanceof kv) {
                        kv kvVar2 = (kv) childAt2;
                        if (i7 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        kvVar2.g(z14, z11);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof kv) {
                    kv kvVar3 = (kv) childAt;
                    if (i7 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kvVar3.g(z13, z11);
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
        mv mvVar2 = this.H;
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
                ofFloat.addUpdateListener(new hi.i9(this, f10, f11, 2));
                this.K.setDuration(350L);
                this.K.setInterpolator(nr.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f36926b.invalidate();
            }
            if (mvVar2 != null) {
                if (this.N != 1 && !this.f38380n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != mvVar2.f37648n) {
                    mvVar2.f37648n = z12;
                    if (!z12) {
                        mvVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = mvVar2.f36927c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = mvVar2.f37649r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        mvVar2.f36927c = ofFloat2;
                        ofFloat2.addUpdateListener(new x(mvVar2, 21));
                        mvVar2.f36927c.setDuration(475L);
                        mvVar2.f36927c.setInterpolator(nr.h);
                        mvVar2.f36927c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        mvVar2.f37649r = f12;
                        mvVar2.invalidate();
                        mvVar2.requestLayout();
                        mvVar2.c();
                        mvVar2.f37650s.f36926b.invalidate();
                    }
                }
            }
            View childAt3 = this.f36926b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i7) {
            if (mvVar2 != null && this.N == 1 && i7 >= 1 && i7 <= mvVar2.f36926b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                mvVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.O = i7;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38383w;
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
        kv kvVar = this.F;
        if (kvVar != null) {
            boolean z11 = this.f38376b0;
            if (z11 || this.f38377c0 != z10) {
                this.f38377c0 = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    kvVar.setVisibility(i7);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    kvVar.setAlpha(f10);
                } else {
                    kvVar.setVisibility(0);
                    ViewPropertyAnimator animate = kvVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(nr.h).withEndAction(new ch.k(24, this, z10)).start();
                }
                this.f36926b.requestLayout();
                this.f38376b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        kv kvVar = this.E;
        if (kvVar == null) {
            return;
        }
        if (z10) {
            kvVar.setBackground(new nv(k()));
        } else {
            kvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f38381r = z10;
        this.f36926b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f36926b.getChildCount()) {
            View childAt = this.f36926b.getChildAt(i7);
            if (childAt instanceof mv) {
                mv mvVar = (mv) childAt;
                int i11 = 0;
                while (i11 < mvVar.f36926b.getChildCount()) {
                    mvVar.f36926b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final ov f35317b;

                        {
                            this.f35317b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f35317b.h(i10);
                                    return;
                                default:
                                    this.f35317b.h(i10);
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
                    public final ov f35317b;

                    {
                        this.f35317b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f35317b.h(i10);
                                return;
                            default:
                                this.f35317b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        kv kvVar = this.G;
        if (kvVar != null) {
            kvVar.setOnClickListener(new o0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36926b.setPadding(org.telegram.messenger.g0.L(this.f38379e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.T = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f38379e0 = f10;
    }

    public void i(kv kvVar) {
    }

    public void e() {
    }
}
