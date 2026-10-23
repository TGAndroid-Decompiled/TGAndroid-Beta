package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21822a;
    public int f21823b;
    public int f21824c;
    public Drawable d;
    public CharSequence e;
    public boolean f21825f;
    public View f21826g;
    public oh h;
    public int f21827i;
    public View f21828j;
    public mh f21829k;
    public int f21830l = 0;
    public int f21831m = 0;
    public Integer f21832n;
    public Integer f21833o;

    public s0(int i10) {
        this.f21822a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21832n;
        if (num == null || this.f21833o == null || num.intValue() != i10 || this.f21833o.intValue() != i11) {
            this.f21832n = Integer.valueOf(i10);
            this.f21833o = Integer.valueOf(i11);
            View view = this.f21828j;
            if (view instanceof e1) {
                ((e1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21824c) {
            this.f21824c = i10;
            View view = this.f21828j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21829k = mhVar;
        View view = this.f21828j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21828j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21830l = i10;
        View view = this.f21828j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
