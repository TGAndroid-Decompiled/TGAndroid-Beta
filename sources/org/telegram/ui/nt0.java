package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class nt0 extends org.telegram.ui.Components.j01 {
    public boolean f40900a;
    public float f40901b;
    public NestedScrollView f40902c;
    public FrameLayout d;

    public nt0(Context context) {
        super(context);
        this.f40900a = false;
        this.f40901b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f40900a && z10) {
            this.f40902c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f40900a) {
            return this.f40901b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f40900a = true;
            this.f40902c.setVisibility(getVisibility());
            this.f40902c.setAlpha(this.f40901b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f40900a) {
            this.f40900a = false;
            this.f40902c.setVisibility(8);
            super.setAlpha(this.f40901b);
        }
    }

    @Override
    public void setAlpha(float f9) {
        this.f40901b = f9;
        if (this.f40900a) {
            this.f40902c.setAlpha(f9);
        } else {
            super.setAlpha(f9);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f40902c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        if (this.f40900a) {
            this.f40902c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
