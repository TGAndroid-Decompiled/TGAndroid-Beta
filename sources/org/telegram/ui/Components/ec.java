package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class ec extends db implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f34726a;
    public Runnable f34727b;
    public Runnable f34728c;
    public gc d;
    public final TextView f34729e;
    public boolean f34730f;
    public final Drawable h;
    public final Drawable f34731n;

    public ec(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        this.f34726a = h6Var;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        if (h6Var != null) {
            x02 = h6Var.k(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.f34729e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.m6.h0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.x(textView, 1, 14.0f);
            org.telegram.messenger.n10.r(textView, i7, h6Var, null, 2131743642);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.gd.f24241a0;
            c8.xa.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ma.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231001);
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.m6.h0((x02 & 16777215) | 419430400, 1, -1));
                this.f34731n = imageView.getBackground();
            }
            c8.xa.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ma.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new o0(this, 4));
    }

    @Override
    public final void c(gc gcVar) {
        this.d = gcVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f34728c;
        if (runnable != null && !this.f34730f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f34729e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f34730f = true;
            Runnable runnable = this.f34727b;
            if (runnable != null) {
                runnable.run();
            }
            gc gcVar = this.d;
            if (gcVar != null) {
                gcVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.m6.xj;
            org.telegram.ui.ActionBar.h6 h6Var = this.f34726a;
            if (h6Var != null) {
                x02 = h6Var.k(i7);
            } else {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            }
            int i10 = (x02 & 16777215) | 419430400;
            TextView textView = this.f34729e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.m6.H1(drawable, i10, true);
            }
            Drawable drawable2 = this.f34731n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.m6.H1(drawable2, i10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public ec(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this(context, h6Var, z10, !z10);
    }
}
