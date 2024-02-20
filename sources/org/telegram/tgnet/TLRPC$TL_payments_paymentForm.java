package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_payments_paymentForm extends TLObject {
    public long bot_id;
    public boolean can_save_credentials;
    public String description;
    public int flags;
    public long form_id;
    public TLRPC$TL_invoice invoice;
    public TLRPC$TL_dataJSON native_params;
    public String native_provider;
    public boolean password_missing;
    public TLRPC$WebDocument photo;
    public long provider_id;
    public TLRPC$TL_paymentRequestedInfo saved_info;
    public String title;
    public String url;
    public ArrayList<TLRPC$TL_paymentFormMethod> additional_methods = new ArrayList<>();
    public ArrayList<TLRPC$TL_paymentSavedCredentialsCard> saved_credentials = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_payments_paymentForm TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1610250415 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_payments_paymentForm", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_payments_paymentForm tLRPC$TL_payments_paymentForm = new TLRPC$TL_payments_paymentForm();
        tLRPC$TL_payments_paymentForm.readParams(abstractSerializedData, z);
        return tLRPC$TL_payments_paymentForm;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_save_credentials = (readInt32 & 4) != 0;
        this.password_missing = (readInt32 & 8) != 0;
        this.form_id = abstractSerializedData.readInt64(z);
        this.bot_id = abstractSerializedData.readInt64(z);
        this.title = abstractSerializedData.readString(z);
        this.description = abstractSerializedData.readString(z);
        if ((this.flags & 32) != 0) {
            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.provider_id = abstractSerializedData.readInt64(z);
        this.url = abstractSerializedData.readString(z);
        if ((this.flags & 16) != 0) {
            this.native_provider = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.native_params = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 64) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$TL_paymentFormMethod TLdeserialize = TLRPC$TL_paymentFormMethod.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.additional_methods.add(TLdeserialize);
            }
        }
        if ((this.flags & 1) != 0) {
            this.saved_info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                TLRPC$TL_paymentSavedCredentialsCard TLdeserialize2 = TLRPC$TL_paymentSavedCredentialsCard.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.saved_credentials.add(TLdeserialize2);
            }
        }
        int readInt326 = abstractSerializedData.readInt32(z);
        if (readInt326 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
            }
            return;
        }
        int readInt327 = abstractSerializedData.readInt32(z);
        for (int i3 = 0; i3 < readInt327; i3++) {
            TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize3 == null) {
                return;
            }
            this.users.add(TLdeserialize3);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1610250415);
        int i = this.can_save_credentials ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        int i2 = this.password_missing ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.form_id);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.description);
        if ((this.flags & 32) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
        this.invoice.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.provider_id);
        abstractSerializedData.writeString(this.url);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.native_provider);
        }
        if ((this.flags & 16) != 0) {
            this.native_params.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.additional_methods.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.additional_methods.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 1) != 0) {
            this.saved_info.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.saved_credentials.size();
            abstractSerializedData.writeInt32(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                this.saved_credentials.get(i4).serializeToStream(abstractSerializedData);
            }
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.users.size();
        abstractSerializedData.writeInt32(size3);
        for (int i5 = 0; i5 < size3; i5++) {
            this.users.get(i5).serializeToStream(abstractSerializedData);
        }
    }
}
