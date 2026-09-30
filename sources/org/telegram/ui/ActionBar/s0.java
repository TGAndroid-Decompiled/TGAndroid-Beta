package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class s0 {
    public final int f19730a;
    public int f19731b;
    public int f19732c;
    public Drawable d;
    public CharSequence e;
    public boolean f19733f;
    public View f19734g;
    public int h;
    public View f19735i;
    public uh f19736j;
    public int f19737k = 0;
    public int f19738l = 0;
    public Integer f19739m;
    public Integer f19740n;

    public s0(int i10) {
        this.f19730a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19739m;
        if (num == null || this.f19740n == null || num.intValue() != i10 || this.f19740n.intValue() != i11) {
            this.f19739m = Integer.valueOf(i10);
            this.f19740n = Integer.valueOf(i11);
            View view = this.f19735i;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19732c) {
            this.f19732c = i10;
            View view = this.f19735i;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19736j = uhVar;
        View view = this.f19735i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19735i;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19737k = i10;
        View view = this.f19735i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
