package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class yc extends FrameLayout {
    public bi.e5 f40588a;
    public wc f40589b;
    public boolean f40590c;

    public final void a(wc wcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f40589b == null) {
            this.f40589b = wcVar;
            wcVar.setVisibility(8);
            addView(wcVar, layoutParams);
        }
    }

    public final void b(bi.e5 e5Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f40588a == null) {
            this.f40588a = e5Var;
            addView(e5Var, layoutParams);
        }
    }

    public wc getEditView() {
        return this.f40589b;
    }

    public View getReplyView() {
        return this.f40588a;
    }

    public void setEditMode(boolean z9) {
        int i7;
        this.f40590c = z9;
        bi.e5 e5Var = this.f40588a;
        int i10 = 0;
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        e5Var.setVisibility(i7);
        wc wcVar = this.f40589b;
        if (!z9) {
            i10 = 8;
        }
        wcVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z9) {
        setEditMode(z9);
        if (z9) {
            this.f40588a.setVisibility(0);
        }
        this.f40589b.f39944a[0].setOnlyIconMode(z9);
        this.f40589b.f39944a[1].setOnlyIconMode(z9);
    }
}
