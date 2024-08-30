package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_translateResult extends TLObject {
    public ArrayList result = new ArrayList();

    public static TLRPC$TL_messages_translateResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (870003448 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_translateResult", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_translateResult tLRPC$TL_messages_translateResult = new TLRPC$TL_messages_translateResult();
        tLRPC$TL_messages_translateResult.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_translateResult;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_textWithEntities TLdeserialize = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.result.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(870003448);
        abstractSerializedData.writeInt32(481674261);
        int size = this.result.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$TL_textWithEntities) this.result.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
