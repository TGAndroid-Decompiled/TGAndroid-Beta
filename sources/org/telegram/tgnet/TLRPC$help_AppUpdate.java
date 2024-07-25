package org.telegram.tgnet;
public abstract class TLRPC$help_AppUpdate extends TLObject {
    public static TLRPC$help_AppUpdate TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_AppUpdate tLRPC$help_AppUpdate;
        if (i != -1000708810) {
            tLRPC$help_AppUpdate = i != -860107216 ? null : new TLRPC$TL_help_appUpdate();
        } else {
            tLRPC$help_AppUpdate = new TLRPC$help_AppUpdate() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1000708810);
                }
            };
        }
        if (tLRPC$help_AppUpdate == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_AppUpdate", Integer.valueOf(i)));
        }
        if (tLRPC$help_AppUpdate != null) {
            tLRPC$help_AppUpdate.readParams(abstractSerializedData, z);
        }
        return tLRPC$help_AppUpdate;
    }
}
