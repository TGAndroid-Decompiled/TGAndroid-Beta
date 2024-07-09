package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;

public class TLRPC$TL_dialogFilter extends TLRPC$DialogFilter {
    @Override
    public void readParams(org.telegram.tgnet.AbstractSerializedData r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.TLRPC$TL_dialogFilter.readParams(org.telegram.tgnet.AbstractSerializedData, boolean):void");
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1605718587);
        int i = this.contacts ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.non_contacts ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.groups ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.broadcasts ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.bots ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.exclude_muted ? i5 | 2048 : i5 & (-2049);
        this.flags = i6;
        int i7 = this.exclude_read ? i6 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i6 & (-4097);
        this.flags = i7;
        int i8 = this.exclude_archived ? i7 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i7 & (-8193);
        this.flags = i8;
        abstractSerializedData.writeInt32(i8);
        abstractSerializedData.writeInt32(this.id);
        abstractSerializedData.writeString(this.title);
        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
            abstractSerializedData.writeString(this.emoticon);
        }
        if ((this.flags & 134217728) != 0) {
            abstractSerializedData.writeInt32(this.color);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.pinned_peers.size();
        abstractSerializedData.writeInt32(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.pinned_peers.get(i9).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.include_peers.size();
        abstractSerializedData.writeInt32(size2);
        for (int i10 = 0; i10 < size2; i10++) {
            this.include_peers.get(i10).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.exclude_peers.size();
        abstractSerializedData.writeInt32(size3);
        for (int i11 = 0; i11 < size3; i11++) {
            this.exclude_peers.get(i11).serializeToStream(abstractSerializedData);
        }
    }
}
