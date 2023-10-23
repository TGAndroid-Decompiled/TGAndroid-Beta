package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;
public class TLRPC$TL_messageService extends TLRPC$Message {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.out = (readInt32 & 2) != 0;
        this.mentioned = (readInt32 & 16) != 0;
        this.media_unread = (readInt32 & 32) != 0;
        this.silent = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
        this.post = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
        this.legacy = (readInt32 & 524288) != 0;
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 8) != 0) {
            this.reply_to = TLRPC$MessageReplyHeader.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
            this.ttl_period = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(721967202);
        int i = this.out ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.mentioned ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.media_unread ? i2 | 32 : i2 & (-33);
        this.flags = i3;
        int i4 = this.silent ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i3 & (-8193);
        this.flags = i4;
        int i5 = this.post ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i4 & (-16385);
        this.flags = i5;
        int i6 = this.legacy ? i5 | 524288 : i5 & (-524289);
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        this.peer_id.serializeToStream(abstractSerializedData);
        if ((this.flags & 8) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.date);
        this.action.serializeToStream(abstractSerializedData);
        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
    }
}
