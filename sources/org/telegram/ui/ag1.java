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
public final class ag1 extends ScrollView {
    public final int[] f35677a;
    public final Rect f35678b;
    public boolean f35679c;
    public final bg1 d;

    public ag1(bg1 bg1Var, Context context) {
        super(context);
        this.d = bg1Var;
        this.f35677a = new int[2];
        this.f35678b = new Rect();
        this.f35679c = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f35679c = false;
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
        bg1 bg1Var = this.d;
        TextView textView = bg1Var.f36084c;
        if (textView != null) {
            int[] iArr = this.f35677a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = bg1Var.f36084c.getMeasuredHeight() + iArr[1];
            kVar = ((org.telegram.ui.ActionBar.o2) bg1Var).actionBar;
            if (measuredHeight < kVar.getBottom()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bg1Var.f36084c.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                TextView textView2 = bg1Var.f36084c;
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = bg1Var.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    bg1Var.K = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                bg1Var.K = animatorSet2;
                ei.g6 g6Var = bg1Var.f36099y;
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr = {f7};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g6Var, property, fArr);
                kVar2 = ((org.telegram.ui.ActionBar.o2) bg1Var).actionBar;
                org.telegram.ui.ActionBar.n5 titleTextView = kVar2.getTitleTextView();
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f10));
                bg1Var.K.setDuration(150L);
                bg1Var.K.addListener(new ve1(this, 1));
                bg1Var.K.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.f35679c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.f35679c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.f35678b;
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
