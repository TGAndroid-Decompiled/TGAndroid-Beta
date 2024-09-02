package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_deleteScheduledMessages extends TLObject {
    public ArrayList<Integer> id = new ArrayList<>();
    public TLRPC$InputPeer peer;

    public static TLRPC$TL_messages_deleteScheduledMessages TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1504586518 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_deleteScheduledMessages", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_deleteScheduledMessages tLRPC$TL_messages_deleteScheduledMessages = new TLRPC$TL_messages_deleteScheduledMessages();
        tLRPC$TL_messages_deleteScheduledMessages.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_deleteScheduledMessages;
    }

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
        } else {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.id.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1504586518);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.id.get(i).intValue());
        }
    }
}
