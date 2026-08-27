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

public final class cq0 extends org.telegram.ui.Components.zu0 {

    public int f37131s0;

    public boolean f37132t0;

    public boolean f37133u0;

    public int f37134v0;

    public int f37135w0;

    public VelocityTracker f37136x0;

    public boolean f37137y0;

    public final fq0 f37138z0;

    public cq0(fq0 fq0Var, Context context) {
        super(context, null);
        this.f37138z0 = fq0Var;
    }

    public final boolean Z() {
        AnimatorSet animatorSet;
        fq0 fq0Var = this.f37138z0;
        dq0[] dq0VarArr = fq0Var.f38190n;
        if (!fq0Var.f38192s) {
            return false;
        }
        if (fq0Var.f38193w) {
            if (Math.abs(dq0VarArr[0].getTranslationX()) < 1.0f) {
                dq0VarArr[0].setTranslationX(0.0f);
                dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth() * (fq0Var.v ? 1 : -1));
                animatorSet = fq0Var.f38191r;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    fq0Var.f38191r = null;
                }
                fq0Var.f38192s = false;
            }
        } else if (Math.abs(dq0VarArr[1].getTranslationX()) < 1.0f) {
            dq0 dq0Var = dq0VarArr[0];
            dq0Var.setTranslationX(dq0Var.getMeasuredWidth() * (fq0Var.v ? -1 : 1));
            dq0VarArr[1].setTranslationX(0.0f);
            animatorSet = fq0Var.f38191r;
            if (animatorSet != null) {
                animatorSet.cancel();
                fq0Var.f38191r = null;
            }
            fq0Var.f38192s = false;
        }
        return fq0Var.f38192s;
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        fq0 fq0Var = this.f37138z0;
        dq0[] dq0VarArr = fq0Var.f38190n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = fq0Var.h;
        int i10 = scrollSlidingTextTabStrip.K.get(scrollSlidingTextTabStrip.f26523n + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f37133u0 = false;
        this.f37132t0 = true;
        this.f37134v0 = (int) motionEvent.getX();
        ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.setEnabled(false);
        fq0Var.h.setEnabled(false);
        dq0 dq0Var = dq0VarArr[1];
        dq0Var.f37529e = i10;
        dq0Var.setVisibility(0);
        fq0Var.v = z10;
        fq0Var.j0(true);
        if (z10) {
            dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth());
            return true;
        }
        dq0VarArr[1].setTranslationX(-dq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fq0 fq0Var = this.f37138z0;
        float measuredHeight = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getTranslationY());
        canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.f23175k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fq0 fq0Var = this.f37138z0;
        Paint paint = fq0Var.f38189f;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        canvas.drawRect(0.0f, ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return Z() || this.f37138z0.h.D || onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingRight;
        int paddingLeft;
        int i15;
        int i16;
        int paddingTop;
        org.telegram.ui.Components.tt ttVar;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int iDp = AndroidUtilities.dp(20.0f);
        fq0 fq0Var = this.f37138z0;
        int emojiPadding = (iDp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : fq0Var.d.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i18 = layoutParams.gravity;
                if (i18 == -1) {
                    i18 = 51;
                }
                int i19 = i18 & 112;
                int i20 = i18 & 7;
                if (i20 != 1) {
                    if (i20 != 5) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                    } else {
                        i14 = ((i12 - i10) - measuredWidth) - layoutParams.rightMargin;
                        paddingRight = getPaddingRight();
                    }
                    if (i19 != 16) {
                        if (i19 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i19 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        ttVar = fq0Var.d;
                        if (ttVar != null && ttVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i15 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    paddingTop = i15 - i16;
                    ttVar = fq0Var.d;
                    if (ttVar != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    paddingRight = layoutParams.rightMargin;
                }
                paddingLeft = i14 - paddingRight;
                if (i19 != 16) {
                    if (i19 != 48) {
                        paddingTop = layoutParams.topMargin + getPaddingTop();
                    } else if (i19 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    ttVar = fq0Var.d;
                    if (ttVar != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i15 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                paddingTop = i15 - i16;
                ttVar = fq0Var.d;
                if (ttVar != null) {
                    if (AndroidUtilities.isTablet()) {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    } else {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    }
                    paddingTop = measuredHeight - measuredHeight2;
                }
                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
            }
        }
        S();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        int measuredHeight;
        int i12;
        dq0[] dq0VarArr;
        int childCount;
        int i13;
        View childAt;
        dq0 dq0Var;
        org.telegram.ui.Components.zk0 zk0Var;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        fq0 fq0Var = this.f37138z0;
        measureChildWithMargins(((org.telegram.ui.ActionBar.n2) fq0Var).actionBar, i10, 0, i11, 0);
        if (AndroidUtilities.dp(20.0f) >= 0) {
            if (!AndroidUtilities.isInMultiwindow) {
                size2 -= fq0Var.d.getEmojiPadding();
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            measuredHeight = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getMeasuredHeight();
            this.f37137y0 = true;
            i12 = 0;
            while (true) {
                dq0VarArr = fq0Var.f38190n;
                if (i12 < dq0VarArr.length) {
                    break;
                }
                dq0Var = dq0VarArr[i12];
                if (dq0Var != null && (zk0Var = dq0Var.d) != null) {
                    zk0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i12++;
            }
            this.f37137y0 = false;
            childCount = getChildCount();
            for (i13 = 0; i13 < childCount; i13++) {
                childAt = getChildAt(i13);
                if (childAt == null && childAt.getVisibility() != 8 && childAt != ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar) {
                    org.telegram.ui.Components.tt ttVar = fq0Var.d;
                    if (ttVar == null || !ttVar.l(childAt)) {
                        measureChildWithMargins(childAt, i10, 0, iMakeMeasureSpec, 0);
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                }
            }
        }
        this.f37137y0 = true;
        fq0Var.d.j();
        this.f37137y0 = false;
        iMakeMeasureSpec = i11;
        measuredHeight = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.getMeasuredHeight();
        this.f37137y0 = true;
        i12 = 0;
        while (true) {
            dq0VarArr = fq0Var.f38190n;
            if (i12 < dq0VarArr.length) {
                break;
                break;
            }
            dq0Var = dq0VarArr[i12];
            if (dq0Var != null) {
                zk0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            }
            i12++;
        }
        this.f37137y0 = false;
        childCount = getChildCount();
        while (i13 < childCount) {
            childAt = getChildAt(i13);
            if (childAt == null) {
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        boolean z10;
        fq0 fq0Var = this.f37138z0;
        dq0[] dq0VarArr = fq0Var.f38190n;
        if (((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) fq0Var).parentLayout).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f37136x0 == null) {
                this.f37136x0 = VelocityTracker.obtain();
            }
            this.f37136x0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f37132t0 && !this.f37133u0) {
            this.f37131s0 = motionEvent.getPointerId(0);
            this.f37133u0 = true;
            this.f37134v0 = (int) motionEvent.getX();
            this.f37135w0 = (int) motionEvent.getY();
            this.f37136x0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f37131s0) {
            int x8 = (int) (motionEvent.getX() - this.f37134v0);
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.f37135w0);
            if (this.f37132t0 && (((z10 = fq0Var.v) && x8 > 0) || (!z10 && x8 < 0))) {
                if (!a0(motionEvent, x8 < 0)) {
                    this.f37133u0 = true;
                    this.f37132t0 = false;
                    dq0VarArr[0].setTranslationX(0.0f);
                    dq0VarArr[1].setTranslationX(fq0Var.v ? dq0VarArr[0].getMeasuredWidth() : -dq0VarArr[0].getMeasuredWidth());
                    fq0Var.h.j(0.0f, dq0VarArr[1].f37529e);
                }
            }
            if (!this.f37133u0 || this.f37132t0) {
                if (this.f37132t0) {
                    dq0VarArr[0].setTranslationX(x8);
                    if (fq0Var.v) {
                        dq0VarArr[1].setTranslationX(dq0VarArr[0].getMeasuredWidth() + x8);
                    } else {
                        dq0VarArr[1].setTranslationX(x8 - dq0VarArr[0].getMeasuredWidth());
                    }
                    fq0Var.h.j(Math.abs(x8) / dq0VarArr[0].getMeasuredWidth(), dq0VarArr[1].f37529e);
                }
            } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > iAbs) {
                a0(motionEvent, x8 < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f37131s0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f37136x0.computeCurrentVelocity(1000, fq0Var.f38194x);
            if (motionEvent == null || motionEvent.getAction() == 3) {
                xVelocity = 0.0f;
                yVelocity = 0.0f;
            } else {
                xVelocity = this.f37136x0.getXVelocity();
                yVelocity = this.f37136x0.getYVelocity();
                if (!this.f37132t0 && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                    a0(motionEvent, xVelocity < 0.0f);
                }
            }
            if (this.f37132t0) {
                float x10 = dq0VarArr[0].getX();
                fq0Var.f38191r = new AnimatorSet();
                boolean z11 = Math.abs(x10) < ((float) dq0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                fq0Var.f38193w = z11;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (fq0Var.v) {
                        AnimatorSet animatorSet = fq0Var.f38191r;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, 0.0f);
                        dq0 dq0Var = dq0VarArr[1];
                        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(dq0Var, (Property<dq0, Float>) property, dq0Var.getMeasuredWidth()));
                    } else {
                        AnimatorSet animatorSet2 = fq0Var.f38191r;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(dq0VarArr[0], (Property<dq0, Float>) property, 0.0f);
                        dq0 dq0Var2 = dq0VarArr[1];
                        animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(dq0Var2, (Property<dq0, Float>) property, -dq0Var2.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = dq0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (fq0Var.v) {
                        AnimatorSet animatorSet3 = fq0Var.f38191r;
                        dq0 dq0Var3 = dq0VarArr[0];
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(dq0Var3, (Property<dq0, Float>) property, -dq0Var3.getMeasuredWidth()), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, 0.0f));
                    } else {
                        AnimatorSet animatorSet4 = fq0Var.f38191r;
                        dq0 dq0Var4 = dq0VarArr[0];
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(dq0Var4, (Property<dq0, Float>) property, dq0Var4.getMeasuredWidth()), ObjectAnimator.ofFloat(dq0VarArr[1], (Property<dq0, Float>) property, 0.0f));
                    }
                }
                fq0Var.f38191r.setInterpolator(fq0.f38184y);
                int measuredWidth2 = getMeasuredWidth();
                float f10 = measuredWidth2 / 2;
                float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f10) + f10;
                float fAbs = Math.abs(xVelocity);
                fq0Var.f38191r.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                fq0Var.f38191r.addListener(new f50(this, 8));
                fq0Var.f38191r.start();
                fq0Var.f38192s = true;
                this.f37132t0 = false;
            } else {
                this.f37133u0 = false;
                ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar.setEnabled(true);
                fq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f37136x0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f37136x0 = null;
            }
        }
        return this.f37132t0;
    }

    @Override
    public final void requestLayout() {
        if (this.f37137y0) {
            return;
        }
        super.requestLayout();
    }
}
