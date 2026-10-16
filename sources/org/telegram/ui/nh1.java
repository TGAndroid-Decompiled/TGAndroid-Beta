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
public final class nh1 extends ScrollView {
    public final int[] f38400a;
    public final Rect f38401b;
    public boolean f38402c;
    public final oh1 d;

    public nh1(oh1 oh1Var, Context context) {
        super(context);
        this.d = oh1Var;
        this.f38400a = new int[2];
        this.f38401b = new Rect();
        this.f38402c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f38402c = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        oh1 oh1Var = this.d;
        TextView textView = oh1Var.f38660c;
        if (textView != null) {
            int[] iArr = this.f38400a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = oh1Var.f38660c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (oh1Var.f38660c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = oh1Var.f38660c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = oh1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    oh1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                oh1Var.K = animatorSet2;
                di.p6 p6Var = oh1Var.f38675y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.m2) oh1Var).actionBar;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                oh1Var.K.setDuration(150L);
                oh1Var.K.addListener(new kj0(this, 29));
                oh1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f38402c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f38402c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f38401b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
