package org.telegram.tgnet;

public abstract class TLRPC$MessageEntity extends TLObject {
    public String language;
    public int length;
    public int offset;
    public String url;

    public static TLRPC$MessageEntity TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageEntity tLRPC$MessageEntity;
        switch (i) {
            case -2106619040:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityItalic();
                break;
            case -1687559349:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = -1687559349;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -1672577397:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityUnderline();
                break;
            case -1148011883:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = -1148011883;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -1117713463:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityBold();
                break;
            case -1090087980:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityStrike();
                break;
            case -595914432:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityMentionName();
                break;
            case -100378723:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = -100378723;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 34469328:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityBlockquote();
                break;
            case 546203849:
                tLRPC$MessageEntity = new TLRPC$TL_inputMessageEntityMentionName();
                break;
            case 681706865:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityCode();
                break;
            case 852137487:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntitySpoiler();
                break;
            case 892193368:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityMentionName() {
                    public static int constructor = 892193368;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case 1280209983:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1280209983;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1592721940:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1592721940;
                    public int length;
                    public int offset;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1692693954:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1692693954;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1827637959:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1827637959;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1859134776:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityUrl();
                break;
            case 1868782349:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1868782349;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1938967520:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityPre();
                break;
            case 1981704948:
                tLRPC$MessageEntity = new TLRPC$MessageEntity() {
                    public static int constructor = 1981704948;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.offset = abstractSerializedData2.readInt32(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.offset);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1990644519:
                tLRPC$MessageEntity = new TLRPC$TL_messageEntityTextUrl();
                break;
            default:
                tLRPC$MessageEntity = null;
                break;
        }
        if (tLRPC$MessageEntity != null || !z) {
            if (tLRPC$MessageEntity != null) {
                tLRPC$MessageEntity.readParams(abstractSerializedData, z);
            }
            return tLRPC$MessageEntity;
        }
        throw new RuntimeException(String.format("can't parse magic %x in MessageEntity", Integer.valueOf(i)));
    }
}
