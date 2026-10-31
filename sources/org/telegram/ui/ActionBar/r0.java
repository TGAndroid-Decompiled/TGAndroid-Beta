package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.sh;
import org.telegram.ui.uh;
public final class r0 {
    public final int f20709a;
    public int f20710b;
    public int f20711c;
    public Drawable d;
    public CharSequence e;
    public boolean f20712f;
    public View f20713g;
    public uh h;
    public int f20714i;
    public View f20715j;
    public sh f20716k;
    public int f20717l = 0;
    public int f20718m = 0;
    public Integer f20719n;
    public Integer f20720o;

    public r0(int i10) {
        this.f20709a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f20719n;
        if (num == null || this.f20720o == null || num.intValue() != i10 || this.f20720o.intValue() != i11) {
            this.f20719n = Integer.valueOf(i10);
            this.f20720o = Integer.valueOf(i11);
            View view = this.f20715j;
            if (view instanceof b1) {
                ((b1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f20711c) {
            this.f20711c = i10;
            View view = this.f20715j;
            if (view instanceof b1) {
                ((b1) view).setIcon(i10);
            }
        }
    }

    public final void c(sh shVar) {
        this.f20716k = shVar;
        View view = this.f20715j;
        if (view != null) {
            view.setOnClickListener(shVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f20715j;
        if (view instanceof b1) {
            ((b1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f20717l = i10;
        View view = this.f20715j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
