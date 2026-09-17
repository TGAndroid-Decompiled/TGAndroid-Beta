package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class nd extends FrameLayout {
    public ai.f0 f26439a;
    public ld f26440b;
    public boolean f26441c;

    public final void a(ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f26440b == null) {
            this.f26440b = ldVar;
            ldVar.setVisibility(8);
            addView(ldVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f26439a == null) {
            this.f26439a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public ld getEditView() {
        return this.f26440b;
    }

    public View getReplyView() {
        return this.f26439a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f26441c = z10;
        ai.f0 f0Var = this.f26439a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        ld ldVar = this.f26440b;
        if (!z10) {
            i11 = 8;
        }
        ldVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f26439a.setVisibility(0);
        }
        this.f26440b.f25890a[0].setOnlyIconMode(z10);
        this.f26440b.f25890a[1].setOnlyIconMode(z10);
    }
}
