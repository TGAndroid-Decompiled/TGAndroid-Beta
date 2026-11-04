package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class wc extends FrameLayout {
    public ai.o2 f39984a;
    public uc f39985b;
    public boolean f39986c;

    public final void a(uc ucVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f39985b == null) {
            this.f39985b = ucVar;
            ucVar.setVisibility(8);
            addView(ucVar, layoutParams);
        }
    }

    public final void b(ai.o2 o2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f39984a == null) {
            this.f39984a = o2Var;
            addView(o2Var, layoutParams);
        }
    }

    public uc getEditView() {
        return this.f39985b;
    }

    public View getReplyView() {
        return this.f39984a;
    }

    public void setEditMode(boolean z10) {
        int i3;
        this.f39986c = z10;
        ai.o2 o2Var = this.f39984a;
        int i10 = 0;
        if (z10) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        o2Var.setVisibility(i3);
        uc ucVar = this.f39985b;
        if (!z10) {
            i10 = 8;
        }
        ucVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f39984a.setVisibility(0);
        }
        this.f39985b.f38718a[0].setOnlyIconMode(z10);
        this.f39985b.f38718a[1].setOnlyIconMode(z10);
    }
}
