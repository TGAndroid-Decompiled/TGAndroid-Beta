package org.telegram.tgnet;
public class TLRPC$TL_phone_joinGroupCall extends TLObject {
    public static int constructor = -1322057861;
    public TLRPC$TL_inputGroupCall call;
    public int flags;
    public String invite_hash;
    public TLRPC$InputPeer join_as;
    public boolean muted;
    public TLRPC$TL_dataJSON params;
    public boolean video_stopped;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.muted ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.video_stopped ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.call.serializeToStream(abstractSerializedData);
        this.join_as.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.invite_hash);
        }
        this.params.serializeToStream(abstractSerializedData);
    }
}
