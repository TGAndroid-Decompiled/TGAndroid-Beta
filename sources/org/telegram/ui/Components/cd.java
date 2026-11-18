package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class cd extends FrameLayout {
    public bi.a3 f33966a;
    public ad f33967b;
    public boolean f33968c;

    public final void a(ad adVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f33967b == null) {
            this.f33967b = adVar;
            adVar.setVisibility(8);
            addView(adVar, layoutParams);
        }
    }

    public final void b(bi.a3 a3Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f33966a == null) {
            this.f33966a = a3Var;
            addView(a3Var, layoutParams);
        }
    }

    public ad getEditView() {
        return this.f33967b;
    }

    public View getReplyView() {
        return this.f33966a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f33968c = z10;
        bi.a3 a3Var = this.f33966a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        a3Var.setVisibility(i7);
        ad adVar = this.f33967b;
        if (!z10) {
            i10 = 8;
        }
        adVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f33966a.setVisibility(0);
        }
        this.f33967b.f33331a[0].setOnlyIconMode(z10);
        this.f33967b.f33331a[1].setOnlyIconMode(z10);
    }
}
