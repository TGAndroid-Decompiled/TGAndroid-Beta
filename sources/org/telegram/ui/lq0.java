package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class lq0 extends org.telegram.ui.Components.wy0 {
    public boolean f47577a;
    public float f47578b;
    public NestedScrollView f47579c;
    public FrameLayout d;

    public lq0(Context context) {
        super(context);
        this.f47577a = false;
        this.f47578b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.f47577a && z9) {
            this.f47579c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f47577a) {
            return this.f47578b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f47577a = true;
            this.f47579c.setVisibility(getVisibility());
            this.f47579c.setAlpha(this.f47578b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f47577a) {
            this.f47577a = false;
            this.f47579c.setVisibility(8);
            super.setAlpha(this.f47578b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f47578b = f10;
        if (this.f47577a) {
            this.f47579c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f47579c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f47577a) {
            this.f47579c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
