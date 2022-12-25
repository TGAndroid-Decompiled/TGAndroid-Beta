package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_payments_paymentReceipt extends TLObject {
    public static int constructor = 1891958275;
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
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_payments_paymentReceipt TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_paymentReceipt", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_paymentReceipt tLRPC$TL_payments_paymentReceipt = new TLRPC$TL_payments_paymentReceipt();
        tLRPC$TL_payments_paymentReceipt.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_paymentReceipt;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
        this.bot_id = abstractSerializedData.readInt64(z);
        this.provider_id = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        this.description = abstractSerializedData.readString(z);
        if ((this.flags & 4) != 0) {
            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.shipping = TLRPC$TL_shippingOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            this.tip_amount = abstractSerializedData.readInt64(z);
        }
        this.currency = abstractSerializedData.readString(z);
        this.total_amount = abstractSerializedData.readInt64(z);
        this.credentials_title = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.users.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeInt64(this.provider_id);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.description);
        if ((this.flags & 4) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
        this.invoice.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.info.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.shipping.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt64(this.tip_amount);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.total_amount);
        abstractSerializedData.writeString(this.credentials_title);
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.users.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
