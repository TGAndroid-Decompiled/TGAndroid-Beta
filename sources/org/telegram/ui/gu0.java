package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class gu0 extends org.telegram.ui.Components.b21 {
    public boolean f39692a;
    public float f39693b;
    public NestedScrollView f39694c;
    public FrameLayout d;

    public gu0(Context context) {
        super(context);
        this.f39692a = false;
        this.f39693b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f39692a && z10) {
            this.f39694c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f39692a) {
            return this.f39693b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f39692a = true;
            this.f39694c.setVisibility(getVisibility());
            this.f39694c.setAlpha(this.f39693b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39692a) {
            this.f39692a = false;
            this.f39694c.setVisibility(8);
            super.setAlpha(this.f39693b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f39693b = f7;
        if (this.f39692a) {
            this.f39694c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f39694c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f39692a) {
            this.f39694c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
