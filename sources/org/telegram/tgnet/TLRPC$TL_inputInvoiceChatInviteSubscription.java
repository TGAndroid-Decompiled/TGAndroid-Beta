package org.telegram.tgnet;
public class TLRPC$TL_inputInvoiceChatInviteSubscription extends TLRPC$InputInvoice {
    public String hash;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.hash = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(887591921);
        abstractSerializedData.writeString(this.hash);
    }
}
