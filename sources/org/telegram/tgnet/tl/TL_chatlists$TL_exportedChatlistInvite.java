package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;

public class TL_chatlists$TL_exportedChatlistInvite extends TLObject {
    public int flags;
    public ArrayList peers = new ArrayList();
    public boolean revoked;
    public String title;
    public String url;

    public static TL_chatlists$TL_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (206668204 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_exportedChatlistInvite", Integer.valueOf(i)));
            }
            return null;
        }
        TL_chatlists$TL_exportedChatlistInvite tL_chatlists$TL_exportedChatlistInvite = new TL_chatlists$TL_exportedChatlistInvite();
        tL_chatlists$TL_exportedChatlistInvite.readParams(abstractSerializedData, z);
        return tL_chatlists$TL_exportedChatlistInvite;
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
        abstractSerializedData.writeInt32(206668204);
        int i = this.revoked ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((TLRPC$Peer) this.peers.get(i2)).serializeToStream(abstractSerializedData);
        }
    }
}
