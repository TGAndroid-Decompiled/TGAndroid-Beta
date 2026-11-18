package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class so extends LinearLayout {
    public vi0 f39796a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f39797b;
    public FrameLayout f39798c;
    public int d;
    public float f39799e;
    public float f39800f;
    public float h;
    public float f39801n;
    public float f39802r;

    public final void a() {
        FrameLayout frameLayout = this.f39798c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f39801n + this.f39802r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f39800f) * this.f39799e;
        this.f39797b.setTranslationX(f10);
        FrameLayout frameLayout = this.f39798c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.so.onMeasure(int, int):void");
    }

    public void setExpandSize(float f10) {
        this.f39797b.setTranslationY(f10);
        this.f39801n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f39797b.setAlpha(f10);
        FrameLayout frameLayout = this.f39798c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f39797b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new g2(15, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            if0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f36122y.add(new hf0() {
                @Override
                public final void a(float f10, float f11) {
                    so soVar = so.this;
                    FrameLayout frameLayout = soVar.f39798c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    soVar.f39800f = f11;
                    soVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(vi0 vi0Var) {
        this.f39796a = vi0Var;
        if (vi0Var != null) {
            vi0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f39797b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f39798c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f39798c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f39798c.setPivotY(0.0f);
            this.f39802r = (1.0f - f10) * (-this.f39797b.getMeasuredHeight());
            a();
            this.f39798c.setScaleX(f11);
            this.f39798c.setScaleY(f11);
        }
    }
}
