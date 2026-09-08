package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21361a;
    public int f21362b;
    public int f21363c;
    public Drawable d;
    public CharSequence f21364e;
    public boolean f21365f;
    public View f21366g;
    public int h;
    public View f21367i;
    public xh f21368j;
    public int f21369k = 0;
    public int f21370l = 0;
    public Integer f21371m;
    public Integer f21372n;

    public t0(int i10) {
        this.f21361a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21371m;
        if (num == null || this.f21372n == null || num.intValue() != i10 || this.f21372n.intValue() != i11) {
            this.f21371m = Integer.valueOf(i10);
            this.f21372n = Integer.valueOf(i11);
            View view = this.f21367i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21363c) {
            this.f21363c = i10;
            View view = this.f21367i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f21368j = xhVar;
        View view = this.f21367i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21364e = charSequence;
        View view = this.f21367i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21369k = i10;
        View view = this.f21367i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
