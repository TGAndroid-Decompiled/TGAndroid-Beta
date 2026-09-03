package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class fd extends FrameLayout {
    public dg.u2 f24861a;
    public dd f24862b;
    public boolean f24863c;

    public final void a(dd ddVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f24862b == null) {
            this.f24862b = ddVar;
            ddVar.setVisibility(8);
            addView(ddVar, layoutParams);
        }
    }

    public final void b(dg.u2 u2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f24861a == null) {
            this.f24861a = u2Var;
            addView(u2Var, layoutParams);
        }
    }

    public dd getEditView() {
        return this.f24862b;
    }

    public View getReplyView() {
        return this.f24861a;
    }

    public void setEditMode(boolean z4) {
        int i10;
        this.f24863c = z4;
        dg.u2 u2Var = this.f24861a;
        int i11 = 0;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        u2Var.setVisibility(i10);
        dd ddVar = this.f24862b;
        if (!z4) {
            i11 = 8;
        }
        ddVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z4) {
        setEditMode(z4);
        if (z4) {
            this.f24861a.setVisibility(0);
        }
        this.f24862b.f24247a[0].setOnlyIconMode(z4);
        this.f24862b.f24247a[1].setOnlyIconMode(z4);
    }
}
