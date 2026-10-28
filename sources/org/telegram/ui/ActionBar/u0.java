package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ph;
import org.telegram.ui.rh;
public final class u0 {
    public final int f23110a;
    public int f23111b;
    public int f23112c;
    public Drawable d;
    public CharSequence e;
    public boolean f23113f;
    public View f23114g;
    public rh h;
    public int f23115i;
    public View f23116j;
    public ph f23117k;
    public int f23118l = 0;
    public int f23119m = 0;
    public Integer f23120n;
    public Integer f23121o;

    public u0(int i10) {
        this.f23110a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f23120n;
        if (num == null || this.f23121o == null || num.intValue() != i10 || this.f23121o.intValue() != i11) {
            this.f23120n = Integer.valueOf(i10);
            this.f23121o = Integer.valueOf(i11);
            View view = this.f23116j;
            if (view instanceof g1) {
                ((g1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f23112c) {
            this.f23112c = i10;
            View view = this.f23116j;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(ph phVar) {
        this.f23117k = phVar;
        View view = this.f23116j;
        if (view != null) {
            view.setOnClickListener(phVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f23116j;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f23118l = i10;
        View view = this.f23116j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
