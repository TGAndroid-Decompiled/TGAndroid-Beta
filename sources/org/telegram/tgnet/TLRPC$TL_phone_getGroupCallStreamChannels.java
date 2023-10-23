package org.telegram.tgnet;
public class TLRPC$TL_phone_getGroupCallStreamChannels extends TLObject {
    public TLRPC$TL_inputGroupCall call;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_phone_groupCallStreamChannels.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(447879488);
        this.call.serializeToStream(abstractSerializedData);
    }
}
