package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_getSearchCounters extends TLObject {
    public static int constructor = 11435201;
    public ArrayList<TLRPC$MessagesFilter> filters = new ArrayList<>();
    public int flags;
    public TLRPC$InputPeer peer;
    public int top_msg_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
        int readInt32 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt32; i2++) {
            TLRPC$TL_messages_searchCounter TLdeserialize = TLRPC$TL_messages_searchCounter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return tLRPC$Vector;
            }
            tLRPC$Vector.objects.add(TLdeserialize);
        }
        return tLRPC$Vector;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.top_msg_id);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.filters.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.filters.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
