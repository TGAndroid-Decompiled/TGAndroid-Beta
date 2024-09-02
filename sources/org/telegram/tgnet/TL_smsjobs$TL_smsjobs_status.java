package org.telegram.tgnet;

public class TL_smsjobs$TL_smsjobs_status extends TLObject {
    public boolean allow_international;
    public int flags;
    public String last_gift_slug;
    public int recent_remains;
    public int recent_sent;
    public int recent_since;
    public String terms_url;
    public int total_sent;
    public int total_since;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.allow_international = (readInt32 & 1) != 0;
        this.recent_sent = abstractSerializedData.readInt32(z);
        this.recent_since = abstractSerializedData.readInt32(z);
        this.recent_remains = abstractSerializedData.readInt32(z);
        this.total_sent = abstractSerializedData.readInt32(z);
        this.total_since = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.last_gift_slug = abstractSerializedData.readString(z);
        }
        this.terms_url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(720277905);
        int i = this.allow_international ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.recent_sent);
        abstractSerializedData.writeInt32(this.recent_since);
        abstractSerializedData.writeInt32(this.recent_remains);
        abstractSerializedData.writeInt32(this.total_sent);
        abstractSerializedData.writeInt32(this.total_since);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.last_gift_slug);
        }
        abstractSerializedData.writeString(this.terms_url);
    }
}
