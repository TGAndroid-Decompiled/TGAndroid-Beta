package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_chatlists$TL_chatlists_getChatlistUpdates extends TLObject {
    public TL_chatlists$TL_inputChatlistDialogFilter chatlist;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_chatlists$TL_chatlists_chatlistUpdates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1992190687);
        this.chatlist.serializeToStream(abstractSerializedData);
    }
}
