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
public final class vi0 extends FrameLayout {
    public int E;
    public boolean F;
    public di.ec G;
    public final si0 H;
    public boolean I;
    public float J;
    public ValueAnimator K;
    public final si0 L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final xi0 Q;
    public final ui0 f40836a;
    public final ui0 f40837b;
    public final ui0 f40838c;
    public final ImageReceiver d;
    public ch.p0 f40839e;
    public ug.b1 f40840f;
    public float h;
    public boolean f40841n;
    public boolean f40842r;
    public boolean f40843s;
    public boolean f40844w;
    public boolean f40845x;
    public boolean f40846y;

    public vi0(xi0 xi0Var, Context context) {
        super(context);
        this.Q = xi0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f40846y = true;
        this.H = new si0(this, 0);
        this.J = 1.0f;
        this.L = new si0(this, 1);
        this.P = true;
        ui0 ui0Var = new ui0(this, context, 0);
        this.f40836a = ui0Var;
        ui0 ui0Var2 = new ui0(this, context, 1);
        this.f40837b = ui0Var2;
        ui0Var.getImageReceiver().W(0);
        ui0Var.getImageReceiver().f22697v0 = false;
        ui0 ui0Var3 = new ui0(this, context, 2);
        this.f40838c = ui0Var3;
        addView(ui0Var, c8.ma.e(34, 34, 17));
        addView(ui0Var3, c8.ma.e(34, 34, 17));
        addView(ui0Var2, c8.ma.e(34, 34, 17));
        if (xi0Var.N0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        ui0Var.setLayerNum(Integer.MAX_VALUE);
        ui0Var2.setLayerNum(Integer.MAX_VALUE);
        ui0Var2.f38835a.W(0);
        ImageReceiver imageReceiver = ui0Var2.f38835a;
        imageReceiver.f22695u0 = false;
        imageReceiver.f22697v0 = false;
        ui0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(vi0 vi0Var, ch.p0 p0Var, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        ui0 ui0Var = vi0Var.f40838c;
        ui0 ui0Var2 = vi0Var.f40836a;
        ui0 ui0Var3 = vi0Var.f40837b;
        xi0 xi0Var = vi0Var.Q;
        vi0Var.f(p0Var, false);
        ch.p0 p0Var2 = vi0Var.f40839e;
        if (p0Var2 != null && p0Var2.equals(p0Var)) {
            vi0Var.E = i7;
            vi0Var.e(p0Var);
            return;
        }
        int i11 = xi0Var.K;
        org.telegram.ui.ActionBar.h6 h6Var = xi0Var.f42128l0;
        int i12 = xi0Var.N0;
        boolean q10 = org.telegram.messenger.k10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && p0Var.d && !q10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        vi0Var.I = z10;
        if (z10 && vi0Var.f40840f == null) {
            ug.b1 b1Var = new ug.b1(1, vi0Var.getContext(), null);
            vi0Var.f40840f = b1Var;
            b1Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            vi0Var.f40840f.setImageReceiver(ui0Var3.getImageReceiver());
            vi0Var.addView(vi0Var.f40840f, c8.ma.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.b1 b1Var2 = vi0Var.f40840f;
        if (b1Var2 != null) {
            if (vi0Var.I) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b1Var2.setVisibility(i10);
        }
        vi0Var.d();
        vi0Var.f40839e = p0Var;
        if (!p0Var.f5503a && (p0Var.f5507f == null || ((!xi0Var.q() && !xi0Var.H0) || !org.telegram.messenger.qc.e(8200)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        vi0Var.f40842r = z11;
        if (i12 == 4 || vi0Var.f40839e.f5504b) {
            vi0Var.f40842r = false;
        }
        ch.p0 p0Var3 = vi0Var.f40839e;
        if (!p0Var3.f5503a && p0Var3.f5507f == null) {
            ui0Var.getImageReceiver().f();
            ui0Var3.getImageReceiver().f();
            p5 p5Var = new p5(4, xi0Var.K, vi0Var.f40839e.f5508g);
            p5 p5Var2 = new p5(3, xi0Var.K, vi0Var.f40839e.f5508g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.m6.f29716v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.t6.x(vi0Var, p5Var, i13, h6Var, mode);
                org.telegram.ui.ActionBar.t6.x(vi0Var, p5Var2, i13, h6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                p5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                p5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            ui0Var.setAnimatedEmojiDrawable(p5Var);
            ui0Var3.setAnimatedEmojiDrawable(p5Var2);
            ug.b1 b1Var3 = vi0Var.f40840f;
            if (b1Var3 != null) {
                b1Var3.setAnimatedEmojiDrawable(p5Var2);
            }
        } else {
            vi0Var.e(p0Var);
            ui0Var.setAnimatedEmojiDrawable(null);
            if (ui0Var2.getImageReceiver().B() != null) {
                ui0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.b1 b1Var4 = vi0Var.f40840f;
            if (b1Var4 != null) {
                b1Var4.setAnimatedEmojiDrawable(null);
            }
        }
        vi0Var.setFocusable(true);
        boolean z12 = vi0Var.f40842r;
        vi0Var.f40843s = z12;
        if (!z12) {
            ui0Var2.setVisibility(8);
            ui0Var3.setVisibility(0);
            vi0Var.f40844w = true;
        } else {
            vi0Var.f40844w = false;
            ui0Var2.setVisibility(0);
            ui0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = ui0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = ui0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = ui0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = ui0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        ui0 ui0Var = this.f40837b;
        p5 p5Var = ui0Var.f38838e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38499k;
        } else {
            imageReceiver = ui0Var.f38835a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            xi0 xi0Var = this.Q;
            if (xi0Var.f42146y0 == null && !this.O && xi0Var.H0) {
                if (imageReceiver.B().f38206b0 <= 2) {
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
        if (!this.Q.f42126k0) {
            d();
            this.f40841n = true;
            if (!this.f40842r) {
                this.f40837b.setVisibility(0);
                ui0 ui0Var = this.f40837b;
                float f13 = this.J;
                if (this.f40845x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ui0Var.setScaleY(f13 * f11);
                ui0 ui0Var2 = this.f40837b;
                float f14 = this.J;
                if (!this.f40845x) {
                    f12 = 1.0f;
                }
                ui0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.H);
        if (this.f40842r) {
            if (this.f40836a.getImageReceiver().B() != null && !this.f40836a.getImageReceiver().B().y() && !this.f40841n) {
                this.f40841n = true;
                if (i7 == 0) {
                    this.F = false;
                    this.f40836a.getImageReceiver().B().stop();
                    this.f40836a.getImageReceiver().B().N(0, false, false);
                    this.H.run();
                    return;
                }
                this.F = true;
                this.f40836a.getImageReceiver().B().stop();
                this.f40836a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.h3(this.H, i7);
                return;
            }
            if (this.f40836a.getImageReceiver().B() != null && this.f40841n && !this.f40836a.getImageReceiver().B().f38219l0 && !this.f40836a.getImageReceiver().B().y()) {
                this.f40836a.getImageReceiver().B().N(this.f40836a.getImageReceiver().B().f38210e[0] - 1, false, false);
            }
            ui0 ui0Var3 = this.f40837b;
            float f15 = this.J;
            if (this.f40845x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            ui0Var3.setScaleY(f15 * f10);
            ui0 ui0Var4 = this.f40837b;
            float f16 = this.J;
            if (!this.f40845x) {
                f12 = 1.0f;
            }
            ui0Var4.setScaleX(f16 * f12);
        } else if (!this.f40841n) {
            this.J = 0.0f;
            this.f40837b.setScaleX(0.0f);
            this.f40837b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 10));
            this.K.setDuration(150L);
            this.K.setInterpolator(nr.h);
            this.K.setStartDelay(i7 * this.Q.f42107c);
            this.K.start();
            this.f40841n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z10 = this.f40842r;
        xi0 xi0Var = this.Q;
        float f12 = 1.0f;
        ui0 ui0Var = this.f40837b;
        if (z10) {
            org.telegram.messenger.g0.r(this.H);
            ui0 ui0Var2 = this.f40836a;
            if (ui0Var2.getImageReceiver().B() != null && !ui0Var2.getImageReceiver().B().y()) {
                ui0Var2.getImageReceiver().B().stop();
                if (xi0Var.f42126k0) {
                    ui0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    ui0Var2.getImageReceiver().B().N(ui0Var2.getImageReceiver().B().f38210e[0] - 1, false, true);
                }
            }
            ui0Var.setVisibility(4);
            ui0Var2.setVisibility(0);
            this.f40844w = false;
            float f13 = this.J;
            if (this.f40845x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            ui0Var.setScaleY(f13 * f11);
            float f14 = this.J;
            if (this.f40845x) {
                f12 = 0.76f;
            }
            ui0Var.setScaleX(f14 * f12);
        } else {
            ui0Var.animate().cancel();
            if (xi0Var.O0) {
                float f15 = this.J;
                if (this.f40845x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ui0Var.setScaleY(f15 * f10);
                float f16 = this.J;
                if (this.f40845x) {
                    f12 = 0.76f;
                }
                ui0Var.setScaleX(f16 * f12);
            } else {
                ui0Var.setScaleY(0.0f);
                ui0Var.setScaleX(0.0f);
            }
        }
        this.f40841n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        fi.s2 s2Var;
        Paint paint;
        if (this.f40845x && this.f40846y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.p0 p0Var = this.f40839e;
            xi0 xi0Var = this.Q;
            if (p0Var != null && p0Var.f5503a) {
                paint = xi0Var.J0;
            } else {
                paint = xi0Var.I0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        p5 p5Var = this.f40837b.f38838e;
        if (p5Var != null && (s2Var = p5Var.f38499k) != null) {
            int i10 = 0;
            if (this.E == 0) {
                s2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f40845x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                s2Var.J0(i10);
            }
        }
        ch.p0 p0Var2 = this.f40839e;
        if (p0Var2 != null && p0Var2.f5503a && this.G != null && org.telegram.messenger.qc.e(8200) && org.telegram.messenger.qc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            oh0 B = this.f40836a.getImageReceiver().B();
            di.ec ecVar = this.G;
            if (B != null && (i7 = B.f38206b0) > 30) {
                f10 = Utilities.l((i7 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            ecVar.f8763j = (int) (ecVar.f8757b.size() * f10);
            this.G.g(rectF);
            this.G.d();
            this.G.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ch.p0 p0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        ui0 ui0Var;
        org.telegram.messenger.mz mzVar;
        org.telegram.messenger.mz mzVar2;
        org.telegram.messenger.mz mzVar3;
        ?? r14;
        org.telegram.messenger.mz mzVar4;
        TLRPC.Document document;
        org.telegram.messenger.mz mzVar5;
        int i7;
        xi0 xi0Var = this.Q;
        int i10 = xi0Var.N0;
        ui0 ui0Var2 = this.f40836a;
        ui0 ui0Var3 = this.f40837b;
        if (p0Var != null && p0Var.f5503a) {
            ui0Var2.getImageReceiver().w0(new oh0(2131624218, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            ui0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232753));
            if (this.G == null) {
                if (org.telegram.messenger.cz.o() == 2) {
                    i7 = 45;
                } else {
                    i7 = 18;
                }
                this.G = new di.ec(1, i7);
            }
        } else if (i10 == 4 && p0Var != null && p0Var.f5507f != null) {
            ui0Var2.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5507f));
            ui0Var3.getImageReceiver().w0(org.telegram.messenger.j6.g(p0Var.f5507f));
        } else {
            ch.p0 p0Var2 = this.f40839e;
            if (p0Var2.f5504b) {
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(xi0Var.K);
                long j3 = this.f40839e.f5508g;
                if (u12.f25916n8 != null) {
                    for (int i11 = 0; i11 < u12.f25916n8.documents.size(); i11++) {
                        if (u12.f25916n8.documents.get(i11).f28440id == j3) {
                            document = u12.f25916n8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29546m6, 0.2f, null);
                ImageReceiver imageReceiver = ui0Var3.getImageReceiver();
                org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document);
                if (this.f40842r) {
                    mzVar5 = null;
                } else {
                    mzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, mzVar5, 0L, "tgs", this.f40839e, 0);
            } else if (p0Var2.f5507f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(xi0Var.K).f26847r.get(this.f40839e.f5507f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.mz f11 = org.telegram.messenger.u5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.m6.f29546m6, 0.2f, null);
                    if (!org.telegram.messenger.qc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        ui0Var = ui0Var2;
                        boolean z10 = false;
                        mzVar = f11;
                        if (org.telegram.messenger.cz.o() > 0 && i10 != 4) {
                            ui0Var.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, mzVar, 0L, "tgs", p0Var, 0);
                            ImageReceiver imageReceiver2 = ui0Var3.getImageReceiver();
                            org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                            if (this.f40842r) {
                                mzVar3 = null;
                            } else {
                                mzVar3 = mzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, mzVar3, 0L, "tgs", this.f40839e, 0);
                            r14 = z10;
                        } else {
                            ImageReceiver imageReceiver3 = ui0Var3.getImageReceiver();
                            org.telegram.messenger.gc b12 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                            if (this.f40842r) {
                                mzVar2 = null;
                            } else {
                                mzVar2 = mzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, mzVar2, 0L, "tgs", this.f40839e, 0);
                            r14 = z10;
                        }
                    } else {
                        mzVar = f11;
                        ui0Var = ui0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        ui0Var2.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, mzVar, 0L, "tgs", p0Var, 0);
                        ImageReceiver imageReceiver4 = ui0Var3.getImageReceiver();
                        org.telegram.messenger.gc b13 = org.telegram.messenger.gc.b(tL_availableReaction.select_animation);
                        if (this.f40842r) {
                            mzVar4 = null;
                        } else {
                            mzVar4 = mzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, mzVar4, 0L, "tgs", this.f40839e, 0);
                    }
                    if (ui0Var.getImageReceiver().B() != null) {
                        ui0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f40838c.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, mzVar, 0L, "tgs", p0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f22697v0 = r14;
                    org.telegram.messenger.si.d0(xi0Var.K);
                    org.telegram.messenger.si.p1(imageReceiver5, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
                }
                ug.b1 b1Var = this.f40840f;
                if (b1Var != null) {
                    b1Var.setImageReceiver(ui0Var3.getImageReceiver());
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
        boolean z11 = this.f40845x;
        boolean contains = this.Q.f42113e0.contains(p0Var);
        this.f40845x = contains;
        if (contains != z11) {
            ui0 ui0Var = this.f40836a;
            ui0 ui0Var2 = this.f40837b;
            float f16 = 1.0f;
            if (!z10) {
                float f17 = this.J;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                ui0Var2.setScaleX(f17 * f13);
                float f18 = this.J;
                if (this.f40845x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                ui0Var2.setScaleY(f18 * f14);
                float f19 = this.J;
                if (this.f40845x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                ui0Var.setScaleX(f19 * f15);
                float f20 = this.J;
                if (this.f40845x) {
                    f16 = 0.76f;
                }
                ui0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = ui0Var2.animate();
                float f21 = this.J;
                if (this.f40845x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.J;
                if (this.f40845x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                nr nrVar = nr.h;
                duration.setInterpolator(nrVar).start();
                ViewPropertyAnimator animate2 = ui0Var.animate();
                float f23 = this.J;
                if (this.f40845x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.J;
                if (this.f40845x) {
                    f16 = 0.76f;
                }
                scaleX2.scaleY(f24 * f16).setDuration(240L).setInterpolator(nrVar).start();
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
        ch.p0 p0Var = this.f40839e;
        if (p0Var != null) {
            String str = p0Var.f5507f;
            if (str != null) {
                accessibilityNodeInfo.setText(str);
                accessibilityNodeInfo.setEnabled(true);
                return;
            }
            accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(2131754890, null));
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        wi0 wi0Var;
        if (this.P) {
            xi0 xi0Var = this.Q;
            if (xi0Var.R == null) {
                int action = motionEvent.getAction();
                si0 si0Var = this.L;
                if (action == 0) {
                    this.O = true;
                    this.M = motionEvent.getX();
                    this.N = motionEvent.getY();
                    if (this.h == 1.0f && !this.I && (i7 = xi0Var.N0) != 3 && i7 != 4 && i7 != 5 && ((wi0Var = xi0Var.f42120h0) == null || wi0Var.o())) {
                        org.telegram.messenger.g0.h3(si0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.M - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.N - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.O && ((xi0Var.m0 == null || xi0Var.f42131o0 > 0.8f) && xi0Var.f42120h0 != null)) {
                    xi0Var.f42137s0 = true;
                    if (System.currentTimeMillis() - xi0Var.f42138t0 > 300) {
                        xi0Var.f42138t0 = System.currentTimeMillis();
                        wi0 wi0Var2 = xi0Var.f42120h0;
                        ch.p0 p0Var = this.f40839e;
                        if (xi0Var.f42131o0 > 0.8f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wi0Var2.g(this, p0Var, z10, false);
                    }
                }
                if (!xi0Var.f42137s0 && xi0Var.m0 != null) {
                    xi0Var.f42132p0 = 0.0f;
                    float f10 = xi0Var.f42131o0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xi0Var.R = ofFloat;
                    ofFloat.addUpdateListener(new li0(xi0Var, f10));
                    xi0Var.R.addListener(new ki0(xi0Var, 1));
                    xi0Var.R.setDuration(150L);
                    xi0Var.R.setInterpolator(nr.f37960f);
                    xi0Var.R.start();
                }
                org.telegram.messenger.g0.r(si0Var);
                this.O = false;
                return true;
            }
        }
        return false;
    }
}
