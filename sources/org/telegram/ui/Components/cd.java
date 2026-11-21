package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class cd extends FrameLayout {
    public bi.e3 f34190a;
    public ad f34191b;
    public boolean f34192c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f34191b == null) {
            this.f34191b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.e3 e3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f34190a == null) {
            this.f34190a = e3Var;
            addView(e3Var, layoutParams);
        }
    }

    public ad getEditView() {
        return this.f34191b;
    }

    public View getReplyView() {
        return this.f34190a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f34192c = z10;
        bi.e3 e3Var = this.f34190a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        e3Var.setVisibility(i7);
        ad adVar = this.f34191b;
        if (!z10) {
            i10 = 8;
        }
        adVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f34190a.setVisibility(0);
        }
        this.f34191b.f33486a[0].setOnlyIconMode(z10);
        this.f34191b.f33486a[1].setOnlyIconMode(z10);
    }
}
