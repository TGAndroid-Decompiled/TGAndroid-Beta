package org.telegram.tgnet;
public abstract class TLRPC$InputStickerSet extends TLObject {
    public long access_hash;
    public long id;
    public String short_name;

    public static TLRPC$InputStickerSet TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputStickerSet tLRPC$TL_inputStickerSetShortName;
        switch (i) {
            case -2044933984:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
                break;
            case -1645763991:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetID();
                break;
            case -930399486:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetPremiumGifts();
                break;
            case -427863538:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetDice();
                break;
            case -4838507:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetEmpty();
                break;
            case 42402760:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetAnimatedEmoji();
                break;
            case 80008398:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetEmojiGenericAnimations();
                break;
            case 701560302:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetEmojiDefaultStatuses();
                break;
            case 1153562857:
                tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetEmojiDefaultTopicIcons();
                break;
            default:
                tLRPC$TL_inputStickerSetShortName = null;
                break;
        }
        if (tLRPC$TL_inputStickerSetShortName == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputStickerSet", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputStickerSetShortName != null) {
            tLRPC$TL_inputStickerSetShortName.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputStickerSetShortName;
    }
}
