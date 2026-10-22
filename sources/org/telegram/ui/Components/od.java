package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28999a;
    public md f29000b;
    public boolean f29001c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29000b == null) {
            this.f29000b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28999a == null) {
            this.f28999a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f29000b;
    }

    public View getReplyView() {
        return this.f28999a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29001c = z10;
        ah.x xVar = this.f28999a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f29000b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28999a.setVisibility(0);
        }
        this.f29000b.f28491a[0].setOnlyIconMode(z10);
        this.f29000b.f28491a[1].setOnlyIconMode(z10);
    }
}
