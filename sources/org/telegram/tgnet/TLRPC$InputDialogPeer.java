package org.telegram.tgnet;

public abstract class TLRPC$InputDialogPeer extends TLObject {
    public static TLRPC$InputDialogPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputDialogPeer tLRPC$InputDialogPeer;
        if (i != -55902537) {
            tLRPC$InputDialogPeer = i != 1684014375 ? null : new TLRPC$InputDialogPeer() {
                public static int constructor = 1684014375;
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
        } else {
            tLRPC$InputDialogPeer = new TLRPC$TL_inputDialogPeer();
        }
        if (tLRPC$InputDialogPeer != null || !z) {
            if (tLRPC$InputDialogPeer != null) {
                tLRPC$InputDialogPeer.readParams(abstractSerializedData, z);
            }
            return tLRPC$InputDialogPeer;
        }
        throw new RuntimeException(String.format("can't parse magic %x in InputDialogPeer", Integer.valueOf(i)));
    }
}
