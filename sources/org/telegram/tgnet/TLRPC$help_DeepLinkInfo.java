package org.telegram.tgnet;

public abstract class TLRPC$help_DeepLinkInfo extends TLObject {
    public static TLRPC$help_DeepLinkInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$help_DeepLinkInfo tLRPC$TL_help_deepLinkInfo = i != 1722786150 ? i != 1783556146 ? null : new TLRPC$TL_help_deepLinkInfo() : new TLRPC$help_DeepLinkInfo() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1722786150);
            }
        };
        if (tLRPC$TL_help_deepLinkInfo == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in help_DeepLinkInfo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_help_deepLinkInfo != null) {
            tLRPC$TL_help_deepLinkInfo.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_help_deepLinkInfo;
    }
}
