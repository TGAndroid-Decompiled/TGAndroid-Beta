package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ec extends db {
    public Runnable f27999a;
    public Runnable f28000b;
    public gc f28001c;
    public final TextView d;
    public boolean f28002e;

    public ec(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        int w02;
        int i9 = org.telegram.ui.ActionBar.f6.Gi;
        if (b6Var != null) {
            w02 = b6Var.N0(i9);
        } else {
            w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.f6.f0((w02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(w02);
            org.telegram.messenger.ll.l(R.string.UndoNoCaps, textView, 16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            g7.k6.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, g7.e6.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0((w02 & 16777215) | 419430400, 1, -1));
            }
            boolean z13 = LocaleController.isRTL;
            g7.k6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, g7.e6.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 6));
    }

    @Override
    public final void a(gc gcVar) {
        this.f28001c = gcVar;
    }

    @Override
    public final void b() {
        this.f28001c = null;
        Runnable runnable = this.f28000b;
        if (runnable != null && !this.f28002e) {
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
        if (this.f28001c != null) {
            this.f28002e = true;
            Runnable runnable = this.f27999a;
            if (runnable != null) {
                runnable.run();
            }
            gc gcVar = this.f28001c;
            if (gcVar != null) {
                gcVar.b();
            }
        }
    }

    public ec(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this(context, b6Var, z10, !z10);
    }
}
