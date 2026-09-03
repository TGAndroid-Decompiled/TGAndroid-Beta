package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class jv extends FrameLayout {
    public int f38127a;
    public boolean f38128b;
    public boolean f38129c;
    public int d;
    public int f38130e;
    public VelocityTracker f38131f;
    public boolean h;
    public final lv f38132n;

    public jv(lv lvVar, Context context) {
        super(context);
        this.f38132n = lvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        lv lvVar = this.f38132n;
        kv[] kvVarArr = lvVar.f38788f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = lvVar.f38787e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
        int i11 = scrollSlidingTextTabStrip.f25028n;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f38129c = false;
        this.f38128b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        kVar.setEnabled(false);
        lvVar.f38787e.setEnabled(false);
        kv kvVar = kvVarArr[1];
        kvVar.f38431f = i12;
        kvVar.setVisibility(0);
        lvVar.f38790r = z4;
        lvVar.m0(true);
        if (z4) {
            kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth());
            return true;
        }
        kvVarArr[1].setTranslationX(-kvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        lv lvVar = this.f38132n;
        f5Var = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
            ((ActionBarLayout) f5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        lv lvVar = this.f38132n;
        Paint paint = lvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f38132n.f38787e.E && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        lv lvVar = this.f38132n;
        kv[] kvVarArr = lvVar.f38788f;
        kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < kvVarArr.length; i12++) {
            kv kvVar = kvVarArr[i12];
            if (kvVar != null) {
                org.telegram.ui.Components.sl0 sl0Var = kvVar.d;
                if (sl0Var != null) {
                    sl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                mh.d1 d1Var = kvVarArr[i12].f38430e;
                if (d1Var != null) {
                    d1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        kv kvVar;
        kv kvVar2;
        int measuredWidth2;
        kv kvVar3;
        kv kvVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        lv lvVar = this.f38132n;
        kv[] kvVarArr = lvVar.f38788f;
        f5Var = ((org.telegram.ui.ActionBar.p2) lvVar).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) f5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f38131f == null) {
                this.f38131f = VelocityTracker.obtain();
            }
            this.f38131f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f38128b && !this.f38129c) {
            this.f38127a = motionEvent.getPointerId(0);
            this.f38129c = true;
            this.d = (int) motionEvent.getX();
            this.f38130e = (int) motionEvent.getY();
            this.f38131f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f38127a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f38130e);
            if (this.f38128b && (((z11 = lvVar.f38790r) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!b(motionEvent, z12)) {
                    this.f38129c = true;
                    this.f38128b = false;
                    kvVarArr[0].setTranslationX(0.0f);
                    kv kvVar5 = kvVarArr[1];
                    if (lvVar.f38790r) {
                        i10 = kvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -kvVarArr[0].getMeasuredWidth();
                    }
                    kvVar5.setTranslationX(i10);
                    lvVar.f38787e.j(0.0f, kvVarArr[1].f38431f);
                }
            }
            if (this.f38129c && !this.f38128b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    b(motionEvent, z13);
                }
            } else if (this.f38128b) {
                kvVarArr[0].setTranslationX(x10);
                if (lvVar.f38790r) {
                    kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    kvVarArr[1].setTranslationX(x10 - kvVarArr[0].getMeasuredWidth());
                }
                lvVar.f38787e.j(Math.abs(x10) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f38431f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f38127a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f38131f.computeCurrentVelocity(1000, lvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f38131f.getXVelocity();
                f11 = this.f38131f.getYVelocity();
                if (!this.f38128b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f38128b) {
                float x11 = kvVarArr[0].getX();
                lvVar.h = new AnimatorSet();
                if (Math.abs(x11) < kvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                lvVar.f38791s = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (lvVar.f38790r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], property, kvVar4.getMeasuredWidth()));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], property, -kvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = kvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (lvVar.f38790r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, -kvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], property, 0.0f));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, kvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], property, 0.0f));
                    }
                }
                lvVar.h.setInterpolator(lv.f38783x);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                lvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                lvVar.h.addListener(new org.telegram.ui.Components.f91(this, 14));
                lvVar.h.start();
                lvVar.f38789n = true;
                this.f38128b = false;
            } else {
                this.f38129c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
                kVar.setEnabled(true);
                lvVar.f38787e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f38131f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f38131f = null;
            }
        }
        return this.f38128b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
