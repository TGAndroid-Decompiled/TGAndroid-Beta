package org.telegram.tgnet;

public abstract class TLRPC$PageListItem extends TLObject {
    public static TLRPC$PageListItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PageListItem tLRPC$TL_pageListItemBlocks = i != -1188055347 ? i != 635466748 ? null : new TLRPC$TL_pageListItemBlocks() : new TLRPC$TL_pageListItemText();
        if (tLRPC$TL_pageListItemBlocks == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PageListItem", Integer.valueOf(i)));
        }
        if (tLRPC$TL_pageListItemBlocks != null) {
            tLRPC$TL_pageListItemBlocks.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_pageListItemBlocks;
    }
}
