package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class sd extends FrameLayout {
    public ai.f0 f30848a;
    public qd f30849b;
    public boolean f30850c;

    public final void a(qd qdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f30849b == null) {
            this.f30849b = qdVar;
            qdVar.setVisibility(8);
            addView(qdVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f30848a == null) {
            this.f30848a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public qd getEditView() {
        return this.f30849b;
    }

    public View getReplyView() {
        return this.f30848a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f30850c = z10;
        ai.f0 f0Var = this.f30848a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        qd qdVar = this.f30849b;
        if (!z10) {
            i11 = 8;
        }
        qdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f30848a.setVisibility(0);
        }
        this.f30849b.f30232a[0].setOnlyIconMode(z10);
        this.f30849b.f30232a[1].setOnlyIconMode(z10);
    }
}
