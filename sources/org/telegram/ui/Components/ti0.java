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
public final class ti0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ec G;
    public final qi0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final qi0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final vi0 Q;
    public final si0 f40009a;
    public final si0 f40010b;
    public final si0 f40011c;
    public final ImageReceiver d;
    public ch.p0 f40012e;
    public ug.c1 f40013f;
    public float h;
    public boolean f40014n;
    public boolean f40015r;
    public boolean f40016s;
    public boolean f40017w;
    public boolean f40018x;
    public boolean f40019y;

    public ti0(vi0 vi0Var, Context context) {
        super(context);
        this.Q = vi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f40019y = true;
        this.H = new qi0(this, 0);
        this.J = 1.0f;
        this.L = new qi0(this, 1);
        this.P = true;
        si0 si0Var = new si0(this, context, 0);
        this.f40009a = si0Var;
        si0 si0Var2 = new si0(this, context, 1);
        this.f40010b = si0Var2;
        si0Var.getImageReceiver().W(0);
        si0Var.getImageReceiver().f22666v0 = false;
        si0 si0Var3 = new si0(this, context, 2);
        this.f40011c = si0Var3;
        addView(si0Var, c8.ma.e(34, 34, 17));
        addView(si0Var3, c8.ma.e(34, 34, 17));
        addView(si0Var2, c8.ma.e(34, 34, 17));
        if (vi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        si0Var.setLayerNum(Integer.MAX_VALUE);
        si0Var2.setLayerNum(Integer.MAX_VALUE);
        si0Var2.f38742a.W(0);
        ImageReceiver imageReceiver = si0Var2.f38742a;
        imageReceiver.f22664u0 = false;
        imageReceiver.f22666v0 = false;
        si0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(ti0 ti0Var, ch.p0 p0Var, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        si0 si0Var = ti0Var.f40011c;
        si0 si0Var2 = ti0Var.f40009a;
        si0 si0Var3 = ti0Var.f40010b;
        vi0 vi0Var = ti0Var.Q;
        ti0Var.f(p0Var, false);
        ch.p0 p0Var2 = ti0Var.f40012e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            ti0Var.E = i7;
            ti0Var.e(p0Var);
            return;
        }
        int i11 = vi0Var.K;
        org.telegram.ui.ActionBar.i6 i6Var = vi0Var.f40665l0;
        int i12 = vi0Var.N0;
        boolean q10 = org.telegram.messenger.j10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && p0Var.d && !q10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ti0Var.I = z10;
        if (z10 && ti0Var.f40013f == null) {
            ug.c1 c1Var = new ug.c1(1, ti0Var.getContext(), null);
            ti0Var.f40013f = c1Var;
            c1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ti0Var.f40013f.setImageReceiver(si0Var3.getImageReceiver());
            ti0Var.addView(ti0Var.f40013f, c8.ma.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.c1 c1Var2 = ti0Var.f40013f;
        if (c1Var2 != null) {
            if (ti0Var.I) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            c1Var2.setVisibility(i10);
        }
        ti0Var.d();
        ti0Var.f40012e = p0Var;
        if (!p0Var.f5471a && (p0Var.f5475f == null || ((!vi0Var.q() && !vi0Var.H0) || !org.telegram.messenger.pc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        ti0Var.f40015r = z11;
        if (i12 == 4 || ti0Var.f40012e.f5472b) {
            ti0Var.f40015r = false;
        }
        ch.p0 p0Var3 = ti0Var.f40012e;
        if (!p0Var3.f5471a && p0Var3.f5475f == null) {
            si0Var.getImageReceiver().f();
            si0Var3.getImageReceiver().f();
            o5 o5Var = new o5(4, vi0Var.K, ti0Var.f40012e.f5476g);
            o5 o5Var2 = new o5(3, vi0Var.K, ti0Var.f40012e.f5476g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.n6.f29729v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.u6.x(ti0Var, o5Var, i13, i6Var, mode);
                org.telegram.ui.ActionBar.u6.x(ti0Var, o5Var2, i13, i6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                o5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                o5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            si0Var.setAnimatedEmojiDrawable(o5Var);
            si0Var3.setAnimatedEmojiDrawable(o5Var2);
            ug.c1 c1Var3 = ti0Var.f40013f;
            if (c1Var3 != null) {
                c1Var3.setAnimatedEmojiDrawable(o5Var2);
            }
        } else {
            ti0Var.e(p0Var);
            si0Var.setAnimatedEmojiDrawable(null);
            if (si0Var2.getImageReceiver().B() != null) {
                si0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.c1 c1Var4 = ti0Var.f40013f;
            if (c1Var4 != null) {
                c1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        ti0Var.setFocusable(true);
        boolean z12 = ti0Var.f40015r;
        ti0Var.f40016s = z12;
        if (!z12) {
            si0Var2.setVisibility(8);
            si0Var3.setVisibility(0);
            ti0Var.f40017w = true;
        } else {
            ti0Var.f40017w = false;
            si0Var2.setVisibility(0);
            si0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = si0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = si0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = si0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = si0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        si0 si0Var = this.f40010b;
        o5 o5Var = si0Var.f38745e;
        if (o5Var != null) {
            imageReceiver = o5Var.f37976k;
        } else {
            imageReceiver = si0Var.f38742a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            vi0 vi0Var = this.Q;
            if (vi0Var.f40683y0 == null && !this.O && vi0Var.H0) {
                if (imageReceiver.B().f37482b0 <= 2) {
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
        if (!this.Q.f40663k0) {
            d();
            this.f40014n = true;
            if (!this.f40015r) {
                this.f40010b.setVisibility(0);
                si0 si0Var = this.f40010b;
                float f13 = this.J;
                if (this.f40018x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                si0Var.setScaleY(f13 * f11);
                si0 si0Var2 = this.f40010b;
                float f14 = this.J;
                if (!this.f40018x) {
                    f12 = 1.0f;
                }
                si0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.H);
        if (this.f40015r) {
            if (this.f40009a.getImageReceiver().B() != null && !this.f40009a.getImageReceiver().B().y() && !this.f40014n) {
                this.f40014n = true;
                if (i7 == 0) {
                    this.F = false;
                    this.f40009a.getImageReceiver().B().stop();
                    this.f40009a.getImageReceiver().B().N(0, false, false);
                    this.H.run();
                    return;
                }
                this.F = true;
                this.f40009a.getImageReceiver().B().stop();
                this.f40009a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.h3(this.H, i7);
                return;
            }
            if (this.f40009a.getImageReceiver().B() != null && this.f40014n && !this.f40009a.getImageReceiver().B().f37495l0 && !this.f40009a.getImageReceiver().B().y()) {
                this.f40009a.getImageReceiver().B().N(this.f40009a.getImageReceiver().B().f37486e[0] - 1, false, false);
            }
            si0 si0Var3 = this.f40010b;
            float f15 = this.J;
            if (this.f40018x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            si0Var3.setScaleY(f15 * f10);
            si0 si0Var4 = this.f40010b;
            float f16 = this.J;
            if (!this.f40018x) {
                f12 = 1.0f;
            }
            si0Var4.setScaleX(f16 * f12);
        } else if (!this.f40014n) {
            this.J = 0.0f;
            this.f40010b.setScaleX(0.0f);
            this.f40010b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 10));
            this.K.setDuration(150L);
            this.K.setInterpolator(lr.h);
            this.K.setStartDelay(i7 * this.Q.f40644c);
            this.K.start();
            this.f40014n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z10 = this.f40015r;
        vi0 vi0Var = this.Q;
        float f12 = 1.0f;
        si0 si0Var = this.f40010b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            si0 si0Var2 = this.f40009a;
            if (si0Var2.getImageReceiver().B() != null && !si0Var2.getImageReceiver().B().y()) {
                si0Var2.getImageReceiver().B().stop();
                if (vi0Var.f40663k0) {
                    si0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    si0Var2.getImageReceiver().B().N(si0Var2.getImageReceiver().B().f37486e[0] - 1, false, true);
                }
            }
            si0Var.setVisibility(4);
            si0Var2.setVisibility(0);
            this.f40017w = false;
            float f13 = this.J;
            if (this.f40018x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            si0Var.setScaleY(f13 * f11);
            float f14 = this.J;
            if (this.f40018x) {
                f12 = 0.76f;
            }
            si0Var.setScaleX(f14 * f12);
        } else {
            si0Var.animate().cancel();
            if (vi0Var.O0) {
                float f15 = this.J;
                if (this.f40018x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                si0Var.setScaleY(f15 * f10);
                float f16 = this.J;
                if (this.f40018x) {
                    f12 = 0.76f;
                }
                si0Var.setScaleX(f16 * f12);
            } else {
                si0Var.setScaleY(0.0f);
                si0Var.setScaleX(0.0f);
            }
        }
        this.f40014n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        fi.s2 s2Var;
        Paint paint;
        if (this.f40018x && this.f40019y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.p0 p0Var = this.f40012e;
            vi0 vi0Var = this.Q;
            if (p0Var != null && p0Var.f5471a) {
                paint = vi0Var.J0;
            } else {
                paint = vi0Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        o5 o5Var = this.f40010b.f38745e;
        if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
            int i10 = 0;
            if (this.E == 0) {
                s2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f40018x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                s2Var.J0(i10);
            }
        }
        ch.p0 p0Var2 = this.f40012e;
        if (p0Var2 != null && p0Var2.f5471a && this.G != null && org.telegram.messenger.pc.e(8200) && org.telegram.messenger.pc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            mh0 B = this.f40009a.getImageReceiver().B();
            di.ec ecVar = this.G;
            if (B != null && (i7 = B.f37482b0) > 30) {
                f10 = Utilities.l((i7 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            ecVar.f8737j = (int) (ecVar.f8731b.size() * f10);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        si0 si0Var;
        org.telegram.messenger.lz lzVar;
        org.telegram.messenger.lz lzVar2;
        org.telegram.messenger.lz lzVar3;
        ?? r14;
        org.telegram.messenger.lz lzVar4;
        TLRPC.Document document;
        org.telegram.messenger.lz lzVar5;
        int i7;
        vi0 vi0Var = this.Q;
        int i10 = vi0Var.N0;
        si0 si0Var2 = this.f40009a;
        si0 si0Var3 = this.f40010b;
        if (p0Var != null && p0Var.f5471a) {
            si0Var2.getImageReceiver().w0(new mh0(2131624218, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            si0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232753));
            if (this.G == null) {
                if (org.telegram.messenger.bz.o() == 2) {
                    i7 = 45;
                } else {
                    i7 = 18;
                }
                this.G = new di.ec(1, i7);
            }
        } else if (i10 == 4 && p0Var != null && p0Var.f5475f != null) {
            si0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5475f));
            si0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5475f));
        } else {
            ch.p0 p0Var2 = this.f40012e;
            if (p0Var2.f5472b) {
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(vi0Var.K);
                long j3 = this.f40012e.f5476g;
                if (u12.f25717n8 != null) {
                    for (int i11 = 0; i11 < u12.f25717n8.documents.size(); i11++) {
                        if (u12.f25717n8.documents.get(i11).f28409id == j3) {
                            document = u12.f25717n8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, null);
                ImageReceiver imageReceiver = si0Var3.getImageReceiver();
                org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
                if (this.f40015r) {
                    lzVar5 = null;
                } else {
                    lzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, lzVar5, 0L, "tgs", this.f40012e, 0);
            } else if (p0Var2.f5475f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(vi0Var.K).f26633r.get(this.f40012e.f5475f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.lz f11 = org.telegram.messenger.u5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, null);
                    if (!org.telegram.messenger.pc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        si0Var = si0Var2;
                        boolean z10 = false;
                        lzVar = f11;
                        if (org.telegram.messenger.bz.o() > 0 && i10 != 4) {
                            si0Var.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, lzVar, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = si0Var3.getImageReceiver();
                            org.telegram.messenger.fc b11 = org.telegram.messenger.fc.b(tL_availableReaction.select_animation);
                            if (this.f40015r) {
                                lzVar3 = null;
                            } else {
                                lzVar3 = lzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, lzVar3, 0L, "tgs", this.f40012e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = si0Var3.getImageReceiver();
                            org.telegram.messenger.fc b12 = org.telegram.messenger.fc.b(tL_availableReaction.select_animation);
                            if (this.f40015r) {
                                lzVar2 = null;
                            } else {
                                lzVar2 = lzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, lzVar2, 0L, "tgs", this.f40012e, 0);
                            r14 = z10;
                        }
                    } else {
                        lzVar = f11;
                        si0Var = si0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        si0Var2.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, lzVar, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = si0Var3.getImageReceiver();
                        org.telegram.messenger.fc b13 = org.telegram.messenger.fc.b(tL_availableReaction.select_animation);
                        if (this.f40015r) {
                            lzVar4 = null;
                        } else {
                            lzVar4 = lzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, lzVar4, 0L, "tgs", this.f40012e, 0);
                    }
                    if (si0Var.getImageReceiver().B() != null) {
                        si0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f40011c.getImageReceiver().r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, lzVar, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f22666v0 = r14;
                    org.telegram.messenger.ri.d0(vi0Var.K);
                    org.telegram.messenger.ri.p1(imageReceiver5, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                }
                ug.c1 c1Var = this.f40013f;
                if (c1Var != null) {
                    c1Var.setImageReceiver(si0Var3.getImageReceiver());
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
        boolean z11 = this.f40018x;
        boolean contains = this.Q.f40650e0.contains(p0Var);
        this.f40018x = contains;
        if (contains != z11) {
            si0 si0Var = this.f40009a;
            si0 si0Var2 = this.f40010b;
            float f16 = 1.0f;
            if (!z10) {
                float f17 = this.J;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                si0Var2.setScaleX(f17 * f13);
                float f18 = this.J;
                if (this.f40018x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                si0Var2.setScaleY(f18 * f14);
                float f19 = this.J;
                if (this.f40018x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                si0Var.setScaleX(f19 * f15);
                float f20 = this.J;
                if (this.f40018x) {
                    f16 = 0.76f;
                }
                si0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = si0Var2.animate();
                float f21 = this.J;
                if (this.f40018x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.J;
                if (this.f40018x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                lr lrVar = lr.h;
                duration.setInterpolator(lrVar).start();
                ViewPropertyAnimator animate2 = si0Var.animate();
                float f23 = this.J;
                if (this.f40018x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.J;
                if (this.f40018x) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(lrVar).start();
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
        ch.p0 p0Var = this.f40012e;
        if (p0Var != null) {
            String str = p0Var.f5475f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.M0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        ui0 ui0Var;
        if (this.P) {
            vi0 vi0Var = this.Q;
            if (vi0Var.R == null) {
                int action = motionEvent.getAction();
                qi0 qi0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = vi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((ui0Var = vi0Var.f40657h0) == null || ui0Var.o())) {
                        org.telegram.messenger.g0.h3(qi0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((vi0Var.m0 == null || vi0Var.f40668o0 > 0.8f) && vi0Var.f40657h0 != null)) {
                    vi0Var.f40674s0 = true;
                    if (System.currentTimeMillis() - vi0Var.f40675t0 > 300) {
                        vi0Var.f40675t0 = System.currentTimeMillis();
                        ui0 ui0Var2 = vi0Var.f40657h0;
                        ch.p0 p0Var = this.f40012e;
                        if (vi0Var.f40668o0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ui0Var2.g(this, p0Var, z10, false);
                    }
                }
                if (!vi0Var.f40674s0 && vi0Var.m0 != null) {
                    vi0Var.f40669p0 = 0.0f;
                    float f10 = vi0Var.f40668o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new ji0(vi0Var, f10));
                    vi0Var.R.addListener(new ii0(vi0Var, 1));
                    vi0Var.R.setDuration(150L);
                    vi0Var.R.setInterpolator(lr.f37208f);
                    vi0Var.R.start();
                }
                org.telegram.messenger.g0.r(qi0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
