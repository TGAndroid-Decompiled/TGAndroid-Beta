package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.lh;
public final class u0 {
    public final int f23820a;
    public int f23821b;
    public int f23822c;
    public Drawable d;
    public CharSequence f23823e;
    public boolean f23824f;
    public View f23825g;
    public int h;
    public View f23826i;
    public lh f23827j;
    public int f23828k = 0;
    public int f23829l = 0;
    public Integer f23830m;
    public Integer f23831n;

    public u0(int i10) {
        this.f23820a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f23830m;
        if (num == null || this.f23831n == null || num.intValue() != i10 || this.f23831n.intValue() != i11) {
            this.f23830m = Integer.valueOf(i10);
            this.f23831n = Integer.valueOf(i11);
            View view = this.f23826i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f23822c) {
            this.f23822c = i10;
            View view = this.f23826i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(lh lhVar) {
        this.f23827j = lhVar;
        View view = this.f23826i;
        if (view != null) {
            view.setOnClickListener(lhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f23823e = charSequence;
        View view = this.f23826i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f23828k = i10;
        View view = this.f23826i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
