package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ep0 extends org.telegram.ui.Components.zu0 {

    public int f37804s0;

    public boolean f37805t0;

    public final jp0 f37806u0;

    public ep0(jp0 jp0Var, Context context) {
        super(context, null);
        this.f37806u0 = jp0Var;
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
        int i17 = this.f37804s0;
        int i18 = i12 - i10;
        jp0 jp0Var = this.f37806u0;
        if (i17 != i18) {
            this.f37804s0 = i18;
            org.telegram.ui.ActionBar.n1 n1Var = jp0Var.E;
            if (n1Var != null && n1Var.isShowing()) {
                jp0Var.E.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : jp0Var.I.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                    } else {
                        i14 = (i18 - measuredWidth) - layoutParams.rightMargin;
                        paddingRight = getPaddingRight();
                    }
                    if (i21 != 16) {
                        if (i21 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i21 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        ttVar = jp0Var.I;
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
                    ttVar = jp0Var.I;
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
                    i14 = ((i18 - measuredWidth) / 2) + layoutParams.leftMargin;
                    paddingRight = layoutParams.rightMargin;
                }
                paddingLeft = i14 - paddingRight;
                if (i21 != 16) {
                    if (i21 != 48) {
                        paddingTop = layoutParams.topMargin + getPaddingTop();
                    } else if (i21 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    ttVar = jp0Var.I;
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
                ttVar = jp0Var.I;
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
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int iDp = AndroidUtilities.dp(20.0f);
        int i13 = 0;
        jp0 jp0Var = this.f37806u0;
        if (iDp < 0) {
            this.f37805t0 = true;
            jp0Var.I.j();
            this.f37805t0 = false;
        } else if (!AndroidUtilities.isInMultiwindow) {
            size2 -= jp0Var.I.getEmojiPadding();
            i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i10;
            } else {
                org.telegram.ui.Components.tt ttVar = jp0Var.I;
                if (ttVar == null || !ttVar.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                } else {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                    i12 = i10;
                }
            }
            i13++;
            i10 = i12;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f37805t0) {
            return;
        }
        super.requestLayout();
    }
}
