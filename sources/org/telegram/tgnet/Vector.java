package org.telegram.tgnet;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLObject;
public class Vector<T extends TLObject> extends TLObject {
    public static final int constructor = 481674261;
    private final TLDeserializer<T> itemDeserializer;
    public final ArrayList<T> objects = new ArrayList<>();

    public static class Int extends TLObject {
        public int value;

        public Int(int i7) {
            this.value = i7;
        }

        public static Int TLDeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return new Int(i7);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.value = inputSerializedData.readInt32(z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(this.value);
        }
    }

    public static class Long extends TLObject {
        public long value;

        public Long(int i7, int i10) {
            this.value = (i10 & 4294967295L) | (i7 << 32);
        }

        public static Long TLDeserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
            return new Long(i7, inputSerializedData.readInt32(z9));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z9) {
            this.value = inputSerializedData.readInt64(z9);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.value);
        }
    }

    @FunctionalInterface
    public interface TLDeserializer<T extends TLObject> {
        T deserialize(InputSerializedData inputSerializedData, int i7, boolean z9);
    }

    public Vector(TLDeserializer<T> tLDeserializer) {
        this.itemDeserializer = tLDeserializer;
    }

    public static <T extends TLObject> Vector<T> TLDeserialize(InputSerializedData inputSerializedData, int i7, boolean z9, TLDeserializer<T> tLDeserializer) {
        if (i7 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i7, z9);
            return null;
        }
        Vector<T> vector = new Vector<>(tLDeserializer);
        vector.readParams(inputSerializedData, z9);
        return vector;
    }

    public static Vector<Int> TLDeserializeInt(InputSerializedData inputSerializedData, int i7, boolean z9) {
        if (i7 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "StarGift", i7, z9);
            return null;
        }
        Vector<Int> vector = new Vector<>(new s(18));
        vector.readParams(inputSerializedData, z9);
        return vector;
    }

    public static Vector<Int> TLDeserializeLong(InputSerializedData inputSerializedData, int i7, boolean z9) {
        if (i7 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", i7, z9);
            return null;
        }
        Vector<Int> vector = new Vector<>(new s(18));
        vector.readParams(inputSerializedData, z9);
        return vector;
    }

    private static <T> ArrayList<T> deserialize(InputSerializedData inputSerializedData, d20 d20Var, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z9);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z9);
        if (!validateSize(readInt322, 1, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z9);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(readInt322);
        for (int i7 = 0; i7 < readInt322; i7++) {
            arrayList.add(d20Var.a(Boolean.valueOf(z9)));
        }
        return arrayList;
    }

    public static ArrayList<byte[]> deserializeByteArray(InputSerializedData inputSerializedData, boolean z9) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 3), z9);
    }

    public static ArrayList<Integer> deserializeInt(InputSerializedData inputSerializedData, boolean z9) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 1), z9);
    }

    public static ArrayList<java.lang.Long> deserializeLong(InputSerializedData inputSerializedData, boolean z9) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 0), z9);
    }

    public static ArrayList<String> deserializeString(InputSerializedData inputSerializedData, boolean z9) {
        Objects.requireNonNull(inputSerializedData);
        return deserialize(inputSerializedData, new u(inputSerializedData, 2), z9);
    }

    public static <T extends TLObject> void serialize(OutputSerializedData outputSerializedData, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList.get(i7).serializeToStream(outputSerializedData);
        }
    }

    public static void serializeByteArray(OutputSerializedData outputSerializedData, ArrayList<byte[]> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 2), arrayList);
    }

    public static void serializeInt(OutputSerializedData outputSerializedData, ArrayList<Integer> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 1), arrayList);
    }

    public static void serializeLong(OutputSerializedData outputSerializedData, ArrayList<java.lang.Long> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 0), arrayList);
    }

    public static void serializeString(OutputSerializedData outputSerializedData, ArrayList<String> arrayList) {
        Objects.requireNonNull(outputSerializedData);
        serialize(outputSerializedData, new v(outputSerializedData, 3), arrayList);
    }

    private static boolean validateSize(int i7, int i10, int i11) {
        if (i7 >= 0 && i10 > 0 && i7 * i10 <= i11) {
            return true;
        }
        return false;
    }

    @Override
    public void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        for (int i7 = 0; i7 < readInt32; i7++) {
            this.objects.add(this.itemDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9));
        }
    }

    @Override
    public void serializeToStream(OutputSerializedData outputSerializedData) {
        serialize(outputSerializedData, this.objects);
    }

    public ArrayList<Integer> toIntArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<T> arrayList2 = this.objects;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            T t6 = arrayList2.get(i7);
            i7++;
            T t10 = t6;
            if (t10 instanceof Int) {
                arrayList.add(Integer.valueOf(((Int) t10).value));
            }
        }
        return arrayList;
    }

    public static <T> void serialize(OutputSerializedData outputSerializedData, c20 c20Var, ArrayList<T> arrayList) {
        outputSerializedData.writeInt32(481674261);
        outputSerializedData.writeInt32(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c20Var.a(arrayList.get(i7));
        }
    }

    public static <T extends TLObject> ArrayList<T> deserialize(InputSerializedData inputSerializedData, TLDeserializer<T> tLDeserializer, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        if (readInt32 != 481674261) {
            TLParseException.doThrowOrLog(inputSerializedData, "Vector", readInt32, z9);
            return new ArrayList<>();
        }
        int readInt322 = inputSerializedData.readInt32(z9);
        if (!validateSize(readInt322, 4, inputSerializedData.remaining())) {
            TLParseException.doThrowOrLog(inputSerializedData, "VectorWrongSize", readInt32, z9);
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(readInt322);
        for (int i7 = 0; i7 < readInt322; i7++) {
            T deserialize = tLDeserializer.deserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
            if (deserialize != null) {
                arrayList.add(deserialize);
            }
        }
        return arrayList;
    }
}
