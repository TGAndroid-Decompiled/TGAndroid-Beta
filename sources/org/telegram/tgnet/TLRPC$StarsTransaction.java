package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$StarsTransaction extends TLObject {
    public byte[] bot_payload;
    public int date;
    public String description;
    public ArrayList<TLRPC$MessageMedia> extended_media = new ArrayList<>();
    public boolean failed;
    public int flags;
    public String id;
    public int msg_id;
    public TLRPC$StarsTransactionPeer peer;
    public boolean pending;
    public TLRPC$WebDocument photo;
    public boolean refund;
    public long stars;
    public String title;
    public int transaction_date;
    public String transaction_url;

    public static TLRPC$StarsTransaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StarsTransaction tLRPC$TL_starsTransaction = i != -1442789224 ? i != -865044046 ? i != 766853519 ? null : new TLRPC$TL_starsTransaction() : new TLRPC$StarsTransaction() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.refund = (readInt32 & 8) != 0;
                this.id = abstractSerializedData2.readString(z2);
                this.stars = abstractSerializedData2.readInt64(z2);
                this.date = abstractSerializedData2.readInt32(z2);
                this.peer = TLRPC$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                if ((this.flags & 1) != 0) {
                    this.title = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 2) != 0) {
                    this.description = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-865044046);
                int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt64(this.stars);
                abstractSerializedData2.writeInt32(this.date);
                this.peer.serializeToStream(abstractSerializedData2);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeString(this.title);
                }
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeString(this.description);
                }
                if ((this.flags & 4) != 0) {
                    this.photo.serializeToStream(abstractSerializedData2);
                }
            }
        } : new TLRPC$TL_starsTransaction() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.refund = (readInt32 & 8) != 0;
                this.pending = (readInt32 & 16) != 0;
                this.failed = (readInt32 & 64) != 0;
                this.id = abstractSerializedData2.readString(z2);
                this.stars = abstractSerializedData2.readInt64(z2);
                this.date = abstractSerializedData2.readInt32(z2);
                this.peer = TLRPC$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                if ((this.flags & 1) != 0) {
                    this.title = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 2) != 0) {
                    this.description = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
                if ((this.flags & 32) != 0) {
                    this.transaction_date = abstractSerializedData2.readInt32(z2);
                    this.transaction_url = abstractSerializedData2.readString(z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1442789224);
                int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                this.flags = i2;
                int i3 = this.pending ? i2 | 16 : i2 & (-17);
                this.flags = i3;
                int i4 = this.failed ? i3 | 64 : i3 & (-65);
                this.flags = i4;
                abstractSerializedData2.writeInt32(i4);
                abstractSerializedData2.writeInt64(this.stars);
                abstractSerializedData2.writeInt32(this.date);
                this.peer.serializeToStream(abstractSerializedData2);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeString(this.title);
                }
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeString(this.description);
                }
                if ((this.flags & 4) != 0) {
                    this.photo.serializeToStream(abstractSerializedData2);
                }
                if ((this.flags & 32) != 0) {
                    abstractSerializedData2.writeInt32(this.transaction_date);
                    abstractSerializedData2.writeString(this.transaction_url);
                }
            }
        };
        if (tLRPC$TL_starsTransaction == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarsTransaction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_starsTransaction != null) {
            tLRPC$TL_starsTransaction.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_starsTransaction;
    }
}
