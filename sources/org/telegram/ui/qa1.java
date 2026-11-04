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
public final class qa1 extends ScrollView {
    public final int[] f48828a;
    public final Rect f48829b;
    public boolean f48830c;
    public final ra1 d;

    public qa1(ra1 ra1Var, Context context) {
        super(context);
        this.d = ra1Var;
        this.f48828a = new int[2];
        this.f48829b = new Rect();
        this.f48830c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f48830c = false;
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i3, i10, i11, i12);
        ra1 ra1Var = this.d;
        TextView textView = ra1Var.f49157c;
        if (textView != null) {
            int[] iArr = this.f48828a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = ra1Var.f49157c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.d2) ra1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ra1Var.f49157c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = ra1Var.f49157c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = ra1Var.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ra1Var.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                ra1Var.L = animatorSet2;
                gi.n5 n5Var = ra1Var.E;
                float f11 = 0.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n5Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.d2) ra1Var).actionBar;
                org.telegram.ui.ActionBar.k5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                ra1Var.L.setDuration(150L);
                ra1Var.L.addListener(new i81(this, 2));
                ra1Var.L.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f48830c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f48830c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f48829b;
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
