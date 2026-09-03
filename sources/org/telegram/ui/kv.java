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
public final class kv extends FrameLayout {
    public int f35589a;
    public boolean f35590b;
    public boolean f35591c;
    public int d;
    public int e;
    public VelocityTracker f35592f;
    public boolean h;
    public final mv f35593n;

    public kv(mv mvVar, Context context) {
        super(context);
        this.f35593n = mvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        mv mvVar = this.f35593n;
        lv[] lvVarArr = mvVar.f36224f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
        int i11 = scrollSlidingTextTabStrip.f23141n;
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
        this.f35591c = false;
        this.f35590b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        kVar.setEnabled(false);
        mvVar.e.setEnabled(false);
        lv lvVar = lvVarArr[1];
        lvVar.f35931f = i12;
        lvVar.setVisibility(0);
        mvVar.f36226r = z4;
        mvVar.m0(true);
        if (z4) {
            lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth());
            return true;
        }
        lvVarArr[1].setTranslationX(-lvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mv mvVar = this.f35593n;
        e5Var = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
            ((ActionBarLayout) e5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mv mvVar = this.f35593n;
        Paint paint = mvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35593n.e.E && !onTouchEvent(motionEvent)) {
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
        mv mvVar = this.f35593n;
        lv[] lvVarArr = mvVar.f36224f;
        kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < lvVarArr.length; i12++) {
            lv lvVar = lvVarArr[i12];
            if (lvVar != null) {
                org.telegram.ui.Components.rl0 rl0Var = lvVar.d;
                if (rl0Var != null) {
                    rl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                lh.e1 e1Var = lvVarArr[i12].e;
                if (e1Var != null) {
                    e1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        lv lvVar;
        lv lvVar2;
        int measuredWidth2;
        lv lvVar3;
        lv lvVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        mv mvVar = this.f35593n;
        lv[] lvVarArr = mvVar.f36224f;
        e5Var = ((org.telegram.ui.ActionBar.p2) mvVar).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) e5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35592f == null) {
                this.f35592f = VelocityTracker.obtain();
            }
            this.f35592f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35590b && !this.f35591c) {
            this.f35589a = motionEvent.getPointerId(0);
            this.f35591c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35592f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35589a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35590b && (((z11 = mvVar.f36226r) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!b(motionEvent, z12)) {
                    this.f35591c = true;
                    this.f35590b = false;
                    lvVarArr[0].setTranslationX(0.0f);
                    lv lvVar5 = lvVarArr[1];
                    if (mvVar.f36226r) {
                        i10 = lvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -lvVarArr[0].getMeasuredWidth();
                    }
                    lvVar5.setTranslationX(i10);
                    mvVar.e.j(0.0f, lvVarArr[1].f35931f);
                }
            }
            if (this.f35591c && !this.f35590b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    b(motionEvent, z13);
                }
            } else if (this.f35590b) {
                lvVarArr[0].setTranslationX(x10);
                if (mvVar.f36226r) {
                    lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    lvVarArr[1].setTranslationX(x10 - lvVarArr[0].getMeasuredWidth());
                }
                mvVar.e.j(Math.abs(x10) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f35931f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35589a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35592f.computeCurrentVelocity(1000, mvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f35592f.getXVelocity();
                f11 = this.f35592f.getYVelocity();
                if (!this.f35590b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f35590b) {
                float x11 = lvVarArr[0].getX();
                mvVar.h = new AnimatorSet();
                if (Math.abs(x11) < lvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mvVar.f36227s = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (mvVar.f36226r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], property, lvVar4.getMeasuredWidth()));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], property, -lvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = lvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (mvVar.f36226r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, -lvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], property, 0.0f));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, lvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], property, 0.0f));
                    }
                }
                mvVar.h.setInterpolator(mv.f36220x);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                mvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                mvVar.h.addListener(new org.telegram.ui.Components.f91(this, 14));
                mvVar.h.start();
                mvVar.f36225n = true;
                this.f35590b = false;
            } else {
                this.f35591c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
                kVar.setEnabled(true);
                mvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35592f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35592f = null;
            }
        }
        return this.f35590b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
