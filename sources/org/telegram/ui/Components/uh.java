package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class uh extends wh {
    public TLRPC.User f38746b;
    public TLRPC.TL_attachMenuBot f38747c;
    public final bi d;

    public uh(bi biVar, Context context) {
        super(context);
        this.d = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i3 = bi.F4;
        org.telegram.ui.ActionBar.e6 e6Var = biVar.J0;
        rh.b bVar = new rh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.f54528a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f54529b.setVisibility(8);
        bVar.b(false);
        k9 k9Var = new k9(context);
        bVar.f54530c = k9Var;
        bVar.addView(k9Var, b8.mf.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54537x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, e6Var);
        bVar.f54535s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, e6Var);
        bVar.f54536w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, e6Var);
        bVar.a();
        this.f40008a = bVar;
        bVar.getBackupImageView().f35342a.f21247h1 = new a3(10);
        addView(this.f40008a, b8.mf.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f38747c != null && (-this.f38746b.f27150id) == this.d.R2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40008a.f(z11, z10);
        ch0 B = this.f40008a.getBackupImageView().getImageReceiver().B();
        if (z10) {
            if (z11 && B != null) {
                B.K(0);
                B.P(-1);
                B.T(false, 0.0f);
                B.start();
            }
        } else if (B != null) {
            B.stop();
            B.T(false, 0.0f);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
