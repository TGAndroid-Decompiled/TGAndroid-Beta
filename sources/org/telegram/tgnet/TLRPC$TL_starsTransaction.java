package org.telegram.tgnet;
public class TLRPC$TL_starsTransaction extends TLRPC$StarsTransaction {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.refund = (readInt32 & 8) != 0;
        this.pending = (readInt32 & 16) != 0;
        this.failed = (readInt32 & 64) != 0;
        this.gift = (readInt32 & 1024) != 0;
        this.reaction = (readInt32 & 2048) != 0;
        this.subscription = (readInt32 & 4096) != 0;
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
        if ((this.flags & 32) != 0) {
            this.transaction_date = abstractSerializedData.readInt32(z);
            this.transaction_url = abstractSerializedData.readString(z);
        }
        if ((this.flags & 128) != 0) {
            this.bot_payload = abstractSerializedData.readByteArray(z);
        }
        if ((this.flags & 256) != 0) {
            this.msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 512) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.extended_media.add(TLdeserialize);
            }
        }
        if ((this.flags & 4096) != 0) {
            this.subscription_period = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1127934763);
        int i = this.refund ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.pending ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.failed ? i2 | 64 : i2 & (-65);
        this.flags = i3;
        int i4 = this.gift ? i3 | 1024 : i3 & (-1025);
        this.flags = i4;
        int i5 = this.reaction ? i4 | 2048 : i4 & (-2049);
        this.flags = i5;
        int i6 = this.subscription ? i5 | 4096 : i5 & (-4097);
        this.flags = i6;
        abstractSerializedData.writeInt32(i6);
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
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeInt32(this.transaction_date);
            abstractSerializedData.writeString(this.transaction_url);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeByteArray(this.bot_payload);
        }
        if ((this.flags & 256) != 0) {
            abstractSerializedData.writeInt32(this.msg_id);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.extended_media.size();
            abstractSerializedData.writeInt32(size);
            for (int i7 = 0; i7 < size; i7++) {
                this.extended_media.get(i7).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4096) != 0) {
            abstractSerializedData.writeInt32(this.subscription_period);
        }
    }
}
