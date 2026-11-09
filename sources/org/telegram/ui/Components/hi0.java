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
public final class hi0 extends FrameLayout {
    public int D;
    public boolean E;
    public bi.ud F;
    public final ei0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final ei0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ji0 P;
    public final gi0 f34303a;
    public final gi0 f34304b;
    public final gi0 f34305c;
    public final ImageReceiver d;
    public ch.o0 f34306e;
    public ug.z0 f34307f;
    public float h;
    public boolean f34308n;
    public boolean f34309r;
    public boolean f34310s;
    public boolean f34311w;
    public boolean f34312x;
    public boolean f34313y;

    public hi0(ji0 ji0Var, Context context) {
        super(context);
        this.P = ji0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f34313y = true;
        this.G = new ei0(this, 0);
        this.I = 1.0f;
        this.K = new ei0(this, 1);
        this.O = true;
        gi0 gi0Var = new gi0(this, context, 0);
        this.f34303a = gi0Var;
        gi0 gi0Var2 = new gi0(this, context, 1);
        this.f34304b = gi0Var2;
        gi0Var.getImageReceiver().W(0);
        gi0Var.getImageReceiver().f21222u0 = false;
        gi0 gi0Var3 = new gi0(this, context, 2);
        this.f34305c = gi0Var3;
        addView(gi0Var, c8.ha.e(34, 34, 17));
        addView(gi0Var3, c8.ha.e(34, 34, 17));
        addView(gi0Var2, c8.ha.e(34, 34, 17));
        if (ji0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        gi0Var.setLayerNum(Integer.MAX_VALUE);
        gi0Var2.setLayerNum(Integer.MAX_VALUE);
        gi0Var2.f35647a.W(0);
        ImageReceiver imageReceiver = gi0Var2.f35647a;
        imageReceiver.f21220t0 = false;
        imageReceiver.f21222u0 = false;
        gi0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(hi0 hi0Var, ch.o0 o0Var, int i7) {
        boolean z9;
        boolean z10;
        int i10;
        gi0 gi0Var = hi0Var.f34305c;
        gi0 gi0Var2 = hi0Var.f34303a;
        gi0 gi0Var3 = hi0Var.f34304b;
        ji0 ji0Var = hi0Var.P;
        hi0Var.f(o0Var, false);
        ch.o0 o0Var2 = hi0Var.f34306e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            hi0Var.D = i7;
            hi0Var.e(o0Var);
            return;
        }
        int i11 = ji0Var.J;
        org.telegram.ui.ActionBar.g6 g6Var = ji0Var.f35050k0;
        int i12 = ji0Var.M0;
        boolean q10 = org.telegram.messenger.p10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && o0Var.d && !q10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        hi0Var.H = z9;
        if (z9 && hi0Var.f34307f == null) {
            ug.z0 z0Var = new ug.z0(1, hi0Var.getContext(), null);
            hi0Var.f34307f = z0Var;
            z0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            hi0Var.f34307f.setImageReceiver(gi0Var3.getImageReceiver());
            hi0Var.addView(hi0Var.f34307f, c8.ha.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.z0 z0Var2 = hi0Var.f34307f;
        if (z0Var2 != null) {
            if (hi0Var.H) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z0Var2.setVisibility(i10);
        }
        hi0Var.d();
        hi0Var.f34306e = o0Var;
        if (!o0Var.f6350a && (o0Var.f6354f == null || ((!ji0Var.q() && !ji0Var.G0) || !org.telegram.messenger.sc.e(8200)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        hi0Var.f34309r = z10;
        if (i12 == 4 || hi0Var.f34306e.f6351b) {
            hi0Var.f34309r = false;
        }
        ch.o0 o0Var3 = hi0Var.f34306e;
        if (!o0Var3.f6350a && o0Var3.f6354f == null) {
            gi0Var.getImageReceiver().f();
            gi0Var3.getImageReceiver().f();
            i5 i5Var = new i5(4, ji0Var.J, hi0Var.f34306e.f6355g);
            i5 i5Var2 = new i5(3, ji0Var.J, hi0Var.f34306e.f6355g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.l6.f28200v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.s6.x(hi0Var, i5Var, i13, g6Var, mode);
                org.telegram.ui.ActionBar.s6.x(hi0Var, i5Var2, i13, g6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                i5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                i5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            gi0Var.setAnimatedEmojiDrawable(i5Var);
            gi0Var3.setAnimatedEmojiDrawable(i5Var2);
            ug.z0 z0Var3 = hi0Var.f34307f;
            if (z0Var3 != null) {
                z0Var3.setAnimatedEmojiDrawable(i5Var2);
            }
        } else {
            hi0Var.e(o0Var);
            gi0Var.setAnimatedEmojiDrawable(null);
            if (gi0Var2.getImageReceiver().B() != null) {
                gi0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.z0 z0Var4 = hi0Var.f34307f;
            if (z0Var4 != null) {
                z0Var4.setAnimatedEmojiDrawable(null);
            }
        }
        hi0Var.setFocusable(true);
        boolean z11 = hi0Var.f34309r;
        hi0Var.f34310s = z11;
        if (!z11) {
            gi0Var2.setVisibility(8);
            gi0Var3.setVisibility(0);
            hi0Var.f34311w = true;
        } else {
            hi0Var.f34311w = false;
            gi0Var2.setVisibility(0);
            gi0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = gi0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = gi0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = gi0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = gi0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        gi0 gi0Var = this.f34304b;
        i5 i5Var = gi0Var.f35650e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34568k;
        } else {
            imageReceiver = gi0Var.f35647a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            ji0 ji0Var = this.P;
            if (ji0Var.f35068x0 == null && !this.N && ji0Var.G0) {
                if (imageReceiver.B().f31820a0 <= 2) {
                    imageReceiver.B().stop();
                    return;
                }
                return;
            }
            imageReceiver.B().start();
        }
    }

    public final void c(int i7) {
        float f10;
        float f11;
        float f12 = 0.76f;
        if (!this.P.f35048j0) {
            d();
            this.f34308n = true;
            if (!this.f34309r) {
                this.f34304b.setVisibility(0);
                gi0 gi0Var = this.f34304b;
                float f13 = this.I;
                if (this.f34312x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                gi0Var.setScaleY(f13 * f11);
                gi0 gi0Var2 = this.f34304b;
                float f14 = this.I;
                if (!this.f34312x) {
                    f12 = 1.0f;
                }
                gi0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.G);
        if (this.f34309r) {
            if (this.f34303a.getImageReceiver().B() != null && !this.f34303a.getImageReceiver().B().y() && !this.f34308n) {
                this.f34308n = true;
                if (i7 == 0) {
                    this.E = false;
                    this.f34303a.getImageReceiver().B().stop();
                    this.f34303a.getImageReceiver().B().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f34303a.getImageReceiver().B().stop();
                this.f34303a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.i3(this.G, i7);
                return;
            }
            if (this.f34303a.getImageReceiver().B() != null && this.f34308n && !this.f34303a.getImageReceiver().B().f31834k0 && !this.f34303a.getImageReceiver().B().y()) {
                this.f34303a.getImageReceiver().B().N(this.f34303a.getImageReceiver().B().f31826e[0] - 1, false, false);
            }
            gi0 gi0Var3 = this.f34304b;
            float f15 = this.I;
            if (this.f34312x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            gi0Var3.setScaleY(f15 * f10);
            gi0 gi0Var4 = this.f34304b;
            float f16 = this.I;
            if (!this.f34312x) {
                f12 = 1.0f;
            }
            gi0Var4.setScaleX(f16 * f12);
        } else if (!this.f34308n) {
            this.I = 0.0f;
            this.f34304b.setScaleX(0.0f);
            this.f34304b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new d60(this, 8));
            this.J.setDuration(150L);
            this.J.setInterpolator(xq.h);
            this.J.setStartDelay(i7 * this.P.f35031c);
            this.J.start();
            this.f34308n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z9 = this.f34309r;
        ji0 ji0Var = this.P;
        float f12 = 1.0f;
        gi0 gi0Var = this.f34304b;
        if (z9) {
            org.telegram.messenger.g0.r(this.G);
            gi0 gi0Var2 = this.f34303a;
            if (gi0Var2.getImageReceiver().B() != null && !gi0Var2.getImageReceiver().B().y()) {
                gi0Var2.getImageReceiver().B().stop();
                if (ji0Var.f35048j0) {
                    gi0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    gi0Var2.getImageReceiver().B().N(gi0Var2.getImageReceiver().B().f31826e[0] - 1, false, true);
                }
            }
            gi0Var.setVisibility(4);
            gi0Var2.setVisibility(0);
            this.f34311w = false;
            float f13 = this.I;
            if (this.f34312x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            gi0Var.setScaleY(f13 * f11);
            float f14 = this.I;
            if (this.f34312x) {
                f12 = 0.76f;
            }
            gi0Var.setScaleX(f14 * f12);
        } else {
            gi0Var.animate().cancel();
            if (ji0Var.N0) {
                float f15 = this.I;
                if (this.f34312x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                gi0Var.setScaleY(f15 * f10);
                float f16 = this.I;
                if (this.f34312x) {
                    f12 = 0.76f;
                }
                gi0Var.setScaleX(f16 * f12);
            } else {
                gi0Var.setScaleY(0.0f);
                gi0Var.setScaleX(0.0f);
            }
        }
        this.f34308n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        di.z2 z2Var;
        Paint paint;
        if (this.f34312x && this.f34313y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.o0 o0Var = this.f34306e;
            ji0 ji0Var = this.P;
            if (o0Var != null && o0Var.f6350a) {
                paint = ji0Var.I0;
            } else {
                paint = ji0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        i5 i5Var = this.f34304b.f35650e;
        if (i5Var != null && (z2Var = i5Var.f34568k) != null) {
            int i10 = 0;
            if (this.D == 0) {
                z2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f34312x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                z2Var.J0(i10);
            }
        }
        ch.o0 o0Var2 = this.f34306e;
        if (o0Var2 != null && o0Var2.f6350a && this.F != null && org.telegram.messenger.sc.e(8200) && org.telegram.messenger.sc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ah0 B = this.f34303a.getImageReceiver().B();
            bi.ud udVar = this.F;
            if (B != null && (i7 = B.f31820a0) > 30) {
                f10 = Utilities.l((i7 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            udVar.f4848j = (int) (udVar.f4842b.size() * f10);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ch.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        gi0 gi0Var;
        org.telegram.messenger.rz rzVar;
        org.telegram.messenger.rz rzVar2;
        org.telegram.messenger.rz rzVar3;
        ?? r14;
        org.telegram.messenger.rz rzVar4;
        TLRPC.Document document;
        org.telegram.messenger.rz rzVar5;
        int i7;
        ji0 ji0Var = this.P;
        int i10 = ji0Var.M0;
        gi0 gi0Var2 = this.f34303a;
        gi0 gi0Var3 = this.f34304b;
        if (o0Var != null && o0Var.f6350a) {
            gi0Var2.getImageReceiver().w0(new ah0(2131624217, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            gi0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232751));
            if (this.F == null) {
                if (org.telegram.messenger.iz.o() == 2) {
                    i7 = 45;
                } else {
                    i7 = 18;
                }
                this.F = new bi.ud(1, i7);
            }
        } else if (i10 == 4 && o0Var != null && o0Var.f6354f != null) {
            gi0Var2.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f6354f));
            gi0Var3.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f6354f));
        } else {
            ch.o0 o0Var2 = this.f34306e;
            if (o0Var2.f6351b) {
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ji0Var.J);
                long j3 = this.f34306e.f6355g;
                if (s12.f24802h8 != null) {
                    for (int i11 = 0; i11 < s12.f24802h8.documents.size(); i11++) {
                        if (s12.f24802h8.documents.get(i11).f26962id == j3) {
                            document = s12.f24802h8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, null);
                ImageReceiver imageReceiver = gi0Var3.getImageReceiver();
                org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
                if (this.f34309r) {
                    rzVar5 = null;
                } else {
                    rzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, rzVar5, 0L, "tgs", this.f34306e, 0);
            } else if (o0Var2.f6354f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(ji0Var.J).f25836r.get(this.f34306e.f6354f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.rz f11 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        gi0Var = gi0Var2;
                        boolean z9 = false;
                        rzVar = f11;
                        if (org.telegram.messenger.iz.o() > 0 && i10 != 4) {
                            gi0Var.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = gi0Var3.getImageReceiver();
                            org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                            if (this.f34309r) {
                                rzVar3 = null;
                            } else {
                                rzVar3 = rzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, rzVar3, 0L, "tgs", this.f34306e, 0);
                            r14 = z9;
                        } else {
                            ImageReceiver imageReceiver3 = gi0Var3.getImageReceiver();
                            org.telegram.messenger.hc b12 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                            if (this.f34309r) {
                                rzVar2 = null;
                            } else {
                                rzVar2 = rzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, rzVar2, 0L, "tgs", this.f34306e, 0);
                            r14 = z9;
                        }
                    } else {
                        rzVar = f11;
                        gi0Var = gi0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        gi0Var2.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = gi0Var3.getImageReceiver();
                        org.telegram.messenger.hc b13 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                        if (this.f34309r) {
                            rzVar4 = null;
                        } else {
                            rzVar4 = rzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, rzVar4, 0L, "tgs", this.f34306e, 0);
                    }
                    if (gi0Var.getImageReceiver().B() != null) {
                        gi0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f34305c.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, rzVar, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f21222u0 = r14;
                    org.telegram.messenger.ui.b0(ji0Var.J);
                    org.telegram.messenger.ui.m1(imageReceiver5, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                }
                ug.z0 z0Var = this.f34307f;
                if (z0Var != null) {
                    z0Var.setImageReceiver(gi0Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(ch.o0 o0Var, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10 = this.f34312x;
        boolean contains = this.P.f35034d0.contains(o0Var);
        this.f34312x = contains;
        if (contains != z10) {
            gi0 gi0Var = this.f34303a;
            gi0 gi0Var2 = this.f34304b;
            float f16 = 1.0f;
            if (!z9) {
                float f17 = this.I;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                gi0Var2.setScaleX(f17 * f13);
                float f18 = this.I;
                if (this.f34312x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                gi0Var2.setScaleY(f18 * f14);
                float f19 = this.I;
                if (this.f34312x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                gi0Var.setScaleX(f19 * f15);
                float f20 = this.I;
                if (this.f34312x) {
                    f16 = 0.76f;
                }
                gi0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = gi0Var2.animate();
                float f21 = this.I;
                if (this.f34312x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.I;
                if (this.f34312x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate2 = gi0Var.animate();
                float f23 = this.I;
                if (this.f34312x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.I;
                if (this.f34312x) {
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
        ch.o0 o0Var = this.f34306e;
        if (o0Var != null) {
            String str = o0Var.f6354f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7;
        ii0 ii0Var;
        if (this.O) {
            ji0 ji0Var = this.P;
            if (ji0Var.Q == null) {
                int action = motionEvent.getAction();
                ei0 ei0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i7 = ji0Var.M0) != 3 && i7 != 4 && i7 != 5 && ((ii0Var = ji0Var.f35042g0) == null || ii0Var.v())) {
                        org.telegram.messenger.g0.i3(ei0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((ji0Var.f35052l0 == null || ji0Var.f35054n0 > 0.8f) && ji0Var.f35042g0 != null)) {
                    ji0Var.f35059r0 = true;
                    if (System.currentTimeMillis() - ji0Var.f35061s0 > 300) {
                        ji0Var.f35061s0 = System.currentTimeMillis();
                        ii0 ii0Var2 = ji0Var.f35042g0;
                        ch.o0 o0Var = this.f34306e;
                        if (ji0Var.f35054n0 > 0.8f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ii0Var2.i(this, o0Var, z9, false);
                    }
                }
                if (!ji0Var.f35059r0 && ji0Var.f35052l0 != null) {
                    ji0Var.f35055o0 = 0.0f;
                    float f10 = ji0Var.f35054n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ji0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new xh0(ji0Var, f10));
                    ji0Var.Q.addListener(new wh0(ji0Var, 1));
                    ji0Var.Q.setDuration(150L);
                    ji0Var.Q.setInterpolator(xq.f40458f);
                    ji0Var.Q.start();
                }
                org.telegram.messenger.g0.r(ei0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
