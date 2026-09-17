package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ah.y f29351a;
    public nd f29352b;
    public boolean f29353c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29352b == null) {
            this.f29352b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ah.y yVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29351a == null) {
            this.f29351a = yVar;
            addView(yVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f29352b;
    }

    public View getReplyView() {
        return this.f29351a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29353c = z10;
        ah.y yVar = this.f29351a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        yVar.setVisibility(i10);
        nd ndVar = this.f29352b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29351a.setVisibility(0);
        }
        this.f29352b.f28732a[0].setOnlyIconMode(z10);
        this.f29352b.f28732a[1].setOnlyIconMode(z10);
    }
}
