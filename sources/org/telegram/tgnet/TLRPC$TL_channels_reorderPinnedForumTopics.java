package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_channels_reorderPinnedForumTopics extends TLObject {
    public static int constructor = 693150095;
    public TLRPC$InputChannel channel;
    public int flags;
    public boolean force;
    public ArrayList<Integer> order = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.force ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.order.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            abstractSerializedData.writeInt32(this.order.get(i2).intValue());
        }
    }
}
