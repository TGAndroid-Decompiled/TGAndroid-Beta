package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ai.f0 f27326a;
    public nd f27327b;
    public boolean f27328c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f27327b == null) {
            this.f27327b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f27326a == null) {
            this.f27326a = f0Var;
            addView(f0Var, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f27327b;
    }

    public View getReplyView() {
        return this.f27326a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f27328c = z10;
        ai.f0 f0Var = this.f27326a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        nd ndVar = this.f27327b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f27326a.setVisibility(0);
        }
        this.f27327b.f26751a[0].setOnlyIconMode(z10);
        this.f27327b.f26751a[1].setOnlyIconMode(z10);
    }
}
