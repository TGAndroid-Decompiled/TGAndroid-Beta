package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class ju0 extends org.telegram.ui.Components.d11 {
    public boolean f34870a;
    public float f34871b;
    public NestedScrollView f34872c;
    public FrameLayout d;

    public ju0(Context context) {
        super(context);
        this.f34870a = false;
        this.f34871b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f34870a && z10) {
            this.f34872c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f34870a) {
            return this.f34871b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f34870a = true;
            this.f34872c.setVisibility(getVisibility());
            this.f34872c.setAlpha(this.f34871b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f34870a) {
            this.f34870a = false;
            this.f34872c.setVisibility(8);
            super.setAlpha(this.f34871b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f34871b = f7;
        if (this.f34870a) {
            this.f34872c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f34872c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f34870a) {
            this.f34872c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
