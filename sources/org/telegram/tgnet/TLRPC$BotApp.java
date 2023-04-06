package org.telegram.tgnet;
public abstract class TLRPC$BotApp extends TLObject {
    public long access_hash;
    public String description;
    public TLRPC$Document document;
    public int flags;
    public long hash;
    public long id;
    public TLRPC$Photo photo;
    public String short_name;
    public String title;

    public static TLRPC$BotApp TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BotApp tLRPC$BotApp;
        if (i != -1778593322) {
            tLRPC$BotApp = i != 1571189943 ? null : new TLRPC$BotApp() {
                public static int constructor = 1571189943;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$BotApp = new TLRPC$BotApp() {
                public static int constructor = -1778593322;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.id = abstractSerializedData2.readInt64(z2);
                    this.access_hash = abstractSerializedData2.readInt64(z2);
                    this.short_name = abstractSerializedData2.readString(z2);
                    this.title = abstractSerializedData2.readString(z2);
                    this.description = abstractSerializedData2.readString(z2);
                    this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if ((this.flags & 1) != 0) {
                        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }
                    this.hash = abstractSerializedData2.readInt64(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeInt64(this.id);
                    abstractSerializedData2.writeInt64(this.access_hash);
                    abstractSerializedData2.writeString(this.short_name);
                    abstractSerializedData2.writeString(this.title);
                    abstractSerializedData2.writeString(this.description);
                    this.photo.serializeToStream(abstractSerializedData2);
                    if ((this.flags & 1) != 0) {
                        this.document.serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt64(this.hash);
                }
            };
        }
        if (tLRPC$BotApp == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotApp", Integer.valueOf(i)));
        }
        if (tLRPC$BotApp != null) {
            tLRPC$BotApp.readParams(abstractSerializedData, z);
        }
        return tLRPC$BotApp;
    }
}
