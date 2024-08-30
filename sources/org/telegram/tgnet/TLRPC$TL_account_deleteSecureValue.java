package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_account_deleteSecureValue extends TLObject {
    public ArrayList types = new ArrayList();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1199522741);
        abstractSerializedData.writeInt32(481674261);
        int size = this.types.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            ((TLRPC$SecureValueType) this.types.get(i)).serializeToStream(abstractSerializedData);
        }
    }
}
