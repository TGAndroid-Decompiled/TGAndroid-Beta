package org.telegram.ui.Stories;

import androidx.recyclerview.widget.DiffUtil;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public abstract class StoryCustomParamsHelper {

    public final class Params_v1 extends TLObject {
        public int flags;
        public final TL_stories.StoryItem storyItem;

        public Params_v1(TL_stories.StoryItem storyItem) {
            this.flags = 0;
            this.storyItem = storyItem;
            boolean z = storyItem.translated;
            this.flags = z ? 1 : 0;
            int i = (z ? 1 : 0) + (storyItem.detectedLng != null ? 2 : 0);
            this.flags = i;
            int i2 = i + (storyItem.translatedText != null ? 4 : 0);
            this.flags = i2;
            this.flags = i2 + (storyItem.translatedLng != null ? 8 : 0);
        }

        @Override
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(true);
            this.flags = int32;
            boolean z2 = (int32 & 1) != 0;
            TL_stories.StoryItem storyItem = this.storyItem;
            storyItem.translated = z2;
            if ((int32 & 2) != 0) {
                storyItem.detectedLng = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                storyItem.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 8) != 0) {
                storyItem.translatedLng = inputSerializedData.readString(z);
            }
        }

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1);
            outputSerializedData.writeInt32(this.flags);
            int i = this.flags & 2;
            TL_stories.StoryItem storyItem = this.storyItem;
            if (i != 0) {
                outputSerializedData.writeString(storyItem.detectedLng);
            }
            if ((this.flags & 4) != 0) {
                storyItem.translatedText.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(storyItem.translatedLng);
            }
        }
    }

    public static void readLocalParams(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int int32 = nativeByteBuffer.readInt32(true);
        if (int32 != 1) {
            throw new RuntimeException(DiffUtil.m(int32, "(story) can't read params version = "));
        }
        new Params_v1(storyItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer writeLocalParams(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        Params_v1 params_v1 = new Params_v1(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(params_v1.getObjectSize());
            params_v1.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
