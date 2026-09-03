package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class du0 extends org.telegram.ui.Components.u01 {
    public boolean f33531a;
    public float f33532b;
    public NestedScrollView f33533c;
    public FrameLayout d;

    public du0(Context context) {
        super(context);
        this.f33531a = false;
        this.f33532b = 1.0f;
    }

    public final void b(int i10, boolean z4) {
        super.setVisibility(i10);
        if (this.f33531a && z4) {
            this.f33533c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f33531a) {
            return this.f33532b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f33531a = true;
            this.f33533c.setVisibility(getVisibility());
            this.f33533c.setAlpha(this.f33532b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f33531a) {
            this.f33531a = false;
            this.f33533c.setVisibility(8);
            super.setAlpha(this.f33532b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f33532b = f10;
        if (this.f33531a) {
            this.f33533c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f33533c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f33531a) {
            this.f33533c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
