package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class o0 {
    public final int f29797a;
    public int f29798b;
    public int f29799c;
    public Drawable d;
    public CharSequence f29800e;
    public boolean f29801f;
    public View f29802g;
    public eh h;
    public int f29803i;
    public View f29804j;
    public ch f29805k;
    public int f29806l = 0;
    public int f29807m = 0;
    public Integer f29808n;
    public Integer f29809o;

    public o0(int i7) {
        this.f29797a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29808n;
        if (num == null || this.f29809o == null || num.intValue() != i7 || this.f29809o.intValue() != i10) {
            this.f29808n = Integer.valueOf(i7);
            this.f29809o = Integer.valueOf(i10);
            View view = this.f29804j;
            if (view instanceof y0) {
                ((y0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29799c) {
            this.f29799c = i7;
            View view = this.f29804j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29805k = chVar;
        View view = this.f29804j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29800e = charSequence;
        View view = this.f29804j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29806l = i7;
        View view = this.f29804j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
