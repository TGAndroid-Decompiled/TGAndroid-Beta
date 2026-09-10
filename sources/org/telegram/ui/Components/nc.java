package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nc extends lb {
    public Runnable f25483a;
    public Runnable f25484b;
    public pc f25485c;
    public final TextView d;
    public boolean e;

    public nc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int w02;
        int i10 = org.telegram.ui.ActionBar.j6.Gi;
        if (f6Var != null) {
            w02 = f6Var.F0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.j6.f0((w02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(w02);
            org.telegram.messenger.em.k(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.g6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.a6.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0((w02 & 16777215) | 419430400, 1, -1));
            }
            w7.g6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.a6.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new h0(this, 6));
    }

    @Override
    public final void a(pc pcVar) {
        this.f25485c = pcVar;
    }

    @Override
    public final void b() {
        this.f25485c = null;
        Runnable runnable = this.f25484b;
        if (runnable != null && !this.e) {
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
        if (this.f25485c != null) {
            this.e = true;
            Runnable runnable = this.f25483a;
            if (runnable != null) {
                runnable.run();
            }
            pc pcVar = this.f25485c;
            if (pcVar != null) {
                pcVar.b();
            }
        }
    }

    public nc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, f6Var, z10, !z10);
    }
}
