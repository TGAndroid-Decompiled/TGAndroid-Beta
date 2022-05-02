package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_reorderPinnedDialogs extends TLObject {
    public static int constructor = 991616823;
    public int flags;
    public int folder_id;
    public boolean force;
    public ArrayList<TLRPC$InputDialogPeer> order = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.force ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.folder_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.order.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.order.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
