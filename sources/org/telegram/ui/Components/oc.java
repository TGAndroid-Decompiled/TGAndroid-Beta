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
    public Runnable f28986a;
    public Runnable f28987b;
    public qc f28988c;
    public final TextView d;
    public boolean e;

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        int x02;
        int i10 = org.telegram.ui.ActionBar.h6.Gi;
        if (d6Var != null) {
            x02 = d6Var.w(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.h6.g0((x02 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(x02);
            org.telegram.messenger.ok.m(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.f6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.z5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0((x02 & 16777215) | 419430400, 1, -1));
            }
            w7.f6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.z5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 5));
    }

    @Override
    public final void a(qc qcVar) {
        this.f28988c = qcVar;
    }

    @Override
    public final void b() {
        this.f28988c = null;
        Runnable runnable = this.f28987b;
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
        if (this.f28988c != null) {
            this.e = true;
            Runnable runnable = this.f28986a;
            if (runnable != null) {
                runnable.run();
            }
            qc qcVar = this.f28988c;
            if (qcVar != null) {
                qcVar.b();
            }
        }
    }

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(context, d6Var, z10, !z10);
    }
}
