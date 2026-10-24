package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class md extends FrameLayout {
    public ah.x f28581a;
    public kd f28582b;
    public boolean f28583c;

    public final void a(kd kdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28582b == null) {
            this.f28582b = kdVar;
            kdVar.setVisibility(8);
            addView(kdVar, layoutParams);
        }
    }

    public final void b(ah.x xVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f28581a == null) {
            this.f28581a = xVar;
            addView(xVar, layoutParams);
        }
    }

    public kd getEditView() {
        return this.f28582b;
    }

    public View getReplyView() {
        return this.f28581a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f28583c = z10;
        ah.x xVar = this.f28581a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        xVar.setVisibility(i10);
        kd kdVar = this.f28582b;
        if (!z10) {
            i11 = 8;
        }
        kdVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f28581a.setVisibility(0);
        }
        this.f28582b.f28006a[0].setOnlyIconMode(z10);
        this.f28582b.f28006a[1].setOnlyIconMode(z10);
    }
}
