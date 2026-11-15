package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i50 implements org.telegram.ui.h90 {
    public final j50 f35445a;

    public i50(j50 j50Var) {
        this.f35445a = j50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i7;
        org.telegram.ui.ab abVar = this.f35445a.f35879a.f36278c.f38208e2;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.lb lbVar = abVar.f44984a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.m10.i(lbVar.getAccountInstance().f22782a).f24959n;
            i7 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
            if (new org.telegram.messenger.gj(i7, tL_channelAdminLogEvent, lbVar.f48944o0, lbVar.f48943n0, lbVar.f48934f, lbVar.U, true).U >= 0) {
                lbVar.W0();
                lbVar.F.f();
                org.telegram.ui.lb.P0(lbVar);
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
