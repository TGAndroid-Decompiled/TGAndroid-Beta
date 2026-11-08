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
public final class gi0 extends FrameLayout {
    public int D;
    public boolean E;
    public bi.ud F;
    public final di0 G;
    public boolean H;
    public float I;
    public ValueAnimator J;
    public final di0 K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ii0 P;
    public final fi0 f33949a;
    public final fi0 f33950b;
    public final fi0 f33951c;
    public final ImageReceiver d;
    public ch.o0 f33952e;
    public ug.z0 f33953f;
    public float h;
    public boolean f33954n;
    public boolean f33955r;
    public boolean f33956s;
    public boolean f33957w;
    public boolean f33958x;
    public boolean f33959y;

    public gi0(ii0 ii0Var, Context context) {
        super(context);
        this.P = ii0Var;
        this.d = new ImageReceiver(null);
        this.h = 1.0f;
        this.f33959y = true;
        this.G = new di0(this, 0);
        this.I = 1.0f;
        this.K = new di0(this, 1);
        this.O = true;
        fi0 fi0Var = new fi0(this, context, 0);
        this.f33949a = fi0Var;
        fi0 fi0Var2 = new fi0(this, context, 1);
        this.f33950b = fi0Var2;
        fi0Var.getImageReceiver().W(0);
        fi0Var.getImageReceiver().f21222u0 = false;
        fi0 fi0Var3 = new fi0(this, context, 2);
        this.f33951c = fi0Var3;
        addView(fi0Var, c8.ha.e(34, 34, 17));
        addView(fi0Var3, c8.ha.e(34, 34, 17));
        addView(fi0Var2, c8.ha.e(34, 34, 17));
        if (ii0Var.M0 == 4) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(100L);
            layoutTransition.enableTransitionType(4);
            setLayoutTransition(layoutTransition);
        }
        fi0Var.setLayerNum(Integer.MAX_VALUE);
        fi0Var2.setLayerNum(Integer.MAX_VALUE);
        fi0Var2.f35600a.W(0);
        ImageReceiver imageReceiver = fi0Var2.f35600a;
        imageReceiver.f21220t0 = false;
        imageReceiver.f21222u0 = false;
        fi0Var3.setLayerNum(Integer.MAX_VALUE);
    }

    public static void a(gi0 gi0Var, ch.o0 o0Var, int i7) {
        boolean z9;
        boolean z10;
        int i10;
        fi0 fi0Var = gi0Var.f33951c;
        fi0 fi0Var2 = gi0Var.f33949a;
        fi0 fi0Var3 = gi0Var.f33950b;
        ii0 ii0Var = gi0Var.P;
        gi0Var.f(o0Var, false);
        ch.o0 o0Var2 = gi0Var.f33952e;
        if (o0Var2 != null && o0Var2.equals(o0Var)) {
            gi0Var.D = i7;
            gi0Var.e(o0Var);
            return;
        }
        int i11 = ii0Var.J;
        org.telegram.ui.ActionBar.f6 f6Var = ii0Var.f34704k0;
        int i12 = ii0Var.M0;
        boolean q10 = org.telegram.messenger.p10.i(i11).q();
        if ((i12 == 3 && !q10) || (i12 == 5 && o0Var.d && !q10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        gi0Var.H = z9;
        if (z9 && gi0Var.f33953f == null) {
            ug.z0 z0Var = new ug.z0(1, gi0Var.getContext(), null);
            gi0Var.f33953f = z0Var;
            z0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            gi0Var.f33953f.setImageReceiver(fi0Var3.getImageReceiver());
            gi0Var.addView(gi0Var.f33953f, c8.ha.d(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
        }
        ug.z0 z0Var2 = gi0Var.f33953f;
        if (z0Var2 != null) {
            if (gi0Var.H) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z0Var2.setVisibility(i10);
        }
        gi0Var.d();
        gi0Var.f33952e = o0Var;
        if (!o0Var.f6352a && (o0Var.f6356f == null || ((!ii0Var.q() && !ii0Var.G0) || !org.telegram.messenger.sc.e(8200)))) {
            z10 = false;
        } else {
            z10 = true;
        }
        gi0Var.f33955r = z10;
        if (i12 == 4 || gi0Var.f33952e.f6353b) {
            gi0Var.f33955r = false;
        }
        ch.o0 o0Var3 = gi0Var.f33952e;
        if (!o0Var3.f6352a && o0Var3.f6356f == null) {
            fi0Var.getImageReceiver().f();
            fi0Var3.getImageReceiver().f();
            i5 i5Var = new i5(4, ii0Var.J, gi0Var.f33952e.f6357g);
            i5 i5Var2 = new i5(3, ii0Var.J, gi0Var.f33952e.f6357g);
            if (i12 != 1 && i12 != 2 && i12 != 4) {
                int i13 = org.telegram.ui.ActionBar.k6.f28187v6;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.r6.y(gi0Var, i5Var, i13, f6Var, mode);
                org.telegram.ui.ActionBar.r6.y(gi0Var, i5Var2, i13, f6Var, mode);
            } else {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                i5Var.setColorFilter(new PorterDuffColorFilter(-1, mode2));
                i5Var2.setColorFilter(new PorterDuffColorFilter(-1, mode2));
            }
            fi0Var.setAnimatedEmojiDrawable(i5Var);
            fi0Var3.setAnimatedEmojiDrawable(i5Var2);
            ug.z0 z0Var3 = gi0Var.f33953f;
            if (z0Var3 != null) {
                z0Var3.setAnimatedEmojiDrawable(i5Var2);
            }
        } else {
            gi0Var.e(o0Var);
            fi0Var.setAnimatedEmojiDrawable(null);
            if (fi0Var2.getImageReceiver().B() != null) {
                fi0Var2.getImageReceiver().B().N(0, false, false);
            }
            ug.z0 z0Var4 = gi0Var.f33953f;
            if (z0Var4 != null) {
                z0Var4.setAnimatedEmojiDrawable(null);
            }
        }
        gi0Var.setFocusable(true);
        boolean z11 = gi0Var.f33955r;
        gi0Var.f33956s = z11;
        if (!z11) {
            fi0Var2.setVisibility(8);
            fi0Var3.setVisibility(0);
            gi0Var.f33957w = true;
        } else {
            gi0Var.f33957w = false;
            fi0Var2.setVisibility(0);
            fi0Var3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = fi0Var3.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = fi0Var3.getLayoutParams();
        int L = org.telegram.messenger.g0.L(34.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        ViewGroup.LayoutParams layoutParams3 = fi0Var2.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = fi0Var2.getLayoutParams();
        int L2 = org.telegram.messenger.g0.L(34.0f);
        layoutParams4.height = L2;
        layoutParams3.width = L2;
    }

    public final void b() {
        ImageReceiver imageReceiver;
        fi0 fi0Var = this.f33950b;
        i5 i5Var = fi0Var.f35603e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34541k;
        } else {
            imageReceiver = fi0Var.f35600a;
        }
        if (imageReceiver != null && imageReceiver.B() != null) {
            ii0 ii0Var = this.P;
            if (ii0Var.f34722x0 == null && !this.N && ii0Var.G0) {
                if (imageReceiver.B().f40989a0 <= 2) {
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
        if (!this.P.f34702j0) {
            d();
            this.f33954n = true;
            if (!this.f33955r) {
                this.f33950b.setVisibility(0);
                fi0 fi0Var = this.f33950b;
                float f13 = this.I;
                if (this.f33958x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                fi0Var.setScaleY(f13 * f11);
                fi0 fi0Var2 = this.f33950b;
                float f14 = this.I;
                if (!this.f33958x) {
                    f12 = 1.0f;
                }
                fi0Var2.setScaleX(f14 * f12);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.r(this.G);
        if (this.f33955r) {
            if (this.f33949a.getImageReceiver().B() != null && !this.f33949a.getImageReceiver().B().y() && !this.f33954n) {
                this.f33954n = true;
                if (i7 == 0) {
                    this.E = false;
                    this.f33949a.getImageReceiver().B().stop();
                    this.f33949a.getImageReceiver().B().N(0, false, false);
                    this.G.run();
                    return;
                }
                this.E = true;
                this.f33949a.getImageReceiver().B().stop();
                this.f33949a.getImageReceiver().B().N(0, false, false);
                org.telegram.messenger.g0.i3(this.G, i7);
                return;
            }
            if (this.f33949a.getImageReceiver().B() != null && this.f33954n && !this.f33949a.getImageReceiver().B().f41003k0 && !this.f33949a.getImageReceiver().B().y()) {
                this.f33949a.getImageReceiver().B().N(this.f33949a.getImageReceiver().B().f40995e[0] - 1, false, false);
            }
            fi0 fi0Var3 = this.f33950b;
            float f15 = this.I;
            if (this.f33958x) {
                f10 = 0.76f;
            } else {
                f10 = 1.0f;
            }
            fi0Var3.setScaleY(f15 * f10);
            fi0 fi0Var4 = this.f33950b;
            float f16 = this.I;
            if (!this.f33958x) {
                f12 = 1.0f;
            }
            fi0Var4.setScaleX(f16 * f12);
        } else if (!this.f33954n) {
            this.I = 0.0f;
            this.f33950b.setScaleX(0.0f);
            this.f33950b.setScaleY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 8));
            this.J.setDuration(150L);
            this.J.setInterpolator(xq.h);
            this.J.setStartDelay(i7 * this.P.f34685c);
            this.J.start();
            this.f33954n = true;
        }
    }

    public final void d() {
        float f10;
        float f11;
        boolean z9 = this.f33955r;
        ii0 ii0Var = this.P;
        float f12 = 1.0f;
        fi0 fi0Var = this.f33950b;
        if (z9) {
            org.telegram.messenger.g0.r(this.G);
            fi0 fi0Var2 = this.f33949a;
            if (fi0Var2.getImageReceiver().B() != null && !fi0Var2.getImageReceiver().B().y()) {
                fi0Var2.getImageReceiver().B().stop();
                if (ii0Var.f34702j0) {
                    fi0Var2.getImageReceiver().B().N(0, false, true);
                } else {
                    fi0Var2.getImageReceiver().B().N(fi0Var2.getImageReceiver().B().f40995e[0] - 1, false, true);
                }
            }
            fi0Var.setVisibility(4);
            fi0Var2.setVisibility(0);
            this.f33957w = false;
            float f13 = this.I;
            if (this.f33958x) {
                f11 = 0.76f;
            } else {
                f11 = 1.0f;
            }
            fi0Var.setScaleY(f13 * f11);
            float f14 = this.I;
            if (this.f33958x) {
                f12 = 0.76f;
            }
            fi0Var.setScaleX(f14 * f12);
        } else {
            fi0Var.animate().cancel();
            if (ii0Var.N0) {
                float f15 = this.I;
                if (this.f33958x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                fi0Var.setScaleY(f15 * f10);
                float f16 = this.I;
                if (this.f33958x) {
                    f12 = 0.76f;
                }
                fi0Var.setScaleX(f16 * f12);
            } else {
                fi0Var.setScaleY(0.0f);
                fi0Var.setScaleX(0.0f);
            }
        }
        this.f33954n = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        di.z2 z2Var;
        Paint paint;
        if (this.f33958x && this.f33959y) {
            float measuredWidth = getMeasuredWidth() >> 1;
            float measuredHeight = getMeasuredHeight() >> 1;
            float measuredWidth2 = (getMeasuredWidth() >> 1) - org.telegram.messenger.g0.L(1.0f);
            ch.o0 o0Var = this.f33952e;
            ii0 ii0Var = this.P;
            if (o0Var != null && o0Var.f6352a) {
                paint = ii0Var.I0;
            } else {
                paint = ii0Var.H0;
            }
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, paint);
        }
        i5 i5Var = this.f33950b.f35603e;
        if (i5Var != null && (z2Var = i5Var.f34541k) != null) {
            int i10 = 0;
            if (this.D == 0) {
                z2Var.K0(org.telegram.messenger.g0.L(6.0f), 0, 0, org.telegram.messenger.g0.L(6.0f));
            } else {
                if (this.f33958x) {
                    i10 = org.telegram.messenger.g0.L(6.0f);
                }
                z2Var.J0(i10);
            }
        }
        ch.o0 o0Var2 = this.f33952e;
        if (o0Var2 != null && o0Var2.f6352a && this.F != null && org.telegram.messenger.sc.e(8200) && org.telegram.messenger.sc.e(131072)) {
            RectF rectF = org.telegram.messenger.g0.P;
            float height = ((int) (getHeight() * 0.7f)) / 2.0f;
            rectF.set((getWidth() / 2.0f) - height, (getHeight() / 2.0f) - height, (getWidth() / 2.0f) + height, (getHeight() / 2.0f) + height);
            zg0 B = this.f33949a.getImageReceiver().B();
            bi.ud udVar = this.F;
            if (B != null && (i7 = B.f40989a0) > 30) {
                f10 = Utilities.l((i7 - 30) / 30.0f);
            } else {
                f10 = 0.0f;
            }
            udVar.f4850j = (int) (udVar.f4844b.size() * f10);
            this.F.g(rectF);
            this.F.d();
            this.F.a(canvas, -673522);
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void e(ch.o0 o0Var) {
        TLRPC.TL_availableReaction tL_availableReaction;
        fi0 fi0Var;
        org.telegram.messenger.rz rzVar;
        org.telegram.messenger.rz rzVar2;
        org.telegram.messenger.rz rzVar3;
        ?? r14;
        org.telegram.messenger.rz rzVar4;
        TLRPC.Document document;
        org.telegram.messenger.rz rzVar5;
        int i7;
        ii0 ii0Var = this.P;
        int i10 = ii0Var.M0;
        fi0 fi0Var2 = this.f33949a;
        fi0 fi0Var3 = this.f33950b;
        if (o0Var != null && o0Var.f6352a) {
            fi0Var2.getImageReceiver().w0(new zg0(2131624217, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f)));
            fi0Var3.getImageReceiver().w0(getContext().getResources().getDrawable(2131232751));
            if (this.F == null) {
                if (org.telegram.messenger.iz.o() == 2) {
                    i7 = 45;
                } else {
                    i7 = 18;
                }
                this.F = new bi.ud(1, i7);
            }
        } else if (i10 == 4 && o0Var != null && o0Var.f6356f != null) {
            fi0Var2.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f6356f));
            fi0Var3.getImageReceiver().w0(org.telegram.messenger.i6.g(o0Var.f6356f));
        } else {
            ch.o0 o0Var2 = this.f33952e;
            if (o0Var2.f6353b) {
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ii0Var.J);
                long j3 = this.f33952e.f6357g;
                if (s12.f24802h8 != null) {
                    for (int i11 = 0; i11 < s12.f24802h8.documents.size(); i11++) {
                        if (s12.f24802h8.documents.get(i11).f26962id == j3) {
                            document = s12.f24802h8.documents.get(i11);
                            break;
                        }
                    }
                }
                document = null;
                org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f28017m6, 0.2f, null);
                ImageReceiver imageReceiver = fi0Var3.getImageReceiver();
                org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
                if (this.f33955r) {
                    rzVar5 = null;
                } else {
                    rzVar5 = f10;
                }
                imageReceiver.r0(b10, "60_60_firstframe", null, null, rzVar5, 0L, "tgs", this.f33952e, 0);
            } else if (o0Var2.f6356f != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(ii0Var.J).f25836r.get(this.f33952e.f6356f);
                if (tL_availableReaction2 != null) {
                    org.telegram.messenger.rz f11 = org.telegram.messenger.t5.f(tL_availableReaction2.activate_animation, org.telegram.ui.ActionBar.k6.f28017m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200) || i10 == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        fi0Var = fi0Var2;
                        boolean z9 = false;
                        rzVar = f11;
                        if (org.telegram.messenger.iz.o() > 0 && i10 != 4) {
                            fi0Var.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                            ImageReceiver imageReceiver2 = fi0Var3.getImageReceiver();
                            org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                            if (this.f33955r) {
                                rzVar3 = null;
                            } else {
                                rzVar3 = rzVar;
                            }
                            imageReceiver2.r0(b11, "60_60_firstframe", null, null, rzVar3, 0L, "tgs", this.f33952e, 0);
                            r14 = z9;
                        } else {
                            ImageReceiver imageReceiver3 = fi0Var3.getImageReceiver();
                            org.telegram.messenger.hc b12 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                            if (this.f33955r) {
                                rzVar2 = null;
                            } else {
                                rzVar2 = rzVar;
                            }
                            imageReceiver3.r0(b12, "60_60_firstframe", null, null, rzVar2, 0L, "tgs", this.f33952e, 0);
                            r14 = z9;
                        }
                    } else {
                        rzVar = f11;
                        fi0Var = fi0Var2;
                        r14 = 0;
                        tL_availableReaction = tL_availableReaction2;
                        fi0Var2.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, rzVar, 0L, "tgs", o0Var, 0);
                        ImageReceiver imageReceiver4 = fi0Var3.getImageReceiver();
                        org.telegram.messenger.hc b13 = org.telegram.messenger.hc.b(tL_availableReaction.select_animation);
                        if (this.f33955r) {
                            rzVar4 = null;
                        } else {
                            rzVar4 = rzVar;
                        }
                        imageReceiver4.r0(b13, "60_60_pcache", null, null, rzVar4, 0L, "tgs", this.f33952e, 0);
                    }
                    if (fi0Var.getImageReceiver().B() != null) {
                        fi0Var.getImageReceiver().B().N(r14, r14, true);
                    }
                    this.f33951c.getImageReceiver().r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, rzVar, 0L, "tgs", o0Var, 0);
                    ImageReceiver imageReceiver5 = this.d;
                    imageReceiver5.f21222u0 = r14;
                    org.telegram.messenger.ui.b0(ii0Var.J);
                    org.telegram.messenger.ui.m1(imageReceiver5, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                }
                ug.z0 z0Var = this.f33953f;
                if (z0Var != null) {
                    z0Var.setImageReceiver(fi0Var3.getImageReceiver());
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
        boolean z10 = this.f33958x;
        boolean contains = this.P.f34688d0.contains(o0Var);
        this.f33958x = contains;
        if (contains != z10) {
            fi0 fi0Var = this.f33949a;
            fi0 fi0Var2 = this.f33950b;
            float f16 = 1.0f;
            if (!z9) {
                float f17 = this.I;
                if (contains) {
                    f13 = 0.76f;
                } else {
                    f13 = 1.0f;
                }
                fi0Var2.setScaleX(f17 * f13);
                float f18 = this.I;
                if (this.f33958x) {
                    f14 = 0.76f;
                } else {
                    f14 = 1.0f;
                }
                fi0Var2.setScaleY(f18 * f14);
                float f19 = this.I;
                if (this.f33958x) {
                    f15 = 0.76f;
                } else {
                    f15 = 1.0f;
                }
                fi0Var.setScaleX(f19 * f15);
                float f20 = this.I;
                if (this.f33958x) {
                    f16 = 0.76f;
                }
                fi0Var.setScaleY(f20 * f16);
            } else {
                ViewPropertyAnimator animate = fi0Var2.animate();
                float f21 = this.I;
                if (this.f33958x) {
                    f10 = 0.76f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f21 * f10);
                float f22 = this.I;
                if (this.f33958x) {
                    f11 = 0.76f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f22 * f11).setDuration(240L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate2 = fi0Var.animate();
                float f23 = this.I;
                if (this.f33958x) {
                    f12 = 0.76f;
                } else {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f23 * f12);
                float f24 = this.I;
                if (this.f33958x) {
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
        ch.o0 o0Var = this.f33952e;
        if (o0Var != null) {
            String str = o0Var.f6356f;
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
        hi0 hi0Var;
        if (this.O) {
            ii0 ii0Var = this.P;
            if (ii0Var.Q == null) {
                int action = motionEvent.getAction();
                di0 di0Var = this.K;
                if (action == 0) {
                    this.N = true;
                    this.L = motionEvent.getX();
                    this.M = motionEvent.getY();
                    if (this.h == 1.0f && !this.H && (i7 = ii0Var.M0) != 3 && i7 != 4 && i7 != 5 && ((hi0Var = ii0Var.f34696g0) == null || hi0Var.v())) {
                        org.telegram.messenger.g0.i3(di0Var, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() != 2 || (Math.abs(this.L - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.M - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.N && ((ii0Var.f34706l0 == null || ii0Var.f34708n0 > 0.8f) && ii0Var.f34696g0 != null)) {
                    ii0Var.f34713r0 = true;
                    if (System.currentTimeMillis() - ii0Var.f34715s0 > 300) {
                        ii0Var.f34715s0 = System.currentTimeMillis();
                        hi0 hi0Var2 = ii0Var.f34696g0;
                        ch.o0 o0Var = this.f33952e;
                        if (ii0Var.f34708n0 > 0.8f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        hi0Var2.i(this, o0Var, z9, false);
                    }
                }
                if (!ii0Var.f34713r0 && ii0Var.f34706l0 != null) {
                    ii0Var.f34709o0 = 0.0f;
                    float f10 = ii0Var.f34708n0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ii0Var.Q = ofFloat;
                    ofFloat.addUpdateListener(new wh0(ii0Var, f10));
                    ii0Var.Q.addListener(new vh0(ii0Var, 1));
                    ii0Var.Q.setDuration(150L);
                    ii0Var.Q.setInterpolator(xq.f40366f);
                    ii0Var.Q.start();
                }
                org.telegram.messenger.g0.r(di0Var);
                this.N = false;
                return true;
            }
        }
        return false;
    }
}
