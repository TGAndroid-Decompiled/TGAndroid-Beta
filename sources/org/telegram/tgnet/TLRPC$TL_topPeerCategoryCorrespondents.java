package org.telegram.tgnet;

public class TLRPC$TL_topPeerCategoryCorrespondents extends TLRPC$TopPeerCategory {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(104314861);
    }
}
