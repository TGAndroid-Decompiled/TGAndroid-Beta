package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f50 implements org.telegram.ui.g90 {
    public final g50 f33454a;

    public f50(g50 g50Var) {
        this.f33454a = g50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.bb bbVar = this.f33454a.f33832a.f34177c.f35870a2;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.mb mbVar = bbVar.f44240a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().f21729a).f24486n;
            i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (new org.telegram.messenger.ij(i7, tL_channelAdminLogEvent, mbVar.f47761n0, mbVar.m0, mbVar.f47752f, mbVar.T, true).U >= 0) {
                mbVar.W0();
                mbVar.E.f();
                org.telegram.ui.mb.P0(mbVar);
            }
        }
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void c(TLObject tLObject) {
    }
}
