package org.telegram.tgnet;

public abstract class TLRPC$InputDialogPeer extends TLObject {
    public static TLRPC$InputDialogPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputDialogPeer tLRPC$TL_inputDialogPeer;
        if (i == -55902537) {
            tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
        } else {
            tLRPC$TL_inputDialogPeer = i != 1684014375 ? null : new TLRPC$InputDialogPeer() {
                public int folder_id;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.folder_id = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1684014375);
                    abstractSerializedData2.writeInt32(this.folder_id);
                }
            };
        }
        if (tLRPC$TL_inputDialogPeer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputDialogPeer", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputDialogPeer != null) {
            tLRPC$TL_inputDialogPeer.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputDialogPeer;
    }
}
