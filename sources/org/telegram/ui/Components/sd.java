package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class sd extends FrameLayout {
    public ai.f0 f30758a;
    public qd f30759b;
    public boolean f30760c;

    public final void a(qd qdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f30759b == null) {
            this.f30759b = qdVar;
            qdVar.setVisibility(8);
            addView(qdVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f30758a == null) {
            this.f30758a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public qd getEditView() {
        return this.f30759b;
    }

    public View getReplyView() {
        return this.f30758a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f30760c = z10;
        ai.f0 f0Var = this.f30758a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        qd qdVar = this.f30759b;
        if (!z10) {
            i11 = 8;
        }
        qdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f30758a.setVisibility(0);
        }
        this.f30759b.f30192a[0].setOnlyIconMode(z10);
        this.f30759b.f30192a[1].setOnlyIconMode(z10);
    }
}
