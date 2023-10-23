package org.telegram.tgnet;
public class TLRPC$TL_phone_saveCallDebug extends TLObject {
    public TLRPC$TL_dataJSON debug;
    public TLRPC$TL_inputPhoneCall peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(662363518);
        this.peer.serializeToStream(abstractSerializedData);
        this.debug.serializeToStream(abstractSerializedData);
    }
}
