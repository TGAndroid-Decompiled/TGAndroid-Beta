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
public final class eg1 extends ScrollView {
    public final int[] f38863a;
    public final Rect f38864b;
    public boolean f38865c;
    public final fg1 d;

    public eg1(fg1 fg1Var, Context context) {
        super(context);
        this.d = fg1Var;
        this.f38863a = new int[2];
        this.f38864b = new Rect();
        this.f38865c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f38865c = false;
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
        fg1 fg1Var = this.d;
        TextView textView = fg1Var.f39363c;
        if (textView != null) {
            int[] iArr = this.f38863a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = fg1Var.f39363c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.r2) fg1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (fg1Var.f39363c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = fg1Var.f39363c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = fg1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    fg1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                fg1Var.K = animatorSet2;
                fi.f6 f6Var = fg1Var.f39378y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.r2) fg1Var).actionBar;
                org.telegram.ui.ActionBar.b6 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                fg1Var.K.setDuration(150L);
                fg1Var.K.addListener(new hc1(this, 3));
                fg1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f38865c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f38865c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f38864b;
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
