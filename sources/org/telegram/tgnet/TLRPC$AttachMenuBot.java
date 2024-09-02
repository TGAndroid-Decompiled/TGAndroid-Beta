package org.telegram.tgnet;

public abstract class TLRPC$AttachMenuBot extends TLObject {
    public static TLRPC$TL_attachMenuBot TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = i != -928371502 ? i != -653423106 ? i != -381896846 ? null : new TLRPC$TL_attachMenuBot() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.inactive = (readInt32 & 1) != 0;
                this.bot_id = abstractSerializedData2.readInt64(z2);
                this.short_name = abstractSerializedData2.readString(z2);
                int readInt322 = abstractSerializedData2.readInt32(z2);
                if (readInt322 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                    }
                    return;
                }
                int readInt323 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt323; i2++) {
                    TLRPC$TL_attachMenuBotIcon TLdeserialize = TLRPC$TL_attachMenuBotIcon.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.icons.add(TLdeserialize);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-381896846);
                int i2 = this.inactive ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt64(this.bot_id);
                abstractSerializedData2.writeString(this.short_name);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.icons.size();
                abstractSerializedData2.writeInt32(size);
                for (int i3 = 0; i3 < size; i3++) {
                    this.icons.get(i3).serializeToStream(abstractSerializedData2);
                }
            }
        } : new TLRPC$TL_attachMenuBot() : new TLRPC$TL_attachMenuBot() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.inactive = (readInt32 & 1) != 0;
                this.has_settings = (readInt32 & 2) != 0;
                this.request_write_access = (readInt32 & 4) != 0;
                this.bot_id = abstractSerializedData2.readInt64(z2);
                this.short_name = abstractSerializedData2.readString(z2);
                int readInt322 = abstractSerializedData2.readInt32(z2);
                if (readInt322 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                    }
                    return;
                }
                int readInt323 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt323; i2++) {
                    TLRPC$AttachMenuPeerType TLdeserialize = TLRPC$AttachMenuPeerType.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.peer_types.add(TLdeserialize);
                }
                int readInt324 = abstractSerializedData2.readInt32(z2);
                if (readInt324 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                    }
                    return;
                }
                int readInt325 = abstractSerializedData2.readInt32(z2);
                for (int i3 = 0; i3 < readInt325; i3++) {
                    TLRPC$TL_attachMenuBotIcon TLdeserialize2 = TLRPC$TL_attachMenuBotIcon.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize2 == null) {
                        return;
                    }
                    this.icons.add(TLdeserialize2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-928371502);
                int i2 = this.inactive ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                int i3 = this.has_settings ? i2 | 2 : i2 & (-3);
                this.flags = i3;
                int i4 = this.request_write_access ? i3 | 4 : i3 & (-5);
                this.flags = i4;
                abstractSerializedData2.writeInt32(i4);
                abstractSerializedData2.writeInt64(this.bot_id);
                abstractSerializedData2.writeString(this.short_name);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.peer_types.size();
                abstractSerializedData2.writeInt32(size);
                for (int i5 = 0; i5 < size; i5++) {
                    this.peer_types.get(i5).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size2 = this.icons.size();
                abstractSerializedData2.writeInt32(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    this.icons.get(i6).serializeToStream(abstractSerializedData2);
                }
            }
        };
        if (tLRPC$TL_attachMenuBot == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in AttachMenuBot", Integer.valueOf(i)));
        }
        if (tLRPC$TL_attachMenuBot != null) {
            tLRPC$TL_attachMenuBot.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_attachMenuBot;
    }
}
