package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.sh;
public final class u0 {
    public final int f20562a;
    public int f20563b;
    public int f20564c;
    public Drawable d;
    public CharSequence e;
    public boolean f20565f;
    public View f20566g;
    public int h;
    public View f20567i;
    public sh f20568j;
    public int f20569k = 0;
    public int f20570l = 0;
    public Integer f20571m;
    public Integer f20572n;

    public u0(int i10) {
        this.f20562a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20571m;
        if (num == null || this.f20572n == null || num.intValue() != i10 || this.f20572n.intValue() != i11) {
            this.f20571m = Integer.valueOf(i10);
            this.f20572n = Integer.valueOf(i11);
            View view = this.f20567i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20564c) {
            this.f20564c = i10;
            View view = this.f20567i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(sh shVar) {
        this.f20568j = shVar;
        View view = this.f20567i;
        if (view != null) {
            view.setOnClickListener(shVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20567i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20569k = i10;
        View view = this.f20567i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
