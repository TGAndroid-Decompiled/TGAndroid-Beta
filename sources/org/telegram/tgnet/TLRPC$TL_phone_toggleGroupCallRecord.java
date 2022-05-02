package org.telegram.tgnet;

public class TLRPC$TL_phone_toggleGroupCallRecord extends TLObject {
    public static int constructor = -248985848;
    public TLRPC$TL_inputGroupCall call;
    public int flags;
    public boolean start;
    public String title;
    public boolean video;
    public boolean video_portrait;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.start ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.video ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.call.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeBool(this.video_portrait);
        }
    }
}
