package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_exportedChatlistInvite extends TLObject {
    public static int constructor = 206668204;
    public int flags;
    public ArrayList<TLRPC$Peer> peers = new ArrayList<>();
    public boolean revoked;
    public String title;
    public String url;

    public static TLRPC$TL_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_exportedChatlistInvite", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_exportedChatlistInvite tLRPC$TL_exportedChatlistInvite = new TLRPC$TL_exportedChatlistInvite();
        tLRPC$TL_exportedChatlistInvite.readParams(abstractSerializedData, z);
        return tLRPC$TL_exportedChatlistInvite;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.revoked = (readInt32 & 1) != 0;
        this.title = abstractSerializedData.readString(z);
        this.url = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.peers.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.revoked ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.peers.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
