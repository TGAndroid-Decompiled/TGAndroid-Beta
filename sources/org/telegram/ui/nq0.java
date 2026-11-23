package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class nq0 extends org.telegram.ui.Components.hz0 {
    public boolean f50283a;
    public float f50284b;
    public NestedScrollView f50285c;
    public FrameLayout d;

    public nq0(Context context) {
        super(context);
        this.f50283a = false;
        this.f50284b = 1.0f;
    }

    public final void b(int i7, boolean z10) {
        super.setVisibility(i7);
        if (this.f50283a && z10) {
            this.f50285c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f50283a) {
            return this.f50284b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f50283a = true;
            this.f50285c.setVisibility(getVisibility());
            this.f50285c.setAlpha(this.f50284b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f50283a) {
            this.f50283a = false;
            this.f50285c.setVisibility(8);
            super.setAlpha(this.f50284b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f50284b = f10;
        if (this.f50283a) {
            this.f50285c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f50285c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f50283a) {
            this.f50285c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
