package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21362a;
    public int f21363b;
    public int f21364c;
    public Drawable d;
    public CharSequence f21365e;
    public boolean f21366f;
    public View f21367g;
    public int h;
    public View f21368i;
    public xh f21369j;
    public int f21370k = 0;
    public int f21371l = 0;
    public Integer f21372m;
    public Integer f21373n;

    public t0(int i10) {
        this.f21362a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21372m;
        if (num == null || this.f21373n == null || num.intValue() != i10 || this.f21373n.intValue() != i11) {
            this.f21372m = Integer.valueOf(i10);
            this.f21373n = Integer.valueOf(i11);
            View view = this.f21368i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21364c) {
            this.f21364c = i10;
            View view = this.f21368i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f21369j = xhVar;
        View view = this.f21368i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21365e = charSequence;
        View view = this.f21368i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21370k = i10;
        View view = this.f21368i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
