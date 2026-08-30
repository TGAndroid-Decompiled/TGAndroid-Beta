package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class fd extends FrameLayout {
    public dg.u2 f24851a;
    public dd f24852b;
    public boolean f24853c;

    public final void a(dd ddVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f24852b == null) {
            this.f24852b = ddVar;
            ddVar.setVisibility(8);
            addView(ddVar, layoutParams);
        }
    }

    public final void b(dg.u2 u2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f24851a == null) {
            this.f24851a = u2Var;
            addView(u2Var, layoutParams);
        }
    }

    public dd getEditView() {
        return this.f24852b;
    }

    public View getReplyView() {
        return this.f24851a;
    }

    public void setEditMode(boolean z4) {
        int i10;
        this.f24853c = z4;
        dg.u2 u2Var = this.f24851a;
        int i11 = 0;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        u2Var.setVisibility(i10);
        dd ddVar = this.f24852b;
        if (!z4) {
            i11 = 8;
        }
        ddVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z4) {
        setEditMode(z4);
        if (z4) {
            this.f24851a.setVisibility(0);
        }
        this.f24852b.f24256a[0].setOnlyIconMode(z4);
        this.f24852b.f24256a[1].setOnlyIconMode(z4);
    }
}
