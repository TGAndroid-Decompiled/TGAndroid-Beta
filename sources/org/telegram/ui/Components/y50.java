package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class y50 implements org.telegram.ui.eb0 {

    public final z50 f34819a;

    public y50(z50 z50Var) {
        this.f34819a = z50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        org.telegram.ui.cb cbVar = this.f34819a.f35155a.f26642c.f28279f0;
        if (cbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.qb qbVar = cbVar.f37041a;
            tL_channelAdminLogEvent.user_id = qbVar.getAccountInstance().getUserConfig().clientUserId;
            if (new MessageObject(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) qbVar.f41608n0, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.f41614s, qbVar.T, true).contentType < 0) {
                return;
            }
            qbVar.R0();
            qbVar.E.l();
            org.telegram.ui.qb.K0(qbVar);
        }
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void c(TLObject tLObject) {
    }
}
