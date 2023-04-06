package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_chatlists_joinChatlistUpdates extends TLObject {
    public static int constructor = -527828747;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;
    public ArrayList<TLRPC$InputPeer> peers = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chatlist.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.peers.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
