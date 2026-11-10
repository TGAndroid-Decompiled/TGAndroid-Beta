package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashMap;
public abstract class av extends vk0 {
    public static final int[] f32007e0 = {2131232126, 2131232118, 2131232120, 2131232117, 2131232128, 2131232122, 2131232123, 2131232119};
    public static final int[] f32008f0 = {2131624098, 2131624093, 2131624095, 2131624092, 2131624099, 2131624096, 2131624097, 2131624094};
    public final wu D;
    public final wu E;
    public final wu F;
    public final yu G;
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
    public boolean f32009a0;
    public boolean f32010b0;
    public boolean f32011c0;
    public float f32012d0;
    public final int h;
    public final boolean f32013n;
    public boolean f32014r;
    public v5 f32015s;
    public final org.telegram.ui.ActionBar.h6 f32016w;
    public final boolean f32017x;
    public final wu f32018y;

    public av(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10, boolean z11, boolean z12, int i7, Runnable runnable, int i10, boolean z13) {
        super(context);
        boolean z14;
        this.h = 2131232125;
        this.f32013n = !org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q();
        this.f32014r = true;
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
        this.f32009a0 = true;
        this.f32010b0 = false;
        this.f32011c0 = true;
        this.f32012d0 = 11.0f;
        this.f32017x = z12;
        this.f32016w = h6Var;
        this.R = runnable;
        this.T = i7;
        this.Q = i10;
        this.P = z13;
        su suVar = new su(this, context, z12, z13);
        this.f39048b = suVar;
        suVar.setClipToPadding(false);
        this.f39048b.setOrientation(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        addView(this.f39048b);
        if (i7 == 4) {
            LinearLayout linearLayout = this.f39048b;
            wu wuVar = new wu(this, context, 2131232127, false);
            this.f32018y = wuVar;
            linearLayout.addView(wuVar);
            wuVar.setContentDescription(org.telegram.messenger.id.M0(2131754756, null));
        }
        if (i7 == 3) {
            this.h = 2131232126;
        }
        if (i7 == 6) {
            this.h = 2131231063;
        }
        if (z9) {
            LinearLayout linearLayout2 = this.f39048b;
            wu wuVar2 = new wu(this, context, this.h, false);
            this.D = wuVar2;
            linearLayout2.addView(wuVar2);
            wuVar2.setContentDescription(org.telegram.messenger.id.M0(2131746361, null));
            wuVar2.f40087a = Long.valueOf(-934918565);
        }
        if (z10) {
            LinearLayout linearLayout3 = this.f39048b;
            wu wuVar3 = new wu(this, context, 2131232121, false);
            this.E = wuVar3;
            linearLayout3.addView(wuVar3);
            wuVar3.setContentDescription(org.telegram.messenger.id.M0(2131751175, null));
            wuVar3.setAlpha(0.0f);
            wuVar3.f40087a = Long.valueOf(98352451);
        }
        if (!z12) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = f32007e0[i11];
                if (i11 == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                wu wuVar4 = new wu(this, context, i12, z14);
                wuVar4.setContentDescription(f(i11));
                this.f39048b.addView(wuVar4);
            }
            o();
            return;
        }
        if (z11) {
            LinearLayout linearLayout4 = this.f39048b;
            yu yuVar = new yu(this, context);
            this.G = yuVar;
            linearLayout4.addView(yuVar);
            yuVar.h = 3552126;
        }
        this.I = this.f39048b.getChildCount();
        if (runnable != null) {
            LinearLayout linearLayout5 = this.f39048b;
            wu wuVar5 = new wu(this, context, 2131232742, true);
            this.F = wuVar5;
            linearLayout5.addView(wuVar5);
            wuVar5.setContentDescription(org.telegram.messenger.id.M0(2131745495, null));
            wuVar5.f40087a = Long.valueOf(1434631203);
            wuVar5.setAlpha(0.0f);
        }
        o();
    }

    public static String f(int i7) {
        switch (i7) {
            case 0:
                return org.telegram.messenger.id.M0(2131751195, null);
            case 1:
                return org.telegram.messenger.id.M0(2131751194, null);
            case 2:
                return org.telegram.messenger.id.M0(2131751193, null);
            case 3:
                return org.telegram.messenger.id.M0(2131751192, null);
            case 4:
                return org.telegram.messenger.id.M0(2131751191, null);
            case 5:
                return org.telegram.messenger.id.M0(2131751190, null);
            case 6:
                return org.telegram.messenger.id.M0(2131751189, null);
            case 7:
                return org.telegram.messenger.id.M0(2131751188, null);
            default:
                return null;
        }
    }

    public boolean d() {
        return false;
    }

    public boolean g(tw twVar) {
        return twVar.f38407f;
    }

    public ColorFilter getEmojiColorFilter() {
        return org.telegram.ui.ActionBar.m6.o0(this.f32016w);
    }

    public abstract boolean h(int i7);

    public final void j(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        if (z9 && !this.f32011c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wu wuVar = this.f32018y;
        if (wuVar != null) {
            i7++;
        }
        if (!this.W || wuVar != null) {
            i7 = Math.max(1, i7);
        }
        int i11 = this.M;
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f39048b.getChildCount()) {
            View childAt = this.f39048b.getChildAt(i12);
            if (childAt instanceof yu) {
                yu yuVar = (yu) childAt;
                int i14 = 0;
                int i15 = i13;
                while (i14 < yuVar.f39048b.getChildCount()) {
                    View childAt2 = yuVar.f39048b.getChildAt(i14);
                    if (childAt2 instanceof wu) {
                        wu wuVar2 = (wu) childAt2;
                        if (i7 == i15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wuVar2.g(z13, z10);
                    }
                    i14++;
                    i15++;
                }
                i10 = i15 - 1;
            } else {
                if (childAt instanceof wu) {
                    wu wuVar3 = (wu) childAt;
                    if (i7 == i13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    wuVar3.g(z12, z10);
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
        yu yuVar2 = this.G;
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
                ofFloat.addUpdateListener(new fi.k9(this, f10, f11, 1));
                this.J.setDuration(350L);
                this.J.setInterpolator(wq.h);
                this.J.start();
            } else {
                this.L = 1.0f;
                this.K = org.telegram.messenger.g0.T1(f10, f11, 1.0f);
                this.f39048b.invalidate();
            }
            if (yuVar2 != null) {
                if (this.M != 1 && !this.f32013n) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 != yuVar2.f40730n) {
                    yuVar2.f40730n = z11;
                    if (!z11) {
                        yuVar2.a(0);
                    }
                    ValueAnimator valueAnimator2 = yuVar2.f39049c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    if (z10) {
                        float f13 = yuVar2.f40731r;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
                        yuVar2.f39049c = ofFloat2;
                        ofFloat2.addUpdateListener(new d6(yuVar2, 20));
                        yuVar2.f39049c.setDuration(475L);
                        yuVar2.f39049c.setInterpolator(wq.h);
                        yuVar2.f39049c.start();
                    } else {
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        yuVar2.f40731r = f12;
                        yuVar2.invalidate();
                        yuVar2.requestLayout();
                        yuVar2.c();
                        yuVar2.f40732s.f39048b.invalidate();
                    }
                }
            }
            View childAt3 = this.f39048b.getChildAt(this.M);
            if (this.M >= 2) {
                b(childAt3.getLeft(), childAt3.getRight());
            } else {
                a(0);
            }
        }
        if (this.N != i7) {
            if (yuVar2 != null && this.M == 1 && i7 >= 1 && i7 <= yuVar2.f39048b.getChildCount() + 1) {
                int i17 = (i7 - 1) * 36;
                yuVar2.b(org.telegram.messenger.g0.L(i17 - 6), org.telegram.messenger.g0.L(i17 + 24));
            }
            this.N = i7;
        }
    }

    public final int k() {
        boolean z9 = this.P;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32016w;
        if (z9) {
            return i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 12.75f);
        }
        int i7 = this.T;
        if (i7 != 5 && i7 != 7) {
            return org.telegram.ui.ActionBar.m6.r1(0.18f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
        }
        return org.telegram.ui.ActionBar.m6.r1(0.09f, this.Q);
    }

    public final void l(boolean z9) {
        int i7;
        wu wuVar = this.E;
        if (wuVar != null) {
            boolean z10 = this.f32009a0;
            if (z10 || this.f32010b0 != z9) {
                this.f32010b0 = z9;
                float f10 = 0.0f;
                if (z10) {
                    if (z9) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    wuVar.setVisibility(i7);
                    if (z9) {
                        f10 = 1.0f;
                    }
                    wuVar.setAlpha(f10);
                } else {
                    wuVar.setVisibility(0);
                    ViewPropertyAnimator animate = wuVar.animate();
                    if (z9) {
                        f10 = 1.0f;
                    }
                    animate.alpha(f10).setDuration(200L).setInterpolator(wq.h).withEndAction(new bi.k1(23, this, z9)).start();
                }
                this.f39048b.requestLayout();
                this.f32009a0 = false;
            }
        }
    }

    public final void m(boolean z9) {
        wu wuVar = this.D;
        if (wuVar == null) {
            return;
        }
        if (z9) {
            wuVar.setBackground(new zu(k()));
        } else {
            wuVar.setBackground(null);
        }
    }

    public final void n(boolean z9) {
        this.f32014r = z9;
        this.f39048b.invalidate();
    }

    public final void o() {
        int i7 = 0;
        final int i10 = 0;
        while (i7 < this.f39048b.getChildCount()) {
            View childAt = this.f39048b.getChildAt(i7);
            if (childAt instanceof yu) {
                yu yuVar = (yu) childAt;
                int i11 = 0;
                while (i11 < yuVar.f39048b.getChildCount()) {
                    yuVar.f39048b.getChildAt(i11).setOnClickListener(new View.OnClickListener(this) {
                        public final av f37737b;

                        {
                            this.f37737b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    this.f37737b.h(i10);
                                    return;
                                default:
                                    this.f37737b.h(i10);
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
                    public final av f37737b;

                    {
                        this.f37737b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                this.f37737b.h(i10);
                                return;
                            default:
                                this.f37737b.h(i10);
                                return;
                        }
                    }
                });
            }
            i7++;
            i10++;
        }
        wu wuVar = this.F;
        if (wuVar != null) {
            wuVar.setOnClickListener(new g0(this, 12));
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f39048b.setPadding(org.telegram.messenger.g0.L(this.f32012d0), 0, org.telegram.messenger.g0.L(11.0f), 0);
        super.onMeasure(i7, i10);
    }

    public final void p(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av.p(java.util.ArrayList):void");
    }

    public void setAnimatedEmojiCacheType(int i7) {
        this.S = i7;
    }

    public void setPaddingLeft(float f10) {
        this.f32012d0 = f10;
    }

    public void i(wu wuVar) {
    }

    public void e() {
    }
}
