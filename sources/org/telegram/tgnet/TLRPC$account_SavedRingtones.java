package org.telegram.tgnet;
public abstract class TLRPC$account_SavedRingtones extends TLObject {
    public static TLRPC$account_SavedRingtones TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_SavedRingtones tLRPC$TL_account_savedRingtones = i != -1041683259 ? i != -67704655 ? null : new TLRPC$account_SavedRingtones() {
            public static int constructor = -67704655;

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
            }
        } : new TLRPC$TL_account_savedRingtones();
        if (tLRPC$TL_account_savedRingtones == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_SavedRingtones", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_savedRingtones != null) {
            tLRPC$TL_account_savedRingtones.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_savedRingtones;
    }
}
