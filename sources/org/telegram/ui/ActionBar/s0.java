package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.oh;
import org.telegram.ui.qh;
public final class s0 {
    public final int f21689a;
    public int f21690b;
    public int f21691c;
    public Drawable d;
    public CharSequence e;
    public boolean f21692f;
    public View f21693g;
    public qh h;
    public int f21694i;
    public View f21695j;
    public oh f21696k;
    public int f21697l = 0;
    public int f21698m = 0;
    public Integer f21699n;
    public Integer f21700o;

    public s0(int i10) {
        this.f21689a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21699n;
        if (num == null || this.f21700o == null || num.intValue() != i10 || this.f21700o.intValue() != i11) {
            this.f21699n = Integer.valueOf(i10);
            this.f21700o = Integer.valueOf(i11);
            View view = this.f21695j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21691c) {
            this.f21691c = i10;
            View view = this.f21695j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(oh ohVar) {
        this.f21696k = ohVar;
        View view = this.f21695j;
        if (view != null) {
            view.setOnClickListener(ohVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21695j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21697l = i10;
        View view = this.f21695j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
