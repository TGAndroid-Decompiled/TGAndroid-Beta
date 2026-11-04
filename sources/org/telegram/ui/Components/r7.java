package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class r7 extends u7 {
    public final int E;
    public final Context F;
    public final KeyEvent.Callback G;

    public r7(KeyEvent.Callback callback, Context context, Context context2, int i3) {
        super(context);
        this.E = i3;
        this.G = callback;
        this.F = context2;
    }

    @Override
    public final TextView a() {
        switch (this.E) {
            case 0:
                l80 l80Var = new l80(this.F);
                org.telegram.ui.ActionBar.r6.V(l80Var, org.telegram.ui.ActionBar.k6.Cj, ((z7) this.G).J0);
                l80Var.setTextSize(1, 17.0f);
                l80Var.setTypeface(org.telegram.messenger.g0.o());
                l80Var.setEllipsize(TextUtils.TruncateAt.END);
                l80Var.setSingleLine(true);
                return l80Var;
            case 1:
                l80 l80Var2 = new l80(this.F);
                int i3 = org.telegram.ui.ActionBar.k6.Gj;
                z7 z7Var = (z7) this.G;
                org.telegram.ui.ActionBar.r6.V(l80Var2, i3, z7Var.J0);
                l80Var2.setTextSize(1, 13.0f);
                l80Var2.setEllipsize(TextUtils.TruncateAt.END);
                l80Var2.setSingleLine(true);
                l80Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, z7Var.J0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                org.telegram.ui.ActionBar.e6 e6Var = z7Var.J0;
                l80Var2.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(l80Var2, a02, null, N, e6Var);
                l80Var2.setOnClickListener(new q2(3, this, l80Var2));
                return l80Var2;
            default:
                l80 l80Var3 = new l80(this.F);
                org.telegram.ui.ActionBar.r6.V(l80Var3, org.telegram.ui.ActionBar.k6.Gj, ((pm0) this.G).O);
                l80Var3.setTextSize(1, 12.0f);
                l80Var3.setEllipsize(TextUtils.TruncateAt.END);
                l80Var3.setSingleLine(true);
                l80Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return l80Var3;
        }
    }
}
