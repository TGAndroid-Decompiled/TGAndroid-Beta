package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mu0 extends org.telegram.ui.Components.o11 {
    public boolean f38763a;
    public float f38764b;
    public NestedScrollView f38765c;
    public FrameLayout d;

    public mu0(Context context) {
        super(context);
        this.f38763a = false;
        this.f38764b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f38763a && z10) {
            this.f38765c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f38763a) {
            return this.f38764b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f38763a = true;
            this.f38765c.setVisibility(getVisibility());
            this.f38765c.setAlpha(this.f38764b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38763a) {
            this.f38763a = false;
            this.f38765c.setVisibility(8);
            super.setAlpha(this.f38764b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f38764b = f7;
        if (this.f38763a) {
            this.f38765c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f38765c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f38763a) {
            this.f38765c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
