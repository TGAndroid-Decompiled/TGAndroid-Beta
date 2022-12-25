package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_getChannels extends TLObject {
    public static int constructor = 176122811;
    public ArrayList<TLRPC$InputChannel> f888id = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Chats.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.f888id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.f888id.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
