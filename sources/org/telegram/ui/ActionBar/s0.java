package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21690a;
    public int f21691b;
    public int f21692c;
    public Drawable d;
    public CharSequence e;
    public boolean f21693f;
    public View f21694g;
    public oh h;
    public int f21695i;
    public View f21696j;
    public mh f21697k;
    public int f21698l = 0;
    public int f21699m = 0;
    public Integer f21700n;
    public Integer f21701o;

    public s0(int i10) {
        this.f21690a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21700n;
        if (num == null || this.f21701o == null || num.intValue() != i10 || this.f21701o.intValue() != i11) {
            this.f21700n = Integer.valueOf(i10);
            this.f21701o = Integer.valueOf(i11);
            View view = this.f21696j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21692c) {
            this.f21692c = i10;
            View view = this.f21696j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21697k = mhVar;
        View view = this.f21696j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21696j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21698l = i10;
        View view = this.f21696j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
