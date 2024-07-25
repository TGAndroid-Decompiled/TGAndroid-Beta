package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$PaymentForm extends TLObject {
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

    public static TLRPC$PaymentForm TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PaymentForm tLRPC$PaymentForm;
        if (i == -1610250415) {
            tLRPC$PaymentForm = new TLRPC$PaymentForm() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.can_save_credentials = (readInt32 & 4) != 0;
                    this.password_missing = (readInt32 & 8) != 0;
                    this.form_id = abstractSerializedData2.readInt64(z2);
                    this.bot_id = abstractSerializedData2.readInt64(z2);
                    this.title = abstractSerializedData2.readString(z2);
                    this.description = abstractSerializedData2.readString(z2);
                    if ((this.flags & 32) != 0) {
                        this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.provider_id = abstractSerializedData2.readInt64(z2);
                    this.url = abstractSerializedData2.readString(z2);
                    if ((this.flags & 16) != 0) {
                        this.native_provider = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.native_params = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 64) != 0) {
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$TL_paymentFormMethod TLdeserialize = TLRPC$TL_paymentFormMethod.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.additional_methods.add(TLdeserialize);
                        }
                    }
                    if ((this.flags & 1) != 0) {
                        this.saved_info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 2) != 0) {
                        int readInt324 = abstractSerializedData2.readInt32(z2);
                        if (readInt324 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                            }
                            return;
                        }
                        int readInt325 = abstractSerializedData2.readInt32(z2);
                        for (int i3 = 0; i3 < readInt325; i3++) {
                            TLRPC$TL_paymentSavedCredentialsCard TLdeserialize2 = TLRPC$TL_paymentSavedCredentialsCard.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.saved_credentials.add(TLdeserialize2);
                        }
                    }
                    int readInt326 = abstractSerializedData2.readInt32(z2);
                    if (readInt326 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                        }
                        return;
                    }
                    int readInt327 = abstractSerializedData2.readInt32(z2);
                    for (int i4 = 0; i4 < readInt327; i4++) {
                        TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize3 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize3);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1610250415);
                    int i2 = this.can_save_credentials ? this.flags | 4 : this.flags & (-5);
                    this.flags = i2;
                    int i3 = this.password_missing ? i2 | 8 : i2 & (-9);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    abstractSerializedData2.writeInt64(this.form_id);
                    abstractSerializedData2.writeInt64(this.bot_id);
                    abstractSerializedData2.writeString(this.title);
                    abstractSerializedData2.writeString(this.description);
                    if ((this.flags & 32) != 0) {
                        this.photo.serializeToStream(abstractSerializedData2);
                    }
                    this.invoice.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt64(this.provider_id);
                    abstractSerializedData2.writeString(this.url);
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeString(this.native_provider);
                    }
                    if ((this.flags & 16) != 0) {
                        this.native_params.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 64) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.additional_methods.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            this.additional_methods.get(i4).serializeToStream(abstractSerializedData2);
                        }
                    }
                    if ((this.flags & 1) != 0) {
                        this.saved_info.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 2) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.saved_credentials.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i5 = 0; i5 < size2; i5++) {
                            this.saved_credentials.get(i5).serializeToStream(abstractSerializedData2);
                        }
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size3 = this.users.size();
                    abstractSerializedData2.writeInt32(size3);
                    for (int i6 = 0; i6 < size3; i6++) {
                        this.users.get(i6).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else {
            tLRPC$PaymentForm = i != 2079764828 ? null : new TLRPC$PaymentForm() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.form_id = abstractSerializedData2.readInt64(z2);
                    this.bot_id = abstractSerializedData2.readInt64(z2);
                    this.title = abstractSerializedData2.readString(z2);
                    this.description = abstractSerializedData2.readString(z2);
                    if ((this.flags & 32) != 0) {
                        this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    this.invoice = TLRPC$TL_invoice.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
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
                    abstractSerializedData2.writeInt32(2079764828);
                    int i2 = this.can_save_credentials ? this.flags | 4 : this.flags & (-5);
                    this.flags = i2;
                    int i3 = this.password_missing ? i2 | 8 : i2 & (-9);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    abstractSerializedData2.writeInt64(this.form_id);
                    abstractSerializedData2.writeInt64(this.bot_id);
                    abstractSerializedData2.writeString(this.title);
                    abstractSerializedData2.writeString(this.description);
                    if ((this.flags & 32) != 0) {
                        this.photo.serializeToStream(abstractSerializedData2);
                    }
                    this.invoice.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.users.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        this.users.get(i4).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$PaymentForm == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PaymentForm", Integer.valueOf(i)));
        }
        if (tLRPC$PaymentForm != null) {
            tLRPC$PaymentForm.readParams(abstractSerializedData, z);
        }
        return tLRPC$PaymentForm;
    }
}
