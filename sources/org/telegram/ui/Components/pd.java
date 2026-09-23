package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ai.f0 f27002a;
    public nd f27003b;
    public boolean f27004c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f27003b == null) {
            this.f27003b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f27002a == null) {
            this.f27002a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f27003b;
    }

    public View getReplyView() {
        return this.f27002a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f27004c = z10;
        ai.f0 f0Var = this.f27002a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        nd ndVar = this.f27003b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f27002a.setVisibility(0);
        }
        this.f27003b.f26410a[0].setOnlyIconMode(z10);
        this.f27003b.f26410a[1].setOnlyIconMode(z10);
    }
}
