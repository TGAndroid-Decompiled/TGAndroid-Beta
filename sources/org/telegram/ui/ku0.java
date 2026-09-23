package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ku0 extends org.telegram.ui.Components.p01 {
    public boolean f34799a;
    public float f34800b;
    public NestedScrollView f34801c;
    public FrameLayout d;

    public ku0(Context context) {
        super(context);
        this.f34799a = false;
        this.f34800b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f34799a && z10) {
            this.f34801c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f34799a) {
            return this.f34800b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f34799a = true;
            this.f34801c.setVisibility(getVisibility());
            this.f34801c.setAlpha(this.f34800b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34799a) {
            this.f34799a = false;
            this.f34801c.setVisibility(8);
            super.setAlpha(this.f34800b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f34800b = f7;
        if (this.f34799a) {
            this.f34801c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f34801c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f34799a) {
            this.f34801c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
