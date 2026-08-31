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
public final class pg1 extends ScrollView {
    public final int[] f40035a;
    public final Rect f40036b;
    public boolean f40037c;
    public int d;
    public final qg1 f40038e;

    public pg1(qg1 qg1Var, Context context) {
        super(context);
        this.f40038e = qg1Var;
        this.f40035a = new int[2];
        this.f40036b = new Rect();
        this.f40037c = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f40037c = false;
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        boolean z10;
        Integer num;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        super.onScrollChanged(i10, i11, i12, i13);
        qg1 qg1Var = this.f40038e;
        TextView textView = qg1Var.f40484c;
        if (textView != null) {
            int[] iArr = this.f40035a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = qg1Var.f40484c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.p2) qg1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (qg1Var.f40484c.getTag() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                TextView textView2 = qg1Var.f40484c;
                if (z4) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = qg1Var.H;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    qg1Var.H = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                qg1Var.H = animatorSet2;
                fg.i0 i0Var = qg1Var.f40497y;
                float f11 = 0.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float[] fArr = {f10};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i0Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.p2) qg1Var).actionBar;
                org.telegram.ui.ActionBar.l5 titleTextView = kVar2.getTitleTextView();
                if (z4) {
                    f11 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f11));
                qg1Var.H.setDuration(150L);
                qg1Var.H.addListener(new ns0(this, 24));
                qg1Var.H.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f40037c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
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
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override
    public final void requestLayout() {
        this.f40037c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f40036b;
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
