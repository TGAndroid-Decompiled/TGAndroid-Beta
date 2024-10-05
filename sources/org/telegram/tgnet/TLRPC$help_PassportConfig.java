package org.telegram.tgnet;

public abstract class TLRPC$help_PassportConfig extends TLObject {
    public static TLRPC$help_PassportConfig TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_PassportConfig tLRPC$TL_help_passportConfig = i != -1600596305 ? i != -1078332329 ? null : new TLRPC$help_PassportConfig() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1078332329);
            }
        } : new TLRPC$TL_help_passportConfig();
        if (tLRPC$TL_help_passportConfig == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_PassportConfig", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_passportConfig != null) {
            tLRPC$TL_help_passportConfig.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_passportConfig;
    }
}
