package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class qd extends FrameLayout {
    public ai.f0 f27586a;
    public od f27587b;
    public boolean f27588c;

    public final void a(od odVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f27587b == null) {
            this.f27587b = odVar;
            odVar.setVisibility(8);
            addView(odVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f27586a == null) {
            this.f27586a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public od getEditView() {
        return this.f27587b;
    }

    public View getReplyView() {
        return this.f27586a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f27588c = z10;
        ai.f0 f0Var = this.f27586a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        od odVar = this.f27587b;
        if (!z10) {
            i11 = 8;
        }
        odVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f27586a.setVisibility(0);
        }
        this.f27587b.f27023a[0].setOnlyIconMode(z10);
        this.f27587b.f27023a[1].setOnlyIconMode(z10);
    }
}
