package org.telegram.tgnet;

public abstract class TLRPC$help_PassportConfig extends TLObject {
    public static TLRPC$help_PassportConfig TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PassportConfig tLRPC$help_PassportConfig;
        if (i != -1600596305) {
            tLRPC$help_PassportConfig = i != -1078332329 ? null : new TLRPC$help_PassportConfig() {
                public static int constructor = -1078332329;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$help_PassportConfig = new TLRPC$TL_help_passportConfig();
        }
        if (tLRPC$help_PassportConfig != null || !z) {
            if (tLRPC$help_PassportConfig != null) {
                tLRPC$help_PassportConfig.readParams(abstractSerializedData, z);
            }
            return tLRPC$help_PassportConfig;
        }
        throw new RuntimeException(String.format("can't parse magic %x in help_PassportConfig", Integer.valueOf(i)));
    }
}
