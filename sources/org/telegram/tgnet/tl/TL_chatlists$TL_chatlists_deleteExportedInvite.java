package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Bool;
public class TL_chatlists$TL_chatlists_deleteExportedInvite extends TLObject {
    public TL_chatlists$TL_inputChatlistDialogFilter chatlist;
    public String slug;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1906072670);
        this.chatlist.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.slug);
    }
}
