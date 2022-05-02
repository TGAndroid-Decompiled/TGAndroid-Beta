package org.telegram.tgnet;

public class TLRPC$TL_folderPeer extends TLObject {
    public static int constructor = -373643672;
    public int folder_id;
    public TLRPC$Peer peer;

    public static TLRPC$TL_folderPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_folderPeer tLRPC$TL_folderPeer = new TLRPC$TL_folderPeer();
            tLRPC$TL_folderPeer.readParams(abstractSerializedData, z);
            return tLRPC$TL_folderPeer;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_folderPeer", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.folder_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.folder_id);
    }
}
