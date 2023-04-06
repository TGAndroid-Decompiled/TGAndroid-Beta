package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_chatlists_editExportedInvite extends TLObject {
    public static int constructor = 1698543165;
    public TLRPC$TL_inputChatlistDialogFilter chatlist;
    public int flags;
    public ArrayList<TLRPC$InputPeer> peers = new ArrayList<>();
    public boolean revoked;
    public String slug;
    public String title;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
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
                this.peers.get(i2).serializeToStream(abstractSerializedData);
            }
        }
    }
}
