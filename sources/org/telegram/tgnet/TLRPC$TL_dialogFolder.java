package org.telegram.tgnet;

public class TLRPC$TL_dialogFolder extends TLRPC$Dialog {
    public static int constructor = 1908216652;
    public TLRPC$TL_folder folder;
    public int unread_muted_messages_count;
    public int unread_muted_peers_count;
    public int unread_unmuted_messages_count;
    public int unread_unmuted_peers_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.pinned = (readInt32 & 4) != 0;
        this.folder = TLRPC$TL_folder.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_message = abstractSerializedData.readInt32(z);
        this.unread_muted_peers_count = abstractSerializedData.readInt32(z);
        this.unread_unmuted_peers_count = abstractSerializedData.readInt32(z);
        this.unread_muted_messages_count = abstractSerializedData.readInt32(z);
        this.unread_unmuted_messages_count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.pinned ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.folder.serializeToStream(abstractSerializedData);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.top_message);
        abstractSerializedData.writeInt32(this.unread_muted_peers_count);
        abstractSerializedData.writeInt32(this.unread_unmuted_peers_count);
        abstractSerializedData.writeInt32(this.unread_muted_messages_count);
        abstractSerializedData.writeInt32(this.unread_unmuted_messages_count);
    }
}
