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
    public long id;
    public byte[] iv;
    public byte[] key;
    public String localPath;
    public String mime_type;
    public long size;
    public long user_id;
    public int version;
    public ArrayList<TLRPC$PhotoSize> thumbs = new ArrayList<>();
    public ArrayList<TLRPC$VideoSize> video_thumbs = new ArrayList<>();
    public ArrayList<TLRPC$DocumentAttribute> attributes = new ArrayList<>();

    public static TLRPC$Document TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Document tLRPC$TL_document_layer82;
        switch (i) {
            case -2027738169:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document_layer82();
                break;
            case TLRPC$TL_document.constructor:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document();
                break;
            case -1683841855:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            int readInt32 = abstractSerializedData2.readInt32(z2);
                            if (readInt32 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                                }
                                return;
                            }
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            int i2 = 0;
                            while (i2 < readInt322) {
                                int i3 = i2;
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.thumbs.add(TLdeserialize);
                                i2 = i3 + 1;
                            }
                        }
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        if (readInt323 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                            }
                            return;
                        }
                        int readInt324 = abstractSerializedData2.readInt32(z2);
                        for (int i4 = 0; i4 < readInt324; i4++) {
                            TLRPC$DocumentAttribute TLdeserialize2 = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.attributes.add(TLdeserialize2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1683841855);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
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
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        abstractSerializedData2.writeInt32(-1627626714);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.file_name);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                    }
                };
                break;
            case -106717361:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.attributes.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-106717361);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
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
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            int readInt32 = abstractSerializedData2.readInt32(z2);
                            if (readInt32 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                                }
                                return;
                            }
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            int i2 = 0;
                            while (i2 < readInt322) {
                                int i3 = i2;
                                TLRPC$PhotoSize TLdeserialize = TLRPC$PhotoSize.TLdeserialize(0L, this.id, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.thumbs.add(TLdeserialize);
                                i2 = i3 + 1;
                            }
                        }
                        if ((this.flags & 2) != 0) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            if (readInt323 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                                }
                                return;
                            }
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt324; i4++) {
                                TLRPC$VideoSize TLdeserialize2 = TLRPC$VideoSize.TLdeserialize(0L, this.id, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.video_thumbs.add(TLdeserialize2);
                            }
                        }
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt325 = abstractSerializedData2.readInt32(z2);
                        if (readInt325 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                            }
                            return;
                        }
                        int readInt326 = abstractSerializedData2.readInt32(z2);
                        for (int i5 = 0; i5 < readInt326; i5++) {
                            TLRPC$DocumentAttribute TLdeserialize3 = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize3 == null) {
                                return;
                            }
                            this.attributes.add(TLdeserialize3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(512177195);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.thumbs.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i2 = 0; i2 < size; i2++) {
                                this.thumbs.get(i2).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.video_thumbs.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i3 = 0; i3 < size2; i3++) {
                                this.video_thumbs.get(i3).serializeToStream(abstractSerializedData2);
                            }
                        }
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeInt32(481674261);
                        int size3 = this.attributes.size();
                        abstractSerializedData2.writeInt32(size3);
                        for (int i4 = 0; i4 < size3; i4++) {
                            this.attributes.get(i4).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 922273905:
                tLRPC$TL_document_layer82 = new TLRPC$TL_documentEmpty();
                break;
            case 1431655766:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.file_name = abstractSerializedData2.readString(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        this.key = abstractSerializedData2.readByteArray(z2);
                        this.iv = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1431655766);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.file_name);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
                        this.thumbs.get(0).serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.dc_id);
                        abstractSerializedData2.writeByteArray(this.key);
                        abstractSerializedData2.writeByteArray(this.iv);
                    }
                };
                break;
            case 1431655768:
                tLRPC$TL_document_layer82 = new TLRPC$TL_documentEncrypted();
                break;
            case 1498631756:
                tLRPC$TL_document_layer82 = new TLRPC$TL_document() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.file_reference = abstractSerializedData2.readByteArray(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.mime_type = abstractSerializedData2.readString(z2);
                        this.size = abstractSerializedData2.readInt32(z2);
                        this.thumbs.add(TLRPC$PhotoSize.TLdeserialize(0L, 0L, 0L, abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        this.dc_id = abstractSerializedData2.readInt32(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$DocumentAttribute TLdeserialize = TLRPC$DocumentAttribute.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.attributes.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1498631756);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeByteArray(this.file_reference);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.mime_type);
                        abstractSerializedData2.writeInt32((int) this.size);
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
                tLRPC$TL_document_layer82 = null;
                break;
        }
        if (tLRPC$TL_document_layer82 == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Document", Integer.valueOf(i)));
        }
        if (tLRPC$TL_document_layer82 != null) {
            tLRPC$TL_document_layer82.readParams(abstractSerializedData, z);
            tLRPC$TL_document_layer82.file_name_fixed = FileLoader.getDocumentFileName(tLRPC$TL_document_layer82);
        }
        return tLRPC$TL_document_layer82;
    }
}
