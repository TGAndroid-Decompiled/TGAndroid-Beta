package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class cd extends FrameLayout {
    public bi.g3 f34148a;
    public ad f34149b;
    public boolean f34150c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f34149b == null) {
            this.f34149b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.g3 g3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f34148a == null) {
            this.f34148a = g3Var;
            addView(g3Var, layoutParams);
        }
    }

    public ad getEditView() {
        return this.f34149b;
    }

    public View getReplyView() {
        return this.f34148a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f34150c = z10;
        bi.g3 g3Var = this.f34148a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        g3Var.setVisibility(i7);
        ad adVar = this.f34149b;
        if (!z10) {
            i10 = 8;
        }
        adVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f34148a.setVisibility(0);
        }
        this.f34149b.f33465a[0].setOnlyIconMode(z10);
        this.f34149b.f33465a[1].setOnlyIconMode(z10);
    }
}
