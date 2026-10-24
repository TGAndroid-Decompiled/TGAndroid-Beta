package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;
public final class s0 {
    public final int f21823a;
    public int f21824b;
    public int f21825c;
    public Drawable d;
    public CharSequence e;
    public boolean f21826f;
    public View f21827g;
    public oh h;
    public int f21828i;
    public View f21829j;
    public mh f21830k;
    public int f21831l = 0;
    public int f21832m = 0;
    public Integer f21833n;
    public Integer f21834o;

    public s0(int i10) {
        this.f21823a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f21833n;
        if (num == null || this.f21834o == null || num.intValue() != i10 || this.f21834o.intValue() != i11) {
            this.f21833n = Integer.valueOf(i10);
            this.f21834o = Integer.valueOf(i11);
            View view = this.f21829j;
            if (view instanceof e1) {
                ((e1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f21825c) {
            this.f21825c = i10;
            View view = this.f21829j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.f21830k = mhVar;
        View view = this.f21829j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f21829j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f21831l = i10;
        View view = this.f21829j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
