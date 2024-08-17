package org.telegram.tgnet;

public abstract class TLRPC$account_Password extends TLObject {
    public TLRPC$PasswordKdfAlgo current_algo;
    public String email_unconfirmed_pattern;
    public int flags;
    public boolean has_password;
    public boolean has_recovery;
    public boolean has_secure_values;
    public String hint;
    public String login_email_pattern;
    public TLRPC$PasswordKdfAlgo new_algo;
    public TLRPC$SecurePasswordKdfAlgo new_secure_algo;
    public int pending_reset_date;
    public byte[] secure_random;
    public byte[] srp_B;
    public long srp_id;

    public static TLRPC$account_Password TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_Password tLRPC$TL_account_password;
        if (i == -1787080453) {
            tLRPC$TL_account_password = new TLRPC$TL_account_password();
        } else {
            tLRPC$TL_account_password = i != 408623183 ? null : new TLRPC$account_Password() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.has_recovery = (readInt32 & 1) != 0;
                    this.has_secure_values = (readInt32 & 2) != 0;
                    int i2 = readInt32 & 4;
                    this.has_password = i2 != 0;
                    if (i2 != 0) {
                        this.current_algo = TLRPC$PasswordKdfAlgo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.srp_B = abstractSerializedData2.readByteArray(z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.srp_id = abstractSerializedData2.readInt64(z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.hint = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.email_unconfirmed_pattern = abstractSerializedData2.readString(z2);
                    }
                    this.new_algo = TLRPC$PasswordKdfAlgo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.new_secure_algo = TLRPC$SecurePasswordKdfAlgo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.secure_random = abstractSerializedData2.readByteArray(z2);
                    if ((this.flags & 32) != 0) {
                        this.pending_reset_date = abstractSerializedData2.readInt32(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(408623183);
                    int i2 = this.has_recovery ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.has_secure_values ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    int i4 = this.has_password ? i3 | 4 : i3 & (-5);
                    this.flags = i4;
                    abstractSerializedData2.writeInt32(i4);
                    if ((this.flags & 4) != 0) {
                        this.current_algo.serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 4) != 0) {
                        abstractSerializedData2.writeByteArray(this.srp_B);
                    }
                    if ((this.flags & 4) != 0) {
                        abstractSerializedData2.writeInt64(this.srp_id);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeString(this.hint);
                    }
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeString(this.email_unconfirmed_pattern);
                    }
                    this.new_algo.serializeToStream(abstractSerializedData2);
                    this.new_secure_algo.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeByteArray(this.secure_random);
                    if ((this.flags & 32) != 0) {
                        abstractSerializedData2.writeInt32(this.pending_reset_date);
                    }
                }
            };
        }
        if (tLRPC$TL_account_password == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_Password", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_password != null) {
            tLRPC$TL_account_password.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_password;
    }
}
