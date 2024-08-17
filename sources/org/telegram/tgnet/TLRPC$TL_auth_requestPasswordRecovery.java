package org.telegram.tgnet;

public class TLRPC$TL_auth_requestPasswordRecovery extends TLObject {
    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_auth_passwordRecovery.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-661144474);
    }
}
