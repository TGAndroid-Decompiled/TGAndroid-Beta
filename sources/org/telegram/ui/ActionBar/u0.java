package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.zh;
public final class u0 {
    public final int f19566a;
    public int f19567b;
    public int f19568c;
    public Drawable d;
    public CharSequence e;
    public boolean f19569f;
    public View f19570g;
    public int h;
    public View f19571i;
    public zh f19572j;
    public int f19573k = 0;
    public int f19574l = 0;
    public Integer f19575m;
    public Integer f19576n;

    public u0(int i10) {
        this.f19566a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19575m;
        if (num == null || this.f19576n == null || num.intValue() != i10 || this.f19576n.intValue() != i11) {
            this.f19575m = Integer.valueOf(i10);
            this.f19576n = Integer.valueOf(i11);
            View view = this.f19571i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19568c) {
            this.f19568c = i10;
            View view = this.f19571i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f19572j = zhVar;
        View view = this.f19571i;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19571i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19573k = i10;
        View view = this.f19571i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
