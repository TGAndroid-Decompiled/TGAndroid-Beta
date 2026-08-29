package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kc extends ib {
    public Runnable f30007a;
    public Runnable f30008b;
    public mc f30009c;
    public final TextView d;
    public boolean f30010e;

    public kc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int w02;
        int i10 = org.telegram.ui.ActionBar.g6.Gi;
        if (c6Var != null) {
            w02 = c6Var.C0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.g6.f0((w02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(w02);
            org.telegram.ui.b.i(R.string.UndoNoCaps, textView, 16);
            float f9 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            i7.l6.a(textView, z12 ? 12.0f : f9, 8.0f, z12 ? f9 : 12.0f, 8.0f);
            addView(textView, i7.f6.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0((w02 & 16777215) | 419430400, 1, -1));
            }
            boolean z13 = LocaleController.isRTL;
            i7.l6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, i7.f6.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new h0(this, 6));
    }

    @Override
    public final void a(mc mcVar) {
        this.f30009c = mcVar;
    }

    @Override
    public final void b() {
        this.f30009c = null;
        Runnable runnable = this.f30008b;
        if (runnable != null && !this.f30010e) {
            runnable.run();
        }
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.f30009c != null) {
            this.f30010e = true;
            Runnable runnable = this.f30007a;
            if (runnable != null) {
                runnable.run();
            }
            mc mcVar = this.f30009c;
            if (mcVar != null) {
                mcVar.b();
            }
        }
    }

    public kc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(context, c6Var, z10, !z10);
    }
}
