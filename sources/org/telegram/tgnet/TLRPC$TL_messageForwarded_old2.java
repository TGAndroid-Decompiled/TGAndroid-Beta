package org.telegram.tgnet;

import android.text.TextUtils;

public class TLRPC$TL_messageForwarded_old2 extends TLRPC$Message {
    public static int constructor = -1553471722;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.unread = (readInt32 & 1) != 0;
        this.out = (readInt32 & 2) != 0;
        this.mentioned = (readInt32 & 16) != 0;
        this.media_unread = (readInt32 & 32) != 0;
        this.f872id = abstractSerializedData.readInt32(z);
        TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
        this.fwd_from = tLRPC$TL_messageFwdHeader;
        tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
        this.fwd_from.from_id.user_id = abstractSerializedData.readInt32(z);
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
        tLRPC$MessageFwdHeader.flags |= 1;
        tLRPC$MessageFwdHeader.date = abstractSerializedData.readInt32(z);
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        this.from_id = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = abstractSerializedData.readInt32(z);
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.date = abstractSerializedData.readInt32(z);
        this.message = abstractSerializedData.readString(z);
        this.flags |= 772;
        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.media = TLdeserialize;
        if (TLdeserialize == null || TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
            return;
        }
        this.message = this.media.captionLegacy;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.unread ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.out ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
        this.flags = i3;
        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        abstractSerializedData.writeInt32(this.f872id);
        abstractSerializedData.writeInt32((int) this.fwd_from.from_id.user_id);
        abstractSerializedData.writeInt32(this.fwd_from.date);
        abstractSerializedData.writeInt32((int) this.from_id.user_id);
        this.peer_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.message);
        this.media.serializeToStream(abstractSerializedData);
    }
}
