package org.telegram.tgnet;

public class TLRPC$TL_auth_authorization extends TLRPC$auth_Authorization {
    public int flags;
    public byte[] future_auth_token;
    public int otherwise_relogin_days;
    public boolean setup_password_required;
    public int tmp_sessions;
    public TLRPC$User user;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.setup_password_required = (readInt32 & 2) != 0;
        if ((readInt32 & 2) != 0) {
            this.otherwise_relogin_days = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.tmp_sessions = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.future_auth_token = abstractSerializedData.readByteArray(z);
        }
        this.user = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(782418132);
        int i = this.setup_password_required ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.otherwise_relogin_days);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.tmp_sessions);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeByteArray(this.future_auth_token);
        }
        this.user.serializeToStream(abstractSerializedData);
    }
}
