package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class qd extends FrameLayout {
    public ai.f0 f29998a;
    public od f29999b;
    public boolean f30000c;

    public final void a(od odVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29999b == null) {
            this.f29999b = odVar;
            odVar.setVisibility(8);
            addView(odVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f29998a == null) {
            this.f29998a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public od getEditView() {
        return this.f29999b;
    }

    public View getReplyView() {
        return this.f29998a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f30000c = z10;
        ai.f0 f0Var = this.f29998a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        od odVar = this.f29999b;
        if (!z10) {
            i11 = 8;
        }
        odVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29998a.setVisibility(0);
        }
        this.f29999b.f29339a[0].setOnlyIconMode(z10);
        this.f29999b.f29339a[1].setOnlyIconMode(z10);
    }
}
