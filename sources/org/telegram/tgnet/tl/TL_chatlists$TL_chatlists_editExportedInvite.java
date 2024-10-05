package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputPeer;

public class TL_chatlists$TL_chatlists_editExportedInvite extends TLObject {
    public TL_chatlists$TL_inputChatlistDialogFilter chatlist;
    public int flags;
    public ArrayList peers = new ArrayList();
    public boolean revoked;
    public String slug;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_chatlists$TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1698543165);
        int i = this.revoked ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.chatlist.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.slug);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC$InputPeer) this.peers.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
    }
}
