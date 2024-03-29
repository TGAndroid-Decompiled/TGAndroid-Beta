package org.telegram.tgnet;
public class TLRPC$TL_updateWebPage extends TLRPC$Update {
    public int pts;
    public int pts_count;
    public TLRPC$WebPage webpage;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.webpage = TLRPC$WebPage.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.pts = abstractSerializedData.readInt32(z);
        this.pts_count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2139689491);
        this.webpage.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.pts);
        abstractSerializedData.writeInt32(this.pts_count);
    }
}
