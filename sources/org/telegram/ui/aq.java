package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements jp {
    public final TLObject f43755a;
    public final long f43756b;
    public final boolean f43757c;
    public final qq d;

    public aq(qq qqVar, TLObject tLObject, long j3, boolean z9) {
        this.d = qqVar;
        this.f43755a = tLObject;
        this.f43756b = j3;
        this.f43757c = z9;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43755a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qq qqVar = this.d;
        jq jqVar = qqVar.l1;
        long j3 = this.f43756b;
        if (jqVar != null && i7 == 1) {
            jqVar.b(j3);
        } else if (jqVar != null) {
            jqVar.c(j3, tLObject);
        }
        if (this.f43757c) {
            qqVar.removeSelfFromStack();
        }
    }
}
