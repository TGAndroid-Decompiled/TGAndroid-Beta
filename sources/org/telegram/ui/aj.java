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
    public final r1.g A3;
    public boolean B3;
    public final Path C3;
    public boolean D3;
    public int E3;
    public final an F3;
    public int f43674f3;
    public final ArrayList f43675g3;
    public final ArrayList f43676h3;
    public final ArrayList f43677i3;
    public final ArrayList j3;
    public final ArrayList f43678k3;
    public int f43679l3;
    public int f43680m3;
    public int f43681n3;
    public long f43682o3;
    public float f43683p3;
    public float f43684q3;
    public boolean f43685r3;
    public final float f43686s3;
    public final Paint f43687t3;
    public final Paint f43688u3;
    public final r1.f f43689v3;
    public final r1.g f43690w3;
    public final r1.f f43691x3;
    public final r1.g f43692y3;
    public final r1.f f43693z3;

    public aj(an anVar, Context context, ym ymVar) {
        super(anVar, context, ymVar);
        this.F3 = anVar;
        this.f43675g3 = new ArrayList();
        this.f43676h3 = new ArrayList();
        this.f43677i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f43678k3 = new ArrayList(10);
        this.f43686s3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f43687t3 = paint;
        Paint paint2 = new Paint(1);
        this.f43688u3 = paint2;
        r1.f fVar = new r1.f(0.0f);
        this.f43689v3 = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.h = 0.0f;
        gVar.f54262g = 2000.0f;
        gVar.f54267m = org.telegram.ui.Cells.f1.o(0.0f, 1500.0f, 1.0f);
        gVar.b(new r1.d(this) {
            public final aj f52597b;

            {
                this.f52597b = this;
            }

            @Override
            public final void a(r1.g gVar2, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f52597b.invalidate();
                        return;
                    case 1:
                        this.f52597b.invalidate();
                        return;
                    default:
                        this.f52597b.invalidate();
                        return;
                }
            }
        });
        this.f43690w3 = gVar;
        r1.f fVar2 = new r1.f(0.0f);
        this.f43691x3 = fVar2;
        r1.g gVar2 = new r1.g(fVar2);
        gVar2.h = 0.0f;
        gVar2.f54267m = org.telegram.ui.Cells.f1.o(0.0f, 400.0f, 0.5f);
        gVar2.b(new r1.d(this) {
            public final aj f52597b;

            {
                this.f52597b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f52597b.invalidate();
                        return;
                    case 1:
                        this.f52597b.invalidate();
                        return;
                    default:
                        this.f52597b.invalidate();
                        return;
                }
            }
        });
        this.f43692y3 = gVar2;
        r1.f fVar3 = new r1.f(0.0f);
        this.f43693z3 = fVar3;
        r1.g gVar3 = new r1.g(fVar3);
        gVar3.h = 0.0f;
        gVar3.f54267m = org.telegram.ui.Cells.f1.o(0.0f, 200.0f, 1.0f);
        gVar3.b(new r1.d(this) {
            public final aj f52597b;

            {
                this.f52597b = this;
            }

            @Override
            public final void a(r1.g gVar22, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f52597b.invalidate();
                        return;
                    case 1:
                        this.f52597b.invalidate();
                        return;
                    default:
                        this.f52597b.invalidate();
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
        ArrayList arrayList2 = this.f43675g3;
        int size = arrayList2.size();
        an anVar = this.F3;
        boolean z11 = true;
        boolean z12 = false;
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) arrayList2.get(i7);
                if (!an.l2(anVar, q1Var, rectF)) {
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
        ArrayList arrayList3 = this.f43676h3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) arrayList3.get(i10);
                if (!an.l2(anVar, q1Var2, rectF)) {
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
        ArrayList arrayList4 = this.f43677i3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) arrayList4.get(i11);
                if (an.l2(anVar, q1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (q1Var3.getCurrentPosition() != null && (q1Var3.getCurrentPosition().f21450l & z11) == 0) {
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
                        org.telegram.messenger.cj cjVar = currentMessagesGroup.f22044m;
                        if (cjVar.f21867j) {
                            float R13 = q1Var3.R1(z11);
                            float f15 = cjVar.f21860a + R13 + cjVar.f21863e;
                            arrayList = arrayList4;
                            float f16 = cjVar.f21861b + cjVar.f21864f;
                            float f17 = cjVar.f21862c + R13 + cjVar.f21865g;
                            float f18 = cjVar.d + cjVar.h;
                            if (!cjVar.f21867j) {
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
                    if (q1Var3.getTransitionParams().f30859w0) {
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
                if (!an.l2(anVar, q1Var4, rectF)) {
                    if (q1Var4.getCurrentPosition() != null && (q1Var4.getCurrentPosition().f21450l & 1) == 0) {
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
                        org.telegram.messenger.cj cjVar2 = currentMessagesGroup2.f22044m;
                        if (cjVar2.f21867j) {
                            float R15 = q1Var4.R1(true);
                            float f19 = cjVar2.f21860a + R15 + cjVar2.f21863e;
                            float f20 = cjVar2.f21861b + cjVar2.f21864f;
                            float f21 = cjVar2.f21862c + R15 + cjVar2.f21865g;
                            float f22 = cjVar2.d + cjVar2.h;
                            if (!cjVar2.f21867j) {
                                f20 += q1Var4.getTranslationY();
                                f22 += q1Var4.getTranslationY();
                            }
                            canvas.clipRect(f19 + org.telegram.messenger.g0.L(f10), f20 + org.telegram.messenger.g0.L(f10), f21 - org.telegram.messenger.g0.L(f10), f22 - org.telegram.messenger.g0.L(f10));
                        }
                    }
                    if (!z9 && q1Var4.getTransitionParams().f30859w0) {
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
        an anVar = this.F3;
        if (z9 && (velocityTracker = anVar.f44027x9) != null) {
            velocityTracker.computeCurrentVelocity(1000);
            f10 = anVar.f44027x9.getXVelocity();
        } else {
            f10 = 0.0f;
        }
        VelocityTracker velocityTracker2 = anVar.f44027x9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            anVar.f44027x9 = null;
        }
        anVar.f43987u9 = false;
        anVar.B0.R = true;
        org.telegram.ui.Components.s01 s01Var = anVar.m0;
        if (s01Var != null) {
            s01Var.settle(f10);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        org.telegram.messenger.dj S8;
        org.telegram.messenger.ij ijVar;
        boolean z9;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        an anVar = this.F3;
        if (motionEvent != null) {
            anVar.P4 = true;
        }
        if (anVar.ea() && anVar.f43950r9 == null) {
            if (motionEvent == null) {
                if (anVar.f43987u9) {
                    B1(false);
                }
                anVar.f43974t9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z10 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
                    if (!z10 && !anVar.y9() && motionEvent.getX() >= getMeasuredWidth() * 0.55f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    anVar.f43974t9 = z11;
                    if (!z11) {
                        anVar.f43987u9 = false;
                    } else {
                        anVar.f43987u9 = false;
                        anVar.f44000v9 = motionEvent.getX();
                        anVar.f44014w9 = motionEvent.getY();
                        VelocityTracker velocityTracker = anVar.f44027x9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        anVar.f44027x9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                } else if (anVar.f43974t9 || anVar.f43987u9) {
                    if (actionMasked == 2) {
                        VelocityTracker velocityTracker2 = anVar.f44027x9;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - anVar.f44000v9;
                        float abs = Math.abs(motionEvent.getY() - anVar.f44014w9);
                        if (anVar.f43974t9 && !anVar.f43987u9 && getScrollState() == 0 && x10 <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(x10) / 3.0f > abs && anVar.y8() != null) {
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onInterceptTouchEvent(obtain2);
                            obtain2.recycle();
                            anVar.B0.R = false;
                            anVar.f43974t9 = false;
                            anVar.f43987u9 = true;
                            anVar.f44000v9 = motionEvent.getX();
                            org.telegram.ui.Components.s01 s01Var = anVar.m0;
                            ValueAnimator valueAnimator = s01Var.J;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s01Var.J = null;
                            }
                            org.telegram.messenger.g0.v1(anVar.l1);
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return;
                            }
                            return;
                        } else if (anVar.f43987u9) {
                            anVar.m0.setProgress((-(motionEvent.getX() - anVar.f44000v9)) / anVar.m0.getContentWidth());
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        if (anVar.f43987u9) {
                            VelocityTracker velocityTracker3 = anVar.f44027x9;
                            if (velocityTracker3 != null) {
                                velocityTracker3.addMovement(motionEvent);
                            }
                            if (actionMasked != 1) {
                                z12 = false;
                            }
                            B1(z12);
                        }
                        anVar.f43974t9 = false;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !anVar.f44040y9 && !anVar.s9 && anVar.f43950r9 == null) {
            z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
            if (!z9) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.q1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) pressedChildView;
                        float x11 = motionEvent.getX() - pressedChildView.getX();
                        float y10 = motionEvent.getY() - pressedChildView.getY();
                        if (t0Var.S()) {
                            org.telegram.ui.Wallet.c4 c4Var = t0Var.I0;
                            float f12 = (x11 - t0Var.K0) - (t0Var.f30323j0 / 2.0f);
                            float paddingTop = (y10 - t0Var.L0) - t0Var.getPaddingTop();
                            org.telegram.ui.Wallet.b4 b4Var = c4Var.f42330m;
                            if (b4Var != null && b4Var.f57494n && c4Var.f42348w.contains((int) f12, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (anVar.f43950r9 != null) {
                    an.d2(anVar, 0.0f);
                }
                anVar.f43950r9 = pressedChildView;
                org.telegram.messenger.ij Z1 = an.Z1(anVar);
                boolean T6 = anVar.T6(Z1);
                int i7 = anVar.f43796f4;
                if ((i7 == 0 || i7 == 5 || i7 == 8 || (i7 == 3 && anVar.f43945r4 == anVar.getUserConfig().e())) && (((arrayList = anVar.o4) == null || !arrayList.contains(Z1)) && ((anVar.Y8(Z1) != 1 || (org.telegram.messenger.ij.B0(Z1.f23262k) != anVar.f43744b7 && !Z1.n5())) && ((anVar.h != null || Z1.f1() >= 0) && (((chat2 = anVar.f43777e) == null || !org.telegram.messenger.t3.c0(chat2) || T6) && !anVar.y9() && (!org.telegram.messenger.ij.d3(Z1.f23262k) || !Z1.O3())))))) {
                    this.f43681n3 = motionEvent.getPointerId(0);
                    anVar.s9 = true;
                    this.f43679l3 = (int) motionEvent.getX();
                    this.f43680m3 = (int) motionEvent.getY();
                    return;
                }
                an.d2(anVar, 0.0f);
                anVar.f43950r9 = null;
                return;
            }
        }
        if (anVar.f43950r9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f43681n3) {
            int max = Math.max(org.telegram.messenger.g0.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f43679l3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.f43680m3);
            if (getScrollState() == 0 && anVar.s9 && !anVar.f44040y9 && max <= (-org.telegram.messenger.g0.a1(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                anVar.f43950r9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                anVar.B0.R = false;
                anVar.s9 = false;
                anVar.f44040y9 = true;
                this.f43679l3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (anVar.f44040y9) {
                if (Math.abs(max) >= org.telegram.messenger.g0.L(50.0f)) {
                    if (!this.f43685r3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f43685r3 = true;
                    }
                } else {
                    this.f43685r3 = false;
                }
                float f13 = max;
                an.d2(anVar, f13);
                org.telegram.messenger.ij Z12 = an.Z1(anVar);
                if (Z12 != null && (Z12.i4() || org.telegram.messenger.ij.M4(Z12.f23262k))) {
                    anVar.rd(false, false);
                }
                View view = anVar.f43950r9;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    D1((org.telegram.ui.Cells.q1) view, f13);
                }
                invalidate();
            }
        } else if (anVar.f43950r9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f43681n3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = anVar.f43950r9;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    f11 = ((org.telegram.ui.Cells.q1) view2).R1(false);
                } else if (view2 instanceof org.telegram.ui.Cells.t0) {
                    f11 = ((org.telegram.ui.Cells.t0) view2).getWalletSlidingOffset();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= org.telegram.messenger.g0.L(50.0f)) {
                    org.telegram.messenger.ij Z13 = an.Z1(anVar);
                    boolean T62 = anVar.T6(Z13);
                    uj ujVar = anVar.f43752c1;
                    if ((ujVar != null && ujVar.getVisibility() == 0 && ((!anVar.W0 || !T62) && !Z13.V1)) || ((chat = anVar.f43777e) != null && ((org.telegram.messenger.t3.r0(chat) && !anVar.da()) || ((org.telegram.messenger.t3.T(anVar.f43777e) && !org.telegram.messenger.t3.w(5, anVar.f43777e) && !anVar.f43777e.megagroup) || !org.telegram.messenger.t3.n(anVar.f43777e))))) {
                        if (Z13.d1() != 0 && (S8 = anVar.S8(Z13.d1())) != null && (ijVar = S8.h) != null) {
                            Z13 = ijVar;
                        }
                        anVar.D5 = Z13;
                        Bundle h = org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true);
                        h.putBoolean("quote", true);
                        h.putBoolean("reply_to", true);
                        long o4 = org.telegram.messenger.m5.o(Z13.b1());
                        int i10 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
                        if (i10 != 0 && o4 != anVar.a() && o4 != anVar.getUserConfig().e() && i10 > 0) {
                            h.putLong("reply_to_author", o4);
                        }
                        h.putInt("messagesCount", 1);
                        h.putBoolean("canSelectTopics", true);
                        ww wwVar = new ww(h);
                        wwVar.C2 = anVar;
                        anVar.presentFragment(wwVar);
                    } else {
                        anVar.ec(an.Z1(anVar));
                    }
                }
            }
            View view3 = anVar.f43950r9;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                f10 = ((org.telegram.ui.Cells.q1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                f10 = ((org.telegram.ui.Cells.t0) view3).getWalletSlidingOffset();
            } else {
                f10 = 0.0f;
            }
            this.f43684q3 = f10;
            if (f10 == 0.0f) {
                anVar.f43950r9 = null;
            }
            this.f43682o3 = System.currentTimeMillis();
            this.f43683p3 = 0.0f;
            invalidate();
            anVar.s9 = false;
            anVar.f44040y9 = false;
            anVar.B0.R = true;
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
        an anVar = this.F3;
        anVar.I8 = null;
        canvas.save();
        if (anVar.f43911oa != null && anVar.f43865ka) {
            boolean z9 = anVar.f43876la;
        }
        this.E1.setEmpty();
        if (anVar.f43814ga != 0.0f) {
            int save = canvas.save();
            if (anVar.f43899na != 0.0f) {
                f10 = (anVar.f44043z0.getMeasuredHeight() - anVar.f43814ga) * anVar.f43899na;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-anVar.f43814ga) - f10;
            anVar.Sa = f11;
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
    public final void j1(View view, float f10, float f11, boolean z9) {
        org.telegram.messenger.dj currentMessagesGroup;
        super.j1(view, f10, f11, z9);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (!messageObject.J3() && !messageObject.V2() && (currentMessagesGroup = q1Var.getCurrentMessagesGroup()) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aj.onDraw(android.graphics.Canvas):void");
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
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.F3;
        pl plVar = anVar.f43936q9;
        plVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f30658f0);
            plVar.f30684z = false;
        }
        if (!this.V1 && ((iVar = anVar.f43937qa) == null || !iVar.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
                C1(motionEvent);
                if (onInterceptTouchEvent || anVar.f43987u9) {
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
        int i13 = this.f43674f3;
        int i14 = i11 - i7;
        an anVar = this.F3;
        if (i13 != i14) {
            if (i13 != 0) {
                anVar.E9(false);
            }
            this.f43674f3 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.E3 != measuredHeight) {
            this.D3 = true;
            cj cjVar = anVar.A0;
            if (cjVar != null) {
                cjVar.g();
            }
            anVar.f43864k9.a();
            this.D3 = false;
            this.E3 = measuredHeight;
        }
        anVar.f43824h6 = false;
        pl plVar = anVar.f43936q9;
        if (plVar != null && plVar.x()) {
            anVar.f43936q9.w();
        }
        anVar.L9();
        anVar.ba();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        vo voVar;
        an anVar = this.F3;
        te.a aVar = anVar.Yc;
        pl plVar = anVar.f43936q9;
        plVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(plVar.f30658f0);
            plVar.f30684z = false;
        }
        if (motionEvent.getAction() == 0) {
            anVar.La = true;
        }
        if (anVar.f43814ga != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, anVar.f43814ga / org.telegram.messenger.g0.L(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (voVar = anVar.f43840ia) != null && !voVar.R) {
                if (voVar.K != 1.0f) {
                    float f10 = anVar.f43814ga;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, org.telegram.messenger.g0.L(8.0f) + f10);
                    anVar.f43852ja = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final aj f52231b;

                        {
                            this.f52231b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    an anVar2 = this.f52231b.F3;
                                    anVar2.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar2.f44043z0.invalidate();
                                    return;
                                case 1:
                                    an anVar3 = this.f52231b.F3;
                                    anVar3.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar3.f44043z0.invalidate();
                                    return;
                                case 2:
                                    an anVar4 = this.f52231b.F3;
                                    anVar4.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar4.f44043z0.invalidate();
                                    return;
                                default:
                                    an anVar5 = this.f52231b.F3;
                                    anVar5.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    anVar5.f44043z0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40366f;
                    ofFloat.setInterpolator(xqVar);
                    ofFloat.start();
                    final vo voVar2 = anVar.f43840ia;
                    bh bhVar = new bh(this, 3);
                    AnimatorSet animatorSet = voVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        voVar2.J.cancel();
                    }
                    voVar2.Y = bhVar;
                    voVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(voVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vo voVar3 = voVar2;
                                    voVar3.getClass();
                                    voVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    voVar3.T.invalidate();
                                    View view = voVar3.f50711a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vo voVar4 = voVar2;
                                    voVar4.getClass();
                                    voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = voVar4.f50711a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(voVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    vo voVar3 = voVar2;
                                    voVar3.getClass();
                                    voVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    voVar3.T.invalidate();
                                    View view = voVar3.f50711a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    vo voVar4 = voVar2;
                                    voVar4.getClass();
                                    voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = voVar4.f50711a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    voVar2.J.addListener(new va(voVar2, 8));
                    voVar2.J.playTogether(ofFloat2, ofFloat3);
                    voVar2.J.setDuration(120L);
                    voVar2.J.setInterpolator(xqVar);
                    voVar2.J.start();
                } else {
                    an.e2(anVar);
                }
            } else {
                vo voVar3 = anVar.f43840ia;
                if (voVar3 != null && voVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    vo voVar4 = anVar.f43840ia;
                    if (currentTimeMillis - voVar4.U < 500 && voVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        anVar.f43852ja = animatorSet2;
                        if (anVar.f43840ia != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(anVar.f43814ga, org.telegram.messenger.g0.L(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final aj f52231b;

                            {
                                this.f52231b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        an anVar2 = this.f52231b.F3;
                                        anVar2.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.f44043z0.invalidate();
                                        return;
                                    case 1:
                                        an anVar3 = this.f52231b.F3;
                                        anVar3.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.f44043z0.invalidate();
                                        return;
                                    case 2:
                                        an anVar4 = this.f52231b.F3;
                                        anVar4.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.f44043z0.invalidate();
                                        return;
                                    default:
                                        an anVar5 = this.f52231b.F3;
                                        anVar5.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.f44043z0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.xq.f40366f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final aj f52231b;

                            {
                                this.f52231b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        an anVar2 = this.f52231b.F3;
                                        anVar2.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar2.f44043z0.invalidate();
                                        return;
                                    case 1:
                                        an anVar3 = this.f52231b.F3;
                                        anVar3.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar3.f44043z0.invalidate();
                                        return;
                                    case 2:
                                        an anVar4 = this.f52231b.F3;
                                        anVar4.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar4.f44043z0.invalidate();
                                        return;
                                    default:
                                        an anVar5 = this.f52231b.F3;
                                        anVar5.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        anVar5.f44043z0.invalidate();
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
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(anVar.f43814ga, 0.0f);
                anVar.f43852ja = ofFloat6;
                if (anVar.f43840ia != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final aj f52231b;

                    {
                        this.f52231b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                an anVar2 = this.f52231b.F3;
                                anVar2.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar2.f44043z0.invalidate();
                                return;
                            case 1:
                                an anVar3 = this.f52231b.F3;
                                anVar3.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar3.f44043z0.invalidate();
                                return;
                            case 2:
                                an anVar4 = this.f52231b.F3;
                                anVar4.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar4.f44043z0.invalidate();
                                return;
                            default:
                                an anVar5 = this.f52231b.F3;
                                anVar5.f43814ga = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                anVar5.f44043z0.invalidate();
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
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
                C1(motionEvent);
                if (anVar.f44040y9 || anVar.f43987u9 || onTouchEvent) {
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
        if (this.F3.f43787e9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        org.telegram.ui.Components.ck0 b42;
        org.telegram.ui.Components.p71 p71Var;
        super.requestDisallowInterceptTouchEvent(z9);
        View view = this.F3.f43950r9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.q1) && (b42 = ((org.telegram.ui.Cells.q1) view).b4()) != null && (p71Var = b42.f32613d0) != null && b42.f32614e0 && p71Var.f36833w && !p71Var.E) {
                if (p71Var.f36834x) {
                    if (!p71Var.f36835y && (p71Var.L & 3) != 1) {
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
        jh.a aVar = this.F3.f43939qc;
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
            an anVar = this.F3;
            anVar.K9();
            anVar.M9();
        }
    }

    public final void z1(Canvas canvas, RectF rectF) {
        int i7;
        int i10;
        float f10;
        char c10;
        an anVar;
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
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        aj ajVar = this;
        Canvas canvas2 = canvas;
        int childCount = ajVar.getChildCount();
        org.telegram.messenger.dj djVar3 = null;
        int i19 = 0;
        while (true) {
            i7 = 8;
            i10 = 2;
            f10 = 0.0f;
            c10 = 0;
            anVar = ajVar.F3;
            if (i19 < childCount) {
                View childAt = ajVar.getChildAt(i19);
                f11 = 1.0f;
                if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                    if (!an.l2(anVar, childAt, rectF)) {
                        if (childAt instanceof org.telegram.ui.Cells.y1) {
                            canvas2.save();
                            canvas2.translate(childAt.getX(), childAt.getY());
                            ((org.telegram.ui.Cells.y1) childAt).a(canvas2);
                            canvas2.restore();
                        } else if (anVar.C0.f46990n && (childAt instanceof org.telegram.ui.Cells.f0)) {
                            float measuredHeight3 = ((((ajVar.getMeasuredHeight() - anVar.L9) - anVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.L9;
                            if (!((org.telegram.ui.Cells.f0) childAt).I && !anVar.f44043z0.V1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                            float measuredHeight4 = ((((ajVar.getMeasuredHeight() - anVar.L9) - anVar.Ua) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + anVar.L9;
                            if (!((org.telegram.ui.Cells.ra) childAt).O && !anVar.f44043z0.V1) {
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
                                    if ((!backgroundDrawable.f34602f && !q1Var.y2()) || (currentPosition != null && (2 & currentPosition.f21450l) == 0)) {
                                        i16 = i19;
                                        z11 = true;
                                    } else {
                                        boolean z12 = q1Var.f30055w6;
                                        org.telegram.ui.ActionBar.f6 f6Var = ajVar.f36981n2;
                                        z11 = true;
                                        if (z12 || q1Var.f30068x6) {
                                            i16 = i19;
                                            if (currentPosition == null) {
                                                Paint W0 = ajVar.W0("paintChatMessageBackgroundSelected");
                                                ym ymVar = anVar.f44028xa;
                                                if ((ymVar != null && ymVar.f52260q) || W0 == null) {
                                                    W0 = org.telegram.ui.ActionBar.k6.f27791a2;
                                                    W0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28194vd, f6Var));
                                                } else {
                                                    if (!anVar.T9()) {
                                                        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                                        measuredHeight = kVar.getMeasuredHeight();
                                                    } else {
                                                        measuredHeight = anVar.f44043z0.getTop();
                                                    }
                                                    float backgroundTranslationY = measuredHeight - anVar.l1.getBackgroundTranslationY();
                                                    int backgroundSizeY = anVar.l1.getBackgroundSizeY();
                                                    ym ymVar2 = anVar.f44028xa;
                                                    if (ymVar2 != null) {
                                                        ymVar2.b(q1Var.getX(), backgroundTranslationY, ajVar.getMeasuredWidth(), backgroundSizeY);
                                                    } else {
                                                        org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY, ajVar.getMeasuredWidth(), backgroundSizeY);
                                                    }
                                                }
                                                Paint paint = W0;
                                                canvas2.save();
                                                canvas2.translate(0.0f, q1Var.getTranslationY());
                                                int alpha = paint.getAlpha();
                                                paint.setAlpha((int) (q1Var.getAlpha() * q1Var.getHighlightAlpha() * alpha));
                                                canvas2.drawRect(0.0f, q1Var.getTop(), ajVar.getMeasuredWidth(), q1Var.getBottom(), paint);
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
                                                    View childAt2 = ajVar.getChildAt(i20);
                                                    int i21 = i19;
                                                    if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                                                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt2;
                                                        if (q1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                            org.telegram.ui.Components.i90 backgroundDrawable2 = q1Var2.getBackgroundDrawable();
                                                            i18 = i20;
                                                            y10 = Math.min(y10, (int) q1Var2.getY());
                                                            measuredHeight5 = Math.max(measuredHeight5, q1Var2.getMeasuredHeight() + ((int) q1Var2.getY()));
                                                            long j10 = backgroundDrawable2.f34607l;
                                                            if (j10 > j3) {
                                                                j3 = j10;
                                                                f10 = q1Var2.getX() + backgroundDrawable2.h;
                                                                f13 = q1Var2.getY() + backgroundDrawable2.f34604i;
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
                                                backgroundDrawable.f34605j = f10;
                                                backgroundDrawable.f34606k = f13 - y10;
                                                i17 = measuredHeight5 - y10;
                                            }
                                            int i22 = i17 + y10;
                                            canvas2.clipRect(0, y10, ajVar.getMeasuredWidth(), i22);
                                            Paint W02 = ajVar.W0("paintChatMessageBackgroundSelected");
                                            ym ymVar3 = anVar.f44028xa;
                                            if (ymVar3 != null && !ymVar3.f52260q && W02 != null) {
                                                backgroundDrawable.f34599b = W02;
                                                if (!anVar.T9()) {
                                                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                                                    measuredHeight2 = kVar2.getMeasuredHeight();
                                                } else {
                                                    measuredHeight2 = anVar.f44043z0.getTop();
                                                }
                                                float backgroundTranslationY2 = measuredHeight2 - anVar.l1.getBackgroundTranslationY();
                                                int backgroundSizeY2 = anVar.l1.getBackgroundSizeY();
                                                ym ymVar4 = anVar.f44028xa;
                                                if (ymVar4 != null) {
                                                    ymVar4.b(q1Var.getX(), backgroundTranslationY2, ajVar.getMeasuredWidth(), backgroundSizeY2);
                                                } else {
                                                    org.telegram.ui.ActionBar.k6.r(q1Var.getX(), backgroundTranslationY2, ajVar.getMeasuredWidth(), backgroundSizeY2);
                                                }
                                            } else {
                                                backgroundDrawable.f34599b = null;
                                                backgroundDrawable.f34598a.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28194vd, f6Var));
                                            }
                                            backgroundDrawable.setBounds(0, y10, ajVar.getMeasuredWidth(), i22);
                                            backgroundDrawable.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    }
                                    djVar3 = currentMessagesGroup2;
                                }
                                if (anVar.X8 != q1Var && currentMessagesGroup2 == null && q1Var.L0()) {
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
                                        canvas2.translate(anVar.l9() / 2.0f, 0.0f);
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
        View view = anVar.X8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            djVar = ((org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup();
        } else {
            djVar = null;
        }
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList2 = ajVar.f43678k3;
            arrayList2.clear();
            if (i23 == i10 && !anVar.f44043z0.V1) {
                i11 = i7;
                i12 = i10;
                f12 = f10;
            } else {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = anVar.f44043z0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= anVar.f44043z0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && q1Var3.getVisibility() != i7 && (currentMessagesGroup = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.cj cjVar2 = currentMessagesGroup.f22044m;
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
                            if ((i23 != i15 || cjVar2.f21866i) && ((i23 != 0 || !q1Var3.getMessageObject().Z) && ((i23 != 1 || q1Var3.getMessageObject().Z) && ((i23 != i10 || q1Var3.ya) && (i23 == i10 || !q1Var3.ya))))) {
                                if (!arrayList2.contains(currentMessagesGroup)) {
                                    cjVar2.f21860a = 0;
                                    cjVar2.f21861b = 0;
                                    cjVar2.f21862c = 0;
                                    cjVar2.d = 0;
                                    cjVar2.f21869l = false;
                                    cjVar2.f21868k = false;
                                    cjVar2.f21870m = q1Var3;
                                    arrayList2.add(currentMessagesGroup);
                                }
                                cjVar2.f21868k = q1Var3.I2();
                                cjVar2.f21869l = q1Var3.H2();
                                int backgroundDrawableLeft = q1Var3.getBackgroundDrawableLeft() + q1Var3.getLeft();
                                int backgroundDrawableRight = q1Var3.getBackgroundDrawableRight() + q1Var3.getLeft();
                                int backgroundDrawableTop = q1Var3.getBackgroundDrawableTop() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                int backgroundDrawableBottom = q1Var3.getBackgroundDrawableBottom() + q1Var3.getPaddingTop() + q1Var3.getTop();
                                if ((q1Var3.getCurrentPosition().f21450l & 4) == 0) {
                                    backgroundDrawableTop -= org.telegram.messenger.g0.L(10.0f);
                                }
                                int i25 = backgroundDrawableTop;
                                if ((q1Var3.getCurrentPosition().f21450l & 8) == 0) {
                                    backgroundDrawableBottom = org.telegram.messenger.g0.L(10.0f) + backgroundDrawableBottom;
                                }
                                int i26 = backgroundDrawableBottom;
                                if (q1Var3.ya) {
                                    cjVar2.f21870m = q1Var3;
                                }
                                int i27 = cjVar2.f21861b;
                                if (i27 == 0 || i25 < i27) {
                                    cjVar2.f21861b = i25;
                                }
                                int i28 = cjVar2.d;
                                if (i28 == 0 || i26 > i28) {
                                    cjVar2.d = i26;
                                }
                                int i29 = cjVar2.f21860a;
                                if (i29 == 0 || backgroundDrawableLeft < i29) {
                                    cjVar2.f21860a = backgroundDrawableLeft;
                                }
                                int i30 = cjVar2.f21862c;
                                if (i30 == 0 || backgroundDrawableRight > i30) {
                                    cjVar2.f21862c = backgroundDrawableRight;
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
                    org.telegram.messenger.cj cjVar3 = djVar4.f22044m;
                    ArrayList arrayList3 = djVar4.d;
                    float R1 = cjVar3.f21870m.R1(true);
                    float f14 = cjVar3.f21860a + R1 + cjVar3.f21863e;
                    float f15 = cjVar3.f21861b + cjVar3.f21864f;
                    float f16 = cjVar3.f21865g + cjVar3.f21862c + R1;
                    float f17 = cjVar3.d + cjVar3.h;
                    if (!cjVar3.f21867j) {
                        f15 += cjVar3.f21870m.getTranslationY();
                        f17 += cjVar3.f21870m.getTranslationY();
                    }
                    float f18 = f15;
                    if (f17 > org.telegram.messenger.g0.L(20.0f) + anVar.f44043z0.getMeasuredHeight()) {
                        f17 = org.telegram.messenger.g0.L(20.0f) + anVar.f44043z0.getMeasuredHeight();
                    }
                    if (cjVar3.f21870m.getScaleX() == f11 && cjVar3.f21870m.getScaleY() == f11) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z9) {
                        canvas2.save();
                        djVar2 = djVar4;
                        i13 = i23;
                        arrayList = arrayList2;
                        canvas2.scale(cjVar3.f21870m.getScaleX(), cjVar3.f21870m.getScaleY(), com.google.android.recaptcha.internal.a.A(f16, f14, 2.0f, f14), com.google.android.recaptcha.internal.a.A(f17, f18, 2.0f, f18));
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
                            cjVar = cjVar3;
                            if (org.telegram.messenger.ij.B0(ijVar.f23262k) == anVar.f43848j6) {
                                c11 = 0;
                            } else {
                                c11 = 1;
                            }
                            if (anVar.f43884m6[c11].indexOfKey(ijVar.f1()) < 0) {
                                z10 = false;
                                break;
                            } else {
                                i32++;
                                cjVar3 = cjVar;
                            }
                        } else {
                            cjVar = cjVar3;
                            z10 = true;
                            break;
                        }
                    }
                    float f19 = f17;
                    an anVar2 = anVar;
                    boolean z13 = z10;
                    org.telegram.messenger.dj djVar5 = djVar2;
                    cjVar.f21870m.K0(canvas, (int) f14, (int) f18, (int) f16, (int) f17, cjVar.f21868k, cjVar.f21869l, z13, 0);
                    if (djVar5 != djVar) {
                        cjVar.f21870m = null;
                    }
                    cjVar.f21872o = djVar5.f22036c;
                    if (z9) {
                        canvas.restore();
                        for (int i33 = 0; i33 < childCount; i33++) {
                            View childAt4 = anVar2.f44043z0.getChildAt(i33);
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
            ajVar = this;
        }
    }
}
