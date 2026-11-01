package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class rc extends FrameLayout {
    public jg.l0 f29973a;
    public pc f29974b;
    public boolean f29975c;

    public final void a(pc pcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29974b == null) {
            this.f29974b = pcVar;
            pcVar.setVisibility(8);
            addView(pcVar, layoutParams);
        }
    }

    public final void b(jg.l0 l0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f29973a == null) {
            this.f29973a = l0Var;
            addView(l0Var, layoutParams);
        }
    }

    public pc getEditView() {
        return this.f29974b;
    }

    public View getReplyView() {
        return this.f29973a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29975c = z10;
        jg.l0 l0Var = this.f29973a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        l0Var.setVisibility(i10);
        pc pcVar = this.f29974b;
        if (!z10) {
            i11 = 8;
        }
        pcVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29973a.setVisibility(0);
        }
        this.f29974b.f29404a[0].setOnlyIconMode(z10);
        this.f29974b.f29404a[1].setOnlyIconMode(z10);
    }
}
