package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class fd extends FrameLayout {
    public eg.s2 f26893a;
    public dd f26894b;
    public boolean f26895c;

    public final void a(dd ddVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f26894b == null) {
            this.f26894b = ddVar;
            ddVar.setVisibility(8);
            addView(ddVar, layoutParams);
        }
    }

    public final void b(eg.s2 s2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f26893a == null) {
            this.f26893a = s2Var;
            addView(s2Var, layoutParams);
        }
    }

    public dd getEditView() {
        return this.f26894b;
    }

    public View getReplyView() {
        return this.f26893a;
    }

    public void setEditMode(boolean z4) {
        int i10;
        this.f26895c = z4;
        eg.s2 s2Var = this.f26893a;
        int i11 = 0;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        s2Var.setVisibility(i10);
        dd ddVar = this.f26894b;
        if (!z4) {
            i11 = 8;
        }
        ddVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z4) {
        setEditMode(z4);
        if (z4) {
            this.f26893a.setVisibility(0);
        }
        this.f26894b.f26259a[0].setOnlyIconMode(z4);
        this.f26894b.f26259a[1].setOnlyIconMode(z4);
    }
}
