package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.zh;
public final class u0 {
    public final int f18637a;
    public int f18638b;
    public int f18639c;
    public Drawable d;
    public CharSequence e;
    public boolean f18640f;
    public View f18641g;
    public int h;
    public View f18642i;
    public zh f18643j;
    public int f18644k = 0;
    public int f18645l = 0;
    public Integer f18646m;
    public Integer f18647n;

    public u0(int i10) {
        this.f18637a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f18646m;
        if (num == null || this.f18647n == null || num.intValue() != i10 || this.f18647n.intValue() != i11) {
            this.f18646m = Integer.valueOf(i10);
            this.f18647n = Integer.valueOf(i11);
            View view = this.f18642i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f18639c) {
            this.f18639c = i10;
            View view = this.f18642i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f18643j = zhVar;
        View view = this.f18642i;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f18642i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f18644k = i10;
        View view = this.f18642i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
