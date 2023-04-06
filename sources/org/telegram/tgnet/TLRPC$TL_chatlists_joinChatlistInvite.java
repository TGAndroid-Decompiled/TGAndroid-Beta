package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_chatlists_joinChatlistInvite extends TLObject {
    public static int constructor = -1498291302;
    public ArrayList<TLRPC$InputPeer> peers = new ArrayList<>();
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.slug);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.peers.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
