package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$DraftMessage extends TLObject {
    public int date;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String message;
    public boolean no_webpage;
    public int reply_to_msg_id;

    public static TLRPC$DraftMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DraftMessage tLRPC$DraftMessage;
        if (i == -1169445179) {
            tLRPC$DraftMessage = new TLRPC$TL_draftMessageEmpty() {
                public static int constructor = -1169445179;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else if (i != -40996577) {
            tLRPC$DraftMessage = i != 453805082 ? null : new TLRPC$TL_draftMessageEmpty();
        } else {
            tLRPC$DraftMessage = new TLRPC$TL_draftMessage();
        }
        if (tLRPC$DraftMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DraftMessage", Integer.valueOf(i)));
        }
        if (tLRPC$DraftMessage != null) {
            tLRPC$DraftMessage.readParams(abstractSerializedData, z);
        }
        return tLRPC$DraftMessage;
    }
}
