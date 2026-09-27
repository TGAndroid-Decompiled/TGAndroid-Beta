package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x60 implements org.telegram.ui.tb0 {
    public final y60 f30316a;

    public x60(y60 y60Var) {
        this.f30316a = y60Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.jb jbVar = this.f30316a.f30592a.f30861c.f23951j0;
        if (jbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.wb wbVar = jbVar.f34685a;
            tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.o2) wbVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f38886n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f38877f, wbVar.T, true).contentType >= 0) {
                wbVar.R0();
                wbVar.E.l();
                org.telegram.ui.wb.K0(wbVar);
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
