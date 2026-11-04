package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ph extends ye0 {
    public final wm f48577f;

    public ph(wm wmVar, Context context, int i3, org.telegram.messenger.zi ziVar) {
        super(context);
        this.f48577f = wmVar;
        this.f52264a = null;
        if (!ziVar.i4()) {
            ziVar.Q4();
        }
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.f52266c = izVar;
        izVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f27972i6, -1);
        izVar.setViewType(13);
        izVar.setIsSingleCell(false);
        addView(izVar, b8.mf.c(-1.0f, -2));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.f52265b = s70Var;
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(19);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.E8, null);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        s70Var.setSingleLine();
        s70Var.setLines(1);
        s70Var.setMaxLines(1);
        addView(s70Var, b8.mf.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.hp.s1(i3).h1(-org.telegram.messenger.zi.B0(ziVar.f26868k));
        tL_channels_getMessageAuthor.f27038id = ziVar.f1();
        s70Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i3).sendRequest(tL_channels_getMessageAuthor, new ci.a2(this, i3, 8));
        setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false), 6, 0));
        setEnabled(false);
    }
}
