package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public abstract class TLRPC$ChatInvite extends TLObject {
    public String about;
    public boolean broadcast;
    public boolean channel;
    public TLRPC$Chat chat;
    public int expires;
    public boolean fake;
    public int flags;
    public boolean isPublic;
    public boolean megagroup;
    public ArrayList<TLRPC$User> participants = new ArrayList<>();
    public int participants_count;
    public TLRPC$Photo photo;
    public boolean request_needed;
    public boolean scam;
    public String title;
    public boolean verified;

    public static TLRPC$ChatInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatInvite tLRPC$ChatInvite;
        if (i == 806110401) {
            tLRPC$ChatInvite = new TLRPC$ChatInvite() {
                public static int constructor = 806110401;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.channel = (readInt32 & 1) != 0;
                    this.broadcast = (readInt32 & 2) != 0;
                    this.isPublic = (readInt32 & 4) != 0;
                    this.megagroup = (readInt32 & 8) != 0;
                    this.request_needed = (readInt32 & 64) != 0;
                    this.verified = (readInt32 & 128) != 0;
                    this.scam = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                    this.fake = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                    this.title = abstractSerializedData2.readString(z2);
                    if ((this.flags & 32) != 0) {
                        this.about = abstractSerializedData2.readString(z2);
                    }
                    this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.participants_count = abstractSerializedData2.readInt32(z2);
                    if ((this.flags & 16) != 0) {
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.participants.add(TLdeserialize);
                        }
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.channel ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.broadcast ? i2 | 2 : i2 & (-3);
                    this.flags = i3;
                    int i4 = this.isPublic ? i3 | 4 : i3 & (-5);
                    this.flags = i4;
                    int i5 = this.megagroup ? i4 | 8 : i4 & (-9);
                    this.flags = i5;
                    int i6 = this.about != null ? i5 | 32 : i5 & (-33);
                    this.flags = i6;
                    int i7 = this.request_needed ? i6 | 64 : i6 & (-65);
                    this.flags = i7;
                    int i8 = this.verified ? i7 | 128 : i7 & (-129);
                    this.flags = i8;
                    int i9 = this.scam ? i8 | LiteMode.FLAG_CHAT_BLUR : i8 & (-257);
                    this.flags = i9;
                    int i10 = this.fake ? i9 | LiteMode.FLAG_CALLS_ANIMATIONS : i9 & (-513);
                    this.flags = i10;
                    abstractSerializedData2.writeInt32(i10);
                    abstractSerializedData2.writeString(this.title);
                    String str = this.about;
                    if (str != null) {
                        abstractSerializedData2.writeString(str);
                    }
                    this.photo.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.participants_count);
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.participants.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i11 = 0; i11 < size; i11++) {
                            this.participants.get(i11).serializeToStream(abstractSerializedData2);
                        }
                    }
                }
            };
        } else if (i != 1516793212) {
            tLRPC$ChatInvite = i != 1634294960 ? null : new TLRPC$ChatInvite() {
                public static int constructor = 1634294960;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.chat = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.expires = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    this.chat.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.expires);
                }
            };
        } else {
            tLRPC$ChatInvite = new TLRPC$ChatInvite() {
                public static int constructor = 1516793212;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.chat = TLRPC$Chat.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    this.chat.serializeToStream(abstractSerializedData2);
                }
            };
        }
        if (tLRPC$ChatInvite == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChatInvite", Integer.valueOf(i)));
        }
        if (tLRPC$ChatInvite != null) {
            tLRPC$ChatInvite.readParams(abstractSerializedData, z);
        }
        return tLRPC$ChatInvite;
    }
}
