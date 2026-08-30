package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gc extends db {
    public Runnable f25097a;
    public Runnable f25098b;
    public ic f25099c;
    public final TextView d;
    public boolean e;

    public gc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        int w02;
        int i10 = org.telegram.ui.ActionBar.j6.Gi;
        if (f6Var != null) {
            w02 = f6Var.x0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (z4) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.j6.f0((w02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(w02);
            org.telegram.messenger.y3.r(R.string.UndoNoCaps, textView, 16);
            float f10 = z10 ? 34.0f : 12.0f;
            boolean z11 = LocaleController.isRTL;
            k7.h6.a(textView, z11 ? 12.0f : f10, 8.0f, z11 ? f10 : 12.0f, 8.0f);
            addView(textView, k7.b6.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            if (!z4) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0((w02 & 16777215) | 419430400, 1, -1));
            }
            boolean z12 = LocaleController.isRTL;
            k7.h6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, k7.b6.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new g0(this, 6));
    }

    @Override
    public final void a(ic icVar) {
        this.f25099c = icVar;
    }

    @Override
    public final void b() {
        this.f25099c = null;
        Runnable runnable = this.f25098b;
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
        if (this.f25099c != null) {
            this.e = true;
            Runnable runnable = this.f25097a;
            if (runnable != null) {
                runnable.run();
            }
            ic icVar = this.f25099c;
            if (icVar != null) {
                icVar.b();
            }
        }
    }

    public gc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this(context, f6Var, z4, !z4);
    }
}
