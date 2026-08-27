package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class cc extends bb {

    public Runnable f27402a;

    public Runnable f27403b;

    public ec f27404c;
    public final TextView d;

    public boolean f27405e;

    public cc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.g6.Gi;
        int iN0 = c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.g6.f0((iN0 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(iN0);
            org.telegram.messenger.rl.i(R.string.UndoNoCaps, textView, 16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            h7.f6.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, h7.z5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(iN0, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0((iN0 & 16777215) | 419430400, 1, -1));
            }
            boolean z13 = LocaleController.isRTL;
            h7.f6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, h7.z5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 6));
    }

    @Override
    public final void a(ec ecVar) {
        this.f27404c = ecVar;
    }

    @Override
    public final void b() {
        this.f27404c = null;
        Runnable runnable = this.f27403b;
        if (runnable == null || this.f27405e) {
            return;
        }
        runnable.run();
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.f27404c != null) {
            this.f27405e = true;
            Runnable runnable = this.f27402a;
            if (runnable != null) {
                runnable.run();
            }
            ec ecVar = this.f27404c;
            if (ecVar != null) {
                ecVar.b();
            }
        }
    }

    public cc(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(context, c6Var, z10, !z10);
    }
}
