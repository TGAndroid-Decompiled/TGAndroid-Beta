package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.qh;
public final class u0 {
    public final int f22298a;
    public int f22299b;
    public int f22300c;
    public Drawable d;
    public CharSequence f22301e;
    public boolean f22302f;
    public View f22303g;
    public int h;
    public View f22304i;
    public qh f22305j;
    public int f22306k = 0;
    public int f22307l = 0;
    public Integer f22308m;
    public Integer f22309n;

    public u0(int i10) {
        this.f22298a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f22308m;
        if (num == null || this.f22309n == null || num.intValue() != i10 || this.f22309n.intValue() != i11) {
            this.f22308m = Integer.valueOf(i10);
            this.f22309n = Integer.valueOf(i11);
            View view = this.f22304i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f22300c) {
            this.f22300c = i10;
            View view = this.f22304i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(qh qhVar) {
        this.f22305j = qhVar;
        View view = this.f22304i;
        if (view != null) {
            view.setOnClickListener(qhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f22301e = charSequence;
        View view = this.f22304i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f22306k = i10;
        View view = this.f22304i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
