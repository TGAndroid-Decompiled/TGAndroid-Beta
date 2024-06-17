package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_statsGroupTopInviter extends TLObject {
    public int invitations;
    public long user_id;

    public static TL_stats$TL_statsGroupTopInviter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1398765469 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsGroupTopInviter", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_statsGroupTopInviter tL_stats$TL_statsGroupTopInviter = new TL_stats$TL_statsGroupTopInviter();
        tL_stats$TL_statsGroupTopInviter.readParams(abstractSerializedData, z);
        return tL_stats$TL_statsGroupTopInviter;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.invitations = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1398765469);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.invitations);
    }
}
