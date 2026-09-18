package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class nd extends FrameLayout {
    public ai.f0 f26442a;
    public ld f26443b;
    public boolean f26444c;

    public final void a(ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f26443b == null) {
            this.f26443b = ldVar;
            ldVar.setVisibility(8);
            addView(ldVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f26442a == null) {
            this.f26442a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public ld getEditView() {
        return this.f26443b;
    }

    public View getReplyView() {
        return this.f26442a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f26444c = z10;
        ai.f0 f0Var = this.f26442a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        ld ldVar = this.f26443b;
        if (!z10) {
            i11 = 8;
        }
        ldVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f26442a.setVisibility(0);
        }
        this.f26443b.f25893a[0].setOnlyIconMode(z10);
        this.f26443b.f25893a[1].setOnlyIconMode(z10);
    }
}
