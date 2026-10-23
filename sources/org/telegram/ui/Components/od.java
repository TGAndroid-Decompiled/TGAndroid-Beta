package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f29000a;
    public md f29001b;
    public boolean f29002c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29001b == null) {
            this.f29001b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29000a == null) {
            this.f29000a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f29001b;
    }

    public View getReplyView() {
        return this.f29000a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29002c = z10;
        ah.x xVar = this.f29000a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f29001b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29000a.setVisibility(0);
        }
        this.f29001b.f28492a[0].setOnlyIconMode(z10);
        this.f29001b.f28492a[1].setOnlyIconMode(z10);
    }
}
