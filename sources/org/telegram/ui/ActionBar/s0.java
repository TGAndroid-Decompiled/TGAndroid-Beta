package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21697a;
    public int f21698b;
    public int f21699c;
    public Drawable d;
    public CharSequence e;
    public boolean f21700f;
    public View f21701g;
    public oh h;
    public int f21702i;
    public View f21703j;
    public mh f21704k;
    public int f21705l = 0;
    public int f21706m = 0;
    public Integer f21707n;
    public Integer f21708o;

    public s0(int i10) {
        this.f21697a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21707n;
        if (num == null || this.f21708o == null || num.intValue() != i10 || this.f21708o.intValue() != i11) {
            this.f21707n = Integer.valueOf(i10);
            this.f21708o = Integer.valueOf(i11);
            View view = this.f21703j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21699c) {
            this.f21699c = i10;
            View view = this.f21703j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21704k = mhVar;
        View view = this.f21703j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21703j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21705l = i10;
        View view = this.f21703j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
