package org.telegram.tgnet;

public class TLRPC$TL_phone_joinGroupCallPresentation extends TLObject {
    public static int constructor = -873829436;
    public TLRPC$TL_inputGroupCall call;
    public TLRPC$TL_dataJSON params;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.call.serializeToStream(abstractSerializedData);
        this.params.serializeToStream(abstractSerializedData);
    }
}
