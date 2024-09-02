package org.telegram.tgnet;

public class TLRPC$TL_exportedMessageLink extends TLObject {
    public String html;
    public String link;

    public static TLRPC$TL_exportedMessageLink TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1571494644 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_exportedMessageLink", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_exportedMessageLink tLRPC$TL_exportedMessageLink = new TLRPC$TL_exportedMessageLink();
        tLRPC$TL_exportedMessageLink.readParams(abstractSerializedData, z);
        return tLRPC$TL_exportedMessageLink;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.link = abstractSerializedData.readString(z);
        this.html = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1571494644);
        abstractSerializedData.writeString(this.link);
        abstractSerializedData.writeString(this.html);
    }
}
