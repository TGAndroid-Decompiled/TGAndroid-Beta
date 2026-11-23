package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class uo extends LinearLayout {
    public xi0 f40489a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40490b;
    public FrameLayout f40491c;
    public int d;
    public float f40492e;
    public float f40493f;
    public float h;
    public float f40494n;
    public float f40495r;

    public final void a() {
        FrameLayout frameLayout = this.f40491c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f40494n + this.f40495r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f40493f) * this.f40492e;
        this.f40490b.setTranslationX(f10);
        FrameLayout frameLayout = this.f40491c;
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
        this.f40490b.setTranslationY(f10);
        this.f40494n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f40490b.setAlpha(f10);
        FrameLayout frameLayout = this.f40491c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f40490b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new h2(15, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            kf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f36873y.add(new jf0() {
                @Override
                public final void a(float f10, float f11) {
                    uo uoVar = uo.this;
                    FrameLayout frameLayout = uoVar.f40491c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    uoVar.f40493f = f11;
                    uoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(xi0 xi0Var) {
        this.f40489a = xi0Var;
        if (xi0Var != null) {
            xi0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f40490b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f40491c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f40491c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f40491c.setPivotY(0.0f);
            this.f40495r = (1.0f - f10) * (-this.f40490b.getMeasuredHeight());
            a();
            this.f40491c.setScaleX(f11);
            this.f40491c.setScaleY(f11);
        }
    }
}
