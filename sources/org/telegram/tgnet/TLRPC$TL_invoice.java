package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;

public class TLRPC$TL_invoice extends TLObject {
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
    public boolean shipping_address_requested;
    public String terms_url;
    public boolean test;
    public ArrayList<TLRPC$TL_labeledPrice> prices = new ArrayList<>();
    public ArrayList<Long> suggested_tip_amounts = new ArrayList<>();

    public static TLRPC$TL_invoice TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_invoice tLRPC$TL_invoice;
        if (i != 1048946971) {
            tLRPC$TL_invoice = i != 1572428309 ? null : new TLRPC$TL_invoice();
        } else {
            tLRPC$TL_invoice = new TLRPC$TL_invoice() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.test = (readInt32 & 1) != 0;
                    this.name_requested = (readInt32 & 2) != 0;
                    this.phone_requested = (readInt32 & 4) != 0;
                    this.email_requested = (readInt32 & 8) != 0;
                    this.shipping_address_requested = (readInt32 & 16) != 0;
                    this.flexible = (readInt32 & 32) != 0;
                    this.phone_to_provider = (readInt32 & 64) != 0;
                    this.email_to_provider = (readInt32 & 128) != 0;
                    this.recurring = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                    this.currency = abstractSerializedData2.readString(z2);
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    if (readInt322 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                        }
                        return;
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt323; i2++) {
                        TLRPC$TL_labeledPrice TLdeserialize = TLRPC$TL_labeledPrice.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.prices.add(TLdeserialize);
                    }
                    if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
                        this.max_tip_amount = abstractSerializedData2.readInt64(z2);
                    }
                    if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
                        int readInt324 = abstractSerializedData2.readInt32(z2);
                        if (readInt324 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                            }
                            return;
                        } else {
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.suggested_tip_amounts.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                    }
                    if ((this.flags & 1024) != 0) {
                        this.terms_url = abstractSerializedData2.readString(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1048946971);
                    int i2 = this.test ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.name_requested ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    int i4 = this.phone_requested ? i3 | 4 : i3 & (-5);
                    this.flags = i4;
                    int i5 = this.email_requested ? i4 | 8 : i4 & (-9);
                    this.flags = i5;
                    int i6 = this.shipping_address_requested ? i5 | 16 : i5 & (-17);
                    this.flags = i6;
                    int i7 = this.flexible ? i6 | 32 : i6 & (-33);
                    this.flags = i7;
                    int i8 = this.phone_to_provider ? i7 | 64 : i7 & (-65);
                    this.flags = i8;
                    int i9 = this.email_to_provider ? i8 | 128 : i8 & (-129);
                    this.flags = i9;
                    int i10 = this.recurring ? i9 | LiteMode.FLAG_CALLS_ANIMATIONS : i9 & (-513);
                    this.flags = i10;
                    abstractSerializedData2.writeInt32(i10);
                    abstractSerializedData2.writeString(this.currency);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.prices.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        this.prices.get(i11).serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
                        abstractSerializedData2.writeInt64(this.max_tip_amount);
                    }
                    if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.suggested_tip_amounts.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i12 = 0; i12 < size2; i12++) {
                            abstractSerializedData2.writeInt64(this.suggested_tip_amounts.get(i12).longValue());
                        }
                    }
                    if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                        abstractSerializedData2.writeString(this.terms_url);
                    }
                }
            };
        }
        if (tLRPC$TL_invoice == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in TL_invoice", Integer.valueOf(i)));
        }
        if (tLRPC$TL_invoice != null) {
            tLRPC$TL_invoice.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_invoice;
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
        this.email_to_provider = (readInt32 & 128) != 0;
        this.recurring = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
        this.currency = abstractSerializedData.readString(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$TL_labeledPrice TLdeserialize = TLRPC$TL_labeledPrice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.prices.add(TLdeserialize);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.max_tip_amount = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            } else {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    this.suggested_tip_amounts.add(Long.valueOf(abstractSerializedData.readInt64(z)));
                }
            }
        }
        if ((this.flags & 1024) != 0) {
            this.terms_url = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1572428309);
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
        int i8 = this.email_to_provider ? i7 | 128 : i7 & (-129);
        this.flags = i8;
        int i9 = this.recurring ? i8 | LiteMode.FLAG_CALLS_ANIMATIONS : i8 & (-513);
        this.flags = i9;
        abstractSerializedData.writeInt32(i9);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt32(481674261);
        int size = this.prices.size();
        abstractSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.prices.get(i10).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            abstractSerializedData.writeInt64(this.max_tip_amount);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.suggested_tip_amounts.size();
            abstractSerializedData.writeInt32(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                abstractSerializedData.writeInt64(this.suggested_tip_amounts.get(i11).longValue());
            }
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeString(this.terms_url);
        }
    }
}
