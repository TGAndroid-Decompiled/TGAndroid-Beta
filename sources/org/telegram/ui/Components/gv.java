package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class gv extends al0 {
    public static final int[] f35061f0 = {2131232127, 2131232119, 2131232121, 2131232118, 2131232129, 2131232123, 2131232124, 2131232120};
    public static final int[] f35062g0 = {2131624099, 2131624094, 2131624096, 2131624093, 2131624100, 2131624097, 2131624098, 2131624095};
    public final cv E;
    public final cv F;
    public final cv G;
    public final ev H;
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
    public boolean f35063a0;
    public boolean f35064b0;
    public boolean f35065c0;
    public boolean f35066d0;
    public float f35067e0;
    public final int h;
    public final boolean f35068n;
    public boolean f35069r;
    public u5 f35070s;
    public final org.telegram.ui.ActionBar.e6 f35071w;
    public final boolean f35072x;
    public final cv f35073y;

    public gv(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, boolean z12, boolean z13, int i7, Runnable runnable, int i10, boolean z14) {
        super(context);
        boolean z15;
        this.h = 2131232126;
        this.f35068n = !org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q();
        this.f35069r = true;
        this.I = new HashMap();
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0;
        this.O = 0;
        this.P = true;
        this.T = 6;
        this.V = true;
        this.W = true;
        this.f35063a0 = true;
        this.f35064b0 = true;
        this.f35065c0 = false;
        this.f35066d0 = true;
        this.f35067e0 = 11.0f;
        this.f35072x = z13;
        this.f35071w = e6Var;
        this.S = runnable;
        this.U = i7;
        this.R = i10;
        this.Q = z14;
        yu yuVar = new yu(this, context, z13, z14);
        this.f33010b = yuVar;
        yuVar.setClipToPadding(false);
        this.f33010b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f33010b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f33010b;
            cv cvVar = new cv(this, context, 2131232128, false);
            this.f35073y = cvVar;
            linearLayout.addView(cvVar);
            cvVar.setContentDescription(org.telegram.messenger.hd.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = 2131232127;
        }
        if (i7 == 6) {
            this.h = 2131231063;
        }
        if (z10) {
            LinearLayout linearLayout2 = this.f33010b;
            cv cvVar2 = new cv(this, context, this.h, false);
            this.E = cvVar2;
            linearLayout2.addView(cvVar2);
            cvVar2.setContentDescription(org.telegram.messenger.hd.M0(2131746361, null));
            cvVar2.f33693a = Long.valueOf(-934918565);
        }
        if (z11) {
            LinearLayout linearLayout3 = this.f33010b;
            cv cvVar3 = new cv(this, context, 2131232122, false);
            this.F = cvVar3;
            linearLayout3.addView(cvVar3);
            cvVar3.setContentDescription(org.telegram.messenger.hd.M0(2131751175, null));
            cvVar3.setAlpha(0.0f);
            cvVar3.f33693a = Long.valueOf(98352451);
        }
        if (!z13) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f35061f0[i11];
                if (i11 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                cv cvVar4 = new cv(this, context, i12, z15);
                cvVar4.setContentDescription(f(i11));
                this.f33010b.addView(cvVar4);
            }
            o();
            return;
        }
        if (z12) {
            LinearLayout linearLayout4 = this.f33010b;
            ev evVar = new ev(this, context);
            this.H = evVar;
            linearLayout4.addView(evVar);
            evVar.h = 3552126;
        }
        this.J = this.f33010b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f33010b;
            cv cvVar5 = new cv(this, context, 2131232743, true);
            this.G = cvVar5;
            linearLayout5.addView(cvVar5);
            cvVar5.setContentDescription(org.telegram.messenger.hd.M0(2131745495, null));
            cvVar5.f33693a = Long.valueOf(1434631203);
            cvVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.hd.M0(2131751195, null);
            case 1:
                return org.telegram.messenger.hd.M0(2131751194, null);
            case 2:
                return org.telegram.messenger.hd.M0(2131751193, null);
            case 3:
                return org.telegram.messenger.hd.M0(2131751192, null);
            case 4:
                return org.telegram.messenger.hd.M0(2131751191, null);
            case 5:
                return org.telegram.messenger.hd.M0(2131751190, null);
            case 6:
                return org.telegram.messenger.hd.M0(2131751189, null);
            case 7:
                return org.telegram.messenger.hd.M0(2131751188, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(zw zwVar) {
        return zwVar.f42434f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.j6.o0(this.f35071w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        if (z10 && !this.f35066d0) {
            z11 = true;
        } else {
            z11 = false;
        }
        cv cvVar = this.f35073y;
        if (cvVar != null) {
            i7++;
        }
        if (!this.f35063a0 || cvVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.N;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f33010b.getChildCount()) {
            View childAt = this.f33010b.getChildAt(i12);
            if (childAt instanceof ev) {
                ev evVar = (ev) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < evVar.f33010b.getChildCount()) {
                    View childAt2 = evVar.f33010b.getChildAt(i14);
                    if (childAt2 instanceof cv) {
                        cv cvVar2 = (cv) childAt2;
                        if (i7 == i15) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cvVar2.g(z14, z11);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof cv) {
                    cv cvVar3 = (cv) childAt;
                    if (i7 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cvVar3.g(z13, z11);
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
        ev evVar2 = this.H;
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
                ofFloat.addUpdateListener(new hi.i9(this, f10, f11, 1));
                this.K.setDuration(350L);
                this.K.setInterpolator(er.h);
                this.K.start();
            } else {
                this.M = 1.0f;
                this.L = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f33010b.invalidate();
            }
            if (evVar2 != null) {
                if (this.N != 1 && !this.f35068n) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12 != evVar2.f34439n) {
                    evVar2.f34439n = z12;
                    if (!z12) {
                        evVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = evVar2.f33011c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z11) {
                        float f13 = evVar2.f34440r;
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        evVar2.f33011c = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(evVar2, 20));
                        evVar2.f33011c.setDuration(475L);
                        evVar2.f33011c.setInterpolator(er.h);
                        evVar2.f33011c.start();
                    } else {
                        if (!z12) {
                            f12 = 0.0f;
                        }
                        evVar2.f34440r = f12;
                        evVar2.invalidate();
                        evVar2.requestLayout();
                        evVar2.c();
                        evVar2.f34441s.f33010b.invalidate();
                    }
                }
            }
            View childAt3 = this.f33010b.getChildAt(this.N);
            if (this.N >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.O != i7) {
            if (evVar2 != null && this.N == 1 && i7 >= 1 && i7 <= evVar2.f33010b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                evVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.O = i7;
        }
    }

    public final int k() {
        boolean z10 = this.Q;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35071w;
        if (z10) {
            return i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, e6Var), (int) 12.75f);
        }
        int i7 = this.U;
        if (i7 != 5 && i7 != 7) {
            return org.telegram.ui.ActionBar.j6.r1(0.18f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, e6Var));
        }
        return org.telegram.ui.ActionBar.j6.r1(0.09f, this.R);
    }

    public final void l(boolean z10) {
        int i7;
        cv cvVar = this.F;
        if (cvVar != null) {
            boolean z11 = this.f35064b0;
            if (z11 || this.f35065c0 != z10) {
                this.f35065c0 = z10;
                float f10 = 0.0f;
                if (z11) {
                    if (z10) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    cvVar.setVisibility(i7);
                    if (z10) {
                        f10 = 1.0f;
                    }
                    cvVar.setAlpha(f10);
                } else {
                    cvVar.setVisibility(0);
                    ViewPropertyAnimator animate = cvVar.animate();
                    if (z10) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(er.h).withEndAction(new ai.q(24, this, z10)).start();
                }
                this.f33010b.requestLayout();
                this.f35064b0 = false;
            }
        }
    }

    public final void m(boolean z10) {
        cv cvVar = this.E;
        if (cvVar == null) {
            return;
        }
        if (z10) {
            cvVar.setBackground(new fv(k()));
        } else {
            cvVar.setBackground(null);
        }
    }

    public final void n(boolean z10) {
        this.f35069r = z10;
        this.f33010b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f33010b.getChildCount()) {
            View childAt = this.f33010b.getChildAt(i7);
            if (childAt instanceof ev) {
                ev evVar = (ev) childAt;
                int i11 = 0;
                while (i11 < evVar.f33010b.getChildCount()) {
                    evVar.f33010b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final gv f41766b;

                        {
                            this.f41766b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f41766b.h(i10);
                                    return;
                                default:
                                    this.f41766b.h(i10);
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
                    public final gv f41766b;

                    {
                        this.f41766b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f41766b.h(i10);
                                return;
                            default:
                                this.f41766b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        cv cvVar = this.G;
        if (cvVar != null) {
            cvVar.setOnClickListener(new e0(this, 13));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f33010b.setPadding(org.telegram.messenger.g0.L(this.f35067e0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gv.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.T = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f35067e0 = f10;
    }

    public void i(cv cvVar) {
    }

    public void e() {
    }
}
