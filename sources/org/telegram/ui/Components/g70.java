package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g70 implements org.telegram.ui.cb0 {
    public final h70 f28472a;

    public g70(h70 h70Var) {
        this.f28472a = h70Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.jb jbVar = this.f28472a.f28853a.f29204c.f30895j0;
        if (jbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.wb wbVar = jbVar.f40546a;
            tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f45074n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f45065f, wbVar.T, true).contentType >= 0) {
                wbVar.S0();
                wbVar.E.l();
                org.telegram.ui.wb.L0(wbVar);
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
