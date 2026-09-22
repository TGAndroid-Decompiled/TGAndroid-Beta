package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.yh;
public final class t0 {
    public final int f19772a;
    public int f19773b;
    public int f19774c;
    public Drawable d;
    public CharSequence e;
    public boolean f19775f;
    public View f19776g;
    public int h;
    public View f19777i;
    public yh f19778j;
    public int f19779k = 0;
    public int f19780l = 0;
    public Integer f19781m;
    public Integer f19782n;

    public t0(int i10) {
        this.f19772a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19781m;
        if (num == null || this.f19782n == null || num.intValue() != i10 || this.f19782n.intValue() != i11) {
            this.f19781m = Integer.valueOf(i10);
            this.f19782n = Integer.valueOf(i11);
            View view = this.f19777i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19774c) {
            this.f19774c = i10;
            View view = this.f19777i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(yh yhVar) {
        this.f19778j = yhVar;
        View view = this.f19777i;
        if (view != null) {
            view.setOnClickListener(yhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19777i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19779k = i10;
        View view = this.f19777i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
