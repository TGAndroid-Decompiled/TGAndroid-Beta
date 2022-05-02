package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_setChatAvailableReactions extends TLObject {
    public static int constructor = 335875750;
    public ArrayList<String> available_reactions = new ArrayList<>();
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.available_reactions.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeString(this.available_reactions.get(i));
        }
    }
}
