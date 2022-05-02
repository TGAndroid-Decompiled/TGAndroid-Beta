package org.telegram.tgnet;

public class TLRPC$TL_help_acceptTermsOfService extends TLObject {
    public static int constructor = -294455398;
    public TLRPC$TL_dataJSON id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.id.serializeToStream(abstractSerializedData);
    }
}
