package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class s0 {
    public final int f19728a;
    public int f19729b;
    public int f19730c;
    public Drawable d;
    public CharSequence e;
    public boolean f19731f;
    public View f19732g;
    public int h;
    public View f19733i;
    public uh f19734j;
    public int f19735k = 0;
    public int f19736l = 0;
    public Integer f19737m;
    public Integer f19738n;

    public s0(int i10) {
        this.f19728a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19737m;
        if (num == null || this.f19738n == null || num.intValue() != i10 || this.f19738n.intValue() != i11) {
            this.f19737m = Integer.valueOf(i10);
            this.f19738n = Integer.valueOf(i11);
            View view = this.f19733i;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19730c) {
            this.f19730c = i10;
            View view = this.f19733i;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19734j = uhVar;
        View view = this.f19733i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19733i;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19735k = i10;
        View view = this.f19733i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
