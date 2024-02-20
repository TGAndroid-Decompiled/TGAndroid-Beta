package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$DialogFilter extends TLObject {
    public boolean bots;
    public boolean broadcasts;
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
        TLRPC$DialogFilter tLRPC$DialogFilter;
        if (i == -699792216) {
            tLRPC$DialogFilter = new TLRPC$DialogFilter() {
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
        } else if (i == 909284270) {
            tLRPC$DialogFilter = new TLRPC$DialogFilter() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(909284270);
                }
            };
        } else {
            tLRPC$DialogFilter = i != 1949890536 ? null : new TLRPC$TL_dialogFilter();
        }
        if (tLRPC$DialogFilter == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DialogFilter", Integer.valueOf(i)));
        }
        if (tLRPC$DialogFilter != null) {
            tLRPC$DialogFilter.readParams(abstractSerializedData, z);
        }
        return tLRPC$DialogFilter;
    }
}
