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
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ij extends mm {
    public int U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int a3;
    public int f39175b3;
    public int f39176c3;
    public long f39177d3;
    public float f39178e3;
    public float f39179f3;
    public boolean f39180g3;
    public final float f39181h3;
    public final Paint f39182i3;
    public final Paint f39183j3;
    public final gb.a f39184k3;
    public final o1.j f39185l3;
    public final gb.a f39186m3;
    public final o1.j f39187n3;
    public final gb.a f39188o3;
    public final o1.j f39189p3;
    public boolean f39190q3;
    public final Path f39191r3;
    public boolean f39192s3;
    public int f39193t3;
    public final qn f39194u3;

    public ij(qn qnVar, Context context, on onVar) {
        super(qnVar, context, onVar);
        this.f39194u3 = qnVar;
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList(10);
        this.f39181h3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f39182i3 = paint;
        Paint paint2 = new Paint(1);
        this.f39183j3 = paint2;
        gb.a aVar = new gb.a(0.0f);
        this.f39184k3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.f18795g = 2000.0f;
        jVar.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 1500.0f, 1.0f);
        jVar.b(new o1.g(this) {
            public final ij f38556b;

            {
                this.f38556b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f38556b.invalidate();
                        return;
                    case 1:
                        this.f38556b.invalidate();
                        return;
                    default:
                        this.f38556b.invalidate();
                        return;
                }
            }
        });
        this.f39185l3 = jVar;
        gb.a aVar2 = new gb.a(0.0f);
        this.f39186m3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 400.0f, 0.5f);
        jVar2.b(new o1.g(this) {
            public final ij f38556b;

            {
                this.f38556b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f38556b.invalidate();
                        return;
                    case 1:
                        this.f38556b.invalidate();
                        return;
                    default:
                        this.f38556b.invalidate();
                        return;
                }
            }
        });
        this.f39187n3 = jVar2;
        gb.a aVar3 = new gb.a(0.0f);
        this.f39188o3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 200.0f, 1.0f);
        jVar3.b(new o1.g(this) {
            public final ij f38556b;

            {
                this.f38556b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f38556b.invalidate();
                        return;
                    case 1:
                        this.f38556b.invalidate();
                        return;
                    default:
                        this.f38556b.invalidate();
                        return;
                }
            }
        });
        this.f39189p3 = jVar3;
        this.f39191r3 = new Path();
        this.f39193t3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
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
        if (this.f39194u3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        qn qnVar = this.f39194u3;
        qnVar.f42044q8 = null;
        canvas.save();
        if (qnVar.R9 != null && qnVar.N9) {
            boolean z10 = qnVar.O9;
        }
        this.C1.setEmpty();
        if (qnVar.J9 != 0.0f) {
            int save = canvas.save();
            if (qnVar.Q9 != 0.0f) {
                f10 = (qnVar.f42077t0.getMeasuredHeight() - qnVar.J9) * qnVar.Q9;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-qnVar.J9) - f10;
            qnVar.f42100ua = f11;
            canvas.translate(0.0f, f11);
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ij.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ij.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f10, float f11, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.t1)) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            t1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ij.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f39194u3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ch.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qn qnVar = this.f39194u3;
        jm jmVar = qnVar.Y8;
        jmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(jmVar.f24083g0);
            jmVar.f24112z = false;
        }
        if (this.T1 || ((kVar = qnVar.T9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (!kVar2.s() && !qnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = this.U2;
        int i14 = i11 - i9;
        qn qnVar = this.f39194u3;
        if (i13 != i14) {
            if (i13 != 0) {
                qnVar.h9(false);
            }
            this.U2 = i14;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f39193t3 != measuredHeight) {
            this.f39192s3 = true;
            kj kjVar = qnVar.f42090u0;
            if (kjVar != null) {
                kjVar.g();
            }
            qnVar.S8.a();
            this.f39192s3 = false;
            this.f39193t3 = measuredHeight;
        }
        qnVar.N5 = false;
        jm jmVar = qnVar.Y8;
        if (jmVar != null && jmVar.y()) {
            qnVar.Y8.x();
        }
        qnVar.p9();
        qnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kp kpVar;
        qn qnVar = this.f39194u3;
        td.a aVar = qnVar.f42048qc;
        jm jmVar = qnVar.Y8;
        jmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(jmVar.f24083g0);
            jmVar.f24112z = false;
        }
        if (motionEvent.getAction() == 0) {
            qnVar.f42023oa = true;
        }
        if (qnVar.J9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, qnVar.J9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (kpVar = qnVar.L9) != null && !kpVar.N) {
                if (kpVar.G != 1.0f) {
                    float f10 = qnVar.J9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, AndroidUtilities.dp(8.0f) + f10);
                    qnVar.M9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ij f38823b;

                        {
                            this.f38823b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    qn qnVar2 = this.f38823b.f39194u3;
                                    qnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qnVar2.f42077t0.invalidate();
                                    return;
                                case 1:
                                    qn qnVar3 = this.f38823b.f39194u3;
                                    qnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qnVar3.f42077t0.invalidate();
                                    return;
                                case 2:
                                    qn qnVar4 = this.f38823b.f39194u3;
                                    qnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qnVar4.f42077t0.invalidate();
                                    return;
                                default:
                                    qn qnVar5 = this.f38823b.f39194u3;
                                    qnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qnVar5.f42077t0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
                    ofFloat.setInterpolator(grVar);
                    ofFloat.start();
                    final kp kpVar2 = qnVar.L9;
                    ri riVar = new ri(this, 1);
                    AnimatorSet animatorSet = kpVar2.F;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        kpVar2.F.cancel();
                    }
                    kpVar2.U = riVar;
                    kpVar2.F = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(kpVar2.G, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    kp kpVar3 = kpVar2;
                                    kpVar3.getClass();
                                    kpVar3.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kpVar3.P.invalidate();
                                    View view = kpVar3.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    kp kpVar4 = kpVar2;
                                    kpVar4.getClass();
                                    kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = kpVar4.W;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(kpVar2.H, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    kp kpVar3 = kpVar2;
                                    kpVar3.getClass();
                                    kpVar3.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    kpVar3.P.invalidate();
                                    View view = kpVar3.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    kp kpVar4 = kpVar2;
                                    kpVar4.getClass();
                                    kpVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = kpVar4.W;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    kpVar2.F.addListener(new mh.x(kpVar2, 29));
                    kpVar2.F.playTogether(ofFloat2, ofFloat3);
                    kpVar2.F.setDuration(120L);
                    kpVar2.F.setInterpolator(grVar);
                    kpVar2.F.start();
                } else {
                    qn.X1(qnVar);
                }
            } else {
                kp kpVar3 = qnVar.L9;
                if (kpVar3 != null && kpVar3.N) {
                    long currentTimeMillis = System.currentTimeMillis();
                    kp kpVar4 = qnVar.L9;
                    if (currentTimeMillis - kpVar4.Q < 500 && kpVar4.I) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        qnVar.M9 = animatorSet2;
                        if (qnVar.L9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(qnVar.J9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ij f38823b;

                            {
                                this.f38823b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        qn qnVar2 = this.f38823b.f39194u3;
                                        qnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar2.f42077t0.invalidate();
                                        return;
                                    case 1:
                                        qn qnVar3 = this.f38823b.f39194u3;
                                        qnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar3.f42077t0.invalidate();
                                        return;
                                    case 2:
                                        qn qnVar4 = this.f38823b.f39194u3;
                                        qnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar4.f42077t0.invalidate();
                                        return;
                                    default:
                                        qn qnVar5 = this.f38823b.f39194u3;
                                        qnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar5.f42077t0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ij f38823b;

                            {
                                this.f38823b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        qn qnVar2 = this.f38823b.f39194u3;
                                        qnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar2.f42077t0.invalidate();
                                        return;
                                    case 1:
                                        qn qnVar3 = this.f38823b.f39194u3;
                                        qnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar3.f42077t0.invalidate();
                                        return;
                                    case 2:
                                        qn qnVar4 = this.f38823b.f39194u3;
                                        qnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar4.f42077t0.invalidate();
                                        return;
                                    default:
                                        qn qnVar5 = this.f38823b.f39194u3;
                                        qnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qnVar5.f42077t0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(rh.m.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(qnVar.J9, 0.0f);
                qnVar.M9 = ofFloat6;
                if (qnVar.L9 != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ij f38823b;

                    {
                        this.f38823b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                qn qnVar2 = this.f38823b.f39194u3;
                                qnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qnVar2.f42077t0.invalidate();
                                return;
                            case 1:
                                qn qnVar3 = this.f38823b.f39194u3;
                                qnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qnVar3.f42077t0.invalidate();
                                return;
                            case 2:
                                qn qnVar4 = this.f38823b.f39194u3;
                                qnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qnVar4.f42077t0.invalidate();
                                return;
                            default:
                                qn qnVar5 = this.f38823b.f39194u3;
                                qnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                qnVar5.f42077t0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(rh.m.V);
                ofFloat6.start();
            }
        }
        if (!this.T1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar.s() && !qnVar.A9()) {
                y1(motionEvent);
                if (qnVar.f41861b9 || onTouchEvent) {
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
        if (this.f39194u3.M8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f39194u3.Z8 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39192s3) {
            return;
        }
        pg.a aVar = this.f39194u3.Mb;
        if (aVar.f45840b != 0) {
            int childCount = aVar.f45839a.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                aVar.f45839a.getChildAt(i9).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(f2.w0 w0Var) {
        if (this.T1) {
            return;
        }
        super.setItemAnimator(w0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            qn qnVar = this.f39194u3;
            qnVar.o9();
            qnVar.r9();
        }
    }

    public final void w1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ij.w1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void x1(Canvas canvas, RectF rectF) {
        float f10;
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.V2;
        int size = arrayList2.size();
        qn qnVar = this.f39194u3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i9);
                if (!qn.d2(qnVar, t1Var, rectF)) {
                    canvas.save();
                    canvas.translate(t1Var.E2(false) + t1Var.getLeft(), t1Var.getY() + t1Var.getPaddingTop());
                    if (t1Var.a()) {
                        f14 = t1Var.getAlpha();
                    } else {
                        f14 = 1.0f;
                    }
                    t1Var.m2(f14, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.W2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i10);
                if (!qn.d2(qnVar, t1Var2, rectF)) {
                    float E2 = t1Var2.E2(false) + t1Var2.getLeft();
                    float y10 = t1Var2.getY() + t1Var2.getPaddingTop();
                    if (t1Var2.a()) {
                        f13 = t1Var2.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y10);
                    t1Var2.setInvalidatesParent(true);
                    t1Var2.W1(canvas, f13);
                    t1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.X2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i11 = 0;
            while (i11 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i11);
                if (qn.d2(qnVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (t1Var3.a()) {
                        f12 = t1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float E22 = t1Var3.E2(z13) + t1Var3.getLeft();
                    float y11 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = t1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f15 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f16 = transitionParams.top + transitionParams.offsetTop;
                            float f17 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f18 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f16 += t1Var3.getTranslationY();
                                f18 += t1Var3.getTranslationY();
                            }
                            canvas.clipRect(f15 + AndroidUtilities.dp(8.0f), f16 + AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f), f18 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (t1Var3.getTransitionParams().f25231v0) {
                        canvas.translate(E22, y11);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.I1(f12, canvas, z11);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i11++;
                arrayList4 = arrayList;
                z12 = 1;
                z13 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.Y2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i12 = 0; i12 < size4; i12++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i12);
                if (!qn.d2(qnVar, t1Var4, rectF)) {
                    if (t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (t1Var4.a()) {
                        f11 = t1Var4.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E24 = t1Var4.E2(false) + t1Var4.getLeft();
                    float y12 = t1Var4.getY() + t1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = t1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f19 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f20 = transitionParams2.top + transitionParams2.offsetTop;
                        float f21 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f22 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f20 += t1Var4.getTranslationY();
                            f22 += t1Var4.getTranslationY();
                        }
                        canvas.clipRect(f19 + AndroidUtilities.dp(f10), f20 + AndroidUtilities.dp(f10), f21 - AndroidUtilities.dp(f10), f22 - AndroidUtilities.dp(f10));
                    }
                    if (!z10 && t1Var4.getTransitionParams().f25231v0) {
                        canvas.translate(E24, y12);
                        t1Var4.setInvalidatesParent(true);
                        t1Var4.d2(canvas, f11, null);
                        t1Var4.N1(canvas, f11);
                        t1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void y1(MotionEvent motionEvent) {
        float f10;
        float f11;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y82;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        qn qnVar = this.f39194u3;
        if (motionEvent != null) {
            qnVar.f42157z4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !qnVar.f41861b9 && !qnVar.f41847a9 && qnVar.Z8 == null) {
            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (qnVar.Z8 != null) {
                        qn.V1(qnVar, 0.0f);
                    }
                    qnVar.Z8 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = qn.T1(qnVar);
                    boolean F6 = qnVar.F6(T1);
                    int i9 = qnVar.N3;
                    if ((i9 == 0 || i9 == 5 || i9 == 8 || (i9 == 3 && qnVar.Z3 == qnVar.getUserConfig().getClientUserId())) && (((arrayList = qnVar.W3) == null || !arrayList.contains(T1)) && ((qnVar.E8(T1) != 1 || (T1.getDialogId() != qnVar.H6 && !T1.needDrawBluredPreview())) && ((qnVar.h != null || T1.getId() >= 0) && (((chat2 = qnVar.f41890e) == null || !ChatObject.isForum(chat2) || F6) && !qnVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f39176c3 = motionEvent.getPointerId(0);
                        qnVar.f41847a9 = true;
                        this.a3 = (int) motionEvent.getX();
                        this.f39175b3 = (int) motionEvent.getY();
                        return;
                    }
                    qn.V1(qnVar, 0.0f);
                    qnVar.Z8 = null;
                    return;
                }
                return;
            }
        }
        if (qnVar.Z8 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39176c3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.a3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f39175b3);
            if (getScrollState() == 0 && qnVar.f41847a9 && !qnVar.f41861b9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                qnVar.Z8.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                qnVar.f42103v0.R = false;
                qnVar.f41847a9 = false;
                qnVar.f41861b9 = true;
                this.a3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (qnVar.f41861b9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f39180g3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f39180g3 = true;
                    }
                } else {
                    this.f39180g3 = false;
                }
                float f12 = max;
                qn.V1(qnVar, f12);
                MessageObject T12 = qn.T1(qnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    qnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = qnVar.Z8;
                if (e2.c.v(t1Var)) {
                    z1(t1Var, f12);
                }
                invalidate();
            }
        } else if (qnVar.Z8 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f39176c3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = qnVar.Z8;
                if (e2.c.v(t1Var2)) {
                    f11 = t1Var2.E2(false);
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = qn.T1(qnVar);
                    boolean F62 = qnVar.F6(T13);
                    fk fkVar = qnVar.K0;
                    if ((fkVar != null && fkVar.getVisibility() == 0 && ((!qnVar.E0 || !F62) && !T13.wasJustSent)) || ((chat = qnVar.f41890e) != null && ((ChatObject.isNotInChat(chat) && !qnVar.F9()) || ((ChatObject.isChannel(qnVar.f41890e) && !ChatObject.canPost(qnVar.f41890e) && !qnVar.f41890e.megagroup) || !ChatObject.canSendMessages(qnVar.f41890e))))) {
                        if (T13.getGroupId() != 0 && (y82 = qnVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        qnVar.f41959j5 = T13;
                        Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
                        e10.putBoolean("quote", true);
                        e10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i10 != 0 && peerDialogId != qnVar.a() && peerDialogId != qnVar.getUserConfig().getClientUserId() && i10 > 0) {
                            e10.putLong("reply_to_author", peerDialogId);
                        }
                        e10.putInt("messagesCount", 1);
                        e10.putBoolean("canSelectTopics", true);
                        dy dyVar = new dy(e10);
                        dyVar.f37752y2 = qnVar;
                        qnVar.presentFragment(dyVar);
                    } else {
                        qnVar.Bb(qn.T1(qnVar));
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = qnVar.Z8;
            if (e2.c.v(t1Var3)) {
                f10 = t1Var3.getSlidingOffsetX();
            } else {
                f10 = 0.0f;
            }
            this.f39179f3 = f10;
            if (f10 == 0.0f) {
                qnVar.Z8 = null;
            }
            this.f39177d3 = System.currentTimeMillis();
            this.f39178e3 = 0.0f;
            invalidate();
            qnVar.f41847a9 = false;
            qnVar.f41861b9 = false;
            qnVar.f42103v0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.t1 t1Var, float f10) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != t1Var && (childAt instanceof org.telegram.ui.Cells.t1)) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    t1Var2.setSlidingOffset(f10);
                    t1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
