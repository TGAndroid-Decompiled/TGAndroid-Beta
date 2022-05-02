package org.telegram.tgnet;

public class TLRPC$TL_account_passwordSettings extends TLObject {
    public static int constructor = -1705233435;
    public String email;
    public int flags;
    public TLRPC$TL_secureSecretSettings secure_settings;

    public static TLRPC$TL_account_passwordSettings TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_account_passwordSettings tLRPC$TL_account_passwordSettings = new TLRPC$TL_account_passwordSettings();
            tLRPC$TL_account_passwordSettings.readParams(abstractSerializedData, z);
            return tLRPC$TL_account_passwordSettings;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_account_passwordSettings", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.email = abstractSerializedData.readString(z);
        }
        if ((this.flags & 2) != 0) {
            this.secure_settings = TLRPC$TL_secureSecretSettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.email);
        }
        if ((this.flags & 2) != 0) {
            this.secure_settings.serializeToStream(abstractSerializedData);
        }
    }
}
