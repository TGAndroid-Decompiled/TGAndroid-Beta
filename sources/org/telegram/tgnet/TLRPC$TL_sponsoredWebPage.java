package org.telegram.tgnet;
public class TLRPC$TL_sponsoredWebPage extends TLObject {
    public int flags;
    public TLRPC$Photo photo;
    public String site_name;
    public String url;

    public static TLRPC$TL_sponsoredWebPage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1035529315 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_sponsoredWebPage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_sponsoredWebPage tLRPC$TL_sponsoredWebPage = new TLRPC$TL_sponsoredWebPage();
        tLRPC$TL_sponsoredWebPage.readParams(abstractSerializedData, z);
        return tLRPC$TL_sponsoredWebPage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.url = abstractSerializedData.readString(z);
        this.site_name = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1035529315);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeString(this.site_name);
        if ((this.flags & 1) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
    }
}
