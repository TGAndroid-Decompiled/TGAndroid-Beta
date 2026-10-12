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
public final class ak extends bi.r6 {
    public int X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f34237a3;
    public final ArrayList f34238b3;
    public final ArrayList f34239c3;
    public int f34240d3;
    public int f34241e3;
    public int f34242f3;
    public long f34243g3;
    public float f34244h3;
    public float f34245i3;
    public boolean f34246j3;
    public final float f34247k3;
    public final Paint f34248l3;
    public final Paint f34249m3;
    public final o1.j f34250n3;
    public final o1.k f34251o3;
    public final o1.j f34252p3;
    public final o1.k f34253q3;
    public final o1.j f34254r3;
    public final o1.k f34255s3;
    public boolean f34256t3;
    public final Path f34257u3;
    public boolean f34258v3;
    public int f34259w3;
    public final fo f34260x3;

    public ak(fo foVar, Context context, co coVar) {
        super(foVar, context, coVar, 1);
        this.f34260x3 = foVar;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f34237a3 = new ArrayList();
        this.f34238b3 = new ArrayList();
        this.f34239c3 = new ArrayList(10);
        this.f34247k3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f34248l3 = paint;
        Paint paint2 = new Paint(1);
        this.f34249m3 = paint2;
        o1.j jVar = new o1.j(0.0f);
        this.f34250n3 = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.h = 0.0f;
        kVar.f16462g = 2000.0f;
        kVar.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.g(this) {
            public final ak f42640b;

            {
                this.f42640b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42640b.invalidate();
                        return;
                    case 1:
                        this.f42640b.invalidate();
                        return;
                    default:
                        this.f42640b.invalidate();
                        return;
                }
            }
        });
        this.f34251o3 = kVar;
        o1.j jVar2 = new o1.j(0.0f);
        this.f34252p3 = jVar2;
        o1.k kVar2 = new o1.k(jVar2);
        kVar2.h = 0.0f;
        kVar2.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.g(this) {
            public final ak f42640b;

            {
                this.f42640b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42640b.invalidate();
                        return;
                    case 1:
                        this.f42640b.invalidate();
                        return;
                    default:
                        this.f42640b.invalidate();
                        return;
                }
            }
        });
        this.f34253q3 = kVar2;
        o1.j jVar3 = new o1.j(0.0f);
        this.f34254r3 = jVar3;
        o1.k kVar3 = new o1.k(jVar3);
        kVar3.h = 0.0f;
        kVar3.f16468u = org.telegram.ui.Cells.d0.k(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.g(this) {
            public final ak f42640b;

            {
                this.f42640b = this;
            }

            @Override
            public final void a(o1.h hVar, float f7, float f10) {
                switch (r2) {
                    case 0:
                        this.f42640b.invalidate();
                        return;
                    case 1:
                        this.f42640b.invalidate();
                        return;
                    default:
                        this.f42640b.invalidate();
                        return;
                }
            }
        });
        this.f34255s3 = kVar3;
        this.f34257u3 = new Path();
        this.f34259w3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void A1(org.telegram.ui.Cells.u1 u1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != u1Var && (childAt instanceof org.telegram.ui.Cells.u1)) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    u1Var2.setSlidingOffset(f7);
                    u1Var2.invalidate();
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
        if (this.f34260x3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        fo foVar = this.f34260x3;
        foVar.f36129u8 = null;
        canvas.save();
        if (foVar.V9 != null && foVar.R9) {
            boolean z10 = foVar.S9;
        }
        this.E1.setEmpty();
        if (foVar.N9 != 0.0f) {
            int save = canvas.save();
            if (foVar.U9 != 0.0f) {
                f7 = (foVar.f36160x0.getMeasuredHeight() - foVar.N9) * foVar.U9;
            } else {
                f7 = 0.0f;
            }
            float f10 = (-foVar.N9) - f7;
            foVar.f36195za = f10;
            canvas.translate(0.0f, f10);
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            x1(canvas, null);
            super.dispatchDraw(canvas);
            y1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(android.graphics.Canvas r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ak.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ak.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = u1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.u1)) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            u1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ak.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f34260x3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f34260x3;
        ym ymVar = foVar.f35907c9;
        ymVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(ymVar.f20968f0);
            ymVar.f20994z = false;
        }
        if (this.V1 || ((iVar = foVar.X9) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (!kVar.t() && !foVar.F9()) {
            z1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.X2;
        int i15 = i12 - i10;
        fo foVar = this.f34260x3;
        if (i14 != i15) {
            if (i14 != 0) {
                foVar.m9(false);
            }
            this.X2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f34259w3 != measuredHeight) {
            this.f34258v3 = true;
            ck ckVar = foVar.f36174y0;
            if (ckVar != null) {
                ckVar.g();
            }
            foVar.W8.a();
            this.f34258v3 = false;
            this.f34259w3 = measuredHeight;
        }
        foVar.R5 = false;
        ym ymVar = foVar.f35907c9;
        if (ymVar != null && ymVar.x()) {
            foVar.f35907c9.w();
        }
        foVar.u9();
        foVar.I9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        dq dqVar;
        fo foVar = this.f34260x3;
        ne.b bVar = foVar.f36132uc;
        ym ymVar = foVar.f35907c9;
        ymVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(ymVar.f20968f0);
            ymVar.f20994z = false;
        }
        if (motionEvent.getAction() == 0) {
            foVar.f36105sa = true;
        }
        if (foVar.N9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, foVar.N9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (dqVar = foVar.P9) != null && !dqVar.R) {
                if (dqVar.K != 1.0f) {
                    float f7 = foVar.N9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                    foVar.Q9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ak f42178b;

                        {
                            this.f42178b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    fo foVar2 = this.f42178b.f34260x3;
                                    foVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    foVar2.f36160x0.invalidate();
                                    return;
                                case 1:
                                    fo foVar3 = this.f42178b.f34260x3;
                                    foVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    foVar3.f36160x0.invalidate();
                                    return;
                                case 2:
                                    fo foVar4 = this.f42178b.f34260x3;
                                    foVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    foVar4.f36160x0.invalidate();
                                    return;
                                default:
                                    fo foVar5 = this.f42178b.f34260x3;
                                    foVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    foVar5.f36160x0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
                    ofFloat.setInterpolator(esVar);
                    ofFloat.start();
                    final dq dqVar2 = foVar.P9;
                    gj gjVar = new gj(this, 2);
                    AnimatorSet animatorSet = dqVar2.J;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        dqVar2.J.cancel();
                    }
                    dqVar2.Y = gjVar;
                    dqVar2.J = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dqVar2.K, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    dq dqVar3 = dqVar2;
                                    dqVar3.getClass();
                                    dqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    dqVar3.T.invalidate();
                                    View view = dqVar3.f35346a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    dq dqVar4 = dqVar2;
                                    dqVar4.getClass();
                                    dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = dqVar4.f35346a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(dqVar2.L, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    dq dqVar3 = dqVar2;
                                    dqVar3.getClass();
                                    dqVar3.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    dqVar3.T.invalidate();
                                    View view = dqVar3.f35346a0;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    dq dqVar4 = dqVar2;
                                    dqVar4.getClass();
                                    dqVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = dqVar4.f35346a0;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    dqVar2.J.addListener(new u0(dqVar2, 26));
                    dqVar2.J.playTogether(ofFloat2, ofFloat3);
                    dqVar2.J.setDuration(120L);
                    dqVar2.J.setInterpolator(esVar);
                    dqVar2.J.start();
                } else {
                    fo.X1(foVar);
                }
            } else {
                dq dqVar3 = foVar.P9;
                if (dqVar3 != null && dqVar3.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    dq dqVar4 = foVar.P9;
                    if (currentTimeMillis - dqVar4.U < 500 && dqVar4.M) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        foVar.Q9 = animatorSet2;
                        if (foVar.P9 != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(foVar.N9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ak f42178b;

                            {
                                this.f42178b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        fo foVar2 = this.f42178b.f34260x3;
                                        foVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar2.f36160x0.invalidate();
                                        return;
                                    case 1:
                                        fo foVar3 = this.f42178b.f34260x3;
                                        foVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar3.f36160x0.invalidate();
                                        return;
                                    case 2:
                                        fo foVar4 = this.f42178b.f34260x3;
                                        foVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar4.f36160x0.invalidate();
                                        return;
                                    default:
                                        fo foVar5 = this.f42178b.f34260x3;
                                        foVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar5.f36160x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.es.f24771f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ak f42178b;

                            {
                                this.f42178b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        fo foVar2 = this.f42178b.f34260x3;
                                        foVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar2.f36160x0.invalidate();
                                        return;
                                    case 1:
                                        fo foVar3 = this.f42178b.f34260x3;
                                        foVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar3.f36160x0.invalidate();
                                        return;
                                    case 2:
                                        fo foVar4 = this.f42178b.f34260x3;
                                        foVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar4.f36160x0.invalidate();
                                        return;
                                    default:
                                        fo foVar5 = this.f42178b.f34260x3;
                                        foVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        foVar5.f36160x0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(ki.n.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(foVar.N9, 0.0f);
                foVar.Q9 = ofFloat6;
                if (foVar.P9 != null) {
                    bVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ak f42178b;

                    {
                        this.f42178b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                fo foVar2 = this.f42178b.f34260x3;
                                foVar2.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                foVar2.f36160x0.invalidate();
                                return;
                            case 1:
                                fo foVar3 = this.f42178b.f34260x3;
                                foVar3.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                foVar3.f36160x0.invalidate();
                                return;
                            case 2:
                                fo foVar4 = this.f42178b.f34260x3;
                                foVar4.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                foVar4.f36160x0.invalidate();
                                return;
                            default:
                                fo foVar5 = this.f42178b.f34260x3;
                                foVar5.N9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                foVar5.f36160x0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(ki.n.V);
                ofFloat6.start();
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar.t() && !foVar.F9()) {
                z1(motionEvent);
                if (foVar.f35944f9 || onTouchEvent) {
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
        if (this.f34260x3.Q8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f34260x3.f35920d9 != null) {
            z1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f34258v3) {
            return;
        }
        ih.a aVar = this.f34260x3.Qb;
        if (aVar.f11713b != 0) {
            int childCount = aVar.f11712a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f11712a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(s4.l0 l0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(l0Var);
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            fo foVar = this.f34260x3;
            foVar.t9();
            foVar.w9();
        }
    }

    public final void x1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ak.x1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void y1(Canvas canvas, RectF rectF) {
        float f7;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.Y2;
        int size = arrayList2.size();
        fo foVar = this.f34260x3;
        boolean z12 = true;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) arrayList2.get(i10);
                if (!fo.e2(foVar, u1Var, rectF)) {
                    canvas.save();
                    canvas.translate(u1Var.E2(false) + u1Var.getLeft(), u1Var.getY() + u1Var.getPaddingTop());
                    if (u1Var.a()) {
                        f13 = u1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    u1Var.m2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.Z2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) arrayList3.get(i11);
                if (!fo.e2(foVar, u1Var2, rectF)) {
                    float E2 = u1Var2.E2(false) + u1Var2.getLeft();
                    float y3 = u1Var2.getY() + u1Var2.getPaddingTop();
                    if (u1Var2.a()) {
                        f12 = u1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y3);
                    u1Var2.setInvalidatesParent(true);
                    u1Var2.W1(canvas, f12);
                    u1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f34237a3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.u1 u1Var3 = (org.telegram.ui.Cells.u1) arrayList4.get(i12);
                if (fo.e2(foVar, u1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (u1Var3.getCurrentPosition() != null && (u1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = z12;
                    } else {
                        z11 = z13;
                    }
                    if (u1Var3.a()) {
                        f11 = u1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E22 = u1Var3.E2(z13) + u1Var3.getLeft();
                    float y10 = u1Var3.getY() + u1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = u1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = u1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += u1Var3.getTranslationY();
                                f17 += u1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (u1Var3.getTransitionParams().f22053v0) {
                        canvas.translate(E22, y10);
                        u1Var3.setInvalidatesParent(true);
                        u1Var3.I1(f11, canvas, z11);
                        u1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = true;
                z13 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.f34238b3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.u1 u1Var4 = (org.telegram.ui.Cells.u1) arrayList5.get(i13);
                if (!fo.e2(foVar, u1Var4, rectF)) {
                    if (u1Var4.getCurrentPosition() != null && (u1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (u1Var4.a()) {
                        f10 = u1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float E24 = u1Var4.E2(false) + u1Var4.getLeft();
                    float y11 = u1Var4.getY() + u1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = u1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = u1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += u1Var4.getTranslationY();
                            f21 += u1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f7), f19 + AndroidUtilities.dp(f7), f20 - AndroidUtilities.dp(f7), f21 - AndroidUtilities.dp(f7));
                    }
                    if (!z10 && u1Var4.getTransitionParams().f22053v0) {
                        canvas.translate(E24, y11);
                        u1Var4.setInvalidatesParent(true);
                        u1Var4.d2(canvas, f10, null);
                        u1Var4.N1(canvas, f10);
                        u1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void z1(MotionEvent motionEvent) {
        float f7;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages D8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        fo foVar = this.f34260x3;
        if (motionEvent != null) {
            foVar.D4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !foVar.f35944f9 && !foVar.f35931e9 && foVar.f35920d9 == null) {
            z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.u1)) {
                    if (pressedChildView instanceof org.telegram.ui.Cells.x0) {
                        org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) pressedChildView;
                        float x10 = motionEvent.getX() - pressedChildView.getX();
                        float y3 = motionEvent.getY() - pressedChildView.getY();
                        if (x0Var.M()) {
                            org.telegram.ui.Wallet.d3 d3Var = x0Var.I0;
                            float f11 = (x10 - x0Var.K0) - (x0Var.f22686j0 / 2.0f);
                            float paddingTop = (y3 - x0Var.L0) - x0Var.getPaddingTop();
                            org.telegram.ui.Wallet.c3 c3Var = d3Var.f33066m;
                            if (c3Var != null && c3Var.h && d3Var.f33081w.contains((int) f11, (int) paddingTop)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (foVar.f35920d9 != null) {
                    fo.W1(foVar, 0.0f);
                }
                foVar.f35920d9 = pressedChildView;
                MessageObject T1 = fo.T1(foVar);
                boolean I6 = foVar.I6(T1);
                int i10 = foVar.R3;
                if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && foVar.f35915d4 == foVar.getUserConfig().getClientUserId())) && (((arrayList = foVar.f35874a4) == null || !arrayList.contains(T1)) && ((foVar.J8(T1) != 1 || (T1.getDialogId() != foVar.L6 && !T1.needDrawBluredPreview())) && ((foVar.h != null || T1.getId() >= 0) && (((chat2 = foVar.e) == null || !ChatObject.isForum(chat2) || I6) && !foVar.g9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                    this.f34242f3 = motionEvent.getPointerId(0);
                    foVar.f35931e9 = true;
                    this.f34240d3 = (int) motionEvent.getX();
                    this.f34241e3 = (int) motionEvent.getY();
                    return;
                }
                fo.W1(foVar, 0.0f);
                foVar.f35920d9 = null;
                return;
            }
        }
        if (foVar.f35920d9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f34242f3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f34240d3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f34241e3);
            if (getScrollState() == 0 && foVar.f35931e9 && !foVar.f35944f9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                foVar.f35920d9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                foVar.f36185z0.R = false;
                foVar.f35931e9 = false;
                foVar.f35944f9 = true;
                this.f34240d3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (foVar.f35944f9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f34246j3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f34246j3 = true;
                    }
                } else {
                    this.f34246j3 = false;
                }
                float f12 = max;
                fo.W1(foVar, f12);
                MessageObject T12 = fo.T1(foVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    foVar.Qc(false, false);
                }
                View view = foVar.f35920d9;
                if (view instanceof org.telegram.ui.Cells.u1) {
                    A1((org.telegram.ui.Cells.u1) view, f12);
                }
                invalidate();
            }
        } else if (foVar.f35920d9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.f34242f3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = foVar.f35920d9;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    f10 = ((org.telegram.ui.Cells.u1) view2).E2(false);
                } else if (view2 instanceof org.telegram.ui.Cells.x0) {
                    f10 = ((org.telegram.ui.Cells.x0) view2).getWalletSlidingOffset();
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = fo.T1(foVar);
                    boolean I62 = foVar.I6(T13);
                    wk wkVar = foVar.O0;
                    if ((wkVar != null && wkVar.getVisibility() == 0 && ((!foVar.I0 || !I62) && !T13.wasJustSent)) || ((chat = foVar.e) != null && ((ChatObject.isNotInChat(chat) && !foVar.K9()) || ((ChatObject.isChannel(foVar.e) && !ChatObject.canPost(foVar.e) && !foVar.e.megagroup) || !ChatObject.canSendMessages(foVar.e))))) {
                        if (T13.getGroupId() != 0 && (D8 = foVar.D8(T13.getGroupId())) != null && (messageObject = D8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        foVar.f36038n5 = T13;
                        Bundle d = org.telegram.messenger.yh.d(3, "onlySelect", "dialogsType", true);
                        d.putBoolean("quote", true);
                        d.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != foVar.a() && peerDialogId != foVar.getUserConfig().getClientUserId() && i11 > 0) {
                            d.putLong("reply_to_author", peerDialogId);
                        }
                        d.putInt("messagesCount", 1);
                        d.putBoolean("canSelectTopics", true);
                        yy yyVar = new yy(d);
                        yyVar.C2 = foVar;
                        foVar.presentFragment(yyVar);
                    } else {
                        foVar.Fb(fo.T1(foVar));
                    }
                }
            }
            View view3 = foVar.f35920d9;
            if (view3 instanceof org.telegram.ui.Cells.u1) {
                f7 = ((org.telegram.ui.Cells.u1) view3).getSlidingOffsetX();
            } else if (view3 instanceof org.telegram.ui.Cells.x0) {
                f7 = ((org.telegram.ui.Cells.x0) view3).getWalletSlidingOffset();
            } else {
                f7 = 0.0f;
            }
            this.f34245i3 = f7;
            if (f7 == 0.0f) {
                foVar.f35920d9 = null;
            }
            this.f34243g3 = System.currentTimeMillis();
            this.f34244h3 = 0.0f;
            invalidate();
            foVar.f35931e9 = false;
            foVar.f35944f9 = false;
            foVar.f36185z0.R = true;
        }
    }
}
