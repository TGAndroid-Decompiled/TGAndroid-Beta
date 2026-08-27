package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.nh;

public final class t0 {

    public final int f23768a;

    public int f23769b;

    public int f23770c;
    public Drawable d;

    public CharSequence f23771e;

    public boolean f23772f;

    public View f23773g;
    public int h;

    public View f23774i;

    public nh f23775j;

    public int f23776k = 0;

    public int f23777l = 0;

    public Integer f23778m;

    public Integer f23779n;

    public t0(int i10) {
        this.f23768a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f23778m;
        if (num == null || this.f23779n == null || num.intValue() != i10 || this.f23779n.intValue() != i11) {
            this.f23778m = Integer.valueOf(i10);
            this.f23779n = Integer.valueOf(i11);
            View view = this.f23774i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f23770c) {
            this.f23770c = i10;
            View view = this.f23774i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(nh nhVar) {
        this.f23775j = nhVar;
        View view = this.f23774i;
        if (view != null) {
            view.setOnClickListener(nhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f23771e = charSequence;
        View view = this.f23774i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f23776k = i10;
        View view = this.f23774i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
