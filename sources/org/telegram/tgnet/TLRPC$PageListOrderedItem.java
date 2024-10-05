package org.telegram.tgnet;

public abstract class TLRPC$PageListOrderedItem extends TLObject {
    public static TLRPC$PageListOrderedItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PageListOrderedItem tLRPC$TL_pageListOrderedItemText = i != -1730311882 ? i != 1577484359 ? null : new TLRPC$TL_pageListOrderedItemText() : new TLRPC$TL_pageListOrderedItemBlocks();
        if (tLRPC$TL_pageListOrderedItemText == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PageListOrderedItem", Integer.valueOf(i)));
        }
        if (tLRPC$TL_pageListOrderedItemText != null) {
            tLRPC$TL_pageListOrderedItemText.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_pageListOrderedItemText;
    }
}
