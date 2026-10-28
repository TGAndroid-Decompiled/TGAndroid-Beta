package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public bh.r f31575a;
    public nd f31576b;
    public boolean f31577c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f31576b == null) {
            this.f31576b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(bh.r rVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f31575a == null) {
            this.f31575a = rVar;
            addView(rVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f31576b;
    }

    public View getReplyView() {
        return this.f31575a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f31577c = z10;
        bh.r rVar = this.f31575a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        rVar.setVisibility(i10);
        nd ndVar = this.f31576b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f31575a.setVisibility(0);
        }
        this.f31576b.f30866a[0].setOnlyIconMode(z10);
        this.f31576b.f30866a[1].setOnlyIconMode(z10);
    }
}
