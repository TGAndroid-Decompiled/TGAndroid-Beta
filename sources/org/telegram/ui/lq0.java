package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class lq0 extends org.telegram.ui.Components.vy0 {
    public boolean f47578a;
    public float f47579b;
    public NestedScrollView f47580c;
    public FrameLayout d;

    public lq0(Context context) {
        super(context);
        this.f47578a = false;
        this.f47579b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.f47578a && z9) {
            this.f47580c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f47578a) {
            return this.f47579b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f47578a = true;
            this.f47580c.setVisibility(getVisibility());
            this.f47580c.setAlpha(this.f47579b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f47578a) {
            this.f47578a = false;
            this.f47580c.setVisibility(8);
            super.setAlpha(this.f47579b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f47579b = f10;
        if (this.f47578a) {
            this.f47580c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f47580c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f47578a) {
            this.f47580c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
