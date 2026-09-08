package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ah.y f29377a;
    public nd f29378b;
    public boolean f29379c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29378b == null) {
            this.f29378b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ah.y yVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29377a == null) {
            this.f29377a = yVar;
            addView(yVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f29378b;
    }

    public View getReplyView() {
        return this.f29377a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29379c = z10;
        ah.y yVar = this.f29377a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        yVar.setVisibility(i10);
        nd ndVar = this.f29378b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29377a.setVisibility(0);
        }
        this.f29378b.f28758a[0].setOnlyIconMode(z10);
        this.f29378b.f28758a[1].setOnlyIconMode(z10);
    }
}
