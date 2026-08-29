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
public final class bg1 extends ScrollView {
    public final int[] f36790a;
    public final Rect f36791b;
    public boolean f36792c;
    public int d;
    public final cg1 f36793e;

    public bg1(cg1 cg1Var, Context context) {
        super(context);
        this.f36793e = cg1Var;
        this.f36790a = new int[2];
        this.f36791b = new Rect();
        this.f36792c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f36792c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f9;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        cg1 cg1Var = this.f36793e;
        TextView textView = cg1Var.f37108c;
        if (textView != null) {
            int[] iArr = this.f36790a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = cg1Var.f37108c.getMeasuredHeight() + iArr[1];
            lVar = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
            if (measuredHeight < lVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cg1Var.f37108c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = cg1Var.f37108c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = cg1Var.G;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    cg1Var.G = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                cg1Var.G = animatorSet2;
                cg.i0 i0Var = cg1Var.f37120y;
                float f10 = 0.0f;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                float[] fArr = {f9};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, property, fArr);
                lVar2 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                org.telegram.ui.ActionBar.h5 titleTextView = lVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                cg1Var.G.setDuration(150L);
                cg1Var.G.addListener(new cc1(this, 3));
                cg1Var.G.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f36792c) {
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
        this.f36792c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f36791b;
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
