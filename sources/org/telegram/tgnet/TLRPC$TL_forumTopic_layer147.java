package org.telegram.tgnet;

public class TLRPC$TL_forumTopic_layer147 extends TLRPC$TL_forumTopic {
    public static int constructor = 1495324380;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.f902my = (readInt32 & 2) != 0;
        this.closed = (readInt32 & 4) != 0;
        this.pinned = (readInt32 & 8) != 0;
        this.f901id = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
        this.icon_color = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.icon_emoji_id = abstractSerializedData.readInt64(z);
        }
        this.top_message = abstractSerializedData.readInt32(z);
        this.read_inbox_max_id = abstractSerializedData.readInt32(z);
        this.read_outbox_max_id = abstractSerializedData.readInt32(z);
        this.unread_count = abstractSerializedData.readInt32(z);
        this.unread_mentions_count = abstractSerializedData.readInt32(z);
        this.unread_reactions_count = abstractSerializedData.readInt32(z);
        this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.f902my ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.closed ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.pinned ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeInt32(this.f901id);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(this.icon_color);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.icon_emoji_id);
        }
        abstractSerializedData.writeInt32(this.top_message);
        abstractSerializedData.writeInt32(this.read_inbox_max_id);
        abstractSerializedData.writeInt32(this.read_outbox_max_id);
        abstractSerializedData.writeInt32(this.unread_count);
        abstractSerializedData.writeInt32(this.unread_mentions_count);
        abstractSerializedData.writeInt32(this.unread_reactions_count);
        this.from_id.serializeToStream(abstractSerializedData);
        this.notify_settings.serializeToStream(abstractSerializedData);
    }
}
