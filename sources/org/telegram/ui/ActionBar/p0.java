package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class p0 {
    public final int f28353a;
    public int f28354b;
    public int f28355c;
    public Drawable d;
    public CharSequence f28356e;
    public boolean f28357f;
    public View f28358g;
    public eh h;
    public int f28359i;
    public View f28360j;
    public ch f28361k;
    public int f28362l = 0;
    public int f28363m = 0;
    public Integer f28364n;
    public Integer f28365o;

    public p0(int i7) {
        this.f28353a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f28364n;
        if (num == null || this.f28365o == null || num.intValue() != i7 || this.f28365o.intValue() != i10) {
            this.f28364n = Integer.valueOf(i7);
            this.f28365o = Integer.valueOf(i10);
            View view = this.f28360j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f28355c) {
            this.f28355c = i7;
            View view = this.f28360j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f28361k = chVar;
        View view = this.f28360j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28356e = charSequence;
        View view = this.f28360j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f28362l = i7;
        View view = this.f28360j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
