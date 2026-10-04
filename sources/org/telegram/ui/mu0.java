package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mu0 extends org.telegram.ui.Components.o11 {
    public boolean f38758a;
    public float f38759b;
    public NestedScrollView f38760c;
    public FrameLayout d;

    public mu0(Context context) {
        super(context);
        this.f38758a = false;
        this.f38759b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f38758a && z10) {
            this.f38760c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f38758a) {
            return this.f38759b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f38758a = true;
            this.f38760c.setVisibility(getVisibility());
            this.f38760c.setAlpha(this.f38759b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f38758a) {
            this.f38758a = false;
            this.f38760c.setVisibility(8);
            super.setAlpha(this.f38759b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f38759b = f7;
        if (this.f38758a) {
            this.f38760c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f38760c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f38758a) {
            this.f38760c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
