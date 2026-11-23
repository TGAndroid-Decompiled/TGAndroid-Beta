package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ni extends pi {
    public TLRPC.User f37838b;
    public TLRPC.TL_attachMenuBot f37839c;
    public final ui d;

    public ni(ui uiVar, Context context) {
        super(context);
        this.d = uiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ui.I4;
        org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.R = true;
        TextView textView = bVar.f56166a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f56167b.setVisibility(8);
        bVar.b(false);
        q9 q9Var = new q9(context);
        bVar.f56168c = q9Var;
        bVar.addView(q9Var, c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56175x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tl, h6Var);
        bVar.f56173s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Rl, h6Var);
        bVar.f56174w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Sl, h6Var);
        bVar.a();
        this.f38558a = bVar;
        bVar.getBackupImageView().f38789a.f22634h1 = new l2(18);
        addView(this.f38558a, c8.na.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f37839c != null && (-this.f37838b.f28547id) == this.d.U2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38558a.f(z11, z10);
        oh0 B = this.f38558a.getBackupImageView().getImageReceiver().B();
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
