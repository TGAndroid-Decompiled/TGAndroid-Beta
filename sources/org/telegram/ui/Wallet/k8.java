package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class k8 extends x31 {
    public static final int f42665b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        float f10;
        float f11;
        l8 l8Var = (l8) view;
        String charSequence = y31Var.f40568l.toString();
        long j3 = y31Var.B;
        int i7 = y31Var.f40581z;
        boolean z10 = y31Var.f40573q;
        TextView textView = l8Var.f42731c;
        TextView textView2 = l8Var.f42730b;
        textView2.setText(d8.c0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j3 < 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new c80(org.telegram.messenger.g0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) l0.s(j3, false));
        }
        if (i7 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(id.V(null, null, 2131743050, spannableStringBuilder, id.Q(i7)));
        }
        textView.setText(spannableStringBuilder);
        float f12 = 1.0f;
        if (z10) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        textView2.setAlpha(f10);
        if (z10) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        textView.setAlpha(f11);
        ImageView imageView = l8Var.d;
        if (z10) {
            f12 = 0.5f;
        }
        imageView.setAlpha(f12);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new l8(context, g6Var);
    }
}
