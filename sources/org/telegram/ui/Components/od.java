package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class od extends FrameLayout {
    public ah.x f28931a;
    public md f28932b;
    public boolean f28933c;

    public final void a(md mdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28932b == null) {
            this.f28932b = mdVar;
            mdVar.setVisibility(8);
            addView(mdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28931a == null) {
            this.f28931a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public md getEditView() {
        return this.f28932b;
    }

    public View getReplyView() {
        return this.f28931a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28933c = z10;
        ah.x xVar = this.f28931a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        md mdVar = this.f28932b;
        if (!z10) {
            i11 = 8;
        }
        mdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28931a.setVisibility(0);
        }
        this.f28932b.f28504a[0].setOnlyIconMode(z10);
        this.f28932b.f28504a[1].setOnlyIconMode(z10);
    }
}
