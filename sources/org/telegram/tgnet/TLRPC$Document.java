package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;

public abstract class TLRPC$Document extends TLObject {
    public long access_hash;
    public int date;
    public int dc_id;
    public String file_name;
    public String file_name_fixed;
    public byte[] file_reference;
    public int flags;
    public long f861id;
    public byte[] f862iv;
    public byte[] key;
    public String localPath;
    public String mime_type;
    public int size;
    public long user_id;
    public int version;
    public ArrayList<TLRPC$PhotoSize> thumbs = new ArrayList<>();
    public ArrayList<TLRPC$VideoSize> video_thumbs = new ArrayList<>();
    public ArrayList<TLRPC$DocumentAttribute> attributes = new ArrayList<>();

    public static TLRPC$Document TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Document tLRPC$Document;
        switch (i) {
            case -2027738169:
                tLRPC$Document = new TLRPC$TL_document_layer82();
                break;
            case -1683841855:
                tLRPC$Document = new TLRPC$TL_document() {
                    public static int constructor = -1683841855;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.f861id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            int readInt32 = abstractSerializedData2.readInt32(z2);
                            if (readInt32 == 481674261) {
                                int readInt322 = abstractSerializedData2.readInt32(z2);
                                int i2 = 0;
                                while (i2 < readInt322) {
                                    int i3 = i2;
                                    TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                    if (TLdeserialize != null) {
                                        this.thumbs.add(TLdeserialize);
                                        i2 = i3 + 1;
                                    } else {
                                        return;
                                    }
                                }
                            } else if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            } else {
                                return;
                            }
                        }
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        if (readInt323 == 481674261) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt324; i4++) {
                                TLRPC$DocumentAttribute TLdeserialize2 = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 != null) {
                                    this.attributes.add(TLdeserialize2);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.f861id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32(this.size);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.thumbs.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i2 = 0; i2 < size; i2++) {
                                this.thumbs.get(i2).serializeToStream(abstractSerializedData2);
                            }
                        }
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.attributes.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i3 = 0; i3 < size2; i3++) {
                            this.attributes.get(i3).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1627626714:
                tLRPC$Document = new TLRPC$TL_document() {
                    public static int constructor = -1627626714;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f861id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.file_name = abstractSerializedData2.readString(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f861id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.file_name);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32(this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                    }
                };
                break;
            case -106717361:
                tLRPC$Document = new TLRPC$TL_document() {
                    public static int constructor = -106717361;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f861id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.attributes.add(TLdeserialize);
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
                        abstractSerializedData2.writeInt64(this.f861id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32(this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.attributes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.attributes.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 512177195:
                tLRPC$Document = new TLRPC$TL_document();
                break;
            case 922273905:
                tLRPC$Document = new TLRPC$TL_documentEmpty();
                break;
            case 1431655766:
                tLRPC$Document = new TLRPC$TL_document() {
                    public static int constructor = 1431655766;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f861id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.file_name = abstractSerializedData2.readString(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        this.key = abstractSerializedData2.readByteArray(z2);
                        this.f862iv = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.f861id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.file_name);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32(this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeByteArray(this.key);
                        abstractSerializedData2.writeByteArray(this.f862iv);
                    }
                };
                break;
            case 1431655768:
                tLRPC$Document = new TLRPC$TL_documentEncrypted();
                break;
            case 1498631756:
                tLRPC$Document = new TLRPC$TL_document() {
                    public static int constructor = 1498631756;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f861id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.attributes.add(TLdeserialize);
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
                        abstractSerializedData2.writeInt64(this.f861id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32(this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.attributes.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.attributes.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            default:
                tLRPC$Document = null;
                break;
        }
        if (tLRPC$Document != null || !z) {
            if (tLRPC$Document != null) {
                tLRPC$Document.readParams(abstractSerializedData, z);
                tLRPC$Document.file_name_fixed = FileLoader.getDocumentFileName(tLRPC$Document);
            }
            return tLRPC$Document;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Document", Integer.valueOf(i)));
    }
}
