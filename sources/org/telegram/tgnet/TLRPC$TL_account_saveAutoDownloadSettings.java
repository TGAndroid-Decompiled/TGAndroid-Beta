package org.telegram.tgnet;

public class TLRPC$TL_account_saveAutoDownloadSettings extends TLObject {
    public int flags;
    public boolean high;
    public boolean low;
    public TLRPC$TL_autoDownloadSettings settings;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1995661875);
        int i = this.low ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.high ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.settings.serializeToStream(abstractSerializedData);
    }
}
