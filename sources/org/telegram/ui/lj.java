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
public final class lj extends om {
    public int U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int f40215a3;
    public int f40216b3;
    public int c3;
    public long f40217d3;
    public float f40218e3;
    public float f40219f3;
    public boolean f40220g3;
    public final float f40221h3;
    public final Paint f40222i3;
    public final Paint f40223j3;
    public final ib.a f40224k3;
    public final o1.k f40225l3;
    public final ib.a f40226m3;
    public final o1.k f40227n3;
    public final ib.a f40228o3;
    public final o1.k f40229p3;
    public boolean f40230q3;
    public final Path f40231r3;
    public boolean f40232s3;
    public int f40233t3;
    public final tn f40234u3;

    public lj(tn tnVar, Context context, rn rnVar) {
        super(tnVar, context, rnVar);
        this.f40234u3 = tnVar;
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList(10);
        this.f40221h3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f40222i3 = paint;
        Paint paint2 = new Paint(1);
        this.f40223j3 = paint2;
        ib.a aVar = new ib.a(0.0f);
        this.f40224k3 = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.h = 0.0f;
        kVar.f19040g = 2000.0f;
        kVar.f19045u = th.l(0.0f, 1500.0f, 1.0f);
        kVar.b(new o1.h(this) {
            public final lj f39570b;

            {
                this.f39570b = this;
            }

            @Override
            public final void a(o1.i iVar, float f9, float f10) {
                switch (r2) {
                    case 0:
                        this.f39570b.invalidate();
                        return;
                    case 1:
                        this.f39570b.invalidate();
                        return;
                    default:
                        this.f39570b.invalidate();
                        return;
                }
            }
        });
        this.f40225l3 = kVar;
        ib.a aVar2 = new ib.a(0.0f);
        this.f40226m3 = aVar2;
        o1.k kVar2 = new o1.k(aVar2);
        kVar2.h = 0.0f;
        kVar2.f19045u = th.l(0.0f, 400.0f, 0.5f);
        kVar2.b(new o1.h(this) {
            public final lj f39570b;

            {
                this.f39570b = this;
            }

            @Override
            public final void a(o1.i iVar, float f9, float f10) {
                switch (r2) {
                    case 0:
                        this.f39570b.invalidate();
                        return;
                    case 1:
                        this.f39570b.invalidate();
                        return;
                    default:
                        this.f39570b.invalidate();
                        return;
                }
            }
        });
        this.f40227n3 = kVar2;
        ib.a aVar3 = new ib.a(0.0f);
        this.f40228o3 = aVar3;
        o1.k kVar3 = new o1.k(aVar3);
        kVar3.h = 0.0f;
        kVar3.f19045u = th.l(0.0f, 200.0f, 1.0f);
        kVar3.b(new o1.h(this) {
            public final lj f39570b;

            {
                this.f39570b = this;
            }

            @Override
            public final void a(o1.i iVar, float f9, float f10) {
                switch (r2) {
                    case 0:
                        this.f39570b.invalidate();
                        return;
                    case 1:
                        this.f39570b.invalidate();
                        return;
                    default:
                        this.f39570b.invalidate();
                        return;
                }
            }
        });
        this.f40229p3 = kVar3;
        this.f40231r3 = new Path();
        this.f40233t3 = 0;
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
        if (this.f40234u3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        tn tnVar = this.f40234u3;
        tnVar.f42944q8 = null;
        canvas.save();
        if (tnVar.R9 != null && tnVar.N9) {
            boolean z10 = tnVar.O9;
        }
        this.C1.setEmpty();
        if (tnVar.J9 != 0.0f) {
            int save = canvas.save();
            if (tnVar.Q9 != 0.0f) {
                f9 = (tnVar.f42973t0.getMeasuredHeight() - tnVar.J9) * tnVar.Q9;
            } else {
                f9 = 0.0f;
            }
            float f10 = (-tnVar.J9) - f9;
            tnVar.f42996ua = f10;
            canvas.translate(0.0f, f10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lj.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lj.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void h1(View view, float f9, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f9, f10, z10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (!messageObject.isMusic() && !messageObject.isDocument() && (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) != null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                            s1Var2.setPressed(z10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lj.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f40234u3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fh.k kVar;
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f40234u3;
        lm lmVar = tnVar.Y8;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.f25944g0);
            lmVar.f25973z = false;
        }
        if (this.T1 || ((kVar = tnVar.T9) != null && kVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.s() && !tnVar.A9()) {
            y1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.U2;
        int i15 = i12 - i10;
        tn tnVar = this.f40234u3;
        if (i14 != i15) {
            if (i14 != 0) {
                tnVar.h9(false);
            }
            this.U2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f40233t3 != measuredHeight) {
            this.f40232s3 = true;
            nj njVar = tnVar.f42986u0;
            if (njVar != null) {
                njVar.g();
            }
            tnVar.S8.a();
            this.f40232s3 = false;
            this.f40233t3 = measuredHeight;
        }
        tnVar.N5 = false;
        lm lmVar = tnVar.Y8;
        if (lmVar != null && lmVar.y()) {
            tnVar.Y8.x();
        }
        tnVar.p9();
        tnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        np npVar;
        tn tnVar = this.f40234u3;
        vd.a aVar = tnVar.f42946qc;
        lm lmVar = tnVar.Y8;
        lmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(lmVar.f25944g0);
            lmVar.f25973z = false;
        }
        if (motionEvent.getAction() == 0) {
            tnVar.f42922oa = true;
        }
        if (tnVar.J9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, tnVar.J9 / AndroidUtilities.dp(110.0f));
            if (motionEvent.getAction() == 1 && min == 1.0f && (npVar = tnVar.L9) != null && !npVar.N) {
                if (npVar.G != 1.0f) {
                    float f9 = tnVar.J9;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, AndroidUtilities.dp(8.0f) + f9);
                    tnVar.M9 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final lj f39905b;

                        {
                            this.f39905b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    tn tnVar2 = this.f39905b.f40234u3;
                                    tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tnVar2.f42973t0.invalidate();
                                    return;
                                case 1:
                                    tn tnVar3 = this.f39905b.f40234u3;
                                    tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tnVar3.f42973t0.invalidate();
                                    return;
                                case 2:
                                    tn tnVar4 = this.f39905b.f40234u3;
                                    tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tnVar4.f42973t0.invalidate();
                                    return;
                                default:
                                    tn tnVar5 = this.f39905b.f40234u3;
                                    tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    tnVar5.f42973t0.invalidate();
                                    return;
                            }
                        }
                    });
                    ofFloat.setDuration(200L);
                    org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
                    ofFloat.setInterpolator(jrVar);
                    ofFloat.start();
                    final np npVar2 = tnVar.L9;
                    ui uiVar = new ui(this, 1);
                    AnimatorSet animatorSet = npVar2.F;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        npVar2.F.cancel();
                    }
                    npVar2.U = uiVar;
                    npVar2.F = new AnimatorSet();
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(npVar2.G, 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    np npVar3 = npVar2;
                                    npVar3.getClass();
                                    npVar3.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    npVar3.P.invalidate();
                                    View view = npVar3.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    np npVar4 = npVar2;
                                    npVar4.getClass();
                                    npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = npVar4.W;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(npVar2.H, 0.0f);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    np npVar3 = npVar2;
                                    npVar3.getClass();
                                    npVar3.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    npVar3.P.invalidate();
                                    View view = npVar3.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    np npVar4 = npVar2;
                                    npVar4.getClass();
                                    npVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = npVar4.W;
                                    if (view2 != null) {
                                        view2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    npVar2.F.addListener(new bm(npVar2, 1));
                    npVar2.F.playTogether(ofFloat2, ofFloat3);
                    npVar2.F.setDuration(120L);
                    npVar2.F.setInterpolator(jrVar);
                    npVar2.F.start();
                } else {
                    tn.X1(tnVar);
                }
            } else {
                np npVar3 = tnVar.L9;
                if (npVar3 != null && npVar3.N) {
                    long currentTimeMillis = System.currentTimeMillis();
                    np npVar4 = tnVar.L9;
                    if (currentTimeMillis - npVar4.Q < 500 && npVar4.I) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        tnVar.M9 = animatorSet2;
                        if (tnVar.L9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(tnVar.J9, AndroidUtilities.dp(111.0f));
                        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final lj f39905b;

                            {
                                this.f39905b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        tn tnVar2 = this.f39905b.f40234u3;
                                        tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar2.f42973t0.invalidate();
                                        return;
                                    case 1:
                                        tn tnVar3 = this.f39905b.f40234u3;
                                        tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar3.f42973t0.invalidate();
                                        return;
                                    case 2:
                                        tn tnVar4 = this.f39905b.f40234u3;
                                        tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar4.f42973t0.invalidate();
                                        return;
                                    default:
                                        tn tnVar5 = this.f39905b.f40234u3;
                                        tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar5.f42973t0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat4.setDuration(400L);
                        ofFloat4.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final lj f39905b;

                            {
                                this.f39905b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        tn tnVar2 = this.f39905b.f40234u3;
                                        tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar2.f42973t0.invalidate();
                                        return;
                                    case 1:
                                        tn tnVar3 = this.f39905b.f40234u3;
                                        tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar3.f42973t0.invalidate();
                                        return;
                                    case 2:
                                        tn tnVar4 = this.f39905b.f40234u3;
                                        tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar4.f42973t0.invalidate();
                                        return;
                                    default:
                                        tn tnVar5 = this.f39905b.f40234u3;
                                        tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        tnVar5.f42973t0.invalidate();
                                        return;
                                }
                            }
                        });
                        ofFloat5.setStartDelay(600L);
                        ofFloat5.setDuration(250L);
                        ofFloat5.setInterpolator(uh.m.V);
                        animatorSet2.playSequentially(ofFloat4, ofFloat5);
                        animatorSet2.start();
                    }
                }
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(tnVar.J9, 0.0f);
                tnVar.M9 = ofFloat6;
                if (tnVar.L9 != null) {
                    aVar.a(false, true);
                }
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lj f39905b;

                    {
                        this.f39905b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                tn tnVar2 = this.f39905b.f40234u3;
                                tnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar2.f42973t0.invalidate();
                                return;
                            case 1:
                                tn tnVar3 = this.f39905b.f40234u3;
                                tnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar3.f42973t0.invalidate();
                                return;
                            case 2:
                                tn tnVar4 = this.f39905b.f40234u3;
                                tnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar4.f42973t0.invalidate();
                                return;
                            default:
                                tn tnVar5 = this.f39905b.f40234u3;
                                tnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tnVar5.f42973t0.invalidate();
                                return;
                        }
                    }
                });
                ofFloat6.setDuration(250L);
                ofFloat6.setInterpolator(uh.m.V);
                ofFloat6.start();
            }
        }
        if (!this.T1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                y1(motionEvent);
                if (tnVar.f42759b9 || onTouchEvent) {
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
        if (this.f40234u3.M8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f40234u3.Z8 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f40232s3) {
            return;
        }
        sg.a aVar = this.f40234u3.Mb;
        if (aVar.f48020b != 0) {
            int childCount = aVar.f48019a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f48019a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(f2.u0 u0Var) {
        if (this.T1) {
            return;
        }
        super.setItemAnimator(u0Var);
    }

    @Override
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            tn tnVar = this.f40234u3;
            tnVar.o9();
            tnVar.r9();
        }
    }

    public final void w1(android.graphics.Canvas r30, android.graphics.RectF r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lj.w1(android.graphics.Canvas, android.graphics.RectF):void");
    }

    public final void x1(Canvas canvas, RectF rectF) {
        float f9;
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        ArrayList arrayList2 = this.V2;
        int size = arrayList2.size();
        tn tnVar = this.f40234u3;
        boolean z12 = 1;
        boolean z13 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!tn.d2(tnVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    if (s1Var.a()) {
                        f13 = s1Var.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    s1Var.m2(f13, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.W2;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!tn.d2(tnVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y8 = s1Var2.getY() + s1Var2.getPaddingTop();
                    if (s1Var2.a()) {
                        f12 = s1Var2.getAlpha();
                    } else {
                        f12 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(E2, y8);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, f12);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.X2;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (tn.d2(tnVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    if (s1Var3.getCurrentPosition() != null && (s1Var3.getCurrentPosition().flags & z12) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (s1Var3.a()) {
                        f11 = s1Var3.getAlpha();
                    } else {
                        f11 = 1.0f;
                    }
                    float E22 = s1Var3.E2(z13) + s1Var3.getLeft();
                    float y10 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                            float E23 = s1Var3.E2(z12);
                            MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                            float f14 = transitionParams.left + E23 + transitionParams.offsetLeft;
                            arrayList = arrayList4;
                            float f15 = transitionParams.top + transitionParams.offsetTop;
                            float f16 = transitionParams.right + E23 + transitionParams.offsetRight;
                            float f17 = transitionParams.bottom + transitionParams.offsetBottom;
                            if (!transitionParams.backgroundChangeBounds) {
                                f15 += s1Var3.getTranslationY();
                                f17 += s1Var3.getTranslationY();
                            }
                            canvas.clipRect(f14 + AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(8.0f), f16 - AndroidUtilities.dp(8.0f), f17 - AndroidUtilities.dp(8.0f));
                        } else {
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().f25187v0) {
                        canvas.translate(E22, y10);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(f11, canvas, z11);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z12 = 1;
                z13 = false;
            }
            f9 = 8.0f;
            arrayList4.clear();
        } else {
            f9 = 8.0f;
        }
        ArrayList arrayList5 = this.Y2;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!tn.d2(tnVar, s1Var4, rectF)) {
                    if (s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (s1Var4.a()) {
                        f10 = s1Var4.getAlpha();
                    } else {
                        f10 = 1.0f;
                    }
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y11 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f18 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f19 = transitionParams2.top + transitionParams2.offsetTop;
                        float f20 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f21 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f19 += s1Var4.getTranslationY();
                            f21 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f18 + AndroidUtilities.dp(f9), f19 + AndroidUtilities.dp(f9), f20 - AndroidUtilities.dp(f9), f21 - AndroidUtilities.dp(f9));
                    }
                    if (!z10 && s1Var4.getTransitionParams().f25187v0) {
                        canvas.translate(E24, y11);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, f10, null);
                        s1Var4.N1(canvas, f10);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void y1(MotionEvent motionEvent) {
        float f9;
        float f10;
        TLRPC.Chat chat;
        MessageObject.GroupedMessages y8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        tn tnVar = this.f40234u3;
        if (motionEvent != null) {
            tnVar.f43054z4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !tnVar.f42759b9 && !tnVar.f42745a9 && tnVar.Z8 == null) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (pressedChildView instanceof org.telegram.ui.Cells.s1) {
                    if (tnVar.Z8 != null) {
                        tn.V1(tnVar, 0.0f);
                    }
                    tnVar.Z8 = (org.telegram.ui.Cells.s1) pressedChildView;
                    MessageObject T1 = tn.T1(tnVar);
                    boolean F6 = tnVar.F6(T1);
                    int i10 = tnVar.N3;
                    if ((i10 == 0 || i10 == 5 || i10 == 8 || (i10 == 3 && tnVar.Z3 == tnVar.getUserConfig().getClientUserId())) && (((arrayList = tnVar.W3) == null || !arrayList.contains(T1)) && ((tnVar.E8(T1) != 1 || (T1.getDialogId() != tnVar.H6 && !T1.needDrawBluredPreview())) && ((tnVar.h != null || T1.getId() >= 0) && (((chat2 = tnVar.f42787e) == null || !ChatObject.isForum(chat2) || F6) && !tnVar.b9() && (!T1.isEphemeral() || !T1.isOut())))))) {
                        this.c3 = motionEvent.getPointerId(0);
                        tnVar.f42745a9 = true;
                        this.f40215a3 = (int) motionEvent.getX();
                        this.f40216b3 = (int) motionEvent.getY();
                        return;
                    }
                    tn.V1(tnVar, 0.0f);
                    tnVar.Z8 = null;
                    return;
                }
                return;
            }
        }
        if (tnVar.Z8 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.c3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f40215a3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.f40216b3);
            if (getScrollState() == 0 && tnVar.f42745a9 && !tnVar.f42759b9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                tnVar.Z8.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                tnVar.f42999v0.R = false;
                tnVar.f42745a9 = false;
                tnVar.f42759b9 = true;
                this.f40215a3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (tnVar.f42759b9) {
                if (Math.abs(max) >= AndroidUtilities.dp(50.0f)) {
                    if (!this.f40220g3) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f40220g3 = true;
                    }
                } else {
                    this.f40220g3 = false;
                }
                float f11 = max;
                tn.V1(tnVar, f11);
                MessageObject T12 = tn.T1(tnVar);
                if (T12 != null && (T12.isRoundVideo() || T12.isVideo())) {
                    tnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.s1 s1Var = tnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var)) {
                    z1(s1Var, f11);
                }
                invalidate();
            }
        } else if (tnVar.Z8 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) == this.c3) {
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.s1 s1Var2 = tnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var2)) {
                    f10 = s1Var2.E2(false);
                } else {
                    f10 = 0.0f;
                }
                if (Math.abs(f10) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject T13 = tn.T1(tnVar);
                    boolean F62 = tnVar.F6(T13);
                    ik ikVar = tnVar.K0;
                    if ((ikVar != null && ikVar.getVisibility() == 0 && ((!tnVar.E0 || !F62) && !T13.wasJustSent)) || ((chat = tnVar.f42787e) != null && ((ChatObject.isNotInChat(chat) && !tnVar.F9()) || ((ChatObject.isChannel(tnVar.f42787e) && !ChatObject.canPost(tnVar.f42787e) && !tnVar.f42787e.megagroup) || !ChatObject.canSendMessages(tnVar.f42787e))))) {
                        if (T13.getGroupId() != 0 && (y8 = tnVar.y8(T13.getGroupId())) != null && (messageObject = y8.captionMessage) != null) {
                            T13 = messageObject;
                        }
                        tnVar.f42856j5 = T13;
                        Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
                        e10.putBoolean("quote", true);
                        e10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(T13.getFromPeer());
                        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                        if (i11 != 0 && peerDialogId != tnVar.a() && peerDialogId != tnVar.getUserConfig().getClientUserId() && i11 > 0) {
                            e10.putLong("reply_to_author", peerDialogId);
                        }
                        e10.putInt("messagesCount", 1);
                        e10.putBoolean("canSelectTopics", true);
                        fy fyVar = new fy(e10);
                        fyVar.f38379y2 = tnVar;
                        tnVar.presentFragment(fyVar);
                    } else {
                        tnVar.Bb(tn.T1(tnVar));
                    }
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = tnVar.Z8;
            if (com.google.android.recaptcha.internal.a.u(s1Var3)) {
                f9 = s1Var3.getSlidingOffsetX();
            } else {
                f9 = 0.0f;
            }
            this.f40219f3 = f9;
            if (f9 == 0.0f) {
                tnVar.Z8 = null;
            }
            this.f40217d3 = System.currentTimeMillis();
            this.f40218e3 = 0.0f;
            invalidate();
            tnVar.f42745a9 = false;
            tnVar.f42759b9 = false;
            tnVar.f42999v0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f9) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f9);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
