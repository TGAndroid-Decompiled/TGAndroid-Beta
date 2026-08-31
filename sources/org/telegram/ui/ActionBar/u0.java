package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.qh;
public final class u0 {
    public final int f22296a;
    public int f22297b;
    public int f22298c;
    public Drawable d;
    public CharSequence f22299e;
    public boolean f22300f;
    public View f22301g;
    public int h;
    public View f22302i;
    public qh f22303j;
    public int f22304k = 0;
    public int f22305l = 0;
    public Integer f22306m;
    public Integer f22307n;

    public u0(int i10) {
        this.f22296a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f22306m;
        if (num == null || this.f22307n == null || num.intValue() != i10 || this.f22307n.intValue() != i11) {
            this.f22306m = Integer.valueOf(i10);
            this.f22307n = Integer.valueOf(i11);
            View view = this.f22302i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f22298c) {
            this.f22298c = i10;
            View view = this.f22302i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(qh qhVar) {
        this.f22303j = qhVar;
        View view = this.f22302i;
        if (view != null) {
            view.setOnClickListener(qhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f22299e = charSequence;
        View view = this.f22302i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f22304k = i10;
        View view = this.f22302i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
