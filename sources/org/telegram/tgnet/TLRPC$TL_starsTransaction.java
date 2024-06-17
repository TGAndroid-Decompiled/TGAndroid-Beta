package org.telegram.tgnet;

public class TLRPC$TL_starsTransaction extends TLObject {
    public int date;
    public String description;
    public int flags;
    public String id;
    public TLRPC$StarsTransactionPeer peer;
    public TLRPC$WebDocument photo;
    public boolean refund;
    public long stars;
    public String title;

    public static TLRPC$TL_starsTransaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-865044046 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsTransaction", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_starsTransaction tLRPC$TL_starsTransaction = new TLRPC$TL_starsTransaction();
        tLRPC$TL_starsTransaction.readParams(abstractSerializedData, z);
        return tLRPC$TL_starsTransaction;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.refund = (readInt32 & 8) != 0;
        this.id = abstractSerializedData.readString(z);
        this.stars = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$StarsTransactionPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.description = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-865044046);
        int i = this.refund ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.stars);
        abstractSerializedData.writeInt32(this.date);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.description);
        }
        if ((this.flags & 4) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
    }
}
