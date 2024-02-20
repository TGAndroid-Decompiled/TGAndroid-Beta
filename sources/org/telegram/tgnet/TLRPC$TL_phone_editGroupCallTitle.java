package org.telegram.tgnet;
public class TLRPC$TL_phone_editGroupCallTitle extends TLObject {
    public TLRPC$TL_inputGroupCall call;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(480685066);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
    }
}
