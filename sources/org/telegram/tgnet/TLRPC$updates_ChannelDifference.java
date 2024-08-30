package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$updates_ChannelDifference extends TLObject {
    public TLRPC$Dialog dialog;
    public int flags;
    public boolean isFinal;
    public int pts;
    public int timeout;
    public ArrayList new_messages = new ArrayList();
    public ArrayList other_updates = new ArrayList();
    public ArrayList chats = new ArrayList();
    public ArrayList users = new ArrayList();
    public ArrayList messages = new ArrayList();

    public static TLRPC$updates_ChannelDifference TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference = i != -1531132162 ? i != 543450958 ? i != 1041346555 ? null : new TLRPC$updates_ChannelDifference() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.isFinal = (readInt32 & 1) != 0;
                this.pts = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 2) != 0) {
                    this.timeout = abstractSerializedData2.readInt32(z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1041346555);
                int i2 = this.isFinal ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt32(this.pts);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeInt32(this.timeout);
                }
            }
        } : new TLRPC$updates_ChannelDifference() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.isFinal = (readInt32 & 1) != 0;
                this.pts = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 2) != 0) {
                    this.timeout = abstractSerializedData2.readInt32(z2);
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
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.new_messages.add(TLdeserialize);
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
                    TLRPC$Update TLdeserialize2 = TLRPC$Update.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize2 == null) {
                        return;
                    }
                    this.other_updates.add(TLdeserialize2);
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
                    TLRPC$Chat TLdeserialize3 = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize3 == null) {
                        return;
                    }
                    this.chats.add(TLdeserialize3);
                }
                int readInt328 = abstractSerializedData2.readInt32(z2);
                if (readInt328 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt328)));
                    }
                    return;
                }
                int readInt329 = abstractSerializedData2.readInt32(z2);
                for (int i5 = 0; i5 < readInt329; i5++) {
                    TLRPC$User TLdeserialize4 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize4 == null) {
                        return;
                    }
                    this.users.add(TLdeserialize4);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(543450958);
                int i2 = this.isFinal ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt32(this.pts);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeInt32(this.timeout);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size = this.new_messages.size();
                abstractSerializedData2.writeInt32(size);
                for (int i3 = 0; i3 < size; i3++) {
                    ((TLRPC$Message) this.new_messages.get(i3)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size2 = this.other_updates.size();
                abstractSerializedData2.writeInt32(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    ((TLRPC$Update) this.other_updates.get(i4)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size3 = this.chats.size();
                abstractSerializedData2.writeInt32(size3);
                for (int i5 = 0; i5 < size3; i5++) {
                    ((TLRPC$Chat) this.chats.get(i5)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size4 = this.users.size();
                abstractSerializedData2.writeInt32(size4);
                for (int i6 = 0; i6 < size4; i6++) {
                    ((TLRPC$User) this.users.get(i6)).serializeToStream(abstractSerializedData2);
                }
            }
        } : new TLRPC$updates_ChannelDifference() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.isFinal = (readInt32 & 1) != 0;
                if ((readInt32 & 2) != 0) {
                    this.timeout = abstractSerializedData2.readInt32(z2);
                }
                this.dialog = TLRPC$Dialog.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                int readInt322 = abstractSerializedData2.readInt32(z2);
                if (readInt322 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                    }
                    return;
                }
                int readInt323 = abstractSerializedData2.readInt32(z2);
                for (int i2 = 0; i2 < readInt323; i2++) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
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
                abstractSerializedData2.writeInt32(-1531132162);
                int i2 = this.isFinal ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeInt32(this.timeout);
                }
                this.dialog.serializeToStream(abstractSerializedData2);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.messages.size();
                abstractSerializedData2.writeInt32(size);
                for (int i3 = 0; i3 < size; i3++) {
                    ((TLRPC$Message) this.messages.get(i3)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size2 = this.chats.size();
                abstractSerializedData2.writeInt32(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    ((TLRPC$Chat) this.chats.get(i4)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size3 = this.users.size();
                abstractSerializedData2.writeInt32(size3);
                for (int i5 = 0; i5 < size3; i5++) {
                    ((TLRPC$User) this.users.get(i5)).serializeToStream(abstractSerializedData2);
                }
            }
        };
        if (tLRPC$updates_ChannelDifference == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in updates_ChannelDifference", Integer.valueOf(i)));
        }
        if (tLRPC$updates_ChannelDifference != null) {
            tLRPC$updates_ChannelDifference.readParams(abstractSerializedData, z);
        }
        return tLRPC$updates_ChannelDifference;
    }
}
