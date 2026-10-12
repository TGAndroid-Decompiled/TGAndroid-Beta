package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class sd extends FrameLayout {
    public ai.f0 f30553a;
    public qd f30554b;
    public boolean f30555c;

    public final void a(qd qdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f30554b == null) {
            this.f30554b = qdVar;
            qdVar.setVisibility(8);
            addView(qdVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f30553a == null) {
            this.f30553a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public qd getEditView() {
        return this.f30554b;
    }

    public View getReplyView() {
        return this.f30553a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f30555c = z10;
        ai.f0 f0Var = this.f30553a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        qd qdVar = this.f30554b;
        if (!z10) {
            i11 = 8;
        }
        qdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f30553a.setVisibility(0);
        }
        this.f30554b.f29820a[0].setOnlyIconMode(z10);
        this.f30554b.f29820a[1].setOnlyIconMode(z10);
    }
}
