package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t50 implements org.telegram.ui.ab0 {
    public final u50 f32628a;

    public t50(u50 u50Var) {
        this.f32628a = u50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i9;
        org.telegram.ui.bb bbVar = this.f32628a.f32924a.f33265c.f26685f0;
        if (bbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.pb pbVar = bbVar.f36807a;
            tL_channelAdminLogEvent.user_id = pbVar.getAccountInstance().getUserConfig().clientUserId;
            i9 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
            if (new MessageObject(i9, tL_channelAdminLogEvent, (ArrayList<MessageObject>) pbVar.f41412n0, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.f41418s, pbVar.T, true).contentType >= 0) {
                pbVar.R0();
                pbVar.E.l();
                org.telegram.ui.pb.K0(pbVar);
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
