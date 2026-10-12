package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class qd extends FrameLayout {
    public ah.x f28582a;
    public od f28583b;
    public boolean f28584c;

    public final void a(od odVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28583b == null) {
            this.f28583b = odVar;
            odVar.setVisibility(8);
            addView(odVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28582a == null) {
            this.f28582a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public od getEditView() {
        return this.f28583b;
    }

    public View getReplyView() {
        return this.f28582a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28584c = z10;
        ah.x xVar = this.f28582a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        od odVar = this.f28583b;
        if (!z10) {
            i11 = 8;
        }
        odVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28582a.setVisibility(0);
        }
        this.f28583b.f27940a[0].setOnlyIconMode(z10);
        this.f28583b.f27940a[1].setOnlyIconMode(z10);
    }
}
