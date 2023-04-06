package org.telegram.tgnet;
public class TLRPC$TL_inputChatlistDialogFilter extends TLObject {
    public static int constructor = -203367885;
    public int filter_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.filter_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.filter_id);
    }
}
