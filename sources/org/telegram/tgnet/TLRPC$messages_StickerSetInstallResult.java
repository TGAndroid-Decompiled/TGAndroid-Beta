package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$messages_StickerSetInstallResult extends TLObject {
    public ArrayList<TLRPC$StickerSetCovered> sets = new ArrayList<>();

    public static TLRPC$messages_StickerSetInstallResult TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_StickerSetInstallResult tLRPC$messages_StickerSetInstallResult;
        if (i != 904138920) {
            tLRPC$messages_StickerSetInstallResult = i != 946083368 ? null : new TLRPC$messages_StickerSetInstallResult() {
                public static int constructor = 946083368;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$messages_StickerSetInstallResult = new TLRPC$messages_StickerSetInstallResult() {
                public static int constructor = 904138920;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$StickerSetCovered TLdeserialize = TLRPC$StickerSetCovered.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.sets.add(TLdeserialize);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.sets.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.sets.get(i2).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$messages_StickerSetInstallResult == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_StickerSetInstallResult", Integer.valueOf(i)));
        }
        if (tLRPC$messages_StickerSetInstallResult != null) {
            tLRPC$messages_StickerSetInstallResult.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_StickerSetInstallResult;
    }
}
