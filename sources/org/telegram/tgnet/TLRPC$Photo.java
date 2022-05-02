package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$Photo extends TLObject {
    public long access_hash;
    public String caption;
    public int date;
    public int dc_id;
    public byte[] file_reference;
    public int flags;
    public TLRPC$GeoPoint geo;
    public boolean has_stickers;
    public long f882id;
    public long user_id;
    public ArrayList<TLRPC$PhotoSize> sizes = new ArrayList<>();
    public ArrayList<TLRPC$VideoSize> video_sizes = new ArrayList<>();

    public static TLRPC$Photo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Photo tLRPC$Photo;
        switch (i) {
            case -1836524247:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = -1836524247;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.has_stickers = (readInt32 & 1) != 0;
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 == 481674261) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.has_stickers ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.sizes.get(i3).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1673036328:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = -1673036328;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.has_stickers = (readInt32 & 1) != 0;
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 == 481674261) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.has_stickers ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.sizes.get(i3).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1014792074:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = -1014792074;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.sizes.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -840088834:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = -840088834;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.sizes.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -797637467:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = -797637467;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.has_stickers = (readInt32 & 1) != 0;
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 == 481674261) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                            this.dc_id = abstractSerializedData2.readInt32(z2);
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.has_stickers ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.sizes.get(i3).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.dc_id);
                    }
                };
                break;
            case -82216347:
                tLRPC$Photo = new TLRPC$TL_photo();
                break;
            case 582313809:
                tLRPC$Photo = new TLRPC$TL_photo() {
                    public static int constructor = 582313809;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f882id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.caption = abstractSerializedData2.readString(z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.sizes.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f882id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.caption);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.sizes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.sizes.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 590459437:
                tLRPC$Photo = new TLRPC$TL_photoEmpty();
                break;
            default:
                tLRPC$Photo = null;
                break;
        }
        if (tLRPC$Photo != null || !z) {
            if (tLRPC$Photo != null) {
                tLRPC$Photo.readParams(abstractSerializedData, z);
            }
            return tLRPC$Photo;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Photo", Integer.valueOf(i)));
    }
}
