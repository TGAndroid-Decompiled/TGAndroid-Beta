package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class mq0 extends org.telegram.ui.Components.hz0 {
    public boolean f49961a;
    public float f49962b;
    public NestedScrollView f49963c;
    public FrameLayout d;

    public mq0(Context context) {
        super(context);
        this.f49961a = false;
        this.f49962b = 1.0f;
    }

    public final void b(int i7, boolean z10) {
        super.setVisibility(i7);
        if (this.f49961a && z10) {
            this.f49963c.setVisibility(i7);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f49961a) {
            return this.f49962b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f49961a = true;
            this.f49963c.setVisibility(getVisibility());
            this.f49963c.setAlpha(this.f49962b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f49961a) {
            this.f49961a = false;
            this.f49963c.setVisibility(8);
            super.setAlpha(this.f49962b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f49962b = f10;
        if (this.f49961a) {
            this.f49963c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f49963c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f49961a) {
            this.f49963c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
