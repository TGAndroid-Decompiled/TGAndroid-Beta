package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ju0 extends org.telegram.ui.Components.f11 {
    public boolean f34873a;
    public float f34874b;
    public NestedScrollView f34875c;
    public FrameLayout d;

    public ju0(Context context) {
        super(context);
        this.f34873a = false;
        this.f34874b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f34873a && z10) {
            this.f34875c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f34873a) {
            return this.f34874b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f34873a = true;
            this.f34875c.setVisibility(getVisibility());
            this.f34875c.setAlpha(this.f34874b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34873a) {
            this.f34873a = false;
            this.f34875c.setVisibility(8);
            super.setAlpha(this.f34874b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f34874b = f7;
        if (this.f34873a) {
            this.f34875c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f34875c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f34873a) {
            this.f34875c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
