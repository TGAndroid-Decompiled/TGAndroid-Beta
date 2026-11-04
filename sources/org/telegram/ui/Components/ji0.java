package org.telegram.ui.Components;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ji0 extends FrameLayout {
    public int E;
    public boolean F;
    public ci.lc G;
    public final gi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final gi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final li0 Q;
    public final ii0 f35077a;
    public final ii0 f35078b;
    public final ii0 f35079c;
    public final ImageReceiver d;
    public dh.n0 f35080e;
    public vg.y0 f35081f;
    public float h;
    public boolean f35082n;
    public boolean f35083r;
    public boolean f35084s;
    public boolean f35085w;
    public boolean f35086x;
    public boolean f35087y;

    public ji0(li0 li0Var, Context context) {
        super(context);
        this.Q = li0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f35087y = true;
        this.H = new gi0(this, 0);
        this.J = 1.0f;
        this.L = new gi0(this, 1);
        this.P = true;
        ii0 ii0Var = new ii0(this, context, 0);
        this.f35077a = ii0Var;
        ii0 ii0Var2 = new ii0(this, context, 1);
        this.f35078b = ii0Var2;
        ii0Var.getImageReceiver().W(0);
        ii0Var.getImageReceiver().f21274v0 = false;
        ii0 ii0Var3 = new ii0(this, context, 2);
        this.f35079c = ii0Var3;
        addView(ii0Var, b8.mf.e(34, 34, 17));
        addView(ii0Var3, b8.mf.e(34, 34, 17));
        addView(ii0Var2, b8.mf.e(34, 34, 17));
        if (li0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ii0Var.setLayerNum(Integer.MAX_VALUE);
        ii0Var2.setLayerNum(Integer.MAX_VALUE);
        ii0Var2.f35342a.W(0);
        ImageReceiver imageReceiver = ii0Var2.f35342a;
        imageReceiver.f21272u0 = false;
        imageReceiver.f21274v0 = false;
        ii0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ji0 ji0Var, dh.n0 n0Var, int i3) {
        boolean z10;
        boolean z11;
        int i10;
        ii0 ii0Var = ji0Var.f35079c;
        ii0 ii0Var2 = ji0Var.f35077a;
        ii0 ii0Var3 = ji0Var.f35078b;
        li0 li0Var = ji0Var.Q;
        ji0Var.f(n0Var, false);
        dh.n0 n0Var2 = ji0Var.f35080e;
        if (n0Var2 != null && n0Var2.equals(n0Var)) {
            ji0Var.E = i3;
            ji0Var.e(n0Var);
            return;
        }
        int i11 = li0Var.K;
        org.telegram.ui.ActionBar.e6 e6Var = li0Var.f35759l0;
        int i12 = li0Var.N0;
        boolean q10 = org.telegram.messenger.h10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && n0Var.d && !q10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ji0Var.I = z10;
        if (z10 && ji0Var.f35081f == null) {
            vg.y0 y0Var = new vg.y0(1, ji0Var.getContext(), null);
            ji0Var.f35081f = y0Var;
            y0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ji0Var.f35081f.setImageReceiver(ii0Var3.getImageReceiver());
            ji0Var.addView(ji0Var.f35081f, b8.mf.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        vg.y0 y0Var2 = ji0Var.f35081f;
        if (y0Var2 != null) {
            if (ji0Var.I) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y0Var2.setVisibility(i10);
        }
        ji0Var.d();
        ji0Var.f35080e = n0Var;
        if (!n0Var.f9093a && (n0Var.f9097f == null || ((!li0Var.q() && !li0Var.H0) || !org.telegram.messenger.lc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ji0Var.f35083r = z11;
        if (i12 == 4 || ji0Var.f35080e.f9094b) {
            ji0Var.f35083r = false;
        }
        dh.n0 n0Var3 = ji0Var.f35080e;
        if (!n0Var3.f9093a && n0Var3.f9097f == null) {
            ii0Var.getImageReceiver().f();
            ii0Var3.getImageReceiver().f();
            g5 g5Var = new g5(4, li0Var.K, ji0Var.f35080e.f9098g);
            g5 g5Var2 = new g5(3, li0Var.K, ji0Var.f35080e.f9098g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.k6.f28214v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.r6.y(ji0Var, g5Var, i13, e6Var, mode);
                org.telegram.ui.ActionBar.r6.y(ji0Var, g5Var2, i13, e6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                g5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                g5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ii0Var.setAnimatedEmojiDrawable(g5Var);
            ii0Var3.setAnimatedEmojiDrawable(g5Var2);
            vg.y0 y0Var3 = ji0Var.f35081f;
            if (y0Var3 != null) {
                y0Var3.setAnimatedEmojiDrawable(g5Var2);
            }
        } else {
            ji0Var.e(n0Var);
            ii0Var.setAnimatedEmojiDrawable(null);
            if (ii0Var2.getImageReceiver().B() != null) {
                ii0Var2.getImageReceiver().B().N(0, false, false);
            }
            vg.y0 y0Var4 = ji0Var.f35081f;
            if (y0Var4 != null) {
                y0Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ji0Var.setFocusable(true);
        boolean z12 = ji0Var.f35083r;
        ji0Var.f35084s = z12;
        if (!z12) {
            ii0Var2.setVisibility(8);
            ii0Var3.setVisibility(0);
            ji0Var.f35085w = true;
        } else {
            ji0Var.f35085w = false;
            ii0Var2.setVisibility(0);
            ii0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ii0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ii0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ii0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ii0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ii0 ii0Var = this.f35078b;
        g5 g5Var = ii0Var.f35345e;
        if (g5Var != null) {
            imageReceiver = g5Var.f33971k;
        } else {
            imageReceiver = ii0Var.f35342a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            li0 li0Var = this.Q;
            if (li0Var.f35778y0 == null && !this.O && li0Var.H0) {
                if (imageReceiver.B().f32721b0 <= 2) {
                    imageReceiver.B().stop();
                    return;
                }
                return;
            }
            imageReceiver.B().start();
        }
    }

    public final void c(int i3) {
        float f10;
        float f11;
        float f12 = 0.76f;
        if (!this.Q.f35758k0) {
            d();
            this.f35082n = true;
            if (!this.f35083r) {
                this.f35078b.setVisibility(0);
                ii0 ii0Var = this.f35078b;
                float f13 = this.J;
                if (this.f35086x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ii0Var.setScaleY(f13 * f11);
                ii0 ii0Var2 = this.f35078b;
                float f14 = this.J;
                if (!this.f35086x) {
                    f12 = 1.0f;
                }
                ii0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.H);
        if (this.f35083r) {
            if (this.f35077a.getImageReceiver().B() != null && !this.f35077a.getImageReceiver().B().y() && !this.f35082n) {
                this.f35082n = true;
                if (i3 == 0) {
                    this.F = false;
                    this.f35077a.getImageReceiver().B().stop();
                    this.f35077a.getImageReceiver().B().N(0, false, false);
                    this.H.run();
                    return;
                }
                this.F = true;
                this.f35077a.getImageReceiver().B().stop();
                this.f35077a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.i3(this.H, i3);
                return;
            }
            if (this.f35077a.getImageReceiver().B() != null && this.f35082n && !this.f35077a.getImageReceiver().B().f32734l0 && !this.f35077a.getImageReceiver().B().y()) {
                this.f35077a.getImageReceiver().B().N(this.f35077a.getImageReceiver().B().f32725e[0] - 1, false, false);
            }
            ii0 ii0Var3 = this.f35078b;
            float f15 = this.J;
            if (this.f35086x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ii0Var3.setScaleY(f15 * f10);
            ii0 ii0Var4 = this.f35078b;
            float f16 = this.J;
            if (!this.f35086x) {
                f12 = 1.0f;
            }
            ii0Var4.setScaleX(f16 * f12);
        } else if (!this.f35082n) {
            this.J = 0.0f;
            this.f35078b.setScaleX(0.0f);
            this.f35078b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new y50(this, 9));
            this.K.setDuration(150L);
            this.K.setInterpolator(xq.h);
            this.K.setStartDelay(i3 * this.Q.f35739c);
            this.K.start();
            this.f35082n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z10 = this.f35083r;
        li0 li0Var = this.Q;
        float f12 = 1.0f;
        ii0 ii0Var = this.f35078b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ii0 ii0Var2 = this.f35077a;
            if (ii0Var2.getImageReceiver().B() != null && !ii0Var2.getImageReceiver().B().y()) {
                ii0Var2.getImageReceiver().B().stop();
                if (li0Var.f35758k0) {
                    ii0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ii0Var2.getImageReceiver().B().N(ii0Var2.getImageReceiver().B().f32725e[0] - 1, false, true);
                }
            }
            ii0Var.setVisibility(4);
            ii0Var2.setVisibility(0);
            this.f35085w = false;
            float f13 = this.J;
            if (this.f35086x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            ii0Var.setScaleY(f13 * f11);
            float f14 = this.J;
            if (this.f35086x) {
                f12 = 0.76f;
            }
            ii0Var.setScaleX(f14 * f12);
        } else {
            ii0Var.animate().cancel();
            if (li0Var.O0) {
                float f15 = this.J;
                if (this.f35086x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ii0Var.setScaleY(f15 * f10);
                float f16 = this.J;
                if (this.f35086x) {
                    f12 = 0.76f;
                }
                ii0Var.setScaleX(f16 * f12);
            } else {
                ii0Var.setScaleY(0.0f);
                ii0Var.setScaleX(0.0f);
            }
        }
        this.f35082n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i3;
        ei.c3 c3Var;
        Paint paint;
        if (this.f35086x && this.f35087y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            dh.n0 n0Var = this.f35080e;
            li0 li0Var = this.Q;
            if (n0Var != null && n0Var.f9093a) {
                paint = li0Var.J0;
            } else {
                paint = li0Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        g5 g5Var = this.f35078b.f35345e;
        if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
            int i10 = 0;
            if (this.E == 0) {
                c3Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f35086x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                c3Var.J0(i10);
            }
        }
        dh.n0 n0Var2 = this.f35080e;
        if (n0Var2 != null && n0Var2.f9093a && this.G != null && org.telegram.messenger.lc.e(8200) && org.telegram.messenger.lc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ch0 B = this.f35077a.getImageReceiver().B();
            ci.lc lcVar = this.G;
            if (B != null && (i3 = B.f32721b0) > 30) {
                f10 = Utilities.l((i3 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            lcVar.f5520j = (int) (lcVar.f5514b.size() * f10);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(dh.n0 n0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ii0 ii0Var;
        org.telegram.messenger.jz jzVar;
        org.telegram.messenger.jz jzVar2;
        org.telegram.messenger.jz jzVar3;
        ?? r14;
        org.telegram.messenger.jz jzVar4;
        TLRPC.Document document;
        org.telegram.messenger.jz jzVar5;
        int i3;
        li0 li0Var = this.Q;
        int i10 = li0Var.N0;
        ii0 ii0Var2 = this.f35077a;
        ii0 ii0Var3 = this.f35078b;
        if (n0Var != null && n0Var.f9093a) {
            ii0Var2.getImageReceiver().w0(new ch0(2131624217, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ii0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232749));
            if (this.G == null) {
                if (org.telegram.messenger.az.o() == 2) {
                    i3 = 45;
                } else {
                    i3 = 18;
                }
                this.G = new ci.lc(1, i3);
            }
        } else if (i10 == 4 && n0Var != null && n0Var.f9097f != null) {
            ii0Var2.getImageReceiver().w0(org.telegram.messenger.i6.g(n0Var.f9097f));
            ii0Var3.getImageReceiver().w0(org.telegram.messenger.i6.g(n0Var.f9097f));
        } else {
            dh.n0 n0Var2 = this.f35080e;
            if (n0Var2.f9094b) {
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(li0Var.K);
                long j10 = this.f35080e.f9098g;
                if (s12.f23026h8 != null) {
                    for (int i11 = 0; i11 < s12.f23026h8.documents.size(); i11++) {
                        if (s12.f23026h8.documents.get(i11).f27007id == j10) {
                            document = s12.f23026h8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null);
                ImageReceiver imageReceiver = ii0Var3.getImageReceiver();
                org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document);
                if (this.f35083r) {
                    jzVar5 = null;
                } else {
                    jzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, jzVar5, 0L, "tgs", this.f35080e, 0);
            } else if (n0Var2.f9097f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(li0Var.K).f24045r.get(this.f35080e.f9097f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.jz f11 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null);
                    if (!org.telegram.messenger.lc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        ii0Var = ii0Var2;
                        boolean z10 = false;
                        jzVar = f11;
                        if (org.telegram.messenger.az.o() > 0 && i10 != 4) {
                            ii0Var.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, jzVar, 0L, "tgs", n0Var, 0);
                            ImageReceiver imageReceiver2 = ii0Var3.getImageReceiver();
                            org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_availableReaction.select_animation);
                            if (this.f35083r) {
                                jzVar3 = null;
                            } else {
                                jzVar3 = jzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, jzVar3, 0L, "tgs", this.f35080e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = ii0Var3.getImageReceiver();
                            org.telegram.messenger.ac b12 = org.telegram.messenger.ac.b(tL_availableReaction.select_animation);
                            if (this.f35083r) {
                                jzVar2 = null;
                            } else {
                                jzVar2 = jzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, jzVar2, 0L, "tgs", this.f35080e, 0);
                            r14 = z10;
                        }
                    } else {
                        jzVar = f11;
                        ii0Var = ii0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        ii0Var2.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, jzVar, 0L, "tgs", n0Var, 0);
                        ImageReceiver imageReceiver4 = ii0Var3.getImageReceiver();
                        org.telegram.messenger.ac b13 = org.telegram.messenger.ac.b(tL_availableReaction.select_animation);
                        if (this.f35083r) {
                            jzVar4 = null;
                        } else {
                            jzVar4 = jzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, jzVar4, 0L, "tgs", this.f35080e, 0);
                    }
                    if (ii0Var.getImageReceiver().B() != null) {
                        ii0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f35079c.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, jzVar, 0L, "tgs", n0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f21274v0 = r14;
                    org.telegram.messenger.li.b0(li0Var.K);
                    org.telegram.messenger.li.m1(imageReceiver5, org.telegram.messenger.ac.b(tL_availableReaction.around_animation), dh.j0.a());
                }
                vg.y0 y0Var = this.f35081f;
                if (y0Var != null) {
                    y0Var.setImageReceiver(ii0Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(dh.n0 n0Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z11 = this.f35086x;
        boolean contains = this.Q.f35745e0.contains(n0Var);
        this.f35086x = contains;
        if (contains != z11) {
            ii0 ii0Var = this.f35077a;
            ii0 ii0Var2 = this.f35078b;
            float f16 = 1.0f;
            if (!z10) {
                float f17 = this.J;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ii0Var2.setScaleX(f17 * f13);
                float f18 = this.J;
                if (this.f35086x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ii0Var2.setScaleY(f18 * f14);
                float f19 = this.J;
                if (this.f35086x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                ii0Var.setScaleX(f19 * f15);
                float f20 = this.J;
                if (this.f35086x) {
                    f16 = 0.76f;
                }
                ii0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = ii0Var2.animate();
                float f21 = this.J;
                if (this.f35086x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.J;
                if (this.f35086x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate2 = ii0Var.animate();
                float f23 = this.J;
                if (this.f35086x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.J;
                if (this.f35086x) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(xqVar).start();
            }
            requestLayout();
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dh.n0 n0Var = this.f35080e;
        if (n0Var != null) {
            String str = n0Var.f9097f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i3;
        ki0 ki0Var;
        if (this.P) {
            li0 li0Var = this.Q;
            if (li0Var.R == null) {
                int action = motionEvent.getAction();
                gi0 gi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i3 = li0Var.N0) != 3 && i3 != 4 && i3 != 5 && ((ki0Var = li0Var.f35752h0) == null || ki0Var.r())) {
                        org.telegram.messenger.g0.i3(gi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((li0Var.m0 == null || li0Var.f35763o0 > 0.8f) && li0Var.f35752h0 != null)) {
                    li0Var.f35769s0 = true;
                    if (System.currentTimeMillis() - li0Var.f35770t0 > 300) {
                        li0Var.f35770t0 = System.currentTimeMillis();
                        ki0 ki0Var2 = li0Var.f35752h0;
                        dh.n0 n0Var = this.f35080e;
                        if (li0Var.f35763o0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ki0Var2.z(this, n0Var, z10, false);
                    }
                }
                if (!li0Var.f35769s0 && li0Var.m0 != null) {
                    li0Var.f35764p0 = 0.0f;
                    float f10 = li0Var.f35763o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    li0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new zh0(li0Var, f10));
                    li0Var.R.addListener(new yh0(li0Var, 1));
                    li0Var.R.setDuration(150L);
                    li0Var.R.setInterpolator(xq.f40452f);
                    li0Var.R.start();
                }
                org.telegram.messenger.g0.r(gi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
