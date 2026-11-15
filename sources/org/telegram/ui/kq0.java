package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class kq0 extends org.telegram.ui.Components.yy0 {
    public boolean f48748a;
    public float f48749b;
    public NestedScrollView f48750c;
    public FrameLayout d;

    public kq0(Context context) {
        super(context);
        this.f48748a = false;
        this.f48749b = 1.0f;
    }

    public final void b(int i7, boolean z10) {
        super.setVisibility(i7);
        if (this.f48748a && z10) {
            this.f48750c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f48748a) {
            return this.f48749b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f48748a = true;
            this.f48750c.setVisibility(getVisibility());
            this.f48750c.setAlpha(this.f48749b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f48748a) {
            this.f48748a = false;
            this.f48750c.setVisibility(8);
            super.setAlpha(this.f48749b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f48749b = f10;
        if (this.f48748a) {
            this.f48750c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f48750c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f48748a) {
            this.f48750c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
