package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class cq0 extends org.telegram.ui.Components.vy0 {
    public boolean f44418a;
    public float f44419b;
    public NestedScrollView f44420c;
    public FrameLayout d;

    public cq0(Context context) {
        super(context);
        this.f44418a = false;
        this.f44419b = 1.0f;
    }

    public final void b(int i3, boolean z10) {
        super.setVisibility(i3);
        if (this.f44418a && z10) {
            this.f44420c.setVisibility(i3);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f44418a) {
            return this.f44419b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f44418a = true;
            this.f44420c.setVisibility(getVisibility());
            this.f44420c.setAlpha(this.f44419b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f44418a) {
            this.f44418a = false;
            this.f44420c.setVisibility(8);
            super.setAlpha(this.f44419b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f44419b = f10;
        if (this.f44418a) {
            this.f44420c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f44420c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f44418a) {
            this.f44420c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i3) {
        b(i3, true);
    }
}
