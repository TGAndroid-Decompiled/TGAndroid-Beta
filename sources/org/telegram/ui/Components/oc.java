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
public final class oc extends mb implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f31258a;
    public Runnable f31259b;
    public Runnable f31260c;
    public qc d;
    public final TextView e;
    public boolean f31261f;
    public final Drawable h;
    public final Drawable f31262n;

    public oc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        this.f31258a = u6Var;
        int i10 = org.telegram.ui.ActionBar.y6.Gi;
        if (u6Var != null) {
            x02 = u6Var.g(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.y6.g0((x02 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            ic.a.o(14.0f, 1, textView);
            org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
            org.telegram.messenger.wh.k(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            kb1.U(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, kb1.m(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.y6.g0((x02 & 16777215) | 419430400, 1, -1));
                this.f31262n = imageView.getBackground();
            }
            kb1.U(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, kb1.l(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 5));
    }

    @Override
    public final void c(qc qcVar) {
        this.d = qcVar;
    }

    @Override
    public final void d() {
        this.d = null;
        Runnable runnable = this.f31260c;
        if (runnable != null && !this.f31261f) {
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
            this.f31261f = true;
            Runnable runnable = this.f31259b;
            if (runnable != null) {
                runnable.run();
            }
            qc qcVar = this.d;
            if (qcVar != null) {
                qcVar.b();
            }
        }
    }

    @Override
    public final void updateColors() {
        int x02;
        Drawable drawable;
        try {
            int i10 = org.telegram.ui.ActionBar.y6.Gi;
            org.telegram.ui.ActionBar.u6 u6Var = this.f31258a;
            if (u6Var != null) {
                x02 = u6Var.g(i10);
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            }
            int i11 = (x02 & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.y6.E1(drawable, i11, true);
            }
            Drawable drawable2 = this.f31262n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.y6.E1(drawable2, i11, true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public oc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this(context, u6Var, z10, !z10);
    }
}
