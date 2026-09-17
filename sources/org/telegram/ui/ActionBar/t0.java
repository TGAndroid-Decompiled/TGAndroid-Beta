package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21335a;
    public int f21336b;
    public int f21337c;
    public Drawable d;
    public CharSequence f21338e;
    public boolean f21339f;
    public View f21340g;
    public int h;
    public View f21341i;
    public xh f21342j;
    public int f21343k = 0;
    public int f21344l = 0;
    public Integer f21345m;
    public Integer f21346n;

    public t0(int i10) {
        this.f21335a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21345m;
        if (num == null || this.f21346n == null || num.intValue() != i10 || this.f21346n.intValue() != i11) {
            this.f21345m = Integer.valueOf(i10);
            this.f21346n = Integer.valueOf(i11);
            View view = this.f21341i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21337c) {
            this.f21337c = i10;
            View view = this.f21341i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f21342j = xhVar;
        View view = this.f21341i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21338e = charSequence;
        View view = this.f21341i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21343k = i10;
        View view = this.f21341i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
