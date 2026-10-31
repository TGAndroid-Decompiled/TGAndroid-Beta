package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z41;
public final class r8 extends z41 {
    public static final int f35124b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        float f7;
        float f10;
        s8 s8Var = (s8) view;
        String charSequence = a51Var.f24292l.toString();
        long j10 = a51Var.B;
        int i10 = a51Var.f24305z;
        boolean z11 = a51Var.f24297q;
        TextView textView = s8Var.f35204c;
        TextView textView2 = s8Var.f35203b;
        textView2.setText(k8.b0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j10 < 0) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) k0.s(j10, false));
        }
        if (i10 > 0) {
            spannableStringBuilder = new SpannableStringBuilder(cd.V(null, null, 2131743076, spannableStringBuilder, cd.Q(i10)));
        }
        textView.setText(spannableStringBuilder);
        float f11 = 1.0f;
        if (z11) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        textView2.setAlpha(f7);
        if (z11) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        textView.setAlpha(f10);
        ImageView imageView = s8Var.d;
        if (z11) {
            f11 = 0.5f;
        }
        imageView.setAlpha(f11);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s8(context, p6Var);
    }
}
