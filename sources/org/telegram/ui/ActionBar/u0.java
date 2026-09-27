package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;
public final class u0 {
    public final int f19778a;
    public int f19779b;
    public int f19780c;
    public Drawable d;
    public CharSequence e;
    public boolean f19781f;
    public View f19782g;
    public int h;
    public View f19783i;
    public xh f19784j;
    public int f19785k = 0;
    public int f19786l = 0;
    public Integer f19787m;
    public Integer f19788n;

    public u0(int i10) {
        this.f19778a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19787m;
        if (num == null || this.f19788n == null || num.intValue() != i10 || this.f19788n.intValue() != i11) {
            this.f19787m = Integer.valueOf(i10);
            this.f19788n = Integer.valueOf(i11);
            View view = this.f19783i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19780c) {
            this.f19780c = i10;
            View view = this.f19783i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.f19784j = xhVar;
        View view = this.f19783i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19783i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19785k = i10;
        View view = this.f19783i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
