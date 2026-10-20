package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21693a;
    public int f21694b;
    public int f21695c;
    public Drawable d;
    public CharSequence e;
    public boolean f21696f;
    public View f21697g;
    public oh h;
    public int f21698i;
    public View f21699j;
    public mh f21700k;
    public int f21701l = 0;
    public int f21702m = 0;
    public Integer f21703n;
    public Integer f21704o;

    public s0(int i10) {
        this.f21693a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21703n;
        if (num == null || this.f21704o == null || num.intValue() != i10 || this.f21704o.intValue() != i11) {
            this.f21703n = Integer.valueOf(i10);
            this.f21704o = Integer.valueOf(i11);
            View view = this.f21699j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21695c) {
            this.f21695c = i10;
            View view = this.f21699j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21700k = mhVar;
        View view = this.f21699j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21699j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21701l = i10;
        View view = this.f21699j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
