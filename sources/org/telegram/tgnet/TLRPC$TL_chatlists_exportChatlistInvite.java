package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_chatlists_exportChatlistInvite extends TLObject {
    public static int constructor = -2072885362;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;
    public ArrayList<TLRPC$InputPeer> peers = new ArrayList<>();
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_chatlists_exportedChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.chatlist.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(481674261);
        int size = this.peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.peers.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
