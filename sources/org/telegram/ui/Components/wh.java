package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class wh extends yh {
    public TLRPC.User f40055b;
    public TLRPC.TL_attachMenuBot f40056c;
    public final di d;

    public wh(di diVar, Context context) {
        super(context);
        this.d = diVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = di.E4;
        org.telegram.ui.ActionBar.g6 g6Var = diVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.f54150a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f54151b.setVisibility(8);
        bVar.b(false);
        l9 l9Var = new l9(context);
        bVar.f54152c = l9Var;
        bVar.addView(l9Var, c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54159x = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ql, g6Var);
        bVar.f54157s = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ol, g6Var);
        bVar.f54158w = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Pl, g6Var);
        bVar.a();
        this.f40720a = bVar;
        bVar.getBackupImageView().f35647a.f21195g1 = new k2(13);
        addView(this.f40720a, c8.ha.c(-1.0f, -1));
    }

    public final void a(boolean z9) {
        boolean z10;
        if (this.f40056c != null && (-this.f40055b.f27105id) == this.d.Q2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40720a.f(z10, z9);
        ah0 B = this.f40720a.getBackupImageView().getImageReceiver().B();
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
