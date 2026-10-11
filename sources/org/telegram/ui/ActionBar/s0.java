package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
import org.telegram.ui.xh;
public final class s0 {
    public final int f21504a;
    public int f21505b;
    public int f21506c;
    public Drawable d;
    public CharSequence f21507e;
    public boolean f21508f;
    public View f21509g;
    public xh h;
    public int f21510i;
    public View f21511j;
    public vh f21512k;
    public int f21513l = 0;
    public int f21514m = 0;
    public Integer f21515n;
    public Integer f21516o;

    public s0(int i10) {
        this.f21504a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21515n;
        if (num == null || this.f21516o == null || num.intValue() != i10 || this.f21516o.intValue() != i11) {
            this.f21515n = Integer.valueOf(i10);
            this.f21516o = Integer.valueOf(i11);
            View view = this.f21511j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21506c) {
            this.f21506c = i10;
            View view = this.f21511j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21512k = vhVar;
        View view = this.f21511j;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21507e = charSequence;
        View view = this.f21511j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21513l = i10;
        View view = this.f21511j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
