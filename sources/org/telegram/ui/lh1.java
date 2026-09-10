package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class lh1 extends ScrollView {
    public final int[] f34719a;
    public final Rect f34720b;
    public boolean f34721c;
    public int d;
    public final mh1 e;

    public lh1(mh1 mh1Var, Context context) {
        super(context);
        this.e = mh1Var;
        this.f34719a = new int[2];
        this.f34720b = new Rect();
        this.f34721c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f34721c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        mh1 mh1Var = this.e;
        TextView textView = mh1Var.f34956c;
        if (textView != null) {
            int[] iArr = this.f34719a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = mh1Var.f34956c.getMeasuredHeight() + iArr[1];
            lVar = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
            if (measuredHeight < lVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (mh1Var.f34956c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = mh1Var.f34956c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = mh1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    mh1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                mh1Var.K = animatorSet2;
                bi.s7 s7Var = mh1Var.f34971y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s7Var, property, fArr);
                lVar2 = ((org.telegram.ui.ActionBar.p2) mh1Var).actionBar;
                org.telegram.ui.ActionBar.l5 titleTextView = lVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                mh1Var.K.setDuration(150L);
                mh1Var.K.addListener(new mv0(this, 15));
                mh1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f34721c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (Build.VERSION.SDK_INT < 23) {
            int dp = AndroidUtilities.dp(120.0f) + rect.bottom;
            rect.bottom = dp;
            int i10 = this.d;
            if (i10 != 0) {
                rect.top -= i10;
                rect.bottom = dp - i10;
                this.d = 0;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestLayout() {
        this.f34721c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f34720b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            this.d = measuredHeight;
            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
        } else {
            this.d = 0;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
