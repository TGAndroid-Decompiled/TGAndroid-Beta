package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$KeyboardButton extends TLObject {
    public TLRPC$InputUser bot;
    public int button_id;
    public byte[] data;
    public int flags;
    public String fwd_text;
    public TLRPC$InputUser inputUser;
    public ArrayList<TLRPC$InlineQueryPeerType> peer_types = new ArrayList<>();
    public String query;
    public boolean quiz;
    public boolean request_write_access;
    public boolean requires_password;
    public boolean same_peer;
    public String text;
    public String url;
    public long user_id;

    public static TLRPC$KeyboardButton TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$KeyboardButton tLRPC$KeyboardButton;
        switch (i) {
            case -1816527947:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.same_peer = (readInt32 & 1) != 0;
                        this.text = abstractSerializedData2.readString(z2);
                        this.query = abstractSerializedData2.readString(z2);
                        if ((this.flags & 2) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$InlineQueryPeerType TLdeserialize = TLRPC$InlineQueryPeerType.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.peer_types.add(TLdeserialize);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1816527947);
                        int i2 = this.same_peer ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.query);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.peer_types.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                this.peer_types.get(i3).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case -1598009252:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.url = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1598009252);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.url);
                    }
                };
                break;
            case -1560655744:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButton();
                break;
            case -1344716869:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1344716869);
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case -1318425559:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1318425559);
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case -1144565411:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.quiz = abstractSerializedData2.readBool(z2);
                        }
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1144565411);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeBool(this.quiz);
                        }
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case -802258988:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.request_write_access = (readInt32 & 1) != 0;
                        this.text = abstractSerializedData2.readString(z2);
                        if ((this.flags & 2) != 0) {
                            this.fwd_text = abstractSerializedData2.readString(z2);
                        }
                        this.url = abstractSerializedData2.readString(z2);
                        this.bot = TLRPC$InputUser.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-802258988);
                        int i2 = this.request_write_access ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.text);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.fwd_text);
                        }
                        abstractSerializedData2.writeString(this.url);
                        this.bot.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -376962181:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.inputUser = TLRPC$InputUser.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-376962181);
                        abstractSerializedData2.writeString(this.text);
                        this.inputUser.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -59151553:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-59151553);
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case 90744648:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.same_peer = (readInt32 & 1) != 0;
                        this.text = abstractSerializedData2.readString(z2);
                        this.query = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(90744648);
                        int i2 = this.same_peer ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.query);
                    }
                };
                break;
            case 218842764:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButtonRequestPeer() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.button_id = abstractSerializedData2.readInt32(z2);
                        this.peer_type = TLRPC$RequestPeerType.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(218842764);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeInt32(this.button_id);
                        this.peer_type.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 280464681:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButtonUrlAuth();
                break;
            case 326529584:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.url = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(326529584);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.url);
                    }
                };
                break;
            case 629866245:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.url = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(629866245);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.url);
                    }
                };
                break;
            case 814112961:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.user_id = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(814112961);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeInt64(this.user_id);
                    }
                };
                break;
            case 901503851:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButtonCallback();
                break;
            case 1358175439:
                tLRPC$KeyboardButton = new TLRPC$KeyboardButton() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1358175439);
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case 1406648280:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButtonRequestPeer();
                break;
            case 1748655686:
                tLRPC$KeyboardButton = new TLRPC$TL_keyboardButtonCallback() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.data = abstractSerializedData2.readByteArray(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1748655686);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeByteArray(this.data);
                    }
                };
                break;
            default:
                tLRPC$KeyboardButton = null;
                break;
        }
        if (tLRPC$KeyboardButton == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in KeyboardButton", Integer.valueOf(i)));
        }
        if (tLRPC$KeyboardButton != null) {
            tLRPC$KeyboardButton.readParams(abstractSerializedData, z);
        }
        return tLRPC$KeyboardButton;
    }
}
