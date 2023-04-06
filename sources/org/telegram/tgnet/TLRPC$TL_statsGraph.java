package org.telegram.tgnet;
public class TLRPC$TL_statsGraph extends TLRPC$StatsGraph {
    public static int constructor = -1901828938;
    public int flags;
    public TLRPC$TL_dataJSON json;
    public String zoom_token;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.json = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.zoom_token = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.json.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.zoom_token);
        }
    }
}
