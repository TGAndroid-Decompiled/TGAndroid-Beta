package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b50 implements org.telegram.ui.d90 {
    public final c50 f32086a;

    public b50(c50 c50Var) {
        this.f32086a = c50Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i3;
        org.telegram.ui.za zaVar = this.f32086a.f32565a.f32935c.f34600b2;
        if (zaVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.kb kbVar = zaVar.f52592a;
            tL_channelAdminLogEvent.user_id = org.telegram.messenger.h10.i(kbVar.getAccountInstance().f21919a).f22848n;
            i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
            if (new org.telegram.messenger.zi(i3, tL_channelAdminLogEvent, kbVar.f46875o0, kbVar.f46874n0, kbVar.f46865f, kbVar.U, true).U >= 0) {
                kbVar.W0();
                kbVar.F.f();
                org.telegram.ui.kb.P0(kbVar);
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
