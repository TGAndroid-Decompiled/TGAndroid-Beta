package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_updateDialogFiltersOrder extends TLObject {
    public static int constructor = -983318044;
    public ArrayList<Integer> order = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.order.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.order.get(i).intValue());
        }
    }
}
