package org.telegram.tgnet;

public class TLRPC$TL_contacts_acceptContact extends TLObject {
    public static int constructor = -130964977;
    public TLRPC$InputUser f902id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.f902id.serializeToStream(abstractSerializedData);
    }
}
