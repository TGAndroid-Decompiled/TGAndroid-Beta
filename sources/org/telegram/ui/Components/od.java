package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f29159a;
    public md f29160b;
    public boolean f29161c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29160b == null) {
            this.f29160b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29159a == null) {
            this.f29159a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f29160b;
    }

    public View getReplyView() {
        return this.f29159a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29161c = z10;
        ah.x xVar = this.f29159a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f29160b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29159a.setVisibility(0);
        }
        this.f29160b.f28637a[0].setOnlyIconMode(z10);
        this.f29160b.f28637a[1].setOnlyIconMode(z10);
    }
}
