package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_invoice extends TLObject {
    public static int constructor = 1048946971;
    public String currency;
    public boolean email_requested;
    public boolean email_to_provider;
    public int flags;
    public boolean flexible;
    public long max_tip_amount;
    public boolean name_requested;
    public boolean phone_requested;
    public boolean phone_to_provider;
    public boolean recurring;
    public String recurring_terms_url;
    public boolean shipping_address_requested;
    public boolean test;
    public ArrayList<TLRPC$TL_labeledPrice> prices = new ArrayList<>();
    public ArrayList<Long> suggested_tip_amounts = new ArrayList<>();

    public static TLRPC$TL_invoice TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_invoice tLRPC$TL_invoice = new TLRPC$TL_invoice();
            tLRPC$TL_invoice.readParams(abstractSerializedData, z);
            return tLRPC$TL_invoice;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_invoice", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.test = (readInt32 & 1) != 0;
        this.name_requested = (readInt32 & 2) != 0;
        this.phone_requested = (readInt32 & 4) != 0;
        this.email_requested = (readInt32 & 8) != 0;
        this.shipping_address_requested = (readInt32 & 16) != 0;
        this.flexible = (readInt32 & 32) != 0;
        this.phone_to_provider = (readInt32 & 64) != 0;
        this.email_to_provider = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
        this.recurring = (readInt32 & 512) != 0;
        this.currency = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 == 481674261) {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$TL_labeledPrice TLdeserialize = TLRPC$TL_labeledPrice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize != null) {
                    this.prices.add(TLdeserialize);
                } else {
                    return;
                }
            }
            if ((this.flags & 256) != 0) {
                this.max_tip_amount = abstractSerializedData.readInt64(z);
            }
            if ((this.flags & 256) != 0) {
                int readInt324 = abstractSerializedData.readInt32(z);
                if (readInt324 == 481674261) {
                    int readInt325 = abstractSerializedData.readInt32(z);
                    for (int i2 = 0; i2 < readInt325; i2++) {
                        this.suggested_tip_amounts.add(Long.valueOf(abstractSerializedData.readInt64(z)));
                    }
                } else if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                } else {
                    return;
                }
            }
            if ((this.flags & 512) != 0) {
                this.recurring_terms_url = abstractSerializedData.readString(z);
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.test ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.name_requested ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.phone_requested ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.email_requested ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.shipping_address_requested ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.flexible ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.phone_to_provider ? i6 | 64 : i6 & (-65);
        this.flags = i7;
        int i8 = this.email_to_provider ? i7 | ConnectionsManager.RequestFlagNeedQuickAck : i7 & (-129);
        this.flags = i8;
        int i9 = this.recurring ? i8 | 512 : i8 & (-513);
        this.flags = i9;
        abstractSerializedData.writeInt32(i9);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt32(481674261);
        int size = this.prices.size();
        abstractSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.prices.get(i10).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 256) != 0) {
            abstractSerializedData.writeInt64(this.max_tip_amount);
        }
        if ((this.flags & 256) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.suggested_tip_amounts.size();
            abstractSerializedData.writeInt32(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                abstractSerializedData.writeInt64(this.suggested_tip_amounts.get(i11).longValue());
            }
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeString(this.recurring_terms_url);
        }
    }
}
