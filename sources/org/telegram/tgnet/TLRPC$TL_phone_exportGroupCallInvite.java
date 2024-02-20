package org.telegram.tgnet;
public class TLRPC$TL_phone_exportGroupCallInvite extends TLObject {
    public TLRPC$TL_inputGroupCall call;
    public boolean can_self_unmute;
    public int flags;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_phone_exportedGroupCallInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-425040769);
        int i = this.can_self_unmute ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.call.serializeToStream(abstractSerializedData);
    }
}
