package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Bool;

public class TL_account$setContentSettings extends TLObject {
    public int flags;
    public boolean sensitive_enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1250643605);
        int i = this.sensitive_enabled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
    }
}
