package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$PaymentReceipt extends TLObject {
    public long bot_id;
    public String credentials_title;
    public String currency;
    public int date;
    public String description;
    public int flags;
    public TLRPC$TL_paymentRequestedInfo info;
    public TLRPC$TL_invoice invoice;
    public TLRPC$WebDocument photo;
    public long provider_id;
    public TLRPC$TL_shippingOption shipping;
    public long tip_amount;
    public String title;
    public long total_amount;
    public String transaction_id;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$PaymentReceipt TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PaymentReceipt tLRPC$PaymentReceipt;
        if (i != -625215430) {
            tLRPC$PaymentReceipt = i != 1891958275 ? null : new TLRPC$PaymentReceipt() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.date = abstractSerializedData2.readInt32(z2);
                    this.bot_id = abstractSerializedData2.readInt64(z2);
                    this.provider_id = abstractSerializedData2.readInt64(z2);
                    this.title = abstractSerializedData2.readString(z2);
                    this.description = abstractSerializedData2.readString(z2);
                    if ((this.flags & 4) != 0) {
                        this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if ((this.flags & 1) != 0) {
                        this.info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 2) != 0) {
                        this.shipping = TLRPC$TL_shippingOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.tip_amount = abstractSerializedData2.readInt64(z2);
                    }
                    this.currency = abstractSerializedData2.readString(z2);
                    this.total_amount = abstractSerializedData2.readInt64(z2);
                    this.credentials_title = abstractSerializedData2.readString(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.users.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1891958275);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.date);
                    abstractSerializedData2.writeInt64(this.bot_id);
                    abstractSerializedData2.writeInt64(this.provider_id);
                    abstractSerializedData2.writeString(this.title);
                    abstractSerializedData2.writeString(this.description);
                    if ((this.flags & 4) != 0) {
                        this.photo.serializeToStream(abstractSerializedData2);
                    }
                    this.invoice.serializeToStream(abstractSerializedData2);
                    if ((this.flags & 1) != 0) {
                        this.info.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 2) != 0) {
                        this.shipping.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeInt64(this.tip_amount);
                    }
                    abstractSerializedData2.writeString(this.currency);
                    abstractSerializedData2.writeInt64(this.total_amount);
                    abstractSerializedData2.writeString(this.credentials_title);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.users.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.users.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else {
            tLRPC$PaymentReceipt = new TLRPC$PaymentReceipt() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.date = abstractSerializedData2.readInt32(z2);
                    this.bot_id = abstractSerializedData2.readInt64(z2);
                    this.title = abstractSerializedData2.readString(z2);
                    this.description = abstractSerializedData2.readString(z2);
                    if ((this.flags & 4) != 0) {
                        this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.currency = abstractSerializedData2.readString(z2);
                    this.total_amount = abstractSerializedData2.readInt64(z2);
                    this.transaction_id = abstractSerializedData2.readString(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.users.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-625215430);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt32(this.date);
                    abstractSerializedData2.writeInt64(this.bot_id);
                    abstractSerializedData2.writeString(this.title);
                    abstractSerializedData2.writeString(this.description);
                    if ((this.flags & 4) != 0) {
                        this.photo.serializeToStream(abstractSerializedData2);
                    }
                    this.invoice.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeString(this.currency);
                    abstractSerializedData2.writeInt64(this.total_amount);
                    abstractSerializedData2.writeString(this.transaction_id);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.users.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.users.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$PaymentReceipt == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PaymentReceipt", Integer.valueOf(i)));
        }
        if (tLRPC$PaymentReceipt != null) {
            tLRPC$PaymentReceipt.readParams(abstractSerializedData, z);
        }
        return tLRPC$PaymentReceipt;
    }
}
