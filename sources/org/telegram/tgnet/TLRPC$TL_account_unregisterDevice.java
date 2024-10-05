package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_account_unregisterDevice extends TLObject {
    public ArrayList other_uids = new ArrayList();
    public String token;
    public int token_type;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1779249670);
        abstractSerializedData.writeInt32(this.token_type);
        abstractSerializedData.writeString(this.token);
        abstractSerializedData.writeInt32(481674261);
        int size = this.other_uids.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(((Long) this.other_uids.get(i)).longValue());
        }
    }
}
