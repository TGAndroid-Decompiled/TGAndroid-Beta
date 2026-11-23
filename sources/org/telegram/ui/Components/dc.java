package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class dc extends cb implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f34266a;
    public Runnable f34267b;
    public Runnable f34268c;
    public fc d;
    public final TextView f34269e;
    public boolean f34270f;
    public final Drawable h;
    public final Drawable f34271n;

    public dc(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        this.f34266a = i6Var;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        if (i6Var != null) {
            x02 = i6Var.i(i7);
        } else {
            x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.f34269e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.n6.h0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.x(textView, 1, 14.0f);
            org.telegram.messenger.m10.r(textView, i7, i6Var, null, 2131743638);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.gd.f24314a0;
            c8.ya.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.na.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231003);
            org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.n6.h0((x02 & 16777215) | 419430400, 1, -1));
                this.f34271n = imageView.getBackground();
            }
            c8.ya.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.na.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new n0(this, 4));
    }

    @Override
    public final void c(fc fcVar) {
        this.d = fcVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f34268c;
        if (runnable != null && !this.f34270f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.f34269e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f34270f = true;
            Runnable runnable = this.f34267b;
            if (runnable != null) {
                runnable.run();
            }
            fc fcVar = this.d;
            if (fcVar != null) {
                fcVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.n6.xj;
            org.telegram.ui.ActionBar.i6 i6Var = this.f34266a;
            if (i6Var != null) {
                x02 = i6Var.i(i7);
            } else {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            }
            int i10 = (x02 & 16777215) | 419430400;
            TextView textView = this.f34269e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.n6.H1(drawable, i10, true);
            }
            Drawable drawable2 = this.f34271n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.n6.H1(drawable2, i10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public dc(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this(context, i6Var, z10, !z10);
    }
}
