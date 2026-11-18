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
public final class bj extends tl {
    public final r1.f A3;
    public final r1.g B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final bn G3;
    public int f45884g3;
    public final ArrayList f45885h3;
    public final ArrayList f45886i3;
    public final ArrayList j3;
    public final ArrayList f45887k3;
    public final ArrayList f45888l3;
    public int f45889m3;
    public int f45890n3;
    public int f45891o3;
    public long f45892p3;
    public float f45893q3;
    public float f45894r3;
    public boolean f45895s3;
    public final float f45896t3;
    public final Paint f45897u3;
    public final Paint f45898v3;
    public final r1.f f45899w3;
    public final r1.g f45900x3;
    public final r1.f f45901y3;
    public final r1.g f45902z3;

    public bj(bn bnVar, Context context, zm zmVar) {
        super(bnVar, context, zmVar);
        this.G3 = bnVar;
        this.f45885h3 = new ArrayList();
        this.f45886i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f45887k3 = new ArrayList();
        this.f45888l3 = new ArrayList(10);
        this.f45896t3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f45897u3 = paint;
        Paint paint2 = new Paint(1);
        this.f45898v3 = paint2;
        r1.f fVar = new r1.f(0.0f);
        this.f45899w3 = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.h = 0.0f;
        gVar.f56318g = 2000.0f;
        gVar.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 1500.0f, 1.0f);
        gVar.b(new r1.d(this) {
            public final bj f45611b;

            {
                this.f45611b = this;
            }

            @Override
            public final void a(r1.g gVar2, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f45611b.invalidate();
                        return;
                    case 1:
                        this.f45611b.invalidate();
                        return;
                    default:
                        this.f45611b.invalidate();
                        return;
                }
            }
        });
        this.f45900x3 = gVar;
        r1.f fVar2 = new r1.f(0.0f);
        this.f45901y3 = fVar2;
        r1.g gVar2 = new r1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 400.0f, 0.5f);
        gVar2.b(new r1.d(this) {
            public final bj f45611b;

            {
                this.f45611b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f45611b.invalidate();
                        return;
                    case 1:
                        this.f45611b.invalidate();
                        return;
                    default:
                        this.f45611b.invalidate();
                        return;
                }
            }
        });
        this.f45902z3 = gVar2;
        r1.f fVar3 = new r1.f(0.0f);
        this.A3 = fVar3;
        r1.g gVar3 = new r1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 200.0f, 1.0f);
        gVar3.b(new r1.d(this) {
            public final bj f45611b;

            {
                this.f45611b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f45611b.invalidate();
                        return;
                    case 1:
                        this.f45611b.invalidate();
                        return;
                    default:
                        this.f45611b.invalidate();
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
        ArrayList arrayList2 = this.f45885h3;
        int size = arrayList2.size();
        bn bnVar = this.G3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i7);
                if (!bn.m2(bnVar, q1Var, rectF)) {
                    canvas.save();
                    canvas.translate(q1Var.S1(false) + q1Var.getLeft(), q1Var.getY() + q1Var.getPaddingTop());
                    if (q1Var.b()) {
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
        ArrayList arrayList3 = this.f45886i3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!bn.m2(bnVar, q1Var2, rectF)) {
                    float S1 = q1Var2.S1(false) + q1Var2.getLeft();
                    float y10 = q1Var2.getY() + q1Var2.getPaddingTop();
                    if (q1Var2.b()) {
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
                if (bn.m2(bnVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f27891l & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (q1Var3.b()) {
                        f12 = q1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float S12 = q1Var3.S1(z13) + q1Var3.getLeft();
                    float y11 = q1Var3.getY() + q1Var3.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.aj currentMessagesGroup = q1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        org.telegram.messenger.zi ziVar = currentMessagesGroup.f22908m;
                        if (ziVar.f28309j) {
                            float S13 = q1Var3.S1(z12);
                            float f15 = ziVar.f28302a + S13 + ziVar.f28305e;
                            arrayList = arrayList4;
                            float f16 = ziVar.f28303b + ziVar.f28306f;
                            float f17 = ziVar.f28304c + S13 + ziVar.f28307g;
                            float f18 = ziVar.d + ziVar.h;
                            if (!ziVar.f28309j) {
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
                    if (q1Var3.getTransitionParams().f32391w0) {
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
        ArrayList arrayList5 = this.f45887k3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) arrayList5.get(i12);
                if (!bn.m2(bnVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f27891l & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (q1Var4.b()) {
                        f11 = q1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float S14 = q1Var4.S1(false) + q1Var4.getLeft();
                    float y12 = q1Var4.getY() + q1Var4.getPaddingTop();
                    canvas.save();
                    org.telegram.messenger.aj currentMessagesGroup2 = q1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        org.telegram.messenger.zi ziVar2 = currentMessagesGroup2.f22908m;
                        if (ziVar2.f28309j) {
                            float S15 = q1Var4.S1(true);
                            float f19 = ziVar2.f28302a + S15 + ziVar2.f28305e;
                            float f20 = ziVar2.f28303b + ziVar2.f28306f;
                            float f21 = ziVar2.f28304c + S15 + ziVar2.f28307g;
                            float f22 = ziVar2.d + ziVar2.h;
                            if (!ziVar2.f28309j) {
                                f20 += q1Var4.getTranslationY();
                                f22 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f19 + org.telegram.messenger.g0.L(f10), f20 + org.telegram.messenger.g0.L(f10), f21 - org.telegram.messenger.g0.L(f10), f22 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z10 && q1Var4.getTransitionParams().f32391w0) {
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
        bn bnVar = this.G3;
        if (z10 && (velocityTracker = bnVar.B9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = bnVar.B9.getXVelocity();
        } else {
            f10 = 0.0f;
        }
        VelocityTracker velocityTracker2 = bnVar.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            bnVar.B9 = null;
        }
        bnVar.f46254y9 = false;
        bnVar.C0.R = true;
        org.telegram.ui.Components.f11 f11Var = bnVar.f46104n0;
        if (f11Var != null) {
            f11Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        org.telegram.messenger.aj U8;
        org.telegram.messenger.fj fjVar;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        bn bnVar = this.G3;
        if (motionEvent != null) {
            bnVar.R4 = true;
        }
        if (bnVar.ga() && bnVar.f46214v9 == null) {
            if (motionEvent == null) {
                if (bnVar.f46254y9) {
                    B1(false);
                }
                bnVar.f46241x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z11 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
                    if (!z11 && !bnVar.A9() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bnVar.f46241x9 = z12;
                    if (!z12) {
                        bnVar.f46254y9 = false;
                    } else {
                        bnVar.f46254y9 = false;
                        bnVar.f46266z9 = motionEvent.getX();
                        bnVar.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = bnVar.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        bnVar.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (bnVar.f46241x9 || bnVar.f46254y9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = bnVar.B9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - bnVar.f46266z9;
                        float abs = Math.abs(motionEvent.getY() - bnVar.A9);
                        if (bnVar.f46241x9 && !bnVar.f46254y9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && bnVar.A8() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            bnVar.C0.R = false;
                            bnVar.f46241x9 = false;
                            bnVar.f46254y9 = true;
                            bnVar.f46266z9 = motionEvent.getX();
                            org.telegram.ui.Components.f11 f11Var = bnVar.f46104n0;
                            ValueAnimator valueAnimator = f11Var.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                f11Var.K = null;
                            }
                            org.telegram.messenger.g0.v1(bnVar.f46093m1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (bnVar.f46254y9) {
                            bnVar.f46104n0.setProgress((-(motionEvent.getX() - bnVar.f46266z9)) / bnVar.f46104n0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (bnVar.f46254y9) {
                            VelocityTracker velocityTracker3 = bnVar.B9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z13 = false;
                            }
                            B1(z13);
                        }
                        bnVar.f46241x9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !bnVar.C9 && !bnVar.f46228w9 && bnVar.f46214v9 == null) {
            z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.u0) {
                        org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y10 = motionEvent.getY() - pressedChildView.getY();
                        if (u0Var.W()) {
                            org.telegram.ui.Wallet.m4 m4Var = u0Var.J0;
                            float f12 = (x11 - u0Var.L0) - (u0Var.f32035k0 / 2.0f);
                            float paddingTop = (y10 - u0Var.M0) - u0Var.getPaddingTop();
                            org.telegram.ui.Wallet.l4 l4Var = m4Var.f44537m;
                            if (l4Var != null && l4Var.f59546n && m4Var.f44555w.contains((int) f12, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (bnVar.f46214v9 != null) {
                    bn.e2(bnVar, 0.0f);
                }
                bnVar.f46214v9 = pressedChildView;
                org.telegram.messenger.fj a22 = bn.a2(bnVar);
                boolean U6 = bnVar.U6(a22);
                int i7 = bnVar.f46018g4;
                if ((i7 == 0 || i7 == 5 || i7 == 8 || (i7 == 3 && bnVar.f46173s4 == bnVar.getUserConfig().e())) && (((arrayList = bnVar.f46132p4) == null || !arrayList.contains(a22)) && ((bnVar.a9(a22) != 1 || (org.telegram.messenger.fj.B0(a22.f23968k) != bnVar.f45981d7 && !a22.m5())) && ((bnVar.h != null || a22.e1() >= 0) && (((chat2 = bnVar.f45987e) == null || !org.telegram.messenger.v3.c0(chat2) || U6) && !bnVar.A9() && (!org.telegram.messenger.fj.c3(a22.f23968k) || !a22.N3())))))) {
                    this.f45891o3 = motionEvent.getPointerId(0);
                    bnVar.f46228w9 = true;
                    this.f45889m3 = (int) motionEvent.getX();
                    this.f45890n3 = (int) motionEvent.getY();
                    return;
                }
                bn.e2(bnVar, 0.0f);
                bnVar.f46214v9 = null;
                return;
            }
        }
        if (bnVar.f46214v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45891o3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f45889m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f45890n3);
            if (getScrollState() == 0 && bnVar.f46228w9 && !bnVar.C9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                bnVar.f46214v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                bnVar.C0.R = false;
                bnVar.f46228w9 = false;
                bnVar.C9 = true;
                this.f45889m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (bnVar.C9) {
                if (Math.abs(max) >= org.telegram.messenger.g0.L(50.0f)) {
                    if (!this.f45895s3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f45895s3 = true;
                    }
                } else {
                    this.f45895s3 = false;
                }
                float f13 = max;
                bn.e2(bnVar, f13);
                org.telegram.messenger.fj a23 = bn.a2(bnVar);
                if (a23 != null && (a23.h4() || org.telegram.messenger.fj.L4(a23.f23968k))) {
                    bnVar.vd(false, false);
                }
                View view = bnVar.f46214v9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f13);
                }
                invalidate();
            }
        } else if (bnVar.f46214v9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f45891o3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = bnVar.f46214v9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f11 = ((org.telegram.ui.Cells.q1) view2).S1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.u0) {
                    f11 = ((org.telegram.ui.Cells.u0) view2).getWalletSlidingOffset();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.fj a24 = bn.a2(bnVar);
                    boolean U62 = bnVar.U6(a24);
                    vj vjVar = bnVar.f45976d1;
                    if ((vjVar != null && vjVar.getVisibility() == 0 && ((!bnVar.X0 || !U62) && !a24.X1)) || ((chat = bnVar.f45987e) != null && ((org.telegram.messenger.v3.r0(chat) && !bnVar.fa()) || ((org.telegram.messenger.v3.T(bnVar.f45987e) && !org.telegram.messenger.v3.w(5, bnVar.f45987e) && !bnVar.f45987e.megagroup) || !org.telegram.messenger.v3.n(bnVar.f45987e))))) {
                        if (a24.c1() != 0 && (U8 = bnVar.U8(a24.c1())) != null && (fjVar = U8.h) != null) {
                            a24 = fjVar;
                        }
                        bnVar.F5 = a24;
                        Bundle l10 = org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true);
                        l10.putBoolean("quote", true);
                        l10.putBoolean("reply_to", true);
                        bnVar.gb(l10, a24);
                        l10.putInt("messagesCount", 1);
                        l10.putBoolean("canSelectTopics", true);
                        cx cxVar = new cx(l10);
                        cxVar.E2 = bnVar;
                        bnVar.presentFragment(cxVar);
                    } else {
                        bnVar.ic(bn.a2(bnVar));
                    }
                }
            }
            View view3 = bnVar.f46214v9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f10 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.u0) {
                f10 = ((org.telegram.ui.Cells.u0) view3).getWalletSlidingOffset();
            } else {
                f10 = 0.0f;
            }
            this.f45894r3 = f10;
            if (f10 == 0.0f) {
                bnVar.f46214v9 = null;
            }
            this.f45892p3 = System.currentTimeMillis();
            this.f45893q3 = 0.0f;
            invalidate();
            bnVar.f46228w9 = false;
            bnVar.C9 = false;
            bnVar.C0.R = true;
        }
    }

    public final void D1(org.telegram.ui.Cells.q1 q1Var, float f10) {
        org.telegram.messenger.aj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
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
        bn bnVar = this.G3;
        bnVar.K8 = null;
        canvas.save();
        if (bnVar.f46177sa != null && bnVar.f46125oa) {
            boolean z10 = bnVar.f46138pa;
        }
        this.F1.setEmpty();
        if (bnVar.f46077ka != 0.0f) {
            int save = canvas.save();
            if (bnVar.f46165ra != 0.0f) {
                f10 = (bnVar.A0.getMeasuredHeight() - bnVar.f46077ka) * bnVar.f46165ra;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-bnVar.f46077ka) - f10;
            bnVar.Wa = f11;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r23, android.view.View r24, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z10) {
        org.telegram.messenger.aj currentMessagesGroup;
        super.j1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bj.onDraw(android.graphics.Canvas):void");
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
        bn bnVar = this.G3;
        ql qlVar = bnVar.f46201u9;
        qlVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(qlVar.f32189f0);
            qlVar.f32215z = false;
        }
        if (!this.W1 && ((iVar = bnVar.f46202ua) == null || !iVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (!kVar.y() && !bnVar.Y9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || bnVar.f46254y9) {
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
        int i13 = this.f45884g3;
        int i14 = i11 - i7;
        bn bnVar = this.G3;
        if (i13 != i14) {
            if (i13 != 0) {
                bnVar.G9(false);
            }
            this.f45884g3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            dj djVar = bnVar.B0;
            if (djVar != null) {
                djVar.g();
            }
            bnVar.f46124o9.c();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        bnVar.f46059j6 = false;
        ql qlVar = bnVar.f46201u9;
        if (qlVar != null && qlVar.x()) {
            bnVar.f46201u9.w();
        }
        bnVar.N9();
        bnVar.da();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        yo yoVar;
        bn bnVar = this.G3;
        te.a aVar = bnVar.f45974cd;
        ql qlVar = bnVar.f46201u9;
        qlVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(qlVar.f32189f0);
            qlVar.f32215z = false;
        }
        if (motionEvent.getAction() == 0) {
            bnVar.Pa = true;
        }
        if (bnVar.f46077ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, bnVar.f46077ka / org.telegram.messenger.g0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (yoVar = bnVar.ma) != null && !yoVar.S) {
                if (yoVar.L != 1.0f) {
                    float f10 = bnVar.f46077ka;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                    bnVar.f46113na = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final bj f54516b;

                        {
                            this.f54516b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    bn bnVar2 = this.f54516b.G3;
                                    bnVar2.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bnVar2.A0.invalidate();
                                    return;
                                case 1:
                                    bn bnVar3 = this.f54516b.G3;
                                    bnVar3.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bnVar3.A0.invalidate();
                                    return;
                                case 2:
                                    bn bnVar4 = this.f54516b.G3;
                                    bnVar4.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bnVar4.A0.invalidate();
                                    return;
                                default:
                                    bn bnVar5 = this.f54516b.G3;
                                    bnVar5.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    bnVar5.A0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.f37208f;
                    ofFloat.setInterpolator(lrVar);
                    ofFloat.start();
                    final yo yoVar2 = bnVar.ma;
                    bh bhVar = new bh(this, 3);
                    AnimatorSet animatorSet = yoVar2.K;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        yoVar2.K.cancel();
                    }
                    yoVar2.Z = bhVar;
                    yoVar2.K = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(yoVar2.L, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    yo yoVar3 = yoVar2;
                                    yoVar3.getClass();
                                    yoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yoVar3.U.invalidate();
                                    View view = yoVar3.f54241b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    yo yoVar4 = yoVar2;
                                    yoVar4.getClass();
                                    yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = yoVar4.f54241b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(yoVar2.M, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    yo yoVar3 = yoVar2;
                                    yoVar3.getClass();
                                    yoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    yoVar3.U.invalidate();
                                    View view = yoVar3.f54241b0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    yo yoVar4 = yoVar2;
                                    yoVar4.getClass();
                                    yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = yoVar4.f54241b0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    yoVar2.K.addListener(new org.telegram.ui.Cells.x9(yoVar2, 9));
                    yoVar2.K.playTogether(ofFloat2, ofFloat3);
                    yoVar2.K.setDuration(120L);
                    yoVar2.K.setInterpolator(lrVar);
                    yoVar2.K.start();
                } else {
                    bn.f2(bnVar);
                }
            } else {
                yo yoVar3 = bnVar.ma;
                if (yoVar3 != null && yoVar3.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    yo yoVar4 = bnVar.ma;
                    if (currentTimeMillis - yoVar4.V < 500 && yoVar4.N) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        bnVar.f46113na = animatorSet2;
                        if (bnVar.ma != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(bnVar.f46077ka, org.telegram.messenger.g0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final bj f54516b;

                            {
                                this.f54516b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        bn bnVar2 = this.f54516b.G3;
                                        bnVar2.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        bn bnVar3 = this.f54516b.G3;
                                        bnVar3.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        bn bnVar4 = this.f54516b.G3;
                                        bnVar4.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar4.A0.invalidate();
                                        return;
                                    default:
                                        bn bnVar5 = this.f54516b.G3;
                                        bnVar5.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar5.A0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final bj f54516b;

                            {
                                this.f54516b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        bn bnVar2 = this.f54516b.G3;
                                        bnVar2.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar2.A0.invalidate();
                                        return;
                                    case 1:
                                        bn bnVar3 = this.f54516b.G3;
                                        bnVar3.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar3.A0.invalidate();
                                        return;
                                    case 2:
                                        bn bnVar4 = this.f54516b.G3;
                                        bnVar4.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar4.A0.invalidate();
                                        return;
                                    default:
                                        bn bnVar5 = this.f54516b.G3;
                                        bnVar5.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        bnVar5.A0.invalidate();
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
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(bnVar.f46077ka, 0.0f);
                bnVar.f46113na = ofFloat6;
                if (bnVar.ma != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final bj f54516b;

                    {
                        this.f54516b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                bn bnVar2 = this.f54516b.G3;
                                bnVar2.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                bnVar2.A0.invalidate();
                                return;
                            case 1:
                                bn bnVar3 = this.f54516b.G3;
                                bnVar3.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                bnVar3.A0.invalidate();
                                return;
                            case 2:
                                bn bnVar4 = this.f54516b.G3;
                                bnVar4.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                bnVar4.A0.invalidate();
                                return;
                            default:
                                bn bnVar5 = this.f54516b.G3;
                                bnVar5.f46077ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                bnVar5.A0.invalidate();
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
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (!kVar.y() && !bnVar.Y9()) {
                C1(motionEvent);
                if (bnVar.C9 || bnVar.f46254y9 || onTouchEvent) {
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
        if (this.G3.f46023g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.pk0 d42;
        org.telegram.ui.Components.a81 a81Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.G3.f46214v9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (d42 = ((org.telegram.ui.Cells.q1) view).d4()) != null && (a81Var = d42.f38468e0) != null && d42.f38469f0 && a81Var.f33285w && !a81Var.E) {
                if (a81Var.f33286x) {
                    if (!a81Var.f33287y && (a81Var.L & 3) != 1) {
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
        jh.a aVar = this.G3.f46204uc;
        if (aVar.f17748b != 0) {
            int childCount = aVar.f17747a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                aVar.f17747a.getChildAt(i7).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(v4.n0 n0Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(n0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            bn bnVar = this.G3;
            bnVar.M9();
            bnVar.O9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i7;
        int i10;
        float f10;
        char c10;
        bn bnVar;
        float f11;
        org.telegram.messenger.aj ajVar;
        int i11;
        float f12;
        int i12;
        boolean z10;
        org.telegram.messenger.aj ajVar2;
        int i13;
        ArrayList arrayList;
        org.telegram.messenger.zi ziVar;
        boolean z11;
        char c11;
        int i14;
        org.telegram.messenger.aj currentMessagesGroup;
        int i15;
        int i16;
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        bj bjVar = this;
        Canvas canvas2 = canvas;
        int childCount = bjVar.getChildCount();
        org.telegram.messenger.aj ajVar3 = null;
        int i19 = 0;
        while (true) {
            i7 = 8;
            i10 = 2;
            f10 = 0.0f;
            c10 = 0;
            bnVar = bjVar.G3;
            if (i19 < childCount) {
                View childAt = bjVar.getChildAt(i19);
                f11 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!bn.m2(bnVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (bnVar.D0.f49295n && (childAt instanceof org.telegram.ui.Cells.g0)) {
                            float measuredHeight3 = ((((bjVar.getMeasuredHeight() - bnVar.P9) - bnVar.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + bnVar.P9;
                            if (!((org.telegram.ui.Cells.g0) childAt).J && !bnVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                            float measuredHeight4 = ((((bjVar.getMeasuredHeight() - bnVar.P9) - bnVar.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + bnVar.P9;
                            if (!((org.telegram.ui.Cells.sa) childAt).P && !bnVar.A0.W1) {
                                if (childAt.getTop() > measuredHeight4) {
                                    childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else {
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                org.telegram.messenger.aj currentMessagesGroup2 = q1Var.getCurrentMessagesGroup();
                                if (currentMessagesGroup2 != null && currentMessagesGroup2 == ajVar3) {
                                    i16 = i19;
                                    z12 = true;
                                } else {
                                    org.telegram.messenger.xi currentPosition = q1Var.getCurrentPosition();
                                    org.telegram.ui.Components.v90 backgroundDrawable = q1Var.getBackgroundDrawable();
                                    if ((!backgroundDrawable.f40552f && !q1Var.B2()) || (currentPosition != null && (2 & currentPosition.f27891l) == 0)) {
                                        i16 = i19;
                                        z12 = true;
                                    } else {
                                        boolean z13 = q1Var.f31587x6;
                                        org.telegram.ui.ActionBar.i6 i6Var = bjVar.f34074o2;
                                        z12 = true;
                                        if (z13 || q1Var.f31600y6) {
                                            i16 = i19;
                                            if (currentPosition == null) {
                                                Paint W0 = bjVar.W0("paintChatMessageBackgroundSelected");
                                                zm zmVar = bnVar.Ba;
                                                if ((zmVar != null && zmVar.f54547q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.n6.f29334a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29794yd, i6Var));
                                                } else {
                                                    if (!bnVar.V9()) {
                                                        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                                                        measuredHeight = kVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = bnVar.A0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - bnVar.f46093m1.getBackgroundTranslationY();
                                                    int backgroundSizeY = bnVar.f46093m1.getBackgroundSizeY();
                                                    zm zmVar2 = bnVar.Ba;
                                                    if (zmVar2 != null) {
                                                        zmVar2.e(q1Var.getX(), backgroundTranslationY, bjVar.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.n6.r(q1Var.getX(), backgroundTranslationY, bjVar.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), bjVar.getMeasuredWidth(), q1Var.getBottom(), paint);
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
                                                    View childAt2 = bjVar.getChildAt(i20);
                                                    int i21 = i19;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.v90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i18 = i20;
                                                            y10 = Math.min(y10, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j10 = backgroundDrawable2.f40557l;
                                                            if (j10 > j3) {
                                                                j3 = j10;
                                                                f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f13 = q1Var2.getY() + backgroundDrawable2.f40554i;
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
                                                backgroundDrawable.f40555j = f10;
                                                backgroundDrawable.f40556k = f13 - y10;
                                                i17 = measuredHeight5 - y10;
                                            }
                                            int i22 = i17 + y10;
                                            canvas2.clipRect(0, y10, bjVar.getMeasuredWidth(), i22);
                                            Paint W02 = bjVar.W0("paintChatMessageBackgroundSelected");
                                            zm zmVar3 = bnVar.Ba;
                                            if (zmVar3 != null && !zmVar3.f54547q && W02 != null) {
                                                backgroundDrawable.f40549b = W02;
                                                if (!bnVar.V9()) {
                                                    kVar2 = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                                                    measuredHeight2 = kVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = bnVar.A0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - bnVar.f46093m1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = bnVar.f46093m1.getBackgroundSizeY();
                                                zm zmVar4 = bnVar.Ba;
                                                if (zmVar4 != null) {
                                                    zmVar4.e(q1Var.getX(), backgroundTranslationY2, bjVar.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.n6.r(q1Var.getX(), backgroundTranslationY2, bjVar.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f40549b = null;
                                                backgroundDrawable.f40548a.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29794yd, i6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y10, bjVar.getMeasuredWidth(), i22);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    ajVar3 = currentMessagesGroup2;
                                }
                                if (bnVar.Z8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
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
                                if (childAt instanceof org.telegram.ui.Cells.u0) {
                                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) childAt;
                                    if (u0Var.T()) {
                                        canvas2.save();
                                        canvas2.translate(u0Var.getX(), u0Var.getY() + u0Var.getPaddingTop());
                                        canvas2.scale(u0Var.getScaleX(), u0Var.getScaleY(), u0Var.getMeasuredWidth() / 2.0f, u0Var.getMeasuredHeight() / 2.0f);
                                        canvas2.translate(bnVar.n9() / 2.0f, 0.0f);
                                        u0Var.G(canvas2, true);
                                        u0Var.L(canvas2, true);
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
        View view = bnVar.Z8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ajVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            ajVar = null;
        }
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = bjVar.f45888l3;
            arrayList2.clear();
            if (i23 == i10 && !bnVar.A0.W1) {
                i11 = i7;
                i12 = i10;
                f12 = f10;
            } else {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = bnVar.A0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= bnVar.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.zi ziVar2 = currentMessagesGroup.f22908m;
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
                            if ((i23 != i15 || ziVar2.f28308i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.f31616za) && (i23 == i10 || !q1Var3.f31616za))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    ziVar2.f28302a = 0;
                                    ziVar2.f28303b = 0;
                                    ziVar2.f28304c = 0;
                                    ziVar2.d = 0;
                                    ziVar2.f28311l = false;
                                    ziVar2.f28310k = false;
                                    ziVar2.f28312m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                ziVar2.f28310k = q1Var3.L2();
                                ziVar2.f28311l = q1Var3.K2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f27891l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f27891l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.f31616za) {
                                    ziVar2.f28312m = q1Var3;
                                }
                                int i27 = ziVar2.f28303b;
                                if (i27 == 0 || i25 < i27) {
                                    ziVar2.f28303b = i25;
                                }
                                int i28 = ziVar2.d;
                                if (i28 == 0 || i26 > i28) {
                                    ziVar2.d = i26;
                                }
                                int i29 = ziVar2.f28302a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    ziVar2.f28302a = backgroundDrawableLeft;
                                }
                                int i30 = ziVar2.f28304c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    ziVar2.f28304c = backgroundDrawableRight;
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
                    org.telegram.messenger.aj ajVar4 = (org.telegram.messenger.aj) arrayList2.get(i31);
                    org.telegram.messenger.zi ziVar3 = ajVar4.f22908m;
                    ArrayList arrayList3 = ajVar4.d;
                    float S1 = ziVar3.f28312m.S1(true);
                    float f14 = ziVar3.f28302a + S1 + ziVar3.f28305e;
                    float f15 = ziVar3.f28303b + ziVar3.f28306f;
                    float f16 = ziVar3.f28307g + ziVar3.f28304c + S1;
                    float f17 = ziVar3.d + ziVar3.h;
                    if (!ziVar3.f28309j) {
                        f15 += ziVar3.f28312m.getTranslationY();
                        f17 += ziVar3.f28312m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + bnVar.A0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + bnVar.A0.getMeasuredHeight();
                    }
                    if (ziVar3.f28312m.getScaleX() == f11 && ziVar3.f28312m.getScaleY() == f11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        canvas2.save();
                        ajVar2 = ajVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(ziVar3.f28312m.getScaleX(), ziVar3.f28312m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f16, f14, 2.0f, f14), com.google.android.gms.internal.vision.e2.A(f17, f18, 2.0f, f18));
                    } else {
                        ajVar2 = ajVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList3.get(i32);
                            ziVar = ziVar3;
                            if (org.telegram.messenger.fj.B0(fjVar.f23968k) == bnVar.f46085l6) {
                                c11 = 0;
                            } else {
                                c11 = 1;
                            }
                            if (bnVar.f46121o6[c11].indexOfKey(fjVar.e1()) < 0) {
                                z11 = false;
                                break;
                            } else {
                                i32++;
                                ziVar3 = ziVar;
                            }
                        } else {
                            ziVar = ziVar3;
                            z11 = true;
                            break;
                        }
                    }
                    float f19 = f17;
                    bn bnVar2 = bnVar;
                    boolean z14 = z11;
                    org.telegram.messenger.aj ajVar5 = ajVar2;
                    ziVar.f28312m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, ziVar.f28310k, ziVar.f28311l, z14, 0);
                    if (ajVar5 != ajVar) {
                        ziVar.f28312m = null;
                    }
                    ziVar.f28314o = ajVar5.f22900c;
                    if (z10) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = bnVar2.A0.getChildAt(i33);
                            if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                if (q1Var4.getCurrentMessagesGroup() == ajVar5) {
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
                    bnVar = bnVar2;
                    i23 = i13;
                    arrayList2 = arrayList;
                    c10 = 0;
                }
                f12 = 0.0f;
                i12 = 2;
            }
            canvas2 = canvas;
            bnVar = bnVar;
            i7 = i11;
            f10 = f12;
            i10 = i12;
            c10 = c10;
            i23++;
            bjVar = this;
        }
    }
}
