package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mu0 extends org.telegram.ui.Components.p11 {
    public boolean f38749a;
    public float f38750b;
    public NestedScrollView f38751c;
    public FrameLayout d;

    public mu0(Context context) {
        super(context);
        this.f38749a = false;
        this.f38750b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f38749a && z10) {
            this.f38751c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f38749a) {
            return this.f38750b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f38749a = true;
            this.f38751c.setVisibility(getVisibility());
            this.f38751c.setAlpha(this.f38750b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38749a) {
            this.f38749a = false;
            this.f38751c.setVisibility(8);
            super.setAlpha(this.f38750b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f38750b = f7;
        if (this.f38749a) {
            this.f38751c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f38751c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f38749a) {
            this.f38751c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
