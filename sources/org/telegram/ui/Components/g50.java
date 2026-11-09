package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g50 implements org.telegram.ui.i90 {
    public final h50 f33873a;

    public g50(h50 h50Var) {
        this.f33873a = h50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.bb bbVar = this.f33873a.f34208a.f34575c.f36254a2;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.mb mbVar = bbVar.f43947a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().f21765a).f24489n;
            i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (new org.telegram.messenger.ij(i7, tL_channelAdminLogEvent, mbVar.f47823n0, mbVar.m0, mbVar.f47814f, mbVar.T, true).U >= 0) {
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
