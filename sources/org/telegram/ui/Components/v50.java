package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v50 implements org.telegram.ui.ka0 {
    public final w50 f31181a;

    public v50(w50 w50Var) {
        this.f31181a = w50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.gb gbVar = this.f31181a.f32085a.f32426c.a2;
        if (gbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.sb sbVar = gbVar.f37440a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.e20.i(sbVar.getAccountInstance().f15043a).f15524n;
            i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (new org.telegram.messenger.kj(i10, tL_channelAdminLogEvent, sbVar.f41318n0, sbVar.m0, sbVar.f41309f, sbVar.T, true).U >= 0) {
                sbVar.W0();
                sbVar.E.f();
                org.telegram.ui.sb.P0(sbVar);
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
