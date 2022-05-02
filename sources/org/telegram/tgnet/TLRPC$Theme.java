package org.telegram.tgnet;

public abstract class TLRPC$Theme extends TLObject {
    public static TLRPC$TL_theme TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_theme tLRPC$TL_theme;
        switch (i) {
            case -1609668650:
                tLRPC$TL_theme = new TLRPC$TL_theme();
                break;
            case -402474788:
                tLRPC$TL_theme = new TLRPC$TL_theme() {
                    public static int constructor = -402474788;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.creator = (readInt32 & 1) != 0;
                        this.isDefault = (readInt32 & 2) != 0;
                        if ((readInt32 & 32) != 0) {
                            z3 = true;
                        }
                        this.for_chat = z3;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.slug = abstractSerializedData2.readString(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.settings.add(TLRPC$ThemeSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        }
                        if ((this.flags & 16) != 0) {
                            this.installs_count = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.isDefault ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.for_chat ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.slug);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 4) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.settings.get(0).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.installs_count);
                        }
                    }
                };
                break;
            case -136770336:
                tLRPC$TL_theme = new TLRPC$TL_theme() {
                    public static int constructor = -136770336;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.creator = (readInt32 & 1) != 0;
                        if ((readInt32 & 2) != 0) {
                            z3 = true;
                        }
                        this.isDefault = z3;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.slug = abstractSerializedData2.readString(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.installs_count = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.isDefault ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.slug);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 4) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.installs_count);
                    }
                };
                break;
            case 42930452:
                tLRPC$TL_theme = new TLRPC$TL_theme() {
                    public static int constructor = 42930452;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.creator = (readInt32 & 1) != 0;
                        if ((readInt32 & 2) != 0) {
                            z3 = true;
                        }
                        this.isDefault = z3;
                        this.id = abstractSerializedData2.readInt64(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.slug = abstractSerializedData2.readString(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.settings.add(TLRPC$ThemeSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                        }
                        this.installs_count = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.isDefault ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.slug);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 4) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.settings.get(0).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.installs_count);
                    }
                };
                break;
            case 1211967244:
                tLRPC$TL_theme = new TLRPC$TL_theme() {
                    public static int constructor = 1211967244;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$TL_theme = null;
                break;
        }
        if (tLRPC$TL_theme != null || !z) {
            if (tLRPC$TL_theme != null) {
                tLRPC$TL_theme.readParams(abstractSerializedData, z);
            }
            return tLRPC$TL_theme;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Theme", Integer.valueOf(i)));
    }
}
