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
public final class ab1 extends ScrollView {
    public final int[] f45563a;
    public final Rect f45564b;
    public boolean f45565c;
    public final bb1 d;

    public ab1(bb1 bb1Var, Context context) {
        super(context);
        this.d = bb1Var;
        this.f45563a = new int[2];
        this.f45564b = new Rect();
        this.f45565c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f45565c = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        bb1 bb1Var = this.d;
        TextView textView = bb1Var.f45839c;
        if (textView != null) {
            int[] iArr = this.f45563a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = bb1Var.f45839c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.g2) bb1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bb1Var.f45839c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = bb1Var.f45839c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = bb1Var.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    bb1Var.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                bb1Var.L = animatorSet2;
                hi.l5 l5Var = bb1Var.E;
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l5Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.g2) bb1Var).actionBar;
                org.telegram.ui.ActionBar.m5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                bb1Var.L.setDuration(150L);
                bb1Var.L.addListener(new k71(this, 3));
                bb1Var.L.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f45565c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f45565c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f45564b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = org.telegram.messenger.g0.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
