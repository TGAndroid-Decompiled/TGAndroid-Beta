package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class wh extends yh {
    public TLRPC.User f39976b;
    public TLRPC.TL_attachMenuBot f39977c;
    public final di d;

    public wh(di diVar, Context context) {
        super(context);
        this.d = diVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = di.E4;
        org.telegram.ui.ActionBar.f6 f6Var = diVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f54044a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f54045b.setVisibility(8);
        bVar.b(false);
        l9 l9Var = new l9(context);
        bVar.f54046c = l9Var;
        bVar.addView(l9Var, c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54053x = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ql, f6Var);
        bVar.f54051s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ol, f6Var);
        bVar.f54052w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pl, f6Var);
        bVar.a();
        this.f40646a = bVar;
        bVar.getBackupImageView().f35582a.f21192g1 = new k2(13);
        addView(this.f40646a, c8.ha.c(-1.0f, -1));
    }

    public final void a(boolean z9) {
        boolean z10;
        if (this.f39977c != null && (-this.f39976b.f27102id) == this.d.Q2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40646a.f(z10, z9);
        zg0 B = this.f40646a.getBackupImageView().getImageReceiver().B();
        if (z9) {
            if (z10 && B != null) {
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
