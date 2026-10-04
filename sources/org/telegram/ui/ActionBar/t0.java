package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
public final class t0 {
    public final int f21505a;
    public int f21506b;
    public int f21507c;
    public Drawable d;
    public CharSequence f21508e;
    public boolean f21509f;
    public View f21510g;
    public int h;
    public View f21511i;
    public vh f21512j;
    public int f21513k = 0;
    public int f21514l = 0;
    public Integer f21515m;
    public Integer f21516n;

    public t0(int i10) {
        this.f21505a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21515m;
        if (num == null || this.f21516n == null || num.intValue() != i10 || this.f21516n.intValue() != i11) {
            this.f21515m = Integer.valueOf(i10);
            this.f21516n = Integer.valueOf(i11);
            View view = this.f21511i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21507c) {
            this.f21507c = i10;
            View view = this.f21511i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21512j = vhVar;
        View view = this.f21511i;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21508e = charSequence;
        View view = this.f21511i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21513k = i10;
        View view = this.f21511i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
