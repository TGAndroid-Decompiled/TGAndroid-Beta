package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$account_EmojiStatuses extends TLObject {
    public long hash;
    public ArrayList statuses = new ArrayList();

    public static TLRPC$account_EmojiStatuses TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$account_EmojiStatuses tLRPC$TL_account_emojiStatuses = i != -1866176559 ? i != -796072379 ? null : new TLRPC$account_EmojiStatuses() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-796072379);
            }
        } : new TLRPC$TL_account_emojiStatuses();
        if (tLRPC$TL_account_emojiStatuses == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in account_EmojiStatuses", Integer.valueOf(i)));
        }
        if (tLRPC$TL_account_emojiStatuses != null) {
            tLRPC$TL_account_emojiStatuses.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_account_emojiStatuses;
    }
}
