package org.telegram.tgnet;

public abstract class TLRPC$DocumentAttribute extends TLObject {
    public String alt;
    public int duration;
    public String file_name;
    public int flags;
    public int f858h;
    public boolean mask;
    public TLRPC$TL_maskCoords mask_coords;
    public String performer;
    public boolean round_message;
    public TLRPC$InputStickerSet stickerset;
    public boolean supports_streaming;
    public String title;
    public boolean voice;
    public int f859w;
    public byte[] waveform;

    public static TLRPC$DocumentAttribute TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DocumentAttribute tLRPC$TL_documentAttributeHasStickers;
        switch (i) {
            case -1744710921:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeHasStickers();
                break;
            case -1739392570:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAudio();
                break;
            case -1723033470:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker() {
                    public static int constructor = -1723033470;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.alt = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.alt);
                    }
                };
                break;
            case -556656416:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAudio() {
                    public static int constructor = -556656416;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        this.performer = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.duration);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.performer);
                    }
                };
                break;
            case -83208409:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker() {
                    public static int constructor = -83208409;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -48981863:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeCustomEmoji();
                break;
            case 85215461:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAudio() {
                    public static int constructor = 85215461;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.duration);
                    }
                };
                break;
            case 250621158:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo();
                break;
            case 297109817:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAnimated();
                break;
            case 358154344:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeFilename();
                break;
            case 978674434:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker_layer55();
                break;
            case 1494273227:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo() {
                    public static int constructor = 1494273227;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                        this.f859w = abstractSerializedData2.readInt32(z2);
                        this.f858h = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.duration);
                        abstractSerializedData2.writeInt32(this.f859w);
                        abstractSerializedData2.writeInt32(this.f858h);
                    }
                };
                break;
            case 1662637586:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker();
                break;
            case 1815593308:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeImageSize();
                break;
            default:
                tLRPC$TL_documentAttributeHasStickers = null;
                break;
        }
        if (tLRPC$TL_documentAttributeHasStickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DocumentAttribute", Integer.valueOf(i)));
        }
        if (tLRPC$TL_documentAttributeHasStickers != null) {
            tLRPC$TL_documentAttributeHasStickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_documentAttributeHasStickers;
    }
}
