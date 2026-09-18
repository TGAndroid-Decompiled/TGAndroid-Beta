package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ai.f0 f26915a;
    public md f26916b;
    public boolean f26917c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f26916b == null) {
            this.f26916b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f26915a == null) {
            this.f26915a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public md getEditView() {
        return this.f26916b;
    }

    public View getReplyView() {
        return this.f26915a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f26917c = z10;
        ai.f0 f0Var = this.f26915a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        md mdVar = this.f26916b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f26915a.setVisibility(0);
        }
        this.f26916b.f26399a[0].setOnlyIconMode(z10);
        this.f26916b.f26399a[1].setOnlyIconMode(z10);
    }
}
