package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f50 implements org.telegram.ui.g90 {
    public final g50 f33478a;

    public f50(g50 g50Var) {
        this.f33478a = g50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.bb bbVar = this.f33478a.f33865a.f34217c.f35905a2;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.mb mbVar = bbVar.f44225a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.p10.i(mbVar.getAccountInstance().f21723a).f24478n;
            i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (new org.telegram.messenger.ij(i7, tL_channelAdminLogEvent, mbVar.f47735n0, mbVar.m0, mbVar.f47726f, mbVar.T, true).U >= 0) {
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
