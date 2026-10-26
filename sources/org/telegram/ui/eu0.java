package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class eu0 extends org.telegram.ui.Components.a21 {
    public boolean f39182a;
    public float f39183b;
    public NestedScrollView f39184c;
    public FrameLayout d;

    public eu0(Context context) {
        super(context);
        this.f39182a = false;
        this.f39183b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f39182a && z10) {
            this.f39184c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f39182a) {
            return this.f39183b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f39182a = true;
            this.f39184c.setVisibility(getVisibility());
            this.f39184c.setAlpha(this.f39183b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39182a) {
            this.f39182a = false;
            this.f39184c.setVisibility(8);
            super.setAlpha(this.f39183b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f39183b = f7;
        if (this.f39182a) {
            this.f39184c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f39184c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f39182a) {
            this.f39184c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
