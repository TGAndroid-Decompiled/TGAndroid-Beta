package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$messages_AllStickers extends TLObject {
    public ArrayList sets = new ArrayList();
    public ArrayList packs = new ArrayList();
    public ArrayList documents = new ArrayList();

    public static TLRPC$messages_AllStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_AllStickers tLRPC$TL_messages_allStickers = i != -843329861 ? i != -395967805 ? null : new TLRPC$messages_AllStickers() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-395967805);
            }
        } : new TLRPC$TL_messages_allStickers();
        if (tLRPC$TL_messages_allStickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_AllStickers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_allStickers != null) {
            tLRPC$TL_messages_allStickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_allStickers;
    }
}
