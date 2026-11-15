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
public final class aj extends sl {
    public final r1.f A3;
    public final r1.g B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final an G3;
    public int f45061g3;
    public final ArrayList f45062h3;
    public final ArrayList f45063i3;
    public final ArrayList j3;
    public final ArrayList f45064k3;
    public final ArrayList f45065l3;
    public int f45066m3;
    public int f45067n3;
    public int f45068o3;
    public long f45069p3;
    public float f45070q3;
    public float f45071r3;
    public boolean f45072s3;
    public final float f45073t3;
    public final Paint f45074u3;
    public final Paint f45075v3;
    public final r1.f f45076w3;
    public final r1.g f45077x3;
    public final r1.f f45078y3;
    public final r1.g f45079z3;

    public aj(an anVar, Context context, ym ymVar) {
        super(anVar, context, ymVar);
        this.G3 = anVar;
        this.f45062h3 = new ArrayList();
        this.f45063i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f45064k3 = new ArrayList();
        this.f45065l3 = new ArrayList(10);
        this.f45073t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f45074u3 = paint;
        Paint paint2 = new Paint(1);
        this.f45075v3 = paint2;
        r1.f fVar = new r1.f(0.0f);
        this.f45076w3 = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.h = 0.0f;
        gVar.f55743g = 2000.0f;
        gVar.f55748m = org.telegram.ui.Cells.y0.n(0.0f, 1500.0f, 1.0f);
        gVar.b(new r1.d(this) {
            public final aj f53978b;

            {
                this.f53978b = this;
            }

            @Override
            public final void a(r1.g gVar2, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f53978b.invalidate();
                        return;
                    case 1:
                        this.f53978b.invalidate();
                        return;
                    default:
                        this.f53978b.invalidate();
                        return;
                }
            }
        });
        this.f45077x3 = gVar;
        r1.f fVar2 = new r1.f(0.0f);
        this.f45078y3 = fVar2;
        r1.g gVar2 = new r1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.f55748m = org.telegram.ui.Cells.y0.n(0.0f, 400.0f, 0.5f);
        gVar2.b(new r1.d(this) {
            public final aj f53978b;

            {
                this.f53978b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f53978b.invalidate();
                        return;
                    case 1:
                        this.f53978b.invalidate();
                        return;
                    default:
                        this.f53978b.invalidate();
                        return;
                }
            }
        });
        this.f45079z3 = gVar2;
        r1.f fVar3 = new r1.f(0.0f);
        this.A3 = fVar3;
        r1.g gVar3 = new r1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.f55748m = org.telegram.ui.Cells.y0.n(0.0f, 200.0f, 1.0f);
        gVar3.b(new r1.d(this) {
            public final aj f53978b;

            {
                this.f53978b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f53978b.invalidate();
                        return;
                    case 1:
                        this.f53978b.invalidate();
                        return;
                    default:
                        this.f53978b.invalidate();
                        return;
                }
            }
        });
        this.B3 = gVar3;
        this.D3 = new Path();
        this.F3 = 0;
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
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.f45062h3;
        int size = arrayList2.size();
        an anVar = this.G3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i7);
                if (!an.m2(anVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.S1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    if (q1Var.a()) {
                        f14 = q1Var.getAlpha();
                    } else {
                        f14 = 1.0f;
                    }
                    q1Var.y1(f14, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.f45063i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!an.m2(anVar, q1Var2, rectF)) {
                    float S1 = q1Var2.S1(false) + q1Var2.getLeft();
                    float y10 = q1Var2.getY() + q1Var2.getPaddingTop();
                    if (q1Var2.a()) {
                        f13 = q1Var2.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(S1, y10);
                    q1Var2.setInvalidatesParent(true);
                    q1Var2.h1(canvas, f13);
                    q1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.j3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (an.m2(anVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f27753l & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (q1Var3.a()) {
                        f12 = q1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float S12 = q1Var3.S1(z13) + q1Var3.getLeft();
                    float y11 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.bj currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.aj ajVar = currentMessagesGroup.f22717m;
                        if (ajVar.f22523j) {
                            float S13 = q1Var3.S1(z12);
                            float f15 = ajVar.f22516a + S13 + ajVar.f22519e;
                            arrayList = arrayList4;
                            float f16 = ajVar.f22517b + ajVar.f22520f;
                            float f17 = ajVar.f22518c + S13 + ajVar.f22521g;
                            float f18 = ajVar.d + ajVar.h;
                            if (!ajVar.f22523j) {
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
                    if (q1Var3.getTransitionParams().f32008w0) {
                        canvas.translate(S12, y11);
                        q1Var3.setInvalidatesParent(true);
                        q1Var3.Q0(f12, canvas, z11);
                        q1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.f45064k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!an.m2(anVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f27753l & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (q1Var4.a()) {
                        f11 = q1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float S14 = q1Var4.S1(false) + q1Var4.getLeft();
                    float y12 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.bj currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.aj ajVar2 = currentMessagesGroup2.f22717m;
                        if (ajVar2.f22523j) {
                            float S15 = q1Var4.S1(true);
                            float f19 = ajVar2.f22516a + S15 + ajVar2.f22519e;
                            float f20 = ajVar2.f22517b + ajVar2.f22520f;
                            float f21 = ajVar2.f22518c + S15 + ajVar2.f22521g;
                            float f22 = ajVar2.d + ajVar2.h;
                            if (!ajVar2.f22523j) {
                                f20 += q1Var4.getTranslationY();
                                f22 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f19 + org.telegram.messenger.g0.L(f10), f20 + org.telegram.messenger.g0.L(f10), f21 - org.telegram.messenger.g0.L(f10), f22 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z10 && q1Var4.getTransitionParams().f32008w0) {
                        canvas.translate(S14, y12);
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

    public final void B1(boolean z10) {
        float f10;
        VelocityTracker velocityTracker;
        an anVar = this.G3;
        if (z10 && (velocityTracker = anVar.A9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = anVar.A9.getXVelocity();
        } else {
            f10 = 0.0f;
        }
        VelocityTracker velocityTracker2 = anVar.A9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            anVar.A9 = null;
        }
        anVar.f45426x9 = false;
        anVar.C0.R = true;
        org.telegram.ui.Components.v01 v01Var = anVar.f45289n0;
        if (v01Var != null) {
            v01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        org.telegram.messenger.bj U8;
        org.telegram.messenger.gj gjVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        an anVar = this.G3;
        if (motionEvent != null) {
            anVar.Q4 = true;
        }
        if (anVar.ga() && anVar.f45386u9 == null) {
            if (motionEvent == null) {
                if (anVar.f45426x9) {
                    B1(false);
                }
                anVar.f45413w9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z11 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                    if (!z11 && !anVar.A9() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    anVar.f45413w9 = z12;
                    if (!z12) {
                        anVar.f45426x9 = false;
                    } else {
                        anVar.f45426x9 = false;
                        anVar.f45439y9 = motionEvent.getX();
                        anVar.f45451z9 = motionEvent.getY();
                        VelocityTracker velocityTracker = anVar.A9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        anVar.A9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (anVar.f45413w9 || anVar.f45426x9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = anVar.A9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - anVar.f45439y9;
                        float abs = Math.abs(motionEvent.getY() - anVar.f45451z9);
                        if (anVar.f45413w9 && !anVar.f45426x9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && anVar.A8() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            anVar.C0.R = false;
                            anVar.f45413w9 = false;
                            anVar.f45426x9 = true;
                            anVar.f45439y9 = motionEvent.getX();
                            org.telegram.ui.Components.v01 v01Var = anVar.f45289n0;
                            ValueAnimator valueAnimator = v01Var.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                v01Var.K = null;
                            }
                            org.telegram.messenger.g0.v1(anVar.f45278m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (anVar.f45426x9) {
                            anVar.f45289n0.setProgress((-(motionEvent.getX() - anVar.f45439y9)) / anVar.f45289n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (anVar.f45426x9) {
                            VelocityTracker velocityTracker3 = anVar.A9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z13 = false;
                            }
                            B1(z13);
                        }
                        anVar.f45413w9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !anVar.B9 && !anVar.f45399v9 && anVar.f45386u9 == null) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y10 = motionEvent.getY() - pressedChildView.getY();
                        if (t0Var.V()) {
                            org.telegram.ui.Wallet.c4 c4Var = t0Var.J0;
                            float f12 = (x11 - t0Var.L0) - (t0Var.f31476k0 / 2.0f);
                            float paddingTop = (y10 - t0Var.M0) - t0Var.getPaddingTop();
                            org.telegram.ui.Wallet.b4 b4Var = c4Var.f43593m;
                            if (b4Var != null && b4Var.f58979n && c4Var.f43611w.contains((int) f12, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (anVar.f45386u9 != null) {
                    an.e2(anVar, 0.0f);
                }
                anVar.f45386u9 = pressedChildView;
                org.telegram.messenger.gj a22 = an.a2(anVar);
                boolean U6 = anVar.U6(a22);
                int i7 = anVar.f45204g4;
                if ((i7 == 0 || i7 == 5 || i7 == 8 || (i7 == 3 && anVar.f45358s4 == anVar.getUserConfig().e())) && (((arrayList = anVar.f45317p4) == null || !arrayList.contains(a22)) && ((anVar.a9(a22) != 1 || (org.telegram.messenger.gj.B0(a22.f23817k) != anVar.f45154c7 && !a22.m5())) && ((anVar.h != null || a22.e1() >= 0) && (((chat2 = anVar.f45173e) == null || !org.telegram.messenger.t3.c0(chat2) || U6) && !anVar.A9() && (!org.telegram.messenger.gj.c3(a22.f23817k) || !a22.N3())))))) {
                    this.f45068o3 = motionEvent.getPointerId(0);
                    anVar.f45399v9 = true;
                    this.f45066m3 = (int) motionEvent.getX();
                    this.f45067n3 = (int) motionEvent.getY();
                    return;
                }
                an.e2(anVar, 0.0f);
                anVar.f45386u9 = null;
                return;
            }
        }
        if (anVar.f45386u9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45068o3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f45066m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f45067n3);
            if (getScrollState() == 0 && anVar.f45399v9 && !anVar.B9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                anVar.f45386u9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                anVar.C0.R = false;
                anVar.f45399v9 = false;
                anVar.B9 = true;
                this.f45066m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (anVar.B9) {
                if (Math.abs(max) >= org.telegram.messenger.g0.L(50.0f)) {
                    if (!this.f45072s3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f45072s3 = true;
                    }
                } else {
                    this.f45072s3 = false;
                }
                float f13 = max;
                an.e2(anVar, f13);
                org.telegram.messenger.gj a23 = an.a2(anVar);
                if (a23 != null && (a23.h4() || org.telegram.messenger.gj.L4(a23.f23817k))) {
                    anVar.vd(false, false);
                }
                View view = anVar.f45386u9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f13);
                }
                invalidate();
            }
        } else if (anVar.f45386u9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f45068o3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = anVar.f45386u9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f11 = ((org.telegram.ui.Cells.q1) view2).S1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    f11 = ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.gj a24 = an.a2(anVar);
                    boolean U62 = anVar.U6(a24);
                    uj ujVar = anVar.f45162d1;
                    if ((ujVar != null && ujVar.getVisibility() == 0 && ((!anVar.X0 || !U62) && !a24.X1)) || ((chat = anVar.f45173e) != null && ((org.telegram.messenger.t3.r0(chat) && !anVar.fa()) || ((org.telegram.messenger.t3.T(anVar.f45173e) && !org.telegram.messenger.t3.w(5, anVar.f45173e) && !anVar.f45173e.megagroup) || !org.telegram.messenger.t3.n(anVar.f45173e))))) {
                        if (a24.c1() != 0 && (U8 = anVar.U8(a24.c1())) != null && (gjVar = U8.h) != null) {
                            a24 = gjVar;
                        }
                        anVar.E5 = a24;
                        Bundle j3 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
                        j3.putBoolean("quote", true);
                        j3.putBoolean("reply_to", true);
                        anVar.gb(j3, a24);
                        j3.putInt("messagesCount", 1);
                        j3.putBoolean("canSelectTopics", true);
                        yw ywVar = new yw(j3);
                        ywVar.E2 = anVar;
                        anVar.presentFragment(ywVar);
                    } else {
                        anVar.ic(an.a2(anVar));
                    }
                }
            }
            View view3 = anVar.f45386u9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f10 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                f10 = ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset();
            } else {
                f10 = 0.0f;
            }
            this.f45071r3 = f10;
            if (f10 == 0.0f) {
                anVar.f45386u9 = null;
            }
            this.f45069p3 = System.currentTimeMillis();
            this.f45070q3 = 0.0f;
            invalidate();
            anVar.f45399v9 = false;
            anVar.B9 = false;
            anVar.C0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
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
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        an anVar = this.G3;
        anVar.J8 = null;
        canvas.save();
        if (anVar.f45350ra != null && anVar.f45298na) {
            boolean z10 = anVar.f45310oa;
        }
        this.F1.setEmpty();
        if (anVar.f45249ja != 0.0f) {
            int save = canvas.save();
            if (anVar.f45336qa != 0.0f) {
                f10 = (anVar.A0.getMeasuredHeight() - anVar.f45249ja) * anVar.f45336qa;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-anVar.f45249ja) - f10;
            anVar.Va = f11;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r23, android.view.View r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z10) {
        org.telegram.messenger.bj currentMessagesGroup;
        super.j1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (!messageObject.I3() && !messageObject.U2() && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.q1)) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            q1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
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
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.G3;
        pl plVar = anVar.f45373t9;
        plVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f31745f0);
            plVar.f31771z = false;
        }
        if (!this.W1 && ((iVar = anVar.f45374ta) == null || !iVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar.x() && !anVar.Y9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || anVar.f45426x9) {
                    return true;
                }
            } else {
                return onInterceptTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = this.f45061g3;
        int i14 = i11 - i7;
        an anVar = this.G3;
        if (i13 != i14) {
            if (i13 != 0) {
                anVar.G9(false);
            }
            this.f45061g3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            cj cjVar = anVar.B0;
            if (cjVar != null) {
                cjVar.g();
            }
            anVar.f45297n9.a();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        anVar.f45233i6 = false;
        pl plVar = anVar.f45373t9;
        if (plVar != null && plVar.x()) {
            anVar.f45373t9.w();
        }
        anVar.N9();
        anVar.da();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        wo woVar;
        an anVar = this.G3;
        te.a aVar = anVar.bd;
        pl plVar = anVar.f45373t9;
        plVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f31745f0);
            plVar.f31771z = false;
        }
        if (motionEvent.getAction() == 0) {
            anVar.Oa = true;
        }
        if (anVar.f45249ja != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, anVar.f45249ja / org.telegram.messenger.g0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (woVar = anVar.f45275la) != null && !woVar.S) {
                if (woVar.L != 1.0f) {
                    float f10 = anVar.f45249ja;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                    anVar.ma = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final aj f53522b;

                        {
                            this.f53522b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    an anVar2 = this.f53522b.G3;
                                    anVar2.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar2.A0.invalidate();
                                    return;
                                case 1:
                                    an anVar3 = this.f53522b.G3;
                                    anVar3.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar3.A0.invalidate();
                                    return;
                                case 2:
                                    an anVar4 = this.f53522b.G3;
                                    anVar4.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar4.A0.invalidate();
                                    return;
                                default:
                                    an anVar5 = this.f53522b.G3;
                                    anVar5.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34420f;
                    ofFloat.setInterpolator(erVar);
                    ofFloat.start();
                    final wo woVar2 = anVar.f45275la;
                    bh bhVar = new bh(this, 3);
                    AnimatorSet animatorSet = woVar2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        woVar2.K.cancel();
                    }
                    woVar2.Z = bhVar;
                    woVar2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(woVar2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wo woVar3 = woVar2;
                                    woVar3.getClass();
                                    woVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    woVar3.U.invalidate();
                                    View view = woVar3.f52944b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wo woVar4 = woVar2;
                                    woVar4.getClass();
                                    woVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = woVar4.f52944b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(woVar2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    wo woVar3 = woVar2;
                                    woVar3.getClass();
                                    woVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    woVar3.U.invalidate();
                                    View view = woVar3.f52944b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    wo woVar4 = woVar2;
                                    woVar4.getClass();
                                    woVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = woVar4.f52944b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    woVar2.K.addListener(new org.telegram.ui.Cells.w9(woVar2, 9));
                    woVar2.K.playTogether(ofFloat2, ofFloat3);
                    woVar2.K.setDuration(120L);
                    woVar2.K.setInterpolator(erVar);
                    woVar2.K.start();
                } else {
                    an.f2(anVar);
                }
            } else {
                wo woVar3 = anVar.f45275la;
                if (woVar3 != null && woVar3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    wo woVar4 = anVar.f45275la;
                    if (currentTimeMillis - woVar4.V < 500 && woVar4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        anVar.ma = animatorSet2;
                        if (anVar.f45275la != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(anVar.f45249ja, org.telegram.messenger.g0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final aj f53522b;

                            {
                                this.f53522b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        an anVar2 = this.f53522b.G3;
                                        anVar2.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        an anVar3 = this.f53522b.G3;
                                        anVar3.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        an anVar4 = this.f53522b.G3;
                                        anVar4.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.A0.invalidate();
                                        return;
                                    default:
                                        an anVar5 = this.f53522b.G3;
                                        anVar5.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.er.f34420f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final aj f53522b;

                            {
                                this.f53522b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        an anVar2 = this.f53522b.G3;
                                        anVar2.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        an anVar3 = this.f53522b.G3;
                                        anVar3.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        an anVar4 = this.f53522b.G3;
                                        anVar4.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.A0.invalidate();
                                        return;
                                    default:
                                        an anVar5 = this.f53522b.G3;
                                        anVar5.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(pi.k.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(anVar.f45249ja, 0.0f);
                anVar.ma = ofFloat6;
                if (anVar.f45275la != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final aj f53522b;

                    {
                        this.f53522b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                an anVar2 = this.f53522b.G3;
                                anVar2.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar2.A0.invalidate();
                                return;
                            case 1:
                                an anVar3 = this.f53522b.G3;
                                anVar3.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar3.A0.invalidate();
                                return;
                            case 2:
                                an anVar4 = this.f53522b.G3;
                                anVar4.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar4.A0.invalidate();
                                return;
                            default:
                                an anVar5 = this.f53522b.G3;
                                anVar5.f45249ja = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar5.A0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(pi.k.V);
                ofFloat6.start();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar.x() && !anVar.Y9()) {
                C1(motionEvent);
                if (anVar.B9 || anVar.f45426x9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G3.f45197f9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.hk0 c42;
        org.telegram.ui.Components.q71 q71Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.G3.f45386u9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (c42 = ((org.telegram.ui.Cells.q1) view).c4()) != null && (q71Var = c42.f35279e0) != null && c42.f35280f0 && q71Var.f38556w && !q71Var.E) {
                if (q71Var.f38557x) {
                    if (!q71Var.f38558y && (q71Var.L & 3) != 1) {
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
        if (this.E3) {
            return;
        }
        jh.a aVar = this.G3.f45376tc;
        if (aVar.f17362b != 0) {
            int childCount = aVar.f17361a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                aVar.f17361a.getChildAt(i7).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(v4.m0 m0Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            an anVar = this.G3;
            anVar.M9();
            anVar.O9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i7;
        int i10;
        float f10;
        char c10;
        an anVar;
        float f11;
        org.telegram.messenger.bj bjVar;
        int i11;
        float f12;
        int i12;
        boolean z10;
        org.telegram.messenger.bj bjVar2;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.aj ajVar;
        boolean z11;
        char c11;
        int i14;
        org.telegram.messenger.bj currentMessagesGroup;
        int i15;
        int i16;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        aj ajVar2 = this;
        Canvas canvas2 = canvas;
        int childCount = ajVar2.getChildCount();
        org.telegram.messenger.bj bjVar3 = null;
        int i19 = 0;
        while (true) {
            i7 = 8;
            i10 = 2;
            f10 = 0.0f;
            c10 = 0;
            anVar = ajVar2.G3;
            if (i19 < childCount) {
                View childAt = ajVar2.getChildAt(i19);
                f11 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!an.m2(anVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (anVar.D0.f48374n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                            float measuredHeight3 = ((((ajVar2.getMeasuredHeight() - anVar.O9) - anVar.Xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.O9;
                            if (!((org.telegram.ui.Cells.f0) childAt).J && !anVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                            float measuredHeight4 = ((((ajVar2.getMeasuredHeight() - anVar.O9) - anVar.Xa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.O9;
                            if (!((org.telegram.ui.Cells.ra) childAt).P && !anVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight4) {
                                    childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                org.telegram.messenger.bj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                                if (currentMessagesGroup2 != null && currentMessagesGroup2 == bjVar3) {
                                    i16 = i19;
                                    z12 = true;
                                } else {
                                    org.telegram.messenger.yi currentPosition = q1Var.getCurrentPosition();
                                    org.telegram.ui.Components.k90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                    if ((!backgroundDrawable.f36344f && !q1Var.z2()) || (currentPosition != null && (2 & currentPosition.f27753l) == 0)) {
                                        i16 = i19;
                                        z12 = true;
                                    } else {
                                        boolean z13 = q1Var.f31215x6;
                                        org.telegram.ui.ActionBar.e6 e6Var = ajVar2.f40069o2;
                                        z12 = true;
                                        if (z13 || q1Var.f31228y6) {
                                            i16 = i19;
                                            if (currentPosition == null) {
                                                Paint W0 = ajVar2.W0("paintChatMessageBackgroundSelected");
                                                ym ymVar = anVar.Aa;
                                                if ((ymVar != null && ymVar.f53555q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.j6.f28787a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29247yd, e6Var));
                                                } else {
                                                    if (!anVar.V9()) {
                                                        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                                        measuredHeight = kVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = anVar.A0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - anVar.f45278m1.getBackgroundTranslationY();
                                                    int backgroundSizeY = anVar.f45278m1.getBackgroundSizeY();
                                                    ym ymVar2 = anVar.Aa;
                                                    if (ymVar2 != null) {
                                                        ymVar2.b(q1Var.getX(), backgroundTranslationY, ajVar2.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.j6.r(q1Var.getX(), backgroundTranslationY, ajVar2.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), ajVar2.getMeasuredWidth(), q1Var.getBottom(), paint);
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
                                                    View childAt2 = ajVar2.getChildAt(i20);
                                                    int i21 = i19;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.k90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i18 = i20;
                                                            y10 = Math.min(y10, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j10 = backgroundDrawable2.f36349l;
                                                            if (j10 > j3) {
                                                                j3 = j10;
                                                                f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f13 = q1Var2.getY() + backgroundDrawable2.f36346i;
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
                                                backgroundDrawable.f36347j = f10;
                                                backgroundDrawable.f36348k = f13 - y10;
                                                i17 = measuredHeight5 - y10;
                                            }
                                            int i22 = i17 + y10;
                                            canvas2.clipRect(0, y10, ajVar2.getMeasuredWidth(), i22);
                                            Paint W02 = ajVar2.W0("paintChatMessageBackgroundSelected");
                                            ym ymVar3 = anVar.Aa;
                                            if (ymVar3 != null && !ymVar3.f53555q && W02 != null) {
                                                backgroundDrawable.f36341b = W02;
                                                if (!anVar.V9()) {
                                                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                                                    measuredHeight2 = kVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = anVar.A0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - anVar.f45278m1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = anVar.f45278m1.getBackgroundSizeY();
                                                ym ymVar4 = anVar.Aa;
                                                if (ymVar4 != null) {
                                                    ymVar4.b(q1Var.getX(), backgroundTranslationY2, ajVar2.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.j6.r(q1Var.getX(), backgroundTranslationY2, ajVar2.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f36341b = null;
                                                backgroundDrawable.f36340a.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29247yd, e6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y10, ajVar2.getMeasuredWidth(), i22);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    bjVar3 = currentMessagesGroup2;
                                }
                                if (anVar.Y8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
                                    canvas2.save();
                                    canvas2.translate(q1Var.getX(), q1Var.getY() + q1Var.getPaddingTop());
                                    if (q1Var.getScaleX() != 1.0f) {
                                        canvas2.scale(q1Var.getScaleX(), q1Var.getScaleY(), q1Var.getPivotX(), q1Var.getHeight() >> 1);
                                    }
                                    q1Var.M0(canvas2, z12, false);
                                    canvas2.restore();
                                }
                            } else {
                                i16 = i19;
                                if (childAt instanceof org.telegram.ui.Cells.t0) {
                                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                    if (t0Var.T()) {
                                        canvas2.save();
                                        canvas2.translate(t0Var.getX(), t0Var.getY() + t0Var.getPaddingTop());
                                        canvas2.scale(t0Var.getScaleX(), t0Var.getScaleY(), t0Var.getMeasuredWidth() / 2.0f, t0Var.getMeasuredHeight() / 2.0f);
                                        canvas2.translate(anVar.n9() / 2.0f, 0.0f);
                                        t0Var.H(canvas2, true);
                                        t0Var.K(canvas2, true);
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
        View view = anVar.Y8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            bjVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            bjVar = null;
        }
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = ajVar2.f45065l3;
            arrayList2.clear();
            if (i23 == i10 && !anVar.A0.W1) {
                i11 = i7;
                i12 = i10;
                f12 = f10;
            } else {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = anVar.A0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= anVar.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.aj ajVar3 = currentMessagesGroup.f22717m;
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
                            if ((i23 != i15 || ajVar3.f22522i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.f31244za) && (i23 == i10 || !q1Var3.f31244za))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    ajVar3.f22516a = 0;
                                    ajVar3.f22517b = 0;
                                    ajVar3.f22518c = 0;
                                    ajVar3.d = 0;
                                    ajVar3.f22525l = false;
                                    ajVar3.f22524k = false;
                                    ajVar3.f22526m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                ajVar3.f22524k = q1Var3.J2();
                                ajVar3.f22525l = q1Var3.I2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f27753l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f27753l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.f31244za) {
                                    ajVar3.f22526m = q1Var3;
                                }
                                int i27 = ajVar3.f22517b;
                                if (i27 == 0 || i25 < i27) {
                                    ajVar3.f22517b = i25;
                                }
                                int i28 = ajVar3.d;
                                if (i28 == 0 || i26 > i28) {
                                    ajVar3.d = i26;
                                }
                                int i29 = ajVar3.f22516a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    ajVar3.f22516a = backgroundDrawableLeft;
                                }
                                int i30 = ajVar3.f22518c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    ajVar3.f22518c = backgroundDrawableRight;
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
                    org.telegram.messenger.bj bjVar4 = (org.telegram.messenger.bj) arrayList2.get(i31);
                    org.telegram.messenger.aj ajVar4 = bjVar4.f22717m;
                    ArrayList arrayList3 = bjVar4.d;
                    float S1 = ajVar4.f22526m.S1(true);
                    float f14 = ajVar4.f22516a + S1 + ajVar4.f22519e;
                    float f15 = ajVar4.f22517b + ajVar4.f22520f;
                    float f16 = ajVar4.f22521g + ajVar4.f22518c + S1;
                    float f17 = ajVar4.d + ajVar4.h;
                    if (!ajVar4.f22523j) {
                        f15 += ajVar4.f22526m.getTranslationY();
                        f17 += ajVar4.f22526m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + anVar.A0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + anVar.A0.getMeasuredHeight();
                    }
                    if (ajVar4.f22526m.getScaleX() == f11 && ajVar4.f22526m.getScaleY() == f11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        canvas2.save();
                        bjVar2 = bjVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(ajVar4.f22526m.getScaleX(), ajVar4.f22526m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f16, f14, 2.0f, f14), com.google.android.gms.internal.vision.e2.A(f17, f18, 2.0f, f18));
                    } else {
                        bjVar2 = bjVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList3.get(i32);
                            ajVar = ajVar4;
                            if (org.telegram.messenger.gj.B0(gjVar.f23817k) == anVar.f45259k6) {
                                c11 = 0;
                            } else {
                                c11 = 1;
                            }
                            if (anVar.f45294n6[c11].indexOfKey(gjVar.e1()) < 0) {
                                z11 = false;
                                break;
                            } else {
                                i32++;
                                ajVar4 = ajVar;
                            }
                        } else {
                            ajVar = ajVar4;
                            z11 = true;
                            break;
                        }
                    }
                    float f19 = f17;
                    an anVar2 = anVar;
                    boolean z14 = z11;
                    org.telegram.messenger.bj bjVar5 = bjVar2;
                    ajVar.f22526m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, ajVar.f22524k, ajVar.f22525l, z14, 0);
                    if (bjVar5 != bjVar) {
                        ajVar.f22526m = null;
                    }
                    ajVar.f22528o = bjVar5.f22709c;
                    if (z10) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = anVar2.A0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == bjVar5) {
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
                    anVar = anVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            }
            canvas2 = canvas;
            anVar = anVar;
            i7 = i11;
            f10 = f12;
            i10 = i12;
            c10 = c10;
            i23++;
            ajVar2 = this;
        }
    }
}
