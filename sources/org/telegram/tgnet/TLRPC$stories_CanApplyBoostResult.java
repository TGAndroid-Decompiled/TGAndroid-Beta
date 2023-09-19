package org.telegram.tgnet;
public abstract class TLRPC$stories_CanApplyBoostResult extends TLObject {
    public static TLRPC$stories_CanApplyBoostResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$stories_CanApplyBoostResult tLRPC$TL_stories_canApplyBoostReplace = i != -1021889145 ? i != 1898726997 ? null : new TLRPC$TL_stories_canApplyBoostReplace() : new TLRPC$stories_CanApplyBoostResult() {
            public static int constructor = -1021889145;

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
            }
        };
        if (tLRPC$TL_stories_canApplyBoostReplace == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in stories_CanApplyBoostResult", Integer.valueOf(i)));
        }
        if (tLRPC$TL_stories_canApplyBoostReplace != null) {
            tLRPC$TL_stories_canApplyBoostReplace.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_stories_canApplyBoostReplace;
    }
}
