package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public final class p0 {
    public final int f28349a;
    public int f28350b;
    public int f28351c;
    public Drawable d;
    public CharSequence f28352e;
    public boolean f28353f;
    public View f28354g;
    public eh h;
    public int f28355i;
    public View f28356j;
    public ch f28357k;
    public int f28358l = 0;
    public int f28359m = 0;
    public Integer f28360n;
    public Integer f28361o;

    public p0(int i7) {
        this.f28349a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f28360n;
        if (num == null || this.f28361o == null || num.intValue() != i7 || this.f28361o.intValue() != i10) {
            this.f28360n = Integer.valueOf(i7);
            this.f28361o = Integer.valueOf(i10);
            View view = this.f28356j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f28351c) {
            this.f28351c = i7;
            View view = this.f28356j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f28357k = chVar;
        View view = this.f28356j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28352e = charSequence;
        View view = this.f28356j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f28358l = i7;
        View view = this.f28356j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
