package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class qd extends FrameLayout {
    public ai.f0 f30025a;
    public od f30026b;
    public boolean f30027c;

    public final void a(od odVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f30026b == null) {
            this.f30026b = odVar;
            odVar.setVisibility(8);
            addView(odVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f30025a == null) {
            this.f30025a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public od getEditView() {
        return this.f30026b;
    }

    public View getReplyView() {
        return this.f30025a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f30027c = z10;
        ai.f0 f0Var = this.f30025a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        od odVar = this.f30026b;
        if (!z10) {
            i11 = 8;
        }
        odVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f30025a.setVisibility(0);
        }
        this.f30026b.f29444a[0].setOnlyIconMode(z10);
        this.f30026b.f29444a[1].setOnlyIconMode(z10);
    }
}
