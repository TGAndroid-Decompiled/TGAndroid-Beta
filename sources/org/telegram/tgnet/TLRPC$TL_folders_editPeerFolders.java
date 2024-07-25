package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_folders_editPeerFolders extends TLObject {
    public ArrayList<TLRPC$TL_inputFolderPeer> folder_peers = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1749536939);
        abstractSerializedData.writeInt32(481674261);
        int size = this.folder_peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.folder_peers.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
