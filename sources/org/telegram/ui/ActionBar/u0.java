package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.zh;
public final class u0 {
    public final int f19565a;
    public int f19566b;
    public int f19567c;
    public Drawable d;
    public CharSequence e;
    public boolean f19568f;
    public View f19569g;
    public int h;
    public View f19570i;
    public zh f19571j;
    public int f19572k = 0;
    public int f19573l = 0;
    public Integer f19574m;
    public Integer f19575n;

    public u0(int i10) {
        this.f19565a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19574m;
        if (num == null || this.f19575n == null || num.intValue() != i10 || this.f19575n.intValue() != i11) {
            this.f19574m = Integer.valueOf(i10);
            this.f19575n = Integer.valueOf(i11);
            View view = this.f19570i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19567c) {
            this.f19567c = i10;
            View view = this.f19570i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f19571j = zhVar;
        View view = this.f19570i;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19570i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19572k = i10;
        View view = this.f19570i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
