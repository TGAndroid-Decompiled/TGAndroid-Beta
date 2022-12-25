package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$BotInfo extends TLObject {
    public ArrayList<TLRPC$TL_botCommand> commands = new ArrayList<>();
    public String description;
    public TLRPC$Document description_document;
    public TLRPC$Photo description_photo;
    public int flags;
    public TLRPC$BotMenuButton menu_button;
    public long user_id;
    public int version;

    public static TLRPC$BotInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BotInfo tLRPC$TL_botInfo;
        switch (i) {
            case -1892676777:
                tLRPC$TL_botInfo = new TLRPC$TL_botInfo();
                break;
            case -1729618630:
                tLRPC$TL_botInfo = new TLRPC$TL_botInfo() {
                    public static int constructor = -1729618630;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.description = abstractSerializedData2.readString(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_botCommand TLdeserialize = TLRPC$TL_botCommand.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.commands.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeString(this.description);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.commands.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.commands.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1154598962:
                tLRPC$TL_botInfo = new TLRPC$TL_botInfo() {
                    public static int constructor = -1154598962;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -468280483:
                tLRPC$TL_botInfo = new TLRPC$TL_botInfo() {
                    public static int constructor = -468280483;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt64(z2);
                        this.description = abstractSerializedData2.readString(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_botCommand TLdeserialize = TLRPC$TL_botCommand.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.commands.add(TLdeserialize);
                        }
                        this.menu_button = TLRPC$BotMenuButton.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.user_id);
                        abstractSerializedData2.writeString(this.description);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.commands.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.commands.get(i2).serializeToStream(abstractSerializedData2);
                        }
                        this.menu_button.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 164583517:
                tLRPC$TL_botInfo = new TLRPC$TL_botInfo() {
                    public static int constructor = 164583517;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.version = abstractSerializedData2.readInt32(z2);
                        abstractSerializedData2.readString(z2);
                        this.description = abstractSerializedData2.readString(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_botCommand TLdeserialize = TLRPC$TL_botCommand.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.commands.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32(this.version);
                        abstractSerializedData2.writeString("");
                        abstractSerializedData2.writeString(this.description);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.commands.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.commands.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 460632885:
                tLRPC$TL_botInfo = new TLRPC$BotInfo() {
                    public static int constructor = 460632885;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt64(z2);
                        this.description = abstractSerializedData2.readString(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_botCommand TLdeserialize = TLRPC$TL_botCommand.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.commands.add(TLdeserialize);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.user_id);
                        abstractSerializedData2.writeString(this.description);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.commands.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.commands.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            default:
                tLRPC$TL_botInfo = null;
                break;
        }
        if (tLRPC$TL_botInfo == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotInfo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_botInfo != null) {
            tLRPC$TL_botInfo.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_botInfo;
    }
}
