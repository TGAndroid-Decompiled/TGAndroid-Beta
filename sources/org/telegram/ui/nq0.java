package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class nq0 extends org.telegram.ui.Components.xy0 {
    public boolean f48224a;
    public float f48225b;
    public NestedScrollView f48226c;
    public FrameLayout d;

    public nq0(Context context) {
        super(context);
        this.f48224a = false;
        this.f48225b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.f48224a && z9) {
            this.f48226c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f48224a) {
            return this.f48225b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f48224a = true;
            this.f48226c.setVisibility(getVisibility());
            this.f48226c.setAlpha(this.f48225b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48224a) {
            this.f48224a = false;
            this.f48226c.setVisibility(8);
            super.setAlpha(this.f48225b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f48225b = f10;
        if (this.f48224a) {
            this.f48226c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f48226c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f48224a) {
            this.f48226c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
