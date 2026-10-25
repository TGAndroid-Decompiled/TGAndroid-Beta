package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.oh;
import org.telegram.ui.qh;
public final class u0 {
    public final int f23107a;
    public int f23108b;
    public int f23109c;
    public Drawable d;
    public CharSequence e;
    public boolean f23110f;
    public View f23111g;
    public qh h;
    public int f23112i;
    public View f23113j;
    public oh f23114k;
    public int f23115l = 0;
    public int f23116m = 0;
    public Integer f23117n;
    public Integer f23118o;

    public u0(int i10) {
        this.f23107a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f23117n;
        if (num == null || this.f23118o == null || num.intValue() != i10 || this.f23118o.intValue() != i11) {
            this.f23117n = Integer.valueOf(i10);
            this.f23118o = Integer.valueOf(i11);
            View view = this.f23113j;
            if (view instanceof g1) {
                ((g1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f23109c) {
            this.f23109c = i10;
            View view = this.f23113j;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(oh ohVar) {
        this.f23114k = ohVar;
        View view = this.f23113j;
        if (view != null) {
            view.setOnClickListener(ohVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f23113j;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f23115l = i10;
        View view = this.f23113j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
