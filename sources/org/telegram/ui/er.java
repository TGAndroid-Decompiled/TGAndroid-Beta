package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements kq {
    public final TLObject f33387a;
    public final sr f33388b;

    public er(sr srVar, TLObject tLObject) {
        this.f33388b = srVar;
        this.f33387a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f33388b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33387a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f33388b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
