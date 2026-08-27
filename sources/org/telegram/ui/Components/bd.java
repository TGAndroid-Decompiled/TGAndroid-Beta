package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

public abstract class bd extends FrameLayout {

    public ag.p1 f27067a;

    public zc f27068b;

    public boolean f27069c;

    public final void a(zc zcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f27068b == null) {
            this.f27068b = zcVar;
            zcVar.setVisibility(8);
            addView(zcVar, layoutParams);
        }
    }

    public final void b(ag.p1 p1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f27067a == null) {
            this.f27067a = p1Var;
            addView(p1Var, layoutParams);
        }
    }

    public zc getEditView() {
        return this.f27068b;
    }

    public View getReplyView() {
        return this.f27067a;
    }

    public void setEditMode(boolean z10) {
        this.f27069c = z10;
        this.f27067a.setVisibility(z10 ? 8 : 0);
        this.f27068b.setVisibility(z10 ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f27067a.setVisibility(0);
        }
        this.f27068b.f35221a[0].setOnlyIconMode(z10);
        this.f27068b.f35221a[1].setOnlyIconMode(z10);
    }
}
