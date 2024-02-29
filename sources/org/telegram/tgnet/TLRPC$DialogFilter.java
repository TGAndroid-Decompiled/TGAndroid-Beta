package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public abstract class TLRPC$DialogFilter extends TLObject {
    public boolean bots;
    public boolean broadcasts;
    public int color;
    public boolean contacts;
    public String emoticon;
    public boolean exclude_archived;
    public boolean exclude_muted;
    public boolean exclude_read;
    public int flags;
    public boolean groups;
    public boolean has_my_invites;
    public int id;
    public boolean non_contacts;
    public String title;
    public ArrayList<TLRPC$InputPeer> pinned_peers = new ArrayList<>();
    public ArrayList<TLRPC$InputPeer> include_peers = new ArrayList<>();
    public ArrayList<TLRPC$InputPeer> exclude_peers = new ArrayList<>();

    public static TLRPC$DialogFilter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DialogFilter tLRPC$TL_dialogFilterChatlist;
        switch (i) {
            case -1612542300:
                tLRPC$TL_dialogFilterChatlist = new TLRPC$TL_dialogFilterChatlist();
                break;
            case -699792216:
                tLRPC$TL_dialogFilterChatlist = new TLRPC$TL_dialogFilterChatlist() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.has_my_invites = (readInt32 & ConnectionsManager.FileTypeFile) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.emoticon = abstractSerializedData2.readString(z2);
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
                            TLRPC$InputPeer TLdeserialize = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.pinned_peers.add(TLdeserialize);
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
                            TLRPC$InputPeer TLdeserialize2 = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.include_peers.add(TLdeserialize2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-699792216);
                        int i2 = this.has_my_invites ? this.flags | ConnectionsManager.FileTypeFile : this.flags & (-67108865);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeString(this.emoticon);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.pinned_peers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.pinned_peers.get(i3).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.include_peers.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i4 = 0; i4 < size2; i4++) {
                            this.include_peers.get(i4).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 909284270:
                tLRPC$TL_dialogFilterChatlist = new TLRPC$DialogFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(909284270);
                    }
                };
                break;
            case 1605718587:
                tLRPC$TL_dialogFilterChatlist = new TLRPC$TL_dialogFilter();
                break;
            case 1949890536:
                tLRPC$TL_dialogFilterChatlist = new TLRPC$TL_dialogFilter() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.contacts = (readInt32 & 1) != 0;
                        this.non_contacts = (readInt32 & 2) != 0;
                        this.groups = (readInt32 & 4) != 0;
                        this.broadcasts = (readInt32 & 8) != 0;
                        this.bots = (readInt32 & 16) != 0;
                        this.exclude_muted = (readInt32 & 2048) != 0;
                        this.exclude_read = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.exclude_archived = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.title = abstractSerializedData2.readString(z2);
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.emoticon = abstractSerializedData2.readString(z2);
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
                            TLRPC$InputPeer TLdeserialize = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.pinned_peers.add(TLdeserialize);
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
                            TLRPC$InputPeer TLdeserialize2 = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.include_peers.add(TLdeserialize2);
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
                            TLRPC$InputPeer TLdeserialize3 = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize3 == null) {
                                return;
                            }
                            this.exclude_peers.add(TLdeserialize3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1949890536);
                        int i2 = this.contacts ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.non_contacts ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.groups ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.broadcasts ? i4 | 8 : i4 & (-9);
                        this.flags = i5;
                        int i6 = this.bots ? i5 | 16 : i5 & (-17);
                        this.flags = i6;
                        int i7 = this.exclude_muted ? i6 | 2048 : i6 & (-2049);
                        this.flags = i7;
                        int i8 = this.exclude_read ? i7 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i7 & (-4097);
                        this.flags = i8;
                        int i9 = this.exclude_archived ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i8 & (-8193);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.id);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeString(this.emoticon);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.pinned_peers.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.pinned_peers.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.include_peers.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i11 = 0; i11 < size2; i11++) {
                            this.include_peers.get(i11).serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size3 = this.exclude_peers.size();
                        abstractSerializedData2.writeInt32(size3);
                        for (int i12 = 0; i12 < size3; i12++) {
                            this.exclude_peers.get(i12).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            default:
                tLRPC$TL_dialogFilterChatlist = null;
                break;
        }
        if (tLRPC$TL_dialogFilterChatlist == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DialogFilter", Integer.valueOf(i)));
        }
        if (tLRPC$TL_dialogFilterChatlist != null) {
            tLRPC$TL_dialogFilterChatlist.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_dialogFilterChatlist;
    }
}
