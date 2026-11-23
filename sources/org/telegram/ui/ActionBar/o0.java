package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ch;
import org.telegram.ui.fh;
public final class o0 {
    public final int f29831a;
    public int f29832b;
    public int f29833c;
    public Drawable d;
    public CharSequence f29834e;
    public boolean f29835f;
    public View f29836g;
    public fh h;
    public int f29837i;
    public View f29838j;
    public ch f29839k;
    public int f29840l = 0;
    public int f29841m = 0;
    public Integer f29842n;
    public Integer f29843o;

    public o0(int i7) {
        this.f29831a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f29842n;
        if (num == null || this.f29843o == null || num.intValue() != i7 || this.f29843o.intValue() != i10) {
            this.f29842n = Integer.valueOf(i7);
            this.f29843o = Integer.valueOf(i10);
            View view = this.f29838j;
            if (view instanceof y0) {
                ((y0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f29833c) {
            this.f29833c = i7;
            View view = this.f29838j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i7);
            }
        }
    }

    public final void c(ch chVar) {
        this.f29839k = chVar;
        View view = this.f29838j;
        if (view != null) {
            view.setOnClickListener(chVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f29834e = charSequence;
        View view = this.f29838j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f29840l = i7;
        View view = this.f29838j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
