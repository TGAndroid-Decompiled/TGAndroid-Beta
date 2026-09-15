package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f19538a;
    public int f19539b;
    public int f19540c;
    public Drawable d;
    public CharSequence e;
    public boolean f19541f;
    public View f19542g;
    public int h;
    public View f19543i;
    public xh f19544j;
    public int f19545k = 0;
    public int f19546l = 0;
    public Integer f19547m;
    public Integer f19548n;

    public t0(int i10) {
        this.f19538a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19547m;
        if (num == null || this.f19548n == null || num.intValue() != i10 || this.f19548n.intValue() != i11) {
            this.f19547m = Integer.valueOf(i10);
            this.f19548n = Integer.valueOf(i11);
            View view = this.f19543i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19540c) {
            this.f19540c = i10;
            View view = this.f19543i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f19544j = xhVar;
        View view = this.f19543i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19543i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19545k = i10;
        View view = this.f19543i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
