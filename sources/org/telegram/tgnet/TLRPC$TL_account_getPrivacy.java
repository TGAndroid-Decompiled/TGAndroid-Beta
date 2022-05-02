package org.telegram.tgnet;

public class TLRPC$TL_account_getPrivacy extends TLObject {
    public static int constructor = -623130288;
    public TLRPC$InputPrivacyKey key;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_privacyRules.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.key.serializeToStream(abstractSerializedData);
    }
}
