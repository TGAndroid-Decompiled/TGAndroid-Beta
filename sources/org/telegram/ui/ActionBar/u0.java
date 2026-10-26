package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.oh;
import org.telegram.ui.qh;
public final class u0 {
    public final int f23109a;
    public int f23110b;
    public int f23111c;
    public Drawable d;
    public CharSequence e;
    public boolean f23112f;
    public View f23113g;
    public qh h;
    public int f23114i;
    public View f23115j;
    public oh f23116k;
    public int f23117l = 0;
    public int f23118m = 0;
    public Integer f23119n;
    public Integer f23120o;

    public u0(int i10) {
        this.f23109a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f23119n;
        if (num == null || this.f23120o == null || num.intValue() != i10 || this.f23120o.intValue() != i11) {
            this.f23119n = Integer.valueOf(i10);
            this.f23120o = Integer.valueOf(i11);
            View view = this.f23115j;
            if (view instanceof g1) {
                ((g1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f23111c) {
            this.f23111c = i10;
            View view = this.f23115j;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(oh ohVar) {
        this.f23116k = ohVar;
        View view = this.f23115j;
        if (view != null) {
            view.setOnClickListener(ohVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f23115j;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f23117l = i10;
        View view = this.f23115j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
