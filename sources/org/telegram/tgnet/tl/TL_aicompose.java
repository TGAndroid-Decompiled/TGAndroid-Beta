package org.telegram.tgnet.tl;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.m;
public class TL_aicompose {

    public static class AiComposeTone extends TLObject {
        public long emoji_id;
        public String title;

        public static AiComposeTone TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return (AiComposeTone) TLObject.TLdeserialize(AiComposeTone.class, fromConstructor(i7), inputSerializedData, i7, z10);
        }

        private static AiComposeTone fromConstructor(int i7) {
            if (i7 != -1683135468) {
                if (i7 != -805945687) {
                    return null;
                }
                return new TL_aiComposeTone();
            }
            return new TL_aiComposeToneDefault();
        }
    }

    public static class InputAiComposeTone extends TLObject {
        public static InputAiComposeTone TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return (InputAiComposeTone) TLObject.TLdeserialize(InputAiComposeTone.class, fromConstructor(i7), inputSerializedData, i7, z10);
        }

        public static boolean equals(InputAiComposeTone inputAiComposeTone, InputAiComposeTone inputAiComposeTone2) {
            if (inputAiComposeTone == null && inputAiComposeTone2 == null) {
                return true;
            }
            if (inputAiComposeTone != null && inputAiComposeTone2 != null) {
                if (inputAiComposeTone instanceof inputAiComposeToneDefault) {
                    if ((inputAiComposeTone2 instanceof inputAiComposeToneDefault) && TextUtils.equals(((inputAiComposeToneDefault) inputAiComposeTone).tone, ((inputAiComposeToneDefault) inputAiComposeTone2).tone)) {
                        return true;
                    }
                    return false;
                } else if (inputAiComposeTone instanceof inputAiComposeToneID) {
                    if (inputAiComposeTone2 instanceof inputAiComposeToneID) {
                        inputAiComposeToneID inputaicomposetoneid = (inputAiComposeToneID) inputAiComposeTone;
                        inputAiComposeToneID inputaicomposetoneid2 = (inputAiComposeToneID) inputAiComposeTone2;
                        if (inputaicomposetoneid.f28648id == inputaicomposetoneid2.f28648id && inputaicomposetoneid.access_hash == inputaicomposetoneid2.access_hash) {
                            return true;
                        }
                    }
                    return false;
                } else if (inputAiComposeTone instanceof inputAiComposeToneSlug) {
                    if ((inputAiComposeTone2 instanceof inputAiComposeToneSlug) && TextUtils.equals(((inputAiComposeToneSlug) inputAiComposeTone).slug, ((inputAiComposeToneSlug) inputAiComposeTone2).slug)) {
                        return true;
                    }
                    return false;
                } else if ((inputAiComposeTone instanceof inputAiComposeToneSingleUse) && (inputAiComposeTone2 instanceof inputAiComposeToneSingleUse) && TextUtils.equals(((inputAiComposeToneSingleUse) inputAiComposeTone).custom_prompt, ((inputAiComposeToneSingleUse) inputAiComposeTone2).custom_prompt)) {
                    return true;
                }
            }
            return false;
        }

        public static InputAiComposeTone from(AiComposeTone aiComposeTone) {
            if (aiComposeTone instanceof TL_aiComposeTone) {
                inputAiComposeToneID inputaicomposetoneid = new inputAiComposeToneID();
                TL_aiComposeTone tL_aiComposeTone = (TL_aiComposeTone) aiComposeTone;
                inputaicomposetoneid.f28648id = tL_aiComposeTone.f28647id;
                inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                return inputaicomposetoneid;
            } else if (aiComposeTone instanceof TL_aiComposeToneDefault) {
                inputAiComposeToneDefault inputaicomposetonedefault = new inputAiComposeToneDefault();
                inputaicomposetonedefault.tone = ((TL_aiComposeToneDefault) aiComposeTone).tone;
                return inputaicomposetonedefault;
            } else {
                return null;
            }
        }

        private static InputAiComposeTone fromConstructor(int i7) {
            switch (i7) {
                case 125026432:
                    return new inputAiComposeToneID();
                case 235681199:
                    return new inputAiComposeToneSingleUse();
                case 530584407:
                    return new inputAiComposeToneSlug();
                case 535407039:
                    return new inputAiComposeToneDefault();
                default:
                    return null;
            }
        }

        public static inputAiComposeToneDefault fromDefault(String str) {
            inputAiComposeToneDefault inputaicomposetonedefault = new inputAiComposeToneDefault();
            inputaicomposetonedefault.tone = str;
            return inputaicomposetonedefault;
        }
    }

    public static class TL_aiComposeTone extends AiComposeTone {
        public static final int constructor = -805945687;
        public long access_hash;
        public long author_id;
        public boolean creator;
        public aiComposeToneExample example_english;
        public int flags;
        public long f28647id;
        public int installs_count;
        public String prompt;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.creator = TLObject.hasFlag(readInt32, 1);
            this.f28647id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.slug = inputSerializedData.readString(z10);
            this.title = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.emoji_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.prompt = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.installs_count = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.author_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.example_english = aiComposeToneExample.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-805945687);
            int flag = TLObject.setFlag(this.flags, 1, this.creator);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f28647id);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.tone = inputSerializedData.readString(z10);
            this.emoji_id = inputSerializedData.readInt64(z10);
            this.title = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1683135468);
            outputSerializedData.writeString(this.tone);
            outputSerializedData.writeInt64(this.emoji_id);
            outputSerializedData.writeString(this.title);
        }
    }

    public static class TL_tones extends Tones {
        public static final int constructor = 1822232318;
        public long hash;
        public ArrayList<AiComposeTone> tones = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.tones = Vector.deserialize(inputSerializedData, new c(17), z10);
            this.users = Vector.deserialize(inputSerializedData, new m(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1822232318);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.tones);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class Tones extends TLObject {
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static Tones TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return (Tones) TLObject.TLdeserialize(Tones.class, fromConstructor(i7), inputSerializedData, i7, z10);
        }

        private static Tones fromConstructor(int i7) {
            if (i7 != -1040948989) {
                if (i7 != 1822232318) {
                    return null;
                }
                return new TL_tones();
            }
            return new TL_tonesNotModified();
        }
    }

    public static class aiComposeToneExample extends TLObject {
        public static final int constructor = -237623060;
        public TLRPC.TL_textWithEntities from;
        public TLRPC.TL_textWithEntities to;

        public static aiComposeToneExample TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
            aiComposeToneExample aicomposetoneexample;
            if (i7 == -237623060) {
                aicomposetoneexample = new aiComposeToneExample();
            } else {
                aicomposetoneexample = null;
            }
            return (aiComposeToneExample) TLObject.TLdeserialize(aiComposeToneExample.class, aicomposetoneexample, inputSerializedData, i7, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.from = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.to = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
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
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1252538643);
            int flag = TLObject.setFlag(this.flags, 1, this.display_author);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.emoji_id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.prompt);
        }

        @Override
        public AiComposeTone deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return AiComposeTone.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class deleteTone extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -583454358;
        public InputAiComposeTone tone;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-583454358);
            this.tone.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class getTone extends TLMethod<Tones> {
        public static final int constructor = -1293370877;
        public InputAiComposeTone tone;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1293370877);
            this.tone.serializeToStream(outputSerializedData);
        }

        @Override
        public Tones deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return Tones.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class getToneExample extends TLMethod<aiComposeToneExample> {
        public static final int constructor = -776688876;
        public int num;
        public InputAiComposeTone tone;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-776688876);
            this.tone.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.num);
        }

        @Override
        public aiComposeToneExample deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return aiComposeToneExample.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class getTones extends TLMethod<Tones> {
        public static final int constructor = -1412066815;
        public long hash;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1412066815);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public Tones deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return Tones.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class inputAiComposeStyle extends TLObject {
        public static final int constructor = -1474231824;
        public boolean emojify;
        public int flags;
        public boolean proofread;
        public String to_lang;
        public InputAiComposeTone tone;

        public static inputAiComposeStyle TLdeserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
            inputAiComposeStyle inputaicomposestyle;
            if (i7 == -1474231824) {
                inputaicomposestyle = new inputAiComposeStyle();
            } else {
                inputaicomposestyle = null;
            }
            return (inputAiComposeStyle) TLObject.TLdeserialize(inputAiComposeStyle.class, inputaicomposestyle, inputSerializedData, i7, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.emojify = TLObject.hasFlag(readInt32, 4);
            this.proofread = TLObject.hasFlag(this.flags, 8);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.tone = InputAiComposeTone.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.to_lang = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1474231824);
            int i7 = this.flags;
            boolean z11 = false;
            if (this.tone != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i7, 1, z10);
            this.flags = flag;
            if (this.to_lang != null) {
                z11 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.emojify);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.proofread);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.tone.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.to_lang);
            }
        }
    }

    public static class inputAiComposeToneDefault extends InputAiComposeTone {
        public static final int constructor = 535407039;
        public String tone;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.tone = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(535407039);
            outputSerializedData.writeString(this.tone);
        }
    }

    public static class inputAiComposeToneID extends InputAiComposeTone {
        public static final int constructor = 125026432;
        public long access_hash;
        public long f28648id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.f28648id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(125026432);
            outputSerializedData.writeInt64(this.f28648id);
            outputSerializedData.writeInt64(this.access_hash);
        }
    }

    public static class inputAiComposeToneSingleUse extends InputAiComposeTone {
        public static final int constructor = 235681199;
        public String custom_prompt;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.custom_prompt = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(235681199);
            outputSerializedData.writeString(this.custom_prompt);
        }
    }

    public static class inputAiComposeToneSlug extends InputAiComposeTone {
        public static final int constructor = 530584407;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.slug = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(530584407);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class saveTone extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 394447793;
        public InputAiComposeTone tone;
        public boolean unsave;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(394447793);
            this.tone.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class setChatStyle extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1570322880;
        public int flags;
        public TLRPC.InputPeer peer;
        public inputAiComposeStyle style;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1570322880);
            int i7 = this.flags;
            if (this.style != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i7, 1, z10);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.style.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i7, z10);
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

        @Override
        public AiComposeTone deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z10) {
            return AiComposeTone.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    public static class TL_tonesNotModified extends Tones {
        public static final int constructor = -1040948989;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1040948989);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }
}
