package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputPeer;

public class TL_stars$TL_payments_getStarsTransactions extends TLObject {
    public int flags;
    public boolean inbound;
    public String offset;
    public boolean outbound;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_stars$TL_payments_starsStatus.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1731904249);
        int i = this.inbound ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.outbound ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.offset);
    }
}
