package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class xc extends FrameLayout {
    public bi.e5 f40284a;
    public vc f40285b;
    public boolean f40286c;

    public final void a(vc vcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f40285b == null) {
            this.f40285b = vcVar;
            vcVar.setVisibility(8);
            addView(vcVar, layoutParams);
        }
    }

    public final void b(bi.e5 e5Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f40284a == null) {
            this.f40284a = e5Var;
            addView(e5Var, layoutParams);
        }
    }

    public vc getEditView() {
        return this.f40285b;
    }

    public View getReplyView() {
        return this.f40284a;
    }

    public void setEditMode(boolean z9) {
        int i7;
        this.f40286c = z9;
        bi.e5 e5Var = this.f40284a;
        int i10 = 0;
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        e5Var.setVisibility(i7);
        vc vcVar = this.f40285b;
        if (!z9) {
            i10 = 8;
        }
        vcVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z9) {
        setEditMode(z9);
        if (z9) {
            this.f40284a.setVisibility(0);
        }
        this.f40285b.f38984a[0].setOnlyIconMode(z9);
        this.f40285b.f38984a[1].setOnlyIconMode(z9);
    }
}
