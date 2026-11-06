package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public abstract class yc extends FrameLayout {
    public bi.e5 f40607a;
    public wc f40608b;
    public boolean f40609c;

    public final void a(wc wcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.f40608b == null) {
            this.f40608b = wcVar;
            wcVar.setVisibility(8);
            addView(wcVar, layoutParams);
        }
    }

    public final void b(bi.e5 e5Var, FrameLayout.LayoutParams layoutParams) {
        if (this.f40607a == null) {
            this.f40607a = e5Var;
            addView(e5Var, layoutParams);
        }
    }

    public wc getEditView() {
        return this.f40608b;
    }

    public View getReplyView() {
        return this.f40607a;
    }

    public void setEditMode(boolean z9) {
        int i7;
        this.f40609c = z9;
        bi.e5 e5Var = this.f40607a;
        int i10 = 0;
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        e5Var.setVisibility(i7);
        wc wcVar = this.f40608b;
        if (!z9) {
            i10 = 8;
        }
        wcVar.setVisibility(i10);
    }

    public void setEditSuggestionMode(boolean z9) {
        setEditMode(z9);
        if (z9) {
            this.f40607a.setVisibility(0);
        }
        this.f40608b.f39951a[0].setOnlyIconMode(z9);
        this.f40608b.f39951a[1].setOnlyIconMode(z9);
    }
}
