package org.telegram.tgnet;

public abstract class TLRPC$PageListOrderedItem extends TLObject {
    public static TLRPC$PageListOrderedItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem;
        if (i != -1730311882) {
            tLRPC$PageListOrderedItem = i != 1577484359 ? null : new TLRPC$TL_pageListOrderedItemText();
        } else {
            tLRPC$PageListOrderedItem = new TLRPC$TL_pageListOrderedItemBlocks();
        }
        if (tLRPC$PageListOrderedItem != null || !z) {
            if (tLRPC$PageListOrderedItem != null) {
                tLRPC$PageListOrderedItem.readParams(abstractSerializedData, z);
            }
            return tLRPC$PageListOrderedItem;
        }
        throw new RuntimeException(String.format("can't parse magic %x in PageListOrderedItem", Integer.valueOf(i)));
    }
}
