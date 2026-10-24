package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mc extends kb implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f28573a;
    public Runnable f28574b;
    public Runnable f28575c;
    public oc d;
    public final TextView e;
    public boolean f28576f;
    public final Drawable h;
    public final Drawable f28577n;

    public mc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        this.f28573a = g6Var;
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        if (g6Var != null) {
            x02 = g6Var.g(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.k6.g0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
            org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
            org.telegram.messenger.tl.m(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.f6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.z5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0((x02 & 16777215) | 419430400, 1, -1));
                this.f28577n = imageView.getBackground();
            }
            w7.f6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.z5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 5));
    }

    @Override
    public final void c(oc ocVar) {
        this.d = ocVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f28575c;
        if (runnable != null && !this.f28576f) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f28576f = true;
            Runnable runnable = this.f28574b;
            if (runnable != null) {
                runnable.run();
            }
            oc ocVar = this.d;
            if (ocVar != null) {
                ocVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i10 = org.telegram.ui.ActionBar.k6.Gi;
            org.telegram.ui.ActionBar.g6 g6Var = this.f28573a;
            if (g6Var != null) {
                x02 = g6Var.g(i10);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            }
            int i11 = (x02 & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.k6.E1(drawable, i11, true);
            }
            Drawable drawable2 = this.f28577n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.k6.E1(drawable2, i11, true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public mc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        this(context, g6Var, z10, !z10);
    }
}
