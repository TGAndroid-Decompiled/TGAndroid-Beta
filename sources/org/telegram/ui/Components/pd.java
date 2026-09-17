package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public ah.y f29378a;
    public nd f29379b;
    public boolean f29380c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29379b == null) {
            this.f29379b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ah.y yVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f29378a == null) {
            this.f29378a = yVar;
            addView(yVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f29379b;
    }

    public View getReplyView() {
        return this.f29378a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f29380c = z10;
        ah.y yVar = this.f29378a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        yVar.setVisibility(i10);
        nd ndVar = this.f29379b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f29378a.setVisibility(0);
        }
        this.f29379b.f28759a[0].setOnlyIconMode(z10);
        this.f29379b.f28759a[1].setOnlyIconMode(z10);
    }
}
