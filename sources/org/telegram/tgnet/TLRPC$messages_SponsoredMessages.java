package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$messages_SponsoredMessages extends TLObject {
    public int flags;
    public int posts_between;
    public ArrayList<TLRPC$TL_sponsoredMessage> messages = new ArrayList<>();
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$messages_SponsoredMessages TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_SponsoredMessages tLRPC$messages_SponsoredMessages;
        if (i == -907141753) {
            tLRPC$messages_SponsoredMessages = new TLRPC$messages_SponsoredMessages() {
                public static int constructor = -907141753;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    if ((readInt32 & 1) != 0) {
                        this.posts_between = abstractSerializedData2.readInt32(z2);
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    if (readInt322 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                        }
                        return;
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt323; i2++) {
                        TLRPC$TL_sponsoredMessage TLdeserialize = TLRPC$TL_sponsoredMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.messages.add(TLdeserialize);
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
                        TLRPC$Chat TLdeserialize2 = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.chats.add(TLdeserialize2);
                    }
                    int readInt326 = abstractSerializedData2.readInt32(z2);
                    if (readInt326 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                        }
                        return;
                    }
                    int readInt327 = abstractSerializedData2.readInt32(z2);
                    for (int i4 = 0; i4 < readInt327; i4++) {
                        TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize3 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize3);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.flags);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeInt32(this.posts_between);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.messages.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.messages.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.chats.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.chats.get(i3).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size3 = this.users.size();
                    abstractSerializedData2.writeInt32(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        this.users.get(i4).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else if (i == 406407439) {
            tLRPC$messages_SponsoredMessages = new TLRPC$messages_SponsoredMessages() {
                public static int constructor = 406407439;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$messages_SponsoredMessages = i != 1705297877 ? null : new TLRPC$messages_SponsoredMessages() {
                public static int constructor = -907141753;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$TL_sponsoredMessage TLdeserialize = TLRPC$TL_sponsoredMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.messages.add(TLdeserialize);
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    if (readInt323 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                        return;
                    }
                    int readInt324 = abstractSerializedData2.readInt32(z2);
                    for (int i3 = 0; i3 < readInt324; i3++) {
                        TLRPC$Chat TLdeserialize2 = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.chats.add(TLdeserialize2);
                    }
                    int readInt325 = abstractSerializedData2.readInt32(z2);
                    if (readInt325 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                        }
                        return;
                    }
                    int readInt326 = abstractSerializedData2.readInt32(z2);
                    for (int i4 = 0; i4 < readInt326; i4++) {
                        TLRPC$User TLdeserialize3 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize3 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize3);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.messages.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.messages.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.chats.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.chats.get(i3).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size3 = this.users.size();
                    abstractSerializedData2.writeInt32(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        this.users.get(i4).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$messages_SponsoredMessages == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_SponsoredMessages", Integer.valueOf(i)));
        }
        if (tLRPC$messages_SponsoredMessages != null) {
            tLRPC$messages_SponsoredMessages.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_SponsoredMessages;
    }
}
