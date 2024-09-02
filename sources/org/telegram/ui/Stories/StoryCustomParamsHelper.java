package org.telegram.ui.Stories;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_textWithEntities;
import org.telegram.tgnet.tl.TL_stories$StoryItem;

public class StoryCustomParamsHelper {
    public static boolean isEmpty(TL_stories$StoryItem tL_stories$StoryItem) {
        return tL_stories$StoryItem.detectedLng == null && tL_stories$StoryItem.translatedLng == null && !tL_stories$StoryItem.translated && tL_stories$StoryItem.translatedText == null;
    }

    public static void readLocalParams(TL_stories$StoryItem tL_stories$StoryItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 != 1) {
            throw new RuntimeException("(story) can't read params version = " + readInt32);
        }
        new Params_v1(tL_stories$StoryItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer writeLocalParams(TL_stories$StoryItem tL_stories$StoryItem) {
        if (isEmpty(tL_stories$StoryItem)) {
            return null;
        }
        Params_v1 params_v1 = new Params_v1(tL_stories$StoryItem);
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
        final TL_stories$StoryItem storyItem;

        private Params_v1(TL_stories$StoryItem tL_stories$StoryItem) {
            this.flags = 0;
            this.storyItem = tL_stories$StoryItem;
            boolean z = tL_stories$StoryItem.translated;
            this.flags = z ? 1 : 0;
            int i = (z ? 1 : 0) + (tL_stories$StoryItem.detectedLng != null ? 2 : 0);
            this.flags = i;
            int i2 = i + (tL_stories$StoryItem.translatedText != null ? 4 : 0);
            this.flags = i2;
            this.flags = i2 + (tL_stories$StoryItem.translatedLng != null ? 8 : 0);
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
            TL_stories$StoryItem tL_stories$StoryItem = this.storyItem;
            tL_stories$StoryItem.translated = (readInt32 & 1) != 0;
            if ((readInt32 & 2) != 0) {
                tL_stories$StoryItem.detectedLng = abstractSerializedData.readString(z);
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
