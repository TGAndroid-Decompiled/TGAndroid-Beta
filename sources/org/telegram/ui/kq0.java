package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class kq0 extends org.telegram.ui.Components.vy0 {
    public boolean f47238a;
    public float f47239b;
    public NestedScrollView f47240c;
    public FrameLayout d;

    public kq0(Context context) {
        super(context);
        this.f47238a = false;
        this.f47239b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.f47238a && z9) {
            this.f47240c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f47238a) {
            return this.f47239b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f47238a = true;
            this.f47240c.setVisibility(getVisibility());
            this.f47240c.setAlpha(this.f47239b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f47238a) {
            this.f47238a = false;
            this.f47240c.setVisibility(8);
            super.setAlpha(this.f47239b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f47239b = f10;
        if (this.f47238a) {
            this.f47240c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f47240c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f47238a) {
            this.f47240c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
