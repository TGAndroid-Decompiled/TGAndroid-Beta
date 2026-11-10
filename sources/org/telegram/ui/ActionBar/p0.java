package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.eh;
import org.telegram.ui.gh;
public final class p0 {
    public final int f28357a;
    public int f28358b;
    public int f28359c;
    public Drawable d;
    public CharSequence f28360e;
    public boolean f28361f;
    public View f28362g;
    public gh h;
    public int f28363i;
    public View f28364j;
    public eh f28365k;
    public int f28366l = 0;
    public int f28367m = 0;
    public Integer f28368n;
    public Integer f28369o;

    public p0(int i7) {
        this.f28357a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f28368n;
        if (num == null || this.f28369o == null || num.intValue() != i7 || this.f28369o.intValue() != i10) {
            this.f28368n = Integer.valueOf(i7);
            this.f28369o = Integer.valueOf(i10);
            View view = this.f28364j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f28359c) {
            this.f28359c = i7;
            View view = this.f28364j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(eh ehVar) {
        this.f28365k = ehVar;
        View view = this.f28364j;
        if (view != null) {
            view.setOnClickListener(ehVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28360e = charSequence;
        View view = this.f28364j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f28366l = i7;
        View view = this.f28364j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
