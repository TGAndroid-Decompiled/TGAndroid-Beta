package org.telegram.tgnet.tl;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.Vector;

public class TL_aicompose {

    public static class InputAiComposeTone extends TLObject {
        public static InputAiComposeTone from(AiComposeTone aiComposeTone) {
            if (aiComposeTone instanceof TL_aiComposeTone) {
                inputAiComposeToneID inputaicomposetoneid = new inputAiComposeToneID();
                TL_aiComposeTone tL_aiComposeTone = (TL_aiComposeTone) aiComposeTone;
                inputaicomposetoneid.id = tL_aiComposeTone.id;
                inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                return inputaicomposetoneid;
            }
            if (!(aiComposeTone instanceof TL_aiComposeToneDefault)) {
                return null;
            }
            inputAiComposeToneDefault inputaicomposetonedefault = new inputAiComposeToneDefault();
            inputaicomposetonedefault.tone = ((TL_aiComposeToneDefault) aiComposeTone).tone;
            return inputaicomposetonedefault;
        }

        public static inputAiComposeToneDefault fromDefault(String str) {
            inputAiComposeToneDefault inputaicomposetonedefault = new inputAiComposeToneDefault();
            inputaicomposetonedefault.tone = str;
            return inputaicomposetonedefault;
        }

        public static boolean equals(InputAiComposeTone inputAiComposeTone, InputAiComposeTone inputAiComposeTone2) {
            if (inputAiComposeTone == null && inputAiComposeTone2 == null) {
                return true;
            }
            if (inputAiComposeTone != null && inputAiComposeTone2 != null) {
                if (inputAiComposeTone instanceof inputAiComposeToneDefault) {
                    return (inputAiComposeTone2 instanceof inputAiComposeToneDefault) && TextUtils.equals(((inputAiComposeToneDefault) inputAiComposeTone).tone, ((inputAiComposeToneDefault) inputAiComposeTone2).tone);
                }
                if (inputAiComposeTone instanceof inputAiComposeToneID) {
                    if (inputAiComposeTone2 instanceof inputAiComposeToneID) {
                        inputAiComposeToneID inputaicomposetoneid = (inputAiComposeToneID) inputAiComposeTone;
                        inputAiComposeToneID inputaicomposetoneid2 = (inputAiComposeToneID) inputAiComposeTone2;
                        if (inputaicomposetoneid.id == inputaicomposetoneid2.id && inputaicomposetoneid.access_hash == inputaicomposetoneid2.access_hash) {
                            return true;
                        }
                    }
                    return false;
                }
                if (inputAiComposeTone instanceof inputAiComposeToneSlug) {
                    return (inputAiComposeTone2 instanceof inputAiComposeToneSlug) && TextUtils.equals(((inputAiComposeToneSlug) inputAiComposeTone).slug, ((inputAiComposeToneSlug) inputAiComposeTone2).slug);
                }
                if ((inputAiComposeTone instanceof inputAiComposeToneSingleUse) && (inputAiComposeTone2 instanceof inputAiComposeToneSingleUse) && TextUtils.equals(((inputAiComposeToneSingleUse) inputAiComposeTone).custom_prompt, ((inputAiComposeToneSingleUse) inputAiComposeTone2).custom_prompt)) {
                    return true;
                }
            }
            return false;
        }

        public static InputAiComposeTone TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (InputAiComposeTone) TLObject.TLdeserialize(InputAiComposeTone.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static InputAiComposeTone fromConstructor(int i) {
            if (i == 125026432) {
                return new inputAiComposeToneID();
            }
            if (i == 235681199) {
                return new inputAiComposeToneSingleUse();
            }
            if (i == 530584407) {
                return new inputAiComposeToneSlug();
            }
            if (i != 535407039) {
                return null;
            }
            return new inputAiComposeToneDefault();
        }
    }

    public static class inputAiComposeToneDefault extends InputAiComposeTone {
        public static final int constructor = 535407039;
        public String tone;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(535407039);
            outputSerializedData.writeString(this.tone);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.tone = inputSerializedData.readString(z);
        }
    }

    public static class inputAiComposeToneID extends InputAiComposeTone {
        public static final int constructor = 125026432;
        public long access_hash;
        public long id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(125026432);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.access_hash);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.access_hash = inputSerializedData.readInt64(z);
        }
    }

    public static class inputAiComposeToneSlug extends InputAiComposeTone {
        public static final int constructor = 530584407;
        public String slug;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(530584407);
            outputSerializedData.writeString(this.slug);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.slug = inputSerializedData.readString(z);
        }
    }

    public static class inputAiComposeToneSingleUse extends InputAiComposeTone {
        public static final int constructor = 235681199;
        public String custom_prompt;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(235681199);
            outputSerializedData.writeString(this.custom_prompt);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.custom_prompt = inputSerializedData.readString(z);
        }
    }

    public static class AiComposeTone extends TLObject {
        public long emoji_id;
        public String title;

        public static AiComposeTone TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (AiComposeTone) TLObject.TLdeserialize(AiComposeTone.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static AiComposeTone fromConstructor(int i) {
            if (i == -1683135468) {
                return new TL_aiComposeToneDefault();
            }
            if (i != -805945687) {
                return null;
            }
            return new TL_aiComposeTone();
        }
    }

    public static class TL_aiComposeTone extends AiComposeTone {
        public static final int constructor = -805945687;
        public long access_hash;
        public long author_id;
        public boolean creator;
        public aiComposeToneExample example_english;
        public int flags;
        public long id;
        public int installs_count;
        public String prompt;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.creator = TLObject.hasFlag(int32, 1);
            this.id = inputSerializedData.readInt64(z);
            this.access_hash = inputSerializedData.readInt64(z);
            this.slug = inputSerializedData.readString(z);
            this.title = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.emoji_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.prompt = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.installs_count = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.author_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.example_english = aiComposeToneExample.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-805945687);
            int flag = TLObject.setFlag(this.flags, 1, this.creator);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.emoji_id);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.prompt);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.installs_count);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.author_id);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.example_english.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_aiComposeToneDefault extends AiComposeTone {
        public static final int constructor = -1683135468;
        public String tone;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.tone = inputSerializedData.readString(z);
            this.emoji_id = inputSerializedData.readInt64(z);
            this.title = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1683135468);
            outputSerializedData.writeString(this.tone);
            outputSerializedData.writeInt64(this.emoji_id);
            outputSerializedData.writeString(this.title);
        }
    }

    public static class Tones extends TLObject {
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static Tones TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (Tones) TLObject.TLdeserialize(Tones.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static Tones fromConstructor(int i) {
            if (i == -1040948989) {
                return new TL_tonesNotModified();
            }
            if (i != 1822232318) {
                return null;
            }
            return new TL_tones();
        }
    }

    public static class TL_tones extends Tones {
        public static final int constructor = 1822232318;
        public long hash;
        public ArrayList<AiComposeTone> tones = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.tones = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_aicompose.AiComposeTone.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1822232318);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.tones);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_tonesNotModified extends Tones {
        public static final int constructor = -1040948989;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1040948989);
        }
    }

    public static class aiComposeToneExample extends TLObject {
        public static final int constructor = -237623060;
        public TLRPC.TL_textWithEntities from;
        public TLRPC.TL_textWithEntities to;

        public static aiComposeToneExample TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (aiComposeToneExample) TLObject.TLdeserialize(aiComposeToneExample.class, i == -237623060 ? new aiComposeToneExample() : null, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.from = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.to = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-237623060);
            this.from.serializeToStream(outputSerializedData);
            this.to.serializeToStream(outputSerializedData);
        }
    }

    public static class createTone extends TLMethod<AiComposeTone> {
        public static final int constructor = 1252538643;
        public boolean display_author;
        public long emoji_id;
        public int flags;
        public String prompt;
        public String title;

        @Override
        public AiComposeTone deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return AiComposeTone.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1252538643);
            int flag = TLObject.setFlag(this.flags, 1, this.display_author);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.emoji_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.prompt);
        }
    }

    public static class updateTone extends TLMethod<AiComposeTone> {
        public static final int constructor = -1875128487;
        public boolean display_author;
        public long emoji_id;
        public int flags;
        public String prompt;
        public String title;
        public InputAiComposeTone tone;

        @Override
        public AiComposeTone deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return AiComposeTone.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1875128487);
            outputSerializedData.writeInt32(this.flags);
            this.tone.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.display_author);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.emoji_id);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.prompt);
            }
        }
    }

    public static class saveTone extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 394447793;
        public InputAiComposeTone tone;
        public boolean unsave;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(394447793);
            this.tone.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }
    }

    public static class deleteTone extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -583454358;
        public InputAiComposeTone tone;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-583454358);
            this.tone.serializeToStream(outputSerializedData);
        }
    }

    public static class getTone extends TLMethod<Tones> {
        public static final int constructor = -1293370877;
        public InputAiComposeTone tone;

        @Override
        public Tones deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Tones.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1293370877);
            this.tone.serializeToStream(outputSerializedData);
        }
    }

    public static class getTones extends TLMethod<Tones> {
        public static final int constructor = -1412066815;
        public long hash;

        @Override
        public Tones deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Tones.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1412066815);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getToneExample extends TLMethod<aiComposeToneExample> {
        public static final int constructor = -776688876;
        public int num;
        public InputAiComposeTone tone;

        @Override
        public aiComposeToneExample deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return aiComposeToneExample.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-776688876);
            this.tone.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.num);
        }
    }
}
