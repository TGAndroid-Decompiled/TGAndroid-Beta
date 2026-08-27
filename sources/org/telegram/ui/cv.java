package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

public final class cv extends FrameLayout {

    public int f37170a;

    public boolean f37171b;

    public boolean f37172c;
    public int d;

    public int f37173e;

    public VelocityTracker f37174f;
    public boolean h;

    public final ev f37175n;

    public cv(ev evVar, Context context) {
        super(context);
        this.f37175n = evVar;
    }

    public final boolean a() {
        AnimatorSet animatorSet;
        ev evVar = this.f37175n;
        dv[] dvVarArr = evVar.f37857f;
        if (!evVar.f37858n) {
            return false;
        }
        if (evVar.f37860s) {
            if (Math.abs(dvVarArr[0].getTranslationX()) < 1.0f) {
                dvVarArr[0].setTranslationX(0.0f);
                dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth() * (evVar.f37859r ? 1 : -1));
                animatorSet = evVar.h;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    evVar.h = null;
                }
                evVar.f37858n = false;
            }
        } else if (Math.abs(dvVarArr[1].getTranslationX()) < 1.0f) {
            dv dvVar = dvVarArr[0];
            dvVar.setTranslationX(dvVar.getMeasuredWidth() * (evVar.f37859r ? -1 : 1));
            dvVarArr[1].setTranslationX(0.0f);
            animatorSet = evVar.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                evVar.h = null;
            }
            evVar.f37858n = false;
        }
        return evVar.f37858n;
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        ev evVar = this.f37175n;
        dv[] dvVarArr = evVar.f37857f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = evVar.f37856e;
        int i10 = scrollSlidingTextTabStrip.K.get(scrollSlidingTextTabStrip.f26523n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f37172c = false;
        this.f37171b = true;
        this.d = (int) motionEvent.getX();
        ((org.telegram.ui.ActionBar.n2) evVar).actionBar.setEnabled(false);
        evVar.f37856e.setEnabled(false);
        dv dvVar = dvVarArr[1];
        dvVar.f37557f = i10;
        dvVar.setVisibility(0);
        evVar.f37859r = z10;
        evVar.m0(true);
        if (z10) {
            dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth());
            return true;
        }
        dvVarArr[1].setTranslationX(-dvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ev evVar = this.f37175n;
        if (((org.telegram.ui.ActionBar.n2) evVar).parentLayout != null) {
            ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) evVar).parentLayout).q(canvas, ((org.telegram.ui.ActionBar.n2) evVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) evVar).actionBar.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ev evVar = this.f37175n;
        Paint paint = evVar.d;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        canvas.drawRect(0.0f, ((org.telegram.ui.ActionBar.n2) evVar).actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.n2) evVar).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a() || this.f37175n.f37856e.D || onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        ev evVar = this.f37175n;
        dv[] dvVarArr = evVar.f37857f;
        measureChildWithMargins(((org.telegram.ui.ActionBar.n2) evVar).actionBar, i10, 0, i11, 0);
        int measuredHeight = ((org.telegram.ui.ActionBar.n2) evVar).actionBar.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < dvVarArr.length; i12++) {
            dv dvVar = dvVarArr[i12];
            if (dvVar != null) {
                org.telegram.ui.Components.zk0 zk0Var = dvVar.d;
                if (zk0Var != null) {
                    zk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                hh.f1 f1Var = dvVarArr[i12].f37556e;
                if (f1Var != null) {
                    f1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != ((org.telegram.ui.ActionBar.n2) evVar).actionBar) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        boolean z10;
        ev evVar = this.f37175n;
        dv[] dvVarArr = evVar.f37857f;
        if (((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) evVar).parentLayout).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f37174f == null) {
                this.f37174f = VelocityTracker.obtain();
            }
            this.f37174f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f37171b && !this.f37172c) {
            this.f37170a = motionEvent.getPointerId(0);
            this.f37172c = true;
            this.d = (int) motionEvent.getX();
            this.f37173e = (int) motionEvent.getY();
            this.f37174f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f37170a) {
            int x8 = (int) (motionEvent.getX() - this.d);
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.f37173e);
            if (this.f37171b && (((z10 = evVar.f37859r) && x8 > 0) || (!z10 && x8 < 0))) {
                if (!b(motionEvent, x8 < 0)) {
                    this.f37172c = true;
                    this.f37171b = false;
                    dvVarArr[0].setTranslationX(0.0f);
                    dvVarArr[1].setTranslationX(evVar.f37859r ? dvVarArr[0].getMeasuredWidth() : -dvVarArr[0].getMeasuredWidth());
                    evVar.f37856e.j(0.0f, dvVarArr[1].f37557f);
                }
            }
            if (!this.f37172c || this.f37171b) {
                if (this.f37171b) {
                    dvVarArr[0].setTranslationX(x8);
                    if (evVar.f37859r) {
                        dvVarArr[1].setTranslationX(dvVarArr[0].getMeasuredWidth() + x8);
                    } else {
                        dvVarArr[1].setTranslationX(x8 - dvVarArr[0].getMeasuredWidth());
                    }
                    evVar.f37856e.j(Math.abs(x8) / dvVarArr[0].getMeasuredWidth(), dvVarArr[1].f37557f);
                }
            } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > iAbs) {
                b(motionEvent, x8 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f37170a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f37174f.computeCurrentVelocity(1000, evVar.v);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                xVelocity = 0.0f;
                yVelocity = 0.0f;
            } else {
                xVelocity = this.f37174f.getXVelocity();
                yVelocity = this.f37174f.getYVelocity();
                if (!this.f37171b && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                    b(motionEvent, xVelocity < 0.0f);
                }
            }
            if (this.f37171b) {
                float x10 = dvVarArr[0].getX();
                evVar.h = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) dvVarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                evVar.f37860s = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (evVar.f37859r) {
                        AnimatorSet animatorSet = evVar.h;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, 0.0f);
                        dv dvVar = dvVarArr[1];
                        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(dvVar, (Property<dv, Float>) property, dvVar.getMeasuredWidth()));
                    } else {
                        AnimatorSet animatorSet2 = evVar.h;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dvVarArr[0], (Property<dv, Float>) property, 0.0f);
                        dv dvVar2 = dvVarArr[1];
                        animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(dvVar2, (Property<dv, Float>) property, -dvVar2.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = dvVarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (evVar.f37859r) {
                        AnimatorSet animatorSet3 = evVar.h;
                        dv dvVar3 = dvVarArr[0];
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(dvVar3, (Property<dv, Float>) property, -dvVar3.getMeasuredWidth()), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, 0.0f));
                    } else {
                        AnimatorSet animatorSet4 = evVar.h;
                        dv dvVar4 = dvVarArr[0];
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(dvVar4, (Property<dv, Float>) property, dvVar4.getMeasuredWidth()), ObjectAnimator.ofFloat(dvVarArr[1], (Property<dv, Float>) property, 0.0f));
                    }
                }
                evVar.h.setInterpolator(ev.f37852x);
                int measuredWidth2 = getMeasuredWidth();
                float f10 = measuredWidth2 / 2;
                float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f10) + f10;
                float fAbs = Math.abs(xVelocity);
                evVar.h.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                evVar.h.addListener(new org.telegram.ui.Components.f11(this, 23));
                evVar.h.start();
                evVar.f37858n = true;
                this.f37171b = false;
            } else {
                this.f37172c = false;
                ((org.telegram.ui.ActionBar.n2) evVar).actionBar.setEnabled(true);
                evVar.f37856e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f37174f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f37174f = null;
            }
        }
        return this.f37171b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
