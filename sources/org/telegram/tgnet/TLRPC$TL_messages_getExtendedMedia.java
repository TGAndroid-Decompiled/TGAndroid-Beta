package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_getExtendedMedia extends TLObject {
    public static int constructor = -2064119788;
    public ArrayList<Integer> f945id = new ArrayList<>();
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
        int size = this.f945id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.f945id.get(i).intValue());
        }
    }
}
