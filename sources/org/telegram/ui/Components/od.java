package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28938a;
    public md f28939b;
    public boolean f28940c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28939b == null) {
            this.f28939b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28938a == null) {
            this.f28938a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f28939b;
    }

    public View getReplyView() {
        return this.f28938a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28940c = z10;
        ah.x xVar = this.f28938a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f28939b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28938a.setVisibility(0);
        }
        this.f28939b.f28511a[0].setOnlyIconMode(z10);
        this.f28939b.f28511a[1].setOnlyIconMode(z10);
    }
}
