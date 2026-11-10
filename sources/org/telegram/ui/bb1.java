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
public final class bb1 extends ScrollView {
    public final int[] f44000a;
    public final Rect f44001b;
    public boolean f44002c;
    public final cb1 d;

    public bb1(cb1 cb1Var, Context context) {
        super(context);
        this.d = cb1Var;
        this.f44000a = new int[2];
        this.f44001b = new Rect();
        this.f44002c = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f44002c = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z9;
        boolean z10;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        super.onScrollChanged(i7, i10, i11, i12);
        cb1 cb1Var = this.d;
        TextView textView = cb1Var.f44296c;
        if (textView != null) {
            int[] iArr = this.f44000a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = cb1Var.f44296c.getMeasuredHeight() + iArr[1];
            lVar = ((org.telegram.ui.ActionBar.f2) cb1Var).actionBar;
            if (measuredHeight < lVar.getBottom()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (cb1Var.f44296c.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                TextView textView2 = cb1Var.f44296c;
                if (z9) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = cb1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    cb1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                cb1Var.K = animatorSet2;
                fi.p5 p5Var = cb1Var.D;
                float f11 = 0.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p5Var, property, fArr);
                lVar2 = ((org.telegram.ui.ActionBar.f2) cb1Var).actionBar;
                org.telegram.ui.ActionBar.m5 titleTextView = lVar2.getTitleTextView();
                if (z9) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                cb1Var.K.setDuration(150L);
                cb1Var.K.addListener(new u81(this, 2));
                cb1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f44002c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f44002c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f44001b;
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
