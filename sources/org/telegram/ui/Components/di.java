package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class di extends fi {
    public TLRPC.User f33953b;
    public TLRPC.TL_attachMenuBot f33954c;
    public final ki d;

    public di(ki kiVar, Context context) {
        super(context);
        this.d = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ki.I4;
        org.telegram.ui.ActionBar.e6 e6Var = kiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = e6Var;
        bVar.R = true;
        TextView textView = bVar.f55582a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f55583b.setVisibility(8);
        bVar.b(false);
        i9 i9Var = new i9(context);
        bVar.f55584c = i9Var;
        bVar.addView(i9Var, c8.ja.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f55591x = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Tl, e6Var);
        bVar.f55589s = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Rl, e6Var);
        bVar.f55590w = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Sl, e6Var);
        bVar.a();
        this.f34612a = bVar;
        bVar.getBackupImageView().f35508a.f22276h1 = new e2(17);
        addView(this.f34612a, c8.ja.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f33954c != null && (-this.f33953b.f28200id) == this.d.U2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34612a.f(z11, z10);
        ch0 B = this.f34612a.getBackupImageView().getImageReceiver().B();
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
