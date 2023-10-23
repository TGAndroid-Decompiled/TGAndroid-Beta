package org.telegram.tgnet;
public class TLRPC$TL_messages_setDefaultHistoryTTL extends TLObject {
    public int period;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1632299963);
        abstractSerializedData.writeInt32(this.period);
    }
}
