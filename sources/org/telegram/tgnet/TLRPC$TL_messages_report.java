package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_report extends TLObject {
    public ArrayList id = new ArrayList();
    public String message;
    public byte[] option;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$ReportResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-59199589);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.id.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(((Integer) this.id.get(i)).intValue());
        }
        abstractSerializedData.writeByteArray(this.option);
        abstractSerializedData.writeString(this.message);
    }
}
