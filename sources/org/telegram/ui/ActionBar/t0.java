package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
public final class t0 {
    public final int f21504a;
    public int f21505b;
    public int f21506c;
    public Drawable d;
    public CharSequence f21507e;
    public boolean f21508f;
    public View f21509g;
    public int h;
    public View f21510i;
    public vh f21511j;
    public int f21512k = 0;
    public int f21513l = 0;
    public Integer f21514m;
    public Integer f21515n;

    public t0(int i10) {
        this.f21504a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21514m;
        if (num == null || this.f21515n == null || num.intValue() != i10 || this.f21515n.intValue() != i11) {
            this.f21514m = Integer.valueOf(i10);
            this.f21515n = Integer.valueOf(i11);
            View view = this.f21510i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21506c) {
            this.f21506c = i10;
            View view = this.f21510i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21511j = vhVar;
        View view = this.f21510i;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21507e = charSequence;
        View view = this.f21510i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21512k = i10;
        View view = this.f21510i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
