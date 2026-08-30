package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.qh;
public final class u0 {
    public final int f20587a;
    public int f20588b;
    public int f20589c;
    public Drawable d;
    public CharSequence e;
    public boolean f20590f;
    public View f20591g;
    public int h;
    public View f20592i;
    public qh f20593j;
    public int f20594k = 0;
    public int f20595l = 0;
    public Integer f20596m;
    public Integer f20597n;

    public u0(int i10) {
        this.f20587a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20596m;
        if (num == null || this.f20597n == null || num.intValue() != i10 || this.f20597n.intValue() != i11) {
            this.f20596m = Integer.valueOf(i10);
            this.f20597n = Integer.valueOf(i11);
            View view = this.f20592i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20589c) {
            this.f20589c = i10;
            View view = this.f20592i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(qh qhVar) {
        this.f20593j = qhVar;
        View view = this.f20592i;
        if (view != null) {
            view.setOnClickListener(qhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20592i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20594k = i10;
        View view = this.f20592i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
