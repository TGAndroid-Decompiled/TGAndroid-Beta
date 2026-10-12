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
public final class jh1 extends ScrollView {
    public final int[] f39216a;
    public final Rect f39217b;
    public boolean f39218c;
    public final kh1 d;

    public jh1(kh1 kh1Var, Context context) {
        super(context);
        this.d = kh1Var;
        this.f39216a = new int[2];
        this.f39217b = new Rect();
        this.f39218c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f39218c = false;
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
        kh1 kh1Var = this.d;
        TextView textView = kh1Var.f39495c;
        if (textView != null) {
            int[] iArr = this.f39216a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = kh1Var.f39495c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.m2) kh1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kh1Var.f39495c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = kh1Var.f39495c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = kh1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    kh1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                kh1Var.K = animatorSet2;
                ci.r6 r6Var = kh1Var.f39511y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.m2) kh1Var).actionBar;
                org.telegram.ui.ActionBar.h5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                kh1Var.K.setDuration(150L);
                kh1Var.K.addListener(new gp0(this, 26));
                kh1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f39218c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f39218c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f39217b;
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
