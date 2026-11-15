package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class tc extends FrameLayout {
    public bi.g2 f39632a;
    public rc f39633b;
    public boolean f39634c;

    public final void a(rc rcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f39633b == null) {
            this.f39633b = rcVar;
            rcVar.setVisibility(8);
            addView(rcVar, layoutParams);
        }
    }

    public final void b(bi.g2 g2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f39632a == null) {
            this.f39632a = g2Var;
            addView(g2Var, layoutParams);
        }
    }

    public rc getEditView() {
        return this.f39633b;
    }

    public View getReplyView() {
        return this.f39632a;
    }

    public void setEditMode(boolean z10) {
        int i7;
        this.f39634c = z10;
        bi.g2 g2Var = this.f39632a;
        int i10 = 0;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        g2Var.setVisibility(i7);
        rc rcVar = this.f39633b;
        if (!z10) {
            i10 = 8;
        }
        rcVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f39632a.setVisibility(0);
        }
        this.f39633b.f38942a[0].setOnlyIconMode(z10);
        this.f39633b.f38942a[1].setOnlyIconMode(z10);
    }
}
