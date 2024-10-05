package org.telegram.tgnet;

public class TLRPC$TL_inputInvoiceStarGift extends TLRPC$InputInvoice {
    public int flags;
    public long gift_id;
    public boolean hide_name;
    public TLRPC$TL_textWithEntities message;
    public TLRPC$InputPeer user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.hide_name = (readInt32 & 1) != 0;
        this.user_id = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.gift_id = abstractSerializedData.readInt64(z);
        if ((this.flags & 2) != 0) {
            this.message = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(634962392);
        int i = this.hide_name ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.user_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.gift_id);
        if ((this.flags & 2) != 0) {
            this.message.serializeToStream(abstractSerializedData);
        }
    }
}
