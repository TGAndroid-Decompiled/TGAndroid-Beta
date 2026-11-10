package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cj extends ul {
    public final r1.g A3;
    public boolean B3;
    public final Path C3;
    public boolean D3;
    public int E3;
    public final cn F3;
    public int f44368f3;
    public final ArrayList f44369g3;
    public final ArrayList f44370h3;
    public final ArrayList f44371i3;
    public final ArrayList j3;
    public final ArrayList f44372k3;
    public int f44373l3;
    public int f44374m3;
    public int f44375n3;
    public long f44376o3;
    public float f44377p3;
    public float f44378q3;
    public boolean f44379r3;
    public final float f44380s3;
    public final Paint f44381t3;
    public final Paint f44382u3;
    public final r1.f f44383v3;
    public final r1.g f44384w3;
    public final r1.f f44385x3;
    public final r1.g f44386y3;
    public final r1.f f44387z3;

    public cj(cn cnVar, Context context, an anVar) {
        super(cnVar, context, anVar);
        this.F3 = cnVar;
        this.f44369g3 = new ArrayList();
        this.f44370h3 = new ArrayList();
        this.f44371i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f44372k3 = new ArrayList(10);
        this.f44380s3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f44381t3 = paint;
        Paint paint2 = new Paint(1);
        this.f44382u3 = paint2;
        r1.f fVar = new r1.f(0.0f);
        this.f44383v3 = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.h = 0.0f;
        gVar.f54274g = 2000.0f;
        gVar.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 1500.0f, 1.0f);
        gVar.b(new r1.d(this) {
            public final cj f44078b;

            {
                this.f44078b = this;
            }

            @Override
            public final void a(r1.g gVar2, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f44078b.invalidate();
                        return;
                    case 1:
                        this.f44078b.invalidate();
                        return;
                    default:
                        this.f44078b.invalidate();
                        return;
                }
            }
        });
        this.f44384w3 = gVar;
        r1.f fVar2 = new r1.f(0.0f);
        this.f44385x3 = fVar2;
        r1.g gVar2 = new r1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 400.0f, 0.5f);
        gVar2.b(new r1.d(this) {
            public final cj f44078b;

            {
                this.f44078b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f44078b.invalidate();
                        return;
                    case 1:
                        this.f44078b.invalidate();
                        return;
                    default:
                        this.f44078b.invalidate();
                        return;
                }
            }
        });
        this.f44386y3 = gVar2;
        r1.f fVar3 = new r1.f(0.0f);
        this.f44387z3 = fVar3;
        r1.g gVar3 = new r1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 200.0f, 1.0f);
        gVar3.b(new r1.d(this) {
            public final cj f44078b;

            {
                this.f44078b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f44078b.invalidate();
                        return;
                    case 1:
                        this.f44078b.invalidate();
                        return;
                    default:
                        this.f44078b.invalidate();
                        return;
                }
            }
        });
        this.A3 = gVar3;
        this.C3 = new Path();
        this.E3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void A1(Canvas canvas, RectF rectF) {
        float f10;
        boolean z9;
        float f11;
        boolean z10;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.f44369g3;
        int size = arrayList2.size();
        cn cnVar = this.F3;
        boolean z11 = true;
        boolean z12 = false;
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i7);
                if (!cn.m2(cnVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.R1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    if (q1Var.b()) {
                        f14 = q1Var.getAlpha();
                    } else {
                        f14 = 1.0f;
                    }
                    q1Var.x1(f14, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f44370h3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!cn.m2(cnVar, q1Var2, rectF)) {
                    float R1 = q1Var2.R1(false) + q1Var2.getLeft();
                    float y10 = q1Var2.getY() + q1Var2.getPaddingTop();
                    if (q1Var2.b()) {
                        f13 = q1Var2.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(R1, y10);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.h1(canvas, f13);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f44371i3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (cn.m2(cnVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f21455l & z11) == 0) {
                        z10 = z11;
                    } else {
                        z10 = z12;
                    }
                    if (q1Var3.b()) {
                        f12 = q1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float R12 = q1Var3.R1(z12) + q1Var3.getLeft();
                    float y11 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.dj currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.cj cjVar = currentMessagesGroup.f22048m;
                        if (cjVar.f21871j) {
                            float R13 = q1Var3.R1(z11);
                            float f15 = cjVar.f21864a + R13 + cjVar.f21867e;
                            arrayList = arrayList4;
                            float f16 = cjVar.f21865b + cjVar.f21868f;
                            float f17 = cjVar.f21866c + R13 + cjVar.f21869g;
                            float f18 = cjVar.d + cjVar.h;
                            if (!cjVar.f21871j) {
                                f16 += q1Var3.getTranslationY();
                                f18 += q1Var3.getTranslationY();
                            }
                            canvas.clipRect(f15 + org.telegram.messenger.g0.L(8.0f), f16 + org.telegram.messenger.g0.L(8.0f), f17 - org.telegram.messenger.g0.L(8.0f), f18 - org.telegram.messenger.g0.L(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (q1Var3.getTransitionParams().f30874w0) {
                        canvas.translate(R12, y11);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.Q0(f12, canvas, z10);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z11 = true;
                z12 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.j3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!cn.m2(cnVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f21455l & 1) == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (q1Var4.b()) {
                        f11 = q1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float R14 = q1Var4.R1(false) + q1Var4.getLeft();
                    float y12 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.dj currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.cj cjVar2 = currentMessagesGroup2.f22048m;
                        if (cjVar2.f21871j) {
                            float R15 = q1Var4.R1(true);
                            float f19 = cjVar2.f21864a + R15 + cjVar2.f21867e;
                            float f20 = cjVar2.f21865b + cjVar2.f21868f;
                            float f21 = cjVar2.f21866c + R15 + cjVar2.f21869g;
                            float f22 = cjVar2.d + cjVar2.h;
                            if (!cjVar2.f21871j) {
                                f20 += q1Var4.getTranslationY();
                                f22 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f19 + org.telegram.messenger.g0.L(f10), f20 + org.telegram.messenger.g0.L(f10), f21 - org.telegram.messenger.g0.L(f10), f22 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z9 && q1Var4.getTransitionParams().f30874w0) {
                        canvas.translate(R14, y12);
                        q1Var4.setInvalidatesParent(true);
                        q1Var4.o1(canvas, f11, null);
                        q1Var4.V0(canvas, f11);
                        q1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void B1(boolean z9) {
        float f10;
        VelocityTracker velocityTracker;
        cn cnVar = this.F3;
        if (z9 && (velocityTracker = cnVar.z9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = cnVar.z9.getXVelocity();
        } else {
            f10 = 0.0f;
        }
        VelocityTracker velocityTracker2 = cnVar.z9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            cnVar.z9 = null;
        }
        cnVar.f44712w9 = false;
        cnVar.B0.R = true;
        org.telegram.ui.Components.s01 s01Var = cnVar.m0;
        if (s01Var != null) {
            s01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        org.telegram.messenger.dj T8;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        cn cnVar = this.F3;
        if (motionEvent != null) {
            cnVar.P4 = true;
        }
        if (cnVar.fa() && cnVar.f44672t9 == null) {
            if (motionEvent == null) {
                if (cnVar.f44712w9) {
                    B1(false);
                }
                cnVar.f44698v9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z10 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
                    if (!z10 && !cnVar.z9() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cnVar.f44698v9 = z11;
                    if (!z11) {
                        cnVar.f44712w9 = false;
                    } else {
                        cnVar.f44712w9 = false;
                        cnVar.f44725x9 = motionEvent.getX();
                        cnVar.f44738y9 = motionEvent.getY();
                        VelocityTracker velocityTracker = cnVar.z9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        cnVar.z9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (cnVar.f44698v9 || cnVar.f44712w9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = cnVar.z9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - cnVar.f44725x9;
                        float abs = Math.abs(motionEvent.getY() - cnVar.f44738y9);
                        if (cnVar.f44698v9 && !cnVar.f44712w9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && cnVar.z8() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            cnVar.B0.R = false;
                            cnVar.f44698v9 = false;
                            cnVar.f44712w9 = true;
                            cnVar.f44725x9 = motionEvent.getX();
                            org.telegram.ui.Components.s01 s01Var = cnVar.m0;
                            ValueAnimator valueAnimator = s01Var.J;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s01Var.J = null;
                            }
                            org.telegram.messenger.g0.v1(cnVar.l1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (cnVar.f44712w9) {
                            cnVar.m0.setProgress((-(motionEvent.getX() - cnVar.f44725x9)) / cnVar.m0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (cnVar.f44712w9) {
                            VelocityTracker velocityTracker3 = cnVar.z9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z12 = false;
                            }
                            B1(z12);
                        }
                        cnVar.f44698v9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !cnVar.A9 && !cnVar.f44685u9 && cnVar.f44672t9 == null) {
            z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
            if (!z9) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y10 = motionEvent.getY() - pressedChildView.getY();
                        if (t0Var.S()) {
                            org.telegram.ui.Wallet.d4 d4Var = t0Var.I0;
                            float f12 = (x11 - t0Var.K0) - (t0Var.f30338j0 / 2.0f);
                            float paddingTop = (y10 - t0Var.L0) - t0Var.getPaddingTop();
                            org.telegram.ui.Wallet.c4 c4Var = d4Var.f42324m;
                            if (c4Var != null && c4Var.f57503n && d4Var.f42342w.contains((int) f12, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (cnVar.f44672t9 != null) {
                    cn.e2(cnVar, 0.0f);
                }
                cnVar.f44672t9 = pressedChildView;
                org.telegram.messenger.ij a22 = cn.a2(cnVar);
                boolean U6 = cnVar.U6(a22);
                int i7 = cnVar.f44492f4;
                if ((i7 == 0 || i7 == 5 || i7 == 8 || (i7 == 3 && cnVar.f44643r4 == cnVar.getUserConfig().e())) && (((arrayList = cnVar.o4) == null || !arrayList.contains(a22)) && ((cnVar.Z8(a22) != 1 || (org.telegram.messenger.ij.B0(a22.f23266k) != cnVar.f44440b7 && !a22.m5())) && ((cnVar.h != null || a22.e1() >= 0) && (((chat2 = cnVar.f44473e) == null || !org.telegram.messenger.t3.c0(chat2) || U6) && !cnVar.z9() && (!org.telegram.messenger.ij.c3(a22.f23266k) || !a22.N3())))))) {
                    this.f44375n3 = motionEvent.getPointerId(0);
                    cnVar.f44685u9 = true;
                    this.f44373l3 = (int) motionEvent.getX();
                    this.f44374m3 = (int) motionEvent.getY();
                    return;
                }
                cn.e2(cnVar, 0.0f);
                cnVar.f44672t9 = null;
                return;
            }
        }
        if (cnVar.f44672t9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f44375n3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f44373l3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f44374m3);
            if (getScrollState() == 0 && cnVar.f44685u9 && !cnVar.A9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                cnVar.f44672t9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                cnVar.B0.R = false;
                cnVar.f44685u9 = false;
                cnVar.A9 = true;
                this.f44373l3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (cnVar.A9) {
                if (Math.abs(max) >= org.telegram.messenger.g0.L(50.0f)) {
                    if (!this.f44379r3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f44379r3 = true;
                    }
                } else {
                    this.f44379r3 = false;
                }
                float f13 = max;
                cn.e2(cnVar, f13);
                org.telegram.messenger.ij a23 = cn.a2(cnVar);
                if (a23 != null && (a23.h4() || org.telegram.messenger.ij.L4(a23.f23266k))) {
                    cnVar.ud(false, false);
                }
                View view = cnVar.f44672t9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f13);
                }
                invalidate();
            }
        } else if (cnVar.f44672t9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f44375n3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = cnVar.f44672t9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f11 = ((org.telegram.ui.Cells.q1) view2).R1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    f11 = ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.ij a24 = cn.a2(cnVar);
                    boolean U62 = cnVar.U6(a24);
                    wj wjVar = cnVar.f44448c1;
                    if ((wjVar != null && wjVar.getVisibility() == 0 && ((!cnVar.W0 || !U62) && !a24.V1)) || ((chat = cnVar.f44473e) != null && ((org.telegram.messenger.t3.r0(chat) && !cnVar.ea()) || ((org.telegram.messenger.t3.T(cnVar.f44473e) && !org.telegram.messenger.t3.w(5, cnVar.f44473e) && !cnVar.f44473e.megagroup) || !org.telegram.messenger.t3.n(cnVar.f44473e))))) {
                        if (a24.c1() != 0 && (T8 = cnVar.T8(a24.c1())) != null && (ijVar = T8.h) != null) {
                            a24 = ijVar;
                        }
                        cnVar.D5 = a24;
                        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
                        h.putBoolean("quote", true);
                        h.putBoolean("reply_to", true);
                        cnVar.fb(h, a24);
                        h.putInt("messagesCount", 1);
                        h.putBoolean("canSelectTopics", true);
                        zw zwVar = new zw(h);
                        zwVar.D2 = cnVar;
                        cnVar.presentFragment(zwVar);
                    } else {
                        cnVar.hc(cn.a2(cnVar));
                    }
                }
            }
            View view3 = cnVar.f44672t9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f10 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                f10 = ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset();
            } else {
                f10 = 0.0f;
            }
            this.f44378q3 = f10;
            if (f10 == 0.0f) {
                cnVar.f44672t9 = null;
            }
            this.f44376o3 = System.currentTimeMillis();
            this.f44377p3 = 0.0f;
            invalidate();
            cnVar.f44685u9 = false;
            cnVar.A9 = false;
            cnVar.B0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != q1Var && (childAt instanceof org.telegram.ui.Cells.q1)) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    q1Var2.setSlidingOffset(f10);
                    q1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override
    public final boolean F0(View view) {
        if (view.getVisibility() != 4 && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.F3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        cn cnVar = this.F3;
        cnVar.I8 = null;
        canvas.save();
        if (cnVar.f44635qa != null && cnVar.ma) {
            boolean z9 = cnVar.f44597na;
        }
        this.E1.setEmpty();
        if (cnVar.f44536ia != 0.0f) {
            int save = canvas.save();
            if (cnVar.f44622pa != 0.0f) {
                f10 = (cnVar.f44741z0.getMeasuredHeight() - cnVar.f44536ia) * cnVar.f44622pa;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-cnVar.f44536ia) - f10;
            cnVar.Ua = f11;
            canvas.translate(0.0f, f11);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r23, android.view.View r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z9) {
        org.telegram.messenger.dj currentMessagesGroup;
        super.j1(view, f10, f11, z9);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.q1)) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            q1Var2.setPressed(z9);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.F3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wh.i iVar;
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.F3;
        rl rlVar = cnVar.s9;
        rlVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(rlVar.f30673f0);
            rlVar.f30699z = false;
        }
        if (!this.V1 && ((iVar = cnVar.f44661sa) == null || !iVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || cnVar.f44712w9) {
                    return true;
                }
            } else {
                return onInterceptTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = this.f44368f3;
        int i14 = i11 - i7;
        cn cnVar = this.F3;
        if (i13 != i14) {
            if (i13 != 0) {
                cnVar.F9(false);
            }
            this.f44368f3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.E3 != measuredHeight) {
            this.D3 = true;
            ej ejVar = cnVar.A0;
            if (ejVar != null) {
                ejVar.g();
            }
            cnVar.f44585m9.a();
            this.D3 = false;
            this.E3 = measuredHeight;
        }
        cnVar.f44520h6 = false;
        rl rlVar = cnVar.s9;
        if (rlVar != null && rlVar.x()) {
            cnVar.s9.w();
        }
        cnVar.M9();
        cnVar.ca();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        xo xoVar;
        cn cnVar = this.F3;
        te.a aVar = cnVar.f44431ad;
        rl rlVar = cnVar.s9;
        rlVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(rlVar.f30673f0);
            rlVar.f30699z = false;
        }
        if (motionEvent.getAction() == 0) {
            cnVar.Na = true;
        }
        if (cnVar.f44536ia != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, cnVar.f44536ia / org.telegram.messenger.g0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (xoVar = cnVar.f44563ka) != null && !xoVar.R) {
                if (xoVar.K != 1.0f) {
                    float f10 = cnVar.f44536ia;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                    cnVar.f44574la = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final cj f43695b;

                        {
                            this.f43695b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    cn cnVar2 = this.f43695b.F3;
                                    cnVar2.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    cnVar2.f44741z0.invalidate();
                                    return;
                                case 1:
                                    cn cnVar3 = this.f43695b.F3;
                                    cnVar3.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    cnVar3.f44741z0.invalidate();
                                    return;
                                case 2:
                                    cn cnVar4 = this.f43695b.F3;
                                    cnVar4.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    cnVar4.f44741z0.invalidate();
                                    return;
                                default:
                                    cn cnVar5 = this.f43695b.F3;
                                    cnVar5.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    cnVar5.f44741z0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
                    ofFloat.setInterpolator(wqVar);
                    ofFloat.start();
                    final xo xoVar2 = cnVar.f44563ka;
                    dh dhVar = new dh(this, 3);
                    AnimatorSet animatorSet = xoVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        xoVar2.J.cancel();
                    }
                    xoVar2.Y = dhVar;
                    xoVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xoVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xo xoVar3 = xoVar2;
                                    xoVar3.getClass();
                                    xoVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xoVar3.T.invalidate();
                                    View view = xoVar3.f51754a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xo xoVar4 = xoVar2;
                                    xoVar4.getClass();
                                    xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xoVar4.f51754a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(xoVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xo xoVar3 = xoVar2;
                                    xoVar3.getClass();
                                    xoVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xoVar3.T.invalidate();
                                    View view = xoVar3.f51754a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    xo xoVar4 = xoVar2;
                                    xoVar4.getClass();
                                    xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = xoVar4.f51754a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    xoVar2.J.addListener(new va(xoVar2, 8));
                    xoVar2.J.playTogether(ofFloat2, ofFloat3);
                    xoVar2.J.setDuration(120L);
                    xoVar2.J.setInterpolator(wqVar);
                    xoVar2.J.start();
                } else {
                    cn.f2(cnVar);
                }
            } else {
                xo xoVar3 = cnVar.f44563ka;
                if (xoVar3 != null && xoVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    xo xoVar4 = cnVar.f44563ka;
                    if (currentTimeMillis - xoVar4.U < 500 && xoVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        cnVar.f44574la = animatorSet2;
                        if (cnVar.f44563ka != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(cnVar.f44536ia, org.telegram.messenger.g0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final cj f43695b;

                            {
                                this.f43695b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        cn cnVar2 = this.f43695b.F3;
                                        cnVar2.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar2.f44741z0.invalidate();
                                        return;
                                    case 1:
                                        cn cnVar3 = this.f43695b.F3;
                                        cnVar3.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar3.f44741z0.invalidate();
                                        return;
                                    case 2:
                                        cn cnVar4 = this.f43695b.F3;
                                        cnVar4.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar4.f44741z0.invalidate();
                                        return;
                                    default:
                                        cn cnVar5 = this.f43695b.F3;
                                        cnVar5.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar5.f44741z0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final cj f43695b;

                            {
                                this.f43695b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        cn cnVar2 = this.f43695b.F3;
                                        cnVar2.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar2.f44741z0.invalidate();
                                        return;
                                    case 1:
                                        cn cnVar3 = this.f43695b.F3;
                                        cnVar3.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar3.f44741z0.invalidate();
                                        return;
                                    case 2:
                                        cn cnVar4 = this.f43695b.F3;
                                        cnVar4.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar4.f44741z0.invalidate();
                                        return;
                                    default:
                                        cn cnVar5 = this.f43695b.F3;
                                        cnVar5.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        cnVar5.f44741z0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(mi.l.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(cnVar.f44536ia, 0.0f);
                cnVar.f44574la = ofFloat6;
                if (cnVar.f44563ka != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final cj f43695b;

                    {
                        this.f43695b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                cn cnVar2 = this.f43695b.F3;
                                cnVar2.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                cnVar2.f44741z0.invalidate();
                                return;
                            case 1:
                                cn cnVar3 = this.f43695b.F3;
                                cnVar3.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                cnVar3.f44741z0.invalidate();
                                return;
                            case 2:
                                cn cnVar4 = this.f43695b.F3;
                                cnVar4.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                cnVar4.f44741z0.invalidate();
                                return;
                            default:
                                cn cnVar5 = this.f43695b.F3;
                                cnVar5.f44536ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                cnVar5.f44741z0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(mi.l.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
                C1(motionEvent);
                if (cnVar.A9 || cnVar.f44712w9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.F3.f44483e9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        org.telegram.ui.Components.ck0 b42;
        org.telegram.ui.Components.p71 p71Var;
        super.requestDisallowInterceptTouchEvent(z9);
        View view = this.F3.f44672t9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (b42 = ((org.telegram.ui.Cells.q1) view).b4()) != null && (p71Var = b42.f32689d0) != null && b42.f32690e0 && p71Var.f36829w && !p71Var.E) {
                if (p71Var.f36830x) {
                    if (!p71Var.f36831y && (p71Var.L & 3) != 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D3) {
            return;
        }
        jh.a aVar = this.F3.f44663sc;
        if (aVar.f17010b != 0) {
            int childCount = aVar.f17009a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                aVar.f17009a.getChildAt(i7).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(v4.l0 l0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(l0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            cn cnVar = this.F3;
            cnVar.L9();
            cnVar.N9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i7;
        int i10;
        float f10;
        char c10;
        cn cnVar;
        float f11;
        org.telegram.messenger.dj djVar;
        int i11;
        float f12;
        int i12;
        boolean z9;
        org.telegram.messenger.dj djVar2;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.cj cjVar;
        boolean z10;
        char c11;
        int i14;
        org.telegram.messenger.dj currentMessagesGroup;
        int i15;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.l lVar2;
        int measuredHeight2;
        cj cjVar2 = this;
        Canvas canvas2 = canvas;
        int childCount = cjVar2.getChildCount();
        org.telegram.messenger.dj djVar3 = null;
        int i19 = 0;
        while (true) {
            i7 = 8;
            i10 = 2;
            f10 = 0.0f;
            c10 = 0;
            cnVar = cjVar2.F3;
            if (i19 < childCount) {
                View childAt = cjVar2.getChildAt(i19);
                f11 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!cn.m2(cnVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (cnVar.C0.f47625n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                            float measuredHeight3 = ((((cjVar2.getMeasuredHeight() - cnVar.N9) - cnVar.Wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + cnVar.N9;
                            if (!((org.telegram.ui.Cells.f0) childAt).I && !cnVar.f44741z0.V1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                            float measuredHeight4 = ((((cjVar2.getMeasuredHeight() - cnVar.N9) - cnVar.Wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + cnVar.N9;
                            if (!((org.telegram.ui.Cells.ra) childAt).O && !cnVar.f44741z0.V1) {
                                if (childAt.getTop() > measuredHeight4) {
                                    childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                org.telegram.messenger.dj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                                if (currentMessagesGroup2 != null && currentMessagesGroup2 == djVar3) {
                                    i16 = i19;
                                    z11 = true;
                                } else {
                                    org.telegram.messenger.aj currentPosition = q1Var.getCurrentPosition();
                                    org.telegram.ui.Components.i90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                    if ((!backgroundDrawable.f34572f && !q1Var.y2()) || (currentPosition != null && (2 & currentPosition.f21455l) == 0)) {
                                        i16 = i19;
                                        z11 = true;
                                    } else {
                                        boolean z12 = q1Var.f30070w6;
                                        org.telegram.ui.ActionBar.h6 h6Var = cjVar2.f36980n2;
                                        z11 = true;
                                        if (z12 || q1Var.f30083x6) {
                                            i16 = i19;
                                            if (currentPosition == null) {
                                                Paint W0 = cjVar2.W0("paintChatMessageBackgroundSelected");
                                                an anVar = cnVar.f44750za;
                                                if ((anVar != null && anVar.f43739q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.m6.f27829a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28232vd, h6Var));
                                                } else {
                                                    if (!cnVar.U9()) {
                                                        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                                        measuredHeight = lVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = cnVar.f44741z0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - cnVar.l1.getBackgroundTranslationY();
                                                    int backgroundSizeY = cnVar.l1.getBackgroundSizeY();
                                                    an anVar2 = cnVar.f44750za;
                                                    if (anVar2 != null) {
                                                        anVar2.b(q1Var.getX(), backgroundTranslationY, cjVar2.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.m6.r(q1Var.getX(), backgroundTranslationY, cjVar2.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), cjVar2.getMeasuredWidth(), q1Var.getBottom(), paint);
                                                paint.setAlpha(alpha);
                                                canvas2.restore();
                                            }
                                        } else {
                                            int y10 = (int) q1Var.getY();
                                            canvas2.save();
                                            if (currentPosition == null) {
                                                i17 = q1Var.getMeasuredHeight();
                                                i16 = i19;
                                            } else {
                                                int measuredHeight5 = q1Var.getMeasuredHeight() + y10;
                                                long j3 = 0;
                                                float f13 = 0.0f;
                                                int i20 = 0;
                                                while (i20 < childCount) {
                                                    View childAt2 = cjVar2.getChildAt(i20);
                                                    int i21 = i19;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.i90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i18 = i20;
                                                            y10 = Math.min(y10, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j10 = backgroundDrawable2.f34577l;
                                                            if (j10 > j3) {
                                                                j3 = j10;
                                                                f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f13 = q1Var2.getY() + backgroundDrawable2.f34574i;
                                                            }
                                                            i20 = i18 + 1;
                                                            i19 = i21;
                                                        }
                                                    }
                                                    i18 = i20;
                                                    i20 = i18 + 1;
                                                    i19 = i21;
                                                }
                                                i16 = i19;
                                                backgroundDrawable.f34575j = f10;
                                                backgroundDrawable.f34576k = f13 - y10;
                                                i17 = measuredHeight5 - y10;
                                            }
                                            int i22 = i17 + y10;
                                            canvas2.clipRect(0, y10, cjVar2.getMeasuredWidth(), i22);
                                            Paint W02 = cjVar2.W0("paintChatMessageBackgroundSelected");
                                            an anVar3 = cnVar.f44750za;
                                            if (anVar3 != null && !anVar3.f43739q && W02 != null) {
                                                backgroundDrawable.f34569b = W02;
                                                if (!cnVar.U9()) {
                                                    lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                                                    measuredHeight2 = lVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = cnVar.f44741z0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - cnVar.l1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = cnVar.l1.getBackgroundSizeY();
                                                an anVar4 = cnVar.f44750za;
                                                if (anVar4 != null) {
                                                    anVar4.b(q1Var.getX(), backgroundTranslationY2, cjVar2.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.m6.r(q1Var.getX(), backgroundTranslationY2, cjVar2.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f34569b = null;
                                                backgroundDrawable.f34568a.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28232vd, h6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y10, cjVar2.getMeasuredWidth(), i22);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    djVar3 = currentMessagesGroup2;
                                }
                                if (cnVar.X8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
                                    canvas2.save();
                                    canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                    if (q1Var.getScaleX() != 1.0f) {
                                        canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                    }
                                    q1Var.M0(canvas2, z11, false);
                                    canvas2.restore();
                                }
                            } else {
                                i16 = i19;
                                if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                    if (t0Var.Q()) {
                                        canvas2.save();
                                        canvas2.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                                        canvas2.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                                        canvas2.translate(cnVar.m9() / 2.0f, 0.0f);
                                        t0Var.E(canvas2, true);
                                        t0Var.H(canvas2, true);
                                        canvas2.restore();
                                    }
                                }
                            }
                            i19 = i16 + 1;
                        }
                    }
                }
                i16 = i19;
                i19 = i16 + 1;
            } else {
                f11 = 1.0f;
                break;
            }
        }
        View view = cnVar.X8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            djVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            djVar = null;
        }
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = cjVar2.f44372k3;
            arrayList2.clear();
            if (i23 == i10 && !cnVar.f44741z0.V1) {
                i11 = i7;
                i12 = i10;
                f12 = f10;
            } else {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = cnVar.f44741z0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= cnVar.f44741z0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.cj cjVar3 = currentMessagesGroup.f22048m;
                            if (i23 == 0) {
                                i14 = i7;
                                i15 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i24++;
                                    i7 = i14;
                                    i10 = 2;
                                    f10 = 0.0f;
                                }
                            } else {
                                i14 = i7;
                                i15 = 1;
                            }
                            if ((i23 != i15 || cjVar3.f21870i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.ya) && (i23 == i10 || !q1Var3.ya))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    cjVar3.f21864a = 0;
                                    cjVar3.f21865b = 0;
                                    cjVar3.f21866c = 0;
                                    cjVar3.d = 0;
                                    cjVar3.f21873l = false;
                                    cjVar3.f21872k = false;
                                    cjVar3.f21874m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                cjVar3.f21872k = q1Var3.I2();
                                cjVar3.f21873l = q1Var3.H2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f21455l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f21455l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.ya) {
                                    cjVar3.f21874m = q1Var3;
                                }
                                int i27 = cjVar3.f21865b;
                                if (i27 == 0 || i25 < i27) {
                                    cjVar3.f21865b = i25;
                                }
                                int i28 = cjVar3.d;
                                if (i28 == 0 || i26 > i28) {
                                    cjVar3.d = i26;
                                }
                                int i29 = cjVar3.f21864a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    cjVar3.f21864a = backgroundDrawableLeft;
                                }
                                int i30 = cjVar3.f21866c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    cjVar3.f21866c = backgroundDrawableRight;
                                }
                            }
                            i24++;
                            i7 = i14;
                            i10 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i14 = i7;
                    i24++;
                    i7 = i14;
                    i10 = 2;
                    f10 = 0.0f;
                }
                i11 = i7;
                int i31 = 0;
                while (i31 < arrayList2.size()) {
                    org.telegram.messenger.dj djVar4 = (org.telegram.messenger.dj) arrayList2.get(i31);
                    org.telegram.messenger.cj cjVar4 = djVar4.f22048m;
                    ArrayList arrayList3 = djVar4.d;
                    float R1 = cjVar4.f21874m.R1(true);
                    float f14 = cjVar4.f21864a + R1 + cjVar4.f21867e;
                    float f15 = cjVar4.f21865b + cjVar4.f21868f;
                    float f16 = cjVar4.f21869g + cjVar4.f21866c + R1;
                    float f17 = cjVar4.d + cjVar4.h;
                    if (!cjVar4.f21871j) {
                        f15 += cjVar4.f21874m.getTranslationY();
                        f17 += cjVar4.f21874m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + cnVar.f44741z0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + cnVar.f44741z0.getMeasuredHeight();
                    }
                    if (cjVar4.f21874m.getScaleX() == f11 && cjVar4.f21874m.getScaleY() == f11) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9) {
                        canvas2.save();
                        djVar2 = djVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(cjVar4.f21874m.getScaleX(), cjVar4.f21874m.getScaleY(), com.google.android.recaptcha.internal.a.A(f16, f14, 2.0f, f14), com.google.android.recaptcha.internal.a.A(f17, f18, 2.0f, f18));
                    } else {
                        djVar2 = djVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size) {
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList3.get(i32);
                            cjVar = cjVar4;
                            if (org.telegram.messenger.ij.B0(ijVar.f23266k) == cnVar.f44545j6) {
                                c11 = 0;
                            } else {
                                c11 = 1;
                            }
                            if (cnVar.f44582m6[c11].indexOfKey(ijVar.e1()) < 0) {
                                z10 = false;
                                break;
                            } else {
                                i32++;
                                cjVar4 = cjVar;
                            }
                        } else {
                            cjVar = cjVar4;
                            z10 = true;
                            break;
                        }
                    }
                    float f19 = f17;
                    cn cnVar2 = cnVar;
                    boolean z13 = z10;
                    org.telegram.messenger.dj djVar5 = djVar2;
                    cjVar.f21874m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, cjVar.f21872k, cjVar.f21873l, z13, 0);
                    if (djVar5 != djVar) {
                        cjVar.f21874m = null;
                    }
                    cjVar.f21876o = djVar5.f22040c;
                    if (z9) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = cnVar2.f44741z0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == djVar5) {
                                    int left = q1Var4.getLeft();
                                    int top = q1Var4.getTop();
                                    childAt4.setPivotX(((f16 - f14) / 2.0f) + (f14 - left));
                                    childAt4.setPivotY(((f19 - f18) / 2.0f) + (f18 - top));
                                }
                            }
                        }
                    }
                    i31++;
                    canvas2 = canvas;
                    cnVar = cnVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            }
            canvas2 = canvas;
            cnVar = cnVar;
            i7 = i11;
            f10 = f12;
            i10 = i12;
            c10 = c10;
            i23++;
            cjVar2 = this;
        }
    }
}
