package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class au0 extends org.telegram.ui.Components.s11 {
    public boolean f35780a;
    public float f35781b;
    public NestedScrollView f35782c;
    public FrameLayout d;

    public au0(Context context) {
        super(context);
        this.f35780a = false;
        this.f35781b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f35780a && z10) {
            this.f35782c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f35780a) {
            return this.f35781b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f35780a = true;
            this.f35782c.setVisibility(getVisibility());
            this.f35782c.setAlpha(this.f35781b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35780a) {
            this.f35780a = false;
            this.f35782c.setVisibility(8);
            super.setAlpha(this.f35781b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f35781b = f7;
        if (this.f35780a) {
            this.f35782c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f35782c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f35780a) {
            this.f35782c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
