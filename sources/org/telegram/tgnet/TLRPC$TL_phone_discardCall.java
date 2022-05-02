package org.telegram.tgnet;

public class TLRPC$TL_phone_discardCall extends TLObject {
    public static int constructor = -1295269440;
    public long connection_id;
    public int duration;
    public int flags;
    public TLRPC$TL_inputPhoneCall peer;
    public TLRPC$PhoneCallDiscardReason reason;
    public boolean video;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.video ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.duration);
        this.reason.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.connection_id);
    }
}
