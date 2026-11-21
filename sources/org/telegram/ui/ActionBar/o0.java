package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.fh;
public final class o0 {
    public final int f29828a;
    public int f29829b;
    public int f29830c;
    public Drawable d;
    public CharSequence f29831e;
    public boolean f29832f;
    public View f29833g;
    public fh h;
    public int f29834i;
    public View f29835j;
    public ch f29836k;
    public int f29837l = 0;
    public int f29838m = 0;
    public Integer f29839n;
    public Integer f29840o;

    public o0(int i7) {
        this.f29828a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29839n;
        if (num == null || this.f29840o == null || num.intValue() != i7 || this.f29840o.intValue() != i10) {
            this.f29839n = Integer.valueOf(i7);
            this.f29840o = Integer.valueOf(i10);
            View view = this.f29835j;
            if (view instanceof y0) {
                ((y0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29830c) {
            this.f29830c = i7;
            View view = this.f29835j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29836k = chVar;
        View view = this.f29835j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29831e = charSequence;
        View view = this.f29835j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29837l = i7;
        View view = this.f29835j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
