package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g60 implements org.telegram.ui.db0 {
    public final h60 f28768a;

    public g60(h60 h60Var) {
        this.f28768a = h60Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.ab abVar = this.f28768a.f29073a.f29327c.f30893f0;
        if (abVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.ob obVar = abVar.f36500a;
            tL_channelAdminLogEvent.user_id = obVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) obVar.f41060n0, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.f41066s, obVar.T, true).contentType >= 0) {
                obVar.R0();
                obVar.E.l();
                org.telegram.ui.ob.K0(obVar);
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
