package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mu0 extends org.telegram.ui.Components.o11 {
    public boolean f38757a;
    public float f38758b;
    public NestedScrollView f38759c;
    public FrameLayout d;

    public mu0(Context context) {
        super(context);
        this.f38757a = false;
        this.f38758b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f38757a && z10) {
            this.f38759c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f38757a) {
            return this.f38758b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f38757a = true;
            this.f38759c.setVisibility(getVisibility());
            this.f38759c.setAlpha(this.f38758b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38757a) {
            this.f38757a = false;
            this.f38759c.setVisibility(8);
            super.setAlpha(this.f38758b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f38758b = f7;
        if (this.f38757a) {
            this.f38759c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f38759c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f38757a) {
            this.f38759c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
