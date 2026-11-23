package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.dh;
import org.telegram.ui.fh;
public final class o0 {
    public final int f29877a;
    public int f29878b;
    public int f29879c;
    public Drawable d;
    public CharSequence f29880e;
    public boolean f29881f;
    public View f29882g;
    public fh h;
    public int f29883i;
    public View f29884j;
    public dh f29885k;
    public int f29886l = 0;
    public int f29887m = 0;
    public Integer f29888n;
    public Integer f29889o;

    public o0(int i7) {
        this.f29877a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29888n;
        if (num == null || this.f29889o == null || num.intValue() != i7 || this.f29889o.intValue() != i10) {
            this.f29888n = Integer.valueOf(i7);
            this.f29889o = Integer.valueOf(i10);
            View view = this.f29884j;
            if (view instanceof y0) {
                ((y0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29879c) {
            this.f29879c = i7;
            View view = this.f29884j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i7);
            }
        }
    }

    public final void c(dh dhVar) {
        this.f29885k = dhVar;
        View view = this.f29884j;
        if (view != null) {
            view.setOnClickListener(dhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29880e = charSequence;
        View view = this.f29884j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29886l = i7;
        View view = this.f29884j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
