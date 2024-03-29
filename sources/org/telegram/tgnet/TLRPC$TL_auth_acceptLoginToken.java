package org.telegram.tgnet;
public class TLRPC$TL_auth_acceptLoginToken extends TLObject {
    public byte[] token;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_authorization.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-392909491);
        abstractSerializedData.writeByteArray(this.token);
    }
}
