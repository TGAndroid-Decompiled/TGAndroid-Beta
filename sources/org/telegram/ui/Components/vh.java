package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class vh extends xh {
    public TLRPC.User f39006b;
    public TLRPC.TL_attachMenuBot f39007c;
    public final ci d;

    public vh(ci ciVar, Context context) {
        super(context);
        this.d = ciVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ci.H4;
        org.telegram.ui.ActionBar.h6 h6Var = ciVar.I0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.Q = true;
        TextView textView = bVar.f54149a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f54150b.setVisibility(8);
        bVar.b(false);
        k9 k9Var = new k9(context);
        bVar.f54151c = k9Var;
        bVar.addView(k9Var, c8.ha.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f54158x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ql, h6Var);
        bVar.f54156s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, h6Var);
        bVar.f54157w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pl, h6Var);
        bVar.a();
        this.f40307a = bVar;
        bVar.getBackupImageView().f35249a.f21200g1 = new j2(13);
        addView(this.f40307a, c8.ha.c(-1.0f, -1));
    }

    public final void a(boolean z9) {
        boolean z10;
        if (this.f39007c != null && (-this.f39006b.f27109id) == this.d.T2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40307a.f(z10, z9);
        zg0 B = this.f40307a.getBackupImageView().getImageReceiver().B();
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
