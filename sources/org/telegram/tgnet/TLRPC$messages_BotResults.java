package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$messages_BotResults extends TLObject {
    public int cache_time;
    public int flags;
    public boolean gallery;
    public String next_offset;
    public long query_id;
    public TLRPC$TL_inlineBotSwitchPM switch_pm;
    public TLRPC$TL_inlineBotWebView switch_webview;
    public ArrayList results = new ArrayList();
    public ArrayList users = new ArrayList();

    public static TLRPC$messages_BotResults TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_BotResults tLRPC$TL_messages_botResults_layer153 = i != -1803769784 ? i != -858565059 ? i != -534646026 ? null : new TLRPC$messages_BotResults() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.gallery = (readInt32 & 1) != 0;
                this.query_id = abstractSerializedData2.readInt64(z2);
                if ((this.flags & 2) != 0) {
                    this.next_offset = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.switch_pm = TLRPC$TL_inlineBotSwitchPM.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                }
                if ((this.flags & 8) != 0) {
                    this.switch_webview = TLRPC$TL_inlineBotWebView.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
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
                    TLRPC$BotInlineResult TLdeserialize = TLRPC$BotInlineResult.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.results.add(TLdeserialize);
                }
                this.cache_time = abstractSerializedData2.readInt32(z2);
                int readInt324 = abstractSerializedData2.readInt32(z2);
                if (readInt324 != 481674261) {
                    if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                    }
                    return;
                }
                int readInt325 = abstractSerializedData2.readInt32(z2);
                for (int i3 = 0; i3 < readInt325; i3++) {
                    TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize2 == null) {
                        return;
                    }
                    this.users.add(TLdeserialize2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-534646026);
                int i2 = this.gallery ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt64(this.query_id);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeString(this.next_offset);
                }
                if ((this.flags & 4) != 0) {
                    this.switch_pm.serializeToStream(abstractSerializedData2);
                }
                if ((this.flags & 8) != 0) {
                    this.switch_webview.serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size = this.results.size();
                abstractSerializedData2.writeInt32(size);
                for (int i3 = 0; i3 < size; i3++) {
                    ((TLRPC$BotInlineResult) this.results.get(i3)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(this.cache_time);
                abstractSerializedData2.writeInt32(481674261);
                int size2 = this.users.size();
                abstractSerializedData2.writeInt32(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    ((TLRPC$User) this.users.get(i4)).serializeToStream(abstractSerializedData2);
                }
            }
        } : new TLRPC$TL_messages_botResults_layer153() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.gallery = (readInt32 & 1) != 0;
                this.query_id = abstractSerializedData2.readInt64(z2);
                if ((this.flags & 2) != 0) {
                    this.next_offset = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.switch_pm = TLRPC$TL_inlineBotSwitchPM.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
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
                    TLRPC$BotInlineResult TLdeserialize = TLRPC$BotInlineResult.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    if (TLdeserialize == null) {
                        return;
                    }
                    this.results.add(TLdeserialize);
                }
                this.cache_time = abstractSerializedData2.readInt32(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-858565059);
                int i2 = this.gallery ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                abstractSerializedData2.writeInt32(i2);
                abstractSerializedData2.writeInt64(this.query_id);
                if ((this.flags & 2) != 0) {
                    abstractSerializedData2.writeString(this.next_offset);
                }
                if ((this.flags & 4) != 0) {
                    this.switch_pm.serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size = this.results.size();
                abstractSerializedData2.writeInt32(size);
                for (int i3 = 0; i3 < size; i3++) {
                    ((TLRPC$BotInlineResult) this.results.get(i3)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(this.cache_time);
            }
        } : new TLRPC$TL_messages_botResults_layer153();
        if (tLRPC$TL_messages_botResults_layer153 == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_BotResults", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_botResults_layer153 != null) {
            tLRPC$TL_messages_botResults_layer153.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_botResults_layer153;
    }
}
