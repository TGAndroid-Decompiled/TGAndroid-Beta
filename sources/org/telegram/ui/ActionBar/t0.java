package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;
public final class t0 {
    public final int f21513a;
    public int f21514b;
    public int f21515c;
    public Drawable d;
    public CharSequence f21516e;
    public boolean f21517f;
    public View f21518g;
    public int h;
    public View f21519i;
    public vh f21520j;
    public int f21521k = 0;
    public int f21522l = 0;
    public Integer f21523m;
    public Integer f21524n;

    public t0(int i10) {
        this.f21513a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21523m;
        if (num == null || this.f21524n == null || num.intValue() != i10 || this.f21524n.intValue() != i11) {
            this.f21523m = Integer.valueOf(i10);
            this.f21524n = Integer.valueOf(i11);
            View view = this.f21519i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21515c) {
            this.f21515c = i10;
            View view = this.f21519i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(vh vhVar) {
        this.f21520j = vhVar;
        View view = this.f21519i;
        if (view != null) {
            view.setOnClickListener(vhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f21516e = charSequence;
        View view = this.f21519i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21521k = i10;
        View view = this.f21519i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
