package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class p0 {
    public final int f28350a;
    public int f28351b;
    public int f28352c;
    public Drawable d;
    public CharSequence f28353e;
    public boolean f28354f;
    public View f28355g;
    public eh h;
    public int f28356i;
    public View f28357j;
    public ch f28358k;
    public int f28359l = 0;
    public int f28360m = 0;
    public Integer f28361n;
    public Integer f28362o;

    public p0(int i7) {
        this.f28350a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f28361n;
        if (num == null || this.f28362o == null || num.intValue() != i7 || this.f28362o.intValue() != i10) {
            this.f28361n = Integer.valueOf(i7);
            this.f28362o = Integer.valueOf(i10);
            View view = this.f28357j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f28352c) {
            this.f28352c = i7;
            View view = this.f28357j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f28358k = chVar;
        View view = this.f28357j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28353e = charSequence;
        View view = this.f28357j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f28359l = i7;
        View view = this.f28357j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
