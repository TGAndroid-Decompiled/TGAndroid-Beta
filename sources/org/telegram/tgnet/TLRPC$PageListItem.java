package org.telegram.tgnet;
public abstract class TLRPC$PageListItem extends TLObject {
    public static TLRPC$PageListItem TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PageListItem tLRPC$TL_pageListItemText;
        if (i != -1188055347) {
            tLRPC$TL_pageListItemText = i != 635466748 ? null : new TLRPC$TL_pageListItemBlocks();
        } else {
            tLRPC$TL_pageListItemText = new TLRPC$TL_pageListItemText();
        }
        if (tLRPC$TL_pageListItemText == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PageListItem", Integer.valueOf(i)));
        }
        if (tLRPC$TL_pageListItemText != null) {
            tLRPC$TL_pageListItemText.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_pageListItemText;
    }
}
