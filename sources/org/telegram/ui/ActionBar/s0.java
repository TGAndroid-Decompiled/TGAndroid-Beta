package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.uh;
public final class s0 {
    public final int f19729a;
    public int f19730b;
    public int f19731c;
    public Drawable d;
    public CharSequence e;
    public boolean f19732f;
    public View f19733g;
    public int h;
    public View f19734i;
    public uh f19735j;
    public int f19736k = 0;
    public int f19737l = 0;
    public Integer f19738m;
    public Integer f19739n;

    public s0(int i10) {
        this.f19729a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.f19738m;
        if (num == null || this.f19739n == null || num.intValue() != i10 || this.f19739n.intValue() != i11) {
            this.f19738m = Integer.valueOf(i10);
            this.f19739n = Integer.valueOf(i11);
            View view = this.f19734i;
            if (view instanceof e1) {
                ((e1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.f19731c) {
            this.f19731c = i10;
            View view = this.f19734i;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(uh uhVar) {
        this.f19735j = uhVar;
        View view = this.f19734i;
        if (view != null) {
            view.setOnClickListener(uhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.f19734i;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.f19736k = i10;
        View view = this.f19734i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
