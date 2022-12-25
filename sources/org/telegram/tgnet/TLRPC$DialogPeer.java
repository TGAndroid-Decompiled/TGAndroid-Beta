package org.telegram.tgnet;

public abstract class TLRPC$DialogPeer extends TLObject {
    public static TLRPC$DialogPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DialogPeer tLRPC$TL_dialogPeer;
        if (i == -445792507) {
            tLRPC$TL_dialogPeer = new TLRPC$TL_dialogPeer();
        } else {
            tLRPC$TL_dialogPeer = i != 1363483106 ? null : new TLRPC$DialogPeer() {
                public static int constructor = 1363483106;
                public int folder_id;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.folder_id = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.folder_id);
                }
            };
        }
        if (tLRPC$TL_dialogPeer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DialogPeer", Integer.valueOf(i)));
        }
        if (tLRPC$TL_dialogPeer != null) {
            tLRPC$TL_dialogPeer.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_dialogPeer;
    }
}
