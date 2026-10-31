package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v50 implements org.telegram.ui.la0 {
    public final w50 f31146a;

    public v50(w50 w50Var) {
        this.f31146a = w50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.gb gbVar = this.f31146a.f32007a.f32356c.a2;
        if (gbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.sb sbVar = gbVar.f37500a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.d20.i(sbVar.getAccountInstance().f14863a).f15165n;
            i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (new org.telegram.messenger.jj(i10, tL_channelAdminLogEvent, sbVar.f41442n0, sbVar.m0, sbVar.f41433f, sbVar.T, true).U >= 0) {
                sbVar.V0();
                sbVar.E.f();
                org.telegram.ui.sb.O0(sbVar);
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
