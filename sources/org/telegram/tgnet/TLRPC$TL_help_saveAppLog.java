package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_help_saveAppLog extends TLObject {
    public ArrayList<TLRPC$TL_inputAppEvent> events = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1862465352);
        abstractSerializedData.writeInt32(481674261);
        int size = this.events.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.events.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
