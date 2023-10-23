package org.telegram.tgnet;
public class TLRPC$TL_account_setContactSignUpNotification extends TLObject {
    public boolean silent;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-806076575);
        abstractSerializedData.writeBool(this.silent);
    }
}
