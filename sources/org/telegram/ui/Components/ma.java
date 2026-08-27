package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ma extends zu0 {

    public final boolean f30632s0;

    public final boolean f30633t0;

    public final qa f30634u0;

    public ma(qa qaVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.f30634u0 = qaVar;
        this.f30632s0 = z10;
        this.f30633t0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qa qaVar = this.f30634u0;
        qaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        qaVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            qa qaVar = this.f30634u0;
            if (y10 < ((org.telegram.ui.ActionBar.e3) qaVar).shadowDrawable.getBounds().top) {
                qaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f30633t0) {
            this.f30634u0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingRight;
        int i14;
        int paddingLeft;
        int i15;
        int i16;
        int paddingTop;
        int measuredHeight;
        int measuredHeight2;
        qa qaVar = this.f30634u0;
        if (qaVar.L == null) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int iR = R();
        int paddingBottom = getPaddingBottom();
        if (!((org.telegram.ui.ActionBar.e3) qaVar).keyboardVisible && qaVar.L != null && iR <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            paddingBottom += qaVar.L.getEmojiPadding();
        }
        setBottomClip(paddingBottom);
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
                        paddingRight = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                        i14 = ((org.telegram.ui.ActionBar.e3) qaVar).backgroundPaddingLeft;
                    }
                    if (i19 != 16) {
                        if (i19 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i19 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - paddingBottom) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        if (childAt instanceof yy) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iR;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i15 = ((((i13 - paddingBottom) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    paddingTop = i15 - i16;
                    if (childAt instanceof yy) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight() + iR;
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    paddingRight = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                }
                paddingLeft = paddingRight - i14;
                if (i19 != 16) {
                    if (i19 != 48) {
                        paddingTop = layoutParams.topMargin + getPaddingTop();
                    } else if (i19 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - paddingBottom) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    if (childAt instanceof yy) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight() + iR;
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i15 = ((((i13 - paddingBottom) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                paddingTop = i15 - i16;
                if (childAt instanceof yy) {
                    if (AndroidUtilities.isTablet()) {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    } else {
                        measuredHeight = getMeasuredHeight() + iR;
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
        int i12;
        tt ttVar;
        int size = View.MeasureSpec.getSize(i11);
        qa qaVar = this.f30634u0;
        qaVar.h = size;
        qaVar.E(i10, i11);
        if (this.f30632s0) {
            i11 = View.MeasureSpec.makeMeasureSpec(qaVar.h, 1073741824);
        }
        if (qaVar.L == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size2, size3);
        tt ttVar2 = qaVar.L;
        if (ttVar2 != null && !ttVar2.J && AndroidUtilities.dp(20.0f) >= 0) {
            tt ttVar3 = qaVar.L;
            if (!ttVar3.f32878e && !ttVar3.K) {
                ttVar3.j();
            }
        }
        int i13 = 0;
        if (AndroidUtilities.dp(20.0f) >= 0) {
            int emojiPadding = (((org.telegram.ui.ActionBar.e3) qaVar).keyboardVisible || (ttVar = qaVar.L) == null) ? 0 : ttVar.getEmojiPadding();
            if (!AndroidUtilities.isInMultiwindow) {
                size3 -= emojiPadding;
                i11 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i10;
            } else {
                tt ttVar4 = qaVar.L;
                if (ttVar4 == null || !ttVar4.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                } else {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                    i12 = i10;
                }
            }
            i13++;
            i10 = i12;
        }
    }
}
