package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class oq0 extends org.telegram.ui.Components.wy0 {
    public boolean f48568a;
    public float f48569b;
    public NestedScrollView f48570c;
    public FrameLayout d;

    public oq0(Context context) {
        super(context);
        this.f48568a = false;
        this.f48569b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.f48568a && z9) {
            this.f48570c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f48568a) {
            return this.f48569b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f48568a = true;
            this.f48570c.setVisibility(getVisibility());
            this.f48570c.setAlpha(this.f48569b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48568a) {
            this.f48568a = false;
            this.f48570c.setVisibility(8);
            super.setAlpha(this.f48569b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f48569b = f10;
        if (this.f48568a) {
            this.f48570c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f48570c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f48568a) {
            this.f48570c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
