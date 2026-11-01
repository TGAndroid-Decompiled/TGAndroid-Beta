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
public final class lj0 extends FrameLayout {
    public int D;
    public boolean E;
    public rh.s8 F;
    public final ij0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ij0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final nj0 P;
    public final kj0 f28182a;
    public final kj0 f28183b;
    public final kj0 f28184c;
    public final ImageReceiver d;
    public sg.o0 e;
    public kg.l1 f28185f;
    public float h;
    public boolean f28186n;
    public boolean f28187r;
    public boolean f28188s;
    public boolean f28189w;
    public boolean f28190x;
    public boolean f28191y;

    public lj0(nj0 nj0Var, Context context) {
        super(context);
        this.P = nj0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f28191y = true;
        this.G = new ij0(this, 0);
        this.I = 1.0f;
        this.K = new ij0(this, 1);
        this.O = true;
        kj0 kj0Var = new kj0(this, context, 0);
        this.f28182a = kj0Var;
        kj0 kj0Var2 = new kj0(this, context, 1);
        this.f28183b = kj0Var2;
        kj0Var.getImageReceiver().W(0);
        kj0Var.getImageReceiver().f14411u0 = false;
        kj0 kj0Var3 = new kj0(this, context, 2);
        this.f28184c = kj0Var3;
        addView(kj0Var, w7.b6.e(34, 34, 17));
        addView(kj0Var3, w7.b6.e(34, 34, 17));
        addView(kj0Var2, w7.b6.e(34, 34, 17));
        if (nj0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        kj0Var.setLayerNum(Integer.MAX_VALUE);
        kj0Var2.setLayerNum(Integer.MAX_VALUE);
        kj0Var2.f26357a.W(0);
        ImageReceiver imageReceiver = kj0Var2.f26357a;
        imageReceiver.f14409t0 = false;
        imageReceiver.f14411u0 = false;
        kj0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(lj0 lj0Var, sg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        kj0 kj0Var = lj0Var.f28184c;
        kj0 kj0Var2 = lj0Var.f28182a;
        kj0 kj0Var3 = lj0Var.f28183b;
        nj0 nj0Var = lj0Var.P;
        lj0Var.f(o0Var, false);
        sg.o0 o0Var2 = lj0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            lj0Var.D = i10;
            lj0Var.e(o0Var);
            return;
        }
        int i12 = nj0Var.J;
        org.telegram.ui.ActionBar.p6 p6Var = nj0Var.f28882k0;
        int i13 = nj0Var.M0;
        boolean q6 = org.telegram.messenger.e20.i(i12).q();
        if ((i13 == 3 && !q6) || (i13 == 5 && o0Var.d && !q6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        lj0Var.H = z10;
        if (z10 && lj0Var.f28185f == null) {
            kg.l1 l1Var = new kg.l1(1, lj0Var.getContext(), null);
            lj0Var.f28185f = l1Var;
            l1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            lj0Var.f28185f.setImageReceiver(kj0Var3.getImageReceiver());
            lj0Var.addView(lj0Var.f28185f, w7.b6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        kg.l1 l1Var2 = lj0Var.f28185f;
        if (l1Var2 != null) {
            if (lj0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l1Var2.setVisibility(i11);
        }
        lj0Var.d();
        lj0Var.e = o0Var;
        if (!o0Var.f48442a && (o0Var.f48445f == null || ((!nj0Var.q() && !nj0Var.G0) || !org.telegram.messenger.tc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        lj0Var.f28187r = z11;
        if (i13 == 4 || lj0Var.e.f48443b) {
            lj0Var.f28187r = false;
        }
        sg.o0 o0Var3 = lj0Var.e;
        if (!o0Var3.f48442a && o0Var3.f48445f == null) {
            kj0Var.getImageReceiver().f();
            kj0Var3.getImageReceiver().f();
            f5 f5Var = new f5(4, nj0Var.J, lj0Var.e.f48446g);
            f5 f5Var2 = new f5(3, nj0Var.J, lj0Var.e.f48446g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.t6.f21260v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.a7.y(lj0Var, f5Var, i14, p6Var, mode);
                org.telegram.ui.ActionBar.a7.y(lj0Var, f5Var2, i14, p6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                f5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                f5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            kj0Var.setAnimatedEmojiDrawable(f5Var);
            kj0Var3.setAnimatedEmojiDrawable(f5Var2);
            kg.l1 l1Var3 = lj0Var.f28185f;
            if (l1Var3 != null) {
                l1Var3.setAnimatedEmojiDrawable(f5Var2);
            }
        } else {
            lj0Var.e(o0Var);
            kj0Var.setAnimatedEmojiDrawable(null);
            if (kj0Var2.getImageReceiver().B() != null) {
                kj0Var2.getImageReceiver().B().N(0, false, false);
            }
            kg.l1 l1Var4 = lj0Var.f28185f;
            if (l1Var4 != null) {
                l1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        lj0Var.setFocusable(true);
        boolean z12 = lj0Var.f28187r;
        lj0Var.f28188s = z12;
        if (!z12) {
            kj0Var2.setVisibility(8);
            kj0Var3.setVisibility(0);
            lj0Var.f28189w = true;
        } else {
            lj0Var.f28189w = false;
            kj0Var2.setVisibility(0);
            kj0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = kj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = kj0Var3.getLayoutParams();
        int L = org.telegram.messenger.i0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = kj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = kj0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        kj0 kj0Var = this.f28183b;
        f5 f5Var = kj0Var.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f26070k;
        } else {
            imageReceiver = kj0Var.f26357a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            nj0 nj0Var = this.P;
            if (nj0Var.f28900x0 == null && !this.N && nj0Var.G0) {
                if (imageReceiver.B().f25131a0 <= 2) {
                    imageReceiver.B().stop();
                    return;
                }
                return;
            }
            imageReceiver.B().start();
        }
    }

    public final void c(int i10) {
        float f7;
        float f10;
        float f11 = 0.76f;
        if (!this.P.f28880j0) {
            d();
            this.f28186n = true;
            if (!this.f28187r) {
                this.f28183b.setVisibility(0);
                kj0 kj0Var = this.f28183b;
                float f12 = this.I;
                if (this.f28190x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                kj0Var.setScaleY(f12 * f10);
                kj0 kj0Var2 = this.f28183b;
                float f13 = this.I;
                if (!this.f28190x) {
                    f11 = 1.0f;
                }
                kj0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        org.telegram.messenger.i0.r(this.G);
        if (this.f28187r) {
            if (this.f28182a.getImageReceiver().B() != null && !this.f28182a.getImageReceiver().B().y() && !this.f28186n) {
                this.f28186n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f28182a.getImageReceiver().B().stop();
                    this.f28182a.getImageReceiver().B().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f28182a.getImageReceiver().B().stop();
                this.f28182a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.i0.h3(this.G, i10);
                return;
            }
            if (this.f28182a.getImageReceiver().B() != null && this.f28186n && !this.f28182a.getImageReceiver().B().f25144k0 && !this.f28182a.getImageReceiver().B().y()) {
                this.f28182a.getImageReceiver().B().N(this.f28182a.getImageReceiver().B().e[0] - 1, false, false);
            }
            kj0 kj0Var3 = this.f28183b;
            float f14 = this.I;
            if (this.f28190x) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            kj0Var3.setScaleY(f14 * f7);
            kj0 kj0Var4 = this.f28183b;
            float f15 = this.I;
            if (!this.f28190x) {
                f11 = 1.0f;
            }
            kj0Var4.setScaleX(f15 * f11);
        } else if (!this.f28186n) {
            this.I = 0.0f;
            this.f28183b.setScaleX(0.0f);
            this.f28183b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(gr.h);
            this.J.setStartDelay(i10 * this.P.f28864c);
            this.J.start();
            this.f28186n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f28187r;
        nj0 nj0Var = this.P;
        float f11 = 1.0f;
        kj0 kj0Var = this.f28183b;
        if (z10) {
            org.telegram.messenger.i0.r(this.G);
            kj0 kj0Var2 = this.f28182a;
            if (kj0Var2.getImageReceiver().B() != null && !kj0Var2.getImageReceiver().B().y()) {
                kj0Var2.getImageReceiver().B().stop();
                if (nj0Var.f28880j0) {
                    kj0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    kj0Var2.getImageReceiver().B().N(kj0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            kj0Var.setVisibility(4);
            kj0Var2.setVisibility(0);
            this.f28189w = false;
            float f12 = this.I;
            if (this.f28190x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            kj0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f28190x) {
                f11 = 0.76f;
            }
            kj0Var.setScaleX(f13 * f11);
        } else {
            kj0Var.animate().cancel();
            if (nj0Var.N0) {
                float f14 = this.I;
                if (this.f28190x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                kj0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f28190x) {
                    f11 = 0.76f;
                }
                kj0Var.setScaleX(f15 * f11);
            } else {
                kj0Var.setScaleY(0.0f);
                kj0Var.setScaleX(0.0f);
            }
        }
        this.f28186n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ag.c2 c2Var;
        Paint paint;
        if (this.f28190x && this.f28191y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.i0.L(1.0f);
            sg.o0 o0Var = this.e;
            nj0 nj0Var = this.P;
            if (o0Var != null && o0Var.f48442a) {
                paint = nj0Var.I0;
            } else {
                paint = nj0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        f5 f5Var = this.f28183b.e;
        if (f5Var != null && (c2Var = f5Var.f26070k) != null) {
            int i11 = 0;
            if (this.D == 0) {
                c2Var.K0(org.telegram.messenger.i0.L(6.0f), 0, 0, org.telegram.messenger.i0.L(6.0f));
            } else {
                if (this.f28190x) {
                    i11 = org.telegram.messenger.i0.L(6.0f);
                }
                c2Var.J0(i11);
            }
        }
        sg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f48442a && this.F != null && org.telegram.messenger.tc.e(8200) && org.telegram.messenger.tc.e(131072)) {
            RectF rectF = org.telegram.messenger.i0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ci0 B = this.f28182a.getImageReceiver().B();
            rh.s8 s8Var = this.F;
            if (B != null && (i10 = B.f25131a0) > 30) {
                f7 = Utilities.l((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            s8Var.f47476j = (int) (s8Var.f47471b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(sg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        kj0 kj0Var;
        org.telegram.messenger.d00 d00Var;
        org.telegram.messenger.d00 d00Var2;
        org.telegram.messenger.d00 d00Var3;
        ?? r14;
        org.telegram.messenger.d00 d00Var4;
        TLRPC.Document document;
        org.telegram.messenger.d00 d00Var5;
        int i10;
        nj0 nj0Var = this.P;
        int i11 = nj0Var.M0;
        kj0 kj0Var2 = this.f28182a;
        kj0 kj0Var3 = this.f28183b;
        if (o0Var != null && o0Var.f48442a) {
            kj0Var2.getImageReceiver().w0(new ci0(2131624215, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f)));
            kj0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232748));
            if (this.F == null) {
                if (org.telegram.messenger.uz.o() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new rh.s8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f48445f != null) {
            kj0Var2.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f48445f));
            kj0Var3.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f48445f));
        } else {
            sg.o0 o0Var2 = this.e;
            if (o0Var2.f48443b) {
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(nj0Var.J);
                long j10 = this.e.f48446g;
                if (r12.f19157i8 != null) {
                    for (int i12 = 0; i12 < r12.f19157i8.documents.size(); i12++) {
                        if (r12.f19157i8.documents.get(i12).f19800id == j10) {
                            document = r12.f19157i8.documents.get(i12);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.d00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null);
                ImageReceiver imageReceiver = kj0Var3.getImageReceiver();
                org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(document);
                if (this.f28187r) {
                    d00Var5 = null;
                } else {
                    d00Var5 = f7;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, d00Var5, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f48445f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(nj0Var.J).f18670r.get(this.e.f48445f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.d00 f10 = org.telegram.messenger.v5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null);
                    if (!org.telegram.messenger.tc.e(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        kj0Var = kj0Var2;
                        boolean z10 = false;
                        d00Var = f10;
                        if (org.telegram.messenger.uz.o() > 0 && i11 != 4) {
                            kj0Var.getImageReceiver().r0(org.telegram.messenger.jc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, d00Var, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = kj0Var3.getImageReceiver();
                            org.telegram.messenger.jc b11 = org.telegram.messenger.jc.b(tL_availableReaction.select_animation);
                            if (this.f28187r) {
                                d00Var3 = null;
                            } else {
                                d00Var3 = d00Var;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, d00Var3, 0L, "tgs", this.e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = kj0Var3.getImageReceiver();
                            org.telegram.messenger.jc b12 = org.telegram.messenger.jc.b(tL_availableReaction.select_animation);
                            if (this.f28187r) {
                                d00Var2 = null;
                            } else {
                                d00Var2 = d00Var;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, d00Var2, 0L, "tgs", this.e, 0);
                            r14 = z10;
                        }
                    } else {
                        d00Var = f10;
                        kj0Var = kj0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        kj0Var2.getImageReceiver().r0(org.telegram.messenger.jc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, d00Var, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = kj0Var3.getImageReceiver();
                        org.telegram.messenger.jc b13 = org.telegram.messenger.jc.b(tL_availableReaction.select_animation);
                        if (this.f28187r) {
                            d00Var4 = null;
                        } else {
                            d00Var4 = d00Var;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, d00Var4, 0L, "tgs", this.e, 0);
                    }
                    if (kj0Var.getImageReceiver().B() != null) {
                        kj0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f28184c.getImageReceiver().r0(org.telegram.messenger.jc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, d00Var, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f14411u0 = r14;
                    org.telegram.messenger.vi.b0(nj0Var.J);
                    org.telegram.messenger.vi.m1(imageReceiver5, org.telegram.messenger.jc.b(tL_availableReaction.around_animation), sg.k0.a());
                }
                kg.l1 l1Var = this.f28185f;
                if (l1Var != null) {
                    l1Var.setImageReceiver(kj0Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(sg.o0 o0Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z11 = this.f28190x;
        boolean contains = this.P.f28867d0.contains(o0Var);
        this.f28190x = contains;
        if (contains != z11) {
            kj0 kj0Var = this.f28182a;
            kj0 kj0Var2 = this.f28183b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                kj0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f28190x) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                kj0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f28190x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                kj0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f28190x) {
                    f15 = 0.76f;
                }
                kj0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = kj0Var2.animate();
                float f20 = this.I;
                if (this.f28190x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f28190x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = kj0Var.animate();
                float f22 = this.I;
                if (this.f28190x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f28190x) {
                    f15 = 0.76f;
                }
                scaleX2.scaleY(f23 * f15).setDuration(240L).setInterpolator(grVar).start();
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
        sg.o0 o0Var = this.e;
        if (o0Var != null) {
            String str = o0Var.f48445f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        mj0 mj0Var;
        if (this.O) {
            nj0 nj0Var = this.P;
            if (nj0Var.Q == null) {
                int action = motionEvent.getAction();
                ij0 ij0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = nj0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((mj0Var = nj0Var.f28874g0) == null || mj0Var.f())) {
                        org.telegram.messenger.i0.h3(ij0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((nj0Var.f28884l0 == null || nj0Var.f28886n0 > 0.8f) && nj0Var.f28874g0 != null)) {
                    nj0Var.f28891r0 = true;
                    if (System.currentTimeMillis() - nj0Var.f28893s0 > 300) {
                        nj0Var.f28893s0 = System.currentTimeMillis();
                        mj0 mj0Var2 = nj0Var.f28874g0;
                        sg.o0 o0Var = this.e;
                        if (nj0Var.f28886n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        mj0Var2.x(this, o0Var, z10, false);
                    }
                }
                if (!nj0Var.f28891r0 && nj0Var.f28884l0 != null) {
                    nj0Var.f28887o0 = 0.0f;
                    float f7 = nj0Var.f28886n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nj0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new bj0(nj0Var, f7));
                    nj0Var.Q.addListener(new aj0(nj0Var, 1));
                    nj0Var.Q.setDuration(150L);
                    nj0Var.Q.setInterpolator(gr.f26523f);
                    nj0Var.Q.start();
                }
                org.telegram.messenger.i0.r(ij0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
