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
public final class ki0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ac G;
    public final hi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final hi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final mi0 Q;
    public final ji0 f36512a;
    public final ji0 f36513b;
    public final ji0 f36514c;
    public final ImageReceiver d;
    public ch.p0 f36515e;
    public ug.a1 f36516f;
    public float h;
    public boolean f36517n;
    public boolean f36518r;
    public boolean f36519s;
    public boolean f36520w;
    public boolean f36521x;
    public boolean f36522y;

    public ki0(mi0 mi0Var, Context context) {
        super(context);
        this.Q = mi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f36522y = true;
        this.H = new hi0(this, 0);
        this.J = 1.0f;
        this.L = new hi0(this, 1);
        this.P = true;
        ji0 ji0Var = new ji0(this, context, 0);
        this.f36512a = ji0Var;
        ji0 ji0Var2 = new ji0(this, context, 1);
        this.f36513b = ji0Var2;
        ji0Var.getImageReceiver().W(0);
        ji0Var.getImageReceiver().f22303v0 = false;
        ji0 ji0Var3 = new ji0(this, context, 2);
        this.f36514c = ji0Var3;
        addView(ji0Var, c8.ja.e(34, 34, 17));
        addView(ji0Var3, c8.ja.e(34, 34, 17));
        addView(ji0Var2, c8.ja.e(34, 34, 17));
        if (mi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ji0Var.setLayerNum(Integer.MAX_VALUE);
        ji0Var2.setLayerNum(Integer.MAX_VALUE);
        ji0Var2.f35499a.W(0);
        ImageReceiver imageReceiver = ji0Var2.f35499a;
        imageReceiver.f22301u0 = false;
        imageReceiver.f22303v0 = false;
        ji0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ki0 ki0Var, ch.p0 p0Var, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        ji0 ji0Var = ki0Var.f36514c;
        ji0 ji0Var2 = ki0Var.f36512a;
        ji0 ji0Var3 = ki0Var.f36513b;
        mi0 mi0Var = ki0Var.Q;
        ki0Var.f(p0Var, false);
        ch.p0 p0Var2 = ki0Var.f36515e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ki0Var.E = i7;
            ki0Var.e(p0Var);
            return;
        }
        int i11 = mi0Var.K;
        org.telegram.ui.ActionBar.e6 e6Var = mi0Var.f37282l0;
        int i12 = mi0Var.N0;
        boolean q10 = org.telegram.messenger.m10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && p0Var.d && !q10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ki0Var.I = z10;
        if (z10 && ki0Var.f36516f == null) {
            ug.a1 a1Var = new ug.a1(1, ki0Var.getContext(), null);
            ki0Var.f36516f = a1Var;
            a1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ki0Var.f36516f.setImageReceiver(ji0Var3.getImageReceiver());
            ki0Var.addView(ki0Var.f36516f, c8.ja.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.a1 a1Var2 = ki0Var.f36516f;
        if (a1Var2 != null) {
            if (ki0Var.I) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a1Var2.setVisibility(i10);
        }
        ki0Var.d();
        ki0Var.f36515e = p0Var;
        if (!p0Var.f5187a && (p0Var.f5191f == null || ((!mi0Var.q() && !mi0Var.H0) || !org.telegram.messenger.qc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ki0Var.f36518r = z11;
        if (i12 == 4 || ki0Var.f36515e.f5188b) {
            ki0Var.f36518r = false;
        }
        ch.p0 p0Var3 = ki0Var.f36515e;
        if (!p0Var3.f5187a && p0Var3.f5191f == null) {
            ji0Var.getImageReceiver().f();
            ji0Var3.getImageReceiver().f();
            g5 g5Var = new g5(4, mi0Var.K, ki0Var.f36515e.f5192g);
            g5 g5Var2 = new g5(3, mi0Var.K, ki0Var.f36515e.f5192g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.j6.f29184v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.q6.x(ki0Var, g5Var, i13, e6Var, mode);
                org.telegram.ui.ActionBar.q6.x(ki0Var, g5Var2, i13, e6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                g5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                g5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ji0Var.setAnimatedEmojiDrawable(g5Var);
            ji0Var3.setAnimatedEmojiDrawable(g5Var2);
            ug.a1 a1Var3 = ki0Var.f36516f;
            if (a1Var3 != null) {
                a1Var3.setAnimatedEmojiDrawable(g5Var2);
            }
        } else {
            ki0Var.e(p0Var);
            ji0Var.setAnimatedEmojiDrawable(null);
            if (ji0Var2.getImageReceiver().B() != null) {
                ji0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.a1 a1Var4 = ki0Var.f36516f;
            if (a1Var4 != null) {
                a1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ki0Var.setFocusable(true);
        boolean z12 = ki0Var.f36518r;
        ki0Var.f36519s = z12;
        if (!z12) {
            ji0Var2.setVisibility(8);
            ji0Var3.setVisibility(0);
            ki0Var.f36520w = true;
        } else {
            ki0Var.f36520w = false;
            ji0Var2.setVisibility(0);
            ji0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ji0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ji0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ji0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ji0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ji0 ji0Var = this.f36513b;
        g5 g5Var = ji0Var.f35502e;
        if (g5Var != null) {
            imageReceiver = g5Var.f34813k;
        } else {
            imageReceiver = ji0Var.f35499a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            mi0 mi0Var = this.Q;
            if (mi0Var.f37300y0 == null && !this.O && mi0Var.H0) {
                if (imageReceiver.B().f33575b0 <= 2) {
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
        if (!this.Q.f37280k0) {
            d();
            this.f36517n = true;
            if (!this.f36518r) {
                this.f36513b.setVisibility(0);
                ji0 ji0Var = this.f36513b;
                float f13 = this.J;
                if (this.f36521x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ji0Var.setScaleY(f13 * f11);
                ji0 ji0Var2 = this.f36513b;
                float f14 = this.J;
                if (!this.f36521x) {
                    f12 = 1.0f;
                }
                ji0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.H);
        if (this.f36518r) {
            if (this.f36512a.getImageReceiver().B() != null && !this.f36512a.getImageReceiver().B().y() && !this.f36517n) {
                this.f36517n = true;
                if (i7 == 0) {
                    this.F = false;
                    this.f36512a.getImageReceiver().B().stop();
                    this.f36512a.getImageReceiver().B().N(0, false, false);
                    this.H.run();
                    return;
                }
                this.F = true;
                this.f36512a.getImageReceiver().B().stop();
                this.f36512a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.i3(this.H, i7);
                return;
            }
            if (this.f36512a.getImageReceiver().B() != null && this.f36517n && !this.f36512a.getImageReceiver().B().f33588l0 && !this.f36512a.getImageReceiver().B().y()) {
                this.f36512a.getImageReceiver().B().N(this.f36512a.getImageReceiver().B().f33579e[0] - 1, false, false);
            }
            ji0 ji0Var3 = this.f36513b;
            float f15 = this.J;
            if (this.f36521x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ji0Var3.setScaleY(f15 * f10);
            ji0 ji0Var4 = this.f36513b;
            float f16 = this.J;
            if (!this.f36521x) {
                f12 = 1.0f;
            }
            ji0Var4.setScaleX(f16 * f12);
        } else if (!this.f36517n) {
            this.J = 0.0f;
            this.f36513b.setScaleX(0.0f);
            this.f36513b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new f60(this, 8));
            this.K.setDuration(150L);
            this.K.setInterpolator(er.h);
            this.K.setStartDelay(i7 * this.Q.f37261c);
            this.K.start();
            this.f36517n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z10 = this.f36518r;
        mi0 mi0Var = this.Q;
        float f12 = 1.0f;
        ji0 ji0Var = this.f36513b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ji0 ji0Var2 = this.f36512a;
            if (ji0Var2.getImageReceiver().B() != null && !ji0Var2.getImageReceiver().B().y()) {
                ji0Var2.getImageReceiver().B().stop();
                if (mi0Var.f37280k0) {
                    ji0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ji0Var2.getImageReceiver().B().N(ji0Var2.getImageReceiver().B().f33579e[0] - 1, false, true);
                }
            }
            ji0Var.setVisibility(4);
            ji0Var2.setVisibility(0);
            this.f36520w = false;
            float f13 = this.J;
            if (this.f36521x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            ji0Var.setScaleY(f13 * f11);
            float f14 = this.J;
            if (this.f36521x) {
                f12 = 0.76f;
            }
            ji0Var.setScaleX(f14 * f12);
        } else {
            ji0Var.animate().cancel();
            if (mi0Var.O0) {
                float f15 = this.J;
                if (this.f36521x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ji0Var.setScaleY(f15 * f10);
                float f16 = this.J;
                if (this.f36521x) {
                    f12 = 0.76f;
                }
                ji0Var.setScaleX(f16 * f12);
            } else {
                ji0Var.setScaleY(0.0f);
                ji0Var.setScaleX(0.0f);
            }
        }
        this.f36517n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        fi.u2 u2Var;
        Paint paint;
        if (this.f36521x && this.f36522y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.p0 p0Var = this.f36515e;
            mi0 mi0Var = this.Q;
            if (p0Var != null && p0Var.f5187a) {
                paint = mi0Var.J0;
            } else {
                paint = mi0Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        g5 g5Var = this.f36513b.f35502e;
        if (g5Var != null && (u2Var = g5Var.f34813k) != null) {
            int i10 = 0;
            if (this.E == 0) {
                u2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f36521x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                u2Var.J0(i10);
            }
        }
        ch.p0 p0Var2 = this.f36515e;
        if (p0Var2 != null && p0Var2.f5187a && this.G != null && org.telegram.messenger.qc.e(8200) && org.telegram.messenger.qc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            ch0 B = this.f36512a.getImageReceiver().B();
            di.ac acVar = this.G;
            if (B != null && (i7 = B.f33575b0) > 30) {
                f10 = Utilities.l((i7 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            acVar.f8224j = (int) (acVar.f8218b.size() * f10);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ji0 ji0Var;
        org.telegram.messenger.pz pzVar;
        org.telegram.messenger.pz pzVar2;
        org.telegram.messenger.pz pzVar3;
        ?? r14;
        org.telegram.messenger.pz pzVar4;
        TLRPC.Document document;
        org.telegram.messenger.pz pzVar5;
        int i7;
        mi0 mi0Var = this.Q;
        int i10 = mi0Var.N0;
        ji0 ji0Var2 = this.f36512a;
        ji0 ji0Var3 = this.f36513b;
        if (p0Var != null && p0Var.f5187a) {
            ji0Var2.getImageReceiver().w0(new ch0(2131624218, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ji0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232752));
            if (this.G == null) {
                if (org.telegram.messenger.gz.o() == 2) {
                    i7 = 45;
                } else {
                    i7 = 18;
                }
                this.G = new di.ac(1, i7);
            }
        } else if (i10 == 4 && p0Var != null && p0Var.f5191f != null) {
            ji0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5191f));
            ji0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5191f));
        } else {
            ch.p0 p0Var2 = this.f36515e;
            if (p0Var2.f5188b) {
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(mi0Var.K);
                long j3 = this.f36515e.f5192g;
                if (s12.f25309i8 != null) {
                    for (int i11 = 0; i11 < s12.f25309i8.documents.size(); i11++) {
                        if (s12.f25309i8.documents.get(i11).f28057id == j3) {
                            document = s12.f25309i8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.pz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, null);
                ImageReceiver imageReceiver = ji0Var3.getImageReceiver();
                org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document);
                if (this.f36518r) {
                    pzVar5 = null;
                } else {
                    pzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, pzVar5, 0L, "tgs", this.f36515e, 0);
            } else if (p0Var2.f5191f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(mi0Var.K).f26505r.get(this.f36515e.f5191f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.pz f11 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, null);
                    if (!org.telegram.messenger.qc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        ji0Var = ji0Var2;
                        boolean z10 = false;
                        pzVar = f11;
                        if (org.telegram.messenger.gz.o() > 0 && i10 != 4) {
                            ji0Var.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, pzVar, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = ji0Var3.getImageReceiver();
                            org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                            if (this.f36518r) {
                                pzVar3 = null;
                            } else {
                                pzVar3 = pzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, pzVar3, 0L, "tgs", this.f36515e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = ji0Var3.getImageReceiver();
                            org.telegram.messenger.gc b12 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                            if (this.f36518r) {
                                pzVar2 = null;
                            } else {
                                pzVar2 = pzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, pzVar2, 0L, "tgs", this.f36515e, 0);
                            r14 = z10;
                        }
                    } else {
                        pzVar = f11;
                        ji0Var = ji0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        ji0Var2.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, pzVar, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = ji0Var3.getImageReceiver();
                        org.telegram.messenger.gc b13 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                        if (this.f36518r) {
                            pzVar4 = null;
                        } else {
                            pzVar4 = pzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, pzVar4, 0L, "tgs", this.f36515e, 0);
                    }
                    if (ji0Var.getImageReceiver().B() != null) {
                        ji0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f36514c.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, pzVar, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f22303v0 = r14;
                    org.telegram.messenger.si.b0(mi0Var.K);
                    org.telegram.messenger.si.m1(imageReceiver5, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
                }
                ug.a1 a1Var = this.f36516f;
                if (a1Var != null) {
                    a1Var.setImageReceiver(ji0Var3.getImageReceiver());
                }
            }
        }
    }

    public final void f(ch.p0 p0Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z11 = this.f36521x;
        boolean contains = this.Q.f37267e0.contains(p0Var);
        this.f36521x = contains;
        if (contains != z11) {
            ji0 ji0Var = this.f36512a;
            ji0 ji0Var2 = this.f36513b;
            float f16 = 1.0f;
            if (!z10) {
                float f17 = this.J;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ji0Var2.setScaleX(f17 * f13);
                float f18 = this.J;
                if (this.f36521x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ji0Var2.setScaleY(f18 * f14);
                float f19 = this.J;
                if (this.f36521x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                ji0Var.setScaleX(f19 * f15);
                float f20 = this.J;
                if (this.f36521x) {
                    f16 = 0.76f;
                }
                ji0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = ji0Var2.animate();
                float f21 = this.J;
                if (this.f36521x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.J;
                if (this.f36521x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                ViewPropertyAnimator animate2 = ji0Var.animate();
                float f23 = this.J;
                if (this.f36521x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.J;
                if (this.f36521x) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(erVar).start();
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
        ch.p0 p0Var = this.f36515e;
        if (p0Var != null) {
            String str = p0Var.f5191f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        li0 li0Var;
        if (this.P) {
            mi0 mi0Var = this.Q;
            if (mi0Var.R == null) {
                int action = motionEvent.getAction();
                hi0 hi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = mi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((li0Var = mi0Var.f37274h0) == null || li0Var.r())) {
                        org.telegram.messenger.g0.i3(hi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((mi0Var.m0 == null || mi0Var.f37285o0 > 0.8f) && mi0Var.f37274h0 != null)) {
                    mi0Var.f37291s0 = true;
                    if (System.currentTimeMillis() - mi0Var.f37292t0 > 300) {
                        mi0Var.f37292t0 = System.currentTimeMillis();
                        li0 li0Var2 = mi0Var.f37274h0;
                        ch.p0 p0Var = this.f36515e;
                        if (mi0Var.f37285o0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        li0Var2.h(this, p0Var, z10, false);
                    }
                }
                if (!mi0Var.f37291s0 && mi0Var.m0 != null) {
                    mi0Var.f37286p0 = 0.0f;
                    float f10 = mi0Var.f37285o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new ai0(mi0Var, f10));
                    mi0Var.R.addListener(new zh0(mi0Var, 1));
                    mi0Var.R.setDuration(150L);
                    mi0Var.R.setInterpolator(er.f34419f);
                    mi0Var.R.start();
                }
                org.telegram.messenger.g0.r(hi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
