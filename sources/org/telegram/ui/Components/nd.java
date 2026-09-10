package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class nd extends FrameLayout {
    public bi.ld f25489a;
    public ld f25490b;
    public boolean f25491c;

    public final void a(ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f25490b == null) {
            this.f25490b = ldVar;
            ldVar.setVisibility(8);
            addView(ldVar, layoutParams);
        }
    }

    public final void b(bi.ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f25489a == null) {
            this.f25489a = ldVar;
            addView(ldVar, layoutParams);
        }
    }

    public ld getEditView() {
        return this.f25490b;
    }

    public View getReplyView() {
        return this.f25489a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f25491c = z10;
        bi.ld ldVar = this.f25489a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        ldVar.setVisibility(i10);
        ld ldVar2 = this.f25490b;
        if (!z10) {
            i11 = 8;
        }
        ldVar2.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f25489a.setVisibility(0);
        }
        this.f25490b.f24964a[0].setOnlyIconMode(z10);
        this.f25490b.f24964a[1].setOnlyIconMode(z10);
    }
}
