package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$messages_SavedReactionTags extends TLObject {
    public long hash;
    public ArrayList<TLRPC$TL_savedReactionTag> tags = new ArrayList<>();

    public static TLRPC$messages_SavedReactionTags TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_SavedReactionTags tLRPC$messages_SavedReactionTags;
        if (i == -2003084817) {
            tLRPC$messages_SavedReactionTags = new TLRPC$messages_SavedReactionTags() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-2003084817);
                }
            };
        } else {
            tLRPC$messages_SavedReactionTags = i != 844731658 ? null : new TLRPC$TL_messages_savedReactionsTags();
        }
        if (tLRPC$messages_SavedReactionTags == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_SavedReactionTags", Integer.valueOf(i)));
        }
        if (tLRPC$messages_SavedReactionTags != null) {
            tLRPC$messages_SavedReactionTags.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_SavedReactionTags;
    }
}
