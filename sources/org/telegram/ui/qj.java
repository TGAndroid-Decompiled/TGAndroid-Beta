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
public final class qj extends tm {
    public int V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f40535a3;
    public int f40536b3;
    public int c3;
    public int f40537d3;
    public long f40538e3;
    public float f40539f3;
    public float f40540g3;
    public boolean f40541h3;
    public final float f40542i3;
    public final Paint f40543j3;
    public final Paint f40544k3;
    public final kb.a f40545l3;
    public final o1.j f40546m3;
    public final kb.a f40547n3;
    public final o1.j f40548o3;
    public final kb.a f40549p3;
    public final o1.j f40550q3;
    public boolean f40551r3;
    public final Path f40552s3;
    public boolean f40553t3;
    public int f40554u3;
    public final xn f40555v3;

    public qj(xn xnVar, Context context, vn vnVar) {
        super(xnVar, context, vnVar);
        this.f40555v3 = xnVar;
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f40535a3 = new ArrayList(10);
        this.f40542i3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f40543j3 = paint;
        Paint paint2 = new Paint(1);
        this.f40544k3 = paint2;
        kb.a aVar = new kb.a(0.0f);
        this.f40545l3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.f16331g = 2000.0f;
        jVar.f16336u = yh.n(0.0f, 1500.0f, 1.0f);
        jVar.b(new o1.g(this) {
            public final qj f39792b;

            {
                this.f39792b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f39792b.invalidate();
                        return;
                    case 1:
                        this.f39792b.invalidate();
                        return;
                    default:
                        this.f39792b.invalidate();
                        return;
                }
            }
        });
        this.f40546m3 = jVar;
        kb.a aVar2 = new kb.a(0.0f);
        this.f40547n3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.f16336u = yh.n(0.0f, 400.0f, 0.5f);
        jVar2.b(new o1.g(this) {
            public final qj f39792b;

            {
                this.f39792b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f39792b.invalidate();
                        return;
                    case 1:
                        this.f39792b.invalidate();
                        return;
                    default:
                        this.f39792b.invalidate();
                        return;
                }
            }
        });
        this.f40548o3 = jVar2;
        kb.a aVar3 = new kb.a(0.0f);
        this.f40549p3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.f16336u = yh.n(0.0f, 200.0f, 1.0f);
        jVar3.b(new o1.g(this) {
            public final qj f39792b;

            {
                this.f39792b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (r2) {
                    case 0:
                        this.f39792b.invalidate();
                        return;
                    case 1:
                        this.f39792b.invalidate();
                        return;
                    default:
                        this.f39792b.invalidate();
                        return;
                }
            }
        });
        this.f40550q3 = jVar3;
        this.f40552s3 = new Path();
        this.f40554u3 = 0;
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
        if (this.f40555v3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        xn xnVar = this.f40555v3;
        xnVar.f43335r8 = null;
        canvas.save();
        if (xnVar.S9 != null && xnVar.O9) {
            boolean z4 = xnVar.P9;
        }
        this.D1.setEmpty();
        if (xnVar.K9 != 0.0f) {
            int save = canvas.save();
            if (xnVar.R9 != 0.0f) {
                f10 = (xnVar.f43362u0.getMeasuredHeight() - xnVar.K9) * xnVar.R9;
            } else {
                f10 = 0.0f;
            }
            float f11 = (-xnVar.K9) - f10;
            xnVar.f43385va = f11;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f10, float f11, boolean z4) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f10, f11, z4);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.t1)) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            t1Var2.setPressed(z4);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f40555v3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ih.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.f40555v3;
        qm qmVar = xnVar.Z8;
        qmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.f24512g0);
            qmVar.f24541z = false;
        }
        if (this.U1 || ((kVar = xnVar.U9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar2.s() && !xnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = this.V2;
        int i15 = i12 - i10;
        xn xnVar = this.f40555v3;
        if (i14 != i15) {
            if (i14 != 0) {
                xnVar.h9(false);
            }
            this.V2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f40554u3 != measuredHeight) {
            this.f40553t3 = true;
            sj sjVar = xnVar.f43375v0;
            if (sjVar != null) {
                sjVar.g();
            }
            xnVar.T8.a();
            this.f40553t3 = false;
            this.f40554u3 = measuredHeight;
        }
        xnVar.O5 = false;
        qm qmVar = xnVar.Z8;
        if (qmVar != null && qmVar.y()) {
            xnVar.Z8.x();
        }
        xnVar.p9();
        xnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        up upVar;
        xn xnVar = this.f40555v3;
        xd.a aVar = xnVar.f43339rc;
        qm qmVar = xnVar.Z8;
        qmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(qmVar.f24512g0);
            qmVar.f24541z = false;
        }
        if (motionEvent.getAction() == 0) {
            xnVar.f43311pa = true;
        }
        if (xnVar.K9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, xnVar.K9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (upVar = xnVar.M9) != null && !upVar.O) {
                if (upVar.H != 1.0f) {
                    float f10 = xnVar.K9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, AndroidUtilities.dp(8.0f) + f10);
                    xnVar.N9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final qj f40068b;

                        {
                            this.f40068b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    xn xnVar2 = this.f40068b.f40555v3;
                                    xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar2.f43362u0.invalidate();
                                    return;
                                case 1:
                                    xn xnVar3 = this.f40068b.f40555v3;
                                    xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar3.f43362u0.invalidate();
                                    return;
                                case 2:
                                    xn xnVar4 = this.f40068b.f40555v3;
                                    xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar4.f43362u0.invalidate();
                                    return;
                                default:
                                    xn xnVar5 = this.f40068b.f40555v3;
                                    xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    xnVar5.f43362u0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30183f;
                    ofFloat.setInterpolator(prVar);
                    ofFloat.start();
                    final up upVar2 = xnVar.M9;
                    zi ziVar = new zi(this, 1);
                    AnimatorSet animatorSet = upVar2.G;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        upVar2.G.cancel();
                    }
                    upVar2.V = ziVar;
                    upVar2.G = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(upVar2.H, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    up upVar3 = upVar2;
                                    upVar3.getClass();
                                    upVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    upVar3.Q.invalidate();
                                    View view = upVar3.X;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    up upVar4 = upVar2;
                                    upVar4.getClass();
                                    upVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = upVar4.X;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(upVar2.I, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    up upVar3 = upVar2;
                                    upVar3.getClass();
                                    upVar3.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    upVar3.Q.invalidate();
                                    View view = upVar3.X;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    up upVar4 = upVar2;
                                    upVar4.getClass();
                                    upVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = upVar4.X;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    upVar2.G.addListener(new s5(upVar2, 22));
                    upVar2.G.playTogether(ofFloat2, ofFloat3);
                    upVar2.G.setDuration(120L);
                    upVar2.G.setInterpolator(prVar);
                    upVar2.G.start();
                } else {
                    xn.X1(xnVar);
                }
            } else {
                up upVar3 = xnVar.M9;
                if (upVar3 != null && upVar3.O) {
                    long currentTimeMillis = System.currentTimeMillis();
                    up upVar4 = xnVar.M9;
                    if (currentTimeMillis - upVar4.R < 500 && upVar4.J) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        xnVar.N9 = animatorSet2;
                        if (xnVar.M9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(xnVar.K9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final qj f40068b;

                            {
                                this.f40068b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        xn xnVar2 = this.f40068b.f40555v3;
                                        xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.f43362u0.invalidate();
                                        return;
                                    case 1:
                                        xn xnVar3 = this.f40068b.f40555v3;
                                        xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.f43362u0.invalidate();
                                        return;
                                    case 2:
                                        xn xnVar4 = this.f40068b.f40555v3;
                                        xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.f43362u0.invalidate();
                                        return;
                                    default:
                                        xn xnVar5 = this.f40068b.f40555v3;
                                        xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.f43362u0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final qj f40068b;

                            {
                                this.f40068b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        xn xnVar2 = this.f40068b.f40555v3;
                                        xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar2.f43362u0.invalidate();
                                        return;
                                    case 1:
                                        xn xnVar3 = this.f40068b.f40555v3;
                                        xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar3.f43362u0.invalidate();
                                        return;
                                    case 2:
                                        xn xnVar4 = this.f40068b.f40555v3;
                                        xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar4.f43362u0.invalidate();
                                        return;
                                    default:
                                        xn xnVar5 = this.f40068b.f40555v3;
                                        xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        xnVar5.f43362u0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(xh.n.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(xnVar.K9, 0.0f);
                xnVar.N9 = ofFloat6;
                if (xnVar.M9 != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final qj f40068b;

                    {
                        this.f40068b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                xn xnVar2 = this.f40068b.f40555v3;
                                xnVar2.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar2.f43362u0.invalidate();
                                return;
                            case 1:
                                xn xnVar3 = this.f40068b.f40555v3;
                                xnVar3.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar3.f43362u0.invalidate();
                                return;
                            case 2:
                                xn xnVar4 = this.f40068b.f40555v3;
                                xnVar4.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar4.f43362u0.invalidate();
                                return;
                            default:
                                xn xnVar5 = this.f40068b.f40555v3;
                                xnVar5.K9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                xnVar5.f43362u0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(xh.n.V);
                ofFloat6.start();
            }
        }
        if (!this.U1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                y1(motionEvent);
                if (xnVar.f43148c9 || onTouchEvent) {
                    return true;
                }
            } else {
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.f40555v3.N8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (this.f40555v3.f43121a9 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f40553t3) {
            return;
        }
        vg.a aVar = this.f40555v3.Nb;
        if (aVar.f49256b != 0) {
            int childCount = aVar.f49255a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f49255a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(f2.u0 u0Var) {
        if (this.U1) {
            return;
        }
        super.setItemAnimator(u0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            xn xnVar = this.f40555v3;
            xnVar.o9();
            xnVar.r9();
        }
    }

    public final void w1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj.w1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void x1(Canvas canvas, RectF rectF) {
        float f10;
        boolean z4;
        float f11;
        boolean z10;
        float f12;
        ArrayList arrayList;
        float f13;
        float f14;
        ArrayList arrayList2 = this.W2;
        int size = arrayList2.size();
        xn xnVar = this.f40555v3;
        boolean z11 = 1;
        boolean z12 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) arrayList2.get(i10);
                if (!xn.d2(xnVar, t1Var, rectF)) {
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
        ArrayList arrayList3 = this.X2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) arrayList3.get(i11);
                if (!xn.d2(xnVar, t1Var2, rectF)) {
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
        ArrayList arrayList4 = this.Y2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) arrayList4.get(i12);
                if (xn.d2(xnVar, t1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (t1Var3.getCurrentPosition() != null && (t1Var3.getCurrentPosition().flags & z11) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (t1Var3.a()) {
                        f12 = t1Var3.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    float E22 = t1Var3.E2(z12) + t1Var3.getLeft();
                    float y11 = t1Var3.getY() + t1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = t1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = t1Var3.E2(z11);
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
                    if (t1Var3.getTransitionParams().f23702v0) {
                        canvas.translate(E22, y11);
                        t1Var3.setInvalidatesParent(true);
                        t1Var3.I1(f12, canvas, z10);
                        t1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z11 = 1;
                z12 = false;
            }
            f10 = 8.0f;
            arrayList4.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList5 = this.Z2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) arrayList5.get(i13);
                if (!xn.d2(xnVar, t1Var4, rectF)) {
                    if (t1Var4.getCurrentPosition() != null && (t1Var4.getCurrentPosition().flags & 1) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
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
                    if (!z4 && t1Var4.getTransitionParams().f23702v0) {
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
        boolean z4;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        xn xnVar = this.f40555v3;
        if (motionEvent != null) {
            xnVar.A4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !xnVar.f43148c9 && !xnVar.f43135b9 && xnVar.f43121a9 == null) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z4) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.t1) {
                    if (xnVar.f43121a9 != null) {
                        xn.V1(xnVar, 0.0f);
                    }
                    xnVar.f43121a9 = (org.telegram.ui.Cells.t1) pressedChildView;
                    MessageObject T1 = xn.T1(xnVar);
                    boolean F6 = xnVar.F6(T1);
                    int i10 = xnVar.O3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && xnVar.f43116a4 == xnVar.getUserConfig().getClientUserId())) && (((arrayList = xnVar.X3) == null || !arrayList.contains(T1)) && ((xnVar.E8(T1) != 1 || (T1.getDialogId() != xnVar.I6 && !T1.needDrawBluredPreview())) && ((xnVar.h != null || T1.getId() >= 0) && (((chat2 = xnVar.f43165e) == null || !ChatObject.isForum(chat2) || F6) && !xnVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.f40537d3 = motionEvent.getPointerId(0);
                        xnVar.f43135b9 = true;
                        this.f40536b3 = (int) motionEvent.getX();
                        this.c3 = (int) motionEvent.getY();
                        return;
                    }
                    xn.V1(xnVar, 0.0f);
                    xnVar.f43121a9 = null;
                    return;
                }
                return;
            }
        }
        if (xnVar.f43121a9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40537d3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f40536b3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.c3);
            if (getScrollState() == 0 && xnVar.f43135b9 && !xnVar.f43148c9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                xnVar.f43121a9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                xnVar.f43389w0.R = false;
                xnVar.f43135b9 = false;
                xnVar.f43148c9 = true;
                this.f40536b3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (xnVar.f43148c9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f40541h3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f40541h3 = true;
                    }
                } else {
                    this.f40541h3 = false;
                }
                float f12 = max;
                xn.V1(xnVar, f12);
                MessageObject T12 = xn.T1(xnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    xnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.t1 t1Var = xnVar.f43121a9;
                if (e2.c.s(t1Var)) {
                    z1(t1Var, f12);
                }
                invalidate();
            }
        } else if (xnVar.f43121a9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f40537d3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.t1 t1Var2 = xnVar.f43121a9;
                if (e2.c.s(t1Var2)) {
                    f11 = t1Var2.E2(false);
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(f11) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = xn.T1(xnVar);
                    boolean F62 = xnVar.F6(T13);
                    ok okVar = xnVar.L0;
                    if ((okVar != null && okVar.getVisibility() == 0 && ((!xnVar.F0 || !F62) && !T13.wasJustSent)) || ((chat = xnVar.f43165e) != null && ((ChatObject.isNotInChat(chat) && !xnVar.F9()) || ((ChatObject.isChannel(xnVar.f43165e) && !ChatObject.canPost(xnVar.f43165e) && !xnVar.f43165e.megagroup) || !ChatObject.canSendMessages(xnVar.f43165e))))) {
                        if (T13.getGroupId() != 0 && (y82 = xnVar.y8(T13.getGroupId())) != null && (messageObject = y82.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        xnVar.f43245k5 = T13;
                        Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
                        e6.putBoolean("quote", true);
                        e6.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != xnVar.a() && peerDialogId != xnVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e6.putLong("reply_to_author", peerDialogId);
                        }
                        e6.putInt("messagesCount", 1);
                        e6.putBoolean("canSelectTopics", true);
                        py pyVar = new py(e6);
                        pyVar.f40308z2 = xnVar;
                        xnVar.presentFragment(pyVar);
                    } else {
                        xnVar.Bb(xn.T1(xnVar));
                    }
                }
            }
            org.telegram.ui.Cells.t1 t1Var3 = xnVar.f43121a9;
            if (e2.c.s(t1Var3)) {
                f10 = t1Var3.getSlidingOffsetX();
            } else {
                f10 = 0.0f;
            }
            this.f40540g3 = f10;
            if (f10 == 0.0f) {
                xnVar.f43121a9 = null;
            }
            this.f40538e3 = System.currentTimeMillis();
            this.f40539f3 = 0.0f;
            invalidate();
            xnVar.f43135b9 = false;
            xnVar.f43148c9 = false;
            xnVar.f43389w0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.t1 t1Var, float f10) {
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
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
