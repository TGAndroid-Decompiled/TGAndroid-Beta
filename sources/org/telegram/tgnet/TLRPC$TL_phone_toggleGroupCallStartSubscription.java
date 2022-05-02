package org.telegram.tgnet;

public class TLRPC$TL_phone_toggleGroupCallStartSubscription extends TLObject {
    public static int constructor = 563885286;
    public TLRPC$TL_inputGroupCall call;
    public boolean subscribed;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.subscribed);
    }
}
