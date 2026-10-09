package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
import org.telegram.ui.xh;
public final class t0 {
    public final int f21514a;
    public int f21515b;
    public int f21516c;
    public Drawable d;
    public CharSequence f21517e;
    public boolean f21518f;
    public View f21519g;
    public xh h;
    public int f21520i;
    public View f21521j;
    public vh f21522k;
    public int f21523l = 0;
    public int f21524m = 0;
    public Integer f21525n;
    public Integer f21526o;

    public t0(int i10) {
        this.f21514a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21525n;
        if (num == null || this.f21526o == null || num.intValue() != i10 || this.f21526o.intValue() != i11) {
            this.f21525n = Integer.valueOf(i10);
            this.f21526o = Integer.valueOf(i11);
            View view = this.f21521j;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21516c) {
            this.f21516c = i10;
            View view = this.f21521j;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21522k = vhVar;
        View view = this.f21521j;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21517e = charSequence;
        View view = this.f21521j;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21523l = i10;
        View view = this.f21521j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
