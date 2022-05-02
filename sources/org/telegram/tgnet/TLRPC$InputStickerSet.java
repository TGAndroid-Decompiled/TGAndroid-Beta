package org.telegram.tgnet;

public abstract class TLRPC$InputStickerSet extends TLObject {
    public long access_hash;
    public long id;
    public String short_name;

    public static TLRPC$InputStickerSet TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputStickerSet tLRPC$InputStickerSet;
        switch (i) {
            case -2044933984:
                tLRPC$InputStickerSet = new TLRPC$TL_inputStickerSetShortName();
                break;
            case -1645763991:
                tLRPC$InputStickerSet = new TLRPC$TL_inputStickerSetID();
                break;
            case -427863538:
                tLRPC$InputStickerSet = new TLRPC$TL_inputStickerSetDice();
                break;
            case -4838507:
                tLRPC$InputStickerSet = new TLRPC$TL_inputStickerSetEmpty();
                break;
            case 42402760:
                tLRPC$InputStickerSet = new TLRPC$TL_inputStickerSetAnimatedEmoji();
                break;
            default:
                tLRPC$InputStickerSet = null;
                break;
        }
        if (tLRPC$InputStickerSet != null || !z) {
            if (tLRPC$InputStickerSet != null) {
                tLRPC$InputStickerSet.readParams(abstractSerializedData, z);
            }
            return tLRPC$InputStickerSet;
        }
        throw new RuntimeException(String.format("can't parse magic %x in InputStickerSet", Integer.valueOf(i)));
    }
}
