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
public final class kj0 extends FrameLayout {
    public int D;
    public boolean E;
    public rh.s8 F;
    public final hj0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final hj0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final mj0 P;
    public final jj0 f27771a;
    public final jj0 f27772b;
    public final jj0 f27773c;
    public final ImageReceiver d;
    public sg.o0 e;
    public kg.l1 f27774f;
    public float h;
    public boolean f27775n;
    public boolean f27776r;
    public boolean f27777s;
    public boolean f27778w;
    public boolean f27779x;
    public boolean f27780y;

    public kj0(mj0 mj0Var, Context context) {
        super(context);
        this.P = mj0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f27780y = true;
        this.G = new hj0(this, 0);
        this.I = 1.0f;
        this.K = new hj0(this, 1);
        this.O = true;
        jj0 jj0Var = new jj0(this, context, 0);
        this.f27771a = jj0Var;
        jj0 jj0Var2 = new jj0(this, context, 1);
        this.f27772b = jj0Var2;
        jj0Var.getImageReceiver().W(0);
        jj0Var.getImageReceiver().f14410u0 = false;
        jj0 jj0Var3 = new jj0(this, context, 2);
        this.f27773c = jj0Var3;
        addView(jj0Var, w7.b6.e(34, 34, 17));
        addView(jj0Var3, w7.b6.e(34, 34, 17));
        addView(jj0Var2, w7.b6.e(34, 34, 17));
        if (mj0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        jj0Var.setLayerNum(Integer.MAX_VALUE);
        jj0Var2.setLayerNum(Integer.MAX_VALUE);
        jj0Var2.f26292a.W(0);
        ImageReceiver imageReceiver = jj0Var2.f26292a;
        imageReceiver.f14408t0 = false;
        imageReceiver.f14410u0 = false;
        jj0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(kj0 kj0Var, sg.o0 o0Var, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        jj0 jj0Var = kj0Var.f27773c;
        jj0 jj0Var2 = kj0Var.f27771a;
        jj0 jj0Var3 = kj0Var.f27772b;
        mj0 mj0Var = kj0Var.P;
        kj0Var.f(o0Var, false);
        sg.o0 o0Var2 = kj0Var.e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            kj0Var.D = i10;
            kj0Var.e(o0Var);
            return;
        }
        int i12 = mj0Var.J;
        org.telegram.ui.ActionBar.p6 p6Var = mj0Var.f28521k0;
        int i13 = mj0Var.M0;
        boolean q6 = org.telegram.messenger.d20.i(i12).q();
        if ((i13 == 3 && !q6) || (i13 == 5 && o0Var.d && !q6)) {
            z10 = true;
        } else {
            z10 = false;
        }
        kj0Var.H = z10;
        if (z10 && kj0Var.f27774f == null) {
            kg.l1 l1Var = new kg.l1(1, kj0Var.getContext(), null);
            kj0Var.f27774f = l1Var;
            l1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            kj0Var.f27774f.setImageReceiver(jj0Var3.getImageReceiver());
            kj0Var.addView(kj0Var.f27774f, w7.b6.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        kg.l1 l1Var2 = kj0Var.f27774f;
        if (l1Var2 != null) {
            if (kj0Var.H) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l1Var2.setVisibility(i11);
        }
        kj0Var.d();
        kj0Var.e = o0Var;
        if (!o0Var.f48431a && (o0Var.f48434f == null || ((!mj0Var.q() && !mj0Var.G0) || !org.telegram.messenger.sc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        kj0Var.f27776r = z11;
        if (i13 == 4 || kj0Var.e.f48432b) {
            kj0Var.f27776r = false;
        }
        sg.o0 o0Var3 = kj0Var.e;
        if (!o0Var3.f48431a && o0Var3.f48434f == null) {
            jj0Var.getImageReceiver().f();
            jj0Var3.getImageReceiver().f();
            f5 f5Var = new f5(4, mj0Var.J, kj0Var.e.f48435g);
            f5 f5Var2 = new f5(3, mj0Var.J, kj0Var.e.f48435g);
            if (i13 != 1 && i13 != 2 && i13 != 4) {
                int i14 = org.telegram.ui.ActionBar.t6.f21259v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.a7.y(kj0Var, f5Var, i14, p6Var, mode);
                org.telegram.ui.ActionBar.a7.y(kj0Var, f5Var2, i14, p6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                f5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                f5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            jj0Var.setAnimatedEmojiDrawable(f5Var);
            jj0Var3.setAnimatedEmojiDrawable(f5Var2);
            kg.l1 l1Var3 = kj0Var.f27774f;
            if (l1Var3 != null) {
                l1Var3.setAnimatedEmojiDrawable(f5Var2);
            }
        } else {
            kj0Var.e(o0Var);
            jj0Var.setAnimatedEmojiDrawable(null);
            if (jj0Var2.getImageReceiver().B() != null) {
                jj0Var2.getImageReceiver().B().N(0, false, false);
            }
            kg.l1 l1Var4 = kj0Var.f27774f;
            if (l1Var4 != null) {
                l1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        kj0Var.setFocusable(true);
        boolean z12 = kj0Var.f27776r;
        kj0Var.f27777s = z12;
        if (!z12) {
            jj0Var2.setVisibility(8);
            jj0Var3.setVisibility(0);
            kj0Var.f27778w = true;
        } else {
            kj0Var.f27778w = false;
            jj0Var2.setVisibility(0);
            jj0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = jj0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = jj0Var3.getLayoutParams();
        int L = org.telegram.messenger.i0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = jj0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = jj0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.i0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        jj0 jj0Var = this.f27772b;
        f5 f5Var = jj0Var.e;
        if (f5Var != null) {
            imageReceiver = f5Var.f25975k;
        } else {
            imageReceiver = jj0Var.f26292a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            mj0 mj0Var = this.P;
            if (mj0Var.f28539x0 == null && !this.N && mj0Var.G0) {
                if (imageReceiver.B().f24752a0 <= 2) {
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
        if (!this.P.f28519j0) {
            d();
            this.f27775n = true;
            if (!this.f27776r) {
                this.f27772b.setVisibility(0);
                jj0 jj0Var = this.f27772b;
                float f12 = this.I;
                if (this.f27779x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                jj0Var.setScaleY(f12 * f10);
                jj0 jj0Var2 = this.f27772b;
                float f13 = this.I;
                if (!this.f27779x) {
                    f11 = 1.0f;
                }
                jj0Var2.setScaleX(f13 * f11);
                return;
            }
            return;
        }
        org.telegram.messenger.i0.r(this.G);
        if (this.f27776r) {
            if (this.f27771a.getImageReceiver().B() != null && !this.f27771a.getImageReceiver().B().y() && !this.f27775n) {
                this.f27775n = true;
                if (i10 == 0) {
                    this.E = false;
                    this.f27771a.getImageReceiver().B().stop();
                    this.f27771a.getImageReceiver().B().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f27771a.getImageReceiver().B().stop();
                this.f27771a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.i0.h3(this.G, i10);
                return;
            }
            if (this.f27771a.getImageReceiver().B() != null && this.f27775n && !this.f27771a.getImageReceiver().B().f24765k0 && !this.f27771a.getImageReceiver().B().y()) {
                this.f27771a.getImageReceiver().B().N(this.f27771a.getImageReceiver().B().e[0] - 1, false, false);
            }
            jj0 jj0Var3 = this.f27772b;
            float f14 = this.I;
            if (this.f27779x) {
                f7 = 0.76f;
            } else {
                f7 = 1.0f;
            }
            jj0Var3.setScaleY(f14 * f7);
            jj0 jj0Var4 = this.f27772b;
            float f15 = this.I;
            if (!this.f27779x) {
                f11 = 1.0f;
            }
            jj0Var4.setScaleX(f15 * f11);
        } else if (!this.f27775n) {
            this.I = 0.0f;
            this.f27772b.setScaleX(0.0f);
            this.f27772b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 9));
            this.J.setDuration(150L);
            this.J.setInterpolator(gr.h);
            this.J.setStartDelay(i10 * this.P.f28503c);
            this.J.start();
            this.f27775n = true;
        }
    }

    public final void d() {
        float f7;
        float f10;
        boolean z10 = this.f27776r;
        mj0 mj0Var = this.P;
        float f11 = 1.0f;
        jj0 jj0Var = this.f27772b;
        if (z10) {
            org.telegram.messenger.i0.r(this.G);
            jj0 jj0Var2 = this.f27771a;
            if (jj0Var2.getImageReceiver().B() != null && !jj0Var2.getImageReceiver().B().y()) {
                jj0Var2.getImageReceiver().B().stop();
                if (mj0Var.f28519j0) {
                    jj0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    jj0Var2.getImageReceiver().B().N(jj0Var2.getImageReceiver().B().e[0] - 1, false, true);
                }
            }
            jj0Var.setVisibility(4);
            jj0Var2.setVisibility(0);
            this.f27778w = false;
            float f12 = this.I;
            if (this.f27779x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            jj0Var.setScaleY(f12 * f10);
            float f13 = this.I;
            if (this.f27779x) {
                f11 = 0.76f;
            }
            jj0Var.setScaleX(f13 * f11);
        } else {
            jj0Var.animate().cancel();
            if (mj0Var.N0) {
                float f14 = this.I;
                if (this.f27779x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                jj0Var.setScaleY(f14 * f7);
                float f15 = this.I;
                if (this.f27779x) {
                    f11 = 0.76f;
                }
                jj0Var.setScaleX(f15 * f11);
            } else {
                jj0Var.setScaleY(0.0f);
                jj0Var.setScaleX(0.0f);
            }
        }
        this.f27775n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        ag.c2 c2Var;
        Paint paint;
        if (this.f27779x && this.f27780y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.i0.L(1.0f);
            sg.o0 o0Var = this.e;
            mj0 mj0Var = this.P;
            if (o0Var != null && o0Var.f48431a) {
                paint = mj0Var.I0;
            } else {
                paint = mj0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        f5 f5Var = this.f27772b.e;
        if (f5Var != null && (c2Var = f5Var.f25975k) != null) {
            int i11 = 0;
            if (this.D == 0) {
                c2Var.K0(org.telegram.messenger.i0.L(6.0f), 0, 0, org.telegram.messenger.i0.L(6.0f));
            } else {
                if (this.f27779x) {
                    i11 = org.telegram.messenger.i0.L(6.0f);
                }
                c2Var.J0(i11);
            }
        }
        sg.o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.f48431a && this.F != null && org.telegram.messenger.sc.e(8200) && org.telegram.messenger.sc.e(131072)) {
            RectF rectF = org.telegram.messenger.i0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            bi0 B = this.f27771a.getImageReceiver().B();
            rh.s8 s8Var = this.F;
            if (B != null && (i10 = B.f24752a0) > 30) {
                f7 = Utilities.l((i10 - 30) / 30.0f);
            } else {
                f7 = 0.0f;
            }
            s8Var.f47464j = (int) (s8Var.f47459b.size() * f7);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(sg.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        jj0 jj0Var;
        org.telegram.messenger.c00 c00Var;
        org.telegram.messenger.c00 c00Var2;
        org.telegram.messenger.c00 c00Var3;
        ?? r14;
        org.telegram.messenger.c00 c00Var4;
        TLRPC.Document document;
        org.telegram.messenger.c00 c00Var5;
        int i10;
        mj0 mj0Var = this.P;
        int i11 = mj0Var.M0;
        jj0 jj0Var2 = this.f27771a;
        jj0 jj0Var3 = this.f27772b;
        if (o0Var != null && o0Var.f48431a) {
            jj0Var2.getImageReceiver().w0(new bi0(2131624215, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f)));
            jj0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232748));
            if (this.F == null) {
                if (org.telegram.messenger.tz.o() == 2) {
                    i10 = 45;
                } else {
                    i10 = 18;
                }
                this.F = new rh.s8(1, i10);
            }
        } else if (i11 == 4 && o0Var != null && o0Var.f48434f != null) {
            jj0Var2.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f48434f));
            jj0Var3.getImageReceiver().w0(org.telegram.messenger.k6.g(o0Var.f48434f));
        } else {
            sg.o0 o0Var2 = this.e;
            if (o0Var2.f48432b) {
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(mj0Var.J);
                long j10 = this.e.f48435g;
                if (r12.f18814i8 != null) {
                    for (int i12 = 0; i12 < r12.f18814i8.documents.size(); i12++) {
                        if (r12.f18814i8.documents.get(i12).f19799id == j10) {
                            document = r12.f18814i8.documents.get(i12);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, null);
                ImageReceiver imageReceiver = jj0Var3.getImageReceiver();
                org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(document);
                if (this.f27776r) {
                    c00Var5 = null;
                } else {
                    c00Var5 = f7;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, c00Var5, 0L, "tgs", this.e, 0);
            } else if (o0Var2.f48434f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(mj0Var.J).f18341r.get(this.e.f48434f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.c00 f10 = org.telegram.messenger.v5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200) || i11 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        jj0Var = jj0Var2;
                        boolean z10 = false;
                        c00Var = f10;
                        if (org.telegram.messenger.tz.o() > 0 && i11 != 4) {
                            jj0Var.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, c00Var, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = jj0Var3.getImageReceiver();
                            org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_availableReaction.select_animation);
                            if (this.f27776r) {
                                c00Var3 = null;
                            } else {
                                c00Var3 = c00Var;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, c00Var3, 0L, "tgs", this.e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = jj0Var3.getImageReceiver();
                            org.telegram.messenger.ic b12 = org.telegram.messenger.ic.b(tL_availableReaction.select_animation);
                            if (this.f27776r) {
                                c00Var2 = null;
                            } else {
                                c00Var2 = c00Var;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, c00Var2, 0L, "tgs", this.e, 0);
                            r14 = z10;
                        }
                    } else {
                        c00Var = f10;
                        jj0Var = jj0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        jj0Var2.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, c00Var, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = jj0Var3.getImageReceiver();
                        org.telegram.messenger.ic b13 = org.telegram.messenger.ic.b(tL_availableReaction.select_animation);
                        if (this.f27776r) {
                            c00Var4 = null;
                        } else {
                            c00Var4 = c00Var;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, c00Var4, 0L, "tgs", this.e, 0);
                    }
                    if (jj0Var.getImageReceiver().B() != null) {
                        jj0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f27773c.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, c00Var, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f14410u0 = r14;
                    org.telegram.messenger.ui.b0(mj0Var.J);
                    org.telegram.messenger.ui.m1(imageReceiver5, org.telegram.messenger.ic.b(tL_availableReaction.around_animation), sg.k0.a());
                }
                kg.l1 l1Var = this.f27774f;
                if (l1Var != null) {
                    l1Var.setImageReceiver(jj0Var3.getImageReceiver());
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
        boolean z11 = this.f27779x;
        boolean contains = this.P.f28506d0.contains(o0Var);
        this.f27779x = contains;
        if (contains != z11) {
            jj0 jj0Var = this.f27771a;
            jj0 jj0Var2 = this.f27772b;
            float f15 = 1.0f;
            if (!z10) {
                float f16 = this.I;
                if (contains) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                jj0Var2.setScaleX(f16 * f12);
                float f17 = this.I;
                if (this.f27779x) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                jj0Var2.setScaleY(f17 * f13);
                float f18 = this.I;
                if (this.f27779x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                jj0Var.setScaleX(f18 * f14);
                float f19 = this.I;
                if (this.f27779x) {
                    f15 = 0.76f;
                }
                jj0Var.setScaleY(f19 * f15);
            } else {
                ViewPropertyAnimator animate = jj0Var2.animate();
                float f20 = this.I;
                if (this.f27779x) {
                    f7 = 0.76f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f20 * f7);
                float f21 = this.I;
                if (this.f27779x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f21 * f10).setDuration(240L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = jj0Var.animate();
                float f22 = this.I;
                if (this.f27779x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f22 * f11);
                float f23 = this.I;
                if (this.f27779x) {
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
            String str = o0Var.f48434f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        lj0 lj0Var;
        if (this.O) {
            mj0 mj0Var = this.P;
            if (mj0Var.Q == null) {
                int action = motionEvent.getAction();
                hj0 hj0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i10 = mj0Var.M0) != 3 && i10 != 4 && i10 != 5 && ((lj0Var = mj0Var.f28513g0) == null || lj0Var.f())) {
                        org.telegram.messenger.i0.h3(hj0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((mj0Var.f28523l0 == null || mj0Var.f28525n0 > 0.8f) && mj0Var.f28513g0 != null)) {
                    mj0Var.f28530r0 = true;
                    if (System.currentTimeMillis() - mj0Var.f28532s0 > 300) {
                        mj0Var.f28532s0 = System.currentTimeMillis();
                        lj0 lj0Var2 = mj0Var.f28513g0;
                        sg.o0 o0Var = this.e;
                        if (mj0Var.f28525n0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        lj0Var2.x(this, o0Var, z10, false);
                    }
                }
                if (!mj0Var.f28530r0 && mj0Var.f28523l0 != null) {
                    mj0Var.f28526o0 = 0.0f;
                    float f7 = mj0Var.f28525n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mj0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new aj0(mj0Var, f7));
                    mj0Var.Q.addListener(new zi0(mj0Var, 1));
                    mj0Var.Q.setDuration(150L);
                    mj0Var.Q.setInterpolator(gr.f26495f);
                    mj0Var.Q.start();
                }
                org.telegram.messenger.i0.r(hj0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
