package org.telegram.ui.Stories;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
public class StoryCustomParamsHelper {
    public static boolean isEmpty(TLRPC$StoryItem tLRPC$StoryItem) {
        return tLRPC$StoryItem.detectedLng == null && tLRPC$StoryItem.translatedLng == null && !tLRPC$StoryItem.translated && tLRPC$StoryItem.translatedText == null;
    }

    public static void readLocalParams(TLRPC$StoryItem tLRPC$StoryItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 != 1) {
            throw new RuntimeException("(story) can't read params version = " + readInt32);
        }
        new Params_v1(tLRPC$StoryItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer writeLocalParams(TLRPC$StoryItem tLRPC$StoryItem) {
        if (isEmpty(tLRPC$StoryItem)) {
            return null;
        }
        Params_v1 params_v1 = new Params_v1(tLRPC$StoryItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(params_v1.getObjectSize());
            params_v1.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class Params_v1 extends TLObject {
        int flags;
        final TLRPC$StoryItem storyItem;

        private Params_v1(TLRPC$StoryItem tLRPC$StoryItem) {
            this.flags = 0;
            this.storyItem = tLRPC$StoryItem;
            int i = (tLRPC$StoryItem.translated ? 1 : 0) + 0;
            this.flags = i;
            int i2 = i + (tLRPC$StoryItem.detectedLng != null ? 2 : 0);
            this.flags = i2;
            int i3 = i2 + (tLRPC$StoryItem.translatedText != null ? 4 : 0);
            this.flags = i3;
            this.flags = i3 + (tLRPC$StoryItem.translatedLng != null ? 8 : 0);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1);
            abstractSerializedData.writeInt32(this.flags);
            if ((this.flags & 2) != 0) {
                abstractSerializedData.writeString(this.storyItem.detectedLng);
            }
            if ((this.flags & 4) != 0) {
                this.storyItem.translatedText.serializeToStream(abstractSerializedData);
            }
            if ((this.flags & 8) != 0) {
                abstractSerializedData.writeString(this.storyItem.translatedLng);
            }
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(true);
            this.flags = readInt32;
            TLRPC$StoryItem tLRPC$StoryItem = this.storyItem;
            tLRPC$StoryItem.translated = (readInt32 & 1) != 0;
            if ((readInt32 & 2) != 0) {
                tLRPC$StoryItem.detectedLng = abstractSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.storyItem.translatedText = TLRPC$TL_textWithEntities.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                this.storyItem.translatedLng = abstractSerializedData.readString(z);
            }
        }
    }
}
