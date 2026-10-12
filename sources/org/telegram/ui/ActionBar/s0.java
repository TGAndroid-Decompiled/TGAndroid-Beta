package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.bi;
import org.telegram.ui.zh;
public final class s0 {
    public final int f20614a;
    public int f20615b;
    public int f20616c;
    public Drawable d;
    public CharSequence e;
    public boolean f20617f;
    public View f20618g;
    public bi h;
    public int f20619i;
    public View f20620j;
    public zh f20621k;
    public int f20622l = 0;
    public int f20623m = 0;
    public Integer f20624n;
    public Integer f20625o;

    public s0(int i10) {
        this.f20614a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20624n;
        if (num == null || this.f20625o == null || num.intValue() != i10 || this.f20625o.intValue() != i11) {
            this.f20624n = Integer.valueOf(i10);
            this.f20625o = Integer.valueOf(i11);
            View view = this.f20620j;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20616c) {
            this.f20616c = i10;
            View view = this.f20620j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.f20621k = zhVar;
        View view = this.f20620j;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20620j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20622l = i10;
        View view = this.f20620j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
