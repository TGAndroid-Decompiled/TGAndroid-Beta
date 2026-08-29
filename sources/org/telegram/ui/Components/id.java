package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class id extends FrameLayout {
    public bg.x2 f29373a;
    public gd f29374b;
    public boolean f29375c;

    public final void a(gd gdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29374b == null) {
            this.f29374b = gdVar;
            gdVar.setVisibility(8);
            addView(gdVar, layoutParams);
        }
    }

    public final void b(bg.x2 x2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f29373a == null) {
            this.f29373a = x2Var;
            addView(x2Var, layoutParams);
        }
    }

    public gd getEditView() {
        return this.f29374b;
    }

    public View getReplyView() {
        return this.f29373a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29375c = z10;
        bg.x2 x2Var = this.f29373a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        x2Var.setVisibility(i10);
        gd gdVar = this.f29374b;
        if (!z10) {
            i11 = 8;
        }
        gdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29373a.setVisibility(0);
        }
        this.f29374b.f28871a[0].setOnlyIconMode(z10);
        this.f29374b.f28871a[1].setOnlyIconMode(z10);
    }
}
