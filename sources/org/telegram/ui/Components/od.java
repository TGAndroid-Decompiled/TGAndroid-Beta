package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28959a;
    public md f28960b;
    public boolean f28961c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28960b == null) {
            this.f28960b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28959a == null) {
            this.f28959a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f28960b;
    }

    public View getReplyView() {
        return this.f28959a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28961c = z10;
        ah.x xVar = this.f28959a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f28960b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28959a.setVisibility(0);
        }
        this.f28960b.f28519a[0].setOnlyIconMode(z10);
        this.f28960b.f28519a[1].setOnlyIconMode(z10);
    }
}
