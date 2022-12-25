package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_getMessagesViews extends TLObject {
    public static int constructor = 1468322785;
    public ArrayList<Integer> f950id = new ArrayList<>();
    public boolean increment;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_messageViews.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.f950id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.f950id.get(i).intValue());
        }
        abstractSerializedData.writeBool(this.increment);
    }
}
