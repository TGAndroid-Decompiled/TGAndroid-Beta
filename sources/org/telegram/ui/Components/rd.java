package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class rd extends FrameLayout {
    public ai.f0 f27961a;
    public pd f27962b;
    public boolean f27963c;

    public final void a(pd pdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f27962b == null) {
            this.f27962b = pdVar;
            pdVar.setVisibility(8);
            addView(pdVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f27961a == null) {
            this.f27961a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public pd getEditView() {
        return this.f27962b;
    }

    public View getReplyView() {
        return this.f27961a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f27963c = z10;
        ai.f0 f0Var = this.f27961a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        pd pdVar = this.f27962b;
        if (!z10) {
            i11 = 8;
        }
        pdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f27961a.setVisibility(0);
        }
        this.f27962b.f27337a[0].setOnlyIconMode(z10);
        this.f27962b.f27337a[1].setOnlyIconMode(z10);
    }
}
