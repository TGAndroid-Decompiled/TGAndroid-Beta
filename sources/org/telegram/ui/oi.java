package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class oi extends jg0 {
    public final un f40166f;

    public oi(un unVar, Context context, int i10, org.telegram.messenger.kj kjVar) {
        super(context);
        this.f40166f = unVar;
        this.f38391a = null;
        if (!kjVar.h4()) {
            kjVar.P4();
        }
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.f38393c = zzVar;
        zzVar.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.f21021i6, -1);
        zzVar.setViewType(13);
        zzVar.setIsSingleCell(false);
        addView(zzVar, w7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.f38392b = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(19);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.E8, null);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, null);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setSingleLine();
        p80Var.setLines(1);
        p80Var.setMaxLines(1);
        addView(p80Var, w7.b6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = org.telegram.messenger.wp.r1(i10).g1(-org.telegram.messenger.kj.B0(kjVar.f16690k));
        tL_channels_getMessageAuthor.f19831id = kjVar.f1();
        p80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new org.telegram.messenger.voip.g0(this, i10, 3));
        setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false), 6, 0));
        setEnabled(false);
    }
}
