package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class kq0 extends org.telegram.ui.Components.yy0 {
    public boolean f48744a;
    public float f48745b;
    public NestedScrollView f48746c;
    public FrameLayout d;

    public kq0(Context context) {
        super(context);
        this.f48744a = false;
        this.f48745b = 1.0f;
    }

    public final void b(int i7, boolean z10) {
        super.setVisibility(i7);
        if (this.f48744a && z10) {
            this.f48746c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f48744a) {
            return this.f48745b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f48744a = true;
            this.f48746c.setVisibility(getVisibility());
            this.f48746c.setAlpha(this.f48745b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48744a) {
            this.f48744a = false;
            this.f48746c.setVisibility(8);
            super.setAlpha(this.f48745b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f48745b = f10;
        if (this.f48744a) {
            this.f48746c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f48746c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f48744a) {
            this.f48746c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
