package org.telegram.tgnet;
public abstract class TLRPC$EmojiList extends TLObject {
    public static TLRPC$EmojiList TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiList tLRPC$TL_emojiList = i != 1209970170 ? i != 2048790993 ? null : new TLRPC$TL_emojiList() : new TLRPC$EmojiList() {
            public static int constructor = 1209970170;

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(constructor);
            }
        };
        if (tLRPC$TL_emojiList == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EmojiList", Integer.valueOf(i)));
        }
        if (tLRPC$TL_emojiList != null) {
            tLRPC$TL_emojiList.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_emojiList;
    }
}
