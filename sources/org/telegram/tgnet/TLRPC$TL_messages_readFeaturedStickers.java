package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_readFeaturedStickers extends TLObject {
    public static int constructor = 1527873830;
    public ArrayList<Long> f955id = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.f955id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(this.f955id.get(i).longValue());
        }
    }
}
