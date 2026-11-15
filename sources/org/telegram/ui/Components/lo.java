package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class lo extends LinearLayout {
    public mi0 f36860a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f36861b;
    public FrameLayout f36862c;
    public int d;
    public float f36863e;
    public float f36864f;
    public float h;
    public float f36865n;
    public float f36866r;

    public final void a() {
        FrameLayout frameLayout = this.f36862c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f36865n + this.f36866r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f36864f) * this.f36863e;
        this.f36861b.setTranslationX(f10);
        FrameLayout frameLayout = this.f36862c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo.onMeasure(int, int):void");
    }

    public void setExpandSize(float f10) {
        this.f36861b.setTranslationY(f10);
        this.f36865n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f36861b.setAlpha(f10);
        FrameLayout frameLayout = this.f36862c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f36861b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new f1(16, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            ye0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f41991y.add(new xe0() {
                @Override
                public final void a(float f10, float f11) {
                    lo loVar = lo.this;
                    FrameLayout frameLayout = loVar.f36862c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    loVar.f36864f = f11;
                    loVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(mi0 mi0Var) {
        this.f36860a = mi0Var;
        if (mi0Var != null) {
            mi0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f36861b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f36862c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f36862c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f36862c.setPivotY(0.0f);
            this.f36866r = (1.0f - f10) * (-this.f36861b.getMeasuredHeight());
            a();
            this.f36862c.setScaleX(f11);
            this.f36862c.setScaleY(f11);
        }
    }
}
