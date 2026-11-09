package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.eh;
import org.telegram.ui.gh;
public final class p0 {
    public final int f28356a;
    public int f28357b;
    public int f28358c;
    public Drawable d;
    public CharSequence f28359e;
    public boolean f28360f;
    public View f28361g;
    public gh h;
    public int f28362i;
    public View f28363j;
    public eh f28364k;
    public int f28365l = 0;
    public int f28366m = 0;
    public Integer f28367n;
    public Integer f28368o;

    public p0(int i7) {
        this.f28356a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.f28367n;
        if (num == null || this.f28368o == null || num.intValue() != i7 || this.f28368o.intValue() != i10) {
            this.f28367n = Integer.valueOf(i7);
            this.f28368o = Integer.valueOf(i10);
            View view = this.f28363j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.f28358c) {
            this.f28358c = i7;
            View view = this.f28363j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(eh ehVar) {
        this.f28364k = ehVar;
        View view = this.f28363j;
        if (view != null) {
            view.setOnClickListener(ehVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.f28359e = charSequence;
        View view = this.f28363j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f28365l = i7;
        View view = this.f28363j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
