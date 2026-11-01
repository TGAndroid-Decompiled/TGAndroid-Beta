package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.sh;
import org.telegram.ui.uh;
public final class r0 {
    public final int f20710a;
    public int f20711b;
    public int f20712c;
    public Drawable d;
    public CharSequence e;
    public boolean f20713f;
    public View f20714g;
    public uh h;
    public int f20715i;
    public View f20716j;
    public sh f20717k;
    public int f20718l = 0;
    public int f20719m = 0;
    public Integer f20720n;
    public Integer f20721o;

    public r0(int i10) {
        this.f20710a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20720n;
        if (num == null || this.f20721o == null || num.intValue() != i10 || this.f20721o.intValue() != i11) {
            this.f20720n = Integer.valueOf(i10);
            this.f20721o = Integer.valueOf(i11);
            View view = this.f20716j;
            if (view instanceof b1) {
                ((b1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20712c) {
            this.f20712c = i10;
            View view = this.f20716j;
            if (view instanceof b1) {
                ((b1) view).setIcon(i10);
            }
        }
    }

    public final void c(sh shVar) {
        this.f20717k = shVar;
        View view = this.f20716j;
        if (view != null) {
            view.setOnClickListener(shVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20716j;
        if (view instanceof b1) {
            ((b1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20718l = i10;
        View view = this.f20716j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
