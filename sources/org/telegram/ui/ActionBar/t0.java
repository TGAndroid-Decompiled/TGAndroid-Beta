package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21518a;
    public int f21519b;
    public int f21520c;
    public Drawable d;
    public CharSequence f21521e;
    public boolean f21522f;
    public View f21523g;
    public xh h;
    public int f21524i;
    public View f21525j;
    public vh f21526k;
    public int f21527l = 0;
    public int f21528m = 0;
    public Integer f21529n;
    public Integer f21530o;

    public t0(int i10) {
        this.f21518a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21529n;
        if (num == null || this.f21530o == null || num.intValue() != i10 || this.f21530o.intValue() != i11) {
            this.f21529n = Integer.valueOf(i10);
            this.f21530o = Integer.valueOf(i11);
            View view = this.f21525j;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21520c) {
            this.f21520c = i10;
            View view = this.f21525j;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21526k = vhVar;
        View view = this.f21525j;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21521e = charSequence;
        View view = this.f21525j;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21527l = i10;
        View view = this.f21525j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
