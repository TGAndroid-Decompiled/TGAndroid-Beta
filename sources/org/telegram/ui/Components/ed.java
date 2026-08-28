package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class ed extends FrameLayout {
    public fh.d2 f28003a;
    public cd f28004b;
    public boolean f28005c;

    public final void a(cd cdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28004b == null) {
            this.f28004b = cdVar;
            cdVar.setVisibility(8);
            addView(cdVar, layoutParams);
        }
    }

    public final void b(fh.d2 d2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f28003a == null) {
            this.f28003a = d2Var;
            addView(d2Var, layoutParams);
        }
    }

    public cd getEditView() {
        return this.f28004b;
    }

    public View getReplyView() {
        return this.f28003a;
    }

    public void setEditMode(boolean z10) {
        int i9;
        this.f28005c = z10;
        fh.d2 d2Var = this.f28003a;
        int i10 = 0;
        if (z10) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        d2Var.setVisibility(i9);
        cd cdVar = this.f28004b;
        if (!z10) {
            i10 = 8;
        }
        cdVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28003a.setVisibility(0);
        }
        this.f28004b.f27468a[0].setOnlyIconMode(z10);
        this.f28004b.f27468a[1].setOnlyIconMode(z10);
    }
}
