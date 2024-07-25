package org.telegram.tgnet;
public class TLRPC$messages_SavedDialogs extends TLObject {
    public static TLRPC$messages_SavedDialogs TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_SavedDialogs tLRPC$TL_messages_savedDialogsSlice = i != -1071681560 ? i != -130358751 ? i != 1153080793 ? null : new TLRPC$TL_messages_savedDialogsSlice() : new TLRPC$TL_messages_savedDialogs() : new TLRPC$TL_messages_savedDialogsNotModified();
        if (tLRPC$TL_messages_savedDialogsSlice == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_SavedDialogs", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_savedDialogsSlice != null) {
            tLRPC$TL_messages_savedDialogsSlice.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_savedDialogsSlice;
    }
}
