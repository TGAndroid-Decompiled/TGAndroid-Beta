package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mu0 extends org.telegram.ui.Components.f11 {
    public boolean f35755a;
    public float f35756b;
    public NestedScrollView f35757c;
    public FrameLayout d;

    public mu0(Context context) {
        super(context);
        this.f35755a = false;
        this.f35756b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f35755a && z10) {
            this.f35757c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f35755a) {
            return this.f35756b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f35755a = true;
            this.f35757c.setVisibility(getVisibility());
            this.f35757c.setAlpha(this.f35756b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35755a) {
            this.f35755a = false;
            this.f35757c.setVisibility(8);
            super.setAlpha(this.f35756b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f35756b = f7;
        if (this.f35755a) {
            this.f35757c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f35757c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f35755a) {
            this.f35757c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
