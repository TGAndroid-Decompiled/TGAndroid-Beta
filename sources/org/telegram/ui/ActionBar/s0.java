package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.bi;
import org.telegram.ui.zh;
public final class s0 {
    public final int f21242a;
    public int f21243b;
    public int f21244c;
    public Drawable d;
    public CharSequence f21245e;
    public boolean f21246f;
    public View f21247g;
    public bi h;
    public int f21248i;
    public View f21249j;
    public zh f21250k;
    public int f21251l = 0;
    public int f21252m = 0;
    public Integer f21253n;
    public Integer f21254o;

    public s0(int i10) {
        this.f21242a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21253n;
        if (num == null || this.f21254o == null || num.intValue() != i10 || this.f21254o.intValue() != i11) {
            this.f21253n = Integer.valueOf(i10);
            this.f21254o = Integer.valueOf(i11);
            View view = this.f21249j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21244c) {
            this.f21244c = i10;
            View view = this.f21249j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f21250k = zhVar;
        View view = this.f21249j;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21245e = charSequence;
        View view = this.f21249j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21251l = i10;
        View view = this.f21249j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
