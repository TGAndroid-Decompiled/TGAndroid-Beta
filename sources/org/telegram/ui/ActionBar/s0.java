package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21692a;
    public int f21693b;
    public int f21694c;
    public Drawable d;
    public CharSequence e;
    public boolean f21695f;
    public View f21696g;
    public oh h;
    public int f21697i;
    public View f21698j;
    public mh f21699k;
    public int f21700l = 0;
    public int f21701m = 0;
    public Integer f21702n;
    public Integer f21703o;

    public s0(int i10) {
        this.f21692a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21702n;
        if (num == null || this.f21703o == null || num.intValue() != i10 || this.f21703o.intValue() != i11) {
            this.f21702n = Integer.valueOf(i10);
            this.f21703o = Integer.valueOf(i11);
            View view = this.f21698j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21694c) {
            this.f21694c = i10;
            View view = this.f21698j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21699k = mhVar;
        View view = this.f21698j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21698j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21700l = i10;
        View view = this.f21698j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
