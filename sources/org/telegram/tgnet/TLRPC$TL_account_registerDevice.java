package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_account_registerDevice extends TLObject {
    public boolean app_sandbox;
    public int flags;
    public boolean no_muted;
    public ArrayList<Long> other_uids = new ArrayList<>();
    public byte[] secret;
    public String token;
    public int token_type;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-326762118);
        int i = this.no_muted ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.token_type);
        abstractSerializedData.writeString(this.token);
        abstractSerializedData.writeBool(this.app_sandbox);
        abstractSerializedData.writeByteArray(this.secret);
        abstractSerializedData.writeInt32(481674261);
        int size = this.other_uids.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            abstractSerializedData.writeInt64(this.other_uids.get(i2).longValue());
        }
    }
}
