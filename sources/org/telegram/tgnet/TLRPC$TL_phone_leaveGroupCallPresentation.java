package org.telegram.tgnet;
public class TLRPC$TL_phone_leaveGroupCallPresentation extends TLObject {
    public static int constructor = 475058500;
    public TLRPC$TL_inputGroupCall call;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.call.serializeToStream(abstractSerializedData);
    }
}
