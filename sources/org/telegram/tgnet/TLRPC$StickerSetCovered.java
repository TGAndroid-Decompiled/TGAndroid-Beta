package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$StickerSetCovered extends TLObject {
    public TLRPC$Document cover;
    public ArrayList<TLRPC$Document> covers = new ArrayList<>();
    public TLRPC$StickerSet set;

    public static TLRPC$StickerSetCovered TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered;
        switch (i) {
            case 451763941:
                tLRPC$StickerSetCovered = new TLRPC$TL_stickerSetFullCovered() {
                    public static int constructor = 451763941;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_stickerPack TLdeserialize = TLRPC$TL_stickerPack.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.packs.add(TLdeserialize);
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        if (readInt323 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                            }
                            return;
                        }
                        int readInt324 = abstractSerializedData2.readInt32(z2);
                        for (int i3 = 0; i3 < readInt324; i3++) {
                            TLRPC$Document TLdeserialize2 = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.documents.add(TLdeserialize2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.set.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.packs.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.packs.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.documents.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i3 = 0; i3 < size2; i3++) {
                            this.documents.get(i3).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 872932635:
                tLRPC$StickerSetCovered = new TLRPC$StickerSetCovered() {
                    public static int constructor = 872932635;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.covers.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.set.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.covers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.covers.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1087454222:
                tLRPC$StickerSetCovered = new TLRPC$TL_stickerSetFullCovered();
                break;
            case 1678812626:
                tLRPC$StickerSetCovered = new TLRPC$StickerSetCovered() {
                    public static int constructor = 1678812626;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.cover = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.set.serializeToStream(abstractSerializedData2);
                        this.cover.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 2008112412:
                tLRPC$StickerSetCovered = new TLRPC$StickerSetCovered() {
                    public static int constructor = 2008112412;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.set.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            default:
                tLRPC$StickerSetCovered = null;
                break;
        }
        if (tLRPC$StickerSetCovered == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StickerSetCovered", Integer.valueOf(i)));
        }
        if (tLRPC$StickerSetCovered != null) {
            tLRPC$StickerSetCovered.readParams(abstractSerializedData, z);
        }
        return tLRPC$StickerSetCovered;
    }
}
