package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28996a;
    public md f28997b;
    public boolean f28998c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28997b == null) {
            this.f28997b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28996a == null) {
            this.f28996a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f28997b;
    }

    public View getReplyView() {
        return this.f28996a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28998c = z10;
        ah.x xVar = this.f28996a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f28997b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28996a.setVisibility(0);
        }
        this.f28997b.f28488a[0].setOnlyIconMode(z10);
        this.f28997b.f28488a[1].setOnlyIconMode(z10);
    }
}
