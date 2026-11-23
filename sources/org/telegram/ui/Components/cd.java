package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class cd extends FrameLayout {
    public bi.e3 f34184a;
    public ad f34185b;
    public boolean f34186c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f34185b == null) {
            this.f34185b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.e3 e3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f34184a == null) {
            this.f34184a = e3Var;
            addView(e3Var, layoutParams);
        }
    }

    public ad getEditView() {
        return this.f34185b;
    }

    public View getReplyView() {
        return this.f34184a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f34186c = z10;
        bi.e3 e3Var = this.f34184a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        e3Var.setVisibility(i7);
        ad adVar = this.f34185b;
        if (!z10) {
            i10 = 8;
        }
        adVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f34184a.setVisibility(0);
        }
        this.f34185b.f33499a[0].setOnlyIconMode(z10);
        this.f34185b.f33499a[1].setOnlyIconMode(z10);
    }
}
