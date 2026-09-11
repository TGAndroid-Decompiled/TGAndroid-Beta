package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ah.y f29350a;
    public nd f29351b;
    public boolean f29352c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29351b == null) {
            this.f29351b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ah.y yVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29350a == null) {
            this.f29350a = yVar;
            addView(yVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f29351b;
    }

    public View getReplyView() {
        return this.f29350a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29352c = z10;
        ah.y yVar = this.f29350a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        yVar.setVisibility(i10);
        nd ndVar = this.f29351b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29350a.setVisibility(0);
        }
        this.f29351b.f28731a[0].setOnlyIconMode(z10);
        this.f29351b.f28731a[1].setOnlyIconMode(z10);
    }
}
