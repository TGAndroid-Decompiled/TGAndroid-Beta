package org.telegram.tgnet;

public class TLRPC$TL_dialogFilterChatlist extends TLRPC$DialogFilter {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.has_my_invites = (readInt32 & 67108864) != 0;
        this.id = abstractSerializedData.readInt32(z);
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 33554432) != 0) {
            this.emoticon = abstractSerializedData.readString(z);
        }
        if ((this.flags & 134217728) != 0) {
            this.color = abstractSerializedData.readInt32(z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$InputPeer TLdeserialize = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.pinned_peers.add(TLdeserialize);
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            TLRPC$InputPeer TLdeserialize2 = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.include_peers.add(TLdeserialize2);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1612542300);
        int i = this.has_my_invites ? this.flags | 67108864 : this.flags & (-67108865);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & 33554432) != 0) {
            abstractSerializedData.writeString(this.emoticon);
        }
        if ((this.flags & 134217728) != 0) {
            abstractSerializedData.writeInt32(this.color);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.pinned_peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.pinned_peers.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.include_peers.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.include_peers.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
