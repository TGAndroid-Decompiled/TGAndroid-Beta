package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$TL_botCommand;
public abstract class TL_bots$BotInfo extends TLObject {
    public ArrayList<TLRPC$TL_botCommand> commands = new ArrayList<>();
    public String description;
    public TLRPC$Document description_document;
    public TLRPC$Photo description_photo;
    public int flags;
    public boolean has_preview_medias;
    public TL_bots$BotMenuButton menu_button;
    public long user_id;
    public int version;

    public static TL_bots$BotInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_bots$BotInfo tL_bots$TL_botInfo;
        switch (i) {
            case -1892676777:
                tL_bots$TL_botInfo = new TL_bots$TL_botInfo();
                break;
            case -1729618630:
                tL_bots$TL_botInfo = new TL_bots$TL_botInfo() {
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
                        abstractSerializedData2.writeInt32(-1729618630);
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
                tL_bots$TL_botInfo = new TL_bots$TL_botInfo() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1154598962);
                    }
                };
                break;
            case -468280483:
                tL_bots$TL_botInfo = new TL_bots$TL_botInfo() {
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
                        this.menu_button = TL_bots$BotMenuButton.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-468280483);
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
                tL_bots$TL_botInfo = new TL_bots$TL_botInfo() {
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
                        abstractSerializedData2.writeInt32(164583517);
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
                tL_bots$TL_botInfo = new TL_bots$BotInfo() {
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
                        abstractSerializedData2.writeInt32(460632885);
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
                tL_bots$TL_botInfo = null;
                break;
        }
        if (tL_bots$TL_botInfo == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotInfo", Integer.valueOf(i)));
        }
        if (tL_bots$TL_botInfo != null) {
            tL_bots$TL_botInfo.readParams(abstractSerializedData, z);
        }
        return tL_bots$TL_botInfo;
    }
}
