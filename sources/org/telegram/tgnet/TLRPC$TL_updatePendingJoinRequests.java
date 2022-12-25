package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_updatePendingJoinRequests extends TLRPC$Update {
    public static int constructor = 1885586395;
    public TLRPC$Peer peer;
    public ArrayList<Long> recent_requesters = new ArrayList<>();
    public int requests_pending;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.requests_pending = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.recent_requesters.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.requests_pending);
        abstractSerializedData.writeInt32(481674261);
        int size = this.recent_requesters.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(this.recent_requesters.get(i).longValue());
        }
    }
}
