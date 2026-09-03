package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
public final class du0 extends org.telegram.ui.Components.u01 {
    public boolean f36258a;
    public float f36259b;
    public NestedScrollView f36260c;
    public FrameLayout d;

    public du0(Context context) {
        super(context);
        this.f36258a = false;
        this.f36259b = 1.0f;
    }

    public final void b(int i10, boolean z4) {
        super.setVisibility(i10);
        if (this.f36258a && z4) {
            this.f36260c.setVisibility(i10);
        }
    }

    @Override
    public float getAlpha() {
        if (this.f36258a) {
            return this.f36259b;
        }
        return super.getAlpha();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && getParent() == this.d) {
            this.f36258a = true;
            this.f36260c.setVisibility(getVisibility());
            this.f36260c.setAlpha(this.f36259b);
            super.setAlpha(1.0f);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f36258a) {
            this.f36258a = false;
            this.f36260c.setVisibility(8);
            super.setAlpha(this.f36259b);
        }
    }

    @Override
    public void setAlpha(float f10) {
        this.f36259b = f10;
        if (this.f36258a) {
            this.f36260c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.f36260c = nestedScrollView;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.f36258a) {
            this.f36260c.invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
