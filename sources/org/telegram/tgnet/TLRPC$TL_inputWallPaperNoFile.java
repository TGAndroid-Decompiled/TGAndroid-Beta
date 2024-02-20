package org.telegram.tgnet;
public class TLRPC$TL_inputWallPaperNoFile extends TLRPC$InputWallPaper {
    public long id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1770371538);
        abstractSerializedData.writeInt64(this.id);
    }
}
