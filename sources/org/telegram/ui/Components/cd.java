package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class cd extends FrameLayout {
    public bi.g3 f34023a;
    public ad f34024b;
    public boolean f34025c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f34024b == null) {
            this.f34024b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.g3 g3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f34023a == null) {
            this.f34023a = g3Var;
            addView(g3Var, layoutParams);
        }
    }

    public ad getEditView() {
        return this.f34024b;
    }

    public View getReplyView() {
        return this.f34023a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f34025c = z10;
        bi.g3 g3Var = this.f34023a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        g3Var.setVisibility(i7);
        ad adVar = this.f34024b;
        if (!z10) {
            i10 = 8;
        }
        adVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f34023a.setVisibility(0);
        }
        this.f34024b.f33460a[0].setOnlyIconMode(z10);
        this.f34024b.f33460a[1].setOnlyIconMode(z10);
    }
}
