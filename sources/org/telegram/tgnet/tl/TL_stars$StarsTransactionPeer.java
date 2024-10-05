package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;

public abstract class TL_stars$StarsTransactionPeer extends TLObject {
    public TLRPC$Peer peer;

    public static TL_stars$StarsTransactionPeer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$StarsTransactionPeer tL_stars$StarsTransactionPeer;
        switch (i) {
            case -1779253276:
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
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
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
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
                tL_stars$StarsTransactionPeer = new TL_stars$TL_starsTransactionPeer();
                break;
            case -382740222:
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
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
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(621656824);
                    }
                };
                break;
            case 1617438738:
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1617438738);
                    }
                };
                break;
            case 2069236235:
                tL_stars$StarsTransactionPeer = new TL_stars$StarsTransactionPeer() {
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
                tL_stars$StarsTransactionPeer = null;
                break;
        }
        if (tL_stars$StarsTransactionPeer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarsTransactionPeer", Integer.valueOf(i)));
        }
        if (tL_stars$StarsTransactionPeer != null) {
            tL_stars$StarsTransactionPeer.readParams(abstractSerializedData, z);
        }
        return tL_stars$StarsTransactionPeer;
    }
}
