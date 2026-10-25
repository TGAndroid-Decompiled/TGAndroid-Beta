package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class eu0 extends org.telegram.ui.Components.a21 {
    public boolean f39179a;
    public float f39180b;
    public NestedScrollView f39181c;
    public FrameLayout d;

    public eu0(Context context) {
        super(context);
        this.f39179a = false;
        this.f39180b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.f39179a && z10) {
            this.f39181c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f39179a) {
            return this.f39180b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f39179a = true;
            this.f39181c.setVisibility(getVisibility());
            this.f39181c.setAlpha(this.f39180b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f39179a) {
            this.f39179a = false;
            this.f39181c.setVisibility(8);
            super.setAlpha(this.f39180b);
        }
    }

    @Override
    public void setAlpha(float f7) {
        this.f39180b = f7;
        if (this.f39179a) {
            this.f39181c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f39181c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.f39179a) {
            this.f39181c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
