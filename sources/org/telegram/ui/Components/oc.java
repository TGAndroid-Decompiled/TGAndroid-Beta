package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oc extends mb {
    public Runnable f27022a;
    public Runnable f27023b;
    public qc f27024c;
    public final TextView d;
    public boolean e;

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        int w02;
        int i10 = org.telegram.ui.ActionBar.h6.Gi;
        if (d6Var != null) {
            w02 = d6Var.G0(i10);
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.h6.f0((w02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(w02);
            org.telegram.messenger.ok.l(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.e6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.y5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.h6.f0((w02 & 16777215) | 419430400, 1, -1));
            }
            w7.e6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.y5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 6));
    }

    @Override
    public final void a(qc qcVar) {
        this.f27024c = qcVar;
    }

    @Override
    public final void b() {
        this.f27024c = null;
        Runnable runnable = this.f27023b;
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
        if (this.f27024c != null) {
            this.e = true;
            Runnable runnable = this.f27022a;
            if (runnable != null) {
                runnable.run();
            }
            qc qcVar = this.f27024c;
            if (qcVar != null) {
                qcVar.b();
            }
        }
    }

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(context, d6Var, z10, !z10);
    }
}
