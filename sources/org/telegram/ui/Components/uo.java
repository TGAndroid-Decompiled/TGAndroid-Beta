package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class uo extends LinearLayout {
    public xi0 f40532a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40533b;
    public FrameLayout f40534c;
    public int d;
    public float f40535e;
    public float f40536f;
    public float h;
    public float f40537n;
    public float f40538r;

    public final void a() {
        FrameLayout frameLayout = this.f40534c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f40537n + this.f40538r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f40536f) * this.f40535e;
        this.f40533b.setTranslationX(f10);
        FrameLayout frameLayout = this.f40534c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uo.onMeasure(int, int):void");
    }

    public void setExpandSize(float f10) {
        this.f40533b.setTranslationY(f10);
        this.f40537n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f40533b.setAlpha(f10);
        FrameLayout frameLayout = this.f40534c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f40533b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new h2(15, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f36908y.add(new jf0() {
                @Override
                public final void a(float f10, float f11) {
                    uo uoVar = uo.this;
                    FrameLayout frameLayout = uoVar.f40534c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    uoVar.f40536f = f11;
                    uoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(xi0 xi0Var) {
        this.f40532a = xi0Var;
        if (xi0Var != null) {
            xi0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f40533b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f40534c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f40534c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f40534c.setPivotY(0.0f);
            this.f40538r = (1.0f - f10) * (-this.f40533b.getMeasuredHeight());
            a();
            this.f40534c.setScaleX(f11);
            this.f40534c.setScaleY(f11);
        }
    }
}
