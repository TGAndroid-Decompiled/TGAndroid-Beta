package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.lh;
public final class u0 {
    public final int f23802a;
    public int f23803b;
    public int f23804c;
    public Drawable d;
    public CharSequence f23805e;
    public boolean f23806f;
    public View f23807g;
    public int h;
    public View f23808i;
    public lh f23809j;
    public int f23810k = 0;
    public int f23811l = 0;
    public Integer f23812m;
    public Integer f23813n;

    public u0(int i9) {
        this.f23802a = i9;
    }

    public final void a(int i9, int i10) {
        Integer num = this.f23812m;
        if (num == null || this.f23813n == null || num.intValue() != i9 || this.f23813n.intValue() != i10) {
            this.f23812m = Integer.valueOf(i9);
            this.f23813n = Integer.valueOf(i10);
            View view = this.f23808i;
            if (view instanceof g1) {
                ((g1) view).c(i9, i10);
            }
        }
    }

    public final void b(int i9) {
        if (i9 != this.f23804c) {
            this.f23804c = i9;
            View view = this.f23808i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i9);
            }
        }
    }

    public final void c(lh lhVar) {
        this.f23809j = lhVar;
        View view = this.f23808i;
        if (view != null) {
            view.setOnClickListener(lhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f23805e = charSequence;
        View view = this.f23808i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i9) {
        this.f23810k = i9;
        View view = this.f23808i;
        if (view != null) {
            view.setVisibility(i9);
        }
    }
}
