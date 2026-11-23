package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ro extends LinearLayout {
    public xi0 f39364a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f39365b;
    public FrameLayout f39366c;
    public int d;
    public float f39367e;
    public float f39368f;
    public float h;
    public float f39369n;
    public float f39370r;

    public final void a() {
        FrameLayout frameLayout = this.f39366c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f39369n + this.f39370r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f39368f) * this.f39367e;
        this.f39365b.setTranslationX(f10);
        FrameLayout frameLayout = this.f39366c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ro.onMeasure(int, int):void");
    }

    public void setExpandSize(float f10) {
        this.f39365b.setTranslationY(f10);
        this.f39369n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f39365b.setAlpha(f10);
        FrameLayout frameLayout = this.f39366c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f39365b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new g2(15, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            jf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f36408y.add(new if0() {
                @Override
                public final void a(float f10, float f11) {
                    ro roVar = ro.this;
                    FrameLayout frameLayout = roVar.f39366c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    roVar.f39368f = f11;
                    roVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(xi0 xi0Var) {
        this.f39364a = xi0Var;
        if (xi0Var != null) {
            xi0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f39365b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f39366c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f39366c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f39366c.setPivotY(0.0f);
            this.f39370r = (1.0f - f10) * (-this.f39365b.getMeasuredHeight());
            a();
            this.f39366c.setScaleX(f11);
            this.f39366c.setScaleY(f11);
        }
    }
}
