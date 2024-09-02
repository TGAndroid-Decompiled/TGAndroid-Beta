package org.telegram.tgnet;

public class TLRPC$TL_chatInvite extends TLRPC$ChatInvite {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.channel = (readInt32 & 1) != 0;
        this.broadcast = (readInt32 & 2) != 0;
        this.isPublic = (readInt32 & 4) != 0;
        this.megagroup = (readInt32 & 8) != 0;
        this.request_needed = (readInt32 & 64) != 0;
        this.verified = (readInt32 & 128) != 0;
        this.scam = (readInt32 & 256) != 0;
        this.fake = (readInt32 & 512) != 0;
        this.can_refulfill_subscription = (readInt32 & 2048) != 0;
        this.title = abstractSerializedData.readString(z);
        if ((this.flags & 32) != 0) {
            this.about = abstractSerializedData.readString(z);
        }
        this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.participants_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 16) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.participants.add(TLdeserialize);
            }
        }
        this.color = abstractSerializedData.readInt32(z);
        if ((this.flags & 1024) != 0) {
            this.subscription_pricing = TLRPC$TL_starsSubscriptionPricing.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4096) != 0) {
            this.subscription_form_id = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-26920803);
        int i = this.channel ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.broadcast ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.isPublic ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.megagroup ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.about != null ? i4 | 32 : i4 & (-33);
        this.flags = i5;
        int i6 = this.request_needed ? i5 | 64 : i5 & (-65);
        this.flags = i6;
        int i7 = this.verified ? i6 | 128 : i6 & (-129);
        this.flags = i7;
        int i8 = this.scam ? i7 | 256 : i7 & (-257);
        this.flags = i8;
        int i9 = this.fake ? i8 | 512 : i8 & (-513);
        this.flags = i9;
        int i10 = this.can_refulfill_subscription ? i9 | 2048 : i9 & (-2049);
        this.flags = i10;
        abstractSerializedData.writeInt32(i10);
        abstractSerializedData.writeString(this.title);
        String str = this.about;
        if (str != null) {
            abstractSerializedData.writeString(str);
        }
        this.photo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.participants_count);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.participants.size();
            abstractSerializedData.writeInt32(size);
            for (int i11 = 0; i11 < size; i11++) {
                this.participants.get(i11).serializeToStream(abstractSerializedData);
            }
        }
        abstractSerializedData.writeInt32(this.color);
        if ((this.flags & 1024) != 0) {
            this.subscription_pricing.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4096) != 0) {
            abstractSerializedData.writeInt64(this.subscription_form_id);
        }
    }
}
