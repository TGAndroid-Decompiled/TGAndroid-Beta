package org.telegram.tgnet;
public class TLRPC$TL_availableReaction extends TLObject {
    public static int constructor = -1065882623;
    public TLRPC$Document activate_animation;
    public TLRPC$Document appear_animation;
    public TLRPC$Document around_animation;
    public TLRPC$Document center_icon;
    public TLRPC$Document effect_animation;
    public int flags;
    public boolean inactive;
    public int positionInList;
    public boolean premium;
    public String reaction;
    public TLRPC$Document select_animation;
    public TLRPC$Document static_icon;
    public String title;

    public static TLRPC$TL_availableReaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_availableReaction", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction = new TLRPC$TL_availableReaction();
        tLRPC$TL_availableReaction.readParams(abstractSerializedData, z);
        return tLRPC$TL_availableReaction;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inactive = (readInt32 & 1) != 0;
        this.premium = (readInt32 & 4) != 0;
        this.reaction = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
        this.static_icon = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.appear_animation = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.select_animation = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.activate_animation = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.effect_animation = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 2) != 0) {
            this.around_animation = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.center_icon = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.inactive ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.premium ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.reaction);
        abstractSerializedData.writeString(this.title);
        this.static_icon.serializeToStream(abstractSerializedData);
        this.appear_animation.serializeToStream(abstractSerializedData);
        this.select_animation.serializeToStream(abstractSerializedData);
        this.activate_animation.serializeToStream(abstractSerializedData);
        this.effect_animation.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            this.around_animation.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.center_icon.serializeToStream(abstractSerializedData);
        }
    }
}
