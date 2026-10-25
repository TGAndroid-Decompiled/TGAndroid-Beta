package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class pd extends FrameLayout {
    public bh.r f31547a;
    public nd f31548b;
    public boolean f31549c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f31548b == null) {
            this.f31548b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(bh.r rVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f31547a == null) {
            this.f31547a = rVar;
            addView(rVar, layoutParams);
        }
    }

    public nd getEditView() {
        return this.f31548b;
    }

    public View getReplyView() {
        return this.f31547a;
    }

    public void setEditMode(boolean z10) {
        int i10;
        this.f31549c = z10;
        bh.r rVar = this.f31547a;
        int i11 = 0;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        rVar.setVisibility(i10);
        nd ndVar = this.f31548b;
        if (!z10) {
            i11 = 8;
        }
        ndVar.setVisibility(i11);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.f31547a.setVisibility(0);
        }
        this.f31548b.f30964a[0].setOnlyIconMode(z10);
        this.f31548b.f30964a[1].setOnlyIconMode(z10);
    }
}
