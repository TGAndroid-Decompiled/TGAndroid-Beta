package org.telegram.tgnet;

public class TLRPC$TL_inputFolderPeer extends TLObject {
    public static int constructor = -70073706;
    public int folder_id;
    public TLRPC$InputPeer peer;

    public static TLRPC$TL_inputFolderPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_inputFolderPeer tLRPC$TL_inputFolderPeer = new TLRPC$TL_inputFolderPeer();
            tLRPC$TL_inputFolderPeer.readParams(abstractSerializedData, z);
            return tLRPC$TL_inputFolderPeer;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_inputFolderPeer", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.folder_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.folder_id);
    }
}
