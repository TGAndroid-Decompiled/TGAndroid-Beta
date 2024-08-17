package org.telegram.tgnet;

public class TLRPC$TL_urlAuthResultRequest extends TLRPC$UrlAuthResult {
    public TLRPC$User bot;
    public String domain;
    public int flags;
    public boolean request_write_access;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.request_write_access = (readInt32 & 1) != 0;
        this.bot = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.domain = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1831650802);
        int i = this.request_write_access ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.domain);
    }
}
