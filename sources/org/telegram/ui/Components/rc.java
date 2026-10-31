package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class rc extends FrameLayout {
    public jg.l0 f29895a;
    public pc f29896b;
    public boolean f29897c;

    public final void a(pc pcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29896b == null) {
            this.f29896b = pcVar;
            pcVar.setVisibility(8);
            addView(pcVar, layoutParams);
        }
    }

    public final void b(jg.l0 l0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f29895a == null) {
            this.f29895a = l0Var;
            addView(l0Var, layoutParams);
        }
    }

    public pc getEditView() {
        return this.f29896b;
    }

    public View getReplyView() {
        return this.f29895a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29897c = z10;
        jg.l0 l0Var = this.f29895a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        l0Var.setVisibility(i10);
        pc pcVar = this.f29896b;
        if (!z10) {
            i11 = 8;
        }
        pcVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29895a.setVisibility(0);
        }
        this.f29896b.f29339a[0].setOnlyIconMode(z10);
        this.f29896b.f29339a[1].setOnlyIconMode(z10);
    }
}
