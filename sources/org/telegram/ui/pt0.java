package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class pt0 extends org.telegram.ui.Components.xz0 {
    public boolean f41588a;
    public float f41589b;
    public NestedScrollView f41590c;
    public FrameLayout d;

    public pt0(Context context) {
        super(context);
        this.f41588a = false;
        this.f41589b = 1.0f;
    }

    public final void b(int i9, boolean z10) {
        super.setVisibility(i9);
        if (this.f41588a && z10) {
            this.f41590c.setVisibility(i9);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f41588a) {
            return this.f41589b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f41588a = true;
            this.f41590c.setVisibility(getVisibility());
            this.f41590c.setAlpha(this.f41589b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f41588a) {
            this.f41588a = false;
            this.f41590c.setVisibility(8);
            super.setAlpha(this.f41589b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f41589b = f10;
        if (this.f41588a) {
            this.f41590c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f41590c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f41588a) {
            this.f41590c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i9) {
        b(i9, true);
    }
}
