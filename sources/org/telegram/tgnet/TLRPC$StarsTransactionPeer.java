package org.telegram.tgnet;
public class TLRPC$StarsTransactionPeer extends TLObject {
    public TLRPC$Peer peer;

    public static TLRPC$StarsTransactionPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StarsTransactionPeer tLRPC$StarsTransactionPeer;
        switch (i) {
            case -1779253276:
                tLRPC$StarsTransactionPeer = new TLRPC$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1779253276);
                    }
                };
                break;
            case -1269320843:
                tLRPC$StarsTransactionPeer = new TLRPC$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1269320843);
                    }
                };
                break;
            case -670195363:
                tLRPC$StarsTransactionPeer = new TLRPC$TL_starsTransactionPeer();
                break;
            case -382740222:
                tLRPC$StarsTransactionPeer = new TLRPC$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-382740222);
                    }
                };
                break;
            case 621656824:
                tLRPC$StarsTransactionPeer = new TLRPC$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(621656824);
                    }
                };
                break;
            case 2069236235:
                tLRPC$StarsTransactionPeer = new TLRPC$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(2069236235);
                    }
                };
                break;
            default:
                tLRPC$StarsTransactionPeer = null;
                break;
        }
        if (tLRPC$StarsTransactionPeer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarsTransactionPeer", Integer.valueOf(i)));
        }
        if (tLRPC$StarsTransactionPeer != null) {
            tLRPC$StarsTransactionPeer.readParams(abstractSerializedData, z);
        }
        return tLRPC$StarsTransactionPeer;
    }
}
