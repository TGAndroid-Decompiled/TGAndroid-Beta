package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_payments_paymentForm extends TLObject {
    public static int constructor = 378828315;
    public long bot_id;
    public boolean can_save_credentials;
    public int flags;
    public long form_id;
    public TLRPC$TL_invoice invoice;
    public TLRPC$TL_dataJSON native_params;
    public String native_provider;
    public boolean password_missing;
    public long provider_id;
    public TLRPC$TL_paymentSavedCredentialsCard saved_credentials;
    public TLRPC$TL_paymentRequestedInfo saved_info;
    public String url;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_payments_paymentForm TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_payments_paymentForm tLRPC$TL_payments_paymentForm = new TLRPC$TL_payments_paymentForm();
            tLRPC$TL_payments_paymentForm.readParams(abstractSerializedData, z);
            return tLRPC$TL_payments_paymentForm;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_payments_paymentForm", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_save_credentials = (readInt32 & 4) != 0;
        this.password_missing = (readInt32 & 8) != 0;
        this.form_id = abstractSerializedData.readInt64(z);
        this.bot_id = abstractSerializedData.readInt64(z);
        this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.provider_id = abstractSerializedData.readInt64(z);
        this.url = abstractSerializedData.readString(z);
        if ((this.flags & 16) != 0) {
            this.native_provider = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.native_params = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 1) != 0) {
            this.saved_info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.saved_credentials = TLRPC$TL_paymentSavedCredentialsCard.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 == 481674261) {
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize != null) {
                    this.users.add(TLdeserialize);
                } else {
                    return;
                }
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_save_credentials ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        int i2 = this.password_missing ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.form_id);
        abstractSerializedData.writeInt64(this.bot_id);
        this.invoice.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.provider_id);
        abstractSerializedData.writeString(this.url);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.native_provider);
        }
        if ((this.flags & 16) != 0) {
            this.native_params.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            this.saved_info.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.saved_credentials.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.users.get(i3).serializeToStream(abstractSerializedData);
        }
    }
}
