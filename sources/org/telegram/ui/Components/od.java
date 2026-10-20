package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28995a;
    public md f28996b;
    public boolean f28997c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28996b == null) {
            this.f28996b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28995a == null) {
            this.f28995a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f28996b;
    }

    public View getReplyView() {
        return this.f28995a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28997c = z10;
        ah.x xVar = this.f28995a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f28996b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28995a.setVisibility(0);
        }
        this.f28996b.f28488a[0].setOnlyIconMode(z10);
        this.f28996b.f28488a[1].setOnlyIconMode(z10);
    }
}
