package org.telegram.tgnet;

public abstract class TLRPC$DocumentAttribute extends TLObject {
    public String alt;
    public double duration;
    public String file_name;
    public int flags;
    public int h;
    public boolean mask;
    public TLRPC$TL_maskCoords mask_coords;
    public boolean nosound;
    public String performer;
    public int preload_prefix_size;
    public boolean round_message;
    public TLRPC$InputStickerSet stickerset;
    public boolean supports_streaming;
    public String title;
    public String video_codec;
    public double video_start_ts;
    public boolean voice;
    public int w;
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
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.alt = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1723033470);
                        abstractSerializedData2.writeString(this.alt);
                    }
                };
                break;
            case -745541182:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.round_message = (readInt32 & 1) != 0;
                        this.supports_streaming = (readInt32 & 2) != 0;
                        this.nosound = (readInt32 & 8) != 0;
                        this.duration = abstractSerializedData2.readDouble(z2);
                        this.w = abstractSerializedData2.readInt32(z2);
                        this.h = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.preload_prefix_size = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-745541182);
                        int i2 = this.round_message ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.supports_streaming ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.nosound ? i3 | 8 : i3 & (-9);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeDouble(this.duration);
                        abstractSerializedData2.writeInt32(this.w);
                        abstractSerializedData2.writeInt32(this.h);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.preload_prefix_size);
                        }
                    }
                };
                break;
            case -556656416:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAudio() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        this.performer = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-556656416);
                        abstractSerializedData2.writeInt32((int) this.duration);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.performer);
                    }
                };
                break;
            case -83208409:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-83208409);
                    }
                };
                break;
            case -48981863:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeCustomEmoji();
                break;
            case 85215461:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAudio() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(85215461);
                        abstractSerializedData2.writeInt32((int) this.duration);
                    }
                };
                break;
            case 250621158:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo_layer159();
                break;
            case 297109817:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeAnimated();
                break;
            case 358154344:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeFilename();
                break;
            case 389652397:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.round_message = (readInt32 & 1) != 0;
                        this.supports_streaming = (readInt32 & 2) != 0;
                        this.nosound = (readInt32 & 8) != 0;
                        this.duration = abstractSerializedData2.readDouble(z2);
                        this.w = abstractSerializedData2.readInt32(z2);
                        this.h = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.preload_prefix_size = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.video_start_ts = abstractSerializedData2.readDouble(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(389652397);
                        int i2 = this.round_message ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.supports_streaming ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.nosound ? i3 | 8 : i3 & (-9);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeDouble(this.duration);
                        abstractSerializedData2.writeInt32(this.w);
                        abstractSerializedData2.writeInt32(this.h);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.preload_prefix_size);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeDouble(this.video_start_ts);
                        }
                    }
                };
                break;
            case 978674434:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeSticker_layer55();
                break;
            case 1137015880:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo();
                break;
            case 1494273227:
                tLRPC$TL_documentAttributeHasStickers = new TLRPC$TL_documentAttributeVideo() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.duration = abstractSerializedData2.readInt32(z2);
                        this.w = abstractSerializedData2.readInt32(z2);
                        this.h = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1494273227);
                        abstractSerializedData2.writeInt32((int) this.duration);
                        abstractSerializedData2.writeInt32(this.w);
                        abstractSerializedData2.writeInt32(this.h);
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
