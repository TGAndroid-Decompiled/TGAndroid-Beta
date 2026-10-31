package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class vh extends xh {
    public TLRPC.User f31256b;
    public TLRPC.TL_attachMenuBot f31257c;
    public final bi d;

    public vh(bi biVar, Context context) {
        super(context);
        this.d = biVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i10 = bi.E4;
        org.telegram.ui.ActionBar.p6 p6Var = biVar.I0;
        gh.b bVar = new gh.b(context);
        bVar.d = p6Var;
        bVar.Q = true;
        TextView textView = bVar.f7518a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        bVar.f7519b.setVisibility(8);
        bVar.b(false);
        g9 g9Var = new g9(context);
        bVar.f7520c = g9Var;
        bVar.addView(g9Var, w7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f7526x = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ql, p6Var);
        bVar.f7524s = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, p6Var);
        bVar.f7525w = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Pl, p6Var);
        bVar.a();
        this.f32471a = bVar;
        bVar.getBackupImageView().f26292a.f14382g1 = new v1(27);
        addView(this.f32471a, w7.b6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f31257c != null && (-this.f31256b.f19942id) == this.d.Q2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32471a.f(z11, z10);
        bi0 B = this.f32471a.getBackupImageView().getImageReceiver().B();
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
