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
public final class lv extends FrameLayout {
    public int f35563a;
    public boolean f35564b;
    public boolean f35565c;
    public int d;
    public int e;
    public VelocityTracker f35566f;
    public boolean h;
    public final nv f35567n;

    public lv(nv nvVar, Context context) {
        super(context);
        this.f35567n = nvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        nv nvVar = this.f35567n;
        mv[] mvVarArr = nvVar.f36050f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = nvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f22182n;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35565c = false;
        this.f35564b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        kVar.setEnabled(false);
        nvVar.e.setEnabled(false);
        mv mvVar = mvVarArr[1];
        mvVar.f35813f = i12;
        mvVar.setVisibility(0);
        nvVar.f36052r = z10;
        nvVar.m0(true);
        if (z10) {
            mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth());
            return true;
        }
        mvVarArr[1].setTranslationX(-mvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        nv nvVar = this.f35567n;
        d5Var = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        nv nvVar = this.f35567n;
        Paint paint = nvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35567n.e.H && !onTouchEvent(motionEvent)) {
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
        nv nvVar = this.f35567n;
        mv[] mvVarArr = nvVar.f36050f;
        kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < mvVarArr.length; i12++) {
            mv mvVar = mvVarArr[i12];
            if (mvVar != null) {
                org.telegram.ui.Components.ll0 ll0Var = mvVar.d;
                if (ll0Var != null) {
                    ll0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = mvVarArr[i12].e;
                if (w0Var != null) {
                    w0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        mv mvVar;
        mv mvVar2;
        int measuredWidth2;
        mv mvVar3;
        mv mvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        nv nvVar = this.f35567n;
        mv[] mvVarArr = nvVar.f36050f;
        d5Var = ((org.telegram.ui.ActionBar.n2) nvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) d5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35566f == null) {
                this.f35566f = VelocityTracker.obtain();
            }
            this.f35566f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35564b && !this.f35565c) {
            this.f35563a = motionEvent.getPointerId(0);
            this.f35565c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35566f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35563a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35564b && (((z12 = nvVar.f36052r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f35565c = true;
                    this.f35564b = false;
                    mvVarArr[0].setTranslationX(0.0f);
                    mv mvVar5 = mvVarArr[1];
                    if (nvVar.f36052r) {
                        i10 = mvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -mvVarArr[0].getMeasuredWidth();
                    }
                    mvVar5.setTranslationX(i10);
                    nvVar.e.j(0.0f, mvVarArr[1].f35813f);
                }
            }
            if (this.f35565c && !this.f35564b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f35564b) {
                mvVarArr[0].setTranslationX(x10);
                if (nvVar.f36052r) {
                    mvVarArr[1].setTranslationX(mvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    mvVarArr[1].setTranslationX(x10 - mvVarArr[0].getMeasuredWidth());
                }
                nvVar.e.j(Math.abs(x10) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f35813f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35563a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35566f.computeCurrentVelocity(1000, nvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f35566f.getXVelocity();
                f10 = this.f35566f.getYVelocity();
                if (!this.f35564b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f35564b) {
                float x11 = mvVarArr[0].getX();
                nvVar.h = new AnimatorSet();
                if (Math.abs(x11) < mvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nvVar.f36053s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (nvVar.f36052r) {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(mvVarArr[1], property, mvVar4.getMeasuredWidth()));
                    } else {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(mvVarArr[1], property, -mvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = mvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (nvVar.f36052r) {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], property, -mvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(mvVarArr[1], property, 0.0f));
                    } else {
                        nvVar.h.playTogether(ObjectAnimator.ofFloat(mvVarArr[0], property, mvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(mvVarArr[1], property, 0.0f));
                    }
                }
                nvVar.h.setInterpolator(nv.f36046x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                nvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                nvVar.h.addListener(new org.telegram.ui.Components.v81(this, 15));
                nvVar.h.start();
                nvVar.f36051n = true;
                this.f35564b = false;
            } else {
                this.f35565c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                kVar.setEnabled(true);
                nvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35566f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35566f = null;
            }
        }
        return this.f35564b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
